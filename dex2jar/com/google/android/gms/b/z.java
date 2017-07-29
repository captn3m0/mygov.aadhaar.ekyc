package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class z
  extends BroadcastReceiver
{
  protected Context a;
  private final a b;
  
  public z(a parama)
  {
    b = parama;
  }
  
  public final void a()
  {
    try
    {
      if (a != null) {
        a.unregisterReceiver(this);
      }
      a = null;
      return;
    }
    finally {}
  }
  
  public final void a(Context paramContext)
  {
    a = paramContext;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = paramIntent.getData();
    paramContext = null;
    if (paramIntent != null) {
      paramContext = paramIntent.getSchemeSpecificPart();
    }
    if ("com.google.android.gms".equals(paramContext))
    {
      b.a();
      a();
    }
  }
  
  public static abstract class a
  {
    public abstract void a();
  }
}


/* Location:              com/google/android/gms/b/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */