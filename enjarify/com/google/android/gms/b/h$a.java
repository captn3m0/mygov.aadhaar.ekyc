package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

public final class h$a
  extends Handler
{
  public h$a()
  {
    this(localLooper);
  }
  
  public h$a(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void a(com.google.android.gms.common.api.h paramh, g paramg)
  {
    Pair localPair = new android/util/Pair;
    localPair.<init>(paramh, paramg);
    Message localMessage = obtainMessage(1, localPair);
    sendMessage(localMessage);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int i = what;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = "BasePendingResult";
      int j = what;
      int k = 45;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(k);
      localObject2 = "Don't know how to handle message: " + j;
      Exception localException = new java/lang/Exception;
      localException.<init>();
      Log.wtf((String)localObject1, (String)localObject2, localException);
    }
    for (;;)
    {
      return;
      localObject1 = (Pair)obj;
      localObject2 = (com.google.android.gms.common.api.h)first;
      localObject1 = (g)second;
      try
      {
        ((com.google.android.gms.common.api.h)localObject2).a((g)localObject1);
      }
      catch (RuntimeException localRuntimeException)
      {
        h.b((g)localObject1);
        throw localRuntimeException;
      }
      localObject1 = (h)obj;
      Status localStatus = Status.d;
      ((h)localObject1).b(localStatus);
    }
  }
}


/* Location:              com/google/android/gms/b/h$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */