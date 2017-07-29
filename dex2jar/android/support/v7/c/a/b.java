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
  private final Paint b = new Paint();
  private float d;
  private float e;
  private float f;
  private float g;
  private boolean h;
  private final Path i = new Path();
  private final int j;
  private boolean k = false;
  private float l;
  private int m = 2;
  
  public b(Context paramContext)
  {
    b.setStyle(Paint.Style.STROKE);
    b.setStrokeJoin(Paint.Join.MITER);
    b.setStrokeCap(Paint.Cap.BUTT);
    b.setAntiAlias(true);
    paramContext = paramContext.getTheme().obtainStyledAttributes(null, a.j.DrawerArrowToggle, a.a.drawerArrowStyle, a.i.Base_Widget_AppCompat_DrawerArrowToggle);
    int n = paramContext.getColor(a.j.DrawerArrowToggle_color, 0);
    if (n != b.getColor())
    {
      b.setColor(n);
      invalidateSelf();
    }
    float f1 = paramContext.getDimension(a.j.DrawerArrowToggle_thickness, 0.0F);
    if (b.getStrokeWidth() != f1)
    {
      b.setStrokeWidth(f1);
      l = ((float)(f1 / 2.0F * Math.cos(c)));
      invalidateSelf();
    }
    boolean bool = paramContext.getBoolean(a.j.DrawerArrowToggle_spinBars, true);
    if (h != bool)
    {
      h = bool;
      invalidateSelf();
    }
    f1 = Math.round(paramContext.getDimension(a.j.DrawerArrowToggle_gapBetweenBars, 0.0F));
    if (f1 != g)
    {
      g = f1;
      invalidateSelf();
    }
    j = paramContext.getDimensionPixelSize(a.j.DrawerArrowToggle_drawableSize, 0);
    e = Math.round(paramContext.getDimension(a.j.DrawerArrowToggle_barLength, 0.0F));
    d = Math.round(paramContext.getDimension(a.j.DrawerArrowToggle_arrowHeadLength, 0.0F));
    f = paramContext.getDimension(a.j.DrawerArrowToggle_arrowShaftLength, 0.0F);
    paramContext.recycle();
  }
  
  public final void a(boolean paramBoolean)
  {
    if (k != paramBoolean)
    {
      k = paramBoolean;
      invalidateSelf();
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int n;
    float f1;
    float f2;
    switch (m)
    {
    case 2: 
    default: 
      if (a.g(this) == 1)
      {
        n = 1;
        f1 = (float)Math.sqrt(d * d * 2.0F);
        f2 = e;
        float f6 = f2 + (f1 - f2) * a;
        f1 = e;
        float f3 = f1 + (f - f1) * a;
        float f4 = Math.round(0.0F + (l - 0.0F) * a);
        float f7 = 0.0F + (c - 0.0F) * a;
        if (n == 0) {
          break label477;
        }
        f1 = 0.0F;
        label145:
        if (n == 0) {
          break label484;
        }
        f2 = 180.0F;
        label153:
        float f5 = a;
        float f8 = (float)Math.round(f6 * Math.cos(f7));
        f6 = (float)Math.round(f6 * Math.sin(f7));
        i.rewind();
        f7 = g + b.getStrokeWidth();
        f7 += (-l - f7) * a;
        float f9 = -f3 / 2.0F;
        i.moveTo(f9 + f4, 0.0F);
        i.rLineTo(f3 - f4 * 2.0F, 0.0F);
        i.moveTo(f9, f7);
        i.rLineTo(f8, f6);
        i.moveTo(f9, -f7);
        i.rLineTo(f8, -f6);
        i.close();
        paramCanvas.save();
        f3 = b.getStrokeWidth();
        f3 = (float)((int)(localRect.height() - 3.0F * f3 - g * 2.0F) / 4 * 2 + (f3 * 1.5D + g));
        paramCanvas.translate(localRect.centerX(), f3);
        if (!h) {
          break label495;
        }
        if ((n ^ k) == 0) {
          break label489;
        }
        n = -1;
        label407:
        paramCanvas.rotate(n * ((f2 - f1) * f5 + f1));
      }
      break;
    }
    for (;;)
    {
      paramCanvas.drawPath(i, b);
      paramCanvas.restore();
      return;
      n = 0;
      break;
      n = 1;
      break;
      if (a.g(this) == 0)
      {
        n = 1;
        break;
      }
      n = 0;
      break;
      n = 0;
      break;
      label477:
      f1 = -180.0F;
      break label145;
      label484:
      f2 = 0.0F;
      break label153;
      label489:
      n = 1;
      break label407;
      label495:
      if (n != 0) {
        paramCanvas.rotate(180.0F);
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
    if (paramInt != b.getAlpha())
    {
      b.setAlpha(paramInt);
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */