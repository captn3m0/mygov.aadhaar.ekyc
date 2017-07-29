package android.support.v4.widget;

import android.database.DataSetObserver;

final class d$b
  extends DataSetObserver
{
  d$b(d paramd) {}
  
  public final void onChanged()
  {
    a.a = true;
    a.notifyDataSetChanged();
  }
  
  public final void onInvalidated()
  {
    a.a = false;
    a.notifyDataSetInvalidated();
  }
}


/* Location:              android/support/v4/widget/d$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */