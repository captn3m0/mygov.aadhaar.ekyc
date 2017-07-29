package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.h.u;
import android.support.v7.b.a.b;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

public final class r
  extends MultiAutoCompleteTextView
  implements u
{
  private static final int[] a;
  private h b;
  private z c;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843126;
    a = arrayOfInt;
  }
  
  public r(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  private r(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject1, paramAttributeSet, paramInt);
    localObject1 = getContext();
    Object localObject2 = a;
    localObject1 = bf.a((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    boolean bool = ((bf)localObject1).e(0);
    if (bool)
    {
      localObject2 = ((bf)localObject1).a(0);
      setDropDownBackgroundDrawable((Drawable)localObject2);
    }
    a.recycle();
    localObject1 = new android/support/v7/widget/h;
    ((h)localObject1).<init>(this);
    b = ((h)localObject1);
    b.a(paramAttributeSet, paramInt);
    localObject1 = z.a(this);
    c = ((z)localObject1);
    c.a(paramAttributeSet, paramInt);
    c.a();
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((h)localObject).d();
    }
    localObject = c;
    if (localObject != null)
    {
      localObject = c;
      ((z)localObject).a();
    }
  }
  
  public final ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = b;
    if (localObject != null) {}
    for (localObject = b.b();; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  public final PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = b;
    if (localObject != null) {}
    for (localObject = b.c();; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    h localh = b;
    if (localh != null)
    {
      localh = b;
      localh.a();
    }
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    h localh = b;
    if (localh != null)
    {
      localh = b;
      localh.a(paramInt);
    }
  }
  
  public final void setDropDownBackgroundResource(int paramInt)
  {
    Drawable localDrawable = b.b(getContext(), paramInt);
    setDropDownBackgroundDrawable(localDrawable);
  }
  
  public final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    h localh = b;
    if (localh != null)
    {
      localh = b;
      localh.a(paramColorStateList);
    }
  }
  
  public final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    h localh = b;
    if (localh != null)
    {
      localh = b;
      localh.a(paramMode);
    }
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    z localz = c;
    if (localz != null)
    {
      localz = c;
      localz.a(paramContext, paramInt);
    }
  }
}


/* Location:              android/support/v7/widget/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */