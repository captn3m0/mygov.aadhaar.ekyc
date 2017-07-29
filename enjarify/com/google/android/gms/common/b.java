package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.c;

public final class b
  extends DialogFragment
{
  private Dialog a = null;
  private DialogInterface.OnCancelListener b = null;
  
  public static b a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    b localb = new com/google/android/gms/common/b;
    localb.<init>();
    Dialog localDialog = (Dialog)c.a(paramDialog, "Cannot display null dialog");
    localDialog.setOnCancelListener(null);
    localDialog.setOnDismissListener(null);
    a = localDialog;
    if (paramOnCancelListener != null) {
      b = paramOnCancelListener;
    }
    return localb;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    DialogInterface.OnCancelListener localOnCancelListener = b;
    if (localOnCancelListener != null)
    {
      localOnCancelListener = b;
      localOnCancelListener.onCancel(paramDialogInterface);
    }
  }
  
  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    Dialog localDialog = a;
    if (localDialog == null)
    {
      localDialog = null;
      setShowsDialog(false);
    }
    return a;
  }
  
  public final void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}


/* Location:              com/google/android/gms/common/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */