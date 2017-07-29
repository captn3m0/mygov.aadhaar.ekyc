package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.c.a.a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;

final class cy
  extends df
{
  static final Pair<String, Long> a = new Pair("", Long.valueOf(0L));
  public final c b = new c("health_monitor", cf.ae(), (byte)0);
  public final b c = new b("last_upload", 0L);
  public final b d = new b("last_upload_attempt", 0L);
  public final b e = new b("backoff", 0L);
  public final b f = new b("last_delete_stale", 0L);
  public final b g = new b("midnight_offset", 0L);
  String h;
  long i;
  final Object j = new Object();
  public final b k = new b("time_before_start", 10000L);
  public final b l = new b("session_timeout", 1800000L);
  public final a m = new a("start_new_session");
  public final b n = new b("last_pause_time", 0L);
  public final b o = new b("time_active", 0L);
  public boolean p;
  private SharedPreferences r;
  private String s;
  private boolean t;
  private long u;
  private SecureRandom v;
  
  cy(dc paramdc)
  {
    super(paramdc);
  }
  
  private SharedPreferences G()
  {
    e();
    J();
    return r;
  }
  
  final long A()
  {
    J();
    e();
    long l2 = g.a();
    long l1 = l2;
    if (l2 == 0L)
    {
      l1 = x().nextInt(86400000) + 1;
      g.a(l1);
    }
    return l1;
  }
  
  final String B()
  {
    e();
    return G().getString("gmp_app_id", null);
  }
  
  final String C()
  {
    synchronized (j)
    {
      if (Math.abs(m().b() - i) < 1000L)
      {
        String str = h;
        return str;
      }
      return null;
    }
  }
  
  final Boolean D()
  {
    e();
    if (!G().contains("use_service")) {
      return null;
    }
    return Boolean.valueOf(G().getBoolean("use_service", false));
  }
  
  final void E()
  {
    boolean bool1 = true;
    e();
    ug.a("Clearing collection preferences.");
    boolean bool2 = G().contains("measurement_enabled");
    if (bool2) {
      bool1 = c(true);
    }
    SharedPreferences.Editor localEditor = G().edit();
    localEditor.clear();
    localEditor.apply();
    if (bool2) {
      b(bool1);
    }
  }
  
  protected final String F()
  {
    e();
    String str1 = G().getString("previous_os_version", null);
    String str2 = j().y();
    if ((!TextUtils.isEmpty(str2)) && (!str2.equals(str1)))
    {
      SharedPreferences.Editor localEditor = G().edit();
      localEditor.putString("previous_os_version", str2);
      localEditor.apply();
    }
    return str1;
  }
  
  final Pair<String, Boolean> a(String paramString)
  {
    e();
    long l1 = m().b();
    if ((s != null) && (l1 < u)) {
      return new Pair(s, Boolean.valueOf(t));
    }
    u = (l1 + w().a(paramString, cp.h));
    try
    {
      paramString = a.a(n());
      s = a;
      if (s == null) {
        s = "";
      }
      t = b;
    }
    catch (Throwable paramString)
    {
      for (;;)
      {
        uf.a("Unable to get advertising id", paramString);
        s = "";
      }
    }
    return new Pair(s, Boolean.valueOf(t));
  }
  
  protected final void a()
  {
    r = n().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
    p = r.getBoolean("has_been_opened", false);
    if (!p)
    {
      SharedPreferences.Editor localEditor = r.edit();
      localEditor.putBoolean("has_been_opened", true);
      localEditor.apply();
    }
  }
  
  final void a(boolean paramBoolean)
  {
    e();
    ug.a("Setting useService", Boolean.valueOf(paramBoolean));
    SharedPreferences.Editor localEditor = G().edit();
    localEditor.putBoolean("use_service", paramBoolean);
    localEditor.apply();
  }
  
  final String b(String paramString)
  {
    e();
    paramString = (String)afirst;
    MessageDigest localMessageDigest = dr.g("MD5");
    if (localMessageDigest == null) {
      return null;
    }
    return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, localMessageDigest.digest(paramString.getBytes())) });
  }
  
  final void b(boolean paramBoolean)
  {
    e();
    ug.a("Setting measurementEnabled", Boolean.valueOf(paramBoolean));
    SharedPreferences.Editor localEditor = G().edit();
    localEditor.putBoolean("measurement_enabled", paramBoolean);
    localEditor.apply();
  }
  
  final void c(String paramString)
  {
    e();
    SharedPreferences.Editor localEditor = G().edit();
    localEditor.putString("gmp_app_id", paramString);
    localEditor.apply();
  }
  
  final boolean c(boolean paramBoolean)
  {
    e();
    return G().getBoolean("measurement_enabled", paramBoolean);
  }
  
  protected final SecureRandom x()
  {
    e();
    if (v == null) {
      v = new SecureRandom();
    }
    return v;
  }
  
  final String y()
  {
    byte[] arrayOfByte = new byte[16];
    x().nextBytes(arrayOfByte);
    return String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, arrayOfByte) });
  }
  
  final String z()
  {
    e();
    try
    {
      String str = FirebaseInstanceId.a(com.google.firebase.iid.caa.a.a());
      return str;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      uc.a("Failed to retrieve Firebase Instance Id");
    }
    return null;
  }
  
  public final class a
  {
    final String a;
    final boolean b;
    boolean c;
    boolean d;
    
    public a(String paramString)
    {
      com.google.android.gms.common.internal.c.a(paramString);
      a = paramString;
      b = true;
    }
    
    public final void a(boolean paramBoolean)
    {
      SharedPreferences.Editor localEditor = cy.a(cy.this).edit();
      localEditor.putBoolean(a, paramBoolean);
      localEditor.apply();
      d = paramBoolean;
    }
  }
  
  public final class b
  {
    private final String b;
    private final long c;
    private boolean d;
    private long e;
    
    public b(String paramString, long paramLong)
    {
      com.google.android.gms.common.internal.c.a(paramString);
      b = paramString;
      c = paramLong;
    }
    
    public final long a()
    {
      if (!d)
      {
        d = true;
        e = cy.a(cy.this).getLong(b, c);
      }
      return e;
    }
    
    public final void a(long paramLong)
    {
      SharedPreferences.Editor localEditor = cy.a(cy.this).edit();
      localEditor.putLong(b, paramLong);
      localEditor.apply();
      e = paramLong;
    }
  }
  
  public final class c
  {
    final String a;
    final String b;
    final String c;
    final long d;
    
    private c(String paramString, long paramLong)
    {
      com.google.android.gms.common.internal.c.a(paramString);
      if (paramLong > 0L) {}
      for (boolean bool = true;; bool = false)
      {
        com.google.android.gms.common.internal.c.b(bool);
        a = String.valueOf(paramString).concat(":start");
        b = String.valueOf(paramString).concat(":count");
        c = String.valueOf(paramString).concat(":value");
        d = paramLong;
        return;
      }
    }
    
    final void a()
    {
      e();
      long l = m().a();
      SharedPreferences.Editor localEditor = cy.a(cy.this).edit();
      localEditor.remove(b);
      localEditor.remove(c);
      localEditor.putLong(a, l);
      localEditor.apply();
    }
    
    public final void a(String paramString)
    {
      e();
      if (b() == 0L) {
        a();
      }
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      long l = cy.a(cy.this).getLong(b, 0L);
      if (l <= 0L)
      {
        paramString = cy.a(cy.this).edit();
        paramString.putString(c, str);
        paramString.putLong(b, 1L);
        paramString.apply();
        return;
      }
      if ((x().nextLong() & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / (l + 1L) * 1L) {}
      for (int i = 1;; i = 0)
      {
        paramString = cy.a(cy.this).edit();
        if (i != 0) {
          paramString.putString(c, str);
        }
        paramString.putLong(b, l + 1L);
        paramString.apply();
        return;
      }
    }
    
    final long b()
    {
      return cy.b(cy.this).getLong(a, 0L);
    }
  }
}


/* Location:              com/google/android/gms/b/cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */