package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.h.u;
import android.util.AttributeSet;
import android.widget.EditText;

public final class n
  extends EditText
  implements u
{
  private h a;
  private z b;
  
  public n(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  private n(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject, paramAttributeSet, paramInt);
    localObject = new android/support/v7/widget/h;
    ((h)localObject).<init>(this);
    a = ((h)localObject);
    a.a(paramAttributeSet, paramInt);
    localObject = z.a(this);
    b = ((z)localObject);
    b.a(paramAttributeSet, paramInt);
    b.a();
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = a;
    if (localObject != null)
    {
      localObject = a;
      ((h)localObject).d();
    }
    localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((z)localObject).a();
    }
  }
  
  public final ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = a;
    if (localObject != null) {}
    for (localObject = a.b();; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  public final PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = a;
    if (localObject != null) {}
    for (localObject = a.c();; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    h localh = a;
    if (localh != null)
    {
      localh = a;
      localh.a();
    }
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    h localh = a;
    if (localh != null)
    {
      localh = a;
      localh.a(paramInt);
    }
  }
  
  public final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    h localh = a;
    if (localh != null)
    {
      localh = a;
      localh.a(paramColorStateList);
    }
  }
  
  public final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    h localh = a;
    if (localh != null)
    {
      localh = a;
      localh.a(paramMode);
    }
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    z localz = b;
    if (localz != null)
    {
      localz = b;
      localz.a(paramContext, paramInt);
    }
  }
}


/* Location:              android/support/v7/widget/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */