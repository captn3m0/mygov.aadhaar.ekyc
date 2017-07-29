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
    String str = null;
    b.a();
    b.f().e();
    Object localObject1 = b.f();
    ((db)localObject1).e();
    boolean bool = c;
    if (!bool) {}
    for (;;)
    {
      return;
      localObject1 = b.e().g;
      Object localObject2 = "Unregistering connectivity change receiver";
      ((cu.a)localObject1).a((String)localObject2);
      c = false;
      d = false;
      localObject1 = b.a;
      try
      {
        ((Context)localObject1).unregisterReceiver(this);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localObject2 = b.e().a;
        str = "Failed to unregister the network broadcast receiver";
        ((cu.a)localObject2).a(str, localIllegalArgumentException);
      }
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    b.a();
    Object localObject1 = paramIntent.getAction();
    Object localObject2 = b.e().g;
    Object localObject3 = "NetworkBroadcastReceiver received action";
    ((cu.a)localObject2).a((String)localObject3, localObject1);
    localObject2 = "android.net.conn.CONNECTIVITY_CHANGE";
    boolean bool1 = ((String)localObject2).equals(localObject1);
    if (bool1)
    {
      localObject1 = b.k();
      boolean bool2 = ((cv)localObject1).x();
      bool1 = d;
      if (bool1 != bool2)
      {
        d = bool2;
        localObject2 = b.f();
        localObject3 = new com/google/android/gms/b/cw$1;
        ((cw.1)localObject3).<init>(this, bool2);
        ((db)localObject2).a((Runnable)localObject3);
      }
    }
    for (;;)
    {
      return;
      localObject2 = b.e().c;
      localObject3 = "NetworkBroadcastReceiver received unknown action";
      ((cu.a)localObject2).a((String)localObject3, localObject1);
    }
  }
}


/* Location:              com/google/android/gms/b/cw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */