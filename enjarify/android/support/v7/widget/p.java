package android.support.v7.widget;

import android.content.Context;
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
    Object localObject;
    ImageView localImageView;
    if (paramInt != 0)
    {
      localObject = b.b(a.getContext(), paramInt);
      if (localObject != null) {
        ag.a((Drawable)localObject);
      }
      localImageView = a;
      localImageView.setImageDrawable((Drawable)localObject);
    }
    for (;;)
    {
      return;
      localObject = a;
      localImageView = null;
      ((ImageView)localObject).setImageDrawable(null);
    }
  }
  
  public final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    int i = -1;
    Object localObject1 = null;
    try
    {
      Object localObject2 = a;
      localObject2 = ((ImageView)localObject2).getDrawable();
      if (localObject2 == null)
      {
        Object localObject4 = a;
        localObject4 = ((ImageView)localObject4).getContext();
        int[] arrayOfInt = a.j.AppCompatImageView;
        localObject1 = bf.a((Context)localObject4, paramAttributeSet, arrayOfInt, paramInt, 0);
        int j = a.j.AppCompatImageView_srcCompat;
        int k = -1;
        j = ((bf)localObject1).g(j, k);
        if (j != i)
        {
          localObject2 = a;
          localObject2 = ((ImageView)localObject2).getContext();
          localObject2 = b.b((Context)localObject2, j);
          if (localObject2 != null)
          {
            localObject4 = a;
            ((ImageView)localObject4).setImageDrawable((Drawable)localObject2);
          }
        }
      }
      if (localObject2 != null) {
        ag.a((Drawable)localObject2);
      }
      return;
    }
    finally
    {
      if (localObject1 != null)
      {
        localObject1 = a;
        ((TypedArray)localObject1).recycle();
      }
    }
  }
  
  final boolean a()
  {
    Drawable localDrawable = a.getBackground();
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    boolean bool;
    if (i >= j)
    {
      bool = localDrawable instanceof RippleDrawable;
      if (bool)
      {
        bool = false;
        localDrawable = null;
      }
    }
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
}


/* Location:              android/support/v7/widget/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */