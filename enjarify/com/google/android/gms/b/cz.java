package com.google.android.gms.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.c;

public final class cz
{
  private final cz.a a;
  
  public cz(cz.a parama)
  {
    c.a(parama);
    a = parama;
  }
  
  public static boolean a(Context paramContext)
  {
    c.a(paramContext);
    return dr.a(paramContext, "com.google.android.gms.measurement.AppMeasurementReceiver");
  }
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    long l1 = 0L;
    Object localObject1 = dc.a(paramContext);
    cu localcu = ((dc)localObject1).e();
    Object localObject2;
    if (paramIntent == null)
    {
      localObject2 = c;
      localObject1 = "Receiver called with null intent";
      ((cu.a)localObject2).a((String)localObject1);
    }
    for (;;)
    {
      return;
      cf.W();
      localObject2 = paramIntent.getAction();
      Object localObject3 = g;
      String str = "Local receiver got";
      ((cu.a)localObject3).a(str, localObject2);
      localObject3 = "com.google.android.gms.measurement.UPLOAD";
      boolean bool1 = ((String)localObject3).equals(localObject2);
      if (bool1)
      {
        dk.a(paramContext);
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>();
        localObject2 = ((Intent)localObject2).setClassName(paramContext, "com.google.android.gms.measurement.AppMeasurementService");
        ((Intent)localObject2).setAction("com.google.android.gms.measurement.UPLOAD");
        localObject1 = a;
        ((cz.a)localObject1).a(paramContext, (Intent)localObject2);
      }
      else
      {
        localObject3 = "com.android.vending.INSTALL_REFERRER";
        boolean bool2 = ((String)localObject3).equals(localObject2);
        if (bool2)
        {
          localObject2 = paramIntent.getStringExtra("referrer");
          if (localObject2 == null)
          {
            localObject2 = g;
            localObject1 = "Install referrer extras are null";
            ((cu.a)localObject2).a((String)localObject1);
          }
          else
          {
            localObject3 = e;
            str = "Install referrer extras are";
            ((cu.a)localObject3).a(str, localObject2);
            localObject3 = "?";
            bool1 = ((String)localObject2).contains((CharSequence)localObject3);
            if (!bool1)
            {
              localObject3 = "?";
              localObject2 = String.valueOf(localObject2);
              int i = ((String)localObject2).length();
              if (i == 0) {
                break label309;
              }
              localObject2 = ((String)localObject3).concat((String)localObject2);
            }
            Bundle localBundle;
            for (;;)
            {
              localObject2 = Uri.parse((String)localObject2);
              localObject3 = ((dc)localObject1).i();
              localBundle = ((dr)localObject3).a((Uri)localObject2);
              if (localBundle != null) {
                break label324;
              }
              localObject2 = g;
              localObject1 = "No campaign defined in install referrer broadcast";
              ((cu.a)localObject2).a((String)localObject1);
              break;
              label309:
              localObject2 = new java/lang/String;
              ((String)localObject2).<init>((String)localObject3);
            }
            label324:
            localObject2 = "referrer_timestamp_seconds";
            long l2 = paramIntent.getLongExtra((String)localObject2, l1);
            long l3 = 1000L;
            l2 *= l3;
            bool2 = l2 < l1;
            if (!bool2)
            {
              localObject2 = c;
              localObject4 = "Install referrer is missing timestamp";
              ((cu.a)localObject2).a((String)localObject4);
            }
            db localdb = ((dc)localObject1).f();
            localObject2 = new com/google/android/gms/b/cz$1;
            Object localObject4 = paramContext;
            ((cz.1)localObject2).<init>((dc)localObject1, l2, localBundle, paramContext, localcu);
            localdb.a((Runnable)localObject2);
          }
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/cz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */