package android.support.v7.widget;

import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.v4.h.n;
import android.support.v4.h.w;
import android.support.v7.view.menu.s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

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
  private final int[] i = new int[2];
  
  public aj(View paramView)
  {
    c = paramView;
    paramView.setLongClickable(true);
    if (Build.VERSION.SDK_INT >= 12) {
      paramView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
      {
        public final void onViewAttachedToWindow(View paramAnonymousView) {}
        
        public final void onViewDetachedFromWindow(View paramAnonymousView)
        {
          aj.a(aj.this);
        }
      });
    }
    for (;;)
    {
      a = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      b = ViewConfiguration.getTapTimeout();
      e = ((b + ViewConfiguration.getLongPressTimeout()) / 2);
      return;
      paramView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        boolean a = w.H(c);
        
        public final void onGlobalLayout()
        {
          boolean bool = a;
          a = w.H(c);
          if ((bool) && (!a)) {
            aj.a(aj.this);
          }
        }
      });
    }
  }
  
  public abstract s a();
  
  public boolean b()
  {
    s locals = a();
    if ((locals != null) && (!locals.f())) {
      locals.d();
    }
    return true;
  }
  
  protected boolean c()
  {
    s locals = a();
    if ((locals != null) && (locals.f())) {
      locals.e();
    }
    return true;
  }
  
  final void d()
  {
    if (g != null) {
      c.removeCallbacks(g);
    }
    if (f != null) {
      c.removeCallbacks(f);
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    boolean bool3 = d;
    int j;
    if (bool3)
    {
      paramView = c;
      Object localObject = a();
      if ((localObject == null) || (!((s)localObject).f()))
      {
        j = 0;
        if ((j == 0) && (c())) {
          break label241;
        }
      }
      label235:
      label241:
      for (bool1 = true;; bool1 = false)
      {
        d = bool1;
        if (!bool1)
        {
          bool1 = bool2;
          if (!bool3) {}
        }
        else
        {
          bool1 = true;
        }
        return bool1;
        localObject = (ah)((s)localObject).g();
        if ((localObject == null) || (!((ah)localObject).isShown()))
        {
          j = 0;
          break;
        }
        MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
        int[] arrayOfInt = i;
        paramView.getLocationOnScreen(arrayOfInt);
        localMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
        paramView = i;
        ((View)localObject).getLocationOnScreen(paramView);
        localMotionEvent.offsetLocation(-paramView[0], -paramView[1]);
        bool1 = ((ah)localObject).a(localMotionEvent, h);
        localMotionEvent.recycle();
        j = n.a(paramMotionEvent);
        if ((j != 1) && (j != 3)) {}
        for (j = 1;; j = 0)
        {
          if ((!bool1) || (j == 0)) {
            break label235;
          }
          j = 1;
          break;
        }
        j = 0;
        break;
      }
    }
    paramView = c;
    if (paramView.isEnabled()) {}
    switch (n.a(paramMotionEvent))
    {
    default: 
      label292:
      j = 0;
      label295:
      if ((j == 0) || (!b())) {
        break;
      }
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      if (bool1)
      {
        long l = SystemClock.uptimeMillis();
        paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        c.onTouchEvent(paramView);
        paramView.recycle();
      }
      break;
      h = paramMotionEvent.getPointerId(0);
      if (f == null) {
        f = new a();
      }
      paramView.postDelayed(f, b);
      if (g == null) {
        g = new b();
      }
      paramView.postDelayed(g, e);
      break label292;
      j = paramMotionEvent.findPointerIndex(h);
      if (j < 0) {
        break label292;
      }
      float f1 = paramMotionEvent.getX(j);
      float f2 = paramMotionEvent.getY(j);
      float f3 = a;
      if ((f1 >= -f3) && (f2 >= -f3) && (f1 < paramView.getRight() - paramView.getLeft() + f3) && (f2 < paramView.getBottom() - paramView.getTop() + f3)) {}
      for (j = 1; j == 0; j = 0)
      {
        d();
        paramView.getParent().requestDisallowInterceptTouchEvent(true);
        j = 1;
        break label295;
      }
      d();
      break label292;
    }
  }
  
  private final class a
    implements Runnable
  {
    a() {}
    
    public final void run()
    {
      ViewParent localViewParent = c.getParent();
      if (localViewParent != null) {
        localViewParent.requestDisallowInterceptTouchEvent(true);
      }
    }
  }
  
  private final class b
    implements Runnable
  {
    b() {}
    
    public final void run()
    {
      aj localaj = aj.this;
      localaj.d();
      View localView = c;
      if ((!localView.isEnabled()) || (localView.isLongClickable())) {}
      while (!localaj.b()) {
        return;
      }
      localView.getParent().requestDisallowInterceptTouchEvent(true);
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      localView.onTouchEvent(localMotionEvent);
      localMotionEvent.recycle();
      d = true;
    }
  }
}


/* Location:              android/support/v7/widget/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */