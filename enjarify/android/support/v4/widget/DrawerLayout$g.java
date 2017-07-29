package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class DrawerLayout$g
  extends ViewGroup.MarginLayoutParams
{
  public int a = 0;
  float b;
  boolean c;
  int d;
  
  public DrawerLayout$g()
  {
    super(i, i);
  }
  
  public DrawerLayout$g(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = DrawerLayout.a;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = ((TypedArray)localObject).getInt(0, 0);
    a = i;
    ((TypedArray)localObject).recycle();
  }
  
  public DrawerLayout$g(g paramg)
  {
    super(paramg);
    int i = a;
    a = i;
  }
  
  public DrawerLayout$g(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public DrawerLayout$g(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
}


/* Location:              android/support/v4/widget/DrawerLayout$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */