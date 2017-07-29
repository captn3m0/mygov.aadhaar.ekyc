package com.google.android.gms.dynamite;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public final class DynamiteModule
{
  public static final b a = new b()
  {
    public final DynamiteModule.b.b a(Context paramAnonymousContext, String paramAnonymousString, DynamiteModule.b.a paramAnonymousa)
    {
      DynamiteModule.b.b localb = new DynamiteModule.b.b();
      b = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString, true);
      if (b != 0) {
        c = 1;
      }
      do
      {
        return localb;
        a = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString);
      } while (a == 0);
      c = -1;
      return localb;
    }
  };
  public static final b b = new b()
  {
    public final DynamiteModule.b.b a(Context paramAnonymousContext, String paramAnonymousString, DynamiteModule.b.a paramAnonymousa)
    {
      DynamiteModule.b.b localb = new DynamiteModule.b.b();
      a = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString);
      if (a != 0) {
        c = -1;
      }
      do
      {
        return localb;
        b = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString, true);
      } while (b == 0);
      c = 1;
      return localb;
    }
  };
  public static final b c = new b()
  {
    public final DynamiteModule.b.b a(Context paramAnonymousContext, String paramAnonymousString, DynamiteModule.b.a paramAnonymousa)
    {
      DynamiteModule.b.b localb = new DynamiteModule.b.b();
      a = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString);
      b = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString, true);
      if ((a == 0) && (b == 0))
      {
        c = 0;
        return localb;
      }
      if (a >= b)
      {
        c = -1;
        return localb;
      }
      c = 1;
      return localb;
    }
  };
  public static final b d = new b()
  {
    public final DynamiteModule.b.b a(Context paramAnonymousContext, String paramAnonymousString, DynamiteModule.b.a paramAnonymousa)
    {
      DynamiteModule.b.b localb = new DynamiteModule.b.b();
      a = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString);
      b = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString, true);
      if ((a == 0) && (b == 0))
      {
        c = 0;
        return localb;
      }
      if (b >= a)
      {
        c = 1;
        return localb;
      }
      c = -1;
      return localb;
    }
  };
  public static final b e = new b()
  {
    public final DynamiteModule.b.b a(Context paramAnonymousContext, String paramAnonymousString, DynamiteModule.b.a paramAnonymousa)
    {
      DynamiteModule.b.b localb = new DynamiteModule.b.b();
      a = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString);
      if (a != 0) {}
      for (b = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString, false); (a == 0) && (b == 0); b = paramAnonymousa.a(paramAnonymousContext, paramAnonymousString, true))
      {
        c = 0;
        return localb;
      }
      if (b >= a)
      {
        c = 1;
        return localb;
      }
      c = -1;
      return localb;
    }
  };
  private static Boolean g;
  private static a h;
  private static b i;
  private static final HashMap<String, byte[]> j = new HashMap();
  private static String k;
  private static final DynamiteModule.b.a l = new DynamiteModule.b.a()
  {
    public final int a(Context paramAnonymousContext, String paramAnonymousString)
    {
      return DynamiteModule.a(paramAnonymousContext, paramAnonymousString);
    }
    
    public final int a(Context paramAnonymousContext, String paramAnonymousString, boolean paramAnonymousBoolean)
    {
      return DynamiteModule.a(paramAnonymousContext, paramAnonymousString, paramAnonymousBoolean);
    }
  };
  public final Context f;
  
  private DynamiteModule(Context paramContext)
  {
    f = ((Context)c.a(paramContext));
  }
  
  public static int a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getApplicationContext().getClassLoader();
      Object localObject = String.valueOf("com.google.android.gms.dynamite.descriptors.");
      String str = String.valueOf("ModuleDescriptor");
      localObject = paramContext.loadClass(String.valueOf(localObject).length() + 1 + String.valueOf(paramString).length() + String.valueOf(str).length() + (String)localObject + paramString + "." + str);
      paramContext = ((Class)localObject).getDeclaredField("MODULE_ID");
      localObject = ((Class)localObject).getDeclaredField("MODULE_VERSION");
      if (!paramContext.get(null).equals(paramString))
      {
        paramContext = String.valueOf(paramContext.get(null));
        Log.e("DynamiteModule", String.valueOf(paramContext).length() + 51 + String.valueOf(paramString).length() + "Module descriptor id '" + paramContext + "' didn't match expected id '" + paramString + "'");
        return 0;
      }
      int m = ((Field)localObject).getInt(null);
      return m;
    }
    catch (ClassNotFoundException paramContext)
    {
      Log.w("DynamiteModule", String.valueOf(paramString).length() + 45 + "Local module descriptor class for " + paramString + " not found.");
      return 0;
    }
    catch (Exception paramContext)
    {
      paramContext = String.valueOf(paramContext.getMessage());
      if (paramContext.length() == 0) {}
    }
    for (paramContext = "Failed to load module descriptor class: ".concat(paramContext);; paramContext = new String("Failed to load module descriptor class: "))
    {
      Log.e("DynamiteModule", paramContext);
      break;
    }
  }
  
  /* Error */
  public static int a(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 201	com/google/android/gms/dynamite/DynamiteModule:g	Ljava/lang/Boolean;
    //   6: astore 6
    //   8: aload 6
    //   10: astore 5
    //   12: aload 6
    //   14: ifnonnull +69 -> 83
    //   17: aload_0
    //   18: invokevirtual 100	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   21: invokevirtual 104	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   24: ldc 22
    //   26: invokevirtual 204	java/lang/Class:getName	()Ljava/lang/String;
    //   29: invokevirtual 139	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   32: astore 6
    //   34: aload 6
    //   36: ldc -50
    //   38: invokevirtual 147	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   41: astore 5
    //   43: aload 6
    //   45: monitorenter
    //   46: aload 5
    //   48: aconst_null
    //   49: invokevirtual 154	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   52: checkcast 135	java/lang/ClassLoader
    //   55: astore 7
    //   57: aload 7
    //   59: ifnull +57 -> 116
    //   62: aload 7
    //   64: invokestatic 209	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   67: if_acmpne +36 -> 103
    //   70: getstatic 214	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   73: astore 5
    //   75: aload 6
    //   77: monitorexit
    //   78: aload 5
    //   80: putstatic 201	com/google/android/gms/dynamite/DynamiteModule:g	Ljava/lang/Boolean;
    //   83: ldc 2
    //   85: monitorexit
    //   86: aload 5
    //   88: invokevirtual 218	java/lang/Boolean:booleanValue	()Z
    //   91: ifeq +265 -> 356
    //   94: aload_0
    //   95: aload_1
    //   96: iload_2
    //   97: invokestatic 220	com/google/android/gms/dynamite/DynamiteModule:c	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   100: istore_3
    //   101: iload_3
    //   102: ireturn
    //   103: aload 7
    //   105: invokestatic 223	com/google/android/gms/dynamite/DynamiteModule:a	(Ljava/lang/ClassLoader;)V
    //   108: getstatic 226	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   111: astore 5
    //   113: goto -38 -> 75
    //   116: ldc -28
    //   118: aload_0
    //   119: invokevirtual 100	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   122: invokevirtual 231	android/content/Context:getPackageName	()Ljava/lang/String;
    //   125: invokevirtual 232	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   128: ifeq +20 -> 148
    //   131: aload 5
    //   133: aconst_null
    //   134: invokestatic 209	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   137: invokevirtual 236	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   140: getstatic 214	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   143: astore 5
    //   145: goto -70 -> 75
    //   148: aload_0
    //   149: aload_1
    //   150: iload_2
    //   151: invokestatic 220	com/google/android/gms/dynamite/DynamiteModule:c	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   154: istore_3
    //   155: getstatic 238	com/google/android/gms/dynamite/DynamiteModule:k	Ljava/lang/String;
    //   158: ifnull +16 -> 174
    //   161: getstatic 238	com/google/android/gms/dynamite/DynamiteModule:k	Ljava/lang/String;
    //   164: invokevirtual 241	java/lang/String:isEmpty	()Z
    //   167: istore 4
    //   169: iload 4
    //   171: ifeq +17 -> 188
    //   174: aload 6
    //   176: monitorexit
    //   177: ldc 2
    //   179: monitorexit
    //   180: iload_3
    //   181: ireturn
    //   182: astore_0
    //   183: ldc 2
    //   185: monitorexit
    //   186: aload_0
    //   187: athrow
    //   188: new 20	com/google/android/gms/dynamite/DynamiteModule$8
    //   191: dup
    //   192: getstatic 238	com/google/android/gms/dynamite/DynamiteModule:k	Ljava/lang/String;
    //   195: invokestatic 209	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   198: invokespecial 244	com/google/android/gms/dynamite/DynamiteModule$8:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   201: astore 7
    //   203: aload 7
    //   205: invokestatic 223	com/google/android/gms/dynamite/DynamiteModule:a	(Ljava/lang/ClassLoader;)V
    //   208: aload 5
    //   210: aconst_null
    //   211: aload 7
    //   213: invokevirtual 236	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   216: getstatic 226	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   219: putstatic 201	com/google/android/gms/dynamite/DynamiteModule:g	Ljava/lang/Boolean;
    //   222: aload 6
    //   224: monitorexit
    //   225: ldc 2
    //   227: monitorexit
    //   228: iload_3
    //   229: ireturn
    //   230: astore 7
    //   232: aload 5
    //   234: aconst_null
    //   235: invokestatic 209	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   238: invokevirtual 236	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   241: getstatic 214	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   244: astore 5
    //   246: goto -171 -> 75
    //   249: astore 5
    //   251: aload 6
    //   253: monitorexit
    //   254: aload 5
    //   256: athrow
    //   257: astore 5
    //   259: aload 5
    //   261: invokestatic 112	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   264: astore 5
    //   266: ldc -96
    //   268: new 116	java/lang/StringBuilder
    //   271: dup
    //   272: aload 5
    //   274: invokestatic 112	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   277: invokevirtual 120	java/lang/String:length	()I
    //   280: bipush 30
    //   282: iadd
    //   283: invokespecial 123	java/lang/StringBuilder:<init>	(I)V
    //   286: ldc -10
    //   288: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: aload 5
    //   293: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: invokestatic 182	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   302: pop
    //   303: getstatic 214	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   306: astore 5
    //   308: goto -230 -> 78
    //   311: astore_0
    //   312: aload_0
    //   313: invokevirtual 247	com/google/android/gms/dynamite/DynamiteModule$a:getMessage	()Ljava/lang/String;
    //   316: invokestatic 112	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   319: astore_0
    //   320: aload_0
    //   321: invokevirtual 120	java/lang/String:length	()I
    //   324: ifeq +19 -> 343
    //   327: ldc -7
    //   329: aload_0
    //   330: invokevirtual 191	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   333: astore_0
    //   334: ldc -96
    //   336: aload_0
    //   337: invokestatic 182	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   340: pop
    //   341: iconst_0
    //   342: ireturn
    //   343: new 108	java/lang/String
    //   346: dup
    //   347: ldc -7
    //   349: invokespecial 194	java/lang/String:<init>	(Ljava/lang/String;)V
    //   352: astore_0
    //   353: goto -19 -> 334
    //   356: aload_0
    //   357: aload_1
    //   358: iload_2
    //   359: invokestatic 251	com/google/android/gms/dynamite/DynamiteModule:b	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   362: ireturn
    //   363: astore 5
    //   365: goto -257 -> 108
    //   368: astore 5
    //   370: goto -111 -> 259
    //   373: astore 5
    //   375: goto -116 -> 259
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	378	0	paramContext	Context
    //   0	378	1	paramString	String
    //   0	378	2	paramBoolean	boolean
    //   100	129	3	m	int
    //   167	3	4	bool	boolean
    //   10	235	5	localObject1	Object
    //   249	6	5	localObject2	Object
    //   257	3	5	localClassNotFoundException	ClassNotFoundException
    //   264	43	5	localObject3	Object
    //   363	1	5	locala1	a
    //   368	1	5	localNoSuchFieldException	NoSuchFieldException
    //   373	1	5	localIllegalAccessException	IllegalAccessException
    //   6	246	6	localObject4	Object
    //   55	157	7	localObject5	Object
    //   230	1	7	locala2	a
    // Exception table:
    //   from	to	target	type
    //   3	8	182	finally
    //   17	46	182	finally
    //   78	83	182	finally
    //   83	86	182	finally
    //   177	180	182	finally
    //   183	186	182	finally
    //   225	228	182	finally
    //   254	257	182	finally
    //   259	308	182	finally
    //   148	169	230	com/google/android/gms/dynamite/DynamiteModule$a
    //   188	222	230	com/google/android/gms/dynamite/DynamiteModule$a
    //   46	57	249	finally
    //   62	75	249	finally
    //   75	78	249	finally
    //   103	108	249	finally
    //   108	113	249	finally
    //   116	145	249	finally
    //   148	169	249	finally
    //   174	177	249	finally
    //   188	222	249	finally
    //   222	225	249	finally
    //   232	246	249	finally
    //   251	254	249	finally
    //   17	46	257	java/lang/ClassNotFoundException
    //   254	257	257	java/lang/ClassNotFoundException
    //   94	101	311	com/google/android/gms/dynamite/DynamiteModule$a
    //   103	108	363	com/google/android/gms/dynamite/DynamiteModule$a
    //   17	46	368	java/lang/NoSuchFieldException
    //   254	257	368	java/lang/NoSuchFieldException
    //   17	46	373	java/lang/IllegalAccessException
    //   254	257	373	java/lang/IllegalAccessException
  }
  
  private static Context a(Context paramContext, String paramString, byte[] paramArrayOfByte, b paramb)
  {
    try
    {
      paramContext = (Context)com.google.android.gms.a.b.a(paramb.a(com.google.android.gms.a.b.a(paramContext), paramString, paramArrayOfByte));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext = String.valueOf(paramContext.toString());
      if (paramContext.length() == 0) {}
    }
    for (paramContext = "Failed to load DynamiteLoader: ".concat(paramContext);; paramContext = new String("Failed to load DynamiteLoader: "))
    {
      Log.e("DynamiteModule", paramContext);
      return null;
    }
  }
  
  public static DynamiteModule a(Context paramContext, b paramb, String paramString)
  {
    DynamiteModule.b.b localb = paramb.a(paramContext, paramString, l);
    int m = a;
    int n = b;
    Log.i("DynamiteModule", String.valueOf(paramString).length() + 68 + String.valueOf(paramString).length() + "Considering local module " + paramString + ":" + m + " and remote module " + paramString + ":" + n);
    if ((c == 0) || ((c == -1) && (a == 0)) || ((c == 1) && (b == 0)))
    {
      m = a;
      n = b;
      throw new a(91 + "No acceptable module found. Local version is " + m + " and remote version is " + n + ".", (byte)0);
    }
    if (c == -1) {
      return b(paramContext, paramString);
    }
    if (c == 1) {
      try
      {
        localObject = a(paramContext, paramString, b);
        return (DynamiteModule)localObject;
      }
      catch (a locala)
      {
        Object localObject = String.valueOf(locala.getMessage());
        if (((String)localObject).length() != 0) {}
        for (localObject = "Failed to load remote module: ".concat((String)localObject);; localObject = new String("Failed to load remote module: "))
        {
          Log.w("DynamiteModule", (String)localObject);
          if ((a == 0) || (
          {
            public final int a(Context paramAnonymousContext, String paramAnonymousString)
            {
              return a;
            }
            
            public final int a(Context paramAnonymousContext, String paramAnonymousString, boolean paramAnonymousBoolean)
            {
              return 0;
            }
          } != -1)) {
            break;
          }
          return b(paramContext, paramString);
        }
        throw new a("Remote load failed. No local fallback found.", locala, (byte)0);
      }
    }
    m = c;
    throw new a(47 + "VersionPolicy returned invalid code:" + m, (byte)0);
  }
  
  private static DynamiteModule a(Context paramContext, String paramString, int paramInt)
  {
    Boolean localBoolean;
    try
    {
      localBoolean = g;
      if (localBoolean == null) {
        throw new a("Failed to determine which loading route to use.", (byte)0);
      }
    }
    finally {}
    if (localBoolean.booleanValue()) {
      return c(paramContext, paramString, paramInt);
    }
    return b(paramContext, paramString, paramInt);
  }
  
  /* Error */
  private static a a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 322	com/google/android/gms/dynamite/DynamiteModule:h	Lcom/google/android/gms/dynamite/a;
    //   6: ifnull +12 -> 18
    //   9: getstatic 322	com/google/android/gms/dynamite/DynamiteModule:h	Lcom/google/android/gms/dynamite/a;
    //   12: astore_0
    //   13: ldc 2
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: invokestatic 327	com/google/android/gms/common/m:b	()Lcom/google/android/gms/common/m;
    //   21: aload_0
    //   22: invokevirtual 330	com/google/android/gms/common/m:a	(Landroid/content/Context;)I
    //   25: ifeq +8 -> 33
    //   28: ldc 2
    //   30: monitorexit
    //   31: aconst_null
    //   32: areturn
    //   33: aload_0
    //   34: ldc -28
    //   36: iconst_3
    //   37: invokevirtual 334	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   40: invokevirtual 104	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   43: ldc_w 336
    //   46: invokevirtual 139	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   49: invokevirtual 340	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   52: checkcast 342	android/os/IBinder
    //   55: invokestatic 347	com/google/android/gms/dynamite/a$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamite/a;
    //   58: astore_0
    //   59: aload_0
    //   60: ifnull +49 -> 109
    //   63: aload_0
    //   64: putstatic 322	com/google/android/gms/dynamite/DynamiteModule:h	Lcom/google/android/gms/dynamite/a;
    //   67: ldc 2
    //   69: monitorexit
    //   70: aload_0
    //   71: areturn
    //   72: astore_0
    //   73: ldc 2
    //   75: monitorexit
    //   76: aload_0
    //   77: athrow
    //   78: astore_0
    //   79: aload_0
    //   80: invokevirtual 185	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   83: invokestatic 112	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   86: astore_0
    //   87: aload_0
    //   88: invokevirtual 120	java/lang/String:length	()I
    //   91: ifeq +23 -> 114
    //   94: ldc_w 349
    //   97: aload_0
    //   98: invokevirtual 191	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   101: astore_0
    //   102: ldc -96
    //   104: aload_0
    //   105: invokestatic 171	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   108: pop
    //   109: ldc 2
    //   111: monitorexit
    //   112: aconst_null
    //   113: areturn
    //   114: new 108	java/lang/String
    //   117: dup
    //   118: ldc_w 349
    //   121: invokespecial 194	java/lang/String:<init>	(Ljava/lang/String;)V
    //   124: astore_0
    //   125: goto -23 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	16	72	finally
    //   18	31	72	finally
    //   33	59	72	finally
    //   63	67	72	finally
    //   67	70	72	finally
    //   73	76	72	finally
    //   79	102	72	finally
    //   102	109	72	finally
    //   109	112	72	finally
    //   114	125	72	finally
    //   33	59	78	java/lang/Exception
    //   63	67	78	java/lang/Exception
  }
  
  private static void a(ClassLoader paramClassLoader)
  {
    try
    {
      i = b.a.a((IBinder)paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
      return;
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      throw new a("Failed to instantiate dynamite loader", paramClassLoader, (byte)0);
    }
    catch (InstantiationException paramClassLoader)
    {
      for (;;) {}
    }
    catch (IllegalAccessException paramClassLoader)
    {
      for (;;) {}
    }
    catch (NoSuchMethodException paramClassLoader)
    {
      for (;;) {}
    }
    catch (InvocationTargetException paramClassLoader)
    {
      for (;;) {}
    }
  }
  
  private static int b(Context paramContext, String paramString, boolean paramBoolean)
  {
    a locala = a(paramContext);
    if (locala == null) {
      return 0;
    }
    try
    {
      int m = locala.a(com.google.android.gms.a.b.a(paramContext), paramString, paramBoolean);
      return m;
    }
    catch (RemoteException paramContext)
    {
      paramContext = String.valueOf(paramContext.getMessage());
      if (paramContext.length() == 0) {}
    }
    for (paramContext = "Failed to retrieve remote module version: ".concat(paramContext);; paramContext = new String("Failed to retrieve remote module version: "))
    {
      Log.w("DynamiteModule", paramContext);
      return 0;
    }
  }
  
  private static DynamiteModule b(Context paramContext, String paramString)
  {
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {}
    for (paramString = "Selected local version of ".concat(paramString);; paramString = new String("Selected local version of "))
    {
      Log.i("DynamiteModule", paramString);
      return new DynamiteModule(paramContext.getApplicationContext());
    }
  }
  
  private static DynamiteModule b(Context paramContext, String paramString, int paramInt)
  {
    Log.i("DynamiteModule", String.valueOf(paramString).length() + 51 + "Selected remote version of " + paramString + ", version >= " + paramInt);
    a locala = a(paramContext);
    if (locala == null) {
      throw new a("Failed to create IDynamiteLoader.", (byte)0);
    }
    try
    {
      paramContext = locala.a(com.google.android.gms.a.b.a(paramContext), paramString, paramInt);
      if (com.google.android.gms.a.b.a(paramContext) == null) {
        throw new a("Failed to load remote module.", (byte)0);
      }
    }
    catch (RemoteException paramContext)
    {
      throw new a("Failed to load remote module.", paramContext, (byte)0);
    }
    return new DynamiteModule((Context)com.google.android.gms.a.b.a(paramContext));
  }
  
  /* Error */
  private static int c(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: iload_2
    //   4: ifeq +173 -> 177
    //   7: ldc_w 402
    //   10: astore 4
    //   12: ldc_w 404
    //   15: invokestatic 112	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   18: astore 6
    //   20: new 116	java/lang/StringBuilder
    //   23: dup
    //   24: aload 6
    //   26: invokestatic 112	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: invokevirtual 120	java/lang/String:length	()I
    //   32: iconst_1
    //   33: iadd
    //   34: aload 4
    //   36: invokestatic 112	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   39: invokevirtual 120	java/lang/String:length	()I
    //   42: iadd
    //   43: aload_1
    //   44: invokestatic 112	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   47: invokevirtual 120	java/lang/String:length	()I
    //   50: iadd
    //   51: invokespecial 123	java/lang/StringBuilder:<init>	(I)V
    //   54: aload 6
    //   56: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload 4
    //   61: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: ldc_w 406
    //   67: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload_1
    //   71: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: invokestatic 412	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   80: astore 4
    //   82: aload_0
    //   83: invokevirtual 416	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   86: aload 4
    //   88: aconst_null
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: invokevirtual 422	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   95: astore 4
    //   97: aload 4
    //   99: ifnull +16 -> 115
    //   102: aload 4
    //   104: astore_0
    //   105: aload 4
    //   107: invokeinterface 427 1 0
    //   112: ifne +73 -> 185
    //   115: aload 4
    //   117: astore_0
    //   118: ldc -96
    //   120: ldc_w 429
    //   123: invokestatic 182	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   126: pop
    //   127: aload 4
    //   129: astore_0
    //   130: new 25	com/google/android/gms/dynamite/DynamiteModule$a
    //   133: dup
    //   134: ldc_w 431
    //   137: iconst_0
    //   138: invokespecial 297	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;B)V
    //   141: athrow
    //   142: astore_1
    //   143: aload 4
    //   145: astore_0
    //   146: aload_1
    //   147: instanceof 25
    //   150: ifeq +149 -> 299
    //   153: aload 4
    //   155: astore_0
    //   156: aload_1
    //   157: athrow
    //   158: astore 4
    //   160: aload_0
    //   161: astore_1
    //   162: aload 4
    //   164: astore_0
    //   165: aload_1
    //   166: ifnull +9 -> 175
    //   169: aload_1
    //   170: invokeinterface 434 1 0
    //   175: aload_0
    //   176: athrow
    //   177: ldc_w 436
    //   180: astore 4
    //   182: goto -170 -> 12
    //   185: aload 4
    //   187: astore_0
    //   188: aload 4
    //   190: iconst_0
    //   191: invokeinterface 439 2 0
    //   196: istore_3
    //   197: iload_3
    //   198: ifle +78 -> 276
    //   201: aload 4
    //   203: astore_0
    //   204: ldc 2
    //   206: monitorenter
    //   207: aload 4
    //   209: iconst_3
    //   210: invokeinterface 443 2 0
    //   215: iconst_0
    //   216: invokestatic 449	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   219: astore_0
    //   220: getstatic 61	com/google/android/gms/dynamite/DynamiteModule:j	Ljava/util/HashMap;
    //   223: new 116	java/lang/StringBuilder
    //   226: dup
    //   227: aload_1
    //   228: invokestatic 112	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   231: invokevirtual 120	java/lang/String:length	()I
    //   234: bipush 12
    //   236: iadd
    //   237: invokespecial 123	java/lang/StringBuilder:<init>	(I)V
    //   240: aload_1
    //   241: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: ldc_w 281
    //   247: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: iload_3
    //   251: invokevirtual 284	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   254: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: aload_0
    //   258: invokevirtual 453	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   261: pop
    //   262: aload 4
    //   264: iconst_2
    //   265: invokeinterface 443 2 0
    //   270: putstatic 238	com/google/android/gms/dynamite/DynamiteModule:k	Ljava/lang/String;
    //   273: ldc 2
    //   275: monitorexit
    //   276: aload 4
    //   278: ifnull +10 -> 288
    //   281: aload 4
    //   283: invokeinterface 434 1 0
    //   288: iload_3
    //   289: ireturn
    //   290: astore_1
    //   291: ldc 2
    //   293: monitorexit
    //   294: aload 4
    //   296: astore_0
    //   297: aload_1
    //   298: athrow
    //   299: aload 4
    //   301: astore_0
    //   302: new 25	com/google/android/gms/dynamite/DynamiteModule$a
    //   305: dup
    //   306: ldc_w 455
    //   309: aload_1
    //   310: iconst_0
    //   311: invokespecial 311	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;B)V
    //   314: athrow
    //   315: astore_0
    //   316: aload 5
    //   318: astore_1
    //   319: goto -154 -> 165
    //   322: astore_1
    //   323: aconst_null
    //   324: astore 4
    //   326: goto -183 -> 143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	329	0	paramContext	Context
    //   0	329	1	paramString	String
    //   0	329	2	paramBoolean	boolean
    //   196	93	3	m	int
    //   10	144	4	localObject1	Object
    //   158	5	4	localObject2	Object
    //   180	145	4	str1	String
    //   1	316	5	localObject3	Object
    //   18	37	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   105	115	142	java/lang/Exception
    //   118	127	142	java/lang/Exception
    //   130	142	142	java/lang/Exception
    //   188	197	142	java/lang/Exception
    //   204	207	142	java/lang/Exception
    //   297	299	142	java/lang/Exception
    //   105	115	158	finally
    //   118	127	158	finally
    //   130	142	158	finally
    //   146	153	158	finally
    //   156	158	158	finally
    //   188	197	158	finally
    //   204	207	158	finally
    //   297	299	158	finally
    //   302	315	158	finally
    //   207	276	290	finally
    //   291	294	290	finally
    //   12	97	315	finally
    //   12	97	322	java/lang/Exception
  }
  
  private static DynamiteModule c(Context paramContext, String paramString, int paramInt)
  {
    Log.i("DynamiteModule", String.valueOf(paramString).length() + 51 + "Selected remote version of " + paramString + ", version >= " + paramInt);
    byte[] arrayOfByte;
    b localb;
    try
    {
      arrayOfByte = (byte[])j.get(String.valueOf(paramString).length() + 12 + paramString + ":" + paramInt);
      localb = i;
      if (arrayOfByte == null) {
        throw new a("Module implementation could not be found.", (byte)0);
      }
    }
    finally {}
    if (localb == null) {
      throw new a("DynamiteLoaderV2 was not cached.", (byte)0);
    }
    paramContext = a(paramContext.getApplicationContext(), paramString, arrayOfByte, localb);
    if (paramContext == null) {
      throw new a("Failed to get module context", (byte)0);
    }
    return new DynamiteModule(paramContext);
  }
  
  public final IBinder a(String paramString)
  {
    try
    {
      IBinder localIBinder = (IBinder)f.getClassLoader().loadClass(paramString).newInstance();
      return localIBinder;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {}
      for (paramString = "Failed to instantiate module class: ".concat(paramString);; paramString = new String("Failed to instantiate module class: ")) {
        throw new a(paramString, localClassNotFoundException, (byte)0);
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
  
  @DynamiteApi
  public static class DynamiteLoaderClassLoader
  {
    public static ClassLoader sClassLoader;
  }
  
  public static final class a
    extends Exception
  {
    private a(String paramString)
    {
      super();
    }
    
    private a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
  
  public static abstract interface b
  {
    public abstract b a(Context paramContext, String paramString, a parama);
    
    public static abstract interface a
    {
      public abstract int a(Context paramContext, String paramString);
      
      public abstract int a(Context paramContext, String paramString, boolean paramBoolean);
    }
    
    public static final class b
    {
      public int a = 0;
      public int b = 0;
      public int c = 0;
    }
  }
}


/* Location:              com/google/android/gms/dynamite/DynamiteModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */