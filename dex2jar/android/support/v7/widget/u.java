package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.o;
import android.support.v7.a.a.a;
import android.support.v7.b.a.b;
import android.util.AttributeSet;
import android.widget.RadioButton;

public final class u
  extends RadioButton
  implements o
{
  private l a = new l(this);
  
  public u(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.radioButtonStyle);
  }
  
  private u(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(bc.a(paramContext), paramAttributeSet, paramInt);
    a.a(paramAttributeSet, paramInt);
  }
  
  public final int getCompoundPaddingLeft()
  {
    int j = super.getCompoundPaddingLeft();
    int i = j;
    if (a != null) {
      i = a.a(j);
    }
    return i;
  }
  
  public final ColorStateList getSupportButtonTintList()
  {
    if (a != null) {
      return a.a;
    }
    return null;
  }
  
  public final PorterDuff.Mode getSupportButtonTintMode()
  {
    if (a != null) {
      return a.b;
    }
    return null;
  }
  
  public final void setButtonDrawable(int paramInt)
  {
    setButtonDrawable(b.b(getContext(), paramInt));
  }
  
  public final void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    if (a != null) {
      a.a();
    }
  }
  
  public final void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    if (a != null) {
      a.a(paramColorStateList);
    }
  }
  
  public final void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    if (a != null) {
      a.a(paramMode);
    }
  }
}


/* Location:              android/support/v7/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */