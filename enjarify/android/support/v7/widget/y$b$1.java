package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

final class y$b$1
  implements AdapterView.OnItemClickListener
{
  y$b$1(y.b paramb, y paramy) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    b.d.setSelection(paramInt);
    Object localObject = b.d.getOnItemClickListener();
    if (localObject != null)
    {
      localObject = b.d;
      ListAdapter localListAdapter = b.b;
      long l = localListAdapter.getItemId(paramInt);
      ((y)localObject).performItemClick(paramView, paramInt, l);
    }
    b.e();
  }
}


/* Location:              android/support/v7/widget/y$b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */