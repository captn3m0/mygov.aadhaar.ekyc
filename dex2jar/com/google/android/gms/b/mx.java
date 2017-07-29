package com.google.android.gms.b;

import android.os.Handler;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@qi
final class mx
{
  final List<a> a = new LinkedList();
  
  final void a(final my parammy)
  {
    Handler localHandler = tt.a;
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      localHandler.post(new Runnable()
      {
        public final void run()
        {
          try
          {
            a(parammy);
            return;
          }
          catch (RemoteException localRemoteException)
          {
            tp.c("Could not propagate interstitial ad event.", localRemoteException);
          }
        }
      });
    }
    a.clear();
  }
  
  static abstract interface a
  {
    public abstract void a(my parammy);
  }
}


/* Location:              com/google/android/gms/b/mx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */