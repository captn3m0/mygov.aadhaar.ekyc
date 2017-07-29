package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a;

final class c
  extends Drawable
{
  final Paint a;
  final Rect b;
  final RectF c;
  float d;
  ColorStateList e;
  int f;
  boolean g;
  float h;
  private int i;
  private int j;
  private int k;
  private int l;
  
  public final void draw(Canvas paramCanvas)
  {
    if (g)
    {
      localObject1 = a;
      Object localObject2 = b;
      copyBounds((Rect)localObject2);
      f1 = d / ((Rect)localObject2).height();
      int m = a.a(i, f);
      int n = a.a(j, f);
      int i1 = a.a(a.b(j, 0), f);
      int i2 = a.a(a.b(l, 0), f);
      int i3 = a.a(l, f);
      int i4 = a.a(k, f);
      float f2 = top;
      float f3 = bottom;
      localObject2 = Shader.TileMode.CLAMP;
      ((Paint)localObject1).setShader(new LinearGradient(0.0F, f2, 0.0F, f3, new int[] { m, n, i1, i2, i3, i4 }, new float[] { 0.0F, f1, 0.5F, 0.5F, 1.0F - f1, 1.0F }, (Shader.TileMode)localObject2));
      g = false;
    }
    float f1 = a.getStrokeWidth() / 2.0F;
    Object localObject1 = c;
    copyBounds(b);
    ((RectF)localObject1).set(b);
    left += f1;
    top += f1;
    right -= f1;
    bottom -= f1;
    paramCanvas.save();
    paramCanvas.rotate(h, ((RectF)localObject1).centerX(), ((RectF)localObject1).centerY());
    paramCanvas.drawOval((RectF)localObject1, a);
    paramCanvas.restore();
  }
  
  public final int getOpacity()
  {
    if (d > 0.0F) {
      return -3;
    }
    return -2;
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    int m = Math.round(d);
    paramRect.set(m, m, m, m);
    return true;
  }
  
  public final boolean isStateful()
  {
    return ((e != null) && (e.isStateful())) || (super.isStateful());
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    g = true;
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (e != null)
    {
      int m = e.getColorForState(paramArrayOfInt, f);
      if (m != f)
      {
        g = true;
        f = m;
      }
    }
    if (g) {
      invalidateSelf();
    }
    return g;
  }
  
  public final void setAlpha(int paramInt)
  {
    a.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    a.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:              android/support/design/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */