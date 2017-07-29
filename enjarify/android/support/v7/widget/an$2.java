package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class an$2
  implements AdapterView.OnItemSelectedListener
{
  an$2(an paraman) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = -1;
    if (paramInt != i)
    {
      ah localah = a.e;
      if (localah != null) {
        localah.setListSelectionHidden(false);
      }
    }
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:              android/support/v7/widget/an$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */