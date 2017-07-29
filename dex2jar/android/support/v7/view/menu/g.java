package android.support.v7.view.menu;

import android.support.v7.a.a.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class g
  extends BaseAdapter
{
  static final int a = a.g.abc_popup_menu_item_layout;
  public h b;
  boolean c;
  private int d = -1;
  private final boolean e;
  private final LayoutInflater f;
  
  public g(h paramh, LayoutInflater paramLayoutInflater, boolean paramBoolean)
  {
    e = paramBoolean;
    f = paramLayoutInflater;
    b = paramh;
    a();
  }
  
  private void a()
  {
    j localj = b.k;
    if (localj != null)
    {
      ArrayList localArrayList = b.j();
      int j = localArrayList.size();
      int i = 0;
      while (i < j)
      {
        if ((j)localArrayList.get(i) == localj)
        {
          d = i;
          return;
        }
        i += 1;
      }
    }
    d = -1;
  }
  
  public final j a(int paramInt)
  {
    if (e) {}
    for (ArrayList localArrayList = b.j();; localArrayList = b.h())
    {
      int i = paramInt;
      if (d >= 0)
      {
        i = paramInt;
        if (paramInt >= d) {
          i = paramInt + 1;
        }
      }
      return (j)localArrayList.get(i);
    }
  }
  
  public final int getCount()
  {
    if (e) {}
    for (ArrayList localArrayList = b.j(); d < 0; localArrayList = b.h()) {
      return localArrayList.size();
    }
    return localArrayList.size() - 1;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = f.inflate(a, paramViewGroup, false);
    }
    for (;;)
    {
      paramViewGroup = (p.a)paramView;
      if (c) {
        ((ListMenuItemView)paramView).setForceShowIcon(true);
      }
      paramViewGroup.a(a(paramInt));
      return paramView;
    }
  }
  
  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              android/support/v7/view/menu/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */