package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.b.tp;
import java.lang.reflect.Method;

public final class b
{
  Object a;
  private final Context b;
  private final boolean c;
  
  public b(Context paramContext)
  {
    this(paramContext, true);
  }
  
  public b(Context paramContext, boolean paramBoolean)
  {
    b = paramContext;
    c = paramBoolean;
  }
  
  public final int a(String paramString1, String paramString2)
  {
    try
    {
      Object localObject1 = b;
      localObject1 = ((Context)localObject1).getClassLoader();
      localObject2 = "com.android.vending.billing.IInAppBillingService";
      localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject2);
      localObject2 = "consumePurchase";
      int i = 3;
      Object localObject3 = new Class[i];
      int j = 0;
      Object localObject4 = Integer.TYPE;
      localObject3[0] = localObject4;
      j = 1;
      localObject4 = String.class;
      localObject3[j] = localObject4;
      j = 2;
      localObject4 = String.class;
      localObject3[j] = localObject4;
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
      localObject3 = a;
      localObject1 = ((Class)localObject1).cast(localObject3);
      i = 3;
      localObject3 = new Object[i];
      j = 0;
      int k = 3;
      localObject4 = Integer.valueOf(k);
      localObject3[0] = localObject4;
      j = 1;
      localObject3[j] = paramString1;
      j = 2;
      localObject3[j] = paramString2;
      localObject1 = ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
      localObject1 = (Integer)localObject1;
      m = ((Integer)localObject1).intValue();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        boolean bool = c;
        if (bool)
        {
          localObject2 = "IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.";
          tp.c((String)localObject2, localException);
        }
        int m = 5;
      }
    }
    return m;
  }
  
  public final Bundle a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      localObject1 = b;
      localObject1 = ((Context)localObject1).getClassLoader();
      localObject3 = "com.android.vending.billing.IInAppBillingService";
      localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject3);
      localObject3 = "getBuyIntent";
      int i = 5;
      Object localObject4 = new Class[i];
      int j = 0;
      Object localObject5 = Integer.TYPE;
      localObject4[0] = localObject5;
      j = 1;
      localObject5 = String.class;
      localObject4[j] = localObject5;
      j = 2;
      localObject5 = String.class;
      localObject4[j] = localObject5;
      j = 3;
      localObject5 = String.class;
      localObject4[j] = localObject5;
      j = 4;
      localObject5 = String.class;
      localObject4[j] = localObject5;
      localObject3 = ((Class)localObject1).getDeclaredMethod((String)localObject3, (Class[])localObject4);
      localObject4 = a;
      localObject1 = ((Class)localObject1).cast(localObject4);
      i = 5;
      localObject4 = new Object[i];
      j = 0;
      int k = 3;
      localObject5 = Integer.valueOf(k);
      localObject4[0] = localObject5;
      j = 1;
      localObject4[j] = paramString1;
      j = 2;
      localObject4[j] = paramString2;
      j = 3;
      localObject5 = "inapp";
      localObject4[j] = localObject5;
      j = 4;
      localObject4[j] = paramString3;
      localObject1 = ((Method)localObject3).invoke(localObject1, (Object[])localObject4);
      localObject1 = (Bundle)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3;
        boolean bool = c;
        if (bool)
        {
          localObject3 = "IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.";
          tp.c((String)localObject3, localException);
        }
        Object localObject2 = null;
      }
    }
    return (Bundle)localObject1;
  }
  
  public final void a(IBinder paramIBinder)
  {
    try
    {
      Object localObject1 = b;
      localObject1 = ((Context)localObject1).getClassLoader();
      String str2 = "com.android.vending.billing.IInAppBillingService$Stub";
      localObject1 = ((ClassLoader)localObject1).loadClass(str2);
      str2 = "asInterface";
      int i = 1;
      Object localObject2 = new Class[i];
      Class localClass = IBinder.class;
      localObject2[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod(str2, (Class[])localObject2);
      str2 = null;
      i = 1;
      localObject2 = new Object[i];
      localObject2[0] = paramIBinder;
      localObject1 = ((Method)localObject1).invoke(null, (Object[])localObject2);
      a = localObject1;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = c;
        if (bool)
        {
          String str1 = "IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.";
          tp.e(str1);
        }
      }
    }
  }
  
  public final Bundle b(String paramString1, String paramString2)
  {
    try
    {
      localObject1 = b;
      localObject1 = ((Context)localObject1).getClassLoader();
      localObject3 = "com.android.vending.billing.IInAppBillingService";
      localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject3);
      localObject3 = "getPurchases";
      int i = 4;
      Object localObject4 = new Class[i];
      int j = 0;
      Object localObject5 = Integer.TYPE;
      localObject4[0] = localObject5;
      j = 1;
      localObject5 = String.class;
      localObject4[j] = localObject5;
      j = 2;
      localObject5 = String.class;
      localObject4[j] = localObject5;
      j = 3;
      localObject5 = String.class;
      localObject4[j] = localObject5;
      localObject3 = ((Class)localObject1).getDeclaredMethod((String)localObject3, (Class[])localObject4);
      localObject4 = a;
      localObject1 = ((Class)localObject1).cast(localObject4);
      i = 4;
      localObject4 = new Object[i];
      j = 0;
      int k = 3;
      localObject5 = Integer.valueOf(k);
      localObject4[0] = localObject5;
      j = 1;
      localObject4[j] = paramString1;
      j = 2;
      localObject5 = "inapp";
      localObject4[j] = localObject5;
      j = 3;
      localObject4[j] = paramString2;
      localObject1 = ((Method)localObject3).invoke(localObject1, (Object[])localObject4);
      localObject1 = (Bundle)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3;
        boolean bool = c;
        if (bool)
        {
          localObject3 = "IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.";
          tp.c((String)localObject3, localException);
        }
        Object localObject2 = null;
      }
    }
    return (Bundle)localObject1;
  }
  
  public final int c(String paramString1, String paramString2)
  {
    try
    {
      Object localObject1 = b;
      localObject1 = ((Context)localObject1).getClassLoader();
      localObject2 = "com.android.vending.billing.IInAppBillingService";
      localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject2);
      localObject2 = "isBillingSupported";
      int i = 3;
      Object localObject3 = new Class[i];
      int j = 0;
      Object localObject4 = Integer.TYPE;
      localObject3[0] = localObject4;
      j = 1;
      localObject4 = String.class;
      localObject3[j] = localObject4;
      j = 2;
      localObject4 = String.class;
      localObject3[j] = localObject4;
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
      localObject3 = a;
      localObject1 = ((Class)localObject1).cast(localObject3);
      i = 3;
      localObject3 = new Object[i];
      j = 0;
      int k = 3;
      localObject4 = Integer.valueOf(k);
      localObject3[0] = localObject4;
      j = 1;
      localObject3[j] = paramString1;
      j = 2;
      localObject3[j] = paramString2;
      localObject1 = ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
      localObject1 = (Integer)localObject1;
      m = ((Integer)localObject1).intValue();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        boolean bool = c;
        if (bool)
        {
          localObject2 = "IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.";
          tp.c((String)localObject2, localException);
        }
        int m = 5;
      }
    }
    return m;
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */