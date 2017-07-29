package android.support.v7.app;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class AlertController$a$3
  implements AdapterView.OnItemClickListener
{
  AlertController$a$3(AlertController.a parama, AlertController paramAlertController) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject = b.u;
    n localn = a.b;
    ((DialogInterface.OnClickListener)localObject).onClick(localn, paramInt);
    localObject = b;
    boolean bool = E;
    if (!bool)
    {
      localObject = a.b;
      ((n)localObject).dismiss();
    }
  }
}


/* Location:              android/support/v7/app/AlertController$a$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */