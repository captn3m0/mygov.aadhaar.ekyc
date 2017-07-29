package android.support.v7.c.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

public class a
  extends Drawable
  implements Drawable.Callback
{
  public Drawable l;
  
  public a(Drawable paramDrawable)
  {
    Drawable localDrawable = l;
    if (localDrawable != null)
    {
      localDrawable = l;
      localDrawable.setCallback(null);
    }
    l = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    l.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    return l.getChangingConfigurations();
  }
  
  public Drawable getCurrent()
  {
    return l.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return l.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return l.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return l.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return l.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return l.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return l.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return l.getState();
  }
  
  public Region getTransparentRegion()
  {
    return l.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored()
  {
    return android.support.v4.d.a.a.b(l);
  }
  
  public boolean isStateful()
  {
    return l.isStateful();
  }
  
  public void jumpToCurrentState()
  {
    android.support.v4.d.a.a.a(l);
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    l.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    return l.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    l.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    android.support.v4.d.a.a.a(l, paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    l.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    l.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    l.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    l.setFilterBitmap(paramBoolean);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    android.support.v4.d.a.a.a(l, paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    android.support.v4.d.a.a.a(l, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    return l.setState(paramArrayOfInt);
  }
  
  public void setTint(int paramInt)
  {
    android.support.v4.d.a.a.a(l, paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    android.support.v4.d.a.a.a(l, paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    android.support.v4.d.a.a.a(l, paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable localDrawable;
    if (!bool)
    {
      localDrawable = l;
      bool = localDrawable.setVisible(paramBoolean1, paramBoolean2);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              android/support/v7/c/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */