package com.google.android.gms.b;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.support.v4.g.a;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.util.e;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class dc
{
  private static volatile dc n;
  private final cc A;
  private final by B;
  private final boolean C;
  private boolean D;
  private Boolean E;
  private long F;
  private FileLock G;
  private FileChannel H;
  private List<Long> I;
  private long J;
  final Context a;
  final cf b;
  final cu c;
  final db d;
  final dl e;
  public final AppMeasurement f;
  public final FirebaseAnalytics g;
  final cs h;
  final com.google.android.gms.common.util.c i;
  int j;
  int k;
  protected long l;
  final long m;
  private final cy o;
  private final da p;
  private final dr q;
  private final cg r;
  private final cv s;
  private final di t;
  private final dj u;
  private final ci v;
  private final dh w;
  private final cr x;
  private final cw y;
  private final dn z;
  
  private dc(dg paramdg)
  {
    com.google.android.gms.common.internal.c.a(paramdg);
    a = a;
    J = -1L;
    i = e.d();
    m = i.a();
    b = new cf(this);
    paramdg = new cy(this);
    paramdg.K();
    o = paramdg;
    paramdg = new cu(this);
    paramdg.K();
    c = paramdg;
    ee.a("App measurement is starting up, version", Long.valueOf(cf.V()));
    cf.W();
    ee.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
    paramdg = new dr(this);
    paramdg.K();
    q = paramdg;
    paramdg = new ci(this);
    paramdg.K();
    v = paramdg;
    paramdg = new cr(this);
    paramdg.K();
    x = paramdg;
    cf.W();
    paramdg = paramdg.x();
    cu.a locala;
    if (i().j(paramdg))
    {
      locala = ee;
      paramdg = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
      locala.a(paramdg);
      ef.a("Debug-level message logging enabled");
      paramdg = new cg(this);
      paramdg.K();
      r = paramdg;
      paramdg = new cs(this);
      paramdg.K();
      h = paramdg;
      paramdg = new cc(this);
      paramdg.K();
      A = paramdg;
      B = new by(this);
      paramdg = new cv(this);
      paramdg.K();
      s = paramdg;
      paramdg = new di(this);
      paramdg.K();
      t = paramdg;
      paramdg = dg.b(this);
      paramdg.K();
      u = paramdg;
      paramdg = dg.a(this);
      paramdg.K();
      w = paramdg;
      paramdg = dg.c(this);
      paramdg.K();
      z = paramdg;
      y = new cw(this);
      f = new AppMeasurement(this);
      g = new FirebaseAnalytics(this);
      paramdg = new dl(this);
      paramdg.K();
      e = paramdg;
      paramdg = new da(this);
      paramdg.K();
      p = paramdg;
      paramdg = new db(this);
      paramdg.K();
      d = paramdg;
      if (j != k) {
        ea.a("Not all components initialized", Integer.valueOf(j), Integer.valueOf(k));
      }
      C = true;
      cf.W();
      if (!(a.getApplicationContext() instanceof Application)) {
        break label594;
      }
      int i1 = Build.VERSION.SDK_INT;
      h().x();
    }
    for (;;)
    {
      d.a(new Runnable()
      {
        public final void run()
        {
          c();
        }
      });
      return;
      locala = ee;
      paramdg = String.valueOf(paramdg);
      if (paramdg.length() != 0)
      {
        paramdg = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(paramdg);
        break;
      }
      paramdg = new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
      break;
      label594:
      ec.a("Application context is not an Application");
    }
  }
  
  private boolean A()
  {
    boolean bool = false;
    f().e();
    a();
    if (j().a("select count(1) > 0 from raw_events", null) != 0L) {}
    for (int i1 = 1;; i1 = 0)
    {
      if ((i1 != 0) || (!TextUtils.isEmpty(j().A()))) {
        bool = true;
      }
      return bool;
    }
  }
  
  private boolean B()
  {
    f().e();
    a();
    return D;
  }
  
  private int a(FileChannel paramFileChannel)
  {
    f().e();
    if ((paramFileChannel == null) || (!paramFileChannel.isOpen())) {
      ea.a("Bad chanel to read from");
    }
    ByteBuffer localByteBuffer;
    for (;;)
    {
      return 0;
      localByteBuffer = ByteBuffer.allocate(4);
      try
      {
        paramFileChannel.position(0L);
        i1 = paramFileChannel.read(localByteBuffer);
        if (i1 != 4)
        {
          if (i1 == -1) {
            continue;
          }
          ec.a("Unexpected data length. Bytes read", Integer.valueOf(i1));
          return 0;
        }
      }
      catch (IOException paramFileChannel)
      {
        ea.a("Failed to read from channel", paramFileChannel);
        return 0;
      }
    }
    localByteBuffer.flip();
    int i1 = localByteBuffer.getInt();
    return i1;
  }
  
  public static dc a(Context paramContext)
  {
    com.google.android.gms.common.internal.c.a(paramContext);
    com.google.android.gms.common.internal.c.a(paramContext.getApplicationContext());
    if (n == null) {}
    try
    {
      if (n == null) {
        n = new dc(new dg(paramContext));
      }
      return n;
    }
    finally {}
  }
  
  private void a(bz parambz)
  {
    Object localObject2 = null;
    if (TextUtils.isEmpty(parambz.c()))
    {
      a(parambz.a(), 204, null, null, null);
      return;
    }
    String str1 = cf.a(parambz.c(), parambz.b());
    try
    {
      URL localURL = new URL(str1);
      eg.a("Fetching remote configuration", parambz.a());
      dt.b localb = g().a(parambz.a());
      String str2 = g().b(parambz.a());
      Object localObject1 = localObject2;
      if (localb != null)
      {
        localObject1 = localObject2;
        if (!TextUtils.isEmpty(str2))
        {
          localObject1 = new a();
          ((Map)localObject1).put("If-Modified-Since", str2);
        }
      }
      k().a(parambz.a(), localURL, (Map)localObject1, new cv.a()
      {
        public final void a(String paramAnonymousString, int paramAnonymousInt, Throwable paramAnonymousThrowable, byte[] paramAnonymousArrayOfByte, Map<String, List<String>> paramAnonymousMap)
        {
          dc.this.a(paramAnonymousString, paramAnonymousInt, paramAnonymousThrowable, paramAnonymousArrayOfByte, paramAnonymousMap);
        }
      });
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      ea.a("Failed to parse config URL. Not fetching. appId", cu.a(parambz.a()), str1);
    }
  }
  
  private void a(cj paramcj, ca paramca)
  {
    f().e();
    a();
    com.google.android.gms.common.internal.c.a(paramcj);
    com.google.android.gms.common.internal.c.a(paramca);
    com.google.android.gms.common.internal.c.a(a);
    com.google.android.gms.common.internal.c.b(a.equals(a));
    du.e locale = new du.e();
    a = Integer.valueOf(1);
    i = "android";
    o = a;
    n = d;
    p = c;
    C = Integer.valueOf((int)j);
    q = Long.valueOf(e);
    y = b;
    Object localObject1;
    if (f == 0L)
    {
      localObject1 = null;
      v = ((Long)localObject1);
      localObject1 = d().a(a);
      if (TextUtils.isEmpty((CharSequence)first)) {
        break label618;
      }
      s = ((String)first);
      t = ((Boolean)second);
    }
    label618:
    while (n().a(a))
    {
      k = n().x();
      j = n().y();
      m = Integer.valueOf((int)n().z());
      l = n().A();
      r = null;
      d = null;
      e = null;
      f = null;
      H = Long.valueOf(l);
      localObject2 = j().b(a);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new bz(this, a);
        ((bz)localObject1).a(d().y());
        ((bz)localObject1).d(k);
        ((bz)localObject1).b(b);
        ((bz)localObject1).c(d().b(a));
        ((bz)localObject1).f(0L);
        ((bz)localObject1).a(0L);
        ((bz)localObject1).b(0L);
        ((bz)localObject1).e(c);
        ((bz)localObject1).c(j);
        ((bz)localObject1).f(d);
        ((bz)localObject1).d(e);
        ((bz)localObject1).e(f);
        ((bz)localObject1).a(h);
        ((bz)localObject1).i(l);
        j().a((bz)localObject1);
      }
      u = ((bz)localObject1).b();
      B = ((bz)localObject1).e();
      paramca = j().a(a);
      c = new du.g[paramca.size()];
      int i1 = 0;
      while (i1 < paramca.size())
      {
        localObject1 = new du.g();
        c[i1] = localObject1;
        b = getc;
        a = Long.valueOf(getd);
        i().a((du.g)localObject1, gete);
        i1 += 1;
      }
      localObject1 = Long.valueOf(f);
      break;
    }
    Object localObject2 = Settings.Secure.getString(a.getContentResolver(), "android_id");
    if (localObject2 == null)
    {
      ec.a("null secure ID. appId", cu.a(o));
      localObject1 = "null";
    }
    for (;;)
    {
      F = ((String)localObject1);
      break;
      localObject1 = localObject2;
      if (((String)localObject2).isEmpty())
      {
        ec.a("empty secure ID. appId", cu.a(o));
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      try
      {
        long l1 = j().a(locale);
        paramca = j();
        if (f == null) {
          break label905;
        }
        localObject1 = f.iterator();
        if (((Iterator)localObject1).hasNext())
        {
          if (!"_r".equals((String)((Iterator)localObject1).next())) {
            continue;
          }
          bool = true;
          if (paramca.a(paramcj, l1, bool)) {
            l = 0L;
          }
          return;
        }
      }
      catch (IOException paramcj)
      {
        ea.a("Data loss. Failed to insert raw event metadata. appId", cu.a(o), paramcj);
        return;
      }
      boolean bool = g().c(a, b);
      localObject1 = j().a(z(), a, false, false, false, false, false);
      if ((bool) && (e < b.a(a))) {
        bool = true;
      } else {
        label905:
        bool = false;
      }
    }
  }
  
  private static void a(de paramde)
  {
    if (paramde == null) {
      throw new IllegalStateException("Component not created");
    }
  }
  
  static void a(df paramdf)
  {
    if (paramdf == null) {
      throw new IllegalStateException("Component not created");
    }
    if (!paramdf.I()) {
      throw new IllegalStateException("Component not initialized");
    }
  }
  
  private boolean a(int paramInt, FileChannel paramFileChannel)
  {
    boolean bool = true;
    f().e();
    if ((paramFileChannel == null) || (!paramFileChannel.isOpen()))
    {
      ea.a("Bad chanel to read from");
      bool = false;
    }
    for (;;)
    {
      return bool;
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localByteBuffer.putInt(paramInt);
      localByteBuffer.flip();
      try
      {
        paramFileChannel.truncate(0L);
        paramFileChannel.write(localByteBuffer);
        paramFileChannel.force(true);
        if (paramFileChannel.size() != 4L)
        {
          ea.a("Error writing to channel. Bytes written", Long.valueOf(paramFileChannel.size()));
          return true;
        }
      }
      catch (IOException paramFileChannel)
      {
        ea.a("Failed to write to channel", paramFileChannel);
      }
    }
    return false;
  }
  
  private boolean a(long paramLong)
  {
    j().x();
    a locala;
    int i1;
    du.e locale;
    int i3;
    label94:
    label226:
    int i2;
    int i5;
    int i6;
    int i4;
    label481:
    Object localObject4;
    boolean bool2;
    label957:
    label1060:
    du.c[] arrayOfc;
    try
    {
      locala = new a((byte)0);
      j().a(null, paramLong, J, locala);
      if (c == null) {
        break label2003;
      }
      if (!c.isEmpty()) {
        break label2023;
      }
    }
    finally
    {
      boolean bool3;
      Object localObject1;
      Object localObject5;
      label1201:
      label1300:
      label1311:
      label1483:
      label1615:
      label1683:
      j().z();
    }
    if (i1 == 0)
    {
      bool1 = false;
      locale = a;
      b = new du.b[c.size()];
      i1 = 0;
      i3 = 0;
      if (i3 < c.size())
      {
        if (g().b(a.o, c.get(i3)).b))
        {
          ec.a("Dropping blacklisted raw event. appId", cu.a(a.o), c.get(i3)).b);
          if (i().l(a.o)) {
            break label2008;
          }
          if (!i().m(a.o)) {
            break label2028;
          }
          break label2008;
          if ((i2 != 0) || ("_err".equals(c.get(i3)).b))) {
            break label1988;
          }
          i().a(11, "_ev", c.get(i3)).b, 0);
          break label2014;
        }
        bool3 = g().c(a.o, c.get(i3)).b);
        if (!bool3)
        {
          i();
          localObject1 = c.get(i3)).b;
          com.google.android.gms.common.internal.c.a((String)localObject1);
          i2 = -1;
        }
      }
      switch (((String)localObject1).hashCode())
      {
      case 94660: 
        i5 = 0;
        i2 = 0;
        if (c.get(i3)).a == null) {
          c.get(i3)).a = new du.c[0];
        }
        localObject1 = c.get(i3)).a;
        i6 = localObject1.length;
        i4 = 0;
        if (i4 < i6)
        {
          localObject4 = localObject1[i4];
          if ("_c".equals(a))
          {
            c = Long.valueOf(1L);
            i5 = 1;
            break label2075;
            if (!((String)localObject1).equals("_in")) {
              break label2034;
            }
            i2 = 0;
          }
        }
        break;
      case 95027: 
        if (((String)localObject1).equals("_ui")) {
          i2 = 1;
        }
        break;
      case 95025: 
        if (((String)localObject1).equals("_ug"))
        {
          i2 = 2;
          break label2034;
          if ("_r".equals(a))
          {
            c = Long.valueOf(1L);
            i2 = 1;
            break label2075;
            if ((i5 == 0) && (bool3))
            {
              eg.a("Marking event as conversion", c.get(i3)).b);
              localObject1 = (du.c[])Arrays.copyOf(c.get(i3)).a, c.get(i3)).a.length + 1);
              localObject4 = new du.c();
              a = "_c";
              c = Long.valueOf(1L);
              localObject1[(localObject1.length - 1)] = localObject4;
              c.get(i3)).a = ((du.c[])localObject1);
            }
            if (i2 == 0)
            {
              eg.a("Marking event as real-time", c.get(i3)).b);
              localObject1 = (du.c[])Arrays.copyOf(c.get(i3)).a, c.get(i3)).a.length + 1);
              localObject4 = new du.c();
              a = "_r";
              c = Long.valueOf(1L);
              localObject1[(localObject1.length - 1)] = localObject4;
              c.get(i3)).a = ((du.c[])localObject1);
            }
            bool2 = true;
            if (jaza.o, false, false, false, false, true).e > b.a(a.o))
            {
              localObject1 = (du.b)c.get(i3);
              i2 = 0;
              if (i2 >= a.length) {
                break label2090;
              }
              if (!"_r".equals(a[i2].a)) {
                break label2106;
              }
              localObject4 = new du.c[a.length - 1];
              if (i2 > 0) {
                System.arraycopy(a, 0, localObject4, 0, i2);
              }
              if (i2 < localObject4.length) {
                System.arraycopy(a, i2 + 1, localObject4, i2, localObject4.length - i2);
              }
              a = ((du.c[])localObject4);
              break label2090;
            }
            if ((!dr.a(c.get(i3)).b)) || (!bool3) || (jaza.o, false, false, true, false, false).c <= b.b(a.o, cp.t))) {
              break label2162;
            }
            ec.a("Too many conversions. Not logging as conversion. appId", cu.a(a.o));
            localObject5 = (du.b)c.get(i3);
            localObject1 = null;
            arrayOfc = a;
            i5 = arrayOfc.length;
            i2 = 0;
            i4 = 0;
            if (i2 < i5)
            {
              localObject4 = arrayOfc[i2];
              if ("_c".equals(a))
              {
                localObject1 = localObject4;
                break label2097;
              }
              if ("_err".equals(a))
              {
                i4 = 1;
                break label2097;
              }
            }
            else
            {
              if ((i4 != 0) && (localObject1 != null))
              {
                localObject4 = new du.c[a.length - 1];
                i2 = 0;
                arrayOfc = a;
                i6 = arrayOfc.length;
                i4 = 0;
                break label2115;
                a = ((du.c[])localObject4);
              }
              for (bool1 = bool2;; bool1 = bool2)
              {
                b[i1] = ((du.b)c.get(i3));
                i1 += 1;
                break label2014;
                if (localObject1 == null) {
                  break;
                }
                a = "_err";
                c = Long.valueOf(10L);
              }
              ea.a("Did not find conversion parameter. appId", cu.a(a.o));
              break label2162;
              if (i1 < c.size()) {
                b = ((du.b[])Arrays.copyOf(b, i1));
              }
              A = a(a.o, a.c, b);
              e = Long.valueOf(Long.MAX_VALUE);
              f = Long.valueOf(Long.MIN_VALUE);
              i1 = 0;
              if (i1 < b.length)
              {
                localObject1 = b[i1];
                if (c.longValue() < e.longValue()) {
                  e = c;
                }
                if (c.longValue() <= f.longValue()) {
                  break label2169;
                }
                f = c;
                break label2169;
              }
              localObject4 = a.o;
              localObject5 = j().b((String)localObject4);
              if (localObject5 == null)
              {
                ea.a("Bundling raw events w/o app info. appId", cu.a(a.o));
                if (b.length > 0)
                {
                  cf.W();
                  localObject1 = g().a(a.o);
                  if ((localObject1 != null) && (a != null)) {
                    break label1953;
                  }
                  if (!TextUtils.isEmpty(a.y)) {
                    break label1926;
                  }
                  G = Long.valueOf(-1L);
                  j().a(locale, bool1);
                }
                j().a(b);
                j().h((String)localObject4);
                j().y();
                i1 = b.length;
                if (i1 <= 0) {
                  break label2176;
                }
              }
            }
          }
        }
        break;
      }
    }
    label1774:
    label1926:
    label1953:
    label1982:
    label1988:
    label2000:
    label2003:
    label2008:
    label2014:
    label2023:
    label2028:
    label2034:
    label2075:
    label2090:
    label2097:
    label2106:
    label2115:
    label2153:
    label2160:
    label2162:
    label2169:
    label2176:
    for (boolean bool1 = true;; bool1 = false)
    {
      j().z();
      return bool1;
      if (b.length <= 0) {
        break label1615;
      }
      paramLong = ((bz)localObject5).g();
      long l1;
      if (paramLong != 0L)
      {
        localObject1 = Long.valueOf(paramLong);
        h = ((Long)localObject1);
        l1 = ((bz)localObject5).f();
        if (l1 != 0L) {
          break label1982;
        }
      }
      Object localObject3;
      for (;;)
      {
        if (paramLong != 0L) {}
        for (localObject1 = Long.valueOf(paramLong);; localObject3 = null)
        {
          g = ((Long)localObject1);
          ((bz)localObject5).q();
          w = Integer.valueOf((int)((bz)localObject5).n());
          ((bz)localObject5).a(e.longValue());
          ((bz)localObject5).b(f.longValue());
          a.f().e();
          localObject1 = h;
          ((bz)localObject5).g(null);
          x = ((String)localObject1);
          j().a((bz)localObject5);
          break;
          localObject3 = null;
          break label1774;
        }
        ec.a("Did not find measurement config or missing version info. appId", cu.a(a.o));
        break label1683;
        G = a;
        break label1683;
        j().y();
        j().z();
        return false;
        paramLong = l1;
      }
      break label2014;
      break label2153;
      break label2097;
      break label2075;
      break label1311;
      i1 = 1;
      break;
      i2 = 1;
      break label226;
      i3 += 1;
      break label94;
      i1 = 0;
      break;
      i2 = 0;
      break label226;
      switch (i2)
      {
      }
      for (i2 = 0;; i2 = 1)
      {
        if (i2 == 0) {
          break label2000;
        }
        break;
        i4 += 1;
        break label481;
      }
      bool2 = bool1;
      break label1060;
      i2 += 1;
      break label1201;
      i2 += 1;
      break label957;
      for (;;)
      {
        if (i4 >= i6) {
          break label2160;
        }
        du.c localc = arrayOfc[i4];
        if (localc == localObject3) {
          break;
        }
        i5 = i2 + 1;
        localObject4[i2] = localc;
        i2 = i5;
        i4 += 1;
      }
      break label1300;
      bool1 = bool2;
      break label1311;
      i1 += 1;
      break label1483;
    }
  }
  
  private du.a[] a(String paramString, du.g[] paramArrayOfg, du.b[] paramArrayOfb)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    return p().a(paramString, paramArrayOfb, paramArrayOfg);
  }
  
  private ca b(String paramString)
  {
    bz localbz = j().b(paramString);
    if ((localbz == null) || (TextUtils.isEmpty(localbz.h())))
    {
      ef.a("No app data available; dropping", paramString);
      return null;
    }
    try
    {
      String str = aa).b(paramString, 0).versionName;
      if ((localbz.h() != null) && (!localbz.h().equals(str)))
      {
        ec.a("App version does not match; dropping. appId", cu.a(paramString));
        return null;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return new ca(paramString, localbz.c(), localbz.h(), localbz.i(), localbz.j(), localbz.k(), localbz.l(), null, localbz.m(), false, localbz.e(), localbz.s(), 0L, 0);
  }
  
  private void b(cn paramcn, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramca);
    com.google.android.gms.common.internal.c.a(a);
    long l2 = System.nanoTime();
    f().e();
    a();
    String str = a;
    i();
    if (!dr.a(paramcn, paramca)) {
      return;
    }
    if (!h)
    {
      b(paramca);
      return;
    }
    if (g().b(str, a))
    {
      ec.a("Dropping blacklisted event. appId", cu.a(str), a);
      if ((i().l(str)) || (i().m(str))) {}
      for (int i1 = 1;; i1 = 0)
      {
        if ((i1 == 0) && (!"_err".equals(a))) {
          i().a(11, "_ev", a, 0);
        }
        if (i1 == 0) {
          break;
        }
        paramcn = j().b(str);
        if (paramcn == null) {
          break;
        }
        l1 = Math.max(paramcn.p(), paramcn.o());
        if (Math.abs(i.a() - l1) <= cf.ac()) {
          break;
        }
        ef.a("Fetching config for blacklisted app");
        a(paramcn);
        return;
      }
    }
    if (e().a(2)) {
      eg.a("Logging event", paramcn);
    }
    j().x();
    Bundle localBundle;
    boolean bool1;
    boolean bool2;
    for (;;)
    {
      try
      {
        localBundle = b.a();
        b(paramca);
        double d1;
        Object localObject2;
        if (("_iap".equals(a)) || ("ecommerce_purchase".equals(a)))
        {
          localObject1 = localBundle.getString("currency");
          if (!"ecommerce_purchase".equals(a)) {
            continue;
          }
          double d2 = localBundle.getDouble("value") * 1000000.0D;
          d1 = d2;
          if (d2 == 0.0D) {
            d1 = localBundle.getLong("value") * 1000000.0D;
          }
          if ((d1 > 9.223372036854776E18D) || (d1 < -9.223372036854776E18D)) {
            continue;
          }
          l1 = Math.round(d1);
          if (!TextUtils.isEmpty((CharSequence)localObject1))
          {
            localObject2 = ((String)localObject1).toUpperCase(Locale.US);
            if (((String)localObject2).matches("[A-Z]{3}"))
            {
              localObject1 = String.valueOf("_ltv_");
              localObject2 = String.valueOf(localObject2);
              if (((String)localObject2).length() == 0) {
                continue;
              }
              localObject1 = ((String)localObject1).concat((String)localObject2);
              localObject2 = j().c(str, (String)localObject1);
              if ((localObject2 != null) && ((e instanceof Long))) {
                break label796;
              }
              j().a(str, b.b(str, cp.K) - 1);
              localObject1 = new dq(str, c, (String)localObject1, i.a(), Long.valueOf(l1));
              if (!j().a((dq)localObject1))
              {
                ea.a("Too many unique user properties are set. Ignoring user property. appId", cu.a(str), c, e);
                i().a(9, null, null, 0);
              }
            }
          }
        }
        bool1 = dr.a(a);
        bool2 = "_err".equals(a);
        localObject1 = j().a(z(), str, true, bool1, false, bool2, false);
        l1 = b - cf.H();
        if (l1 <= 0L) {
          break;
        }
        if (l1 % 1000L == 1L) {
          ea.a("Data loss. Too many events logged. appId, count", cu.a(str), Long.valueOf(b));
        }
        i().a(16, "_ev", a, 0);
        j().y();
        return;
        ec.a("Data lost. Currency value is too big. appId", cu.a(str), Double.valueOf(d1));
        j().y();
        return;
        l1 = localBundle.getLong("value");
        continue;
        localObject1 = new String((String)localObject1);
        continue;
        l3 = ((Long)e).longValue();
      }
      finally
      {
        j().z();
      }
      label796:
      long l3;
      localObject1 = new dq(str, c, (String)localObject1, i.a(), Long.valueOf(l1 + l3));
    }
    if (bool1)
    {
      l1 = a - cf.I();
      if (l1 > 0L)
      {
        if (l1 % 1000L == 1L) {
          ea.a("Data loss. Too many public events logged. appId, count", cu.a(str), Long.valueOf(a));
        }
        i().a(16, "_ev", a, 0);
        j().y();
        j().z();
        return;
      }
    }
    if (bool2)
    {
      l1 = d - Math.max(0, Math.min(1000000, b.b(a, cp.r)));
      if (l1 > 0L)
      {
        if (l1 == 1L) {
          ea.a("Too many error events logged. appId, count", cu.a(str), Long.valueOf(d));
        }
        j().y();
        j().z();
        return;
      }
    }
    i().a(localBundle, "_o", c);
    if (i().j(str))
    {
      i().a(localBundle, "_dbg", Long.valueOf(1L));
      i().a(localBundle, "_r", Long.valueOf(1L));
    }
    long l1 = j().c(str);
    if (l1 > 0L) {
      ec.a("Data lost. Too many events stored on disk, deleted. appId", cu.a(str), Long.valueOf(l1));
    }
    Object localObject1 = new cj(this, c, str, a, d, 0L, localBundle);
    paramcn = j().a(str, b);
    if (paramcn == null)
    {
      paramcn = j();
      com.google.android.gms.common.internal.c.a(str);
      l1 = paramcn.a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { str }, 0L);
      cf.G();
      if (l1 >= 500L)
      {
        ea.a("Too many event names used, ignoring event. appId, name, supported count", cu.a(str), b, Integer.valueOf(cf.G()));
        i().a(8, null, null, 0);
        j().z();
        return;
      }
    }
    for (paramcn = new ck(str, b, 0L, 0L, d);; paramcn = paramcn.a(d))
    {
      j().a(paramcn);
      a((cj)localObject1, paramca);
      j().y();
      if (e().a(2)) {
        eg.a("Event recorded", localObject1);
      }
      j().z();
      u();
      eg.a("Background event processing time, ms", Long.valueOf((System.nanoTime() - l2 + 500000L) / 1000000L));
      return;
      l1 = e;
      localObject1 = new cj(this, c, a, b, d, l1, f);
    }
  }
  
  static void s()
  {
    cf.W();
    throw new IllegalStateException("Unexpected call on client side");
  }
  
  private cw w()
  {
    if (y == null) {
      throw new IllegalStateException("Network broadcast receiver not created");
    }
    return y;
  }
  
  private dn x()
  {
    a(z);
    return z;
  }
  
  private boolean y()
  {
    f().e();
    Object localObject = cf.T();
    localObject = new File(a.getFilesDir(), (String)localObject);
    try
    {
      H = new RandomAccessFile((File)localObject, "rw").getChannel();
      G = H.tryLock();
      if (G != null)
      {
        eg.a("Storage concurrent access okay");
        return true;
      }
      ea.a("Storage concurrent data access panic");
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        ea.a("Failed to acquire storage lock", localFileNotFoundException);
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        ea.a("Failed to access storage lock file", localIOException);
      }
    }
    return false;
  }
  
  private long z()
  {
    return (i.a() + d().A()) / 1000L / 60L / 60L / 24L;
  }
  
  public final String a(final String paramString)
  {
    Object localObject = f().a(new Callable() {});
    try
    {
      localObject = (String)((Future)localObject).get(30000L, TimeUnit.MILLISECONDS);
      return (String)localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      ea.a("Failed to get app instance id. appId", cu.a(paramString), localInterruptedException);
      return null;
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;) {}
    }
  }
  
  final void a()
  {
    if (!C) {
      throw new IllegalStateException("AppMeasurement is not initialized");
    }
  }
  
  /* Error */
  protected final void a(int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_0
    //   4: invokevirtual 355	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   7: invokevirtual 357	com/google/android/gms/b/db:e	()V
    //   10: aload_0
    //   11: invokevirtual 359	com/google/android/gms/b/dc:a	()V
    //   14: aload_3
    //   15: astore 5
    //   17: aload_3
    //   18: ifnonnull +8 -> 26
    //   21: iconst_0
    //   22: newarray <illegal type>
    //   24: astore 5
    //   26: aload_0
    //   27: getfield 1245	com/google/android/gms/b/dc:I	Ljava/util/List;
    //   30: astore_3
    //   31: aload_0
    //   32: aconst_null
    //   33: putfield 1245	com/google/android/gms/b/dc:I	Ljava/util/List;
    //   36: iload_1
    //   37: sipush 200
    //   40: if_icmpeq +10 -> 50
    //   43: iload_1
    //   44: sipush 204
    //   47: if_icmpne +225 -> 272
    //   50: aload_2
    //   51: ifnonnull +221 -> 272
    //   54: aload_0
    //   55: invokevirtual 533	com/google/android/gms/b/dc:d	()Lcom/google/android/gms/b/cy;
    //   58: getfield 1248	com/google/android/gms/b/cy:c	Lcom/google/android/gms/b/cy$b;
    //   61: aload_0
    //   62: getfield 106	com/google/android/gms/b/dc:i	Lcom/google/android/gms/common/util/c;
    //   65: invokeinterface 111 1 0
    //   70: invokevirtual 1251	com/google/android/gms/b/cy$b:a	(J)V
    //   73: aload_0
    //   74: invokevirtual 533	com/google/android/gms/b/dc:d	()Lcom/google/android/gms/b/cy;
    //   77: getfield 1253	com/google/android/gms/b/cy:d	Lcom/google/android/gms/b/cy$b;
    //   80: lconst_0
    //   81: invokevirtual 1251	com/google/android/gms/b/cy$b:a	(J)V
    //   84: aload_0
    //   85: invokevirtual 1146	com/google/android/gms/b/dc:u	()V
    //   88: aload_0
    //   89: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   92: getfield 442	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
    //   95: ldc_w 1255
    //   98: iload_1
    //   99: invokestatic 303	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   102: aload 5
    //   104: arraylength
    //   105: invokestatic 303	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   108: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   111: aload_0
    //   112: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   115: invokevirtual 764	com/google/android/gms/b/cg:x	()V
    //   118: aload_3
    //   119: invokeinterface 1256 1 0
    //   124: astore_2
    //   125: aload_2
    //   126: invokeinterface 702 1 0
    //   131: ifeq +86 -> 217
    //   134: aload_2
    //   135: invokeinterface 708 1 0
    //   140: checkcast 147	java/lang/Long
    //   143: astore_3
    //   144: aload_0
    //   145: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   148: aload_3
    //   149: invokevirtual 867	java/lang/Long:longValue	()J
    //   152: invokevirtual 1257	com/google/android/gms/b/cg:a	(J)V
    //   155: goto -30 -> 125
    //   158: astore_2
    //   159: aload_0
    //   160: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   163: invokevirtual 888	com/google/android/gms/b/cg:z	()V
    //   166: aload_2
    //   167: athrow
    //   168: astore_2
    //   169: aload_0
    //   170: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   173: getfield 296	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   176: ldc_w 1259
    //   179: aload_2
    //   180: invokevirtual 156	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   183: aload_0
    //   184: aload_0
    //   185: getfield 106	com/google/android/gms/b/dc:i	Lcom/google/android/gms/common/util/c;
    //   188: invokeinterface 1261 1 0
    //   193: putfield 712	com/google/android/gms/b/dc:l	J
    //   196: aload_0
    //   197: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   200: getfield 442	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
    //   203: ldc_w 1263
    //   206: aload_0
    //   207: getfield 712	com/google/android/gms/b/dc:l	J
    //   210: invokestatic 151	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   213: invokevirtual 156	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   216: return
    //   217: aload_0
    //   218: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   221: invokevirtual 886	com/google/android/gms/b/cg:y	()V
    //   224: aload_0
    //   225: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   228: invokevirtual 888	com/google/android/gms/b/cg:z	()V
    //   231: aload_0
    //   232: invokevirtual 466	com/google/android/gms/b/dc:k	()Lcom/google/android/gms/b/cv;
    //   235: invokevirtual 1265	com/google/android/gms/b/cv:x	()Z
    //   238: ifeq +20 -> 258
    //   241: aload_0
    //   242: invokespecial 1267	com/google/android/gms/b/dc:A	()Z
    //   245: ifeq +13 -> 258
    //   248: aload_0
    //   249: invokevirtual 1269	com/google/android/gms/b/dc:t	()V
    //   252: aload_0
    //   253: lconst_0
    //   254: putfield 712	com/google/android/gms/b/dc:l	J
    //   257: return
    //   258: aload_0
    //   259: ldc2_w 96
    //   262: putfield 99	com/google/android/gms/b/dc:J	J
    //   265: aload_0
    //   266: invokevirtual 1146	com/google/android/gms/b/dc:u	()V
    //   269: goto -17 -> 252
    //   272: aload_0
    //   273: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   276: getfield 442	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
    //   279: ldc_w 1271
    //   282: iload_1
    //   283: invokestatic 303	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   286: aload_2
    //   287: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   290: aload_0
    //   291: invokevirtual 533	com/google/android/gms/b/dc:d	()Lcom/google/android/gms/b/cy;
    //   294: getfield 1253	com/google/android/gms/b/cy:d	Lcom/google/android/gms/b/cy$b;
    //   297: aload_0
    //   298: getfield 106	com/google/android/gms/b/dc:i	Lcom/google/android/gms/common/util/c;
    //   301: invokeinterface 111 1 0
    //   306: invokevirtual 1251	com/google/android/gms/b/cy$b:a	(J)V
    //   309: iload_1
    //   310: sipush 503
    //   313: if_icmpeq +10 -> 323
    //   316: iload_1
    //   317: sipush 429
    //   320: if_icmpne +6 -> 326
    //   323: iconst_1
    //   324: istore 4
    //   326: iload 4
    //   328: ifeq +22 -> 350
    //   331: aload_0
    //   332: invokevirtual 533	com/google/android/gms/b/dc:d	()Lcom/google/android/gms/b/cy;
    //   335: getfield 1273	com/google/android/gms/b/cy:e	Lcom/google/android/gms/b/cy$b;
    //   338: aload_0
    //   339: getfield 106	com/google/android/gms/b/dc:i	Lcom/google/android/gms/common/util/c;
    //   342: invokeinterface 111 1 0
    //   347: invokevirtual 1251	com/google/android/gms/b/cy$b:a	(J)V
    //   350: aload_0
    //   351: invokevirtual 1146	com/google/android/gms/b/dc:u	()V
    //   354: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	355	0	this	dc
    //   0	355	1	paramInt	int
    //   0	355	2	paramThrowable	Throwable
    //   0	355	3	paramArrayOfByte	byte[]
    //   1	326	4	i1	int
    //   15	88	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   118	125	158	finally
    //   125	155	158	finally
    //   217	224	158	finally
    //   54	118	168	android/database/sqlite/SQLiteException
    //   159	168	168	android/database/sqlite/SQLiteException
    //   224	252	168	android/database/sqlite/SQLiteException
    //   252	257	168	android/database/sqlite/SQLiteException
    //   258	269	168	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final void a(ca paramca)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 355	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   4: invokevirtual 357	com/google/android/gms/b/db:e	()V
    //   7: aload_0
    //   8: invokevirtual 359	com/google/android/gms/b/dc:a	()V
    //   11: aload_1
    //   12: invokestatic 90	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   15: pop
    //   16: aload_1
    //   17: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   20: invokestatic 483	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   23: pop
    //   24: aload_1
    //   25: getfield 524	com/google/android/gms/b/ca:b	Ljava/lang/String;
    //   28: invokestatic 375	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   31: ifeq +4 -> 35
    //   34: return
    //   35: aload_1
    //   36: getfield 617	com/google/android/gms/b/ca:h	Z
    //   39: ifne +9 -> 48
    //   42: aload_0
    //   43: aload_1
    //   44: invokevirtual 967	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   47: return
    //   48: aload_1
    //   49: getfield 1274	com/google/android/gms/b/ca:m	J
    //   52: lstore 5
    //   54: lload 5
    //   56: lstore_3
    //   57: lload 5
    //   59: lconst_0
    //   60: lcmp
    //   61: ifne +13 -> 74
    //   64: aload_0
    //   65: getfield 106	com/google/android/gms/b/dc:i	Lcom/google/android/gms/common/util/c;
    //   68: invokeinterface 111 1 0
    //   73: lstore_3
    //   74: aload_1
    //   75: getfield 1276	com/google/android/gms/b/ca:n	I
    //   78: istore_2
    //   79: iload_2
    //   80: ifeq +921 -> 1001
    //   83: iload_2
    //   84: iconst_1
    //   85: if_icmpeq +916 -> 1001
    //   88: aload_0
    //   89: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   92: getfield 349	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   95: ldc_w 1278
    //   98: aload_1
    //   99: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   102: invokestatic 475	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   105: iload_2
    //   106: invokestatic 303	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   109: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   112: iconst_0
    //   113: istore_2
    //   114: aload_0
    //   115: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   118: invokevirtual 764	com/google/android/gms/b/cg:x	()V
    //   121: aload_0
    //   122: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   125: aload_1
    //   126: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   129: invokevirtual 585	com/google/android/gms/b/cg:b	(Ljava/lang/String;)Lcom/google/android/gms/b/bz;
    //   132: astore 8
    //   134: aload 8
    //   136: astore 7
    //   138: aload 8
    //   140: ifnull +70 -> 210
    //   143: aload 8
    //   145: astore 7
    //   147: aload 8
    //   149: invokevirtual 427	com/google/android/gms/b/bz:c	()Ljava/lang/String;
    //   152: ifnull +58 -> 210
    //   155: aload 8
    //   157: astore 7
    //   159: aload 8
    //   161: invokevirtual 427	com/google/android/gms/b/bz:c	()Ljava/lang/String;
    //   164: aload_1
    //   165: getfield 524	com/google/android/gms/b/ca:b	Ljava/lang/String;
    //   168: invokevirtual 490	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   171: ifne +39 -> 210
    //   174: aload_0
    //   175: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   178: getfield 349	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   181: ldc_w 1280
    //   184: aload 8
    //   186: invokevirtual 429	com/google/android/gms/b/bz:a	()Ljava/lang/String;
    //   189: invokestatic 475	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   192: invokevirtual 156	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   195: aload_0
    //   196: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   199: aload 8
    //   201: invokevirtual 429	com/google/android/gms/b/bz:a	()Ljava/lang/String;
    //   204: invokevirtual 1281	com/google/android/gms/b/cg:f	(Ljava/lang/String;)V
    //   207: aconst_null
    //   208: astore 7
    //   210: aload 7
    //   212: ifnull +76 -> 288
    //   215: aload 7
    //   217: invokevirtual 923	com/google/android/gms/b/bz:h	()Ljava/lang/String;
    //   220: ifnull +68 -> 288
    //   223: aload 7
    //   225: invokevirtual 923	com/google/android/gms/b/bz:h	()Ljava/lang/String;
    //   228: aload_1
    //   229: getfield 511	com/google/android/gms/b/ca:c	Ljava/lang/String;
    //   232: invokevirtual 490	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   235: ifne +53 -> 288
    //   238: new 1010	android/os/Bundle
    //   241: dup
    //   242: invokespecial 1282	android/os/Bundle:<init>	()V
    //   245: astore 8
    //   247: aload 8
    //   249: ldc_w 1284
    //   252: aload 7
    //   254: invokevirtual 923	com/google/android/gms/b/bz:h	()Ljava/lang/String;
    //   257: invokevirtual 1288	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: aload_0
    //   261: new 969	com/google/android/gms/b/cn
    //   264: dup
    //   265: ldc_w 1290
    //   268: new 693	com/google/android/gms/b/cl
    //   271: dup
    //   272: aload 8
    //   274: invokespecial 1293	com/google/android/gms/b/cl:<init>	(Landroid/os/Bundle;)V
    //   277: ldc_w 1295
    //   280: lload_3
    //   281: invokespecial 1298	com/google/android/gms/b/cn:<init>	(Ljava/lang/String;Lcom/google/android/gms/b/cl;Ljava/lang/String;J)V
    //   284: aload_1
    //   285: invokevirtual 1300	com/google/android/gms/b/dc:a	(Lcom/google/android/gms/b/cn;Lcom/google/android/gms/b/ca;)V
    //   288: aload_0
    //   289: aload_1
    //   290: invokevirtual 967	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   293: iload_2
    //   294: ifne +346 -> 640
    //   297: aload_0
    //   298: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   301: aload_1
    //   302: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   305: ldc_w 1302
    //   308: invokevirtual 1120	com/google/android/gms/b/cg:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/ck;
    //   311: astore 7
    //   313: aload 7
    //   315: ifnonnull +637 -> 952
    //   318: lload_3
    //   319: ldc2_w 1303
    //   322: ldiv
    //   323: lconst_1
    //   324: ladd
    //   325: ldc2_w 1303
    //   328: lmul
    //   329: lstore 5
    //   331: iload_2
    //   332: ifne +522 -> 854
    //   335: aload_0
    //   336: new 1306	com/google/android/gms/b/do
    //   339: dup
    //   340: ldc_w 1308
    //   343: lload_3
    //   344: lload 5
    //   346: invokestatic 151	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   349: ldc_w 1295
    //   352: invokespecial 1311	com/google/android/gms/b/do:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   355: aload_1
    //   356: invokevirtual 1314	com/google/android/gms/b/dc:a	(Lcom/google/android/gms/b/do;Lcom/google/android/gms/b/ca;)V
    //   359: aload_0
    //   360: invokevirtual 355	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   363: invokevirtual 357	com/google/android/gms/b/db:e	()V
    //   366: aload_0
    //   367: invokevirtual 359	com/google/android/gms/b/dc:a	()V
    //   370: aload_0
    //   371: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   374: aload_1
    //   375: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   378: invokevirtual 585	com/google/android/gms/b/cg:b	(Ljava/lang/String;)Lcom/google/android/gms/b/bz;
    //   381: astore 7
    //   383: aload 7
    //   385: ifnull +43 -> 428
    //   388: aload 7
    //   390: invokevirtual 427	com/google/android/gms/b/bz:c	()Ljava/lang/String;
    //   393: invokestatic 375	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   396: ifeq +32 -> 428
    //   399: aload_1
    //   400: ifnull +28 -> 428
    //   403: aload_1
    //   404: getfield 524	com/google/android/gms/b/ca:b	Ljava/lang/String;
    //   407: invokestatic 375	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   410: ifne +18 -> 428
    //   413: aload 7
    //   415: lconst_0
    //   416: invokevirtual 1316	com/google/android/gms/b/bz:g	(J)V
    //   419: aload_0
    //   420: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   423: aload 7
    //   425: invokevirtual 623	com/google/android/gms/b/cg:a	(Lcom/google/android/gms/b/bz;)V
    //   428: new 1010	android/os/Bundle
    //   431: dup
    //   432: invokespecial 1282	android/os/Bundle:<init>	()V
    //   435: astore 8
    //   437: aload 8
    //   439: ldc_w 807
    //   442: lconst_1
    //   443: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   446: aload 8
    //   448: ldc_w 704
    //   451: lconst_1
    //   452: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   455: aload 8
    //   457: ldc_w 1322
    //   460: lconst_0
    //   461: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   464: aload 8
    //   466: ldc_w 1324
    //   469: lconst_0
    //   470: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   473: aload 8
    //   475: ldc_w 1326
    //   478: lconst_0
    //   479: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   482: aload 8
    //   484: ldc_w 1328
    //   487: lconst_0
    //   488: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   491: aload_0
    //   492: getfield 95	com/google/android/gms/b/dc:a	Landroid/content/Context;
    //   495: invokevirtual 1332	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   498: ifnonnull +166 -> 664
    //   501: aload_0
    //   502: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   505: getfield 296	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   508: ldc_w 1334
    //   511: aload_1
    //   512: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   515: invokestatic 475	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   518: invokevirtual 156	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   521: aload_0
    //   522: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   525: aload_1
    //   526: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   529: invokevirtual 1336	com/google/android/gms/b/cg:g	(Ljava/lang/String;)J
    //   532: lstore 5
    //   534: lload 5
    //   536: lconst_0
    //   537: lcmp
    //   538: iflt +13 -> 551
    //   541: aload 8
    //   543: ldc_w 1324
    //   546: lload 5
    //   548: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   551: aload_0
    //   552: new 969	com/google/android/gms/b/cn
    //   555: dup
    //   556: ldc_w 1302
    //   559: new 693	com/google/android/gms/b/cl
    //   562: dup
    //   563: aload 8
    //   565: invokespecial 1293	com/google/android/gms/b/cl:<init>	(Landroid/os/Bundle;)V
    //   568: ldc_w 1295
    //   571: lload_3
    //   572: invokespecial 1298	com/google/android/gms/b/cn:<init>	(Ljava/lang/String;Lcom/google/android/gms/b/cl;Ljava/lang/String;J)V
    //   575: aload_1
    //   576: invokevirtual 1300	com/google/android/gms/b/dc:a	(Lcom/google/android/gms/b/cn;Lcom/google/android/gms/b/ca;)V
    //   579: new 1010	android/os/Bundle
    //   582: dup
    //   583: invokespecial 1282	android/os/Bundle:<init>	()V
    //   586: astore 7
    //   588: aload 7
    //   590: ldc_w 1338
    //   593: lconst_1
    //   594: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   597: aload_0
    //   598: new 969	com/google/android/gms/b/cn
    //   601: dup
    //   602: ldc_w 1340
    //   605: new 693	com/google/android/gms/b/cl
    //   608: dup
    //   609: aload 7
    //   611: invokespecial 1293	com/google/android/gms/b/cl:<init>	(Landroid/os/Bundle;)V
    //   614: ldc_w 1295
    //   617: lload_3
    //   618: invokespecial 1298	com/google/android/gms/b/cn:<init>	(Ljava/lang/String;Lcom/google/android/gms/b/cl;Ljava/lang/String;J)V
    //   621: aload_1
    //   622: invokevirtual 1300	com/google/android/gms/b/dc:a	(Lcom/google/android/gms/b/cn;Lcom/google/android/gms/b/ca;)V
    //   625: aload_0
    //   626: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   629: invokevirtual 886	com/google/android/gms/b/cg:y	()V
    //   632: aload_0
    //   633: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   636: invokevirtual 888	com/google/android/gms/b/cg:z	()V
    //   639: return
    //   640: iload_2
    //   641: iconst_1
    //   642: if_icmpne +353 -> 995
    //   645: aload_0
    //   646: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   649: aload_1
    //   650: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   653: ldc_w 1342
    //   656: invokevirtual 1120	com/google/android/gms/b/cg:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/ck;
    //   659: astore 7
    //   661: goto -348 -> 313
    //   664: aload_0
    //   665: getfield 95	com/google/android/gms/b/dc:a	Landroid/content/Context;
    //   668: invokestatic 930	com/google/android/gms/b/bc:a	(Landroid/content/Context;)Lcom/google/android/gms/b/bb;
    //   671: aload_1
    //   672: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   675: iconst_0
    //   676: invokevirtual 935	com/google/android/gms/b/bb:b	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   679: astore 7
    //   681: aload 7
    //   683: ifnull +36 -> 719
    //   686: aload 7
    //   688: getfield 1345	android/content/pm/PackageInfo:firstInstallTime	J
    //   691: lconst_0
    //   692: lcmp
    //   693: ifeq +26 -> 719
    //   696: aload 7
    //   698: getfield 1345	android/content/pm/PackageInfo:firstInstallTime	J
    //   701: aload 7
    //   703: getfield 1348	android/content/pm/PackageInfo:lastUpdateTime	J
    //   706: lcmp
    //   707: ifeq +12 -> 719
    //   710: aload 8
    //   712: ldc_w 1322
    //   715: lconst_1
    //   716: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   719: aload_0
    //   720: getfield 95	com/google/android/gms/b/dc:a	Landroid/content/Context;
    //   723: invokestatic 930	com/google/android/gms/b/bc:a	(Landroid/content/Context;)Lcom/google/android/gms/b/bb;
    //   726: aload_1
    //   727: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   730: iconst_0
    //   731: invokevirtual 1351	com/google/android/gms/b/bb:a	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   734: astore 7
    //   736: aload 7
    //   738: ifnull -217 -> 521
    //   741: aload 7
    //   743: getfield 1356	android/content/pm/ApplicationInfo:flags	I
    //   746: iconst_1
    //   747: iand
    //   748: ifeq +12 -> 760
    //   751: aload 8
    //   753: ldc_w 1326
    //   756: lconst_1
    //   757: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   760: aload 7
    //   762: getfield 1356	android/content/pm/ApplicationInfo:flags	I
    //   765: sipush 128
    //   768: iand
    //   769: ifeq -248 -> 521
    //   772: aload 8
    //   774: ldc_w 1328
    //   777: lconst_1
    //   778: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   781: goto -260 -> 521
    //   784: astore_1
    //   785: aload_0
    //   786: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   789: invokevirtual 888	com/google/android/gms/b/cg:z	()V
    //   792: aload_1
    //   793: athrow
    //   794: astore 7
    //   796: aload_0
    //   797: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   800: getfield 296	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   803: ldc_w 1358
    //   806: aload_1
    //   807: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   810: invokestatic 475	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   813: aload 7
    //   815: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   818: aconst_null
    //   819: astore 7
    //   821: goto -140 -> 681
    //   824: astore 7
    //   826: aload_0
    //   827: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   830: getfield 296	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   833: ldc_w 1360
    //   836: aload_1
    //   837: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   840: invokestatic 475	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   843: aload 7
    //   845: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   848: aconst_null
    //   849: astore 7
    //   851: goto -115 -> 736
    //   854: iload_2
    //   855: iconst_1
    //   856: if_icmpne -277 -> 579
    //   859: aload_0
    //   860: new 1306	com/google/android/gms/b/do
    //   863: dup
    //   864: ldc_w 1362
    //   867: lload_3
    //   868: lload 5
    //   870: invokestatic 151	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   873: ldc_w 1295
    //   876: invokespecial 1311	com/google/android/gms/b/do:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   879: aload_1
    //   880: invokevirtual 1314	com/google/android/gms/b/dc:a	(Lcom/google/android/gms/b/do;Lcom/google/android/gms/b/ca;)V
    //   883: aload_0
    //   884: invokevirtual 355	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   887: invokevirtual 357	com/google/android/gms/b/db:e	()V
    //   890: aload_0
    //   891: invokevirtual 359	com/google/android/gms/b/dc:a	()V
    //   894: new 1010	android/os/Bundle
    //   897: dup
    //   898: invokespecial 1282	android/os/Bundle:<init>	()V
    //   901: astore 7
    //   903: aload 7
    //   905: ldc_w 807
    //   908: lconst_1
    //   909: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   912: aload 7
    //   914: ldc_w 704
    //   917: lconst_1
    //   918: invokevirtual 1320	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   921: aload_0
    //   922: new 969	com/google/android/gms/b/cn
    //   925: dup
    //   926: ldc_w 1342
    //   929: new 693	com/google/android/gms/b/cl
    //   932: dup
    //   933: aload 7
    //   935: invokespecial 1293	com/google/android/gms/b/cl:<init>	(Landroid/os/Bundle;)V
    //   938: ldc_w 1295
    //   941: lload_3
    //   942: invokespecial 1298	com/google/android/gms/b/cn:<init>	(Ljava/lang/String;Lcom/google/android/gms/b/cl;Ljava/lang/String;J)V
    //   945: aload_1
    //   946: invokevirtual 1300	com/google/android/gms/b/dc:a	(Lcom/google/android/gms/b/cn;Lcom/google/android/gms/b/ca;)V
    //   949: goto -370 -> 579
    //   952: aload_1
    //   953: getfield 1364	com/google/android/gms/b/ca:i	Z
    //   956: ifeq -331 -> 625
    //   959: aload_0
    //   960: new 969	com/google/android/gms/b/cn
    //   963: dup
    //   964: ldc_w 1366
    //   967: new 693	com/google/android/gms/b/cl
    //   970: dup
    //   971: new 1010	android/os/Bundle
    //   974: dup
    //   975: invokespecial 1282	android/os/Bundle:<init>	()V
    //   978: invokespecial 1293	com/google/android/gms/b/cl:<init>	(Landroid/os/Bundle;)V
    //   981: ldc_w 1295
    //   984: lload_3
    //   985: invokespecial 1298	com/google/android/gms/b/cn:<init>	(Ljava/lang/String;Lcom/google/android/gms/b/cl;Ljava/lang/String;J)V
    //   988: aload_1
    //   989: invokevirtual 1300	com/google/android/gms/b/dc:a	(Lcom/google/android/gms/b/cn;Lcom/google/android/gms/b/ca;)V
    //   992: goto -367 -> 625
    //   995: aconst_null
    //   996: astore 7
    //   998: goto -685 -> 313
    //   1001: goto -887 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1004	0	this	dc
    //   0	1004	1	paramca	ca
    //   78	779	2	i1	int
    //   56	929	3	l1	long
    //   52	817	5	l2	long
    //   136	625	7	localObject1	Object
    //   794	20	7	localNameNotFoundException1	PackageManager.NameNotFoundException
    //   819	1	7	localObject2	Object
    //   824	20	7	localNameNotFoundException2	PackageManager.NameNotFoundException
    //   849	148	7	localBundle	Bundle
    //   132	641	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   121	134	784	finally
    //   147	155	784	finally
    //   159	207	784	finally
    //   215	288	784	finally
    //   288	293	784	finally
    //   297	313	784	finally
    //   318	331	784	finally
    //   335	383	784	finally
    //   388	399	784	finally
    //   403	428	784	finally
    //   428	521	784	finally
    //   521	534	784	finally
    //   541	551	784	finally
    //   551	579	784	finally
    //   579	625	784	finally
    //   625	632	784	finally
    //   645	661	784	finally
    //   664	681	784	finally
    //   686	719	784	finally
    //   719	736	784	finally
    //   741	760	784	finally
    //   760	781	784	finally
    //   796	818	784	finally
    //   826	848	784	finally
    //   859	949	784	finally
    //   952	992	784	finally
    //   664	681	794	android/content/pm/PackageManager$NameNotFoundException
    //   719	736	824	android/content/pm/PackageManager$NameNotFoundException
  }
  
  final void a(cd paramcd)
  {
    ca localca = b(b);
    if (localca != null) {
      a(paramcd, localca);
    }
  }
  
  final void a(cd paramcd, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramcd);
    com.google.android.gms.common.internal.c.a(b);
    com.google.android.gms.common.internal.c.a(c);
    com.google.android.gms.common.internal.c.a(d);
    com.google.android.gms.common.internal.c.a(d.b);
    f().e();
    a();
    if (TextUtils.isEmpty(b)) {
      return;
    }
    if (!h)
    {
      b(paramca);
      return;
    }
    paramcd = new cd(paramcd);
    j().x();
    for (;;)
    {
      try
      {
        Object localObject = j().d(b, d.b);
        if ((localObject != null) && (f))
        {
          c = c;
          e = e;
          g = g;
          j = j;
          i1 = 0;
          if (f)
          {
            localObject = d;
            localObject = new dq(b, c, b, c, ((do)localObject).a());
            if (!j().a((dq)localObject)) {
              continue;
            }
            ef.a("User property updated immediately", b, c, e);
            if ((i1 != 0) && (j != null)) {
              b(new cn(j, e), paramca);
            }
          }
          if (!j().a(paramcd)) {
            break label433;
          }
          ef.a("Conditional property added", b, d.b, d.a());
          j().y();
        }
        else
        {
          if (!TextUtils.isEmpty(g)) {
            break label470;
          }
          localObject = d;
          d = new do(b, e, ((do)localObject).a(), g);
          f = true;
          i1 = 1;
          continue;
        }
        ea.a("(2)Too many active user properties, ignoring", cu.a(b), c, e);
        continue;
        ea.a("Too many conditional properties, ignoring", cu.a(b), d.b, d.a());
      }
      finally
      {
        j().z();
      }
      label433:
      continue;
      label470:
      int i1 = 0;
    }
  }
  
  final void a(cn paramcn, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramca);
    com.google.android.gms.common.internal.c.a(a);
    f().e();
    a();
    Object localObject1 = a;
    long l1 = d;
    i();
    if (!dr.a(paramcn, paramca)) {
      return;
    }
    if (!h)
    {
      b(paramca);
      return;
    }
    j().x();
    try
    {
      localObject2 = j().a((String)localObject1, l1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (cd)((Iterator)localObject2).next();
        if (localObject3 != null)
        {
          ef.a("User property timed out", b, d.b, d.a());
          if (h != null) {
            b(new cn(h, l1), paramca);
          }
          j().e((String)localObject1, d.b);
        }
      }
      localObject3 = j().b((String)localObject1, l1);
    }
    finally
    {
      j().z();
    }
    Object localObject2 = new ArrayList(((List)localObject3).size());
    Object localObject3 = ((List)localObject3).iterator();
    Object localObject4;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (cd)((Iterator)localObject3).next();
      if (localObject4 != null)
      {
        ef.a("User property expired", b, d.b, d.a());
        j().b((String)localObject1, d.b);
        if (l != null) {
          ((List)localObject2).add(l);
        }
        j().e((String)localObject1, d.b);
      }
    }
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      b(new cn((cn)((Iterator)localObject2).next(), l1), paramca);
    }
    localObject2 = j().a((String)localObject1, a, l1);
    localObject1 = new ArrayList(((List)localObject2).size());
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (cd)((Iterator)localObject2).next();
      if (localObject3 != null)
      {
        localObject4 = d;
        localObject4 = new dq(b, c, b, l1, ((do)localObject4).a());
        if (j().a((dq)localObject4)) {
          ef.a("User property triggered", b, c, e);
        }
        for (;;)
        {
          if (j != null) {
            ((List)localObject1).add(j);
          }
          d = new do((dq)localObject4);
          f = true;
          j().a((cd)localObject3);
          break;
          ea.a("Too many active user properties, ignoring", cu.a(b), c, e);
        }
      }
    }
    b(paramcn, paramca);
    paramcn = ((List)localObject1).iterator();
    while (paramcn.hasNext()) {
      b(new cn((cn)paramcn.next(), l1), paramca);
    }
    j().y();
    j().z();
  }
  
  final void a(cn paramcn, String paramString)
  {
    bz localbz = j().b(paramString);
    if ((localbz == null) || (TextUtils.isEmpty(localbz.h())))
    {
      ef.a("No app data available; dropping event", paramString);
      return;
    }
    try
    {
      String str = aa).b(paramString, 0).versionName;
      if ((localbz.h() != null) && (!localbz.h().equals(str)))
      {
        ec.a("App version does not match; dropping event. appId", cu.a(paramString));
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      if (!"_ui".equals(a)) {
        ec.a("Could not find package. appId", cu.a(paramString));
      }
      a(paramcn, new ca(paramString, localbz.c(), localbz.h(), localbz.i(), localbz.j(), localbz.k(), localbz.l(), null, localbz.m(), false, localbz.e(), localbz.s(), 0L, 0));
    }
  }
  
  /* Error */
  final void a(do paramdo, ca paramca)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: iconst_0
    //   4: istore_3
    //   5: aload_0
    //   6: invokevirtual 355	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   9: invokevirtual 357	com/google/android/gms/b/db:e	()V
    //   12: aload_0
    //   13: invokevirtual 359	com/google/android/gms/b/dc:a	()V
    //   16: aload_2
    //   17: getfield 524	com/google/android/gms/b/ca:b	Ljava/lang/String;
    //   20: invokestatic 375	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   23: ifeq +4 -> 27
    //   26: return
    //   27: aload_2
    //   28: getfield 617	com/google/android/gms/b/ca:h	Z
    //   31: ifne +9 -> 40
    //   34: aload_0
    //   35: aload_2
    //   36: invokevirtual 967	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   39: return
    //   40: aload_0
    //   41: invokevirtual 189	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   44: aload_1
    //   45: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   48: invokevirtual 1458	com/google/android/gms/b/dr:e	(Ljava/lang/String;)I
    //   51: istore 5
    //   53: iload 5
    //   55: ifeq +50 -> 105
    //   58: aload_0
    //   59: invokevirtual 189	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   62: pop
    //   63: aload_1
    //   64: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   67: invokestatic 1460	com/google/android/gms/b/cf:z	()I
    //   70: iconst_1
    //   71: invokestatic 1463	com/google/android/gms/b/dr:a	(Ljava/lang/String;IZ)Ljava/lang/String;
    //   74: astore_2
    //   75: aload_1
    //   76: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   79: ifnull +11 -> 90
    //   82: aload_1
    //   83: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   86: invokevirtual 339	java/lang/String:length	()I
    //   89: istore_3
    //   90: aload_0
    //   91: invokevirtual 189	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   94: iload 5
    //   96: ldc_w 794
    //   99: aload_2
    //   100: iload_3
    //   101: invokevirtual 797	com/google/android/gms/b/dr:a	(ILjava/lang/String;Ljava/lang/String;I)V
    //   104: return
    //   105: aload_0
    //   106: invokevirtual 189	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   109: aload_1
    //   110: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   113: aload_1
    //   114: invokevirtual 1396	com/google/android/gms/b/do:a	()Ljava/lang/Object;
    //   117: invokevirtual 1466	com/google/android/gms/b/dr:b	(Ljava/lang/String;Ljava/lang/Object;)I
    //   120: istore 5
    //   122: iload 5
    //   124: ifeq +72 -> 196
    //   127: aload_0
    //   128: invokevirtual 189	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   131: pop
    //   132: aload_1
    //   133: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   136: invokestatic 1460	com/google/android/gms/b/cf:z	()I
    //   139: iconst_1
    //   140: invokestatic 1463	com/google/android/gms/b/dr:a	(Ljava/lang/String;IZ)Ljava/lang/String;
    //   143: astore_2
    //   144: aload_1
    //   145: invokevirtual 1396	com/google/android/gms/b/do:a	()Ljava/lang/Object;
    //   148: astore_1
    //   149: iload 4
    //   151: istore_3
    //   152: aload_1
    //   153: ifnull +28 -> 181
    //   156: aload_1
    //   157: instanceof 332
    //   160: ifne +13 -> 173
    //   163: iload 4
    //   165: istore_3
    //   166: aload_1
    //   167: instanceof 544
    //   170: ifeq +11 -> 181
    //   173: aload_1
    //   174: invokestatic 335	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   177: invokevirtual 339	java/lang/String:length	()I
    //   180: istore_3
    //   181: aload_0
    //   182: invokevirtual 189	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   185: iload 5
    //   187: ldc_w 794
    //   190: aload_2
    //   191: iload_3
    //   192: invokevirtual 797	com/google/android/gms/b/dr:a	(ILjava/lang/String;Ljava/lang/String;I)V
    //   195: return
    //   196: aload_0
    //   197: invokevirtual 189	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   200: pop
    //   201: aload_1
    //   202: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   205: aload_1
    //   206: invokevirtual 1396	com/google/android/gms/b/do:a	()Ljava/lang/Object;
    //   209: invokestatic 1469	com/google/android/gms/b/dr:c	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   212: astore 7
    //   214: aload 7
    //   216: ifnull -190 -> 26
    //   219: new 649	com/google/android/gms/b/dq
    //   222: dup
    //   223: aload_2
    //   224: getfield 486	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   227: aload_1
    //   228: getfield 1409	com/google/android/gms/b/do:g	Ljava/lang/String;
    //   231: aload_1
    //   232: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   235: aload_1
    //   236: getfield 1394	com/google/android/gms/b/do:c	J
    //   239: aload 7
    //   241: invokespecial 1061	com/google/android/gms/b/dq:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   244: astore_1
    //   245: aload_0
    //   246: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   249: getfield 196	com/google/android/gms/b/cu:f	Lcom/google/android/gms/b/cu$a;
    //   252: ldc_w 1471
    //   255: aload_1
    //   256: getfield 650	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   259: aload 7
    //   261: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   264: aload_0
    //   265: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   268: invokevirtual 764	com/google/android/gms/b/cg:x	()V
    //   271: aload_0
    //   272: aload_2
    //   273: invokevirtual 967	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   276: aload_0
    //   277: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   280: aload_1
    //   281: invokevirtual 1064	com/google/android/gms/b/cg:a	(Lcom/google/android/gms/b/dq;)Z
    //   284: istore 6
    //   286: aload_0
    //   287: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   290: invokevirtual 886	com/google/android/gms/b/cg:y	()V
    //   293: iload 6
    //   295: ifeq +32 -> 327
    //   298: aload_0
    //   299: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   302: getfield 196	com/google/android/gms/b/cu:f	Lcom/google/android/gms/b/cu$a;
    //   305: ldc_w 1473
    //   308: aload_1
    //   309: getfield 650	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   312: aload_1
    //   313: getfield 657	com/google/android/gms/b/dq:e	Ljava/lang/Object;
    //   316: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   319: aload_0
    //   320: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   323: invokevirtual 888	com/google/android/gms/b/cg:z	()V
    //   326: return
    //   327: aload_0
    //   328: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   331: getfield 296	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   334: ldc_w 1475
    //   337: aload_1
    //   338: getfield 650	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   341: aload_1
    //   342: getfield 657	com/google/android/gms/b/dq:e	Ljava/lang/Object;
    //   345: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   348: aload_0
    //   349: invokevirtual 189	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   352: bipush 9
    //   354: aconst_null
    //   355: aconst_null
    //   356: iconst_0
    //   357: invokevirtual 797	com/google/android/gms/b/dr:a	(ILjava/lang/String;Ljava/lang/String;I)V
    //   360: goto -41 -> 319
    //   363: astore_1
    //   364: aload_0
    //   365: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   368: invokevirtual 888	com/google/android/gms/b/cg:z	()V
    //   371: aload_1
    //   372: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	373	0	this	dc
    //   0	373	1	paramdo	do
    //   0	373	2	paramca	ca
    //   4	188	3	i1	int
    //   1	163	4	i2	int
    //   51	135	5	i3	int
    //   284	10	6	bool	boolean
    //   212	48	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   271	293	363	finally
    //   298	319	363	finally
    //   327	360	363	finally
  }
  
  final void a(String paramString, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map<String, List<String>> paramMap)
  {
    int i2 = 0;
    f().e();
    a();
    com.google.android.gms.common.internal.c.a(paramString);
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      arrayOfByte = new byte[0];
    }
    j().x();
    label96:
    label111:
    int i1;
    for (;;)
    {
      try
      {
        paramArrayOfByte = j().b(paramString);
        if ((paramInt == 200) || (paramInt == 204)) {
          break label478;
        }
        if (paramInt == 304)
        {
          break label478;
          if (paramArrayOfByte == null)
          {
            ec.a("App does not exist in onConfigFetched. appId", cu.a(paramString));
            j().y();
          }
        }
        else
        {
          i1 = 0;
          continue;
        }
        if ((i1 == 0) && (paramInt != 404)) {
          break;
        }
        if (paramMap != null)
        {
          paramThrowable = (List)paramMap.get("Last-Modified");
          if ((paramThrowable != null) && (paramThrowable.size() > 0))
          {
            paramThrowable = (String)paramThrowable.get(0);
            break label488;
            label175:
            if (g().a(paramString) != null) {
              continue;
            }
            bool = g().a(paramString, null, null);
            if (bool) {
              continue;
            }
          }
        }
        else
        {
          paramThrowable = null;
          continue;
        }
        paramThrowable = null;
        break label488;
        label221:
        boolean bool = g().a(paramString, arrayOfByte, paramThrowable);
        if (!bool) {
          return;
        }
        paramArrayOfByte.g(i.a());
        j().a(paramArrayOfByte);
        if (paramInt == 404)
        {
          ed.a("Config not found. Using empty config. appId", paramString);
          if ((!k().x()) || (!A())) {
            break label351;
          }
          t();
          continue;
        }
        eg.a("Successfully fetched config. Got network response. code, size", Integer.valueOf(paramInt), Integer.valueOf(arrayOfByte.length));
      }
      finally
      {
        j().z();
      }
      continue;
      label351:
      u();
    }
    paramArrayOfByte.h(i.a());
    j().a(paramArrayOfByte);
    eg.a("Fetching config failed. code, error", Integer.valueOf(paramInt), paramThrowable);
    g().c(paramString);
    dd.a(i.a());
    if (paramInt != 503)
    {
      i1 = i2;
      if (paramInt == 429) {}
    }
    for (;;)
    {
      if (i1 != 0) {
        de.a(i.a());
      }
      u();
      break label96;
      label478:
      if (paramThrowable != null) {
        break label111;
      }
      i1 = 1;
      break;
      label488:
      if (paramInt == 404) {
        break label175;
      }
      if (paramInt != 304) {
        break label221;
      }
      break label175;
      i1 = 1;
    }
  }
  
  final void b(ca paramca)
  {
    int i3 = 1;
    f().e();
    a();
    com.google.android.gms.common.internal.c.a(paramca);
    com.google.android.gms.common.internal.c.a(a);
    bz localbz2 = j().b(a);
    String str = d().b(a);
    int i1 = 0;
    bz localbz1;
    int i2;
    if (localbz2 == null)
    {
      localbz1 = new bz(this, a);
      localbz1.a(d().y());
      localbz1.c(str);
      i1 = 1;
      i2 = i1;
      if (!TextUtils.isEmpty(b))
      {
        i2 = i1;
        if (!b.equals(localbz1.c()))
        {
          localbz1.b(b);
          i2 = 1;
        }
      }
      i1 = i2;
      if (!TextUtils.isEmpty(k))
      {
        i1 = i2;
        if (!k.equals(localbz1.e()))
        {
          localbz1.d(k);
          i1 = 1;
        }
      }
      i2 = i1;
      if (e != 0L)
      {
        i2 = i1;
        if (e != localbz1.k())
        {
          localbz1.d(e);
          i2 = 1;
        }
      }
      i1 = i2;
      if (!TextUtils.isEmpty(c))
      {
        i1 = i2;
        if (!c.equals(localbz1.h()))
        {
          localbz1.e(c);
          i1 = 1;
        }
      }
      if (j != localbz1.i())
      {
        localbz1.c(j);
        i1 = 1;
      }
      i2 = i1;
      if (d != null)
      {
        i2 = i1;
        if (!d.equals(localbz1.j()))
        {
          localbz1.f(d);
          i2 = 1;
        }
      }
      i1 = i2;
      if (f != localbz1.l())
      {
        localbz1.e(f);
        i1 = 1;
      }
      if (h != localbz1.m())
      {
        localbz1.a(h);
        i1 = 1;
      }
      i2 = i1;
      if (!TextUtils.isEmpty(g))
      {
        i2 = i1;
        if (!g.equals(localbz1.r()))
        {
          localbz1.g(g);
          i2 = 1;
        }
      }
      if (l == localbz1.s()) {
        break label486;
      }
      localbz1.i(l);
    }
    label486:
    for (i1 = i3;; i1 = i2)
    {
      if (i1 != 0) {
        j().a(localbz1);
      }
      return;
      localbz1 = localbz2;
      if (str.equals(localbz2.d())) {
        break;
      }
      localbz2.c(str);
      localbz2.a(d().y());
      i1 = 1;
      localbz1 = localbz2;
      break;
    }
  }
  
  final void b(cd paramcd)
  {
    ca localca = b(b);
    if (localca != null) {
      b(paramcd, localca);
    }
  }
  
  /* Error */
  final void b(cd paramcd, ca paramca)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 90	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_1
    //   6: getfield 1370	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   9: invokestatic 483	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_1
    //   14: getfield 1379	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   17: invokestatic 90	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   20: pop
    //   21: aload_1
    //   22: getfield 1379	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   25: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   28: invokestatic 483	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   31: pop
    //   32: aload_0
    //   33: invokevirtual 355	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   36: invokevirtual 357	com/google/android/gms/b/db:e	()V
    //   39: aload_0
    //   40: invokevirtual 359	com/google/android/gms/b/dc:a	()V
    //   43: aload_2
    //   44: getfield 524	com/google/android/gms/b/ca:b	Ljava/lang/String;
    //   47: invokestatic 375	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   50: ifeq +4 -> 54
    //   53: return
    //   54: aload_2
    //   55: getfield 617	com/google/android/gms/b/ca:h	Z
    //   58: ifne +9 -> 67
    //   61: aload_0
    //   62: aload_2
    //   63: invokevirtual 967	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   66: return
    //   67: aload_0
    //   68: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   71: invokevirtual 764	com/google/android/gms/b/cg:x	()V
    //   74: aload_0
    //   75: aload_2
    //   76: invokevirtual 967	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   79: aload_0
    //   80: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   83: aload_1
    //   84: getfield 1370	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   87: aload_1
    //   88: getfield 1379	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   91: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   94: invokevirtual 1385	com/google/android/gms/b/cg:d	(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/cd;
    //   97: astore 4
    //   99: aload 4
    //   101: ifnull +149 -> 250
    //   104: aload_0
    //   105: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   108: getfield 196	com/google/android/gms/b/cu:f	Lcom/google/android/gms/b/cu$a;
    //   111: ldc_w 1506
    //   114: aload_1
    //   115: getfield 1370	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   118: aload_1
    //   119: getfield 1379	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   122: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   125: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   128: aload_0
    //   129: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   132: aload_1
    //   133: getfield 1370	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   136: aload_1
    //   137: getfield 1379	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   140: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   143: invokevirtual 1423	com/google/android/gms/b/cg:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   146: pop
    //   147: aload 4
    //   149: getfield 1387	com/google/android/gms/b/cd:f	Z
    //   152: ifeq +21 -> 173
    //   155: aload_0
    //   156: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   159: aload_1
    //   160: getfield 1370	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   163: aload_1
    //   164: getfield 1379	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   167: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   170: invokevirtual 1434	com/google/android/gms/b/cg:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   173: aload_1
    //   174: getfield 1436	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   177: ifnull +58 -> 235
    //   180: aconst_null
    //   181: astore_3
    //   182: aload_1
    //   183: getfield 1436	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   186: getfield 999	com/google/android/gms/b/cn:b	Lcom/google/android/gms/b/cl;
    //   189: ifnull +14 -> 203
    //   192: aload_1
    //   193: getfield 1436	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   196: getfield 999	com/google/android/gms/b/cn:b	Lcom/google/android/gms/b/cl;
    //   199: invokevirtual 1002	com/google/android/gms/b/cl:a	()Landroid/os/Bundle;
    //   202: astore_3
    //   203: aload_0
    //   204: aload_0
    //   205: invokevirtual 189	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   208: aload_1
    //   209: getfield 1436	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   212: getfield 970	com/google/android/gms/b/cn:a	Ljava/lang/String;
    //   215: aload_3
    //   216: aload 4
    //   218: getfield 1376	com/google/android/gms/b/cd:c	Ljava/lang/String;
    //   221: aload_1
    //   222: getfield 1436	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   225: getfield 1114	com/google/android/gms/b/cn:d	J
    //   228: invokevirtual 1509	com/google/android/gms/b/dr:a	(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;J)Lcom/google/android/gms/b/cn;
    //   231: aload_2
    //   232: invokespecial 1403	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/cn;Lcom/google/android/gms/b/ca;)V
    //   235: aload_0
    //   236: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   239: invokevirtual 886	com/google/android/gms/b/cg:y	()V
    //   242: aload_0
    //   243: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   246: invokevirtual 888	com/google/android/gms/b/cg:z	()V
    //   249: return
    //   250: aload_0
    //   251: invokevirtual 137	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   254: getfield 349	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   257: ldc_w 1511
    //   260: aload_1
    //   261: getfield 1370	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   264: invokestatic 475	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   267: aload_1
    //   268: getfield 1379	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   271: getfield 1380	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   274: invokevirtual 306	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   277: goto -42 -> 235
    //   280: astore_1
    //   281: aload_0
    //   282: invokevirtual 362	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   285: invokevirtual 888	com/google/android/gms/b/cg:z	()V
    //   288: aload_1
    //   289: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	290	0	this	dc
    //   0	290	1	paramcd	cd
    //   0	290	2	paramca	ca
    //   181	35	3	localBundle	Bundle
    //   97	120	4	localcd	cd
    // Exception table:
    //   from	to	target	type
    //   74	99	280	finally
    //   104	173	280	finally
    //   173	180	280	finally
    //   182	203	280	finally
    //   203	235	280	finally
    //   235	242	280	finally
    //   250	277	280	finally
  }
  
  protected final boolean b()
  {
    a();
    f().e();
    if ((E == null) || (F == 0L) || ((E != null) && (!E.booleanValue()) && (Math.abs(i.b() - F) > 1000L)))
    {
      F = i.b();
      cf.W();
      if ((!i().h("android.permission.INTERNET")) || (!i().h("android.permission.ACCESS_NETWORK_STATE")) || ((!bc.a(a).a()) && ((!cz.a(a)) || (!dk.a(a))))) {
        break label193;
      }
    }
    label193:
    for (boolean bool = true;; bool = false)
    {
      E = Boolean.valueOf(bool);
      if (E.booleanValue()) {
        E = Boolean.valueOf(i().f(o().y()));
      }
      return E.booleanValue();
    }
  }
  
  public final byte[] b(cn paramcn, String paramString)
  {
    a();
    f().e();
    s();
    com.google.android.gms.common.internal.c.a(paramcn);
    com.google.android.gms.common.internal.c.a(paramString);
    du.d locald = new du.d();
    j().x();
    Object localObject1;
    du.e locale;
    Object localObject2;
    try
    {
      localObject1 = j().b(paramString);
      if (localObject1 == null)
      {
        ef.a("Log and bundle not available. package_name", paramString);
        return new byte[0];
      }
      if (!((bz)localObject1).m())
      {
        ef.a("Log and bundle disabled. package_name", paramString);
        return new byte[0];
      }
      locale = new du.e();
      a = new du.e[] { locale };
      a = Integer.valueOf(1);
      i = "android";
      o = ((bz)localObject1).a();
      n = ((bz)localObject1).j();
      p = ((bz)localObject1).h();
      C = Integer.valueOf((int)((bz)localObject1).i());
      q = Long.valueOf(((bz)localObject1).k());
      y = ((bz)localObject1).c();
      v = Long.valueOf(((bz)localObject1).l());
      localObject2 = d().a(((bz)localObject1).a());
      if (!TextUtils.isEmpty((CharSequence)first))
      {
        s = ((String)first);
        t = ((Boolean)second);
      }
      k = n().x();
      j = n().y();
      m = Integer.valueOf((int)n().z());
      l = n().A();
      u = ((bz)localObject1).b();
      B = ((bz)localObject1).e();
      localObject2 = j().a(((bz)localObject1).a());
      c = new du.g[((List)localObject2).size()];
      int i1 = 0;
      while (i1 < ((List)localObject2).size())
      {
        localObject3 = new du.g();
        c[i1] = localObject3;
        b = getc;
        a = Long.valueOf(getd);
        i().a((du.g)localObject3, gete);
        i1 += 1;
      }
      localObject2 = b.a();
      if ("_iap".equals(a))
      {
        ((Bundle)localObject2).putLong("_c", 1L);
        ef.a("Marking in-app purchase as real-time");
        ((Bundle)localObject2).putLong("_r", 1L);
      }
      ((Bundle)localObject2).putString("_o", c);
      if (i().j(o))
      {
        i().a((Bundle)localObject2, "_dbg", Long.valueOf(1L));
        i().a((Bundle)localObject2, "_r", Long.valueOf(1L));
      }
      Object localObject3 = j().a(paramString, a);
      if (localObject3 == null)
      {
        localObject3 = new ck(paramString, a, 1L, 0L, d);
        j().a((ck)localObject3);
        l1 = 0L;
      }
      for (;;)
      {
        paramcn = new cj(this, c, paramString, a, d, l1, (Bundle)localObject2);
        localObject2 = new du.b();
        b = new du.b[] { localObject2 };
        c = Long.valueOf(d);
        b = b;
        d = Long.valueOf(e);
        a = new du.c[f.a.size()];
        localObject3 = f.iterator();
        i1 = 0;
        while (((Iterator)localObject3).hasNext())
        {
          Object localObject4 = (String)((Iterator)localObject3).next();
          du.c localc = new du.c();
          a[i1] = localc;
          a = ((String)localObject4);
          localObject4 = f.a((String)localObject4);
          i().a(localc, localObject4);
          i1 += 1;
        }
        l1 = e;
        localObject3 = ((ck)localObject3).a(d).a();
        j().a((ck)localObject3);
      }
      A = a(((bz)localObject1).a(), c, b);
    }
    finally
    {
      j().z();
    }
    e = c;
    f = c;
    long l1 = ((bz)localObject1).g();
    long l2;
    if (l1 != 0L)
    {
      paramcn = Long.valueOf(l1);
      h = paramcn;
      l2 = ((bz)localObject1).f();
      if (l2 != 0L) {
        break label1160;
      }
    }
    for (;;)
    {
      if (l1 != 0L) {}
      for (paramcn = Long.valueOf(l1);; paramcn = null)
      {
        g = paramcn;
        ((bz)localObject1).q();
        w = Integer.valueOf((int)((bz)localObject1).n());
        r = Long.valueOf(cf.V());
        d = Long.valueOf(i.a());
        z = Boolean.TRUE;
        ((bz)localObject1).a(e.longValue());
        ((bz)localObject1).b(f.longValue());
        j().a((bz)localObject1);
        j().y();
        j().z();
        try
        {
          paramcn = new byte[locald.f()];
          localObject1 = fu.a(paramcn, paramcn.length);
          locald.a((fu)localObject1);
          ((fu)localObject1).a();
          paramcn = i().a(paramcn);
          return paramcn;
        }
        catch (IOException paramcn)
        {
          ea.a("Data loss. Failed to bundle and serialize. appId", cu.a(paramString), paramcn);
          return null;
        }
        paramcn = null;
        break;
      }
      label1160:
      l1 = l2;
    }
  }
  
  protected final void c()
  {
    f().e();
    j().B();
    if (dc.a() == 0L) {
      dc.a(i.a());
    }
    if (!b())
    {
      if (r())
      {
        if (!i().h("android.permission.INTERNET")) {
          ea.a("App is missing INTERNET permission");
        }
        if (!i().h("android.permission.ACCESS_NETWORK_STATE")) {
          ea.a("App is missing ACCESS_NETWORK_STATE permission");
        }
        cf.W();
        if (!bc.a(a).a())
        {
          if (!cz.a(a)) {
            ea.a("AppMeasurementReceiver not registered/enabled");
          }
          if (!dk.a(a)) {
            ea.a("AppMeasurementService not registered/enabled");
          }
        }
        ea.a("Uploading is not possible. App measurement disabled");
      }
      u();
      return;
    }
    cf.W();
    String str;
    if (!TextUtils.isEmpty(o().y()))
    {
      str = d().B();
      if (str != null) {
        break label265;
      }
      d().c(o().y());
    }
    for (;;)
    {
      cf.W();
      if (TextUtils.isEmpty(o().y())) {
        break;
      }
      h().A();
      break;
      label265:
      if (!str.equals(o().y()))
      {
        ee.a("Rechecking which service to use due to a GMP App Id change");
        d().E();
        u.B();
        u.A();
        d().c(o().y());
      }
    }
  }
  
  public final cy d()
  {
    a(o);
    return o;
  }
  
  public final cu e()
  {
    a(c);
    return c;
  }
  
  public final db f()
  {
    a(d);
    return d;
  }
  
  public final da g()
  {
    a(p);
    return p;
  }
  
  public final dh h()
  {
    a(w);
    return w;
  }
  
  public final dr i()
  {
    a(q);
    return q;
  }
  
  public final cg j()
  {
    a(r);
    return r;
  }
  
  public final cv k()
  {
    a(s);
    return s;
  }
  
  public final di l()
  {
    a(t);
    return t;
  }
  
  public final dj m()
  {
    a(u);
    return u;
  }
  
  public final ci n()
  {
    a(v);
    return v;
  }
  
  public final cr o()
  {
    a(x);
    return x;
  }
  
  public final cc p()
  {
    a(A);
    return A;
  }
  
  public final by q()
  {
    a(B);
    return B;
  }
  
  public final boolean r()
  {
    boolean bool = false;
    f().e();
    a();
    if (b.Y()) {
      return false;
    }
    Boolean localBoolean = b.b("firebase_analytics_collection_enabled");
    if (localBoolean != null) {
      bool = localBoolean.booleanValue();
    }
    for (;;)
    {
      return d().c(bool);
      if (!cf.Z()) {
        bool = true;
      }
    }
  }
  
  public final void t()
  {
    boolean bool = false;
    f().e();
    a();
    cf.W();
    Object localObject1 = d().D();
    if (localObject1 == null) {
      ec.a("Upload data called on the client side before use of service was decided");
    }
    int i1;
    long l1;
    String str1;
    Object localObject3;
    do
    {
      return;
      if (((Boolean)localObject1).booleanValue())
      {
        ea.a("Upload called in the client side when service should be used");
        return;
      }
      if (l > 0L)
      {
        u();
        return;
      }
      f().e();
      if (I != null) {}
      for (i1 = 1; i1 != 0; i1 = 0)
      {
        ec.a("Uploading requested multiple times");
        return;
      }
      if (!k().x())
      {
        ec.a("Network not connected, ignoring upload request");
        u();
        return;
      }
      l1 = i.a();
      a(l1 - cf.aj());
      long l2 = dc.a();
      if (l2 != 0L) {
        ef.a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(l1 - l2)));
      }
      str1 = j().A();
      if (TextUtils.isEmpty(str1)) {
        break;
      }
      if (J == -1L) {
        J = j().C();
      }
      i1 = b.b(str1, cp.m);
      int i2 = Math.max(0, b.b(str1, cp.n));
      localObject3 = j().a(str1, i1, i2);
    } while (((List)localObject3).isEmpty());
    localObject1 = ((List)localObject3).iterator();
    Object localObject4;
    do
    {
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
      localObject4 = (du.e)nextfirst;
    } while (TextUtils.isEmpty(s));
    Object localObject2;
    for (localObject1 = s;; localObject2 = null)
    {
      if (localObject1 != null)
      {
        i1 = 0;
        if (i1 < ((List)localObject3).size())
        {
          localObject4 = (du.e)getfirst;
          if ((TextUtils.isEmpty(s)) || (s.equals(localObject1))) {}
        }
      }
      for (localObject1 = ((List)localObject3).subList(0, i1);; localObject2 = localObject3)
      {
        localObject4 = new du.d();
        a = new du.e[((List)localObject1).size()];
        localObject3 = new ArrayList(((List)localObject1).size());
        i1 = 0;
        for (;;)
        {
          if (i1 < a.length)
          {
            a[i1] = ((du.e)getfirst);
            ((List)localObject3).add((Long)getsecond);
            a[i1].r = Long.valueOf(cf.V());
            a[i1].d = Long.valueOf(l1);
            a[i1].z = Boolean.valueOf(cf.W());
            i1 += 1;
            continue;
            i1 += 1;
            break;
          }
        }
        if (e().a(2)) {}
        for (localObject1 = dr.b((du.d)localObject4);; localObject2 = null)
        {
          byte[] arrayOfByte = i().a((du.d)localObject4);
          String str2 = cf.ai();
          for (;;)
          {
            try
            {
              URL localURL = new URL(str2);
              if (!((List)localObject3).isEmpty()) {
                bool = true;
              }
              com.google.android.gms.common.internal.c.b(bool);
              if (I != null)
              {
                ea.a("Set uploading progress before finishing the previous upload");
                dd.a(l1);
                localObject3 = "?";
                if (a.length > 0) {
                  localObject3 = a[0].o;
                }
                eg.a("Uploading data. app, uncompressed size, data", localObject3, Integer.valueOf(arrayOfByte.length), localObject1);
                k().a(str1, localURL, arrayOfByte, new cv.a()
                {
                  public final void a(String paramAnonymousString, int paramAnonymousInt, Throwable paramAnonymousThrowable, byte[] paramAnonymousArrayOfByte, Map<String, List<String>> paramAnonymousMap)
                  {
                    a(paramAnonymousInt, paramAnonymousThrowable, paramAnonymousArrayOfByte);
                  }
                });
                return;
              }
            }
            catch (MalformedURLException localMalformedURLException)
            {
              ea.a("Failed to parse upload URL. Not uploading. appId", cu.a(str1), str2);
              return;
            }
            I = new ArrayList((Collection)localObject3);
          }
          J = -1L;
          localObject2 = j().b(l1 - cf.aj());
          if (TextUtils.isEmpty((CharSequence)localObject2)) {
            break;
          }
          localObject2 = j().b((String)localObject2);
          if (localObject2 == null) {
            break;
          }
          a((bz)localObject2);
          return;
        }
      }
    }
  }
  
  final void u()
  {
    f().e();
    a();
    if (!B()) {
      return;
    }
    long l1;
    if (l > 0L)
    {
      l1 = 3600000L - Math.abs(i.b() - l);
      if (l1 > 0L)
      {
        eg.a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(l1));
        w().a();
        x().x();
        return;
      }
      l = 0L;
    }
    if ((!b()) || (!A()))
    {
      w().a();
      x().x();
      return;
    }
    long l3 = i.a();
    long l2 = cf.ar();
    int i1;
    label178:
    label184:
    Object localObject;
    if (j().a("select count(1) > 0 from raw_events where realtime = 1", null) != 0L)
    {
      i1 = 1;
      if (i1 == 0)
      {
        if (j().a("select count(1) > 0 from queue where has_realtime = 1", null) == 0L) {
          break label308;
        }
        i1 = 1;
        if (i1 == 0) {
          break label313;
        }
      }
      i1 = 1;
      if (i1 == 0) {
        break label325;
      }
      localObject = b.au();
      if ((TextUtils.isEmpty((CharSequence)localObject)) || (".none.".equals(localObject))) {
        break label318;
      }
      l1 = cf.an();
    }
    for (;;)
    {
      l6 = dc.a();
      l5 = dd.a();
      l4 = Math.max(j().a("select max(bundle_end_timestamp) from queue", null, 0L), j().a("select max(timestamp) from raw_events", null, 0L));
      if (l4 != 0L) {
        break label332;
      }
      l1 = 0L;
      if (l1 != 0L) {
        break label502;
      }
      w().a();
      x().x();
      return;
      i1 = 0;
      break;
      label308:
      i1 = 0;
      break label178;
      label313:
      i1 = 0;
      break label184;
      label318:
      l1 = cf.am();
      continue;
      label325:
      l1 = cf.al();
    }
    label332:
    long l4 = l3 - Math.abs(l4 - l3);
    long l6 = Math.abs(l6 - l3);
    long l5 = l3 - Math.abs(l5 - l3);
    l6 = Math.max(l3 - l6, l5);
    l3 = l4 + l2;
    l2 = l3;
    if (i1 != 0)
    {
      l2 = l3;
      if (l6 > 0L) {
        l2 = Math.min(l4, l6) + l1;
      }
    }
    if (!i().a(l6, l1)) {
      l2 = l1 + l6;
    }
    for (;;)
    {
      l1 = l2;
      if (l5 == 0L) {
        break;
      }
      l1 = l2;
      if (l5 < l4) {
        break;
      }
      i1 = 0;
      for (;;)
      {
        if (i1 >= cf.at()) {
          break label497;
        }
        l2 += (1 << i1) * cf.as();
        l1 = l2;
        if (l2 > l5) {
          break;
        }
        i1 += 1;
      }
      label497:
      l1 = 0L;
      break;
      label502:
      if (!k().x())
      {
        localObject = w();
        b.a();
        b.f().e();
        if (!c)
        {
          b.a.registerReceiver((BroadcastReceiver)localObject, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
          d = b.k().x();
          b.e().g.a("Registering connectivity change receiver. Network connected", Boolean.valueOf(d));
          c = true;
        }
        x().x();
        return;
      }
      l3 = de.a();
      l4 = cf.ak();
      l2 = l1;
      if (!i().a(l3, l4)) {
        l2 = Math.max(l1, l3 + l4);
      }
      w().a();
      l2 -= i.a();
      l1 = l2;
      if (l2 <= 0L)
      {
        l1 = cf.ao();
        dc.a(i.a());
      }
      eg.a("Upload scheduled in approximately ms", Long.valueOf(l1));
      x().a(l1);
      return;
    }
  }
  
  final void v()
  {
    f().e();
    a();
    int i1;
    int i2;
    if (!D)
    {
      ee.a("This instance being marked as an uploader");
      f().e();
      a();
      if ((B()) && (y()))
      {
        i1 = a(H);
        i2 = o().z();
        f().e();
        if (i1 <= i2) {
          break label112;
        }
        ea.a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i1), Integer.valueOf(i2));
      }
    }
    for (;;)
    {
      D = true;
      return;
      label112:
      if (i1 < i2) {
        if (a(i2, H)) {
          eg.a("Storage version upgraded. Previous, current version", Integer.valueOf(i1), Integer.valueOf(i2));
        } else {
          ea.a("Storage version upgrade failed. Previous, current version", Integer.valueOf(i1), Integer.valueOf(i2));
        }
      }
    }
  }
  
  private final class a
    implements cg.b
  {
    du.e a;
    List<Long> b;
    List<du.b> c;
    long d;
    
    private a() {}
    
    private static long a(du.b paramb)
    {
      return c.longValue() / 1000L / 60L / 60L;
    }
    
    public final void a(du.e parame)
    {
      com.google.android.gms.common.internal.c.a(parame);
      a = parame;
    }
    
    public final boolean a(long paramLong, du.b paramb)
    {
      com.google.android.gms.common.internal.c.a(paramb);
      if (c == null) {
        c = new ArrayList();
      }
      if (b == null) {
        b = new ArrayList();
      }
      if ((c.size() > 0) && (a((du.b)c.get(0)) != a(paramb))) {
        return false;
      }
      long l = d + paramb.f();
      if (l >= cf.af()) {
        return false;
      }
      d = l;
      c.add(paramb);
      b.add(Long.valueOf(paramLong));
      return c.size() < cf.ag();
    }
  }
}


/* Location:              com/google/android/gms/b/dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */