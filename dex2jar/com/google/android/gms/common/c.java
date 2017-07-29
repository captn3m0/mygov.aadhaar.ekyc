package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
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
import android.os.Message;
import android.support.v4.b.ab.c;
import android.support.v4.b.ab.d;
import android.support.v4.b.j;
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
  private static final c c = new c();
  
  public static Dialog a(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject = new ProgressBar(paramActivity, null, 16842874);
    ((ProgressBar)localObject).setIndeterminate(true);
    ((ProgressBar)localObject).setVisibility(0);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setView((View)localObject);
    localBuilder.setMessage(q.c(paramActivity, 18));
    localBuilder.setPositiveButton("", null);
    localObject = localBuilder.create();
    a(paramActivity, (Dialog)localObject, "GooglePlayServicesUpdatingDialog", paramOnCancelListener);
    return (Dialog)localObject;
  }
  
  private static Dialog a(Context paramContext, int paramInt, r paramr, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AlertDialog.Builder localBuilder = null;
    if (paramInt == 0) {
      return null;
    }
    Object localObject = new TypedValue();
    paramContext.getTheme().resolveAttribute(16843529, (TypedValue)localObject, true);
    if ("Theme.Dialog.Alert".equals(paramContext.getResources().getResourceEntryName(resourceId))) {
      localBuilder = new AlertDialog.Builder(paramContext, 5);
    }
    localObject = localBuilder;
    if (localBuilder == null) {
      localObject = new AlertDialog.Builder(paramContext);
    }
    ((AlertDialog.Builder)localObject).setMessage(q.c(paramContext, paramInt));
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setOnCancelListener(paramOnCancelListener);
    }
    paramOnCancelListener = q.e(paramContext, paramInt);
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setPositiveButton(paramOnCancelListener, paramr);
    }
    paramContext = q.a(paramContext, paramInt);
    if (paramContext != null) {
      ((AlertDialog.Builder)localObject).setTitle(paramContext);
    }
    return ((AlertDialog.Builder)localObject).create();
  }
  
  public static z a(Context paramContext, z.a parama)
  {
    Object localObject = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    ((IntentFilter)localObject).addDataScheme("package");
    z localz = new z(parama);
    paramContext.registerReceiver(localz, (IntentFilter)localObject);
    localz.a(paramContext);
    localObject = localz;
    if (!o.a(paramContext, "com.google.android.gms"))
    {
      parama.a();
      localz.a();
      localObject = null;
    }
    return (z)localObject;
  }
  
  public static c a()
  {
    return c;
  }
  
  private static void a(Activity paramActivity, Dialog paramDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if ((paramActivity instanceof j))
    {
      paramActivity = ((j)paramActivity).b_();
      g.a(paramDialog, paramOnCancelListener).a(paramActivity, paramString);
      return;
    }
    paramActivity = paramActivity.getFragmentManager();
    b.a(paramDialog, paramOnCancelListener).show(paramActivity, paramString);
  }
  
  @TargetApi(20)
  private void a(Context paramContext, int paramInt, PendingIntent paramPendingIntent)
  {
    if (paramInt == 18) {
      new a(paramContext).sendEmptyMessageDelayed(1, 120000L);
    }
    do
    {
      return;
      if (paramPendingIntent != null) {
        break;
      }
    } while (paramInt != 6);
    Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
    return;
    String str2 = q.b(paramContext, paramInt);
    String str1 = q.d(paramContext, paramInt);
    Object localObject = paramContext.getResources();
    if (f.a(paramContext))
    {
      com.google.android.gms.common.internal.c.a(i.d());
      paramPendingIntent = new Notification.Builder(paramContext).setSmallIcon(getApplicationInfoicon).setPriority(2).setAutoCancel(true).setContentTitle(str2).setStyle(new Notification.BigTextStyle().bigText(str1)).addAction(a.a.common_full_open_on_phone, ((Resources)localObject).getString(a.b.common_open_on_phone), paramPendingIntent).build();
      switch (paramInt)
      {
      }
    }
    for (paramInt = 39789;; paramInt = 10436)
    {
      ((NotificationManager)paramContext.getSystemService("notification")).notify(paramInt, paramPendingIntent);
      return;
      localObject = new ab.d(paramContext).a(17301642).c(((Resources)localObject).getString(a.b.common_google_play_services_notification_ticker));
      long l = System.currentTimeMillis();
      F.when = l;
      localObject = ((ab.d)localObject).a();
      d = paramPendingIntent;
      paramPendingIntent = ((ab.d)localObject).a(str2).b(str1);
      w = true;
      paramPendingIntent = paramPendingIntent.a(new ab.c().a(str1)).b();
      break;
      o.f.set(false);
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
    a(paramContext, paramInt, a(paramContext, paramInt, 0, "n"));
  }
  
  public final boolean a(int paramInt)
  {
    return super.a(paramInt);
  }
  
  public final boolean a(Activity paramActivity, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = a(paramActivity, paramInt, r.a(paramActivity, super.a(paramActivity, paramInt, "d")), paramOnCancelListener);
    if (localDialog == null) {
      return false;
    }
    a(paramActivity, localDialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public final boolean a(Activity paramActivity, af paramaf, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    paramaf = a(paramActivity, paramInt, r.a(paramaf, super.a(paramActivity, paramInt, "d")), paramOnCancelListener);
    if (paramaf == null) {
      return false;
    }
    a(paramActivity, paramaf, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public final boolean a(Context paramContext, a parama, int paramInt)
  {
    boolean bool = false;
    if (parama.a()) {}
    for (PendingIntent localPendingIntent = d;; localPendingIntent = super.a(paramContext, c, 0))
    {
      if (localPendingIntent != null)
      {
        a(paramContext, c, GoogleApiActivity.a(paramContext, localPendingIntent, paramInt));
        bool = true;
      }
      return bool;
    }
  }
  
  public final int b(Context paramContext)
  {
    return super.b(paramContext);
  }
  
  @Deprecated
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
  
  @SuppressLint({"HandlerLeak"})
  private final class a
    extends Handler
  {
    private final Context b;
    
    public a(Context paramContext) {}
    
    public final void handleMessage(Message paramMessage)
    {
      int i;
      switch (what)
      {
      default: 
        i = what;
        Log.w("GoogleApiAvailability", 50 + "Don't know how to handle this message: " + i);
      }
      do
      {
        return;
        i = a(b);
      } while (!a(i));
      a(b, i);
    }
  }
}


/* Location:              com/google/android/gms/common/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */