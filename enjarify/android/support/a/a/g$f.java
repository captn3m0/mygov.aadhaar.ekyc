package android.support.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class g$f
  extends Drawable.ConstantState
{
  int a;
  g.e b;
  ColorStateList c;
  PorterDuff.Mode d;
  boolean e;
  Bitmap f;
  ColorStateList g;
  PorterDuff.Mode h;
  int i;
  boolean j;
  boolean k;
  Paint l;
  
  public g$f()
  {
    c = null;
    Object localObject = g.a;
    d = ((PorterDuff.Mode)localObject);
    localObject = new android/support/a/a/g$e;
    ((g.e)localObject).<init>();
    b = ((g.e)localObject);
  }
  
  public g$f(f paramf)
  {
    int m = 0;
    c = null;
    Object localObject1 = g.a;
    d = ((PorterDuff.Mode)localObject1);
    if (paramf != null)
    {
      m = a;
      a = m;
      localObject1 = new android/support/a/a/g$e;
      Object localObject2 = b;
      ((g.e)localObject1).<init>((g.e)localObject2);
      b = ((g.e)localObject1);
      localObject1 = g.e.a(b);
      Paint localPaint;
      if (localObject1 != null)
      {
        localObject1 = b;
        localObject2 = new android/graphics/Paint;
        localPaint = g.e.a(b);
        ((Paint)localObject2).<init>(localPaint);
        g.e.a((g.e)localObject1, (Paint)localObject2);
      }
      localObject1 = g.e.b(b);
      if (localObject1 != null)
      {
        localObject1 = b;
        localObject2 = new android/graphics/Paint;
        localPaint = g.e.b(b);
        ((Paint)localObject2).<init>(localPaint);
        g.e.b((g.e)localObject1, (Paint)localObject2);
      }
      localObject1 = c;
      c = ((ColorStateList)localObject1);
      localObject1 = d;
      d = ((PorterDuff.Mode)localObject1);
      boolean bool = e;
      e = bool;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    f.eraseColor(0);
    Canvas localCanvas = new android/graphics/Canvas;
    Bitmap localBitmap = f;
    localCanvas.<init>(localBitmap);
    b.a(localCanvas, paramInt1, paramInt2);
  }
  
  public final int getChangingConfigurations()
  {
    return a;
  }
  
  public final Drawable newDrawable()
  {
    g localg = new android/support/a/a/g;
    localg.<init>(this);
    return localg;
  }
  
  public final Drawable newDrawable(Resources paramResources)
  {
    g localg = new android/support/a/a/g;
    localg.<init>(this);
    return localg;
  }
}


/* Location:              android/support/a/a/g$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */