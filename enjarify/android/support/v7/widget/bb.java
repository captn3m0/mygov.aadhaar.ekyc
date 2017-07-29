package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.d.a;
import android.util.TypedValue;

final class bb
{
  static final int[] a;
  static final int[] b;
  static final int[] c;
  static final int[] d;
  static final int[] e;
  static final int[] f;
  static final int[] g;
  static final int[] h;
  private static final ThreadLocal i;
  private static final int[] j;
  
  static
  {
    int k = 1;
    Object localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    i = (ThreadLocal)localObject;
    localObject = new int[k];
    localObject[0] = -16842910;
    a = (int[])localObject;
    localObject = new int[k];
    localObject[0] = 16842908;
    b = (int[])localObject;
    localObject = new int[k];
    localObject[0] = 16843518;
    c = (int[])localObject;
    localObject = new int[k];
    localObject[0] = 16842919;
    d = (int[])localObject;
    localObject = new int[k];
    localObject[0] = 16842912;
    e = (int[])localObject;
    localObject = new int[k];
    localObject[0] = 16842913;
    f = (int[])localObject;
    localObject = new int[2];
    Object tmp97_96 = localObject;
    tmp97_96[0] = -16842919;
    tmp97_96[1] = -16842908;
    g = (int[])localObject;
    h = new int[0];
    j = new int[k];
  }
  
  public static int a(Context paramContext, int paramInt)
  {
    j[0] = paramInt;
    int[] arrayOfInt = j;
    bf localbf = bf.a(paramContext, null, arrayOfInt);
    int k = 0;
    arrayOfInt = null;
    try
    {
      k = localbf.b(0, 0);
      return k;
    }
    finally
    {
      a.recycle();
    }
  }
  
  public static ColorStateList b(Context paramContext, int paramInt)
  {
    j[0] = paramInt;
    Object localObject1 = j;
    bf localbf = bf.a(paramContext, null, (int[])localObject1);
    localObject1 = null;
    try
    {
      localObject1 = localbf.d(0);
      return (ColorStateList)localObject1;
    }
    finally
    {
      a.recycle();
    }
  }
  
  public static int c(Context paramContext, int paramInt)
  {
    Object localObject1 = b(paramContext, paramInt);
    Object localObject2;
    int m;
    if (localObject1 != null)
    {
      boolean bool1 = ((ColorStateList)localObject1).isStateful();
      if (bool1)
      {
        localObject2 = a;
        m = ((ColorStateList)localObject1).getDefaultColor();
      }
    }
    int k;
    for (int n = ((ColorStateList)localObject1).getColorForState((int[])localObject2, m);; n = a.b(k, n))
    {
      return n;
      localObject1 = (TypedValue)i.get();
      if (localObject1 == null)
      {
        localObject1 = new android/util/TypedValue;
        ((TypedValue)localObject1).<init>();
        localObject2 = i;
        ((ThreadLocal)localObject2).set(localObject1);
      }
      localObject2 = paramContext.getTheme();
      boolean bool2 = true;
      ((Resources.Theme)localObject2).resolveAttribute(16842803, (TypedValue)localObject1, bool2);
      float f1 = ((TypedValue)localObject1).getFloat();
      k = a(paramContext, paramInt);
      m = Color.alpha(k);
      float f2 = m;
      f1 *= f2;
      n = Math.round(f1);
    }
  }
}


/* Location:              android/support/v7/widget/bb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */