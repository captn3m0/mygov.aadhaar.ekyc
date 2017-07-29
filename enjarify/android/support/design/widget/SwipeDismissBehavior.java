package android.support.design.widget;

import android.support.v4.h.n;
import android.support.v4.widget.p;
import android.support.v4.widget.p.a;
import android.view.MotionEvent;
import android.view.View;

public class SwipeDismissBehavior
  extends CoordinatorLayout.a
{
  private boolean a;
  p b;
  SwipeDismissBehavior.a c;
  int d = 2;
  float e;
  float f;
  float g;
  private float h = 0.0F;
  private boolean i;
  private final p.a j;
  
  public SwipeDismissBehavior()
  {
    e = f1;
    f = 0.0F;
    g = f1;
    SwipeDismissBehavior.1 local1 = new android/support/design/widget/SwipeDismissBehavior$1;
    local1.<init>(this);
    j = local1;
  }
  
  static float a(float paramFloat)
  {
    return Math.min(Math.max(0.0F, paramFloat), 1.0F);
  }
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat2 - paramFloat1;
    return f1 / f2;
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    Object localObject = null;
    boolean bool2 = a;
    int m = n.a(paramMotionEvent);
    p.a locala;
    switch (m)
    {
    case 2: 
    default: 
      if (bool2)
      {
        localObject = b;
        if (localObject == null)
        {
          bool1 = i;
          if (!bool1) {
            break label180;
          }
          f1 = h;
          locala = j;
        }
      }
      break;
    }
    for (localObject = p.a(paramCoordinatorLayout, f1, locala);; localObject = p.a(paramCoordinatorLayout, (p.a)localObject))
    {
      b = ((p)localObject);
      localObject = b;
      bool1 = ((p)localObject).a(paramMotionEvent);
      return bool1;
      float f2 = paramMotionEvent.getX();
      int k = (int)f2;
      float f3 = paramMotionEvent.getY();
      m = (int)f3;
      boolean bool3 = paramCoordinatorLayout.a(paramView, k, m);
      a = bool3;
      bool3 = a;
      break;
      a = false;
      break;
      label180:
      localObject = j;
    }
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    p localp = b;
    boolean bool;
    if (localp != null)
    {
      localp = b;
      localp.b(paramMotionEvent);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localp = null;
    }
  }
  
  public boolean b(View paramView)
  {
    return true;
  }
}


/* Location:              android/support/design/widget/SwipeDismissBehavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */