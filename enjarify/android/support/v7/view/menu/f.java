package android.support.v7.view.menu;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
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
import android.widget.ListAdapter;

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
  f.a i;
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
    LayoutInflater localLayoutInflater = LayoutInflater.from(a);
    b = localLayoutInflater;
  }
  
  public final p a(ViewGroup paramViewGroup)
  {
    Object localObject = d;
    if (localObject == null)
    {
      localObject = b;
      int k = a.g.abc_expanded_menu_layout;
      localObject = (ExpandedMenuView)((LayoutInflater)localObject).inflate(k, paramViewGroup, false);
      d = ((ExpandedMenuView)localObject);
      localObject = i;
      if (localObject == null)
      {
        localObject = new android/support/v7/view/menu/f$a;
        ((f.a)localObject).<init>(this);
        i = ((f.a)localObject);
      }
      localObject = d;
      f.a locala = i;
      ((ExpandedMenuView)localObject).setAdapter(locala);
      localObject = d;
      ((ExpandedMenuView)localObject).setOnItemClickListener(this);
    }
    return d;
  }
  
  public final void a(Context paramContext, h paramh)
  {
    int k = f;
    Object localObject;
    if (k != 0)
    {
      localObject = new android/view/ContextThemeWrapper;
      int m = f;
      ((ContextThemeWrapper)localObject).<init>(paramContext, m);
      a = ((Context)localObject);
      localObject = LayoutInflater.from(a);
      b = ((LayoutInflater)localObject);
    }
    for (;;)
    {
      c = paramh;
      localObject = i;
      if (localObject != null)
      {
        localObject = i;
        ((f.a)localObject).notifyDataSetChanged();
      }
      return;
      localObject = a;
      if (localObject != null)
      {
        a = paramContext;
        localObject = b;
        if (localObject == null)
        {
          localObject = LayoutInflater.from(a);
          b = ((LayoutInflater)localObject);
        }
      }
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    paramParcelable = (Bundle)paramParcelable;
    SparseArray localSparseArray = paramParcelable.getSparseParcelableArray("android:menu:list");
    if (localSparseArray != null)
    {
      ExpandedMenuView localExpandedMenuView = d;
      localExpandedMenuView.restoreHierarchyState(localSparseArray);
    }
  }
  
  public final void a(h paramh, boolean paramBoolean)
  {
    o.a locala = h;
    if (locala != null)
    {
      locala = h;
      locala.a(paramh, paramBoolean);
    }
  }
  
  public final void a(o.a parama)
  {
    h = parama;
  }
  
  public final void a(boolean paramBoolean)
  {
    f.a locala = i;
    if (locala != null)
    {
      locala = i;
      locala.notifyDataSetChanged();
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
    boolean bool = paramu.hasVisibleItems();
    if (!bool)
    {
      bool = false;
      localObject1 = null;
      return bool;
    }
    Object localObject1 = new android/support/v7/view/menu/i;
    ((i)localObject1).<init>(paramu);
    Object localObject2 = a;
    d.a locala = new android/support/v7/app/d$a;
    Object localObject3 = a;
    locala.<init>((Context)localObject3);
    localObject3 = new android/support/v7/view/menu/f;
    Object localObject4 = a.a;
    int k = a.g.abc_list_menu_item_layout;
    ((f)localObject3).<init>((Context)localObject4, k);
    c = ((f)localObject3);
    c.h = ((o.a)localObject1);
    localObject3 = a;
    localObject4 = c;
    ((h)localObject3).a((o)localObject4);
    localObject3 = c.d();
    localObject4 = a;
    t = ((ListAdapter)localObject3);
    a.u = ((DialogInterface.OnClickListener)localObject1);
    localObject3 = h;
    if (localObject3 != null)
    {
      localObject2 = a;
      g = ((View)localObject3);
    }
    for (;;)
    {
      a.r = ((DialogInterface.OnKeyListener)localObject1);
      localObject2 = locala.a();
      b = ((d)localObject2);
      b.setOnDismissListener((DialogInterface.OnDismissListener)localObject1);
      localObject2 = b.getWindow().getAttributes();
      type = 1003;
      int m = flags;
      int n = 131072;
      m |= n;
      flags = m;
      b.show();
      localObject1 = h;
      if (localObject1 != null)
      {
        localObject1 = h;
        ((o.a)localObject1).a(paramu);
      }
      bool = true;
      break;
      localObject3 = g;
      localObject4 = a;
      d = ((Drawable)localObject3);
      localObject2 = f;
      localObject3 = a;
      f = ((CharSequence)localObject2);
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
    Object localObject1 = d;
    if (localObject1 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (Parcelable)localObject1;
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      SparseArray localSparseArray = new android/util/SparseArray;
      localSparseArray.<init>();
      Object localObject2 = d;
      if (localObject2 != null)
      {
        localObject2 = d;
        ((View)localObject2).saveHierarchyState(localSparseArray);
      }
      localObject2 = "android:menu:list";
      ((Bundle)localObject1).putSparseParcelableArray((String)localObject2, localSparseArray);
    }
  }
  
  public final ListAdapter d()
  {
    f.a locala = i;
    if (locala == null)
    {
      locala = new android/support/v7/view/menu/f$a;
      locala.<init>(this);
      i = locala;
    }
    return i;
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    h localh = c;
    j localj = i.a(paramInt);
    localh.a(localj, this, 0);
  }
}


/* Location:              android/support/v7/view/menu/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */