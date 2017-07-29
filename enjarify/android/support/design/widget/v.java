package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class v
  extends CoordinatorLayout.a
{
  private w a;
  private int b = 0;
  private int c = 0;
  
  public v() {}
  
  public v(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean a(int paramInt)
  {
    w localw = a;
    boolean bool;
    if (localw != null)
    {
      localw = a;
      bool = localw.a(paramInt);
    }
    for (;;)
    {
      return bool;
      b = paramInt;
      bool = false;
      localw = null;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    c(paramCoordinatorLayout, paramView, paramInt);
    w localw = a;
    if (localw == null)
    {
      localw = new android/support/design/widget/w;
      localw.<init>(paramView);
      a = localw;
    }
    localw = a;
    int i = a.getTop();
    b = i;
    View localView = a;
    i = localView.getLeft();
    c = i;
    localw.a();
    int j = b;
    if (j != 0)
    {
      localw = a;
      i = b;
      localw.a(i);
      b = 0;
    }
    j = c;
    if (j != 0)
    {
      localw = a;
      i = c;
      int k = e;
      if (k != i)
      {
        e = i;
        localw.a();
      }
      c = 0;
    }
    return true;
  }
  
  public int c()
  {
    w localw = a;
    int i;
    if (localw != null)
    {
      localw = a;
      i = d;
    }
    for (;;)
    {
      return i;
      i = 0;
      localw = null;
    }
  }
  
  protected void c(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    paramCoordinatorLayout.a(paramView, paramInt);
  }
}


/* Location:              android/support/design/widget/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */