package android.support.v4.b;

import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

final class ac
{
  public static void a(Notification.Builder paramBuilder, af.a parama)
  {
    Notification.Action.Builder localBuilder = new android/app/Notification$Action$Builder;
    int i = parama.a();
    Object localObject1 = parama.b();
    PendingIntent localPendingIntent = parama.c();
    localBuilder.<init>(i, (CharSequence)localObject1, localPendingIntent);
    Object localObject2 = parama.f();
    if (localObject2 != null)
    {
      localObject1 = al.a(parama.f());
      int j = localObject1.length;
      i = 0;
      localObject2 = null;
      while (i < j)
      {
        RemoteInput localRemoteInput = localObject1[i];
        localBuilder.addRemoteInput(localRemoteInput);
        i += 1;
      }
    }
    localObject2 = parama.d();
    if (localObject2 != null)
    {
      localObject2 = new android/os/Bundle;
      localObject1 = parama.d();
      ((Bundle)localObject2).<init>((Bundle)localObject1);
    }
    for (;;)
    {
      boolean bool = parama.e();
      ((Bundle)localObject2).putBoolean("android.support.allowGeneratedReplies", bool);
      localBuilder.addExtras((Bundle)localObject2);
      localObject2 = localBuilder.build();
      paramBuilder.addAction((Notification.Action)localObject2);
      return;
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
    }
  }
}


/* Location:              android/support/v4/b/ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */