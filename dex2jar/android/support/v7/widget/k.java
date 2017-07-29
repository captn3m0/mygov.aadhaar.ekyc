package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.a.b;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public final class k
  extends CheckedTextView
{
  private static final int[] a = { 16843016 };
  private z b = z.a(this);
  
  public k(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, (byte)0);
  }
  
  private k(Context paramContext, AttributeSet paramAttributeSet, byte paramByte)
  {
    super(bc.a(paramContext), paramAttributeSet, 16843720);
    b.a(paramAttributeSet, 16843720);
    b.a();
    paramContext = bf.a(getContext(), paramAttributeSet, a, 16843720, 0);
    setCheckMarkDrawable(paramContext.a(0));
    a.recycle();
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (b != null) {
      b.a();
    }
  }
  
  public final void setCheckMarkDrawable(int paramInt)
  {
    setCheckMarkDrawable(b.b(getContext(), paramInt));
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (b != null) {
      b.a(paramContext, paramInt);
    }
  }
}


/* Location:              android/support/v7/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */