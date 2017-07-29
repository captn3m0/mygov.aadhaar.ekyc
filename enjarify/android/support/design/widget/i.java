package android.support.design.widget;

import android.content.Context;
import android.support.v4.h.n;
import android.support.v4.h.w;
import android.support.v4.widget.m;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

abstract class i
  extends v
{
  m a;
  private Runnable b;
  private boolean c;
  private int d;
  private int e;
  private int f;
  private VelocityTracker g;
  
  public i()
  {
    d = i;
    f = i;
  }
  
  public i(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    d = i;
    f = i;
  }
  
  private void d()
  {
    VelocityTracker localVelocityTracker = g;
    if (localVelocityTracker == null)
    {
      localVelocityTracker = VelocityTracker.obtain();
      g = localVelocityTracker;
    }
  }
  
  int a()
  {
    return c();
  }
  
  int a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = c();
    int j = 0;
    if ((paramInt2 != 0) && (i >= paramInt2) && (i <= paramInt3))
    {
      int k = k.a(paramInt1, paramInt2, paramInt3);
      if (i != k)
      {
        a(k);
        j = i - k;
      }
    }
    return j;
  }
  
  int a(View paramView)
  {
    return paramView.getHeight();
  }
  
  void a(CoordinatorLayout paramCoordinatorLayout, View paramView) {}
  
  final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt, float paramFloat)
  {
    int i = 0;
    boolean bool1 = false;
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      paramView.removeCallbacks((Runnable)localObject);
      b = null;
    }
    localObject = a;
    if (localObject == null)
    {
      localObject = m.a(paramView.getContext(), null);
      a = ((m)localObject);
    }
    localObject = a;
    i = c();
    int j = Math.round(paramFloat);
    ((m)localObject).a(i, 0, j, 0, 0, paramInt, 0);
    localObject = a.a;
    boolean bool2 = ((OverScroller)localObject).computeScrollOffset();
    if (bool2)
    {
      localObject = new android/support/design/widget/i$a;
      ((i.a)localObject).<init>(this, paramCoordinatorLayout, paramView);
      b = ((Runnable)localObject);
      localObject = b;
      w.a(paramView, (Runnable)localObject);
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      a(paramCoordinatorLayout, paramView);
    }
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    int k = -1;
    int m = f;
    if (m < 0)
    {
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramCoordinatorLayout.getContext());
      m = localViewConfiguration.getScaledTouchSlop();
      f = m;
    }
    m = paramMotionEvent.getAction();
    int i1 = 2;
    if (m == i1)
    {
      boolean bool3 = c;
      if (bool3) {
        return bool1;
      }
    }
    int n = n.a(paramMotionEvent);
    switch (n)
    {
    }
    for (;;)
    {
      VelocityTracker localVelocityTracker = g;
      if (localVelocityTracker != null)
      {
        localVelocityTracker = g;
        localVelocityTracker.addMovement(paramMotionEvent);
      }
      bool1 = c;
      break;
      c = false;
      f1 = paramMotionEvent.getX();
      int i = (int)f1;
      float f2 = paramMotionEvent.getY();
      n = (int)f2;
      boolean bool4 = b();
      if (bool4)
      {
        boolean bool2 = paramCoordinatorLayout.a(paramView, i, n);
        if (bool2)
        {
          e = n;
          int j = paramMotionEvent.getPointerId(0);
          d = j;
          d();
          continue;
          n = d;
          if (n != k)
          {
            n = paramMotionEvent.findPointerIndex(n);
            if (n != k)
            {
              f2 = paramMotionEvent.getY(n);
              n = (int)f2;
              int i2 = e;
              i2 = Math.abs(n - i2);
              k = f;
              if (i2 > k)
              {
                c = j;
                e = n;
                continue;
                c = false;
                d = k;
                localVelocityTracker = g;
                if (localVelocityTracker != null)
                {
                  g.recycle();
                  j = 0;
                  f1 = 0.0F;
                  localVelocityTracker = null;
                  g = null;
                }
              }
            }
          }
        }
      }
    }
  }
  
  final int a_(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    return a(paramCoordinatorLayout, paramView, paramInt, -1 << -1, -1 >>> 1);
  }
  
  final int b(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = a() - paramInt1;
    return a(paramCoordinatorLayout, paramView, i, paramInt2, paramInt3);
  }
  
  int b(View paramView)
  {
    return -paramView.getHeight();
  }
  
  boolean b()
  {
    return false;
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    int i = -1;
    boolean bool2 = false;
    int j = f;
    Object localObject;
    if (j < 0)
    {
      localObject = ViewConfiguration.get(paramCoordinatorLayout.getContext());
      j = ((ViewConfiguration)localObject).getScaledTouchSlop();
      f = j;
    }
    j = n.a(paramMotionEvent);
    switch (j)
    {
    }
    for (;;)
    {
      localObject = g;
      if (localObject != null)
      {
        localObject = g;
        ((VelocityTracker)localObject).addMovement(paramMotionEvent);
      }
      bool2 = bool1;
      float f2;
      do
      {
        int m;
        boolean bool3;
        do
        {
          do
          {
            return bool2;
            f1 = paramMotionEvent.getX();
            j = (int)f1;
            f2 = paramMotionEvent.getY();
            m = (int)f2;
            bool3 = paramCoordinatorLayout.a(paramView, j, m);
          } while (!bool3);
          bool3 = b();
        } while (!bool3);
        e = m;
        k = paramMotionEvent.getPointerId(0);
        d = k;
        d();
        break;
        k = d;
        k = paramMotionEvent.findPointerIndex(k);
      } while (k == i);
      float f1 = paramMotionEvent.getY(k);
      int k = (int)f1;
      int i2 = e - k;
      boolean bool4 = c;
      if (!bool4)
      {
        int n = Math.abs(i2);
        i = f;
        if (n > i)
        {
          c = bool1;
          if (i2 <= 0) {
            break label325;
          }
          n = f;
          i2 -= n;
        }
      }
      label325:
      int i1;
      for (;;)
      {
        boolean bool5 = c;
        if (!bool5) {
          break;
        }
        e = k;
        int i3 = b(paramView);
        localObject = this;
        b(paramCoordinatorLayout, paramView, i2, i3, 0);
        break;
        i1 = f;
        i2 += i1;
      }
      localObject = g;
      if (localObject != null)
      {
        g.addMovement(paramMotionEvent);
        localObject = g;
        f2 = 1.401E-42F;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000);
        localObject = g;
        i1 = d;
        f1 = android.support.v4.h.v.b((VelocityTracker)localObject, i1);
        i1 = -a(paramView);
        a(paramCoordinatorLayout, paramView, i1, f1);
      }
      c = false;
      d = i;
      localObject = g;
      if (localObject != null)
      {
        g.recycle();
        k = 0;
        f1 = 0.0F;
        localObject = null;
        g = null;
      }
    }
  }
}


/* Location:              android/support/design/widget/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */