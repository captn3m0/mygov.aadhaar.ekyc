package com.google.android.gms.dynamite;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public final class DynamiteModule
{
  public static final DynamiteModule.b a;
  public static final DynamiteModule.b b;
  public static final DynamiteModule.b c;
  public static final DynamiteModule.b d;
  public static final DynamiteModule.b e;
  private static Boolean g;
  private static a h;
  private static b i;
  private static final HashMap j;
  private static String k;
  private static final DynamiteModule.b.a l;
  public final Context f;
  
  static
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    j = (HashMap)localObject;
    localObject = new com/google/android/gms/dynamite/DynamiteModule$1;
    ((DynamiteModule.1)localObject).<init>();
    l = (DynamiteModule.b.a)localObject;
    localObject = new com/google/android/gms/dynamite/DynamiteModule$2;
    ((DynamiteModule.2)localObject).<init>();
    a = (DynamiteModule.b)localObject;
    localObject = new com/google/android/gms/dynamite/DynamiteModule$3;
    ((DynamiteModule.3)localObject).<init>();
    b = (DynamiteModule.b)localObject;
    localObject = new com/google/android/gms/dynamite/DynamiteModule$4;
    ((DynamiteModule.4)localObject).<init>();
    c = (DynamiteModule.b)localObject;
    localObject = new com/google/android/gms/dynamite/DynamiteModule$5;
    ((DynamiteModule.5)localObject).<init>();
    d = (DynamiteModule.b)localObject;
    localObject = new com/google/android/gms/dynamite/DynamiteModule$6;
    ((DynamiteModule.6)localObject).<init>();
    e = (DynamiteModule.b)localObject;
  }
  
  private DynamiteModule(Context paramContext)
  {
    Context localContext = (Context)c.a(paramContext);
    f = localContext;
  }
  
  public static int a(Context paramContext, String paramString)
  {
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      try
      {
        localObject1 = paramContext.getApplicationContext();
        localObject1 = ((Context)localObject1).getClassLoader();
        localObject2 = "com.google.android.gms.dynamite.descriptors.";
        localObject2 = String.valueOf(localObject2);
        localObject3 = "ModuleDescriptor";
        localObject3 = String.valueOf(localObject3);
        Object localObject4 = String.valueOf(localObject2);
        m = ((String)localObject4).length() + 1;
        Object localObject5 = String.valueOf(paramString);
        int n = ((String)localObject5).length();
        m += n;
        localObject5 = String.valueOf(localObject3);
        n = ((String)localObject5).length();
        m += n;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>(m);
        localObject2 = ((StringBuilder)localObject5).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject2).append(paramString);
        localObject4 = ".";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject2);
        localObject2 = "MODULE_ID";
        localObject2 = ((Class)localObject1).getDeclaredField((String)localObject2);
        localObject3 = "MODULE_VERSION";
        localObject1 = ((Class)localObject1).getDeclaredField((String)localObject3);
        boolean bool = false;
        localObject3 = null;
        localObject3 = ((Field)localObject2).get(null);
        bool = localObject3.equals(paramString);
        if (bool) {
          continue;
        }
        localObject1 = "DynamiteModule";
        bool = false;
        localObject3 = null;
        localObject2 = ((Field)localObject2).get(null);
        localObject2 = String.valueOf(localObject2);
        localObject3 = String.valueOf(localObject2);
        int i1 = ((String)localObject3).length() + 51;
        localObject4 = String.valueOf(paramString);
        m = ((String)localObject4).length();
        i1 += m;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>(i1);
        localObject3 = "Module descriptor id '";
        localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = "' didn't match expected id '";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).append(paramString);
        localObject3 = "'";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        Log.e((String)localObject1, (String)localObject2);
        i2 = 0;
        localObject1 = null;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Object localObject1;
        String str1 = "DynamiteModule";
        int i3 = String.valueOf(paramString).length() + 45;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(i3);
        localObject2 = ((StringBuilder)localObject3).append("Local module descriptor class for ").append(paramString);
        localObject3 = " not found.";
        localObject2 = (String)localObject3;
        Log.w(str1, (String)localObject2);
        int i2 = 0;
        str1 = null;
        continue;
      }
      catch (Exception localException)
      {
        localObject2 = "DynamiteModule";
        localObject3 = "Failed to load module descriptor class: ";
        str2 = String.valueOf(localException.getMessage());
        int m = str2.length();
        if (m == 0) {
          break;
        }
      }
      return i2;
      i3 = 0;
      localObject2 = null;
      i2 = ((Field)localObject1).getInt(null);
    }
    String str2 = ((String)localObject3).concat(str2);
    for (;;)
    {
      Log.e((String)localObject2, str2);
      break;
      str2 = new java/lang/String;
      str2.<init>((String)localObject3);
    }
  }
  
  /* Error */
  public static int a(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: astore_3
    //   3: aload_3
    //   4: monitorenter
    //   5: getstatic 176	com/google/android/gms/dynamite/DynamiteModule:g	Ljava/lang/Boolean;
    //   8: astore 4
    //   10: aload 4
    //   12: ifnonnull +103 -> 115
    //   15: aload_0
    //   16: invokevirtual 76	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   19: astore 4
    //   21: aload 4
    //   23: invokevirtual 80	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   26: astore 4
    //   28: ldc -78
    //   30: astore 5
    //   32: aload 5
    //   34: invokevirtual 181	java/lang/Class:getName	()Ljava/lang/String;
    //   37: astore 5
    //   39: aload 4
    //   41: aload 5
    //   43: invokevirtual 115	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   46: astore 5
    //   48: ldc -73
    //   50: astore 4
    //   52: aload 5
    //   54: aload 4
    //   56: invokevirtual 123	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   59: astore 6
    //   61: aload 5
    //   63: monitorenter
    //   64: iconst_0
    //   65: istore 7
    //   67: aconst_null
    //   68: astore 4
    //   70: aload 6
    //   72: aconst_null
    //   73: invokevirtual 130	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   76: astore 4
    //   78: aload 4
    //   80: checkcast 111	java/lang/ClassLoader
    //   83: astore 4
    //   85: aload 4
    //   87: ifnull +66 -> 153
    //   90: invokestatic 186	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   93: astore 6
    //   95: aload 4
    //   97: aload 6
    //   99: if_acmpne +41 -> 140
    //   102: getstatic 191	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   105: astore 4
    //   107: aload 5
    //   109: monitorexit
    //   110: aload 4
    //   112: putstatic 176	com/google/android/gms/dynamite/DynamiteModule:g	Ljava/lang/Boolean;
    //   115: aload_3
    //   116: monitorexit
    //   117: aload 4
    //   119: invokevirtual 195	java/lang/Boolean:booleanValue	()Z
    //   122: istore 7
    //   124: iload 7
    //   126: ifeq +388 -> 514
    //   129: aload_0
    //   130: aload_1
    //   131: iload_2
    //   132: invokestatic 198	com/google/android/gms/dynamite/DynamiteModule:c	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   135: istore 7
    //   137: iload 7
    //   139: ireturn
    //   140: aload 4
    //   142: invokestatic 201	com/google/android/gms/dynamite/DynamiteModule:a	(Ljava/lang/ClassLoader;)V
    //   145: getstatic 204	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   148: astore 4
    //   150: goto -43 -> 107
    //   153: ldc -50
    //   155: astore 4
    //   157: aload_0
    //   158: invokevirtual 76	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   161: astore 8
    //   163: aload 8
    //   165: invokevirtual 209	android/content/Context:getPackageName	()Ljava/lang/String;
    //   168: astore 8
    //   170: aload 4
    //   172: aload 8
    //   174: invokevirtual 210	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   177: istore 7
    //   179: iload 7
    //   181: ifeq +30 -> 211
    //   184: iconst_0
    //   185: istore 7
    //   187: aconst_null
    //   188: astore 4
    //   190: invokestatic 186	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   193: astore 8
    //   195: aload 6
    //   197: aconst_null
    //   198: aload 8
    //   200: invokevirtual 214	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   203: getstatic 191	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   206: astore 4
    //   208: goto -101 -> 107
    //   211: aload_0
    //   212: aload_1
    //   213: iload_2
    //   214: invokestatic 198	com/google/android/gms/dynamite/DynamiteModule:c	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   217: istore 7
    //   219: getstatic 216	com/google/android/gms/dynamite/DynamiteModule:k	Ljava/lang/String;
    //   222: astore 8
    //   224: aload 8
    //   226: ifnull +20 -> 246
    //   229: getstatic 216	com/google/android/gms/dynamite/DynamiteModule:k	Ljava/lang/String;
    //   232: astore 8
    //   234: aload 8
    //   236: invokevirtual 219	java/lang/String:isEmpty	()Z
    //   239: istore 9
    //   241: iload 9
    //   243: ifeq +18 -> 261
    //   246: aload 5
    //   248: monitorexit
    //   249: aload_3
    //   250: monitorexit
    //   251: goto -114 -> 137
    //   254: astore 4
    //   256: aload_3
    //   257: monitorexit
    //   258: aload 4
    //   260: athrow
    //   261: new 221	com/google/android/gms/dynamite/DynamiteModule$8
    //   264: astore 8
    //   266: getstatic 216	com/google/android/gms/dynamite/DynamiteModule:k	Ljava/lang/String;
    //   269: astore 10
    //   271: invokestatic 186	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   274: astore 11
    //   276: aload 8
    //   278: aload 10
    //   280: aload 11
    //   282: invokespecial 224	com/google/android/gms/dynamite/DynamiteModule$8:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   285: aload 8
    //   287: invokestatic 201	com/google/android/gms/dynamite/DynamiteModule:a	(Ljava/lang/ClassLoader;)V
    //   290: aconst_null
    //   291: astore 10
    //   293: aload 6
    //   295: aconst_null
    //   296: aload 8
    //   298: invokevirtual 214	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   301: getstatic 204	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   304: astore 8
    //   306: aload 8
    //   308: putstatic 176	com/google/android/gms/dynamite/DynamiteModule:g	Ljava/lang/Boolean;
    //   311: aload 5
    //   313: monitorexit
    //   314: aload_3
    //   315: monitorexit
    //   316: goto -179 -> 137
    //   319: astore 4
    //   321: iconst_0
    //   322: istore 7
    //   324: aconst_null
    //   325: astore 4
    //   327: invokestatic 186	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   330: astore 8
    //   332: aload 6
    //   334: aconst_null
    //   335: aload 8
    //   337: invokevirtual 214	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   340: getstatic 191	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   343: astore 4
    //   345: goto -238 -> 107
    //   348: astore 4
    //   350: aload 5
    //   352: monitorexit
    //   353: aload 4
    //   355: athrow
    //   356: astore 4
    //   358: ldc -120
    //   360: astore 5
    //   362: aload 4
    //   364: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   367: astore 4
    //   369: aload 4
    //   371: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   374: astore 6
    //   376: aload 6
    //   378: invokevirtual 94	java/lang/String:length	()I
    //   381: bipush 30
    //   383: iadd
    //   384: istore 12
    //   386: new 96	java/lang/StringBuilder
    //   389: astore 8
    //   391: aload 8
    //   393: iload 12
    //   395: invokespecial 99	java/lang/StringBuilder:<init>	(I)V
    //   398: ldc -30
    //   400: astore 6
    //   402: aload 8
    //   404: aload 6
    //   406: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: astore 6
    //   411: aload 6
    //   413: aload 4
    //   415: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: astore 4
    //   420: aload 4
    //   422: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   425: astore 4
    //   427: aload 5
    //   429: aload 4
    //   431: invokestatic 158	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   434: pop
    //   435: getstatic 191	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   438: astore 4
    //   440: goto -330 -> 110
    //   443: astore 4
    //   445: ldc -120
    //   447: astore_3
    //   448: ldc -28
    //   450: astore 5
    //   452: aload 4
    //   454: invokevirtual 231	com/google/android/gms/dynamite/DynamiteModule$a:getMessage	()Ljava/lang/String;
    //   457: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   460: astore 4
    //   462: aload 4
    //   464: invokevirtual 94	java/lang/String:length	()I
    //   467: istore 12
    //   469: iload 12
    //   471: ifeq +28 -> 499
    //   474: aload 5
    //   476: aload 4
    //   478: invokevirtual 169	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   481: astore 4
    //   483: aload_3
    //   484: aload 4
    //   486: invokestatic 158	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   489: pop
    //   490: iconst_0
    //   491: istore 7
    //   493: aconst_null
    //   494: astore 4
    //   496: goto -359 -> 137
    //   499: new 84	java/lang/String
    //   502: astore 4
    //   504: aload 4
    //   506: aload 5
    //   508: invokespecial 172	java/lang/String:<init>	(Ljava/lang/String;)V
    //   511: goto -28 -> 483
    //   514: aload_0
    //   515: aload_1
    //   516: iload_2
    //   517: invokestatic 233	com/google/android/gms/dynamite/DynamiteModule:b	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   520: istore 7
    //   522: goto -385 -> 137
    //   525: astore 4
    //   527: goto -382 -> 145
    //   530: astore 4
    //   532: goto -174 -> 358
    //   535: astore 4
    //   537: goto -179 -> 358
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	540	0	paramContext	Context
    //   0	540	1	paramString	String
    //   0	540	2	paramBoolean	boolean
    //   2	482	3	localObject1	Object
    //   8	199	4	localObject2	Object
    //   254	5	4	localObject3	Object
    //   319	1	4	locala1	DynamiteModule.a
    //   325	19	4	localBoolean	Boolean
    //   348	6	4	localObject4	Object
    //   356	7	4	localClassNotFoundException	ClassNotFoundException
    //   367	72	4	localObject5	Object
    //   443	10	4	locala2	DynamiteModule.a
    //   460	45	4	str1	String
    //   525	1	4	locala3	DynamiteModule.a
    //   530	1	4	localNoSuchFieldException	NoSuchFieldException
    //   535	1	4	localIllegalAccessException	IllegalAccessException
    //   30	477	5	localObject6	Object
    //   59	353	6	localObject7	Object
    //   65	60	7	bool1	boolean
    //   135	3	7	m	int
    //   177	9	7	bool2	boolean
    //   217	304	7	n	int
    //   161	242	8	localObject8	Object
    //   239	3	9	bool3	boolean
    //   269	23	10	str2	String
    //   274	7	11	localClassLoader	ClassLoader
    //   384	86	12	i1	int
    // Exception table:
    //   from	to	target	type
    //   5	8	254	finally
    //   15	19	254	finally
    //   21	26	254	finally
    //   32	37	254	finally
    //   41	46	254	finally
    //   54	59	254	finally
    //   61	64	254	finally
    //   110	115	254	finally
    //   115	117	254	finally
    //   249	251	254	finally
    //   256	258	254	finally
    //   314	316	254	finally
    //   353	356	254	finally
    //   362	367	254	finally
    //   369	374	254	finally
    //   376	381	254	finally
    //   386	389	254	finally
    //   393	398	254	finally
    //   404	409	254	finally
    //   413	418	254	finally
    //   420	425	254	finally
    //   429	435	254	finally
    //   435	438	254	finally
    //   213	217	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   219	222	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   229	232	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   234	239	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   261	264	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   266	269	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   271	274	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   280	285	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   285	290	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   296	301	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   301	304	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   306	311	319	com/google/android/gms/dynamite/DynamiteModule$a
    //   72	76	348	finally
    //   78	83	348	finally
    //   90	93	348	finally
    //   102	105	348	finally
    //   107	110	348	finally
    //   140	145	348	finally
    //   145	148	348	finally
    //   157	161	348	finally
    //   163	168	348	finally
    //   172	177	348	finally
    //   190	193	348	finally
    //   198	203	348	finally
    //   203	206	348	finally
    //   213	217	348	finally
    //   219	222	348	finally
    //   229	232	348	finally
    //   234	239	348	finally
    //   246	249	348	finally
    //   261	264	348	finally
    //   266	269	348	finally
    //   271	274	348	finally
    //   280	285	348	finally
    //   285	290	348	finally
    //   296	301	348	finally
    //   301	304	348	finally
    //   306	311	348	finally
    //   311	314	348	finally
    //   327	330	348	finally
    //   335	340	348	finally
    //   340	343	348	finally
    //   350	353	348	finally
    //   15	19	356	java/lang/ClassNotFoundException
    //   21	26	356	java/lang/ClassNotFoundException
    //   32	37	356	java/lang/ClassNotFoundException
    //   41	46	356	java/lang/ClassNotFoundException
    //   54	59	356	java/lang/ClassNotFoundException
    //   61	64	356	java/lang/ClassNotFoundException
    //   353	356	356	java/lang/ClassNotFoundException
    //   131	135	443	com/google/android/gms/dynamite/DynamiteModule$a
    //   140	145	525	com/google/android/gms/dynamite/DynamiteModule$a
    //   15	19	530	java/lang/NoSuchFieldException
    //   21	26	530	java/lang/NoSuchFieldException
    //   32	37	530	java/lang/NoSuchFieldException
    //   41	46	530	java/lang/NoSuchFieldException
    //   54	59	530	java/lang/NoSuchFieldException
    //   61	64	530	java/lang/NoSuchFieldException
    //   353	356	530	java/lang/NoSuchFieldException
    //   15	19	535	java/lang/IllegalAccessException
    //   21	26	535	java/lang/IllegalAccessException
    //   32	37	535	java/lang/IllegalAccessException
    //   41	46	535	java/lang/IllegalAccessException
    //   54	59	535	java/lang/IllegalAccessException
    //   61	64	535	java/lang/IllegalAccessException
    //   353	356	535	java/lang/IllegalAccessException
  }
  
  private static Context a(Context paramContext, String paramString, byte[] paramArrayOfByte, b paramb)
  {
    String str2;
    String str3;
    try
    {
      Object localObject = com.google.android.gms.a.b.a(paramContext);
      localObject = paramb.a((com.google.android.gms.a.a)localObject, paramString, paramArrayOfByte);
      localObject = com.google.android.gms.a.b.a((com.google.android.gms.a.a)localObject);
      localObject = (Context)localObject;
      return (Context)localObject;
    }
    catch (Exception localException)
    {
      str2 = "DynamiteModule";
      str3 = "Failed to load DynamiteLoader: ";
      str1 = String.valueOf(localException.toString());
      int m = str1.length();
      if (m == 0) {
        break label90;
      }
    }
    String str1 = str3.concat(str1);
    for (;;)
    {
      Log.e(str2, str1);
      str1 = null;
      break;
      label90:
      str1 = new java/lang/String;
      str1.<init>(str3);
    }
  }
  
  public static DynamiteModule a(Context paramContext, DynamiteModule.b paramb, String paramString)
  {
    int m = 1;
    int n = -1;
    Object localObject1 = l;
    Object localObject3 = paramb.a(paramContext, paramString, (DynamiteModule.b.a)localObject1);
    localObject1 = "DynamiteModule";
    int i1 = a;
    int i2 = b;
    int i3 = String.valueOf(paramString).length() + 68;
    int i4 = String.valueOf(paramString).length();
    i3 += i4;
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>(i3);
    Object localObject5 = ((StringBuilder)localObject4).append("Considering local module ").append(paramString);
    localObject4 = ":";
    Object localObject6 = ((StringBuilder)localObject5).append((String)localObject4).append(i1).append(" and remote module ").append(paramString);
    localObject5 = ":";
    localObject6 = (String)localObject5 + i2;
    Log.i((String)localObject1, (String)localObject6);
    int i5 = c;
    if (i5 != 0)
    {
      i5 = c;
      if (i5 == n)
      {
        i5 = a;
        if (i5 == 0) {}
      }
      else
      {
        i5 = c;
        if (i5 != m) {
          break label292;
        }
        i5 = b;
        if (i5 != 0) {
          break label292;
        }
      }
    }
    localObject1 = new com/google/android/gms/dynamite/DynamiteModule$a;
    i1 = a;
    int i6 = b;
    localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>(91);
    localObject6 = "No acceptable module found. Local version is " + i1 + " and remote version is " + i6 + ".";
    ((DynamiteModule.a)localObject1).<init>((String)localObject6, (byte)0);
    throw ((Throwable)localObject1);
    label292:
    i5 = c;
    if (i5 == n) {
      localObject1 = b(paramContext, paramString);
    }
    for (;;)
    {
      return (DynamiteModule)localObject1;
      i5 = c;
      if (i5 == m) {
        try
        {
          i5 = b;
          localObject1 = a(paramContext, paramString, i5);
        }
        catch (DynamiteModule.a locala)
        {
          localObject6 = locala;
          localObject7 = "DynamiteModule";
          localObject5 = "Failed to load remote module: ";
          localObject2 = String.valueOf(locala.getMessage());
          i4 = ((String)localObject2).length();
          if (i4 != 0) {
            localObject2 = ((String)localObject5).concat((String)localObject2);
          }
          for (;;)
          {
            Log.w((String)localObject7, (String)localObject2);
            i5 = a;
            if (i5 == 0) {
              break label484;
            }
            i5 = a;
            localObject3 = new com/google/android/gms/dynamite/DynamiteModule$7;
            ((DynamiteModule.7)localObject3).<init>(i5);
            localObject2 = paramb.a(paramContext, paramString, (DynamiteModule.b.a)localObject3);
            i5 = c;
            if (i5 != n) {
              break label484;
            }
            localObject2 = b(paramContext, paramString);
            break;
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>((String)localObject5);
          }
          label484:
          localObject2 = new com/google/android/gms/dynamite/DynamiteModule$a;
          ((DynamiteModule.a)localObject2).<init>("Remote load failed. No local fallback found.", (Throwable)localObject6, (byte)0);
          throw ((Throwable)localObject2);
        }
      }
    }
    Object localObject2 = new com/google/android/gms/dynamite/DynamiteModule$a;
    i1 = c;
    Object localObject7 = new java/lang/StringBuilder;
    ((StringBuilder)localObject7).<init>(47);
    localObject6 = "VersionPolicy returned invalid code:" + i1;
    ((DynamiteModule.a)localObject2).<init>((String)localObject6, (byte)0);
    throw ((Throwable)localObject2);
  }
  
  private static DynamiteModule a(Context paramContext, String paramString, int paramInt)
  {
    synchronized (DynamiteModule.class)
    {
      Object localObject1 = g;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/dynamite/DynamiteModule$a;
        ((DynamiteModule.a)localObject1).<init>("Failed to determine which loading route to use.", (byte)0);
        throw ((Throwable)localObject1);
      }
    }
    boolean bool = ((Boolean)localObject2).booleanValue();
    if (bool) {}
    for (DynamiteModule localDynamiteModule = c(paramContext, paramString, paramInt);; localDynamiteModule = b(paramContext, paramString, paramInt)) {
      return localDynamiteModule;
    }
  }
  
  private static a a(Context paramContext)
  {
    Object localObject1;
    int m;
    int n;
    String str2;
    synchronized (DynamiteModule.class)
    {
      localObject1 = h;
      if (localObject1 != null) {}
      for (localObject1 = h;; localObject1 = null)
      {
        return (a)localObject1;
        localObject1 = m.b();
        m = ((m)localObject1).a(paramContext);
        if (m == 0) {
          break;
        }
        m = 0;
      }
      localObject1 = "com.google.android.gms";
      n = 3;
    }
    String str3;
    int i1;
    String str1 = str3.concat(str1);
    for (;;)
    {
      Log.e(str2, str1);
      m = 0;
      str1 = null;
      break;
      str1 = new java/lang/String;
      str1.<init>(str3);
    }
  }
  
  private static void a(ClassLoader paramClassLoader)
  {
    Object localObject1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2";
    try
    {
      localObject1 = paramClassLoader.loadClass((String)localObject1);
      localObject2 = null;
      localObject2 = new Class[0];
      localObject1 = ((Class)localObject1).getConstructor((Class[])localObject2);
      localObject2 = null;
      localObject2 = new Object[0];
      localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
      localObject1 = (IBinder)localObject1;
      localObject1 = b.a.a((IBinder)localObject1);
      i = (b)localObject1;
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Object localObject2 = new com/google/android/gms/dynamite/DynamiteModule$a;
      ((DynamiteModule.a)localObject2).<init>("Failed to instantiate dynamite loader", localClassNotFoundException, (byte)0);
      throw ((Throwable)localObject2);
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;) {}
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  private static int b(Context paramContext, String paramString, boolean paramBoolean)
  {
    a locala = a(paramContext);
    int m;
    if (locala == null)
    {
      m = 0;
      locala = null;
    }
    Object localObject;
    String str2;
    for (;;)
    {
      return m;
      try
      {
        localObject = com.google.android.gms.a.b.a(paramContext);
        m = locala.a((com.google.android.gms.a.a)localObject, paramString, paramBoolean);
      }
      catch (RemoteException localRemoteException)
      {
        localObject = "DynamiteModule";
        str2 = "Failed to retrieve remote module version: ";
        str1 = String.valueOf(localRemoteException.getMessage());
        int n = str1.length();
        if (n == 0) {
          break label88;
        }
      }
    }
    String str1 = str2.concat(str1);
    for (;;)
    {
      Log.w((String)localObject, str1);
      m = 0;
      str1 = null;
      break;
      label88:
      str1 = new java/lang/String;
      str1.<init>(str2);
    }
  }
  
  private static DynamiteModule b(Context paramContext, String paramString)
  {
    Object localObject1 = "DynamiteModule";
    String str = "Selected local version of ";
    Object localObject2 = String.valueOf(paramString);
    int m = ((String)localObject2).length();
    if (m != 0) {
      localObject2 = str.concat((String)localObject2);
    }
    for (;;)
    {
      Log.i((String)localObject1, (String)localObject2);
      localObject2 = new com/google/android/gms/dynamite/DynamiteModule;
      localObject1 = paramContext.getApplicationContext();
      ((DynamiteModule)localObject2).<init>((Context)localObject1);
      return (DynamiteModule)localObject2;
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>(str);
    }
  }
  
  private static DynamiteModule b(Context paramContext, String paramString, int paramInt)
  {
    int m = String.valueOf(paramString).length() + 51;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>(m);
    Object localObject2 = ((StringBuilder)localObject1).append("Selected remote version of ").append(paramString);
    localObject1 = ", version >= ";
    localObject2 = (String)localObject1 + paramInt;
    Log.i("DynamiteModule", (String)localObject2);
    Object localObject3 = a(paramContext);
    if (localObject3 == null)
    {
      localObject3 = new com/google/android/gms/dynamite/DynamiteModule$a;
      ((DynamiteModule.a)localObject3).<init>("Failed to create IDynamiteLoader.", (byte)0);
      throw ((Throwable)localObject3);
    }
    try
    {
      localObject2 = com.google.android.gms.a.b.a(paramContext);
      localObject3 = ((a)localObject3).a((com.google.android.gms.a.a)localObject2, paramString, paramInt);
      localObject2 = com.google.android.gms.a.b.a((com.google.android.gms.a.a)localObject3);
      if (localObject2 == null)
      {
        localObject3 = new com/google/android/gms/dynamite/DynamiteModule$a;
        ((DynamiteModule.a)localObject3).<init>("Failed to load remote module.", (byte)0);
        throw ((Throwable)localObject3);
      }
    }
    catch (RemoteException localRemoteException)
    {
      localObject2 = new com/google/android/gms/dynamite/DynamiteModule$a;
      ((DynamiteModule.a)localObject2).<init>("Failed to load remote module.", localRemoteException, (byte)0);
      throw ((Throwable)localObject2);
    }
    localObject2 = new com/google/android/gms/dynamite/DynamiteModule;
    Context localContext = (Context)com.google.android.gms.a.b.a(localRemoteException);
    ((DynamiteModule)localObject2).<init>(localContext);
    return (DynamiteModule)localObject2;
  }
  
  /* Error */
  private static int c(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iload_2
    //   3: ifeq +284 -> 287
    //   6: ldc_w 397
    //   9: astore 4
    //   11: ldc_w 399
    //   14: astore 5
    //   16: aload 5
    //   18: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   21: astore 5
    //   23: aload 5
    //   25: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   28: astore 6
    //   30: aload 6
    //   32: invokevirtual 94	java/lang/String:length	()I
    //   35: iconst_1
    //   36: iadd
    //   37: istore 7
    //   39: aload 4
    //   41: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   44: astore 8
    //   46: aload 8
    //   48: invokevirtual 94	java/lang/String:length	()I
    //   51: istore 9
    //   53: iload 7
    //   55: iload 9
    //   57: iadd
    //   58: istore 7
    //   60: aload_1
    //   61: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   64: astore 8
    //   66: aload 8
    //   68: invokevirtual 94	java/lang/String:length	()I
    //   71: istore 9
    //   73: iload 7
    //   75: iload 9
    //   77: iadd
    //   78: istore 7
    //   80: new 96	java/lang/StringBuilder
    //   83: astore 8
    //   85: aload 8
    //   87: iload 7
    //   89: invokespecial 99	java/lang/StringBuilder:<init>	(I)V
    //   92: aload 8
    //   94: aload 5
    //   96: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: astore 5
    //   101: aload 5
    //   103: aload 4
    //   105: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: astore 4
    //   110: ldc_w 401
    //   113: astore 5
    //   115: aload 4
    //   117: aload 5
    //   119: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: astore 4
    //   124: aload 4
    //   126: aload_1
    //   127: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: astore 4
    //   132: aload 4
    //   134: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: astore 4
    //   139: aload 4
    //   141: invokestatic 407	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   144: astore 5
    //   146: aload_0
    //   147: invokevirtual 411	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   150: astore 4
    //   152: iconst_0
    //   153: istore 7
    //   155: aconst_null
    //   156: astore 6
    //   158: iconst_0
    //   159: istore 9
    //   161: aconst_null
    //   162: astore 8
    //   164: aconst_null
    //   165: astore 10
    //   167: iconst_0
    //   168: istore 11
    //   170: aconst_null
    //   171: astore 12
    //   173: aload 4
    //   175: aload 5
    //   177: aconst_null
    //   178: aconst_null
    //   179: aconst_null
    //   180: aconst_null
    //   181: invokevirtual 417	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   184: astore 5
    //   186: aload 5
    //   188: ifnull +17 -> 205
    //   191: aload 5
    //   193: invokeinterface 422 1 0
    //   198: istore 13
    //   200: iload 13
    //   202: ifne +93 -> 295
    //   205: ldc -120
    //   207: astore 4
    //   209: ldc_w 424
    //   212: astore 6
    //   214: aload 4
    //   216: aload 6
    //   218: invokestatic 158	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   221: pop
    //   222: new 230	com/google/android/gms/dynamite/DynamiteModule$a
    //   225: astore 4
    //   227: ldc_w 426
    //   230: astore 6
    //   232: iconst_0
    //   233: istore 9
    //   235: aconst_null
    //   236: astore 8
    //   238: aload 4
    //   240: aload 6
    //   242: iconst_0
    //   243: invokespecial 287	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;B)V
    //   246: aload 4
    //   248: athrow
    //   249: astore 4
    //   251: aload 4
    //   253: instanceof 230
    //   256: istore 7
    //   258: iload 7
    //   260: ifeq +209 -> 469
    //   263: aload 4
    //   265: checkcast 428	java/lang/Throwable
    //   268: athrow
    //   269: astore 4
    //   271: aload 5
    //   273: astore_3
    //   274: aload_3
    //   275: ifnull +9 -> 284
    //   278: aload_3
    //   279: invokeinterface 431 1 0
    //   284: aload 4
    //   286: athrow
    //   287: ldc_w 433
    //   290: astore 4
    //   292: goto -281 -> 11
    //   295: iconst_0
    //   296: istore 13
    //   298: aconst_null
    //   299: astore 4
    //   301: aload 5
    //   303: iconst_0
    //   304: invokeinterface 436 2 0
    //   309: istore 13
    //   311: iload 13
    //   313: ifle +133 -> 446
    //   316: ldc 2
    //   318: astore 6
    //   320: aload 6
    //   322: monitorenter
    //   323: iconst_3
    //   324: istore 9
    //   326: aload 5
    //   328: iload 9
    //   330: invokeinterface 440 2 0
    //   335: astore 8
    //   337: aconst_null
    //   338: astore 10
    //   340: aload 8
    //   342: iconst_0
    //   343: invokestatic 446	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   346: astore 8
    //   348: getstatic 32	com/google/android/gms/dynamite/DynamiteModule:j	Ljava/util/HashMap;
    //   351: astore 10
    //   353: aload_1
    //   354: invokestatic 88	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   357: astore 12
    //   359: aload 12
    //   361: invokevirtual 94	java/lang/String:length	()I
    //   364: bipush 12
    //   366: iadd
    //   367: istore 11
    //   369: new 96	java/lang/StringBuilder
    //   372: astore_3
    //   373: aload_3
    //   374: iload 11
    //   376: invokespecial 99	java/lang/StringBuilder:<init>	(I)V
    //   379: aload_3
    //   380: aload_1
    //   381: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: astore 12
    //   386: ldc_w 270
    //   389: astore_3
    //   390: aload 12
    //   392: aload_3
    //   393: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: astore 12
    //   398: aload 12
    //   400: iload 13
    //   402: invokevirtual 273	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   405: astore 12
    //   407: aload 12
    //   409: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   412: astore 12
    //   414: aload 10
    //   416: aload 12
    //   418: aload 8
    //   420: invokevirtual 450	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   423: pop
    //   424: iconst_2
    //   425: istore 9
    //   427: aload 5
    //   429: iload 9
    //   431: invokeinterface 440 2 0
    //   436: astore 8
    //   438: aload 8
    //   440: putstatic 216	com/google/android/gms/dynamite/DynamiteModule:k	Ljava/lang/String;
    //   443: aload 6
    //   445: monitorexit
    //   446: aload 5
    //   448: ifnull +10 -> 458
    //   451: aload 5
    //   453: invokeinterface 431 1 0
    //   458: iload 13
    //   460: ireturn
    //   461: astore 4
    //   463: aload 6
    //   465: monitorexit
    //   466: aload 4
    //   468: athrow
    //   469: new 230	com/google/android/gms/dynamite/DynamiteModule$a
    //   472: astore 6
    //   474: ldc_w 453
    //   477: astore 8
    //   479: aconst_null
    //   480: astore 10
    //   482: aload 6
    //   484: aload 8
    //   486: aload 4
    //   488: iconst_0
    //   489: invokespecial 303	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;B)V
    //   492: aload 6
    //   494: athrow
    //   495: astore 4
    //   497: goto -223 -> 274
    //   500: astore 4
    //   502: aconst_null
    //   503: astore 5
    //   505: goto -254 -> 251
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	508	0	paramContext	Context
    //   0	508	1	paramString	String
    //   0	508	2	paramBoolean	boolean
    //   1	392	3	localObject1	Object
    //   9	238	4	localObject2	Object
    //   249	15	4	localException1	Exception
    //   269	16	4	localObject3	Object
    //   290	10	4	str	String
    //   461	26	4	localThrowable	Throwable
    //   495	1	4	localObject4	Object
    //   500	1	4	localException2	Exception
    //   14	490	5	localObject5	Object
    //   28	465	6	localObject6	Object
    //   37	117	7	m	int
    //   256	3	7	bool1	boolean
    //   44	441	8	localObject7	Object
    //   51	379	9	n	int
    //   165	316	10	localHashMap	HashMap
    //   168	207	11	i1	int
    //   171	246	12	localObject8	Object
    //   198	99	13	bool2	boolean
    //   309	150	13	i2	int
    // Exception table:
    //   from	to	target	type
    //   191	198	249	java/lang/Exception
    //   216	222	249	java/lang/Exception
    //   222	225	249	java/lang/Exception
    //   242	246	249	java/lang/Exception
    //   246	249	249	java/lang/Exception
    //   303	309	249	java/lang/Exception
    //   320	323	249	java/lang/Exception
    //   466	469	249	java/lang/Exception
    //   191	198	269	finally
    //   216	222	269	finally
    //   222	225	269	finally
    //   242	246	269	finally
    //   246	249	269	finally
    //   263	269	269	finally
    //   303	309	269	finally
    //   320	323	269	finally
    //   466	469	269	finally
    //   469	472	269	finally
    //   488	492	269	finally
    //   492	495	269	finally
    //   328	335	461	finally
    //   342	346	461	finally
    //   348	351	461	finally
    //   353	357	461	finally
    //   359	364	461	finally
    //   369	372	461	finally
    //   374	379	461	finally
    //   380	384	461	finally
    //   392	396	461	finally
    //   400	405	461	finally
    //   407	412	461	finally
    //   418	424	461	finally
    //   429	436	461	finally
    //   438	443	461	finally
    //   443	446	461	finally
    //   463	466	461	finally
    //   16	21	495	finally
    //   23	28	495	finally
    //   30	35	495	finally
    //   39	44	495	finally
    //   46	51	495	finally
    //   60	64	495	finally
    //   66	71	495	finally
    //   80	83	495	finally
    //   87	92	495	finally
    //   94	99	495	finally
    //   103	108	495	finally
    //   117	122	495	finally
    //   126	130	495	finally
    //   132	137	495	finally
    //   139	144	495	finally
    //   146	150	495	finally
    //   180	184	495	finally
    //   16	21	500	java/lang/Exception
    //   23	28	500	java/lang/Exception
    //   30	35	500	java/lang/Exception
    //   39	44	500	java/lang/Exception
    //   46	51	500	java/lang/Exception
    //   60	64	500	java/lang/Exception
    //   66	71	500	java/lang/Exception
    //   80	83	500	java/lang/Exception
    //   87	92	500	java/lang/Exception
    //   94	99	500	java/lang/Exception
    //   103	108	500	java/lang/Exception
    //   117	122	500	java/lang/Exception
    //   126	130	500	java/lang/Exception
    //   132	137	500	java/lang/Exception
    //   139	144	500	java/lang/Exception
    //   146	150	500	java/lang/Exception
    //   180	184	500	java/lang/Exception
  }
  
  private static DynamiteModule c(Context paramContext, String paramString, int paramInt)
  {
    Object localObject1 = "DynamiteModule";
    int m = String.valueOf(paramString).length() + 51;
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>(m);
    ??? = ((StringBuilder)localObject4).append("Selected remote version of ").append(paramString);
    localObject4 = ", version >= ";
    ??? = (String)localObject4 + paramInt;
    Log.i((String)localObject1, (String)???);
    synchronized (DynamiteModule.class)
    {
      localObject1 = j;
      localObject4 = String.valueOf(paramString);
      int n = ((String)localObject4).length() + 12;
      Object localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>(n);
      localObject4 = ((StringBuilder)localObject6).append(paramString);
      localObject6 = ":";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject6);
      localObject4 = ((StringBuilder)localObject4).append(paramInt);
      localObject4 = ((StringBuilder)localObject4).toString();
      localObject1 = ((HashMap)localObject1).get(localObject4);
      localObject1 = (byte[])localObject1;
      localObject4 = i;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/dynamite/DynamiteModule$a;
        ((DynamiteModule.a)localObject1).<init>("Module implementation could not be found.", (byte)0);
        throw ((Throwable)localObject1);
      }
    }
    if (localObject4 == null)
    {
      localObject3 = new com/google/android/gms/dynamite/DynamiteModule$a;
      ((DynamiteModule.a)localObject3).<init>("DynamiteLoaderV2 was not cached.", (byte)0);
      throw ((Throwable)localObject3);
    }
    ??? = paramContext.getApplicationContext();
    Object localObject3 = a((Context)???, paramString, (byte[])localObject3, (b)localObject4);
    if (localObject3 == null)
    {
      localObject3 = new com/google/android/gms/dynamite/DynamiteModule$a;
      ((DynamiteModule.a)localObject3).<init>("Failed to get module context", (byte)0);
      throw ((Throwable)localObject3);
    }
    ??? = new com/google/android/gms/dynamite/DynamiteModule;
    ((DynamiteModule)???).<init>((Context)localObject3);
    return (DynamiteModule)???;
  }
  
  public final IBinder a(String paramString)
  {
    try
    {
      Object localObject = f;
      localObject = ((Context)localObject).getClassLoader();
      localObject = ((ClassLoader)localObject).loadClass(paramString);
      localObject = ((Class)localObject).newInstance();
      return (IBinder)localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      DynamiteModule.a locala = new com/google/android/gms/dynamite/DynamiteModule$a;
      String str1 = "Failed to instantiate module class: ";
      String str2 = String.valueOf(paramString);
      int m = str2.length();
      if (m != 0) {
        str2 = str1.concat(str2);
      }
      for (;;)
      {
        locala.<init>(str2, localClassNotFoundException, (byte)0);
        throw locala;
        str2 = new java/lang/String;
        str2.<init>(str1);
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;) {}
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/google/android/gms/dynamite/DynamiteModule.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */