package android.support.v4.b;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ah
{
  private static final Object a;
  private static Field b;
  private static boolean c;
  private static final Object d;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
  }
  
  public static Bundle a(Notification.Builder paramBuilder, af.a parama)
  {
    int i = parama.a();
    Object localObject1 = parama.b();
    Object localObject2 = parama.c();
    paramBuilder.addAction(i, (CharSequence)localObject1, (PendingIntent)localObject2);
    Bundle localBundle = new android/os/Bundle;
    localObject1 = parama.d();
    localBundle.<init>((Bundle)localObject1);
    localObject1 = parama.f();
    if (localObject1 != null)
    {
      localObject1 = "android.support.remoteInputs";
      localObject2 = an.a(parama.f());
      localBundle.putParcelableArray((String)localObject1, (Parcelable[])localObject2);
    }
    boolean bool = parama.e();
    localBundle.putBoolean("android.support.allowGeneratedReplies", bool);
    return localBundle;
  }
  
  public static Bundle a(Notification paramNotification)
  {
    for (;;)
    {
      boolean bool1;
      Object localObject2;
      synchronized (a)
      {
        bool1 = c;
        if (bool1)
        {
          bool1 = false;
          localObject2 = null;
          return (Bundle)localObject2;
        }
      }
      try
      {
        localObject2 = b;
        if (localObject2 == null)
        {
          localObject2 = Notification.class;
          localObject5 = "extras";
          localObject2 = ((Class)localObject2).getDeclaredField((String)localObject5);
          localObject5 = Bundle.class;
          localObject6 = ((Field)localObject2).getType();
          boolean bool2 = ((Class)localObject5).isAssignableFrom((Class)localObject6);
          if (!bool2)
          {
            localObject2 = "NotificationCompat";
            localObject5 = "Notification.extras field is not of type Bundle";
            Log.e((String)localObject2, (String)localObject5);
            bool1 = true;
            c = bool1;
            bool1 = false;
            localObject2 = null;
            continue;
          }
          bool2 = true;
          ((Field)localObject2).setAccessible(bool2);
          b = (Field)localObject2;
        }
        localObject2 = b;
        localObject2 = ((Field)localObject2).get(paramNotification);
        localObject2 = (Bundle)localObject2;
        if (localObject2 == null)
        {
          localObject2 = new android/os/Bundle;
          ((Bundle)localObject2).<init>();
          localObject5 = b;
          ((Field)localObject5).set(paramNotification, localObject2);
        }
        continue;
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject5 = "NotificationCompat";
        localObject6 = "Unable to access notification extras";
        Log.e((String)localObject5, (String)localObject6, localIllegalAccessException);
        bool1 = true;
        c = bool1;
        bool1 = false;
        Object localObject4 = null;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          Object localObject5 = "NotificationCompat";
          Object localObject6 = "Unable to access notification extras";
          Log.e((String)localObject5, (String)localObject6, localNoSuchFieldException);
        }
      }
    }
  }
  
  public static SparseArray a(List paramList)
  {
    SparseArray localSparseArray = null;
    int i = 0;
    Bundle localBundle = null;
    int j = paramList.size();
    for (int k = 0; k < j; k = i)
    {
      localBundle = (Bundle)paramList.get(k);
      if (localBundle != null)
      {
        if (localSparseArray == null)
        {
          localSparseArray = new android/util/SparseArray;
          localSparseArray.<init>();
        }
        localSparseArray.put(k, localBundle);
      }
      i = k + 1;
    }
    return localSparseArray;
  }
  
  public static void a(aa paramaa, CharSequence paramCharSequence1, boolean paramBoolean1, CharSequence paramCharSequence2, Bitmap paramBitmap1, Bitmap paramBitmap2, boolean paramBoolean2)
  {
    Notification.BigPictureStyle localBigPictureStyle = new android/app/Notification$BigPictureStyle;
    Notification.Builder localBuilder = paramaa.a();
    localBigPictureStyle.<init>(localBuilder);
    localBigPictureStyle = localBigPictureStyle.setBigContentTitle(paramCharSequence1).bigPicture(paramBitmap1);
    if (paramBoolean2) {
      localBigPictureStyle.bigLargeIcon(paramBitmap2);
    }
    if (paramBoolean1) {
      localBigPictureStyle.setSummaryText(paramCharSequence2);
    }
  }
  
  public static void a(aa paramaa, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    Notification.BigTextStyle localBigTextStyle = new android/app/Notification$BigTextStyle;
    Notification.Builder localBuilder = paramaa.a();
    localBigTextStyle.<init>(localBuilder);
    localBigTextStyle = localBigTextStyle.setBigContentTitle(paramCharSequence1).bigText(paramCharSequence3);
    if (paramBoolean) {
      localBigTextStyle.setSummaryText(paramCharSequence2);
    }
  }
  
  public static void a(aa paramaa, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, ArrayList paramArrayList)
  {
    Object localObject1 = new android/app/Notification$InboxStyle;
    Object localObject2 = paramaa.a();
    ((Notification.InboxStyle)localObject1).<init>((Notification.Builder)localObject2);
    localObject2 = ((Notification.InboxStyle)localObject1).setBigContentTitle(paramCharSequence1);
    if (paramBoolean) {
      ((Notification.InboxStyle)localObject2).setSummaryText(paramCharSequence2);
    }
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (CharSequence)localIterator.next();
      ((Notification.InboxStyle)localObject2).addLine((CharSequence)localObject1);
    }
  }
}


/* Location:              android/support/v4/b/ah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */