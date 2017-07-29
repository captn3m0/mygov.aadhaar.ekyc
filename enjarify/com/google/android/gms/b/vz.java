package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;

public final class vz
{
  public static final a.g a;
  public static final a.b b;
  public static final a c;
  private final String d;
  private final int e;
  private String f;
  private int g;
  private String h;
  private String i;
  private final boolean j;
  private int k;
  private final wa l;
  private final com.google.android.gms.common.util.c m;
  private vz.d n;
  private final vz.b o;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/a$g;
    ((a.g)localObject).<init>();
    a = (a.g)localObject;
    localObject = new com/google/android/gms/b/vz$1;
    ((vz.1)localObject).<init>();
    b = (a.b)localObject;
    localObject = new com/google/android/gms/common/api/a;
    a.b localb = b;
    a.g localg = a;
    ((a)localObject).<init>("ClearcutLogger.API", localb, localg);
    c = (a)localObject;
  }
  
  public vz(Context paramContext, String paramString)
  {
    this(paramContext, paramString, localwd, localc, localwi);
  }
  
  private vz(Context paramContext, String paramString, wa paramwa, com.google.android.gms.common.util.c paramc, vz.b paramb)
  {
    g = i1;
    k = 0;
    Object localObject = paramContext.getPackageName();
    d = ((String)localObject);
    int i2 = a(paramContext);
    e = i2;
    g = i1;
    f = paramString;
    h = null;
    i = null;
    j = false;
    l = paramwa;
    m = paramc;
    localObject = new com/google/android/gms/b/vz$d;
    ((vz.d)localObject).<init>();
    n = ((vz.d)localObject);
    k = 0;
    o = paramb;
    boolean bool2 = j;
    if (bool2)
    {
      localObject = h;
      if (localObject == null) {
        bool1 = true;
      }
      localObject = "can't be anonymous with an upload account";
      com.google.android.gms.common.internal.c.b(bool1, localObject);
    }
  }
  
  private static int a(Context paramContext)
  {
    int i1 = 0;
    try
    {
      Object localObject = paramContext.getPackageManager();
      str2 = paramContext.getPackageName();
      localObject = ((PackageManager)localObject).getPackageInfo(str2, 0);
      i1 = versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        String str1 = "ClearcutLogger";
        String str2 = "This can't happen.";
        Log.wtf(str1, str2);
      }
    }
    return i1;
  }
}


/* Location:              com/google/android/gms/b/vz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */