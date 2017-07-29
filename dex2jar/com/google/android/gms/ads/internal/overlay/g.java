package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.pb.a;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tu;
import com.google.android.gms.b.tw;
import com.google.android.gms.b.uc;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.vd.a;
import com.google.android.gms.b.ve;
import com.google.android.gms.common.util.i;
import java.util.Collections;
import java.util.Map;

@qi
public final class g
  extends pb.a
  implements x
{
  static final int a = Color.argb(0, 0, 0, 0);
  public final Activity b;
  AdOverlayInfoParcel c;
  vc d;
  c e;
  public r f;
  public boolean g = false;
  public FrameLayout h;
  public WebChromeClient.CustomViewCallback i;
  boolean j = false;
  boolean k = false;
  public b l;
  public boolean m = false;
  int n = 0;
  o o;
  public final Object p = new Object();
  public Runnable q;
  public boolean r;
  public boolean s;
  private boolean t = false;
  private boolean u = false;
  private boolean v = true;
  
  public g(Activity paramActivity)
  {
    b = paramActivity;
    o = new v();
  }
  
  private void b(boolean paramBoolean)
  {
    if (!s) {
      b.requestWindowFeature(1);
    }
    Object localObject1 = b.getWindow();
    if (localObject1 == null) {
      throw new a("Invalid activity, no window available.");
    }
    Object localObject2;
    if (i.f())
    {
      localObject2 = ke.dn;
      if (((Boolean)w.q().a((jz)localObject2)).booleanValue()) {
        w.e();
      }
    }
    for (boolean bool1 = tt.a(b, b.getResources().getConfiguration());; bool1 = true)
    {
      int i1;
      label166:
      boolean bool2;
      if ((c.p != null) && (c.p.b))
      {
        i1 = 1;
        if (((!k) || (i1 != 0)) && (bool1)) {
          ((Window)localObject1).setFlags(1024, 1024);
        }
        localObject2 = c.d.l();
        if (localObject2 == null) {
          break label652;
        }
        bool1 = ((vd)localObject2).a();
        m = false;
        if (bool1)
        {
          if (c.j != w.g().a()) {
            break label663;
          }
          if (b.getResources().getConfiguration().orientation != 1) {
            break label657;
          }
          bool2 = true;
          label211:
          m = bool2;
        }
        label217:
        bool2 = m;
        tp.b(46 + "Delay onShow to next orientation change: " + bool2);
        a(c.j);
        if (w.g().a((Window)localObject1)) {
          tp.b("Hardware acceleration on the AdActivity window enabled.");
        }
        if (k) {
          break label714;
        }
        l.setBackgroundColor(-16777216);
        label291:
        b.setContentView(l);
        s = true;
        if (!paramBoolean) {
          break label781;
        }
        w.f();
        d = ve.a(b, c.d.k(), true, bool1, null, c.m, null, null, c.d.h());
        d.l().a(null, null, c.e, c.i, true, c.n, null, c.d.l().i, null, null);
        d.l().c = new vd.a()
        {
          public final void a(vc paramAnonymousvc, boolean paramAnonymousBoolean)
          {
            paramAnonymousvc.d();
          }
        };
        if (c.l == null) {
          break label727;
        }
        d.loadUrl(c.l);
        label461:
        if (c.d != null) {
          c.d.b(this);
        }
        label484:
        d.a(this);
        localObject1 = d.getParent();
        if ((localObject1 != null) && ((localObject1 instanceof ViewGroup))) {
          ((ViewGroup)localObject1).removeView(d.b());
        }
        if (k) {
          d.F();
        }
        l.addView(d.b(), -1, -1);
        if ((!paramBoolean) && (!m)) {
          n();
        }
        a(bool1);
        if (d.m()) {
          a(bool1, true);
        }
        localObject1 = d.h();
        if (localObject1 == null) {
          break label808;
        }
      }
      label652:
      label657:
      label663:
      label714:
      label727:
      label781:
      label808:
      for (localObject1 = c;; localObject1 = null)
      {
        if (localObject1 == null) {
          break label814;
        }
        o = ((p)localObject1).a();
        return;
        i1 = 0;
        break;
        bool1 = false;
        break label166;
        bool2 = false;
        break label211;
        if (c.j != w.g().b()) {
          break label217;
        }
        if (b.getResources().getConfiguration().orientation == 2) {}
        for (bool2 = true;; bool2 = false)
        {
          m = bool2;
          break;
        }
        l.setBackgroundColor(a);
        break label291;
        if (c.h != null)
        {
          d.loadDataWithBaseURL(c.f, c.h, "text/html", "UTF-8", null);
          break label461;
        }
        throw new a("No URL or HTML to display in ad overlay.");
        d = c.d;
        d.a(b);
        break label484;
      }
      label814:
      tp.e("Appstreaming controller is null.");
      return;
    }
  }
  
  public static void o() {}
  
  private void p()
  {
    if ((!b.isFinishing()) || (t)) {
      return;
    }
    t = true;
    if (d != null)
    {
      int i1 = n;
      d.a(i1);
      synchronized (p)
      {
        if ((!r) && (d.A()))
        {
          q = new Runnable()
          {
            public final void run()
            {
              m();
            }
          };
          Handler localHandler = tt.a;
          Runnable localRunnable = q;
          jz localjz = ke.aS;
          localHandler.postDelayed(localRunnable, ((Long)w.q().a(localjz)).longValue());
          return;
        }
      }
    }
    m();
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
    boolean bool = false;
    b.requestWindowFeature(1);
    if (paramBundle != null) {
      bool = paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
    }
    j = bool;
    try
    {
      c = AdOverlayInfoParcel.a(b.getIntent());
      if (c != null) {
        break label82;
      }
      throw new a("Could not get info for ad overlay.");
    }
    catch (a paramBundle)
    {
      tp.e(paramBundle.getMessage());
      n = 3;
      b.finish();
    }
    return;
    label82:
    if (c.m.c > 7500000) {
      n = 3;
    }
    if (b.getIntent() != null) {
      v = b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
    }
    if (c.p != null)
    {
      k = c.p.a;
      label155:
      jz localjz = ke.bU;
      if ((((Boolean)w.q().a(localjz)).booleanValue()) && (k) && (c.p.f != -1)) {
        new d((byte)0).c();
      }
      if (paramBundle == null)
      {
        if ((c.c != null) && (v)) {
          c.c.d();
        }
        if ((c.k != 1) && (c.b != null)) {
          c.b.e();
        }
      }
      l = new b(b, c.o, c.m.a);
      l.setId(1000);
      switch (c.k)
      {
      }
    }
    for (;;)
    {
      throw new a("Could not determine ad overlay type.");
      k = false;
      break label155;
      b(false);
      return;
      e = new c(c.d);
      b(false);
      return;
      b(true);
      return;
      if (j)
      {
        n = 3;
        b.finish();
        return;
      }
      w.b();
      if (a.a(b, c.a, c.i)) {
        break;
      }
      n = 3;
      b.finish();
      return;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama)
  {
    jz localjz = ke.dn;
    if ((((Boolean)w.q().a(localjz)).booleanValue()) && (i.f()))
    {
      parama = (Configuration)b.a(parama);
      w.e();
      if (tt.a(b, parama))
      {
        b.getWindow().addFlags(1024);
        b.getWindow().clearFlags(2048);
      }
    }
    else
    {
      return;
    }
    b.getWindow().addFlags(2048);
    b.getWindow().clearFlags(1024);
  }
  
  public final void a(boolean paramBoolean)
  {
    Object localObject = ke.dp;
    int i1 = ((Integer)w.q().a((jz)localObject)).intValue();
    localObject = new r.a();
    e = 50;
    int i2;
    if (paramBoolean)
    {
      i2 = i1;
      a = i2;
      if (!paramBoolean) {
        break label157;
      }
      i2 = 0;
      label54:
      b = i2;
      c = 0;
      d = i1;
      f = new r(b, (r.a)localObject, this);
      localObject = new RelativeLayout.LayoutParams(-2, -2);
      ((RelativeLayout.LayoutParams)localObject).addRule(10);
      if (!paramBoolean) {
        break label162;
      }
    }
    label157:
    label162:
    for (i1 = 11;; i1 = 9)
    {
      ((RelativeLayout.LayoutParams)localObject).addRule(i1);
      f.a(paramBoolean, c.g);
      l.addView(f, (ViewGroup.LayoutParams)localObject);
      return;
      i2 = 0;
      break;
      i2 = i1;
      break label54;
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (f != null) {
      f.a(paramBoolean1, paramBoolean2);
    }
  }
  
  public final void b()
  {
    if ((c != null) && (g)) {
      a(c.j);
    }
    if (h != null)
    {
      b.setContentView(l);
      s = true;
      h.removeAllViews();
      h = null;
    }
    if (i != null)
    {
      i.onCustomViewHidden();
      i = null;
    }
    g = false;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", j);
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
    boolean bool2 = true;
    n = 0;
    if (d == null) {
      return bool2;
    }
    if (d.t()) {}
    for (;;)
    {
      bool2 = bool1;
      if (bool1) {
        break;
      }
      d.a("onbackblocked", Collections.emptyMap());
      return bool1;
      bool1 = false;
    }
  }
  
  public final void f() {}
  
  public final void g()
  {
    jz localjz = ke.do;
    if (((Boolean)w.q().a(localjz)).booleanValue())
    {
      if ((d != null) && (!d.r()))
      {
        w.g();
        tu.b(d);
      }
    }
    else {
      return;
    }
    tp.e("The webview does not exist. Ignoring action.");
  }
  
  public final void h()
  {
    if ((c != null) && (c.k == 4))
    {
      if (!j) {
        break label111;
      }
      n = 3;
      b.finish();
    }
    for (;;)
    {
      if (c.c != null) {
        c.c.c();
      }
      jz localjz = ke.do;
      if (!((Boolean)w.q().a(localjz)).booleanValue())
      {
        if ((d == null) || (d.r())) {
          break;
        }
        w.g();
        tu.b(d);
      }
      return;
      label111:
      j = true;
    }
    tp.e("The webview does not exist. Ignoring action.");
  }
  
  public final void i()
  {
    b();
    if (c.c != null) {
      c.c.b();
    }
    jz localjz = ke.do;
    if ((!((Boolean)w.q().a(localjz)).booleanValue()) && (d != null) && ((!b.isFinishing()) || (e == null)))
    {
      w.g();
      tu.a(d);
    }
    p();
  }
  
  public final void j()
  {
    jz localjz = ke.do;
    if ((((Boolean)w.q().a(localjz)).booleanValue()) && (d != null) && ((!b.isFinishing()) || (e == null)))
    {
      w.g();
      tu.a(d);
    }
    p();
  }
  
  public final void k()
  {
    if (d != null) {
      l.removeView(d.b());
    }
    p();
  }
  
  public final void l()
  {
    s = true;
  }
  
  final void m()
  {
    if (u) {
      return;
    }
    u = true;
    if (d != null)
    {
      l.removeView(d.b());
      if (e == null) {
        break label142;
      }
      d.a(e.d);
      d.a(false);
      e.c.addView(d.b(), e.a, e.b);
      e = null;
    }
    for (;;)
    {
      d = null;
      if ((c == null) || (c.c == null)) {
        break;
      }
      c.c.a();
      return;
      label142:
      if (b.getApplicationContext() != null) {
        d.a(b.getApplicationContext());
      }
    }
  }
  
  public final void n()
  {
    d.d();
  }
  
  @qi
  private static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
  
  @qi
  public static final class b
    extends RelativeLayout
  {
    tw a;
    public boolean b;
    
    public b(Context paramContext, String paramString1, String paramString2)
    {
      super();
      a = new tw(paramContext, paramString1);
      a.d = paramString2;
    }
    
    public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if (!b) {
        a.a(paramMotionEvent);
      }
      return false;
    }
  }
  
  @qi
  public static final class c
  {
    public final int a;
    public final ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;
    
    public c(vc paramvc)
    {
      b = paramvc.getLayoutParams();
      ViewParent localViewParent = paramvc.getParent();
      d = paramvc.g();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
      {
        c = ((ViewGroup)localViewParent);
        a = c.indexOfChild(paramvc.b());
        c.removeView(paramvc.b());
        paramvc.a(true);
        return;
      }
      throw new g.a("Could not get the parent of the WebView for an overlay.");
    }
  }
  
  @qi
  private final class d
    extends to
  {
    private d() {}
    
    public final void a()
    {
      final Object localObject = w.z();
      int i = c.p.f;
      localObject = (Bitmap)a.get(Integer.valueOf(i));
      if (localObject != null)
      {
        localObject = w.g().a(g.a(g.this), (Bitmap)localObject, c.p.d, c.p.e);
        tt.a.post(new Runnable()
        {
          public final void run()
          {
            g.a(g.this).getWindow().setBackgroundDrawable(localObject);
          }
        });
      }
    }
    
    public final void c_() {}
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */