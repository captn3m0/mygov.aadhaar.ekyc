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
    g localg = new g();
    paramDialog = (Dialog)c.a(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    aa = paramDialog;
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
    if (aa == null) {
      d = false;
    }
    return aa;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (ab != null) {
      ab.onCancel(paramDialogInterface);
    }
  }
}


/* Location:              com/google/android/gms/common/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */