package android.support.v7.c.a;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.a;
import android.support.v7.a.a.a;
import android.support.v7.a.a.i;
import android.support.v7.a.a.j;

public final class b
  extends Drawable
{
  private static final float c = (float)Math.toRadians(45.0D);
  public float a;
  private final Paint b;
  private float d;
  private float e;
  private float f;
  private float g;
  private boolean h;
  private final Path i;
  private final int j;
  private boolean k;
  private float l;
  private int m;
  
  public b(Context paramContext)
  {
    Object localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    b = ((Paint)localObject1);
    localObject1 = new android/graphics/Path;
    ((Path)localObject1).<init>();
    i = ((Path)localObject1);
    k = false;
    int n = 2;
    m = n;
    localObject1 = b;
    Object localObject2 = Paint.Style.STROKE;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    localObject1 = b;
    localObject2 = Paint.Join.MITER;
    ((Paint)localObject1).setStrokeJoin((Paint.Join)localObject2);
    localObject1 = b;
    localObject2 = Paint.Cap.BUTT;
    ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
    b.setAntiAlias(bool1);
    localObject1 = paramContext.getTheme();
    float f1 = 0.0F;
    localObject2 = null;
    Object localObject3 = a.j.DrawerArrowToggle;
    int i1 = a.a.drawerArrowStyle;
    int i2 = a.i.Base_Widget_AppCompat_DrawerArrowToggle;
    localObject1 = ((Resources.Theme)localObject1).obtainStyledAttributes(null, (int[])localObject3, i1, i2);
    int i3 = a.j.DrawerArrowToggle_color;
    i3 = ((TypedArray)localObject1).getColor(i3, 0);
    localObject3 = b;
    int i5 = ((Paint)localObject3).getColor();
    if (i3 != i5)
    {
      localObject3 = b;
      ((Paint)localObject3).setColor(i3);
      invalidateSelf();
    }
    i3 = a.j.DrawerArrowToggle_thickness;
    f1 = ((TypedArray)localObject1).getDimension(i3, 0.0F);
    localObject3 = b;
    float f2 = ((Paint)localObject3).getStrokeWidth();
    boolean bool3 = f2 < f1;
    if (bool3)
    {
      localObject3 = b;
      ((Paint)localObject3).setStrokeWidth(f1);
      int i6 = 1073741824;
      f2 = 2.0F;
      double d1 = f1 / f2;
      double d2 = Math.cos(c);
      d1 *= d2;
      f1 = (float)d1;
      l = f1;
      invalidateSelf();
    }
    i3 = a.j.DrawerArrowToggle_spinBars;
    boolean bool2 = ((TypedArray)localObject1).getBoolean(i3, bool1);
    boolean bool4 = h;
    if (bool4 != bool2)
    {
      h = bool2;
      invalidateSelf();
    }
    int i4 = a.j.DrawerArrowToggle_gapBetweenBars;
    i4 = Math.round(((TypedArray)localObject1).getDimension(i4, 0.0F));
    f1 = i4;
    f2 = g;
    bool4 = f1 < f2;
    if (bool4)
    {
      g = f1;
      invalidateSelf();
    }
    i4 = a.j.DrawerArrowToggle_drawableSize;
    i4 = ((TypedArray)localObject1).getDimensionPixelSize(i4, 0);
    j = i4;
    i4 = a.j.DrawerArrowToggle_barLength;
    f1 = Math.round(((TypedArray)localObject1).getDimension(i4, 0.0F));
    e = f1;
    i4 = a.j.DrawerArrowToggle_arrowHeadLength;
    f1 = Math.round(((TypedArray)localObject1).getDimension(i4, 0.0F));
    d = f1;
    i4 = a.j.DrawerArrowToggle_arrowShaftLength;
    f1 = ((TypedArray)localObject1).getDimension(i4, 0.0F);
    f = f1;
    ((TypedArray)localObject1).recycle();
  }
  
  public final void a(boolean paramBoolean)
  {
    boolean bool = k;
    if (bool != paramBoolean)
    {
      k = paramBoolean;
      invalidateSelf();
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int n = m;
    int i1;
    float f1;
    float f2;
    float f3;
    Paint localPaint1;
    label264:
    label276:
    int i3;
    switch (n)
    {
    case 2: 
    default: 
      n = a.g(this);
      i1 = 1;
      f1 = Float.MIN_VALUE;
      if (n == i1)
      {
        n = 1;
        f2 = Float.MIN_VALUE;
        f1 = d;
        f3 = d;
        f1 *= f3;
        int i2 = 1073741824;
        double d1 = Math.sqrt(f1 * 2.0F);
        f1 = (float)d1;
        f3 = e;
        float f4 = a;
        f1 = (f1 - f3) * f4;
        f4 = f3 + f1;
        f1 = e;
        f3 = f;
        float f5 = a;
        f3 = (f3 - f1) * f5;
        f5 = f1 + f3;
        f3 = l;
        float f6 = a;
        Path localPath1 = null;
        f3 = (f3 - 0.0F) * f6;
        f6 = Math.round(0.0F + f3);
        i1 = 0;
        f1 = 0.0F;
        localPaint1 = null;
        f3 = c;
        float f7 = a;
        float f8 = 0.0F;
        Paint localPaint2 = null;
        f3 = (f3 - 0.0F) * f7;
        f7 = 0.0F + f3;
        if (n == 0) {
          break label815;
        }
        i1 = 0;
        f1 = 0.0F;
        localPaint1 = null;
        i2 = 0;
        Paint localPaint3 = null;
        f3 = 0.0F;
        if (n == 0) {
          break label836;
        }
        i1 = 1127481344;
        f1 = 180.0F;
        f8 = a;
        f1 = (f1 - f3) * f8 + f3;
        double d2 = f4;
        double d3 = Math.cos(f7);
        f3 = (float)Math.round(d2 * d3);
        d2 = f4;
        d3 = Math.sin(f7);
        f4 = (float)Math.round(d2 * d3);
        localPath1 = i;
        localPath1.rewind();
        f7 = g;
        localPaint2 = b;
        f8 = localPaint2.getStrokeWidth();
        f7 += f8;
        f8 = -l;
        float f9 = a;
        f8 = (f8 - f7) * f9;
        f7 += f8;
        f8 = -f5;
        f9 = 2.0F;
        f8 /= f9;
        Path localPath2 = i;
        float f10 = f8 + f6;
        localPath2.moveTo(f10, 0.0F);
        localPath2 = i;
        f10 = 2.0F;
        f6 *= f10;
        f5 -= f6;
        localPath2.rLineTo(f5, 0.0F);
        i.moveTo(f8, f7);
        i.rLineTo(f3, f4);
        Path localPath3 = i;
        f6 = -f7;
        localPath3.moveTo(f8, f6);
        localPath3 = i;
        f4 = -f4;
        localPath3.rLineTo(f3, f4);
        i.close();
        paramCanvas.save();
        localPaint3 = b;
        f3 = localPaint3.getStrokeWidth();
        f4 = localRect.height();
        f5 = 3.0F * f3;
        f4 -= f5;
        f5 = g;
        f6 = 2.0F;
        f5 *= f6;
        int i4 = (int)(f4 - f5) / 4 * 2;
        f4 = i4;
        d1 = f4;
        double d4 = f3;
        d4 *= 1.5D;
        d2 = g;
        d4 += d2;
        d1 += d4;
        f3 = (float)d1;
        int i5 = localRect.centerX();
        float f11 = i5;
        paramCanvas.translate(f11, f3);
        i3 = h;
        if (i3 == 0) {
          break label857;
        }
        i3 = k;
        n ^= i3;
        if (n == 0) {
          break label848;
        }
        n = -1;
        f2 = 0.0F / 0.0F;
        label717:
        f2 = n * f1;
        paramCanvas.rotate(f2);
      }
      break;
    }
    for (;;)
    {
      Path localPath4 = i;
      localPaint1 = b;
      paramCanvas.drawPath(localPath4, localPaint1);
      paramCanvas.restore();
      return;
      n = 0;
      f2 = 0.0F;
      localPath4 = null;
      break;
      n = 1;
      f2 = Float.MIN_VALUE;
      break;
      n = a.g(this);
      if (n == 0)
      {
        n = 1;
        f2 = Float.MIN_VALUE;
        break;
      }
      n = 0;
      f2 = 0.0F;
      localPath4 = null;
      break;
      n = 0;
      f2 = 0.0F;
      localPath4 = null;
      break;
      label815:
      i1 = -1020002304;
      f1 = -180.0F;
      i3 = i1;
      f3 = f1;
      break label264;
      label836:
      i1 = 0;
      f1 = 0.0F;
      localPaint1 = null;
      break label276;
      label848:
      n = 1;
      f2 = Float.MIN_VALUE;
      break label717;
      label857:
      if (n != 0)
      {
        n = 1127481344;
        f2 = 180.0F;
        paramCanvas.rotate(f2);
      }
    }
  }
  
  public final int getIntrinsicHeight()
  {
    return j;
  }
  
  public final int getIntrinsicWidth()
  {
    return j;
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final void setAlpha(int paramInt)
  {
    Paint localPaint = b;
    int n = localPaint.getAlpha();
    if (paramInt != n)
    {
      localPaint = b;
      localPaint.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    b.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:              android/support/v7/c/a/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */