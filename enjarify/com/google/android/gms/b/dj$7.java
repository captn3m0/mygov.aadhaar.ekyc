package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement.f;

final class dj$7
  implements Runnable
{
  dj$7(dj paramdj, AppMeasurement.f paramf) {}
  
  public final void run()
  {
    Object localObject1 = b;
    Object localObject3 = b;
    if (localObject3 == null)
    {
      localObject1 = b.u().a;
      localObject3 = "Failed to send current screen to service";
      ((cu.a)localObject1).a((String)localObject3);
      return;
    }
    for (;;)
    {
      try
      {
        localObject1 = a;
        if (localObject1 != null) {
          break label116;
        }
        l = 0L;
        str1 = null;
        str2 = null;
        localObject1 = b;
        localObject1 = ((dj)localObject1).n();
        str3 = ((Context)localObject1).getPackageName();
        ((cq)localObject3).a(l, null, null, str3);
        localObject1 = b;
        dj.c((dj)localObject1);
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = b.u().a;
        String str4 = "Failed to send current screen to the service";
        ((cu.a)localObject3).a(str4, localRemoteException);
      }
      break;
      label116:
      Object localObject2 = a;
      long l = d;
      localObject2 = a;
      String str1 = b;
      localObject2 = a;
      String str2 = c;
      localObject2 = b;
      localObject2 = ((dj)localObject2).n();
      String str3 = ((Context)localObject2).getPackageName();
      ((cq)localObject3).a(l, str1, str2, str3);
    }
  }
}


/* Location:              com/google/android/gms/b/dj$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */