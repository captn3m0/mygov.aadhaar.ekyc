package com.google.android.gms.b;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.w;

final class ov$1
  implements DialogInterface.OnClickListener
{
  ov$1(ov paramov, String paramString1, String paramString2) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject1 = c.b;
    Object localObject2 = "download";
    localObject1 = (DownloadManager)((Context)localObject1).getSystemService((String)localObject2);
    try
    {
      localObject2 = a;
      String str = b;
      DownloadManager.Request localRequest = new android/app/DownloadManager$Request;
      localObject2 = Uri.parse((String)localObject2);
      localRequest.<init>((Uri)localObject2);
      localObject2 = Environment.DIRECTORY_PICTURES;
      localRequest.setDestinationInExternalPublicDir((String)localObject2, str);
      localObject2 = w.g();
      ((tu)localObject2).a(localRequest);
      ((DownloadManager)localObject1).enqueue(localRequest);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        ov localov = c;
        localObject2 = "Could not store picture.";
        localov.a((String)localObject2);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ov$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */