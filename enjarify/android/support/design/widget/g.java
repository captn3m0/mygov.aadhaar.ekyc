package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;

abstract class g
{
  static final Interpolator b;
  static final int[] j;
  static final int[] k;
  static final int[] l;
  static final int[] m = new int[0];
  private final Rect a;
  int c = 0;
  Drawable d;
  Drawable e;
  c f;
  Drawable g;
  float h;
  float i;
  final z n;
  final m o;
  final q.d p;
  ViewTreeObserver.OnPreDrawListener q;
  
  static
  {
    int i1 = 2;
    b = a.c;
    int[] arrayOfInt = new int[i1];
    int[] tmp13_12 = arrayOfInt;
    tmp13_12[0] = 16842919;
    tmp13_12[1] = 16842910;
    j = arrayOfInt;
    arrayOfInt = new int[i1];
    int[] tmp31_30 = arrayOfInt;
    tmp31_30[0] = 16842908;
    tmp31_30[1] = 16842910;
    k = arrayOfInt;
    arrayOfInt = new int[1];
    arrayOfInt[0] = 16842910;
    l = arrayOfInt;
  }
  
  g(z paramz, m paramm, q.d paramd)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    a = localRect;
    n = paramz;
    o = paramm;
    p = paramd;
  }
  
  abstract float a();
  
  abstract void a(float paramFloat1, float paramFloat2);
  
  abstract void a(int paramInt);
  
  abstract void a(ColorStateList paramColorStateList);
  
  abstract void a(PorterDuff.Mode paramMode);
  
  abstract void a(Rect paramRect);
  
  abstract void a(g.a parama);
  
  abstract void a(int[] paramArrayOfInt);
  
  abstract void b();
  
  void b(Rect paramRect) {}
  
  abstract void b(g.a parama);
  
  abstract void c();
  
  boolean d()
  {
    return false;
  }
  
  void e() {}
  
  final void f()
  {
    Rect localRect = a;
    a(localRect);
    b(localRect);
    m localm = o;
    int i1 = left;
    int i2 = top;
    int i3 = right;
    int i4 = bottom;
    localm.a(i1, i2, i3, i4);
  }
  
  final boolean g()
  {
    int i1 = 1;
    z localz = n;
    int i2 = localz.getVisibility();
    if (i2 != 0)
    {
      i2 = c;
      int i3 = 2;
      if (i2 != i3) {}
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      continue;
      i2 = c;
      if (i2 == i1) {
        i1 = 0;
      }
    }
  }
  
  final boolean h()
  {
    int i1 = 1;
    z localz = n;
    int i2 = localz.getVisibility();
    if (i2 == 0)
    {
      i2 = c;
      if (i2 != i1) {}
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      continue;
      int i3 = c;
      int i4 = 2;
      if (i3 == i4) {
        i1 = 0;
      }
    }
  }
}


/* Location:              android/support/design/widget/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */