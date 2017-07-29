package com.google.android.gms.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract.Events;
import com.google.android.gms.ads.internal.w;

final class os$1
  implements DialogInterface.OnClickListener
{
  os$1(os paramos) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    long l1 = -1;
    os localos = a;
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.EDIT");
    Object localObject = CalendarContract.Events.CONTENT_URI;
    localIntent = localIntent.setData((Uri)localObject);
    String str = b;
    localIntent.putExtra("title", str);
    str = f;
    localIntent.putExtra("eventLocation", str);
    localObject = "description";
    str = e;
    localIntent.putExtra((String)localObject, str);
    long l2 = c;
    boolean bool = l2 < l1;
    long l3;
    if (bool)
    {
      localObject = "beginTime";
      l3 = c;
      localIntent.putExtra((String)localObject, l3);
    }
    l2 = d;
    bool = l2 < l1;
    if (bool)
    {
      localObject = "endTime";
      l3 = d;
      localIntent.putExtra((String)localObject, l3);
    }
    localIntent.setFlags(268435456);
    w.e();
    tt.a(a.a, localIntent);
  }
}


/* Location:              com/google/android/gms/b/os$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */