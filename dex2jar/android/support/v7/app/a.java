package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.j;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public abstract class a
{
  public abstract int a();
  
  public b a(b.a parama)
  {
    return null;
  }
  
  public void a(int paramInt) {}
  
  public void a(Configuration paramConfiguration) {}
  
  public void a(Drawable paramDrawable) {}
  
  public void a(CharSequence paramCharSequence) {}
  
  public void a(boolean paramBoolean) {}
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public void b(boolean paramBoolean) {}
  
  public abstract boolean b();
  
  public Context c()
  {
    return null;
  }
  
  public void c(boolean paramBoolean) {}
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return false;
  }
  
  boolean f()
  {
    return false;
  }
  
  void g() {}
  
  public static class a
    extends ViewGroup.MarginLayoutParams
  {
    public int a = 0;
    
    public a()
    {
      super(-2);
      a = 8388627;
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.ActionBarLayout);
      a = paramContext.getInt(a.j.ActionBarLayout_android_layout_gravity, 0);
      paramContext.recycle();
    }
    
    public a(a parama)
    {
      super();
      a = a;
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
  
  @Deprecated
  public static abstract class b
  {
    public abstract Drawable a();
    
    public abstract CharSequence b();
    
    public abstract View c();
    
    public abstract CharSequence d();
  }
}


/* Location:              android/support/v7/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */