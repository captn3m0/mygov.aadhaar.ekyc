package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class v$b
  extends Handler
{
  v$b(v paramv, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int i = what;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = "GACStateManager";
      int j = what;
      int k = 31;
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>(k);
      StringBuilder localStringBuilder2 = localStringBuilder1.append("Unknown message id: ");
      localObject2 = j;
      Log.w((String)localObject1, (String)localObject2);
    case 1: 
      for (;;)
      {
        return;
        localObject1 = (v.a)obj;
        localObject2 = a;
        ((v.a)localObject1).a((v)localObject2);
      }
    }
    throw ((RuntimeException)obj);
  }
}


/* Location:              com/google/android/gms/b/v$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */