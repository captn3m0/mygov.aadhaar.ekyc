package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.b.jf;
import com.google.android.gms.b.js;
import com.google.android.gms.b.ul;
import com.google.android.gms.common.internal.c;

public final class i
{
  private final Object a;
  private jf b;
  private i.a c;
  
  public i()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public final jf a()
  {
    synchronized (a)
    {
      jf localjf = b;
      return localjf;
    }
  }
  
  public final void a(jf paramjf)
  {
    synchronized (a)
    {
      b = paramjf;
      i.a locala = c;
      if (locala != null)
      {
        locala = c;
        ??? = "VideoLifecycleCallbacks may not be null.";
        c.a(locala, ???);
      }
      synchronized (a)
      {
        c = locala;
        Object localObject5 = b;
        if (localObject5 == null) {
          return;
        }
        try
        {
          localObject5 = b;
          js localjs = new com/google/android/gms/b/js;
          localjs.<init>(locala);
          ((jf)localObject5).a(localjs);
        }
        catch (RemoteException localRemoteException)
        {
          for (;;)
          {
            localObject5 = "Unable to call setVideoLifecycleCallbacks on video controller.";
            ul.b((String)localObject5, localRemoteException);
          }
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */