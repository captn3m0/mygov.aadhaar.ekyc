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
import com.google.android.gms.ads.internal.purchase.i;
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
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.qk;
import com.google.android.gms.b.qo.a;
import com.google.android.gms.b.qv;
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
import com.google.android.gms.b.up;
import com.google.android.gms.b.us;
import com.google.android.gms.b.vc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

@qi
public abstract class b
  extends a
  implements com.google.android.gms.ads.internal.overlay.j, com.google.android.gms.ads.internal.purchase.j, u, mf, nt
{
  protected final oc j;
  protected transient boolean k;
  
  public b(Context paramContext, il paramil, String paramString, oc paramoc, un paramun, e parame)
  {
    this(new x(paramContext, paramil, paramString, paramun), paramoc, parame);
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
    //   1: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   4: getfield 65	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   7: invokevirtual 71	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   10: astore 27
    //   12: aload_0
    //   13: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   16: getfield 65	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   19: invokestatic 76	com/google/android/gms/b/bc:a	(Landroid/content/Context;)Lcom/google/android/gms/b/bb;
    //   22: aload 27
    //   24: getfield 82	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   27: iconst_0
    //   28: invokevirtual 88	com/google/android/gms/b/bb:b	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   31: astore 24
    //   33: aload_0
    //   34: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   37: getfield 65	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   40: invokevirtual 92	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   43: invokevirtual 98	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   46: astore 41
    //   48: aconst_null
    //   49: astore 26
    //   51: aload 26
    //   53: astore 25
    //   55: aload_0
    //   56: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   59: getfield 101	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   62: ifnull +203 -> 265
    //   65: aload 26
    //   67: astore 25
    //   69: aload_0
    //   70: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   73: getfield 101	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   76: invokevirtual 107	com/google/android/gms/ads/internal/x$a:getParent	()Landroid/view/ViewParent;
    //   79: ifnull +186 -> 265
    //   82: iconst_2
    //   83: newarray <illegal type>
    //   85: astore 25
    //   87: aload_0
    //   88: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   91: getfield 101	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   94: aload 25
    //   96: invokevirtual 111	com/google/android/gms/ads/internal/x$a:getLocationOnScreen	([I)V
    //   99: aload 25
    //   101: iconst_0
    //   102: iaload
    //   103: istore 8
    //   105: aload 25
    //   107: iconst_1
    //   108: iaload
    //   109: istore 9
    //   111: aload_0
    //   112: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   115: getfield 101	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   118: invokevirtual 115	com/google/android/gms/ads/internal/x$a:getWidth	()I
    //   121: istore 10
    //   123: aload_0
    //   124: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   127: getfield 101	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   130: invokevirtual 118	com/google/android/gms/ads/internal/x$a:getHeight	()I
    //   133: istore 11
    //   135: iconst_0
    //   136: istore 7
    //   138: iload 7
    //   140: istore 6
    //   142: aload_0
    //   143: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   146: getfield 101	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   149: invokevirtual 122	com/google/android/gms/ads/internal/x$a:isShown	()Z
    //   152: ifeq +58 -> 210
    //   155: iload 7
    //   157: istore 6
    //   159: iload 8
    //   161: iload 10
    //   163: iadd
    //   164: ifle +46 -> 210
    //   167: iload 7
    //   169: istore 6
    //   171: iload 9
    //   173: iload 11
    //   175: iadd
    //   176: ifle +34 -> 210
    //   179: iload 7
    //   181: istore 6
    //   183: iload 8
    //   185: aload 41
    //   187: getfield 128	android/util/DisplayMetrics:widthPixels	I
    //   190: if_icmpgt +20 -> 210
    //   193: iload 7
    //   195: istore 6
    //   197: iload 9
    //   199: aload 41
    //   201: getfield 131	android/util/DisplayMetrics:heightPixels	I
    //   204: if_icmpgt +6 -> 210
    //   207: iconst_1
    //   208: istore 6
    //   210: new 133	android/os/Bundle
    //   213: dup
    //   214: iconst_5
    //   215: invokespecial 136	android/os/Bundle:<init>	(I)V
    //   218: astore 25
    //   220: aload 25
    //   222: ldc -118
    //   224: iload 8
    //   226: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   229: aload 25
    //   231: ldc -112
    //   233: iload 9
    //   235: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   238: aload 25
    //   240: ldc -110
    //   242: iload 10
    //   244: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   247: aload 25
    //   249: ldc -108
    //   251: iload 11
    //   253: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   256: aload 25
    //   258: ldc -106
    //   260: iload 6
    //   262: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   265: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   268: invokevirtual 161	com/google/android/gms/b/tj:c	()Ljava/lang/String;
    //   271: astore 28
    //   273: aload_0
    //   274: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   277: new 163	com/google/android/gms/b/th
    //   280: dup
    //   281: aload 28
    //   283: aload_0
    //   284: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   287: getfield 165	com/google/android/gms/ads/internal/x:b	Ljava/lang/String;
    //   290: invokespecial 168	com/google/android/gms/b/th:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   293: putfield 172	com/google/android/gms/ads/internal/x:l	Lcom/google/android/gms/b/th;
    //   296: aload_0
    //   297: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   300: getfield 172	com/google/android/gms/ads/internal/x:l	Lcom/google/android/gms/b/th;
    //   303: astore 30
    //   305: aload 30
    //   307: getfield 175	com/google/android/gms/b/th:c	Ljava/lang/Object;
    //   310: astore 26
    //   312: aload 26
    //   314: monitorenter
    //   315: aload 30
    //   317: invokestatic 181	android/os/SystemClock:elapsedRealtime	()J
    //   320: putfield 184	com/google/android/gms/b/th:i	J
    //   323: aload 30
    //   325: getfield 187	com/google/android/gms/b/th:a	Lcom/google/android/gms/b/tj;
    //   328: invokevirtual 191	com/google/android/gms/b/tj:d	()Lcom/google/android/gms/b/tk;
    //   331: astore 29
    //   333: aload 30
    //   335: getfield 184	com/google/android/gms/b/th:i	J
    //   338: lstore 12
    //   340: aload 29
    //   342: getfield 195	com/google/android/gms/b/tk:f	Ljava/lang/Object;
    //   345: astore 30
    //   347: aload 30
    //   349: monitorenter
    //   350: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   353: invokevirtual 198	com/google/android/gms/b/tj:m	()J
    //   356: lstore 14
    //   358: invokestatic 201	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   361: invokeinterface 205 1 0
    //   366: lstore 16
    //   368: aload 29
    //   370: getfield 207	com/google/android/gms/b/tk:b	J
    //   373: ldc2_w 208
    //   376: lcmp
    //   377: ifne +261 -> 638
    //   380: getstatic 215	com/google/android/gms/b/ke:aL	Lcom/google/android/gms/b/jz;
    //   383: astore 31
    //   385: lload 16
    //   387: lload 14
    //   389: lsub
    //   390: invokestatic 219	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   393: aload 31
    //   395: invokevirtual 224	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   398: checkcast 226	java/lang/Long
    //   401: invokevirtual 229	java/lang/Long:longValue	()J
    //   404: lcmp
    //   405: ifle +207 -> 612
    //   408: aload 29
    //   410: iconst_m1
    //   411: putfield 231	com/google/android/gms/b/tk:d	I
    //   414: aload 29
    //   416: lload 12
    //   418: putfield 207	com/google/android/gms/b/tk:b	J
    //   421: aload 29
    //   423: aload 29
    //   425: getfield 207	com/google/android/gms/b/tk:b	J
    //   428: putfield 233	com/google/android/gms/b/tk:a	J
    //   431: aload_1
    //   432: getfield 238	com/google/android/gms/b/ih:c	Landroid/os/Bundle;
    //   435: ifnull +213 -> 648
    //   438: aload_1
    //   439: getfield 238	com/google/android/gms/b/ih:c	Landroid/os/Bundle;
    //   442: ldc -16
    //   444: iconst_2
    //   445: invokevirtual 244	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   448: iconst_1
    //   449: if_icmpne +199 -> 648
    //   452: aload 30
    //   454: monitorexit
    //   455: aload 26
    //   457: monitorexit
    //   458: invokestatic 248	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   461: pop
    //   462: aload_0
    //   463: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   466: getfield 65	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   469: aload_0
    //   470: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   473: getfield 101	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   476: aload_0
    //   477: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   480: getfield 251	com/google/android/gms/ads/internal/x:i	Lcom/google/android/gms/b/il;
    //   483: invokestatic 256	com/google/android/gms/b/tt:a	(Landroid/content/Context;Landroid/view/View;Lcom/google/android/gms/b/il;)Ljava/lang/String;
    //   486: astore 29
    //   488: lconst_0
    //   489: lstore 14
    //   491: lload 14
    //   493: lstore 12
    //   495: aload_0
    //   496: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   499: getfield 260	com/google/android/gms/ads/internal/x:p	Lcom/google/android/gms/b/jb;
    //   502: ifnull +17 -> 519
    //   505: aload_0
    //   506: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   509: getfield 260	com/google/android/gms/ads/internal/x:p	Lcom/google/android/gms/b/jb;
    //   512: invokeinterface 263 1 0
    //   517: lstore 12
    //   519: invokestatic 269	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   522: invokevirtual 272	java/util/UUID:toString	()Ljava/lang/String;
    //   525: astore 30
    //   527: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   530: aload_0
    //   531: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   534: getfield 65	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   537: aload_0
    //   538: aload 28
    //   540: invokevirtual 275	com/google/android/gms/b/tj:a	(Landroid/content/Context;Lcom/google/android/gms/b/tl;Ljava/lang/String;)Landroid/os/Bundle;
    //   543: astore 31
    //   545: new 277	java/util/ArrayList
    //   548: dup
    //   549: invokespecial 280	java/util/ArrayList:<init>	()V
    //   552: astore 32
    //   554: iconst_0
    //   555: istore 6
    //   557: iload 6
    //   559: aload_0
    //   560: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   563: getfield 284	com/google/android/gms/ads/internal/x:v	Landroid/support/v4/g/k;
    //   566: invokevirtual 289	android/support/v4/g/k:size	()I
    //   569: if_icmpge +164 -> 733
    //   572: aload 32
    //   574: aload_0
    //   575: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   578: getfield 284	com/google/android/gms/ads/internal/x:v	Landroid/support/v4/g/k;
    //   581: iload 6
    //   583: invokevirtual 292	android/support/v4/g/k:b	(I)Ljava/lang/Object;
    //   586: checkcast 294	java/lang/String
    //   589: invokeinterface 300 2 0
    //   594: pop
    //   595: iload 6
    //   597: iconst_1
    //   598: iadd
    //   599: istore 6
    //   601: goto -44 -> 557
    //   604: astore 24
    //   606: aconst_null
    //   607: astore 24
    //   609: goto -576 -> 33
    //   612: aload 29
    //   614: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   617: invokevirtual 303	com/google/android/gms/b/tj:o	()I
    //   620: putfield 231	com/google/android/gms/b/tk:d	I
    //   623: goto -209 -> 414
    //   626: astore_1
    //   627: aload 30
    //   629: monitorexit
    //   630: aload_1
    //   631: athrow
    //   632: astore_1
    //   633: aload 26
    //   635: monitorexit
    //   636: aload_1
    //   637: athrow
    //   638: aload 29
    //   640: lload 12
    //   642: putfield 233	com/google/android/gms/b/tk:a	J
    //   645: goto -214 -> 431
    //   648: aload 29
    //   650: aload 29
    //   652: getfield 305	com/google/android/gms/b/tk:c	I
    //   655: iconst_1
    //   656: iadd
    //   657: putfield 305	com/google/android/gms/b/tk:c	I
    //   660: aload 29
    //   662: aload 29
    //   664: getfield 231	com/google/android/gms/b/tk:d	I
    //   667: iconst_1
    //   668: iadd
    //   669: putfield 231	com/google/android/gms/b/tk:d	I
    //   672: aload 29
    //   674: getfield 231	com/google/android/gms/b/tk:d	I
    //   677: ifne +24 -> 701
    //   680: aload 29
    //   682: lconst_0
    //   683: putfield 307	com/google/android/gms/b/tk:e	J
    //   686: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   689: lload 16
    //   691: invokevirtual 310	com/google/android/gms/b/tj:a	(J)Ljava/util/concurrent/Future;
    //   694: pop
    //   695: aload 30
    //   697: monitorexit
    //   698: goto -243 -> 455
    //   701: aload 29
    //   703: lload 16
    //   705: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   708: invokevirtual 313	com/google/android/gms/b/tj:n	()J
    //   711: lsub
    //   712: putfield 307	com/google/android/gms/b/tk:e	J
    //   715: goto -20 -> 695
    //   718: astore 26
    //   720: ldc_w 315
    //   723: invokestatic 320	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   726: lload 14
    //   728: lstore 12
    //   730: goto -211 -> 519
    //   733: aload_0
    //   734: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   737: getfield 323	com/google/android/gms/ads/internal/x:q	Lcom/google/android/gms/b/ph;
    //   740: ifnull +584 -> 1324
    //   743: iconst_1
    //   744: istore 18
    //   746: aload_0
    //   747: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   750: getfield 327	com/google/android/gms/ads/internal/x:r	Lcom/google/android/gms/b/pl;
    //   753: ifnull +577 -> 1330
    //   756: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   759: invokevirtual 329	com/google/android/gms/b/tj:r	()Z
    //   762: ifeq +568 -> 1330
    //   765: iconst_1
    //   766: istore 19
    //   768: new 16	com/google/android/gms/ads/internal/b$1
    //   771: dup
    //   772: aload_0
    //   773: invokespecial 332	com/google/android/gms/ads/internal/b$1:<init>	(Lcom/google/android/gms/ads/internal/b;)V
    //   776: invokestatic 337	com/google/android/gms/b/ts:a	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/b/us;
    //   779: astore 36
    //   781: new 18	com/google/android/gms/ads/internal/b$2
    //   784: dup
    //   785: aload_0
    //   786: invokespecial 338	com/google/android/gms/ads/internal/b$2:<init>	(Lcom/google/android/gms/ads/internal/b;)V
    //   789: invokestatic 337	com/google/android/gms/b/ts:a	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/b/us;
    //   792: astore 33
    //   794: new 20	com/google/android/gms/ads/internal/b$3
    //   797: dup
    //   798: aload_0
    //   799: invokespecial 339	com/google/android/gms/ads/internal/b$3:<init>	(Lcom/google/android/gms/ads/internal/b;)V
    //   802: invokestatic 337	com/google/android/gms/b/ts:a	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/b/us;
    //   805: astore 34
    //   807: aconst_null
    //   808: astore 26
    //   810: aload_3
    //   811: ifnull +9 -> 820
    //   814: aload_3
    //   815: getfield 343	com/google/android/gms/b/ti:d	Ljava/lang/String;
    //   818: astore 26
    //   820: new 345	com/google/android/gms/b/up
    //   823: dup
    //   824: invokespecial 346	com/google/android/gms/b/up:<init>	()V
    //   827: astore 35
    //   829: aload 36
    //   831: new 22	com/google/android/gms/ads/internal/b$4
    //   834: dup
    //   835: aload 36
    //   837: aload 35
    //   839: iload 18
    //   841: iload 19
    //   843: invokespecial 349	com/google/android/gms/ads/internal/b$4:<init>	(Lcom/google/android/gms/b/us;Lcom/google/android/gms/b/up;ZZ)V
    //   846: invokeinterface 354 2 0
    //   851: aload_0
    //   852: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   855: getfield 251	com/google/android/gms/ads/internal/x:i	Lcom/google/android/gms/b/il;
    //   858: astore 36
    //   860: aload_0
    //   861: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   864: getfield 165	com/google/android/gms/ads/internal/x:b	Ljava/lang/String;
    //   867: astore 37
    //   869: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   872: getfield 355	com/google/android/gms/b/tj:b	Ljava/lang/String;
    //   875: astore 38
    //   877: aload_0
    //   878: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   881: getfield 358	com/google/android/gms/ads/internal/x:e	Lcom/google/android/gms/b/un;
    //   884: astore 39
    //   886: aload_0
    //   887: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   890: getfield 362	com/google/android/gms/ads/internal/x:B	Ljava/util/List;
    //   893: astore 40
    //   895: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   898: invokevirtual 365	com/google/android/gms/b/tj:g	()Z
    //   901: istore 18
    //   903: aload 41
    //   905: getfield 128	android/util/DisplayMetrics:widthPixels	I
    //   908: istore 6
    //   910: aload 41
    //   912: getfield 131	android/util/DisplayMetrics:heightPixels	I
    //   915: istore 7
    //   917: aload 41
    //   919: getfield 369	android/util/DisplayMetrics:density	F
    //   922: fstore 4
    //   924: invokestatic 372	com/google/android/gms/b/ke:a	()Ljava/util/List;
    //   927: astore 41
    //   929: aload_0
    //   930: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   933: getfield 374	com/google/android/gms/ads/internal/x:a	Ljava/lang/String;
    //   936: astore 42
    //   938: aload_0
    //   939: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   942: getfield 378	com/google/android/gms/ads/internal/x:w	Lcom/google/android/gms/b/le;
    //   945: astore 43
    //   947: aload_0
    //   948: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   951: astore_3
    //   952: aload_3
    //   953: getfield 380	com/google/android/gms/ads/internal/x:J	Z
    //   956: ifeq +10 -> 966
    //   959: aload_3
    //   960: getfield 383	com/google/android/gms/ads/internal/x:K	Z
    //   963: ifne +408 -> 1371
    //   966: aload_3
    //   967: getfield 380	com/google/android/gms/ads/internal/x:J	Z
    //   970: ifeq +373 -> 1343
    //   973: aload_3
    //   974: getfield 386	com/google/android/gms/ads/internal/x:L	Z
    //   977: ifeq +359 -> 1336
    //   980: ldc_w 388
    //   983: astore_3
    //   984: invokestatic 248	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   987: pop
    //   988: invokestatic 391	com/google/android/gms/b/tt:d	()F
    //   991: fstore 5
    //   993: invokestatic 248	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   996: pop
    //   997: invokestatic 393	com/google/android/gms/b/tt:e	()Z
    //   1000: istore 19
    //   1002: invokestatic 248	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   1005: pop
    //   1006: aload_0
    //   1007: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1010: getfield 65	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   1013: invokestatic 396	com/google/android/gms/b/tt:i	(Landroid/content/Context;)I
    //   1016: istore 8
    //   1018: invokestatic 248	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   1021: pop
    //   1022: aload_0
    //   1023: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1026: getfield 101	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   1029: invokestatic 399	com/google/android/gms/b/tt:b	(Landroid/view/View;)I
    //   1032: istore 9
    //   1034: aload_0
    //   1035: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1038: getfield 65	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   1041: instanceof 401
    //   1044: istore 20
    //   1046: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1049: invokevirtual 403	com/google/android/gms/b/tj:l	()Z
    //   1052: istore 21
    //   1054: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1057: getfield 406	com/google/android/gms/b/tj:h	Z
    //   1060: istore 22
    //   1062: invokestatic 409	com/google/android/gms/ads/internal/w:B	()Lcom/google/android/gms/b/mr;
    //   1065: getfield 413	com/google/android/gms/b/mr:a	Ljava/util/List;
    //   1068: invokeinterface 414 1 0
    //   1073: istore 10
    //   1075: invokestatic 248	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   1078: pop
    //   1079: invokestatic 417	com/google/android/gms/b/tt:f	()Landroid/os/Bundle;
    //   1082: astore 44
    //   1084: invokestatic 420	com/google/android/gms/ads/internal/w:m	()Lcom/google/android/gms/b/tx;
    //   1087: invokevirtual 424	com/google/android/gms/b/tx:a	()Ljava/lang/String;
    //   1090: astore 45
    //   1092: aload_0
    //   1093: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1096: getfield 427	com/google/android/gms/ads/internal/x:y	Lcom/google/android/gms/b/jh;
    //   1099: astore 46
    //   1101: invokestatic 420	com/google/android/gms/ads/internal/w:m	()Lcom/google/android/gms/b/tx;
    //   1104: invokevirtual 429	com/google/android/gms/b/tx:b	()Z
    //   1107: istore 23
    //   1109: invokestatic 434	com/google/android/gms/b/nd:a	()Lcom/google/android/gms/b/nd;
    //   1112: astore 48
    //   1114: new 133	android/os/Bundle
    //   1117: dup
    //   1118: invokespecial 435	android/os/Bundle:<init>	()V
    //   1121: astore 47
    //   1123: aload 47
    //   1125: ldc_w 437
    //   1128: aload 48
    //   1130: getfield 439	com/google/android/gms/b/nd:a	I
    //   1133: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1136: aload 47
    //   1138: ldc_w 441
    //   1141: aload 48
    //   1143: getfield 443	com/google/android/gms/b/nd:b	I
    //   1146: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1149: aload 47
    //   1151: ldc_w 445
    //   1154: aload 48
    //   1156: getfield 446	com/google/android/gms/b/nd:c	I
    //   1159: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1162: aload 47
    //   1164: ldc_w 448
    //   1167: aload 48
    //   1169: getfield 449	com/google/android/gms/b/nd:d	I
    //   1172: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1175: aload 47
    //   1177: ldc_w 451
    //   1180: aload 48
    //   1182: getfield 453	com/google/android/gms/b/nd:e	I
    //   1185: invokevirtual 142	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   1188: invokestatic 156	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   1191: pop
    //   1192: aload_0
    //   1193: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1196: getfield 65	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   1199: astore 48
    //   1201: aload_0
    //   1202: getfield 61	com/google/android/gms/ads/internal/b:f	Lcom/google/android/gms/ads/internal/x;
    //   1205: getfield 165	com/google/android/gms/ads/internal/x:b	Ljava/lang/String;
    //   1208: astore 49
    //   1210: new 455	com/google/android/gms/b/qo$a
    //   1213: dup
    //   1214: aload 25
    //   1216: aload_1
    //   1217: aload 36
    //   1219: aload 37
    //   1221: aload 27
    //   1223: aload 24
    //   1225: aload 28
    //   1227: aload 38
    //   1229: aload 39
    //   1231: aload 31
    //   1233: aload 40
    //   1235: aload 32
    //   1237: aload_2
    //   1238: iload 18
    //   1240: iload 6
    //   1242: iload 7
    //   1244: fload 4
    //   1246: aload 29
    //   1248: lload 12
    //   1250: aload 30
    //   1252: aload 41
    //   1254: aload 42
    //   1256: aload 43
    //   1258: aload 35
    //   1260: aload_3
    //   1261: fload 5
    //   1263: iload 19
    //   1265: iload 8
    //   1267: iload 9
    //   1269: iload 20
    //   1271: iload 21
    //   1273: aload 33
    //   1275: aload 26
    //   1277: iload 22
    //   1279: iload 10
    //   1281: aload 44
    //   1283: aload 45
    //   1285: aload 46
    //   1287: iload 23
    //   1289: aload 47
    //   1291: aload 48
    //   1293: ldc_w 457
    //   1296: iconst_0
    //   1297: invokevirtual 461	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1300: ldc_w 463
    //   1303: invokestatic 469	java/util/Collections:emptySet	()Ljava/util/Set;
    //   1306: invokeinterface 475 3 0
    //   1311: aload 49
    //   1313: invokeinterface 480 2 0
    //   1318: aload 34
    //   1320: invokespecial 483	com/google/android/gms/b/qo$a:<init>	(Landroid/os/Bundle;Lcom/google/android/gms/b/ih;Lcom/google/android/gms/b/il;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/un;Landroid/os/Bundle;Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;ZIIFLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/b/le;Ljava/util/concurrent/Future;Ljava/lang/String;FZIIZZLjava/util/concurrent/Future;Ljava/lang/String;ZILandroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/b/jh;ZLandroid/os/Bundle;ZLjava/util/concurrent/Future;)V
    //   1323: areturn
    //   1324: iconst_0
    //   1325: istore 18
    //   1327: goto -581 -> 746
    //   1330: iconst_0
    //   1331: istore 19
    //   1333: goto -565 -> 768
    //   1336: ldc_w 485
    //   1339: astore_3
    //   1340: goto -356 -> 984
    //   1343: aload_3
    //   1344: getfield 383	com/google/android/gms/ads/internal/x:K	Z
    //   1347: ifeq +24 -> 1371
    //   1350: aload_3
    //   1351: getfield 386	com/google/android/gms/ads/internal/x:L	Z
    //   1354: ifeq +10 -> 1364
    //   1357: ldc_w 487
    //   1360: astore_3
    //   1361: goto -377 -> 984
    //   1364: ldc_w 489
    //   1367: astore_3
    //   1368: goto -384 -> 984
    //   1371: ldc_w 491
    //   1374: astore_3
    //   1375: goto -391 -> 984
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1378	0	this	b
    //   0	1378	1	paramih	ih
    //   0	1378	2	paramBundle	Bundle
    //   0	1378	3	paramti	ti
    //   922	323	4	f1	float
    //   991	271	5	f2	float
    //   140	1101	6	i	int
    //   136	1107	7	m	int
    //   103	1163	8	n	int
    //   109	1159	9	i1	int
    //   121	1159	10	i2	int
    //   133	119	11	i3	int
    //   338	911	12	l1	long
    //   356	371	14	l2	long
    //   366	338	16	l3	long
    //   744	582	18	bool1	boolean
    //   766	566	19	bool2	boolean
    //   1044	226	20	bool3	boolean
    //   1052	220	21	bool4	boolean
    //   1060	218	22	bool5	boolean
    //   1107	181	23	bool6	boolean
    //   31	1	24	localPackageInfo1	PackageInfo
    //   604	1	24	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   607	617	24	localPackageInfo2	PackageInfo
    //   53	1162	25	localObject1	Object
    //   718	1	26	localRemoteException	RemoteException
    //   808	468	26	str1	String
    //   10	1212	27	localApplicationInfo	android.content.pm.ApplicationInfo
    //   271	955	28	str2	String
    //   331	916	29	localObject3	Object
    //   383	849	31	localObject5	Object
    //   552	684	32	localArrayList	ArrayList
    //   792	482	33	localus1	us
    //   805	514	34	localus2	us
    //   827	432	35	localup	up
    //   779	439	36	localObject6	Object
    //   867	353	37	str3	String
    //   875	353	38	str4	String
    //   884	346	39	localun	un
    //   893	341	40	localList	List
    //   46	1207	41	localObject7	Object
    //   936	319	42	str5	String
    //   945	312	43	localle	com.google.android.gms.b.le
    //   1082	200	44	localBundle1	Bundle
    //   1090	194	45	str6	String
    //   1099	187	46	localjh	com.google.android.gms.b.jh
    //   1121	169	47	localBundle2	Bundle
    //   1112	180	48	localObject8	Object
    //   1208	104	49	str7	String
    // Exception table:
    //   from	to	target	type
    //   12	33	604	android/content/pm/PackageManager$NameNotFoundException
    //   350	414	626	finally
    //   414	431	626	finally
    //   431	455	626	finally
    //   612	623	626	finally
    //   627	630	626	finally
    //   638	645	626	finally
    //   648	695	626	finally
    //   695	698	626	finally
    //   701	715	626	finally
    //   315	350	632	finally
    //   455	458	632	finally
    //   630	632	632	finally
    //   633	636	632	finally
    //   505	519	718	android/os/RemoteException
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
    if (f.j != null)
    {
      String str = f.j.q;
      tp.e(String.valueOf(str).length() + 74 + "Mediation adapter " + str + " refreshed, but mediation adapters should never refresh.");
    }
    a(f.j, true);
    u();
  }
  
  public final void D()
  {
    E();
  }
  
  public final void E()
  {
    a(f.j, false);
  }
  
  public final String F()
  {
    if (f.j == null) {
      return null;
    }
    return f.j.q;
  }
  
  public void G()
  {
    throw new IllegalStateException("showInterstitial is not supported for current ad type");
  }
  
  public final void H()
  {
    w.e();
    tt.a(new Runnable()
    {
      public final void run()
      {
        e.b();
      }
    });
  }
  
  public final void I()
  {
    w.e();
    tt.a(new Runnable()
    {
      public final void run()
      {
        e.c();
      }
    });
  }
  
  public void a()
  {
    h.a(f.j);
    k = false;
    r();
    th localth = f.l;
    synchronized (c)
    {
      if ((j != -1L) && (!b.isEmpty()))
      {
        th.a locala = (th.a)b.getLast();
        if (b == -1L)
        {
          b = SystemClock.elapsedRealtime();
          a.a(localth);
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
    f.C = new k(paramString);
    f.r = parampl;
    if ((!w.i().f()) && (parampl != null)) {
      new com.google.android.gms.ads.internal.purchase.c(f.c, f.r, f.C).c();
    }
  }
  
  protected void a(tg paramtg, boolean paramBoolean)
  {
    if (paramtg == null) {
      tp.e("Ad state was null when trying to ping impression URLs.");
    }
    do
    {
      return;
      super.c(paramtg);
      if ((r != null) && (r.d != null))
      {
        String str = w.D().d(f.c);
        w.x();
        nx.a(f.c, f.e.a, paramtg, f.b, paramBoolean, a(str, r.d));
        if (r.d.size() > 0) {
          w.D().b(f.c, str);
        }
      }
    } while ((o == null) || (o.g == null));
    w.x();
    nx.a(f.c, f.e.a, paramtg, f.b, paramBoolean, o.g);
  }
  
  public final void a(String paramString, ArrayList<String> paramArrayList)
  {
    paramArrayList = new d(paramString, paramArrayList, f.c, f.e.a);
    if (f.q == null)
    {
      tp.e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
      ip.a();
      if (!uk.c(f.c))
      {
        tp.e("Google Play Service unavailable, cannot launch default purchase flow.");
        return;
      }
      if (f.r == null)
      {
        tp.e("PlayStorePurchaseListener is not set.");
        return;
      }
      if (f.C == null)
      {
        tp.e("PlayStorePurchaseVerifier is not initialized.");
        return;
      }
      if (f.G)
      {
        tp.e("An in-app purchase request is already in progress, abort");
        return;
      }
      f.G = true;
      try
      {
        if (!f.r.a(paramString))
        {
          f.G = false;
          return;
        }
      }
      catch (RemoteException paramString)
      {
        tp.e("Could not start In-App purchase.");
        f.G = false;
        return;
      }
      w.s();
      paramString = f.c;
      boolean bool = f.e.d;
      paramArrayList = new GInAppPurchaseManagerInfoParcel(f.c, f.C, paramArrayList, this);
      Intent localIntent = new Intent();
      localIntent.setClassName(paramString, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
      localIntent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", bool);
      GInAppPurchaseManagerInfoParcel.a(localIntent, paramArrayList);
      w.e();
      tt.a(paramString, localIntent);
      return;
    }
    try
    {
      f.q.a(paramArrayList);
      return;
    }
    catch (RemoteException paramString)
    {
      tp.e("Could not start In-App purchase.");
    }
  }
  
  public final void a(String paramString, boolean paramBoolean, int paramInt, final Intent paramIntent, f paramf)
  {
    try
    {
      if (f.r != null) {
        f.r.a(new com.google.android.gms.ads.internal.purchase.g(f.c, paramString, paramBoolean, paramInt, paramIntent, paramf));
      }
      tt.a.postDelayed(new Runnable()
      {
        public final void run()
        {
          w.s();
          int i = i.a(paramIntent);
          w.s();
          if ((i == 0) && (f.j != null) && (f.j.b != null) && (f.j.b.i() != null)) {
            f.j.b.i().a();
          }
          f.G = false;
        }
      }, 500L);
      return;
    }
    catch (RemoteException paramString)
    {
      for (;;)
      {
        tp.e("Fail to invoke PlayStorePurchaseListener.");
      }
    }
  }
  
  public boolean a(ih paramih, km paramkm)
  {
    if (!x()) {
      return false;
    }
    w.e();
    Object localObject1 = f.c;
    localObject1 = w.i().a((Context)localObject1);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = null;
      e.a();
      f.F = 0;
      localObject2 = ke.cD;
      if (!((Boolean)w.q().a((jz)localObject2)).booleanValue()) {
        break label256;
      }
      localObject2 = w.i().p();
      w.A().a(f.c, f.e, false, (ti)localObject2, null, f.b, null);
    }
    for (;;)
    {
      paramih = a(paramih, (Bundle)localObject1, (ti)localObject2);
      paramkm.a("seq_num", g);
      paramkm.a("request_id", u);
      paramkm.a("session_id", h);
      if (f != null) {
        paramkm.a("app_version", String.valueOf(f.versionCode));
      }
      paramkm = f;
      w.a();
      localObject1 = f.c;
      if (b.c.getBundle("sdk_less_server_data") != null) {}
      for (paramih = new rb((Context)localObject1, paramih, this);; paramih = new qk((Context)localObject1, paramih, this))
      {
        paramih.c();
        g = paramih;
        return true;
        localObject1 = tt.a((hi)localObject1);
        break;
      }
      label256:
      localObject2 = null;
    }
  }
  
  public boolean a(ih paramih, tg paramtg, boolean paramBoolean)
  {
    if ((!paramBoolean) && (f.c()))
    {
      if (h <= 0L) {
        break label43;
      }
      e.a(paramih, h);
    }
    for (;;)
    {
      return e.b;
      label43:
      if ((r != null) && (r.i > 0L)) {
        e.a(paramih, r.i);
      } else if ((!n) && (d == 2)) {
        e.a(paramih);
      }
    }
  }
  
  final boolean a(tg paramtg)
  {
    boolean bool = false;
    Object localObject;
    if (g != null)
    {
      localObject = g;
      g = null;
    }
    for (;;)
    {
      return a((ih)localObject, paramtg, bool);
      ih localih = a;
      localObject = localih;
      if (c != null)
      {
        bool = c.getBoolean("_noRefresh", false);
        localObject = localih;
      }
    }
  }
  
  public boolean a(tg arg1, tg arg2)
  {
    int i = 0;
    if ((??? != null) && (s != null)) {
      s.a(null);
    }
    if (s != null) {
      s.a(this);
    }
    int m;
    if (r != null)
    {
      m = r.p;
      i = r.q;
    }
    for (;;)
    {
      tm localtm = f.D;
      synchronized (a)
      {
        b = m;
        c = i;
        tj localtj = d;
        String str = e;
        synchronized (a)
        {
          e.put(str, localtm);
          return true;
        }
      }
      m = 0;
    }
  }
  
  public final void b()
  {
    h.b(f.j);
  }
  
  public final void b(tg paramtg)
  {
    super.b(paramtg);
    x.a locala;
    if (o != null)
    {
      tp.b("Disable the debug gesture detector on the mediation ad frame.");
      if (f.f != null)
      {
        locala = f.f;
        tp.a("Disable debug gesture detector on adFrame.");
        c = false;
      }
      tp.b("Pinging network fill URLs.");
      w.x();
      nx.a(f.c, f.e.a, paramtg, f.b, false, o.h);
      if ((r != null) && (r.f != null) && (r.f.size() > 0))
      {
        tp.b("Pinging urls remotely");
        w.e();
        tt.a(f.c, r.f);
      }
    }
    for (;;)
    {
      if ((d == 3) && (r != null) && (r.e != null))
      {
        tp.b("Pinging no fill URLs.");
        w.x();
        nx.a(f.c, f.e.a, paramtg, f.b, false, r.e);
      }
      return;
      tp.b("Enable the debug gesture detector on the admob ad frame.");
      if (f.f != null)
      {
        locala = f.f;
        tp.a("Enable debug gesture detector on adFrame.");
        c = true;
      }
    }
  }
  
  protected final boolean b(ih paramih)
  {
    return (super.b(paramih)) && (!k);
  }
  
  public final void c()
  {
    h.c(f.j);
  }
  
  public void d()
  {
    k = true;
    t();
  }
  
  public final void e()
  {
    if (f.j == null)
    {
      tp.e("Ad state was null when trying to ping click URLs.");
      return;
    }
    if ((f.j.r != null) && (f.j.r.c != null))
    {
      String str = w.D().d(f.c);
      w.x();
      nx.a(f.c, f.e.a, f.j, f.b, false, a(str, f.j.r.c));
      if (f.j.r.c.size() > 0) {
        w.D().a(f.c, str);
      }
    }
    if ((f.j.o != null) && (f.j.o.f != null))
    {
      w.x();
      nx.a(f.c, f.e.a, f.j, f.b, false, f.j.o.f);
    }
    super.e();
  }
  
  public void m()
  {
    com.google.android.gms.common.internal.c.b("pause must be called on the main UI thread.");
    if ((f.j != null) && (f.j.b != null) && (f.c()))
    {
      w.g();
      tu.a(f.j.b);
    }
    if ((f.j != null) && (f.j.p != null)) {}
    try
    {
      f.j.p.d();
      h.b(f.j);
      e.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        tp.e("Could not pause mediation adapter.");
      }
    }
  }
  
  public void n()
  {
    com.google.android.gms.common.internal.c.b("resume must be called on the main UI thread.");
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (f.j != null)
    {
      localObject1 = localObject2;
      if (f.j.b != null) {
        localObject1 = f.j.b;
      }
    }
    if ((localObject1 != null) && (f.c()))
    {
      w.g();
      tu.b(f.j.b);
    }
    if ((f.j != null) && (f.j.p != null)) {}
    try
    {
      f.j.p.e();
      if ((localObject1 == null) || (!((vc)localObject1).u())) {
        e.c();
      }
      h.c(f.j);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        tp.e("Could not resume mediation adapter.");
      }
    }
  }
  
  protected boolean x()
  {
    boolean bool = true;
    w.e();
    if (tt.a(f.c, f.c.getPackageName(), "android.permission.INTERNET"))
    {
      w.e();
      if (tt.a(f.c)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */