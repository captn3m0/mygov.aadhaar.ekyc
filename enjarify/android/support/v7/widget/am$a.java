package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class am$a
  extends ViewGroup.MarginLayoutParams
{
  public float g;
  public int h;
  
  public am$a(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    h = -1;
    g = 0.0F;
  }
  
  public am$a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    h = i;
    Object localObject = a.j.LinearLayoutCompat_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = a.j.LinearLayoutCompat_Layout_android_layout_weight;
    float f = ((TypedArray)localObject).getFloat(j, 0.0F);
    g = f;
    j = a.j.LinearLayoutCompat_Layout_android_layout_gravity;
    j = ((TypedArray)localObject).getInt(j, i);
    h = j;
    ((TypedArray)localObject).recycle();
  }
  
  public am$a(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    h = -1;
  }
}


/* Location:              android/support/v7/widget/am$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */