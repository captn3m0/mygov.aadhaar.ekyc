package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class v<V extends View>
  extends CoordinatorLayout.a<V>
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
    if (a != null) {
      return a.a(paramInt);
    }
    b = paramInt;
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    c(paramCoordinatorLayout, paramV, paramInt);
    if (a == null) {
      a = new w(paramV);
    }
    paramCoordinatorLayout = a;
    b = a.getTop();
    c = a.getLeft();
    paramCoordinatorLayout.a();
    if (b != 0)
    {
      a.a(b);
      b = 0;
    }
    if (c != 0)
    {
      paramCoordinatorLayout = a;
      paramInt = c;
      if (e != paramInt)
      {
        e = paramInt;
        paramCoordinatorLayout.a();
      }
      c = 0;
    }
    return true;
  }
  
  public int c()
  {
    if (a != null) {
      return a.d;
    }
    return 0;
  }
  
  protected void c(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    paramCoordinatorLayout.a(paramV, paramInt);
  }
}


/* Location:              android/support/design/widget/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */