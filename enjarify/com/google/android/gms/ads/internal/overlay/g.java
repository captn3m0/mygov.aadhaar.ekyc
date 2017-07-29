package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.f;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.il;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.ly;
import com.google.android.gms.b.mf;
import com.google.android.gms.b.pb.a;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tu;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.vd.a;
import com.google.android.gms.b.ve;
import com.google.android.gms.common.util.i;
import java.util.Collections;
import java.util.Map;

public final class g
  extends pb.a
  implements x
{
  static final int a = Color.argb(0, 0, 0, 0);
  public final Activity b;
  AdOverlayInfoParcel c;
  vc d;
  g.c e;
  public r f;
  public boolean g = false;
  public FrameLayout h;
  public WebChromeClient.CustomViewCallback i;
  boolean j = false;
  boolean k = false;
  public g.b l;
  public boolean m = false;
  int n = 0;
  o o;
  public final Object p;
  public Runnable q;
  public boolean r;
  public boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  
  public g(Activity paramActivity)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    p = localObject;
    t = false;
    u = false;
    v = true;
    b = paramActivity;
    localObject = new com/google/android/gms/ads/internal/overlay/v;
    ((v)localObject).<init>();
    o = ((o)localObject);
  }
  
  private void b(boolean paramBoolean)
  {
    boolean bool1 = s;
    if (!bool1)
    {
      localObject1 = b;
      i4 = 1;
      ((Activity)localObject1).requestWindowFeature(i4);
    }
    Object localObject1 = b;
    Window localWindow = ((Activity)localObject1).getWindow();
    if (localWindow == null)
    {
      localObject1 = new com/google/android/gms/ads/internal/overlay/g$a;
      ((g.a)localObject1).<init>("Invalid activity, no window available.");
      throw ((Throwable)localObject1);
    }
    int i4 = 1;
    bool1 = i.f();
    kd localkd;
    Object localObject2;
    if (bool1)
    {
      localObject1 = ke.dn;
      localkd = w.q();
      localObject1 = (Boolean)localkd.a((jz)localObject1);
      bool1 = ((Boolean)localObject1).booleanValue();
      if (bool1)
      {
        w.e();
        localObject1 = b;
        localObject2 = b.getResources().getConfiguration();
      }
    }
    label217:
    label286:
    label291:
    label392:
    label639:
    label666:
    label842:
    label868:
    label877:
    label884:
    int i3;
    int i6;
    for (bool1 = tt.a((Activity)localObject1, (Configuration)localObject2);; i3 = i6)
    {
      localObject2 = c.p;
      boolean bool6;
      Object localObject3;
      boolean bool3;
      Object localObject4;
      Object localObject5;
      String str;
      Object localObject6;
      boolean bool8;
      boolean bool5;
      if (localObject2 != null)
      {
        localObject2 = c.p;
        boolean bool4 = b;
        if (bool4)
        {
          bool4 = true;
          bool6 = k;
          if (((!bool6) || (bool4)) && (bool1))
          {
            i1 = 1024;
            i5 = 1024;
            localWindow.setFlags(i1, i5);
          }
          localObject1 = c.d.l();
          if (localObject1 == null) {
            break label868;
          }
          bool6 = ((vd)localObject1).a();
          int i1 = 0;
          localObject1 = null;
          m = false;
          if (bool6)
          {
            localObject1 = c;
            i1 = j;
            localObject2 = w.g();
            i5 = ((tu)localObject2).a();
            if (i1 != i5) {
              break label884;
            }
            localObject1 = b.getResources().getConfiguration();
            i1 = orientation;
            i5 = 1;
            if (i1 != i5) {
              break label877;
            }
            i1 = 1;
            m = i1;
          }
          boolean bool2 = m;
          int i5 = 46;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>(i5);
          localObject2 = ((StringBuilder)localObject3).append("Delay onShow to next orientation change: ");
          tp.b(bool2);
          int i2 = c.j;
          a(i2);
          localObject1 = w.g();
          bool3 = ((tu)localObject1).a(localWindow);
          if (bool3)
          {
            localObject1 = "Hardware acceleration on the AdActivity window enabled.";
            tp.b((String)localObject1);
          }
          bool3 = k;
          if (bool3) {
            break label954;
          }
          localObject1 = l;
          i5 = -16777216;
          ((g.b)localObject1).setBackgroundColor(i5);
          localObject1 = b;
          localObject2 = l;
          ((Activity)localObject1).setContentView((View)localObject2);
          bool3 = true;
          s = bool3;
          if (!paramBoolean) {
            break label1056;
          }
          w.f();
          localObject1 = b;
          localObject2 = c.d.k();
          boolean bool7 = true;
          int i8 = 0;
          localObject4 = c.m;
          localObject5 = c.d.h();
          localObject1 = ve.a((Context)localObject1, (il)localObject2, bool7, bool6, null, (un)localObject4, null, null, (com.google.android.gms.ads.internal.e)localObject5);
          d = ((vc)localObject1);
          localObject3 = d.l();
          localObject4 = null;
          str = null;
          localObject6 = c.e;
          localObject5 = c.i;
          bool8 = true;
          mf localmf = c.n;
          f localf = c.d.l().i;
          ((vd)localObject3).a(null, null, (ly)localObject6, (s)localObject5, bool8, localmf, null, localf, null, null);
          localObject1 = d.l();
          localObject2 = new com/google/android/gms/ads/internal/overlay/g$1;
          ((g.1)localObject2).<init>();
          c = ((vd.a)localObject2);
          localObject1 = c.l;
          if (localObject1 == null) {
            break label973;
          }
          localObject1 = d;
          localObject2 = c.l;
          ((vc)localObject1).loadUrl((String)localObject2);
          localObject1 = c.d;
          if (localObject1 != null)
          {
            localObject1 = c.d;
            ((vc)localObject1).b(this);
          }
          d.a(this);
          localObject1 = d.getParent();
          if (localObject1 != null)
          {
            bool5 = localObject1 instanceof ViewGroup;
            if (bool5)
            {
              localObject1 = (ViewGroup)localObject1;
              localObject2 = d.b();
              ((ViewGroup)localObject1).removeView((View)localObject2);
            }
          }
          bool3 = k;
          if (bool3)
          {
            localObject1 = d;
            ((vc)localObject1).F();
          }
          localObject1 = l;
          localObject2 = d.b();
          int i7 = -1;
          i8 = -1;
          ((g.b)localObject1).addView((View)localObject2, i7, i8);
          if (!paramBoolean)
          {
            bool3 = m;
            if (!bool3) {
              n();
            }
          }
          a(bool6);
          localObject1 = d;
          bool3 = ((vc)localObject1).m();
          if (bool3)
          {
            bool3 = true;
            a(bool6, bool3);
          }
          localObject1 = d.h();
          if (localObject1 == null) {
            break label1091;
          }
          localObject1 = c;
          if (localObject1 == null) {
            break label1098;
          }
          localObject1 = ((p)localObject1).a();
          o = ((o)localObject1);
        }
      }
      for (;;)
      {
        return;
        bool5 = false;
        localObject2 = null;
        break;
        bool6 = false;
        localkd = null;
        break label217;
        bool3 = false;
        localObject1 = null;
        break label286;
        localObject1 = c;
        i3 = j;
        localObject2 = w.g();
        i6 = ((tu)localObject2).b();
        if (i3 != i6) {
          break label291;
        }
        localObject1 = b.getResources().getConfiguration();
        i3 = orientation;
        i6 = 2;
        if (i3 == i6) {
          i3 = 1;
        }
        for (;;)
        {
          m = i3;
          break;
          i3 = 0;
          localObject1 = null;
        }
        label954:
        localObject1 = l;
        i6 = a;
        ((g.b)localObject1).setBackgroundColor(i6);
        break label392;
        label973:
        localObject1 = c.h;
        if (localObject1 != null)
        {
          localObject3 = d;
          localObject4 = c.f;
          localObject1 = c;
          str = h;
          localObject6 = "text/html";
          localObject5 = "UTF-8";
          bool8 = false;
          ((vc)localObject3).loadDataWithBaseURL((String)localObject4, str, (String)localObject6, (String)localObject5, null);
          break label639;
        }
        localObject1 = new com/google/android/gms/ads/internal/overlay/g$a;
        ((g.a)localObject1).<init>("No URL or HTML to display in ad overlay.");
        throw ((Throwable)localObject1);
        label1056:
        localObject1 = c.d;
        d = ((vc)localObject1);
        localObject1 = d;
        localObject2 = b;
        ((vc)localObject1).a((Context)localObject2);
        break label666;
        label1091:
        i3 = 0;
        localObject1 = null;
        break label842;
        label1098:
        localObject1 = "Appstreaming controller is null.";
        tp.e((String)localObject1);
      }
    }
  }
  
  public static void o() {}
  
  private void p()
  {
    Object localObject1 = b;
    boolean bool1 = ((Activity)localObject1).isFinishing();
    if (bool1)
    {
      bool1 = t;
      if (!bool1) {
        break label24;
      }
    }
    for (;;)
    {
      return;
      label24:
      bool1 = true;
      t = bool1;
      localObject1 = d;
      if (localObject1 != null)
      {
        int i1 = n;
        d.a(i1);
        synchronized (p)
        {
          boolean bool2 = r;
          if (!bool2)
          {
            localObject1 = d;
            bool2 = ((vc)localObject1).A();
            if (bool2)
            {
              localObject1 = new com/google/android/gms/ads/internal/overlay/g$2;
              ((g.2)localObject1).<init>(this);
              q = ((Runnable)localObject1);
              Handler localHandler = tt.a;
              Runnable localRunnable = q;
              localObject1 = ke.aS;
              kd localkd = w.q();
              localObject1 = localkd.a((jz)localObject1);
              localObject1 = (Long)localObject1;
              long l1 = ((Long)localObject1).longValue();
              localHandler.postDelayed(localRunnable, l1);
            }
          }
        }
      }
      m();
    }
  }
  
  public final void a()
  {
    n = 2;
    b.finish();
  }
  
  public final void a(int paramInt)
  {
    b.setRequestedOrientation(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final void a(Bundle paramBundle)
  {
    int i1 = 3;
    int i2 = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = b;
    ((Activity)localObject2).requestWindowFeature(i2);
    if (paramBundle != null)
    {
      localObject2 = "com.google.android.gms.ads.internal.overlay.hasResumed";
      bool1 = paramBundle.getBoolean((String)localObject2, false);
    }
    j = bool1;
    try
    {
      localObject1 = b;
      localObject1 = ((Activity)localObject1).getIntent();
      localObject1 = AdOverlayInfoParcel.a((Intent)localObject1);
      c = ((AdOverlayInfoParcel)localObject1);
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/ads/internal/overlay/g$a;
        localObject2 = "Could not get info for ad overlay.";
        ((g.a)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    catch (g.a locala)
    {
      tp.e(locala.getMessage());
      n = i1;
      localObject1 = b;
      ((Activity)localObject1).finish();
    }
    for (;;)
    {
      return;
      localObject1 = c;
      localObject1 = m;
      int i3 = c;
      int i8 = 7500000;
      if (i3 > i8)
      {
        i3 = 3;
        n = i3;
      }
      localObject1 = b;
      localObject1 = ((Activity)localObject1).getIntent();
      boolean bool2;
      if (localObject1 != null)
      {
        localObject1 = b;
        localObject1 = ((Activity)localObject1).getIntent();
        localObject2 = "shouldCallOnOverlayOpened";
        boolean bool6 = true;
        bool2 = ((Intent)localObject1).getBooleanExtra((String)localObject2, bool6);
        v = bool2;
      }
      localObject1 = c;
      localObject1 = p;
      if (localObject1 != null)
      {
        localObject1 = c;
        localObject1 = p;
        bool2 = a;
      }
      Object localObject3;
      for (k = bool2;; k = false)
      {
        localObject1 = ke.bU;
        localObject2 = w.q();
        localObject1 = ((kd)localObject2).a((jz)localObject1);
        localObject1 = (Boolean)localObject1;
        bool2 = ((Boolean)localObject1).booleanValue();
        if (bool2)
        {
          bool2 = k;
          if (bool2)
          {
            localObject1 = c;
            localObject1 = p;
            int i4 = f;
            i8 = -1;
            if (i4 != i8)
            {
              localObject1 = new com/google/android/gms/ads/internal/overlay/g$d;
              i8 = 0;
              localObject2 = null;
              ((g.d)localObject1).<init>(this, (byte)0);
              ((to)localObject1).c();
            }
          }
        }
        if (paramBundle == null)
        {
          localObject1 = c;
          localObject1 = c;
          if (localObject1 != null)
          {
            boolean bool3 = v;
            if (bool3)
            {
              localObject1 = c;
              localObject1 = c;
              ((j)localObject1).d();
            }
          }
          localObject1 = c;
          i5 = k;
          if (i5 != i2)
          {
            localObject1 = c;
            localObject1 = b;
            if (localObject1 != null)
            {
              localObject1 = c;
              localObject1 = b;
              ((ib)localObject1).e();
            }
          }
        }
        localObject1 = new com/google/android/gms/ads/internal/overlay/g$b;
        localObject2 = b;
        localObject3 = c;
        localObject3 = o;
        Object localObject4 = c;
        localObject4 = m;
        localObject4 = a;
        ((g.b)localObject1).<init>((Context)localObject2, (String)localObject3, (String)localObject4);
        l = ((g.b)localObject1);
        localObject1 = l;
        i8 = 1000;
        ((g.b)localObject1).setId(i8);
        localObject1 = c;
        i5 = k;
        switch (i5)
        {
        default: 
          localObject1 = new com/google/android/gms/ads/internal/overlay/g$a;
          localObject2 = "Could not determine ad overlay type.";
          ((g.a)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
          i5 = 0;
          localObject1 = null;
        }
      }
      int i5 = 0;
      localObject1 = null;
      b(false);
      continue;
      localObject1 = new com/google/android/gms/ads/internal/overlay/g$c;
      localObject2 = c;
      localObject2 = d;
      ((g.c)localObject1).<init>((vc)localObject2);
      e = ((g.c)localObject1);
      i5 = 0;
      localObject1 = null;
      b(false);
      continue;
      i5 = 1;
      b(i5);
      continue;
      boolean bool4 = j;
      if (bool4)
      {
        int i6 = 3;
        n = i6;
        localObject1 = b;
        ((Activity)localObject1).finish();
      }
      else
      {
        w.b();
        localObject1 = b;
        localObject2 = c;
        localObject2 = a;
        localObject3 = c;
        localObject3 = i;
        boolean bool5 = a.a((Context)localObject1, (e)localObject2, (s)localObject3);
        if (!bool5)
        {
          int i7 = 3;
          n = i7;
          localObject1 = b;
          ((Activity)localObject1).finish();
        }
      }
    }
  }
  
  public final void a(com.google.android.gms.a.a parama)
  {
    int i1 = 2048;
    int i2 = 1024;
    Object localObject1 = ke.dn;
    Object localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool = ((Boolean)localObject1).booleanValue();
    if (bool)
    {
      bool = i.f();
      if (bool)
      {
        localObject1 = (Configuration)b.a(parama);
        w.e();
        localObject2 = b;
        bool = tt.a((Activity)localObject2, (Configuration)localObject1);
        if (!bool) {
          break label112;
        }
        b.getWindow().addFlags(i2);
        localObject1 = b.getWindow();
        ((Window)localObject1).clearFlags(i1);
      }
    }
    for (;;)
    {
      return;
      label112:
      b.getWindow().addFlags(i1);
      localObject1 = b.getWindow();
      ((Window)localObject1).clearFlags(i2);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    int i1 = -2;
    boolean bool = false;
    r localr = null;
    Object localObject1 = ke.dp;
    Object localObject2 = w.q();
    localObject1 = (Integer)((kd)localObject2).a((jz)localObject1);
    int i2 = ((Integer)localObject1).intValue();
    r.a locala = new com/google/android/gms/ads/internal/overlay/r$a;
    locala.<init>();
    int i3 = 50;
    e = i3;
    if (paramBoolean)
    {
      i3 = i2;
      a = i3;
      if (!paramBoolean) {
        break label220;
      }
      i3 = 0;
      localObject1 = null;
      label83:
      b = i3;
      c = 0;
      d = i2;
      localObject1 = new com/google/android/gms/ads/internal/overlay/r;
      localObject2 = b;
      ((r)localObject1).<init>((Context)localObject2, locala, this);
      f = ((r)localObject1);
      localObject2 = new android/widget/RelativeLayout$LayoutParams;
      ((RelativeLayout.LayoutParams)localObject2).<init>(i1, i1);
      i3 = 10;
      ((RelativeLayout.LayoutParams)localObject2).addRule(i3);
      if (!paramBoolean) {
        break label227;
      }
    }
    label220:
    label227:
    for (i3 = 11;; i3 = 9)
    {
      ((RelativeLayout.LayoutParams)localObject2).addRule(i3);
      localObject1 = f;
      bool = c.g;
      ((r)localObject1).a(paramBoolean, bool);
      localObject1 = l;
      localr = f;
      ((g.b)localObject1).addView(localr, (ViewGroup.LayoutParams)localObject2);
      return;
      i3 = 0;
      localObject1 = null;
      break;
      i3 = i2;
      break label83;
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    r localr = f;
    if (localr != null)
    {
      localr = f;
      localr.a(paramBoolean1, paramBoolean2);
    }
  }
  
  public final void b()
  {
    Object localObject = c;
    int i1;
    if (localObject != null)
    {
      boolean bool = g;
      if (bool)
      {
        localObject = c;
        i1 = j;
        a(i1);
      }
    }
    localObject = h;
    if (localObject != null)
    {
      localObject = b;
      g.b localb = l;
      ((Activity)localObject).setContentView(localb);
      i1 = 1;
      s = i1;
      localObject = h;
      ((FrameLayout)localObject).removeAllViews();
      h = null;
    }
    localObject = i;
    if (localObject != null)
    {
      localObject = i;
      ((WebChromeClient.CustomViewCallback)localObject).onCustomViewHidden();
      i = null;
    }
    g = false;
  }
  
  public final void b(Bundle paramBundle)
  {
    boolean bool = j;
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", bool);
  }
  
  public final void c()
  {
    n = 1;
    b.finish();
  }
  
  public final void d()
  {
    n = 0;
  }
  
  public final boolean e()
  {
    boolean bool1 = true;
    vc localvc = null;
    n = 0;
    Object localObject = d;
    if (localObject == null) {}
    label71:
    for (;;)
    {
      return bool1;
      localObject = d;
      boolean bool2 = ((vc)localObject).t();
      if (bool2) {}
      for (;;)
      {
        if (bool1) {
          break label71;
        }
        localvc = d;
        localObject = "onbackblocked";
        Map localMap = Collections.emptyMap();
        localvc.a((String)localObject, localMap);
        break;
        bool1 = false;
      }
    }
  }
  
  public final void f() {}
  
  public final void g()
  {
    Object localObject = ke.do;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      localObject = d;
      if (localObject == null) {
        break label66;
      }
      localObject = d;
      bool = ((vc)localObject).r();
      if (bool) {
        break label66;
      }
      w.g();
      localObject = d;
      tu.b((vc)localObject);
    }
    for (;;)
    {
      return;
      label66:
      localObject = "The webview does not exist. Ignoring action.";
      tp.e((String)localObject);
    }
  }
  
  public final void h()
  {
    Object localObject = c;
    if (localObject != null)
    {
      localObject = c;
      int i1 = k;
      int i3 = 4;
      if (i1 == i3)
      {
        boolean bool1 = j;
        if (!bool1) {
          break label145;
        }
        int i2 = 3;
        n = i2;
        localObject = b;
        ((Activity)localObject).finish();
      }
    }
    localObject = c.c;
    if (localObject != null)
    {
      localObject = c.c;
      ((j)localObject).c();
    }
    localObject = ke.do;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool2 = ((Boolean)localObject).booleanValue();
    if (!bool2)
    {
      localObject = d;
      if (localObject == null) {
        break label155;
      }
      localObject = d;
      bool2 = ((vc)localObject).r();
      if (bool2) {
        break label155;
      }
      w.g();
      localObject = d;
      tu.b((vc)localObject);
    }
    for (;;)
    {
      return;
      label145:
      bool2 = true;
      j = bool2;
      break;
      label155:
      localObject = "The webview does not exist. Ignoring action.";
      tp.e((String)localObject);
    }
  }
  
  public final void i()
  {
    b();
    Object localObject = c.c;
    if (localObject != null)
    {
      localObject = c.c;
      ((j)localObject).b();
    }
    localObject = ke.do;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (!bool)
    {
      localObject = d;
      if (localObject != null)
      {
        localObject = b;
        bool = ((Activity)localObject).isFinishing();
        if (bool)
        {
          localObject = e;
          if (localObject != null) {}
        }
        else
        {
          w.g();
          localObject = d;
          tu.a((vc)localObject);
        }
      }
    }
    p();
  }
  
  public final void j()
  {
    Object localObject = ke.do;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      localObject = d;
      if (localObject != null)
      {
        localObject = b;
        bool = ((Activity)localObject).isFinishing();
        if (bool)
        {
          localObject = e;
          if (localObject != null) {}
        }
        else
        {
          w.g();
          localObject = d;
          tu.a((vc)localObject);
        }
      }
    }
    p();
  }
  
  public final void k()
  {
    Object localObject = d;
    if (localObject != null)
    {
      localObject = l;
      View localView = d.b();
      ((g.b)localObject).removeView(localView);
    }
    p();
  }
  
  public final void l()
  {
    s = true;
  }
  
  final void m()
  {
    boolean bool = u;
    if (bool) {
      return;
    }
    bool = true;
    u = bool;
    Object localObject1 = d;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = l;
      localObject2 = d.b();
      ((g.b)localObject1).removeView((View)localObject2);
      localObject1 = e;
      if (localObject1 == null) {
        break label182;
      }
      localObject1 = d;
      localObject2 = e.d;
      ((vc)localObject1).a((Context)localObject2);
      d.a(false);
      localObject1 = e.c;
      localObject2 = d.b();
      g.c localc = e;
      int i1 = a;
      ViewGroup.LayoutParams localLayoutParams = e.b;
      ((ViewGroup)localObject1).addView((View)localObject2, i1, localLayoutParams);
      e = null;
    }
    for (;;)
    {
      d = null;
      localObject1 = c;
      if (localObject1 == null) {
        break;
      }
      localObject1 = c.c;
      if (localObject1 == null) {
        break;
      }
      localObject1 = c.c;
      ((j)localObject1).a();
      break;
      label182:
      localObject1 = b.getApplicationContext();
      if (localObject1 != null)
      {
        localObject1 = d;
        localObject2 = b.getApplicationContext();
        ((vc)localObject1).a((Context)localObject2);
      }
    }
  }
  
  public final void n()
  {
    d.d();
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */