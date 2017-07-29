package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.b.dw;
import com.google.android.gms.b.gv;
import com.google.android.gms.b.hb;
import com.google.android.gms.b.hb.b;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.km;
import com.google.android.gms.b.mh;
import com.google.android.gms.b.mn;
import com.google.android.gms.b.mn.a;
import com.google.android.gms.b.nr;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.od;
import com.google.android.gms.b.qo;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.qt;
import com.google.android.gms.b.ri;
import com.google.android.gms.b.ss;
import com.google.android.gms.b.sx;
import com.google.android.gms.b.sz;
import com.google.android.gms.b.ta;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tu;
import com.google.android.gms.b.uc;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.vd.c;
import com.google.android.gms.b.ve;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
  extends c
  implements mh, mn.a
{
  protected transient boolean l = false;
  private int m = -1;
  private boolean n;
  private float o;
  private final sz p;
  
  public m(Context paramContext, il paramil, String paramString, oc paramoc, un paramun, e parame)
  {
    super(paramContext, paramil, paramString, paramoc, paramun, parame);
    Object localObject = w.D();
    boolean bool = ((ta)localObject).c();
    if (bool)
    {
      localObject = new com/google/android/gms/b/sz;
      ((sz)localObject).<init>(paramContext, paramString);
    }
    for (;;)
    {
      p = ((sz)localObject);
      return;
      bool = false;
      localObject = null;
    }
  }
  
  private void a(Bundle paramBundle)
  {
    w.e();
    Context localContext = f.c;
    String str = f.e.a;
    tt.b(localContext, str, "gmob-apps", paramBundle, false);
  }
  
  private static tg.a b(tg.a parama)
  {
    Object localObject1 = parama;
    try
    {
      Object localObject2 = b;
      localObject2 = ri.a((qr)localObject2);
      localObject3 = ((JSONObject)localObject2).toString();
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>();
      localObject4 = "pubid";
      Object localObject5 = a;
      localObject5 = e;
      ((JSONObject)localObject2).put((String)localObject4, localObject5);
      Object localObject6 = ((JSONObject)localObject2).toString();
      localObject2 = new com/google/android/gms/b/nr;
      localObject4 = Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter");
      localObject5 = Collections.emptyList();
      Object localObject7 = Collections.emptyList();
      Object localObject8 = Collections.emptyList();
      List localList1 = Collections.emptyList();
      List localList2 = Collections.emptyList();
      ((nr)localObject2).<init>((String)localObject3, (List)localObject4, (List)localObject5, (List)localObject7, (String)localObject6, (List)localObject8, localList1, localList2);
      localObject1 = b;
      Object localObject9 = localObject1;
      ns localns = new com/google/android/gms/b/ns;
      localObject3 = Collections.singletonList(localObject2);
      localObject2 = ke.bG;
      long l1 = ((Long)w.q().a((jz)localObject2)).longValue();
      localObject7 = Collections.emptyList();
      localObject6 = Collections.emptyList();
      localObject8 = Collections.emptyList();
      localList1 = J;
      boolean bool1 = K;
      String str1 = "";
      localObject2 = localns;
      localns.<init>((List)localObject3, l1, (List)localObject7, (List)localObject6, (List)localObject8, localList1, bool1, str1);
      localObject2 = new com/google/android/gms/b/qr;
      localObject1 = parama;
      localObject3 = a;
      localObject1 = localObject9;
      localObject4 = b;
      localObject5 = c;
      localObject7 = Collections.emptyList();
      localObject6 = Collections.emptyList();
      long l2 = g;
      bool1 = true;
      long l3 = i;
      List localList3 = Collections.emptyList();
      long l4 = k;
      int i = l;
      String str2 = m;
      localObject1 = localObject9;
      long l5 = n;
      String str3 = o;
      localObject1 = localObject9;
      boolean bool2 = p;
      String str4 = q;
      localObject1 = localObject9;
      boolean bool3 = s;
      boolean bool4 = t;
      boolean bool5 = u;
      boolean bool6 = v;
      boolean bool7 = w;
      String str5 = z;
      localObject1 = localObject9;
      boolean bool8 = A;
      boolean bool9 = B;
      List localList4 = Collections.emptyList();
      List localList5 = Collections.emptyList();
      boolean bool10 = F;
      qt localqt = G;
      localObject1 = localObject9;
      boolean bool11 = H;
      String str6 = I;
      localObject1 = localObject9;
      List localList6 = J;
      localObject1 = localObject9;
      boolean bool12 = K;
      String str7 = L;
      localObject1 = localObject9;
      String str8 = N;
      localObject1 = localObject9;
      boolean bool13 = O;
      boolean bool14 = P;
      ((qr)localObject2).<init>((qo)localObject3, (String)localObject4, (String)localObject5, (List)localObject7, (List)localObject6, l2, bool1, l3, localList3, l4, i, str2, l5, str3, bool2, str4, null, bool3, bool4, bool5, bool6, bool7, str5, bool8, bool9, null, localList4, localList5, bool10, localqt, bool11, str6, localList6, bool12, str7, null, str8, bool13, bool14);
      localObject4 = new com/google/android/gms/b/tg$a;
      localObject1 = parama;
      localObject5 = a;
      localObject8 = d;
      int j = e;
      long l6 = f;
      long l7 = g;
      localObject7 = localObject2;
      localObject6 = localns;
      ((tg.a)localObject4).<init>((qo)localObject5, (qr)localObject2, localns, (il)localObject8, j, l6, l7, null);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject3 = "Unable to generate ad state for an interstitial ad with pooling.";
        tp.b((String)localObject3, localJSONException);
        Object localObject4 = parama;
      }
    }
    return (tg.a)localObject4;
  }
  
  public final void G()
  {
    boolean bool1 = true;
    int i = -1;
    com.google.android.gms.common.internal.c.b("showInterstitial must be called on the main UI thread.");
    Object localObject1 = f.j;
    if (localObject1 == null)
    {
      localObject1 = "The interstitial has not loaded.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = ke.br;
      Object localObject3 = w.q();
      localObject1 = (Boolean)((kd)localObject3).a((jz)localObject1);
      boolean bool2 = ((Boolean)localObject1).booleanValue();
      if (bool2)
      {
        localObject1 = f.c.getApplicationContext();
        if (localObject1 == null) {
          break label317;
        }
      }
      boolean bool3;
      Object localObject4;
      Object localObject5;
      label317:
      for (localObject1 = f.c.getApplicationContext().getPackageName();; localObject2 = f.c.getPackageName())
      {
        bool3 = l;
        if (!bool3)
        {
          tp.e("It is not recommended to show an interstitial before onAdLoaded completes.");
          localObject3 = new android/os/Bundle;
          ((Bundle)localObject3).<init>();
          ((Bundle)localObject3).putString("appid", (String)localObject1);
          localObject4 = "action";
          localObject5 = "show_interstitial_before_load_finish";
          ((Bundle)localObject3).putString((String)localObject4, (String)localObject5);
          a((Bundle)localObject3);
        }
        w.e();
        localObject3 = f.c;
        bool3 = tt.e((Context)localObject3);
        if (!bool3)
        {
          tp.e("It is not recommended to show an interstitial when app is not in foreground.");
          localObject3 = new android/os/Bundle;
          ((Bundle)localObject3).<init>();
          ((Bundle)localObject3).putString("appid", (String)localObject1);
          localObject1 = "action";
          localObject4 = "show_interstitial_app_not_in_foreground";
          ((Bundle)localObject3).putString((String)localObject1, (String)localObject4);
          a((Bundle)localObject3);
        }
        localObject1 = f;
        bool2 = ((x)localObject1).d();
        if (bool2) {
          break;
        }
        localObject1 = f.j;
        bool2 = n;
        if (!bool2) {
          break label331;
        }
        localObject1 = f.j.p;
        if (localObject1 == null) {
          break label331;
        }
        try
        {
          localObject1 = f;
          localObject1 = j;
          localObject1 = p;
          ((od)localObject1).b();
        }
        catch (RemoteException localRemoteException)
        {
          localObject3 = "Could not show interstitial.";
          tp.c((String)localObject3, localRemoteException);
          O();
        }
        break;
      }
      label331:
      Object localObject2 = f.j.b;
      if (localObject2 == null)
      {
        localObject2 = "The interstitial failed to load.";
        tp.e((String)localObject2);
      }
      else
      {
        localObject2 = f.j.b;
        bool2 = ((vc)localObject2).p();
        if (bool2)
        {
          localObject2 = "The interstitial is already showing.";
          tp.e((String)localObject2);
        }
        else
        {
          f.j.b.a(bool1);
          localObject2 = f.j.j;
          if (localObject2 != null)
          {
            localObject2 = h;
            localObject3 = f.i;
            localObject4 = f.j;
            ((gv)localObject2).a((il)localObject3, (tg)localObject4);
          }
          int j = Build.VERSION.SDK_INT;
          localObject2 = f.j;
          bool3 = ((tg)localObject2).a();
          if (bool3)
          {
            localObject3 = new com/google/android/gms/b/hb;
            localObject4 = f.c;
            localObject5 = b.b();
            ((hb)localObject3).<init>((Context)localObject4, (View)localObject5);
            localObject2 = b;
            ((hb)localObject3).a((hb.b)localObject2);
            label523:
            localObject2 = f;
            k = H;
            if (k == 0) {
              break label676;
            }
            w.e();
            localObject2 = tt.f(f.c);
            localObject3 = localObject2;
            label557:
            localObject2 = w.z();
            if (localObject3 != null) {
              break label690;
            }
            localObject2 = "Bitmap is null. Skipping putting into the Memory Map.";
            tp.b((String)localObject2);
          }
          label676:
          label690:
          int i1;
          for (int k = i;; i1 = ((AtomicInteger)localObject2).getAndIncrement())
          {
            m = k;
            localObject2 = ke.bU;
            localObject4 = w.q();
            localObject2 = (Boolean)((kd)localObject4).a((jz)localObject2);
            k = ((Boolean)localObject2).booleanValue();
            if ((k == 0) || (localObject3 == null)) {
              break label738;
            }
            localObject2 = new com/google/android/gms/ads/internal/m$a;
            int i2 = m;
            ((m.a)localObject2).<init>(this, i2);
            ((to)localObject2).c();
            break;
            localObject3 = b.l();
            localObject4 = new com/google/android/gms/ads/internal/m$1;
            ((m.1)localObject4).<init>(this, (tg)localObject2);
            e = ((vd.c)localObject4);
            break label523;
            k = 0;
            localObject2 = null;
            i2 = 0;
            localObject3 = null;
            break label557;
            localObject4 = a;
            i3 = b.get();
            localObject5 = Integer.valueOf(i3);
            ((Map)localObject4).put(localObject5, localObject3);
            localObject2 = b;
          }
          label738:
          localObject2 = new com/google/android/gms/ads/internal/n;
          boolean bool4 = f.H;
          boolean bool5 = N();
          int i3 = 0;
          localObject5 = null;
          ((n)localObject2).<init>(bool4, bool5, false, 0.0F, i);
          localObject3 = f.j.b;
          int i4 = ((vc)localObject3).q();
          if (i4 == i)
          {
            localObject3 = f.j;
            i4 = g;
          }
          localObject3 = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
          vc localvc = f.j.b;
          un localun = f.e;
          String str = f.j.C;
          localObject4 = this;
          localObject5 = this;
          ((AdOverlayInfoParcel)localObject3).<init>(this, this, this, localvc, i4, localun, str, (n)localObject2);
          w.c();
          localObject2 = f.c;
          h.a((Context)localObject2, (AdOverlayInfoParcel)localObject3, bool1);
        }
      }
    }
  }
  
  protected final boolean N()
  {
    Object localObject1 = f.c;
    boolean bool = localObject1 instanceof Activity;
    if (!bool)
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      localObject1 = ((Activity)f.c).getWindow();
      if (localObject1 != null)
      {
        localObject2 = ((Window)localObject1).getDecorView();
        if (localObject2 != null) {}
      }
      else
      {
        bool = false;
        localObject1 = null;
        continue;
      }
      Object localObject2 = new android/graphics/Rect;
      ((Rect)localObject2).<init>();
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      View localView = ((Window)localObject1).getDecorView();
      localView.getGlobalVisibleRect((Rect)localObject2, null);
      localObject1 = ((Window)localObject1).getDecorView();
      ((View)localObject1).getWindowVisibleDisplayFrame(localRect);
      int i = bottom;
      if (i != 0)
      {
        i = bottom;
        if (i != 0)
        {
          i = top;
          int j = top;
          if (i == j)
          {
            i = 1;
            continue;
          }
        }
      }
      i = 0;
      localObject1 = null;
    }
  }
  
  public final void O()
  {
    Object localObject = w.z();
    int i = m;
    Integer localInteger = Integer.valueOf(i);
    a.remove(localInteger);
    localObject = f;
    boolean bool = ((x)localObject).c();
    if (bool)
    {
      f.a();
      localObject = f;
      i = 0;
      localInteger = null;
      j = null;
      localObject = f;
      H = false;
      l = false;
    }
  }
  
  public final void P()
  {
    Object localObject = f.j;
    if (localObject != null)
    {
      localObject = f.j.y;
      if (localObject != null)
      {
        w.e();
        localObject = f.c;
        String str = f.e.a;
        List localList = f.j.y;
        tt.a((Context)localObject, str, localList);
      }
    }
    v();
  }
  
  protected final vc a(tg.a parama, f paramf, sx paramsx)
  {
    w.f();
    Object localObject1 = f.c;
    Object localObject2 = f.i;
    Object localObject3 = f.d;
    un localun = f.e;
    Object localObject4 = a;
    Object localObject5 = i;
    vc localvc = ve.a((Context)localObject1, (il)localObject2, false, false, (dw)localObject3, localun, (km)localObject4, this, (e)localObject5);
    localObject1 = localvc.l();
    localObject2 = ke.ap;
    boolean bool = ((Boolean)w.q().a((jz)localObject2)).booleanValue();
    localObject2 = this;
    localObject3 = this;
    localObject4 = this;
    localObject5 = paramf;
    ((vd)localObject1).a(this, null, this, this, bool, this, this, paramf, null, paramsx);
    a(localvc);
    localObject1 = a.v;
    localvc.b((String)localObject1);
    localObject1 = localvc.l();
    mn localmn = new com/google/android/gms/b/mn;
    localmn.<init>(this);
    ((vd)localObject1).a("/reward", localmn);
    return localvc;
  }
  
  public final void a()
  {
    super.a();
    Object localObject = w.D();
    boolean bool = ((ta)localObject).c();
    if (bool)
    {
      localObject = p;
      ((sz)localObject).a(false);
    }
  }
  
  public final void a(tg.a parama, km paramkm)
  {
    boolean bool1 = true;
    tg.a locala = null;
    Object localObject1 = ke.aW;
    Object localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool2 = ((Boolean)localObject1).booleanValue();
    if (!bool2) {
      super.a(parama, paramkm);
    }
    for (;;)
    {
      return;
      int i = e;
      int j = -2;
      if (i == j) {
        break;
      }
      super.a(parama, paramkm);
    }
    localObject1 = a.c.m;
    localObject2 = "com.google.ads.mediation.admob.AdMobAdapter";
    localObject1 = ((Bundle)localObject1).getBundle((String)localObject2);
    boolean bool3;
    if (localObject1 != null)
    {
      localObject2 = "gw";
      bool3 = ((Bundle)localObject1).containsKey((String)localObject2);
      if (bool3) {}
    }
    else
    {
      bool3 = bool1;
      label124:
      localObject2 = b;
      boolean bool4 = h;
      if (bool4) {
        break label198;
      }
    }
    for (;;)
    {
      if ((bool3) && (bool1))
      {
        localObject1 = f;
        locala = b(parama);
        k = locala;
      }
      localObject1 = f.k;
      super.a((tg.a)localObject1, paramkm);
      break;
      bool3 = false;
      localObject1 = null;
      break label124;
      label198:
      bool1 = false;
    }
  }
  
  public final void a(boolean paramBoolean, float paramFloat)
  {
    n = paramBoolean;
    o = paramFloat;
  }
  
  public final boolean a(ih paramih, km paramkm)
  {
    tg localtg = f.j;
    boolean bool;
    if (localtg != null)
    {
      tp.e("An interstitial is already loading. Aborting.");
      bool = false;
      localtg = null;
    }
    for (;;)
    {
      return bool;
      bool = super.a(paramih, paramkm);
    }
  }
  
  protected final boolean a(ih paramih, tg paramtg, boolean paramBoolean)
  {
    Object localObject = f;
    boolean bool = ((x)localObject).c();
    if (bool)
    {
      localObject = b;
      if (localObject != null)
      {
        w.g();
        localObject = b;
        tu.a((vc)localObject);
      }
    }
    return e.b;
  }
  
  public final boolean a(tg paramtg1, tg paramtg2)
  {
    boolean bool = super.a(paramtg1, paramtg2);
    Object localObject;
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = f;
      bool = ((x)localObject).c();
      if (!bool)
      {
        localObject = f.E;
        if (localObject != null)
        {
          localObject = j;
          if (localObject != null)
          {
            localObject = h;
            il localil = f.i;
            View localView = f.E;
            ((gv)localObject).a(localil, paramtg2, localView);
          }
        }
      }
      bool = true;
    }
  }
  
  public final void b(ss paramss)
  {
    Object localObject = f.j;
    if (localObject != null)
    {
      localObject = f.j.z;
      if (localObject != null)
      {
        w.e();
        localObject = f.c;
        String str = f.e.a;
        List localList = f.j.z;
        tt.a((Context)localObject, str, localList);
      }
      localObject = f.j.x;
      if (localObject != null)
      {
        localObject = f.j;
        paramss = x;
      }
    }
    a(paramss);
  }
  
  public final void b(boolean paramBoolean)
  {
    f.H = paramBoolean;
  }
  
  public final void d()
  {
    boolean bool1 = true;
    E();
    super.d();
    Object localObject1 = f.j;
    if (localObject1 != null)
    {
      localObject1 = f.j.b;
      if (localObject1 != null)
      {
        localObject1 = f.j.b.l();
        if (localObject1 != null) {
          ((vd)localObject1).g();
        }
      }
    }
    localObject1 = w.D();
    boolean bool2 = ((ta)localObject1).c();
    if (bool2)
    {
      localObject1 = w.D();
      localObject2 = f.c;
      localObject3 = ((ta)localObject1).a((Context)localObject2);
      localta = w.D();
      localObject2 = f.c;
      localObject1 = f.b;
      boolean bool3 = localta.a();
      if (bool3)
      {
        bool3 = localObject2 instanceof Activity;
        if (bool3)
        {
          bool3 = TextUtils.isEmpty((CharSequence)localObject3);
          if (!bool3) {
            break label408;
          }
        }
      }
    }
    for (Object localObject3 = localObject1;; localObject3 = localObject1)
    {
      try
      {
        localObject1 = ((Context)localObject2).getClassLoader();
        localObject4 = "com.google.firebase.analytics.FirebaseAnalytics";
        localObject4 = ((ClassLoader)localObject1).loadClass((String)localObject4);
        localObject1 = "getInstance";
        k = 1;
        localObject5 = new Class[k];
        int i1 = 0;
        Object localObject6 = null;
        Object localObject7 = Context.class;
        localObject5[0] = localObject7;
        localObject1 = ((Class)localObject4).getDeclaredMethod((String)localObject1, (Class[])localObject5);
        k = 0;
        localObject5 = null;
        i1 = 1;
        localObject6 = new Object[i1];
        int i2 = 0;
        localObject7 = null;
        localObject6[0] = localObject2;
        localObject5 = ((Method)localObject1).invoke(null, (Object[])localObject6);
        Object localObject8 = localObject2;
        localObject8 = (Activity)localObject2;
        localObject1 = localObject8;
        localObject6 = "setCurrentScreen";
        i2 = 3;
        localObject7 = new Class[i2];
        int i3 = 0;
        Class localClass = Activity.class;
        localObject7[0] = localClass;
        i3 = 1;
        localClass = String.class;
        localObject7[i3] = localClass;
        i3 = 2;
        localClass = String.class;
        localObject7[i3] = localClass;
        localObject4 = ((Class)localObject4).getDeclaredMethod((String)localObject6, (Class[])localObject7);
        i1 = 3;
        localObject6 = new Object[i1];
        i2 = 0;
        localObject7 = null;
        localObject6[0] = localObject8;
        bool2 = true;
        localObject6[bool2] = localObject3;
        int i = 2;
        localObject2 = ((Context)localObject2).getPackageName();
        localObject6[i] = localObject2;
        ((Method)localObject4).invoke(localObject5, (Object[])localObject6);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject4;
          int k;
          Object localObject5;
          label408:
          int j;
          localObject2 = "setCurrentScreen";
          localta.a(localException, (String)localObject2);
        }
      }
      localObject1 = p;
      ((sz)localObject1).a(bool1);
      return;
      j = String.valueOf(localObject1).length() + 1;
      k = String.valueOf(localObject3).length();
      j += k;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>(j);
      localObject1 = ((StringBuilder)localObject5).append((String)localObject1);
      localObject4 = "_";
      localObject1 = (String)localObject4 + (String)localObject3;
    }
  }
  
  protected final void r()
  {
    O();
    super.r();
  }
  
  protected final void u()
  {
    super.u();
    l = true;
  }
}


/* Location:              com/google/android/gms/ads/internal/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */