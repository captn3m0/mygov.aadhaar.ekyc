package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class a$a
  extends ViewGroup.MarginLayoutParams
{
  public int a = 0;
  
  public a$a()
  {
    super(i, i);
    a = 8388627;
  }
  
  public a$a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a.j.ActionBarLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = a.j.ActionBarLayout_android_layout_gravity;
    i = ((TypedArray)localObject).getInt(i, 0);
    a = i;
    ((TypedArray)localObject).recycle();
  }
  
  public a$a(a parama)
  {
    super(parama);
    int i = a;
    a = i;
  }
  
  public a$a(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}


/* Location:              android/support/v7/app/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */