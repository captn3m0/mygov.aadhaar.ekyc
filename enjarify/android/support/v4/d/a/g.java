package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;

final class g
  extends f
{
  g(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  g(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
  }
  
  final d.a b()
  {
    g.a locala = new android/support/v4/d/a/g$a;
    d.a locala1 = b;
    locala.<init>(locala1);
    return locala;
  }
  
  protected final boolean c()
  {
    boolean bool1 = false;
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i == j)
    {
      Drawable localDrawable = c;
      boolean bool3 = localDrawable instanceof GradientDrawable;
      if (!bool3)
      {
        bool3 = localDrawable instanceof DrawableContainer;
        if (!bool3)
        {
          boolean bool2 = localDrawable instanceof InsetDrawable;
          if (!bool2) {
            return bool1;
          }
        }
      }
      bool1 = true;
    }
    return bool1;
  }
  
  public final Rect getDirtyBounds()
  {
    return c.getDirtyBounds();
  }
  
  public final void getOutline(Outline paramOutline)
  {
    c.getOutline(paramOutline);
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    c.setHotspot(paramFloat1, paramFloat2);
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    c.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = super.setState(paramArrayOfInt);
    if (bool) {
      invalidateSelf();
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void setTint(int paramInt)
  {
    boolean bool = c();
    if (bool) {
      super.setTint(paramInt);
    }
    for (;;)
    {
      return;
      Drawable localDrawable = c;
      localDrawable.setTint(paramInt);
    }
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    boolean bool = c();
    if (bool) {
      super.setTintList(paramColorStateList);
    }
    for (;;)
    {
      return;
      Drawable localDrawable = c;
      localDrawable.setTintList(paramColorStateList);
    }
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    boolean bool = c();
    if (bool) {
      super.setTintMode(paramMode);
    }
    for (;;)
    {
      return;
      Drawable localDrawable = c;
      localDrawable.setTintMode(paramMode);
    }
  }
}


/* Location:              android/support/v4/d/a/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */