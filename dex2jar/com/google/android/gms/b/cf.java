package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class cf
  extends de
{
  static final String a = String.valueOf(m.b / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
  private Boolean b;
  
  cf(dc paramdc)
  {
    super(paramdc);
  }
  
  static int A()
  {
    return 40;
  }
  
  static int B()
  {
    return 100;
  }
  
  static int C()
  {
    return 256;
  }
  
  static int D()
  {
    return 1000;
  }
  
  public static int E()
  {
    return 36;
  }
  
  public static int F()
  {
    return 2048;
  }
  
  static int G()
  {
    return 500;
  }
  
  public static long H()
  {
    return ((Integer)qa).intValue();
  }
  
  public static long I()
  {
    return ((Integer)sa).intValue();
  }
  
  static int J()
  {
    return 25;
  }
  
  static int K()
  {
    return 1000;
  }
  
  public static int L()
  {
    return 25;
  }
  
  static int M()
  {
    return 1000;
  }
  
  static long N()
  {
    return 15552000000L;
  }
  
  static long O()
  {
    return 15552000000L;
  }
  
  static long P()
  {
    return 3600000L;
  }
  
  static long Q()
  {
    return 60000L;
  }
  
  static long R()
  {
    return 61000L;
  }
  
  static long S()
  {
    return ((Long)Ma).longValue();
  }
  
  public static String T()
  {
    return "google_app_measurement.db";
  }
  
  static String U()
  {
    return "google_app_measurement_local.db";
  }
  
  public static long V()
  {
    return 10260L;
  }
  
  public static boolean W()
  {
    return false;
  }
  
  public static boolean Z()
  {
    return ab.b();
  }
  
  static String a()
  {
    return (String)ga;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    Uri.Builder localBuilder1 = new Uri.Builder();
    Uri.Builder localBuilder2 = localBuilder1.scheme((String)ka).encodedAuthority((String)la);
    paramString1 = String.valueOf(paramString1);
    if (paramString1.length() != 0) {}
    for (paramString1 = "config/app/".concat(paramString1);; paramString1 = new String("config/app/"))
    {
      localBuilder2.path(paramString1).appendQueryParameter("app_instance_id", paramString2).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "10260");
      return localBuilder1.build().toString();
    }
  }
  
  public static long aa()
  {
    return ((Long)Ja).longValue();
  }
  
  public static long ab()
  {
    return ((Long)Ea).longValue();
  }
  
  public static long ac()
  {
    return ((Long)Fa).longValue();
  }
  
  public static long ad()
  {
    return 1000L;
  }
  
  public static long ae()
  {
    return Math.max(0L, ((Long)ia).longValue());
  }
  
  public static int af()
  {
    return Math.max(0, ((Integer)oa).intValue());
  }
  
  public static int ag()
  {
    return Math.max(1, ((Integer)pa).intValue());
  }
  
  public static int ah()
  {
    return 100000;
  }
  
  public static String ai()
  {
    return (String)wa;
  }
  
  public static long aj()
  {
    return ((Long)ja).longValue();
  }
  
  public static long ak()
  {
    return Math.max(0L, ((Long)xa).longValue());
  }
  
  public static long al()
  {
    return Math.max(0L, ((Long)za).longValue());
  }
  
  public static long am()
  {
    return Math.max(0L, ((Long)Aa).longValue());
  }
  
  public static long an()
  {
    return Math.max(0L, ((Long)Ba).longValue());
  }
  
  public static long ao()
  {
    return Math.max(0L, ((Long)Ca).longValue());
  }
  
  public static long ap()
  {
    return Math.max(0L, ((Long)Da).longValue());
  }
  
  public static long aq()
  {
    return ((Long)ya).longValue();
  }
  
  public static long ar()
  {
    return Math.max(0L, ((Long)Ga).longValue());
  }
  
  public static long as()
  {
    return Math.max(0L, ((Long)Ha).longValue());
  }
  
  public static int at()
  {
    return Math.min(20, Math.max(0, ((Integer)Ia).intValue()));
  }
  
  public static int x()
  {
    return 25;
  }
  
  public static int y()
  {
    return 40;
  }
  
  public static int z()
  {
    return 24;
  }
  
  /* Error */
  public final boolean X()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 250	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   4: ifnonnull +84 -> 88
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 250	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   13: ifnonnull +73 -> 86
    //   16: aload_0
    //   17: invokespecial 254	com/google/android/gms/b/de:n	()Landroid/content/Context;
    //   20: invokevirtual 260	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   23: astore_3
    //   24: invokestatic 264	com/google/android/gms/common/util/j:a	()Ljava/lang/String;
    //   27: astore_2
    //   28: aload_3
    //   29: ifnull +30 -> 59
    //   32: aload_3
    //   33: getfield 269	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   36: astore_3
    //   37: aload_3
    //   38: ifnull +58 -> 96
    //   41: aload_3
    //   42: aload_2
    //   43: invokevirtual 273	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   46: ifeq +50 -> 96
    //   49: iconst_1
    //   50: istore_1
    //   51: aload_0
    //   52: iload_1
    //   53: invokestatic 278	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   56: putfield 250	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   59: aload_0
    //   60: getfield 250	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   63: ifnonnull +23 -> 86
    //   66: aload_0
    //   67: getstatic 281	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   70: putfield 250	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   73: aload_0
    //   74: invokespecial 285	com/google/android/gms/b/de:u	()Lcom/google/android/gms/b/cu;
    //   77: getfield 290	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   80: ldc_w 292
    //   83: invokevirtual 296	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_0
    //   89: getfield 250	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   92: invokevirtual 299	java/lang/Boolean:booleanValue	()Z
    //   95: ireturn
    //   96: iconst_0
    //   97: istore_1
    //   98: goto -47 -> 51
    //   101: astore_2
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_2
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	cf
    //   50	48	1	bool	boolean
    //   27	16	2	str	String
    //   101	4	2	localObject1	Object
    //   23	19	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   9	28	101	finally
    //   32	37	101	finally
    //   41	49	101	finally
    //   51	59	101	finally
    //   59	86	101	finally
    //   86	88	101	finally
    //   102	104	101	finally
  }
  
  public final boolean Y()
  {
    Boolean localBoolean = b("firebase_analytics_collection_deactivated");
    return (localBoolean != null) && (localBoolean.booleanValue());
  }
  
  public final int a(String paramString)
  {
    return b(paramString, cp.u);
  }
  
  public final long a(String paramString, cp.a<Long> parama)
  {
    if (paramString == null) {
      return ((Long)a).longValue();
    }
    paramString = super.r().a(paramString, b);
    if (TextUtils.isEmpty(paramString)) {
      return ((Long)a).longValue();
    }
    try
    {
      long l = ((Long)parama.a(Long.valueOf(Long.valueOf(paramString).longValue()))).longValue();
      return l;
    }
    catch (NumberFormatException paramString) {}
    return ((Long)a).longValue();
  }
  
  public final String au()
  {
    try
    {
      String str = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class, String.class }).invoke(null, new Object[] { "debug.firebase.analytics.app", "" });
      return str;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      ua.a("Could not find SystemProperties class", localClassNotFoundException);
      return "";
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        ua.a("Could not find SystemProperties.get() method", localNoSuchMethodException);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        ua.a("Could not access SystemProperties.get()", localIllegalAccessException);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        ua.a("SystemProperties.get() threw an exception", localInvocationTargetException);
      }
    }
  }
  
  public final int b(String paramString, cp.a<Integer> parama)
  {
    if (paramString == null) {
      return ((Integer)a).intValue();
    }
    paramString = super.r().a(paramString, b);
    if (TextUtils.isEmpty(paramString)) {
      return ((Integer)a).intValue();
    }
    try
    {
      int i = ((Integer)parama.a(Integer.valueOf(Integer.valueOf(paramString).intValue()))).intValue();
      return i;
    }
    catch (NumberFormatException paramString) {}
    return ((Integer)a).intValue();
  }
  
  final Boolean b(String paramString)
  {
    Boolean localBoolean = null;
    c.a(paramString);
    ApplicationInfo localApplicationInfo;
    try
    {
      if (super.n().getPackageManager() == null)
      {
        ua.a("Failed to load metadata: PackageManager is null");
        return null;
      }
      localApplicationInfo = bc.a(super.n()).a(super.n().getPackageName(), 128);
      if (localApplicationInfo == null)
      {
        ua.a("Failed to load metadata: ApplicationInfo is null");
        return null;
      }
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      ua.a("Failed to load metadata: Package name not found", paramString);
      return null;
    }
    if (metaData == null)
    {
      ua.a("Failed to load metadata: Metadata bundle is null");
      return null;
    }
    if (metaData.containsKey(paramString))
    {
      boolean bool = metaData.getBoolean(paramString);
      localBoolean = Boolean.valueOf(bool);
    }
    return localBoolean;
  }
}


/* Location:              com/google/android/gms/b/cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */