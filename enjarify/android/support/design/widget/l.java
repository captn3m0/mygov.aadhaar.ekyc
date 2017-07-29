package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v7.c.a.a;

final class l
  extends a
{
  static final double a = Math.cos(Math.toRadians(45.0D));
  final Paint b;
  final Paint c;
  final RectF d;
  float e;
  Path f;
  float g;
  float h;
  float i;
  float j;
  float k;
  private boolean m;
  private final int n;
  private final int o;
  private final int p;
  private boolean q;
  private boolean r;
  
  public static float a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f1 = 1.5F;
    double d1;
    if (paramBoolean)
    {
      d1 = f1 * paramFloat1;
      double d2 = a;
      double d3 = 1.0D - d2;
      d2 = paramFloat2;
      d3 *= d2;
      d1 += d3;
    }
    for (f1 = (float)d1;; f1 *= paramFloat1) {
      return f1;
    }
  }
  
  public static float b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      double d1 = paramFloat1;
      double d2 = a;
      double d3 = 1.0D - d2;
      d2 = paramFloat2;
      d3 *= d2;
      d1 += d3;
      paramFloat1 = (float)d1;
    }
    return paramFloat1;
  }
  
  private static int b(float paramFloat)
  {
    int i1 = Math.round(paramFloat);
    int i2 = i1 % 2;
    int i3 = 1;
    if (i2 == i3) {
      i1 += -1;
    }
    return i1;
  }
  
  public final void a(float paramFloat)
  {
    float f1 = h;
    a(paramFloat, f1);
  }
  
  final void a(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    int i1 = 0;
    float f1 = 0.0F;
    boolean bool2 = paramFloat1 < 0.0F;
    if (!bool2)
    {
      bool2 = paramFloat2 < 0.0F;
      if (!bool2) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("invalid shadow size");
      throw localIllegalArgumentException;
    }
    int i2 = b(paramFloat1);
    float f2 = i2;
    i1 = b(paramFloat2);
    f1 = i1;
    boolean bool4 = f2 < f1;
    if (bool4)
    {
      boolean bool3 = r;
      if (!bool3) {
        r = bool1;
      }
      f2 = f1;
    }
    float f3 = j;
    bool4 = f3 < f2;
    if (!bool4)
    {
      f3 = h;
      bool4 = f3 < f1;
      if (bool4) {}
    }
    for (;;)
    {
      return;
      j = f2;
      h = f1;
      int i4 = 1069547520;
      f3 = 1.5F;
      int i3 = Math.round(f2 * f3);
      f2 = i3;
      i = f2;
      g = f1;
      m = bool1;
      invalidateSelf();
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    boolean bool1 = m;
    Object localObject1;
    float f1;
    RectF localRectF1;
    float f2;
    float f3;
    int i5;
    float f4;
    float f5;
    float f6;
    Object localObject2;
    int i6;
    int i8;
    int i9;
    Object localObject4;
    float f7;
    float f8;
    Object localObject5;
    float f9;
    float f10;
    int i11;
    Object localObject6;
    int i12;
    int i13;
    if (bool1)
    {
      localObject1 = getBounds();
      f1 = h * 1.5F;
      localRectF1 = d;
      f2 = left;
      f3 = h;
      f2 += f3;
      f3 = top + f1;
      i5 = right;
      f4 = i5;
      f5 = h;
      f4 -= f5;
      int i1 = bottom;
      f6 = i1 - f1;
      localRectF1.set(f2, f3, f4, f6);
      localObject1 = l;
      localObject2 = d;
      i6 = (int)left;
      localRectF1 = d;
      int i7 = (int)top;
      RectF localRectF2 = d;
      i8 = (int)right;
      Object localObject3 = d;
      f3 = bottom;
      i9 = (int)f3;
      ((Drawable)localObject1).setBounds(i6, i7, i8, i9);
      localObject4 = new android/graphics/RectF;
      f6 = -e;
      f1 = -e;
      f7 = e;
      f2 = e;
      ((RectF)localObject4).<init>(f6, f1, f7, f2);
      RectF localRectF3 = new android/graphics/RectF;
      localRectF3.<init>((RectF)localObject4);
      f6 = -i;
      f1 = -i;
      localRectF3.inset(f6, f1);
      localObject1 = f;
      if (localObject1 == null)
      {
        localObject1 = new android/graphics/Path;
        ((Path)localObject1).<init>();
        f = ((Path)localObject1);
        localObject1 = f;
        localObject2 = Path.FillType.EVEN_ODD;
        ((Path)localObject1).setFillType((Path.FillType)localObject2);
        localObject1 = f;
        f1 = -e;
        ((Path)localObject1).moveTo(f1, 0.0F);
        localObject1 = f;
        f1 = -i;
        localRectF1 = null;
        ((Path)localObject1).rLineTo(f1, 0.0F);
        f.arcTo(localRectF3, 180.0F, 90.0F, false);
        localObject1 = f;
        i6 = 1132920832;
        f1 = 270.0F;
        i7 = -1028390912;
        f7 = -90.0F;
        i8 = 0;
        localRectF2 = null;
        ((Path)localObject1).arcTo((RectF)localObject4, f1, f7, false);
        f.close();
        f2 = -top;
        f6 = 0.0F;
        localObject1 = null;
        boolean bool2 = f2 < 0.0F;
        if (bool2)
        {
          f5 = e / f2;
          i2 = 1065353216;
          f6 = (1.0F - f5) / 2.0F;
          f8 = f5 + f6;
          Paint localPaint1 = b;
          localObject1 = new android/graphics/RadialGradient;
          i6 = 0;
          f1 = 0.0F;
          localObject2 = null;
          i7 = 0;
          f7 = 0.0F;
          localRectF1 = null;
          i9 = 4;
          f3 = 5.6E-45F;
          localObject3 = new int[i9];
          localObject3[0] = 0;
          int i10 = n;
          localObject3[1] = i10;
          i10 = o;
          localObject3[2] = i10;
          i10 = p;
          localObject3[3] = i10;
          i5 = 4;
          f4 = 5.6E-45F;
          localObject5 = new float[i5];
          f9 = 0.0F;
          localObject5[0] = 0.0F;
          i10 = 1;
          f10 = Float.MIN_VALUE;
          localObject5[i10] = f5;
          localObject5[2] = f8;
          i11 = 3;
          f5 = 4.2E-45F;
          f8 = 1.0F;
          localObject5[i11] = f8;
          localObject6 = Shader.TileMode.CLAMP;
          ((RadialGradient)localObject1).<init>(0.0F, 0.0F, f2, (int[])localObject3, (float[])localObject5, (Shader.TileMode)localObject6);
          localPaint1.setShader((Shader)localObject1);
        }
        Paint localPaint2 = c;
        localObject1 = new android/graphics/LinearGradient;
        f7 = top;
        i8 = 0;
        f2 = 0.0F;
        localRectF2 = null;
        f3 = top;
        i5 = 3;
        f4 = 4.2E-45F;
        localObject5 = new int[i5];
        i12 = n;
        localObject5[0] = i12;
        i12 = o;
        localObject5[1] = i12;
        i12 = p;
        localObject5[2] = i12;
        i11 = 3;
        f5 = 4.2E-45F;
        localObject6 = new float[i11];
        Object tmp717_715 = localObject6;
        tmp717_715[0] = 0.0F;
        Object tmp721_717 = tmp717_715;
        tmp721_717[1] = 0.5F;
        tmp721_717[2] = 1.0F;
        localObject4 = Shader.TileMode.CLAMP;
        ((LinearGradient)localObject1).<init>(0.0F, f7, 0.0F, f3, (int[])localObject5, (float[])localObject6, (Shader.TileMode)localObject4);
        localPaint2.setShader((Shader)localObject1);
        localObject1 = c;
        i6 = 0;
        f1 = 0.0F;
        localObject2 = null;
        ((Paint)localObject1).setAntiAlias(false);
        int i2 = 0;
        f6 = 0.0F;
        localObject1 = null;
        m = false;
      }
    }
    else
    {
      i13 = paramCanvas.save();
      f6 = k;
      f1 = d.centerX();
      localRectF1 = d;
      f7 = localRectF1.centerY();
      paramCanvas.rotate(f6, f1, f7);
      f6 = -e;
      f1 = i;
      f7 = f6 - f1;
      f8 = e;
      localObject1 = d;
      f6 = ((RectF)localObject1).width();
      f1 = 2.0F * f8;
      f6 -= f1;
      i6 = 0;
      f1 = 0.0F;
      localObject2 = null;
      int i3 = f6 < 0.0F;
      if (i3 <= 0) {
        break label1815;
      }
      i3 = 1;
      f6 = Float.MIN_VALUE;
      i11 = i3;
      f5 = f6;
      label915:
      localObject1 = d;
      f6 = ((RectF)localObject1).height();
      f1 = 2.0F * f8;
      f6 -= f1;
      i6 = 0;
      f1 = 0.0F;
      localObject2 = null;
      i3 = f6 < 0.0F;
      if (i3 <= 0) {
        break label1834;
      }
      i3 = 1;
      f6 = Float.MIN_VALUE;
      i12 = i3;
    }
    for (;;)
    {
      f6 = j;
      f1 = j;
      i8 = 1048576000;
      f1 *= 0.25F;
      f6 -= f1;
      f1 = j;
      f2 = j;
      i9 = 1056964608;
      f2 *= 0.5F;
      f1 -= f2;
      f2 = j;
      f3 = j;
      i5 = 1065353216;
      f4 = 1.0F;
      f3 *= f4;
      f2 -= f3;
      f1 += f8;
      float f11 = f8 / f1;
      f6 += f8;
      f10 = f8 / f6;
      f6 = f8 + f2;
      f9 = f8 / f6;
      int i14 = paramCanvas.save();
      f6 = d.left + f8;
      f1 = d.top + f8;
      paramCanvas.translate(f6, f1);
      paramCanvas.scale(f11, f10);
      localObject1 = f;
      localObject2 = b;
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      if (i11 != 0)
      {
        i4 = 1065353216;
        f6 = 1.0F / f11;
        paramCanvas.scale(f6, 1.0F);
        i6 = 0;
        f1 = 0.0F;
        localObject2 = null;
        f6 = d.width();
        i8 = 1073741824;
        f2 = 2.0F * f8;
        f2 = f6 - f2;
        f6 = e;
        f3 = -f6;
        localObject5 = c;
        localObject1 = paramCanvas;
        paramCanvas.drawRect(0.0F, f7, f2, f3, (Paint)localObject5);
      }
      paramCanvas.restoreToCount(i14);
      i14 = paramCanvas.save();
      f6 = d.right - f8;
      f1 = d.bottom - f8;
      paramCanvas.translate(f6, f1);
      paramCanvas.scale(f11, f9);
      int i4 = 1127481344;
      f6 = 180.0F;
      paramCanvas.rotate(f6);
      localObject1 = f;
      localObject2 = b;
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      if (i11 != 0)
      {
        i4 = 1065353216;
        f6 = 1.0F / f11;
        paramCanvas.scale(f6, 1.0F);
        i6 = 0;
        f1 = 0.0F;
        localObject2 = null;
        f6 = d.width();
        i8 = 1073741824;
        f2 = 2.0F * f8;
        f2 = f6 - f2;
        f6 = -e;
        f3 = i + f6;
        localObject5 = c;
        localObject1 = paramCanvas;
        paramCanvas.drawRect(0.0F, f7, f2, f3, (Paint)localObject5);
      }
      paramCanvas.restoreToCount(i14);
      i11 = paramCanvas.save();
      f6 = d.left + f8;
      f1 = d.bottom - f8;
      paramCanvas.translate(f6, f1);
      paramCanvas.scale(f11, f9);
      i4 = 1132920832;
      f6 = 270.0F;
      paramCanvas.rotate(f6);
      localObject1 = f;
      localObject2 = b;
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      if (i12 != 0)
      {
        i4 = 1065353216;
        f6 = 1.0F / f9;
        paramCanvas.scale(f6, 1.0F);
        i6 = 0;
        f1 = 0.0F;
        localObject2 = null;
        f6 = d.height();
        i8 = 1073741824;
        f2 = 2.0F * f8;
        f2 = f6 - f2;
        f6 = e;
        f3 = -f6;
        localObject5 = c;
        localObject1 = paramCanvas;
        paramCanvas.drawRect(0.0F, f7, f2, f3, (Paint)localObject5);
      }
      paramCanvas.restoreToCount(i11);
      i11 = paramCanvas.save();
      f6 = d.right - f8;
      f1 = d.top + f8;
      paramCanvas.translate(f6, f1);
      paramCanvas.scale(f11, f10);
      i4 = 1119092736;
      f6 = 90.0F;
      paramCanvas.rotate(f6);
      localObject1 = f;
      localObject2 = b;
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      if (i12 != 0)
      {
        i4 = 1065353216;
        f6 = 1.0F / f10;
        paramCanvas.scale(f6, 1.0F);
        i6 = 0;
        f1 = 0.0F;
        localObject2 = null;
        f6 = d.height();
        i8 = 1073741824;
        f2 = 2.0F * f8;
        f2 = f6 - f2;
        f6 = e;
        f3 = -f6;
        localObject5 = c;
        localObject1 = paramCanvas;
        paramCanvas.drawRect(0.0F, f7, f2, f3, (Paint)localObject5);
      }
      paramCanvas.restoreToCount(i11);
      paramCanvas.restoreToCount(i13);
      super.draw(paramCanvas);
      return;
      localObject1 = f;
      ((Path)localObject1).reset();
      break;
      label1815:
      i4 = 0;
      f6 = 0.0F;
      localObject1 = null;
      i11 = 0;
      localObject6 = null;
      f5 = 0.0F;
      break label915;
      label1834:
      i4 = 0;
      f6 = 0.0F;
      localObject1 = null;
      i12 = 0;
      localObject4 = null;
    }
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    float f1 = h;
    float f2 = e;
    boolean bool1 = q;
    int i1 = (int)Math.ceil(a(f1, f2, bool1));
    f2 = h;
    float f3 = e;
    boolean bool2 = q;
    int i2 = (int)Math.ceil(b(f2, f3, bool2));
    paramRect.set(i2, i1, i2, i1);
    return true;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    m = true;
  }
  
  public final void setAlpha(int paramInt)
  {
    super.setAlpha(paramInt);
    b.setAlpha(paramInt);
    c.setAlpha(paramInt);
  }
}


/* Location:              android/support/design/widget/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */