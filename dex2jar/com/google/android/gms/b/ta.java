package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.w;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

@qi
public final class ta
{
  final AtomicBoolean a = new AtomicBoolean(false);
  private final Object b = new Object();
  private String c = null;
  
  static Bundle a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("_aeid", paramString);
    return localBundle;
  }
  
  private Object a(Class paramClass, Context paramContext)
  {
    try
    {
      paramClass = paramClass.getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext });
      return paramClass;
    }
    catch (Exception paramClass)
    {
      a(paramClass, "getInstance");
    }
    return null;
  }
  
  private Object a(String paramString, Context paramContext)
  {
    try
    {
      Class localClass = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
      paramContext = a(localClass, paramContext);
      paramContext = localClass.getDeclaredMethod(paramString, new Class[0]).invoke(paramContext, new Object[0]);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      a(paramContext, paramString);
    }
    return null;
  }
  
  public final String a(Context paramContext)
  {
    if (!a()) {
      return null;
    }
    try
    {
      Class localClass = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
      paramContext = a(localClass, paramContext);
      paramContext = (String)localClass.getDeclaredMethod("getCurrentScreenName", new Class[0]).invoke(paramContext, new Object[0]);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      a(paramContext, "getCurrentScreenName");
    }
    return null;
  }
  
  public final void a(Context paramContext, String paramString)
  {
    if (!a()) {
      return;
    }
    paramString = a(paramString);
    paramString.putString("_r", "1");
    a(paramContext, "_ac", paramString);
  }
  
  final void a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
      paramContext = a(localClass, paramContext);
      localClass.getDeclaredMethod("logEventInternal", new Class[] { String.class, String.class, Bundle.class }).invoke(paramContext, new Object[] { "am", paramString, paramBundle });
      return;
    }
    catch (Exception paramContext)
    {
      a(paramContext, "logEventInternal");
    }
  }
  
  final void a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      Class localClass = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
      paramContext = a(localClass, paramContext);
      localClass.getDeclaredMethod(paramString2, new Class[] { String.class }).invoke(paramContext, new Object[] { paramString1 });
      return;
    }
    catch (Exception paramContext)
    {
      a(paramContext, paramString2);
    }
  }
  
  public final void a(Exception paramException, String paramString)
  {
    if (!a.get())
    {
      tp.b(String.valueOf(paramString).length() + 190 + "Invoke Scion method " + paramString + " error, the Google Mobile Ads SDK will not integrate with Scion. Admob/Scion integration requires the latest Scion SDK jar, but Scion SDK is either missing or out of date", paramException);
      w.i().a(paramException, "ScionApiAdapter.logInvokeScionApiError");
      a.set(true);
    }
  }
  
  public final boolean a()
  {
    jz localjz = ke.au;
    return (((Boolean)w.q().a(localjz)).booleanValue()) && (!a.get());
  }
  
  public final String b(Context paramContext)
  {
    if (!a()) {
      return null;
    }
    synchronized (b)
    {
      if (c != null)
      {
        paramContext = c;
        return paramContext;
      }
    }
    c = ((String)a("getGmpAppId", paramContext));
    paramContext = c;
    return paramContext;
  }
  
  public final void b(Context paramContext, String paramString)
  {
    if (!a()) {
      return;
    }
    a(paramContext, "_ai", a(paramString));
  }
  
  public final boolean b()
  {
    jz localjz = ke.aw;
    return (((Boolean)w.q().a(localjz)).booleanValue()) && (a());
  }
  
  public final String c(Context paramContext)
  {
    if (!a()) {
      return null;
    }
    return (String)a("getAppInstanceId", paramContext);
  }
  
  public final void c(Context paramContext, String paramString)
  {
    if (!a()) {
      return;
    }
    a(paramContext, "_aq", a(paramString));
  }
  
  public final boolean c()
  {
    jz localjz = ke.ax;
    return (((Boolean)w.q().a(localjz)).booleanValue()) && (a());
  }
  
  public final String d(Context paramContext)
  {
    if (!a()) {}
    do
    {
      return null;
      paramContext = a("generateEventId", paramContext);
    } while (paramContext == null);
    return paramContext.toString();
  }
}


/* Location:              com/google/android/gms/b/ta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */