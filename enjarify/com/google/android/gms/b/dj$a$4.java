package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;

final class dj$a$4
  implements Runnable
{
  dj$a$4(dj.a parama) {}
  
  public final void run()
  {
    dj localdj = a.c;
    ComponentName localComponentName = new android/content/ComponentName;
    Context localContext = a.c.n();
    cf.W();
    localComponentName.<init>(localContext, "com.google.android.gms.measurement.AppMeasurementService");
    dj.a(localdj, localComponentName);
  }
}


/* Location:              com/google/android/gms/b/dj$a$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */