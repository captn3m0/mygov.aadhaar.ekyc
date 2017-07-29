package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.a;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
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
    if ((c != null) && ((f) || (g)))
    {
      c = a.f(c.mutate());
      if (f) {
        a.a(c, d);
      }
      if (g) {
        a.a(c, e);
      }
      if (c.isStateful()) {
        c.setState(b.getDrawableState());
      }
    }
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    paramAttributeSet = bf.a(b.getContext(), paramAttributeSet, a.j.AppCompatSeekBar, paramInt, 0);
    Drawable localDrawable = paramAttributeSet.b(a.j.AppCompatSeekBar_android_thumb);
    if (localDrawable != null) {
      b.setThumb(localDrawable);
    }
    localDrawable = paramAttributeSet.a(a.j.AppCompatSeekBar_tickMark);
    if (c != null) {
      c.setCallback(null);
    }
    c = localDrawable;
    if (localDrawable != null)
    {
      localDrawable.setCallback(b);
      a.b(localDrawable, w.g(b));
      if (localDrawable.isStateful()) {
        localDrawable.setState(b.getDrawableState());
      }
      a();
    }
    b.invalidate();
    if (paramAttributeSet.e(a.j.AppCompatSeekBar_tickMarkTintMode))
    {
      e = ag.a(paramAttributeSet.a(a.j.AppCompatSeekBar_tickMarkTintMode, -1), e);
      g = true;
    }
    if (paramAttributeSet.e(a.j.AppCompatSeekBar_tickMarkTint))
    {
      d = paramAttributeSet.d(a.j.AppCompatSeekBar_tickMarkTint);
      f = true;
    }
    a.recycle();
    a();
  }
}


/* Location:              android/support/v7/widget/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */