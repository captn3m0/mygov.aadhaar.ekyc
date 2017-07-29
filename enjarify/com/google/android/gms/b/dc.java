package com.google.android.gms.b;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
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
  private List I;
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
    Object localObject1 = a;
    a = ((Context)localObject1);
    J = -1;
    localObject1 = e.d();
    i = ((com.google.android.gms.common.util.c)localObject1);
    long l1 = i.a();
    m = l1;
    localObject1 = new com/google/android/gms/b/cf;
    ((cf)localObject1).<init>(this);
    b = ((cf)localObject1);
    localObject1 = new com/google/android/gms/b/cy;
    ((cy)localObject1).<init>(this);
    ((cy)localObject1).K();
    o = ((cy)localObject1);
    localObject1 = new com/google/android/gms/b/cu;
    ((cu)localObject1).<init>(this);
    ((cu)localObject1).K();
    c = ((cu)localObject1);
    localObject1 = ee;
    long l2 = cf.V();
    Object localObject2 = Long.valueOf(l2);
    ((cu.a)localObject1).a("App measurement is starting up, version", localObject2);
    cf.W();
    ee.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
    localObject1 = new com/google/android/gms/b/dr;
    ((dr)localObject1).<init>(this);
    ((dr)localObject1).K();
    q = ((dr)localObject1);
    localObject1 = new com/google/android/gms/b/ci;
    ((ci)localObject1).<init>(this);
    ((ci)localObject1).K();
    v = ((ci)localObject1);
    localObject1 = new com/google/android/gms/b/cr;
    ((cr)localObject1).<init>(this);
    ((cr)localObject1).K();
    x = ((cr)localObject1);
    cf.W();
    localObject1 = ((cr)localObject1).x();
    Object localObject3 = i();
    boolean bool1 = ((dr)localObject3).j((String)localObject1);
    int i5;
    if (bool1)
    {
      localObject3 = ee;
      localObject1 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
      ((cu.a)localObject3).a((String)localObject1);
      localObject1 = ef;
      localObject3 = "Debug-level message logging enabled";
      ((cu.a)localObject1).a((String)localObject3);
      localObject1 = new com/google/android/gms/b/cg;
      ((cg)localObject1).<init>(this);
      ((cg)localObject1).K();
      r = ((cg)localObject1);
      localObject1 = new com/google/android/gms/b/cs;
      ((cs)localObject1).<init>(this);
      ((cs)localObject1).K();
      h = ((cs)localObject1);
      localObject1 = new com/google/android/gms/b/cc;
      ((cc)localObject1).<init>(this);
      ((cc)localObject1).K();
      A = ((cc)localObject1);
      localObject1 = new com/google/android/gms/b/by;
      ((by)localObject1).<init>(this);
      B = ((by)localObject1);
      localObject1 = new com/google/android/gms/b/cv;
      ((cv)localObject1).<init>(this);
      ((cv)localObject1).K();
      s = ((cv)localObject1);
      localObject1 = new com/google/android/gms/b/di;
      ((di)localObject1).<init>(this);
      ((di)localObject1).K();
      t = ((di)localObject1);
      localObject1 = dg.b(this);
      ((dj)localObject1).K();
      u = ((dj)localObject1);
      localObject1 = dg.a(this);
      ((dh)localObject1).K();
      w = ((dh)localObject1);
      localObject1 = dg.c(this);
      ((dn)localObject1).K();
      z = ((dn)localObject1);
      localObject1 = new com/google/android/gms/b/cw;
      ((cw)localObject1).<init>(this);
      y = ((cw)localObject1);
      localObject1 = new com/google/android/gms/measurement/AppMeasurement;
      ((AppMeasurement)localObject1).<init>(this);
      f = ((AppMeasurement)localObject1);
      localObject1 = new com/google/firebase/analytics/FirebaseAnalytics;
      ((FirebaseAnalytics)localObject1).<init>(this);
      g = ((FirebaseAnalytics)localObject1);
      localObject1 = new com/google/android/gms/b/dl;
      ((dl)localObject1).<init>(this);
      ((dl)localObject1).K();
      e = ((dl)localObject1);
      localObject1 = new com/google/android/gms/b/da;
      ((da)localObject1).<init>(this);
      ((da)localObject1).K();
      p = ((da)localObject1);
      localObject1 = new com/google/android/gms/b/db;
      ((db)localObject1).<init>(this);
      ((db)localObject1).K();
      d = ((db)localObject1);
      int i2 = j;
      int i1 = k;
      if (i2 != i1)
      {
        localObject1 = ea;
        localObject3 = "Not all components initialized";
        int i4 = j;
        localObject2 = Integer.valueOf(i4);
        i5 = k;
        Integer localInteger = Integer.valueOf(i5);
        ((cu.a)localObject1).a((String)localObject3, localObject2, localInteger);
      }
      C = true;
      cf.W();
      localObject1 = a.getApplicationContext();
      boolean bool2 = localObject1 instanceof Application;
      if (!bool2) {
        break label689;
      }
      int i3 = Build.VERSION.SDK_INT;
      localObject1 = h();
      ((dh)localObject1).x();
    }
    for (;;)
    {
      localObject1 = d;
      localObject3 = new com/google/android/gms/b/dc$1;
      ((dc.1)localObject3).<init>(this);
      ((db)localObject1).a((Runnable)localObject3);
      return;
      localObject3 = ee;
      localObject2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
      localObject1 = String.valueOf(localObject1);
      i5 = ((String)localObject1).length();
      if (i5 != 0)
      {
        localObject1 = ((String)localObject2).concat((String)localObject1);
        break;
      }
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject2);
      break;
      label689:
      localObject1 = ec;
      localObject3 = "Application context is not an Application";
      ((cu.a)localObject1).a((String)localObject3);
    }
  }
  
  private boolean A()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    f().e();
    a();
    Object localObject = j();
    String str = "select count(1) > 0 from raw_events";
    long l1 = ((cg)localObject).a(str, null);
    long l2 = 0L;
    boolean bool3 = l1 < l2;
    if (bool3) {
      bool3 = bool1;
    }
    for (;;)
    {
      if (!bool3)
      {
        localObject = j().A();
        bool3 = TextUtils.isEmpty((CharSequence)localObject);
        if (bool3) {}
      }
      else
      {
        bool2 = bool1;
      }
      return bool2;
      bool3 = false;
      localObject = null;
    }
  }
  
  private boolean B()
  {
    db localdb = f();
    localdb.e();
    a();
    boolean bool = D;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localdb = null;
    }
  }
  
  private int a(FileChannel paramFileChannel)
  {
    int i1 = 4;
    int i2 = 0;
    Object localObject1 = f();
    ((db)localObject1).e();
    Object localObject2;
    if (paramFileChannel != null)
    {
      boolean bool = paramFileChannel.isOpen();
      if (bool) {}
    }
    else
    {
      localObject1 = ea;
      localObject2 = "Bad chanel to read from";
      ((cu.a)localObject1).a((String)localObject2);
    }
    for (;;)
    {
      return i2;
      localObject1 = ByteBuffer.allocate(i1);
      long l1 = 0L;
      try
      {
        paramFileChannel.position(l1);
        int i4 = paramFileChannel.read((ByteBuffer)localObject1);
        if (i4 == i1) {
          break label158;
        }
        int i3 = -1;
        if (i4 == i3) {
          continue;
        }
        localObject1 = e();
        localObject1 = c;
        str = "Unexpected data length. Bytes read";
        localObject2 = Integer.valueOf(i4);
        ((cu.a)localObject1).a(str, localObject2);
      }
      catch (IOException localIOException)
      {
        localObject2 = ea;
        String str = "Failed to read from channel";
        ((cu.a)localObject2).a(str, localIOException);
      }
      continue;
      label158:
      localIOException.flip();
      i2 = localIOException.getInt();
    }
  }
  
  public static dc a(Context paramContext)
  {
    com.google.android.gms.common.internal.c.a(paramContext);
    com.google.android.gms.common.internal.c.a(paramContext.getApplicationContext());
    Object localObject1 = n;
    if (localObject1 == null) {}
    synchronized (dc.class)
    {
      localObject1 = n;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/b/dg;
        ((dg)localObject1).<init>(paramContext);
        dc localdc = new com/google/android/gms/b/dc;
        localdc.<init>((dg)localObject1);
        n = localdc;
      }
      return n;
    }
  }
  
  private void a(bz parambz)
  {
    Object localObject1 = null;
    Object localObject2 = parambz.c();
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (bool1)
    {
      localObject3 = parambz.a();
      int i1 = 204;
      localObject2 = this;
      localObject4 = null;
      localObject5 = null;
      a((String)localObject3, i1, null, null, null);
    }
    for (;;)
    {
      return;
      localObject2 = parambz.c();
      localObject3 = parambz.b();
      localObject2 = cf.a((String)localObject2, (String)localObject3);
      try
      {
        localObject3 = new java/net/URL;
        ((URL)localObject3).<init>((String)localObject2);
        localObject6 = e();
        localObject6 = g;
        localObject4 = "Fetching remote configuration";
        localObject5 = parambz.a();
        ((cu.a)localObject6).a((String)localObject4, localObject5);
        localObject6 = g();
        localObject4 = parambz.a();
        localObject6 = ((da)localObject6).a((String)localObject4);
        localObject4 = g();
        localObject5 = parambz.a();
        localObject4 = ((da)localObject4).b((String)localObject5);
        if (localObject6 != null)
        {
          boolean bool2 = TextUtils.isEmpty((CharSequence)localObject4);
          if (!bool2)
          {
            localObject1 = new android/support/v4/g/a;
            ((a)localObject1).<init>();
            localObject6 = "If-Modified-Since";
            ((Map)localObject1).put(localObject6, localObject4);
          }
        }
        localObject6 = k();
        localObject4 = parambz.a();
        localObject5 = new com/google/android/gms/b/dc$4;
        ((dc.4)localObject5).<init>(this);
        ((cv)localObject6).a((String)localObject4, (URL)localObject3, (Map)localObject1, (cv.a)localObject5);
      }
      catch (MalformedURLException localMalformedURLException)
      {
        cu.a locala = ea;
        Object localObject6 = "Failed to parse config URL. Not fetching. appId";
        localObject1 = cu.a(parambz.a());
        locala.a((String)localObject6, localObject1, localObject2);
      }
    }
  }
  
  private void a(cj paramcj, ca paramca)
  {
    f().e();
    a();
    com.google.android.gms.common.internal.c.a(paramcj);
    com.google.android.gms.common.internal.c.a(paramca);
    com.google.android.gms.common.internal.c.a(a);
    Object localObject1 = a;
    localObject2 = a;
    com.google.android.gms.common.internal.c.b(((String)localObject1).equals(localObject2));
    localObject3 = new com/google/android/gms/b/du$e;
    ((du.e)localObject3).<init>();
    localObject1 = Integer.valueOf(1);
    a = ((Integer)localObject1);
    i = "android";
    localObject1 = a;
    o = ((String)localObject1);
    localObject1 = d;
    n = ((String)localObject1);
    localObject1 = c;
    p = ((String)localObject1);
    localObject1 = Integer.valueOf((int)j);
    C = ((Integer)localObject1);
    localObject1 = Long.valueOf(e);
    q = ((Long)localObject1);
    localObject1 = b;
    y = ((String)localObject1);
    l1 = f;
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    if (!bool1)
    {
      bool1 = false;
      localObject1 = null;
      v = ((Long)localObject1);
      localObject1 = d();
      localObject2 = a;
      localObject2 = ((cy)localObject1).a((String)localObject2);
      localObject1 = (CharSequence)first;
      bool1 = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool1) {
        break label789;
      }
      localObject1 = (String)first;
      s = ((String)localObject1);
      localObject1 = (Boolean)second;
      t = ((Boolean)localObject1);
    }
    label789:
    do
    {
      localObject1 = n().x();
      k = ((String)localObject1);
      localObject1 = n().y();
      j = ((String)localObject1);
      localObject1 = Integer.valueOf((int)n().z());
      m = ((Integer)localObject1);
      localObject1 = n().A();
      l = ((String)localObject1);
      r = null;
      d = null;
      e = null;
      bool1 = false;
      f = null;
      l1 = l;
      localObject1 = Long.valueOf(l1);
      H = ((Long)localObject1);
      localObject1 = j();
      localObject2 = a;
      localObject1 = ((cg)localObject1).b((String)localObject2);
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/b/bz;
        localObject2 = a;
        ((bz)localObject1).<init>(this, (String)localObject2);
        localObject2 = d().y();
        ((bz)localObject1).a((String)localObject2);
        localObject2 = k;
        ((bz)localObject1).d((String)localObject2);
        localObject2 = b;
        ((bz)localObject1).b((String)localObject2);
        localObject2 = d();
        localObject4 = a;
        localObject2 = ((cy)localObject2).b((String)localObject4);
        ((bz)localObject1).c((String)localObject2);
        ((bz)localObject1).f(0L);
        ((bz)localObject1).a(0L);
        ((bz)localObject1).b(0L);
        localObject2 = c;
        ((bz)localObject1).e((String)localObject2);
        l2 = j;
        ((bz)localObject1).c(l2);
        localObject2 = d;
        ((bz)localObject1).f((String)localObject2);
        l2 = e;
        ((bz)localObject1).d(l2);
        l2 = f;
        ((bz)localObject1).e(l2);
        i2 = h;
        ((bz)localObject1).a(i2);
        l2 = l;
        ((bz)localObject1).i(l2);
        localObject2 = j();
        ((cg)localObject2).a((bz)localObject1);
      }
      localObject2 = ((bz)localObject1).b();
      u = ((String)localObject2);
      localObject1 = ((bz)localObject1).e();
      B = ((String)localObject1);
      localObject1 = j();
      localObject2 = a;
      localObject4 = ((cg)localObject1).a((String)localObject2);
      localObject1 = new du.g[((List)localObject4).size()];
      c = ((du.g[])localObject1);
      bool1 = false;
      localObject1 = null;
      int i2 = 0;
      localObject2 = null;
      for (;;)
      {
        int i1 = ((List)localObject4).size();
        if (i2 >= i1) {
          break;
        }
        localObject5 = new com/google/android/gms/b/du$g;
        ((du.g)localObject5).<init>();
        c[i2] = localObject5;
        localObject1 = getc;
        b = ((String)localObject1);
        long l3 = getd;
        localObject1 = Long.valueOf(l3);
        a = ((Long)localObject1);
        localdr = i();
        localObject1 = gete;
        localdr.a((du.g)localObject5, localObject1);
        i1 = i2 + 1;
        i2 = i1;
      }
      l1 = f;
      localObject1 = Long.valueOf(l1);
      break;
      localObject1 = n();
      localObject2 = a;
      bool2 = ((ci)localObject1).a((Context)localObject2);
    } while (bool2);
    localObject1 = a.getContentResolver();
    localObject2 = "android_id";
    localObject1 = Settings.Secure.getString((ContentResolver)localObject1, (String)localObject2);
    if (localObject1 == null)
    {
      localObject1 = ec;
      localObject2 = "null secure ID. appId";
      localObject4 = cu.a(o);
      ((cu.a)localObject1).a((String)localObject2, localObject4);
      localObject1 = "null";
    }
    for (;;)
    {
      F = ((String)localObject1);
      break;
      boolean bool3 = ((String)localObject1).isEmpty();
      if (bool3)
      {
        localObject2 = ec;
        localObject4 = "empty secure ID. appId";
        localObject5 = cu.a(o);
        ((cu.a)localObject2).a((String)localObject4, localObject5);
      }
    }
    try
    {
      localObject1 = j();
      l4 = ((cg)localObject1).a((du.e)localObject3);
      localcg = j();
      localObject1 = f;
      if (localObject1 == null) {
        break label1198;
      }
      localObject1 = f;
      localObject2 = ((cl)localObject1).iterator();
      do
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        localObject3 = "_r";
        bool2 = ((String)localObject3).equals(localObject1);
      } while (!bool2);
      bool2 = true;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        long l4;
        cg localcg;
        localObject2 = ea;
        localObject4 = "Data loss. Failed to insert raw event metadata. appId";
        localObject3 = cu.a(o);
        ((cu.a)localObject2).a((String)localObject4, localObject3, localIOException);
        continue;
        da localda = g();
        localObject2 = a;
        localObject3 = b;
        bool2 = localda.c((String)localObject2, (String)localObject3);
        localObject2 = j();
        long l5 = z();
        localObject5 = a;
        localdr = null;
        localObject2 = ((cg)localObject2).a(l5, (String)localObject5, false, false, false, false, false);
        if (bool2)
        {
          l1 = e;
          localObject3 = b;
          localObject4 = a;
          int i3 = ((cf)localObject3).a((String)localObject4);
          l5 = i3;
          bool2 = l1 < l5;
          if (bool2)
          {
            bool2 = true;
            continue;
          }
        }
        bool2 = false;
        localda = null;
      }
    }
    bool2 = localcg.a(paramcj, l4, bool2);
    if (bool2)
    {
      l1 = 0L;
      l = l1;
    }
  }
  
  private static void a(de paramde)
  {
    if (paramde == null)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Component not created");
      throw localIllegalStateException;
    }
  }
  
  static void a(df paramdf)
  {
    IllegalStateException localIllegalStateException;
    if (paramdf == null)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Component not created");
      throw localIllegalStateException;
    }
    boolean bool = paramdf.I();
    if (!bool)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Component not initialized");
      throw localIllegalStateException;
    }
  }
  
  private boolean a(int paramInt, FileChannel paramFileChannel)
  {
    boolean bool1 = true;
    Object localObject1 = f();
    ((db)localObject1).e();
    if (paramFileChannel != null)
    {
      boolean bool2 = paramFileChannel.isOpen();
      if (bool2) {}
    }
    else
    {
      cu.a locala = ea;
      localObject1 = "Bad chanel to read from";
      locala.a((String)localObject1);
      bool1 = false;
      locala = null;
    }
    for (;;)
    {
      return bool1;
      int i1 = 4;
      localObject1 = ByteBuffer.allocate(i1);
      ((ByteBuffer)localObject1).putInt(paramInt);
      ((ByteBuffer)localObject1).flip();
      long l1 = 0L;
      try
      {
        paramFileChannel.truncate(l1);
        paramFileChannel.write((ByteBuffer)localObject1);
        i1 = 1;
        paramFileChannel.force(i1);
        long l2 = paramFileChannel.size();
        l1 = 4;
        boolean bool3 = l2 < l1;
        if (bool3)
        {
          localObject1 = e();
          localObject1 = a;
          str = "Error writing to channel. Bytes written";
          l1 = paramFileChannel.size();
          Long localLong = Long.valueOf(l1);
          ((cu.a)localObject1).a(str, localLong);
        }
      }
      catch (IOException localIOException)
      {
        localObject1 = ea;
        String str = "Failed to write to channel";
        ((cu.a)localObject1).a(str, localIOException);
        bool1 = false;
        Object localObject2 = null;
      }
    }
  }
  
  private boolean a(long paramLong)
  {
    Object localObject1 = j();
    ((cg)localObject1).x();
    for (;;)
    {
      dc.a locala;
      long l1;
      int i9;
      float f3;
      Object localObject6;
      Object localObject7;
      int i10;
      try
      {
        locala = new com/google/android/gms/b/dc$a;
        boolean bool1 = false;
        f1 = 0.0F;
        localObject1 = null;
        Object localObject4 = this;
        locala.<init>(this, (byte)0);
        localObject1 = j();
        int i7 = 0;
        f2 = 0.0F;
        localObject5 = null;
        l1 = J;
        long l2 = paramLong;
        ((cg)localObject1).a(null, paramLong, l1, locala);
        localObject1 = c;
        int i11;
        int i15;
        if (localObject1 != null)
        {
          localObject1 = c;
          bool1 = ((List)localObject1).isEmpty();
          if (!bool1) {}
        }
        else
        {
          bool1 = true;
          f1 = Float.MIN_VALUE;
          if (bool1) {
            break label3409;
          }
          i9 = 0;
          f3 = 0.0F;
          localObject6 = null;
          localObject4 = a;
          localObject7 = localObject4;
          localObject1 = c;
          int i1 = ((List)localObject1).size();
          localObject1 = new du.b[i1];
          b = ((du.b[])localObject1);
          i10 = 0;
          i1 = 0;
          f1 = 0.0F;
          localObject1 = null;
          i11 = 0;
          localObject1 = c;
          i1 = ((List)localObject1).size();
          if (i11 >= i1) {
            continue;
          }
          localObject5 = g();
          localObject1 = a;
          localObject8 = o;
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject1 = b;
          i2 = ((da)localObject5).b((String)localObject8, (String)localObject1);
          if (i2 == 0) {
            continue;
          }
          localObject1 = e();
          localObject5 = c;
          localObject8 = "Dropping blacklisted raw event. appId";
          localObject1 = a;
          localObject1 = o;
          localObject9 = cu.a((String)localObject1);
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject1 = b;
          ((cu.a)localObject5).a((String)localObject8, localObject9, localObject1);
          localObject1 = i();
          localObject5 = a;
          localObject5 = o;
          i2 = ((dr)localObject1).l((String)localObject5);
          if (i2 == 0)
          {
            localObject1 = i();
            localObject5 = a;
            localObject5 = o;
            i2 = ((dr)localObject1).m((String)localObject5);
            if (i2 == 0) {
              continue;
            }
          }
          i2 = 1;
          f1 = Float.MIN_VALUE;
          if (i2 != 0) {
            break label3443;
          }
          localObject5 = "_err";
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject1 = b;
          i2 = ((String)localObject5).equals(localObject1);
          if (i2 != 0) {
            break label3443;
          }
          localObject5 = i();
          i12 = 11;
          f4 = 1.5E-44F;
          localObject9 = "_ev";
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject1 = b;
          i15 = 0;
          localObject10 = null;
          ((dr)localObject5).a(i12, (String)localObject9, (String)localObject1, 0);
          i2 = i10;
          i7 = i9;
          f2 = f3;
          i12 = i11 + 1;
          i11 = i12;
          i10 = i2;
          i9 = i7;
          f3 = f2;
          continue;
        }
        int i2 = 0;
        f1 = 0.0F;
        localObject1 = null;
        continue;
        i2 = 0;
        f1 = 0.0F;
        localObject1 = null;
        continue;
        localObject5 = g();
        localObject1 = a;
        localObject8 = o;
        localObject1 = c;
        localObject1 = ((List)localObject1).get(i11);
        localObject1 = (du.b)localObject1;
        localObject1 = b;
        boolean bool5 = ((da)localObject5).c((String)localObject8, (String)localObject1);
        if (!bool5)
        {
          i();
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject5 = b;
          com.google.android.gms.common.internal.c.a((String)localObject5);
          i3 = -1;
          f1 = 0.0F / 0.0F;
          i12 = ((String)localObject5).hashCode();
        }
        int i16;
        switch (i12)
        {
        default: 
          switch (i3)
          {
          default: 
            i3 = 0;
            f1 = 0.0F;
            localObject1 = null;
            if (i3 == 0) {
              break label3483;
            }
            i7 = 0;
            f2 = 0.0F;
            localObject5 = null;
            i12 = 0;
            f4 = 0.0F;
            localObject8 = null;
            localObject1 = c;
            localObject1 = ((List)localObject1).get(i11);
            localObject1 = (du.b)localObject1;
            localObject1 = a;
            if (localObject1 == null)
            {
              localObject1 = c;
              localObject1 = ((List)localObject1).get(i11);
              localObject1 = (du.b)localObject1;
              i16 = 0;
              localObject9 = null;
              localObject9 = new du.c[0];
              a = ((du.c[])localObject9);
            }
            localObject1 = c;
            localObject1 = ((List)localObject1).get(i11);
            localObject1 = (du.b)localObject1;
            localObject10 = a;
            int i18 = localObject10.length;
            i3 = 0;
            f1 = 0.0F;
            localObject1 = null;
            i16 = 0;
            localObject9 = null;
            if (i16 >= i18) {
              continue;
            }
            localObject1 = localObject10[i16];
            str1 = "_c";
            str2 = a;
            bool6 = str1.equals(str2);
            if (!bool6) {
              continue;
            }
            l3 = 1L;
            localObject5 = Long.valueOf(l3);
            c = ((Long)localObject5);
            i7 = 1;
            f2 = Float.MIN_VALUE;
            i3 = i12;
            f1 = f4;
            i16 += 1;
            i12 = i3;
            f4 = f1;
          }
          break;
        case 94660: 
          localObject8 = "_in";
          i7 = ((String)localObject5).equals(localObject8);
          if (i7 == 0) {
            continue;
          }
          i3 = 0;
          f1 = 0.0F;
          localObject1 = null;
          break;
        case 95027: 
          localObject8 = "_ui";
          i7 = ((String)localObject5).equals(localObject8);
          if (i7 == 0) {
            continue;
          }
          i3 = 1;
          f1 = Float.MIN_VALUE;
          break;
        }
        localObject8 = "_ug";
        i7 = ((String)localObject5).equals(localObject8);
        if (i7 == 0) {
          continue;
        }
        int i3 = 2;
        f1 = 2.8E-45F;
        continue;
        i3 = 1;
        f1 = Float.MIN_VALUE;
        continue;
        String str1 = "_r";
        String str2 = a;
        boolean bool6 = str1.equals(str2);
        if (!bool6) {
          break label3472;
        }
        long l3 = 1L;
        localObject8 = Long.valueOf(l3);
        c = ((Long)localObject8);
        i3 = 1;
        f1 = Float.MIN_VALUE;
        continue;
        if ((i7 == 0) && (bool5))
        {
          localObject1 = e();
          localObject5 = g;
          localObject9 = "Marking event as conversion";
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject1 = b;
          ((cu.a)localObject5).a((String)localObject9, localObject1);
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject5 = a;
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject1 = a;
          i3 = localObject1.length + 1;
          localObject1 = Arrays.copyOf((Object[])localObject5, i3);
          localObject1 = (du.c[])localObject1;
          localObject5 = new com/google/android/gms/b/du$c;
          ((du.c)localObject5).<init>();
          localObject9 = "_c";
          a = ((String)localObject9);
          l4 = 1L;
          localObject9 = Long.valueOf(l4);
          c = ((Long)localObject9);
          i16 = localObject1.length + -1;
          localObject1[i16] = localObject5;
          localObject5 = c;
          localObject5 = ((List)localObject5).get(i11);
          localObject5 = (du.b)localObject5;
          a = ((du.c[])localObject1);
        }
        if (i12 == 0)
        {
          localObject1 = e();
          localObject5 = g;
          localObject8 = "Marking event as real-time";
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject1 = b;
          ((cu.a)localObject5).a((String)localObject8, localObject1);
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject5 = a;
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject1 = a;
          i3 = localObject1.length + 1;
          localObject1 = Arrays.copyOf((Object[])localObject5, i3);
          localObject1 = (du.c[])localObject1;
          localObject5 = new com/google/android/gms/b/du$c;
          ((du.c)localObject5).<init>();
          localObject8 = "_r";
          a = ((String)localObject8);
          l4 = 1L;
          localObject8 = Long.valueOf(l4);
          c = ((Long)localObject8);
          i12 = localObject1.length + -1;
          localObject1[i12] = localObject5;
          localObject5 = c;
          localObject5 = ((List)localObject5).get(i11);
          localObject5 = (du.b)localObject5;
          a = ((du.c[])localObject1);
        }
        int i21 = 1;
        float f5 = Float.MIN_VALUE;
        Object localObject9 = j();
        long l4 = z();
        localObject1 = a;
        str1 = o;
        str2 = null;
        boolean bool7 = false;
        boolean bool8 = true;
        localObject1 = ((cg)localObject9).a(l4, str1, false, false, false, false, bool8);
        l5 = e;
        localObject4 = this;
        localObject8 = b;
        localObject9 = a;
        localObject9 = o;
        int i12 = ((cf)localObject8).a((String)localObject9);
        l4 = i12;
        boolean bool2 = l5 < l4;
        int i13;
        int i19;
        du.c[] arrayOfc;
        int i17;
        if (bool2)
        {
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          i7 = 0;
          f2 = 0.0F;
          localObject5 = null;
          localObject8 = a;
          i12 = localObject8.length;
          if (i7 < i12)
          {
            localObject8 = "_r";
            localObject9 = a;
            localObject9 = localObject9[i7];
            localObject9 = a;
            boolean bool4 = ((String)localObject8).equals(localObject9);
            if (bool4)
            {
              localObject8 = a;
              i13 = localObject8.length + -1;
              localObject8 = new du.c[i13];
              if (i7 > 0)
              {
                localObject9 = a;
                i15 = 0;
                localObject10 = null;
                i19 = 0;
                arrayOfc = null;
                System.arraycopy(localObject9, 0, localObject8, 0, i7);
              }
              i16 = localObject8.length;
              if (i7 < i16)
              {
                localObject9 = a;
                i15 = i7 + 1;
                i19 = localObject8.length - i7;
                System.arraycopy(localObject9, i15, localObject8, i7, i19);
              }
              a = ((du.c[])localObject8);
            }
          }
          else
          {
            i21 = i9;
            f5 = f3;
          }
        }
        else
        {
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject1 = b;
          bool2 = dr.a((String)localObject1);
          if ((!bool2) || (!bool5)) {
            continue;
          }
          localObject9 = j();
          l4 = z();
          localObject1 = a;
          str1 = o;
          str2 = null;
          bool7 = true;
          bool8 = false;
          localObject1 = ((cg)localObject9).a(l4, str1, false, false, bool7, false, false);
          l5 = c;
          localObject4 = this;
          localObject8 = b;
          localObject6 = a;
          localObject6 = o;
          localObject9 = cp.t;
          i13 = ((cf)localObject8).b((String)localObject6, (cp.a)localObject9);
          l2 = i13;
          bool2 = l5 < l2;
          if (!bool2) {
            continue;
          }
          localObject1 = e();
          localObject1 = c;
          localObject5 = "Too many conversions. Not logging as conversion. appId";
          localObject8 = a;
          localObject8 = o;
          localObject8 = cu.a((String)localObject8);
          ((cu.a)localObject1).a((String)localObject5, localObject8);
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          i13 = 0;
          f4 = 0.0F;
          localObject8 = null;
          i9 = 0;
          f3 = 0.0F;
          localObject6 = null;
          localObject10 = a;
          i19 = localObject10.length;
          i17 = 0;
          localObject9 = null;
          i8 = 0;
          localObject5 = null;
          f2 = 0.0F;
          if (i17 >= i19) {
            continue;
          }
          localObject8 = localObject10[i17];
          str1 = "_c";
          str2 = a;
          bool6 = str1.equals(str2);
          if (!bool6) {
            continue;
          }
          i9 = i17 + 1;
          i17 = i9;
          localObject6 = localObject8;
          continue;
        }
        i8 += 1;
        continue;
        str1 = "_err";
        localObject8 = a;
        i14 = str1.equals(localObject8);
        if (i14 == 0) {
          break label3465;
        }
        i8 = 1;
        f2 = Float.MIN_VALUE;
        localObject8 = localObject6;
        continue;
        if ((i8 != 0) && (localObject6 != null))
        {
          localObject5 = a;
          i8 = localObject5.length + -1;
          localObject10 = new du.c[i8];
          i14 = 0;
          f4 = 0.0F;
          localObject8 = null;
          arrayOfc = a;
          int i20 = arrayOfc.length;
          i8 = 0;
          f2 = 0.0F;
          localObject5 = null;
          i17 = 0;
          localObject9 = null;
          if (i17 < i20)
          {
            str2 = arrayOfc[i17];
            if (str2 == localObject6) {
              break label3458;
            }
            i8 = i14 + 1;
            localObject10[i14] = str2;
            i17 += 1;
            i14 = i8;
            continue;
          }
          a = ((du.c[])localObject10);
          i14 = i21;
          f4 = f5;
          localObject4 = localObject7;
          localObject6 = b;
          i8 = i10 + 1;
          localObject1 = c;
          localObject1 = ((List)localObject1).get(i11);
          localObject1 = (du.b)localObject1;
          localObject6[i10] = localObject1;
          bool2 = i8;
          i8 = i14;
          f2 = f4;
          continue;
        }
        if (localObject6 != null)
        {
          localObject1 = "_err";
          a = ((String)localObject1);
          l5 = 10;
          localObject1 = Long.valueOf(l5);
          c = ((Long)localObject1);
          i14 = i21;
          f4 = f5;
          continue;
        }
        localObject1 = e();
        localObject1 = a;
        localObject5 = "Did not find conversion parameter. appId";
        localObject8 = a;
        localObject8 = o;
        localObject8 = cu.a((String)localObject8);
        ((cu.a)localObject1).a((String)localObject5, localObject8);
        i14 = i21;
        f4 = f5;
        continue;
        localObject1 = c;
        int i4 = ((List)localObject1).size();
        if (i10 < i4)
        {
          localObject4 = localObject7;
          localObject1 = b;
          localObject1 = Arrays.copyOf((Object[])localObject1, i10);
          localObject1 = (du.b[])localObject1;
          b = ((du.b[])localObject1);
        }
        localObject1 = a;
        localObject1 = o;
        localObject5 = a;
        localObject5 = c;
        localObject4 = localObject7;
        localObject8 = b;
        localObject4 = this;
        localObject1 = a((String)localObject1, (du.g[])localObject5, (du.b[])localObject8);
        localObject4 = localObject7;
        A = ((du.a[])localObject1);
        l5 = Long.MAX_VALUE;
        localObject1 = Long.valueOf(l5);
        e = ((Long)localObject1);
        l5 = Long.MIN_VALUE;
        localObject1 = Long.valueOf(l5);
        f = ((Long)localObject1);
        i4 = 0;
        f1 = 0.0F;
        localObject1 = null;
        localObject4 = localObject7;
        localObject5 = b;
        i8 = localObject5.length;
        if (i4 < i8)
        {
          localObject5 = b;
          localObject5 = localObject5[i4];
          localObject8 = c;
          l1 = ((Long)localObject8).longValue();
          localObject8 = e;
          l4 = ((Long)localObject8).longValue();
          i14 = l1 < l4;
          if (i14 < 0)
          {
            localObject8 = c;
            e = ((Long)localObject8);
          }
          localObject8 = c;
          l1 = ((Long)localObject8).longValue();
          localObject4 = localObject7;
          localObject8 = f;
          l4 = ((Long)localObject8).longValue();
          i14 = l1 < l4;
          if (i14 > 0)
          {
            localObject5 = c;
            f = ((Long)localObject5);
          }
          i4 += 1;
          continue;
        }
        localObject1 = a;
        localObject9 = o;
        localObject1 = j();
        Object localObject10 = ((cg)localObject1).b((String)localObject9);
        if (localObject10 == null)
        {
          localObject1 = e();
          localObject1 = a;
          localObject5 = "Bundling raw events w/o app info. appId";
          localObject8 = a;
          localObject8 = o;
          localObject8 = cu.a((String)localObject8);
          ((cu.a)localObject1).a((String)localObject5, localObject8);
          localObject4 = localObject7;
          localObject1 = b;
          i4 = localObject1.length;
          if (i4 > 0)
          {
            cf.W();
            localObject1 = g();
            localObject5 = a;
            localObject5 = o;
            localObject1 = ((da)localObject1).a((String)localObject5);
            if (localObject1 != null)
            {
              localObject5 = a;
              if (localObject5 != null) {
                break label3384;
              }
            }
            localObject1 = a;
            localObject1 = y;
            boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
            if (!bool3) {
              break label3337;
            }
            l5 = -1;
            localObject1 = Long.valueOf(l5);
            localObject4 = localObject7;
            G = ((Long)localObject1);
            localObject1 = j();
            localObject4 = localObject7;
            ((cg)localObject1).a((du.e)localObject7, i9);
          }
          localObject1 = j();
          localObject5 = b;
          ((cg)localObject1).a((List)localObject5);
          localObject1 = j();
          ((cg)localObject1).h((String)localObject9);
          localObject1 = j();
          ((cg)localObject1).y();
          localObject4 = localObject7;
          localObject1 = b;
          int i5 = localObject1.length;
          if (i5 <= 0) {
            break label3398;
          }
          i5 = 1;
          f1 = Float.MIN_VALUE;
          localObject5 = j();
          ((cg)localObject5).z();
          return i5;
        }
        localObject1 = b;
        i6 = localObject1.length;
        if (i6 <= 0) {
          continue;
        }
        l5 = ((bz)localObject10).g();
        l1 = 0L;
        i14 = l5 < l1;
        if (i14 != 0)
        {
          localObject8 = Long.valueOf(l5);
          localObject4 = localObject7;
          h = ((Long)localObject8);
          l1 = ((bz)localObject10).f();
          l3 = 0L;
          i14 = l1 < l3;
          if (i14 != 0) {
            break label3436;
          }
          l1 = 0L;
          i14 = l5 < l1;
          if (i14 == 0) {
            break label3326;
          }
          localObject1 = Long.valueOf(l5);
          localObject4 = localObject7;
          g = ((Long)localObject1);
          ((bz)localObject10).q();
          l5 = ((bz)localObject10).n();
          i6 = (int)l5;
          localObject1 = Integer.valueOf(i6);
          w = ((Integer)localObject1);
          localObject1 = e;
          l5 = ((Long)localObject1).longValue();
          ((bz)localObject10).a(l5);
          localObject1 = f;
          l5 = ((Long)localObject1).longValue();
          ((bz)localObject10).b(l5);
          localObject1 = a;
          localObject1 = ((dc)localObject1).f();
          ((db)localObject1).e();
          localObject1 = h;
          i8 = 0;
          f2 = 0.0F;
          localObject5 = null;
          ((bz)localObject10).g(null);
          x = ((String)localObject1);
          localObject1 = j();
          ((cg)localObject1).a((bz)localObject10);
          continue;
        }
        i14 = 0;
      }
      finally
      {
        j().z();
      }
      float f4 = 0.0F;
      Object localObject8 = null;
      continue;
      label3326:
      int i6 = 0;
      float f1 = 0.0F;
      Object localObject3 = null;
      continue;
      label3337:
      localObject3 = e();
      localObject3 = c;
      Object localObject5 = "Did not find measurement config or missing version info. appId";
      localObject8 = a;
      localObject8 = o;
      localObject8 = cu.a((String)localObject8);
      ((cu.a)localObject3).a((String)localObject5, localObject8);
      continue;
      label3384:
      localObject3 = a;
      G = ((Long)localObject3);
      continue;
      label3398:
      i6 = 0;
      f1 = 0.0F;
      localObject3 = null;
      continue;
      label3409:
      localObject3 = j();
      ((cg)localObject3).y();
      j().z();
      i6 = 0;
      f1 = 0.0F;
      localObject3 = null;
      continue;
      label3436:
      long l5 = l1;
      continue;
      label3443:
      i6 = i10;
      int i8 = i9;
      float f2 = f3;
      continue;
      label3458:
      i8 = i14;
      continue;
      label3465:
      localObject8 = localObject6;
      continue;
      label3472:
      i6 = i14;
      f1 = f4;
      continue;
      label3483:
      int i14 = i9;
      f4 = f3;
    }
  }
  
  private du.a[] a(String paramString, du.g[] paramArrayOfg, du.b[] paramArrayOfb)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    return p().a(paramString, paramArrayOfb, paramArrayOfg);
  }
  
  private ca b(String paramString)
  {
    Object localObject1 = j().b(paramString);
    Object localObject2;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject2 = ((bz)localObject1).h();
      bool1 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool1) {}
    }
    else
    {
      localObject1 = ef;
      ((cu.a)localObject1).a("No app data available; dropping", paramString);
      bool1 = false;
      localObject2 = null;
    }
    for (;;)
    {
      return (ca)localObject2;
      try
      {
        localObject2 = a;
        localObject2 = bc.a((Context)localObject2);
        str1 = null;
        localObject2 = ((bb)localObject2).b(paramString, 0);
        localObject2 = versionName;
        str1 = ((bz)localObject1).h();
        if (str1 != null)
        {
          str1 = ((bz)localObject1).h();
          bool1 = str1.equals(localObject2);
          if (!bool1)
          {
            localObject2 = e();
            localObject2 = c;
            str1 = "App version does not match; dropping. appId";
            localObject3 = cu.a(paramString);
            ((cu.a)localObject2).a(str1, localObject3);
            bool1 = false;
            localObject2 = null;
          }
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        ca localca = new com/google/android/gms/b/ca;
        Object localObject3 = ((bz)localObject1).c();
        String str2 = ((bz)localObject1).h();
        long l1 = ((bz)localObject1).i();
        String str3 = ((bz)localObject1).j();
        long l2 = ((bz)localObject1).k();
        long l3 = ((bz)localObject1).l();
        boolean bool2 = ((bz)localObject1).m();
        String str4 = ((bz)localObject1).e();
        long l4 = ((bz)localObject1).s();
        long l5 = 0L;
        String str1 = paramString;
        localca.<init>(paramString, (String)localObject3, str2, l1, str3, l2, l3, null, bool2, false, str4, l4, l5, 0);
      }
    }
  }
  
  private void b(cn paramcn, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramca);
    com.google.android.gms.common.internal.c.a(a);
    long l1 = System.nanoTime();
    Object localObject1 = f();
    ((db)localObject1).e();
    a();
    Object localObject4 = a;
    i();
    boolean bool1 = dr.a(paramcn, paramca);
    if (!bool1) {}
    Object localObject5;
    Object localObject6;
    Object localObject7;
    long l2;
    long l3;
    double d2;
    long l4;
    String str1;
    int i5;
    label1362:
    Object localObject3;
    for (;;)
    {
      return;
      bool1 = h;
      if (!bool1)
      {
        b(paramca);
      }
      else
      {
        localObject1 = g();
        localObject5 = a;
        bool1 = ((da)localObject1).b((String)localObject4, (String)localObject5);
        if (bool1)
        {
          localObject1 = ec;
          localObject5 = "Dropping blacklisted event. appId";
          localObject6 = cu.a((String)localObject4);
          localObject7 = a;
          ((cu.a)localObject1).a((String)localObject5, localObject6, localObject7);
          localObject1 = i();
          bool1 = ((dr)localObject1).l((String)localObject4);
          if (!bool1)
          {
            localObject1 = i();
            bool1 = ((dr)localObject1).m((String)localObject4);
            if (!bool1) {}
          }
          else
          {
            bool1 = true;
          }
          for (;;)
          {
            if (!bool1)
            {
              localObject5 = "_err";
              localObject6 = a;
              boolean bool2 = ((String)localObject5).equals(localObject6);
              if (!bool2)
              {
                localObject5 = i();
                i4 = 11;
                localObject7 = "_ev";
                localObject8 = a;
                localObject9 = null;
                ((dr)localObject5).a(i4, (String)localObject7, (String)localObject8, 0);
              }
            }
            if (!bool1) {
              break;
            }
            localObject1 = j().b((String)localObject4);
            if (localObject1 == null) {
              break;
            }
            l2 = ((bz)localObject1).p();
            l3 = ((bz)localObject1).o();
            l2 = Math.max(l2, l3);
            localObject4 = i;
            l2 = Math.abs(((com.google.android.gms.common.util.c)localObject4).a() - l2);
            l3 = cf.ac();
            boolean bool6 = l2 < l3;
            if (!bool6) {
              break;
            }
            localObject4 = ef;
            localObject5 = "Fetching config for blacklisted app";
            ((cu.a)localObject4).a((String)localObject5);
            a((bz)localObject1);
            break;
            bool1 = false;
            localObject1 = null;
          }
        }
        localObject1 = e();
        int i1 = 2;
        bool1 = ((cu)localObject1).a(i1);
        if (bool1)
        {
          localObject1 = eg;
          localObject5 = "Logging event";
          ((cu.a)localObject1).a((String)localObject5, paramcn);
        }
        localObject1 = j();
        ((cg)localObject1).x();
        Bundle localBundle;
        boolean bool7;
        boolean bool9;
        boolean bool10;
        for (;;)
        {
          try
          {
            localObject1 = b;
            localBundle = ((cl)localObject1).a();
            b(paramca);
            localObject1 = "_iap";
            localObject5 = a;
            bool1 = ((String)localObject1).equals(localObject5);
            double d1;
            if (!bool1)
            {
              localObject1 = "ecommerce_purchase";
              localObject5 = a;
              bool1 = ((String)localObject1).equals(localObject5);
              if (!bool1) {}
            }
            else
            {
              localObject1 = "currency";
              localObject1 = localBundle.getString((String)localObject1);
              localObject5 = "ecommerce_purchase";
              localObject6 = a;
              boolean bool3 = ((String)localObject5).equals(localObject6);
              if (!bool3) {
                continue;
              }
              localObject5 = "value";
              d1 = localBundle.getDouble((String)localObject5) * 1000000.0D;
              l3 = 0L;
              d2 = 0.0D;
              bool7 = d1 < d2;
              if (!bool7)
              {
                localObject5 = "value";
                l2 = localBundle.getLong((String)localObject5);
                d1 = l2;
                l3 = 4696837146684686336L;
                d2 = 1000000.0D;
                d1 *= d2;
              }
              l3 = 4890909195324358656L;
              d2 = 9.223372036854776E18D;
              bool7 = d1 < d2;
              if (bool7) {
                continue;
              }
              l3 = -4332462841530417152L;
              d2 = -9.223372036854776E18D;
              bool7 = d1 < d2;
              if (bool7) {
                continue;
              }
              l2 = Math.round(d1);
              l4 = l2;
              bool3 = TextUtils.isEmpty((CharSequence)localObject1);
              if (!bool3)
              {
                localObject5 = Locale.US;
                localObject1 = ((String)localObject1).toUpperCase((Locale)localObject5);
                localObject5 = "[A-Z]{3}";
                bool3 = ((String)localObject1).matches((String)localObject5);
                if (bool3)
                {
                  localObject5 = "_ltv_";
                  localObject5 = String.valueOf(localObject5);
                  localObject1 = String.valueOf(localObject1);
                  i4 = ((String)localObject1).length();
                  if (i4 == 0) {
                    continue;
                  }
                  localObject6 = ((String)localObject5).concat((String)localObject1);
                  localObject1 = j();
                  localObject1 = ((cg)localObject1).c((String)localObject4, (String)localObject6);
                  if (localObject1 != null)
                  {
                    localObject5 = e;
                    bool3 = localObject5 instanceof Long;
                    if (bool3) {
                      break label1362;
                    }
                  }
                  localObject1 = j();
                  localObject5 = b;
                  localObject7 = cp.K;
                  int i2 = ((cf)localObject5).b((String)localObject4, (cp.a)localObject7) + -1;
                  ((cg)localObject1).a((String)localObject4, i2);
                  localObject1 = new com/google/android/gms/b/dq;
                  localObject5 = c;
                  localObject7 = i;
                  l3 = ((com.google.android.gms.common.util.c)localObject7).a();
                  localObject9 = Long.valueOf(l4);
                  ((dq)localObject1).<init>((String)localObject4, (String)localObject5, (String)localObject6, l3, localObject9);
                  localObject5 = j();
                  boolean bool4 = ((cg)localObject5).a((dq)localObject1);
                  if (!bool4)
                  {
                    localObject5 = e();
                    localObject5 = a;
                    localObject6 = "Too many unique user properties are set. Ignoring user property. appId";
                    localObject7 = cu.a((String)localObject4);
                    localObject8 = c;
                    localObject1 = e;
                    ((cu.a)localObject5).a((String)localObject6, localObject7, localObject8, localObject1);
                    localObject1 = i();
                    int i3 = 9;
                    i4 = 0;
                    localObject6 = null;
                    bool7 = false;
                    localObject7 = null;
                    i8 = 0;
                    localObject8 = null;
                    ((dr)localObject1).a(i3, null, null, 0);
                  }
                }
              }
            }
            localObject1 = a;
            bool9 = dr.a((String)localObject1);
            localObject1 = "_err";
            localObject5 = a;
            bool10 = ((String)localObject1).equals(localObject5);
            localObject6 = j();
            l3 = z();
            boolean bool11 = true;
            str1 = null;
            localObject9 = localObject4;
            localObject1 = ((cg)localObject6).a(l3, (String)localObject4, bool11, bool9, false, bool10, false);
            l2 = b;
            l3 = cf.H();
            l2 -= l3;
            l3 = 0L;
            d2 = 0.0D;
            bool7 = l2 < l3;
            if (!bool7) {
              break label1441;
            }
            l3 = 1000L;
            d2 = 4.94E-321D;
            l2 %= l3;
            l3 = 1L;
            d2 = Double.MIN_VALUE;
            bool5 = l2 < l3;
            if (!bool5)
            {
              localObject5 = e();
              localObject5 = a;
              localObject6 = "Data loss. Too many events logged. appId, count";
              localObject4 = cu.a((String)localObject4);
              l3 = b;
              localObject1 = Long.valueOf(l3);
              ((cu.a)localObject5).a((String)localObject6, localObject4, localObject1);
            }
            localObject1 = i();
            i5 = 16;
            localObject5 = "_ev";
            localObject6 = a;
            bool7 = false;
            localObject7 = null;
            ((dr)localObject1).a(i5, (String)localObject5, (String)localObject6, 0);
            localObject1 = j();
            ((cg)localObject1).y();
            localObject1 = j();
            ((cg)localObject1).z();
            break;
            localObject1 = e();
            localObject1 = c;
            localObject7 = "Data lost. Currency value is too big. appId";
            localObject4 = cu.a((String)localObject4);
            localObject5 = Double.valueOf(d1);
            ((cu.a)localObject1).a((String)localObject7, localObject4, localObject5);
            localObject1 = j();
            ((cg)localObject1).y();
            localObject1 = j();
            ((cg)localObject1).z();
            break;
            localObject5 = "value";
            l2 = localBundle.getLong((String)localObject5);
            l4 = l2;
            continue;
            localObject6 = new java/lang/String;
            ((String)localObject6).<init>((String)localObject5);
            continue;
            localObject3 = e;
          }
          finally
          {
            j().z();
          }
          localObject3 = (Long)localObject3;
          l5 = ((Long)localObject3).longValue();
          localObject3 = new com/google/android/gms/b/dq;
          localObject5 = c;
          localObject7 = i;
          l3 = ((com.google.android.gms.common.util.c)localObject7).a();
          l4 += l5;
          localObject9 = Long.valueOf(l4);
          ((dq)localObject3).<init>((String)localObject4, (String)localObject5, (String)localObject6, l3, localObject9);
        }
        label1441:
        if (bool9)
        {
          l2 = a;
          l3 = cf.I();
          l2 -= l3;
          l3 = 0L;
          d2 = 0.0D;
          bool7 = l2 < l3;
          if (bool7)
          {
            l3 = 1000L;
            d2 = 4.94E-321D;
            l2 %= l3;
            l3 = 1L;
            d2 = Double.MIN_VALUE;
            bool5 = l2 < l3;
            if (!bool5)
            {
              localObject5 = e();
              localObject5 = a;
              localObject6 = "Data loss. Too many public events logged. appId, count";
              localObject4 = cu.a((String)localObject4);
              l3 = a;
              localObject3 = Long.valueOf(l3);
              ((cu.a)localObject5).a((String)localObject6, localObject4, localObject3);
            }
            localObject3 = i();
            i5 = 16;
            localObject5 = "_ev";
            localObject6 = a;
            bool7 = false;
            localObject7 = null;
            ((dr)localObject3).a(i5, (String)localObject5, (String)localObject6, 0);
            localObject3 = j();
            ((cg)localObject3).y();
            localObject3 = j();
            ((cg)localObject3).z();
            continue;
          }
        }
        if (bool10)
        {
          l2 = d;
          localObject7 = b;
          localObject8 = a;
          localObject9 = cp.r;
          int i6 = ((cf)localObject7).b((String)localObject8, (cp.a)localObject9);
          i8 = 1000000;
          i6 = Math.min(i8, i6);
          i8 = 0;
          localObject8 = null;
          l3 = Math.max(0, i6);
          l2 -= l3;
          l3 = 0L;
          d2 = 0.0D;
          bool8 = l2 < l3;
          if (bool8)
          {
            l3 = 1L;
            d2 = Double.MIN_VALUE;
            bool5 = l2 < l3;
            if (!bool5)
            {
              localObject5 = e();
              localObject5 = a;
              localObject6 = "Too many error events logged. appId, count";
              localObject4 = cu.a((String)localObject4);
              l3 = d;
              localObject3 = Long.valueOf(l3);
              ((cu.a)localObject5).a((String)localObject6, localObject4, localObject3);
            }
            localObject3 = j();
            ((cg)localObject3).y();
            localObject3 = j();
            ((cg)localObject3).z();
            continue;
          }
        }
        localObject3 = i();
        localObject5 = "_o";
        localObject6 = c;
        ((dr)localObject3).a(localBundle, (String)localObject5, localObject6);
        localObject3 = i();
        bool1 = ((dr)localObject3).j((String)localObject4);
        if (bool1)
        {
          localObject3 = i();
          localObject5 = "_dbg";
          l3 = 1L;
          d2 = Double.MIN_VALUE;
          localObject6 = Long.valueOf(l3);
          ((dr)localObject3).a(localBundle, (String)localObject5, localObject6);
          localObject3 = i();
          localObject5 = "_r";
          l3 = 1L;
          d2 = Double.MIN_VALUE;
          localObject6 = Long.valueOf(l3);
          ((dr)localObject3).a(localBundle, (String)localObject5, localObject6);
        }
        localObject3 = j();
        l2 = ((cg)localObject3).c((String)localObject4);
        l3 = 0L;
        d2 = 0.0D;
        bool1 = l2 < l3;
        if (bool1)
        {
          localObject3 = e();
          localObject3 = c;
          localObject7 = "Data lost. Too many events stored on disk, deleted. appId";
          localObject8 = cu.a((String)localObject4);
          localObject5 = Long.valueOf(l2);
          ((cu.a)localObject3).a((String)localObject7, localObject8, localObject5);
        }
        localObject6 = new com/google/android/gms/b/cj;
        localObject8 = c;
        str2 = a;
        l5 = d;
        l6 = 0L;
        localObject7 = this;
        Object localObject9 = localObject4;
        ((cj)localObject6).<init>(this, (String)localObject8, (String)localObject4, str2, l5, l6, localBundle);
        localObject3 = j();
        localObject5 = b;
        localObject3 = ((cg)localObject3).a((String)localObject4, (String)localObject5);
        if (localObject3 != null) {
          break label2479;
        }
        localObject3 = j();
        com.google.android.gms.common.internal.c.a((String)localObject4);
        localObject5 = "select count(1) from events where app_id=? and name not like '!_%' escape '!'";
        boolean bool8 = true;
        localObject7 = new String[bool8];
        int i8 = 0;
        localObject8 = null;
        localObject7[0] = localObject4;
        l4 = 0L;
        l3 = ((cg)localObject3).a((String)localObject5, (String[])localObject7, l4);
        cf.G();
        l4 = 500L;
        bool1 = l3 < l4;
        if (bool1) {
          break;
        }
        localObject3 = e();
        localObject3 = a;
        localObject5 = "Too many event names used, ignoring event. appId, name, supported count";
        localObject4 = cu.a((String)localObject4);
        localObject6 = b;
        int i7 = cf.G();
        localObject7 = Integer.valueOf(i7);
        ((cu.a)localObject3).a((String)localObject5, localObject4, localObject6, localObject7);
        localObject3 = i();
        i5 = 8;
        boolean bool5 = false;
        localObject5 = null;
        int i4 = 0;
        localObject6 = null;
        i7 = 0;
        localObject7 = null;
        ((dr)localObject3).a(i5, null, null, 0);
        localObject3 = j();
        ((cg)localObject3).z();
      }
    }
    Object localObject8 = new com/google/android/gms/b/ck;
    String str2 = b;
    long l5 = 0L;
    long l6 = 0L;
    long l7 = d;
    ((ck)localObject8).<init>((String)localObject4, str2, l5, l6, l7);
    for (;;)
    {
      localObject3 = j();
      ((cg)localObject3).a((ck)localObject8);
      a((cj)localObject6, paramca);
      localObject3 = j();
      ((cg)localObject3).y();
      localObject3 = e();
      i5 = 2;
      bool1 = ((cu)localObject3).a(i5);
      if (bool1)
      {
        localObject3 = e();
        localObject3 = g;
        localObject4 = "Event recorded";
        ((cu.a)localObject3).a((String)localObject4, localObject6);
      }
      j().z();
      u();
      localObject3 = eg;
      localObject4 = "Background event processing time, ms";
      l2 = System.nanoTime() - l1 + 500000L;
      l3 = 1000000L;
      d2 = 4.940656E-318D;
      l2 /= l3;
      localObject5 = Long.valueOf(l2);
      ((cu.a)localObject3).a((String)localObject4, localObject5);
      break;
      label2479:
      l5 = e;
      localObject4 = new com/google/android/gms/b/cj;
      str1 = c;
      localObject7 = a;
      localObject8 = b;
      l4 = d;
      cl localcl = f;
      localObject5 = this;
      localObject6 = str1;
      ((cj)localObject4).<init>(this, str1, (String)localObject7, (String)localObject8, l4, l5, localcl);
      l2 = d;
      localObject8 = ((ck)localObject3).a(l2);
      localObject6 = localObject4;
    }
  }
  
  static void s()
  {
    cf.W();
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Unexpected call on client side");
    throw localIllegalStateException;
  }
  
  private cw w()
  {
    Object localObject = y;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Network broadcast receiver not created");
      throw ((Throwable)localObject);
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
    Object localObject1 = cf.T();
    localObject2 = a.getFilesDir();
    localObject3 = new java/io/File;
    ((File)localObject3).<init>((File)localObject2, (String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = new java/io/RandomAccessFile;
        localObject2 = "rw";
        ((RandomAccessFile)localObject1).<init>((File)localObject3, (String)localObject2);
        localObject1 = ((RandomAccessFile)localObject1).getChannel();
        H = ((FileChannel)localObject1);
        localObject1 = H;
        localObject1 = ((FileChannel)localObject1).tryLock();
        G = ((FileLock)localObject1);
        localObject1 = G;
        if (localObject1 != null)
        {
          localObject1 = e();
          localObject1 = g;
          localObject2 = "Storage concurrent access okay";
          ((cu.a)localObject1).a((String)localObject2);
          bool = true;
          return bool;
        }
        localObject1 = e();
        localObject1 = a;
        localObject2 = "Storage concurrent data access panic";
        ((cu.a)localObject1).a((String)localObject2);
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        boolean bool;
        localObject2 = ea;
        localObject3 = "Failed to acquire storage lock";
        ((cu.a)localObject2).a((String)localObject3, localFileNotFoundException);
        continue;
      }
      catch (IOException localIOException)
      {
        localObject2 = ea;
        localObject3 = "Failed to access storage lock file";
        ((cu.a)localObject2).a((String)localObject3, localIOException);
        continue;
      }
      bool = false;
      localObject1 = null;
    }
  }
  
  private long z()
  {
    long l1 = 60;
    long l2 = i.a();
    long l3 = d().A();
    return (l2 + l3) / 1000L / l1 / l1 / 24;
  }
  
  public final String a(String paramString)
  {
    Object localObject1 = f();
    localObject3 = new com/google/android/gms/b/dc$2;
    ((dc.2)localObject3).<init>(this, paramString);
    localObject1 = ((db)localObject1).a((Callable)localObject3);
    long l1 = 30000L;
    try
    {
      localObject3 = TimeUnit.MILLISECONDS;
      localObject1 = ((Future)localObject1).get(l1, (TimeUnit)localObject3);
      localObject1 = (String)localObject1;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localObject3 = ea;
        String str = "Failed to get app instance id. appId";
        Object localObject4 = cu.a(paramString);
        ((cu.a)localObject3).a(str, localObject4, localInterruptedException);
        Object localObject2 = null;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;) {}
    }
    return (String)localObject1;
  }
  
  final void a()
  {
    boolean bool = C;
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("AppMeasurement is not initialized");
      throw localIllegalStateException;
    }
  }
  
  /* Error */
  protected final void a(int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: invokevirtual 343	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   10: astore 6
    //   12: aload 6
    //   14: invokevirtual 345	com/google/android/gms/b/db:e	()V
    //   17: aload_0
    //   18: invokevirtual 347	com/google/android/gms/b/dc:a	()V
    //   21: aload_3
    //   22: ifnonnull +7 -> 29
    //   25: iconst_0
    //   26: newarray <illegal type>
    //   28: astore_3
    //   29: aload_0
    //   30: getfield 1254	com/google/android/gms/b/dc:I	Ljava/util/List;
    //   33: astore 6
    //   35: aconst_null
    //   36: astore 7
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield 1254	com/google/android/gms/b/dc:I	Ljava/util/List;
    //   43: sipush 200
    //   46: istore 8
    //   48: iload_1
    //   49: iload 8
    //   51: if_icmpeq +14 -> 65
    //   54: sipush 204
    //   57: istore 8
    //   59: iload_1
    //   60: iload 8
    //   62: if_icmpne +359 -> 421
    //   65: aload_2
    //   66: ifnonnull +355 -> 421
    //   69: aload_0
    //   70: invokevirtual 522	com/google/android/gms/b/dc:d	()Lcom/google/android/gms/b/cy;
    //   73: astore 5
    //   75: aload 5
    //   77: getfield 1258	com/google/android/gms/b/cy:c	Lcom/google/android/gms/b/cy$b;
    //   80: astore 5
    //   82: aload_0
    //   83: getfield 92	com/google/android/gms/b/dc:i	Lcom/google/android/gms/common/util/c;
    //   86: astore 7
    //   88: aload 7
    //   90: invokeinterface 97 1 0
    //   95: lstore 9
    //   97: aload 5
    //   99: lload 9
    //   101: invokevirtual 1261	com/google/android/gms/b/cy$b:a	(J)V
    //   104: aload_0
    //   105: invokevirtual 522	com/google/android/gms/b/dc:d	()Lcom/google/android/gms/b/cy;
    //   108: astore 5
    //   110: aload 5
    //   112: getfield 1263	com/google/android/gms/b/cy:d	Lcom/google/android/gms/b/cy$b;
    //   115: astore 5
    //   117: lconst_0
    //   118: lstore 9
    //   120: aload 5
    //   122: lload 9
    //   124: invokevirtual 1261	com/google/android/gms/b/cy$b:a	(J)V
    //   127: aload_0
    //   128: invokevirtual 1151	com/google/android/gms/b/dc:u	()V
    //   131: aload_0
    //   132: invokevirtual 123	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   135: astore 5
    //   137: aload 5
    //   139: getfield 428	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
    //   142: astore 5
    //   144: ldc_w 1265
    //   147: astore 7
    //   149: iload_1
    //   150: invokestatic 289	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   153: astore 11
    //   155: aload_3
    //   156: arraylength
    //   157: istore 12
    //   159: iload 12
    //   161: invokestatic 289	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   164: astore 13
    //   166: aload 5
    //   168: aload 7
    //   170: aload 11
    //   172: aload 13
    //   174: invokevirtual 292	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   177: aload_0
    //   178: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   181: astore 5
    //   183: aload 5
    //   185: invokevirtual 750	com/google/android/gms/b/cg:x	()V
    //   188: aload 6
    //   190: invokeinterface 1266 1 0
    //   195: astore 6
    //   197: aload 6
    //   199: invokeinterface 692 1 0
    //   204: istore 4
    //   206: iload 4
    //   208: ifeq +129 -> 337
    //   211: aload 6
    //   213: invokeinterface 696 1 0
    //   218: astore 5
    //   220: aload 5
    //   222: checkcast 133	java/lang/Long
    //   225: astore 5
    //   227: aload_0
    //   228: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   231: astore 7
    //   233: aload 5
    //   235: invokevirtual 859	java/lang/Long:longValue	()J
    //   238: lstore 14
    //   240: aload 7
    //   242: lload 14
    //   244: invokevirtual 1267	com/google/android/gms/b/cg:a	(J)V
    //   247: goto -50 -> 197
    //   250: astore 5
    //   252: aload_0
    //   253: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   256: astore 6
    //   258: aload 6
    //   260: invokevirtual 880	com/google/android/gms/b/cg:z	()V
    //   263: aload 5
    //   265: athrow
    //   266: astore 5
    //   268: aload_0
    //   269: invokevirtual 123	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   272: getfield 282	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   275: ldc_w 1269
    //   278: aload 5
    //   280: invokevirtual 142	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   283: aload_0
    //   284: getfield 92	com/google/android/gms/b/dc:i	Lcom/google/android/gms/common/util/c;
    //   287: invokeinterface 1271 1 0
    //   292: lstore 16
    //   294: aload_0
    //   295: lload 16
    //   297: putfield 702	com/google/android/gms/b/dc:l	J
    //   300: aload_0
    //   301: invokevirtual 123	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   304: getfield 428	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
    //   307: astore 5
    //   309: ldc_w 1273
    //   312: astore 6
    //   314: aload_0
    //   315: getfield 702	com/google/android/gms/b/dc:l	J
    //   318: lstore 9
    //   320: lload 9
    //   322: invokestatic 137	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   325: astore 7
    //   327: aload 5
    //   329: aload 6
    //   331: aload 7
    //   333: invokevirtual 142	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   336: return
    //   337: aload_0
    //   338: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   341: astore 5
    //   343: aload 5
    //   345: invokevirtual 878	com/google/android/gms/b/cg:y	()V
    //   348: aload_0
    //   349: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   352: astore 5
    //   354: aload 5
    //   356: invokevirtual 880	com/google/android/gms/b/cg:z	()V
    //   359: aload_0
    //   360: invokevirtual 452	com/google/android/gms/b/dc:k	()Lcom/google/android/gms/b/cv;
    //   363: astore 5
    //   365: aload 5
    //   367: invokevirtual 1275	com/google/android/gms/b/cv:x	()Z
    //   370: istore 4
    //   372: iload 4
    //   374: ifeq +30 -> 404
    //   377: aload_0
    //   378: invokespecial 1277	com/google/android/gms/b/dc:A	()Z
    //   381: istore 4
    //   383: iload 4
    //   385: ifeq +19 -> 404
    //   388: aload_0
    //   389: invokevirtual 1279	com/google/android/gms/b/dc:t	()V
    //   392: lconst_0
    //   393: lstore 16
    //   395: aload_0
    //   396: lload 16
    //   398: putfield 702	com/google/android/gms/b/dc:l	J
    //   401: goto -65 -> 336
    //   404: iconst_m1
    //   405: i2l
    //   406: lstore 16
    //   408: aload_0
    //   409: lload 16
    //   411: putfield 85	com/google/android/gms/b/dc:J	J
    //   414: aload_0
    //   415: invokevirtual 1151	com/google/android/gms/b/dc:u	()V
    //   418: goto -26 -> 392
    //   421: aload_0
    //   422: invokevirtual 123	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   425: getfield 428	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
    //   428: astore 6
    //   430: iload_1
    //   431: invokestatic 289	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   434: astore 11
    //   436: aload 6
    //   438: ldc_w 1281
    //   441: aload 11
    //   443: aload_2
    //   444: invokevirtual 292	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   447: aload_0
    //   448: invokevirtual 522	com/google/android/gms/b/dc:d	()Lcom/google/android/gms/b/cy;
    //   451: getfield 1263	com/google/android/gms/b/cy:d	Lcom/google/android/gms/b/cy$b;
    //   454: astore 6
    //   456: aload_0
    //   457: getfield 92	com/google/android/gms/b/dc:i	Lcom/google/android/gms/common/util/c;
    //   460: astore 7
    //   462: aload 7
    //   464: invokeinterface 97 1 0
    //   469: lstore 9
    //   471: aload 6
    //   473: lload 9
    //   475: invokevirtual 1261	com/google/android/gms/b/cy$b:a	(J)V
    //   478: sipush 503
    //   481: istore 18
    //   483: iload_1
    //   484: iload 18
    //   486: if_icmpeq +14 -> 500
    //   489: sipush 429
    //   492: istore 18
    //   494: iload_1
    //   495: iload 18
    //   497: if_icmpne +6 -> 503
    //   500: iconst_1
    //   501: istore 4
    //   503: iload 4
    //   505: ifeq +34 -> 539
    //   508: aload_0
    //   509: invokevirtual 522	com/google/android/gms/b/dc:d	()Lcom/google/android/gms/b/cy;
    //   512: getfield 1285	com/google/android/gms/b/cy:e	Lcom/google/android/gms/b/cy$b;
    //   515: astore 5
    //   517: aload_0
    //   518: getfield 92	com/google/android/gms/b/dc:i	Lcom/google/android/gms/common/util/c;
    //   521: astore 6
    //   523: aload 6
    //   525: invokeinterface 97 1 0
    //   530: lstore 9
    //   532: aload 5
    //   534: lload 9
    //   536: invokevirtual 1261	com/google/android/gms/b/cy$b:a	(J)V
    //   539: aload_0
    //   540: invokevirtual 1151	com/google/android/gms/b/dc:u	()V
    //   543: goto -207 -> 336
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	546	0	this	dc
    //   0	546	1	paramInt	int
    //   0	546	2	paramThrowable	Throwable
    //   0	546	3	paramArrayOfByte	byte[]
    //   1	503	4	bool	boolean
    //   4	230	5	localObject1	Object
    //   250	14	5	localObject2	Object
    //   266	13	5	localSQLiteException	android.database.sqlite.SQLiteException
    //   307	226	5	localObject3	Object
    //   10	514	6	localObject4	Object
    //   36	427	7	localObject5	Object
    //   46	17	8	i1	int
    //   95	440	9	l1	long
    //   153	289	11	localInteger1	Integer
    //   157	3	12	i2	int
    //   164	9	13	localInteger2	Integer
    //   238	5	14	l2	long
    //   292	118	16	l3	long
    //   481	17	18	i3	int
    // Exception table:
    //   from	to	target	type
    //   188	195	250	finally
    //   197	204	250	finally
    //   211	218	250	finally
    //   220	225	250	finally
    //   227	231	250	finally
    //   233	238	250	finally
    //   242	247	250	finally
    //   337	341	250	finally
    //   343	348	250	finally
    //   69	73	266	android/database/sqlite/SQLiteException
    //   75	80	266	android/database/sqlite/SQLiteException
    //   82	86	266	android/database/sqlite/SQLiteException
    //   88	95	266	android/database/sqlite/SQLiteException
    //   99	104	266	android/database/sqlite/SQLiteException
    //   104	108	266	android/database/sqlite/SQLiteException
    //   110	115	266	android/database/sqlite/SQLiteException
    //   122	127	266	android/database/sqlite/SQLiteException
    //   127	131	266	android/database/sqlite/SQLiteException
    //   131	135	266	android/database/sqlite/SQLiteException
    //   137	142	266	android/database/sqlite/SQLiteException
    //   149	153	266	android/database/sqlite/SQLiteException
    //   155	157	266	android/database/sqlite/SQLiteException
    //   159	164	266	android/database/sqlite/SQLiteException
    //   172	177	266	android/database/sqlite/SQLiteException
    //   177	181	266	android/database/sqlite/SQLiteException
    //   183	188	266	android/database/sqlite/SQLiteException
    //   252	256	266	android/database/sqlite/SQLiteException
    //   258	263	266	android/database/sqlite/SQLiteException
    //   263	266	266	android/database/sqlite/SQLiteException
    //   348	352	266	android/database/sqlite/SQLiteException
    //   354	359	266	android/database/sqlite/SQLiteException
    //   359	363	266	android/database/sqlite/SQLiteException
    //   365	370	266	android/database/sqlite/SQLiteException
    //   377	381	266	android/database/sqlite/SQLiteException
    //   388	392	266	android/database/sqlite/SQLiteException
    //   396	401	266	android/database/sqlite/SQLiteException
    //   409	414	266	android/database/sqlite/SQLiteException
    //   414	418	266	android/database/sqlite/SQLiteException
  }
  
  public final void a(ca paramca)
  {
    int i1 = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    long l1 = 0L;
    long l2 = 1L;
    f().e();
    a();
    com.google.android.gms.common.internal.c.a(paramca);
    com.google.android.gms.common.internal.c.a(a);
    Object localObject5 = b;
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject5);
    if (bool3) {}
    for (;;)
    {
      return;
      bool3 = h;
      if (bool3) {
        break;
      }
      b(paramca);
    }
    long l3 = m;
    bool3 = l3 < l1;
    if (!bool3)
    {
      localObject5 = i;
      l3 = ((com.google.android.gms.common.util.c)localObject5).a();
    }
    int i3 = n;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    int i5;
    if ((i3 != 0) && (i3 != i1))
    {
      localObject6 = ec;
      localObject7 = "Incorrect app type, assuming installed app. appId, appType";
      localObject8 = cu.a(a);
      localObject5 = Integer.valueOf(i3);
      ((cu.a)localObject6).a((String)localObject7, localObject8, localObject5);
      i5 = 0;
      localObject8 = null;
    }
    for (;;)
    {
      localObject1 = j();
      ((cg)localObject1).x();
      int i4;
      for (;;)
      {
        long l4;
        String str;
        long l6;
        try
        {
          localObject1 = j();
          localObject5 = a;
          localObject1 = ((cg)localObject1).b((String)localObject5);
          if (localObject1 != null)
          {
            localObject5 = ((bz)localObject1).c();
            if (localObject5 != null)
            {
              localObject5 = ((bz)localObject1).c();
              localObject6 = b;
              bool4 = ((String)localObject5).equals(localObject6);
              if (!bool4)
              {
                localObject5 = e();
                localObject5 = c;
                localObject6 = "New GMP App Id passed in. Removing cached database data. appId";
                localObject7 = ((bz)localObject1).a();
                localObject7 = cu.a((String)localObject7);
                ((cu.a)localObject5).a((String)localObject6, localObject7);
                localObject5 = j();
                localObject1 = ((bz)localObject1).a();
                ((cg)localObject5).f((String)localObject1);
                bool1 = false;
                localObject1 = null;
              }
            }
          }
          if (localObject1 != null)
          {
            localObject5 = ((bz)localObject1).h();
            if (localObject5 != null)
            {
              localObject5 = ((bz)localObject1).h();
              localObject6 = c;
              bool4 = ((String)localObject5).equals(localObject6);
              if (!bool4)
              {
                localObject7 = new android/os/Bundle;
                ((Bundle)localObject7).<init>();
                localObject5 = "_pv";
                localObject1 = ((bz)localObject1).h();
                ((Bundle)localObject7).putString((String)localObject5, (String)localObject1);
                localObject1 = new com/google/android/gms/b/cn;
                localObject5 = "_au";
                localObject6 = new com/google/android/gms/b/cl;
                ((cl)localObject6).<init>((Bundle)localObject7);
                localObject7 = "auto";
                ((cn)localObject1).<init>((String)localObject5, (cl)localObject6, (String)localObject7, l3);
                a((cn)localObject1, paramca);
              }
            }
          }
          b(paramca);
          if (i5 == 0)
          {
            localObject1 = j();
            localObject5 = a;
            localObject6 = "_f";
            localObject1 = ((cg)localObject1).a((String)localObject5, (String)localObject6);
            if (localObject1 != null) {
              break label1536;
            }
            l4 = 3600000L;
            l4 = l3 / l4 + l2;
            long l5 = 3600000L;
            l4 *= l5;
            if (i5 != 0) {
              break label1379;
            }
            localObject6 = new com/google/android/gms/b/do;
            localObject7 = "_fot";
            localObject8 = Long.valueOf(l4);
            str = "auto";
            ((do)localObject6).<init>((String)localObject7, l3, localObject8, str);
            a((do)localObject6, paramca);
            localObject1 = f();
            ((db)localObject1).e();
            a();
            localObject1 = j();
            localObject5 = a;
            localObject1 = ((cg)localObject1).b((String)localObject5);
            if (localObject1 != null)
            {
              localObject5 = ((bz)localObject1).c();
              bool4 = TextUtils.isEmpty((CharSequence)localObject5);
              if ((bool4) && (paramca != null))
              {
                localObject5 = b;
                bool4 = TextUtils.isEmpty((CharSequence)localObject5);
                if (!bool4)
                {
                  l5 = 0L;
                  ((bz)localObject1).g(l5);
                  localObject5 = j();
                  ((cg)localObject5).a((bz)localObject1);
                }
              }
            }
            localObject7 = new android/os/Bundle;
            ((Bundle)localObject7).<init>();
            localObject1 = "_c";
            l6 = 1L;
            ((Bundle)localObject7).putLong((String)localObject1, l6);
            localObject1 = "_r";
            l6 = 1L;
            ((Bundle)localObject7).putLong((String)localObject1, l6);
            localObject1 = "_uwa";
            l6 = 0L;
            ((Bundle)localObject7).putLong((String)localObject1, l6);
            localObject1 = "_pfo";
            l6 = 0L;
            ((Bundle)localObject7).putLong((String)localObject1, l6);
            localObject1 = "_sys";
            l6 = 0L;
            ((Bundle)localObject7).putLong((String)localObject1, l6);
            localObject1 = "_sysu";
            l6 = 0L;
            ((Bundle)localObject7).putLong((String)localObject1, l6);
            localObject1 = a;
            localObject1 = ((Context)localObject1).getPackageManager();
            if (localObject1 != null) {
              continue;
            }
            localObject1 = e();
            localObject1 = a;
            localObject5 = "PackageManager is null, first open report might be inaccurate. appId";
            localObject6 = a;
            localObject6 = cu.a((String)localObject6);
            ((cu.a)localObject1).a((String)localObject5, localObject6);
            localObject1 = j();
            localObject5 = a;
            l4 = ((cg)localObject1).g((String)localObject5);
            bool5 = l4 < l1;
            if (!bool5)
            {
              localObject6 = "_pfo";
              ((Bundle)localObject7).putLong((String)localObject6, l4);
            }
            localObject1 = new com/google/android/gms/b/cn;
            localObject5 = "_f";
            localObject6 = new com/google/android/gms/b/cl;
            ((cl)localObject6).<init>((Bundle)localObject7);
            localObject7 = "auto";
            ((cn)localObject1).<init>((String)localObject5, (cl)localObject6, (String)localObject7, l3);
            a((cn)localObject1, paramca);
            localObject7 = new android/os/Bundle;
            ((Bundle)localObject7).<init>();
            localObject1 = "_et";
            l6 = 1L;
            ((Bundle)localObject7).putLong((String)localObject1, l6);
            localObject1 = new com/google/android/gms/b/cn;
            localObject5 = "_e";
            localObject6 = new com/google/android/gms/b/cl;
            ((cl)localObject6).<init>((Bundle)localObject7);
            localObject7 = "auto";
            ((cn)localObject1).<init>((String)localObject5, (cl)localObject6, (String)localObject7, l3);
            a((cn)localObject1, paramca);
            localObject1 = j();
            ((cg)localObject1).y();
            localObject1 = j();
            ((cg)localObject1).z();
            break;
          }
          if (i5 != i1) {
            break label1605;
          }
          localObject1 = j();
          localObject5 = a;
          localObject6 = "_v";
          localObject1 = ((cg)localObject1).a((String)localObject5, (String)localObject6);
          continue;
        }
        finally
        {
          boolean bool4;
          boolean bool5;
          j().z();
        }
        try
        {
          localObject1 = a;
          localObject1 = bc.a((Context)localObject1);
          localObject5 = a;
          bool5 = false;
          localObject6 = null;
          localObject1 = ((bb)localObject1).b((String)localObject5, 0);
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException1)
        {
          localObject5 = e();
          localObject5 = a;
          localObject6 = "Package info is null, first open report might be inaccurate. appId";
          localObject8 = a;
          localObject8 = cu.a((String)localObject8);
          ((cu.a)localObject5).a((String)localObject6, localObject8, localNameNotFoundException1);
          i2 = 0;
          localObject3 = null;
          continue;
        }
        if (localObject1 != null)
        {
          l6 = firstInstallTime;
          bool4 = l6 < l1;
          if (bool4)
          {
            l6 = firstInstallTime;
            l4 = lastUpdateTime;
            bool1 = l6 < l4;
            if (bool1)
            {
              localObject1 = "_uwa";
              l6 = 1L;
              ((Bundle)localObject7).putLong((String)localObject1, l6);
            }
          }
        }
        try
        {
          localObject1 = a;
          localObject1 = bc.a((Context)localObject1);
          localObject5 = a;
          bool5 = false;
          localObject6 = null;
          localObject1 = ((bb)localObject1).a((String)localObject5, 0);
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          Object localObject3;
          localObject5 = e();
          localObject5 = a;
          localObject6 = "Application info is null, first open report might be inaccurate. appId";
          localObject8 = a;
          localObject8 = cu.a((String)localObject8);
          ((cu.a)localObject5).a((String)localObject6, localObject8, localNameNotFoundException2);
          int i2 = 0;
          localObject4 = null;
          continue;
        }
        if (localObject1 != null)
        {
          i4 = flags & 0x1;
          if (i4 != 0)
          {
            localObject5 = "_sys";
            l6 = 1L;
            ((Bundle)localObject7).putLong((String)localObject5, l6);
          }
          i2 = flags & 0x80;
          if (i2 != 0)
          {
            localObject1 = "_sysu";
            l6 = 1L;
            ((Bundle)localObject7).putLong((String)localObject1, l6);
            continue;
            Object localObject4;
            label1379:
            if (i5 == i1)
            {
              localObject6 = new com/google/android/gms/b/do;
              localObject7 = "_fvt";
              localObject8 = Long.valueOf(l4);
              str = "auto";
              ((do)localObject6).<init>((String)localObject7, l3, localObject8, str);
              a((do)localObject6, paramca);
              localObject4 = f();
              ((db)localObject4).e();
              a();
              localObject7 = new android/os/Bundle;
              ((Bundle)localObject7).<init>();
              localObject4 = "_c";
              l6 = 1L;
              ((Bundle)localObject7).putLong((String)localObject4, l6);
              localObject4 = "_r";
              l6 = 1L;
              ((Bundle)localObject7).putLong((String)localObject4, l6);
              localObject4 = new com/google/android/gms/b/cn;
              localObject5 = "_v";
              localObject6 = new com/google/android/gms/b/cl;
              ((cl)localObject6).<init>((Bundle)localObject7);
              localObject7 = "auto";
              ((cn)localObject4).<init>((String)localObject5, (cl)localObject6, (String)localObject7, l3);
              a((cn)localObject4, paramca);
              continue;
              label1536:
              boolean bool2 = i;
              if (bool2)
              {
                localObject7 = new android/os/Bundle;
                ((Bundle)localObject7).<init>();
                localObject4 = new com/google/android/gms/b/cn;
                localObject5 = "_cd";
                localObject6 = new com/google/android/gms/b/cl;
                ((cl)localObject6).<init>((Bundle)localObject7);
                localObject7 = "auto";
                ((cn)localObject4).<init>((String)localObject5, (cl)localObject6, (String)localObject7, l3);
                a((cn)localObject4, paramca);
                continue;
                label1605:
                bool2 = false;
                localObject4 = null;
              }
            }
          }
        }
      }
      i5 = i4;
    }
  }
  
  final void a(cd paramcd)
  {
    Object localObject = b;
    localObject = b((String)localObject);
    if (localObject != null) {
      a(paramcd, (ca)localObject);
    }
  }
  
  final void a(cd paramcd, ca paramca)
  {
    int i1 = 1;
    com.google.android.gms.common.internal.c.a(paramcd);
    com.google.android.gms.common.internal.c.a(b);
    com.google.android.gms.common.internal.c.a(c);
    com.google.android.gms.common.internal.c.a(d);
    com.google.android.gms.common.internal.c.a(d.b);
    f().e();
    a();
    Object localObject1 = b;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool1) {}
    for (;;)
    {
      return;
      bool1 = h;
      if (bool1) {
        break;
      }
      b(paramca);
    }
    cd localcd = new com/google/android/gms/b/cd;
    localcd.<init>(paramcd);
    j().x();
    bool1 = false;
    localObject1 = null;
    for (;;)
    {
      try
      {
        localObject4 = j();
        localObject5 = b;
        localObject6 = d;
        localObject6 = b;
        localObject4 = ((cg)localObject4).d((String)localObject5, (String)localObject6);
        if (localObject4 != null)
        {
          boolean bool2 = f;
          if (bool2)
          {
            localObject5 = c;
            c = ((String)localObject5);
            l1 = e;
            e = l1;
            localObject5 = g;
            g = ((String)localObject5);
            localObject4 = j;
            j = ((cn)localObject4);
            i2 = 0;
            bool1 = f;
            if (bool1)
            {
              Object localObject7 = d;
              localObject1 = new com/google/android/gms/b/dq;
              localObject4 = b;
              localObject5 = c;
              localObject6 = b;
              long l2 = c;
              localObject7 = ((do)localObject7).a();
              ((dq)localObject1).<init>((String)localObject4, (String)localObject5, (String)localObject6, l2, localObject7);
              localObject4 = j();
              bool3 = ((cg)localObject4).a((dq)localObject1);
              if (!bool3) {
                continue;
              }
              localObject4 = e();
              localObject4 = f;
              localObject5 = "User property updated immediately";
              localObject6 = b;
              localObject8 = c;
              localObject1 = e;
              ((cu.a)localObject4).a((String)localObject5, localObject6, localObject8, localObject1);
              if (i2 != 0)
              {
                localObject1 = j;
                if (localObject1 != null)
                {
                  localObject1 = new com/google/android/gms/b/cn;
                  localObject4 = j;
                  l1 = e;
                  ((cn)localObject1).<init>((cn)localObject4, l1);
                  b((cn)localObject1, paramca);
                }
              }
            }
            localObject1 = j();
            bool1 = ((cg)localObject1).a(localcd);
            if (!bool1) {
              break label707;
            }
            localObject1 = e();
            localObject1 = f;
            localObject4 = "Conditional property added";
            localObject5 = b;
            localObject6 = d;
            localObject6 = b;
            localObject8 = d;
            localObject8 = ((do)localObject8).a();
            ((cu.a)localObject1).a((String)localObject4, localObject5, localObject6, localObject8);
            localObject1 = j();
            ((cg)localObject1).y();
            localObject1 = j();
            ((cg)localObject1).z();
            break;
          }
        }
        localObject4 = g;
        boolean bool3 = TextUtils.isEmpty((CharSequence)localObject4);
        if (!bool3) {
          break label783;
        }
        Object localObject9 = d;
        localObject1 = new com/google/android/gms/b/do;
        localObject4 = b;
        long l1 = e;
        localObject8 = ((do)localObject9).a();
        localObject9 = g;
        ((do)localObject1).<init>((String)localObject4, l1, localObject8, (String)localObject9);
        d = ((do)localObject1);
        bool1 = true;
        f = bool1;
        i2 = i1;
        continue;
        localObject4 = e();
        localObject4 = a;
        localObject5 = "(2)Too many active user properties, ignoring";
        localObject6 = b;
        localObject6 = cu.a((String)localObject6);
        localObject8 = c;
        localObject1 = e;
        ((cu.a)localObject4).a((String)localObject5, localObject6, localObject8, localObject1);
        continue;
        localObject3 = e();
      }
      finally
      {
        j().z();
      }
      label707:
      Object localObject3 = a;
      Object localObject4 = "Too many conditional properties, ignoring";
      Object localObject5 = b;
      localObject5 = cu.a((String)localObject5);
      Object localObject6 = d;
      localObject6 = b;
      Object localObject8 = d;
      localObject8 = ((do)localObject8).a();
      ((cu.a)localObject3).a((String)localObject4, localObject5, localObject6, localObject8);
      continue;
      label783:
      int i2 = 0;
    }
  }
  
  final void a(cn paramcn, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramca);
    com.google.android.gms.common.internal.c.a(a);
    Object localObject1 = f();
    ((db)localObject1).e();
    a();
    Object localObject4 = a;
    long l1 = d;
    i();
    boolean bool1 = dr.a(paramcn, paramca);
    if (!bool1) {}
    for (;;)
    {
      return;
      bool1 = h;
      if (!bool1)
      {
        b(paramca);
      }
      else
      {
        localObject1 = j();
        ((cg)localObject1).x();
        Object localObject8;
        try
        {
          localObject1 = j();
          localObject1 = ((cg)localObject1).a((String)localObject4, l1);
          localObject5 = ((List)localObject1).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject5).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = ((Iterator)localObject5).next();
            localObject1 = (cd)localObject1;
            if (localObject1 != null)
            {
              localObject6 = e();
              localObject6 = f;
              localObject7 = "User property timed out";
              localObject8 = b;
              localObject9 = d;
              localObject9 = b;
              localObject10 = d;
              localObject10 = ((do)localObject10).a();
              ((cu.a)localObject6).a((String)localObject7, localObject8, localObject9, localObject10);
              localObject6 = h;
              if (localObject6 != null)
              {
                localObject6 = new com/google/android/gms/b/cn;
                localObject7 = h;
                ((cn)localObject6).<init>((cn)localObject7, l1);
                b((cn)localObject6, paramca);
              }
              localObject6 = j();
              localObject1 = d;
              localObject1 = b;
              ((cg)localObject6).e((String)localObject4, (String)localObject1);
            }
          }
          localObject3 = j();
        }
        finally
        {
          j().z();
        }
        Object localObject3 = ((cg)localObject3).b((String)localObject4, l1);
        Object localObject5 = new java/util/ArrayList;
        int i1 = ((List)localObject3).size();
        ((ArrayList)localObject5).<init>(i1);
        Object localObject6 = ((List)localObject3).iterator();
        Object localObject11;
        for (;;)
        {
          bool1 = ((Iterator)localObject6).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = ((Iterator)localObject6).next();
          localObject3 = (cd)localObject3;
          if (localObject3 != null)
          {
            localObject7 = e();
            localObject7 = f;
            localObject8 = "User property expired";
            localObject9 = b;
            localObject10 = d;
            localObject10 = b;
            localObject11 = d;
            localObject11 = ((do)localObject11).a();
            ((cu.a)localObject7).a((String)localObject8, localObject9, localObject10, localObject11);
            localObject7 = j();
            localObject8 = d;
            localObject8 = b;
            ((cg)localObject7).b((String)localObject4, (String)localObject8);
            localObject7 = l;
            if (localObject7 != null)
            {
              localObject7 = l;
              ((List)localObject5).add(localObject7);
            }
            localObject7 = j();
            localObject3 = d;
            localObject3 = b;
            ((cg)localObject7).e((String)localObject4, (String)localObject3);
          }
        }
        localObject5 = ((List)localObject5).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject5).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = ((Iterator)localObject5).next();
          localObject3 = (cn)localObject3;
          localObject6 = new com/google/android/gms/b/cn;
          ((cn)localObject6).<init>((cn)localObject3, l1);
          b((cn)localObject6, paramca);
        }
        localObject3 = j();
        localObject5 = a;
        localObject3 = ((cg)localObject3).a((String)localObject4, (String)localObject5, l1);
        Object localObject9 = new java/util/ArrayList;
        int i2 = ((List)localObject3).size();
        ((ArrayList)localObject9).<init>(i2);
        Object localObject10 = ((List)localObject3).iterator();
        Object localObject12;
        do
        {
          bool1 = ((Iterator)localObject10).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = ((Iterator)localObject10).next();
          localObject12 = localObject3;
          localObject12 = (cd)localObject3;
          localObject8 = localObject12;
        } while (localObject12 == null);
        Object localObject7 = d;
        localObject3 = new com/google/android/gms/b/dq;
        localObject4 = b;
        localObject5 = c;
        localObject6 = b;
        localObject7 = ((do)localObject7).a();
        ((dq)localObject3).<init>((String)localObject4, (String)localObject5, (String)localObject6, l1, localObject7);
        localObject4 = j();
        boolean bool2 = ((cg)localObject4).a((dq)localObject3);
        if (bool2)
        {
          localObject4 = e();
          localObject4 = f;
          localObject5 = "User property triggered";
          localObject6 = b;
          localObject7 = c;
          localObject11 = e;
          ((cu.a)localObject4).a((String)localObject5, localObject6, localObject7, localObject11);
        }
        for (;;)
        {
          localObject4 = j;
          if (localObject4 != null)
          {
            localObject4 = j;
            ((List)localObject9).add(localObject4);
          }
          localObject4 = new com/google/android/gms/b/do;
          ((do)localObject4).<init>((dq)localObject3);
          d = ((do)localObject4);
          bool1 = true;
          f = bool1;
          localObject3 = j();
          ((cg)localObject3).a((cd)localObject8);
          break;
          localObject4 = e();
          localObject4 = a;
          localObject5 = "Too many active user properties, ignoring";
          localObject6 = b;
          localObject6 = cu.a((String)localObject6);
          localObject7 = c;
          localObject11 = e;
          ((cu.a)localObject4).a((String)localObject5, localObject6, localObject7, localObject11);
        }
        b(paramcn, paramca);
        localObject4 = ((List)localObject9).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject4).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = ((Iterator)localObject4).next();
          localObject3 = (cn)localObject3;
          localObject5 = new com/google/android/gms/b/cn;
          ((cn)localObject5).<init>((cn)localObject3, l1);
          b((cn)localObject5, paramca);
        }
        localObject3 = j();
        ((cg)localObject3).y();
        localObject3 = j();
        ((cg)localObject3).z();
      }
    }
  }
  
  final void a(cn paramcn, String paramString)
  {
    Object localObject1 = j().b(paramString);
    Object localObject2;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject2 = ((bz)localObject1).h();
      bool1 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool1) {}
    }
    else
    {
      localObject1 = ef;
      localObject2 = "No app data available; dropping event";
      ((cu.a)localObject1).a((String)localObject2, paramString);
    }
    for (;;)
    {
      return;
      try
      {
        localObject2 = a;
        localObject2 = bc.a((Context)localObject2);
        str1 = null;
        localObject2 = ((bb)localObject2).b(paramString, 0);
        localObject2 = versionName;
        str1 = ((bz)localObject1).h();
        if (str1 != null)
        {
          str1 = ((bz)localObject1).h();
          bool1 = str1.equals(localObject2);
          if (!bool1)
          {
            localObject2 = e();
            localObject2 = c;
            str1 = "App version does not match; dropping event. appId";
            localObject4 = cu.a(paramString);
            ((cu.a)localObject2).a(str1, localObject4);
          }
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject3 = "_ui";
        String str1 = a;
        bool1 = ((String)localObject3).equals(str1);
        if (!bool1)
        {
          localObject3 = ec;
          str1 = "Could not find package. appId";
          localObject4 = cu.a(paramString);
          ((cu.a)localObject3).a(str1, localObject4);
        }
        localObject3 = new com/google/android/gms/b/ca;
        Object localObject4 = ((bz)localObject1).c();
        String str2 = ((bz)localObject1).h();
        long l1 = ((bz)localObject1).i();
        String str3 = ((bz)localObject1).j();
        long l2 = ((bz)localObject1).k();
        long l3 = ((bz)localObject1).l();
        boolean bool2 = ((bz)localObject1).m();
        String str4 = ((bz)localObject1).e();
        long l4 = ((bz)localObject1).s();
        long l5 = 0L;
        str1 = paramString;
        ((ca)localObject3).<init>(paramString, (String)localObject4, str2, l1, str3, l2, l3, null, bool2, false, str4, l4, l5, 0);
        a(paramcn, (ca)localObject3);
      }
    }
  }
  
  /* Error */
  final void a(do paramdo, ca paramca)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: aload_0
    //   9: invokevirtual 343	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   12: invokevirtual 345	com/google/android/gms/b/db:e	()V
    //   15: aload_0
    //   16: invokevirtual 347	com/google/android/gms/b/dc:a	()V
    //   19: aload_2
    //   20: getfield 513	com/google/android/gms/b/ca:b	Ljava/lang/String;
    //   23: astore 6
    //   25: aload 6
    //   27: invokestatic 363	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   30: istore 7
    //   32: iload 7
    //   34: ifeq +4 -> 38
    //   37: return
    //   38: aload_2
    //   39: getfield 606	com/google/android/gms/b/ca:h	Z
    //   42: istore 7
    //   44: iload 7
    //   46: ifne +11 -> 57
    //   49: aload_0
    //   50: aload_2
    //   51: invokevirtual 957	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   54: goto -17 -> 37
    //   57: aload_0
    //   58: invokevirtual 175	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   61: astore 6
    //   63: aload_1
    //   64: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   67: astore 8
    //   69: aload 6
    //   71: aload 8
    //   73: invokevirtual 1475	com/google/android/gms/b/dr:e	(Ljava/lang/String;)I
    //   76: istore 7
    //   78: iload 7
    //   80: ifeq +80 -> 160
    //   83: aload_0
    //   84: invokevirtual 175	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   87: pop
    //   88: aload_1
    //   89: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   92: astore 8
    //   94: invokestatic 1477	com/google/android/gms/b/cf:z	()I
    //   97: istore 9
    //   99: aload 8
    //   101: iload 9
    //   103: iload_3
    //   104: invokestatic 1480	com/google/android/gms/b/dr:a	(Ljava/lang/String;IZ)Ljava/lang/String;
    //   107: astore 8
    //   109: aload_1
    //   110: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   113: astore 10
    //   115: aload 10
    //   117: ifnull +16 -> 133
    //   120: aload_1
    //   121: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   124: astore 5
    //   126: aload 5
    //   128: invokevirtual 330	java/lang/String:length	()I
    //   131: istore 4
    //   133: aload_0
    //   134: invokevirtual 175	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   137: astore 10
    //   139: ldc_w 783
    //   142: astore 11
    //   144: aload 10
    //   146: iload 7
    //   148: aload 11
    //   150: aload 8
    //   152: iload 4
    //   154: invokevirtual 786	com/google/android/gms/b/dr:a	(ILjava/lang/String;Ljava/lang/String;I)V
    //   157: goto -120 -> 37
    //   160: aload_0
    //   161: invokevirtual 175	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   164: astore 6
    //   166: aload_1
    //   167: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   170: astore 8
    //   172: aload_1
    //   173: invokevirtual 1414	com/google/android/gms/b/do:a	()Ljava/lang/Object;
    //   176: astore 10
    //   178: aload 6
    //   180: aload 8
    //   182: aload 10
    //   184: invokevirtual 1483	com/google/android/gms/b/dr:b	(Ljava/lang/String;Ljava/lang/Object;)I
    //   187: istore 7
    //   189: iload 7
    //   191: ifeq +101 -> 292
    //   194: aload_0
    //   195: invokevirtual 175	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   198: pop
    //   199: aload_1
    //   200: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   203: astore 8
    //   205: invokestatic 1477	com/google/android/gms/b/cf:z	()I
    //   208: istore 9
    //   210: aload 8
    //   212: iload 9
    //   214: iload_3
    //   215: invokestatic 1480	com/google/android/gms/b/dr:a	(Ljava/lang/String;IZ)Ljava/lang/String;
    //   218: astore 8
    //   220: aload_1
    //   221: invokevirtual 1414	com/google/android/gms/b/do:a	()Ljava/lang/Object;
    //   224: astore 10
    //   226: aload 10
    //   228: ifnull +37 -> 265
    //   231: aload 10
    //   233: instanceof 323
    //   236: istore_3
    //   237: iload_3
    //   238: ifne +13 -> 251
    //   241: aload 10
    //   243: instanceof 533
    //   246: istore_3
    //   247: iload_3
    //   248: ifeq +17 -> 265
    //   251: aload 10
    //   253: invokestatic 326	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   256: astore 5
    //   258: aload 5
    //   260: invokevirtual 330	java/lang/String:length	()I
    //   263: istore 4
    //   265: aload_0
    //   266: invokevirtual 175	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   269: astore 10
    //   271: ldc_w 783
    //   274: astore 11
    //   276: aload 10
    //   278: iload 7
    //   280: aload 11
    //   282: aload 8
    //   284: iload 4
    //   286: invokevirtual 786	com/google/android/gms/b/dr:a	(ILjava/lang/String;Ljava/lang/String;I)V
    //   289: goto -252 -> 37
    //   292: aload_0
    //   293: invokevirtual 175	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   296: pop
    //   297: aload_1
    //   298: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   301: astore 5
    //   303: aload_1
    //   304: invokevirtual 1414	com/google/android/gms/b/do:a	()Ljava/lang/Object;
    //   307: astore 6
    //   309: aload 5
    //   311: aload 6
    //   313: invokestatic 1486	com/google/android/gms/b/dr:c	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   316: astore 12
    //   318: aload 12
    //   320: ifnull -283 -> 37
    //   323: new 639	com/google/android/gms/b/dq
    //   326: astore 5
    //   328: aload_2
    //   329: getfield 475	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   332: astore 6
    //   334: aload_1
    //   335: getfield 1427	com/google/android/gms/b/do:g	Ljava/lang/String;
    //   338: astore 8
    //   340: aload_1
    //   341: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   344: astore 10
    //   346: aload_1
    //   347: getfield 1412	com/google/android/gms/b/do:c	J
    //   350: lstore 13
    //   352: aload 5
    //   354: aload 6
    //   356: aload 8
    //   358: aload 10
    //   360: lload 13
    //   362: aload 12
    //   364: invokespecial 1057	com/google/android/gms/b/dq:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   367: aload_0
    //   368: invokevirtual 123	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   371: getfield 182	com/google/android/gms/b/cu:f	Lcom/google/android/gms/b/cu$a;
    //   374: astore 6
    //   376: ldc_w 1488
    //   379: astore 8
    //   381: aload 5
    //   383: getfield 640	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   386: astore 10
    //   388: aload 6
    //   390: aload 8
    //   392: aload 10
    //   394: aload 12
    //   396: invokevirtual 292	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   399: aload_0
    //   400: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   403: astore 6
    //   405: aload 6
    //   407: invokevirtual 750	com/google/android/gms/b/cg:x	()V
    //   410: aload_0
    //   411: aload_2
    //   412: invokevirtual 957	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   415: aload_0
    //   416: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   419: astore 6
    //   421: aload 6
    //   423: aload 5
    //   425: invokevirtual 1060	com/google/android/gms/b/cg:a	(Lcom/google/android/gms/b/dq;)Z
    //   428: istore 7
    //   430: aload_0
    //   431: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   434: astore 8
    //   436: aload 8
    //   438: invokevirtual 878	com/google/android/gms/b/cg:y	()V
    //   441: iload 7
    //   443: ifeq +60 -> 503
    //   446: aload_0
    //   447: invokevirtual 123	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   450: astore 6
    //   452: aload 6
    //   454: getfield 182	com/google/android/gms/b/cu:f	Lcom/google/android/gms/b/cu$a;
    //   457: astore 6
    //   459: ldc_w 1490
    //   462: astore 8
    //   464: aload 5
    //   466: getfield 640	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   469: astore 10
    //   471: aload 5
    //   473: getfield 647	com/google/android/gms/b/dq:e	Ljava/lang/Object;
    //   476: astore 5
    //   478: aload 6
    //   480: aload 8
    //   482: aload 10
    //   484: aload 5
    //   486: invokevirtual 292	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   489: aload_0
    //   490: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   493: astore 5
    //   495: aload 5
    //   497: invokevirtual 880	com/google/android/gms/b/cg:z	()V
    //   500: goto -463 -> 37
    //   503: aload_0
    //   504: invokevirtual 123	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   507: astore 6
    //   509: aload 6
    //   511: getfield 282	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   514: astore 6
    //   516: ldc_w 1492
    //   519: astore 8
    //   521: aload 5
    //   523: getfield 640	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   526: astore 10
    //   528: aload 5
    //   530: getfield 647	com/google/android/gms/b/dq:e	Ljava/lang/Object;
    //   533: astore 5
    //   535: aload 6
    //   537: aload 8
    //   539: aload 10
    //   541: aload 5
    //   543: invokevirtual 292	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   546: aload_0
    //   547: invokevirtual 175	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   550: astore 5
    //   552: bipush 9
    //   554: istore 7
    //   556: aconst_null
    //   557: astore 8
    //   559: iconst_0
    //   560: istore 9
    //   562: aconst_null
    //   563: astore 10
    //   565: iconst_0
    //   566: istore_3
    //   567: aconst_null
    //   568: astore 11
    //   570: aload 5
    //   572: iload 7
    //   574: aconst_null
    //   575: aconst_null
    //   576: iconst_0
    //   577: invokevirtual 786	com/google/android/gms/b/dr:a	(ILjava/lang/String;Ljava/lang/String;I)V
    //   580: goto -91 -> 489
    //   583: astore 5
    //   585: aload_0
    //   586: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   589: invokevirtual 880	com/google/android/gms/b/cg:z	()V
    //   592: aload 5
    //   594: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	595	0	this	dc
    //   0	595	1	paramdo	do
    //   0	595	2	paramca	ca
    //   1	566	3	bool1	boolean
    //   3	282	4	i1	int
    //   6	565	5	localObject1	Object
    //   583	10	5	localObject2	Object
    //   23	513	6	localObject3	Object
    //   30	15	7	bool2	boolean
    //   76	203	7	i2	int
    //   428	14	7	bool3	boolean
    //   554	19	7	i3	int
    //   67	491	8	localObject4	Object
    //   97	464	9	i4	int
    //   113	451	10	localObject5	Object
    //   142	427	11	str	String
    //   316	79	12	localObject6	Object
    //   350	11	13	l1	long
    // Exception table:
    //   from	to	target	type
    //   411	415	583	finally
    //   415	419	583	finally
    //   423	428	583	finally
    //   430	434	583	finally
    //   436	441	583	finally
    //   446	450	583	finally
    //   452	457	583	finally
    //   464	469	583	finally
    //   471	476	583	finally
    //   484	489	583	finally
    //   503	507	583	finally
    //   509	514	583	finally
    //   521	526	583	finally
    //   528	533	583	finally
    //   541	546	583	finally
    //   546	550	583	finally
    //   576	580	583	finally
  }
  
  final void a(String paramString, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map paramMap)
  {
    int i1 = 304;
    int i2 = 1;
    int i3 = 404;
    int i4 = 0;
    Object localObject1 = null;
    boolean bool = false;
    Object localObject2 = null;
    Object localObject5 = f();
    ((db)localObject5).e();
    a();
    com.google.android.gms.common.internal.c.a(paramString);
    if (paramArrayOfByte == null) {
      paramArrayOfByte = new byte[0];
    }
    localObject5 = j();
    ((cg)localObject5).x();
    for (;;)
    {
      try
      {
        localObject5 = j();
        localObject6 = ((cg)localObject5).b(paramString);
        i5 = 200;
        if (paramInt != i5)
        {
          i5 = 204;
          if ((paramInt != i5) && (paramInt != i1)) {}
        }
        else if (paramThrowable == null)
        {
          i5 = i2;
          if (localObject6 != null) {
            continue;
          }
          localObject2 = e();
          localObject2 = c;
          localObject7 = "App does not exist in onConfigFetched. appId";
          localObject1 = cu.a(paramString);
          ((cu.a)localObject2).a((String)localObject7, localObject1);
          localObject2 = j();
          ((cg)localObject2).y();
          localObject2 = j();
          ((cg)localObject2).z();
          return;
        }
        i5 = 0;
        localObject5 = null;
        continue;
        if ((i5 == 0) && (paramInt != i3)) {
          break label572;
        }
        if (paramMap != null)
        {
          localObject2 = "Last-Modified";
          localObject2 = paramMap.get(localObject2);
          localObject2 = (List)localObject2;
          if (localObject2 != null)
          {
            i2 = ((List)localObject2).size();
            if (i2 > 0)
            {
              i2 = 0;
              localObject7 = null;
              localObject2 = ((List)localObject2).get(0);
              localObject2 = (String)localObject2;
              if ((paramInt != i3) && (paramInt != i1)) {
                continue;
              }
              localObject2 = g();
              localObject2 = ((da)localObject2).a(paramString);
              if (localObject2 != null) {
                continue;
              }
              localObject2 = g();
              i2 = 0;
              localObject7 = null;
              i4 = 0;
              localObject1 = null;
              bool = ((da)localObject2).a(paramString, null, null);
              if (bool) {
                continue;
              }
              localObject2 = j();
              ((cg)localObject2).z();
            }
          }
        }
        else
        {
          bool = false;
          localObject2 = null;
          continue;
        }
        bool = false;
        localObject2 = null;
        continue;
        localObject7 = g();
        bool = ((da)localObject7).a(paramString, paramArrayOfByte, (String)localObject2);
        if (!bool)
        {
          localObject2 = j();
          ((cg)localObject2).z();
          continue;
        }
        localObject2 = i;
        long l1 = ((com.google.android.gms.common.util.c)localObject2).a();
        ((bz)localObject6).g(l1);
        localObject2 = j();
        ((cg)localObject2).a((bz)localObject6);
        if (paramInt == i3)
        {
          localObject2 = e();
          localObject2 = d;
          localObject7 = "Config not found. Using empty config. appId";
          ((cu.a)localObject2).a((String)localObject7, paramString);
          localObject2 = k();
          bool = ((cv)localObject2).x();
          if (!bool) {
            break label565;
          }
          bool = A();
          if (!bool) {
            break label565;
          }
          t();
          continue;
        }
        localObject4 = e();
      }
      finally
      {
        j().z();
      }
      Object localObject4 = g;
      Object localObject7 = "Successfully fetched config. Got network response. code, size";
      localObject1 = Integer.valueOf(paramInt);
      int i5 = paramArrayOfByte.length;
      localObject5 = Integer.valueOf(i5);
      ((cu.a)localObject4).a((String)localObject7, localObject1, localObject5);
      continue;
      label565:
      u();
      continue;
      label572:
      localObject1 = i;
      long l2 = ((com.google.android.gms.common.util.c)localObject1).a();
      ((bz)localObject6).h(l2);
      localObject1 = j();
      ((cg)localObject1).a((bz)localObject6);
      localObject1 = e();
      localObject1 = g;
      localObject5 = "Fetching config failed. code, error";
      Object localObject6 = Integer.valueOf(paramInt);
      ((cu.a)localObject1).a((String)localObject5, localObject6, paramThrowable);
      localObject1 = g();
      ((da)localObject1).c(paramString);
      localObject1 = d();
      localObject1 = d;
      localObject5 = i;
      long l3 = ((com.google.android.gms.common.util.c)localObject5).a();
      ((cy.b)localObject1).a(l3);
      i4 = 503;
      if (paramInt != i4)
      {
        i4 = 429;
        if (paramInt != i4) {}
      }
      else
      {
        bool = i2;
      }
      if (bool)
      {
        localObject4 = d();
        localObject4 = e;
        localObject7 = i;
        l2 = ((com.google.android.gms.common.util.c)localObject7).a();
        ((cy.b)localObject4).a(l2);
      }
      u();
    }
  }
  
  final void b(ca paramca)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    f().e();
    a();
    com.google.android.gms.common.internal.c.a(paramca);
    com.google.android.gms.common.internal.c.a(a);
    Object localObject1 = j();
    Object localObject2 = a;
    localObject2 = ((cg)localObject1).b((String)localObject2);
    localObject1 = d();
    String str1 = a;
    str1 = ((cy)localObject1).b(str1);
    boolean bool2 = false;
    float f2 = 0.0F;
    localObject1 = null;
    String str2;
    boolean bool4;
    if (localObject2 == null)
    {
      localObject1 = new com/google/android/gms/b/bz;
      localObject2 = a;
      ((bz)localObject1).<init>(this, (String)localObject2);
      localObject2 = d().y();
      ((bz)localObject1).a((String)localObject2);
      ((bz)localObject1).c(str1);
      localObject2 = localObject1;
      bool2 = bool1;
      f2 = f1;
      str1 = b;
      boolean bool3 = TextUtils.isEmpty(str1);
      if (!bool3)
      {
        str1 = b;
        str2 = ((bz)localObject2).c();
        bool3 = str1.equals(str2);
        if (!bool3)
        {
          localObject1 = b;
          ((bz)localObject2).b((String)localObject1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      str1 = k;
      bool3 = TextUtils.isEmpty(str1);
      if (!bool3)
      {
        str1 = k;
        str2 = ((bz)localObject2).e();
        bool3 = str1.equals(str2);
        if (!bool3)
        {
          localObject1 = k;
          ((bz)localObject2).d((String)localObject1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      long l1 = e;
      long l2 = 0L;
      bool3 = l1 < l2;
      if (bool3)
      {
        l1 = e;
        l2 = ((bz)localObject2).k();
        bool3 = l1 < l2;
        if (bool3)
        {
          l1 = e;
          ((bz)localObject2).d(l1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      str1 = c;
      bool3 = TextUtils.isEmpty(str1);
      if (!bool3)
      {
        str1 = c;
        str2 = ((bz)localObject2).h();
        bool3 = str1.equals(str2);
        if (!bool3)
        {
          localObject1 = c;
          ((bz)localObject2).e((String)localObject1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      l1 = j;
      l2 = ((bz)localObject2).i();
      bool3 = l1 < l2;
      if (bool3)
      {
        l1 = j;
        ((bz)localObject2).c(l1);
        bool2 = bool1;
        f2 = f1;
      }
      str1 = d;
      if (str1 != null)
      {
        str1 = d;
        str2 = ((bz)localObject2).j();
        bool3 = str1.equals(str2);
        if (!bool3)
        {
          localObject1 = d;
          ((bz)localObject2).f((String)localObject1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      l1 = f;
      l2 = ((bz)localObject2).l();
      bool3 = l1 < l2;
      if (bool3)
      {
        l1 = f;
        ((bz)localObject2).e(l1);
        bool2 = bool1;
        f2 = f1;
      }
      bool3 = h;
      bool4 = ((bz)localObject2).m();
      if (bool3 != bool4)
      {
        bool2 = h;
        ((bz)localObject2).a(bool2);
        bool2 = bool1;
        f2 = f1;
      }
      str1 = g;
      bool3 = TextUtils.isEmpty(str1);
      if (!bool3)
      {
        str1 = g;
        str2 = ((bz)localObject2).r();
        bool3 = str1.equals(str2);
        if (!bool3)
        {
          localObject1 = g;
          ((bz)localObject2).g((String)localObject1);
          bool2 = bool1;
          f2 = f1;
        }
      }
      l1 = l;
      l2 = ((bz)localObject2).s();
      bool3 = l1 < l2;
      if (!bool3) {
        break label752;
      }
      l1 = l;
      ((bz)localObject2).i(l1);
    }
    for (;;)
    {
      if (bool1)
      {
        localObject1 = j();
        ((cg)localObject1).a((bz)localObject2);
      }
      return;
      str2 = ((bz)localObject2).d();
      bool4 = str1.equals(str2);
      if (bool4) {
        break;
      }
      ((bz)localObject2).c(str1);
      localObject1 = d().y();
      ((bz)localObject2).a((String)localObject1);
      bool2 = bool1;
      f2 = f1;
      break;
      label752:
      bool1 = bool2;
      f1 = f2;
    }
  }
  
  final void b(cd paramcd)
  {
    Object localObject = b;
    localObject = b((String)localObject);
    if (localObject != null) {
      b(paramcd, (ca)localObject);
    }
  }
  
  /* Error */
  final void b(cd paramcd, ca paramca)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 78	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_1
    //   6: getfield 1386	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   9: invokestatic 472	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_1
    //   14: getfield 1396	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   17: invokestatic 78	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   20: pop
    //   21: aload_1
    //   22: getfield 1396	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   25: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   28: invokestatic 472	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   31: pop
    //   32: aload_0
    //   33: invokevirtual 343	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   36: invokevirtual 345	com/google/android/gms/b/db:e	()V
    //   39: aload_0
    //   40: invokevirtual 347	com/google/android/gms/b/dc:a	()V
    //   43: aload_2
    //   44: getfield 513	com/google/android/gms/b/ca:b	Ljava/lang/String;
    //   47: astore_3
    //   48: aload_3
    //   49: invokestatic 363	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   52: istore 4
    //   54: iload 4
    //   56: ifeq +4 -> 60
    //   59: return
    //   60: aload_2
    //   61: getfield 606	com/google/android/gms/b/ca:h	Z
    //   64: istore 4
    //   66: iload 4
    //   68: ifne +11 -> 79
    //   71: aload_0
    //   72: aload_2
    //   73: invokevirtual 957	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   76: goto -17 -> 59
    //   79: aload_0
    //   80: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   83: astore_3
    //   84: aload_3
    //   85: invokevirtual 750	com/google/android/gms/b/cg:x	()V
    //   88: aload_0
    //   89: aload_2
    //   90: invokevirtual 957	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/ca;)V
    //   93: aload_0
    //   94: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   97: astore_3
    //   98: aload_1
    //   99: getfield 1386	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   102: astore 5
    //   104: aload_1
    //   105: getfield 1396	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   108: astore 6
    //   110: aload 6
    //   112: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   115: astore 6
    //   117: aload_3
    //   118: aload 5
    //   120: aload 6
    //   122: invokevirtual 1403	com/google/android/gms/b/cg:d	(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/cd;
    //   125: astore 7
    //   127: aload 7
    //   129: ifnull +244 -> 373
    //   132: aload_0
    //   133: invokevirtual 123	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   136: astore_3
    //   137: aload_3
    //   138: getfield 182	com/google/android/gms/b/cu:f	Lcom/google/android/gms/b/cu$a;
    //   141: astore_3
    //   142: ldc_w 1523
    //   145: astore 5
    //   147: aload_1
    //   148: getfield 1386	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   151: astore 6
    //   153: aload_1
    //   154: getfield 1396	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   157: astore 8
    //   159: aload 8
    //   161: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   164: astore 8
    //   166: aload_3
    //   167: aload 5
    //   169: aload 6
    //   171: aload 8
    //   173: invokevirtual 292	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   176: aload_0
    //   177: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   180: astore_3
    //   181: aload_1
    //   182: getfield 1386	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   185: astore 5
    //   187: aload_1
    //   188: getfield 1396	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   191: astore 6
    //   193: aload 6
    //   195: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   198: astore 6
    //   200: aload_3
    //   201: aload 5
    //   203: aload 6
    //   205: invokevirtual 1441	com/google/android/gms/b/cg:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   208: pop
    //   209: aload 7
    //   211: getfield 1405	com/google/android/gms/b/cd:f	Z
    //   214: istore 4
    //   216: iload 4
    //   218: ifeq +35 -> 253
    //   221: aload_0
    //   222: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   225: astore_3
    //   226: aload_1
    //   227: getfield 1386	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   230: astore 5
    //   232: aload_1
    //   233: getfield 1396	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   236: astore 6
    //   238: aload 6
    //   240: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   243: astore 6
    //   245: aload_3
    //   246: aload 5
    //   248: aload 6
    //   250: invokevirtual 1452	com/google/android/gms/b/cg:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   253: aload_1
    //   254: getfield 1454	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   257: astore_3
    //   258: aload_3
    //   259: ifnull +93 -> 352
    //   262: aconst_null
    //   263: astore 6
    //   265: aload_1
    //   266: getfield 1454	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   269: astore_3
    //   270: aload_3
    //   271: getfield 989	com/google/android/gms/b/cn:b	Lcom/google/android/gms/b/cl;
    //   274: astore_3
    //   275: aload_3
    //   276: ifnull +19 -> 295
    //   279: aload_1
    //   280: getfield 1454	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   283: astore_3
    //   284: aload_3
    //   285: getfield 989	com/google/android/gms/b/cn:b	Lcom/google/android/gms/b/cl;
    //   288: astore_3
    //   289: aload_3
    //   290: invokevirtual 992	com/google/android/gms/b/cl:a	()Landroid/os/Bundle;
    //   293: astore 6
    //   295: aload_0
    //   296: invokevirtual 175	com/google/android/gms/b/dc:i	()Lcom/google/android/gms/b/dr;
    //   299: astore_3
    //   300: aload_1
    //   301: getfield 1454	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   304: astore 5
    //   306: aload 5
    //   308: getfield 960	com/google/android/gms/b/cn:a	Ljava/lang/String;
    //   311: astore 5
    //   313: aload 7
    //   315: getfield 1393	com/google/android/gms/b/cd:c	Ljava/lang/String;
    //   318: astore 7
    //   320: aload_1
    //   321: getfield 1454	com/google/android/gms/b/cd:l	Lcom/google/android/gms/b/cn;
    //   324: astore 8
    //   326: aload 8
    //   328: getfield 1115	com/google/android/gms/b/cn:d	J
    //   331: lstore 9
    //   333: aload_3
    //   334: aload 5
    //   336: aload 6
    //   338: aload 7
    //   340: lload 9
    //   342: invokevirtual 1526	com/google/android/gms/b/dr:a	(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;J)Lcom/google/android/gms/b/cn;
    //   345: astore_3
    //   346: aload_0
    //   347: aload_3
    //   348: aload_2
    //   349: invokespecial 1421	com/google/android/gms/b/dc:b	(Lcom/google/android/gms/b/cn;Lcom/google/android/gms/b/ca;)V
    //   352: aload_0
    //   353: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   356: astore_3
    //   357: aload_3
    //   358: invokevirtual 878	com/google/android/gms/b/cg:y	()V
    //   361: aload_0
    //   362: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   365: astore_3
    //   366: aload_3
    //   367: invokevirtual 880	com/google/android/gms/b/cg:z	()V
    //   370: goto -311 -> 59
    //   373: aload_0
    //   374: invokevirtual 123	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   377: astore_3
    //   378: aload_3
    //   379: getfield 338	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   382: astore_3
    //   383: ldc_w 1528
    //   386: astore 5
    //   388: aload_1
    //   389: getfield 1386	com/google/android/gms/b/cd:b	Ljava/lang/String;
    //   392: astore 6
    //   394: aload 6
    //   396: invokestatic 463	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   399: astore 6
    //   401: aload_1
    //   402: getfield 1396	com/google/android/gms/b/cd:d	Lcom/google/android/gms/b/do;
    //   405: astore 7
    //   407: aload 7
    //   409: getfield 1397	com/google/android/gms/b/do:b	Ljava/lang/String;
    //   412: astore 7
    //   414: aload_3
    //   415: aload 5
    //   417: aload 6
    //   419: aload 7
    //   421: invokevirtual 292	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   424: goto -72 -> 352
    //   427: astore_3
    //   428: aload_0
    //   429: invokevirtual 350	com/google/android/gms/b/dc:j	()Lcom/google/android/gms/b/cg;
    //   432: invokevirtual 880	com/google/android/gms/b/cg:z	()V
    //   435: aload_3
    //   436: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	437	0	this	dc
    //   0	437	1	paramcd	cd
    //   0	437	2	paramca	ca
    //   47	368	3	localObject1	Object
    //   427	9	3	localObject2	Object
    //   52	165	4	bool	boolean
    //   102	314	5	localObject3	Object
    //   108	310	6	localObject4	Object
    //   125	295	7	localObject5	Object
    //   157	170	8	localObject6	Object
    //   331	10	9	l1	long
    // Exception table:
    //   from	to	target	type
    //   89	93	427	finally
    //   93	97	427	finally
    //   98	102	427	finally
    //   104	108	427	finally
    //   110	115	427	finally
    //   120	125	427	finally
    //   132	136	427	finally
    //   137	141	427	finally
    //   147	151	427	finally
    //   153	157	427	finally
    //   159	164	427	finally
    //   171	176	427	finally
    //   176	180	427	finally
    //   181	185	427	finally
    //   187	191	427	finally
    //   193	198	427	finally
    //   203	209	427	finally
    //   209	214	427	finally
    //   221	225	427	finally
    //   226	230	427	finally
    //   232	236	427	finally
    //   238	243	427	finally
    //   248	253	427	finally
    //   253	257	427	finally
    //   265	269	427	finally
    //   270	274	427	finally
    //   279	283	427	finally
    //   284	288	427	finally
    //   289	293	427	finally
    //   295	299	427	finally
    //   300	304	427	finally
    //   306	311	427	finally
    //   313	318	427	finally
    //   320	324	427	finally
    //   326	331	427	finally
    //   340	345	427	finally
    //   348	352	427	finally
    //   352	356	427	finally
    //   357	361	427	finally
    //   373	377	427	finally
    //   378	382	427	finally
    //   388	392	427	finally
    //   394	399	427	finally
    //   401	405	427	finally
    //   407	412	427	finally
    //   419	424	427	finally
  }
  
  protected final boolean b()
  {
    a();
    f().e();
    Object localObject = E;
    if (localObject != null)
    {
      l1 = F;
      long l2 = 0L;
      bool = l1 < l2;
      if (bool)
      {
        localObject = E;
        if (localObject == null) {
          break label285;
        }
        localObject = E;
        bool = ((Boolean)localObject).booleanValue();
        if (bool) {
          break label285;
        }
        localObject = i;
        l1 = ((com.google.android.gms.common.util.c)localObject).b();
        l2 = F;
        l1 = Math.abs(l1 - l2);
        l2 = 1000L;
        bool = l1 < l2;
        if (!bool) {
          break label285;
        }
      }
    }
    long l1 = i.b();
    F = l1;
    cf.W();
    localObject = i();
    String str = "android.permission.INTERNET";
    boolean bool = ((dr)localObject).h(str);
    if (bool)
    {
      localObject = i();
      str = "android.permission.ACCESS_NETWORK_STATE";
      bool = ((dr)localObject).h(str);
      if (bool)
      {
        localObject = bc.a(a);
        bool = ((bb)localObject).a();
        if (!bool)
        {
          localObject = a;
          bool = cz.a((Context)localObject);
          if (bool)
          {
            localObject = a;
            bool = dk.a((Context)localObject);
            if (!bool) {}
          }
        }
        else
        {
          bool = true;
        }
      }
    }
    for (;;)
    {
      localObject = Boolean.valueOf(bool);
      E = ((Boolean)localObject);
      localObject = E;
      bool = ((Boolean)localObject).booleanValue();
      if (bool)
      {
        localObject = i();
        str = o().y();
        bool = ((dr)localObject).f(str);
        localObject = Boolean.valueOf(bool);
        E = ((Boolean)localObject);
      }
      label285:
      return E.booleanValue();
      bool = false;
      localObject = null;
    }
  }
  
  public final byte[] b(cn paramcn, String paramString)
  {
    a();
    f().e();
    s();
    com.google.android.gms.common.internal.c.a(paramcn);
    com.google.android.gms.common.internal.c.a(paramString);
    du.d locald = new com/google/android/gms/b/du$d;
    locald.<init>();
    Object localObject1 = j();
    ((cg)localObject1).x();
    bz localbz;
    du.e locale;
    int i6;
    Object localObject7;
    long l2;
    Object localObject8;
    try
    {
      localObject1 = j();
      localbz = ((cg)localObject1).b(paramString);
      if (localbz == null)
      {
        localObject1 = e();
        localObject1 = f;
        localObject5 = "Log and bundle not available. package_name";
        ((cu.a)localObject1).a((String)localObject5, paramString);
        i1 = 0;
        localObject1 = null;
        localObject1 = new byte[0];
        localObject5 = j();
        ((cg)localObject5).z();
      }
      for (;;)
      {
        return (byte[])localObject1;
        i1 = localbz.m();
        if (i1 != 0) {
          break;
        }
        localObject1 = e();
        localObject1 = f;
        localObject5 = "Log and bundle disabled. package_name";
        ((cu.a)localObject1).a((String)localObject5, paramString);
        i1 = 0;
        localObject1 = null;
        localObject1 = new byte[0];
        localObject5 = j();
        ((cg)localObject5).z();
      }
      locale = new com/google/android/gms/b/du$e;
      locale.<init>();
      int i1 = 1;
      localObject1 = new du.e[i1];
      i6 = 0;
      localObject5 = null;
      localObject1[0] = locale;
      a = ((du.e[])localObject1);
      i1 = 1;
      localObject1 = Integer.valueOf(i1);
      a = ((Integer)localObject1);
      localObject1 = "android";
      i = ((String)localObject1);
      localObject1 = localbz.a();
      o = ((String)localObject1);
      localObject1 = localbz.j();
      n = ((String)localObject1);
      localObject1 = localbz.h();
      p = ((String)localObject1);
      l1 = localbz.i();
      int i2 = (int)l1;
      localObject1 = Integer.valueOf(i2);
      C = ((Integer)localObject1);
      l1 = localbz.k();
      localObject1 = Long.valueOf(l1);
      q = ((Long)localObject1);
      localObject1 = localbz.c();
      y = ((String)localObject1);
      l1 = localbz.l();
      localObject1 = Long.valueOf(l1);
      v = ((Long)localObject1);
      localObject1 = d();
      localObject5 = localbz.a();
      localObject5 = ((cy)localObject1).a((String)localObject5);
      localObject1 = first;
      localObject1 = (CharSequence)localObject1;
      boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool1)
      {
        localObject1 = first;
        localObject1 = (String)localObject1;
        s = ((String)localObject1);
        localObject1 = second;
        localObject1 = (Boolean)localObject1;
        t = ((Boolean)localObject1);
      }
      localObject1 = n();
      localObject1 = ((ci)localObject1).x();
      k = ((String)localObject1);
      localObject1 = n();
      localObject1 = ((ci)localObject1).y();
      j = ((String)localObject1);
      localObject1 = n();
      l1 = ((ci)localObject1).z();
      int i3 = (int)l1;
      localObject1 = Integer.valueOf(i3);
      m = ((Integer)localObject1);
      localObject1 = n();
      localObject1 = ((ci)localObject1).A();
      l = ((String)localObject1);
      localObject1 = localbz.b();
      u = ((String)localObject1);
      localObject1 = localbz.e();
      B = ((String)localObject1);
      localObject1 = j();
      localObject5 = localbz.a();
      localObject6 = ((cg)localObject1).a((String)localObject5);
      i3 = ((List)localObject6).size();
      localObject1 = new du.g[i3];
      c = ((du.g[])localObject1);
      i3 = 0;
      localObject1 = null;
      i6 = 0;
      localObject5 = null;
      for (;;)
      {
        i3 = ((List)localObject6).size();
        if (i6 >= i3) {
          break;
        }
        localObject7 = new com/google/android/gms/b/du$g;
        ((du.g)localObject7).<init>();
        localObject1 = c;
        localObject1[i6] = localObject7;
        localObject1 = ((List)localObject6).get(i6);
        localObject1 = (dq)localObject1;
        localObject1 = c;
        b = ((String)localObject1);
        localObject1 = ((List)localObject6).get(i6);
        localObject1 = (dq)localObject1;
        l2 = d;
        localObject1 = Long.valueOf(l2);
        a = ((Long)localObject1);
        localObject8 = i();
        localObject1 = ((List)localObject6).get(i6);
        localObject1 = (dq)localObject1;
        localObject1 = e;
        ((dr)localObject8).a((du.g)localObject7, localObject1);
        i3 = i6 + 1;
        i6 = i3;
      }
      localObject1 = b;
      Bundle localBundle = ((cl)localObject1).a();
      localObject1 = "_iap";
      localObject5 = a;
      boolean bool2 = ((String)localObject1).equals(localObject5);
      if (bool2)
      {
        localObject1 = "_c";
        l3 = 1L;
        localBundle.putLong((String)localObject1, l3);
        localObject1 = e();
        localObject1 = f;
        localObject5 = "Marking in-app purchase as real-time";
        ((cu.a)localObject1).a((String)localObject5);
        localObject1 = "_r";
        l3 = 1L;
        localBundle.putLong((String)localObject1, l3);
      }
      localObject1 = "_o";
      localObject5 = c;
      localBundle.putString((String)localObject1, (String)localObject5);
      localObject1 = i();
      localObject5 = o;
      bool2 = ((dr)localObject1).j((String)localObject5);
      if (bool2)
      {
        localObject1 = i();
        localObject5 = "_dbg";
        l3 = 1L;
        localObject6 = Long.valueOf(l3);
        ((dr)localObject1).a(localBundle, (String)localObject5, localObject6);
        localObject1 = i();
        localObject5 = "_r";
        l3 = 1L;
        localObject6 = Long.valueOf(l3);
        ((dr)localObject1).a(localBundle, (String)localObject5, localObject6);
      }
      localObject1 = j();
      localObject5 = a;
      localObject1 = ((cg)localObject1).a(paramString, (String)localObject5);
      long l5;
      long l6;
      if (localObject1 == null)
      {
        long l4 = 0L;
        localObject5 = new com/google/android/gms/b/ck;
        localObject7 = a;
        l2 = 1L;
        l5 = 0L;
        l6 = d;
        localObject6 = paramString;
        ((ck)localObject5).<init>(paramString, (String)localObject7, l2, l5, l6);
        localObject1 = j();
        ((cg)localObject1).a((ck)localObject5);
        l6 = l4;
      }
      for (;;)
      {
        localObject5 = new com/google/android/gms/b/cj;
        localObject7 = c;
        Object localObject9 = a;
        l5 = d;
        localObject6 = this;
        localObject8 = paramString;
        ((cj)localObject5).<init>(this, (String)localObject7, paramString, (String)localObject9, l5, l6, localBundle);
        localObject8 = new com/google/android/gms/b/du$b;
        ((du.b)localObject8).<init>();
        bool2 = true;
        localObject1 = new du.b[bool2];
        bool4 = false;
        localObject6 = null;
        localObject1[0] = localObject8;
        b = ((du.b[])localObject1);
        l3 = d;
        localObject1 = Long.valueOf(l3);
        c = ((Long)localObject1);
        localObject1 = b;
        b = ((String)localObject1);
        l3 = e;
        localObject1 = Long.valueOf(l3);
        d = ((Long)localObject1);
        localObject1 = f;
        localObject1 = a;
        int i4 = ((Bundle)localObject1).size();
        localObject1 = new du.c[i4];
        a = ((du.c[])localObject1);
        i4 = 0;
        localObject1 = null;
        localObject6 = f;
        localObject9 = ((cl)localObject6).iterator();
        bool4 = false;
        localObject6 = null;
        for (;;)
        {
          boolean bool3 = ((Iterator)localObject9).hasNext();
          if (!bool3) {
            break;
          }
          localObject1 = ((Iterator)localObject9).next();
          localObject1 = (String)localObject1;
          du.c localc = new com/google/android/gms/b/du$c;
          localc.<init>();
          du.c[] arrayOfc = a;
          int i7 = bool4 + true;
          arrayOfc[bool4] = localc;
          a = ((String)localObject1);
          localObject6 = f;
          localObject1 = ((cl)localObject6).a((String)localObject1);
          localObject6 = i();
          ((dr)localObject6).a(localc, localObject1);
          bool4 = i7;
        }
        l6 = e;
        l3 = d;
        localObject1 = ((ck)localObject1).a(l3);
        localObject1 = ((ck)localObject1).a();
        localObject5 = j();
        ((cg)localObject5).a((ck)localObject1);
      }
      localObject3 = localbz.a();
    }
    finally
    {
      j().z();
    }
    Object localObject5 = c;
    Object localObject6 = b;
    Object localObject3 = a((String)localObject3, (du.g[])localObject5, (du.b[])localObject6);
    A = ((du.a[])localObject3);
    localObject3 = c;
    e = ((Long)localObject3);
    localObject3 = c;
    f = ((Long)localObject3);
    long l1 = localbz.g();
    long l3 = 0L;
    boolean bool4 = l1 < l3;
    if (bool4)
    {
      localObject6 = Long.valueOf(l1);
      label1554:
      h = ((Long)localObject6);
      l3 = localbz.f();
      l2 = 0L;
      boolean bool5 = l3 < l2;
      if (bool5) {
        break label1895;
      }
    }
    for (;;)
    {
      l3 = 0L;
      bool4 = l1 < l3;
      if (bool4) {}
      int i5;
      for (localObject3 = Long.valueOf(l1);; localObject3 = null)
      {
        g = ((Long)localObject3);
        localbz.q();
        l1 = localbz.n();
        i5 = (int)l1;
        localObject3 = Integer.valueOf(i5);
        w = ((Integer)localObject3);
        l1 = cf.V();
        localObject3 = Long.valueOf(l1);
        r = ((Long)localObject3);
        localObject3 = i;
        l1 = ((com.google.android.gms.common.util.c)localObject3).a();
        localObject3 = Long.valueOf(l1);
        d = ((Long)localObject3);
        localObject3 = Boolean.TRUE;
        z = ((Boolean)localObject3);
        localObject3 = e;
        l1 = ((Long)localObject3).longValue();
        localbz.a(l1);
        localObject3 = f;
        l1 = ((Long)localObject3).longValue();
        localbz.b(l1);
        localObject3 = j();
        ((cg)localObject3).a(localbz);
        localObject3 = j();
        ((cg)localObject3).y();
        localObject3 = j();
        ((cg)localObject3).z();
        try
        {
          i5 = locald.f();
          localObject3 = new byte[i5];
          i6 = localObject3.length;
          localObject5 = fu.a((byte[])localObject3, i6);
          locald.a((fu)localObject5);
          ((fu)localObject5).a();
          localObject5 = i();
          localObject3 = ((dr)localObject5).a((byte[])localObject3);
        }
        catch (IOException localIOException)
        {
          localObject5 = ea;
          localObject6 = "Data loss. Failed to bundle and serialize. appId";
          localObject7 = cu.a(paramString);
          ((cu.a)localObject5).a((String)localObject6, localObject7, localIOException);
          i5 = 0;
          Object localObject4 = null;
        }
        bool4 = false;
        localObject6 = null;
        break label1554;
        i5 = 0;
      }
      break;
      label1895:
      l1 = l3;
    }
  }
  
  protected final void c()
  {
    f().e();
    j().B();
    Object localObject1 = dc;
    long l1 = ((cy.b)localObject1).a();
    long l2 = 0L;
    boolean bool = l1 < l2;
    Object localObject2;
    if (!bool)
    {
      localObject1 = dc;
      localObject2 = i;
      l2 = ((com.google.android.gms.common.util.c)localObject2).a();
      ((cy.b)localObject1).a(l2);
    }
    bool = b();
    if (!bool)
    {
      bool = r();
      if (bool)
      {
        localObject1 = i();
        localObject2 = "android.permission.INTERNET";
        bool = ((dr)localObject1).h((String)localObject2);
        if (!bool)
        {
          localObject1 = ea;
          localObject2 = "App is missing INTERNET permission";
          ((cu.a)localObject1).a((String)localObject2);
        }
        localObject1 = i();
        localObject2 = "android.permission.ACCESS_NETWORK_STATE";
        bool = ((dr)localObject1).h((String)localObject2);
        if (!bool)
        {
          localObject1 = ea;
          localObject2 = "App is missing ACCESS_NETWORK_STATE permission";
          ((cu.a)localObject1).a((String)localObject2);
        }
        cf.W();
        localObject1 = bc.a(a);
        bool = ((bb)localObject1).a();
        if (!bool)
        {
          localObject1 = a;
          bool = cz.a((Context)localObject1);
          if (!bool)
          {
            localObject1 = ea;
            localObject2 = "AppMeasurementReceiver not registered/enabled";
            ((cu.a)localObject1).a((String)localObject2);
          }
          localObject1 = a;
          bool = dk.a((Context)localObject1);
          if (!bool)
          {
            localObject1 = ea;
            localObject2 = "AppMeasurementService not registered/enabled";
            ((cu.a)localObject1).a((String)localObject2);
          }
        }
        localObject1 = ea;
        localObject2 = "Uploading is not possible. App measurement disabled";
        ((cu.a)localObject1).a((String)localObject2);
      }
      u();
      return;
    }
    cf.W();
    localObject1 = o().y();
    bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool)
    {
      localObject1 = d().B();
      if (localObject1 != null) {
        break label383;
      }
      localObject1 = d();
      localObject2 = o().y();
      ((cy)localObject1).c((String)localObject2);
    }
    for (;;)
    {
      cf.W();
      localObject1 = o().y();
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool) {
        break;
      }
      localObject1 = h();
      ((dh)localObject1).A();
      break;
      label383:
      localObject2 = o().y();
      bool = ((String)localObject1).equals(localObject2);
      if (!bool)
      {
        ee.a("Rechecking which service to use due to a GMP App Id change");
        d().E();
        u.B();
        u.A();
        localObject1 = d();
        localObject2 = o().y();
        ((cy)localObject1).c((String)localObject2);
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
    boolean bool1 = false;
    f().e();
    a();
    Object localObject = b;
    boolean bool2 = ((cf)localObject).Y();
    if (bool2) {
      return bool1;
    }
    localObject = b;
    String str = "firebase_analytics_collection_enabled";
    localObject = ((cf)localObject).b(str);
    if (localObject != null) {
      bool1 = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      localObject = d();
      bool1 = ((cy)localObject).c(bool1);
      break;
      bool2 = cf.Z();
      if (!bool2) {
        bool1 = true;
      }
    }
  }
  
  public final void t()
  {
    long l1 = 0L;
    long l2 = -1;
    String str1 = null;
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    f().e();
    a();
    cf.W();
    Object localObject2 = d().D();
    if (localObject2 == null)
    {
      localObject2 = ec;
      localObject4 = "Upload data called on the client side before use of service was decided";
      ((cu.a)localObject2).a((String)localObject4);
    }
    label188:
    long l4;
    int i5;
    Object localObject5;
    String str2;
    int i6;
    boolean bool4;
    do
    {
      for (;;)
      {
        return;
        bool3 = ((Boolean)localObject2).booleanValue();
        if (bool3)
        {
          localObject2 = ea;
          localObject4 = "Upload called in the client side when service should be used";
          ((cu.a)localObject2).a((String)localObject4);
        }
        else
        {
          l3 = l;
          bool3 = l3 < l1;
          if (bool3)
          {
            u();
          }
          else
          {
            f().e();
            localObject2 = I;
            if (localObject2 != null) {
              bool3 = bool1;
            }
            for (;;)
            {
              if (!bool3) {
                break label188;
              }
              localObject2 = ec;
              localObject4 = "Uploading requested multiple times";
              ((cu.a)localObject2).a((String)localObject4);
              break;
              bool3 = false;
              localObject2 = null;
            }
            localObject2 = k();
            bool3 = ((cv)localObject2).x();
            if (bool3) {
              break;
            }
            localObject2 = ec;
            localObject4 = "Network not connected, ignoring upload request";
            ((cu.a)localObject2).a((String)localObject4);
            u();
          }
        }
      }
      l4 = i.a();
      long l3 = cf.aj();
      l3 = l4 - l3;
      a(l3);
      localObject2 = dc;
      l3 = ((cy.b)localObject2).a();
      i5 = l3 < l1;
      if (i5 != 0)
      {
        localObject5 = ef;
        localObject6 = "Uploading events. Elapsed time since last upload attempt (ms)";
        l3 = Math.abs(l4 - l3);
        localObject2 = Long.valueOf(l3);
        ((cu.a)localObject5).a((String)localObject6, localObject2);
      }
      localObject2 = j();
      str2 = ((cg)localObject2).A();
      boolean bool3 = TextUtils.isEmpty(str2);
      if (bool3) {
        break;
      }
      l3 = J;
      bool3 = l3 < l2;
      if (!bool3)
      {
        localObject2 = j();
        l3 = ((cg)localObject2).C();
        J = l3;
      }
      localObject2 = b;
      localObject4 = cp.m;
      int i2 = ((cf)localObject2).b(str2, (cp.a)localObject4);
      localObject4 = b;
      localObject5 = cp.n;
      i6 = ((cf)localObject4).b(str2, (cp.a)localObject5);
      i6 = Math.max(0, i6);
      localObject5 = j().a(str2, i2, i6);
      bool4 = ((List)localObject5).isEmpty();
    } while (bool4);
    Object localObject4 = ((List)localObject5).iterator();
    boolean bool8;
    do
    {
      bool4 = ((Iterator)localObject4).hasNext();
      if (!bool4) {
        break;
      }
      localObject2 = (du.e)nextfirst;
      localObject6 = s;
      bool8 = TextUtils.isEmpty((CharSequence)localObject6);
    } while (bool8);
    localObject2 = s;
    for (Object localObject6 = localObject2;; localObject6 = null)
    {
      label555:
      Object localObject7;
      if (localObject6 != null)
      {
        i6 = 0;
        localObject4 = null;
        int i3 = ((List)localObject5).size();
        if (i6 < i3)
        {
          localObject2 = (du.e)getfirst;
          localObject7 = s;
          boolean bool9 = TextUtils.isEmpty((CharSequence)localObject7);
          if (!bool9)
          {
            localObject2 = s;
            boolean bool5 = ((String)localObject2).equals(localObject6);
            if (!bool5) {
              localObject2 = ((List)localObject5).subList(0, i6);
            }
          }
        }
      }
      for (localObject4 = localObject2;; localObject4 = localObject5)
      {
        localObject6 = new com/google/android/gms/b/du$d;
        ((du.d)localObject6).<init>();
        localObject2 = new du.e[((List)localObject4).size()];
        a = ((du.e[])localObject2);
        localObject7 = new java/util/ArrayList;
        int i4 = ((List)localObject4).size();
        ((ArrayList)localObject7).<init>(i4);
        i5 = 0;
        localObject5 = null;
        Object localObject8;
        for (;;)
        {
          localObject2 = a;
          i4 = localObject2.length;
          if (i5 >= i4) {
            break;
          }
          localObject8 = a;
          localObject2 = (du.e)getfirst;
          localObject8[i5] = localObject2;
          localObject2 = (Long)getsecond;
          ((List)localObject7).add(localObject2);
          localObject2 = a[i5];
          long l5 = cf.V();
          localObject8 = Long.valueOf(l5);
          r = ((Long)localObject8);
          localObject2 = a[i5];
          localObject8 = Long.valueOf(l4);
          d = ((Long)localObject8);
          localObject2 = a[i5];
          boolean bool10 = cf.W();
          localObject8 = Boolean.valueOf(bool10);
          z = ((Boolean)localObject8);
          i4 = i5 + 1;
          i5 = i4;
        }
        i4 = i6 + 1;
        i6 = i4;
        break label555;
        localObject2 = e();
        i6 = 2;
        boolean bool6 = ((cu)localObject2).a(i6);
        if (bool6) {}
        Object localObject3;
        for (localObject2 = dr.b((du.d)localObject6);; localObject3 = null)
        {
          localObject4 = i();
          localObject5 = ((dr)localObject4).a((du.d)localObject6);
          str1 = cf.ai();
          for (;;)
          {
            try
            {
              localObject8 = new java/net/URL;
              ((URL)localObject8).<init>(str1);
              bool7 = ((List)localObject7).isEmpty();
              if (!bool7) {
                bool2 = bool1;
              }
              com.google.android.gms.common.internal.c.b(bool2);
              localObject4 = I;
              if (localObject4 == null) {
                break label1196;
              }
              localObject4 = e();
              localObject4 = a;
              localObject1 = "Set uploading progress before finishing the previous upload";
              ((cu.a)localObject4).a((String)localObject1);
              localObject4 = d();
              localObject4 = d;
              ((cy.b)localObject4).a(l4);
              localObject4 = "?";
              localObject1 = a;
              int i1 = localObject1.length;
              if (i1 > 0)
              {
                localObject4 = a;
                i1 = 0;
                localObject1 = null;
                localObject4 = localObject4[0];
                localObject4 = o;
              }
              localObject1 = e();
              localObject1 = g;
              String str3 = "Uploading data. app, uncompressed size, data";
              i7 = localObject5.length;
              localObject6 = Integer.valueOf(i7);
              ((cu.a)localObject1).a(str3, localObject4, localObject6, localObject2);
              localObject2 = k();
              localObject4 = new com/google/android/gms/b/dc$3;
              ((dc.3)localObject4).<init>(this);
              ((cv)localObject2).a(str2, (URL)localObject8, (byte[])localObject5, (cv.a)localObject4);
            }
            catch (MalformedURLException localMalformedURLException)
            {
              localObject3 = ea;
              localObject4 = "Failed to parse upload URL. Not uploading. appId";
              localObject1 = cu.a(str2);
              ((cu.a)localObject3).a((String)localObject4, localObject1, str1);
            }
            break;
            label1196:
            localObject4 = new java/util/ArrayList;
            ((ArrayList)localObject4).<init>((Collection)localObject7);
            I = ((List)localObject4);
          }
          J = l2;
          localObject3 = j();
          long l6 = cf.aj();
          l6 = l4 - l6;
          localObject3 = ((cg)localObject3).b(l6);
          boolean bool7 = TextUtils.isEmpty((CharSequence)localObject3);
          if (bool7) {
            break;
          }
          localObject4 = j();
          localObject3 = ((cg)localObject4).b((String)localObject3);
          if (localObject3 == null) {
            break;
          }
          a((bz)localObject3);
          break;
          bool6 = false;
        }
      }
      int i7 = 0;
    }
  }
  
  final void u()
  {
    Object localObject1 = f();
    ((db)localObject1).e();
    a();
    boolean bool1 = B();
    if (!bool1) {}
    int i1;
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      return;
      l1 = l;
      l2 = 0L;
      bool1 = l1 < l2;
      if (bool1)
      {
        localObject1 = i;
        l1 = ((com.google.android.gms.common.util.c)localObject1).b();
        l3 = l;
        l1 = Math.abs(l1 - l3);
        l1 = 3600000L - l1;
        l2 = 0L;
        i1 = l1 < l2;
        if (i1 > 0)
        {
          localObject2 = eg;
          localObject3 = "Upload has been suspended. Will update scheduling later in approximately ms";
          localObject1 = Long.valueOf(l1);
          ((cu.a)localObject2).a((String)localObject3, localObject1);
          w().a();
          localObject1 = x();
          ((dn)localObject1).x();
        }
        else
        {
          l1 = 0L;
          l = l1;
        }
      }
      else
      {
        bool1 = b();
        if (bool1)
        {
          bool1 = A();
          if (bool1) {
            break;
          }
        }
        w().a();
        localObject1 = x();
        ((dn)localObject1).x();
      }
    }
    long l2 = i.a();
    long l4 = cf.ar();
    localObject1 = j();
    Object localObject4 = "select count(1) > 0 from raw_events where realtime = 1";
    boolean bool3 = false;
    Object localObject5 = null;
    long l1 = ((cg)localObject1).a((String)localObject4, null);
    long l3 = 0L;
    bool1 = l1 < l3;
    label230:
    label272:
    label281:
    boolean bool4;
    if (bool1)
    {
      bool1 = true;
      if (!bool1)
      {
        localObject1 = j();
        localObject4 = "select count(1) > 0 from queue where has_realtime = 1";
        bool3 = false;
        localObject5 = null;
        l1 = ((cg)localObject1).a((String)localObject4, null);
        l3 = 0L;
        bool1 = l1 < l3;
        if (!bool1) {
          break label471;
        }
        bool1 = true;
        if (!bool1) {
          break label478;
        }
      }
      bool1 = true;
      bool3 = bool1;
      if (!bool3) {
        break label498;
      }
      localObject1 = b.au();
      bool4 = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool4) {
        break label491;
      }
      localObject4 = ".none.";
      bool1 = ((String)localObject4).equals(localObject1);
      if (bool1) {
        break label491;
      }
      l1 = cf.an();
    }
    for (;;)
    {
      l5 = dc.a();
      l6 = dd.a();
      cg localcg = j();
      String str1 = "select max(bundle_end_timestamp) from queue";
      long l7 = 0L;
      l8 = localcg.a(str1, null, l7);
      localcg = j();
      String str2 = "select max(timestamp) from raw_events";
      long l9 = 0L;
      l7 = l9;
      long l10 = localcg.a(str2, null, l9);
      l8 = Math.max(l8, l10);
      l10 = 0L;
      boolean bool5 = l8 < l10;
      if (bool5) {
        break label505;
      }
      l1 = 0L;
      label431:
      l2 = 0L;
      i1 = l1 < l2;
      if (i1 != 0) {
        break label723;
      }
      w().a();
      localObject1 = x();
      ((dn)localObject1).x();
      break;
      bool1 = false;
      localObject1 = null;
      break label230;
      label471:
      bool1 = false;
      localObject1 = null;
      break label272;
      label478:
      bool1 = false;
      localObject1 = null;
      bool3 = false;
      localObject5 = null;
      break label281;
      label491:
      l1 = cf.am();
      continue;
      label498:
      l1 = cf.al();
    }
    label505:
    long l8 = Math.abs(l8 - l2);
    l8 = l2 - l8;
    long l5 = Math.abs(l5 - l2);
    l5 = l2 - l5;
    long l6 = Math.abs(l6 - l2);
    l6 = l2 - l6;
    l5 = Math.max(l5, l6);
    l2 = l8 + l4;
    if (bool3)
    {
      l3 = 0L;
      bool3 = l5 < l3;
      if (bool3) {
        l2 = Math.min(l8, l5) + l1;
      }
    }
    localObject5 = i();
    bool3 = ((dr)localObject5).a(l5, l1);
    if (!bool3) {}
    for (l1 += l5;; l1 = l2)
    {
      l2 = 0L;
      i1 = l6 < l2;
      if (i1 == 0) {
        break label431;
      }
      i1 = l6 < l8;
      if (i1 < 0) {
        break label431;
      }
      i1 = 0;
      localObject2 = null;
      boolean bool6;
      for (;;)
      {
        int i3 = cf.at();
        if (i1 >= i3) {
          break label718;
        }
        l3 = 1 << i1;
        l4 = cf.as();
        l3 *= l4;
        l1 += l3;
        bool6 = l1 < l6;
        if (bool6) {
          break;
        }
        int i2;
        i1 += 1;
      }
      label718:
      l1 = 0L;
      break label431;
      label723:
      localObject2 = k();
      boolean bool2 = ((cv)localObject2).x();
      if (!bool2)
      {
        localObject1 = w();
        b.a();
        localObject4 = b.f();
        ((db)localObject4).e();
        bool4 = c;
        if (!bool4)
        {
          localObject4 = b.a;
          localObject2 = new android/content/IntentFilter;
          ((IntentFilter)localObject2).<init>("android.net.conn.CONNECTIVITY_CHANGE");
          ((Context)localObject4).registerReceiver((BroadcastReceiver)localObject1, (IntentFilter)localObject2);
          bool4 = b.k().x();
          d = bool4;
          localObject4 = b.e().g;
          localObject2 = "Registering connectivity change receiver. Network connected";
          bool6 = d;
          localObject3 = Boolean.valueOf(bool6);
          ((cu.a)localObject4).a((String)localObject2, localObject3);
          bool4 = true;
          c = bool4;
        }
        localObject1 = x();
        ((dn)localObject1).x();
        break;
      }
      localObject2 = de;
      l2 = ((cy.b)localObject2).a();
      l3 = cf.ak();
      dr localdr = i();
      boolean bool7 = localdr.a(l2, l3);
      if (!bool7)
      {
        l2 += l3;
        l1 = Math.max(l1, l2);
      }
      w().a();
      localObject2 = i;
      l2 = ((com.google.android.gms.common.util.c)localObject2).a();
      l1 -= l2;
      l2 = 0L;
      bool2 = l1 < l2;
      if (!bool2)
      {
        l1 = cf.ao();
        localObject2 = dc;
        localObject3 = i;
        l3 = ((com.google.android.gms.common.util.c)localObject3).a();
        ((cy.b)localObject2).a(l3);
      }
      localObject2 = eg;
      localObject3 = "Upload scheduled in approximately ms";
      localObject5 = Long.valueOf(l1);
      ((cu.a)localObject2).a((String)localObject3, localObject5);
      localObject2 = x();
      ((dn)localObject2).a(l1);
      break;
    }
  }
  
  final void v()
  {
    Object localObject1 = f();
    ((db)localObject1).e();
    a();
    boolean bool1 = D;
    Object localObject2;
    int i1;
    int i2;
    Object localObject3;
    String str;
    if (!bool1)
    {
      localObject1 = ee;
      localObject2 = "This instance being marked as an uploader";
      ((cu.a)localObject1).a((String)localObject2);
      localObject1 = f();
      ((db)localObject1).e();
      a();
      bool1 = B();
      if (bool1)
      {
        bool1 = y();
        if (bool1)
        {
          localObject1 = H;
          i1 = a((FileChannel)localObject1);
          localObject2 = o();
          i2 = ((cr)localObject2).z();
          localObject3 = f();
          ((db)localObject3).e();
          if (i1 <= i2) {
            break label149;
          }
          localObject3 = ea;
          str = "Panic: can't downgrade version. Previous, current version";
          localObject1 = Integer.valueOf(i1);
          localObject2 = Integer.valueOf(i2);
          ((cu.a)localObject3).a(str, localObject1, localObject2);
        }
      }
    }
    for (;;)
    {
      D = true;
      return;
      label149:
      if (i1 < i2)
      {
        localObject3 = H;
        boolean bool2 = a(i2, (FileChannel)localObject3);
        if (bool2)
        {
          localObject3 = eg;
          str = "Storage version upgraded. Previous, current version";
          localObject1 = Integer.valueOf(i1);
          localObject2 = Integer.valueOf(i2);
          ((cu.a)localObject3).a(str, localObject1, localObject2);
        }
        else
        {
          localObject3 = ea;
          str = "Storage version upgrade failed. Previous, current version";
          localObject1 = Integer.valueOf(i1);
          localObject2 = Integer.valueOf(i2);
          ((cu.a)localObject3).a(str, localObject1, localObject2);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/dc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */