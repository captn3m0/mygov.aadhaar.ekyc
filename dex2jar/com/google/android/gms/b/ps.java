package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;

@qi
public abstract class ps
  extends to
{
  protected final pt.a a;
  protected final Context b;
  protected final Object c = new Object();
  protected final Object d = new Object();
  protected final tg.a e;
  protected qr f;
  
  protected ps(Context paramContext, tg.a parama, pt.a parama1)
  {
    super((byte)0);
    b = paramContext;
    e = parama;
    f = b;
    a = parama1;
  }
  
  protected abstract tg a(int paramInt);
  
  public final void a()
  {
    for (;;)
    {
      int i;
      synchronized (c)
      {
        tp.b("AdRendererBackgroundTask started.");
        i = e.e;
        try
        {
          a(SystemClock.elapsedRealtime());
          final tg localtg = a(i);
          tt.a.post(new Runnable()
          {
            public final void run()
            {
              synchronized (c)
              {
                a(localtg);
                return;
              }
            }
          });
          return;
        }
        catch (a locala)
        {
          i = a;
          if (i == 3) {
            continue;
          }
        }
        if (i == -1)
        {
          tp.d(locala.getMessage());
          if (f == null)
          {
            f = new qr(i);
            tt.a.post(new Runnable()
            {
              public final void run()
              {
                c_();
              }
            });
          }
        }
        else
        {
          tp.e(locala.getMessage());
        }
      }
      f = new qr(i, f.k);
    }
  }
  
  protected abstract void a(long paramLong);
  
  protected final void a(tg paramtg)
  {
    a.b(paramtg);
  }
  
  public void c_() {}
  
  protected static final class a
    extends Exception
  {
    final int a;
    
    public a(String paramString, int paramInt)
    {
      super();
      a = paramInt;
    }
  }
}


/* Location:              com/google/android/gms/b/ps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */