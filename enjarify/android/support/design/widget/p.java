package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.a.a;

final class p
{
  private static final int[] a;
  
  static
  {
    int[] arrayOfInt = new int[1];
    int i = a.a.colorPrimary;
    arrayOfInt[0] = i;
    a = arrayOfInt;
  }
  
  static void a(Context paramContext)
  {
    int i = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    Object localObject = a;
    localObject = paramContext.obtainStyledAttributes((int[])localObject);
    boolean bool = ((TypedArray)localObject).hasValue(0);
    if (!bool) {
      i = 1;
    }
    ((TypedArray)localObject).recycle();
    if (i != 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
      throw localIllegalArgumentException;
    }
  }
}


/* Location:              android/support/design/widget/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */