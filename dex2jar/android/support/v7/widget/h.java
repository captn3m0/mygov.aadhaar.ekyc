package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.View;

final class h
{
  private final View a;
  private final m b;
  private int c = -1;
  private bd d;
  private bd e;
  private bd f;
  
  h(View paramView)
  {
    a = paramView;
    b = m.a();
  }
  
  private void b(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (d == null) {
        d = new bd();
      }
      d.a = paramColorStateList;
      d.d = true;
    }
    for (;;)
    {
      d();
      return;
      d = null;
    }
  }
  
  final void a()
  {
    c = -1;
    b(null);
    d();
  }
  
  final void a(int paramInt)
  {
    c = paramInt;
    if (b != null) {}
    for (ColorStateList localColorStateList = b.b(a.getContext(), paramInt);; localColorStateList = null)
    {
      b(localColorStateList);
      d();
      return;
    }
  }
  
  final void a(ColorStateList paramColorStateList)
  {
    if (e == null) {
      e = new bd();
    }
    e.a = paramColorStateList;
    e.d = true;
    d();
  }
  
  final void a(PorterDuff.Mode paramMode)
  {
    if (e == null) {
      e = new bd();
    }
    e.b = paramMode;
    e.c = true;
    d();
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = bf.a(a.getContext(), paramAttributeSet, a.j.ViewBackgroundHelper, paramInt, 0);
    try
    {
      if (paramAttributeSet.e(a.j.ViewBackgroundHelper_android_background))
      {
        c = paramAttributeSet.g(a.j.ViewBackgroundHelper_android_background, -1);
        ColorStateList localColorStateList = b.b(a.getContext(), c);
        if (localColorStateList != null) {
          b(localColorStateList);
        }
      }
      if (paramAttributeSet.e(a.j.ViewBackgroundHelper_backgroundTint)) {
        w.a(a, paramAttributeSet.d(a.j.ViewBackgroundHelper_backgroundTint));
      }
      if (paramAttributeSet.e(a.j.ViewBackgroundHelper_backgroundTintMode)) {
        w.a(a, ag.a(paramAttributeSet.a(a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
      }
      return;
    }
    finally
    {
      a.recycle();
    }
  }
  
  final ColorStateList b()
  {
    if (e != null) {
      return e.a;
    }
    return null;
  }
  
  final PorterDuff.Mode c()
  {
    if (e != null) {
      return e.b;
    }
    return null;
  }
  
  final void d()
  {
    int j = 0;
    Drawable localDrawable = a.getBackground();
    int i;
    if (localDrawable != null)
    {
      i = Build.VERSION.SDK_INT;
      if (i < 21) {
        break label188;
      }
      if (i != 21) {
        break label176;
      }
      i = 1;
      if (i == 0) {
        break label193;
      }
      if (f == null) {
        f = new bd();
      }
      bd localbd = f;
      a = null;
      d = false;
      b = null;
      c = false;
      Object localObject = w.C(a);
      if (localObject != null)
      {
        d = true;
        a = ((ColorStateList)localObject);
      }
      localObject = w.D(a);
      if (localObject != null)
      {
        c = true;
        b = ((PorterDuff.Mode)localObject);
      }
      if (!d)
      {
        i = j;
        if (!c) {}
      }
      else
      {
        m.a(localDrawable, localbd, a.getDrawableState());
        i = 1;
      }
      if (i == 0) {
        break label193;
      }
    }
    label176:
    label188:
    label193:
    do
    {
      return;
      if (d != null)
      {
        i = 1;
        break;
      }
      i = 0;
      break;
      if (e != null)
      {
        m.a(localDrawable, e, a.getDrawableState());
        return;
      }
    } while (d == null);
    m.a(localDrawable, d, a.getDrawableState());
  }
}


/* Location:              android/support/v7/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */