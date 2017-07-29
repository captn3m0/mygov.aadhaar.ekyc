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
    Uri.Builder localBuilder1 = new android/net/Uri$Builder;
    localBuilder1.<init>();
    String str1 = (String)ka;
    Uri.Builder localBuilder2 = localBuilder1.scheme(str1);
    str1 = (String)la;
    localBuilder2 = localBuilder2.encodedAuthority(str1);
    String str2 = "config/app/";
    str1 = String.valueOf(paramString1);
    int i = str1.length();
    if (i != 0) {
      str1 = str2.concat(str1);
    }
    for (;;)
    {
      localBuilder2.path(str1).appendQueryParameter("app_instance_id", paramString2).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "10260");
      return localBuilder1.build().toString();
      str1 = new java/lang/String;
      str1.<init>(str2);
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
    long l = ((Long)ia).longValue();
    return Math.max(0L, l);
  }
  
  public static int af()
  {
    int i = ((Integer)oa).intValue();
    return Math.max(0, i);
  }
  
  public static int ag()
  {
    int i = ((Integer)pa).intValue();
    return Math.max(1, i);
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
    long l = ((Long)xa).longValue();
    return Math.max(0L, l);
  }
  
  public static long al()
  {
    long l = ((Long)za).longValue();
    return Math.max(0L, l);
  }
  
  public static long am()
  {
    long l = ((Long)Aa).longValue();
    return Math.max(0L, l);
  }
  
  public static long an()
  {
    long l = ((Long)Ba).longValue();
    return Math.max(0L, l);
  }
  
  public static long ao()
  {
    long l = ((Long)Ca).longValue();
    return Math.max(0L, l);
  }
  
  public static long ap()
  {
    long l = ((Long)Da).longValue();
    return Math.max(0L, l);
  }
  
  public static long aq()
  {
    return ((Long)ya).longValue();
  }
  
  public static long ar()
  {
    long l = ((Long)Ga).longValue();
    return Math.max(0L, l);
  }
  
  public static long as()
  {
    long l = ((Long)Ha).longValue();
    return Math.max(0L, l);
  }
  
  public static int at()
  {
    int i = ((Integer)Ia).intValue();
    i = Math.max(0, i);
    return Math.min(20, i);
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
    //   1: getfield 238	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +102 -> 108
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield 238	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +89 -> 106
    //   20: aload_0
    //   21: invokespecial 242	com/google/android/gms/b/de:n	()Landroid/content/Context;
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 248	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   29: astore_1
    //   30: invokestatic 252	com/google/android/gms/common/util/j:a	()Ljava/lang/String;
    //   33: astore_2
    //   34: aload_1
    //   35: ifnull +34 -> 69
    //   38: aload_1
    //   39: getfield 257	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   42: astore_1
    //   43: aload_1
    //   44: ifnull +72 -> 116
    //   47: aload_1
    //   48: aload_2
    //   49: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   52: istore_3
    //   53: iload_3
    //   54: ifeq +62 -> 116
    //   57: iconst_1
    //   58: istore_3
    //   59: iload_3
    //   60: invokestatic 266	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   63: astore_1
    //   64: aload_0
    //   65: aload_1
    //   66: putfield 238	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   69: aload_0
    //   70: getfield 238	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   73: astore_1
    //   74: aload_1
    //   75: ifnonnull +31 -> 106
    //   78: getstatic 269	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   81: astore_1
    //   82: aload_0
    //   83: aload_1
    //   84: putfield 238	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   87: aload_0
    //   88: invokespecial 273	com/google/android/gms/b/de:u	()Lcom/google/android/gms/b/cu;
    //   91: astore_1
    //   92: aload_1
    //   93: getfield 278	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   96: astore_1
    //   97: ldc_w 280
    //   100: astore_2
    //   101: aload_1
    //   102: aload_2
    //   103: invokevirtual 284	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_0
    //   109: getfield 238	com/google/android/gms/b/cf:b	Ljava/lang/Boolean;
    //   112: invokevirtual 287	java/lang/Boolean:booleanValue	()Z
    //   115: ireturn
    //   116: iconst_0
    //   117: istore_3
    //   118: aconst_null
    //   119: astore_1
    //   120: goto -61 -> 59
    //   123: astore_1
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_1
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	cf
    //   4	116	1	localObject1	Object
    //   123	4	1	localObject2	Object
    //   33	70	2	str	String
    //   52	66	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	15	123	finally
    //   20	24	123	finally
    //   25	29	123	finally
    //   30	33	123	finally
    //   38	42	123	finally
    //   48	52	123	finally
    //   59	63	123	finally
    //   65	69	123	finally
    //   69	73	123	finally
    //   78	81	123	finally
    //   83	87	123	finally
    //   87	91	123	finally
    //   92	96	123	finally
    //   102	106	123	finally
    //   106	108	123	finally
    //   124	126	123	finally
  }
  
  public final boolean Y()
  {
    Boolean localBoolean = b("firebase_analytics_collection_deactivated");
    boolean bool;
    if (localBoolean != null)
    {
      bool = localBoolean.booleanValue();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localBoolean = null;
    }
  }
  
  public final int a(String paramString)
  {
    cp.a locala = cp.u;
    return b(paramString, locala);
  }
  
  public final long a(String paramString, cp.a parama)
  {
    Object localObject;
    long l;
    if (paramString == null)
    {
      localObject = (Long)a;
      l = ((Long)localObject).longValue();
    }
    for (;;)
    {
      return l;
      localObject = super.r();
      String str = b;
      localObject = ((da)localObject).a(paramString, str);
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool)
      {
        localObject = (Long)a;
        l = ((Long)localObject).longValue();
      }
      else
      {
        try
        {
          localObject = Long.valueOf((String)localObject);
          l = ((Long)localObject).longValue();
          localObject = Long.valueOf(l);
          localObject = parama.a(localObject);
          localObject = (Long)localObject;
          l = ((Long)localObject).longValue();
        }
        catch (NumberFormatException localNumberFormatException)
        {
          Long localLong = (Long)a;
          l = localLong.longValue();
        }
      }
    }
  }
  
  public final String au()
  {
    Object localObject1 = "android.os.SystemProperties";
    try
    {
      localObject1 = Class.forName((String)localObject1);
      localObject2 = "get";
      int i = 2;
      localObject3 = new Class[i];
      int j = 0;
      Object localObject4 = String.class;
      localObject3[0] = localObject4;
      j = 1;
      localObject4 = String.class;
      localObject3[j] = localObject4;
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject2 = null;
      i = 2;
      localObject3 = new Object[i];
      j = 0;
      localObject4 = "debug.firebase.analytics.app";
      localObject3[0] = localObject4;
      j = 1;
      localObject4 = "";
      localObject3[j] = localObject4;
      localObject1 = ((Method)localObject1).invoke(null, (Object[])localObject3);
      localObject1 = (String)localObject1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        localObject2 = ua;
        localObject3 = "Could not find SystemProperties class";
        ((cu.a)localObject2).a((String)localObject3, localClassNotFoundException);
        String str = "";
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        localObject2 = ua;
        localObject3 = "Could not find SystemProperties.get() method";
        ((cu.a)localObject2).a((String)localObject3, localNoSuchMethodException);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localObject2 = ua;
        localObject3 = "Could not access SystemProperties.get()";
        ((cu.a)localObject2).a((String)localObject3, localIllegalAccessException);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        Object localObject2 = ua;
        Object localObject3 = "SystemProperties.get() threw an exception";
        ((cu.a)localObject2).a((String)localObject3, localInvocationTargetException);
      }
    }
    return (String)localObject1;
  }
  
  public final int b(String paramString, cp.a parama)
  {
    Object localObject;
    int i;
    if (paramString == null)
    {
      localObject = (Integer)a;
      i = ((Integer)localObject).intValue();
    }
    for (;;)
    {
      return i;
      localObject = super.r();
      String str = b;
      localObject = ((da)localObject).a(paramString, str);
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool)
      {
        localObject = (Integer)a;
        i = ((Integer)localObject).intValue();
      }
      else
      {
        try
        {
          localObject = Integer.valueOf((String)localObject);
          i = ((Integer)localObject).intValue();
          localObject = Integer.valueOf(i);
          localObject = parama.a(localObject);
          localObject = (Integer)localObject;
          i = ((Integer)localObject).intValue();
        }
        catch (NumberFormatException localNumberFormatException)
        {
          Integer localInteger = (Integer)a;
          i = localInteger.intValue();
        }
      }
    }
  }
  
  final Boolean b(String paramString)
  {
    localBoolean = null;
    c.a(paramString);
    for (;;)
    {
      try
      {
        localObject1 = super.n();
        localObject1 = ((Context)localObject1).getPackageManager();
        if (localObject1 != null) {
          continue;
        }
        localObject1 = super.u();
        localObject1 = a;
        localObject3 = "Failed to load metadata: PackageManager is null";
        ((cu.a)localObject1).a((String)localObject3);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject1;
        int i;
        Object localObject3 = ua;
        String str = "Failed to load metadata: Package name not found";
        ((cu.a)localObject3).a(str, localNameNotFoundException);
        continue;
        localObject3 = metaData;
        if (localObject3 != null) {
          continue;
        }
        Object localObject2 = super.u();
        localObject2 = a;
        localObject3 = "Failed to load metadata: Metadata bundle is null";
        ((cu.a)localObject2).a((String)localObject3);
        continue;
        localObject3 = metaData;
        boolean bool1 = ((Bundle)localObject3).containsKey(paramString);
        if (!bool1) {
          continue;
        }
        localObject2 = metaData;
        boolean bool2 = ((Bundle)localObject2).getBoolean(paramString);
        localBoolean = Boolean.valueOf(bool2);
        continue;
      }
      return localBoolean;
      localObject1 = super.n();
      localObject1 = bc.a((Context)localObject1);
      localObject3 = super.n();
      localObject3 = ((Context)localObject3).getPackageName();
      i = 128;
      localObject1 = ((bb)localObject1).a((String)localObject3, i);
      if (localObject1 != null) {
        continue;
      }
      localObject1 = super.u();
      localObject1 = a;
      localObject3 = "Failed to load metadata: ApplicationInfo is null";
      ((cu.a)localObject1).a((String)localObject3);
    }
  }
}


/* Location:              com/google/android/gms/b/cf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */