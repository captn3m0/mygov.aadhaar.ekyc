package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.purchase.i.1;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

@qi
public final class tj
  implements hh.b, tr.b
{
  private boolean A = false;
  private String B = "";
  private long C = 0L;
  private long D = 0L;
  private long E = 0L;
  private int F = -1;
  public final Object a = new Object();
  public final String b = tt.b();
  public gv c;
  public final HashSet<th> d = new HashSet();
  public final HashMap<String, tm> e = new HashMap();
  Boolean f = null;
  public boolean g = false;
  public boolean h = false;
  final AtomicInteger i = new AtomicInteger(0);
  private final tk j = new tk(b);
  private BigInteger k = BigInteger.ONE;
  private boolean l = false;
  private boolean m = true;
  private int n = 0;
  private boolean o = false;
  private Context p;
  private un q;
  private kg r = null;
  private boolean s = true;
  private boolean t = true;
  private hi u = null;
  private hg v = null;
  private String w;
  private String x;
  private String y;
  private boolean z = false;
  
  private Future a(int paramInt)
  {
    synchronized (a)
    {
      F = paramInt;
      Future localFuture = (Future)new tr.18(p, paramInt).c();
      return localFuture;
    }
  }
  
  private Future b(long paramLong)
  {
    synchronized (a)
    {
      D = paramLong;
      Future localFuture = (Future)new tr.16(p, paramLong).c();
      return localFuture;
    }
  }
  
  public final Bundle a(Context paramContext, tl paramtl, String paramString)
  {
    Bundle localBundle;
    synchronized (a)
    {
      localBundle = new Bundle();
      localBundle.putBundle("app", j.a(paramContext, paramString));
      paramContext = new Bundle();
      paramString = e.keySet().iterator();
      if (paramString.hasNext())
      {
        String str = (String)paramString.next();
        paramContext.putBundle(str, ((tm)e.get(str)).a());
      }
    }
    localBundle.putBundle("slots", paramContext);
    paramContext = new ArrayList();
    paramString = d.iterator();
    while (paramString.hasNext()) {
      paramContext.add(((th)paramString.next()).a());
    }
    localBundle.putParcelableArrayList("ads", paramContext);
    paramtl.a(d);
    d.clear();
    return localBundle;
  }
  
  public final hi a(Context paramContext)
  {
    ??? = ke.W;
    if (!((Boolean)w.q().a((jz)???)).booleanValue()) {
      return null;
    }
    int i1 = Build.VERSION.SDK_INT;
    ??? = ke.ae;
    if (!((Boolean)w.q().a((jz)???)).booleanValue())
    {
      ??? = ke.ac;
      if (!((Boolean)w.q().a((jz)???)).booleanValue()) {
        return null;
      }
    }
    if ((a()) && (b())) {
      return null;
    }
    synchronized (a)
    {
      if ((Looper.getMainLooper() == null) || (paramContext == null)) {
        return null;
      }
      if (v == null) {
        v = new hg();
      }
      if (u == null) {
        u = new hi(v, qg.a(p, q));
      }
      u.a();
      paramContext = u;
      return paramContext;
    }
  }
  
  public final Future a(long paramLong)
  {
    synchronized (a)
    {
      E = paramLong;
      Future localFuture = (Future)new tr.4(p, paramLong).c();
      return localFuture;
    }
  }
  
  public final Future a(Context paramContext, String paramString)
  {
    C = w.k().a();
    Object localObject = a;
    if (paramString != null) {}
    try
    {
      if (!paramString.equals(B))
      {
        B = paramString;
        paramContext = (Future)new tr.14(paramContext, paramString, C).c();
        return paramContext;
      }
      return null;
    }
    finally {}
  }
  
  public final Future a(Context paramContext, boolean paramBoolean)
  {
    synchronized (a)
    {
      if (paramBoolean != m)
      {
        m = paramBoolean;
        paramContext = (Future)new tr.1(paramContext, paramBoolean).c();
        return paramContext;
      }
      return null;
    }
  }
  
  public final Future a(String paramString)
  {
    Object localObject = a;
    if (paramString != null) {}
    try
    {
      if (!paramString.equals(w))
      {
        w = paramString;
        paramString = (Future)new tr.9(p, paramString).c();
        return paramString;
      }
      return null;
    }
    finally {}
  }
  
  @TargetApi(23)
  public final void a(Context paramContext, un paramun)
  {
    int i1 = 1;
    for (;;)
    {
      synchronized (a)
      {
        if (!o)
        {
          p = paramContext.getApplicationContext();
          q = paramun;
          w.h().a(this);
          new tr.2(paramContext, this).c();
          new tr.6(paramContext, this).c();
          new tr.8(paramContext, this).c();
          new tr.10(paramContext, this).c();
          new tr.13(paramContext, this).c();
          new tr.15(paramContext, this).c();
          new tr.17(paramContext, this).c();
          new tr.3(paramContext, this).c();
          new tr.5(paramContext, this).c();
          qg.a(p, q);
          y = w.e().a(paramContext, a);
          if (Build.VERSION.SDK_INT < 23) {
            continue;
          }
          if ((i1 != 0) && (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted())) {
            z = true;
          }
          c = new gv(paramContext.getApplicationContext(), q, w.e().a(paramContext, paramun));
          paramContext = new kf(p, q.a);
        }
        try
        {
          w.l();
          if (a) {
            continue;
          }
          tp.a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
          paramContext = null;
          r = paramContext;
        }
        catch (IllegalArgumentException paramContext)
        {
          tp.c("Cannot initialize CSI reporter.", paramContext);
          continue;
        }
        w.s();
        tt.b(new i.1(p));
        o = true;
        return;
        i1 = 0;
        continue;
        if (d == null) {
          throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
      }
      if (TextUtils.isEmpty(e)) {
        throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
      }
      paramContext = new kg(d, e, b, c);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    synchronized (a)
    {
      m = paramBundle.getBoolean("use_https", m);
      n = paramBundle.getInt("webview_cache_version", n);
      if (paramBundle.containsKey("content_url_opted_out")) {
        b(paramBundle.getBoolean("content_url_opted_out"));
      }
      if (paramBundle.containsKey("content_url_hashes")) {
        w = paramBundle.getString("content_url_hashes");
      }
      A = paramBundle.getBoolean("auto_collect_location", A);
      if (paramBundle.containsKey("content_vertical_opted_out")) {
        c(paramBundle.getBoolean("content_vertical_opted_out"));
      }
      if (paramBundle.containsKey("content_vertical_hashes")) {
        x = paramBundle.getString("content_vertical_hashes");
      }
      if (paramBundle.containsKey("app_settings_json"))
      {
        str = paramBundle.getString("app_settings_json");
        B = str;
        C = paramBundle.getLong("app_settings_last_update_ms", C);
        D = paramBundle.getLong("app_last_background_time_ms", D);
        F = paramBundle.getInt("request_in_session_count", F);
        E = paramBundle.getLong("first_ad_req_time_ms", E);
        return;
      }
      String str = B;
    }
  }
  
  public final void a(th paramth)
  {
    synchronized (a)
    {
      d.add(paramth);
      return;
    }
  }
  
  public final void a(Throwable paramThrowable, String paramString)
  {
    qg.a(p, q).a(paramThrowable, paramString);
  }
  
  public final void a(boolean paramBoolean)
  {
    long l1 = w.k().a();
    if (paramBoolean)
    {
      long l2 = D;
      jz localjz = ke.aL;
      if (l1 - l2 > ((Long)w.q().a(localjz)).longValue())
      {
        j.d = -1;
        return;
      }
      j.d = F;
      return;
    }
    b(l1);
    a(j.d);
  }
  
  public final boolean a()
  {
    synchronized (a)
    {
      boolean bool = s;
      return bool;
    }
  }
  
  public final Future b(Context paramContext, boolean paramBoolean)
  {
    synchronized (a)
    {
      if (paramBoolean != A)
      {
        A = paramBoolean;
        paramContext = (Future)new tr.12(paramContext, paramBoolean).c();
        return paramContext;
      }
      return null;
    }
  }
  
  public final Future b(String paramString)
  {
    Object localObject = a;
    if (paramString != null) {}
    try
    {
      if (!paramString.equals(x))
      {
        x = paramString;
        paramString = (Future)new tr.11(p, paramString).c();
        return paramString;
      }
      return null;
    }
    finally {}
  }
  
  public final void b(boolean paramBoolean)
  {
    synchronized (a)
    {
      if (s != paramBoolean) {
        tr.a(p, paramBoolean);
      }
      s = paramBoolean;
      hi localhi = a(p);
      if ((localhi != null) && (!localhi.isAlive()))
      {
        tp.d("start fetching content...");
        localhi.a();
      }
      return;
    }
  }
  
  public final boolean b()
  {
    synchronized (a)
    {
      boolean bool = t;
      return bool;
    }
  }
  
  public final String c()
  {
    synchronized (a)
    {
      String str = k.toString();
      k = k.add(BigInteger.ONE);
      return str;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    synchronized (a)
    {
      if (t != paramBoolean) {
        tr.a(p, paramBoolean);
      }
      tr.a(p, paramBoolean);
      t = paramBoolean;
      hi localhi = a(p);
      if ((localhi != null) && (!localhi.isAlive()))
      {
        tp.d("start fetching content...");
        localhi.a();
      }
      return;
    }
  }
  
  public final tk d()
  {
    synchronized (a)
    {
      tk localtk = j;
      return localtk;
    }
  }
  
  public final kg e()
  {
    synchronized (a)
    {
      kg localkg = r;
      return localkg;
    }
  }
  
  public final boolean f()
  {
    synchronized (a)
    {
      boolean bool = l;
      l = true;
      return bool;
    }
  }
  
  public final boolean g()
  {
    for (;;)
    {
      synchronized (a)
      {
        if (!m)
        {
          if (!z) {
            break label38;
          }
          break label33;
          return bool;
        }
      }
      label33:
      boolean bool = true;
      continue;
      label38:
      bool = false;
    }
  }
  
  public final String h()
  {
    synchronized (a)
    {
      String str = y;
      return str;
    }
  }
  
  public final String i()
  {
    synchronized (a)
    {
      String str = w;
      return str;
    }
  }
  
  public final String j()
  {
    synchronized (a)
    {
      String str = x;
      return str;
    }
  }
  
  public final Boolean k()
  {
    synchronized (a)
    {
      Boolean localBoolean = f;
      return localBoolean;
    }
  }
  
  public final boolean l()
  {
    synchronized (a)
    {
      boolean bool = A;
      return bool;
    }
  }
  
  public final long m()
  {
    synchronized (a)
    {
      long l1 = D;
      return l1;
    }
  }
  
  public final long n()
  {
    synchronized (a)
    {
      long l1 = E;
      return l1;
    }
  }
  
  public final int o()
  {
    synchronized (a)
    {
      int i1 = F;
      return i1;
    }
  }
  
  public final ti p()
  {
    synchronized (a)
    {
      ti localti = new ti(B, C);
      return localti;
    }
  }
  
  public final Resources q()
  {
    Resources localResources = null;
    if (q.d) {
      localResources = p.getResources();
    }
    for (;;)
    {
      return localResources;
      try
      {
        DynamiteModule localDynamiteModule = DynamiteModule.a(p, DynamiteModule.a, "com.google.android.gms.ads.dynamite");
        if (localDynamiteModule != null)
        {
          localResources = f.getResources();
          return localResources;
        }
      }
      catch (DynamiteModule.a locala)
      {
        tp.c("Cannot load resource from dynamite apk or local jar", locala);
      }
    }
    return null;
  }
  
  public final boolean r()
  {
    synchronized (a)
    {
      boolean bool = g;
      return bool;
    }
  }
  
  public final void s()
  {
    i.incrementAndGet();
  }
}


/* Location:              com/google/android/gms/b/tj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */