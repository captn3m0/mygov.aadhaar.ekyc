package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class i
  implements ServiceConnection
{
  public boolean a = false;
  public final BlockingQueue b;
  
  public i()
  {
    LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>();
    b = localLinkedBlockingQueue;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    b.add(paramIBinder);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              com/google/android/gms/common/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */