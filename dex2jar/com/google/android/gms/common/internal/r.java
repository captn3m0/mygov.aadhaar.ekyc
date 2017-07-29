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
  public static r a(final Activity paramActivity, Intent paramIntent)
  {
    new r()
    {
      public final void a()
      {
        if (r.this != null) {
          paramActivity.startActivityForResult(r.this, c);
        }
      }
    };
  }
  
  public static r a(final af paramaf, Intent paramIntent)
  {
    new r()
    {
      public final void a()
      {
        if (r.this != null) {
          paramaf.startActivityForResult(r.this, c);
        }
      }
    };
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
      Log.e("DialogRedirect", "Failed to start resolution intent", localActivityNotFoundException);
      return;
    }
    finally
    {
      paramDialogInterface.dismiss();
    }
  }
}


/* Location:              com/google/android/gms/common/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */