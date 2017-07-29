package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import android.support.v4.c.e;
import com.google.android.gms.b.cz;
import com.google.android.gms.b.cz.a;

public final class AppMeasurementReceiver
  extends e
  implements cz.a
{
  private cz a;
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    a_(paramContext, paramIntent);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    cz localcz = a;
    if (localcz == null)
    {
      localcz = new com/google/android/gms/b/cz;
      localcz.<init>(this);
      a = localcz;
    }
    a.a(paramContext, paramIntent);
  }
}


/* Location:              com/google/android/gms/measurement/AppMeasurementReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */