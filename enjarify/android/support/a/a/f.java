package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.a;
import android.support.v4.d.a.h;
import android.util.AttributeSet;

abstract class f
  extends Drawable
  implements h
{
  Drawable b;
  
  protected static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    TypedArray localTypedArray = null;
    if (paramTheme == null) {}
    for (localTypedArray = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);; localTypedArray = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0)) {
      return localTypedArray;
    }
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      a.a(localDrawable, paramTheme);
    }
  }
  
  public void clearColorFilter()
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.clearColorFilter();
    }
    for (;;)
    {
      return;
      super.clearColorFilter();
    }
  }
  
  public ColorFilter getColorFilter()
  {
    Object localObject = b;
    if (localObject != null) {}
    for (localObject = a.e(b);; localObject = null) {
      return (ColorFilter)localObject;
    }
  }
  
  public Drawable getCurrent()
  {
    Drawable localDrawable = b;
    if (localDrawable != null) {}
    for (localDrawable = b.getCurrent();; localDrawable = super.getCurrent()) {
      return localDrawable;
    }
  }
  
  public int getMinimumHeight()
  {
    Drawable localDrawable = b;
    if (localDrawable != null) {
      localDrawable = b;
    }
    for (int i = localDrawable.getMinimumHeight();; i = super.getMinimumHeight()) {
      return i;
    }
  }
  
  public int getMinimumWidth()
  {
    Drawable localDrawable = b;
    if (localDrawable != null) {
      localDrawable = b;
    }
    for (int i = localDrawable.getMinimumWidth();; i = super.getMinimumWidth()) {
      return i;
    }
  }
  
  public boolean getPadding(Rect paramRect)
  {
    Drawable localDrawable = b;
    if (localDrawable != null) {
      localDrawable = b;
    }
    for (boolean bool = localDrawable.getPadding(paramRect);; bool = super.getPadding(paramRect)) {
      return bool;
    }
  }
  
  public int[] getState()
  {
    Object localObject = b;
    if (localObject != null) {}
    for (localObject = b.getState();; localObject = super.getState()) {
      return (int[])localObject;
    }
  }
  
  public Region getTransparentRegion()
  {
    Object localObject = b;
    if (localObject != null) {}
    for (localObject = b.getTransparentRegion();; localObject = super.getTransparentRegion()) {
      return (Region)localObject;
    }
  }
  
  public void jumpToCurrentState()
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      a.a(localDrawable);
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.setBounds(paramRect);
    }
    for (;;)
    {
      return;
      super.onBoundsChange(paramRect);
    }
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = b;
    if (localDrawable != null) {
      localDrawable = b;
    }
    for (boolean bool = localDrawable.setLevel(paramInt);; bool = super.onLevelChange(paramInt)) {
      return bool;
    }
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.setChangingConfigurations(paramInt);
    }
    for (;;)
    {
      return;
      super.setChangingConfigurations(paramInt);
    }
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.setColorFilter(paramInt, paramMode);
    }
    for (;;)
    {
      return;
      super.setColorFilter(paramInt, paramMode);
    }
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.setFilterBitmap(paramBoolean);
    }
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      a.a(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      a.a(localDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    Drawable localDrawable = b;
    if (localDrawable != null) {
      localDrawable = b;
    }
    for (boolean bool = localDrawable.setState(paramArrayOfInt);; bool = super.setState(paramArrayOfInt)) {
      return bool;
    }
  }
}


/* Location:              android/support/a/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */