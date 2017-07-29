package android.support.v7.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

final class k$b
{
  s a;
  boolean b;
  BroadcastReceiver c;
  IntentFilter d;
  
  k$b(k paramk, s params)
  {
    a = params;
    boolean bool = params.a();
    b = bool;
  }
  
  final void a()
  {
    Object localObject = c;
    if (localObject != null)
    {
      localObject = e.b;
      BroadcastReceiver localBroadcastReceiver = c;
      ((Context)localObject).unregisterReceiver(localBroadcastReceiver);
      localObject = null;
      c = null;
    }
  }
}


/* Location:              android/support/v7/app/k$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */