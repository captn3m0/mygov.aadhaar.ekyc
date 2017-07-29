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
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;

final class cy
  extends df
{
  static final Pair a;
  public final cy.c b;
  public final cy.b c;
  public final cy.b d;
  public final cy.b e;
  public final cy.b f;
  public final cy.b g;
  String h;
  long i;
  final Object j;
  public final cy.b k;
  public final cy.b l;
  public final cy.a m;
  public final cy.b n;
  public final cy.b o;
  public boolean p;
  private SharedPreferences r;
  private String s;
  private boolean t;
  private long u;
  private SecureRandom v;
  
  static
  {
    Pair localPair = new android/util/Pair;
    Long localLong = Long.valueOf(0L);
    localPair.<init>("", localLong);
    a = localPair;
  }
  
  cy(dc paramdc)
  {
    super(paramdc);
    cy.c localc = new com/google/android/gms/b/cy$c;
    long l2 = cf.ae();
    localc.<init>(this, "health_monitor", l2, (byte)0);
    b = localc;
    Object localObject = new com/google/android/gms/b/cy$b;
    ((cy.b)localObject).<init>(this, "last_upload", l1);
    c = ((cy.b)localObject);
    localObject = new com/google/android/gms/b/cy$b;
    ((cy.b)localObject).<init>(this, "last_upload_attempt", l1);
    d = ((cy.b)localObject);
    localObject = new com/google/android/gms/b/cy$b;
    ((cy.b)localObject).<init>(this, "backoff", l1);
    e = ((cy.b)localObject);
    localObject = new com/google/android/gms/b/cy$b;
    ((cy.b)localObject).<init>(this, "last_delete_stale", l1);
    f = ((cy.b)localObject);
    localObject = new com/google/android/gms/b/cy$b;
    ((cy.b)localObject).<init>(this, "time_before_start", 10000L);
    k = ((cy.b)localObject);
    localObject = new com/google/android/gms/b/cy$b;
    ((cy.b)localObject).<init>(this, "session_timeout", 1800000L);
    l = ((cy.b)localObject);
    localObject = new com/google/android/gms/b/cy$a;
    ((cy.a)localObject).<init>(this, "start_new_session");
    m = ((cy.a)localObject);
    localObject = new com/google/android/gms/b/cy$b;
    ((cy.b)localObject).<init>(this, "last_pause_time", l1);
    n = ((cy.b)localObject);
    localObject = new com/google/android/gms/b/cy$b;
    ((cy.b)localObject).<init>(this, "time_active", l1);
    o = ((cy.b)localObject);
    localObject = new com/google/android/gms/b/cy$b;
    ((cy.b)localObject).<init>(this, "midnight_offset", l1);
    g = ((cy.b)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    j = localObject;
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
    Object localObject = g;
    long l1 = ((cy.b)localObject).a();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = x();
      int i1 = 86400000;
      int i2 = ((SecureRandom)localObject).nextInt(i1) + 1;
      l1 = i2;
      cy.b localb = g;
      localb.a(l1);
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
      Object localObject2 = m();
      long l1 = ((com.google.android.gms.common.util.c)localObject2).b();
      long l2 = i;
      l1 -= l2;
      l1 = Math.abs(l1);
      l2 = 1000L;
      boolean bool = l1 < l2;
      if (bool)
      {
        localObject2 = h;
        return (String)localObject2;
      }
      bool = false;
      localObject2 = null;
    }
  }
  
  final Boolean D()
  {
    e();
    Object localObject = G();
    String str = "use_service";
    boolean bool = ((SharedPreferences)localObject).contains(str);
    if (!bool) {
      bool = false;
    }
    for (localObject = null;; localObject = Boolean.valueOf(bool))
    {
      return (Boolean)localObject;
      localObject = G();
      str = "use_service";
      bool = ((SharedPreferences)localObject).getBoolean(str, false);
    }
  }
  
  final void E()
  {
    boolean bool1 = true;
    e();
    ug.a("Clearing collection preferences.");
    SharedPreferences localSharedPreferences = G();
    Object localObject = "measurement_enabled";
    boolean bool2 = localSharedPreferences.contains((String)localObject);
    if (bool2) {
      bool1 = c(bool1);
    }
    localObject = G().edit();
    ((SharedPreferences.Editor)localObject).clear();
    ((SharedPreferences.Editor)localObject).apply();
    if (bool2) {
      b(bool1);
    }
  }
  
  protected final String F()
  {
    e();
    Object localObject = G();
    SharedPreferences.Editor localEditor = null;
    localObject = ((SharedPreferences)localObject).getString("previous_os_version", null);
    String str1 = j().y();
    boolean bool = TextUtils.isEmpty(str1);
    if (!bool)
    {
      bool = str1.equals(localObject);
      if (!bool)
      {
        localEditor = G().edit();
        String str2 = "previous_os_version";
        localEditor.putString(str2, str1);
        localEditor.apply();
      }
    }
    return (String)localObject;
  }
  
  final Pair a(String paramString)
  {
    e();
    Object localObject1 = m();
    long l1 = ((com.google.android.gms.common.util.c)localObject1).b();
    localObject3 = s;
    long l2;
    boolean bool1;
    if (localObject3 != null)
    {
      l2 = u;
      bool1 = l1 < l2;
      if (bool1)
      {
        localObject1 = new android/util/Pair;
        localObject4 = s;
        bool1 = t;
        localObject3 = Boolean.valueOf(bool1);
        ((Pair)localObject1).<init>(localObject4, localObject3);
      }
    }
    for (;;)
    {
      return (Pair)localObject1;
      localObject3 = w();
      cp.a locala = cp.h;
      l2 = ((cf)localObject3).a(paramString, locala);
      l1 += l2;
      u = l1;
      try
      {
        localObject1 = n();
        localObject1 = a.a((Context)localObject1);
        localObject4 = a;
        s = ((String)localObject4);
        localObject4 = s;
        if (localObject4 == null)
        {
          localObject4 = "";
          s = ((String)localObject4);
        }
        boolean bool2 = b;
        t = bool2;
      }
      finally
      {
        for (;;)
        {
          localObject4 = uf;
          localObject3 = "Unable to get advertising id";
          ((cu.a)localObject4).a((String)localObject3, localObject2);
          String str = "";
          s = str;
        }
      }
      localObject1 = new android/util/Pair;
      localObject4 = s;
      bool1 = t;
      localObject3 = Boolean.valueOf(bool1);
      ((Pair)localObject1).<init>(localObject4, localObject3);
    }
  }
  
  protected final void a()
  {
    boolean bool1 = false;
    Object localObject = n().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
    r = ((SharedPreferences)localObject);
    localObject = r;
    String str = "has_been_opened";
    boolean bool2 = ((SharedPreferences)localObject).getBoolean(str, false);
    p = bool2;
    bool2 = p;
    if (!bool2)
    {
      localObject = r.edit();
      str = "has_been_opened";
      bool1 = true;
      ((SharedPreferences.Editor)localObject).putBoolean(str, bool1);
      ((SharedPreferences.Editor)localObject).apply();
    }
  }
  
  final void a(boolean paramBoolean)
  {
    e();
    Object localObject = ug;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    ((cu.a)localObject).a("Setting useService", localBoolean);
    localObject = G().edit();
    ((SharedPreferences.Editor)localObject).putBoolean("use_service", paramBoolean);
    ((SharedPreferences.Editor)localObject).apply();
  }
  
  final String b(String paramString)
  {
    int i1 = 1;
    e();
    Object localObject = (String)afirst;
    MessageDigest localMessageDigest = dr.g("MD5");
    if (localMessageDigest == null) {}
    Locale localLocale;
    String str;
    Object[] arrayOfObject;
    for (localObject = null;; localObject = String.format(localLocale, str, arrayOfObject))
    {
      return (String)localObject;
      localLocale = Locale.US;
      str = "%032X";
      arrayOfObject = new Object[i1];
      BigInteger localBigInteger = new java/math/BigInteger;
      localObject = ((String)localObject).getBytes();
      localObject = localMessageDigest.digest((byte[])localObject);
      localBigInteger.<init>(i1, (byte[])localObject);
      arrayOfObject[0] = localBigInteger;
    }
  }
  
  final void b(boolean paramBoolean)
  {
    e();
    Object localObject = ug;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    ((cu.a)localObject).a("Setting measurementEnabled", localBoolean);
    localObject = G().edit();
    ((SharedPreferences.Editor)localObject).putBoolean("measurement_enabled", paramBoolean);
    ((SharedPreferences.Editor)localObject).apply();
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
    SecureRandom localSecureRandom = v;
    if (localSecureRandom == null)
    {
      localSecureRandom = new java/security/SecureRandom;
      localSecureRandom.<init>();
      v = localSecureRandom;
    }
    return v;
  }
  
  final String y()
  {
    int i1 = 1;
    byte[] arrayOfByte = new byte[16];
    x().nextBytes(arrayOfByte);
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[i1];
    BigInteger localBigInteger = new java/math/BigInteger;
    localBigInteger.<init>(i1, arrayOfByte);
    arrayOfObject[0] = localBigInteger;
    return String.format(localLocale, "%032x", arrayOfObject);
  }
  
  final String z()
  {
    e();
    try
    {
      localObject1 = new com/google/firebase/iid/c;
      localObject2 = FirebaseInstanceId.a();
      ((com.google.firebase.iid.c)localObject1).<init>((FirebaseInstanceId)localObject2);
      localObject1 = a;
      localObject1 = a;
      localObject1 = ((d)localObject1).a();
      localObject1 = FirebaseInstanceId.a((KeyPair)localObject1);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        Object localObject1;
        cu.a locala = uc;
        Object localObject2 = "Failed to retrieve Firebase Instance Id";
        locala.a((String)localObject2);
        locala = null;
      }
    }
    return (String)localObject1;
  }
}


/* Location:              com/google/android/gms/b/cy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */