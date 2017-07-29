package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@qi
public final class rh
  extends qx.a
{
  private static final Object a = new Object();
  private static rh b;
  private final Context c;
  private final rg d;
  private final jw e;
  private final nj f;
  
  private rh(Context paramContext, jw paramjw, rg paramrg)
  {
    c = paramContext;
    d = paramrg;
    e = paramjw;
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    for (;;)
    {
      f = new nj(paramContext, un.a(), a, new ty()new nj.b {}, new nj.b());
      return;
    }
  }
  
  /* Error */
  private static qr a(final Context paramContext, nj paramnj, rg paramrg, final qo paramqo)
  {
    // Byte code:
    //   0: ldc 91
    //   2: invokestatic 96	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: invokestatic 101	com/google/android/gms/b/ke:a	(Landroid/content/Context;)V
    //   9: getstatic 105	com/google/android/gms/b/ke:T	Lcom/google/android/gms/b/jz;
    //   12: astore 5
    //   14: new 107	com/google/android/gms/b/km
    //   17: dup
    //   18: invokestatic 113	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   21: aload 5
    //   23: invokevirtual 118	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   26: checkcast 120	java/lang/Boolean
    //   29: invokevirtual 124	java/lang/Boolean:booleanValue	()Z
    //   32: ldc 126
    //   34: aload_3
    //   35: getfield 131	com/google/android/gms/b/qo:d	Lcom/google/android/gms/b/il;
    //   38: getfield 134	com/google/android/gms/b/il:a	Ljava/lang/String;
    //   41: invokespecial 137	com/google/android/gms/b/km:<init>	(ZLjava/lang/String;Ljava/lang/String;)V
    //   44: astore 10
    //   46: aload_3
    //   47: getfield 140	com/google/android/gms/b/qo:a	I
    //   50: bipush 10
    //   52: if_icmple +38 -> 90
    //   55: aload_3
    //   56: getfield 144	com/google/android/gms/b/qo:A	J
    //   59: ldc2_w 145
    //   62: lcmp
    //   63: ifeq +27 -> 90
    //   66: aload 10
    //   68: aload 10
    //   70: aload_3
    //   71: getfield 144	com/google/android/gms/b/qo:A	J
    //   74: invokevirtual 149	com/google/android/gms/b/km:a	(J)Lcom/google/android/gms/b/kk;
    //   77: iconst_1
    //   78: anewarray 151	java/lang/String
    //   81: dup
    //   82: iconst_0
    //   83: ldc -103
    //   85: aastore
    //   86: invokevirtual 156	com/google/android/gms/b/km:a	(Lcom/google/android/gms/b/kk;[Ljava/lang/String;)Z
    //   89: pop
    //   90: aload 10
    //   92: invokevirtual 159	com/google/android/gms/b/km:a	()Lcom/google/android/gms/b/kk;
    //   95: astore 11
    //   97: aload_2
    //   98: getfield 165	com/google/android/gms/b/rg:i	Lcom/google/android/gms/b/pf;
    //   101: invokeinterface 170 1 0
    //   106: astore 17
    //   108: aload_2
    //   109: getfield 174	com/google/android/gms/b/rg:h	Lcom/google/android/gms/b/rr;
    //   112: invokeinterface 179 1 0
    //   117: astore 16
    //   119: aload_2
    //   120: getfield 182	com/google/android/gms/b/rg:c	Lcom/google/android/gms/b/tb;
    //   123: astore 5
    //   125: aload_3
    //   126: getfield 186	com/google/android/gms/b/qo:g	Landroid/content/pm/PackageInfo;
    //   129: getfield 191	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   132: astore 6
    //   134: aload 5
    //   136: invokeinterface 194 1 0
    //   141: astore 13
    //   143: aload_2
    //   144: getfield 198	com/google/android/gms/b/rg:j	Lcom/google/android/gms/b/tf;
    //   147: aload_3
    //   148: invokeinterface 203 2 0
    //   153: astore 15
    //   155: invokestatic 207	com/google/android/gms/ads/internal/w:n	()Lcom/google/android/gms/b/ro;
    //   158: aload_0
    //   159: invokevirtual 212	com/google/android/gms/b/ro:a	(Landroid/content/Context;)Ljava/util/concurrent/Future;
    //   162: astore 12
    //   164: new 214	com/google/android/gms/b/uq
    //   167: dup
    //   168: aconst_null
    //   169: invokespecial 217	com/google/android/gms/b/uq:<init>	(Ljava/lang/Object;)V
    //   172: astore 7
    //   174: aload_3
    //   175: getfield 220	com/google/android/gms/b/qo:c	Lcom/google/android/gms/b/ih;
    //   178: getfield 225	com/google/android/gms/b/ih:c	Landroid/os/Bundle;
    //   181: astore 5
    //   183: aload 5
    //   185: ifnull +333 -> 518
    //   188: aload 5
    //   190: ldc -29
    //   192: invokevirtual 233	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   195: ifnull +323 -> 518
    //   198: iconst_1
    //   199: istore 4
    //   201: aload_3
    //   202: getfield 237	com/google/android/gms/b/qo:H	Z
    //   205: ifeq +1199 -> 1404
    //   208: iload 4
    //   210: ifne +1194 -> 1404
    //   213: aload_2
    //   214: getfield 240	com/google/android/gms/b/rg:f	Lcom/google/android/gms/b/no;
    //   217: astore 5
    //   219: aload_3
    //   220: getfield 243	com/google/android/gms/b/qo:f	Landroid/content/pm/ApplicationInfo;
    //   223: astore 6
    //   225: aload 5
    //   227: invokeinterface 246 1 0
    //   232: astore 7
    //   234: new 214	com/google/android/gms/b/uq
    //   237: dup
    //   238: aconst_null
    //   239: invokespecial 217	com/google/android/gms/b/uq:<init>	(Ljava/lang/Object;)V
    //   242: astore 8
    //   244: getstatic 249	com/google/android/gms/b/ke:aM	Lcom/google/android/gms/b/jz;
    //   247: astore 5
    //   249: invokestatic 113	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   252: aload 5
    //   254: invokevirtual 118	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   257: checkcast 120	java/lang/Boolean
    //   260: invokevirtual 124	java/lang/Boolean:booleanValue	()Z
    //   263: ifeq +1138 -> 1401
    //   266: aload_2
    //   267: getfield 198	com/google/android/gms/b/rg:j	Lcom/google/android/gms/b/tf;
    //   270: aload_0
    //   271: invokeinterface 252 2 0
    //   276: astore 8
    //   278: aload_3
    //   279: getfield 140	com/google/android/gms/b/qo:a	I
    //   282: iconst_4
    //   283: if_icmplt +1112 -> 1395
    //   286: aload_3
    //   287: getfield 255	com/google/android/gms/b/qo:o	Landroid/os/Bundle;
    //   290: ifnull +1105 -> 1395
    //   293: aload_3
    //   294: getfield 255	com/google/android/gms/b/qo:o	Landroid/os/Bundle;
    //   297: astore 5
    //   299: getstatic 258	com/google/android/gms/b/ke:aj	Lcom/google/android/gms/b/jz;
    //   302: astore 6
    //   304: invokestatic 113	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   307: aload 6
    //   309: invokevirtual 118	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   312: checkcast 120	java/lang/Boolean
    //   315: invokevirtual 124	java/lang/Boolean:booleanValue	()Z
    //   318: ifeq +1071 -> 1389
    //   321: aload_2
    //   322: getfield 261	com/google/android/gms/b/rg:a	Lcom/google/android/gms/b/rl;
    //   325: ifnull +1064 -> 1389
    //   328: aload 5
    //   330: astore 6
    //   332: aload 5
    //   334: ifnonnull +44 -> 378
    //   337: getstatic 264	com/google/android/gms/b/ke:ak	Lcom/google/android/gms/b/jz;
    //   340: astore 9
    //   342: aload 5
    //   344: astore 6
    //   346: invokestatic 113	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   349: aload 9
    //   351: invokevirtual 118	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   354: checkcast 120	java/lang/Boolean
    //   357: invokevirtual 124	java/lang/Boolean:booleanValue	()Z
    //   360: ifeq +18 -> 378
    //   363: ldc_w 266
    //   366: invokestatic 268	com/google/android/gms/b/tp:a	(Ljava/lang/String;)V
    //   369: new 229	android/os/Bundle
    //   372: dup
    //   373: invokespecial 269	android/os/Bundle:<init>	()V
    //   376: astore 6
    //   378: aload 6
    //   380: ifnull +999 -> 1379
    //   383: new 6	com/google/android/gms/b/rh$1
    //   386: dup
    //   387: aload_2
    //   388: aload_0
    //   389: aload_3
    //   390: aload 6
    //   392: invokespecial 272	com/google/android/gms/b/rh$1:<init>	(Lcom/google/android/gms/b/rg;Landroid/content/Context;Lcom/google/android/gms/b/qo;Landroid/os/Bundle;)V
    //   395: invokestatic 277	com/google/android/gms/b/ts:a	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/b/us;
    //   398: astore 9
    //   400: aload 6
    //   402: astore 5
    //   404: aload 9
    //   406: astore 6
    //   408: invokestatic 280	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   411: pop
    //   412: aload_0
    //   413: aload_0
    //   414: invokevirtual 284	android/content/Context:getPackageName	()Ljava/lang/String;
    //   417: ldc_w 286
    //   420: invokestatic 291	com/google/android/gms/b/tt:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    //   423: ifeq +25 -> 448
    //   426: aload_0
    //   427: ldc_w 293
    //   430: invokevirtual 297	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   433: checkcast 299	android/net/ConnectivityManager
    //   436: invokevirtual 303	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   439: ifnonnull +9 -> 448
    //   442: ldc_w 305
    //   445: invokestatic 96	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   448: aload_3
    //   449: getfield 140	com/google/android/gms/b/qo:a	I
    //   452: bipush 7
    //   454: if_icmplt +70 -> 524
    //   457: aload_3
    //   458: getfield 308	com/google/android/gms/b/qo:v	Ljava/lang/String;
    //   461: astore 9
    //   463: new 310	com/google/android/gms/b/rj
    //   466: dup
    //   467: aload 9
    //   469: aload_3
    //   470: getfield 243	com/google/android/gms/b/qo:f	Landroid/content/pm/ApplicationInfo;
    //   473: getfield 313	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   476: invokespecial 316	com/google/android/gms/b/rj:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   479: astore 14
    //   481: aload_3
    //   482: getfield 220	com/google/android/gms/b/qo:c	Lcom/google/android/gms/b/ih;
    //   485: getfield 225	com/google/android/gms/b/ih:c	Landroid/os/Bundle;
    //   488: ifnull +47 -> 535
    //   491: aload_3
    //   492: getfield 220	com/google/android/gms/b/qo:c	Lcom/google/android/gms/b/ih;
    //   495: getfield 225	com/google/android/gms/b/ih:c	Landroid/os/Bundle;
    //   498: ldc -29
    //   500: invokevirtual 233	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   503: astore 18
    //   505: aload 18
    //   507: ifnull +28 -> 535
    //   510: aload_0
    //   511: aload_3
    //   512: aload 18
    //   514: invokestatic 321	com/google/android/gms/b/ri:a	(Landroid/content/Context;Lcom/google/android/gms/b/qo;Ljava/lang/String;)Lcom/google/android/gms/b/qr;
    //   517: areturn
    //   518: iconst_0
    //   519: istore 4
    //   521: goto -320 -> 201
    //   524: invokestatic 327	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   527: invokevirtual 330	java/util/UUID:toString	()Ljava/lang/String;
    //   530: astore 9
    //   532: goto -69 -> 463
    //   535: aload_2
    //   536: getfield 333	com/google/android/gms/b/rg:d	Lcom/google/android/gms/b/jy;
    //   539: aload_3
    //   540: invokeinterface 338 2 0
    //   545: astore 18
    //   547: aload 6
    //   549: ifnull +45 -> 594
    //   552: ldc_w 340
    //   555: invokestatic 268	com/google/android/gms/b/tp:a	(Ljava/lang/String;)V
    //   558: getstatic 343	com/google/android/gms/b/ke:al	Lcom/google/android/gms/b/jz;
    //   561: astore 19
    //   563: aload 6
    //   565: invokestatic 113	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   568: aload 19
    //   570: invokevirtual 118	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   573: checkcast 345	java/lang/Long
    //   576: invokevirtual 349	java/lang/Long:longValue	()J
    //   579: getstatic 355	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   582: invokeinterface 361 4 0
    //   587: pop
    //   588: ldc_w 363
    //   591: invokestatic 268	com/google/android/gms/b/tp:a	(Ljava/lang/String;)V
    //   594: getstatic 366	com/google/android/gms/b/ke:cR	Lcom/google/android/gms/b/jz;
    //   597: astore 6
    //   599: aload 17
    //   601: invokestatic 113	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   604: aload 6
    //   606: invokevirtual 118	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   609: checkcast 345	java/lang/Long
    //   612: invokestatic 369	com/google/android/gms/b/rh:a	(Ljava/util/concurrent/Future;Ljava/lang/Long;)Ljava/lang/Object;
    //   615: checkcast 229	android/os/Bundle
    //   618: astore 17
    //   620: getstatic 372	com/google/android/gms/b/ke:bB	Lcom/google/android/gms/b/jz;
    //   623: astore 6
    //   625: aload 16
    //   627: invokestatic 113	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   630: aload 6
    //   632: invokevirtual 118	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   635: checkcast 345	java/lang/Long
    //   638: invokestatic 369	com/google/android/gms/b/rh:a	(Ljava/util/concurrent/Future;Ljava/lang/Long;)Ljava/lang/Object;
    //   641: checkcast 374	com/google/android/gms/b/rr$a
    //   644: astore 16
    //   646: getstatic 377	com/google/android/gms/b/ke:cz	Lcom/google/android/gms/b/jz;
    //   649: astore 6
    //   651: aload 7
    //   653: invokestatic 113	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   656: aload 6
    //   658: invokevirtual 118	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   661: checkcast 345	java/lang/Long
    //   664: invokestatic 369	com/google/android/gms/b/rh:a	(Ljava/util/concurrent/Future;Ljava/lang/Long;)Ljava/lang/Object;
    //   667: checkcast 379	android/location/Location
    //   670: astore 19
    //   672: getstatic 382	com/google/android/gms/b/ke:aN	Lcom/google/android/gms/b/jz;
    //   675: astore 6
    //   677: aload 8
    //   679: invokestatic 113	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   682: aload 6
    //   684: invokevirtual 118	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   687: checkcast 345	java/lang/Long
    //   690: invokestatic 369	com/google/android/gms/b/rh:a	(Ljava/util/concurrent/Future;Ljava/lang/Long;)Ljava/lang/Object;
    //   693: checkcast 384	com/google/android/gms/ads/c/a$a
    //   696: astore 20
    //   698: aload 15
    //   700: invokeinterface 387 1 0
    //   705: checkcast 151	java/lang/String
    //   708: astore 7
    //   710: aconst_null
    //   711: astore 6
    //   713: aload 13
    //   715: invokeinterface 387 1 0
    //   720: checkcast 151	java/lang/String
    //   723: astore 8
    //   725: aload 8
    //   727: astore 6
    //   729: aload 12
    //   731: invokeinterface 387 1 0
    //   736: checkcast 389	com/google/android/gms/b/rn
    //   739: astore 8
    //   741: new 391	com/google/android/gms/b/rf
    //   744: dup
    //   745: invokespecial 392	com/google/android/gms/b/rf:<init>	()V
    //   748: astore 12
    //   750: aload 12
    //   752: aload_3
    //   753: putfield 395	com/google/android/gms/b/rf:i	Lcom/google/android/gms/b/qo;
    //   756: aload 12
    //   758: aload 8
    //   760: putfield 398	com/google/android/gms/b/rf:j	Lcom/google/android/gms/b/rn;
    //   763: aload 12
    //   765: aload 16
    //   767: putfield 401	com/google/android/gms/b/rf:e	Lcom/google/android/gms/b/rr$a;
    //   770: aload 12
    //   772: aload 19
    //   774: putfield 404	com/google/android/gms/b/rf:d	Landroid/location/Location;
    //   777: aload 12
    //   779: aload 17
    //   781: putfield 406	com/google/android/gms/b/rf:b	Landroid/os/Bundle;
    //   784: aload 12
    //   786: aload 7
    //   788: putfield 408	com/google/android/gms/b/rf:g	Ljava/lang/String;
    //   791: aload 12
    //   793: aload 20
    //   795: putfield 411	com/google/android/gms/b/rf:h	Lcom/google/android/gms/ads/c/a$a;
    //   798: aload 18
    //   800: ifnonnull +13 -> 813
    //   803: aload 12
    //   805: getfield 414	com/google/android/gms/b/rf:c	Ljava/util/List;
    //   808: invokeinterface 419 1 0
    //   813: aload 12
    //   815: aload 18
    //   817: putfield 414	com/google/android/gms/b/rf:c	Ljava/util/List;
    //   820: aload 12
    //   822: aload 5
    //   824: putfield 421	com/google/android/gms/b/rf:a	Landroid/os/Bundle;
    //   827: aload 12
    //   829: aload 6
    //   831: putfield 423	com/google/android/gms/b/rf:f	Ljava/lang/String;
    //   834: aload 12
    //   836: aload_2
    //   837: getfield 426	com/google/android/gms/b/rg:b	Lcom/google/android/gms/b/hy;
    //   840: invokeinterface 431 1 0
    //   845: putfield 435	com/google/android/gms/b/rf:k	Lorg/json/JSONObject;
    //   848: aload_0
    //   849: aload 12
    //   851: invokestatic 438	com/google/android/gms/b/ri:a	(Landroid/content/Context;Lcom/google/android/gms/b/rf;)Lorg/json/JSONObject;
    //   854: astore 5
    //   856: aload 5
    //   858: ifnonnull +114 -> 972
    //   861: new 440	com/google/android/gms/b/qr
    //   864: dup
    //   865: iconst_0
    //   866: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   869: areturn
    //   870: astore 6
    //   872: ldc_w 445
    //   875: aload 6
    //   877: invokestatic 448	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   880: goto -286 -> 594
    //   883: astore 6
    //   885: ldc_w 450
    //   888: invokestatic 96	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   891: goto -297 -> 594
    //   894: astore 6
    //   896: invokestatic 453	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   899: aload 6
    //   901: ldc_w 455
    //   904: invokevirtual 460	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   907: ldc_w 462
    //   910: aload 6
    //   912: invokestatic 448	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   915: aconst_null
    //   916: astore 7
    //   918: goto -208 -> 710
    //   921: astore 8
    //   923: invokestatic 453	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   926: aload 8
    //   928: ldc_w 464
    //   931: invokevirtual 460	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   934: ldc_w 466
    //   937: aload 8
    //   939: invokestatic 448	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   942: goto -213 -> 729
    //   945: astore_0
    //   946: invokestatic 453	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   949: aload_0
    //   950: ldc_w 468
    //   953: invokevirtual 460	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   956: ldc_w 470
    //   959: aload_0
    //   960: invokestatic 448	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   963: new 440	com/google/android/gms/b/qr
    //   966: dup
    //   967: iconst_0
    //   968: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   971: areturn
    //   972: aload_3
    //   973: getfield 140	com/google/android/gms/b/qo:a	I
    //   976: bipush 7
    //   978: if_icmpge +14 -> 992
    //   981: aload 5
    //   983: ldc_w 472
    //   986: aload 9
    //   988: invokevirtual 478	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   991: pop
    //   992: aload 5
    //   994: invokevirtual 479	org/json/JSONObject:toString	()Ljava/lang/String;
    //   997: astore 5
    //   999: aload 10
    //   1001: aload 11
    //   1003: iconst_1
    //   1004: anewarray 151	java/lang/String
    //   1007: dup
    //   1008: iconst_0
    //   1009: ldc_w 481
    //   1012: aastore
    //   1013: invokevirtual 156	com/google/android/gms/b/km:a	(Lcom/google/android/gms/b/kk;[Ljava/lang/String;)Z
    //   1016: pop
    //   1017: aload 10
    //   1019: invokevirtual 159	com/google/android/gms/b/km:a	()Lcom/google/android/gms/b/kk;
    //   1022: astore 7
    //   1024: getstatic 484	com/google/android/gms/b/tt:a	Landroid/os/Handler;
    //   1027: new 8	com/google/android/gms/b/rh$2
    //   1030: dup
    //   1031: aload_1
    //   1032: aload 14
    //   1034: aload 10
    //   1036: aload 7
    //   1038: aload 5
    //   1040: invokespecial 487	com/google/android/gms/b/rh$2:<init>	(Lcom/google/android/gms/b/nj;Lcom/google/android/gms/b/rj;Lcom/google/android/gms/b/km;Lcom/google/android/gms/b/kk;Ljava/lang/String;)V
    //   1043: invokevirtual 493	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1046: pop
    //   1047: aload 14
    //   1049: getfield 496	com/google/android/gms/b/rj:d	Lcom/google/android/gms/b/up;
    //   1052: ldc2_w 497
    //   1055: getstatic 501	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   1058: invokeinterface 361 4 0
    //   1063: checkcast 503	com/google/android/gms/b/rm
    //   1066: astore 7
    //   1068: aload 7
    //   1070: ifnonnull +64 -> 1134
    //   1073: new 440	com/google/android/gms/b/qr
    //   1076: dup
    //   1077: iconst_0
    //   1078: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   1081: astore_1
    //   1082: getstatic 484	com/google/android/gms/b/tt:a	Landroid/os/Handler;
    //   1085: new 14	com/google/android/gms/b/rh$3
    //   1088: dup
    //   1089: aload_2
    //   1090: aload_0
    //   1091: aload 14
    //   1093: aload_3
    //   1094: invokespecial 506	com/google/android/gms/b/rh$3:<init>	(Lcom/google/android/gms/b/rg;Landroid/content/Context;Lcom/google/android/gms/b/rj;Lcom/google/android/gms/b/qo;)V
    //   1097: invokevirtual 493	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1100: pop
    //   1101: aload_1
    //   1102: areturn
    //   1103: astore_1
    //   1104: new 440	com/google/android/gms/b/qr
    //   1107: dup
    //   1108: iconst_0
    //   1109: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   1112: astore_1
    //   1113: getstatic 484	com/google/android/gms/b/tt:a	Landroid/os/Handler;
    //   1116: new 14	com/google/android/gms/b/rh$3
    //   1119: dup
    //   1120: aload_2
    //   1121: aload_0
    //   1122: aload 14
    //   1124: aload_3
    //   1125: invokespecial 506	com/google/android/gms/b/rh$3:<init>	(Lcom/google/android/gms/b/rg;Landroid/content/Context;Lcom/google/android/gms/b/rj;Lcom/google/android/gms/b/qo;)V
    //   1128: invokevirtual 493	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1131: pop
    //   1132: aload_1
    //   1133: areturn
    //   1134: aload 7
    //   1136: getfield 508	com/google/android/gms/b/rm:i	I
    //   1139: bipush -2
    //   1141: if_icmpeq +37 -> 1178
    //   1144: new 440	com/google/android/gms/b/qr
    //   1147: dup
    //   1148: aload 7
    //   1150: getfield 508	com/google/android/gms/b/rm:i	I
    //   1153: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   1156: astore_1
    //   1157: getstatic 484	com/google/android/gms/b/tt:a	Landroid/os/Handler;
    //   1160: new 14	com/google/android/gms/b/rh$3
    //   1163: dup
    //   1164: aload_2
    //   1165: aload_0
    //   1166: aload 14
    //   1168: aload_3
    //   1169: invokespecial 506	com/google/android/gms/b/rh$3:<init>	(Lcom/google/android/gms/b/rg;Landroid/content/Context;Lcom/google/android/gms/b/rj;Lcom/google/android/gms/b/qo;)V
    //   1172: invokevirtual 493	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1175: pop
    //   1176: aload_1
    //   1177: areturn
    //   1178: aload 10
    //   1180: invokevirtual 510	com/google/android/gms/b/km:d	()Lcom/google/android/gms/b/kk;
    //   1183: ifnull +24 -> 1207
    //   1186: aload 10
    //   1188: aload 10
    //   1190: invokevirtual 510	com/google/android/gms/b/km:d	()Lcom/google/android/gms/b/kk;
    //   1193: iconst_1
    //   1194: anewarray 151	java/lang/String
    //   1197: dup
    //   1198: iconst_0
    //   1199: ldc_w 512
    //   1202: aastore
    //   1203: invokevirtual 156	com/google/android/gms/b/km:a	(Lcom/google/android/gms/b/kk;[Ljava/lang/String;)Z
    //   1206: pop
    //   1207: aconst_null
    //   1208: astore 5
    //   1210: aload 7
    //   1212: getfield 513	com/google/android/gms/b/rm:g	Ljava/lang/String;
    //   1215: invokestatic 519	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1218: ifne +15 -> 1233
    //   1221: aload_0
    //   1222: aload_3
    //   1223: aload 7
    //   1225: getfield 513	com/google/android/gms/b/rm:g	Ljava/lang/String;
    //   1228: invokestatic 321	com/google/android/gms/b/ri:a	(Landroid/content/Context;Lcom/google/android/gms/b/qo;Ljava/lang/String;)Lcom/google/android/gms/b/qr;
    //   1231: astore 5
    //   1233: aload 5
    //   1235: astore_1
    //   1236: aload 5
    //   1238: ifnonnull +42 -> 1280
    //   1241: aload 5
    //   1243: astore_1
    //   1244: aload 7
    //   1246: getfield 521	com/google/android/gms/b/rm:h	Ljava/lang/String;
    //   1249: invokestatic 519	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1252: ifne +28 -> 1280
    //   1255: aload_3
    //   1256: aload_0
    //   1257: aload_3
    //   1258: getfield 524	com/google/android/gms/b/qo:k	Lcom/google/android/gms/b/un;
    //   1261: getfield 525	com/google/android/gms/b/un:a	Ljava/lang/String;
    //   1264: aload 7
    //   1266: getfield 521	com/google/android/gms/b/rm:h	Ljava/lang/String;
    //   1269: aload 6
    //   1271: aload 7
    //   1273: aload 10
    //   1275: aload_2
    //   1276: invokestatic 528	com/google/android/gms/b/rh:a	(Lcom/google/android/gms/b/qo;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/rm;Lcom/google/android/gms/b/km;Lcom/google/android/gms/b/rg;)Lcom/google/android/gms/b/qr;
    //   1279: astore_1
    //   1280: aload_1
    //   1281: astore 5
    //   1283: aload_1
    //   1284: ifnonnull +13 -> 1297
    //   1287: new 440	com/google/android/gms/b/qr
    //   1290: dup
    //   1291: iconst_0
    //   1292: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   1295: astore 5
    //   1297: aload 10
    //   1299: aload 11
    //   1301: iconst_1
    //   1302: anewarray 151	java/lang/String
    //   1305: dup
    //   1306: iconst_0
    //   1307: ldc_w 530
    //   1310: aastore
    //   1311: invokevirtual 156	com/google/android/gms/b/km:a	(Lcom/google/android/gms/b/kk;[Ljava/lang/String;)Z
    //   1314: pop
    //   1315: aload 5
    //   1317: aload 10
    //   1319: invokevirtual 532	com/google/android/gms/b/km:b	()Ljava/lang/String;
    //   1322: putfield 535	com/google/android/gms/b/qr:y	Ljava/lang/String;
    //   1325: getstatic 484	com/google/android/gms/b/tt:a	Landroid/os/Handler;
    //   1328: new 14	com/google/android/gms/b/rh$3
    //   1331: dup
    //   1332: aload_2
    //   1333: aload_0
    //   1334: aload 14
    //   1336: aload_3
    //   1337: invokespecial 506	com/google/android/gms/b/rh$3:<init>	(Lcom/google/android/gms/b/rg;Landroid/content/Context;Lcom/google/android/gms/b/rj;Lcom/google/android/gms/b/qo;)V
    //   1340: invokevirtual 493	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1343: pop
    //   1344: aload 5
    //   1346: areturn
    //   1347: astore_1
    //   1348: getstatic 484	com/google/android/gms/b/tt:a	Landroid/os/Handler;
    //   1351: new 14	com/google/android/gms/b/rh$3
    //   1354: dup
    //   1355: aload_2
    //   1356: aload_0
    //   1357: aload 14
    //   1359: aload_3
    //   1360: invokespecial 506	com/google/android/gms/b/rh$3:<init>	(Lcom/google/android/gms/b/rg;Landroid/content/Context;Lcom/google/android/gms/b/rj;Lcom/google/android/gms/b/qo;)V
    //   1363: invokevirtual 493	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   1366: pop
    //   1367: aload_1
    //   1368: athrow
    //   1369: astore 7
    //   1371: goto -379 -> 992
    //   1374: astore 6
    //   1376: goto -504 -> 872
    //   1379: aload 6
    //   1381: astore 5
    //   1383: aconst_null
    //   1384: astore 6
    //   1386: goto -978 -> 408
    //   1389: aconst_null
    //   1390: astore 6
    //   1392: goto -984 -> 408
    //   1395: aconst_null
    //   1396: astore 5
    //   1398: goto -1099 -> 299
    //   1401: goto -1123 -> 278
    //   1404: goto -1170 -> 234
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1407	0	paramContext	Context
    //   0	1407	1	paramnj	nj
    //   0	1407	2	paramrg	rg
    //   0	1407	3	paramqo	qo
    //   199	321	4	i	int
    //   12	1385	5	localObject1	Object
    //   132	698	6	localObject2	Object
    //   870	6	6	localInterruptedException	InterruptedException
    //   883	1	6	localTimeoutException	TimeoutException
    //   894	376	6	localException1	Exception
    //   1374	6	6	localExecutionException	ExecutionException
    //   1384	7	6	localObject3	Object
    //   172	1100	7	localObject4	Object
    //   1369	1	7	localJSONException	org.json.JSONException
    //   242	517	8	localObject5	Object
    //   921	17	8	localException2	Exception
    //   340	647	9	localObject6	Object
    //   44	1274	10	localkm	km
    //   95	1205	11	localkk	kk
    //   162	688	12	localObject7	Object
    //   141	573	13	localFuture	Future
    //   479	879	14	localrj	rj
    //   153	546	15	localus	us
    //   117	649	16	localObject8	Object
    //   106	674	17	localObject9	Object
    //   503	313	18	localObject10	Object
    //   561	212	19	localObject11	Object
    //   696	98	20	locala	com.google.android.gms.ads.c.a.a
    // Exception table:
    //   from	to	target	type
    //   552	594	870	java/lang/InterruptedException
    //   552	594	883	java/util/concurrent/TimeoutException
    //   698	710	894	java/lang/Exception
    //   713	725	921	java/lang/Exception
    //   729	741	945	java/lang/Throwable
    //   1047	1068	1103	java/lang/Exception
    //   1047	1068	1347	finally
    //   1073	1082	1347	finally
    //   1104	1113	1347	finally
    //   1134	1157	1347	finally
    //   1178	1207	1347	finally
    //   1210	1233	1347	finally
    //   1244	1280	1347	finally
    //   1287	1297	1347	finally
    //   1297	1325	1347	finally
    //   981	992	1369	org/json/JSONException
    //   552	594	1374	java/util/concurrent/ExecutionException
  }
  
  /* Error */
  public static qr a(qo paramqo, Context paramContext, String paramString1, String paramString2, String paramString3, rm paramrm, km paramkm, rg paramrg)
  {
    // Byte code:
    //   0: aload 6
    //   2: ifnull +787 -> 789
    //   5: aload 6
    //   7: invokevirtual 159	com/google/android/gms/b/km:a	()Lcom/google/android/gms/b/kk;
    //   10: astore 12
    //   12: new 539	com/google/android/gms/b/rk
    //   15: dup
    //   16: aload_0
    //   17: aload 5
    //   19: getfield 541	com/google/android/gms/b/rm:b	Ljava/lang/String;
    //   22: invokespecial 544	com/google/android/gms/b/rk:<init>	(Lcom/google/android/gms/b/qo;Ljava/lang/String;)V
    //   25: astore 15
    //   27: aload_3
    //   28: invokestatic 548	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   31: astore 13
    //   33: aload 13
    //   35: invokevirtual 552	java/lang/String:length	()I
    //   38: ifeq +474 -> 512
    //   41: ldc_w 554
    //   44: aload 13
    //   46: invokevirtual 557	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   49: astore 13
    //   51: aload 13
    //   53: invokestatic 96	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   56: new 559	java/net/URL
    //   59: dup
    //   60: aload_3
    //   61: invokespecial 561	java/net/URL:<init>	(Ljava/lang/String;)V
    //   64: astore_3
    //   65: invokestatic 564	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   68: invokeinterface 568 1 0
    //   73: lstore 10
    //   75: iconst_0
    //   76: istore 8
    //   78: aload_3
    //   79: invokevirtual 572	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   82: checkcast 574	java/net/HttpURLConnection
    //   85: astore 14
    //   87: invokestatic 280	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   90: aload_1
    //   91: aload_2
    //   92: aload 14
    //   94: invokevirtual 577	com/google/android/gms/b/tt:a	(Landroid/content/Context;Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   97: aload 4
    //   99: invokestatic 519	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   102: ifne +21 -> 123
    //   105: aload 5
    //   107: getfield 579	com/google/android/gms/b/rm:e	Z
    //   110: ifeq +13 -> 123
    //   113: aload 14
    //   115: ldc_w 581
    //   118: aload 4
    //   120: invokevirtual 584	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: aload_0
    //   124: getfield 586	com/google/android/gms/b/qo:I	Ljava/lang/String;
    //   127: astore 13
    //   129: aload 13
    //   131: invokestatic 519	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   134: ifne +19 -> 153
    //   137: ldc_w 588
    //   140: invokestatic 96	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   143: aload 14
    //   145: ldc_w 590
    //   148: aload 13
    //   150: invokevirtual 584	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   153: aload 5
    //   155: ifnull +64 -> 219
    //   158: aload 5
    //   160: getfield 592	com/google/android/gms/b/rm:c	Ljava/lang/String;
    //   163: invokestatic 519	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   166: ifne +53 -> 219
    //   169: aload 14
    //   171: iconst_1
    //   172: invokevirtual 596	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   175: aload 5
    //   177: getfield 592	com/google/android/gms/b/rm:c	Ljava/lang/String;
    //   180: invokevirtual 600	java/lang/String:getBytes	()[B
    //   183: astore 16
    //   185: aload 14
    //   187: aload 16
    //   189: arraylength
    //   190: invokevirtual 603	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   193: new 605	java/io/BufferedOutputStream
    //   196: dup
    //   197: aload 14
    //   199: invokevirtual 609	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   202: invokespecial 612	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   205: astore 13
    //   207: aload 13
    //   209: aload 16
    //   211: invokevirtual 616	java/io/BufferedOutputStream:write	([B)V
    //   214: aload 13
    //   216: invokestatic 621	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   219: aload 14
    //   221: invokevirtual 624	java/net/HttpURLConnection:getResponseCode	()I
    //   224: istore 9
    //   226: aload 14
    //   228: invokevirtual 628	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   231: astore 13
    //   233: iload 9
    //   235: sipush 200
    //   238: if_icmplt +352 -> 590
    //   241: iload 9
    //   243: sipush 300
    //   246: if_icmpge +344 -> 590
    //   249: aload_3
    //   250: invokevirtual 629	java/net/URL:toString	()Ljava/lang/String;
    //   253: astore_0
    //   254: new 631	java/io/InputStreamReader
    //   257: dup
    //   258: aload 14
    //   260: invokevirtual 635	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   263: invokespecial 638	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   266: astore_1
    //   267: invokestatic 280	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   270: pop
    //   271: aload_1
    //   272: invokestatic 641	com/google/android/gms/b/tt:a	(Ljava/io/InputStreamReader;)Ljava/lang/String;
    //   275: astore_2
    //   276: aload_1
    //   277: invokestatic 621	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   280: aload_0
    //   281: aload 13
    //   283: aload_2
    //   284: iload 9
    //   286: invokestatic 644	com/google/android/gms/b/rh:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   289: aload 15
    //   291: aload_2
    //   292: putfield 645	com/google/android/gms/b/rk:c	Ljava/lang/String;
    //   295: aload 15
    //   297: aload 13
    //   299: invokevirtual 648	com/google/android/gms/b/rk:a	(Ljava/util/Map;)V
    //   302: aload 6
    //   304: ifnull +21 -> 325
    //   307: aload 6
    //   309: aload 12
    //   311: iconst_1
    //   312: anewarray 151	java/lang/String
    //   315: dup
    //   316: iconst_0
    //   317: ldc_w 650
    //   320: aastore
    //   321: invokevirtual 156	com/google/android/gms/b/km:a	(Lcom/google/android/gms/b/kk;[Ljava/lang/String;)Z
    //   324: pop
    //   325: new 440	com/google/android/gms/b/qr
    //   328: dup
    //   329: aload 15
    //   331: getfield 652	com/google/android/gms/b/rk:H	Lcom/google/android/gms/b/qo;
    //   334: aload 15
    //   336: getfield 653	com/google/android/gms/b/rk:b	Ljava/lang/String;
    //   339: aload 15
    //   341: getfield 645	com/google/android/gms/b/rk:c	Ljava/lang/String;
    //   344: aload 15
    //   346: getfield 655	com/google/android/gms/b/rk:d	Ljava/util/List;
    //   349: aload 15
    //   351: getfield 657	com/google/android/gms/b/rk:h	Ljava/util/List;
    //   354: aload 15
    //   356: getfield 659	com/google/android/gms/b/rk:i	J
    //   359: aload 15
    //   361: getfield 661	com/google/android/gms/b/rk:j	Z
    //   364: aload 15
    //   366: getfield 663	com/google/android/gms/b/rk:k	Ljava/util/List;
    //   369: aload 15
    //   371: getfield 666	com/google/android/gms/b/rk:l	J
    //   374: aload 15
    //   376: getfield 669	com/google/android/gms/b/rk:m	I
    //   379: aload 15
    //   381: getfield 670	com/google/android/gms/b/rk:a	Ljava/lang/String;
    //   384: lload 10
    //   386: aload 15
    //   388: getfield 671	com/google/android/gms/b/rk:f	Ljava/lang/String;
    //   391: aload 15
    //   393: getfield 672	com/google/android/gms/b/rk:g	Ljava/lang/String;
    //   396: aload 15
    //   398: getfield 674	com/google/android/gms/b/rk:n	Z
    //   401: aload 15
    //   403: getfield 676	com/google/android/gms/b/rk:o	Z
    //   406: aload 15
    //   408: getfield 679	com/google/android/gms/b/rk:p	Z
    //   411: aload 15
    //   413: getfield 681	com/google/android/gms/b/rk:q	Z
    //   416: aload 15
    //   418: getfield 684	com/google/android/gms/b/rk:s	Ljava/lang/String;
    //   421: aload 15
    //   423: getfield 687	com/google/android/gms/b/rk:t	Z
    //   426: aload 15
    //   428: getfield 690	com/google/android/gms/b/rk:u	Z
    //   431: aload 15
    //   433: getfield 693	com/google/android/gms/b/rk:v	Lcom/google/android/gms/b/ss;
    //   436: aload 15
    //   438: getfield 696	com/google/android/gms/b/rk:w	Ljava/util/List;
    //   441: aload 15
    //   443: getfield 699	com/google/android/gms/b/rk:x	Ljava/util/List;
    //   446: aload 15
    //   448: getfield 701	com/google/android/gms/b/rk:y	Z
    //   451: aload 15
    //   453: getfield 705	com/google/android/gms/b/rk:z	Lcom/google/android/gms/b/qt;
    //   456: aload 15
    //   458: getfield 707	com/google/android/gms/b/rk:A	Z
    //   461: aload 15
    //   463: getfield 710	com/google/android/gms/b/rk:B	Ljava/lang/String;
    //   466: aload 15
    //   468: getfield 713	com/google/android/gms/b/rk:C	Ljava/util/List;
    //   471: aload 15
    //   473: getfield 716	com/google/android/gms/b/rk:D	Z
    //   476: aload 15
    //   478: getfield 719	com/google/android/gms/b/rk:E	Ljava/lang/String;
    //   481: aload 15
    //   483: getfield 723	com/google/android/gms/b/rk:F	Lcom/google/android/gms/b/sv;
    //   486: aload 15
    //   488: getfield 725	com/google/android/gms/b/rk:e	Ljava/lang/String;
    //   491: aload 15
    //   493: getfield 728	com/google/android/gms/b/rk:r	Z
    //   496: aload 15
    //   498: getfield 731	com/google/android/gms/b/rk:G	Z
    //   501: invokespecial 734	com/google/android/gms/b/qr:<init>	(Lcom/google/android/gms/b/qo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZLjava/util/List;JILjava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLcom/google/android/gms/b/ss;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/b/qt;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/google/android/gms/b/sv;Ljava/lang/String;ZZ)V
    //   504: astore_0
    //   505: aload 14
    //   507: invokevirtual 737	java/net/HttpURLConnection:disconnect	()V
    //   510: aload_0
    //   511: areturn
    //   512: new 151	java/lang/String
    //   515: dup
    //   516: ldc_w 554
    //   519: invokespecial 738	java/lang/String:<init>	(Ljava/lang/String;)V
    //   522: astore 13
    //   524: goto -473 -> 51
    //   527: astore_0
    //   528: aload_0
    //   529: invokevirtual 741	java/io/IOException:getMessage	()Ljava/lang/String;
    //   532: invokestatic 548	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   535: astore_0
    //   536: aload_0
    //   537: invokevirtual 552	java/lang/String:length	()I
    //   540: ifeq +224 -> 764
    //   543: ldc_w 743
    //   546: aload_0
    //   547: invokevirtual 557	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   550: astore_0
    //   551: aload_0
    //   552: invokestatic 745	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   555: new 440	com/google/android/gms/b/qr
    //   558: dup
    //   559: iconst_2
    //   560: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   563: areturn
    //   564: astore_0
    //   565: aconst_null
    //   566: astore_1
    //   567: aload_1
    //   568: invokestatic 621	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   571: aload_0
    //   572: athrow
    //   573: astore_0
    //   574: aload 14
    //   576: invokevirtual 737	java/net/HttpURLConnection:disconnect	()V
    //   579: aload_0
    //   580: athrow
    //   581: astore_0
    //   582: aconst_null
    //   583: astore_1
    //   584: aload_1
    //   585: invokestatic 621	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   588: aload_0
    //   589: athrow
    //   590: aload_3
    //   591: invokevirtual 629	java/net/URL:toString	()Ljava/lang/String;
    //   594: aload 13
    //   596: aconst_null
    //   597: iload 9
    //   599: invokestatic 644	com/google/android/gms/b/rh:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   602: iload 9
    //   604: sipush 300
    //   607: if_icmplt +92 -> 699
    //   610: iload 9
    //   612: sipush 400
    //   615: if_icmpge +84 -> 699
    //   618: aload 14
    //   620: ldc_w 747
    //   623: invokevirtual 750	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   626: astore_3
    //   627: aload_3
    //   628: invokestatic 519	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   631: ifeq +25 -> 656
    //   634: ldc_w 752
    //   637: invokestatic 745	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   640: new 440	com/google/android/gms/b/qr
    //   643: dup
    //   644: iconst_0
    //   645: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   648: astore_0
    //   649: aload 14
    //   651: invokevirtual 737	java/net/HttpURLConnection:disconnect	()V
    //   654: aload_0
    //   655: areturn
    //   656: new 559	java/net/URL
    //   659: dup
    //   660: aload_3
    //   661: invokespecial 561	java/net/URL:<init>	(Ljava/lang/String;)V
    //   664: astore_3
    //   665: iload 8
    //   667: iconst_1
    //   668: iadd
    //   669: istore 8
    //   671: iload 8
    //   673: iconst_5
    //   674: if_icmple +67 -> 741
    //   677: ldc_w 754
    //   680: invokestatic 745	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   683: new 440	com/google/android/gms/b/qr
    //   686: dup
    //   687: iconst_0
    //   688: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   691: astore_0
    //   692: aload 14
    //   694: invokevirtual 737	java/net/HttpURLConnection:disconnect	()V
    //   697: aload_0
    //   698: areturn
    //   699: new 756	java/lang/StringBuilder
    //   702: dup
    //   703: bipush 46
    //   705: invokespecial 757	java/lang/StringBuilder:<init>	(I)V
    //   708: ldc_w 759
    //   711: invokevirtual 763	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   714: iload 9
    //   716: invokevirtual 766	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   719: invokevirtual 767	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   722: invokestatic 745	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   725: new 440	com/google/android/gms/b/qr
    //   728: dup
    //   729: iconst_0
    //   730: invokespecial 443	com/google/android/gms/b/qr:<init>	(I)V
    //   733: astore_0
    //   734: aload 14
    //   736: invokevirtual 737	java/net/HttpURLConnection:disconnect	()V
    //   739: aload_0
    //   740: areturn
    //   741: aload 15
    //   743: aload 13
    //   745: invokevirtual 648	com/google/android/gms/b/rk:a	(Ljava/util/Map;)V
    //   748: aload 14
    //   750: invokevirtual 737	java/net/HttpURLConnection:disconnect	()V
    //   753: aload 7
    //   755: ifnull +6 -> 761
    //   758: goto -680 -> 78
    //   761: goto -683 -> 78
    //   764: new 151	java/lang/String
    //   767: dup
    //   768: ldc_w 743
    //   771: invokespecial 738	java/lang/String:<init>	(Ljava/lang/String;)V
    //   774: astore_0
    //   775: goto -224 -> 551
    //   778: astore_0
    //   779: goto -195 -> 584
    //   782: astore_0
    //   783: aload 13
    //   785: astore_1
    //   786: goto -219 -> 567
    //   789: aconst_null
    //   790: astore 12
    //   792: goto -780 -> 12
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	795	0	paramqo	qo
    //   0	795	1	paramContext	Context
    //   0	795	2	paramString1	String
    //   0	795	3	paramString2	String
    //   0	795	4	paramString3	String
    //   0	795	5	paramrm	rm
    //   0	795	6	paramkm	km
    //   0	795	7	paramrg	rg
    //   76	599	8	i	int
    //   224	491	9	j	int
    //   73	312	10	l	long
    //   10	781	12	localkk	kk
    //   31	753	13	localObject	Object
    //   85	664	14	localHttpURLConnection	java.net.HttpURLConnection
    //   25	717	15	localrk	rk
    //   183	27	16	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   12	51	527	java/io/IOException
    //   51	75	527	java/io/IOException
    //   78	87	527	java/io/IOException
    //   505	510	527	java/io/IOException
    //   512	524	527	java/io/IOException
    //   574	581	527	java/io/IOException
    //   649	654	527	java/io/IOException
    //   692	697	527	java/io/IOException
    //   734	739	527	java/io/IOException
    //   748	753	527	java/io/IOException
    //   193	207	564	finally
    //   87	123	573	finally
    //   123	153	573	finally
    //   158	193	573	finally
    //   214	219	573	finally
    //   219	233	573	finally
    //   249	254	573	finally
    //   276	302	573	finally
    //   307	325	573	finally
    //   325	505	573	finally
    //   567	573	573	finally
    //   584	590	573	finally
    //   590	602	573	finally
    //   618	649	573	finally
    //   656	665	573	finally
    //   677	692	573	finally
    //   699	734	573	finally
    //   741	748	573	finally
    //   254	267	581	finally
    //   267	276	778	finally
    //   207	214	782	finally
  }
  
  public static rh a(Context paramContext, jw paramjw, rg paramrg)
  {
    synchronized (a)
    {
      if (b == null)
      {
        Context localContext = paramContext;
        if (paramContext.getApplicationContext() != null) {
          localContext = paramContext.getApplicationContext();
        }
        b = new rh(localContext, paramjw, paramrg);
      }
      paramContext = b;
      return paramContext;
    }
  }
  
  private static <T> T a(Future<T> paramFuture, Long paramLong)
  {
    try
    {
      paramFuture = paramFuture.get(paramLong.longValue(), TimeUnit.MILLISECONDS);
      return paramFuture;
    }
    catch (InterruptedException paramFuture)
    {
      tp.c("InterruptedException caught while resolving future.", paramFuture);
      Thread.currentThread().interrupt();
      return null;
    }
    catch (RuntimeException paramFuture)
    {
      tp.c("Exception caught while resolving future", paramFuture);
      return null;
    }
    catch (ExecutionException paramFuture)
    {
      for (;;) {}
    }
    catch (TimeoutException paramFuture)
    {
      for (;;) {}
    }
  }
  
  private static void a(String paramString1, Map<String, List<String>> paramMap, String paramString2, int paramInt)
  {
    if (tp.a(2))
    {
      tp.a(String.valueOf(paramString1).length() + 39 + "Http Response: {\n  URL:\n    " + paramString1 + "\n  Headers:");
      if (paramMap != null)
      {
        Iterator localIterator1 = paramMap.keySet().iterator();
        if (localIterator1.hasNext())
        {
          paramString1 = (String)localIterator1.next();
          tp.a(String.valueOf(paramString1).length() + 5 + "    " + paramString1 + ":");
          Iterator localIterator2 = ((List)paramMap.get(paramString1)).iterator();
          label139:
          if (localIterator2.hasNext())
          {
            paramString1 = String.valueOf((String)localIterator2.next());
            if (paramString1.length() == 0) {
              break label185;
            }
          }
          label185:
          for (paramString1 = "      ".concat(paramString1);; paramString1 = new String("      "))
          {
            tp.a(paramString1);
            break label139;
            break;
          }
        }
      }
      tp.a("  Body:");
      if (paramString2 != null)
      {
        int i = 0;
        while (i < Math.min(paramString2.length(), 100000))
        {
          tp.a(paramString2.substring(i, Math.min(paramString2.length(), i + 1000)));
          i += 1000;
        }
      }
      tp.a("    null");
      tp.a(34 + "  Response Code:\n    " + paramInt + "\n}");
    }
  }
  
  public final qr a(qo paramqo)
  {
    return a(c, f, d, paramqo);
  }
  
  public final void a(final qo paramqo, final qy paramqy)
  {
    w.i().a(c, k);
    ts.a(new Runnable()
    {
      public final void run()
      {
        try
        {
          qr localqr1 = a(paramqo);
          localqr2 = localqr1;
          if (localqr1 == null) {
            localqr2 = new qr(0);
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            try
            {
              qr localqr2;
              paramqy.a(localqr2);
              return;
            }
            catch (RemoteException localRemoteException)
            {
              Object localObject;
              tp.c("Fail to forward ad response.", localRemoteException);
            }
            localException = localException;
            w.i().a(localException, "AdRequestServiceImpl.loadAdAsync");
            tp.c("Could not fetch ad response due to an Exception.", localException);
            localObject = null;
          }
        }
      }
    });
  }
}


/* Location:              com/google/android/gms/b/rh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */