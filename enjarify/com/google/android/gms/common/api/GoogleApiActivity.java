package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.b.x;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;

public class GoogleApiActivity
  extends Activity
  implements DialogInterface.OnCancelListener
{
  protected int a = 0;
  
  public static PendingIntent a(Context paramContext, PendingIntent paramPendingIntent, int paramInt)
  {
    Intent localIntent = a(paramContext, paramPendingIntent, paramInt, true);
    return PendingIntent.getActivity(paramContext, 0, localIntent, 134217728);
  }
  
  public static Intent a(Context paramContext, PendingIntent paramPendingIntent, int paramInt, boolean paramBoolean)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramContext, GoogleApiActivity.class);
    localIntent.putExtra("pending_intent", paramPendingIntent);
    localIntent.putExtra("failing_client_id", paramInt);
    localIntent.putExtra("notify_manager", paramBoolean);
    return localIntent;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    int j = 0;
    Intent localIntent = null;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject1;
    Object localObject2;
    if (paramInt1 == i)
    {
      localObject1 = getIntent();
      localObject2 = "notify_manager";
      boolean bool = ((Intent)localObject1).getBooleanExtra((String)localObject2, i);
      a = 0;
      setResult(paramInt2);
      if (bool)
      {
        localObject1 = x.a(this);
        switch (paramInt2)
        {
        }
      }
    }
    for (;;)
    {
      finish();
      return;
      localObject2 = new com/google/android/gms/common/a;
      i = 0;
      ((a)localObject2).<init>(13, null);
      localIntent = getIntent();
      String str = "failing_client_id";
      int m = -1;
      j = localIntent.getIntExtra(str, m);
      ((x)localObject1).b((a)localObject2, j);
      continue;
      ((x)localObject1).b();
      continue;
      int k = 2;
      if (paramInt1 == k)
      {
        a = 0;
        setResult(paramInt2);
      }
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    a = 0;
    setResult(0);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    int i = 1;
    super.onCreate(paramBundle);
    Object localObject1;
    if (paramBundle != null)
    {
      localObject1 = "resolution";
      j = paramBundle.getInt((String)localObject1);
      a = j;
    }
    int j = a;
    Object localObject2;
    if (j != i)
    {
      localObject1 = getIntent();
      localObject2 = ((Intent)localObject1).getExtras();
      if (localObject2 != null) {
        break label74;
      }
      localObject1 = "GoogleApiActivity";
      localObject2 = "Activity started without extras";
      Log.e((String)localObject1, (String)localObject2);
      finish();
    }
    for (;;)
    {
      return;
      label74:
      localObject1 = (PendingIntent)((Bundle)localObject2).get("pending_intent");
      String str = "error_code";
      localObject2 = (Integer)((Bundle)localObject2).get(str);
      if ((localObject1 == null) && (localObject2 == null))
      {
        localObject1 = "GoogleApiActivity";
        localObject2 = "Activity started without resolution";
        Log.e((String)localObject1, (String)localObject2);
        finish();
      }
      else if (localObject1 != null)
      {
        try
        {
          localObject2 = ((PendingIntent)localObject1).getIntentSender();
          int k = 1;
          i = 0;
          localObject1 = this;
          startIntentSenderForResult((IntentSender)localObject2, k, null, 0, 0, 0);
          j = 1;
          a = j;
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          localObject2 = "GoogleApiActivity";
          str = "Failed to launch pendingIntent";
          Log.e((String)localObject2, str, localSendIntentException);
          finish();
        }
      }
      else
      {
        c localc = c.a();
        int m = ((Integer)localObject2).intValue();
        localc.a(this, m, this);
        a = i;
      }
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    int i = a;
    paramBundle.putInt("resolution", i);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              com/google/android/gms/common/api/GoogleApiActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */