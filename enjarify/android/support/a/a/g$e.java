package android.support.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.g.a;
import java.util.ArrayList;

final class g$e
{
  private static final Matrix k;
  final g.c a;
  float b;
  float c;
  float d;
  float e;
  int f;
  String g;
  final a h;
  private final Path i;
  private final Path j;
  private final Matrix l;
  private Paint m;
  private Paint n;
  private PathMeasure o;
  private int p;
  
  static
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    k = localMatrix;
  }
  
  public g$e()
  {
    Object localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    l = ((Matrix)localObject);
    b = 0.0F;
    c = 0.0F;
    d = 0.0F;
    e = 0.0F;
    f = 255;
    g = null;
    localObject = new android/support/v4/g/a;
    ((a)localObject).<init>();
    h = ((a)localObject);
    localObject = new android/support/a/a/g$c;
    ((g.c)localObject).<init>();
    a = ((g.c)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    i = ((Path)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    j = ((Path)localObject);
  }
  
  public g$e(e parame)
  {
    Object localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    l = ((Matrix)localObject1);
    b = 0.0F;
    c = 0.0F;
    d = 0.0F;
    e = 0.0F;
    f = 255;
    g = null;
    localObject1 = new android/support/v4/g/a;
    ((a)localObject1).<init>();
    h = ((a)localObject1);
    localObject1 = new android/support/a/a/g$c;
    Object localObject2 = a;
    a locala = h;
    ((g.c)localObject1).<init>((g.c)localObject2, locala);
    a = ((g.c)localObject1);
    localObject1 = new android/graphics/Path;
    localObject2 = i;
    ((Path)localObject1).<init>((Path)localObject2);
    i = ((Path)localObject1);
    localObject1 = new android/graphics/Path;
    localObject2 = j;
    ((Path)localObject1).<init>((Path)localObject2);
    j = ((Path)localObject1);
    float f1 = b;
    b = f1;
    f1 = c;
    c = f1;
    f1 = d;
    d = f1;
    f1 = e;
    e = f1;
    int i1 = p;
    p = i1;
    i1 = f;
    f = i1;
    localObject1 = g;
    g = ((String)localObject1);
    localObject1 = g;
    if (localObject1 != null)
    {
      localObject1 = h;
      localObject2 = g;
      ((a)localObject1).put(localObject2, this);
    }
  }
  
  private void a(g.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    a.set(paramMatrix);
    Object localObject1 = a;
    Object localObject2 = d;
    ((Matrix)localObject1).preConcat((Matrix)localObject2);
    paramCanvas.save();
    int i1 = 0;
    float f1 = 0.0F;
    localObject1 = null;
    int i3 = 0;
    localObject1 = b;
    i1 = ((ArrayList)localObject1).size();
    if (i3 < i1)
    {
      localObject1 = b;
      localObject2 = ((ArrayList)localObject1).get(i3);
      boolean bool1 = localObject2 instanceof g.c;
      Object localObject3;
      Object localObject4;
      if (bool1)
      {
        localObject2 = (g.c)localObject2;
        localObject3 = a;
        localObject1 = this;
        int i4 = paramInt1;
        localObject4 = paramColorFilter;
        a((g.c)localObject2, (Matrix)localObject3, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      }
      float f3;
      Object localObject5;
      int i8;
      float f6;
      float f7;
      int i10;
      for (;;)
      {
        int i2 = i3 + 1;
        i3 = i2;
        break;
        boolean bool2 = localObject2 instanceof g.d;
        if (bool2)
        {
          localObject2 = (g.d)localObject2;
          f1 = paramInt1;
          float f2 = d;
          f1 /= f2;
          f2 = paramInt2;
          f3 = e;
          f2 /= f3;
          f3 = Math.min(f1, f2);
          localObject5 = a;
          l.set((Matrix)localObject5);
          l.postScale(f1, f2);
          localObject1 = new float[4];
          Object tmp242_240 = localObject1;
          Object tmp243_242 = tmp242_240;
          Object tmp243_242 = tmp242_240;
          tmp243_242[0] = 0.0F;
          tmp243_242[1] = 1.0F;
          tmp243_242[2] = 1.0F;
          tmp243_242[3] = 0.0F;
          ((Matrix)localObject5).mapVectors((float[])localObject1);
          localObject3 = null;
          double d1 = localObject1[0];
          boolean bool4 = true;
          double d2 = localObject1[bool4];
          f2 = (float)Math.hypot(d1, d2);
          d1 = localObject1[2];
          d2 = localObject1[3];
          d1 = Math.hypot(d1, d2);
          f4 = (float)d1;
          localMatrix = null;
          f5 = localObject1[0];
          i8 = 1;
          f6 = localObject1[i8];
          int i9 = 2;
          f7 = localObject1[i9];
          i10 = 3;
          f1 = localObject1[i10] * f5;
          f5 = f6 * f7;
          f5 = f1 - f5;
          f2 = Math.max(f2, f4);
          bool2 = false;
          f1 = 0.0F;
          localObject1 = null;
          f4 = 0.0F;
          localObject5 = null;
          bool3 = f2 < 0.0F;
          if (bool3) {
            f1 = Math.abs(f5) / f2;
          }
          f2 = 0.0F;
          localObject3 = null;
          bool4 = f1 < 0.0F;
          if (bool4)
          {
            localObject3 = i;
            ((g.d)localObject2).a((Path)localObject3);
            localObject3 = i;
            localObject5 = j;
            ((Path)localObject5).reset();
            bool3 = ((g.d)localObject2).a();
            if (!bool3) {
              break label521;
            }
            localObject1 = j;
            localObject2 = l;
            ((Path)localObject1).addPath((Path)localObject3, (Matrix)localObject2);
            localObject1 = j;
            paramCanvas.clipPath((Path)localObject1);
          }
        }
      }
      label521:
      localObject2 = (g.b)localObject2;
      float f4 = g;
      float f5 = 0.0F;
      Matrix localMatrix = null;
      boolean bool3 = f4 < 0.0F;
      boolean bool5;
      if (!bool3)
      {
        f4 = h;
        f5 = 1.0F;
        bool3 = f4 < f5;
        if (!bool3) {}
      }
      else
      {
        f4 = g;
        f5 = i;
        f4 = (f4 + f5) % 1.0F;
        f5 = h;
        f6 = i;
        f5 += f6;
        i8 = 1065353216;
        f6 = 1.0F;
        f5 %= f6;
        localObject4 = o;
        if (localObject4 == null)
        {
          localObject4 = new android/graphics/PathMeasure;
          ((PathMeasure)localObject4).<init>();
          o = ((PathMeasure)localObject4);
        }
        localObject4 = o;
        Object localObject6 = i;
        i10 = 0;
        ((PathMeasure)localObject4).setPath((Path)localObject6, false);
        localObject4 = o;
        f6 = ((PathMeasure)localObject4).getLength();
        f4 *= f6;
        f5 *= f6;
        ((Path)localObject3).reset();
        bool5 = f4 < f5;
        if (!bool5) {
          break label1197;
        }
        localObject6 = o;
        i10 = 1;
        ((PathMeasure)localObject6).getSegment(f4, f6, (Path)localObject3, i10);
        localObject5 = o;
        i8 = 0;
        f6 = 0.0F;
        localObject4 = null;
        bool5 = true;
        f7 = Float.MIN_VALUE;
        ((PathMeasure)localObject5).getSegment(0.0F, f5, (Path)localObject3, bool5);
      }
      for (;;)
      {
        bool3 = false;
        f4 = 0.0F;
        localObject5 = null;
        f5 = 0.0F;
        localMatrix = null;
        ((Path)localObject3).rLineTo(0.0F, 0.0F);
        localObject5 = j;
        localMatrix = l;
        ((Path)localObject5).addPath((Path)localObject3, localMatrix);
        int i7 = c;
        int i5;
        if (i7 != 0)
        {
          localObject3 = n;
          if (localObject3 == null)
          {
            localObject3 = new android/graphics/Paint;
            ((Paint)localObject3).<init>();
            n = ((Paint)localObject3);
            localObject3 = n;
            localObject5 = Paint.Style.FILL;
            ((Paint)localObject3).setStyle((Paint.Style)localObject5);
            localObject3 = n;
            bool3 = true;
            f4 = Float.MIN_VALUE;
            ((Paint)localObject3).setAntiAlias(bool3);
          }
          localObject3 = n;
          i5 = c;
          f5 = f;
          i5 = g.a(i5, f5);
          ((Paint)localObject3).setColor(i5);
          ((Paint)localObject3).setColorFilter(paramColorFilter);
          localObject5 = j;
          paramCanvas.drawPath((Path)localObject5, (Paint)localObject3);
        }
        i7 = a;
        if (i7 == 0) {
          break;
        }
        localObject3 = m;
        if (localObject3 == null)
        {
          localObject3 = new android/graphics/Paint;
          ((Paint)localObject3).<init>();
          m = ((Paint)localObject3);
          localObject3 = m;
          localObject5 = Paint.Style.STROKE;
          ((Paint)localObject3).setStyle((Paint.Style)localObject5);
          localObject3 = m;
          i5 = 1;
          f4 = Float.MIN_VALUE;
          ((Paint)localObject3).setAntiAlias(i5);
        }
        localObject3 = m;
        localObject5 = k;
        if (localObject5 != null)
        {
          localObject5 = k;
          ((Paint)localObject3).setStrokeJoin((Paint.Join)localObject5);
        }
        localObject5 = j;
        if (localObject5 != null)
        {
          localObject5 = j;
          ((Paint)localObject3).setStrokeCap((Paint.Cap)localObject5);
        }
        f4 = l;
        ((Paint)localObject3).setStrokeMiter(f4);
        int i6 = a;
        f5 = d;
        i6 = g.a(i6, f5);
        ((Paint)localObject3).setColor(i6);
        ((Paint)localObject3).setColorFilter(paramColorFilter);
        f1 *= f3;
        float f8 = b;
        f1 *= f8;
        ((Paint)localObject3).setStrokeWidth(f1);
        localObject1 = j;
        paramCanvas.drawPath((Path)localObject1, (Paint)localObject3);
        break;
        label1197:
        localObject4 = o;
        bool5 = true;
        f7 = Float.MIN_VALUE;
        ((PathMeasure)localObject4).getSegment(f4, f5, (Path)localObject3, bool5);
      }
    }
    paramCanvas.restore();
  }
  
  public final void a(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    g.c localc = a;
    Matrix localMatrix = k;
    a(localc, localMatrix, paramCanvas, paramInt1, paramInt2, null);
  }
  
  public final float getAlpha()
  {
    return getRootAlpha() / 255.0F;
  }
  
  public final int getRootAlpha()
  {
    return f;
  }
  
  public final void setAlpha(float paramFloat)
  {
    int i1 = (int)(255.0F * paramFloat);
    setRootAlpha(i1);
  }
  
  public final void setRootAlpha(int paramInt)
  {
    f = paramInt;
  }
}


/* Location:              android/support/a/a/g$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */