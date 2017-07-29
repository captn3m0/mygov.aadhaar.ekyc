package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.d.a.a;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

final class x
  extends t
{
  final SeekBar b;
  Drawable c;
  private ColorStateList d = null;
  private PorterDuff.Mode e = null;
  private boolean f = false;
  private boolean g = false;
  
  x(SeekBar paramSeekBar)
  {
    super(paramSeekBar);
    b = paramSeekBar;
  }
  
  private void a()
  {
    Drawable localDrawable = c;
    if (localDrawable != null)
    {
      boolean bool = f;
      if (!bool)
      {
        bool = g;
        if (!bool) {}
      }
      else
      {
        localDrawable = a.f(c.mutate());
        c = localDrawable;
        bool = f;
        Object localObject;
        if (bool)
        {
          localDrawable = c;
          localObject = d;
          a.a(localDrawable, (ColorStateList)localObject);
        }
        bool = g;
        if (bool)
        {
          localDrawable = c;
          localObject = e;
          a.a(localDrawable, (PorterDuff.Mode)localObject);
        }
        localDrawable = c;
        bool = localDrawable.isStateful();
        if (bool)
        {
          localDrawable = c;
          localObject = b.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
      }
    }
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    boolean bool1 = true;
    super.a(paramAttributeSet, paramInt);
    Object localObject1 = b.getContext();
    Object localObject2 = a.j.AppCompatSeekBar;
    int i = 0;
    Object localObject3 = null;
    localObject1 = bf.a((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    int k = a.j.AppCompatSeekBar_android_thumb;
    localObject2 = ((bf)localObject1).b(k);
    if (localObject2 != null)
    {
      localObject3 = b;
      ((SeekBar)localObject3).setThumb((Drawable)localObject2);
    }
    k = a.j.AppCompatSeekBar_tickMark;
    localObject2 = ((bf)localObject1).a(k);
    localObject3 = c;
    if (localObject3 != null)
    {
      localObject3 = c;
      ((Drawable)localObject3).setCallback(null);
    }
    c = ((Drawable)localObject2);
    if (localObject2 != null)
    {
      localObject3 = b;
      ((Drawable)localObject2).setCallback((Drawable.Callback)localObject3);
      localObject3 = b;
      i = w.g((View)localObject3);
      a.b((Drawable)localObject2, i);
      boolean bool2 = ((Drawable)localObject2).isStateful();
      if (bool2)
      {
        localObject3 = b.getDrawableState();
        ((Drawable)localObject2).setState((int[])localObject3);
      }
      a();
    }
    localObject2 = b;
    ((SeekBar)localObject2).invalidate();
    k = a.j.AppCompatSeekBar_tickMarkTintMode;
    boolean bool3 = ((bf)localObject1).e(k);
    if (bool3)
    {
      m = a.j.AppCompatSeekBar_tickMarkTintMode;
      int j = -1;
      m = ((bf)localObject1).a(m, j);
      localObject3 = e;
      localObject2 = ag.a(m, (PorterDuff.Mode)localObject3);
      e = ((PorterDuff.Mode)localObject2);
      g = bool1;
    }
    int m = a.j.AppCompatSeekBar_tickMarkTint;
    boolean bool4 = ((bf)localObject1).e(m);
    if (bool4)
    {
      int n = a.j.AppCompatSeekBar_tickMarkTint;
      localObject2 = ((bf)localObject1).d(n);
      d = ((ColorStateList)localObject2);
      f = bool1;
    }
    a.recycle();
    a();
  }
}


/* Location:              android/support/v7/widget/x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */