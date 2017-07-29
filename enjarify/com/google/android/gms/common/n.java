package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.dynamite.DynamiteModule.a;

final class n
{
  private static ae a;
  private static final Object b;
  private static Context c;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
  }
  
  static void a(Context paramContext)
  {
    synchronized (n.class)
    {
      Object localObject1 = c;
      if (localObject1 == null)
      {
        if (paramContext != null)
        {
          localObject1 = paramContext.getApplicationContext();
          c = (Context)localObject1;
        }
        return;
      }
      localObject1 = "GoogleCertificates";
      String str = "GoogleCertificates has been initialized already";
      Log.w((String)localObject1, str);
    }
  }
  
  private static boolean a()
  {
    boolean bool = true;
    ??? = a;
    if (??? != null) {}
    Object localObject2;
    Object localObject3;
    Object localObject5;
    for (;;)
    {
      return bool;
      c.a(c);
      String str;
      synchronized (b)
      {
        localObject2 = a;
        if (localObject2 != null) {}
      }
    }
  }
  
  static boolean a(String paramString, n.a parama)
  {
    boolean bool1 = false;
    boolean bool2 = a();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      try
      {
        ae localae = a;
        localObject = parama.c();
        localObject = b.a(localObject);
        bool1 = localae.a(paramString, (a)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = "GoogleCertificates";
        String str = "Failed to get Google certificates from remote";
        Log.e((String)localObject, str, localRemoteException);
      }
    }
  }
  
  static boolean b(String paramString, n.a parama)
  {
    boolean bool1 = false;
    boolean bool2 = a();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      try
      {
        ae localae = a;
        localObject = parama.c();
        localObject = b.a(localObject);
        bool1 = localae.b(paramString, (a)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = "GoogleCertificates";
        String str = "Failed to get Google certificates from remote";
        Log.e((String)localObject, str, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/common/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */