package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.a.a;
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
    pb localpb = a;
    if (localpb != null) {}
    try
    {
      localpb = a;
      localpb.l();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward setContentViewSet to ad overlay:";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      pb localpb = a;
      localpb.a(paramInt1, paramInt2, paramIntent);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = "Could not forward onActivityResult to ad overlay:";
        ul.c(str, localException);
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    boolean bool = true;
    try
    {
      pb localpb = a;
      if (localpb != null)
      {
        localpb = a;
        bool = localpb.e();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onBackPressed to ad overlay:";
        ul.c(str, localRemoteException);
      }
    }
    if (bool) {
      super.onBackPressed();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    try
    {
      pb localpb = a;
      localObject = b.a(paramConfiguration);
      localpb.a((a)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to wrap configuration.";
        ul.c((String)localObject, localRemoteException);
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject = ip.b();
    String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
    boolean bool = io.a(this, str);
    io.6 local6 = new com/google/android/gms/b/io$6;
    local6.<init>((io)localObject, this);
    localObject = (pb)io.a(this, bool, local6);
    a = ((pb)localObject);
    localObject = a;
    if (localObject == null)
    {
      localObject = "Could not create ad overlay.";
      ul.e((String)localObject);
      finish();
    }
    for (;;)
    {
      return;
      try
      {
        localObject = a;
        ((pb)localObject).a(paramBundle);
      }
      catch (RemoteException localRemoteException)
      {
        str = "Could not forward onCreate to ad overlay:";
        ul.c(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      pb localpb = a;
      if (localpb != null)
      {
        localpb = a;
        localpb.k();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onDestroy to ad overlay:";
        ul.c(str, localRemoteException);
      }
    }
    super.onDestroy();
  }
  
  protected void onPause()
  {
    try
    {
      pb localpb = a;
      if (localpb != null)
      {
        localpb = a;
        localpb.i();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onPause to ad overlay:";
        ul.c(str, localRemoteException);
        finish();
      }
    }
    super.onPause();
  }
  
  protected void onRestart()
  {
    super.onRestart();
    try
    {
      pb localpb = a;
      if (localpb != null)
      {
        localpb = a;
        localpb.f();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onRestart to ad overlay:";
        ul.c(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    try
    {
      pb localpb = a;
      if (localpb != null)
      {
        localpb = a;
        localpb.h();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onResume to ad overlay:";
        ul.c(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      pb localpb = a;
      if (localpb != null)
      {
        localpb = a;
        localpb.b(paramBundle);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onSaveInstanceState to ad overlay:";
        ul.c(str, localRemoteException);
        finish();
      }
    }
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    try
    {
      pb localpb = a;
      if (localpb != null)
      {
        localpb = a;
        localpb.g();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onStart to ad overlay:";
        ul.c(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onStop()
  {
    try
    {
      pb localpb = a;
      if (localpb != null)
      {
        localpb = a;
        localpb.j();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onStop to ad overlay:";
        ul.c(str, localRemoteException);
        finish();
      }
    }
    super.onStop();
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */