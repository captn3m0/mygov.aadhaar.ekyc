package com.google.android.gms.b;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.a.a;

public final class jo
  extends ix.a
{
  private it a;
  
  public final String F()
  {
    return null;
  }
  
  public final void G() {}
  
  public final void a(il paramil) {}
  
  public final void a(is paramis) {}
  
  public final void a(it paramit)
  {
    a = paramit;
  }
  
  public final void a(iz paramiz) {}
  
  public final void a(jb paramjb) {}
  
  public final void a(jh paramjh) {}
  
  public final void a(jt paramjt) {}
  
  public final void a(kq paramkq) {}
  
  public final void a(ph paramph) {}
  
  public final void a(pl parampl, String paramString) {}
  
  public final void a(sb paramsb) {}
  
  public final void a(String paramString) {}
  
  public final void a(boolean paramBoolean) {}
  
  public final boolean a(ih paramih)
  {
    ul.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    uk.a.post(new Runnable()
    {
      public final void run()
      {
        if (jo.a(jo.this) != null) {}
        try
        {
          jo.a(jo.this).a(1);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          ul.c("Could not notify onAdFailedToLoad event.", localRemoteException);
        }
      }
    });
    return false;
  }
  
  public final void h() {}
  
  public final a i()
  {
    return null;
  }
  
  public final il j()
  {
    return null;
  }
  
  public final boolean k()
  {
    return false;
  }
  
  public final void l() {}
  
  public final void m() {}
  
  public final void n() {}
  
  public final void o() {}
  
  public final boolean p()
  {
    return false;
  }
  
  public final jf q()
  {
    return null;
  }
}


/* Location:              com/google/android/gms/b/jo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */