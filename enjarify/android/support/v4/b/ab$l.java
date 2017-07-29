package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;

class ab$l
  implements ab.h
{
  public Notification a(ab.d paramd)
  {
    Notification localNotification = F;
    Object localObject = a;
    CharSequence localCharSequence1 = b;
    CharSequence localCharSequence2 = c;
    PendingIntent localPendingIntent1 = d;
    PendingIntent localPendingIntent2 = e;
    localNotification = af.a(localNotification, (Context)localObject, localCharSequence1, localCharSequence2, localPendingIntent1, localPendingIntent2);
    int i = j;
    if (i > 0)
    {
      i = flags | 0x80;
      flags = i;
    }
    localObject = C;
    if (localObject != null)
    {
      localObject = C;
      contentView = ((RemoteViews)localObject);
    }
    return localNotification;
  }
  
  public Bundle a(Notification paramNotification)
  {
    return null;
  }
}


/* Location:              android/support/v4/b/ab$l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */