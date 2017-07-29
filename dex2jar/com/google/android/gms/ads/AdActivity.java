package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.a.b;
import com.google.android.gms.b.io;
import com.google.android.gms.b.io.6;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.pb;
import com.google.android.gms.b.ul;

public class AdActivity
  extends Activity
{
  private pb a;
  
  private void a()
  {
    if (a != null) {}
    try
    {
      a.l();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not forward setContentViewSet to ad overlay:", localRemoteException);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      a.a(paramInt1, paramInt2, paramIntent);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        ul.c("Could not forward onActivityResult to ad overlay:", localException);
      }
    }
  }
  
  public void onBackPressed()
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    try
    {
      if (a != null) {
        bool1 = a.e();
      }
      if (bool1) {
        super.onBackPressed();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        ul.c("Could not forward onBackPressed to ad overlay:", localRemoteException);
        bool1 = bool2;
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    try
    {
      a.a(b.a(paramConfiguration));
      return;
    }
    catch (RemoteException paramConfiguration)
    {
      ul.c("Failed to wrap configuration.", paramConfiguration);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    io localio = ip.b();
    a = ((pb)io.a(this, io.a(this, "com.google.android.gms.ads.internal.overlay.useClientJar"), new io.6(localio, this)));
    if (a == null)
    {
      ul.e("Could not create ad overlay.");
      finish();
      return;
    }
    try
    {
      a.a(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      ul.c("Could not forward onCreate to ad overlay:", paramBundle);
      finish();
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      if (a != null) {
        a.k();
      }
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        ul.c("Could not forward onDestroy to ad overlay:", localRemoteException);
      }
    }
  }
  
  protected void onPause()
  {
    try
    {
      if (a != null) {
        a.i();
      }
      super.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        ul.c("Could not forward onPause to ad overlay:", localRemoteException);
        finish();
      }
    }
  }
  
  protected void onRestart()
  {
    super.onRestart();
    try
    {
      if (a != null) {
        a.f();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not forward onRestart to ad overlay:", localRemoteException);
      finish();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    try
    {
      if (a != null) {
        a.h();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not forward onResume to ad overlay:", localRemoteException);
      finish();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      if (a != null) {
        a.b(paramBundle);
      }
      super.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        ul.c("Could not forward onSaveInstanceState to ad overlay:", localRemoteException);
        finish();
      }
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    try
    {
      if (a != null) {
        a.g();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not forward onStart to ad overlay:", localRemoteException);
      finish();
    }
  }
  
  protected void onStop()
  {
    try
    {
      if (a != null) {
        a.j();
      }
      super.onStop();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        ul.c("Could not forward onStop to ad overlay:", localRemoteException);
        finish();
      }
    }
  }
  
  public void setContentView(int paramInt)
  {
    super.setContentView(paramInt);
    a();
  }
  
  public void setContentView(View paramView)
  {
    super.setContentView(paramView);
    a();
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
    a();
  }
}


/* Location:              com/google/android/gms/ads/AdActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */