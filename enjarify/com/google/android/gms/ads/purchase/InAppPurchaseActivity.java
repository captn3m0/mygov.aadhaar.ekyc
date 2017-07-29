package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.b.io;
import com.google.android.gms.b.io.5;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.pi;
import com.google.android.gms.b.ul;

public class InAppPurchaseActivity
  extends Activity
{
  private pi a;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      pi localpi = a;
      if (localpi != null)
      {
        localpi = a;
        localpi.a(paramInt1, paramInt2, paramIntent);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onActivityResult to in-app purchase manager:";
        ul.c(str, localRemoteException);
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject = ip.b();
    String str = "com.google.android.gms.ads.internal.purchase.useClientJar";
    boolean bool = io.a(this, str);
    io.5 local5 = new com/google/android/gms/b/io$5;
    local5.<init>((io)localObject, this);
    localObject = (pi)io.a(this, bool, local5);
    a = ((pi)localObject);
    localObject = a;
    if (localObject == null)
    {
      localObject = "Could not create in-app purchase manager.";
      ul.e((String)localObject);
      finish();
    }
    for (;;)
    {
      return;
      try
      {
        localObject = a;
        ((pi)localObject).a();
      }
      catch (RemoteException localRemoteException)
      {
        str = "Could not forward onCreate to in-app purchase manager:";
        ul.c(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      pi localpi = a;
      if (localpi != null)
      {
        localpi = a;
        localpi.b();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onDestroy to in-app purchase manager:";
        ul.c(str, localRemoteException);
      }
    }
    super.onDestroy();
  }
}


/* Location:              com/google/android/gms/ads/purchase/InAppPurchaseActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */