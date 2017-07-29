package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;

public abstract class ps
  extends to
{
  protected final pt.a a;
  protected final Context b;
  protected final Object c;
  protected final Object d;
  protected final tg.a e;
  protected qr f;
  
  protected ps(Context paramContext, tg.a parama, pt.a parama1)
  {
    super((byte)0);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
    b = paramContext;
    e = parama;
    localObject = b;
    f = ((qr)localObject);
    a = parama1;
  }
  
  protected abstract tg a(int paramInt);
  
  public final void a()
  {
    Object localObject1 = c;
    Object localObject2 = "AdRendererBackgroundTask started.";
    for (;;)
    {
      int j;
      try
      {
        tp.b((String)localObject2);
        localObject2 = e;
        int i = e;
        try
        {
          l = SystemClock.elapsedRealtime();
          a(l);
          localObject2 = a(i);
          Handler localHandler = tt.a;
          localObject5 = new com/google/android/gms/b/ps$2;
          ((ps.2)localObject5).<init>(this, (tg)localObject2);
          localHandler.post((Runnable)localObject5);
          return;
        }
        catch (ps.a locala)
        {
          j = a;
          int k = 3;
          if (j != k)
          {
            k = -1;
            if (j != k) {
              continue;
            }
          }
          localObject3 = locala.getMessage();
          tp.d((String)localObject3);
        }
        Object localObject3 = f;
        if (localObject3 == null)
        {
          localObject3 = new com/google/android/gms/b/qr;
          ((qr)localObject3).<init>(j);
          f = ((qr)localObject3);
          localObject3 = tt.a;
          localObject5 = new com/google/android/gms/b/ps$1;
          ((ps.1)localObject5).<init>(this);
          ((Handler)localObject3).post((Runnable)localObject5);
          i = j;
          continue;
          localObject3 = ((ps.a)localObject3).getMessage();
          tp.e((String)localObject3);
          continue;
        }
        localqr = new com/google/android/gms/b/qr;
      }
      finally {}
      qr localqr;
      Object localObject5 = f;
      long l = k;
      localqr.<init>(j, l);
      f = localqr;
    }
  }
  
  protected abstract void a(long paramLong);
  
  protected final void a(tg paramtg)
  {
    a.b(paramtg);
  }
  
  public void c_() {}
}


/* Location:              com/google/android/gms/b/ps.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */