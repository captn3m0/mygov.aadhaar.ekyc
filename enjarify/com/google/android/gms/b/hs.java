package com.google.android.gms.b;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.o.b;

public final class hs
{
  public final Runnable a;
  public final Object b;
  hv c;
  hz d;
  private Context e;
  
  public hs()
  {
    Object localObject = new com/google/android/gms/b/hs$1;
    ((hs.1)localObject).<init>(this);
    a = ((Runnable)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
  }
  
  public final ht a(hw paramhw)
  {
    String str;
    ht localht;
    for (;;)
    {
      Object localObject2;
      synchronized (b)
      {
        localObject2 = d;
        if (localObject2 == null)
        {
          localObject2 = new com/google/android/gms/b/ht;
          ((ht)localObject2).<init>();
          return (ht)localObject2;
        }
      }
    }
  }
  
  public final void a()
  {
    synchronized (b)
    {
      Object localObject2 = e;
      if (localObject2 != null)
      {
        localObject2 = c;
        if (localObject2 == null) {}
      }
      else
      {
        return;
      }
      localObject2 = new com/google/android/gms/b/hs$3;
      ((hs.3)localObject2).<init>(this);
      hs.4 local4 = new com/google/android/gms/b/hs$4;
      local4.<init>(this);
      hv localhv = new com/google/android/gms/b/hv;
      Context localContext = e;
      Object localObject4 = w.u();
      localObject4 = ((ub)localObject4).a();
      localhv.<init>(localContext, (Looper)localObject4, (o.b)localObject2, local4);
      c = localhv;
      localObject2 = c;
      ((hv)localObject2).f_();
    }
  }
  
  public final void a(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return;
      synchronized (b)
      {
        Context localContext = e;
        if (localContext == null) {
          break;
        }
      }
    }
    Object localObject3 = paramContext.getApplicationContext();
    e = ((Context)localObject3);
    localObject3 = ke.cZ;
    Object localObject4 = w.q();
    localObject3 = ((kd)localObject4).a((jz)localObject3);
    localObject3 = (Boolean)localObject3;
    boolean bool = ((Boolean)localObject3).booleanValue();
    if (bool) {
      a();
    }
    for (;;)
    {
      break;
      localObject3 = ke.cY;
      localObject4 = w.q();
      localObject3 = ((kd)localObject4).a((jz)localObject3);
      localObject3 = (Boolean)localObject3;
      bool = ((Boolean)localObject3).booleanValue();
      if (bool)
      {
        localObject3 = new com/google/android/gms/b/hs$2;
        ((hs.2)localObject3).<init>(this);
        localObject4 = w.h();
        ((hh)localObject4).a((hh.b)localObject3);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/hs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */