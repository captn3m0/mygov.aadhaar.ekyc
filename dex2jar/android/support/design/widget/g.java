package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;

abstract class g
{
  static final Interpolator b = a.c;
  static final int[] j = { 16842919, 16842910 };
  static final int[] k = { 16842908, 16842910 };
  static final int[] l = { 16842910 };
  static final int[] m = new int[0];
  private final Rect a = new Rect();
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
  
  g(z paramz, m paramm, q.d paramd)
  {
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
  
  abstract void a(a parama);
  
  abstract void a(int[] paramArrayOfInt);
  
  abstract void b();
  
  void b(Rect paramRect) {}
  
  abstract void b(a parama);
  
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
    o.a(left, top, right, bottom);
  }
  
  final boolean g()
  {
    if (n.getVisibility() != 0) {
      if (c != 2) {}
    }
    while (c != 1)
    {
      return true;
      return false;
    }
    return false;
  }
  
  final boolean h()
  {
    if (n.getVisibility() == 0) {
      if (c != 1) {}
    }
    while (c != 2)
    {
      return true;
      return false;
    }
    return false;
  }
  
  static abstract interface a {}
}


/* Location:              android/support/design/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */