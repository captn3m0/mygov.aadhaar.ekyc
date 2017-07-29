package com.google.android.gms.b;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public final class as<R extends g>
  extends k<R>
  implements com.google.android.gms.common.api.h<R>
{
  j<? super R, ? extends g> a;
  as<? extends g> b;
  volatile i<? super R> c;
  d<R> d;
  final Object e;
  Status f;
  final WeakReference<com.google.android.gms.common.api.c> g;
  final a h;
  boolean i;
  
  private boolean a()
  {
    com.google.android.gms.common.api.c localc = (com.google.android.gms.common.api.c)g.get();
    return (c != null) && (localc != null);
  }
  
  final void a(Status paramStatus)
  {
    synchronized (e)
    {
      f = paramStatus;
      b(f);
      return;
    }
  }
  
  public final void a(final R paramR)
  {
    synchronized (e)
    {
      if (paramR.a().b())
      {
        if (a != null) {
          am.a().submit(new Runnable()
          {
            public final void run()
            {
              try
              {
                h.c.set(Boolean.valueOf(true));
                Object localObject1 = a.a();
                h.sendMessage(h.obtainMessage(0, localObject1));
                h.c.set(Boolean.valueOf(false));
                localObject1 = (com.google.android.gms.common.api.c)g.get();
                if (localObject1 != null) {
                  ((com.google.android.gms.common.api.c)localObject1).b(as.this);
                }
                return;
              }
              catch (RuntimeException localRuntimeException)
              {
                h.sendMessage(h.obtainMessage(1, localRuntimeException));
                com.google.android.gms.common.api.c localc1;
                return;
              }
              finally
              {
                h.c.set(Boolean.valueOf(false));
                com.google.android.gms.common.api.c localc2 = (com.google.android.gms.common.api.c)g.get();
                if (localc2 != null) {
                  localc2.b(as.this);
                }
              }
            }
          });
        }
        for (;;)
        {
          return;
          if (a()) {
            paramR = c;
          }
        }
      }
      a(paramR.a());
    }
  }
  
  final void b(Status paramStatus)
  {
    synchronized (e)
    {
      if (a != null)
      {
        com.google.android.gms.common.internal.c.a(paramStatus, "onFailure must not return null");
        b.a(paramStatus);
      }
      while (!a()) {
        return;
      }
      paramStatus = c;
    }
  }
  
  private final class a
    extends Handler
  {
    public final void handleMessage(Message paramMessage)
    {
      switch (what)
      {
      default: 
        int i = what;
        Log.e("TransformedResultImpl", 70 + "TransformationResultHandler received unknown message type: " + i);
        return;
      case 0: 
        Object localObject3 = (d)obj;
        paramMessage = a.e;
        if (localObject3 == null) {}
        for (;;)
        {
          try
          {
            a.b.a(new Status(13, "Transform returned null"));
            return;
          }
          finally {}
          if (!(localObject3 instanceof an)) {
            break;
          }
          a.b.a(a);
        }
        as localas = a.b;
        for (;;)
        {
          synchronized (e)
          {
            d = ((d)localObject3);
            if ((a != null) || (c != null))
            {
              localObject3 = (com.google.android.gms.common.api.c)g.get();
              if ((!i) && (a != null) && (localObject3 != null))
              {
                ((com.google.android.gms.common.api.c)localObject3).a(localas);
                i = true;
              }
              if (f == null) {
                break label260;
              }
              localas.b(f);
            }
          }
          label260:
          if (d != null) {
            d.a(localh);
          }
        }
      }
      ??? = (RuntimeException)obj;
      paramMessage = String.valueOf(((RuntimeException)???).getMessage());
      if (paramMessage.length() != 0) {}
      for (paramMessage = "Runtime exception on the transformation worker thread: ".concat(paramMessage);; paramMessage = new String("Runtime exception on the transformation worker thread: "))
      {
        Log.e("TransformedResultImpl", paramMessage);
        throw ((Throwable)???);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */