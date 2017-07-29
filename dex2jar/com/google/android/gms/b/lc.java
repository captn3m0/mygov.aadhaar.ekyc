package com.google.android.gms.b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract interface lc
{
  public abstract View a(View.OnClickListener paramOnClickListener, boolean paramBoolean);
  
  public abstract void a(MotionEvent paramMotionEvent);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, kz paramkz);
  
  public abstract void a(View paramView1, String paramString, JSONObject paramJSONObject, Map<String, WeakReference<View>> paramMap, View paramView2);
  
  public abstract void a(View paramView, Map<String, WeakReference<View>> paramMap);
  
  public abstract void a(View paramView1, Map<String, WeakReference<View>> paramMap, JSONObject paramJSONObject, View paramView2);
  
  public abstract boolean a();
  
  public abstract void b(View paramView, Map<String, WeakReference<View>> paramMap);
  
  public abstract void c(View paramView, Map<String, WeakReference<View>> paramMap);
  
  public abstract View e();
  
  public abstract Context f();
  
  public static abstract interface a
  {
    public abstract void a(lc paramlc);
    
    public abstract String k();
    
    public abstract String l();
    
    public abstract kt m();
    
    public abstract View o();
  }
  
  public static abstract interface b
    extends lc.a
  {
    public abstract List b();
  }
}


/* Location:              com/google/android/gms/b/lc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */