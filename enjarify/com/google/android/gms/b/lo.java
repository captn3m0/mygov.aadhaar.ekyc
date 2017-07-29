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

public final class lo
  extends f
{
  private final ln a;
  private final List b;
  private final li c;
  private final i d;
  
  public lo(ln paramln)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    b = ((List)localObject1);
    localObject1 = new com/google/android/gms/ads/i;
    ((i)localObject1).<init>();
    d = ((i)localObject1);
    a = paramln;
    for (;;)
    {
      try
      {
        localObject1 = a;
        localObject1 = ((ln)localObject1).b();
        Object localObject4;
        boolean bool1;
        if (localObject1 != null)
        {
          localObject4 = ((List)localObject1).iterator();
          bool1 = ((Iterator)localObject4).hasNext();
          if (bool1)
          {
            localObject1 = ((Iterator)localObject4).next();
            boolean bool2 = localObject1 instanceof IBinder;
            if (!bool2) {
              break label173;
            }
            localObject1 = (IBinder)localObject1;
            localObject1 = lh.a.a((IBinder)localObject1);
            if (localObject1 == null) {
              continue;
            }
            List localList = b;
            li localli = new com/google/android/gms/b/li;
            localli.<init>((lh)localObject1);
            localList.add(localli);
            continue;
          }
        }
        try
        {
          localObject2 = a;
          localObject4 = ((ln)localObject2).d();
          if (localObject4 == null) {
            break;
          }
          localObject2 = new com/google/android/gms/b/li;
          ((li)localObject2).<init>((lh)localObject4);
        }
        catch (RemoteException localRemoteException2)
        {
          for (;;)
          {
            Object localObject2;
            localObject4 = "Failed to get icon.";
            ul.b((String)localObject4, localRemoteException2);
            bool1 = false;
            Object localObject3 = null;
          }
        }
      }
      catch (RemoteException localRemoteException1)
      {
        localObject4 = "Failed to get image.";
        ul.b((String)localObject4, localRemoteException1);
      }
      c = ((li)localObject2);
      return;
      label173:
      bool1 = false;
      localObject2 = null;
    }
  }
  
  private a i()
  {
    try
    {
      localObject1 = a;
      localObject1 = ((ln)localObject1).h();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to retrieve native ad engine.";
        ul.b(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (a)localObject1;
  }
  
  public final CharSequence b()
  {
    try
    {
      localObject1 = a;
      localObject1 = ((ln)localObject1).a();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get headline.";
        ul.b(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (CharSequence)localObject1;
  }
  
  public final List c()
  {
    return b;
  }
  
  public final CharSequence d()
  {
    try
    {
      localObject1 = a;
      localObject1 = ((ln)localObject1).c();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get body.";
        ul.b(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (CharSequence)localObject1;
  }
  
  public final b.a e()
  {
    return c;
  }
  
  public final CharSequence f()
  {
    try
    {
      localObject1 = a;
      localObject1 = ((ln)localObject1).e();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get call to action.";
        ul.b(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (CharSequence)localObject1;
  }
  
  public final CharSequence g()
  {
    try
    {
      localObject1 = a;
      localObject1 = ((ln)localObject1).f();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get attribution.";
        ul.b(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (CharSequence)localObject1;
  }
  
  public final i h()
  {
    try
    {
      Object localObject1 = a;
      localObject1 = ((ln)localObject1).g();
      if (localObject1 != null)
      {
        localObject1 = d;
        localObject2 = a;
        localObject2 = ((ln)localObject2).g();
        ((i)localObject1).a((jf)localObject2);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Exception occurred while getting video controller";
        ul.b((String)localObject2, localRemoteException);
      }
    }
    return d;
  }
}


/* Location:              com/google/android/gms/b/lo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */