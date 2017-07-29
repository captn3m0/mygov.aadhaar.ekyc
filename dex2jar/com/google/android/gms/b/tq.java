package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.w;

@qi
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
    catch (Exception paramMessage)
    {
      w.i().a(paramMessage, "AdMobHandler.handleMessage");
    }
  }
}


/* Location:              com/google/android/gms/b/tq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */