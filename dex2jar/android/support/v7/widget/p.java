package android.support.v7.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.j;
import android.support.v7.b.a.b;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class p
{
  private final ImageView a;
  
  public p(ImageView paramImageView)
  {
    a = paramImageView;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt != 0)
    {
      Drawable localDrawable = b.b(a.getContext(), paramInt);
      if (localDrawable != null) {
        ag.a(localDrawable);
      }
      a.setImageDrawable(localDrawable);
      return;
    }
    a.setImageDrawable(null);
  }
  
  public final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject2 = null;
    AttributeSet localAttributeSet = null;
    Object localObject1 = localObject2;
    try
    {
      Drawable localDrawable2 = a.getDrawable();
      Drawable localDrawable1 = localDrawable2;
      if (localDrawable2 == null)
      {
        localObject1 = localObject2;
        paramAttributeSet = bf.a(a.getContext(), paramAttributeSet, a.j.AppCompatImageView, paramInt, 0);
        localObject1 = paramAttributeSet;
        paramInt = paramAttributeSet.g(a.j.AppCompatImageView_srcCompat, -1);
        localDrawable1 = localDrawable2;
        localAttributeSet = paramAttributeSet;
        if (paramInt != -1)
        {
          localObject1 = paramAttributeSet;
          localDrawable2 = b.b(a.getContext(), paramInt);
          localDrawable1 = localDrawable2;
          localAttributeSet = paramAttributeSet;
          if (localDrawable2 != null)
          {
            localObject1 = paramAttributeSet;
            a.setImageDrawable(localDrawable2);
            localAttributeSet = paramAttributeSet;
            localDrawable1 = localDrawable2;
          }
        }
      }
      if (localDrawable1 != null)
      {
        localObject1 = localAttributeSet;
        ag.a(localDrawable1);
      }
      if (localAttributeSet != null) {
        a.recycle();
      }
      return;
    }
    finally
    {
      if (localObject1 != null) {
        a.recycle();
      }
    }
  }
  
  final boolean a()
  {
    Drawable localDrawable = a.getBackground();
    return (Build.VERSION.SDK_INT < 21) || (!(localDrawable instanceof RippleDrawable));
  }
}


/* Location:              android/support/v7/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */