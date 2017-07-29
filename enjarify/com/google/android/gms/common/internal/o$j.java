package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.a;

public final class o$j
  extends o.a
{
  public final IBinder e;
  
  public o$j(o paramo, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(paramo, paramInt, paramBundle);
    e = paramIBinder;
  }
  
  protected final void a(a parama)
  {
    o.c localc = o.d(f);
    if (localc != null)
    {
      localc = o.d(f);
      localc.a(parama);
    }
    f.a(parama);
  }
  
  protected final boolean a()
  {
    bool1 = false;
    localb = null;
    try
    {
      Object localObject1 = e;
      localObject1 = ((IBinder)localObject1).getInterfaceDescriptor();
      localObject3 = f.g();
      boolean bool2 = ((String)localObject3).equals(localObject1);
      if (bool2) {
        break label159;
      }
      localObject3 = "GmsClient";
      Object localObject4 = String.valueOf(f.g());
      i = String.valueOf(localObject4).length() + 34;
      int j = String.valueOf(localObject1).length();
      i += j;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      localObject4 = localStringBuilder.append("service descriptor mismatch: ").append((String)localObject4);
      String str = " vs. ";
      localObject4 = ((StringBuilder)localObject4).append(str);
      localObject1 = (String)localObject1;
      Log.e((String)localObject3, (String)localObject1);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        int i;
        Object localObject2 = "GmsClient";
        Object localObject3 = "service probably died";
        Log.w((String)localObject2, (String)localObject3);
        continue;
        localObject2 = f;
        localObject3 = e;
        localObject2 = ((o)localObject2).a((IBinder)localObject3);
        if (localObject2 != null)
        {
          localObject3 = f;
          int k = 2;
          i = 3;
          boolean bool3 = o.a((o)localObject3, k, i, (IInterface)localObject2);
          if (bool3)
          {
            localb = o.b(f);
            if (localb != null)
            {
              localb = o.b(f);
              localb.a();
            }
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              com/google/android/gms/common/internal/o$j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */