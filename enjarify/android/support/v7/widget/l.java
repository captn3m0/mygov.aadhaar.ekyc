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
    if (localDrawable != null)
    {
      boolean bool = d;
      if (!bool)
      {
        bool = e;
        if (!bool) {}
      }
      else
      {
        localDrawable = a.f(localDrawable).mutate();
        bool = d;
        if (bool)
        {
          localObject = a;
          a.a(localDrawable, (ColorStateList)localObject);
        }
        bool = e;
        if (bool)
        {
          localObject = b;
          a.a(localDrawable, (PorterDuff.Mode)localObject);
        }
        bool = localDrawable.isStateful();
        if (bool)
        {
          localObject = c.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        Object localObject = c;
        ((CompoundButton)localObject).setButtonDrawable(localDrawable);
      }
    }
  }
  
  final int a(int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i < j)
    {
      Drawable localDrawable = android.support.v4.widget.b.a(c);
      if (localDrawable != null)
      {
        i = localDrawable.getIntrinsicWidth();
        paramInt += i;
      }
    }
    return paramInt;
  }
  
  final void a()
  {
    boolean bool = f;
    if (bool)
    {
      bool = false;
      f = false;
    }
    for (;;)
    {
      return;
      bool = true;
      f = bool;
      b();
    }
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
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = c.getContext();
    Object localObject4 = a.j.CompoundButton;
    localObject4 = ((Context)localObject2).obtainStyledAttributes(paramAttributeSet, (int[])localObject4, paramInt, 0);
    try
    {
      int j = a.j.CompoundButton_android_button;
      boolean bool1 = ((TypedArray)localObject4).hasValue(j);
      Object localObject5;
      if (bool1)
      {
        k = a.j.CompoundButton_android_button;
        i = 0;
        localObject1 = null;
        k = ((TypedArray)localObject4).getResourceId(k, 0);
        if (k != 0)
        {
          localObject1 = c;
          localObject5 = c;
          localObject5 = ((CompoundButton)localObject5).getContext();
          localObject2 = android.support.v7.b.a.b.b((Context)localObject5, k);
          ((CompoundButton)localObject1).setButtonDrawable((Drawable)localObject2);
        }
      }
      int k = a.j.CompoundButton_buttonTint;
      boolean bool2 = ((TypedArray)localObject4).hasValue(k);
      if (bool2)
      {
        localObject2 = c;
        i = a.j.CompoundButton_buttonTint;
        localObject1 = ((TypedArray)localObject4).getColorStateList(i);
        android.support.v4.widget.b.a((CompoundButton)localObject2, (ColorStateList)localObject1);
      }
      int m = a.j.CompoundButton_buttonTintMode;
      boolean bool3 = ((TypedArray)localObject4).hasValue(m);
      if (bool3)
      {
        localObject2 = c;
        i = a.j.CompoundButton_buttonTintMode;
        int n = -1;
        i = ((TypedArray)localObject4).getInt(i, n);
        n = 0;
        localObject5 = null;
        localObject1 = ag.a(i, null);
        android.support.v4.widget.b.a((CompoundButton)localObject2, (PorterDuff.Mode)localObject1);
      }
      return;
    }
    finally
    {
      ((TypedArray)localObject4).recycle();
    }
  }
}


/* Location:              android/support/v7/widget/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */