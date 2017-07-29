package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class tt$a
  extends BroadcastReceiver
{
  private tt$a(tt paramtt) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject = "android.intent.action.USER_PRESENT";
    String str = paramIntent.getAction();
    boolean bool1 = ((String)localObject).equals(str);
    boolean bool2;
    if (bool1)
    {
      localObject = a;
      bool2 = true;
      tt.a((tt)localObject, bool2);
    }
    for (;;)
    {
      return;
      localObject = "android.intent.action.SCREEN_OFF";
      str = paramIntent.getAction();
      bool1 = ((String)localObject).equals(str);
      if (bool1)
      {
        localObject = a;
        bool2 = false;
        str = null;
        tt.a((tt)localObject, false);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/tt$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */