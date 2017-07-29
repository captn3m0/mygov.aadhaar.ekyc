package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.d.a.a;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class l
{
  ColorStateList a = null;
  PorterDuff.Mode b = null;
  private final CompoundButton c;
  private boolean d = false;
  private boolean e = false;
  private boolean f;
  
  l(CompoundButton paramCompoundButton)
  {
    c = paramCompoundButton;
  }
  
  private void b()
  {
    Drawable localDrawable = android.support.v4.widget.b.a(c);
    if ((localDrawable != null) && ((d) || (e)))
    {
      localDrawable = a.f(localDrawable).mutate();
      if (d) {
        a.a(localDrawable, a);
      }
      if (e) {
        a.a(localDrawable, b);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(c.getDrawableState());
      }
      c.setButtonDrawable(localDrawable);
    }
  }
  
  final int a(int paramInt)
  {
    int i = paramInt;
    if (Build.VERSION.SDK_INT < 17)
    {
      Drawable localDrawable = android.support.v4.widget.b.a(c);
      i = paramInt;
      if (localDrawable != null) {
        i = paramInt + localDrawable.getIntrinsicWidth();
      }
    }
    return i;
  }
  
  final void a()
  {
    if (f)
    {
      f = false;
      return;
    }
    f = true;
    b();
  }
  
  final void a(ColorStateList paramColorStateList)
  {
    a = paramColorStateList;
    d = true;
    b();
  }
  
  final void a(PorterDuff.Mode paramMode)
  {
    b = paramMode;
    e = true;
    b();
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = c.getContext().obtainStyledAttributes(paramAttributeSet, a.j.CompoundButton, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(a.j.CompoundButton_android_button))
      {
        paramInt = paramAttributeSet.getResourceId(a.j.CompoundButton_android_button, 0);
        if (paramInt != 0) {
          c.setButtonDrawable(android.support.v7.b.a.b.b(c.getContext(), paramInt));
        }
      }
      if (paramAttributeSet.hasValue(a.j.CompoundButton_buttonTint)) {
        android.support.v4.widget.b.a(c, paramAttributeSet.getColorStateList(a.j.CompoundButton_buttonTint));
      }
      if (paramAttributeSet.hasValue(a.j.CompoundButton_buttonTintMode)) {
        android.support.v4.widget.b.a(c, ag.a(paramAttributeSet.getInt(a.j.CompoundButton_buttonTintMode, -1), null));
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
}


/* Location:              android/support/v7/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */