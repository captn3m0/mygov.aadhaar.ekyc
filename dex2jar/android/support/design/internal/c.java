package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.a.c;
import android.support.design.a.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;
import android.support.v7.widget.at.a;
import android.support.v7.widget.at.b;
import android.support.v7.widget.at.u;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class c
  implements o
{
  public NavigationMenuView a;
  public LinearLayout b;
  h c;
  public int d;
  public b e;
  public LayoutInflater f;
  int g;
  boolean h;
  public ColorStateList i;
  public ColorStateList j;
  public Drawable k;
  public int l;
  int m;
  final View.OnClickListener n = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      paramAnonymousView = (NavigationMenuItemView)paramAnonymousView;
      b(true);
      paramAnonymousView = paramAnonymousView.getItemData();
      boolean bool = c.a(paramAnonymousView, c.this, 0);
      if ((paramAnonymousView != null) && (paramAnonymousView.isCheckable()) && (bool)) {
        e.a(paramAnonymousView);
      }
      b(false);
      a(false);
    }
  };
  private o.a o;
  
  public final void a(int paramInt)
  {
    g = paramInt;
    h = true;
    a(false);
  }
  
  public final void a(Context paramContext, h paramh)
  {
    f = LayoutInflater.from(paramContext);
    c = paramh;
    m = paramContext.getResources().getDimensionPixelOffset(a.c.design_navigation_separator_vertical_padding);
  }
  
  public final void a(ColorStateList paramColorStateList)
  {
    j = paramColorStateList;
    a(false);
  }
  
  public final void a(Drawable paramDrawable)
  {
    k = paramDrawable;
    a(false);
  }
  
  public final void a(Parcelable paramParcelable)
  {
    int i2 = 0;
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      Object localObject1 = paramParcelable.getSparseParcelableArray("android:menu:list");
      if (localObject1 != null) {
        a.restoreHierarchyState((SparseArray)localObject1);
      }
      Object localObject2 = paramParcelable.getBundle("android:menu:adapter");
      if (localObject2 != null)
      {
        localObject1 = e;
        int i3 = ((Bundle)localObject2).getInt("android:menu:checked", 0);
        int i4;
        int i1;
        if (i3 != 0)
        {
          b = true;
          i4 = a.size();
          i1 = 0;
        }
        for (;;)
        {
          Object localObject3;
          if (i1 < i4)
          {
            localObject3 = (d)a.get(i1);
            if ((localObject3 instanceof f))
            {
              localObject3 = a;
              if ((localObject3 != null) && (((j)localObject3).getItemId() == i3)) {
                ((b)localObject1).a((j)localObject3);
              }
            }
          }
          else
          {
            b = false;
            ((b)localObject1).b();
            localObject2 = ((Bundle)localObject2).getSparseParcelableArray("android:menu:action_views");
            if (localObject2 == null) {
              break;
            }
            i3 = a.size();
            i1 = i2;
            while (i1 < i3)
            {
              localObject3 = (d)a.get(i1);
              if ((localObject3 instanceof f))
              {
                Object localObject4 = a;
                if (localObject4 != null)
                {
                  localObject3 = ((j)localObject4).getActionView();
                  if (localObject3 != null)
                  {
                    localObject4 = (e)((SparseArray)localObject2).get(((j)localObject4).getItemId());
                    if (localObject4 != null) {
                      ((View)localObject3).restoreHierarchyState((SparseArray)localObject4);
                    }
                  }
                }
              }
              i1 += 1;
            }
          }
          i1 += 1;
        }
      }
      paramParcelable = paramParcelable.getSparseParcelableArray("android:menu:header");
      if (paramParcelable != null) {
        b.restoreHierarchyState(paramParcelable);
      }
    }
  }
  
  public final void a(h paramh, boolean paramBoolean)
  {
    if (o != null) {
      o.a(paramh, paramBoolean);
    }
  }
  
  public final void a(o.a parama)
  {
    o = parama;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (e != null)
    {
      b localb = e;
      localb.b();
      d.a();
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
    return false;
  }
  
  public final int b()
  {
    return d;
  }
  
  public final void b(ColorStateList paramColorStateList)
  {
    i = paramColorStateList;
    a(false);
  }
  
  public final void b(boolean paramBoolean)
  {
    if (e != null) {
      e.b = paramBoolean;
    }
  }
  
  public final boolean b(j paramj)
  {
    return false;
  }
  
  public final Parcelable c()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      Bundle localBundle = new Bundle();
      SparseArray localSparseArray;
      if (a != null)
      {
        localSparseArray = new SparseArray();
        a.saveHierarchyState(localSparseArray);
        localBundle.putSparseParcelableArray("android:menu:list", localSparseArray);
      }
      if (e != null) {
        localBundle.putBundle("android:menu:adapter", e.c());
      }
      if (b != null)
      {
        localSparseArray = new SparseArray();
        b.saveHierarchyState(localSparseArray);
        localBundle.putSparseParcelableArray("android:menu:header", localSparseArray);
      }
      return localBundle;
    }
    return null;
  }
  
  private static final class a
    extends c.j
  {
    public a(View paramView)
    {
      super();
    }
  }
  
  private final class b
    extends at.a<c.j>
  {
    final ArrayList<c.d> a = new ArrayList();
    boolean b;
    private j f;
    
    public b()
    {
      b();
    }
    
    private void a(int paramInt1, int paramInt2)
    {
      while (paramInt1 < paramInt2)
      {
        a.get(paramInt1)).b = true;
        paramInt1 += 1;
      }
    }
    
    public final int a()
    {
      return a.size();
    }
    
    public final long a(int paramInt)
    {
      return paramInt;
    }
    
    public final void a(j paramj)
    {
      if ((f == paramj) || (!paramj.isCheckable())) {
        return;
      }
      if (f != null) {
        f.setChecked(false);
      }
      f = paramj;
      paramj.setChecked(true);
    }
    
    public final int b(int paramInt)
    {
      c.d locald = (c.d)a.get(paramInt);
      if ((locald instanceof c.e)) {
        return 2;
      }
      if ((locald instanceof c.c)) {
        return 3;
      }
      if ((locald instanceof c.f))
      {
        if (a.hasSubMenu()) {
          return 1;
        }
        return 0;
      }
      throw new RuntimeException("Unknown item type.");
    }
    
    final void b()
    {
      if (b) {
        return;
      }
      b = true;
      a.clear();
      a.add(new c.c());
      int j = -1;
      int i = 0;
      boolean bool1 = false;
      int i2 = c.h().size();
      int n = 0;
      Object localObject;
      int k;
      boolean bool2;
      for (;;)
      {
        if (n < i2)
        {
          localObject = (j)c.h().get(n);
          if (((j)localObject).isChecked()) {
            a((j)localObject);
          }
          if (((j)localObject).isCheckable()) {
            ((j)localObject).a(false);
          }
          if (((j)localObject).hasSubMenu())
          {
            SubMenu localSubMenu = ((j)localObject).getSubMenu();
            if (localSubMenu.hasVisibleItems())
            {
              if (n != 0) {
                a.add(new c.e(c.this.m, 0));
              }
              a.add(new c.f((j)localObject));
              k = 0;
              int i3 = a.size();
              int i4 = localSubMenu.size();
              int i1 = 0;
              while (i1 < i4)
              {
                j localj = (j)localSubMenu.getItem(i1);
                int m = k;
                if (localj.isVisible())
                {
                  m = k;
                  if (k == 0)
                  {
                    m = k;
                    if (localj.getIcon() != null) {
                      m = 1;
                    }
                  }
                  if (localj.isCheckable()) {
                    localj.a(false);
                  }
                  if (((j)localObject).isChecked()) {
                    a((j)localObject);
                  }
                  a.add(new c.f(localj));
                }
                i1 += 1;
                k = m;
              }
              if (k != 0) {
                a(i3, a.size());
              }
            }
            k = j;
            j = i;
            i = k;
            n += 1;
            k = i;
            i = j;
            j = k;
          }
          else
          {
            k = ((j)localObject).getGroupId();
            if (k != j)
            {
              j = a.size();
              if (((j)localObject).getIcon() != null)
              {
                bool2 = true;
                label386:
                bool1 = bool2;
                i = j;
                if (n != 0)
                {
                  i = j + 1;
                  a.add(new c.e(c.this.m, c.this.m));
                  bool1 = bool2;
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        localObject = new c.f((j)localObject);
        b = bool1;
        a.add(localObject);
        j = i;
        i = k;
        break;
        bool2 = false;
        break label386;
        if ((!bool1) && (((j)localObject).getIcon() != null))
        {
          bool1 = true;
          a(i, a.size());
          continue;
          b = false;
          return;
        }
      }
    }
    
    public final Bundle c()
    {
      Bundle localBundle = new Bundle();
      if (f != null) {
        localBundle.putInt("android:menu:checked", f.getItemId());
      }
      SparseArray localSparseArray = new SparseArray();
      int j = a.size();
      int i = 0;
      if (i < j)
      {
        Object localObject = (c.d)a.get(i);
        j localj;
        if ((localObject instanceof c.f))
        {
          localj = a;
          if (localj == null) {
            break label132;
          }
        }
        label132:
        for (localObject = localj.getActionView();; localObject = null)
        {
          if (localObject != null)
          {
            e locale = new e();
            ((View)localObject).saveHierarchyState(locale);
            localSparseArray.put(localj.getItemId(), locale);
          }
          i += 1;
          break;
        }
      }
      localBundle.putSparseParcelableArray("android:menu:action_views", localSparseArray);
      return localBundle;
    }
  }
  
  private static final class c
    implements c.d
  {}
  
  private static abstract interface d {}
  
  private static final class e
    implements c.d
  {
    final int a;
    final int b;
    
    public e(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
  }
  
  private static final class f
    implements c.d
  {
    final j a;
    boolean b;
    
    f(j paramj)
    {
      a = paramj;
    }
  }
  
  private static final class g
    extends c.j
  {
    public g(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, View.OnClickListener paramOnClickListener)
    {
      super();
      a.setOnClickListener(paramOnClickListener);
    }
  }
  
  private static final class h
    extends c.j
  {
    public h(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
    {
      super();
    }
  }
  
  private static final class i
    extends c.j
  {
    public i(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
    {
      super();
    }
  }
  
  private static abstract class j
    extends at.u
  {
    public j(View paramView)
    {
      super();
    }
  }
}


/* Location:              android/support/design/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */