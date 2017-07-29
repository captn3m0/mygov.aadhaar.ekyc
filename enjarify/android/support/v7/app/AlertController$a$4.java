package android.support.v7.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class AlertController$a$4
  implements AdapterView.OnItemClickListener
{
  AlertController$a$4(AlertController.a parama, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject1 = c.C;
    if (localObject1 != null)
    {
      localObject1 = c.C;
      localObject2 = a;
      boolean bool1 = ((AlertController.RecycleListView)localObject2).isItemChecked(paramInt);
      localObject1[paramInt] = bool1;
    }
    localObject1 = c.G;
    Object localObject2 = b.b;
    boolean bool2 = a.isItemChecked(paramInt);
    ((DialogInterface.OnMultiChoiceClickListener)localObject1).onClick((DialogInterface)localObject2, paramInt, bool2);
  }
}


/* Location:              android/support/v7/app/AlertController$a$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */