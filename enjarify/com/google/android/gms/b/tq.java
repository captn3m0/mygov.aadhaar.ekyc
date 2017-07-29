package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.w;

public final class tq
  extends Handler
{
  public tq(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    try
    {
      super.handleMessage(paramMessage);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        tj localtj = w.i();
        String str = "AdMobHandler.handleMessage";
        localtj.a(localException, str);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/tq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */