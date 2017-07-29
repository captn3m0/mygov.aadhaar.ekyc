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
    Object localObject = b;
    j localj = k;
    int j;
    int k;
    if (localj != null)
    {
      ArrayList localArrayList = b.j();
      int i = localArrayList.size();
      j = 0;
      localObject = null;
      k = 0;
      if (k < i)
      {
        localObject = (j)localArrayList.get(k);
        if (localObject != localj) {}
      }
    }
    for (d = k;; d = j)
    {
      return;
      j = k + 1;
      k = j;
      break;
      j = -1;
    }
  }
  
  public final j a(int paramInt)
  {
    boolean bool = e;
    if (bool) {}
    for (ArrayList localArrayList = b.j();; localArrayList = b.h())
    {
      int i = d;
      if (i >= 0)
      {
        i = d;
        if (paramInt >= i) {
          paramInt += 1;
        }
      }
      return (j)localArrayList.get(paramInt);
    }
  }
  
  public final int getCount()
  {
    boolean bool = e;
    ArrayList localArrayList;
    if (bool)
    {
      localArrayList = b.j();
      int j = d;
      if (j >= 0) {
        break label44;
      }
    }
    label44:
    for (int i = localArrayList.size();; i = localArrayList.size() + -1)
    {
      return i;
      localArrayList = b.h();
      break;
    }
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1;
    int i;
    boolean bool1;
    Object localObject2;
    if (paramView == null)
    {
      localObject1 = f;
      i = a;
      bool1 = false;
      localObject2 = null;
    }
    for (View localView = ((LayoutInflater)localObject1).inflate(i, paramViewGroup, false);; localView = paramView)
    {
      localObject1 = localView;
      localObject1 = (p.a)localView;
      bool1 = c;
      if (bool1)
      {
        localObject2 = localView;
        localObject2 = (ListMenuItemView)localView;
        boolean bool2 = true;
        ((ListMenuItemView)localObject2).setForceShowIcon(bool2);
      }
      localObject2 = a(paramInt);
      ((p.a)localObject1).a((j)localObject2);
      return localView;
    }
  }
  
  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              android/support/v7/view/menu/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */