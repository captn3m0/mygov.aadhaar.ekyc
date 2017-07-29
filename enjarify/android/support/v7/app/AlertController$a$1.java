package android.support.v7.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

final class AlertController$a$1
  extends ArrayAdapter
{
  AlertController$a$1(AlertController.a parama, Context paramContext, int paramInt, CharSequence[] paramArrayOfCharSequence, AlertController.RecycleListView paramRecycleListView)
  {
    super(paramContext, paramInt, 16908308, paramArrayOfCharSequence);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = super.getView(paramInt, paramView, paramViewGroup);
    Object localObject = b.C;
    if (localObject != null)
    {
      localObject = b.C;
      int i = localObject[paramInt];
      if (i != 0)
      {
        localObject = a;
        boolean bool = true;
        ((AlertController.RecycleListView)localObject).setItemChecked(paramInt, bool);
      }
    }
    return localView;
  }
}


/* Location:              android/support/v7/app/AlertController$a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */