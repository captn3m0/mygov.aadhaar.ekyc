package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class ae
{
  public static final g e = new a();
  public WeakReference<View> a;
  Runnable b = null;
  Runnable c = null;
  int d = -1;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      e = new f();
      return;
    }
    if (i >= 19)
    {
      e = new e();
      return;
    }
    if (i >= 18)
    {
      e = new c();
      return;
    }
    if (i >= 16)
    {
      e = new d();
      return;
    }
    if (i >= 14)
    {
      e = new b();
      return;
    }
  }
  
  ae(View paramView)
  {
    a = new WeakReference(paramView);
  }
  
  public final ae a(float paramFloat)
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.a(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ae a(long paramLong)
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.a(localView, paramLong);
    }
    return this;
  }
  
  public final ae a(ai paramai)
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.a(this, localView, paramai);
    }
    return this;
  }
  
  public final ae a(ak paramak)
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.a(localView, paramak);
    }
    return this;
  }
  
  public final ae a(Interpolator paramInterpolator)
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.a(localView, paramInterpolator);
    }
    return this;
  }
  
  public final void a()
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.a(this, localView);
    }
  }
  
  public final ae b(float paramFloat)
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.b(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ae b(long paramLong)
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.b(localView, paramLong);
    }
    return this;
  }
  
  public final void b()
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.b(this, localView);
    }
  }
  
  public final ae c(float paramFloat)
  {
    View localView = (View)a.get();
    if (localView != null) {
      e.c(this, localView, paramFloat);
    }
    return this;
  }
  
  static class a
    implements ae.g
  {
    WeakHashMap<View, Runnable> a = null;
    
    private void d(ae paramae, View paramView)
    {
      Runnable localRunnable = null;
      if (a != null) {
        localRunnable = (Runnable)a.get(paramView);
      }
      Object localObject = localRunnable;
      if (localRunnable == null)
      {
        localObject = new a(paramae, paramView);
        if (a == null) {
          a = new WeakHashMap();
        }
        a.put(paramView, localObject);
      }
      paramView.removeCallbacks((Runnable)localObject);
      paramView.post((Runnable)localObject);
    }
    
    public long a(View paramView)
    {
      return 0L;
    }
    
    public void a(ae paramae, View paramView)
    {
      d(paramae, paramView);
    }
    
    public void a(ae paramae, View paramView, float paramFloat)
    {
      d(paramae, paramView);
    }
    
    public void a(ae paramae, View paramView, ai paramai)
    {
      paramView.setTag(2113929216, paramai);
    }
    
    public void a(View paramView, long paramLong) {}
    
    public void a(View paramView, ak paramak) {}
    
    public void a(View paramView, Interpolator paramInterpolator) {}
    
    public void b(ae paramae, View paramView)
    {
      if (a != null)
      {
        Runnable localRunnable = (Runnable)a.get(paramView);
        if (localRunnable != null) {
          paramView.removeCallbacks(localRunnable);
        }
      }
      c(paramae, paramView);
    }
    
    public void b(ae paramae, View paramView, float paramFloat)
    {
      d(paramae, paramView);
    }
    
    public void b(View paramView, long paramLong) {}
    
    final void c(ae paramae, View paramView)
    {
      Object localObject = paramView.getTag(2113929216);
      if ((localObject instanceof ai)) {}
      for (localObject = (ai)localObject;; localObject = null)
      {
        Runnable localRunnable1 = b;
        Runnable localRunnable2 = c;
        b = null;
        c = null;
        if (localRunnable1 != null) {
          localRunnable1.run();
        }
        if (localObject != null)
        {
          ((ai)localObject).a(paramView);
          ((ai)localObject).b(paramView);
        }
        if (localRunnable2 != null) {
          localRunnable2.run();
        }
        if (a != null) {
          a.remove(paramView);
        }
        return;
      }
    }
    
    public void c(ae paramae, View paramView, float paramFloat)
    {
      d(paramae, paramView);
    }
    
    final class a
      implements Runnable
    {
      WeakReference<View> a;
      ae b;
      
      a(ae paramae, View paramView)
      {
        a = new WeakReference(paramView);
        b = paramae;
      }
      
      public final void run()
      {
        View localView = (View)a.get();
        if (localView != null) {
          c(b, localView);
        }
      }
    }
  }
  
  static class b
    extends ae.a
  {
    WeakHashMap<View, Integer> b = null;
    
    public final long a(View paramView)
    {
      return paramView.animate().getDuration();
    }
    
    public final void a(ae paramae, View paramView)
    {
      paramView.animate().cancel();
    }
    
    public final void a(ae paramae, View paramView, float paramFloat)
    {
      paramView.animate().alpha(paramFloat);
    }
    
    public void a(ae paramae, View paramView, ai paramai)
    {
      paramView.setTag(2113929216, paramai);
      paramae = new a(paramae);
      paramView.animate().setListener(new af.1(paramae, paramView));
    }
    
    public final void a(View paramView, long paramLong)
    {
      paramView.animate().setDuration(paramLong);
    }
    
    public final void a(View paramView, Interpolator paramInterpolator)
    {
      paramView.animate().setInterpolator(paramInterpolator);
    }
    
    public final void b(ae paramae, View paramView)
    {
      paramView.animate().start();
    }
    
    public final void b(ae paramae, View paramView, float paramFloat)
    {
      paramView.animate().translationX(paramFloat);
    }
    
    public final void b(View paramView, long paramLong)
    {
      paramView.animate().setStartDelay(paramLong);
    }
    
    public final void c(ae paramae, View paramView, float paramFloat)
    {
      paramView.animate().translationY(paramFloat);
    }
    
    static final class a
      implements ai
    {
      ae a;
      boolean b;
      
      a(ae paramae)
      {
        a = paramae;
      }
      
      public final void a(View paramView)
      {
        b = false;
        if (a.d >= 0) {
          w.d(paramView, 2);
        }
        if (a.b != null)
        {
          localObject = a.b;
          a.b = null;
          ((Runnable)localObject).run();
        }
        Object localObject = paramView.getTag(2113929216);
        if ((localObject instanceof ai)) {}
        for (localObject = (ai)localObject;; localObject = null)
        {
          if (localObject != null) {
            ((ai)localObject).a(paramView);
          }
          return;
        }
      }
      
      public final void b(View paramView)
      {
        if (a.d >= 0)
        {
          w.d(paramView, a.d);
          a.d = -1;
        }
        if ((Build.VERSION.SDK_INT >= 16) || (!b))
        {
          if (a.c != null)
          {
            localObject = a.c;
            a.c = null;
            ((Runnable)localObject).run();
          }
          localObject = paramView.getTag(2113929216);
          if (!(localObject instanceof ai)) {
            break label112;
          }
        }
        label112:
        for (Object localObject = (ai)localObject;; localObject = null)
        {
          if (localObject != null) {
            ((ai)localObject).b(paramView);
          }
          b = true;
          return;
        }
      }
      
      public final void c(View paramView)
      {
        Object localObject = paramView.getTag(2113929216);
        if ((localObject instanceof ai)) {}
        for (localObject = (ai)localObject;; localObject = null)
        {
          if (localObject != null) {
            ((ai)localObject).c(paramView);
          }
          return;
        }
      }
    }
  }
  
  static class c
    extends ae.d
  {}
  
  static class d
    extends ae.b
  {
    public final void a(ae paramae, View paramView, ai paramai)
    {
      if (paramai != null)
      {
        paramView.animate().setListener(new ag.1(paramai, paramView));
        return;
      }
      paramView.animate().setListener(null);
    }
  }
  
  static class e
    extends ae.c
  {
    public final void a(View paramView, ak paramak)
    {
      ah.1 local1 = null;
      if (paramak != null) {
        local1 = new ah.1(paramak, paramView);
      }
      paramView.animate().setUpdateListener(local1);
    }
  }
  
  static final class f
    extends ae.e
  {}
  
  public static abstract interface g
  {
    public abstract long a(View paramView);
    
    public abstract void a(ae paramae, View paramView);
    
    public abstract void a(ae paramae, View paramView, float paramFloat);
    
    public abstract void a(ae paramae, View paramView, ai paramai);
    
    public abstract void a(View paramView, long paramLong);
    
    public abstract void a(View paramView, ak paramak);
    
    public abstract void a(View paramView, Interpolator paramInterpolator);
    
    public abstract void b(ae paramae, View paramView);
    
    public abstract void b(ae paramae, View paramView, float paramFloat);
    
    public abstract void b(View paramView, long paramLong);
    
    public abstract void c(ae paramae, View paramView, float paramFloat);
  }
}


/* Location:              android/support/v4/h/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */