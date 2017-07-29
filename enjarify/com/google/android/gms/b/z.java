package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class z
  extends BroadcastReceiver
{
  protected Context a;
  private final z.a b;
  
  public z(z.a parama)
  {
    b = parama;
  }
  
  public final void a()
  {
    try
    {
      Context localContext = a;
      if (localContext != null)
      {
        localContext = a;
        localContext.unregisterReceiver(this);
      }
      localContext = null;
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
    Object localObject1 = paramIntent.getData();
    boolean bool = false;
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject2 = ((Uri)localObject1).getSchemeSpecificPart();
    }
    localObject1 = "com.google.android.gms";
    bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      localObject2 = b;
      ((z.a)localObject2).a();
      a();
    }
  }
}


/* Location:              com/google/android/gms/b/z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */