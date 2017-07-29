package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;

public final class n
{
  static final f a = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new a();
      return;
    }
    if (i >= 18)
    {
      a = new d();
      return;
    }
    if (i >= 17)
    {
      a = new c();
      return;
    }
    if (i >= 16)
    {
      a = new e();
      return;
    }
  }
  
  public static void a(TextView paramTextView, int paramInt)
  {
    a.a(paramTextView, paramInt);
  }
  
  public static void a(TextView paramTextView, Drawable paramDrawable)
  {
    a.a(paramTextView, paramDrawable);
  }
  
  static final class a
    extends n.d
  {
    public final void a(TextView paramTextView, int paramInt)
    {
      paramTextView.setTextAppearance(paramInt);
    }
  }
  
  static class b
    implements n.f
  {
    public void a(TextView paramTextView, int paramInt)
    {
      paramTextView.setTextAppearance(paramTextView.getContext(), paramInt);
    }
    
    public void a(TextView paramTextView, Drawable paramDrawable)
    {
      paramTextView.setCompoundDrawables(paramDrawable, null, null, null);
    }
  }
  
  static class c
    extends n.e
  {
    public void a(TextView paramTextView, Drawable paramDrawable)
    {
      int i;
      Drawable localDrawable;
      if (paramTextView.getLayoutDirection() == 1)
      {
        i = 1;
        if (i == 0) {
          break label36;
        }
        localDrawable = null;
        label17:
        if (i == 0) {
          break label42;
        }
      }
      for (;;)
      {
        paramTextView.setCompoundDrawables(localDrawable, null, paramDrawable, null);
        return;
        i = 0;
        break;
        label36:
        localDrawable = paramDrawable;
        break label17;
        label42:
        paramDrawable = null;
      }
    }
  }
  
  static class d
    extends n.c
  {
    public final void a(TextView paramTextView, Drawable paramDrawable)
    {
      paramTextView.setCompoundDrawablesRelative(paramDrawable, null, null, null);
    }
  }
  
  static class e
    extends n.b
  {}
  
  static abstract interface f
  {
    public abstract void a(TextView paramTextView, int paramInt);
    
    public abstract void a(TextView paramTextView, Drawable paramDrawable);
  }
}


/* Location:              android/support/v4/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */