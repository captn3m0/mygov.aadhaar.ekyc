package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.h.u;
import android.util.AttributeSet;
import android.widget.ImageView;

public class q
  extends ImageView
  implements u
{
  private h a = new h(this);
  private p b;
  
  public q(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public q(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public q(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(bc.a(paramContext), paramAttributeSet, paramInt);
    a.a(paramAttributeSet, paramInt);
    b = new p(this);
    b.a(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (a != null) {
      a.d();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    if (a != null) {
      return a.b();
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (a != null) {
      return a.c();
    }
    return null;
  }
  
  public boolean hasOverlappingRendering()
  {
    return (b.a()) && (super.hasOverlappingRendering());
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (a != null) {
      a.a();
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (a != null) {
      a.a(paramInt);
    }
  }
  
  public void setImageResource(int paramInt)
  {
    b.a(paramInt);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (a != null) {
      a.a(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (a != null) {
      a.a(paramMode);
    }
  }
}


/* Location:              android/support/v7/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */