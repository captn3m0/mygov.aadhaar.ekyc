package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

public final class b
{
  private static final c a = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new a();
      return;
    }
    if (i >= 21)
    {
      a = new d();
      return;
    }
  }
  
  public static Drawable a(CompoundButton paramCompoundButton)
  {
    return a.a(paramCompoundButton);
  }
  
  public static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    a.a(paramCompoundButton, paramColorStateList);
  }
  
  public static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    a.a(paramCompoundButton, paramMode);
  }
  
  static final class a
    extends b.d
  {
    public final Drawable a(CompoundButton paramCompoundButton)
    {
      return paramCompoundButton.getButtonDrawable();
    }
  }
  
  static class b
    implements b.c
  {
    public Drawable a(CompoundButton paramCompoundButton)
    {
      return c.a(paramCompoundButton);
    }
    
    public void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      if ((paramCompoundButton instanceof o)) {
        ((o)paramCompoundButton).setSupportButtonTintList(paramColorStateList);
      }
    }
    
    public void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      if ((paramCompoundButton instanceof o)) {
        ((o)paramCompoundButton).setSupportButtonTintMode(paramMode);
      }
    }
  }
  
  static abstract interface c
  {
    public abstract Drawable a(CompoundButton paramCompoundButton);
    
    public abstract void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList);
    
    public abstract void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode);
  }
  
  static class d
    extends b.b
  {
    public final void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      paramCompoundButton.setButtonTintList(paramColorStateList);
    }
    
    public final void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      paramCompoundButton.setButtonTintMode(paramMode);
    }
  }
}


/* Location:              android/support/v4/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */