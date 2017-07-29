package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.f.a;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;

public final class w
{
  static final w.l a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool = a.a();
    Object localObject;
    if (bool)
    {
      localObject = new android/support/v4/h/w$a;
      ((w.a)localObject).<init>();
      a = (w.l)localObject;
    }
    for (;;)
    {
      return;
      int j = 23;
      if (i >= j)
      {
        localObject = new android/support/v4/h/w$k;
        ((w.k)localObject).<init>();
        a = (w.l)localObject;
      }
      else
      {
        j = 21;
        if (i >= j)
        {
          localObject = new android/support/v4/h/w$j;
          ((w.j)localObject).<init>();
          a = (w.l)localObject;
        }
        else
        {
          j = 19;
          if (i >= j)
          {
            localObject = new android/support/v4/h/w$i;
            ((w.i)localObject).<init>();
            a = (w.l)localObject;
          }
          else
          {
            j = 18;
            if (i >= j)
            {
              localObject = new android/support/v4/h/w$h;
              ((w.h)localObject).<init>();
              a = (w.l)localObject;
            }
            else
            {
              j = 17;
              if (i >= j)
              {
                localObject = new android/support/v4/h/w$g;
                ((w.g)localObject).<init>();
                a = (w.l)localObject;
              }
              else
              {
                j = 16;
                if (i >= j)
                {
                  localObject = new android/support/v4/h/w$f;
                  ((w.f)localObject).<init>();
                  a = (w.l)localObject;
                }
                else
                {
                  j = 15;
                  if (i >= j)
                  {
                    localObject = new android/support/v4/h/w$d;
                    ((w.d)localObject).<init>();
                    a = (w.l)localObject;
                  }
                  else
                  {
                    j = 14;
                    if (i >= j)
                    {
                      localObject = new android/support/v4/h/w$e;
                      ((w.e)localObject).<init>();
                      a = (w.l)localObject;
                    }
                    else
                    {
                      j = 11;
                      if (i >= j)
                      {
                        localObject = new android/support/v4/h/w$c;
                        ((w.c)localObject).<init>();
                        a = (w.l)localObject;
                      }
                      else
                      {
                        localObject = new android/support/v4/h/w$b;
                        ((w.b)localObject).<init>();
                        a = (w.l)localObject;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static boolean A(View paramView)
  {
    return a.n(paramView);
  }
  
  public static boolean B(View paramView)
  {
    return a.C(paramView);
  }
  
  public static ColorStateList C(View paramView)
  {
    return a.D(paramView);
  }
  
  public static PorterDuff.Mode D(View paramView)
  {
    return a.E(paramView);
  }
  
  public static void E(View paramView)
  {
    a.F(paramView);
  }
  
  public static boolean F(View paramView)
  {
    return a.G(paramView);
  }
  
  public static float G(View paramView)
  {
    return a.H(paramView);
  }
  
  public static boolean H(View paramView)
  {
    return a.I(paramView);
  }
  
  public static boolean I(View paramView)
  {
    return a.J(paramView);
  }
  
  public static Display J(View paramView)
  {
    return a.K(paramView);
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.a(paramInt1, paramInt2, paramInt3);
  }
  
  public static al a(View paramView, al paramal)
  {
    return a.a(paramView, paramal);
  }
  
  public static void a(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    a.a(paramView, paramColorStateList);
  }
  
  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    a.a(paramView, paramMode);
  }
  
  public static void a(View paramView, Drawable paramDrawable)
  {
    a.a(paramView, paramDrawable);
  }
  
  public static void a(View paramView, b paramb)
  {
    a.a(paramView, paramb);
  }
  
  public static void a(View paramView, s params)
  {
    a.a(paramView, params);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, paramBoolean);
  }
  
  public static boolean a(View paramView)
  {
    return a.a(paramView);
  }
  
  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }
  
  public static al b(View paramView, al paramal)
  {
    return a.b(paramView, paramal);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    a.b(paramView, paramBoolean);
  }
  
  public static boolean b(View paramView)
  {
    return a.b(paramView);
  }
  
  public static boolean b(View paramView, int paramInt)
  {
    return a.b(paramView, paramInt);
  }
  
  public static void c(View paramView)
  {
    a.c(paramView);
  }
  
  public static void c(View paramView, float paramFloat)
  {
    a.c(paramView, paramFloat);
  }
  
  public static void c(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }
  
  public static int d(View paramView)
  {
    return a.d(paramView);
  }
  
  public static void d(View paramView, float paramFloat)
  {
    a.d(paramView, paramFloat);
  }
  
  public static void d(View paramView, int paramInt)
  {
    a.d(paramView, paramInt);
  }
  
  public static float e(View paramView)
  {
    return a.e(paramView);
  }
  
  public static void e(View paramView, int paramInt)
  {
    a.g(paramView, paramInt);
  }
  
  public static int f(View paramView)
  {
    return a.f(paramView);
  }
  
  public static void f(View paramView, int paramInt)
  {
    a.f(paramView, paramInt);
  }
  
  public static int g(View paramView)
  {
    return a.g(paramView);
  }
  
  public static void g(View paramView, int paramInt)
  {
    a.e(paramView, paramInt);
  }
  
  public static ViewParent h(View paramView)
  {
    return a.h(paramView);
  }
  
  public static int i(View paramView)
  {
    return a.i(paramView);
  }
  
  public static int j(View paramView)
  {
    return a.j(paramView);
  }
  
  public static void k(View paramView)
  {
    a.k(paramView);
  }
  
  public static int l(View paramView)
  {
    return a.l(paramView);
  }
  
  public static int m(View paramView)
  {
    return a.m(paramView);
  }
  
  public static float n(View paramView)
  {
    return a.o(paramView);
  }
  
  public static float o(View paramView)
  {
    return a.p(paramView);
  }
  
  public static Matrix p(View paramView)
  {
    return a.q(paramView);
  }
  
  public static int q(View paramView)
  {
    return a.r(paramView);
  }
  
  public static int r(View paramView)
  {
    return a.s(paramView);
  }
  
  public static ae s(View paramView)
  {
    return a.t(paramView);
  }
  
  public static float t(View paramView)
  {
    return a.x(paramView);
  }
  
  public static String u(View paramView)
  {
    return a.u(paramView);
  }
  
  public static int v(View paramView)
  {
    return a.v(paramView);
  }
  
  public static void w(View paramView)
  {
    a.w(paramView);
  }
  
  public static boolean x(View paramView)
  {
    return a.z(paramView);
  }
  
  public static void y(View paramView)
  {
    a.A(paramView);
  }
  
  public static void z(View paramView)
  {
    a.B(paramView);
  }
}


/* Location:              android/support/v4/h/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */