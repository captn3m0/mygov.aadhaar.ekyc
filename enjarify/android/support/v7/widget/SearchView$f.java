package android.support.v7.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

final class SearchView$f
  extends TouchDelegate
{
  private final View a;
  private final Rect b;
  private final Rect c;
  private final Rect d;
  private final int e;
  private boolean f;
  
  public SearchView$f(Rect paramRect1, Rect paramRect2, View paramView)
  {
    super(paramRect1, paramView);
    int i = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    e = i;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    b = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    d = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    c = localRect;
    a(paramRect1, paramRect2);
    a = paramView;
  }
  
  public final void a(Rect paramRect1, Rect paramRect2)
  {
    b.set(paramRect1);
    d.set(paramRect1);
    Rect localRect = d;
    int i = -e;
    int j = -e;
    localRect.inset(i, j);
    c.set(paramRect2);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    float f2 = 0.0F;
    Object localObject1 = null;
    int m = (int)paramMotionEvent.getX();
    float f3 = paramMotionEvent.getY();
    int n = (int)f3;
    int i1 = paramMotionEvent.getAction();
    Rect localRect1;
    label81:
    Object localObject2;
    switch (i1)
    {
    default: 
      i1 = 0;
      localRect1 = null;
      f3 = 0.0F;
      if (i1 != 0)
      {
        if (i == 0) {
          break label266;
        }
        localObject1 = c;
        bool1 = ((Rect)localObject1).contains(m, n);
        if (bool1) {
          break label266;
        }
        localObject1 = a;
        int j = ((View)localObject1).getWidth() / 2;
        f2 = j;
        localObject2 = a;
        i = ((View)localObject2).getHeight() / 2;
        f1 = i;
        paramMotionEvent.setLocation(f2, f1);
      }
      break;
    }
    for (;;)
    {
      localObject1 = a;
      boolean bool2 = ((View)localObject1).dispatchTouchEvent(paramMotionEvent);
      return bool2;
      localRect1 = b;
      boolean bool3 = localRect1.contains(m, n);
      if (!bool3) {
        break;
      }
      f = i;
      bool3 = i;
      f3 = f1;
      break label81;
      bool3 = f;
      if (!bool3) {
        break label81;
      }
      Rect localRect2 = d;
      boolean bool4 = localRect2.contains(m, n);
      if (bool4) {
        break label81;
      }
      i = 0;
      localObject2 = null;
      f1 = 0.0F;
      break label81;
      bool3 = f;
      f = false;
      break label81;
      label266:
      localObject1 = c;
      int k = left;
      k = m - k;
      f2 = k;
      localObject2 = c;
      i = top;
      i = n - i;
      f1 = i;
      paramMotionEvent.setLocation(f2, f1);
    }
  }
}


/* Location:              android/support/v7/widget/SearchView$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */