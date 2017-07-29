package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.common.internal.c;
import java.util.Map;
import org.json.JSONObject;

@qi
final class vf
  extends FrameLayout
  implements vc
{
  private static final int a = Color.argb(0, 0, 0, 0);
  private final vc b;
  private final vb c;
  
  public vf(vc paramvc)
  {
    super(paramvc.getContext());
    b = paramvc;
    c = new vb(paramvc.g(), this, this);
    paramvc = b.l();
    if (paramvc != null) {
      paramvc.a(this);
    }
    addView(b.b());
  }
  
  public final boolean A()
  {
    return b.A();
  }
  
  public final void B()
  {
    b.B();
  }
  
  public final void C()
  {
    b.C();
  }
  
  public final View.OnClickListener D()
  {
    return b.D();
  }
  
  public final kz E()
  {
    return b.E();
  }
  
  public final void F()
  {
    setBackgroundColor(a);
    b.setBackgroundColor(a);
  }
  
  public final void H()
  {
    b.H();
  }
  
  public final void I()
  {
    b.I();
  }
  
  public final WebView a()
  {
    return b.a();
  }
  
  public final void a(int paramInt)
  {
    b.a(paramInt);
  }
  
  public final void a(Context paramContext)
  {
    b.a(paramContext);
  }
  
  public final void a(Context paramContext, il paramil, km paramkm)
  {
    c.b();
    b.a(paramContext, paramil, paramkm);
  }
  
  public final void a(g paramg)
  {
    b.a(paramg);
  }
  
  public final void a(hb.a parama)
  {
    b.a(parama);
  }
  
  public final void a(il paramil)
  {
    b.a(paramil);
  }
  
  public final void a(kz paramkz)
  {
    b.a(paramkz);
  }
  
  public final void a(vi paramvi)
  {
    b.a(paramvi);
  }
  
  public final void a(String paramString)
  {
    b.a(paramString);
  }
  
  public final void a(String paramString, md parammd)
  {
    b.a(paramString, parammd);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    b.a(paramString1, paramString2);
  }
  
  public final void a(String paramString, Map<String, ?> paramMap)
  {
    b.a(paramString, paramMap);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    b.a(paramString, paramJSONObject);
  }
  
  public final void a(boolean paramBoolean)
  {
    b.a(paramBoolean);
  }
  
  public final View b()
  {
    return this;
  }
  
  public final void b(int paramInt)
  {
    b.b(paramInt);
  }
  
  public final void b(g paramg)
  {
    b.b(paramg);
  }
  
  public final void b(String paramString)
  {
    b.b(paramString);
  }
  
  public final void b(String paramString, md parammd)
  {
    b.b(paramString, parammd);
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    b.b(paramString, paramJSONObject);
  }
  
  public final void b(boolean paramBoolean)
  {
    b.b(paramBoolean);
  }
  
  public final void c()
  {
    b.c();
  }
  
  public final void c(boolean paramBoolean)
  {
    b.c(paramBoolean);
  }
  
  public final void d()
  {
    b.d();
  }
  
  public final void d(boolean paramBoolean)
  {
    b.d(paramBoolean);
  }
  
  public final void destroy()
  {
    b.destroy();
  }
  
  public final void e()
  {
    b.e();
  }
  
  public final Activity f()
  {
    return b.f();
  }
  
  public final Context g()
  {
    return b.g();
  }
  
  public final e h()
  {
    return b.h();
  }
  
  public final g i()
  {
    return b.i();
  }
  
  public final g j()
  {
    return b.j();
  }
  
  public final il k()
  {
    return b.k();
  }
  
  public final vd l()
  {
    return b.l();
  }
  
  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    b.loadData(paramString1, paramString2, paramString3);
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    b.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final void loadUrl(String paramString)
  {
    b.loadUrl(paramString);
  }
  
  public final boolean m()
  {
    return b.m();
  }
  
  public final dw n()
  {
    return b.n();
  }
  
  public final un o()
  {
    return b.o();
  }
  
  public final void onPause()
  {
    vb localvb = c;
    c.b("onPause must be called from the UI thread.");
    if (d != null) {
      d.i();
    }
    b.onPause();
  }
  
  public final void onResume()
  {
    b.onResume();
  }
  
  public final boolean p()
  {
    return b.p();
  }
  
  public final int q()
  {
    return b.q();
  }
  
  public final boolean r()
  {
    return b.r();
  }
  
  public final void s()
  {
    c.b();
    b.s();
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    b.setOnClickListener(paramOnClickListener);
  }
  
  public final void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    b.setOnTouchListener(paramOnTouchListener);
  }
  
  public final void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    b.setWebChromeClient(paramWebChromeClient);
  }
  
  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    b.setWebViewClient(paramWebViewClient);
  }
  
  public final void stopLoading()
  {
    b.stopLoading();
  }
  
  public final boolean t()
  {
    return b.t();
  }
  
  public final boolean u()
  {
    return b.u();
  }
  
  public final String v()
  {
    return b.v();
  }
  
  public final vb w()
  {
    return c;
  }
  
  public final kk x()
  {
    return b.x();
  }
  
  public final kl y()
  {
    return b.y();
  }
  
  public final vi z()
  {
    return b.z();
  }
}


/* Location:              com/google/android/gms/b/vf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */