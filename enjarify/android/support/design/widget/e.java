package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.a;
import android.util.StateSet;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

class e
  extends g
{
  l a;
  private final o r;
  
  e(z paramz, m paramm, q.d paramd)
  {
    super(paramz, paramm, paramd);
    o localo = new android/support/design/widget/o;
    localo.<init>();
    r = localo;
    localo = r;
    int[] arrayOfInt = j;
    Object localObject = new android/support/design/widget/e$b;
    ((e.b)localObject).<init>(this);
    localObject = a((e.d)localObject);
    localo.a(arrayOfInt, (q)localObject);
    localo = r;
    arrayOfInt = k;
    localObject = new android/support/design/widget/e$b;
    ((e.b)localObject).<init>(this);
    localObject = a((e.d)localObject);
    localo.a(arrayOfInt, (q)localObject);
    localo = r;
    arrayOfInt = l;
    localObject = new android/support/design/widget/e$c;
    ((e.c)localObject).<init>(this);
    localObject = a((e.d)localObject);
    localo.a(arrayOfInt, (q)localObject);
    localo = r;
    arrayOfInt = m;
    localObject = new android/support/design/widget/e$a;
    ((e.a)localObject).<init>(this);
    localObject = a((e.d)localObject);
    localo.a(arrayOfInt, (q)localObject);
  }
  
  private q a(e.d paramd)
  {
    q localq = p.a();
    Interpolator localInterpolator = b;
    localq.a(localInterpolator);
    localq.a(100);
    localq.a(paramd);
    localq.a(paramd);
    a.d();
    return localq;
  }
  
  float a()
  {
    return h;
  }
  
  void a(float paramFloat1, float paramFloat2)
  {
    l locall = a;
    if (locall != null)
    {
      locall = a;
      float f = i + paramFloat1;
      locall.a(paramFloat1, f);
      f();
    }
  }
  
  void a(int paramInt)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Drawable localDrawable = e;
    if (localDrawable != null)
    {
      localDrawable = e;
      int[][] arrayOfInt = new int[i][];
      int[] arrayOfInt1 = new int[i];
      Object localObject = k;
      arrayOfInt[0] = localObject;
      arrayOfInt1[0] = paramInt;
      localObject = j;
      arrayOfInt[k] = localObject;
      arrayOfInt1[k] = paramInt;
      localObject = new int[0];
      arrayOfInt[j] = localObject;
      arrayOfInt1[j] = 0;
      localObject = new android/content/res/ColorStateList;
      ((ColorStateList)localObject).<init>(arrayOfInt, arrayOfInt1);
      android.support.v4.d.a.a.a(localDrawable, (ColorStateList)localObject);
    }
  }
  
  final void a(ColorStateList paramColorStateList)
  {
    Object localObject = d;
    if (localObject != null)
    {
      localObject = d;
      android.support.v4.d.a.a.a((Drawable)localObject, paramColorStateList);
    }
    localObject = f;
    if (localObject != null)
    {
      localObject = f;
      if (paramColorStateList != null)
      {
        int[] arrayOfInt = ((c)localObject).getState();
        int i = f;
        j = paramColorStateList.getColorForState(arrayOfInt, i);
        f = j;
      }
      e = paramColorStateList;
      int j = 1;
      g = j;
      ((c)localObject).invalidateSelf();
    }
  }
  
  final void a(PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = d;
    if (localDrawable != null)
    {
      localDrawable = d;
      android.support.v4.d.a.a.a(localDrawable, paramMode);
    }
  }
  
  void a(Rect paramRect)
  {
    a.getPadding(paramRect);
  }
  
  void a(g.a parama)
  {
    int i = h();
    if (i != 0) {}
    for (;;)
    {
      return;
      i = 1;
      c = i;
      Object localObject1 = n.getContext();
      int j = a.a.design_fab_out;
      localObject1 = AnimationUtils.loadAnimation((Context)localObject1, j);
      Object localObject2 = a.c;
      ((Animation)localObject1).setInterpolator((Interpolator)localObject2);
      long l = 200L;
      ((Animation)localObject1).setDuration(l);
      localObject2 = new android/support/design/widget/e$1;
      ((e.1)localObject2).<init>(this, parama);
      ((Animation)localObject1).setAnimationListener((Animation.AnimationListener)localObject2);
      localObject2 = n;
      ((z)localObject2).startAnimation((Animation)localObject1);
    }
  }
  
  void a(int[] paramArrayOfInt)
  {
    o localo = r;
    int i = a.size();
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    if (k < i)
    {
      localObject1 = (o.a)a.get(k);
      int[] arrayOfInt = a;
      boolean bool = StateSet.stateSetMatches(arrayOfInt, paramArrayOfInt);
      if (!bool) {}
    }
    for (;;)
    {
      localObject2 = b;
      if (localObject1 != localObject2)
      {
        localObject2 = b;
        if (localObject2 != null)
        {
          localObject2 = c;
          if (localObject2 != null)
          {
            localObject2 = c.a;
            ((q.e)localObject2).e();
            c = null;
          }
        }
        b = ((o.a)localObject1);
        if (localObject1 != null)
        {
          localObject1 = b;
          c = ((q)localObject1);
          localObject1 = c.a;
          ((q.e)localObject1).a();
        }
      }
      return;
      j = k + 1;
      k = j;
      break;
      j = 0;
      localObject1 = null;
    }
  }
  
  void b()
  {
    o localo = r;
    q localq = c;
    if (localq != null)
    {
      c.a.g();
      localq = null;
      c = null;
    }
  }
  
  void b(g.a parama)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool = g();
    if (bool) {}
    for (;;)
    {
      return;
      int j = 2;
      c = j;
      n.a(0, false);
      Object localObject2 = n.getContext();
      i = a.a.design_fab_in;
      localObject2 = AnimationUtils.loadAnimation((Context)localObject2, i);
      long l = 200L;
      ((Animation)localObject2).setDuration(l);
      localObject1 = a.d;
      ((Animation)localObject2).setInterpolator((Interpolator)localObject1);
      localObject1 = new android/support/design/widget/e$2;
      ((e.2)localObject1).<init>(this, parama);
      ((Animation)localObject2).setAnimationListener((Animation.AnimationListener)localObject1);
      localObject1 = n;
      ((z)localObject1).startAnimation((Animation)localObject2);
    }
  }
  
  void c() {}
}


/* Location:              android/support/design/widget/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */