package com.google.android.gms.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.measurement.AppMeasurement;

public final class cz
{
  private final a a;
  
  public cz(a parama)
  {
    c.a(parama);
    a = parama;
  }
  
  public static boolean a(Context paramContext)
  {
    c.a(paramContext);
    return dr.a(paramContext, "com.google.android.gms.measurement.AppMeasurementReceiver");
  }
  
  public final void a(final Context paramContext, Intent paramIntent)
  {
    dc localdc = dc.a(paramContext);
    final cu localcu = localdc.e();
    if (paramIntent == null) {
      c.a("Receiver called with null intent");
    }
    do
    {
      return;
      cf.W();
      localObject = paramIntent.getAction();
      g.a("Local receiver got", localObject);
      if ("com.google.android.gms.measurement.UPLOAD".equals(localObject))
      {
        dk.a(paramContext);
        paramIntent = new Intent().setClassName(paramContext, "com.google.android.gms.measurement.AppMeasurementService");
        paramIntent.setAction("com.google.android.gms.measurement.UPLOAD");
        a.a(paramContext, paramIntent);
        return;
      }
    } while (!"com.android.vending.INSTALL_REFERRER".equals(localObject));
    String str = paramIntent.getStringExtra("referrer");
    if (str == null)
    {
      g.a("Install referrer extras are null");
      return;
    }
    e.a("Install referrer extras are", str);
    Object localObject = str;
    if (!str.contains("?"))
    {
      localObject = String.valueOf(str);
      if (((String)localObject).length() == 0) {
        break label217;
      }
    }
    label217:
    for (localObject = "?".concat((String)localObject);; localObject = new String("?"))
    {
      localObject = Uri.parse((String)localObject);
      localObject = localdc.i().a((Uri)localObject);
      if (localObject != null) {
        break;
      }
      g.a("No campaign defined in install referrer broadcast");
      return;
    }
    final long l = paramIntent.getLongExtra("referrer_timestamp_seconds", 0L) * 1000L;
    if (l == 0L) {
      c.a("Install referrer is missing timestamp");
    }
    localdc.f().a(new Runnable()
    {
      public final void run()
      {
        dq localdq = j().c(o().x(), "_fot");
        if ((localdq != null) && ((e instanceof Long))) {}
        for (long l1 = ((Long)e).longValue();; l1 = 0L)
        {
          long l2 = l;
          if ((l1 > 0L) && ((l2 >= l1) || (l2 <= 0L))) {}
          for (l1 -= 1L;; l1 = l2)
          {
            if (l1 > 0L) {
              paramContext.putLong("click_timestamp", l1);
            }
            AppMeasurement.getInstance(localcu).logEventInternal("auto", "_cmp", paramContext);
            e.g.a("Install campaign recorded");
            return;
          }
        }
      }
    });
  }
  
  public static abstract interface a
  {
    public abstract void a(Context paramContext, Intent paramIntent);
  }
}


/* Location:              com/google/android/gms/b/cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */