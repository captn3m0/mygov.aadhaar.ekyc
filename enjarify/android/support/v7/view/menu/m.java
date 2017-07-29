package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class m
  implements o, s, AdapterView.OnItemClickListener
{
  Rect e;
  
  protected static int a(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt)
  {
    int i = 0;
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = paramListAdapter.getCount();
    int n = 0;
    int i1 = 0;
    View localView = null;
    int i2 = 0;
    Object localObject1 = paramViewGroup;
    Object localObject2;
    if (n < m)
    {
      int i3 = paramListAdapter.getItemViewType(n);
      if (i3 != i1)
      {
        i1 = i3;
        localView = null;
      }
      if (localObject1 != null) {
        break label159;
      }
      localObject1 = new android/widget/FrameLayout;
      ((FrameLayout)localObject1).<init>(paramContext);
      localObject2 = localObject1;
      label91:
      localView = paramListAdapter.getView(n, localView, (ViewGroup)localObject2);
      localView.measure(j, k);
      i = localView.getMeasuredWidth();
      if (i >= paramInt) {
        label127:
        return paramInt;
      }
      if (i <= i2) {
        break label166;
      }
    }
    for (;;)
    {
      n += 1;
      i2 = i;
      localObject1 = localObject2;
      break;
      paramInt = i2;
      break label127;
      label159:
      localObject2 = localObject1;
      break label91;
      label166:
      i = i2;
    }
  }
  
  protected static g a(ListAdapter paramListAdapter)
  {
    boolean bool = paramListAdapter instanceof HeaderViewListAdapter;
    if (bool) {
      paramListAdapter = (HeaderViewListAdapter)paramListAdapter;
    }
    for (Object localObject = (g)paramListAdapter.getWrappedAdapter();; localObject = paramListAdapter)
    {
      return (g)localObject;
      paramListAdapter = (g)paramListAdapter;
    }
  }
  
  protected static boolean b(h paramh)
  {
    boolean bool1 = false;
    int i = paramh.size();
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        Object localObject = paramh.getItem(j);
        boolean bool2 = ((MenuItem)localObject).isVisible();
        if (bool2)
        {
          localObject = ((MenuItem)localObject).getIcon();
          if (localObject != null) {
            bool1 = true;
          }
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
    }
  }
  
  public abstract void a(int paramInt);
  
  public final void a(Context paramContext, h paramh) {}
  
  public abstract void a(h paramh);
  
  public abstract void a(View paramView);
  
  public abstract void a(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public final boolean a(j paramj)
  {
    return false;
  }
  
  public final int b()
  {
    return 0;
  }
  
  public abstract void b(int paramInt);
  
  public abstract void b(boolean paramBoolean);
  
  public final boolean b(j paramj)
  {
    return false;
  }
  
  public abstract void c(int paramInt);
  
  public abstract void c(boolean paramBoolean);
  
  protected boolean h()
  {
    return true;
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject = (ListAdapter)paramAdapterView.getAdapter();
    g localg = a((ListAdapter)localObject);
    h localh = b;
    localObject = (MenuItem)((ListAdapter)localObject).getItem(paramInt);
    int i = h();
    if (i != 0)
    {
      i = 0;
      localg = null;
    }
    for (;;)
    {
      localh.a((MenuItem)localObject, this, i);
      return;
      int j = 4;
    }
  }
}


/* Location:              android/support/v7/view/menu/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */