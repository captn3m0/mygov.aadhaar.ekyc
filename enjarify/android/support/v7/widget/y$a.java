package android.support.v7.widget;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

final class y$a
  implements ListAdapter, SpinnerAdapter
{
  private SpinnerAdapter a;
  private ListAdapter b;
  
  public y$a(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
  {
    a = paramSpinnerAdapter;
    boolean bool1 = paramSpinnerAdapter instanceof ListAdapter;
    Object localObject;
    if (bool1)
    {
      localObject = paramSpinnerAdapter;
      localObject = (ListAdapter)paramSpinnerAdapter;
      b = ((ListAdapter)localObject);
    }
    if (paramTheme != null)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 23;
      if (i >= j)
      {
        boolean bool2 = paramSpinnerAdapter instanceof ThemedSpinnerAdapter;
        if (bool2)
        {
          paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
          localObject = paramSpinnerAdapter.getDropDownViewTheme();
          if (localObject != paramTheme) {
            paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
          }
        }
      }
    }
  }
  
  public final boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = b;
    if (localListAdapter != null) {}
    for (boolean bool = localListAdapter.areAllItemsEnabled();; bool = true) {
      return bool;
    }
  }
  
  public final int getCount()
  {
    SpinnerAdapter localSpinnerAdapter = a;
    int i;
    if (localSpinnerAdapter == null)
    {
      i = 0;
      localSpinnerAdapter = null;
    }
    for (;;)
    {
      return i;
      localSpinnerAdapter = a;
      i = localSpinnerAdapter.getCount();
    }
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject = a;
    if (localObject == null) {}
    for (localObject = null;; localObject = a.getDropDownView(paramInt, paramView, paramViewGroup)) {
      return (View)localObject;
    }
  }
  
  public final Object getItem(int paramInt)
  {
    Object localObject = a;
    if (localObject == null) {}
    for (localObject = null;; localObject = a.getItem(paramInt)) {
      return localObject;
    }
  }
  
  public final long getItemId(int paramInt)
  {
    SpinnerAdapter localSpinnerAdapter = a;
    if (localSpinnerAdapter == null) {}
    for (long l = -1;; l = localSpinnerAdapter.getItemId(paramInt))
    {
      return l;
      localSpinnerAdapter = a;
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
  
  public final boolean hasStableIds()
  {
    SpinnerAdapter localSpinnerAdapter = a;
    boolean bool;
    if (localSpinnerAdapter != null)
    {
      localSpinnerAdapter = a;
      bool = localSpinnerAdapter.hasStableIds();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSpinnerAdapter = null;
    }
  }
  
  public final boolean isEmpty()
  {
    int i = getCount();
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = b;
    if (localListAdapter != null) {}
    for (boolean bool = localListAdapter.isEnabled(paramInt);; bool = true) {
      return bool;
    }
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = a;
    if (localSpinnerAdapter != null)
    {
      localSpinnerAdapter = a;
      localSpinnerAdapter.registerDataSetObserver(paramDataSetObserver);
    }
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = a;
    if (localSpinnerAdapter != null)
    {
      localSpinnerAdapter = a;
      localSpinnerAdapter.unregisterDataSetObserver(paramDataSetObserver);
    }
  }
}


/* Location:              android/support/v7/widget/y$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */