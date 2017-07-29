package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class ae
{
  public static final ae.g e;
  public WeakReference a;
  Runnable b = null;
  Runnable c = null;
  int d = -1;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/ae$f;
      ((ae.f)localObject).<init>();
      e = (ae.g)localObject;
    }
    for (;;)
    {
      return;
      j = 19;
      if (i >= j)
      {
        localObject = new android/support/v4/h/ae$e;
        ((ae.e)localObject).<init>();
        e = (ae.g)localObject;
      }
      else
      {
        j = 18;
        if (i >= j)
        {
          localObject = new android/support/v4/h/ae$c;
          ((ae.c)localObject).<init>();
          e = (ae.g)localObject;
        }
        else
        {
          j = 16;
          if (i >= j)
          {
            localObject = new android/support/v4/h/ae$d;
            ((ae.d)localObject).<init>();
            e = (ae.g)localObject;
          }
          else
          {
            j = 14;
            if (i >= j)
            {
              localObject = new android/support/v4/h/ae$b;
              ((ae.b)localObject).<init>();
              e = (ae.g)localObject;
            }
            else
            {
              localObject = new android/support/v4/h/ae$a;
              ((ae.a)localObject).<init>();
              e = (ae.g)localObject;
            }
          }
        }
      }
    }
  }
  
  ae(View paramView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    a = localWeakReference;
  }
  
  public final ae a(float paramFloat)
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.a(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ae a(long paramLong)
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.a(localView, paramLong);
    }
    return this;
  }
  
  public final ae a(ai paramai)
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.a(this, localView, paramai);
    }
    return this;
  }
  
  public final ae a(ak paramak)
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.a(localView, paramak);
    }
    return this;
  }
  
  public final ae a(Interpolator paramInterpolator)
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.a(localView, paramInterpolator);
    }
    return this;
  }
  
  public final void a()
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.a(this, localView);
    }
  }
  
  public final ae b(float paramFloat)
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.b(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ae b(long paramLong)
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.b(localView, paramLong);
    }
    return this;
  }
  
  public final void b()
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.b(this, localView);
    }
  }
  
  public final ae c(float paramFloat)
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.g localg = e;
      localg.c(this, localView, paramFloat);
    }
    return this;
  }
}


/* Location:              android/support/v4/h/ae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */