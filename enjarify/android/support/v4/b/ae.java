package android.support.v4.b;

import android.app.Notification.Builder;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.net.Uri;
import java.util.List;

final class ae
{
  public static void a(aa paramaa, CharSequence paramCharSequence1, CharSequence paramCharSequence2, List paramList1, List paramList2, List paramList3, List paramList4, List paramList5)
  {
    Object localObject1 = new android/app/Notification$MessagingStyle;
    ((Notification.MessagingStyle)localObject1).<init>(paramCharSequence1);
    Notification.MessagingStyle localMessagingStyle = ((Notification.MessagingStyle)localObject1).setConversationTitle(paramCharSequence2);
    int i = 0;
    localObject1 = null;
    for (int j = 0;; j = i)
    {
      i = paramList1.size();
      if (j >= i) {
        break;
      }
      Notification.MessagingStyle.Message localMessage = new android/app/Notification$MessagingStyle$Message;
      localObject1 = (CharSequence)paramList1.get(j);
      long l = ((Long)paramList2.get(j)).longValue();
      Object localObject2 = (CharSequence)paramList3.get(j);
      localMessage.<init>((CharSequence)localObject1, l, (CharSequence)localObject2);
      localObject1 = paramList4.get(j);
      if (localObject1 != null)
      {
        localObject1 = (String)paramList4.get(j);
        localObject2 = (Uri)paramList5.get(j);
        localMessage.setData((String)localObject1, (Uri)localObject2);
      }
      localMessagingStyle.addMessage(localMessage);
      i = j + 1;
    }
    localObject1 = paramaa.a();
    localMessagingStyle.setBuilder((Notification.Builder)localObject1);
  }
}


/* Location:              android/support/v4/b/ae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */