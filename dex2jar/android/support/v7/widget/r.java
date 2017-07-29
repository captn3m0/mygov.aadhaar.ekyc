package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.h.u;
import android.support.v7.a.a.a;
import android.support.v7.b.a.b;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

public final class r
  extends MultiAutoCompleteTextView
  implements u
{
  private static final int[] a = { 16843126 };
  private h b;
  private z c;
  
  public r(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.autoCompleteTextViewStyle);
  }
  
  private r(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(bc.a(paramContext), paramAttributeSet, paramInt);
    paramContext = bf.a(getContext(), paramAttributeSet, a, paramInt, 0);
    if (paramContext.e(0)) {
      setDropDownBackgroundDrawable(paramContext.a(0));
    }
    a.recycle();
    b = new h(this);
    b.a(paramAttributeSet, paramInt);
    c = z.a(this);
    c.a(paramAttributeSet, paramInt);
    c.a();
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (b != null) {
      b.d();
    }
    if (c != null) {
      c.a();
    }
  }
  
  public final ColorStateList getSupportBackgroundTintList()
  {
    if (b != null) {
      return b.b();
    }
    return null;
  }
  
  public final PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (b != null) {
      return b.c();
    }
    return null;
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (b != null) {
      b.a();
    }
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (b != null) {
      b.a(paramInt);
    }
  }
  
  public final void setDropDownBackgroundResource(int paramInt)
  {
    setDropDownBackgroundDrawable(b.b(getContext(), paramInt));
  }
  
  public final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (b != null) {
      b.a(paramColorStateList);
    }
  }
  
  public final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (b != null) {
      b.a(paramMode);
    }
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (c != null) {
      c.a(paramContext, paramInt);
    }
  }
}


/* Location:              android/support/v7/widget/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */