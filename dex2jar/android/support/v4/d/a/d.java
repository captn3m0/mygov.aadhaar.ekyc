package android.support.v4.d.a;

import android.annotation.TargetApi;
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

@TargetApi(9)
class d
  extends Drawable
  implements Drawable.Callback, c, h
{
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  a b;
  Drawable c;
  private int d;
  private PorterDuff.Mode e;
  private boolean f;
  private boolean g;
  
  d(Drawable paramDrawable)
  {
    b = b();
    a(paramDrawable);
  }
  
  d(a parama, Resources paramResources)
  {
    b = parama;
    if ((b != null) && (b.b != null)) {
      a(b.b.newDrawable(paramResources));
    }
  }
  
  private boolean a(int[] paramArrayOfInt)
  {
    if (!c()) {}
    PorterDuff.Mode localMode;
    int i;
    do
    {
      return false;
      ColorStateList localColorStateList = b.c;
      localMode = b.d;
      if ((localColorStateList == null) || (localMode == null)) {
        break;
      }
      i = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
    } while ((f) && (i == d) && (localMode == e));
    setColorFilter(i, localMode);
    d = i;
    e = localMode;
    f = true;
    return true;
    f = false;
    clearColorFilter();
    return false;
  }
  
  public final Drawable a()
  {
    return c;
  }
  
  public final void a(Drawable paramDrawable)
  {
    if (c != null) {
      c.setCallback(null);
    }
    c = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      setVisible(paramDrawable.isVisible(), true);
      setState(paramDrawable.getState());
      setLevel(paramDrawable.getLevel());
      setBounds(paramDrawable.getBounds());
      if (b != null) {
        b.b = paramDrawable.getConstantState();
      }
    }
    invalidateSelf();
  }
  
  a b()
  {
    return new b(b);
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
    int j = super.getChangingConfigurations();
    if (b != null) {}
    for (int i = b.getChangingConfigurations();; i = 0) {
      return i | j | c.getChangingConfigurations();
    }
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if (b != null)
    {
      if (b.b != null) {}
      for (int i = 1; i != 0; i = 0)
      {
        b.a = getChangingConfigurations();
        return b;
      }
    }
    return null;
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
    if ((c()) && (b != null)) {}
    for (ColorStateList localColorStateList = b.c; ((localColorStateList != null) && (localColorStateList.isStateful())) || (c.isStateful()); localColorStateList = null) {
      return true;
    }
    return false;
  }
  
  public Drawable mutate()
  {
    a locala;
    if ((!g) && (super.mutate() == this))
    {
      b = b();
      if (c != null) {
        c.mutate();
      }
      if (b != null)
      {
        locala = b;
        if (c == null) {
          break label77;
        }
      }
    }
    label77:
    for (Drawable.ConstantState localConstantState = c.getConstantState();; localConstantState = null)
    {
      b = localConstantState;
      g = true;
      return this;
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (c != null) {
      c.setBounds(paramRect);
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
    boolean bool = c.setState(paramArrayOfInt);
    return (a(paramArrayOfInt)) || (bool);
  }
  
  public void setTint(int paramInt)
  {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    b.c = paramColorStateList;
    a(getState());
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    b.d = paramMode;
    a(getState());
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (super.setVisible(paramBoolean1, paramBoolean2)) || (c.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
  
  protected static abstract class a
    extends Drawable.ConstantState
  {
    int a;
    Drawable.ConstantState b;
    ColorStateList c = null;
    PorterDuff.Mode d = d.a;
    
    a(a parama)
    {
      if (parama != null)
      {
        a = a;
        b = b;
        c = c;
        d = d;
      }
    }
    
    public int getChangingConfigurations()
    {
      int j = a;
      if (b != null) {}
      for (int i = b.getChangingConfigurations();; i = 0) {
        return i | j;
      }
    }
    
    public Drawable newDrawable()
    {
      return newDrawable(null);
    }
    
    public abstract Drawable newDrawable(Resources paramResources);
  }
  
  private static final class b
    extends d.a
  {
    b(d.a parama)
    {
      super();
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new d(this, paramResources);
    }
  }
}


/* Location:              android/support/v4/d/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */