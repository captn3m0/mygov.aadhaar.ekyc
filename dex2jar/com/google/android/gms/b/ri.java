package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.google.android.gms.ads.c.a.a;
import com.google.android.gms.ads.internal.w;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class ri
{
  private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd", Locale.US);
  
  /* Error */
  public static qr a(Context paramContext, qo paramqo, String paramString)
  {
    // Byte code:
    //   0: new 31	org/json/JSONObject
    //   3: dup
    //   4: aload_2
    //   5: invokespecial 34	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   8: astore 29
    //   10: aload 29
    //   12: ldc 36
    //   14: aconst_null
    //   15: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   18: astore 25
    //   20: aload 29
    //   22: ldc 42
    //   24: aconst_null
    //   25: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   28: astore 26
    //   30: aload 29
    //   32: ldc 44
    //   34: aconst_null
    //   35: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   38: astore 30
    //   40: aload 29
    //   42: ldc 46
    //   44: aload 30
    //   46: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   49: astore 31
    //   51: aload_1
    //   52: ifnull +803 -> 855
    //   55: aload_1
    //   56: getfield 52	com/google/android/gms/b/qo:m	I
    //   59: ifeq +796 -> 855
    //   62: iconst_1
    //   63: istore 5
    //   65: aload 29
    //   67: ldc 54
    //   69: aconst_null
    //   70: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   73: astore_2
    //   74: aload_2
    //   75: astore 24
    //   77: aload_2
    //   78: ifnonnull +13 -> 91
    //   81: aload 29
    //   83: ldc 56
    //   85: aconst_null
    //   86: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   89: astore 24
    //   91: aload 24
    //   93: astore_2
    //   94: aload 24
    //   96: ifnonnull +12 -> 108
    //   99: aload 29
    //   101: ldc 58
    //   103: aconst_null
    //   104: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   107: astore_2
    //   108: ldc2_w 59
    //   111: lstore 18
    //   113: aload 29
    //   115: ldc 62
    //   117: aconst_null
    //   118: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 32
    //   123: aload 29
    //   125: ldc 64
    //   127: aconst_null
    //   128: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   131: astore 33
    //   133: aload 29
    //   135: ldc 66
    //   137: invokevirtual 70	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   140: ifeq +721 -> 861
    //   143: aload 29
    //   145: ldc 66
    //   147: invokevirtual 74	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   150: ldc2_w 75
    //   153: dmul
    //   154: d2l
    //   155: lstore 16
    //   157: aload 29
    //   159: ldc 78
    //   161: aconst_null
    //   162: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   165: astore 24
    //   167: iconst_m1
    //   168: istore_3
    //   169: ldc 80
    //   171: aload 24
    //   173: invokevirtual 86	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   176: ifeq +82 -> 258
    //   179: invokestatic 92	com/google/android/gms/ads/internal/w:g	()Lcom/google/android/gms/b/tu;
    //   182: invokevirtual 98	com/google/android/gms/b/tu:b	()I
    //   185: istore_3
    //   186: aconst_null
    //   187: astore 27
    //   189: aload_2
    //   190: invokestatic 104	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   193: ifeq +653 -> 846
    //   196: aload 26
    //   198: invokestatic 104	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   201: ifne +645 -> 846
    //   204: aload_1
    //   205: aload_0
    //   206: aload_1
    //   207: getfield 108	com/google/android/gms/b/qo:k	Lcom/google/android/gms/b/un;
    //   210: getfield 113	com/google/android/gms/b/un:a	Ljava/lang/String;
    //   213: aload 26
    //   215: aconst_null
    //   216: aconst_null
    //   217: aconst_null
    //   218: aconst_null
    //   219: invokestatic 118	com/google/android/gms/b/rh:a	(Lcom/google/android/gms/b/qo;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/rm;Lcom/google/android/gms/b/km;Lcom/google/android/gms/b/rg;)Lcom/google/android/gms/b/qr;
    //   222: astore 27
    //   224: aload 27
    //   226: getfield 122	com/google/android/gms/b/qr:b	Ljava/lang/String;
    //   229: astore_2
    //   230: aload 27
    //   232: getfield 125	com/google/android/gms/b/qr:c	Ljava/lang/String;
    //   235: astore 24
    //   237: aload 27
    //   239: getfield 129	com/google/android/gms/b/qr:n	J
    //   242: lstore 18
    //   244: aload 24
    //   246: ifnonnull +32 -> 278
    //   249: new 120	com/google/android/gms/b/qr
    //   252: dup
    //   253: iconst_0
    //   254: invokespecial 132	com/google/android/gms/b/qr:<init>	(I)V
    //   257: areturn
    //   258: ldc -122
    //   260: aload 24
    //   262: invokevirtual 86	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   265: ifeq -79 -> 186
    //   268: invokestatic 92	com/google/android/gms/ads/internal/w:g	()Lcom/google/android/gms/b/tu;
    //   271: invokevirtual 136	com/google/android/gms/b/tu:a	()I
    //   274: istore_3
    //   275: goto -89 -> 186
    //   278: aload 29
    //   280: ldc -118
    //   282: invokevirtual 142	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   285: astore 26
    //   287: aload 27
    //   289: ifnonnull +510 -> 799
    //   292: aconst_null
    //   293: astore_0
    //   294: aload_0
    //   295: astore 25
    //   297: aload 26
    //   299: ifnull +11 -> 310
    //   302: aload 26
    //   304: aload_0
    //   305: invokestatic 145	com/google/android/gms/b/ri:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   308: astore 25
    //   310: aload 29
    //   312: ldc -109
    //   314: invokevirtual 142	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   317: astore 28
    //   319: aload 27
    //   321: ifnonnull +487 -> 808
    //   324: aconst_null
    //   325: astore_0
    //   326: aload_0
    //   327: astore 26
    //   329: aload 28
    //   331: ifnull +11 -> 342
    //   334: aload 28
    //   336: aload_0
    //   337: invokestatic 145	com/google/android/gms/b/ri:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   340: astore 26
    //   342: aload 29
    //   344: ldc -107
    //   346: invokevirtual 142	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   349: astore 34
    //   351: aload 27
    //   353: ifnonnull +464 -> 817
    //   356: aconst_null
    //   357: astore_0
    //   358: aload_0
    //   359: astore 28
    //   361: aload 34
    //   363: ifnull +11 -> 374
    //   366: aload 34
    //   368: aload_0
    //   369: invokestatic 145	com/google/android/gms/b/ri:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   372: astore 28
    //   374: iload_3
    //   375: istore 4
    //   377: aload 27
    //   379: ifnull +461 -> 840
    //   382: aload 27
    //   384: getfield 152	com/google/android/gms/b/qr:l	I
    //   387: iconst_m1
    //   388: if_icmpeq +9 -> 397
    //   391: aload 27
    //   393: getfield 152	com/google/android/gms/b/qr:l	I
    //   396: istore_3
    //   397: iload_3
    //   398: istore 4
    //   400: aload 27
    //   402: getfield 154	com/google/android/gms/b/qr:g	J
    //   405: lconst_0
    //   406: lcmp
    //   407: ifle +433 -> 840
    //   410: aload 27
    //   412: getfield 154	com/google/android/gms/b/qr:g	J
    //   415: lstore 16
    //   417: aload 29
    //   419: ldc -100
    //   421: invokevirtual 159	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   424: astore 27
    //   426: aconst_null
    //   427: astore_0
    //   428: aload 29
    //   430: ldc -95
    //   432: iconst_0
    //   433: invokevirtual 165	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   436: istore 6
    //   438: iload 6
    //   440: ifeq +12 -> 452
    //   443: aload 29
    //   445: ldc -89
    //   447: aconst_null
    //   448: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   451: astore_0
    //   452: aload 29
    //   454: ldc -87
    //   456: iconst_0
    //   457: invokevirtual 165	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   460: istore 7
    //   462: aload 29
    //   464: ldc -85
    //   466: iconst_0
    //   467: invokevirtual 165	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   470: istore 8
    //   472: aload 29
    //   474: ldc -83
    //   476: iconst_1
    //   477: invokevirtual 165	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   480: istore 9
    //   482: aload 29
    //   484: ldc -81
    //   486: iconst_1
    //   487: invokevirtual 165	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   490: istore 10
    //   492: aload 29
    //   494: ldc -79
    //   496: iconst_0
    //   497: invokevirtual 165	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   500: istore 11
    //   502: aload 29
    //   504: ldc -77
    //   506: ldc2_w 59
    //   509: invokevirtual 183	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   512: lstore 20
    //   514: aload 29
    //   516: ldc -71
    //   518: ldc2_w 59
    //   521: invokevirtual 183	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   524: lstore 22
    //   526: aload 29
    //   528: ldc -69
    //   530: ldc -67
    //   532: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   535: astore 34
    //   537: ldc -65
    //   539: aload 29
    //   541: ldc -63
    //   543: ldc -67
    //   545: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   548: invokevirtual 86	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   551: istore 12
    //   553: aload 29
    //   555: ldc -61
    //   557: iconst_0
    //   558: invokevirtual 165	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   561: istore 13
    //   563: aload 29
    //   565: ldc -59
    //   567: invokevirtual 142	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   570: aconst_null
    //   571: invokestatic 145	com/google/android/gms/b/ri:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   574: astore 35
    //   576: aload 29
    //   578: ldc -57
    //   580: invokevirtual 142	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   583: aconst_null
    //   584: invokestatic 145	com/google/android/gms/b/ri:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   587: astore 36
    //   589: aload 29
    //   591: ldc -55
    //   593: invokevirtual 142	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   596: invokestatic 206	com/google/android/gms/b/ss:a	(Lorg/json/JSONArray;)Lcom/google/android/gms/b/ss;
    //   599: astore 37
    //   601: aload 29
    //   603: ldc -48
    //   605: iconst_0
    //   606: invokevirtual 165	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   609: istore 14
    //   611: aload 29
    //   613: ldc -46
    //   615: invokevirtual 214	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   618: invokestatic 219	com/google/android/gms/b/qt:a	(Lorg/json/JSONObject;)Lcom/google/android/gms/b/qt;
    //   621: astore 38
    //   623: aload 29
    //   625: ldc -35
    //   627: ldc -67
    //   629: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   632: astore 39
    //   634: aload 29
    //   636: ldc -33
    //   638: invokevirtual 142	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   641: aconst_null
    //   642: invokestatic 145	com/google/android/gms/b/ri:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   645: astore 40
    //   647: aload 29
    //   649: ldc -31
    //   651: invokevirtual 214	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   654: invokestatic 230	com/google/android/gms/b/sv:a	(Lorg/json/JSONObject;)Lcom/google/android/gms/b/sv;
    //   657: astore 41
    //   659: aload 29
    //   661: ldc -24
    //   663: aload_1
    //   664: getfield 236	com/google/android/gms/b/qo:L	Z
    //   667: invokevirtual 165	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   670: istore 15
    //   672: new 120	com/google/android/gms/b/qr
    //   675: dup
    //   676: aload_1
    //   677: aload_2
    //   678: aload 24
    //   680: aload 25
    //   682: aload 26
    //   684: lload 16
    //   686: iload 7
    //   688: lload 22
    //   690: aload 28
    //   692: lload 20
    //   694: iload_3
    //   695: aload 30
    //   697: lload 18
    //   699: aload 32
    //   701: iload 6
    //   703: aload_0
    //   704: aload 27
    //   706: iload 8
    //   708: iload 5
    //   710: aload_1
    //   711: getfield 239	com/google/android/gms/b/qo:p	Z
    //   714: iload 9
    //   716: iload 11
    //   718: aload 34
    //   720: iload 12
    //   722: iload 13
    //   724: aload 37
    //   726: aload 35
    //   728: aload 36
    //   730: iload 14
    //   732: aload 38
    //   734: aload_1
    //   735: getfield 242	com/google/android/gms/b/qo:H	Z
    //   738: aload 39
    //   740: aload 40
    //   742: iload 15
    //   744: aload 31
    //   746: aload 41
    //   748: aload 33
    //   750: iload 10
    //   752: aload_1
    //   753: getfield 245	com/google/android/gms/b/qo:V	Z
    //   756: invokespecial 248	com/google/android/gms/b/qr:<init>	(Lcom/google/android/gms/b/qo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;ZZLcom/google/android/gms/b/ss;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/b/qt;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/google/android/gms/b/sv;Ljava/lang/String;ZZ)V
    //   759: astore_0
    //   760: aload_0
    //   761: areturn
    //   762: astore_0
    //   763: aload_0
    //   764: invokevirtual 252	org/json/JSONException:getMessage	()Ljava/lang/String;
    //   767: invokestatic 256	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   770: astore_0
    //   771: aload_0
    //   772: invokevirtual 259	java/lang/String:length	()I
    //   775: ifeq +51 -> 826
    //   778: ldc_w 261
    //   781: aload_0
    //   782: invokevirtual 264	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   785: astore_0
    //   786: aload_0
    //   787: invokestatic 269	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   790: new 120	com/google/android/gms/b/qr
    //   793: dup
    //   794: iconst_0
    //   795: invokespecial 132	com/google/android/gms/b/qr:<init>	(I)V
    //   798: areturn
    //   799: aload 27
    //   801: getfield 273	com/google/android/gms/b/qr:d	Ljava/util/List;
    //   804: astore_0
    //   805: goto -511 -> 294
    //   808: aload 27
    //   810: getfield 276	com/google/android/gms/b/qr:f	Ljava/util/List;
    //   813: astore_0
    //   814: goto -488 -> 326
    //   817: aload 27
    //   819: getfield 279	com/google/android/gms/b/qr:j	Ljava/util/List;
    //   822: astore_0
    //   823: goto -465 -> 358
    //   826: new 82	java/lang/String
    //   829: dup
    //   830: ldc_w 261
    //   833: invokespecial 280	java/lang/String:<init>	(Ljava/lang/String;)V
    //   836: astore_0
    //   837: goto -51 -> 786
    //   840: iload 4
    //   842: istore_3
    //   843: goto -426 -> 417
    //   846: aload_2
    //   847: astore 24
    //   849: aload 25
    //   851: astore_2
    //   852: goto -608 -> 244
    //   855: iconst_0
    //   856: istore 5
    //   858: goto -793 -> 65
    //   861: ldc2_w 59
    //   864: lstore 16
    //   866: goto -709 -> 157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	869	0	paramContext	Context
    //   0	869	1	paramqo	qo
    //   0	869	2	paramString	String
    //   168	675	3	i	int
    //   375	466	4	j	int
    //   63	794	5	bool1	boolean
    //   436	266	6	bool2	boolean
    //   460	227	7	bool3	boolean
    //   470	237	8	bool4	boolean
    //   480	235	9	bool5	boolean
    //   490	261	10	bool6	boolean
    //   500	217	11	bool7	boolean
    //   551	170	12	bool8	boolean
    //   561	162	13	bool9	boolean
    //   609	122	14	bool10	boolean
    //   670	73	15	bool11	boolean
    //   155	710	16	l1	long
    //   111	587	18	l2	long
    //   512	181	20	l3	long
    //   524	165	22	l4	long
    //   75	773	24	str1	String
    //   18	832	25	localObject1	Object
    //   28	655	26	localObject2	Object
    //   187	631	27	localObject3	Object
    //   317	374	28	localObject4	Object
    //   8	652	29	localJSONObject	JSONObject
    //   38	658	30	str2	String
    //   49	696	31	str3	String
    //   121	579	32	str4	String
    //   131	618	33	str5	String
    //   349	370	34	localObject5	Object
    //   574	153	35	localList1	List
    //   587	142	36	localList2	List
    //   599	126	37	localss	ss
    //   621	112	38	localqt	qt
    //   632	107	39	str6	String
    //   645	96	40	localList3	List
    //   657	90	41	localsv	sv
    // Exception table:
    //   from	to	target	type
    //   0	51	762	org/json/JSONException
    //   55	62	762	org/json/JSONException
    //   65	74	762	org/json/JSONException
    //   81	91	762	org/json/JSONException
    //   99	108	762	org/json/JSONException
    //   113	157	762	org/json/JSONException
    //   157	167	762	org/json/JSONException
    //   169	186	762	org/json/JSONException
    //   189	244	762	org/json/JSONException
    //   249	258	762	org/json/JSONException
    //   258	275	762	org/json/JSONException
    //   278	287	762	org/json/JSONException
    //   302	310	762	org/json/JSONException
    //   310	319	762	org/json/JSONException
    //   334	342	762	org/json/JSONException
    //   342	351	762	org/json/JSONException
    //   366	374	762	org/json/JSONException
    //   382	397	762	org/json/JSONException
    //   400	417	762	org/json/JSONException
    //   417	426	762	org/json/JSONException
    //   428	438	762	org/json/JSONException
    //   443	452	762	org/json/JSONException
    //   452	760	762	org/json/JSONException
    //   799	805	762	org/json/JSONException
    //   808	814	762	org/json/JSONException
    //   817	823	762	org/json/JSONException
  }
  
  private static Integer a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return Integer.valueOf(i);
    }
  }
  
  private static String a(int paramInt)
  {
    return String.format(Locale.US, "#%06x", new Object[] { Integer.valueOf(0xFFFFFF & paramInt) });
  }
  
  private static List<String> a(JSONArray paramJSONArray, List<String> paramList)
  {
    if (paramJSONArray == null)
    {
      paramList = null;
      return paramList;
    }
    Object localObject = paramList;
    if (paramList == null) {
      localObject = new LinkedList();
    }
    int i = 0;
    for (;;)
    {
      paramList = (List<String>)localObject;
      if (i >= paramJSONArray.length()) {
        break;
      }
      ((List)localObject).add(paramJSONArray.getString(i));
      i += 1;
    }
  }
  
  private static JSONArray a(List<String> paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localJSONArray.put((String)paramList.next());
    }
    return localJSONArray;
  }
  
  public static JSONObject a(Context paramContext, rf paramrf)
  {
    qo localqo = i;
    Object localObject2 = d;
    rn localrn = j;
    Bundle localBundle1 = a;
    JSONObject localJSONObject = k;
    HashMap localHashMap;
    label608:
    label977:
    int m;
    int i;
    int j;
    label1065:
    label1112:
    int k;
    for (;;)
    {
      try
      {
        localHashMap = new HashMap();
        localObject1 = ke.bY;
        localHashMap.put("extra_caps", w.q().a((jz)localObject1));
        if (c.size() > 0) {
          localHashMap.put("eid", TextUtils.join(",", c));
        }
        if (b != null) {
          localHashMap.put("ad_pos", b);
        }
        localObject3 = c;
        localObject1 = tn.a();
        if (localObject1 != null) {
          localHashMap.put("abf", localObject1);
        }
        if (b != -1L) {
          localHashMap.put("cust_age", a.format(new Date(b)));
        }
        if (c != null) {
          localHashMap.put("extras", c);
        }
        if (d != -1) {
          localHashMap.put("cust_gender", Integer.valueOf(d));
        }
        if (e != null) {
          localHashMap.put("kw", e);
        }
        if (g != -1) {
          localHashMap.put("tag_for_child_directed_treatment", Integer.valueOf(g));
        }
        if (f) {
          localHashMap.put("adtest", "on");
        }
        if (a >= 2)
        {
          if (h) {
            localHashMap.put("d_imp_hdr", Integer.valueOf(1));
          }
          if (!TextUtils.isEmpty(i)) {
            localHashMap.put("ppid", i);
          }
          if (j != null)
          {
            localObject4 = j;
            if (Color.alpha(a) != 0) {
              localHashMap.put("acolor", a(a));
            }
            if (Color.alpha(b) != 0) {
              localHashMap.put("bgcolor", a(b));
            }
            if ((Color.alpha(c) != 0) && (Color.alpha(d) != 0))
            {
              localHashMap.put("gradientto", a(c));
              localHashMap.put("gradientfrom", a(d));
            }
            if (Color.alpha(e) != 0) {
              localHashMap.put("bcolor", a(e));
            }
            localHashMap.put("bthick", Integer.toString(f));
          }
        }
        switch (g)
        {
        default: 
          if (localObject1 != null) {
            localHashMap.put("btype", localObject1);
          }
          switch (h)
          {
          default: 
            if (localObject1 != null) {
              localHashMap.put("callbuttoncolor", localObject1);
            }
            if (i != null) {
              localHashMap.put("channel", i);
            }
            if (Color.alpha(j) != 0) {
              localHashMap.put("dcolor", a(j));
            }
            if (k != null) {
              localHashMap.put("font", k);
            }
            if (Color.alpha(l) != 0) {
              localHashMap.put("hcolor", a(l));
            }
            localHashMap.put("headersize", Integer.toString(m));
            if (n != null) {
              localHashMap.put("q", n);
            }
            if ((a >= 3) && (l != null)) {
              localHashMap.put("url", l);
            }
            if (a >= 5)
            {
              if (n != null) {
                localHashMap.put("custom_targeting", n);
              }
              if (o != null) {
                localHashMap.put("category_exclusions", o);
              }
              if (p != null) {
                localHashMap.put("request_agent", p);
              }
            }
            if ((a >= 6) && (q != null)) {
              localHashMap.put("request_pkg", q);
            }
            if (a >= 7) {
              localHashMap.put("is_designed_for_families", Boolean.valueOf(r));
            }
            if (d.g == null)
            {
              localHashMap.put("format", d.a);
              if (d.i) {
                localHashMap.put("fluid", "height");
              }
              if (d.e == -1) {
                localHashMap.put("smart_w", "full");
              }
              if (d.b == -2) {
                localHashMap.put("smart_h", "auto");
              }
              if (d.g == null) {
                break label1383;
              }
              localObject1 = new StringBuilder();
              localObject3 = d.g;
              m = localObject3.length;
              i = 0;
              j = 0;
              if (i >= m) {
                break label1340;
              }
              localObject4 = localObject3[i];
              if (i)
              {
                j = 1;
                break label3856;
              }
            }
            else
            {
              localObject1 = d.g;
              int n = localObject1.length;
              j = 0;
              m = 0;
              i = 0;
              if (i >= n) {
                continue;
              }
              localObject3 = localObject1[i];
              k = m;
              if (!i)
              {
                k = m;
                if (m == 0)
                {
                  localHashMap.put("format", a);
                  k = 1;
                }
              }
              m = j;
              if (!i) {
                break label3919;
              }
              m = j;
              if (j != 0) {
                break label3919;
              }
              localHashMap.put("fluid", "height");
              m = 1;
              break label3919;
            }
            if (((StringBuilder)localObject1).length() != 0) {
              ((StringBuilder)localObject1).append("|");
            }
            if (e != -1) {
              break label1320;
            }
            k = (int)(f / r);
            ((StringBuilder)localObject1).append(k);
            ((StringBuilder)localObject1).append("x");
            if (b != -2) {
              break label1330;
            }
            k = (int)(c / r);
            ((StringBuilder)localObject1).append(k);
          }
          break;
        }
      }
      catch (JSONException paramContext)
      {
        paramContext = String.valueOf(paramContext.getMessage());
        if (paramContext.length() == 0) {
          break label3830;
        }
      }
      paramContext = "Problem serializing ad request to JSON: ".concat(paramContext);
      label1314:
      tp.e(paramContext);
      return null;
      label1320:
      k = e;
      continue;
      label1330:
      k = b;
    }
    label1340:
    if (j != 0)
    {
      if (((StringBuilder)localObject1).length() != 0) {
        ((StringBuilder)localObject1).insert(0, "|");
      }
      ((StringBuilder)localObject1).insert(0, "320x50");
    }
    localHashMap.put("sz", localObject1);
    label1383:
    if (m != 0)
    {
      localHashMap.put("native_version", Integer.valueOf(m));
      localHashMap.put("native_templates", n);
      localObject1 = y;
      if (localObject1 == null) {
        break label3981;
      }
      i = c;
      break label3943;
      label1443:
      localHashMap.put("native_image_orientation", localObject1);
      if (!z.isEmpty()) {
        localHashMap.put("native_custom_templates", z);
      }
    }
    if (d.j) {
      localHashMap.put("ene", Boolean.valueOf(true));
    }
    if (P != null)
    {
      localHashMap.put("is_icon_ad", Boolean.valueOf(true));
      localHashMap.put("icon_ad_expansion_behavior", Integer.valueOf(P.a));
    }
    localHashMap.put("slotname", e);
    localHashMap.put("pn", f.packageName);
    if (g != null) {
      localHashMap.put("vc", Integer.valueOf(g.versionCode));
    }
    localHashMap.put("ms", g);
    localHashMap.put("seq_num", i);
    localHashMap.put("session_id", j);
    localHashMap.put("js", k.a);
    Object localObject5 = e;
    Object localObject4 = N;
    Object localObject1 = b;
    localHashMap.put("am", Integer.valueOf(a));
    localHashMap.put("cog", a(b));
    localHashMap.put("coh", a(c));
    if (!TextUtils.isEmpty(d)) {
      localHashMap.put("carrier", d);
    }
    localHashMap.put("gl", e);
    if (f) {
      localHashMap.put("simulator", Integer.valueOf(1));
    }
    if (g) {
      localHashMap.put("is_sidewinder", Integer.valueOf(1));
    }
    localHashMap.put("ma", a(h));
    localHashMap.put("sp", a(i));
    localHashMap.put("hl", j);
    if (!TextUtils.isEmpty(k)) {
      localHashMap.put("mv", k);
    }
    localHashMap.put("muv", Integer.valueOf(l));
    if (m != -2) {
      localHashMap.put("cnt", Integer.valueOf(m));
    }
    localHashMap.put("gnt", Integer.valueOf(n));
    localHashMap.put("pt", Integer.valueOf(o));
    localHashMap.put("rm", Integer.valueOf(p));
    localHashMap.put("riv", Integer.valueOf(q));
    Object localObject3 = new Bundle();
    ((Bundle)localObject3).putString("build", y);
    Bundle localBundle2 = new Bundle();
    localBundle2.putBoolean("is_charging", v);
    localBundle2.putDouble("battery_level", u);
    ((Bundle)localObject3).putBundle("battery", localBundle2);
    localBundle2 = new Bundle();
    localBundle2.putInt("active_network_state", x);
    localBundle2.putBoolean("active_network_metered", w);
    if (localObject5 != null)
    {
      Bundle localBundle3 = new Bundle();
      localBundle3.putInt("predicted_latency_micros", a);
      localBundle3.putLong("predicted_down_throughput_bps", b);
      localBundle3.putLong("predicted_up_throughput_bps", c);
      localBundle2.putBundle("predictions", localBundle3);
    }
    ((Bundle)localObject3).putBundle("network", localBundle2);
    localObject5 = new Bundle();
    ((Bundle)localObject5).putBoolean("is_browser_custom_tabs_capable", z);
    ((Bundle)localObject3).putBundle("browser", (Bundle)localObject5);
    if (localObject4 != null)
    {
      localObject5 = new Bundle();
      ((Bundle)localObject5).putString("runtime_free", Long.toString(((Bundle)localObject4).getLong("runtime_free_memory", -1L)));
      ((Bundle)localObject5).putString("runtime_max", Long.toString(((Bundle)localObject4).getLong("runtime_max_memory", -1L)));
      ((Bundle)localObject5).putString("runtime_total", Long.toString(((Bundle)localObject4).getLong("runtime_total_memory", -1L)));
      ((Bundle)localObject5).putString("web_view_count", Integer.toString(((Bundle)localObject4).getInt("web_view_count", 0)));
      localObject4 = (Debug.MemoryInfo)((Bundle)localObject4).getParcelable("debug_memory_info");
      if (localObject4 != null)
      {
        ((Bundle)localObject5).putString("debug_info_dalvik_private_dirty", Integer.toString(dalvikPrivateDirty));
        ((Bundle)localObject5).putString("debug_info_dalvik_pss", Integer.toString(dalvikPss));
        ((Bundle)localObject5).putString("debug_info_dalvik_shared_dirty", Integer.toString(dalvikSharedDirty));
        ((Bundle)localObject5).putString("debug_info_native_private_dirty", Integer.toString(nativePrivateDirty));
        ((Bundle)localObject5).putString("debug_info_native_pss", Integer.toString(nativePss));
        ((Bundle)localObject5).putString("debug_info_native_shared_dirty", Integer.toString(nativeSharedDirty));
        ((Bundle)localObject5).putString("debug_info_other_private_dirty", Integer.toString(otherPrivateDirty));
        ((Bundle)localObject5).putString("debug_info_other_pss", Integer.toString(otherPss));
        ((Bundle)localObject5).putString("debug_info_other_shared_dirty", Integer.toString(otherSharedDirty));
      }
      ((Bundle)localObject3).putBundle("android_mem_info", (Bundle)localObject5);
    }
    localObject4 = new Bundle();
    ((Bundle)localObject4).putBundle("parental_controls", (Bundle)localObject1);
    ((Bundle)localObject3).putBundle("play_store", (Bundle)localObject4);
    localHashMap.put("device", localObject3);
    localObject3 = new Bundle();
    ((Bundle)localObject3).putString("doritos", f);
    localObject1 = ke.aM;
    boolean bool;
    if (((Boolean)w.q().a((jz)localObject1)).booleanValue())
    {
      localObject1 = null;
      bool = false;
      if (h != null)
      {
        localObject1 = h.a;
        bool = h.b;
      }
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        ((Bundle)localObject3).putString("rdid", (String)localObject1);
        ((Bundle)localObject3).putBoolean("is_lat", bool);
        ((Bundle)localObject3).putString("idtype", "adid");
      }
    }
    else
    {
      label2631:
      localHashMap.put("pii", localObject3);
      localHashMap.put("platform", Build.MANUFACTURER);
      localHashMap.put("submodel", Build.MODEL);
      if (localObject2 == null) {
        break label3692;
      }
      a(localHashMap, (Location)localObject2);
      label2678:
      if (a >= 2) {
        localHashMap.put("quality_signals", l);
      }
      if ((a >= 4) && (p)) {
        localHashMap.put("forceHttps", Boolean.valueOf(p));
      }
      if (localBundle1 != null) {
        localHashMap.put("content_info", localBundle1);
      }
      if (a < 5) {
        break label3731;
      }
      localHashMap.put("u_sd", Float.valueOf(s));
      localHashMap.put("sh", Integer.valueOf(r));
      localHashMap.put("sw", Integer.valueOf(q));
      label2811:
      if (a >= 6)
      {
        bool = TextUtils.isEmpty(t);
        if (bool) {}
      }
    }
    for (;;)
    {
      try
      {
        localHashMap.put("view_hierarchy", new JSONObject(t));
        localHashMap.put("correlation_id", Long.valueOf(u));
        if (a >= 7) {
          localHashMap.put("request_id", v);
        }
        if ((a >= 11) && (B != null))
        {
          paramrf = B;
          localObject1 = new Bundle();
          ((Bundle)localObject1).putBoolean("iap_supported", a);
          ((Bundle)localObject1).putBoolean("default_iap_supported", b);
          ((Bundle)localObject1).putBoolean("app_streaming_supported", c);
          localHashMap.put("capability", localObject1);
        }
        if ((a >= 12) && (!TextUtils.isEmpty(C))) {
          localHashMap.put("anchor", C);
        }
        if (a >= 13) {
          localHashMap.put("android_app_volume", Float.valueOf(D));
        }
        if (a >= 18) {
          localHashMap.put("android_app_muted", Boolean.valueOf(J));
        }
        if ((a >= 14) && (E > 0)) {
          localHashMap.put("target_api", Integer.valueOf(E));
        }
        if (a >= 15)
        {
          if (F == -1)
          {
            i = -1;
            localHashMap.put("scroll_index", Integer.valueOf(i));
          }
        }
        else
        {
          if (a >= 16) {
            localHashMap.put("_activity_context", Boolean.valueOf(G));
          }
          if (a >= 18)
          {
            bool = TextUtils.isEmpty(K);
            if (bool) {}
          }
        }
      }
      catch (JSONException paramrf)
      {
        try
        {
          localHashMap.put("app_settings", new JSONObject(K));
          localHashMap.put("render_in_browser", Boolean.valueOf(L));
          if (a >= 18) {
            localHashMap.put("android_num_video_cache_tasks", Integer.valueOf(M));
          }
          paramrf = k;
          localObject1 = new Bundle();
          localObject2 = new Bundle();
          ((Bundle)localObject2).putString("cl", "155828604");
          ((Bundle)localObject2).putString("rapid_rc", "dev");
          ((Bundle)localObject2).putString("rapid_rollup", "HEAD");
          ((Bundle)localObject1).putBundle("build_meta", (Bundle)localObject2);
          localObject2 = ke.ca;
          ((Bundle)localObject1).putString("mf", Boolean.toString(((Boolean)w.q().a((jz)localObject2)).booleanValue()));
          ((Bundle)localObject1).putBoolean("instant_app", bc.a(paramContext).a());
          ((Bundle)localObject1).putBoolean("lite", e);
          localHashMap.put("sdk_env", localObject1);
          localHashMap.put("cache_state", localJSONObject);
          if (a >= 19) {
            localHashMap.put("gct", O);
          }
          if ((a >= 21) && (Q)) {
            localHashMap.put("de", "1");
          }
          paramContext = ke.aW;
          if (((Boolean)w.q().a(paramContext)).booleanValue())
          {
            paramContext = d.a;
            if (paramContext.equals("interstitial_mb")) {
              break label3976;
            }
            if (!paramContext.equals("reward_mb")) {
              break label4000;
            }
            break label3976;
            label3504:
            paramContext = R;
            if (paramContext == null) {
              break label4005;
            }
            j = 1;
            if ((i != 0) && (j != 0))
            {
              paramrf = new Bundle();
              paramrf.putBundle("interstitial_pool", paramContext);
              localHashMap.put("counters", paramrf);
            }
          }
          if ((a >= 22) && (w.D().a()))
          {
            localHashMap.put("gmp_app_id", S);
            localHashMap.put("fbs_aiid", T);
            localHashMap.put("fbs_aeid", U);
          }
          if (tp.a(2))
          {
            paramContext = String.valueOf(w.e().a(localHashMap).toString(2));
            if (paramContext.length() != 0)
            {
              paramContext = "Ad Request JSON: ".concat(paramContext);
              tp.a(paramContext);
            }
          }
          else
          {
            return w.e().a(localHashMap);
            ip.a();
            ((Bundle)localObject3).putString("pdid", uk.b(paramContext));
            ((Bundle)localObject3).putString("pdidtype", "ssaid");
            break label2631;
            label3692:
            if ((c.a < 2) || (c.k == null)) {
              break label2678;
            }
            a(localHashMap, c.k);
            break label2678;
            label3731:
            localHashMap.put("u_sd", Float.valueOf(r));
            localHashMap.put("sh", Integer.valueOf(t));
            localHashMap.put("sw", Integer.valueOf(s));
            break label2811;
            paramrf = paramrf;
            tp.c("Problem serializing view hierarchy to JSON", paramrf);
            continue;
            i = F;
          }
        }
        catch (JSONException paramrf)
        {
          tp.c("Problem creating json from app settings", paramrf);
          continue;
          paramContext = new String("Ad Request JSON: ");
          continue;
        }
      }
      label3830:
      paramContext = new String("Problem serializing ad request to JSON: ");
      break label1314;
      localObject1 = null;
      break;
      localObject1 = null;
      break label608;
      label3856:
      i += 1;
      break label1065;
      localObject1 = "none";
      break;
      localObject1 = "dashed";
      break;
      localObject1 = "dotted";
      break;
      localObject1 = "solid";
      break;
      localObject1 = "dark";
      break label608;
      localObject1 = "light";
      break label608;
      localObject1 = "medium";
      break label608;
      label3919:
      if ((k != 0) && (m != 0)) {
        break label977;
      }
      i += 1;
      j = m;
      m = k;
      break label1112;
      for (;;)
      {
        switch (i)
        {
        default: 
          label3943:
          localObject1 = "any";
          break label1443;
          label3976:
          i = 1;
          break label3504;
          label3981:
          i = 0;
        }
      }
      localObject1 = "portrait";
      break label1443;
      localObject1 = "landscape";
      break label1443;
      label4000:
      i = 0;
      continue;
      label4005:
      j = 0;
    }
  }
  
  public static JSONObject a(qr paramqr)
  {
    JSONObject localJSONObject = new JSONObject();
    if (b != null) {
      localJSONObject.put("ad_base_url", b);
    }
    if (m != null) {
      localJSONObject.put("ad_size", m);
    }
    localJSONObject.put("native", t);
    if (t)
    {
      localJSONObject.put("ad_json", c);
      if (o != null) {
        localJSONObject.put("debug_dialog", o);
      }
      if (N != null) {
        localJSONObject.put("debug_signals", N);
      }
      if (g != -1L) {
        localJSONObject.put("interstitial_timeout", g / 1000.0D);
      }
      if (l != w.g().b()) {
        break label575;
      }
      localJSONObject.put("orientation", "portrait");
      label159:
      if (d != null) {
        localJSONObject.put("click_urls", a(d));
      }
      if (f != null) {
        localJSONObject.put("impression_urls", a(f));
      }
      if (j != null) {
        localJSONObject.put("manual_impression_urls", a(j));
      }
      if (r != null) {
        localJSONObject.put("active_view", r);
      }
      localJSONObject.put("ad_is_javascript", p);
      if (q != null) {
        localJSONObject.put("ad_passback_url", q);
      }
      localJSONObject.put("mediation", h);
      localJSONObject.put("custom_render_allowed", s);
      localJSONObject.put("content_url_opted_out", v);
      localJSONObject.put("content_vertical_opted_out", O);
      localJSONObject.put("prefetch", w);
      if (k != -1L) {
        localJSONObject.put("refresh_interval_milliseconds", k);
      }
      if (i != -1L) {
        localJSONObject.put("mediation_config_cache_time_milliseconds", i);
      }
      if (!TextUtils.isEmpty(z)) {
        localJSONObject.put("gws_query_id", z);
      }
      if (!A) {
        break label600;
      }
    }
    label575:
    label600:
    for (Object localObject1 = "height";; localObject1 = "")
    {
      localJSONObject.put("fluid", localObject1);
      localJSONObject.put("native_express", B);
      if (D != null) {
        localJSONObject.put("video_start_urls", a(D));
      }
      if (E != null) {
        localJSONObject.put("video_complete_urls", a(E));
      }
      if (C != null)
      {
        Object localObject2 = C;
        localObject1 = new JSONObject();
        ((JSONObject)localObject1).put("rb_type", a);
        ((JSONObject)localObject1).put("rb_amount", b);
        localObject2 = new JSONArray();
        ((JSONArray)localObject2).put(localObject1);
        localJSONObject.put("rewards", localObject2);
      }
      localJSONObject.put("use_displayed_impression", F);
      localJSONObject.put("auto_protection_configuration", G);
      localJSONObject.put("render_in_browser", K);
      return localJSONObject;
      localJSONObject.put("ad_html", c);
      break;
      if (l != w.g().a()) {
        break label159;
      }
      localJSONObject.put("orientation", "landscape");
      break label159;
    }
  }
  
  private static void a(HashMap<String, Object> paramHashMap, Location paramLocation)
  {
    HashMap localHashMap = new HashMap();
    float f = paramLocation.getAccuracy();
    long l1 = paramLocation.getTime();
    long l2 = (paramLocation.getLatitude() * 1.0E7D);
    long l3 = (paramLocation.getLongitude() * 1.0E7D);
    localHashMap.put("radius", Float.valueOf(f * 1000.0F));
    localHashMap.put("lat", Long.valueOf(l2));
    localHashMap.put("long", Long.valueOf(l3));
    localHashMap.put("time", Long.valueOf(l1 * 1000L));
    paramHashMap.put("uule", localHashMap);
  }
}


/* Location:              com/google/android/gms/b/ri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */