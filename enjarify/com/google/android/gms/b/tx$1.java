package com.google.android.gms.b;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;

final class tx$1
  implements Runnable
{
  tx$1(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public final void run()
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    Object localObject = a;
    localBuilder.<init>((Context)localObject);
    localObject = b;
    localBuilder.setMessage((CharSequence)localObject);
    boolean bool = c;
    if (bool)
    {
      localObject = "Error";
      localBuilder.setTitle((CharSequence)localObject);
      bool = d;
      if (!bool) {
        break label82;
      }
      localObject = "Dismiss";
      localBuilder.setNeutralButton((CharSequence)localObject, null);
    }
    for (;;)
    {
      localBuilder.create().show();
      return;
      localObject = "Info";
      localBuilder.setTitle((CharSequence)localObject);
      break;
      label82:
      tx.1.1 local1 = new com/google/android/gms/b/tx$1$1;
      local1.<init>(this);
      localBuilder.setPositiveButton("Learn More", local1);
      localObject = "Dismiss";
      localBuilder.setNegativeButton((CharSequence)localObject, null);
    }
  }
}


/* Location:              com/google/android/gms/b/tx$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */