package android.support.design.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

final class FloatingActionButton$b
  implements m
{
  FloatingActionButton$b(FloatingActionButton paramFloatingActionButton) {}
  
  public final float a()
  {
    return a.getSizeDimension() / 2.0F;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.c.set(paramInt1, paramInt2, paramInt3, paramInt4);
    FloatingActionButton localFloatingActionButton = a;
    int i = a.a + paramInt1;
    int j = a.a + paramInt2;
    int k = a.a + paramInt3;
    int m = a.a + paramInt4;
    localFloatingActionButton.setPadding(i, j, k, m);
  }
  
  public final void a(Drawable paramDrawable)
  {
    FloatingActionButton.a(a, paramDrawable);
  }
  
  public final boolean b()
  {
    return a.b;
  }
}


/* Location:              android/support/design/widget/FloatingActionButton$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */