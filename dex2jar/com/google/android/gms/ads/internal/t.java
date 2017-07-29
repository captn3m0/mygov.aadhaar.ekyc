package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import java.lang.ref.WeakReference;

@qi
public final class t
{
  ih a;
  boolean b = false;
  private final a c;
  private final Runnable d;
  private boolean e = false;
  private long f = 0L;
  
  public t(a parama)
  {
    this(parama, new a(tt.a));
  }
  
  private t(a parama, a parama1)
  {
    c = parama1;
    d = new Runnable()
    {
      public final void run()
      {
        b = false;
        a locala = (a)a.get();
        if (locala != null) {
          locala.c(a);
        }
      }
    };
  }
  
  public final void a()
  {
    b = false;
    c.a(d);
  }
  
  public final void a(ih paramih)
  {
    a(paramih, 60000L);
  }
  
  public final void a(ih paramih, long paramLong)
  {
    if (b) {
      tp.e("An ad refresh is already scheduled.");
    }
    do
    {
      return;
      a = paramih;
      b = true;
      f = paramLong;
    } while (e);
    tp.d(65 + "Scheduling ad refresh " + paramLong + " milliseconds from now.");
    paramih = c;
    Runnable localRunnable = d;
    a.postDelayed(localRunnable, paramLong);
  }
  
  public final void b()
  {
    e = true;
    if (b) {
      c.a(d);
    }
  }
  
  public final void c()
  {
    e = false;
    if (b)
    {
      b = false;
      a(a, f);
    }
  }
  
  public static final class a
  {
    final Handler a;
    
    public a(Handler paramHandler)
    {
      a = paramHandler;
    }
    
    public final void a(Runnable paramRunnable)
    {
      a.removeCallbacks(paramRunnable);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */