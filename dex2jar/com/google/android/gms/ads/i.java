package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.b.jf;
import com.google.android.gms.b.js;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.ul;
import com.google.android.gms.common.internal.c;

@qi
public final class i
{
  private final Object a = new Object();
  private jf b;
  private a c;
  
  public final jf a()
  {
    synchronized (a)
    {
      jf localjf = b;
      return localjf;
    }
  }
  
  public final void a(jf arg1)
  {
    for (;;)
    {
      a locala;
      synchronized (a)
      {
        b = ???;
        if (c != null)
        {
          locala = c;
          c.a(locala, "VideoLifecycleCallbacks may not be null.");
        }
        synchronized (a)
        {
          c = locala;
          if (b == null) {
            return;
          }
        }
      }
      try
      {
        b.a(new js(locala));
        continue;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        ??? = finally;
        throw ???;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          ul.b("Unable to call setVideoLifecycleCallbacks on video controller.", localRemoteException);
        }
      }
    }
  }
  
  public static abstract class a {}
}


/* Location:              com/google/android/gms/ads/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */