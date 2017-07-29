package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a.b;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

final class m$c
  extends ContentFrameLayout
{
  public m$c(m paramm, Context paramContext)
  {
    super(paramContext);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    m localm = a;
    boolean bool = localm.a(paramKeyEvent);
    if (!bool)
    {
      bool = super.dispatchKeyEvent(paramKeyEvent);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localm = null;
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = -5;
    int k = paramMotionEvent.getAction();
    float f2;
    m localm;
    if (k == 0)
    {
      f2 = paramMotionEvent.getX();
      k = (int)f2;
      float f3 = paramMotionEvent.getY();
      int m = (int)f3;
      if ((k >= j) && (m >= j))
      {
        j = getWidth() + 5;
        if (k <= j)
        {
          k = getHeight() + 5;
          if (m <= k) {
            break label110;
          }
        }
      }
      k = i;
      f2 = f1;
      if (k != 0)
      {
        localm = a;
        localm.q();
      }
    }
    for (;;)
    {
      return i;
      label110:
      k = 0;
      f2 = 0.0F;
      localm = null;
      break;
      i = super.onInterceptTouchEvent(paramMotionEvent);
    }
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    Drawable localDrawable = b.b(getContext(), paramInt);
    setBackgroundDrawable(localDrawable);
  }
}


/* Location:              android/support/v7/app/m$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */