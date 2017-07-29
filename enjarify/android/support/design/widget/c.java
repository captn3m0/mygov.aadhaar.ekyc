package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
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
    int m = 1;
    float f1 = 1.0F;
    float f2 = 0.5F;
    RectF localRectF = null;
    boolean bool = g;
    if (bool)
    {
      Paint localPaint = a;
      Rect localRect1 = b;
      copyBounds(localRect1);
      f3 = d;
      f4 = localRect1.height();
      f3 /= f4;
      int[] arrayOfInt = new int[6];
      int i1 = i;
      int i2 = f;
      i1 = a.a(i1, i2);
      arrayOfInt[0] = i1;
      i1 = j;
      i2 = f;
      i1 = a.a(i1, i2);
      arrayOfInt[m] = i1;
      i2 = a.b(j, 0);
      int i3 = f;
      i2 = a.a(i2, i3);
      arrayOfInt[2] = i2;
      i2 = a.b(l, 0);
      i3 = f;
      i2 = a.a(i2, i3);
      arrayOfInt[3] = i2;
      i2 = l;
      i3 = f;
      i2 = a.a(i2, i3);
      arrayOfInt[4] = i2;
      i2 = k;
      i3 = f;
      i2 = a.a(i2, i3);
      arrayOfInt[5] = i2;
      float[] arrayOfFloat = new float[6];
      arrayOfFloat[0] = 0.0F;
      arrayOfFloat[m] = f3;
      arrayOfFloat[2] = f2;
      arrayOfFloat[3] = f2;
      f3 = f1 - f3;
      arrayOfFloat[4] = f3;
      int n = 5;
      f3 = 7.0E-45F;
      arrayOfFloat[n] = f1;
      localObject = new android/graphics/LinearGradient;
      i1 = top;
      f4 = i1;
      float f5 = bottom;
      Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
      localRect1 = null;
      f6 = 0.0F;
      ((LinearGradient)localObject).<init>(0.0F, f4, 0.0F, f5, arrayOfInt, arrayOfFloat, localTileMode);
      localPaint.setShader((Shader)localObject);
      g = false;
    }
    float f3 = a.getStrokeWidth() / 2.0F;
    localRectF = c;
    Rect localRect2 = b;
    copyBounds(localRect2);
    localRect2 = b;
    localRectF.set(localRect2);
    float f4 = left + f3;
    left = f4;
    f4 = top + f3;
    top = f4;
    f4 = right - f3;
    right = f4;
    f3 = bottom - f3;
    bottom = f3;
    paramCanvas.save();
    f3 = h;
    f4 = localRectF.centerX();
    float f6 = localRectF.centerY();
    paramCanvas.rotate(f3, f4, f6);
    Object localObject = a;
    paramCanvas.drawOval(localRectF, (Paint)localObject);
    paramCanvas.restore();
  }
  
  public final int getOpacity()
  {
    float f1 = d;
    boolean bool = f1 < 0.0F;
    int m;
    if (bool) {
      m = -3;
    }
    for (f1 = 0.0F / 0.0F;; f1 = 0.0F / 0.0F)
    {
      return m;
      m = -2;
    }
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    int m = Math.round(d);
    paramRect.set(m, m, m, m);
    return true;
  }
  
  public final boolean isStateful()
  {
    ColorStateList localColorStateList = e;
    if (localColorStateList != null)
    {
      localColorStateList = e;
      bool = localColorStateList.isStateful();
      if (bool) {}
    }
    else
    {
      bool = super.isStateful();
      if (!bool) {
        break label36;
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label36:
      bool = false;
      localColorStateList = null;
    }
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    g = true;
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    ColorStateList localColorStateList = e;
    if (localColorStateList != null)
    {
      localColorStateList = e;
      int m = f;
      int n = localColorStateList.getColorForState(paramArrayOfInt, m);
      m = f;
      if (n != m)
      {
        m = 1;
        g = m;
        f = n;
      }
    }
    boolean bool = g;
    if (bool) {
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */