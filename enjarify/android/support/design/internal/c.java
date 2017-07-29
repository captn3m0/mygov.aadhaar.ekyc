package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.a.c;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;
import android.support.v7.widget.at.a;
import android.support.v7.widget.at.b;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class c
  implements o
{
  public NavigationMenuView a;
  public LinearLayout b;
  h c;
  public int d;
  public c.b e;
  public LayoutInflater f;
  int g;
  boolean h;
  public ColorStateList i;
  public ColorStateList j;
  public Drawable k;
  public int l;
  int m;
  final View.OnClickListener n;
  private o.a o;
  
  public c()
  {
    c.1 local1 = new android/support/design/internal/c$1;
    local1.<init>(this);
    n = local1;
  }
  
  public final void a(int paramInt)
  {
    g = paramInt;
    h = true;
    a(false);
  }
  
  public final void a(Context paramContext, h paramh)
  {
    Object localObject = LayoutInflater.from(paramContext);
    f = ((LayoutInflater)localObject);
    c = paramh;
    localObject = paramContext.getResources();
    int i1 = a.c.design_navigation_separator_vertical_padding;
    int i2 = ((Resources)localObject).getDimensionPixelOffset(i1);
    m = i2;
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
    int i1 = 0;
    LinearLayout localLinearLayout = null;
    boolean bool1 = paramParcelable instanceof Bundle;
    if (bool1)
    {
      paramParcelable = (Bundle)paramParcelable;
      Object localObject1 = paramParcelable.getSparseParcelableArray("android:menu:list");
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = a;
        ((NavigationMenuView)localObject2).restoreHierarchyState((SparseArray)localObject1);
      }
      localObject1 = "android:menu:adapter";
      Bundle localBundle = paramParcelable.getBundle((String)localObject1);
      if (localBundle != null)
      {
        c.b localb = e;
        localObject1 = "android:menu:checked";
        int i3 = localBundle.getInt((String)localObject1, 0);
        int i4;
        int i5;
        if (i3 != 0)
        {
          bool1 = true;
          b = bool1;
          localObject1 = a;
          i4 = ((ArrayList)localObject1).size();
          i5 = 0;
          localObject2 = null;
        }
        for (;;)
        {
          if (i5 < i4)
          {
            localObject1 = (c.d)a.get(i5);
            boolean bool3 = localObject1 instanceof c.f;
            if (bool3)
            {
              localObject1 = a;
              if (localObject1 != null)
              {
                int i6 = ((j)localObject1).getItemId();
                if (i6 == i3) {
                  localb.a((j)localObject1);
                }
              }
            }
          }
          else
          {
            b = false;
            localb.b();
            localObject1 = "android:menu:action_views";
            localObject2 = localBundle.getSparseParcelableArray((String)localObject1);
            if (localObject2 == null) {
              break;
            }
            localObject1 = a;
            int i7 = ((ArrayList)localObject1).size();
            while (i1 < i7)
            {
              localObject1 = (c.d)a.get(i1);
              boolean bool2 = localObject1 instanceof c.f;
              if (bool2)
              {
                localObject1 = a;
                if (localObject1 != null)
                {
                  View localView = ((j)localObject1).getActionView();
                  if (localView != null)
                  {
                    i2 = ((j)localObject1).getItemId();
                    localObject1 = (e)((SparseArray)localObject2).get(i2);
                    if (localObject1 != null) {
                      localView.restoreHierarchyState((SparseArray)localObject1);
                    }
                  }
                }
              }
              i2 = i1 + 1;
              i1 = i2;
            }
          }
          int i2 = i5 + 1;
          i5 = i2;
        }
      }
      localObject1 = paramParcelable.getSparseParcelableArray("android:menu:header");
      if (localObject1 != null)
      {
        localLinearLayout = b;
        localLinearLayout.restoreHierarchyState((SparseArray)localObject1);
      }
    }
  }
  
  public final void a(h paramh, boolean paramBoolean)
  {
    o.a locala = o;
    if (locala != null)
    {
      locala = o;
      locala.a(paramh, paramBoolean);
    }
  }
  
  public final void a(o.a parama)
  {
    o = parama;
  }
  
  public final void a(boolean paramBoolean)
  {
    Object localObject = e;
    if (localObject != null)
    {
      localObject = e;
      ((c.b)localObject).b();
      localObject = d;
      ((at.b)localObject).a();
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
    c.b localb = e;
    if (localb != null)
    {
      localb = e;
      b = paramBoolean;
    }
  }
  
  public final boolean b(j paramj)
  {
    return false;
  }
  
  public final Parcelable c()
  {
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 11;
    Bundle localBundle;
    if (i1 >= i2)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      Object localObject1 = a;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject1 = new android/util/SparseArray;
        ((SparseArray)localObject1).<init>();
        a.saveHierarchyState((SparseArray)localObject1);
        localObject2 = "android:menu:list";
        localBundle.putSparseParcelableArray((String)localObject2, (SparseArray)localObject1);
      }
      localObject1 = e;
      if (localObject1 != null)
      {
        localObject1 = "android:menu:adapter";
        localObject2 = e.c();
        localBundle.putBundle((String)localObject1, (Bundle)localObject2);
      }
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject1 = new android/util/SparseArray;
        ((SparseArray)localObject1).<init>();
        b.saveHierarchyState((SparseArray)localObject1);
        localObject2 = "android:menu:header";
        localBundle.putSparseParcelableArray((String)localObject2, (SparseArray)localObject1);
      }
    }
    for (;;)
    {
      return localBundle;
      i1 = 0;
      localBundle = null;
    }
  }
}


/* Location:              android/support/design/internal/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */