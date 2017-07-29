package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

final class f
{
  private static final int[] a;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843828;
    a = arrayOfInt;
  }
  
  public static int a(Object paramObject)
  {
    if (paramObject != null) {
      paramObject = (WindowInsets)paramObject;
    }
    for (int i = ((WindowInsets)paramObject).getSystemWindowInsetTop();; i = 0) {
      return i;
    }
  }
  
  public static Drawable a(Context paramContext)
  {
    Object localObject1 = a;
    localObject1 = paramContext.obtainStyledAttributes((int[])localObject1);
    Drawable localDrawable = null;
    try
    {
      localDrawable = ((TypedArray)localObject1).getDrawable(0);
      return localDrawable;
    }
    finally
    {
      ((TypedArray)localObject1).recycle();
    }
  }
  
  public static void a(View paramView)
  {
    boolean bool = paramView instanceof g;
    if (bool)
    {
      f.a locala = new android/support/v4/widget/f$a;
      locala.<init>();
      ((View)paramView).setOnApplyWindowInsetsListener(locala);
      int i = 1280;
      ((View)paramView).setSystemUiVisibility(i);
    }
  }
  
  public static void a(View paramView, Object paramObject, int paramInt)
  {
    paramObject = (WindowInsets)paramObject;
    int i = 3;
    int j;
    int k;
    if (paramInt == i)
    {
      i = ((WindowInsets)paramObject).getSystemWindowInsetLeft();
      j = ((WindowInsets)paramObject).getSystemWindowInsetTop();
      k = ((WindowInsets)paramObject).getSystemWindowInsetBottom();
      paramObject = ((WindowInsets)paramObject).replaceSystemWindowInsets(i, j, 0, k);
    }
    for (;;)
    {
      paramView.dispatchApplyWindowInsets((WindowInsets)paramObject);
      return;
      i = 5;
      if (paramInt == i)
      {
        i = ((WindowInsets)paramObject).getSystemWindowInsetTop();
        j = ((WindowInsets)paramObject).getSystemWindowInsetRight();
        k = ((WindowInsets)paramObject).getSystemWindowInsetBottom();
        paramObject = ((WindowInsets)paramObject).replaceSystemWindowInsets(0, i, j, k);
      }
    }
  }
  
  public static void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt)
  {
    paramObject = (WindowInsets)paramObject;
    int i = 3;
    int j;
    int k;
    if (paramInt == i)
    {
      i = ((WindowInsets)paramObject).getSystemWindowInsetLeft();
      j = ((WindowInsets)paramObject).getSystemWindowInsetTop();
      k = ((WindowInsets)paramObject).getSystemWindowInsetBottom();
      paramObject = ((WindowInsets)paramObject).replaceSystemWindowInsets(i, j, 0, k);
    }
    for (;;)
    {
      i = ((WindowInsets)paramObject).getSystemWindowInsetLeft();
      leftMargin = i;
      i = ((WindowInsets)paramObject).getSystemWindowInsetTop();
      topMargin = i;
      i = ((WindowInsets)paramObject).getSystemWindowInsetRight();
      rightMargin = i;
      i = ((WindowInsets)paramObject).getSystemWindowInsetBottom();
      bottomMargin = i;
      return;
      i = 5;
      if (paramInt == i)
      {
        i = ((WindowInsets)paramObject).getSystemWindowInsetTop();
        j = ((WindowInsets)paramObject).getSystemWindowInsetRight();
        k = ((WindowInsets)paramObject).getSystemWindowInsetBottom();
        paramObject = ((WindowInsets)paramObject).replaceSystemWindowInsets(0, i, j, k);
      }
    }
  }
}


/* Location:              android/support/v4/widget/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */