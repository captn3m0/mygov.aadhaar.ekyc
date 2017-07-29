package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.b.ga;
import com.google.android.gms.b.gb;
import com.google.android.gms.b.gg.b;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
{
  private static Bundle a(gg.b paramb)
  {
    String str1 = a;
    String str2 = b;
    return a(str1, str2);
  }
  
  private static Bundle a(String paramString1, String paramString2)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putString(paramString1, paramString2);
    return localBundle;
  }
  
  static gg.b a(byte[] paramArrayOfByte)
  {
    try
    {
      localObject1 = new com/google/android/gms/b/gg$b;
      ((gg.b)localObject1).<init>();
      int i = paramArrayOfByte.length;
      localObject1 = gb.a((gb)localObject1, paramArrayOfByte, i);
      localObject1 = (gg.b)localObject1;
    }
    catch (ga localga)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (gg.b)localObject1;
  }
  
  static AppMeasurement a(Context paramContext)
  {
    try
    {
      localAppMeasurement = AppMeasurement.getInstance(paramContext);
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;)
      {
        AppMeasurement localAppMeasurement;
        Object localObject = null;
      }
    }
    return localAppMeasurement;
  }
  
  /* Error */
  private static Object a(gg.b paramb, String paramString, d paramd)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: ldc 44
    //   7: astore 5
    //   9: aload 5
    //   11: invokestatic 50	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   14: astore 6
    //   16: aload_0
    //   17: invokestatic 53	com/google/firebase/messaging/e:a	(Lcom/google/android/gms/b/gg$b;)Landroid/os/Bundle;
    //   20: astore 7
    //   22: iconst_0
    //   23: istore 8
    //   25: aconst_null
    //   26: astore 5
    //   28: iconst_0
    //   29: anewarray 46	java/lang/Class
    //   32: astore 5
    //   34: aload 6
    //   36: aload 5
    //   38: invokevirtual 57	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   41: astore 5
    //   43: aconst_null
    //   44: astore 9
    //   46: iconst_0
    //   47: anewarray 4	java/lang/Object
    //   50: astore 9
    //   52: aload 5
    //   54: aload 9
    //   56: invokevirtual 63	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   59: astore 9
    //   61: ldc 65
    //   63: astore 5
    //   65: aload 6
    //   67: aload 5
    //   69: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   72: astore 5
    //   74: aload 5
    //   76: aload 9
    //   78: aload_1
    //   79: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   82: ldc 77
    //   84: astore 5
    //   86: aload 6
    //   88: aload 5
    //   90: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   93: astore 5
    //   95: aload_0
    //   96: getfield 81	com/google/android/gms/b/gg$b:c	J
    //   99: lstore 10
    //   101: lload 10
    //   103: invokestatic 87	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   106: astore 12
    //   108: aload 5
    //   110: aload 9
    //   112: aload 12
    //   114: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   117: ldc 89
    //   119: astore 5
    //   121: aload 6
    //   123: aload 5
    //   125: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   128: astore 5
    //   130: aload_0
    //   131: getfield 10	com/google/android/gms/b/gg$b:a	Ljava/lang/String;
    //   134: astore 12
    //   136: aload 5
    //   138: aload 9
    //   140: aload 12
    //   142: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   145: ldc 91
    //   147: astore 5
    //   149: aload 6
    //   151: aload 5
    //   153: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   156: astore 5
    //   158: aload_0
    //   159: getfield 13	com/google/android/gms/b/gg$b:b	Ljava/lang/String;
    //   162: astore 12
    //   164: aload 5
    //   166: aload 9
    //   168: aload 12
    //   170: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   173: aload_0
    //   174: getfield 94	com/google/android/gms/b/gg$b:d	Ljava/lang/String;
    //   177: astore 5
    //   179: aload 5
    //   181: invokestatic 100	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   184: istore 8
    //   186: iload 8
    //   188: ifeq +298 -> 486
    //   191: ldc 102
    //   193: astore 5
    //   195: aload 6
    //   197: aload 5
    //   199: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   202: astore 5
    //   204: aload 5
    //   206: aload 9
    //   208: aload 4
    //   210: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   213: ldc 104
    //   215: astore 5
    //   217: aload 6
    //   219: aload 5
    //   221: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   224: astore 4
    //   226: aload_0
    //   227: getfield 107	com/google/android/gms/b/gg$b:j	Ljava/lang/String;
    //   230: astore 5
    //   232: aload 5
    //   234: invokestatic 100	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   237: istore 8
    //   239: iload 8
    //   241: ifne +254 -> 495
    //   244: aload_0
    //   245: getfield 107	com/google/android/gms/b/gg$b:j	Ljava/lang/String;
    //   248: astore 5
    //   250: aload 4
    //   252: aload 9
    //   254: aload 5
    //   256: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   259: ldc 109
    //   261: astore 5
    //   263: aload 6
    //   265: aload 5
    //   267: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   270: astore 5
    //   272: aload 5
    //   274: aload 9
    //   276: aload 7
    //   278: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   281: ldc 111
    //   283: astore 5
    //   285: aload 6
    //   287: aload 5
    //   289: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   292: astore 5
    //   294: aload_0
    //   295: getfield 115	com/google/android/gms/b/gg$b:e	I
    //   298: istore_3
    //   299: iload_3
    //   300: invokestatic 120	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   303: astore 4
    //   305: aload 5
    //   307: aload 9
    //   309: aload 4
    //   311: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   314: ldc 122
    //   316: astore 5
    //   318: aload 6
    //   320: aload 5
    //   322: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   325: astore 4
    //   327: aload_0
    //   328: getfield 125	com/google/android/gms/b/gg$b:h	Ljava/lang/String;
    //   331: astore 5
    //   333: aload 5
    //   335: invokestatic 100	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   338: istore 8
    //   340: iload 8
    //   342: ifne +162 -> 504
    //   345: aload_0
    //   346: getfield 125	com/google/android/gms/b/gg$b:h	Ljava/lang/String;
    //   349: astore 5
    //   351: aload 4
    //   353: aload 9
    //   355: aload 5
    //   357: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   360: ldc 127
    //   362: astore 5
    //   364: aload 6
    //   366: aload 5
    //   368: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   371: astore 5
    //   373: aload 5
    //   375: aload 9
    //   377: aload 7
    //   379: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   382: ldc -127
    //   384: astore 5
    //   386: aload 6
    //   388: aload 5
    //   390: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   393: astore 5
    //   395: aload_0
    //   396: getfield 132	com/google/android/gms/b/gg$b:f	I
    //   399: istore_3
    //   400: iload_3
    //   401: invokestatic 120	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   404: astore 4
    //   406: aload 5
    //   408: aload 9
    //   410: aload 4
    //   412: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   415: ldc -122
    //   417: astore 5
    //   419: aload 6
    //   421: aload 5
    //   423: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   426: astore 4
    //   428: aload_0
    //   429: getfield 137	com/google/android/gms/b/gg$b:k	Ljava/lang/String;
    //   432: astore 5
    //   434: aload 5
    //   436: invokestatic 100	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   439: istore 8
    //   441: iload 8
    //   443: ifne +70 -> 513
    //   446: aload_0
    //   447: getfield 137	com/google/android/gms/b/gg$b:k	Ljava/lang/String;
    //   450: astore 5
    //   452: aload 4
    //   454: aload 9
    //   456: aload 5
    //   458: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   461: ldc -117
    //   463: astore 5
    //   465: aload 6
    //   467: aload 5
    //   469: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   472: astore 5
    //   474: aload 5
    //   476: aload 9
    //   478: aload 7
    //   480: invokevirtual 75	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   483: aload 9
    //   485: areturn
    //   486: aload_0
    //   487: getfield 94	com/google/android/gms/b/gg$b:d	Ljava/lang/String;
    //   490: astore 4
    //   492: goto -301 -> 191
    //   495: aload_2
    //   496: getfield 143	com/google/firebase/messaging/d:c	Ljava/lang/String;
    //   499: astore 5
    //   501: goto -251 -> 250
    //   504: aload_2
    //   505: getfield 144	com/google/firebase/messaging/d:b	Ljava/lang/String;
    //   508: astore 5
    //   510: goto -159 -> 351
    //   513: aload_2
    //   514: getfield 145	com/google/firebase/messaging/d:d	Ljava/lang/String;
    //   517: astore 5
    //   519: goto -67 -> 452
    //   522: astore 5
    //   524: aconst_null
    //   525: astore 9
    //   527: ldc -109
    //   529: astore 4
    //   531: ldc -107
    //   533: astore 6
    //   535: aload 4
    //   537: aload 6
    //   539: aload 5
    //   541: invokestatic 154	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   544: pop
    //   545: goto -62 -> 483
    //   548: astore 5
    //   550: goto -23 -> 527
    //   553: astore 5
    //   555: aconst_null
    //   556: astore 9
    //   558: goto -31 -> 527
    //   561: astore 5
    //   563: goto -36 -> 527
    //   566: astore 5
    //   568: aconst_null
    //   569: astore 9
    //   571: goto -44 -> 527
    //   574: astore 5
    //   576: goto -49 -> 527
    //   579: astore 5
    //   581: aconst_null
    //   582: astore 9
    //   584: goto -57 -> 527
    //   587: astore 5
    //   589: goto -62 -> 527
    //   592: astore 5
    //   594: aconst_null
    //   595: astore 9
    //   597: goto -70 -> 527
    //   600: astore 5
    //   602: goto -75 -> 527
    //   605: astore 5
    //   607: aconst_null
    //   608: astore 9
    //   610: goto -83 -> 527
    //   613: astore 5
    //   615: goto -88 -> 527
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	618	0	paramb	gg.b
    //   0	618	1	paramString	String
    //   0	618	2	paramd	d
    //   1	400	3	i	int
    //   3	533	4	localObject1	Object
    //   7	511	5	localObject2	Object
    //   522	18	5	localClassNotFoundException1	ClassNotFoundException
    //   548	1	5	localClassNotFoundException2	ClassNotFoundException
    //   553	1	5	localInstantiationException1	InstantiationException
    //   561	1	5	localInstantiationException2	InstantiationException
    //   566	1	5	localNoSuchFieldException1	NoSuchFieldException
    //   574	1	5	localNoSuchFieldException2	NoSuchFieldException
    //   579	1	5	localIllegalAccessException1	IllegalAccessException
    //   587	1	5	localIllegalAccessException2	IllegalAccessException
    //   592	1	5	localNoSuchMethodException1	NoSuchMethodException
    //   600	1	5	localNoSuchMethodException2	NoSuchMethodException
    //   605	1	5	localInvocationTargetException1	InvocationTargetException
    //   613	1	5	localInvocationTargetException2	InvocationTargetException
    //   14	524	6	localObject3	Object
    //   20	459	7	localBundle	Bundle
    //   23	419	8	bool	boolean
    //   44	565	9	localObject4	Object
    //   99	3	10	l	long
    //   106	63	12	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   9	14	522	java/lang/ClassNotFoundException
    //   16	20	522	java/lang/ClassNotFoundException
    //   28	32	522	java/lang/ClassNotFoundException
    //   36	41	522	java/lang/ClassNotFoundException
    //   46	50	522	java/lang/ClassNotFoundException
    //   54	59	522	java/lang/ClassNotFoundException
    //   67	72	548	java/lang/ClassNotFoundException
    //   78	82	548	java/lang/ClassNotFoundException
    //   88	93	548	java/lang/ClassNotFoundException
    //   95	99	548	java/lang/ClassNotFoundException
    //   101	106	548	java/lang/ClassNotFoundException
    //   112	117	548	java/lang/ClassNotFoundException
    //   123	128	548	java/lang/ClassNotFoundException
    //   130	134	548	java/lang/ClassNotFoundException
    //   140	145	548	java/lang/ClassNotFoundException
    //   151	156	548	java/lang/ClassNotFoundException
    //   158	162	548	java/lang/ClassNotFoundException
    //   168	173	548	java/lang/ClassNotFoundException
    //   173	177	548	java/lang/ClassNotFoundException
    //   179	184	548	java/lang/ClassNotFoundException
    //   197	202	548	java/lang/ClassNotFoundException
    //   208	213	548	java/lang/ClassNotFoundException
    //   219	224	548	java/lang/ClassNotFoundException
    //   226	230	548	java/lang/ClassNotFoundException
    //   232	237	548	java/lang/ClassNotFoundException
    //   244	248	548	java/lang/ClassNotFoundException
    //   254	259	548	java/lang/ClassNotFoundException
    //   265	270	548	java/lang/ClassNotFoundException
    //   276	281	548	java/lang/ClassNotFoundException
    //   287	292	548	java/lang/ClassNotFoundException
    //   294	298	548	java/lang/ClassNotFoundException
    //   299	303	548	java/lang/ClassNotFoundException
    //   309	314	548	java/lang/ClassNotFoundException
    //   320	325	548	java/lang/ClassNotFoundException
    //   327	331	548	java/lang/ClassNotFoundException
    //   333	338	548	java/lang/ClassNotFoundException
    //   345	349	548	java/lang/ClassNotFoundException
    //   355	360	548	java/lang/ClassNotFoundException
    //   366	371	548	java/lang/ClassNotFoundException
    //   377	382	548	java/lang/ClassNotFoundException
    //   388	393	548	java/lang/ClassNotFoundException
    //   395	399	548	java/lang/ClassNotFoundException
    //   400	404	548	java/lang/ClassNotFoundException
    //   410	415	548	java/lang/ClassNotFoundException
    //   421	426	548	java/lang/ClassNotFoundException
    //   428	432	548	java/lang/ClassNotFoundException
    //   434	439	548	java/lang/ClassNotFoundException
    //   446	450	548	java/lang/ClassNotFoundException
    //   456	461	548	java/lang/ClassNotFoundException
    //   467	472	548	java/lang/ClassNotFoundException
    //   478	483	548	java/lang/ClassNotFoundException
    //   486	490	548	java/lang/ClassNotFoundException
    //   495	499	548	java/lang/ClassNotFoundException
    //   504	508	548	java/lang/ClassNotFoundException
    //   513	517	548	java/lang/ClassNotFoundException
    //   9	14	553	java/lang/InstantiationException
    //   16	20	553	java/lang/InstantiationException
    //   28	32	553	java/lang/InstantiationException
    //   36	41	553	java/lang/InstantiationException
    //   46	50	553	java/lang/InstantiationException
    //   54	59	553	java/lang/InstantiationException
    //   67	72	561	java/lang/InstantiationException
    //   78	82	561	java/lang/InstantiationException
    //   88	93	561	java/lang/InstantiationException
    //   95	99	561	java/lang/InstantiationException
    //   101	106	561	java/lang/InstantiationException
    //   112	117	561	java/lang/InstantiationException
    //   123	128	561	java/lang/InstantiationException
    //   130	134	561	java/lang/InstantiationException
    //   140	145	561	java/lang/InstantiationException
    //   151	156	561	java/lang/InstantiationException
    //   158	162	561	java/lang/InstantiationException
    //   168	173	561	java/lang/InstantiationException
    //   173	177	561	java/lang/InstantiationException
    //   179	184	561	java/lang/InstantiationException
    //   197	202	561	java/lang/InstantiationException
    //   208	213	561	java/lang/InstantiationException
    //   219	224	561	java/lang/InstantiationException
    //   226	230	561	java/lang/InstantiationException
    //   232	237	561	java/lang/InstantiationException
    //   244	248	561	java/lang/InstantiationException
    //   254	259	561	java/lang/InstantiationException
    //   265	270	561	java/lang/InstantiationException
    //   276	281	561	java/lang/InstantiationException
    //   287	292	561	java/lang/InstantiationException
    //   294	298	561	java/lang/InstantiationException
    //   299	303	561	java/lang/InstantiationException
    //   309	314	561	java/lang/InstantiationException
    //   320	325	561	java/lang/InstantiationException
    //   327	331	561	java/lang/InstantiationException
    //   333	338	561	java/lang/InstantiationException
    //   345	349	561	java/lang/InstantiationException
    //   355	360	561	java/lang/InstantiationException
    //   366	371	561	java/lang/InstantiationException
    //   377	382	561	java/lang/InstantiationException
    //   388	393	561	java/lang/InstantiationException
    //   395	399	561	java/lang/InstantiationException
    //   400	404	561	java/lang/InstantiationException
    //   410	415	561	java/lang/InstantiationException
    //   421	426	561	java/lang/InstantiationException
    //   428	432	561	java/lang/InstantiationException
    //   434	439	561	java/lang/InstantiationException
    //   446	450	561	java/lang/InstantiationException
    //   456	461	561	java/lang/InstantiationException
    //   467	472	561	java/lang/InstantiationException
    //   478	483	561	java/lang/InstantiationException
    //   486	490	561	java/lang/InstantiationException
    //   495	499	561	java/lang/InstantiationException
    //   504	508	561	java/lang/InstantiationException
    //   513	517	561	java/lang/InstantiationException
    //   9	14	566	java/lang/NoSuchFieldException
    //   16	20	566	java/lang/NoSuchFieldException
    //   28	32	566	java/lang/NoSuchFieldException
    //   36	41	566	java/lang/NoSuchFieldException
    //   46	50	566	java/lang/NoSuchFieldException
    //   54	59	566	java/lang/NoSuchFieldException
    //   67	72	574	java/lang/NoSuchFieldException
    //   78	82	574	java/lang/NoSuchFieldException
    //   88	93	574	java/lang/NoSuchFieldException
    //   95	99	574	java/lang/NoSuchFieldException
    //   101	106	574	java/lang/NoSuchFieldException
    //   112	117	574	java/lang/NoSuchFieldException
    //   123	128	574	java/lang/NoSuchFieldException
    //   130	134	574	java/lang/NoSuchFieldException
    //   140	145	574	java/lang/NoSuchFieldException
    //   151	156	574	java/lang/NoSuchFieldException
    //   158	162	574	java/lang/NoSuchFieldException
    //   168	173	574	java/lang/NoSuchFieldException
    //   173	177	574	java/lang/NoSuchFieldException
    //   179	184	574	java/lang/NoSuchFieldException
    //   197	202	574	java/lang/NoSuchFieldException
    //   208	213	574	java/lang/NoSuchFieldException
    //   219	224	574	java/lang/NoSuchFieldException
    //   226	230	574	java/lang/NoSuchFieldException
    //   232	237	574	java/lang/NoSuchFieldException
    //   244	248	574	java/lang/NoSuchFieldException
    //   254	259	574	java/lang/NoSuchFieldException
    //   265	270	574	java/lang/NoSuchFieldException
    //   276	281	574	java/lang/NoSuchFieldException
    //   287	292	574	java/lang/NoSuchFieldException
    //   294	298	574	java/lang/NoSuchFieldException
    //   299	303	574	java/lang/NoSuchFieldException
    //   309	314	574	java/lang/NoSuchFieldException
    //   320	325	574	java/lang/NoSuchFieldException
    //   327	331	574	java/lang/NoSuchFieldException
    //   333	338	574	java/lang/NoSuchFieldException
    //   345	349	574	java/lang/NoSuchFieldException
    //   355	360	574	java/lang/NoSuchFieldException
    //   366	371	574	java/lang/NoSuchFieldException
    //   377	382	574	java/lang/NoSuchFieldException
    //   388	393	574	java/lang/NoSuchFieldException
    //   395	399	574	java/lang/NoSuchFieldException
    //   400	404	574	java/lang/NoSuchFieldException
    //   410	415	574	java/lang/NoSuchFieldException
    //   421	426	574	java/lang/NoSuchFieldException
    //   428	432	574	java/lang/NoSuchFieldException
    //   434	439	574	java/lang/NoSuchFieldException
    //   446	450	574	java/lang/NoSuchFieldException
    //   456	461	574	java/lang/NoSuchFieldException
    //   467	472	574	java/lang/NoSuchFieldException
    //   478	483	574	java/lang/NoSuchFieldException
    //   486	490	574	java/lang/NoSuchFieldException
    //   495	499	574	java/lang/NoSuchFieldException
    //   504	508	574	java/lang/NoSuchFieldException
    //   513	517	574	java/lang/NoSuchFieldException
    //   9	14	579	java/lang/IllegalAccessException
    //   16	20	579	java/lang/IllegalAccessException
    //   28	32	579	java/lang/IllegalAccessException
    //   36	41	579	java/lang/IllegalAccessException
    //   46	50	579	java/lang/IllegalAccessException
    //   54	59	579	java/lang/IllegalAccessException
    //   67	72	587	java/lang/IllegalAccessException
    //   78	82	587	java/lang/IllegalAccessException
    //   88	93	587	java/lang/IllegalAccessException
    //   95	99	587	java/lang/IllegalAccessException
    //   101	106	587	java/lang/IllegalAccessException
    //   112	117	587	java/lang/IllegalAccessException
    //   123	128	587	java/lang/IllegalAccessException
    //   130	134	587	java/lang/IllegalAccessException
    //   140	145	587	java/lang/IllegalAccessException
    //   151	156	587	java/lang/IllegalAccessException
    //   158	162	587	java/lang/IllegalAccessException
    //   168	173	587	java/lang/IllegalAccessException
    //   173	177	587	java/lang/IllegalAccessException
    //   179	184	587	java/lang/IllegalAccessException
    //   197	202	587	java/lang/IllegalAccessException
    //   208	213	587	java/lang/IllegalAccessException
    //   219	224	587	java/lang/IllegalAccessException
    //   226	230	587	java/lang/IllegalAccessException
    //   232	237	587	java/lang/IllegalAccessException
    //   244	248	587	java/lang/IllegalAccessException
    //   254	259	587	java/lang/IllegalAccessException
    //   265	270	587	java/lang/IllegalAccessException
    //   276	281	587	java/lang/IllegalAccessException
    //   287	292	587	java/lang/IllegalAccessException
    //   294	298	587	java/lang/IllegalAccessException
    //   299	303	587	java/lang/IllegalAccessException
    //   309	314	587	java/lang/IllegalAccessException
    //   320	325	587	java/lang/IllegalAccessException
    //   327	331	587	java/lang/IllegalAccessException
    //   333	338	587	java/lang/IllegalAccessException
    //   345	349	587	java/lang/IllegalAccessException
    //   355	360	587	java/lang/IllegalAccessException
    //   366	371	587	java/lang/IllegalAccessException
    //   377	382	587	java/lang/IllegalAccessException
    //   388	393	587	java/lang/IllegalAccessException
    //   395	399	587	java/lang/IllegalAccessException
    //   400	404	587	java/lang/IllegalAccessException
    //   410	415	587	java/lang/IllegalAccessException
    //   421	426	587	java/lang/IllegalAccessException
    //   428	432	587	java/lang/IllegalAccessException
    //   434	439	587	java/lang/IllegalAccessException
    //   446	450	587	java/lang/IllegalAccessException
    //   456	461	587	java/lang/IllegalAccessException
    //   467	472	587	java/lang/IllegalAccessException
    //   478	483	587	java/lang/IllegalAccessException
    //   486	490	587	java/lang/IllegalAccessException
    //   495	499	587	java/lang/IllegalAccessException
    //   504	508	587	java/lang/IllegalAccessException
    //   513	517	587	java/lang/IllegalAccessException
    //   9	14	592	java/lang/NoSuchMethodException
    //   16	20	592	java/lang/NoSuchMethodException
    //   28	32	592	java/lang/NoSuchMethodException
    //   36	41	592	java/lang/NoSuchMethodException
    //   46	50	592	java/lang/NoSuchMethodException
    //   54	59	592	java/lang/NoSuchMethodException
    //   67	72	600	java/lang/NoSuchMethodException
    //   78	82	600	java/lang/NoSuchMethodException
    //   88	93	600	java/lang/NoSuchMethodException
    //   95	99	600	java/lang/NoSuchMethodException
    //   101	106	600	java/lang/NoSuchMethodException
    //   112	117	600	java/lang/NoSuchMethodException
    //   123	128	600	java/lang/NoSuchMethodException
    //   130	134	600	java/lang/NoSuchMethodException
    //   140	145	600	java/lang/NoSuchMethodException
    //   151	156	600	java/lang/NoSuchMethodException
    //   158	162	600	java/lang/NoSuchMethodException
    //   168	173	600	java/lang/NoSuchMethodException
    //   173	177	600	java/lang/NoSuchMethodException
    //   179	184	600	java/lang/NoSuchMethodException
    //   197	202	600	java/lang/NoSuchMethodException
    //   208	213	600	java/lang/NoSuchMethodException
    //   219	224	600	java/lang/NoSuchMethodException
    //   226	230	600	java/lang/NoSuchMethodException
    //   232	237	600	java/lang/NoSuchMethodException
    //   244	248	600	java/lang/NoSuchMethodException
    //   254	259	600	java/lang/NoSuchMethodException
    //   265	270	600	java/lang/NoSuchMethodException
    //   276	281	600	java/lang/NoSuchMethodException
    //   287	292	600	java/lang/NoSuchMethodException
    //   294	298	600	java/lang/NoSuchMethodException
    //   299	303	600	java/lang/NoSuchMethodException
    //   309	314	600	java/lang/NoSuchMethodException
    //   320	325	600	java/lang/NoSuchMethodException
    //   327	331	600	java/lang/NoSuchMethodException
    //   333	338	600	java/lang/NoSuchMethodException
    //   345	349	600	java/lang/NoSuchMethodException
    //   355	360	600	java/lang/NoSuchMethodException
    //   366	371	600	java/lang/NoSuchMethodException
    //   377	382	600	java/lang/NoSuchMethodException
    //   388	393	600	java/lang/NoSuchMethodException
    //   395	399	600	java/lang/NoSuchMethodException
    //   400	404	600	java/lang/NoSuchMethodException
    //   410	415	600	java/lang/NoSuchMethodException
    //   421	426	600	java/lang/NoSuchMethodException
    //   428	432	600	java/lang/NoSuchMethodException
    //   434	439	600	java/lang/NoSuchMethodException
    //   446	450	600	java/lang/NoSuchMethodException
    //   456	461	600	java/lang/NoSuchMethodException
    //   467	472	600	java/lang/NoSuchMethodException
    //   478	483	600	java/lang/NoSuchMethodException
    //   486	490	600	java/lang/NoSuchMethodException
    //   495	499	600	java/lang/NoSuchMethodException
    //   504	508	600	java/lang/NoSuchMethodException
    //   513	517	600	java/lang/NoSuchMethodException
    //   9	14	605	java/lang/reflect/InvocationTargetException
    //   16	20	605	java/lang/reflect/InvocationTargetException
    //   28	32	605	java/lang/reflect/InvocationTargetException
    //   36	41	605	java/lang/reflect/InvocationTargetException
    //   46	50	605	java/lang/reflect/InvocationTargetException
    //   54	59	605	java/lang/reflect/InvocationTargetException
    //   67	72	613	java/lang/reflect/InvocationTargetException
    //   78	82	613	java/lang/reflect/InvocationTargetException
    //   88	93	613	java/lang/reflect/InvocationTargetException
    //   95	99	613	java/lang/reflect/InvocationTargetException
    //   101	106	613	java/lang/reflect/InvocationTargetException
    //   112	117	613	java/lang/reflect/InvocationTargetException
    //   123	128	613	java/lang/reflect/InvocationTargetException
    //   130	134	613	java/lang/reflect/InvocationTargetException
    //   140	145	613	java/lang/reflect/InvocationTargetException
    //   151	156	613	java/lang/reflect/InvocationTargetException
    //   158	162	613	java/lang/reflect/InvocationTargetException
    //   168	173	613	java/lang/reflect/InvocationTargetException
    //   173	177	613	java/lang/reflect/InvocationTargetException
    //   179	184	613	java/lang/reflect/InvocationTargetException
    //   197	202	613	java/lang/reflect/InvocationTargetException
    //   208	213	613	java/lang/reflect/InvocationTargetException
    //   219	224	613	java/lang/reflect/InvocationTargetException
    //   226	230	613	java/lang/reflect/InvocationTargetException
    //   232	237	613	java/lang/reflect/InvocationTargetException
    //   244	248	613	java/lang/reflect/InvocationTargetException
    //   254	259	613	java/lang/reflect/InvocationTargetException
    //   265	270	613	java/lang/reflect/InvocationTargetException
    //   276	281	613	java/lang/reflect/InvocationTargetException
    //   287	292	613	java/lang/reflect/InvocationTargetException
    //   294	298	613	java/lang/reflect/InvocationTargetException
    //   299	303	613	java/lang/reflect/InvocationTargetException
    //   309	314	613	java/lang/reflect/InvocationTargetException
    //   320	325	613	java/lang/reflect/InvocationTargetException
    //   327	331	613	java/lang/reflect/InvocationTargetException
    //   333	338	613	java/lang/reflect/InvocationTargetException
    //   345	349	613	java/lang/reflect/InvocationTargetException
    //   355	360	613	java/lang/reflect/InvocationTargetException
    //   366	371	613	java/lang/reflect/InvocationTargetException
    //   377	382	613	java/lang/reflect/InvocationTargetException
    //   388	393	613	java/lang/reflect/InvocationTargetException
    //   395	399	613	java/lang/reflect/InvocationTargetException
    //   400	404	613	java/lang/reflect/InvocationTargetException
    //   410	415	613	java/lang/reflect/InvocationTargetException
    //   421	426	613	java/lang/reflect/InvocationTargetException
    //   428	432	613	java/lang/reflect/InvocationTargetException
    //   434	439	613	java/lang/reflect/InvocationTargetException
    //   446	450	613	java/lang/reflect/InvocationTargetException
    //   456	461	613	java/lang/reflect/InvocationTargetException
    //   467	472	613	java/lang/reflect/InvocationTargetException
    //   478	483	613	java/lang/reflect/InvocationTargetException
    //   486	490	613	java/lang/reflect/InvocationTargetException
    //   495	499	613	java/lang/reflect/InvocationTargetException
    //   504	508	613	java/lang/reflect/InvocationTargetException
    //   513	517	613	java/lang/reflect/InvocationTargetException
  }
  
  static String a(gg.b paramb, d paramd)
  {
    if (paramb != null)
    {
      str = i;
      boolean bool = TextUtils.isEmpty(str);
      if (bool) {}
    }
    for (String str = i;; str = e) {
      return str;
    }
  }
  
  static String a(Object paramObject)
  {
    return (String)Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty").getField("mName").get(paramObject);
  }
  
  static List a(AppMeasurement paramAppMeasurement, String paramString)
  {
    int i = 2;
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = AppMeasurement.class;
    localObject4 = "getConditionalUserProperties";
    int j = 2;
    try
    {
      localObject5 = new Class[j];
      int k = 0;
      localObject6 = null;
      Class localClass = String.class;
      localObject5[0] = localClass;
      k = 1;
      localClass = String.class;
      localObject5[k] = localClass;
      localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject4, (Class[])localObject5);
      boolean bool1 = true;
      ((Method)localObject2).setAccessible(bool1);
      m = 2;
      localObject4 = new Object[m];
      j = 0;
      localObject5 = null;
      localObject4[0] = paramString;
      j = 1;
      localObject6 = "";
      localObject4[j] = localObject6;
      localObject2 = ((Method)localObject2).invoke(paramAppMeasurement, (Object[])localObject4);
      localObject2 = (List)localObject2;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Object localObject6;
        int m;
        boolean bool2;
        localObject4 = "FirebaseAbtUtil";
        Object localObject5 = "Could not complete the operation due to an internal error.";
        Log.e((String)localObject4, (String)localObject5, localIllegalAccessException);
        Object localObject3 = localObject1;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
    localObject1 = "FirebaseAbtUtil";
    bool2 = Log.isLoggable((String)localObject1, i);
    if (bool2)
    {
      localObject1 = "FirebaseAbtUtil";
      m = ((List)localObject2).size();
      j = String.valueOf(paramString).length() + 55;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>(j);
      localObject5 = ((StringBuilder)localObject6).append("Number of currently set _Es for origin: ").append(paramString);
      localObject6 = " is ";
      localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
      localObject4 = m;
      Log.v((String)localObject1, (String)localObject4);
    }
    return (List)localObject2;
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int i = 2;
    Object localObject1 = "FirebaseAbtUtil";
    boolean bool1 = Log.isLoggable((String)localObject1, i);
    Object localObject2;
    Object localObject3;
    int j;
    if (bool1)
    {
      localObject2 = "FirebaseAbtUtil";
      localObject3 = "_CE(experimentId) called by ";
      localObject1 = String.valueOf(paramString1);
      j = ((String)localObject1).length();
      if (j != 0)
      {
        localObject1 = ((String)localObject3).concat((String)localObject1);
        Log.v((String)localObject2, (String)localObject1);
      }
    }
    else
    {
      bool1 = b(paramContext);
      if (bool1) {
        break label91;
      }
    }
    for (;;)
    {
      return;
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject3);
      break;
      label91:
      localObject1 = a(paramContext);
      localObject2 = AppMeasurement.class;
      localObject3 = "clearConditionalUserProperty";
      j = 3;
      try
      {
        Object localObject4 = new Class[j];
        int k = 0;
        Object localObject5 = null;
        Class localClass = String.class;
        localObject4[0] = localClass;
        k = 1;
        localClass = String.class;
        localObject4[k] = localClass;
        k = 2;
        localClass = Bundle.class;
        localObject4[k] = localClass;
        localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject3, (Class[])localObject4);
        boolean bool2 = true;
        ((Method)localObject2).setAccessible(bool2);
        localObject3 = "FirebaseAbtUtil";
        j = 2;
        bool2 = Log.isLoggable((String)localObject3, j);
        if (bool2)
        {
          localObject3 = "FirebaseAbtUtil";
          localObject4 = String.valueOf(paramString2);
          j = ((String)localObject4).length() + 17;
          localObject5 = String.valueOf(paramString3);
          k = ((String)localObject5).length();
          j += k;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>(j);
          localObject4 = "Clearing _E: [";
          localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject4 = ((StringBuilder)localObject4).append(paramString2);
          localObject5 = ", ";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).append(paramString3);
          localObject5 = "]";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).toString();
          Log.v((String)localObject3, (String)localObject4);
        }
        int m = 3;
        localObject3 = new Object[m];
        j = 0;
        localObject4 = null;
        localObject3[0] = paramString2;
        j = 1;
        localObject3[j] = paramString4;
        j = 2;
        localObject5 = a(paramString2, paramString3);
        localObject3[j] = localObject5;
        ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localObject2 = "FirebaseAbtUtil";
        localObject3 = "Could not complete the operation due to an internal error.";
        Log.e((String)localObject2, (String)localObject3, localNoSuchMethodException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        for (;;) {}
      }
    }
  }
  
  static void a(AppMeasurement paramAppMeasurement, Context paramContext, String paramString, gg.b paramb, d paramd)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 2;
    int m = 1;
    Object localObject3 = "FirebaseAbtUtil";
    boolean bool3 = Log.isLoggable((String)localObject3, j);
    Object localObject4;
    Object localObject5;
    int i3;
    int i4;
    Object localObject6;
    Object localObject7;
    if (bool3)
    {
      localObject3 = "FirebaseAbtUtil";
      localObject4 = String.valueOf(a);
      localObject5 = String.valueOf(b);
      i3 = String.valueOf(localObject4).length() + 7;
      i4 = String.valueOf(localObject5).length();
      i3 += i4;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>(i3);
      localObject4 = ((StringBuilder)localObject6).append("_SEI: ").append((String)localObject4);
      localObject7 = " ";
      localObject4 = (String)localObject7 + (String)localObject5;
      Log.v((String)localObject3, (String)localObject4);
    }
    localObject3 = "com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty";
    int i5;
    Object localObject8;
    try
    {
      Class.forName((String)localObject3);
      localObject3 = a(paramAppMeasurement, paramString);
      j = b(paramAppMeasurement, paramString);
      localObject5 = a(paramAppMeasurement, paramString);
      i5 = ((List)localObject5).size();
      if (i5 >= j) {
        i = m;
      }
      if (i == 0) {
        break label374;
      }
      i = l;
      if (i == 0) {
        break label653;
      }
      i = l;
    }
    catch (ClassNotFoundException localClassNotFoundException1)
    {
      boolean bool2;
      int n;
      localObject8 = "FirebaseAbtUtil";
      localObject3 = "Could not complete the operation due to an internal error.";
      Log.e((String)localObject8, (String)localObject3, localClassNotFoundException1);
      for (;;)
      {
        return;
        i = n;
        break;
        str1 = "FirebaseAbtUtil";
        i1 = 2;
        bool1 = Log.isLoggable(str1, i1);
        if (bool1)
        {
          str1 = "FirebaseAbtUtil";
          localObject8 = a;
          localObject8 = String.valueOf(localObject8);
          localObject3 = b;
          localObject3 = String.valueOf(localObject3);
          localObject4 = String.valueOf(localObject8);
          k = ((String)localObject4).length() + 44;
          localObject5 = String.valueOf(localObject3);
          i5 = ((String)localObject5).length();
          k += i5;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>(k);
          localObject4 = "_E won't be set due to overflow policy. [";
          localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject8 = ((StringBuilder)localObject4).append((String)localObject8);
          localObject4 = ", ";
          localObject8 = ((StringBuilder)localObject8).append((String)localObject4);
          localObject8 = ((StringBuilder)localObject8).append((String)localObject3);
          localObject3 = "]";
          localObject8 = ((StringBuilder)localObject8).append((String)localObject3);
          localObject8 = ((StringBuilder)localObject8).toString();
          Log.v(str1, (String)localObject8);
        }
      }
    }
    catch (IllegalAccessException localIllegalAccessException1)
    {
      for (;;)
      {
        continue;
        localObject8 = a(paramb, paramString, paramd);
        if (localObject8 != null) {
          break;
        }
        str2 = "FirebaseAbtUtil";
        i1 = 2;
        bool1 = Log.isLoggable(str2, i1);
        if (bool1)
        {
          str2 = "FirebaseAbtUtil";
          localObject8 = a;
          localObject8 = String.valueOf(localObject8);
          localObject3 = b;
          localObject3 = String.valueOf(localObject3);
          localObject4 = String.valueOf(localObject8);
          k = ((String)localObject4).length() + 42;
          localObject5 = String.valueOf(localObject3);
          i5 = ((String)localObject5).length();
          k += i5;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>(k);
          localObject4 = "Could not create _CUP for: [";
          localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject8 = ((StringBuilder)localObject4).append((String)localObject8);
          localObject4 = ", ";
          localObject8 = ((StringBuilder)localObject8).append((String)localObject4);
          localObject8 = ((StringBuilder)localObject8).append((String)localObject3);
          localObject3 = "]. Skipping.";
          localObject8 = ((StringBuilder)localObject8).append((String)localObject3);
          localObject8 = ((StringBuilder)localObject8).toString();
          Log.v(str2, (String)localObject8);
        }
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      label374:
      label653:
      for (;;) {}
      localObject2 = "FirebaseAbtUtil";
      i2 = 2;
      bool1 = Log.isLoggable((String)localObject2, i2);
      if (!bool1) {
        break label1275;
      }
      localObject2 = "FirebaseAbtUtil";
      localObject3 = a;
      localObject3 = String.valueOf(localObject3);
      localObject4 = b;
      localObject4 = String.valueOf(localObject4);
      localObject5 = d;
      localObject5 = String.valueOf(localObject5);
      localObject7 = String.valueOf(localObject3);
      i3 = ((String)localObject7).length() + 27;
      localObject6 = String.valueOf(localObject4);
      i4 = ((String)localObject6).length();
      i3 += i4;
      localObject6 = String.valueOf(localObject5);
      i4 = ((String)localObject6).length();
      i3 += i4;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>(i3);
      localObject7 = "Setting _CUP for _E: [";
      localObject7 = ((StringBuilder)localObject6).append((String)localObject7);
      localObject3 = ((StringBuilder)localObject7).append((String)localObject3);
      localObject7 = ", ";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject7);
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = ", ";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
      localObject4 = "]";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).toString();
      Log.v((String)localObject2, (String)localObject3);
      label1275:
      localObject2 = "com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty";
    }
    if (i == m)
    {
      i = 0;
      localObject1 = null;
      localObject1 = ((List)localObject3).get(0);
      localObject8 = a(localObject1);
      localObject1 = b(localObject1);
      localObject4 = "FirebaseAbtUtil";
      i5 = 2;
      bool2 = Log.isLoggable((String)localObject4, i5);
      if (bool2)
      {
        localObject4 = "FirebaseAbtUtil";
        localObject5 = String.valueOf(localObject8);
        i5 = ((String)localObject5).length() + 38;
        localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>(i5);
        localObject5 = "Clearing _E due to overflow policy: [";
        localObject5 = ((StringBuilder)localObject7).append((String)localObject5);
        localObject5 = ((StringBuilder)localObject5).append((String)localObject8);
        localObject7 = "]";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject7);
        localObject5 = ((StringBuilder)localObject5).toString();
        Log.v((String)localObject4, (String)localObject5);
      }
      localObject4 = a(paramb, paramd);
      a(paramContext, paramString, (String)localObject8, (String)localObject1, (String)localObject4);
      localObject1 = ((List)localObject3).iterator();
      for (;;)
      {
        n = ((Iterator)localObject1).hasNext();
        if (n == 0) {
          break;
        }
        localObject8 = ((Iterator)localObject1).next();
        localObject3 = a(localObject8);
        localObject8 = b(localObject8);
        localObject4 = a;
        bool2 = ((String)localObject3).equals(localObject4);
        if (bool2)
        {
          localObject4 = b;
          bool2 = ((String)localObject8).equals(localObject4);
          if (!bool2)
          {
            localObject4 = "FirebaseAbtUtil";
            i5 = 2;
            bool2 = Log.isLoggable((String)localObject4, i5);
            if (bool2)
            {
              localObject4 = "FirebaseAbtUtil";
              localObject5 = String.valueOf(localObject3);
              i5 = ((String)localObject5).length() + 77;
              localObject7 = String.valueOf(localObject8);
              i3 = ((String)localObject7).length();
              i5 += i3;
              localObject7 = new java/lang/StringBuilder;
              ((StringBuilder)localObject7).<init>(i5);
              localObject5 = "Clearing _E, as only one _V of the same _E can be set atany given time: [";
              localObject5 = ((StringBuilder)localObject7).append((String)localObject5);
              localObject5 = ((StringBuilder)localObject5).append((String)localObject3);
              localObject7 = ", ";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject7);
              localObject5 = ((StringBuilder)localObject5).append((String)localObject8);
              localObject7 = "].";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject7);
              localObject5 = ((StringBuilder)localObject5).toString();
              Log.v((String)localObject4, (String)localObject5);
              localObject4 = a(paramb, paramd);
              a(paramContext, paramString, (String)localObject3, (String)localObject8, (String)localObject4);
            }
          }
        }
      }
    }
    try
    {
      String str1;
      int i1;
      int k;
      String str2;
      int i2;
      Object localObject2 = Class.forName((String)localObject2);
      localObject3 = AppMeasurement.class;
      localObject4 = "setConditionalUserProperty";
      i5 = 1;
      localObject5 = new Class[i5];
      i3 = 0;
      localObject7 = null;
      localObject5[0] = localObject2;
      localObject3 = ((Class)localObject3).getDeclaredMethod((String)localObject4, (Class[])localObject5);
      boolean bool1 = true;
      ((Method)localObject3).setAccessible(bool1);
      localObject2 = g;
      bool1 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool1)
      {
        localObject2 = g;
        localObject4 = a(paramb);
        paramAppMeasurement.logEventInternal(paramString, (String)localObject2, (Bundle)localObject4);
        bool1 = true;
        localObject2 = new Object[bool1];
        k = 0;
        localObject4 = null;
        localObject2[0] = localObject8;
        ((Method)localObject3).invoke(paramAppMeasurement, (Object[])localObject2);
      }
    }
    catch (ClassNotFoundException localClassNotFoundException2)
    {
      for (;;)
      {
        localObject8 = "FirebaseAbtUtil";
        localObject3 = "Could not complete the operation due to an internal error.";
        Log.e((String)localObject8, (String)localObject3, localClassNotFoundException2);
        continue;
        String str3 = a;
      }
    }
    catch (IllegalAccessException localIllegalAccessException2)
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
  
  private static int b(AppMeasurement paramAppMeasurement, String paramString)
  {
    Object localObject1 = AppMeasurement.class;
    localObject2 = "getMaxUserProperties";
    int i = 1;
    try
    {
      localObject3 = new Class[i];
      Class localClass = String.class;
      localObject3[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
      boolean bool = true;
      ((Method)localObject1).setAccessible(bool);
      bool = true;
      localObject2 = new Object[bool];
      i = 0;
      localObject3 = null;
      localObject2[0] = paramString;
      localObject1 = ((Method)localObject1).invoke(paramAppMeasurement, (Object[])localObject2);
      localObject1 = (Integer)localObject1;
      j = ((Integer)localObject1).intValue();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localObject2 = "FirebaseAbtUtil";
        Object localObject3 = "Could not complete the operation due to an internal error.";
        Log.e((String)localObject2, (String)localObject3, localIllegalAccessException);
        int j = 20;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
    return j;
  }
  
  static String b(Object paramObject)
  {
    return (String)Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty").getField("mValue").get(paramObject);
  }
  
  static boolean b(Context paramContext)
  {
    int i = 2;
    boolean bool1 = false;
    Object localObject = a(paramContext);
    boolean bool2;
    String str2;
    if (localObject == null)
    {
      localObject = "FirebaseAbtUtil";
      bool2 = Log.isLoggable((String)localObject, i);
      if (bool2)
      {
        localObject = "FirebaseAbtUtil";
        str2 = "Firebase Analytics not available";
        Log.v((String)localObject, str2);
      }
    }
    for (;;)
    {
      return bool1;
      localObject = "com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty";
      String str1;
      try
      {
        Class.forName((String)localObject);
        bool1 = true;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        str1 = "FirebaseAbtUtil";
        bool2 = Log.isLoggable(str1, i);
      }
      if (bool2)
      {
        str1 = "FirebaseAbtUtil";
        str2 = "Firebase Analytics library is missing support for abt. Please update to a more recent version.";
        Log.v(str1, str2);
      }
    }
  }
}


/* Location:              com/google/firebase/messaging/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */