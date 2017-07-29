package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.o;
import android.support.v7.b.a.b;
import android.util.AttributeSet;
import android.widget.RadioButton;

public final class u
  extends RadioButton
  implements o
{
  private l a;
  
  public u(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  private u(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject, paramAttributeSet, paramInt);
    localObject = new android/support/v7/widget/l;
    ((l)localObject).<init>(this);
    a = ((l)localObject);
    a.a(paramAttributeSet, paramInt);
  }
  
  public final int getCompoundPaddingLeft()
  {
    int i = super.getCompoundPaddingLeft();
    l locall = a;
    if (locall != null)
    {
      locall = a;
      i = locall.a(i);
    }
    return i;
  }
  
  public final ColorStateList getSupportButtonTintList()
  {
    Object localObject = a;
    if (localObject != null) {}
    for (localObject = a.a;; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  public final PorterDuff.Mode getSupportButtonTintMode()
  {
    Object localObject = a;
    if (localObject != null) {}
    for (localObject = a.b;; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  public final void setButtonDrawable(int paramInt)
  {
    Drawable localDrawable = b.b(getContext(), paramInt);
    setButtonDrawable(localDrawable);
  }
  
  public final void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    l locall = a;
    if (locall != null)
    {
      locall = a;
      locall.a();
    }
  }
  
  public final void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    l locall = a;
    if (locall != null)
    {
      locall = a;
      locall.a(paramColorStateList);
    }
  }
  
  public final void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    l locall = a;
    if (locall != null)
    {
      locall = a;
      locall.a(paramMode);
    }
  }
}


/* Location:              android/support/v7/widget/u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */