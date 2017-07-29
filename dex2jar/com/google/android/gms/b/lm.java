package com.google.android.gms.b;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.b.b.a;
import com.google.android.gms.ads.b.e;
import com.google.android.gms.ads.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@qi
public final class lm
  extends e
{
  private final ll a;
  private final List<b.a> b = new ArrayList();
  private final li c;
  private final i d = new i();
  
  public lm(ll paramll)
  {
    a = paramll;
    for (;;)
    {
      try
      {
        paramll = a.b();
        if (paramll != null)
        {
          Iterator localIterator = paramll.iterator();
          if (localIterator.hasNext())
          {
            paramll = localIterator.next();
            if (!(paramll instanceof IBinder)) {
              break label144;
            }
            paramll = lh.a.a((IBinder)paramll);
            if (paramll == null) {
              continue;
            }
            b.add(new li(paramll));
            continue;
          }
        }
        try
        {
          paramll = a.d();
          if (paramll == null) {
            break;
          }
          paramll = new li(paramll);
        }
        catch (RemoteException paramll)
        {
          for (;;)
          {
            ul.b("Failed to get icon.", paramll);
            paramll = null;
          }
        }
      }
      catch (RemoteException paramll)
      {
        ul.b("Failed to get image.", paramll);
      }
      c = paramll;
      return;
      label144:
      paramll = null;
    }
  }
  
  private a k()
  {
    try
    {
      a locala = a.j();
      return locala;
    }
    catch (RemoteException localRemoteException)
    {
      ul.b("Failed to retrieve native ad engine.", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence b()
  {
    try
    {
      String str = a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ul.b("Failed to get headline.", localRemoteException);
    }
    return null;
  }
  
  public final List<b.a> c()
  {
    return b;
  }
  
  public final CharSequence d()
  {
    try
    {
      String str = a.c();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ul.b("Failed to get body.", localRemoteException);
    }
    return null;
  }
  
  public final b.a e()
  {
    return c;
  }
  
  public final CharSequence f()
  {
    try
    {
      String str = a.e();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ul.b("Failed to get call to action.", localRemoteException);
    }
    return null;
  }
  
  public final Double g()
  {
    try
    {
      double d1 = a.f();
      if (d1 == -1.0D) {
        return null;
      }
      return Double.valueOf(d1);
    }
    catch (RemoteException localRemoteException)
    {
      ul.b("Failed to get star rating.", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence h()
  {
    try
    {
      String str = a.g();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ul.b("Failed to get store", localRemoteException);
    }
    return null;
  }
  
  public final CharSequence i()
  {
    try
    {
      String str = a.h();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ul.b("Failed to get price.", localRemoteException);
    }
    return null;
  }
  
  public final i j()
  {
    try
    {
      if (a.i() != null) {
        d.a(a.i());
      }
      return d;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        ul.b("Exception occurred while getting video controller", localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/lm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */