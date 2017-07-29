package com.google.android.gms.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.google.android.gms.ads.internal.w;

final class tx$1$1
  implements DialogInterface.OnClickListener
{
  tx$1$1(tx.1 param1) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    w.e();
    Context localContext = a.a;
    Uri localUri = Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push");
    tt.a(localContext, localUri);
  }
}


/* Location:              com/google/android/gms/b/tx$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */