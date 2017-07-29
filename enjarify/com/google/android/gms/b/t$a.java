package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class t$a
  extends Handler
{
  t$a(t paramt, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int i = what;
    Object localObject;
    switch (i)
    {
    default: 
      localObject = "GoogleApiClientImpl";
      int j = what;
      int k = 31;
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>(k);
      StringBuilder localStringBuilder2 = localStringBuilder1.append("Unknown message id: ");
      String str = j;
      Log.w((String)localObject, str);
    }
    for (;;)
    {
      return;
      localObject = a;
      t.b((t)localObject);
      continue;
      localObject = a;
      t.a((t)localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/t$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */