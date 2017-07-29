package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.h.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b
  implements o
{
  protected Context a;
  protected Context b;
  protected h c;
  protected LayoutInflater d;
  protected LayoutInflater e;
  public o.a f;
  protected p g;
  public int h;
  private int i;
  private int j;
  
  public b(Context paramContext, int paramInt1, int paramInt2)
  {
    a = paramContext;
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    d = localLayoutInflater;
    i = paramInt1;
    j = paramInt2;
  }
  
  public p a(ViewGroup paramViewGroup)
  {
    Object localObject = g;
    if (localObject == null)
    {
      localObject = d;
      int k = i;
      localObject = (p)((LayoutInflater)localObject).inflate(k, paramViewGroup, false);
      g = ((p)localObject);
      localObject = g;
      h localh = c;
      ((p)localObject).a(localh);
      boolean bool = true;
      a(bool);
    }
    return g;
  }
  
  public View a(j paramj, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = paramView instanceof p.a;
    if (bool) {
      paramView = (p.a)paramView;
    }
    int k;
    for (Object localObject = paramView;; localObject = (p.a)((LayoutInflater)localObject).inflate(k, paramViewGroup, false))
    {
      a(paramj, (p.a)localObject);
      return (View)localObject;
      localObject = d;
      k = j;
    }
  }
  
  public void a(Context paramContext, h paramh)
  {
    b = paramContext;
    LayoutInflater localLayoutInflater = LayoutInflater.from(b);
    e = localLayoutInflater;
    c = paramh;
  }
  
  public void a(h paramh, boolean paramBoolean)
  {
    o.a locala = f;
    if (locala != null)
    {
      locala = f;
      locala.a(paramh, paramBoolean);
    }
  }
  
  public abstract void a(j paramj, p.a parama);
  
  public final void a(o.a parama)
  {
    f = parama;
  }
  
  public void a(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)g;
    if (localViewGroup == null) {
      return;
    }
    Object localObject1 = c;
    int n;
    int i2;
    if (localObject1 != null)
    {
      c.i();
      localObject1 = c;
      ArrayList localArrayList = ((h)localObject1).h();
      int k = localArrayList.size();
      int m = 0;
      n = 0;
      if (m < k)
      {
        localObject1 = (j)localArrayList.get(m);
        boolean bool1 = c((j)localObject1);
        if (!bool1) {
          break label259;
        }
        View localView1 = localViewGroup.getChildAt(n);
        bool1 = localView1 instanceof p.a;
        if (bool1) {
          localObject2 = localView1;
        }
        for (Object localObject2 = ((p.a)localView1).getItemData();; localObject2 = null)
        {
          View localView2 = a((j)localObject1, (View)localView1, localViewGroup);
          if (localObject1 != localObject2)
          {
            localView2.setPressed(false);
            w.y(localView2);
          }
          if (localView2 != localView1)
          {
            localObject1 = (ViewGroup)localView2.getParent();
            if (localObject1 != null) {
              ((ViewGroup)localObject1).removeView(localView2);
            }
            localObject1 = (ViewGroup)g;
            ((ViewGroup)localObject1).addView(localView2, n);
          }
          i2 = n + 1;
          label197:
          int i1 = m + 1;
          m = i1;
          n = i2;
          break;
          i1 = 0;
        }
      }
    }
    for (;;)
    {
      i2 = localViewGroup.getChildCount();
      if (n >= i2) {
        break;
      }
      boolean bool2 = a(localViewGroup, n);
      if (!bool2)
      {
        n += 1;
        continue;
        label259:
        bool2 = n;
        break label197;
        n = 0;
      }
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public final boolean a(j paramj)
  {
    return false;
  }
  
  public boolean a(u paramu)
  {
    o.a locala = f;
    boolean bool;
    if (locala != null)
    {
      locala = f;
      bool = locala.a(paramu);
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
  
  public boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public final int b()
  {
    return h;
  }
  
  public final boolean b(j paramj)
  {
    return false;
  }
  
  public boolean c(j paramj)
  {
    return true;
  }
}


/* Location:              android/support/v7/view/menu/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */