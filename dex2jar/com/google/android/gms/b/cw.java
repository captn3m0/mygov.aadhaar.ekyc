package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.c;

class cw
  extends BroadcastReceiver
{
  static final String a = cw.class.getName();
  final dc b;
  boolean c;
  boolean d;
  
  cw(dc paramdc)
  {
    c.a(paramdc);
    b = paramdc;
  }
  
  public final void a()
  {
    b.a();
    b.f().e();
    b.f().e();
    if (!c) {
      return;
    }
    b.e().g.a("Unregistering connectivity change receiver");
    c = false;
    d = false;
    Context localContext = b.a;
    try
    {
      localContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      b.e().a.a("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    b.a();
    paramContext = paramIntent.getAction();
    b.e().g.a("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      final boolean bool = b.k().x();
      if (d != bool)
      {
        d = bool;
        b.f().a(new Runnable()
        {
          public final void run()
          {
            cw.a(cw.this).u();
          }
        });
      }
      return;
    }
    b.e().c.a("NetworkBroadcastReceiver received unknown action", paramContext);
  }
}


/* Location:              com/google/android/gms/b/cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */