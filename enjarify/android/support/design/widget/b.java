package android.support.design.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.design.a.a;
import android.support.design.a.g;
import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.List;

public abstract class b
{
  static final Handler a;
  final ViewGroup b;
  final b.e c;
  int d;
  final n.a e;
  private final Context f;
  private final b.b g;
  private List h;
  private final AccessibilityManager i;
  
  static
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    b.1 local1 = new android/support/design/widget/b$1;
    local1.<init>();
    localHandler.<init>(localLooper, local1);
    a = localHandler;
  }
  
  protected b(ViewGroup paramViewGroup, View paramView, b.b paramb)
  {
    Object localObject = new android/support/design/widget/b$4;
    ((b.4)localObject).<init>(this);
    e = ((n.a)localObject);
    if (paramViewGroup == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Transient bottom bar must have non-null parent");
      throw ((Throwable)localObject);
    }
    if (paramView == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Transient bottom bar must have non-null content");
      throw ((Throwable)localObject);
    }
    if (paramb == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Transient bottom bar must have non-null callback");
      throw ((Throwable)localObject);
    }
    b = paramViewGroup;
    g = paramb;
    localObject = paramViewGroup.getContext();
    f = ((Context)localObject);
    p.a(f);
    localObject = LayoutInflater.from(f);
    int k = a.g.design_layout_snackbar;
    ViewGroup localViewGroup = b;
    localObject = (b.e)((LayoutInflater)localObject).inflate(k, localViewGroup, false);
    c = ((b.e)localObject);
    c.addView(paramView);
    w.k(c);
    w.c(c, j);
    w.a(c, j);
    localObject = c;
    b.3 local3 = new android/support/design/widget/b$3;
    local3.<init>(this);
    w.a((View)localObject, local3);
    localObject = (AccessibilityManager)f.getSystemService("accessibility");
    i = ((AccessibilityManager)localObject);
  }
  
  public final void a()
  {
    n localn = n.a();
    int j = d;
    Object localObject2 = e;
    for (;;)
    {
      int k;
      synchronized (a)
      {
        boolean bool = localn.d((n.a)localObject2);
        if (bool)
        {
          localObject2 = c;
          b = j;
          localObject4 = b;
          localObject2 = c;
          ((Handler)localObject4).removeCallbacksAndMessages(localObject2);
          localObject4 = c;
          localn.a((n.b)localObject4);
          return;
        }
        bool = localn.e((n.a)localObject2);
        if (bool)
        {
          localObject2 = d;
          b = j;
          localObject4 = c;
          if (localObject4 == null) {
            break label166;
          }
          localObject4 = c;
          int n = 4;
          k = localn.a((n.b)localObject4, n);
          if (k == 0) {
            break label166;
          }
        }
      }
      n.b localb = new android/support/design/widget/n$b;
      localb.<init>(k, (n.a)localObject2);
      d = localb;
      continue;
      label166:
      int m = 0;
      Object localObject4 = null;
      c = null;
      ((n)localObject1).b();
    }
  }
  
  final void b()
  {
    long l = 250L;
    int j = Build.VERSION.SDK_INT;
    int k = 14;
    float f1 = 2.0E-44F;
    Object localObject1;
    Object localObject2;
    if (j >= k)
    {
      localObject1 = c;
      f1 = c.getHeight();
      w.b((View)localObject1, f1);
      localObject1 = w.s(c);
      k = 0;
      f1 = 0.0F;
      localObject1 = ((ae)localObject1).c(0.0F);
      localObject2 = a.b;
      localObject1 = ((ae)localObject1).a((Interpolator)localObject2).a(l);
      localObject2 = new android/support/design/widget/b$8;
      ((b.8)localObject2).<init>(this);
      localObject1 = ((ae)localObject1).a((ai)localObject2);
      ((ae)localObject1).b();
    }
    for (;;)
    {
      return;
      localObject1 = c.getContext();
      k = a.a.design_snackbar_in;
      localObject1 = AnimationUtils.loadAnimation((Context)localObject1, k);
      localObject2 = a.b;
      ((Animation)localObject1).setInterpolator((Interpolator)localObject2);
      ((Animation)localObject1).setDuration(l);
      localObject2 = new android/support/design/widget/b$9;
      ((b.9)localObject2).<init>(this);
      ((Animation)localObject1).setAnimationListener((Animation.AnimationListener)localObject2);
      localObject2 = c;
      ((b.e)localObject2).startAnimation((Animation)localObject1);
    }
  }
  
  final void c()
  {
    Object localObject1 = n.a();
    Object localObject3 = e;
    synchronized (a)
    {
      boolean bool = ((n)localObject1).d((n.a)localObject3);
      if (bool)
      {
        localObject3 = c;
        ((n)localObject1).a((n.b)localObject3);
      }
      localObject1 = h;
      if (localObject1 != null)
      {
        localObject1 = h;
        int j = ((List)localObject1).size() + -1;
        if (j >= 0)
        {
          localObject3 = h;
          ((List)localObject3).get(j);
          j += -1;
        }
      }
    }
  }
  
  final void d()
  {
    Object localObject1 = n.a();
    Object localObject4 = e;
    synchronized (a)
    {
      boolean bool1 = ((n)localObject1).d((n.a)localObject4);
      if (bool1)
      {
        bool1 = false;
        localObject4 = null;
        c = null;
        localObject4 = d;
        if (localObject4 != null) {
          ((n)localObject1).b();
        }
      }
      localObject1 = h;
      if (localObject1 != null)
      {
        localObject1 = h;
        k = ((List)localObject1).size() + -1;
        if (k >= 0)
        {
          localObject4 = h;
          ((List)localObject4).get(k);
          k += -1;
        }
      }
    }
    int k = Build.VERSION.SDK_INT;
    int j = 11;
    if (k < j)
    {
      localObject3 = c;
      j = 8;
      ((b.e)localObject3).setVisibility(j);
    }
    Object localObject3 = c.getParent();
    boolean bool2 = localObject3 instanceof ViewGroup;
    if (bool2)
    {
      localObject3 = (ViewGroup)localObject3;
      localObject4 = c;
      ((ViewGroup)localObject3).removeView((View)localObject4);
    }
  }
  
  final boolean e()
  {
    AccessibilityManager localAccessibilityManager = i;
    boolean bool = localAccessibilityManager.isEnabled();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAccessibilityManager = null;
    }
  }
}


/* Location:              android/support/design/widget/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */