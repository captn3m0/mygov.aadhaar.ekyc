package com.google.android.gms.common;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class c$a
  extends Handler
{
  private final Context b;
  
  public c$a(c paramc, Context paramContext) {}
  
  public final void handleMessage(Message paramMessage)
  {
    int i = what;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (i)
    {
    default: 
      localObject1 = "GoogleApiAvailability";
      int j = what;
      int k = 50;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(k);
      localObject2 = localStringBuilder.append("Don't know how to handle this message: ");
      localObject3 = j;
      Log.w((String)localObject1, (String)localObject3);
    }
    for (;;)
    {
      return;
      localObject1 = a;
      localObject3 = b;
      i = ((c)localObject1).a((Context)localObject3);
      localObject3 = a;
      boolean bool = ((c)localObject3).a(i);
      if (bool)
      {
        localObject3 = a;
        localObject2 = b;
        ((c)localObject3).a((Context)localObject2, i);
      }
    }
  }
}


/* Location:              com/google/android/gms/common/c$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */