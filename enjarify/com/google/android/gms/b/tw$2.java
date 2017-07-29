package com.google.android.gms.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.w;

final class tw$2
  implements DialogInterface.OnClickListener
{
  tw$2(tw paramtw, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    w.e();
    Context localContext = b.a;
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.SEND");
    localIntent = localIntent.setType("text/plain");
    String str = a;
    localIntent = Intent.createChooser(localIntent.putExtra("android.intent.extra.TEXT", str), "Share via");
    tt.a(localContext, localIntent);
  }
}


/* Location:              com/google/android/gms/b/tw$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */