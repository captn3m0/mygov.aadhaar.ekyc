package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class d
  extends Drawable
  implements Drawable.Callback, c, h
{
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  d.a b;
  Drawable c;
  private int d;
  private PorterDuff.Mode e;
  private boolean f;
  private boolean g;
  
  d(Drawable paramDrawable)
  {
    d.a locala = b();
    b = locala;
    a(paramDrawable);
  }
  
  d(d.a parama, Resources paramResources)
  {
    b = parama;
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b.b;
      if (localObject != null)
      {
        localObject = b.b.newDrawable(paramResources);
        a((Drawable)localObject);
      }
    }
  }
  
  private boolean a(int[] paramArrayOfInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = c();
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      ColorStateList localColorStateList = b.c;
      PorterDuff.Mode localMode1 = b.d;
      if ((localColorStateList != null) && (localMode1 != null))
      {
        int j = localColorStateList.getDefaultColor();
        int i = localColorStateList.getColorForState(paramArrayOfInt, j);
        boolean bool4 = f;
        if (bool4)
        {
          int k = d;
          if (i == k)
          {
            PorterDuff.Mode localMode2 = e;
            if (localMode1 == localMode2) {
              continue;
            }
          }
        }
        setColorFilter(i, localMode1);
        d = i;
        e = localMode1;
        f = bool1;
        bool2 = bool1;
      }
      else
      {
        f = false;
        clearColorFilter();
      }
    }
  }
  
  public final Drawable a()
  {
    return c;
  }
  
  public final void a(Drawable paramDrawable)
  {
    Object localObject = c;
    boolean bool1;
    Drawable.ConstantState localConstantState;
    if (localObject != null)
    {
      localObject = c;
      bool1 = false;
      localConstantState = null;
      ((Drawable)localObject).setCallback(null);
    }
    c = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      boolean bool2 = paramDrawable.isVisible();
      bool1 = true;
      setVisible(bool2, bool1);
      localObject = paramDrawable.getState();
      setState((int[])localObject);
      int i = paramDrawable.getLevel();
      setLevel(i);
      localObject = paramDrawable.getBounds();
      setBounds((Rect)localObject);
      localObject = b;
      if (localObject != null)
      {
        localObject = b;
        localConstantState = paramDrawable.getConstantState();
        b = localConstantState;
      }
    }
    invalidateSelf();
  }
  
  d.a b()
  {
    d.b localb = new android/support/v4/d/a/d$b;
    d.a locala = b;
    localb.<init>(locala);
    return localb;
  }
  
  protected boolean c()
  {
    return true;
  }
  
  public void draw(Canvas paramCanvas)
  {
    c.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    d.a locala = b;
    int j;
    if (locala != null)
    {
      locala = b;
      j = locala.getChangingConfigurations();
    }
    for (;;)
    {
      j |= i;
      i = c.getChangingConfigurations();
      return j | i;
      j = 0;
      locala = null;
    }
  }
  
  public Drawable.ConstantState getConstantState()
  {
    Object localObject = b;
    int i;
    if (localObject != null)
    {
      localObject = b.b;
      if (localObject != null)
      {
        i = 1;
        if (i == 0) {
          break label56;
        }
        localObject = b;
        int j = getChangingConfigurations();
        a = j;
      }
    }
    for (localObject = b;; localObject = null)
    {
      return (Drawable.ConstantState)localObject;
      i = 0;
      localObject = null;
      break;
      label56:
      i = 0;
    }
  }
  
  public Drawable getCurrent()
  {
    return c.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return c.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return c.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return c.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return c.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return c.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return c.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return c.getState();
  }
  
  public Region getTransparentRegion()
  {
    return c.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isStateful()
  {
    boolean bool = c();
    Object localObject;
    if (bool)
    {
      localObject = b;
      if (localObject != null)
      {
        localObject = b.c;
        if (localObject != null)
        {
          bool = ((ColorStateList)localObject).isStateful();
          if (bool) {}
        }
        else
        {
          localObject = c;
          bool = ((Drawable)localObject).isStateful();
          if (!bool) {
            break label64;
          }
        }
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
      break;
      label64:
      bool = false;
      localObject = null;
    }
  }
  
  public Drawable mutate()
  {
    boolean bool = g;
    d.a locala;
    if (!bool)
    {
      localObject = super.mutate();
      if (localObject == this)
      {
        localObject = b();
        b = ((d.a)localObject);
        localObject = c;
        if (localObject != null)
        {
          localObject = c;
          ((Drawable)localObject).mutate();
        }
        localObject = b;
        if (localObject != null)
        {
          locala = b;
          localObject = c;
          if (localObject == null) {
            break label93;
          }
        }
      }
    }
    for (Object localObject = c.getConstantState();; localObject = null)
    {
      b = ((Drawable.ConstantState)localObject);
      bool = true;
      g = bool;
      return this;
      label93:
      bool = false;
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = c;
    if (localDrawable != null)
    {
      localDrawable = c;
      localDrawable.setBounds(paramRect);
    }
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    return c.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    c.setAlpha(paramInt);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    c.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    c.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    c.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    c.setFilterBitmap(paramBoolean);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    Drawable localDrawable = c;
    boolean bool1 = localDrawable.setState(paramArrayOfInt);
    boolean bool2 = a(paramArrayOfInt);
    if ((bool2) || (bool1)) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localDrawable = null;
    }
  }
  
  public void setTint(int paramInt)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    setTintList(localColorStateList);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    b.c = paramColorStateList;
    int[] arrayOfInt = getState();
    a(arrayOfInt);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    b.d = paramMode;
    int[] arrayOfInt = getState();
    a(arrayOfInt);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable localDrawable;
    if (!bool)
    {
      localDrawable = c;
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


/* Location:              android/support/v4/d/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */