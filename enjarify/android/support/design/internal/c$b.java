package android.support.design.internal;

import android.os.Bundle;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.widget.at.a;
import android.util.SparseArray;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;

public final class c$b
  extends at.a
{
  final ArrayList a;
  boolean b;
  private j f;
  
  public c$b(c paramc)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    a = localArrayList;
    b();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      c.f localf = (c.f)a.get(paramInt1);
      boolean bool = true;
      b = bool;
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
    j localj = f;
    boolean bool;
    if (localj != paramj)
    {
      bool = paramj.isCheckable();
      if (bool) {
        break label20;
      }
    }
    for (;;)
    {
      return;
      label20:
      localj = f;
      if (localj != null)
      {
        localj = f;
        localj.setChecked(false);
      }
      f = paramj;
      bool = true;
      paramj.setChecked(bool);
    }
  }
  
  public final int b(int paramInt)
  {
    Object localObject = (c.d)a.get(paramInt);
    boolean bool1 = localObject instanceof c.e;
    int i;
    if (bool1) {
      i = 2;
    }
    for (;;)
    {
      return i;
      bool1 = localObject instanceof c.c;
      if (bool1)
      {
        i = 3;
      }
      else
      {
        bool1 = localObject instanceof c.f;
        if (!bool1) {
          break;
        }
        localObject = a;
        boolean bool2 = ((j)localObject).hasSubMenu();
        if (bool2)
        {
          bool2 = true;
        }
        else
        {
          bool2 = false;
          localObject = null;
        }
      }
    }
    localObject = new java/lang/RuntimeException;
    ((RuntimeException)localObject).<init>("Unknown item type.");
    throw ((Throwable)localObject);
  }
  
  final void b()
  {
    boolean bool1 = b;
    if (bool1) {
      return;
    }
    b = true;
    a.clear();
    Object localObject1 = a;
    Object localObject2 = new android/support/design/internal/c$c;
    ((c.c)localObject2).<init>();
    ((ArrayList)localObject1).add(localObject2);
    int j = -1;
    int k = 0;
    c.e locale = null;
    int m = 0;
    float f1 = 0.0F;
    Object localObject3 = null;
    bool1 = false;
    localObject1 = null;
    localObject2 = c.c.h();
    int n = ((ArrayList)localObject2).size();
    int i1 = 0;
    float f2;
    Object localObject5;
    int i3;
    int i5;
    int i2;
    int i;
    for (;;)
    {
      if (i1 < n)
      {
        localObject1 = (j)c.c.h().get(i1);
        boolean bool2 = ((j)localObject1).isChecked();
        if (bool2) {
          a((j)localObject1);
        }
        bool2 = ((j)localObject1).isCheckable();
        if (bool2)
        {
          bool2 = false;
          f2 = 0.0F;
          localObject2 = null;
          ((j)localObject1).a(false);
        }
        bool2 = ((j)localObject1).hasSubMenu();
        Object localObject4;
        if (bool2)
        {
          localObject4 = ((j)localObject1).getSubMenu();
          bool2 = ((SubMenu)localObject4).hasVisibleItems();
          if (bool2)
          {
            if (i1 != 0)
            {
              localObject2 = a;
              localObject5 = new android/support/design/internal/c$e;
              localc1 = c;
              i3 = m;
              i4 = 0;
              ((c.e)localObject5).<init>(i3, 0);
              ((ArrayList)localObject2).add(localObject5);
            }
            localObject2 = a;
            localObject5 = new android/support/design/internal/c$f;
            ((c.f)localObject5).<init>((j)localObject1);
            ((ArrayList)localObject2).add(localObject5);
            i5 = 0;
            localObject5 = null;
            int i4 = a.size();
            bool2 = false;
            f2 = 0.0F;
            localObject2 = null;
            int i6 = ((SubMenu)localObject4).size();
            i3 = 0;
            c localc1 = null;
            while (i3 < i6)
            {
              localObject2 = (j)((SubMenu)localObject4).getItem(i3);
              boolean bool3 = ((j)localObject2).isVisible();
              if (bool3)
              {
                if (i5 == 0)
                {
                  localObject6 = ((j)localObject2).getIcon();
                  if (localObject6 != null) {
                    i5 = 1;
                  }
                }
                bool3 = ((j)localObject2).isCheckable();
                if (bool3)
                {
                  bool3 = false;
                  localObject6 = null;
                  ((j)localObject2).a(false);
                }
                bool3 = ((j)localObject1).isChecked();
                if (bool3) {
                  a((j)localObject1);
                }
                Object localObject6 = a;
                c.f localf = new android/support/design/internal/c$f;
                localf.<init>((j)localObject2);
                ((ArrayList)localObject6).add(localf);
              }
              i2 = i3 + 1;
              i3 = i2;
            }
            if (i5 != 0)
            {
              localObject1 = a;
              i = ((ArrayList)localObject1).size();
              a(i4, i);
            }
          }
          i = j;
          label438:
          i2 = i1 + 1;
          i1 = i2;
          j = i;
        }
        else
        {
          i3 = ((j)localObject1).getGroupId();
          if (i3 != j)
          {
            i5 = a.size();
            localObject2 = ((j)localObject1).getIcon();
            if (localObject2 != null)
            {
              i2 = 1;
              f2 = Float.MIN_VALUE;
              label492:
              if (i1 != 0)
              {
                i5 += 1;
                localObject3 = a;
                locale = new android/support/design/internal/c$e;
                c localc2 = c;
                j = m;
                localObject4 = c;
                int i7 = m;
                locale.<init>(j, i7);
                ((ArrayList)localObject3).add(locale);
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      localObject3 = new android/support/design/internal/c$f;
      ((c.f)localObject3).<init>((j)localObject1);
      b = i2;
      localObject1 = a;
      ((ArrayList)localObject1).add(localObject3);
      m = i2;
      f1 = f2;
      k = i5;
      i = i3;
      break label438;
      i2 = 0;
      f2 = 0.0F;
      localObject2 = null;
      break label492;
      if (m == 0)
      {
        localObject2 = ((j)localObject1).getIcon();
        if (localObject2 != null)
        {
          i2 = 1;
          f2 = Float.MIN_VALUE;
          localObject5 = a;
          i5 = ((ArrayList)localObject5).size();
          a(k, i5);
          i5 = k;
          continue;
          i = 0;
          localObject1 = null;
          b = false;
          break;
        }
      }
      i2 = m;
      f2 = f1;
      i5 = k;
    }
  }
  
  public final Bundle c()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject = f;
    if (localObject != null)
    {
      localObject = "android:menu:checked";
      localj1 = f;
      i = localj1.getItemId();
      localBundle.putInt((String)localObject, i);
    }
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    int j = 0;
    localObject = null;
    int k = a.size();
    int i = 0;
    j localj1 = null;
    if (i < k)
    {
      localObject = (c.d)a.get(i);
      boolean bool = localObject instanceof c.f;
      j localj2;
      if (bool)
      {
        localObject = (c.f)localObject;
        localj2 = a;
        if (localj2 == null) {
          break label170;
        }
      }
      for (localObject = localj2.getActionView();; localObject = null)
      {
        if (localObject != null)
        {
          e locale = new android/support/design/internal/e;
          locale.<init>();
          ((View)localObject).saveHierarchyState(locale);
          j = localj2.getItemId();
          localSparseArray.put(j, locale);
        }
        j = i + 1;
        i = j;
        break;
        label170:
        j = 0;
      }
    }
    localBundle.putSparseParcelableArray("android:menu:action_views", localSparseArray);
    return localBundle;
  }
}


/* Location:              android/support/design/internal/c$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */