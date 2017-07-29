package com.google.android.gms.b;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.b.b.a;
import com.google.android.gms.ads.b.f;
import com.google.android.gms.ads.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@qi
public final class lo
  extends f
{
  private final ln a;
  private final List<b.a> b = new ArrayList();
  private final li c;
  private final i d = new i();
  
  public lo(ln paramln)
  {
    a = paramln;
    for (;;)
    {
      try
      {
        paramln = a.b();
        if (paramln != null)
        {
          Iterator localIterator = paramln.iterator();
          if (localIterator.hasNext())
          {
            paramln = localIterator.next();
            if (!(paramln instanceof IBinder)) {
              break label144;
            }
            paramln = lh.a.a((IBinder)paramln);
            if (paramln == null) {
              continue;
            }
            b.add(new li(paramln));
            continue;
          }
        }
        try
        {
          paramln = a.d();
          if (paramln == null) {
            break;
          }
          paramln = new li(paramln);
        }
        catch (RemoteException paramln)
        {
          for (;;)
          {
            ul.b("Failed to get icon.", paramln);
            paramln = null;
          }
        }
      }
      catch (RemoteException paramln)
      {
        ul.b("Failed to get image.", paramln);
      }
      c = paramln;
      return;
      label144:
      paramln = null;
    }
  }
  
  private a i()
  {
    try
    {
      a locala = a.h();
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
  
  public final CharSequence g()
  {
    try
    {
      String str = a.f();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ul.b("Failed to get attribution.", localRemoteException);
    }
    return null;
  }
  
  public final i h()
  {
    try
    {
      if (a.g() != null) {
        d.a(a.g());
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


/* Location:              com/google/android/gms/b/lo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */