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
    return new bf(paramContext, paramContext.obtainStyledAttributes(paramInt, paramArrayOfInt));
  }
  
  public static bf a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    return new bf(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt));
  }
  
  public static bf a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    return new bf(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, paramInt2));
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    return a.getInt(paramInt1, paramInt2);
  }
  
  public final Drawable a(int paramInt)
  {
    if (a.hasValue(paramInt))
    {
      int i = a.getResourceId(paramInt, 0);
      if (i != 0) {
        return b.b(b, i);
      }
    }
    return a.getDrawable(paramInt);
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
    if (a.hasValue(paramInt))
    {
      paramInt = a.getResourceId(paramInt, 0);
      if (paramInt != 0) {
        return m.a().a(b, paramInt, true);
      }
    }
    return null;
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
    if (a.hasValue(paramInt))
    {
      int i = a.getResourceId(paramInt, 0);
      if (i != 0)
      {
        ColorStateList localColorStateList = b.a(b, i);
        if (localColorStateList != null) {
          return localColorStateList;
        }
      }
    }
    return a.getColorStateList(paramInt);
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */