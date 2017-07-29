package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.View;

final class h
{
  private final View a;
  private final m b;
  private int c = -1;
  private bd d;
  private bd e;
  private bd f;
  
  h(View paramView)
  {
    a = paramView;
    m localm = m.a();
    b = localm;
  }
  
  private void b(ColorStateList paramColorStateList)
  {
    bd localbd;
    if (paramColorStateList != null)
    {
      localbd = d;
      if (localbd == null)
      {
        localbd = new android/support/v7/widget/bd;
        localbd.<init>();
        d = localbd;
      }
      d.a = paramColorStateList;
      localbd = d;
      boolean bool = true;
      d = bool;
    }
    for (;;)
    {
      d();
      return;
      localbd = null;
      d = null;
    }
  }
  
  final void a()
  {
    c = -1;
    b(null);
    d();
  }
  
  final void a(int paramInt)
  {
    c = paramInt;
    Object localObject = b;
    Context localContext;
    if (localObject != null)
    {
      localObject = b;
      localContext = a.getContext();
    }
    for (localObject = ((m)localObject).b(localContext, paramInt);; localObject = null)
    {
      b((ColorStateList)localObject);
      d();
      return;
    }
  }
  
  final void a(ColorStateList paramColorStateList)
  {
    bd localbd = e;
    if (localbd == null)
    {
      localbd = new android/support/v7/widget/bd;
      localbd.<init>();
      e = localbd;
    }
    e.a = paramColorStateList;
    e.d = true;
    d();
  }
  
  final void a(PorterDuff.Mode paramMode)
  {
    bd localbd = e;
    if (localbd == null)
    {
      localbd = new android/support/v7/widget/bd;
      localbd.<init>();
      e = localbd;
    }
    e.b = paramMode;
    e.c = true;
    d();
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = a.getContext();
    Object localObject3 = a.j.ViewBackgroundHelper;
    int i = 0;
    Object localObject4 = null;
    localObject3 = bf.a((Context)localObject1, paramAttributeSet, (int[])localObject3, paramInt, 0);
    try
    {
      int j = a.j.ViewBackgroundHelper_android_background;
      boolean bool1 = ((bf)localObject3).e(j);
      int n;
      if (bool1)
      {
        k = a.j.ViewBackgroundHelper_android_background;
        i = -1;
        k = ((bf)localObject3).g(k, i);
        c = k;
        localObject1 = b;
        localObject4 = a;
        localObject4 = ((View)localObject4).getContext();
        n = c;
        localObject1 = ((m)localObject1).b((Context)localObject4, n);
        if (localObject1 != null) {
          b((ColorStateList)localObject1);
        }
      }
      int k = a.j.ViewBackgroundHelper_backgroundTint;
      boolean bool2 = ((bf)localObject3).e(k);
      if (bool2)
      {
        localObject1 = a;
        i = a.j.ViewBackgroundHelper_backgroundTint;
        localObject4 = ((bf)localObject3).d(i);
        w.a((View)localObject1, (ColorStateList)localObject4);
      }
      int m = a.j.ViewBackgroundHelper_backgroundTintMode;
      boolean bool3 = ((bf)localObject3).e(m);
      if (bool3)
      {
        localObject1 = a;
        i = a.j.ViewBackgroundHelper_backgroundTintMode;
        n = -1;
        i = ((bf)localObject3).a(i, n);
        n = 0;
        localObject4 = ag.a(i, null);
        w.a((View)localObject1, (PorterDuff.Mode)localObject4);
      }
      return;
    }
    finally
    {
      a.recycle();
    }
  }
  
  final ColorStateList b()
  {
    Object localObject = e;
    if (localObject != null) {}
    for (localObject = e.a;; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  final PorterDuff.Mode c()
  {
    Object localObject = e;
    if (localObject != null) {}
    for (localObject = e.b;; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  final void d()
  {
    int i = 21;
    int j = 0;
    Object localObject1 = null;
    int k = 1;
    Object localObject2 = a;
    Drawable localDrawable = ((View)localObject2).getBackground();
    int m;
    if (localDrawable != null)
    {
      m = Build.VERSION.SDK_INT;
      if (m < i) {
        break label229;
      }
      if (m != i) {
        break label211;
      }
      m = k;
      if (m == 0) {
        break label238;
      }
      localObject2 = f;
      if (localObject2 == null)
      {
        localObject2 = new android/support/v7/widget/bd;
        ((bd)localObject2).<init>();
        f = ((bd)localObject2);
      }
      localObject2 = f;
      a = null;
      d = false;
      b = null;
      c = false;
      Object localObject3 = w.C(a);
      if (localObject3 != null)
      {
        d = k;
        a = ((ColorStateList)localObject3);
      }
      localObject3 = w.D(a);
      if (localObject3 != null)
      {
        c = k;
        b = ((PorterDuff.Mode)localObject3);
      }
      boolean bool = d;
      if (!bool)
      {
        bool = c;
        if (!bool) {}
      }
      else
      {
        localObject1 = a.getDrawableState();
        m.a(localDrawable, (bd)localObject2, (int[])localObject1);
        j = k;
      }
      if (j == 0) {
        break label238;
      }
    }
    for (;;)
    {
      return;
      label211:
      localObject2 = d;
      if (localObject2 != null)
      {
        m = k;
        break;
      }
      label229:
      m = 0;
      localObject2 = null;
      break;
      label238:
      localObject1 = e;
      int[] arrayOfInt;
      if (localObject1 != null)
      {
        localObject1 = e;
        arrayOfInt = a.getDrawableState();
        m.a(localDrawable, (bd)localObject1, arrayOfInt);
      }
      else
      {
        localObject1 = d;
        if (localObject1 != null)
        {
          localObject1 = d;
          arrayOfInt = a.getDrawableState();
          m.a(localDrawable, (bd)localObject1, arrayOfInt);
        }
      }
    }
  }
}


/* Location:              android/support/v7/widget/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */