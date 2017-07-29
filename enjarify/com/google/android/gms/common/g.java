package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.support.v4.b.h;
import android.support.v4.b.n;
import com.google.android.gms.common.internal.c;

public final class g
  extends h
{
  private Dialog aa = null;
  private DialogInterface.OnCancelListener ab = null;
  
  public static g a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    g localg = new com/google/android/gms/common/g;
    localg.<init>();
    Dialog localDialog = (Dialog)c.a(paramDialog, "Cannot display null dialog");
    localDialog.setOnCancelListener(null);
    localDialog.setOnDismissListener(null);
    aa = localDialog;
    if (paramOnCancelListener != null) {
      ab = paramOnCancelListener;
    }
    return localg;
  }
  
  public final void a(n paramn, String paramString)
  {
    super.a(paramn, paramString);
  }
  
  public final Dialog b()
  {
    Dialog localDialog = aa;
    if (localDialog == null)
    {
      localDialog = null;
      d = false;
    }
    return aa;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    DialogInterface.OnCancelListener localOnCancelListener = ab;
    if (localOnCancelListener != null)
    {
      localOnCancelListener = ab;
      localOnCancelListener.onCancel(paramDialogInterface);
    }
  }
}


/* Location:              com/google/android/gms/common/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */