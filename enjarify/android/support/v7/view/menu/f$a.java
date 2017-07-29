package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class f$a
  extends BaseAdapter
{
  private int b = -1;
  
  public f$a(f paramf)
  {
    a();
  }
  
  private void a()
  {
    Object localObject = a.c;
    j localj = k;
    int j;
    int k;
    if (localj != null)
    {
      ArrayList localArrayList = a.c.j();
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
    for (b = k;; b = j)
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
    ArrayList localArrayList = a.c.j();
    f localf = a;
    int i = e + paramInt;
    int j = b;
    if (j >= 0)
    {
      j = b;
      if (i >= j) {
        i += 1;
      }
    }
    return (j)localArrayList.get(i);
  }
  
  public final int getCount()
  {
    ArrayList localArrayList = a.c.j();
    int i = localArrayList.size();
    f localf = a;
    int j = e;
    i -= j;
    j = b;
    if (j < 0) {}
    for (;;)
    {
      return i;
      i += -1;
    }
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    int i;
    j localj;
    if (paramView == null)
    {
      localObject = a.b;
      i = a.g;
      localj = null;
    }
    for (View localView = ((LayoutInflater)localObject).inflate(i, paramViewGroup, false);; localView = paramView)
    {
      localObject = localView;
      localObject = (p.a)localView;
      localj = a(paramInt);
      ((p.a)localObject).a(localj);
      return localView;
    }
  }
  
  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              android/support/v7/view/menu/f$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */