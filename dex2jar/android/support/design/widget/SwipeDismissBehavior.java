package android.support.design.widget;

import android.support.v4.h.n;
import android.support.v4.h.w;
import android.support.v4.widget.p;
import android.support.v4.widget.p.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public class SwipeDismissBehavior<V extends View>
  extends CoordinatorLayout.a<V>
{
  private boolean a;
  p b;
  a c;
  int d = 2;
  float e = 0.5F;
  float f = 0.0F;
  float g = 0.5F;
  private float h = 0.0F;
  private boolean i;
  private final p.a j = new p.a()
  {
    private int b;
    private int c = -1;
    
    public final int a(View paramAnonymousView)
    {
      return paramAnonymousView.getWidth();
    }
    
    public final void a(int paramAnonymousInt)
    {
      if (c != null) {
        c.a(paramAnonymousInt);
      }
    }
    
    public final void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      boolean bool = true;
      c = -1;
      int j = paramAnonymousView.getWidth();
      int i;
      if (paramAnonymousFloat1 != 0.0F) {
        if (w.g(paramAnonymousView) == 1)
        {
          i = 1;
          if (d != 2) {
            break label114;
          }
          i = 1;
          label45:
          if (i == 0) {
            break label290;
          }
          if (paramAnonymousView.getLeft() >= b) {
            break label278;
          }
          i = b - j;
          label70:
          if (!b.a(i, paramAnonymousView.getTop())) {
            break label302;
          }
          w.a(paramAnonymousView, new SwipeDismissBehavior.b(SwipeDismissBehavior.this, paramAnonymousView, bool));
        }
      }
      label114:
      label278:
      label290:
      label302:
      while ((!bool) || (c == null))
      {
        return;
        i = 0;
        break;
        if (d == 0)
        {
          if (i != 0)
          {
            if (paramAnonymousFloat1 < 0.0F)
            {
              i = 1;
              break label45;
            }
            i = 0;
            break label45;
          }
          if (paramAnonymousFloat1 > 0.0F)
          {
            i = 1;
            break label45;
          }
          i = 0;
          break label45;
        }
        if (d == 1)
        {
          if (i != 0)
          {
            if (paramAnonymousFloat1 > 0.0F)
            {
              i = 1;
              break label45;
            }
            i = 0;
            break label45;
          }
          if (paramAnonymousFloat1 < 0.0F)
          {
            i = 1;
            break label45;
          }
          i = 0;
          break label45;
          i = paramAnonymousView.getLeft();
          int k = b;
          int m = Math.round(paramAnonymousView.getWidth() * e);
          if (Math.abs(i - k) >= m)
          {
            i = 1;
            break label45;
          }
          i = 0;
          break label45;
        }
        i = 0;
        break label45;
        i = b + j;
        break label70;
        i = b;
        bool = false;
        break label70;
      }
      c.a(paramAnonymousView);
    }
    
    public final boolean a(View paramAnonymousView, int paramAnonymousInt)
    {
      return (c == -1) && (b(paramAnonymousView));
    }
    
    public final void b(View paramAnonymousView, int paramAnonymousInt)
    {
      float f1 = b + paramAnonymousView.getWidth() * f;
      float f2 = b + paramAnonymousView.getWidth() * g;
      if (paramAnonymousInt <= f1)
      {
        w.c(paramAnonymousView, 1.0F);
        return;
      }
      if (paramAnonymousInt >= f2)
      {
        w.c(paramAnonymousView, 0.0F);
        return;
      }
      w.c(paramAnonymousView, SwipeDismissBehavior.a(1.0F - SwipeDismissBehavior.a(f1, f2, paramAnonymousInt)));
    }
    
    public final int c(View paramAnonymousView, int paramAnonymousInt)
    {
      return paramAnonymousView.getTop();
    }
    
    public final int d(View paramAnonymousView, int paramAnonymousInt)
    {
      int i;
      int j;
      if (w.g(paramAnonymousView) == 1)
      {
        i = 1;
        if (d != 0) {
          break label72;
        }
        if (i == 0) {
          break label53;
        }
        i = b - paramAnonymousView.getWidth();
        j = b;
      }
      for (;;)
      {
        return SwipeDismissBehavior.a(i, paramAnonymousInt, j);
        i = 0;
        break;
        label53:
        i = b;
        j = b + paramAnonymousView.getWidth();
        continue;
        label72:
        if (d == 1)
        {
          if (i != 0)
          {
            i = b;
            j = b + paramAnonymousView.getWidth();
          }
          else
          {
            i = b - paramAnonymousView.getWidth();
            j = b;
          }
        }
        else
        {
          i = b - paramAnonymousView.getWidth();
          j = b + paramAnonymousView.getWidth();
        }
      }
    }
    
    public final void e(View paramAnonymousView, int paramAnonymousInt)
    {
      c = paramAnonymousInt;
      b = paramAnonymousView.getLeft();
      paramAnonymousView = paramAnonymousView.getParent();
      if (paramAnonymousView != null) {
        paramAnonymousView.requestDisallowInterceptTouchEvent(true);
      }
    }
  };
  
  static float a(float paramFloat)
  {
    return Math.min(Math.max(0.0F, paramFloat), 1.0F);
  }
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1);
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    boolean bool3 = a;
    boolean bool1 = bool3;
    switch (n.a(paramMotionEvent))
    {
    default: 
      bool1 = bool3;
    case 2: 
      if (bool1) {
        if (b == null) {
          if (!i) {
            break label142;
          }
        }
      }
      break;
    }
    label142:
    for (paramCoordinatorLayout = p.a(paramCoordinatorLayout, h, j);; paramCoordinatorLayout = p.a(paramCoordinatorLayout, j))
    {
      b = paramCoordinatorLayout;
      bool2 = b.a(paramMotionEvent);
      return bool2;
      a = paramCoordinatorLayout.a(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      bool1 = a;
      break;
      a = false;
      bool1 = bool3;
      break;
    }
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (b != null)
    {
      b.b(paramMotionEvent);
      return true;
    }
    return false;
  }
  
  public boolean b(View paramView)
  {
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
    
    public abstract void a(View paramView);
  }
  
  private final class b
    implements Runnable
  {
    private final View b;
    private final boolean c;
    
    b(View paramView, boolean paramBoolean)
    {
      b = paramView;
      c = paramBoolean;
    }
    
    public final void run()
    {
      if ((b != null) && (b.b())) {
        w.a(b, this);
      }
      while ((!c) || (c == null)) {
        return;
      }
      c.a(b);
    }
  }
}


/* Location:              android/support/design/widget/SwipeDismissBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */