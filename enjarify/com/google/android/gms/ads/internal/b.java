package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.d;
import com.google.android.gms.ads.internal.purchase.f;
import com.google.android.gms.ads.internal.purchase.g;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.hi;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.km;
import com.google.android.gms.b.mf;
import com.google.android.gms.b.nr;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.nt;
import com.google.android.gms.b.nu;
import com.google.android.gms.b.nx;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.od;
import com.google.android.gms.b.pg;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pk;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.qk;
import com.google.android.gms.b.qo.a;
import com.google.android.gms.b.rb;
import com.google.android.gms.b.ta;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.th;
import com.google.android.gms.b.th.a;
import com.google.android.gms.b.ti;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tm;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tu;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public abstract class b
  extends a
  implements com.google.android.gms.ads.internal.overlay.j, com.google.android.gms.ads.internal.purchase.j, u, mf, nt
{
  protected final oc j;
  protected transient boolean k;
  
  public b(Context paramContext, il paramil, String paramString, oc paramoc, un paramun, e parame)
  {
    this(localx, paramoc, parame);
  }
  
  private b(x paramx, oc paramoc, e parame)
  {
    super(paramx, parame);
    j = paramoc;
    k = false;
  }
  
  /* Error */
  private qo.a a(ih paramih, Bundle paramBundle, ti paramti)
  {
    // Byte code:
    //   0: aload_0
    //   1: astore 4
    //   3: aload_0
    //   4: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   7: getfield 42	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   10: astore 5
    //   12: aload 5
    //   14: invokevirtual 48	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   17: astore 6
    //   19: aload_0
    //   20: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   23: astore 5
    //   25: aload 5
    //   27: getfield 42	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   30: astore 5
    //   32: aload 5
    //   34: invokestatic 54	com/google/android/gms/b/bc:a	(Landroid/content/Context;)Lcom/google/android/gms/b/bb;
    //   37: astore 5
    //   39: aload 6
    //   41: getfield 60	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   44: astore 7
    //   46: iconst_0
    //   47: istore 8
    //   49: aconst_null
    //   50: astore 9
    //   52: aload 5
    //   54: aload 7
    //   56: iconst_0
    //   57: invokevirtual 66	com/google/android/gms/b/bb:b	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   60: astore 10
    //   62: aload_0
    //   63: astore 4
    //   65: aload_0
    //   66: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   69: getfield 42	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   72: invokevirtual 70	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   75: invokevirtual 76	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   78: astore 11
    //   80: iconst_0
    //   81: istore 8
    //   83: aconst_null
    //   84: astore 9
    //   86: aload_0
    //   87: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   90: getfield 79	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   93: astore 5
    //   95: aload 5
    //   97: ifnull +226 -> 323
    //   100: aload_0
    //   101: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   104: getfield 79	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   107: invokevirtual 85	com/google/android/gms/ads/internal/x$a:getParent	()Landroid/view/ViewParent;
    //   110: astore 5
    //   112: aload 5
    //   114: ifnull +209 -> 323
    //   117: iconst_2
    //   118: newarray <illegal type>
    //   120: astore 5
    //   122: aload_0
    //   123: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   126: getfield 79	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   129: aload 5
    //   131: invokevirtual 90	com/google/android/gms/ads/internal/x$a:getLocationOnScreen	([I)V
    //   134: aconst_null
    //   135: astore 7
    //   137: aload 5
    //   139: iconst_0
    //   140: iaload
    //   141: istore 12
    //   143: aload 5
    //   145: iconst_1
    //   146: iaload
    //   147: istore 13
    //   149: aload_0
    //   150: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   153: getfield 79	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   156: invokevirtual 95	com/google/android/gms/ads/internal/x$a:getWidth	()I
    //   159: istore 14
    //   161: aload_0
    //   162: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   165: getfield 79	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   168: invokevirtual 98	com/google/android/gms/ads/internal/x$a:getHeight	()I
    //   171: istore 15
    //   173: iconst_0
    //   174: istore 16
    //   176: aconst_null
    //   177: astore 5
    //   179: aload_0
    //   180: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   183: getfield 79	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   186: astore 9
    //   188: aload 9
    //   190: invokevirtual 102	com/google/android/gms/ads/internal/x$a:isShown	()Z
    //   193: istore 8
    //   195: iload 8
    //   197: ifeq +58 -> 255
    //   200: iload 12
    //   202: iload 14
    //   204: iadd
    //   205: istore 8
    //   207: iload 8
    //   209: ifle +46 -> 255
    //   212: iload 13
    //   214: iload 15
    //   216: iadd
    //   217: istore 8
    //   219: iload 8
    //   221: ifle +34 -> 255
    //   224: aload 11
    //   226: getfield 108	android/util/DisplayMetrics:widthPixels	I
    //   229: istore 8
    //   231: iload 12
    //   233: iload 8
    //   235: if_icmpgt +20 -> 255
    //   238: aload 11
    //   240: getfield 111	android/util/DisplayMetrics:heightPixels	I
    //   243: istore 8
    //   245: iload 13
    //   247: iload 8
    //   249: if_icmpgt +6 -> 255
    //   252: iconst_1
    //   253: istore 16
    //   255: new 113	android/os/Bundle
    //   258: astore 9
    //   260: iconst_5
    //   261: istore 17
    //   263: aload 9
    //   265: iload 17
    //   267: invokespecial 117	android/os/Bundle:<init>	(I)V
    //   270: ldc 119
    //   272: astore 18
    //   274: aload 9
    //   276: aload 18
    //   278: iload 12
    //   280: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   283: aload 9
    //   285: ldc 125
    //   287: iload 13
    //   289: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   292: aload 9
    //   294: ldc 127
    //   296: iload 14
    //   298: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   301: aload 9
    //   303: ldc -127
    //   305: iload 15
    //   307: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   310: ldc -125
    //   312: astore 7
    //   314: aload 9
    //   316: aload 7
    //   318: iload 16
    //   320: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   323: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   326: invokevirtual 142	com/google/android/gms/b/tj:c	()Ljava/lang/String;
    //   329: astore 19
    //   331: aload_0
    //   332: astore 4
    //   334: aload_0
    //   335: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   338: astore 5
    //   340: new 144	com/google/android/gms/b/th
    //   343: astore 7
    //   345: aload_0
    //   346: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   349: getfield 146	com/google/android/gms/ads/internal/x:b	Ljava/lang/String;
    //   352: astore 20
    //   354: aload 7
    //   356: aload 19
    //   358: aload 20
    //   360: invokespecial 149	com/google/android/gms/b/th:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   363: aload 5
    //   365: aload 7
    //   367: putfield 153	com/google/android/gms/ads/internal/x:l	Lcom/google/android/gms/b/th;
    //   370: aload_0
    //   371: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   374: getfield 153	com/google/android/gms/ads/internal/x:l	Lcom/google/android/gms/b/th;
    //   377: astore 5
    //   379: aload 5
    //   381: getfield 156	com/google/android/gms/b/th:c	Ljava/lang/Object;
    //   384: astore 7
    //   386: aload 7
    //   388: monitorenter
    //   389: invokestatic 162	android/os/SystemClock:elapsedRealtime	()J
    //   392: lstore 21
    //   394: aload 5
    //   396: lload 21
    //   398: putfield 165	com/google/android/gms/b/th:i	J
    //   401: aload 5
    //   403: getfield 168	com/google/android/gms/b/th:a	Lcom/google/android/gms/b/tj;
    //   406: astore 20
    //   408: aload 20
    //   410: invokevirtual 172	com/google/android/gms/b/tj:d	()Lcom/google/android/gms/b/tk;
    //   413: astore 20
    //   415: aload 5
    //   417: getfield 165	com/google/android/gms/b/th:i	J
    //   420: lstore 23
    //   422: aload 20
    //   424: getfield 176	com/google/android/gms/b/tk:f	Ljava/lang/Object;
    //   427: astore 25
    //   429: aload 25
    //   431: monitorenter
    //   432: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   435: astore 5
    //   437: aload 5
    //   439: invokevirtual 179	com/google/android/gms/b/tj:m	()J
    //   442: lstore 26
    //   444: invokestatic 182	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   447: astore 5
    //   449: aload 5
    //   451: invokeinterface 186 1 0
    //   456: lstore 28
    //   458: aload 20
    //   460: getfield 188	com/google/android/gms/b/tk:b	J
    //   463: lstore 30
    //   465: lload 30
    //   467: lstore 32
    //   469: iconst_m1
    //   470: i2l
    //   471: lstore 34
    //   473: lload 30
    //   475: lload 34
    //   477: lcmp
    //   478: istore 16
    //   480: iload 16
    //   482: ifne +395 -> 877
    //   485: lload 28
    //   487: lload 26
    //   489: lsub
    //   490: lstore 26
    //   492: getstatic 194	com/google/android/gms/b/ke:aL	Lcom/google/android/gms/b/jz;
    //   495: astore 5
    //   497: invokestatic 198	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   500: astore 18
    //   502: aload 18
    //   504: aload 5
    //   506: invokevirtual 203	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   509: astore 5
    //   511: aload 5
    //   513: checkcast 205	java/lang/Long
    //   516: astore 5
    //   518: aload 5
    //   520: invokevirtual 208	java/lang/Long:longValue	()J
    //   523: lstore 32
    //   525: lload 26
    //   527: lload 32
    //   529: lcmp
    //   530: istore 16
    //   532: iload 16
    //   534: ifle +305 -> 839
    //   537: iconst_m1
    //   538: istore 16
    //   540: aload 20
    //   542: iload 16
    //   544: putfield 210	com/google/android/gms/b/tk:d	I
    //   547: aload 20
    //   549: lload 23
    //   551: putfield 188	com/google/android/gms/b/tk:b	J
    //   554: aload 20
    //   556: getfield 188	com/google/android/gms/b/tk:b	J
    //   559: lstore 23
    //   561: aload 20
    //   563: lload 23
    //   565: putfield 212	com/google/android/gms/b/tk:a	J
    //   568: aload_1
    //   569: astore 4
    //   571: aload_1
    //   572: getfield 217	com/google/android/gms/b/ih:c	Landroid/os/Bundle;
    //   575: astore 5
    //   577: aload 5
    //   579: ifnull +308 -> 887
    //   582: aload_1
    //   583: getfield 217	com/google/android/gms/b/ih:c	Landroid/os/Bundle;
    //   586: astore 5
    //   588: ldc -37
    //   590: astore 18
    //   592: iconst_2
    //   593: istore 36
    //   595: aload 5
    //   597: aload 18
    //   599: iload 36
    //   601: invokevirtual 223	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   604: istore 16
    //   606: iconst_1
    //   607: istore 17
    //   609: iload 16
    //   611: iload 17
    //   613: if_icmpne +274 -> 887
    //   616: aload 25
    //   618: monitorexit
    //   619: aload 7
    //   621: monitorexit
    //   622: invokestatic 227	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   625: pop
    //   626: aload_0
    //   627: astore 4
    //   629: aload_0
    //   630: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   633: getfield 42	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   636: astore 5
    //   638: aload_0
    //   639: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   642: getfield 79	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   645: astore 7
    //   647: aload_0
    //   648: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   651: getfield 230	com/google/android/gms/ads/internal/x:i	Lcom/google/android/gms/b/il;
    //   654: astore 20
    //   656: aload 5
    //   658: aload 7
    //   660: aload 20
    //   662: invokestatic 235	com/google/android/gms/b/tt:a	(Landroid/content/Context;Landroid/view/View;Lcom/google/android/gms/b/il;)Ljava/lang/String;
    //   665: astore 37
    //   667: lconst_0
    //   668: lstore 38
    //   670: aload_0
    //   671: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   674: getfield 239	com/google/android/gms/ads/internal/x:p	Lcom/google/android/gms/b/jb;
    //   677: astore 5
    //   679: aload 5
    //   681: ifnull +25 -> 706
    //   684: aload_0
    //   685: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   688: astore 5
    //   690: aload 5
    //   692: getfield 239	com/google/android/gms/ads/internal/x:p	Lcom/google/android/gms/b/jb;
    //   695: astore 5
    //   697: aload 5
    //   699: invokeinterface 242 1 0
    //   704: lstore 38
    //   706: invokestatic 248	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   709: invokevirtual 251	java/util/UUID:toString	()Ljava/lang/String;
    //   712: astore 40
    //   714: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   717: astore 5
    //   719: aload_0
    //   720: astore 4
    //   722: aload_0
    //   723: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   726: getfield 42	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   729: astore 7
    //   731: aload 5
    //   733: aload 7
    //   735: aload_0
    //   736: aload 19
    //   738: invokevirtual 254	com/google/android/gms/b/tj:a	(Landroid/content/Context;Lcom/google/android/gms/b/tl;Ljava/lang/String;)Landroid/os/Bundle;
    //   741: astore 41
    //   743: new 256	java/util/ArrayList
    //   746: astore 42
    //   748: aload 42
    //   750: invokespecial 259	java/util/ArrayList:<init>	()V
    //   753: iconst_0
    //   754: istore 16
    //   756: aconst_null
    //   757: astore 5
    //   759: iconst_0
    //   760: istore 12
    //   762: aconst_null
    //   763: astore 7
    //   765: aload_0
    //   766: astore 4
    //   768: aload_0
    //   769: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   772: getfield 263	com/google/android/gms/ads/internal/x:v	Landroid/support/v4/g/k;
    //   775: astore 5
    //   777: aload 5
    //   779: invokevirtual 268	android/support/v4/g/k:size	()I
    //   782: istore 16
    //   784: iload 12
    //   786: iload 16
    //   788: if_icmpge +220 -> 1008
    //   791: aload_0
    //   792: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   795: getfield 263	com/google/android/gms/ads/internal/x:v	Landroid/support/v4/g/k;
    //   798: iload 12
    //   800: invokevirtual 271	android/support/v4/g/k:b	(I)Ljava/lang/Object;
    //   803: checkcast 273	java/lang/String
    //   806: astore 5
    //   808: aload 42
    //   810: aload 5
    //   812: invokeinterface 279 2 0
    //   817: pop
    //   818: iload 12
    //   820: iconst_1
    //   821: iadd
    //   822: istore 16
    //   824: iload 16
    //   826: istore 12
    //   828: goto -63 -> 765
    //   831: astore 5
    //   833: aconst_null
    //   834: astore 10
    //   836: goto -774 -> 62
    //   839: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   842: astore 5
    //   844: aload 5
    //   846: invokevirtual 282	com/google/android/gms/b/tj:o	()I
    //   849: istore 16
    //   851: aload 20
    //   853: iload 16
    //   855: putfield 210	com/google/android/gms/b/tk:d	I
    //   858: goto -311 -> 547
    //   861: astore 5
    //   863: aload 25
    //   865: monitorexit
    //   866: aload 5
    //   868: athrow
    //   869: astore 5
    //   871: aload 7
    //   873: monitorexit
    //   874: aload 5
    //   876: athrow
    //   877: aload 20
    //   879: lload 23
    //   881: putfield 212	com/google/android/gms/b/tk:a	J
    //   884: goto -316 -> 568
    //   887: aload 20
    //   889: getfield 284	com/google/android/gms/b/tk:c	I
    //   892: iconst_1
    //   893: iadd
    //   894: istore 16
    //   896: aload 20
    //   898: iload 16
    //   900: putfield 284	com/google/android/gms/b/tk:c	I
    //   903: aload 20
    //   905: getfield 210	com/google/android/gms/b/tk:d	I
    //   908: iconst_1
    //   909: iadd
    //   910: istore 16
    //   912: aload 20
    //   914: iload 16
    //   916: putfield 210	com/google/android/gms/b/tk:d	I
    //   919: aload 20
    //   921: getfield 210	com/google/android/gms/b/tk:d	I
    //   924: istore 16
    //   926: iload 16
    //   928: ifne +36 -> 964
    //   931: lconst_0
    //   932: lstore 23
    //   934: aload 20
    //   936: lload 23
    //   938: putfield 286	com/google/android/gms/b/tk:e	J
    //   941: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   944: astore 5
    //   946: lload 28
    //   948: lstore 30
    //   950: aload 5
    //   952: lload 28
    //   954: invokevirtual 289	com/google/android/gms/b/tj:a	(J)Ljava/util/concurrent/Future;
    //   957: pop
    //   958: aload 25
    //   960: monitorexit
    //   961: goto -342 -> 619
    //   964: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   967: astore 5
    //   969: aload 5
    //   971: invokevirtual 292	com/google/android/gms/b/tj:n	()J
    //   974: lstore 23
    //   976: lload 28
    //   978: lload 23
    //   980: lsub
    //   981: lstore 23
    //   983: aload 20
    //   985: lload 23
    //   987: putfield 286	com/google/android/gms/b/tk:e	J
    //   990: goto -32 -> 958
    //   993: astore 5
    //   995: ldc_w 294
    //   998: astore 5
    //   1000: aload 5
    //   1002: invokestatic 299	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   1005: goto -299 -> 706
    //   1008: aload_0
    //   1009: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1012: getfield 302	com/google/android/gms/ads/internal/x:q	Lcom/google/android/gms/b/ph;
    //   1015: astore 5
    //   1017: aload 5
    //   1019: ifnull +736 -> 1755
    //   1022: iconst_1
    //   1023: istore 16
    //   1025: aload_0
    //   1026: astore 4
    //   1028: aload_0
    //   1029: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1032: getfield 306	com/google/android/gms/ads/internal/x:r	Lcom/google/android/gms/b/pl;
    //   1035: astore 7
    //   1037: aload 7
    //   1039: ifnull +725 -> 1764
    //   1042: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1045: astore 7
    //   1047: aload 7
    //   1049: invokevirtual 308	com/google/android/gms/b/tj:r	()Z
    //   1052: istore 12
    //   1054: iload 12
    //   1056: ifeq +708 -> 1764
    //   1059: iconst_1
    //   1060: istore 12
    //   1062: new 310	com/google/android/gms/ads/internal/b$1
    //   1065: astore 20
    //   1067: aload_0
    //   1068: astore 4
    //   1070: aload 20
    //   1072: aload_0
    //   1073: invokespecial 313	com/google/android/gms/ads/internal/b$1:<init>	(Lcom/google/android/gms/ads/internal/b;)V
    //   1076: aload 20
    //   1078: invokestatic 318	com/google/android/gms/b/ts:a	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/b/us;
    //   1081: astore 20
    //   1083: new 320	com/google/android/gms/ads/internal/b$2
    //   1086: astore 25
    //   1088: aload 25
    //   1090: aload_0
    //   1091: invokespecial 321	com/google/android/gms/ads/internal/b$2:<init>	(Lcom/google/android/gms/ads/internal/b;)V
    //   1094: aload 25
    //   1096: invokestatic 318	com/google/android/gms/b/ts:a	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/b/us;
    //   1099: astore 43
    //   1101: new 323	com/google/android/gms/ads/internal/b$3
    //   1104: astore 25
    //   1106: aload 25
    //   1108: aload_0
    //   1109: invokespecial 324	com/google/android/gms/ads/internal/b$3:<init>	(Lcom/google/android/gms/ads/internal/b;)V
    //   1112: aload 25
    //   1114: invokestatic 318	com/google/android/gms/b/ts:a	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/b/us;
    //   1117: astore 44
    //   1119: aconst_null
    //   1120: astore 45
    //   1122: aload_3
    //   1123: ifnull +16 -> 1139
    //   1126: aload_3
    //   1127: astore 4
    //   1129: aload_3
    //   1130: getfield 328	com/google/android/gms/b/ti:d	Ljava/lang/String;
    //   1133: astore 4
    //   1135: aload 4
    //   1137: astore 45
    //   1139: new 330	com/google/android/gms/b/up
    //   1142: astore 46
    //   1144: aload 46
    //   1146: invokespecial 331	com/google/android/gms/b/up:<init>	()V
    //   1149: new 333	com/google/android/gms/ads/internal/b$4
    //   1152: astore 25
    //   1154: aload 46
    //   1156: astore 4
    //   1158: aload 25
    //   1160: aload 20
    //   1162: aload 46
    //   1164: iload 16
    //   1166: iload 12
    //   1168: invokespecial 336	com/google/android/gms/ads/internal/b$4:<init>	(Lcom/google/android/gms/b/us;Lcom/google/android/gms/b/up;ZZ)V
    //   1171: aload 20
    //   1173: aload 25
    //   1175: invokeinterface 341 2 0
    //   1180: new 343	com/google/android/gms/b/qo$a
    //   1183: astore 7
    //   1185: aload_0
    //   1186: astore 4
    //   1188: aload_0
    //   1189: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1192: getfield 230	com/google/android/gms/ads/internal/x:i	Lcom/google/android/gms/b/il;
    //   1195: astore 20
    //   1197: aload_0
    //   1198: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1201: getfield 146	com/google/android/gms/ads/internal/x:b	Ljava/lang/String;
    //   1204: astore 25
    //   1206: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1209: getfield 344	com/google/android/gms/b/tj:b	Ljava/lang/String;
    //   1212: astore 18
    //   1214: aload_0
    //   1215: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1218: getfield 347	com/google/android/gms/ads/internal/x:e	Lcom/google/android/gms/b/un;
    //   1221: astore 47
    //   1223: aload_0
    //   1224: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1227: getfield 351	com/google/android/gms/ads/internal/x:B	Ljava/util/List;
    //   1230: astore 48
    //   1232: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1235: invokevirtual 354	com/google/android/gms/b/tj:g	()Z
    //   1238: istore 49
    //   1240: aload 11
    //   1242: getfield 108	android/util/DisplayMetrics:widthPixels	I
    //   1245: istore 50
    //   1247: aload 11
    //   1249: getfield 111	android/util/DisplayMetrics:heightPixels	I
    //   1252: istore 51
    //   1254: iload 51
    //   1256: istore 52
    //   1258: aload 11
    //   1260: getfield 358	android/util/DisplayMetrics:density	F
    //   1263: fstore 53
    //   1265: fload 53
    //   1267: fstore 54
    //   1269: invokestatic 361	com/google/android/gms/b/ke:a	()Ljava/util/List;
    //   1272: astore 55
    //   1274: aload_0
    //   1275: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1278: getfield 363	com/google/android/gms/ads/internal/x:a	Ljava/lang/String;
    //   1281: astore 56
    //   1283: aload_0
    //   1284: astore 4
    //   1286: aload_0
    //   1287: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1290: getfield 367	com/google/android/gms/ads/internal/x:w	Lcom/google/android/gms/b/le;
    //   1293: astore 57
    //   1295: aload_0
    //   1296: astore 4
    //   1298: aload_0
    //   1299: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1302: astore 5
    //   1304: aload 5
    //   1306: getfield 369	com/google/android/gms/ads/internal/x:J	Z
    //   1309: istore 58
    //   1311: iload 58
    //   1313: ifeq +15 -> 1328
    //   1316: aload 5
    //   1318: getfield 372	com/google/android/gms/ads/internal/x:K	Z
    //   1321: istore 58
    //   1323: iload 58
    //   1325: ifne +496 -> 1821
    //   1328: aload 5
    //   1330: getfield 369	com/google/android/gms/ads/internal/x:J	Z
    //   1333: istore 58
    //   1335: iload 58
    //   1337: ifeq +444 -> 1781
    //   1340: aload 5
    //   1342: getfield 375	com/google/android/gms/ads/internal/x:L	Z
    //   1345: istore 16
    //   1347: iload 16
    //   1349: ifeq +424 -> 1773
    //   1352: ldc_w 377
    //   1355: astore 59
    //   1357: invokestatic 227	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   1360: pop
    //   1361: invokestatic 380	com/google/android/gms/b/tt:d	()F
    //   1364: fstore 60
    //   1366: invokestatic 227	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   1369: pop
    //   1370: invokestatic 382	com/google/android/gms/b/tt:e	()Z
    //   1373: istore 61
    //   1375: invokestatic 227	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   1378: pop
    //   1379: aload_0
    //   1380: astore 4
    //   1382: aload_0
    //   1383: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1386: getfield 42	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   1389: invokestatic 385	com/google/android/gms/b/tt:i	(Landroid/content/Context;)I
    //   1392: istore 62
    //   1394: invokestatic 227	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   1397: pop
    //   1398: aload_0
    //   1399: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1402: getfield 79	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   1405: invokestatic 388	com/google/android/gms/b/tt:b	(Landroid/view/View;)I
    //   1408: istore 63
    //   1410: aload_0
    //   1411: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1414: getfield 42	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   1417: instanceof 390
    //   1420: istore 64
    //   1422: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1425: invokevirtual 392	com/google/android/gms/b/tj:l	()Z
    //   1428: istore 65
    //   1430: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1433: getfield 395	com/google/android/gms/b/tj:h	Z
    //   1436: istore 66
    //   1438: invokestatic 398	com/google/android/gms/ads/internal/w:B	()Lcom/google/android/gms/b/mr;
    //   1441: getfield 402	com/google/android/gms/b/mr:a	Ljava/util/List;
    //   1444: invokeinterface 403 1 0
    //   1449: istore 67
    //   1451: invokestatic 227	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   1454: pop
    //   1455: invokestatic 406	com/google/android/gms/b/tt:f	()Landroid/os/Bundle;
    //   1458: astore 68
    //   1460: invokestatic 409	com/google/android/gms/ads/internal/w:m	()Lcom/google/android/gms/b/tx;
    //   1463: invokevirtual 413	com/google/android/gms/b/tx:a	()Ljava/lang/String;
    //   1466: astore 69
    //   1468: aload_0
    //   1469: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1472: getfield 416	com/google/android/gms/ads/internal/x:y	Lcom/google/android/gms/b/jh;
    //   1475: astore 70
    //   1477: invokestatic 409	com/google/android/gms/ads/internal/w:m	()Lcom/google/android/gms/b/tx;
    //   1480: invokevirtual 418	com/google/android/gms/b/tx:b	()Z
    //   1483: istore 71
    //   1485: invokestatic 423	com/google/android/gms/b/nd:a	()Lcom/google/android/gms/b/nd;
    //   1488: astore 5
    //   1490: new 113	android/os/Bundle
    //   1493: astore 72
    //   1495: aload 72
    //   1497: invokespecial 424	android/os/Bundle:<init>	()V
    //   1500: aload 5
    //   1502: getfield 428	com/google/android/gms/b/nd:a	I
    //   1505: istore 51
    //   1507: aload 72
    //   1509: astore 4
    //   1511: aload 72
    //   1513: ldc_w 426
    //   1516: iload 51
    //   1518: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1521: aload 5
    //   1523: getfield 432	com/google/android/gms/b/nd:b	I
    //   1526: istore 51
    //   1528: aload 72
    //   1530: ldc_w 430
    //   1533: iload 51
    //   1535: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1538: aload 5
    //   1540: getfield 435	com/google/android/gms/b/nd:c	I
    //   1543: istore 51
    //   1545: aload 72
    //   1547: ldc_w 434
    //   1550: iload 51
    //   1552: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1555: aload 5
    //   1557: getfield 438	com/google/android/gms/b/nd:d	I
    //   1560: istore 51
    //   1562: aload 72
    //   1564: ldc_w 437
    //   1567: iload 51
    //   1569: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1572: aload 5
    //   1574: getfield 442	com/google/android/gms/b/nd:e	I
    //   1577: istore 16
    //   1579: aload 72
    //   1581: ldc_w 440
    //   1584: iload 16
    //   1586: invokevirtual 123	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1589: invokestatic 137	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1592: pop
    //   1593: aload_0
    //   1594: astore 4
    //   1596: aload_0
    //   1597: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1600: getfield 42	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   1603: astore 5
    //   1605: aload_0
    //   1606: getfield 38	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1609: getfield 146	com/google/android/gms/ads/internal/x:b	Ljava/lang/String;
    //   1612: astore 11
    //   1614: ldc_w 444
    //   1617: astore 4
    //   1619: aload 5
    //   1621: aload 4
    //   1623: iconst_0
    //   1624: invokevirtual 448	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1627: astore 5
    //   1629: invokestatic 454	java/util/Collections:emptySet	()Ljava/util/Set;
    //   1632: astore 73
    //   1634: ldc_w 456
    //   1637: astore 4
    //   1639: aload 5
    //   1641: aload 4
    //   1643: aload 73
    //   1645: invokeinterface 462 3 0
    //   1650: aload 11
    //   1652: invokeinterface 467 2 0
    //   1657: istore 74
    //   1659: aload_1
    //   1660: astore 11
    //   1662: aload_2
    //   1663: astore 73
    //   1665: aload 7
    //   1667: aload 9
    //   1669: aload_1
    //   1670: aload 20
    //   1672: aload 25
    //   1674: aload 6
    //   1676: aload 10
    //   1678: aload 19
    //   1680: aload 18
    //   1682: aload 47
    //   1684: aload 41
    //   1686: aload 48
    //   1688: aload 42
    //   1690: aload_2
    //   1691: iload 49
    //   1693: iload 50
    //   1695: iload 52
    //   1697: fload 54
    //   1699: aload 37
    //   1701: lload 38
    //   1703: aload 40
    //   1705: aload 55
    //   1707: aload 56
    //   1709: aload 57
    //   1711: aload 46
    //   1713: aload 59
    //   1715: fload 60
    //   1717: iload 61
    //   1719: iload 62
    //   1721: iload 63
    //   1723: iload 64
    //   1725: iload 65
    //   1727: aload 43
    //   1729: aload 45
    //   1731: iload 66
    //   1733: iload 67
    //   1735: aload 68
    //   1737: aload 69
    //   1739: aload 70
    //   1741: iload 71
    //   1743: aload 72
    //   1745: iload 74
    //   1747: aload 44
    //   1749: invokespecial 470	com/google/android/gms/b/qo$a:<init>	(Landroid/os/Bundle;Lcom/google/android/gms/b/ih;Lcom/google/android/gms/b/il;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/un;Landroid/os/Bundle;Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;ZIIFLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/b/le;Ljava/util/concurrent/Future;Ljava/lang/String;FZIIZZLjava/util/concurrent/Future;Ljava/lang/String;ZILandroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/b/jh;ZLandroid/os/Bundle;ZLjava/util/concurrent/Future;)V
    //   1752: aload 7
    //   1754: areturn
    //   1755: iconst_0
    //   1756: istore 16
    //   1758: aconst_null
    //   1759: astore 5
    //   1761: goto -736 -> 1025
    //   1764: iconst_0
    //   1765: istore 12
    //   1767: aconst_null
    //   1768: astore 7
    //   1770: goto -708 -> 1062
    //   1773: ldc_w 472
    //   1776: astore 59
    //   1778: goto -421 -> 1357
    //   1781: aload 5
    //   1783: getfield 372	com/google/android/gms/ads/internal/x:K	Z
    //   1786: istore 58
    //   1788: iload 58
    //   1790: ifeq +31 -> 1821
    //   1793: aload 5
    //   1795: getfield 375	com/google/android/gms/ads/internal/x:L	Z
    //   1798: istore 16
    //   1800: iload 16
    //   1802: ifeq +11 -> 1813
    //   1805: ldc_w 474
    //   1808: astore 59
    //   1810: goto -453 -> 1357
    //   1813: ldc_w 476
    //   1816: astore 59
    //   1818: goto -461 -> 1357
    //   1821: ldc_w 478
    //   1824: astore 59
    //   1826: goto -469 -> 1357
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1829	0	this	b
    //   0	1829	1	paramih	ih
    //   0	1829	2	paramBundle	Bundle
    //   0	1829	3	paramti	ti
    //   1	1641	4	localObject1	Object
    //   10	801	5	localObject2	Object
    //   831	1	5	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   842	3	5	localtj1	tj
    //   861	6	5	localObject3	Object
    //   869	6	5	localObject4	Object
    //   944	26	5	localtj2	tj
    //   993	1	5	localRemoteException	RemoteException
    //   998	796	5	localObject5	Object
    //   17	1658	6	localApplicationInfo	android.content.pm.ApplicationInfo
    //   47	149	8	bool1	boolean
    //   205	45	8	i	int
    //   50	1618	9	localObject7	Object
    //   60	1617	10	localPackageInfo	PackageInfo
    //   78	1583	11	localObject8	Object
    //   141	686	12	m	int
    //   1052	714	12	bool2	boolean
    //   147	141	13	n	int
    //   159	138	14	i1	int
    //   171	135	15	i2	int
    //   174	145	16	i3	int
    //   478	55	16	bool3	boolean
    //   538	627	16	i4	int
    //   1345	3	16	bool4	boolean
    //   1577	180	16	i5	int
    //   1798	3	16	bool5	boolean
    //   261	353	17	i6	int
    //   272	1409	18	localObject9	Object
    //   329	1350	19	str1	String
    //   352	1319	20	localObject10	Object
    //   392	5	21	l1	long
    //   420	566	23	l2	long
    //   442	84	26	l3	long
    //   456	521	28	l4	long
    //   463	486	30	l5	long
    //   467	61	32	l6	long
    //   471	5	34	l7	long
    //   593	7	36	i7	int
    //   665	1035	37	str2	String
    //   668	1034	38	l8	long
    //   712	992	40	str3	String
    //   741	944	41	localBundle1	Bundle
    //   746	943	42	localArrayList	ArrayList
    //   1099	629	43	localus1	com.google.android.gms.b.us
    //   1117	631	44	localus2	com.google.android.gms.b.us
    //   1120	610	45	localObject12	Object
    //   1142	570	46	localup	com.google.android.gms.b.up
    //   1221	462	47	localun	un
    //   1230	457	48	localList1	List
    //   1238	454	49	bool6	boolean
    //   1245	449	50	i8	int
    //   1252	316	51	i9	int
    //   1256	440	52	i10	int
    //   1263	3	53	f1	float
    //   1267	431	54	f2	float
    //   1272	434	55	localList2	List
    //   1281	427	56	str4	String
    //   1293	417	57	localle	com.google.android.gms.b.le
    //   1309	480	58	bool7	boolean
    //   1355	470	59	str5	String
    //   1364	352	60	f3	float
    //   1373	345	61	bool8	boolean
    //   1392	328	62	i11	int
    //   1408	314	63	i12	int
    //   1420	304	64	bool9	boolean
    //   1428	298	65	bool10	boolean
    //   1436	296	66	bool11	boolean
    //   1449	285	67	i13	int
    //   1458	278	68	localBundle2	Bundle
    //   1466	272	69	str6	String
    //   1475	265	70	localjh	com.google.android.gms.b.jh
    //   1483	259	71	bool12	boolean
    //   1493	251	72	localBundle3	Bundle
    //   1632	32	73	localObject13	Object
    //   1657	89	74	bool13	boolean
    // Exception table:
    //   from	to	target	type
    //   19	23	831	android/content/pm/PackageManager$NameNotFoundException
    //   25	30	831	android/content/pm/PackageManager$NameNotFoundException
    //   32	37	831	android/content/pm/PackageManager$NameNotFoundException
    //   39	44	831	android/content/pm/PackageManager$NameNotFoundException
    //   56	60	831	android/content/pm/PackageManager$NameNotFoundException
    //   432	435	861	finally
    //   437	442	861	finally
    //   444	447	861	finally
    //   449	456	861	finally
    //   458	463	861	finally
    //   492	495	861	finally
    //   497	500	861	finally
    //   504	509	861	finally
    //   511	516	861	finally
    //   518	523	861	finally
    //   542	547	861	finally
    //   549	554	861	finally
    //   554	559	861	finally
    //   563	568	861	finally
    //   571	575	861	finally
    //   582	586	861	finally
    //   599	604	861	finally
    //   616	619	861	finally
    //   839	842	861	finally
    //   844	849	861	finally
    //   853	858	861	finally
    //   863	866	861	finally
    //   879	884	861	finally
    //   887	892	861	finally
    //   898	903	861	finally
    //   903	908	861	finally
    //   914	919	861	finally
    //   919	924	861	finally
    //   936	941	861	finally
    //   941	944	861	finally
    //   952	958	861	finally
    //   958	961	861	finally
    //   964	967	861	finally
    //   969	974	861	finally
    //   985	990	861	finally
    //   389	392	869	finally
    //   396	401	869	finally
    //   401	406	869	finally
    //   408	413	869	finally
    //   415	420	869	finally
    //   422	427	869	finally
    //   429	432	869	finally
    //   619	622	869	finally
    //   866	869	869	finally
    //   871	874	869	finally
    //   684	688	993	android/os/RemoteException
    //   690	695	993	android/os/RemoteException
    //   697	704	993	android/os/RemoteException
  }
  
  public final void A()
  {
    f();
  }
  
  public final void B()
  {
    d();
  }
  
  public final void C()
  {
    Object localObject = f.j;
    if (localObject != null)
    {
      localObject = f.j.q;
      int i = String.valueOf(localObject).length() + 74;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      localObject = localStringBuilder.append("Mediation adapter ").append((String)localObject);
      String str = " refreshed, but mediation adapters should never refresh.";
      localObject = str;
      tp.e((String)localObject);
    }
    localObject = f.j;
    a((tg)localObject, true);
    u();
  }
  
  public final void D()
  {
    E();
  }
  
  public final void E()
  {
    tg localtg = f.j;
    a(localtg, false);
  }
  
  public final String F()
  {
    Object localObject = f.j;
    if (localObject == null) {}
    for (localObject = null;; localObject = f.j.q) {
      return (String)localObject;
    }
  }
  
  public void G()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("showInterstitial is not supported for current ad type");
    throw localIllegalStateException;
  }
  
  public final void H()
  {
    w.e();
    b.6 local6 = new com/google/android/gms/ads/internal/b$6;
    local6.<init>(this);
    tt.a(local6);
  }
  
  public final void I()
  {
    w.e();
    b.7 local7 = new com/google/android/gms/ads/internal/b$7;
    local7.<init>(this);
    tt.a(local7);
  }
  
  public void a()
  {
    long l1 = -1;
    Object localObject1 = h;
    Object localObject3 = f.j;
    ((gv)localObject1).a((tg)localObject3);
    boolean bool1 = false;
    k = false;
    r();
    localObject1 = f;
    localObject3 = l;
    synchronized (c)
    {
      long l2 = j;
      bool1 = l2 < l1;
      if (bool1)
      {
        localObject1 = b;
        bool1 = ((LinkedList)localObject1).isEmpty();
        if (!bool1)
        {
          localObject1 = b;
          localObject1 = ((LinkedList)localObject1).getLast();
          localObject1 = (th.a)localObject1;
          l2 = b;
          boolean bool2 = l2 < l1;
          if (!bool2)
          {
            l2 = SystemClock.elapsedRealtime();
            b = l2;
            localObject1 = a;
            ((tj)localObject1).a((th)localObject3);
          }
        }
      }
      return;
    }
  }
  
  public void a(ph paramph)
  {
    com.google.android.gms.common.internal.c.b("setInAppPurchaseListener must be called on the main UI thread.");
    f.q = paramph;
  }
  
  public final void a(pl parampl, String paramString)
  {
    com.google.android.gms.common.internal.c.b("setPlayStorePurchaseParams must be called on the main UI thread.");
    Object localObject1 = f;
    Object localObject2 = new com/google/android/gms/ads/internal/purchase/k;
    ((k)localObject2).<init>(paramString);
    C = ((k)localObject2);
    f.r = parampl;
    localObject1 = w.i();
    boolean bool = ((tj)localObject1).f();
    if ((!bool) && (parampl != null))
    {
      localObject1 = new com/google/android/gms/ads/internal/purchase/c;
      localObject2 = f.c;
      pl localpl = f.r;
      k localk = f.C;
      ((com.google.android.gms.ads.internal.purchase.c)localObject1).<init>((Context)localObject2, localpl, localk);
      ((to)localObject1).c();
    }
  }
  
  protected void a(tg paramtg, boolean paramBoolean)
  {
    Object localObject1;
    if (paramtg == null)
    {
      localObject1 = "Ad state was null when trying to ping impression URLs.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return;
      super.c(paramtg);
      localObject1 = r;
      Object localObject2;
      String str2;
      Object localObject3;
      List localList;
      if (localObject1 != null)
      {
        localObject1 = r.d;
        if (localObject1 != null)
        {
          localObject1 = w.D();
          localObject2 = f.c;
          String str1 = ((ta)localObject1).d((Context)localObject2);
          w.x();
          localObject1 = f.c;
          localObject2 = f.e.a;
          str2 = f.b;
          localObject3 = r.d;
          localList = a(str1, (List)localObject3);
          localObject3 = paramtg;
          nx.a((Context)localObject1, (String)localObject2, paramtg, str2, paramBoolean, localList);
          localObject1 = r.d;
          int i = ((List)localObject1).size();
          if (i > 0)
          {
            localObject1 = w.D();
            localObject2 = f.c;
            ((ta)localObject1).b((Context)localObject2, str1);
          }
        }
      }
      localObject1 = o;
      if (localObject1 != null)
      {
        localObject1 = o.g;
        if (localObject1 != null)
        {
          w.x();
          localObject1 = f.c;
          localObject2 = f.e.a;
          str2 = f.b;
          localList = o.g;
          localObject3 = paramtg;
          nx.a((Context)localObject1, (String)localObject2, paramtg, str2, paramBoolean, localList);
        }
      }
    }
  }
  
  public final void a(String paramString, ArrayList paramArrayList)
  {
    GInAppPurchaseManagerInfoParcel localGInAppPurchaseManagerInfoParcel = null;
    Object localObject1 = new com/google/android/gms/ads/internal/purchase/d;
    Object localObject3 = f.c;
    Object localObject4 = f.e.a;
    ((d)localObject1).<init>(paramString, paramArrayList, (Context)localObject3, (String)localObject4);
    localObject3 = f.q;
    boolean bool1;
    if (localObject3 == null)
    {
      tp.e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
      ip.a();
      localObject3 = f.c;
      bool1 = uk.c((Context)localObject3);
      if (!bool1)
      {
        localObject1 = "Google Play Service unavailable, cannot launch default purchase flow.";
        tp.e((String)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject3 = f.r;
      if (localObject3 == null)
      {
        localObject1 = "PlayStorePurchaseListener is not set.";
        tp.e((String)localObject1);
      }
      else
      {
        localObject3 = f.C;
        if (localObject3 == null)
        {
          localObject1 = "PlayStorePurchaseVerifier is not initialized.";
          tp.e((String)localObject1);
        }
        else
        {
          localObject3 = f;
          bool1 = G;
          if (bool1)
          {
            localObject1 = "An in-app purchase request is already in progress, abort";
            tp.e((String)localObject1);
          }
          else
          {
            localObject3 = f;
            boolean bool2 = true;
            G = bool2;
            try
            {
              localObject3 = f;
              localObject3 = r;
              bool1 = ((pl)localObject3).a(paramString);
              if (bool1) {
                break label268;
              }
              localObject1 = f;
              bool1 = false;
              localObject3 = null;
              G = false;
            }
            catch (RemoteException localRemoteException1)
            {
              tp.e("Could not start In-App purchase.");
              localObject2 = f;
              G = false;
            }
            continue;
            label268:
            w.s();
            localObject3 = f.c;
            localObject4 = f.e;
            bool2 = d;
            localGInAppPurchaseManagerInfoParcel = new com/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel;
            Object localObject5 = f.c;
            k localk = f.C;
            localGInAppPurchaseManagerInfoParcel.<init>((Context)localObject5, localk, (pg)localObject2, this);
            Object localObject2 = new android/content/Intent;
            ((Intent)localObject2).<init>();
            ((Intent)localObject2).setClassName((Context)localObject3, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
            localObject5 = "com.google.android.gms.ads.internal.purchase.useClientJar";
            ((Intent)localObject2).putExtra((String)localObject5, bool2);
            GInAppPurchaseManagerInfoParcel.a((Intent)localObject2, localGInAppPurchaseManagerInfoParcel);
            w.e();
            tt.a((Context)localObject3, (Intent)localObject2);
            continue;
            try
            {
              localObject3 = f;
              localObject3 = q;
              ((ph)localObject3).a((pg)localObject2);
            }
            catch (RemoteException localRemoteException2)
            {
              String str = "Could not start In-App purchase.";
              tp.e(str);
            }
          }
        }
      }
    }
  }
  
  public final void a(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, f paramf)
  {
    try
    {
      localObject1 = f;
      localObject1 = r;
      if (localObject1 != null)
      {
        localObject1 = f;
        pl localpl = r;
        localObject1 = new com/google/android/gms/ads/internal/purchase/g;
        localObject2 = f;
        localObject2 = c;
        ((g)localObject1).<init>((Context)localObject2, paramString, paramBoolean, paramInt, paramIntent, paramf);
        localpl.a((pk)localObject1);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        String str = "Fail to invoke PlayStorePurchaseListener.";
        tp.e(str);
      }
    }
    localObject1 = tt.a;
    localObject2 = new com/google/android/gms/ads/internal/b$5;
    ((b.5)localObject2).<init>(this, paramIntent);
    ((Handler)localObject1).postDelayed((Runnable)localObject2, 500L);
  }
  
  public boolean a(ih paramih, km paramkm)
  {
    boolean bool1 = false;
    Context localContext = null;
    boolean bool2 = x();
    if (!bool2) {
      return bool1;
    }
    w.e();
    Object localObject1 = f.c;
    Object localObject2 = w.i();
    localObject1 = ((tj)localObject2).a((Context)localObject1);
    Object localObject3;
    label53:
    Object localObject4;
    Object localObject5;
    if (localObject1 == null)
    {
      localObject3 = null;
      e.a();
      f.F = 0;
      localObject1 = ke.cD;
      localObject2 = w.q();
      localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
      bool2 = ((Boolean)localObject1).booleanValue();
      if (!bool2) {
        break label372;
      }
      localObject4 = w.i().p();
      localObject1 = w.A();
      localObject2 = f.c;
      localObject5 = f.e;
      String str = f.b;
      ((h)localObject1).a((Context)localObject2, (un)localObject5, false, (ti)localObject4, null, str, null);
    }
    for (;;)
    {
      localObject2 = a(paramih, (Bundle)localObject3, (ti)localObject4);
      localObject5 = g;
      paramkm.a("seq_num", (String)localObject5);
      localObject5 = u;
      paramkm.a("request_id", (String)localObject5);
      localObject5 = h;
      paramkm.a("session_id", (String)localObject5);
      localObject1 = f;
      if (localObject1 != null)
      {
        localObject1 = "app_version";
        int i = f.versionCode;
        localObject5 = String.valueOf(i);
        paramkm.a((String)localObject1, (String)localObject5);
      }
      localObject5 = f;
      w.a();
      localContext = f.c;
      localObject1 = b.c;
      localObject4 = "sdk_less_server_data";
      localObject1 = ((Bundle)localObject1).getBundle((String)localObject4);
      if (localObject1 != null)
      {
        localObject1 = new com/google/android/gms/b/rb;
        ((rb)localObject1).<init>(localContext, (qo.a)localObject2, this);
      }
      for (;;)
      {
        ((to)localObject1).c();
        g = ((to)localObject1);
        bool1 = true;
        break;
        localObject1 = tt.a((hi)localObject1);
        localObject3 = localObject1;
        break label53;
        localObject1 = new com/google/android/gms/b/qk;
        ((qk)localObject1).<init>(localContext, (qo.a)localObject2, this);
      }
      label372:
      localObject4 = null;
    }
  }
  
  public boolean a(ih paramih, tg paramtg, boolean paramBoolean)
  {
    long l1 = 0L;
    Object localObject;
    boolean bool;
    long l2;
    if (!paramBoolean)
    {
      localObject = f;
      bool = ((x)localObject).c();
      if (bool)
      {
        l2 = h;
        bool = l2 < l1;
        if (!bool) {
          break label71;
        }
        localObject = e;
        l1 = h;
        ((t)localObject).a(paramih, l1);
      }
    }
    for (;;)
    {
      return e.b;
      label71:
      localObject = r;
      if (localObject != null)
      {
        localObject = r;
        l2 = i;
        bool = l2 < l1;
        if (bool)
        {
          localObject = e;
          ns localns = r;
          l1 = i;
          ((t)localObject).a(paramih, l1);
          continue;
        }
      }
      bool = n;
      if (!bool)
      {
        int i = d;
        int m = 2;
        if (i == m)
        {
          localObject = e;
          ((t)localObject).a(paramih);
        }
      }
    }
  }
  
  final boolean a(tg paramtg)
  {
    boolean bool = false;
    ih localih = g;
    Bundle localBundle;
    if (localih != null)
    {
      localih = g;
      localBundle = null;
      g = null;
    }
    for (;;)
    {
      return a(localih, paramtg, bool);
      localih = a;
      localBundle = c;
      if (localBundle != null)
      {
        localBundle = c;
        String str = "_noRefresh";
        bool = localBundle.getBoolean(str, false);
      }
    }
  }
  
  public boolean a(tg paramtg1, tg paramtg2)
  {
    int i = 0;
    Object localObject1 = null;
    tm localtm;
    if (paramtg1 != null)
    {
      localObject4 = s;
      if (localObject4 != null)
      {
        localObject4 = s;
        localtm = null;
        ((nu)localObject4).a(null);
      }
    }
    Object localObject4 = s;
    if (localObject4 != null)
    {
      localObject4 = s;
      ((nu)localObject4).a(this);
    }
    localObject4 = r;
    int m;
    if (localObject4 != null)
    {
      m = r.p;
      localObject1 = r;
      i = q;
    }
    for (;;)
    {
      localtm = f.D;
      synchronized (a)
      {
        b = m;
        c = i;
        localObject1 = d;
        localObject4 = e;
        synchronized (a)
        {
          localObject1 = e;
          ((HashMap)localObject1).put(localObject4, localtm);
          return true;
        }
      }
      m = 0;
      localObject4 = null;
    }
  }
  
  public final void b()
  {
    gv localgv = h;
    tg localtg = f.j;
    localgv.b(localtg);
  }
  
  public final void b(tg paramtg)
  {
    super.b(paramtg);
    Object localObject1 = o;
    Object localObject2;
    String str;
    List localList;
    int i;
    if (localObject1 != null)
    {
      tp.b("Disable the debug gesture detector on the mediation ad frame.");
      localObject1 = f.f;
      if (localObject1 != null)
      {
        localObject1 = f.f;
        localObject2 = "Disable debug gesture detector on adFrame.";
        tp.a((String)localObject2);
        c = false;
      }
      tp.b("Pinging network fill URLs.");
      w.x();
      localObject1 = f.c;
      localObject2 = f.e.a;
      str = f.b;
      localList = o.h;
      nx.a((Context)localObject1, (String)localObject2, paramtg, str, false, localList);
      localObject1 = r;
      if (localObject1 != null)
      {
        localObject1 = r.f;
        if (localObject1 != null)
        {
          localObject1 = r.f;
          i = ((List)localObject1).size();
          if (i > 0)
          {
            tp.b("Pinging urls remotely");
            w.e();
            localObject1 = f.c;
            localObject2 = r.f;
            tt.a((Context)localObject1, (List)localObject2);
          }
        }
      }
    }
    for (;;)
    {
      i = d;
      int m = 3;
      if (i == m)
      {
        localObject1 = r;
        if (localObject1 != null)
        {
          localObject1 = r.e;
          if (localObject1 != null)
          {
            tp.b("Pinging no fill URLs.");
            w.x();
            localObject1 = f.c;
            localObject2 = f.e.a;
            str = f.b;
            localList = r.e;
            nx.a((Context)localObject1, (String)localObject2, paramtg, str, false, localList);
          }
        }
      }
      return;
      tp.b("Enable the debug gesture detector on the admob ad frame.");
      localObject1 = f.f;
      if (localObject1 != null)
      {
        localObject1 = f.f;
        localObject2 = "Enable debug gesture detector on adFrame.";
        tp.a((String)localObject2);
        m = 1;
        c = m;
      }
    }
  }
  
  protected final boolean b(ih paramih)
  {
    boolean bool = super.b(paramih);
    if (bool)
    {
      bool = k;
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void c()
  {
    gv localgv = h;
    tg localtg = f.j;
    localgv.c(localtg);
  }
  
  public void d()
  {
    k = true;
    t();
  }
  
  public final void e()
  {
    Object localObject1 = f.j;
    if (localObject1 == null)
    {
      localObject1 = "Ad state was null when trying to ping click URLs.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = f.j.r;
      Object localObject2;
      tg localtg;
      String str2;
      List localList;
      if (localObject1 != null)
      {
        localObject1 = f.j.r.c;
        if (localObject1 != null)
        {
          localObject1 = w.D();
          localObject2 = f.c;
          String str1 = ((ta)localObject1).d((Context)localObject2);
          w.x();
          localObject1 = f.c;
          localObject2 = f.e.a;
          localtg = f.j;
          str2 = f.b;
          localList = f.j.r.c;
          localList = a(str1, localList);
          nx.a((Context)localObject1, (String)localObject2, localtg, str2, false, localList);
          localObject1 = f.j.r.c;
          int i = ((List)localObject1).size();
          if (i > 0)
          {
            localObject1 = w.D();
            localObject2 = f.c;
            ((ta)localObject1).a((Context)localObject2, str1);
          }
        }
      }
      localObject1 = f.j.o;
      if (localObject1 != null)
      {
        localObject1 = f.j.o.f;
        if (localObject1 != null)
        {
          w.x();
          localObject1 = f.c;
          localObject2 = f.e.a;
          localtg = f.j;
          str2 = f.b;
          localList = f.j.o.f;
          nx.a((Context)localObject1, (String)localObject2, localtg, str2, false, localList);
        }
      }
      super.e();
    }
  }
  
  public void m()
  {
    com.google.android.gms.common.internal.c.b("pause must be called on the main UI thread.");
    Object localObject = f.j;
    if (localObject != null)
    {
      localObject = f.j.b;
      if (localObject != null)
      {
        localObject = f;
        boolean bool = ((x)localObject).c();
        if (bool)
        {
          w.g();
          localObject = f.j.b;
          tu.a((vc)localObject);
        }
      }
    }
    localObject = f.j;
    if (localObject != null)
    {
      localObject = f.j.p;
      if (localObject == null) {}
    }
    try
    {
      localObject = f;
      localObject = j;
      localObject = p;
      ((od)localObject).d();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        tg localtg;
        String str = "Could not pause mediation adapter.";
        tp.e(str);
      }
    }
    localObject = h;
    localtg = f.j;
    ((gv)localObject).b(localtg);
    e.b();
  }
  
  public void n()
  {
    com.google.android.gms.common.internal.c.b("resume must be called on the main UI thread.");
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = f.j;
    if (localObject2 != null)
    {
      localObject2 = f.j.b;
      if (localObject2 != null) {
        localObject1 = f.j.b;
      }
    }
    if (localObject1 != null)
    {
      localObject2 = f;
      boolean bool2 = ((x)localObject2).c();
      if (bool2)
      {
        w.g();
        localObject2 = f.j.b;
        tu.b((vc)localObject2);
      }
    }
    localObject2 = f.j;
    if (localObject2 != null)
    {
      localObject2 = f.j.p;
      if (localObject2 == null) {}
    }
    try
    {
      localObject2 = f;
      localObject2 = j;
      localObject2 = p;
      ((od)localObject2).e();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not resume mediation adapter.";
        tp.e(str);
      }
    }
    if (localObject1 != null)
    {
      bool1 = ((vc)localObject1).u();
      if (bool1) {}
    }
    else
    {
      localObject1 = e;
      ((t)localObject1).c();
    }
    localObject1 = h;
    localObject2 = f.j;
    ((gv)localObject1).c((tg)localObject2);
  }
  
  protected boolean x()
  {
    boolean bool1 = true;
    w.e();
    Context localContext = f.c;
    String str1 = f.c.getPackageName();
    String str2 = "android.permission.INTERNET";
    boolean bool2 = tt.a(localContext, str1, str2);
    if (bool2)
    {
      w.e();
      localContext = f.c;
      bool2 = tt.a(localContext);
      if (bool2) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public final void y()
  {
    e();
  }
  
  public final void z()
  {
    a();
  }
}


/* Location:              com/google/android/gms/ads/internal/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */