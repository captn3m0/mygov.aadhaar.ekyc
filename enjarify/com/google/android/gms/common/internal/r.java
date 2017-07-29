package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.b.af;

public abstract class r
  implements DialogInterface.OnClickListener
{
  public static r a(Activity paramActivity, Intent paramIntent)
  {
    r.1 local1 = new com/google/android/gms/common/internal/r$1;
    local1.<init>(paramIntent, paramActivity);
    return local1;
  }
  
  public static r a(af paramaf, Intent paramIntent)
  {
    r.2 local2 = new com/google/android/gms/common/internal/r$2;
    local2.<init>(paramIntent, paramaf);
    return local2;
  }
  
  protected abstract void a();
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      a();
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      for (;;)
      {
        String str1 = "DialogRedirect";
        String str2 = "Failed to start resolution intent";
        Log.e(str1, str2, localActivityNotFoundException);
        paramDialogInterface.dismiss();
      }
    }
    finally
    {
      paramDialogInterface.dismiss();
    }
  }
}


/* Location:              com/google/android/gms/common/internal/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */