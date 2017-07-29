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
      if (a != null) {
        a.a(paramInt1, paramInt2, paramIntent);
      }
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        ul.c("Could not forward onActivityResult to in-app purchase manager:", localRemoteException);
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = ip.b();
    a = ((pi)io.a(this, io.a(this, "com.google.android.gms.ads.internal.purchase.useClientJar"), new io.5(paramBundle, this)));
    if (a == null)
    {
      ul.e("Could not create in-app purchase manager.");
      finish();
      return;
    }
    try
    {
      a.a();
      return;
    }
    catch (RemoteException paramBundle)
    {
      ul.c("Could not forward onCreate to in-app purchase manager:", paramBundle);
      finish();
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      if (a != null) {
        a.b();
      }
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        ul.c("Could not forward onDestroy to in-app purchase manager:", localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/purchase/InAppPurchaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */