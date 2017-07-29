package android.support.v7.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class k$b$1
  extends BroadcastReceiver
{
  k$b$1(k.b paramb) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject = a;
    s locals = a;
    boolean bool1 = locals.a();
    boolean bool2 = b;
    if (bool1 != bool2)
    {
      b = bool1;
      localObject = e;
      ((k)localObject).k();
    }
  }
}


/* Location:              android/support/v7/app/k$b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */