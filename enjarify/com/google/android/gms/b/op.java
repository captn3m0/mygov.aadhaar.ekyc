package com.google.android.gms.b;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.a.a;
import com.google.ads.mediation.e;
import com.google.ads.mediation.g;

public final class op
  implements e, g
{
  final oe a;
  
  public op(oe paramoe)
  {
    a = paramoe;
  }
  
  public final void a(a.a parama)
  {
    Object localObject1 = String.valueOf(parama);
    int i = String.valueOf(localObject1).length() + 47;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    Object localObject2 = localStringBuilder.append("Adapter called onFailedToReceiveAd with error. ");
    localObject1 = (String)localObject1;
    ul.b((String)localObject1);
    ip.a();
    boolean bool = uk.b();
    if (!bool)
    {
      ul.e("onFailedToReceiveAd must be called on the main UI thread.");
      localObject1 = uk.a;
      localObject2 = new com/google/android/gms/b/op$2;
      ((op.2)localObject2).<init>(this, parama);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = a;
        i = oq.a(parama);
        ((oe)localObject1).a(i);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdFailedToLoad.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
  
  public final void b(a.a parama)
  {
    Object localObject1 = String.valueOf(parama);
    int i = String.valueOf(localObject1).length() + 47;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    localObject1 = localStringBuilder.append("Adapter called onFailedToReceiveAd with error ").append((String)localObject1);
    Object localObject2 = ".";
    localObject1 = (String)localObject2;
    ul.b((String)localObject1);
    ip.a();
    boolean bool = uk.b();
    if (!bool)
    {
      ul.e("onFailedToReceiveAd must be called on the main UI thread.");
      localObject1 = uk.a;
      localObject2 = new com/google/android/gms/b/op$1;
      ((op.1)localObject2).<init>(this, parama);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = a;
        i = oq.a(parama);
        ((oe)localObject1).a(i);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdFailedToLoad.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/op.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */