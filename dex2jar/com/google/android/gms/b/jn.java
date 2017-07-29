package com.google.android.gms.b;

import android.os.Handler;
import android.os.RemoteException;

public final class jn
  extends iv.a
{
  private it a;
  
  public final iu a()
  {
    return new a((byte)0);
  }
  
  public final void a(it paramit)
  {
    a = paramit;
  }
  
  public final void a(jb paramjb) {}
  
  public final void a(le paramle) {}
  
  public final void a(lq paramlq) {}
  
  public final void a(lr paramlr) {}
  
  public final void a(String paramString, lt paramlt, ls paramls) {}
  
  private final class a
    extends iu.a
  {
    private a() {}
    
    public final String a()
    {
      return null;
    }
    
    public final void a(ih paramih)
    {
      ul.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
      uk.a.post(new Runnable()
      {
        public final void run()
        {
          if (jn.a(jn.this) != null) {}
          try
          {
            jn.a(jn.this).a(1);
            return;
          }
          catch (RemoteException localRemoteException)
          {
            ul.c("Could not notify onAdFailedToLoad event.", localRemoteException);
          }
        }
      });
    }
    
    public final boolean b()
    {
      return false;
    }
  }
}


/* Location:              com/google/android/gms/b/jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */