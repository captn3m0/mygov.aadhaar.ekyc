package com.google.android.gms.b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;
import org.json.JSONObject;

public abstract interface lc
{
  public abstract View a(View.OnClickListener paramOnClickListener, boolean paramBoolean);
  
  public abstract void a(MotionEvent paramMotionEvent);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, kz paramkz);
  
  public abstract void a(View paramView1, String paramString, JSONObject paramJSONObject, Map paramMap, View paramView2);
  
  public abstract void a(View paramView, Map paramMap);
  
  public abstract void a(View paramView1, Map paramMap, JSONObject paramJSONObject, View paramView2);
  
  public abstract boolean a();
  
  public abstract void b(View paramView, Map paramMap);
  
  public abstract void c(View paramView, Map paramMap);
  
  public abstract View e();
  
  public abstract Context f();
}


/* Location:              com/google/android/gms/b/lc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */