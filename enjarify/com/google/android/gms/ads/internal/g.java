package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.d;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.hb;
import com.google.android.gms.b.hb.b;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.jf;
import com.google.android.gms.b.jp;
import com.google.android.gms.b.jt;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.md;
import com.google.android.gms.b.nr;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.od;
import com.google.android.gms.b.og;
import com.google.android.gms.b.oh;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.sx;
import com.google.android.gms.b.sz;
import com.google.android.gms.b.ta;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import com.google.android.gms.b.ux;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.vd.c;
import com.google.android.gms.b.vd.e;
import com.google.android.gms.b.vi;
import java.util.List;

public final class g
  extends c
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private boolean l;
  
  public g(Context paramContext, il paramil, String paramString, oc paramoc, un paramun, e parame)
  {
    super(paramContext, paramil, paramString, paramoc, paramun, parame);
  }
  
  /* Error */
  private boolean b(tg paramtg1, tg paramtg2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_2
    //   3: getfield 20	com/google/android/gms/b/tg:n	Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifeq +295 -> 305
    //   13: aload_2
    //   14: invokestatic 26	com/google/android/gms/ads/internal/p:a	(Lcom/google/android/gms/b/tg;)Landroid/view/View;
    //   17: astore 5
    //   19: aload 5
    //   21: ifnonnull +17 -> 38
    //   24: ldc 28
    //   26: invokestatic 34	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   29: iconst_0
    //   30: istore 4
    //   32: aconst_null
    //   33: astore 6
    //   35: iload 4
    //   37: ireturn
    //   38: aload_0
    //   39: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   42: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   45: astore 6
    //   47: aload 6
    //   49: invokevirtual 49	com/google/android/gms/ads/internal/x$a:getNextView	()Landroid/view/View;
    //   52: astore 7
    //   54: aload 7
    //   56: ifnull +52 -> 108
    //   59: aload 7
    //   61: instanceof 51
    //   64: istore 4
    //   66: iload 4
    //   68: ifeq +21 -> 89
    //   71: aload 7
    //   73: astore 6
    //   75: aload 7
    //   77: checkcast 51	com/google/android/gms/b/vc
    //   80: astore 6
    //   82: aload 6
    //   84: invokeinterface 55 1 0
    //   89: aload_0
    //   90: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   93: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   96: astore 6
    //   98: aload 6
    //   100: aload 7
    //   102: checkcast 57	android/view/View
    //   105: invokevirtual 61	com/google/android/gms/ads/internal/x$a:removeView	(Landroid/view/View;)V
    //   108: aload_2
    //   109: invokestatic 65	com/google/android/gms/ads/internal/p:b	(Lcom/google/android/gms/b/tg;)Z
    //   112: istore 4
    //   114: iload 4
    //   116: ifne +9 -> 125
    //   119: aload_0
    //   120: aload 5
    //   122: invokevirtual 67	com/google/android/gms/ads/internal/g:a	(Landroid/view/View;)V
    //   125: aload_0
    //   126: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   129: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   132: astore 6
    //   134: aload 6
    //   136: invokevirtual 71	com/google/android/gms/ads/internal/x$a:getChildCount	()I
    //   139: istore 4
    //   141: iload 4
    //   143: iload_3
    //   144: if_icmple +17 -> 161
    //   147: aload_0
    //   148: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   151: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   154: astore 6
    //   156: aload 6
    //   158: invokevirtual 74	com/google/android/gms/ads/internal/x$a:showNext	()V
    //   161: aload_1
    //   162: ifnull +82 -> 244
    //   165: aload_0
    //   166: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   169: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   172: invokevirtual 49	com/google/android/gms/ads/internal/x$a:getNextView	()Landroid/view/View;
    //   175: astore 6
    //   177: aload 6
    //   179: instanceof 51
    //   182: istore 8
    //   184: iload 8
    //   186: ifeq +246 -> 432
    //   189: aload 6
    //   191: checkcast 51	com/google/android/gms/b/vc
    //   194: astore 6
    //   196: aload_0
    //   197: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   200: getfield 78	com/google/android/gms/ads/internal/x:c	Landroid/content/Context;
    //   203: astore 7
    //   205: aload_0
    //   206: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   209: getfield 82	com/google/android/gms/ads/internal/x:i	Lcom/google/android/gms/b/il;
    //   212: astore 5
    //   214: aload_0
    //   215: getfield 85	com/google/android/gms/ads/internal/g:a	Lcom/google/android/gms/b/km;
    //   218: astore 9
    //   220: aload 6
    //   222: aload 7
    //   224: aload 5
    //   226: aload 9
    //   228: invokeinterface 88 4 0
    //   233: aload_0
    //   234: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   237: astore 6
    //   239: aload 6
    //   241: invokevirtual 90	com/google/android/gms/ads/internal/x:b	()V
    //   244: aload_0
    //   245: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   248: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   251: astore 6
    //   253: aload 6
    //   255: iconst_0
    //   256: invokevirtual 94	com/google/android/gms/ads/internal/x$a:setVisibility	(I)V
    //   259: iload_3
    //   260: istore 4
    //   262: goto -227 -> 35
    //   265: astore 6
    //   267: invokestatic 99	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   270: astore 7
    //   272: ldc 101
    //   274: astore 10
    //   276: aload 7
    //   278: aload 6
    //   280: aload 10
    //   282: invokevirtual 106	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   285: ldc 108
    //   287: astore 7
    //   289: aload 7
    //   291: aload 6
    //   293: invokestatic 111	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   296: iconst_0
    //   297: istore 4
    //   299: aconst_null
    //   300: astore 6
    //   302: goto -267 -> 35
    //   305: aload_2
    //   306: getfield 114	com/google/android/gms/b/tg:v	Lcom/google/android/gms/b/il;
    //   309: astore 6
    //   311: aload 6
    //   313: ifnull -188 -> 125
    //   316: aload_2
    //   317: getfield 117	com/google/android/gms/b/tg:b	Lcom/google/android/gms/b/vc;
    //   320: astore 6
    //   322: aload 6
    //   324: ifnull -199 -> 125
    //   327: aload_2
    //   328: getfield 117	com/google/android/gms/b/tg:b	Lcom/google/android/gms/b/vc;
    //   331: astore 6
    //   333: aload_2
    //   334: getfield 114	com/google/android/gms/b/tg:v	Lcom/google/android/gms/b/il;
    //   337: astore 7
    //   339: aload 6
    //   341: aload 7
    //   343: invokeinterface 120 2 0
    //   348: aload_0
    //   349: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   352: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   355: invokevirtual 123	com/google/android/gms/ads/internal/x$a:removeAllViews	()V
    //   358: aload_0
    //   359: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   362: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   365: astore 6
    //   367: aload_2
    //   368: getfield 114	com/google/android/gms/b/tg:v	Lcom/google/android/gms/b/il;
    //   371: getfield 128	com/google/android/gms/b/il:f	I
    //   374: istore 8
    //   376: aload 6
    //   378: iload 8
    //   380: invokevirtual 131	com/google/android/gms/ads/internal/x$a:setMinimumWidth	(I)V
    //   383: aload_0
    //   384: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   387: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   390: astore 6
    //   392: aload_2
    //   393: getfield 114	com/google/android/gms/b/tg:v	Lcom/google/android/gms/b/il;
    //   396: astore 7
    //   398: aload 7
    //   400: getfield 133	com/google/android/gms/b/il:c	I
    //   403: istore 8
    //   405: aload 6
    //   407: iload 8
    //   409: invokevirtual 136	com/google/android/gms/ads/internal/x$a:setMinimumHeight	(I)V
    //   412: aload_2
    //   413: getfield 117	com/google/android/gms/b/tg:b	Lcom/google/android/gms/b/vc;
    //   416: invokeinterface 138 1 0
    //   421: astore 6
    //   423: aload_0
    //   424: aload 6
    //   426: invokevirtual 67	com/google/android/gms/ads/internal/g:a	(Landroid/view/View;)V
    //   429: goto -304 -> 125
    //   432: aload 6
    //   434: ifnull -201 -> 233
    //   437: aload_0
    //   438: getfield 38	com/google/android/gms/ads/internal/g:f	Lcom/google/android/gms/ads/internal/x;
    //   441: getfield 43	com/google/android/gms/ads/internal/x:f	Lcom/google/android/gms/ads/internal/x$a;
    //   444: astore 7
    //   446: aload 7
    //   448: aload 6
    //   450: invokevirtual 61	com/google/android/gms/ads/internal/x$a:removeView	(Landroid/view/View;)V
    //   453: goto -220 -> 233
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	456	0	this	g
    //   0	456	1	paramtg1	tg
    //   0	456	2	paramtg2	tg
    //   1	259	3	i	int
    //   6	109	4	bool1	boolean
    //   139	159	4	j	int
    //   17	208	5	localObject1	Object
    //   33	221	6	localObject2	Object
    //   265	27	6	localThrowable	Throwable
    //   300	149	6	localObject3	Object
    //   52	395	7	localObject4	Object
    //   182	3	8	bool2	boolean
    //   374	34	8	k	int
    //   218	9	9	localkm	com.google.android.gms.b.km
    //   274	7	10	str	String
    // Exception table:
    //   from	to	target	type
    //   120	125	265	finally
  }
  
  public final void G()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Interstitial is NOT supported by BannerAdManager.");
    throw localIllegalStateException;
  }
  
  protected final vc a(tg.a parama, f paramf, sx paramsx)
  {
    int i = 1;
    int j = 0;
    Context localContext = null;
    Object localObject1 = f.i.g;
    if (localObject1 == null)
    {
      localObject1 = f.i;
      boolean bool = i;
      if (bool)
      {
        x localx = f;
        localObject1 = b;
        bool = A;
        if (!bool) {
          break label95;
        }
        localObject1 = f.i;
        i = ((il)localObject1);
      }
    }
    return super.a(parama, paramf, paramsx);
    label95:
    localObject1 = b.m;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = ((String)localObject1).split("[xX]");
      localObject2 = localObject1[0].trim();
      localObject1[0] = localObject2;
      localObject2 = localObject1[i].trim();
      localObject1[i] = localObject2;
      localObject2 = localObject1[0];
      int k = Integer.parseInt((String)localObject2);
      j = Integer.parseInt(localObject1[i]);
      localObject1 = new com/google/android/gms/ads/d;
      ((d)localObject1).<init>(k, j);
    }
    for (;;)
    {
      localObject2 = new com/google/android/gms/b/il;
      localContext = f.c;
      ((il)localObject2).<init>(localContext, (d)localObject1);
      localObject1 = localObject2;
      break;
      localObject1 = f.i.c();
    }
  }
  
  protected final void a(tg paramtg, boolean paramBoolean)
  {
    boolean bool1 = false;
    String str = null;
    super.a(paramtg, paramBoolean);
    boolean bool2 = p.b(paramtg);
    g.a locala;
    vc localvc;
    Object localObject2;
    Object localObject3;
    if (bool2)
    {
      locala = new com/google/android/gms/ads/internal/g$a;
      locala.<init>(this);
      if (paramtg != null)
      {
        bool2 = p.b(paramtg);
        if (bool2)
        {
          localvc = b;
          if (localvc == null) {
            break label87;
          }
          localObject2 = localvc.b();
          localObject3 = localObject2;
          if (localObject3 != null) {
            break label93;
          }
          str = "AdWebView is null";
          tp.e(str);
        }
      }
    }
    for (;;)
    {
      return;
      label87:
      localObject3 = null;
      break;
      label93:
      Object localObject4;
      for (;;)
      {
        try
        {
          localObject2 = o;
          if (localObject2 == null) {
            break label168;
          }
          localObject2 = o;
          localObject2 = o;
          localObject4 = localObject2;
          if (localObject4 != null)
          {
            bool2 = ((List)localObject4).isEmpty();
            if (!bool2) {
              break label174;
            }
          }
          str = "No template ids present in mediation response";
          tp.e(str);
        }
        catch (RemoteException localRemoteException)
        {
          localObject2 = "Error occurred while recording impression and registering for clicks";
          tp.c((String)localObject2, localRemoteException);
        }
        break;
        label168:
        localObject4 = null;
      }
      label174:
      localObject2 = p;
      if (localObject2 != null) {
        localObject2 = p;
      }
      Object localObject1;
      for (localObject2 = ((od)localObject2).h();; localObject2 = null)
      {
        Object localObject5 = p;
        if (localObject5 != null)
        {
          localObject1 = p;
          localObject1 = ((od)localObject1).i();
        }
        localObject5 = "2";
        boolean bool3 = ((List)localObject4).contains(localObject5);
        if ((!bool3) || (localObject2 == null)) {
          break label334;
        }
        localObject1 = b.a(localObject3);
        ((og)localObject2).b((a)localObject1);
        bool1 = ((og)localObject2).j();
        if (!bool1) {
          ((og)localObject2).i();
        }
        localObject1 = localvc.l();
        localObject4 = "/nativeExpressViewClicked";
        localObject3 = null;
        localObject2 = p.a((og)localObject2, null, locala);
        ((vd)localObject1).a((String)localObject4, (md)localObject2);
        break;
        bool2 = false;
      }
      label334:
      localObject2 = "1";
      bool2 = ((List)localObject4).contains(localObject2);
      if ((bool2) && (localObject1 != null))
      {
        localObject2 = b.a(localObject3);
        ((oh)localObject1).b((a)localObject2);
        bool2 = ((oh)localObject1).h();
        if (!bool2) {
          ((oh)localObject1).g();
        }
        localObject2 = localvc.l();
        localObject4 = "/nativeExpressViewClicked";
        localObject3 = null;
        localObject1 = p.a(null, (oh)localObject1, locala);
        ((vd)localObject2).a((String)localObject4, (md)localObject1);
      }
      else
      {
        localObject1 = "No matching template id and mapper";
        tp.e((String)localObject1);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    com.google.android.gms.common.internal.c.b("setManualImpressionsEnabled must be called from the main thread.");
    l = paramBoolean;
  }
  
  public final boolean a(ih paramih)
  {
    boolean bool1 = h;
    boolean bool2 = l;
    if (bool1 == bool2) {
      return super.a(paramih);
    }
    ih localih = new com/google/android/gms/b/ih;
    int i = a;
    long l1 = b;
    Bundle localBundle1 = c;
    int j = d;
    List localList1 = e;
    boolean bool3 = f;
    int k = g;
    boolean bool4 = h;
    if (!bool4)
    {
      bool4 = l;
      if (!bool4) {
        break label198;
      }
    }
    label198:
    for (bool4 = true;; bool4 = false)
    {
      String str1 = i;
      jp localjp = j;
      Location localLocation = k;
      String str2 = l;
      Bundle localBundle2 = m;
      Bundle localBundle3 = n;
      List localList2 = o;
      String str3 = p;
      String str4 = q;
      boolean bool5 = r;
      localih.<init>(i, l1, localBundle1, j, localList1, bool3, k, bool4, str1, localjp, localLocation, str2, localBundle2, localBundle3, localList2, str3, str4, bool5);
      paramih = localih;
      break;
    }
  }
  
  public final boolean a(tg paramtg1, tg paramtg2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    int i = 0;
    Object localObject2 = null;
    boolean bool3 = super.a(paramtg1, paramtg2);
    if (!bool3) {
      bool3 = false;
    }
    for (Object localObject3 = null;; localObject3 = null)
    {
      return bool3;
      localObject3 = f;
      bool3 = ((x)localObject3).c();
      if (!bool3) {
        break;
      }
      bool3 = b(paramtg1, paramtg2);
      if (bool3) {
        break;
      }
      a(0);
      bool3 = false;
    }
    bool3 = k;
    Object localObject4;
    label175:
    Object localObject5;
    if (bool3)
    {
      d(paramtg2);
      w.C();
      ux.a(f.f, this);
      w.C();
      localObject3 = f.f;
      ux.a((View)localObject3, this);
      bool3 = m;
      if (!bool3)
      {
        localObject4 = new com/google/android/gms/ads/internal/g$1;
        ((g.1)localObject4).<init>(this);
        localObject3 = b;
        if (localObject3 == null) {
          break label515;
        }
        localObject3 = b.l();
        if (localObject3 != null)
        {
          localObject5 = new com/google/android/gms/ads/internal/g$2;
          ((g.2)localObject5).<init>(paramtg2, (Runnable)localObject4);
          k = ((vd.e)localObject5);
        }
      }
      label200:
      localObject3 = b;
      if (localObject3 == null) {
        break label681;
      }
      localObject3 = b.z();
      localObject1 = b.l();
      if (localObject1 != null) {
        ((vd)localObject1).g();
      }
    }
    for (;;)
    {
      localObject1 = f.x;
      if ((localObject1 != null) && (localObject3 != null))
      {
        localObject1 = f.x;
        bool1 = a;
        ((vi)localObject3).b(bool1);
      }
      int j = Build.VERSION.SDK_INT;
      localObject3 = f;
      boolean bool4 = ((x)localObject3).c();
      if (bool4)
      {
        localObject3 = b;
        if (localObject3 != null)
        {
          localObject3 = j;
          if (localObject3 != null)
          {
            localObject3 = h;
            localObject1 = f.i;
            ((gv)localObject3).a((il)localObject1, paramtg2);
          }
          localObject1 = new com/google/android/gms/b/hb;
          localObject3 = f.c;
          localObject4 = b.b();
          ((hb)localObject1).<init>((Context)localObject3, (View)localObject4);
          localObject4 = w.D();
          localObject3 = ke.av;
          localObject5 = w.q();
          localObject3 = (Boolean)((kd)localObject5).a((jz)localObject3);
          bool4 = ((Boolean)localObject3).booleanValue();
          if (bool4)
          {
            bool4 = ((ta)localObject4).a();
            if (bool4) {
              i = bool2;
            }
          }
          if (i != 0)
          {
            localObject3 = new com/google/android/gms/b/sz;
            localObject2 = f.c;
            localObject4 = f.b;
            ((sz)localObject3).<init>((Context)localObject2, (String)localObject4);
            ((hb)localObject1).a((hb.b)localObject3);
          }
          bool4 = paramtg2.a();
          if (!bool4) {
            break label585;
          }
          localObject3 = b;
          ((hb)localObject1).a((hb.b)localObject3);
        }
      }
      for (;;)
      {
        bool4 = bool2;
        break;
        label515:
        bool4 = false;
        localObject3 = null;
        break label175;
        localObject3 = f;
        bool4 = ((x)localObject3).d();
        if (bool4)
        {
          localObject3 = ke.cb;
          localObject4 = w.q();
          localObject3 = (Boolean)((kd)localObject4).a((jz)localObject3);
          bool4 = ((Boolean)localObject3).booleanValue();
          if (!bool4) {
            break label200;
          }
        }
        a(paramtg2, false);
        break label200;
        label585:
        localObject3 = b.l();
        localObject2 = new com/google/android/gms/ads/internal/g$3;
        ((g.3)localObject2).<init>((hb)localObject1, paramtg2);
        e = ((vd.c)localObject2);
        continue;
        localObject3 = f.E;
        if (localObject3 != null)
        {
          localObject3 = j;
          if (localObject3 != null)
          {
            localObject3 = h;
            localObject1 = f.i;
            localObject2 = f.E;
            ((gv)localObject3).a((il)localObject1, paramtg2, (View)localObject2);
          }
        }
      }
      label681:
      bool4 = false;
      localObject3 = null;
    }
  }
  
  final void d(tg paramtg)
  {
    if (paramtg == null) {}
    for (;;)
    {
      return;
      boolean bool = m;
      if (!bool)
      {
        Object localObject1 = f.f;
        if (localObject1 != null)
        {
          w.e();
          localObject1 = f.f;
          Object localObject2 = f.c;
          bool = tt.a((View)localObject1, (Context)localObject2);
          if (bool)
          {
            localObject1 = f.f;
            localObject2 = new android/graphics/Rect;
            ((Rect)localObject2).<init>();
            bool = ((x.a)localObject1).getGlobalVisibleRect((Rect)localObject2, null);
            if (bool)
            {
              if (paramtg != null)
              {
                localObject1 = b;
                if (localObject1 != null)
                {
                  localObject1 = b.l();
                  if (localObject1 != null)
                  {
                    localObject1 = b.l();
                    k = null;
                  }
                }
              }
              localObject1 = null;
              a(paramtg, false);
              bool = true;
              m = bool;
            }
          }
        }
      }
    }
  }
  
  public final void onGlobalLayout()
  {
    tg localtg = f.j;
    d(localtg);
  }
  
  public final void onScrollChanged()
  {
    tg localtg = f.j;
    d(localtg);
  }
  
  public final jf q()
  {
    com.google.android.gms.common.internal.c.b("getVideoController must be called from the main thread.");
    Object localObject = f.j;
    if (localObject != null)
    {
      localObject = f.j.b;
      if (localObject == null) {}
    }
    for (localObject = f.j.b.z();; localObject = null) {
      return (jf)localObject;
    }
  }
  
  protected final boolean x()
  {
    boolean bool1 = true;
    w.e();
    Object localObject = f.c;
    String str1 = f.c.getPackageName();
    String str2 = "android.permission.INTERNET";
    boolean bool2 = tt.a((Context)localObject, str1, str2);
    x.a locala;
    if (!bool2)
    {
      ip.a();
      locala = f.f;
      localObject = f.i;
      str1 = "Missing internet permission in AndroidManifest.xml.";
      str2 = "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />";
      uk.a(locala, (il)localObject, str1, str2);
      bool1 = false;
      locala = null;
    }
    w.e();
    localObject = f.c;
    bool2 = tt.a((Context)localObject);
    if (!bool2)
    {
      ip.a();
      locala = f.f;
      localObject = f.i;
      str1 = "Missing AdActivity with android:configChanges in AndroidManifest.xml.";
      str2 = "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />";
      uk.a(locala, (il)localObject, str1, str2);
      bool1 = false;
      locala = null;
    }
    if (!bool1)
    {
      localObject = f.f;
      if (localObject != null)
      {
        localObject = f.f;
        ((x.a)localObject).setVisibility(0);
      }
    }
    return bool1;
  }
}


/* Location:              com/google/android/gms/ads/internal/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */