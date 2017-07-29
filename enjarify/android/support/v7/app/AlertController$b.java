package android.support.v7.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class AlertController$b
  extends Handler
{
  private WeakReference a;
  
  public AlertController$b(DialogInterface paramDialogInterface)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramDialogInterface);
    a = localWeakReference;
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int i = what;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      Object localObject = (DialogInterface.OnClickListener)obj;
      DialogInterface localDialogInterface = (DialogInterface)a.get();
      int j = what;
      ((DialogInterface.OnClickListener)localObject).onClick(localDialogInterface, j);
      continue;
      localObject = (DialogInterface)obj;
      ((DialogInterface)localObject).dismiss();
    }
  }
}


/* Location:              android/support/v7/app/AlertController$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */