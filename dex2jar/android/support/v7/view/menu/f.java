package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.a.a.g;
import android.support.v7.app.AlertController.a;
import android.support.v7.app.d;
import android.support.v7.app.d.a;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

public final class f
  implements o, AdapterView.OnItemClickListener
{
  Context a;
  LayoutInflater b;
  h c;
  ExpandedMenuView d;
  int e;
  int f;
  int g;
  public o.a h;
  a i;
  private int j;
  
  private f(int paramInt)
  {
    g = paramInt;
    f = 0;
  }
  
  public f(Context paramContext, int paramInt)
  {
    this(paramInt);
    a = paramContext;
    b = LayoutInflater.from(a);
  }
  
  public final p a(ViewGroup paramViewGroup)
  {
    if (d == null)
    {
      d = ((ExpandedMenuView)b.inflate(a.g.abc_expanded_menu_layout, paramViewGroup, false));
      if (i == null) {
        i = new a();
      }
      d.setAdapter(i);
      d.setOnItemClickListener(this);
    }
    return d;
  }
  
  public final void a(Context paramContext, h paramh)
  {
    if (f != 0)
    {
      a = new ContextThemeWrapper(paramContext, f);
      b = LayoutInflater.from(a);
    }
    for (;;)
    {
      c = paramh;
      if (i != null) {
        i.notifyDataSetChanged();
      }
      return;
      if (a != null)
      {
        a = paramContext;
        if (b == null) {
          b = LayoutInflater.from(a);
        }
      }
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    paramParcelable = ((Bundle)paramParcelable).getSparseParcelableArray("android:menu:list");
    if (paramParcelable != null) {
      d.restoreHierarchyState(paramParcelable);
    }
  }
  
  public final void a(h paramh, boolean paramBoolean)
  {
    if (h != null) {
      h.a(paramh, paramBoolean);
    }
  }
  
  public final void a(o.a parama)
  {
    h = parama;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (i != null) {
      i.notifyDataSetChanged();
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(j paramj)
  {
    return false;
  }
  
  public final boolean a(u paramu)
  {
    if (!paramu.hasVisibleItems()) {
      return false;
    }
    i locali = new i(paramu);
    Object localObject2 = a;
    Object localObject1 = new d.a(a);
    c = new f(a.a, a.g.abc_list_menu_item_layout);
    c.h = locali;
    a.a(c);
    Object localObject3 = c.d();
    a.t = ((ListAdapter)localObject3);
    a.u = locali;
    localObject3 = h;
    if (localObject3 != null) {
      a.g = ((View)localObject3);
    }
    for (;;)
    {
      a.r = locali;
      b = ((d.a)localObject1).a();
      b.setOnDismissListener(locali);
      localObject1 = b.getWindow().getAttributes();
      type = 1003;
      flags |= 0x20000;
      b.show();
      if (h != null) {
        h.a(paramu);
      }
      return true;
      localObject3 = g;
      a.d = ((Drawable)localObject3);
      localObject2 = f;
      a.f = ((CharSequence)localObject2);
    }
  }
  
  public final int b()
  {
    return j;
  }
  
  public final boolean b(j paramj)
  {
    return false;
  }
  
  public final Parcelable c()
  {
    if (d == null) {
      return null;
    }
    Bundle localBundle = new Bundle();
    SparseArray localSparseArray = new SparseArray();
    if (d != null) {
      d.saveHierarchyState(localSparseArray);
    }
    localBundle.putSparseParcelableArray("android:menu:list", localSparseArray);
    return localBundle;
  }
  
  public final ListAdapter d()
  {
    if (i == null) {
      i = new a();
    }
    return i;
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    c.a(i.a(paramInt), this, 0);
  }
  
  private final class a
    extends BaseAdapter
  {
    private int b = -1;
    
    public a()
    {
      a();
    }
    
    private void a()
    {
      j localj = c.k;
      if (localj != null)
      {
        ArrayList localArrayList = c.j();
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          if ((j)localArrayList.get(i) == localj)
          {
            b = i;
            return;
          }
          i += 1;
        }
      }
      b = -1;
    }
    
    public final j a(int paramInt)
    {
      ArrayList localArrayList = c.j();
      int i = e + paramInt;
      paramInt = i;
      if (b >= 0)
      {
        paramInt = i;
        if (i >= b) {
          paramInt = i + 1;
        }
      }
      return (j)localArrayList.get(paramInt);
    }
    
    public final int getCount()
    {
      int i = c.j().size() - e;
      if (b < 0) {
        return i;
      }
      return i - 1;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        paramView = b.inflate(g, paramViewGroup, false);
      }
      for (;;)
      {
        ((p.a)paramView).a(a(paramInt));
        return paramView;
      }
    }
    
    public final void notifyDataSetChanged()
    {
      a();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              android/support/v7/view/menu/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */