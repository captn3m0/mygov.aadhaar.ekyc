package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.g.a;
import com.google.android.gms.b.ab;
import com.google.android.gms.b.by;
import com.google.android.gms.b.cf;
import com.google.android.gms.b.cu;
import com.google.android.gms.b.cu.a;
import com.google.android.gms.b.dc;
import com.google.android.gms.b.dh;
import com.google.android.gms.b.di;
import com.google.android.gms.b.do;
import com.google.android.gms.b.dr;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AppMeasurement
{
  private final dc zzbqb;
  
  public AppMeasurement(dc paramdc)
  {
    c.a(paramdc);
    zzbqb = paramdc;
  }
  
  public static AppMeasurement getInstance(Context paramContext)
  {
    return af;
  }
  
  private void zzc(String paramString1, String paramString2, Object paramObject)
  {
    zzbqb.h().a(paramString1, paramString2, paramObject);
  }
  
  public void beginAdUnitExposure(String paramString)
  {
    zzbqb.q().a(paramString);
  }
  
  protected void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    zzbqb.h().c(paramString1, paramString2, paramBundle);
  }
  
  protected void clearConditionalUserPropertyAs(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    zzbqb.h().a(paramString1, paramString2, paramString3, paramBundle);
  }
  
  public void endAdUnitExposure(String paramString)
  {
    zzbqb.q().b(paramString);
  }
  
  public long generateEventId()
  {
    return zzbqb.i().x();
  }
  
  public String getAppInstanceId()
  {
    return zzbqb.h().z();
  }
  
  public List getConditionalUserProperties(String paramString1, String paramString2)
  {
    return zzbqb.h().a(paramString1, paramString2);
  }
  
  protected List getConditionalUserPropertiesAs(String paramString1, String paramString2, String paramString3)
  {
    return zzbqb.h().a(paramString1, paramString2, paramString3);
  }
  
  public String getCurrentScreenClass()
  {
    Object localObject = zzbqb.l().y();
    if (localObject != null) {}
    for (localObject = c;; localObject = null) {
      return (String)localObject;
    }
  }
  
  public String getCurrentScreenName()
  {
    Object localObject = zzbqb.l().y();
    if (localObject != null) {}
    for (localObject = b;; localObject = null) {
      return (String)localObject;
    }
  }
  
  public String getGmpAppId()
  {
    try
    {
      str1 = ab.a();
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        String str1;
        cu.a locala = zzbqb.e().a;
        String str2 = "getGoogleAppId failed with exception";
        locala.a(str2, localIllegalStateException);
        Object localObject = null;
      }
    }
    return str1;
  }
  
  public int getMaxUserProperties(String paramString)
  {
    zzbqb.h();
    c.a(paramString);
    return cf.L();
  }
  
  protected Map getUserProperties(String paramString1, String paramString2, boolean paramBoolean)
  {
    return zzbqb.h().a(paramString1, paramString2, paramBoolean);
  }
  
  protected Map getUserPropertiesAs(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    return zzbqb.h().a(paramString1, paramString2, paramString3, paramBoolean);
  }
  
  public void logEvent(String paramString, Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    cf.W();
    Object localObject = "_iap";
    boolean bool1 = ((String)localObject).equals(paramString);
    int i;
    if (!bool1)
    {
      localObject = zzbqb.i();
      int j = ((dr)localObject).b(paramString);
      if (j != 0)
      {
        localObject = zzbqb;
        ((dc)localObject).i();
        i = cf.y();
        boolean bool2 = true;
        String str1 = dr.a(paramString, i, bool2);
        if (paramString != null)
        {
          i = paramString.length();
          dr localdr = zzbqb.i();
          String str2 = "_ev";
          localdr.a(j, str2, str1, i);
        }
      }
    }
    for (;;)
    {
      return;
      i = 0;
      localObject = null;
      break;
      localObject = zzbqb.h();
      String str3 = "app";
      ((dh)localObject).a(str3, paramString, paramBundle);
    }
  }
  
  public void logEventInternal(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    zzbqb.h().b(paramString1, paramString2, paramBundle);
  }
  
  public void registerOnScreenChangeCallback(AppMeasurement.d paramd)
  {
    zzbqb.l().a(paramd);
  }
  
  protected void setConditionalUserProperty(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    zzbqb.h().a(paramConditionalUserProperty);
  }
  
  protected void setConditionalUserPropertyAs(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    zzbqb.h().b(paramConditionalUserProperty);
  }
  
  public void setMeasurementEnabled(boolean paramBoolean)
  {
    zzbqb.h().a(paramBoolean);
  }
  
  public void setMinimumSessionDuration(long paramLong)
  {
    zzbqb.h().a(paramLong);
  }
  
  public void setSessionTimeoutDuration(long paramLong)
  {
    zzbqb.h().b(paramLong);
  }
  
  public void setUserId(String paramString)
  {
    zzb("app", "_id", paramString);
  }
  
  public void setUserProperty(String paramString1, String paramString2)
  {
    Object localObject = zzbqb.i();
    int i = ((dr)localObject).d(paramString1);
    int j;
    if (i != 0)
    {
      localObject = zzbqb;
      ((dc)localObject).i();
      j = cf.z();
      boolean bool = true;
      String str1 = dr.a(paramString1, j, bool);
      if (paramString1 != null)
      {
        j = paramString1.length();
        dr localdr = zzbqb.i();
        String str2 = "_ev";
        localdr.a(i, str2, str1, j);
      }
    }
    for (;;)
    {
      return;
      j = 0;
      localObject = null;
      break;
      localObject = "app";
      zzb((String)localObject, paramString1, paramString2);
    }
  }
  
  public void unregisterOnScreenChangeCallback(AppMeasurement.d paramd)
  {
    zzbqb.l().b(paramd);
  }
  
  public void zza(AppMeasurement.b paramb)
  {
    zzbqb.h().a(paramb);
  }
  
  public void zza(AppMeasurement.c paramc)
  {
    zzbqb.h().a(paramc);
  }
  
  public void zza(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    Bundle localBundle;
    if (paramBundle == null)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
    }
    for (;;)
    {
      zzbqb.h().a(paramString1, paramString2, localBundle, paramLong);
      return;
      localBundle = paramBundle;
    }
  }
  
  public Map zzaI(boolean paramBoolean)
  {
    Object localObject = zzbqb.h().b(paramBoolean);
    a locala = new android/support/v4/g/a;
    int i = ((List)localObject).size();
    locala.<init>(i);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (do)localIterator.next();
      String str = b;
      localObject = ((do)localObject).a();
      locala.put(str, localObject);
    }
    return locala;
  }
  
  public void zzb(String paramString1, String paramString2, Object paramObject)
  {
    zzc(paramString1, paramString2, paramObject);
  }
}


/* Location:              com/google/android/gms/measurement/AppMeasurement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */