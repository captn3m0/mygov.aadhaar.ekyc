package android.support.v7.widget;

import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.v4.h.n;
import android.support.v7.view.menu.s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

public abstract class aj
  implements View.OnTouchListener
{
  private final float a;
  private final int b;
  final View c;
  boolean d;
  private final int e;
  private Runnable f;
  private Runnable g;
  private int h;
  private final int[] i;
  
  public aj(View paramView)
  {
    Object localObject = new int[2];
    i = ((int[])localObject);
    c = paramView;
    float f1 = Float.MIN_VALUE;
    paramView.setLongClickable(true);
    int j = Build.VERSION.SDK_INT;
    int k = 12;
    if (j >= k)
    {
      localObject = new android/support/v7/widget/aj$1;
      ((aj.1)localObject).<init>(this);
      paramView.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)localObject);
    }
    for (;;)
    {
      f1 = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      a = f1;
      j = ViewConfiguration.getTapTimeout();
      b = j;
      j = b;
      k = ViewConfiguration.getLongPressTimeout();
      j = (j + k) / 2;
      e = j;
      return;
      localObject = paramView.getViewTreeObserver();
      aj.2 local2 = new android/support/v7/widget/aj$2;
      local2.<init>(this);
      ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(local2);
    }
  }
  
  public abstract s a();
  
  public boolean b()
  {
    s locals = a();
    if (locals != null)
    {
      boolean bool = locals.f();
      if (!bool) {
        locals.d();
      }
    }
    return true;
  }
  
  protected boolean c()
  {
    s locals = a();
    if (locals != null)
    {
      boolean bool = locals.f();
      if (bool) {
        locals.e();
      }
    }
    return true;
  }
  
  final void d()
  {
    Object localObject = g;
    Runnable localRunnable;
    if (localObject != null)
    {
      localObject = c;
      localRunnable = g;
      ((View)localObject).removeCallbacks(localRunnable);
    }
    localObject = f;
    if (localObject != null)
    {
      localObject = c;
      localRunnable = f;
      ((View)localObject).removeCallbacks(localRunnable);
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int j = 3;
    int k = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    boolean bool2 = d;
    Object localObject2;
    float f2;
    float f4;
    if (bool2)
    {
      localObject1 = c;
      localObject2 = a();
      boolean bool3;
      boolean bool5;
      if (localObject2 != null)
      {
        bool3 = ((s)localObject2).f();
        if (bool3) {}
      }
      else
      {
        bool5 = false;
        localObject2 = null;
        f2 = 0.0F;
        if (!bool5)
        {
          bool5 = c();
          if (bool5) {
            break label331;
          }
        }
        bool5 = k;
      }
      for (f2 = f1;; f2 = 0.0F)
      {
        d = bool5;
        if ((bool5) || (bool2)) {
          bool1 = k;
        }
        return bool1;
        localObject2 = (ah)((s)localObject2).g();
        if (localObject2 != null)
        {
          bool3 = ((ah)localObject2).isShown();
          if (bool3) {}
        }
        else
        {
          bool5 = false;
          localObject2 = null;
          f2 = 0.0F;
          break;
        }
        MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
        int[] arrayOfInt = i;
        ((View)localObject1).getLocationOnScreen(arrayOfInt);
        float f3 = arrayOfInt[0];
        f4 = arrayOfInt[k];
        localMotionEvent.offsetLocation(f3, f4);
        localObject1 = i;
        ((View)localObject2).getLocationOnScreen((int[])localObject1);
        int i4 = -localObject1[0];
        f4 = i4;
        f3 = -localObject1[k];
        localMotionEvent.offsetLocation(f4, f3);
        int i5 = h;
        boolean bool9 = ((ah)localObject2).a(localMotionEvent, i5);
        localMotionEvent.recycle();
        int i1 = n.a(paramMotionEvent);
        if ((i1 != k) && (i1 != j)) {
          i1 = k;
        }
        for (f2 = f1;; f2 = 0.0F)
        {
          if ((!bool9) || (i1 == 0)) {
            break label319;
          }
          i1 = k;
          f2 = f1;
          break;
          bool6 = false;
          localObject2 = null;
        }
        label319:
        bool6 = false;
        localObject2 = null;
        f2 = 0.0F;
        break;
        label331:
        bool6 = false;
        localObject2 = null;
      }
    }
    Object localObject1 = c;
    boolean bool6 = ((View)localObject1).isEnabled();
    int i2;
    if (bool6) {
      i2 = n.a(paramMotionEvent);
    }
    label400:
    label409:
    boolean bool7;
    int i6;
    switch (i2)
    {
    default: 
      i2 = 0;
      localObject2 = null;
      f2 = 0.0F;
      if (i2 != 0)
      {
        bool7 = b();
        if (bool7) {
          i6 = k;
        }
      }
      break;
    }
    for (float f5 = f1;; f5 = 0.0F)
    {
      if (i6 != 0)
      {
        long l1 = SystemClock.uptimeMillis();
        l2 = l1;
        bool10 = false;
        f6 = 0.0F;
        localObject2 = MotionEvent.obtain(l1, l1, j, 0.0F, 0.0F, 0);
        localObject1 = c;
        ((View)localObject1).onTouchEvent((MotionEvent)localObject2);
        ((MotionEvent)localObject2).recycle();
      }
      bool7 = i6;
      f2 = f5;
      break;
      int i3 = paramMotionEvent.getPointerId(0);
      h = i3;
      localObject2 = f;
      if (localObject2 == null)
      {
        localObject2 = new android/support/v7/widget/aj$a;
        ((aj.a)localObject2).<init>(this);
        f = ((Runnable)localObject2);
      }
      localObject2 = f;
      int m = b;
      long l2 = m;
      ((View)localObject1).postDelayed((Runnable)localObject2, l2);
      localObject2 = g;
      if (localObject2 == null)
      {
        localObject2 = new android/support/v7/widget/aj$b;
        ((aj.b)localObject2).<init>(this);
        g = ((Runnable)localObject2);
      }
      localObject2 = g;
      m = e;
      l2 = m;
      ((View)localObject1).postDelayed((Runnable)localObject2, l2);
      break label400;
      i3 = h;
      i3 = paramMotionEvent.findPointerIndex(i3);
      if (i3 < 0) {
        break label400;
      }
      float f7 = paramMotionEvent.getX(i3);
      f2 = paramMotionEvent.getY(i3);
      f4 = a;
      float f6 = -f4;
      boolean bool10 = f7 < f6;
      boolean bool8;
      if (!bool10)
      {
        f6 = -f4;
        bool10 = f2 < f6;
        if (!bool10)
        {
          int i8 = ((View)localObject1).getRight();
          i7 = ((View)localObject1).getLeft();
          i8 -= i7;
          f6 = i8 + f4;
          boolean bool4 = f7 < f6;
          if (bool4)
          {
            int n = ((View)localObject1).getBottom();
            i8 = ((View)localObject1).getTop();
            n -= i8;
            f7 = n + f4;
            bool8 = f2 < f7;
            if (bool8) {
              bool8 = k;
            }
          }
        }
      }
      for (f2 = f1; !bool8; f2 = 0.0F)
      {
        d();
        localObject2 = ((View)localObject1).getParent();
        ((ViewParent)localObject2).requestDisallowInterceptTouchEvent(k);
        bool8 = k;
        f2 = f1;
        break label409;
        bool8 = false;
        localObject2 = null;
      }
      d();
      break label400;
      int i7 = 0;
    }
  }
}


/* Location:              android/support/v7/widget/aj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */