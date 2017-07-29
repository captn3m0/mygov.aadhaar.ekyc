package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.c.a.a;

final class ao$a
  extends a
{
  boolean a = true;
  
  public ao$a(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    boolean bool = a;
    if (bool) {
      super.draw(paramCanvas);
    }
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    boolean bool = a;
    if (bool) {
      super.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = a;
    if (bool) {
      super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = a;
    if (bool) {}
    for (bool = super.setState(paramArrayOfInt);; bool = false) {
      return bool;
    }
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = a;
    if (bool) {}
    for (bool = super.setVisible(paramBoolean1, paramBoolean2);; bool = false) {
      return bool;
    }
  }
}


/* Location:              android/support/v7/widget/ao$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */