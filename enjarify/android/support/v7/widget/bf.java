package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a.b;
import android.util.AttributeSet;

public final class bf
{
  public final TypedArray a;
  private final Context b;
  
  private bf(Context paramContext, TypedArray paramTypedArray)
  {
    b = paramContext;
    a = paramTypedArray;
  }
  
  public static bf a(Context paramContext, int paramInt, int[] paramArrayOfInt)
  {
    bf localbf = new android/support/v7/widget/bf;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramInt, paramArrayOfInt);
    localbf.<init>(paramContext, localTypedArray);
    return localbf;
  }
  
  public static bf a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    bf localbf = new android/support/v7/widget/bf;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt);
    localbf.<init>(paramContext, localTypedArray);
    return localbf;
  }
  
  public static bf a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    bf localbf = new android/support/v7/widget/bf;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, paramInt2);
    localbf.<init>(paramContext, localTypedArray);
    return localbf;
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    return a.getInt(paramInt1, paramInt2);
  }
  
  public final Drawable a(int paramInt)
  {
    Object localObject = a;
    boolean bool = ((TypedArray)localObject).hasValue(paramInt);
    Context localContext;
    int i;
    if (bool)
    {
      localObject = a;
      localContext = null;
      i = ((TypedArray)localObject).getResourceId(paramInt, 0);
      if (i != 0) {
        localContext = b;
      }
    }
    for (localObject = b.b(localContext, i);; localObject = a.getDrawable(paramInt)) {
      return (Drawable)localObject;
    }
  }
  
  public final boolean a(int paramInt, boolean paramBoolean)
  {
    return a.getBoolean(paramInt, paramBoolean);
  }
  
  public final int b(int paramInt1, int paramInt2)
  {
    return a.getColor(paramInt1, paramInt2);
  }
  
  public final Drawable b(int paramInt)
  {
    Object localObject = a;
    boolean bool1 = ((TypedArray)localObject).hasValue(paramInt);
    m localm;
    int i;
    Context localContext;
    boolean bool2;
    if (bool1)
    {
      localObject = a;
      localm = null;
      i = ((TypedArray)localObject).getResourceId(paramInt, 0);
      if (i != 0)
      {
        localm = m.a();
        localContext = b;
        bool2 = true;
      }
    }
    for (localObject = localm.a(localContext, i, bool2);; localObject = null)
    {
      return (Drawable)localObject;
      i = 0;
    }
  }
  
  public final int c(int paramInt1, int paramInt2)
  {
    return a.getInteger(paramInt1, paramInt2);
  }
  
  public final CharSequence c(int paramInt)
  {
    return a.getText(paramInt);
  }
  
  public final int d(int paramInt1, int paramInt2)
  {
    return a.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public final ColorStateList d(int paramInt)
  {
    Object localObject = a;
    boolean bool = ((TypedArray)localObject).hasValue(paramInt);
    if (bool)
    {
      localObject = a;
      Context localContext = null;
      int i = ((TypedArray)localObject).getResourceId(paramInt, 0);
      if (i != 0)
      {
        localContext = b;
        localObject = b.a(localContext, i);
        if (localObject == null) {}
      }
    }
    for (;;)
    {
      return (ColorStateList)localObject;
      localObject = a.getColorStateList(paramInt);
    }
  }
  
  public final int e(int paramInt1, int paramInt2)
  {
    return a.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public final boolean e(int paramInt)
  {
    return a.hasValue(paramInt);
  }
  
  public final int f(int paramInt1, int paramInt2)
  {
    return a.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public final int g(int paramInt1, int paramInt2)
  {
    return a.getResourceId(paramInt1, paramInt2);
  }
}


/* Location:              android/support/v7/widget/bf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */