package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.Style;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Handler;
import android.support.v4.b.ab.c;
import android.support.v4.b.ab.d;
import android.support.v4.b.ab.q;
import android.support.v4.b.j;
import android.support.v4.b.n;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.b.af;
import com.google.android.gms.b.z;
import com.google.android.gms.b.z.a;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.i;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c
  extends m
{
  public static final int a = m.b;
  private static final c c;
  
  static
  {
    c localc = new com/google/android/gms/common/c;
    localc.<init>();
    c = localc;
  }
  
  public static Dialog a(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject = new android/widget/ProgressBar;
    ((ProgressBar)localObject).<init>(paramActivity, null, 16842874);
    ((ProgressBar)localObject).setIndeterminate(true);
    ((ProgressBar)localObject).setVisibility(0);
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(paramActivity);
    localBuilder.setView((View)localObject);
    localObject = q.c(paramActivity, 18);
    localBuilder.setMessage((CharSequence)localObject);
    localBuilder.setPositiveButton("", null);
    localObject = localBuilder.create();
    a(paramActivity, (Dialog)localObject, "GooglePlayServicesUpdatingDialog", paramOnCancelListener);
    return (Dialog)localObject;
  }
  
  private static Dialog a(Context paramContext, int paramInt, r paramr, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject1 = null;
    if (paramInt == 0) {}
    for (;;)
    {
      return (Dialog)localObject1;
      Object localObject2 = new android/util/TypedValue;
      ((TypedValue)localObject2).<init>();
      Object localObject3 = paramContext.getTheme();
      int i = 16843529;
      boolean bool1 = true;
      ((Resources.Theme)localObject3).resolveAttribute(i, (TypedValue)localObject2, bool1);
      localObject3 = paramContext.getResources();
      int j = resourceId;
      localObject2 = ((Resources)localObject3).getResourceEntryName(j);
      localObject3 = "Theme.Dialog.Alert";
      boolean bool2 = ((String)localObject3).equals(localObject2);
      if (bool2)
      {
        localObject1 = new android/app/AlertDialog$Builder;
        int k = 5;
        ((AlertDialog.Builder)localObject1).<init>(paramContext, k);
      }
      if (localObject1 == null)
      {
        localObject1 = new android/app/AlertDialog$Builder;
        ((AlertDialog.Builder)localObject1).<init>(paramContext);
      }
      localObject2 = q.c(paramContext, paramInt);
      ((AlertDialog.Builder)localObject1).setMessage((CharSequence)localObject2);
      if (paramOnCancelListener != null) {
        ((AlertDialog.Builder)localObject1).setOnCancelListener(paramOnCancelListener);
      }
      localObject2 = q.e(paramContext, paramInt);
      if (localObject2 != null) {
        ((AlertDialog.Builder)localObject1).setPositiveButton((CharSequence)localObject2, paramr);
      }
      localObject2 = q.a(paramContext, paramInt);
      if (localObject2 != null) {
        ((AlertDialog.Builder)localObject1).setTitle((CharSequence)localObject2);
      }
      localObject1 = ((AlertDialog.Builder)localObject1).create();
    }
  }
  
  public static z a(Context paramContext, z.a parama)
  {
    Object localObject = new android/content/IntentFilter;
    ((IntentFilter)localObject).<init>("android.intent.action.PACKAGE_ADDED");
    ((IntentFilter)localObject).addDataScheme("package");
    z localz = new com/google/android/gms/b/z;
    localz.<init>(parama);
    paramContext.registerReceiver(localz, (IntentFilter)localObject);
    localz.a(paramContext);
    localObject = "com.google.android.gms";
    boolean bool = o.a(paramContext, (String)localObject);
    if (!bool)
    {
      parama.a();
      localz.a();
      localz = null;
    }
    return localz;
  }
  
  public static c a()
  {
    return c;
  }
  
  private static void a(Activity paramActivity, Dialog paramDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    boolean bool = paramActivity instanceof j;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      paramActivity = (j)paramActivity;
      localObject1 = paramActivity.b_();
      localObject2 = g.a(paramDialog, paramOnCancelListener);
      ((g)localObject2).a((n)localObject1, paramString);
    }
    for (;;)
    {
      return;
      localObject1 = paramActivity.getFragmentManager();
      localObject2 = b.a(paramDialog, paramOnCancelListener);
      ((b)localObject2).show((FragmentManager)localObject1, paramString);
    }
  }
  
  private void a(Context paramContext, int paramInt, PendingIntent paramPendingIntent)
  {
    int i = 1;
    int j = 18;
    if (paramInt == j)
    {
      localObject1 = new com/google/android/gms/common/c$a;
      ((c.a)localObject1).<init>(this, paramContext);
      long l1 = 120000L;
      ((Handler)localObject1).sendEmptyMessageDelayed(i, l1);
    }
    for (;;)
    {
      return;
      if (paramPendingIntent != null) {
        break;
      }
      j = 6;
      if (paramInt == j)
      {
        localObject1 = "GoogleApiAvailability";
        localObject2 = "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.";
        Log.w((String)localObject1, (String)localObject2);
      }
    }
    Object localObject1 = q.b(paramContext, paramInt);
    Object localObject2 = q.d(paramContext, paramInt);
    Object localObject3 = paramContext.getResources();
    boolean bool = f.a(paramContext);
    Object localObject4;
    int m;
    int k;
    if (bool)
    {
      com.google.android.gms.common.internal.c.a(i.d());
      localObject4 = new android/app/Notification$Builder;
      ((Notification.Builder)localObject4).<init>(paramContext);
      ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
      m = icon;
      localObject4 = ((Notification.Builder)localObject4).setSmallIcon(m);
      m = 2;
      localObject1 = ((Notification.Builder)localObject4).setPriority(m).setAutoCancel(i).setContentTitle((CharSequence)localObject1);
      localObject4 = new android/app/Notification$BigTextStyle;
      ((Notification.BigTextStyle)localObject4).<init>();
      localObject2 = ((Notification.BigTextStyle)localObject4).bigText((CharSequence)localObject2);
      localObject1 = ((Notification.Builder)localObject1).setStyle((Notification.Style)localObject2);
      n = a.a.common_full_open_on_phone;
      k = a.b.common_open_on_phone;
      localObject3 = ((Resources)localObject3).getString(k);
      localObject1 = ((Notification.Builder)localObject1).addAction(n, (CharSequence)localObject3, paramPendingIntent).build();
      localObject3 = localObject1;
      switch (paramInt)
      {
      default: 
        label232:
        j = 39789;
      }
    }
    for (int n = j;; n = j)
    {
      localObject1 = (NotificationManager)paramContext.getSystemService("notification");
      ((NotificationManager)localObject1).notify(n, (Notification)localObject3);
      break;
      localObject4 = new android/support/v4/b/ab$d;
      ((ab.d)localObject4).<init>(paramContext);
      localObject4 = ((ab.d)localObject4).a(17301642);
      m = a.b.common_google_play_services_notification_ticker;
      localObject3 = ((Resources)localObject3).getString(m);
      localObject3 = ((ab.d)localObject4).c((CharSequence)localObject3);
      long l2 = System.currentTimeMillis();
      localObject4 = F;
      when = l2;
      localObject3 = ((ab.d)localObject3).a();
      d = paramPendingIntent;
      localObject1 = ((ab.d)localObject3).a((CharSequence)localObject1).b((CharSequence)localObject2);
      w = i;
      localObject3 = new android/support/v4/b/ab$c;
      ((ab.c)localObject3).<init>();
      localObject2 = ((ab.c)localObject3).a((CharSequence)localObject2);
      localObject1 = ((ab.d)localObject1).a((ab.q)localObject2).b();
      localObject3 = localObject1;
      break label232;
      j = 10436;
      localObject2 = o.f;
      k = 0;
      localObject4 = null;
      ((AtomicBoolean)localObject2).set(false);
    }
  }
  
  public final int a(Context paramContext)
  {
    return super.a(paramContext);
  }
  
  public final PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return super.a(paramContext, paramInt1, paramInt2);
  }
  
  public final PendingIntent a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    return super.a(paramContext, paramInt1, paramInt2, paramString);
  }
  
  public final Intent a(Context paramContext, int paramInt, String paramString)
  {
    return super.a(paramContext, paramInt, paramString);
  }
  
  public final void a(Context paramContext, int paramInt)
  {
    PendingIntent localPendingIntent = a(paramContext, paramInt, 0, "n");
    a(paramContext, paramInt, localPendingIntent);
  }
  
  public final boolean a(int paramInt)
  {
    return super.a(paramInt);
  }
  
  public final boolean a(Activity paramActivity, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject = super.a(paramActivity, paramInt, "d");
    localObject = r.a(paramActivity, (Intent)localObject);
    localObject = a(paramActivity, paramInt, (r)localObject, paramOnCancelListener);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      String str = "GooglePlayServicesErrorDialog";
      a(paramActivity, (Dialog)localObject, str, paramOnCancelListener);
      bool = true;
    }
  }
  
  public final boolean a(Activity paramActivity, af paramaf, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject = super.a(paramActivity, paramInt, "d");
    localObject = r.a(paramaf, (Intent)localObject);
    localObject = a(paramActivity, paramInt, (r)localObject, paramOnCancelListener);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      String str = "GooglePlayServicesErrorDialog";
      a(paramActivity, (Dialog)localObject, str, paramOnCancelListener);
      bool = true;
    }
  }
  
  public final boolean a(Context paramContext, a parama, int paramInt)
  {
    int i = 0;
    boolean bool = parama.a();
    if (bool) {}
    int j;
    for (PendingIntent localPendingIntent = d;; localPendingIntent = super.a(paramContext, j, 0))
    {
      if (localPendingIntent != null)
      {
        i = c;
        localPendingIntent = GoogleApiActivity.a(paramContext, localPendingIntent, paramInt);
        a(paramContext, i, localPendingIntent);
        i = 1;
      }
      return i;
      j = c;
    }
  }
  
  public final int b(Context paramContext)
  {
    return super.b(paramContext);
  }
  
  public final Intent b(int paramInt)
  {
    return super.b(paramInt);
  }
  
  public final boolean b(Context paramContext, int paramInt)
  {
    return super.b(paramContext, paramInt);
  }
  
  public final String c(int paramInt)
  {
    return super.c(paramInt);
  }
}


/* Location:              com/google/android/gms/common/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */