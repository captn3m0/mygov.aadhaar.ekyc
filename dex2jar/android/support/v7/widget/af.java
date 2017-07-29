package android.support.v7.widget;

import android.support.v4.a.a;
import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.w;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class af
  extends az
{
  ArrayList<ArrayList<at.u>> a = new ArrayList();
  ArrayList<ArrayList<b>> b = new ArrayList();
  ArrayList<ArrayList<a>> c = new ArrayList();
  ArrayList<at.u> d = new ArrayList();
  ArrayList<at.u> e = new ArrayList();
  ArrayList<at.u> f = new ArrayList();
  ArrayList<at.u> g = new ArrayList();
  private ArrayList<at.u> n = new ArrayList();
  private ArrayList<at.u> o = new ArrayList();
  private ArrayList<b> p = new ArrayList();
  private ArrayList<a> q = new ArrayList();
  
  private void a(a parama)
  {
    if (a != null) {
      a(parama, a);
    }
    if (b != null) {
      a(parama, b);
    }
  }
  
  private static void a(List<at.u> paramList)
  {
    int i = paramList.size() - 1;
    while (i >= 0)
    {
      w.s(geta).a();
      i -= 1;
    }
  }
  
  private void a(List<a> paramList, at.u paramu)
  {
    int i = paramList.size() - 1;
    while (i >= 0)
    {
      a locala = (a)paramList.get(i);
      if ((a(locala, paramu)) && (a == null) && (b == null)) {
        paramList.remove(locala);
      }
      i -= 1;
    }
  }
  
  private boolean a(a parama, at.u paramu)
  {
    if (b == paramu) {
      b = null;
    }
    for (;;)
    {
      w.c(a, 1.0F);
      w.a(a, 0.0F);
      w.b(a, 0.0F);
      e(paramu);
      return true;
      if (a != paramu) {
        break;
      }
      a = null;
    }
    return false;
  }
  
  private void g(at.u paramu)
  {
    a.a(a);
    c(paramu);
  }
  
  public final void a()
  {
    int i;
    int j;
    label24:
    int k;
    if (!n.isEmpty())
    {
      i = 1;
      if (p.isEmpty()) {
        break label72;
      }
      j = 1;
      if (q.isEmpty()) {
        break label77;
      }
      k = 1;
      label36:
      if (o.isEmpty()) {
        break label82;
      }
    }
    label72:
    label77:
    label82:
    for (int m = 1;; m = 0)
    {
      if ((i != 0) || (j != 0) || (m != 0) || (k != 0)) {
        break label88;
      }
      return;
      i = 0;
      break;
      j = 0;
      break label24;
      k = 0;
      break label36;
    }
    label88:
    final Object localObject1 = n.iterator();
    final Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (at.u)((Iterator)localObject1).next();
      final ae localae = w.s(a);
      f.add(localObject2);
      localae.a(this.j).a(0.0F).a(new c()
      {
        public final void a(View paramAnonymousView) {}
        
        public final void b(View paramAnonymousView)
        {
          localae.a(null);
          w.c(paramAnonymousView, 1.0F);
          e(localObject2);
          f.remove(localObject2);
          c();
        }
      }).b();
    }
    n.clear();
    label260:
    label340:
    long l1;
    label415:
    long l2;
    if (j != 0)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(p);
      b.add(localObject1);
      p.clear();
      localObject2 = new Runnable()
      {
        public final void run()
        {
          Iterator localIterator = localObject1.iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (af.b)localIterator.next();
            af localaf = af.this;
            at.u localu = a;
            int k = b;
            int i = c;
            int m = d;
            int j = e;
            localObject = a;
            k = m - k;
            i = j - i;
            if (k != 0) {
              w.s((View)localObject).b(0.0F);
            }
            if (i != 0) {
              w.s((View)localObject).c(0.0F);
            }
            localObject = w.s((View)localObject);
            e.add(localu);
            ((ae)localObject).a(k).a(new af.6(localaf, localu, k, i, (ae)localObject)).b();
          }
          localObject1.clear();
          b.remove(localObject1);
        }
      };
      if (i != 0) {
        w.a(get0a.a, (Runnable)localObject2, this.j);
      }
    }
    else
    {
      if (k != 0)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(q);
        c.add(localObject1);
        q.clear();
        localObject2 = new Runnable()
        {
          public final void run()
          {
            Iterator localIterator = localObject1.iterator();
            if (localIterator.hasNext())
            {
              af.a locala = (af.a)localIterator.next();
              af localaf = af.this;
              Object localObject1 = a;
              if (localObject1 == null)
              {
                localObject1 = null;
                label46:
                localObject2 = b;
                if (localObject2 == null) {
                  break label223;
                }
              }
              label223:
              for (Object localObject2 = a;; localObject2 = null)
              {
                if (localObject1 != null)
                {
                  localObject1 = w.s((View)localObject1).a(l);
                  g.add(a);
                  ((ae)localObject1).b(e - c);
                  ((ae)localObject1).c(f - d);
                  ((ae)localObject1).a(0.0F).a(new af.7(localaf, locala, (ae)localObject1)).b();
                }
                if (localObject2 == null) {
                  break;
                }
                localObject1 = w.s((View)localObject2);
                g.add(b);
                ((ae)localObject1).b(0.0F).c(0.0F).a(l).a(1.0F).a(new af.8(localaf, locala, (ae)localObject1, (View)localObject2)).b();
                break;
                localObject1 = a;
                break label46;
              }
            }
            localObject1.clear();
            c.remove(localObject1);
          }
        };
        if (i == 0) {
          break label477;
        }
        w.a(get0a.a, (Runnable)localObject2, this.j);
      }
      if (m == 0) {
        break label485;
      }
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(o);
      a.add(localObject1);
      o.clear();
      localObject2 = new Runnable()
      {
        public final void run()
        {
          Iterator localIterator = localObject1.iterator();
          while (localIterator.hasNext())
          {
            at.u localu = (at.u)localIterator.next();
            af localaf = af.this;
            ae localae = w.s(a);
            d.add(localu);
            localae.a(1.0F).a(i).a(new af.5(localaf, localu, localae)).b();
          }
          localObject1.clear();
          localObject1.remove(localObject1);
        }
      };
      if ((i == 0) && (j == 0) && (k == 0)) {
        break label505;
      }
      if (i == 0) {
        break label487;
      }
      l1 = this.j;
      if (j == 0) {
        break label493;
      }
      l2 = this.k;
      label425:
      if (k == 0) {
        break label499;
      }
    }
    label477:
    label485:
    label487:
    label493:
    label499:
    for (long l3 = l;; l3 = 0L)
    {
      l2 = Math.max(l2, l3);
      w.a(get0a, (Runnable)localObject2, l1 + l2);
      return;
      ((Runnable)localObject2).run();
      break label260;
      ((Runnable)localObject2).run();
      break label340;
      break;
      l1 = 0L;
      break label415;
      l2 = 0L;
      break label425;
    }
    label505:
    ((Runnable)localObject2).run();
  }
  
  public final boolean a(at.u paramu)
  {
    g(paramu);
    n.add(paramu);
    return true;
  }
  
  public final boolean a(at.u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = a;
    paramInt1 = (int)(paramInt1 + w.n(a));
    paramInt2 = (int)(paramInt2 + w.o(a));
    g(paramu);
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    if ((i == 0) && (j == 0))
    {
      e(paramu);
      return false;
    }
    if (i != 0) {
      w.a(localView, -i);
    }
    if (j != 0) {
      w.b(localView, -j);
    }
    p.add(new b(paramu, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public final boolean a(at.u paramu1, at.u paramu2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramu1 == paramu2) {
      return a(paramu1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    float f1 = w.n(a);
    float f2 = w.o(a);
    float f3 = w.e(a);
    g(paramu1);
    int i = (int)(paramInt3 - paramInt1 - f1);
    int j = (int)(paramInt4 - paramInt2 - f2);
    w.a(a, f1);
    w.b(a, f2);
    w.c(a, f3);
    if (paramu2 != null)
    {
      g(paramu2);
      w.a(a, -i);
      w.b(a, -j);
      w.c(a, 0.0F);
    }
    q.add(new a(paramu1, paramu2, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public final boolean a(at.u paramu, List<Object> paramList)
  {
    return (!paramList.isEmpty()) || (super.a(paramu, paramList));
  }
  
  public final boolean b()
  {
    return (!o.isEmpty()) || (!q.isEmpty()) || (!p.isEmpty()) || (!n.isEmpty()) || (!e.isEmpty()) || (!f.isEmpty()) || (!d.isEmpty()) || (!g.isEmpty()) || (!b.isEmpty()) || (!a.isEmpty()) || (!c.isEmpty());
  }
  
  public final boolean b(at.u paramu)
  {
    g(paramu);
    w.c(a, 0.0F);
    o.add(paramu);
    return true;
  }
  
  final void c()
  {
    if (!b()) {
      e();
    }
  }
  
  public final void c(at.u paramu)
  {
    View localView = a;
    w.s(localView).a();
    int i = p.size() - 1;
    while (i >= 0)
    {
      if (p.get(i)).a == paramu)
      {
        w.b(localView, 0.0F);
        w.a(localView, 0.0F);
        e(paramu);
        p.remove(i);
      }
      i -= 1;
    }
    a(q, paramu);
    if (n.remove(paramu))
    {
      w.c(localView, 1.0F);
      e(paramu);
    }
    if (o.remove(paramu))
    {
      w.c(localView, 1.0F);
      e(paramu);
    }
    i = c.size() - 1;
    ArrayList localArrayList;
    while (i >= 0)
    {
      localArrayList = (ArrayList)c.get(i);
      a(localArrayList, paramu);
      if (localArrayList.isEmpty()) {
        c.remove(i);
      }
      i -= 1;
    }
    i = b.size() - 1;
    if (i >= 0)
    {
      localArrayList = (ArrayList)b.get(i);
      int j = localArrayList.size() - 1;
      for (;;)
      {
        if (j >= 0)
        {
          if (geta != paramu) {
            break label293;
          }
          w.b(localView, 0.0F);
          w.a(localView, 0.0F);
          e(paramu);
          localArrayList.remove(j);
          if (localArrayList.isEmpty()) {
            b.remove(i);
          }
        }
        i -= 1;
        break;
        label293:
        j -= 1;
      }
    }
    i = a.size() - 1;
    while (i >= 0)
    {
      localArrayList = (ArrayList)a.get(i);
      if (localArrayList.remove(paramu))
      {
        w.c(localView, 1.0F);
        e(paramu);
        if (localArrayList.isEmpty()) {
          a.remove(i);
        }
      }
      i -= 1;
    }
    f.remove(paramu);
    d.remove(paramu);
    g.remove(paramu);
    e.remove(paramu);
    c();
  }
  
  public final void d()
  {
    int i = p.size() - 1;
    Object localObject1;
    Object localObject2;
    while (i >= 0)
    {
      localObject1 = (b)p.get(i);
      localObject2 = a.a;
      w.b((View)localObject2, 0.0F);
      w.a((View)localObject2, 0.0F);
      e(a);
      p.remove(i);
      i -= 1;
    }
    i = n.size() - 1;
    while (i >= 0)
    {
      e((at.u)n.get(i));
      n.remove(i);
      i -= 1;
    }
    i = o.size() - 1;
    while (i >= 0)
    {
      localObject1 = (at.u)o.get(i);
      w.c(a, 1.0F);
      e((at.u)localObject1);
      o.remove(i);
      i -= 1;
    }
    i = q.size() - 1;
    while (i >= 0)
    {
      a((a)q.get(i));
      i -= 1;
    }
    q.clear();
    if (!b()) {
      return;
    }
    i = b.size() - 1;
    int j;
    while (i >= 0)
    {
      localObject1 = (ArrayList)b.get(i);
      j = ((ArrayList)localObject1).size() - 1;
      while (j >= 0)
      {
        localObject2 = (b)((ArrayList)localObject1).get(j);
        View localView = a.a;
        w.b(localView, 0.0F);
        w.a(localView, 0.0F);
        e(a);
        ((ArrayList)localObject1).remove(j);
        if (((ArrayList)localObject1).isEmpty()) {
          b.remove(localObject1);
        }
        j -= 1;
      }
      i -= 1;
    }
    i = a.size() - 1;
    while (i >= 0)
    {
      localObject1 = (ArrayList)a.get(i);
      j = ((ArrayList)localObject1).size() - 1;
      while (j >= 0)
      {
        localObject2 = (at.u)((ArrayList)localObject1).get(j);
        w.c(a, 1.0F);
        e((at.u)localObject2);
        ((ArrayList)localObject1).remove(j);
        if (((ArrayList)localObject1).isEmpty()) {
          a.remove(localObject1);
        }
        j -= 1;
      }
      i -= 1;
    }
    i = c.size() - 1;
    while (i >= 0)
    {
      localObject1 = (ArrayList)c.get(i);
      j = ((ArrayList)localObject1).size() - 1;
      while (j >= 0)
      {
        a((a)((ArrayList)localObject1).get(j));
        if (((ArrayList)localObject1).isEmpty()) {
          c.remove(localObject1);
        }
        j -= 1;
      }
      i -= 1;
    }
    a(f);
    a(e);
    a(d);
    a(g);
    e();
  }
  
  private static final class a
  {
    public at.u a;
    public at.u b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    private a(at.u paramu1, at.u paramu2)
    {
      a = paramu1;
      b = paramu2;
    }
    
    a(at.u paramu1, at.u paramu2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this(paramu1, paramu2);
      c = paramInt1;
      d = paramInt2;
      e = paramInt3;
      f = paramInt4;
    }
    
    public final String toString()
    {
      return "ChangeInfo{oldHolder=" + a + ", newHolder=" + b + ", fromX=" + c + ", fromY=" + d + ", toX=" + e + ", toY=" + f + '}';
    }
  }
  
  private static final class b
  {
    public at.u a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    b(at.u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      a = paramu;
      b = paramInt1;
      c = paramInt2;
      d = paramInt3;
      e = paramInt4;
    }
  }
  
  private static class c
    implements ai
  {
    public void a(View paramView) {}
    
    public void b(View paramView) {}
    
    public void c(View paramView) {}
  }
}


/* Location:              android/support/v7/widget/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */