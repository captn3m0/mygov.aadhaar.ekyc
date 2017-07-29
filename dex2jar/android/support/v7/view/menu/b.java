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
    d = LayoutInflater.from(paramContext);
    i = paramInt1;
    j = paramInt2;
  }
  
  public p a(ViewGroup paramViewGroup)
  {
    if (g == null)
    {
      g = ((p)d.inflate(i, paramViewGroup, false));
      g.a(c);
      a(true);
    }
    return g;
  }
  
  public View a(j paramj, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof p.a)) {}
    for (paramView = (p.a)paramView;; paramView = (p.a)d.inflate(j, paramViewGroup, false))
    {
      a(paramj, paramView);
      return (View)paramView;
    }
  }
  
  public void a(Context paramContext, h paramh)
  {
    b = paramContext;
    e = LayoutInflater.from(b);
    c = paramh;
  }
  
  public void a(h paramh, boolean paramBoolean)
  {
    if (f != null) {
      f.a(paramh, paramBoolean);
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
    if (localViewGroup == null) {}
    label225:
    label231:
    for (;;)
    {
      return;
      int m;
      if (c != null)
      {
        c.i();
        ArrayList localArrayList = c.h();
        int i1 = localArrayList.size();
        int n = 0;
        int k = 0;
        m = k;
        if (n < i1)
        {
          j localj = (j)localArrayList.get(n);
          if (!c(localj)) {
            break label225;
          }
          View localView1 = localViewGroup.getChildAt(k);
          if ((localView1 instanceof p.a)) {}
          for (Object localObject = ((p.a)localView1).getItemData();; localObject = null)
          {
            View localView2 = a(localj, localView1, localViewGroup);
            if (localj != localObject)
            {
              localView2.setPressed(false);
              w.y(localView2);
            }
            if (localView2 != localView1)
            {
              localObject = (ViewGroup)localView2.getParent();
              if (localObject != null) {
                ((ViewGroup)localObject).removeView(localView2);
              }
              ((ViewGroup)g).addView(localView2, k);
            }
            k += 1;
            n += 1;
            break;
          }
        }
      }
      for (;;)
      {
        if (m >= localViewGroup.getChildCount()) {
          break label231;
        }
        if (!a(localViewGroup, m))
        {
          m += 1;
          continue;
          break;
          m = 0;
        }
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
    if (f != null) {
      return f.a(paramu);
    }
    return false;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */