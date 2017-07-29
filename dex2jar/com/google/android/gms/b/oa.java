package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.h;
import com.google.ads.mediation.i;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.customevent.a;
import java.util.Map;

@qi
public final class oa
  extends oc.a
{
  public Map<Class<? extends Object>, Object> a;
  
  private <NETWORK_EXTRAS extends i, SERVER_PARAMETERS extends h> od c(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString, false, oa.class.getClassLoader());
      if (com.google.ads.mediation.c.class.isAssignableFrom((Class)localObject))
      {
        localObject = (com.google.ads.mediation.c)((Class)localObject).newInstance();
        return new oo((com.google.ads.mediation.c)localObject, (i)a.get(((com.google.ads.mediation.c)localObject).a()));
      }
      if (b.class.isAssignableFrom((Class)localObject)) {
        return new oj((b)((Class)localObject).newInstance());
      }
      ul.e(String.valueOf(paramString).length() + 64 + "Could not instantiate mediation adapter: " + paramString + " (not a valid adapter).");
      throw new RemoteException();
    }
    catch (Throwable localThrowable) {}
    return d(paramString);
  }
  
  private od d(String paramString)
  {
    do
    {
      try
      {
        ul.b("Reflection failed, retrying using direct instantiation");
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString)) {
          return new oj(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(paramString))
        {
          oj localoj = new oj(new AdUrlAdapter());
          return localoj;
        }
      }
      catch (Throwable localThrowable)
      {
        ul.c(String.valueOf(paramString).length() + 43 + "Could not instantiate mediation adapter: " + paramString + ". ", localThrowable);
        throw new RemoteException();
      }
      if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString)) {
        return new oj(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
      }
    } while (!"com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString));
    oo localoo = new oo(new com.google.ads.mediation.customevent.CustomEventAdapter(), (com.google.android.gms.ads.mediation.customevent.c)a.get(com.google.android.gms.ads.mediation.customevent.c.class));
    return localoo;
  }
  
  public final od a(String paramString)
  {
    return c(paramString);
  }
  
  public final boolean b(String paramString)
  {
    try
    {
      boolean bool = a.class.isAssignableFrom(Class.forName(paramString, false, oa.class.getClassLoader()));
      return bool;
    }
    catch (Throwable localThrowable)
    {
      ul.e(String.valueOf(paramString).length() + 80 + "Could not load custom event implementation class: " + paramString + ", assuming old implementation.");
    }
    return false;
  }
}


/* Location:              com/google/android/gms/b/oa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */