package android.support.v4.widget;

import android.content.res.Resources;
import android.support.v4.h.n;
import android.support.v4.h.w;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  private static final int r = ;
  final a.a a;
  final View b;
  boolean c;
  boolean d;
  boolean e;
  private final Interpolator f;
  private Runnable g;
  private float[] h;
  private float[] i;
  private int j;
  private int k;
  private float[] l;
  private float[] m;
  private float[] n;
  private boolean o;
  private boolean p;
  private boolean q;
  
  public a(View paramView)
  {
    Object localObject = new android/support/v4/widget/a$a;
    ((a.a)localObject).<init>();
    a = ((a.a)localObject);
    localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>();
    f = ((Interpolator)localObject);
    localObject = new float[i1];
    Object tmp56_54 = localObject;
    tmp56_54[0] = 0.0F;
    tmp56_54[1] = 0.0F;
    h = ((float[])localObject);
    localObject = new float[i1];
    Object tmp77_75 = localObject;
    tmp77_75[0] = Float.MAX_VALUE;
    tmp77_75[1] = Float.MAX_VALUE;
    i = ((float[])localObject);
    localObject = new float[i1];
    Object tmp100_98 = localObject;
    tmp100_98[0] = 0.0F;
    tmp100_98[1] = 0.0F;
    l = ((float[])localObject);
    localObject = new float[i1];
    Object tmp121_119 = localObject;
    tmp121_119[0] = 0.0F;
    tmp121_119[1] = 0.0F;
    m = ((float[])localObject);
    localObject = new float[i1];
    Object tmp142_140 = localObject;
    tmp142_140[0] = Float.MAX_VALUE;
    tmp142_140[1] = Float.MAX_VALUE;
    n = ((float[])localObject);
    b = paramView;
    localObject = Resources.getSystem().getDisplayMetrics();
    float f3 = density;
    i1 = (int)(1575.0F * f3 + 0.5F);
    int i3 = (int)(density * 315.0F + 0.5F);
    float f4 = i1;
    float[] arrayOfFloat1 = n;
    float f5 = f4 / f2;
    arrayOfFloat1[0] = f5;
    arrayOfFloat1 = n;
    f4 /= f2;
    arrayOfFloat1[i2] = f4;
    float f6 = i3;
    float[] arrayOfFloat2 = m;
    f3 = f6 / f2;
    arrayOfFloat2[0] = f3;
    arrayOfFloat2 = m;
    f6 /= f2;
    arrayOfFloat2[i2] = f6;
    j = i2;
    i[0] = Float.MAX_VALUE;
    i[i2] = Float.MAX_VALUE;
    h[0] = 0.2F;
    h[i2] = 0.2F;
    l[0] = f1;
    l[i2] = f1;
    i3 = r;
    k = i3;
    a.a = 500;
    a.b = 500;
  }
  
  private float a(float paramFloat1, float paramFloat2)
  {
    int i1 = 1065353216;
    float f1 = 1.0F;
    float f2 = 0.0F;
    boolean bool2 = paramFloat2 < 0.0F;
    if (!bool2) {}
    for (;;)
    {
      return f2;
      int i2 = j;
      switch (i2)
      {
      default: 
        break;
      case 0: 
      case 1: 
        boolean bool3 = paramFloat1 < paramFloat2;
        if (bool3)
        {
          bool3 = paramFloat1 < 0.0F;
          if (!bool3)
          {
            f2 = paramFloat1 / paramFloat2;
            f2 = f1 - f2;
          }
          else
          {
            bool3 = e;
            if (bool3)
            {
              int i3 = j;
              int i4 = 1;
              if (i3 == i4) {
                f2 = f1;
              }
            }
          }
        }
        break;
      case 2: 
        boolean bool1 = paramFloat1 < 0.0F;
        if (bool1)
        {
          f2 = -paramFloat2;
          f2 = paramFloat1 / f2;
        }
        break;
      }
    }
  }
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool = paramFloat1 < paramFloat3;
    if (bool) {}
    for (;;)
    {
      return paramFloat3;
      bool = paramFloat1 < paramFloat2;
      if (bool) {
        paramFloat3 = paramFloat2;
      } else {
        paramFloat3 = paramFloat1;
      }
    }
  }
  
  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = false;
    float[] arrayOfFloat1 = h;
    float f1 = arrayOfFloat1[paramInt];
    Object localObject = i;
    float f2 = localObject[paramInt];
    f1 = a(f1 * paramFloat2, 0.0F, f2);
    f2 = a(paramFloat1, f1);
    float f3 = paramFloat2 - paramFloat1;
    f1 = a(f3, f1) - f2;
    boolean bool2 = f1 < 0.0F;
    label123:
    boolean bool3;
    if (bool2)
    {
      localObject = f;
      f1 = -f1;
      f1 = -((Interpolator)localObject).getInterpolation(f1);
      int i1 = -1082130432;
      f2 = -1.0F;
      f3 = 1.0F;
      f1 = a(f1, f2, f3);
      bool3 = f1 < 0.0F;
      if (bool3) {
        break label183;
      }
      arrayOfFloat1 = null;
      f1 = 0.0F;
    }
    for (;;)
    {
      return f1;
      bool3 = f1 < 0.0F;
      if (bool3)
      {
        localObject = f;
        f1 = ((Interpolator)localObject).getInterpolation(f1);
        break;
      }
      arrayOfFloat1 = null;
      f1 = 0.0F;
      break label123;
      label183:
      localObject = l;
      f2 = localObject[paramInt];
      float[] arrayOfFloat2 = m;
      f3 = arrayOfFloat2[paramInt];
      float[] arrayOfFloat3 = n;
      float f4 = arrayOfFloat3[paramInt];
      f2 *= paramFloat3;
      bool1 = f1 < 0.0F;
      if (bool1) {
        f1 = a(f1 * f2, f3, f4);
      } else {
        f1 = -a(-f1 * f2, f3, f4);
      }
    }
  }
  
  private void b()
  {
    boolean bool = c;
    if (bool)
    {
      e = false;
      return;
    }
    a.a locala = a;
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    long l2 = e;
    l2 = l1 - l2;
    int i2 = (int)l2;
    int i1 = b;
    if (i2 > i1) {}
    for (;;)
    {
      k = i1;
      float f1 = locala.a(l1);
      j = f1;
      i = l1;
      break;
      if (i2 < 0)
      {
        i1 = 0;
        f1 = 0.0F;
      }
      else
      {
        i1 = i2;
      }
    }
  }
  
  public final a a(boolean paramBoolean)
  {
    boolean bool = p;
    if ((bool) && (!paramBoolean)) {
      b();
    }
    p = paramBoolean;
    return this;
  }
  
  public abstract void a(int paramInt);
  
  final boolean a()
  {
    a.a locala = a;
    float f1 = d;
    float f2 = Math.abs(d);
    f1 /= f2;
    int i1 = (int)f1;
    f2 = c;
    float f3 = Math.abs(c);
    f3 = f2 / f3;
    int i2 = (int)f3;
    if (i1 != 0)
    {
      boolean bool = b(i1);
      if (bool) {}
    }
    else
    {
      if (i2 != 0) {}
      i2 = 0;
      f3 = 0.0F;
      locala = null;
    }
    for (;;)
    {
      return i2;
      int i3 = 1;
      f3 = Float.MIN_VALUE;
    }
  }
  
  public abstract boolean b(int paramInt);
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i1 = 1;
    boolean bool2 = p;
    if (!bool2) {
      return bool1;
    }
    int i2 = n.a(paramMotionEvent);
    switch (i2)
    {
    }
    for (;;)
    {
      boolean bool3 = q;
      if (!bool3) {
        break;
      }
      bool3 = e;
      if (!bool3) {
        break;
      }
      bool1 = i1;
      break;
      d = i1;
      o = false;
      float f1 = paramMotionEvent.getX();
      int i4 = paramView.getWidth();
      float f2 = i4;
      float f3 = b.getWidth();
      f1 = a(0, f1, f2, f3);
      f2 = paramMotionEvent.getY();
      int i5 = paramView.getHeight();
      f3 = i5;
      View localView = b;
      int i6 = localView.getHeight();
      float f4 = i6;
      f2 = a(i1, f2, f3, f4);
      a.a locala = a;
      c = f1;
      d = f2;
      bool3 = e;
      if (!bool3)
      {
        bool3 = a();
        if (bool3)
        {
          Object localObject = g;
          if (localObject == null)
          {
            localObject = new android/support/v4/widget/a$b;
            ((a.b)localObject).<init>(this);
            g = ((Runnable)localObject);
          }
          e = i1;
          c = i1;
          bool3 = o;
          if (!bool3)
          {
            int i3 = k;
            if (i3 > 0)
            {
              localObject = b;
              Runnable localRunnable = g;
              i5 = k;
              long l1 = i5;
              w.a((View)localObject, localRunnable, l1);
            }
          }
          for (;;)
          {
            o = i1;
            break;
            localObject = g;
            ((Runnable)localObject).run();
          }
          b();
        }
      }
    }
  }
}


/* Location:              android/support/v4/widget/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */