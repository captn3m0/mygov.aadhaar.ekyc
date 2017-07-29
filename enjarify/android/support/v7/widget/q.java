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
  private h a;
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
    super((Context)localObject, paramAttributeSet, paramInt);
    localObject = new android/support/v7/widget/h;
    ((h)localObject).<init>(this);
    a = ((h)localObject);
    a.a(paramAttributeSet, paramInt);
    localObject = new android/support/v7/widget/p;
    ((p)localObject).<init>(this);
    b = ((p)localObject);
    b.a(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    h localh = a;
    if (localh != null)
    {
      localh = a;
      localh.d();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = a;
    if (localObject != null) {}
    for (localObject = a.b();; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = a;
    if (localObject != null) {}
    for (localObject = a.c();; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  public boolean hasOverlappingRendering()
  {
    p localp = b;
    boolean bool = localp.a();
    if (bool)
    {
      bool = super.hasOverlappingRendering();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localp = null;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    h localh = a;
    if (localh != null)
    {
      localh = a;
      localh.a();
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    h localh = a;
    if (localh != null)
    {
      localh = a;
      localh.a(paramInt);
    }
  }
  
  public void setImageResource(int paramInt)
  {
    b.a(paramInt);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    h localh = a;
    if (localh != null)
    {
      localh = a;
      localh.a(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    h localh = a;
    if (localh != null)
    {
      localh = a;
      localh.a(paramMode);
    }
  }
}


/* Location:              android/support/v7/widget/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */