package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

final class AlertController$1
  implements View.OnClickListener
{
  AlertController$1(AlertController paramAlertController) {}
  
  public final void onClick(View paramView)
  {
    Object localObject = a.n;
    if (paramView == localObject)
    {
      localObject = a.p;
      if (localObject != null) {
        localObject = Message.obtain(a.p);
      }
    }
    for (;;)
    {
      if (localObject != null) {
        ((Message)localObject).sendToTarget();
      }
      localObject = a.N;
      n localn = a.b;
      ((Handler)localObject).obtainMessage(1, localn).sendToTarget();
      return;
      localObject = a.q;
      if (paramView == localObject)
      {
        localObject = a.s;
        if (localObject != null)
        {
          localObject = Message.obtain(a.s);
          continue;
        }
      }
      localObject = a.t;
      if (paramView == localObject)
      {
        localObject = a.v;
        if (localObject != null)
        {
          localObject = Message.obtain(a.v);
          continue;
        }
      }
      localObject = null;
    }
  }
}


/* Location:              android/support/v7/app/AlertController$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */