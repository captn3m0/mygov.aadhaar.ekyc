package com.google.android.gms.b;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.h;
import java.lang.ref.WeakReference;

final class as$a
  extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    int i = what;
    Object localObject1;
    switch (i)
    {
    default: 
      localObject1 = "TransformedResultImpl";
      int j = what;
      int k = 70;
      ??? = new java/lang/StringBuilder;
      ((StringBuilder)???).<init>(k);
      localObject7 = ((StringBuilder)???).append("TransformationResultHandler received unknown message type: ");
      localObject8 = j;
      Log.e((String)localObject1, (String)localObject8);
      return;
    case 0: 
      localObject1 = (d)obj;
      localObject8 = a.e;
      if (localObject1 == null) {}
      Object localObject9;
      Object localObject3;
      for (;;)
      {
        try
        {
          localObject1 = a;
          localObject1 = b;
          localObject7 = new com/google/android/gms/common/api/Status;
          int m = 13;
          localObject9 = "Transform returned null";
          ((Status)localObject7).<init>(m, (String)localObject9);
          ((as)localObject1).a((Status)localObject7);
          break;
        }
        finally {}
        boolean bool1 = localObject2 instanceof an;
        if (!bool1) {
          break label199;
        }
        localObject7 = a;
        localObject7 = b;
        localObject3 = (an)localObject2;
        localObject3 = a;
        ((as)localObject7).a((Status)localObject3);
      }
      label199:
      localObject7 = a;
      localObject7 = b;
      for (;;)
      {
        synchronized (e)
        {
          d = ((d)localObject3);
          localObject3 = a;
          if (localObject3 == null)
          {
            localObject3 = c;
            if (localObject3 == null) {}
          }
          else
          {
            localObject3 = g;
            localObject3 = ((WeakReference)localObject3).get();
            localObject3 = (c)localObject3;
            boolean bool2 = i;
            if (!bool2)
            {
              localObject9 = a;
              if ((localObject9 != null) && (localObject3 != null))
              {
                ((c)localObject3).a((as)localObject7);
                i = 1;
                i = i;
              }
            }
            localObject3 = f;
            if (localObject3 == null) {
              break label340;
            }
            localObject3 = f;
            ((as)localObject7).b((Status)localObject3);
          }
        }
        label340:
        localObject5 = d;
        if (localObject5 != null)
        {
          localObject5 = d;
          ((d)localObject5).a((h)localObject7);
        }
      }
    }
    Object localObject5 = (RuntimeException)obj;
    Object localObject7 = "TransformedResultImpl";
    ??? = "Runtime exception on the transformation worker thread: ";
    Object localObject8 = String.valueOf(((RuntimeException)localObject5).getMessage());
    int n = ((String)localObject8).length();
    if (n != 0) {
      localObject8 = ((String)???).concat((String)localObject8);
    }
    for (;;)
    {
      Log.e((String)localObject7, (String)localObject8);
      throw ((Throwable)localObject5);
      localObject8 = new java/lang/String;
      ((String)localObject8).<init>((String)???);
    }
  }
}


/* Location:              com/google/android/gms/b/as$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */