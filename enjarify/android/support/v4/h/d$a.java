package android.support.v4.h;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public abstract interface d$a
{
  public abstract Object a(View paramView);
  
  public abstract void a(View paramView, int paramInt);
  
  public abstract void a(View paramView, Object paramObject);
  
  public abstract boolean a(View paramView, int paramInt, Bundle paramBundle);
  
  public abstract boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract void b(View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract void c(View paramView, AccessibilityEvent paramAccessibilityEvent);
  
  public abstract void d(View paramView, AccessibilityEvent paramAccessibilityEvent);
}


/* Location:              android/support/v4/h/d$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */