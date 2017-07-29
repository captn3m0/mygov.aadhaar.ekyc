package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.w;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ta
{
  final AtomicBoolean a;
  private final Object b;
  private String c;
  
  public ta()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
    c = null;
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    a = ((AtomicBoolean)localObject);
  }
  
  static Bundle a(String paramString)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putString("_aeid", paramString);
    return localBundle;
  }
  
  private Object a(Class paramClass, Context paramContext)
  {
    Object localObject1 = null;
    Object localObject2 = "getInstance";
    int i = 1;
    try
    {
      localObject3 = new Class[i];
      int j = 0;
      Object[] arrayOfObject = null;
      Class localClass = Context.class;
      localObject3[0] = localClass;
      localObject2 = paramClass.getDeclaredMethod((String)localObject2, (Class[])localObject3);
      i = 0;
      localObject3 = null;
      j = 1;
      arrayOfObject = new Object[j];
      localClass = null;
      arrayOfObject[0] = paramContext;
      localObject1 = ((Method)localObject2).invoke(null, arrayOfObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3 = "getInstance";
        a(localException, (String)localObject3);
      }
    }
    return localObject1;
  }
  
  private Object a(String paramString, Context paramContext)
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = paramContext.getClassLoader();
      Object localObject3 = "com.google.android.gms.measurement.AppMeasurement";
      localObject2 = ((ClassLoader)localObject2).loadClass((String)localObject3);
      localObject3 = a((Class)localObject2, paramContext);
      Object localObject4 = null;
      localObject4 = new Class[0];
      localObject2 = ((Class)localObject2).getDeclaredMethod(paramString, (Class[])localObject4);
      localObject4 = null;
      localObject4 = new Object[0];
      localObject1 = ((Method)localObject2).invoke(localObject3, (Object[])localObject4);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        a(localException, paramString);
      }
    }
    return localObject1;
  }
  
  public final String a(Context paramContext)
  {
    boolean bool = a();
    Object localObject1;
    if (!bool)
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (String)localObject1;
      try
      {
        localObject1 = paramContext.getClassLoader();
        localObject3 = "com.google.android.gms.measurement.AppMeasurement";
        localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject3);
        localObject3 = a((Class)localObject1, paramContext);
        Object localObject4 = "getCurrentScreenName";
        Class[] arrayOfClass = null;
        arrayOfClass = new Class[0];
        localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject4, arrayOfClass);
        localObject4 = null;
        localObject4 = new Object[0];
        localObject1 = ((Method)localObject1).invoke(localObject3, (Object[])localObject4);
        localObject1 = (String)localObject1;
      }
      catch (Exception localException)
      {
        Object localObject3 = "getCurrentScreenName";
        a(localException, (String)localObject3);
        bool = false;
        Object localObject2 = null;
      }
    }
  }
  
  public final void a(Context paramContext, String paramString)
  {
    boolean bool = a();
    if (!bool) {}
    for (;;)
    {
      return;
      Bundle localBundle = a(paramString);
      String str1 = "1";
      localBundle.putString("_r", str1);
      String str2 = "_ac";
      a(paramContext, str2, localBundle);
    }
  }
  
  final void a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Object localObject1 = paramContext.getClassLoader();
      localObject2 = "com.google.android.gms.measurement.AppMeasurement";
      localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject2);
      localObject2 = a((Class)localObject1, paramContext);
      Object localObject3 = "logEventInternal";
      int i = 3;
      Class[] arrayOfClass = new Class[i];
      int j = 0;
      String str = null;
      Class localClass = String.class;
      arrayOfClass[0] = localClass;
      j = 1;
      localClass = String.class;
      arrayOfClass[j] = localClass;
      j = 2;
      localClass = Bundle.class;
      arrayOfClass[j] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject3, arrayOfClass);
      int k = 3;
      localObject3 = new Object[k];
      i = 0;
      arrayOfClass = null;
      str = "am";
      localObject3[0] = str;
      i = 1;
      localObject3[i] = paramString;
      i = 2;
      localObject3[i] = paramBundle;
      ((Method)localObject1).invoke(localObject2, (Object[])localObject3);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = "logEventInternal";
        a(localException, (String)localObject2);
      }
    }
  }
  
  final void a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      Object localObject1 = paramContext.getClassLoader();
      Object localObject2 = "com.google.android.gms.measurement.AppMeasurement";
      localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject2);
      localObject2 = a((Class)localObject1, paramContext);
      int i = 1;
      Object localObject3 = new Class[i];
      Class localClass = String.class;
      localObject3[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod(paramString2, (Class[])localObject3);
      i = 1;
      localObject3 = new Object[i];
      localObject3[0] = paramString1;
      ((Method)localObject1).invoke(localObject2, (Object[])localObject3);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        a(localException, paramString2);
      }
    }
  }
  
  public final void a(Exception paramException, String paramString)
  {
    Object localObject1 = a;
    boolean bool1 = ((AtomicBoolean)localObject1).get();
    if (!bool1)
    {
      int i = String.valueOf(paramString).length() + 190;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>(i);
      tp.b("Invoke Scion method " + paramString + " error, the Google Mobile Ads SDK will not integrate with Scion. Admob/Scion integration requires the latest Scion SDK jar, but Scion SDK is either missing or out of date", paramException);
      localObject1 = w.i();
      localObject2 = "ScionApiAdapter.logInvokeScionApiError";
      ((tj)localObject1).a(paramException, (String)localObject2);
      localObject1 = a;
      boolean bool2 = true;
      ((AtomicBoolean)localObject1).set(bool2);
    }
  }
  
  public final boolean a()
  {
    Object localObject = ke.au;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      localObject = a;
      bool = ((AtomicBoolean)localObject).get();
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public final String b(Context paramContext)
  {
    boolean bool = a();
    String str;
    if (!bool)
    {
      bool = false;
      str = null;
    }
    for (;;)
    {
      return str;
      synchronized (b)
      {
        str = c;
        if (str != null) {
          str = c;
        }
      }
      Object localObject2 = "getGmpAppId";
      localObject2 = a((String)localObject2, paramContext);
      localObject2 = (String)localObject2;
      c = ((String)localObject2);
      localObject2 = c;
    }
  }
  
  public final void b(Context paramContext, String paramString)
  {
    boolean bool = a();
    if (!bool) {}
    for (;;)
    {
      return;
      String str = "_ai";
      Bundle localBundle = a(paramString);
      a(paramContext, str, localBundle);
    }
  }
  
  public final boolean b()
  {
    Object localObject = ke.aw;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      bool = a();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public final String c(Context paramContext)
  {
    boolean bool = a();
    if (!bool) {
      bool = false;
    }
    for (String str = null;; str = (String)a("getAppInstanceId", paramContext)) {
      return str;
    }
  }
  
  public final void c(Context paramContext, String paramString)
  {
    boolean bool = a();
    if (!bool) {}
    for (;;)
    {
      return;
      String str = "_aq";
      Bundle localBundle = a(paramString);
      a(paramContext, str, localBundle);
    }
  }
  
  public final boolean c()
  {
    Object localObject = ke.ax;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      bool = a();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public final String d(Context paramContext)
  {
    String str = null;
    boolean bool = a();
    if (!bool) {}
    for (;;)
    {
      return str;
      Object localObject = a("generateEventId", paramContext);
      if (localObject != null) {
        str = localObject.toString();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ta.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */