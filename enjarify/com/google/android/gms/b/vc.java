package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.u;
import java.util.Map;
import org.json.JSONObject;

public abstract interface vc
  extends u, hb.b, nk
{
  public abstract boolean A();
  
  public abstract void B();
  
  public abstract void C();
  
  public abstract View.OnClickListener D();
  
  public abstract kz E();
  
  public abstract void F();
  
  public abstract WebView a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(Context paramContext);
  
  public abstract void a(Context paramContext, il paramil, km paramkm);
  
  public abstract void a(g paramg);
  
  public abstract void a(il paramil);
  
  public abstract void a(kz paramkz);
  
  public abstract void a(vi paramvi);
  
  public abstract void a(String paramString);
  
  public abstract void a(String paramString1, String paramString2);
  
  public abstract void a(String paramString, Map paramMap);
  
  public abstract void a(String paramString, JSONObject paramJSONObject);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract View b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(g paramg);
  
  public abstract void b(String paramString);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract void c();
  
  public abstract void c(boolean paramBoolean);
  
  public abstract void d();
  
  public abstract void d(boolean paramBoolean);
  
  public abstract void destroy();
  
  public abstract void e();
  
  public abstract Activity f();
  
  public abstract Context g();
  
  public abstract Context getContext();
  
  public abstract ViewGroup.LayoutParams getLayoutParams();
  
  public abstract void getLocationOnScreen(int[] paramArrayOfInt);
  
  public abstract int getMeasuredHeight();
  
  public abstract int getMeasuredWidth();
  
  public abstract ViewParent getParent();
  
  public abstract e h();
  
  public abstract g i();
  
  public abstract g j();
  
  public abstract il k();
  
  public abstract vd l();
  
  public abstract void loadData(String paramString1, String paramString2, String paramString3);
  
  public abstract void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);
  
  public abstract void loadUrl(String paramString);
  
  public abstract boolean m();
  
  public abstract void measure(int paramInt1, int paramInt2);
  
  public abstract dw n();
  
  public abstract un o();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract boolean p();
  
  public abstract int q();
  
  public abstract boolean r();
  
  public abstract void s();
  
  public abstract void setBackgroundColor(int paramInt);
  
  public abstract void setOnClickListener(View.OnClickListener paramOnClickListener);
  
  public abstract void setOnTouchListener(View.OnTouchListener paramOnTouchListener);
  
  public abstract void setWebChromeClient(WebChromeClient paramWebChromeClient);
  
  public abstract void setWebViewClient(WebViewClient paramWebViewClient);
  
  public abstract void stopLoading();
  
  public abstract boolean t();
  
  public abstract boolean u();
  
  public abstract String v();
  
  public abstract vb w();
  
  public abstract kk x();
  
  public abstract kl y();
  
  public abstract vi z();
}


/* Location:              com/google/android/gms/b/vc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */