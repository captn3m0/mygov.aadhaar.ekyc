package android.support.v7.widget;

import android.support.v4.a.a;
import android.support.v4.h.ae;
import android.support.v4.h.w;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class af
  extends az
{
  ArrayList a;
  ArrayList b;
  ArrayList c;
  ArrayList d;
  ArrayList e;
  ArrayList f;
  ArrayList g;
  private ArrayList n;
  private ArrayList o;
  private ArrayList p;
  private ArrayList q;
  
  public af()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    n = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    o = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    p = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    q = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    a = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    b = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    c = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    d = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    e = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    f = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    g = localArrayList;
  }
  
  private void a(af.a parama)
  {
    at.u localu = a;
    if (localu != null)
    {
      localu = a;
      a(parama, localu);
    }
    localu = b;
    if (localu != null)
    {
      localu = b;
      a(parama, localu);
    }
  }
  
  private static void a(List paramList)
  {
    int i = paramList.size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      ae localae = w.s(geta);
      localae.a();
      i = j + -1;
    }
  }
  
  private void a(List paramList, at.u paramu)
  {
    int i = paramList.size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      af.a locala = (af.a)paramList.get(j);
      boolean bool = a(locala, paramu);
      if (bool)
      {
        at.u localu = a;
        if (localu == null)
        {
          localu = b;
          if (localu == null) {
            paramList.remove(locala);
          }
        }
      }
      i = j + -1;
    }
  }
  
  private boolean a(af.a parama, at.u paramu)
  {
    float f1 = 0.0F;
    Object localObject = b;
    boolean bool;
    if (localObject == paramu)
    {
      b = null;
      localObject = a;
      f1 = 1.0F;
      w.c((View)localObject, f1);
      w.a(a, 0.0F);
      localObject = a;
      w.b((View)localObject, 0.0F);
      e(paramu);
      bool = true;
    }
    for (;;)
    {
      return bool;
      localObject = a;
      if (localObject == paramu)
      {
        a = null;
        break;
      }
      bool = false;
      localObject = null;
    }
  }
  
  private void g(at.u paramu)
  {
    a.a(a);
    c(paramu);
  }
  
  public final void a()
  {
    long l1 = 0L;
    boolean bool1 = true;
    ArrayList localArrayList1 = n;
    boolean bool2 = localArrayList1.isEmpty();
    ArrayList localArrayList2;
    boolean bool3;
    label46:
    ArrayList localArrayList3;
    boolean bool4;
    label67:
    ArrayList localArrayList4;
    boolean bool5;
    if (!bool2)
    {
      bool2 = bool1;
      localArrayList2 = p;
      bool3 = localArrayList2.isEmpty();
      if (bool3) {
        break label118;
      }
      bool3 = bool1;
      localArrayList3 = q;
      bool4 = localArrayList3.isEmpty();
      if (bool4) {
        break label127;
      }
      bool4 = bool1;
      localArrayList4 = o;
      bool5 = localArrayList4.isEmpty();
      if (bool5) {
        break label136;
      }
      bool5 = bool1;
      label88:
      if ((bool2) || (bool3) || (bool5) || (bool4)) {
        break label145;
      }
    }
    for (;;)
    {
      return;
      bool2 = false;
      localArrayList1 = null;
      break;
      label118:
      bool3 = false;
      localArrayList2 = null;
      break label46;
      label127:
      bool4 = false;
      localArrayList3 = null;
      break label67;
      label136:
      bool5 = false;
      localArrayList4 = null;
      break label88;
      label145:
      Object localObject1 = n;
      Object localObject2 = ((ArrayList)localObject1).iterator();
      long l2;
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (at.u)((Iterator)localObject2).next();
        ae localae1 = w.s(a);
        f.add(localObject1);
        l2 = j;
        ae localae2 = localae1.a(l2).a(0.0F);
        af.4 local4 = new android/support/v7/widget/af$4;
        local4.<init>(this, (at.u)localObject1, localae1);
        localObject1 = localae2.a(local4);
        ((ae)localObject1).b();
      }
      localObject1 = n;
      ((ArrayList)localObject1).clear();
      label360:
      label456:
      af.3 local3;
      label549:
      long l4;
      if (bool3)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localObject2 = p;
        ((ArrayList)localObject1).addAll((Collection)localObject2);
        b.add(localObject1);
        p.clear();
        localObject2 = new android/support/v7/widget/af$1;
        ((af.1)localObject2).<init>(this, (ArrayList)localObject1);
        if (bool2)
        {
          localObject1 = get0a.a;
          l2 = j;
          w.a((View)localObject1, (Runnable)localObject2, l2);
        }
      }
      else
      {
        if (bool4)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject2 = q;
          ((ArrayList)localObject1).addAll((Collection)localObject2);
          c.add(localObject1);
          q.clear();
          localObject2 = new android/support/v7/widget/af$2;
          ((af.2)localObject2).<init>(this, (ArrayList)localObject1);
          if (!bool2) {
            break label625;
          }
          localObject1 = get0a.a;
          l2 = j;
          w.a((View)localObject1, (Runnable)localObject2, l2);
        }
        if (!bool5) {
          break label633;
        }
        localArrayList4 = new java/util/ArrayList;
        localArrayList4.<init>();
        localObject1 = o;
        localArrayList4.addAll((Collection)localObject1);
        a.add(localArrayList4);
        localObject1 = o;
        ((ArrayList)localObject1).clear();
        local3 = new android/support/v7/widget/af$3;
        local3.<init>(this, localArrayList4);
        if ((!bool2) && (!bool3) && (!bool4)) {
          break label653;
        }
        if (!bool2) {
          break label635;
        }
        l3 = j;
        l2 = l3;
        if (!bool3) {
          break label641;
        }
        l3 = k;
        l4 = l3;
        label564:
        if (!bool4) {
          break label647;
        }
      }
      label625:
      label633:
      label635:
      label641:
      label647:
      for (long l3 = l;; l3 = l1)
      {
        l3 = Math.max(l4, l3);
        l1 = l2 + l3;
        localObject1 = get0a;
        w.a((View)localObject1, local3, l1);
        break;
        ((Runnable)localObject2).run();
        break label360;
        ((Runnable)localObject2).run();
        break label456;
        break;
        l2 = l1;
        break label549;
        l4 = l1;
        break label564;
      }
      label653:
      local3.run();
    }
  }
  
  public final boolean a(at.u paramu)
  {
    g(paramu);
    n.add(paramu);
    return true;
  }
  
  public final boolean a(at.u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = a;
    float f1 = paramInt1;
    View localView1 = a;
    float f2 = w.n(localView1);
    int i = (int)(f1 + f2);
    f1 = paramInt2;
    View localView2 = a;
    float f3 = w.o(localView2);
    f1 += f3;
    int j = (int)f1;
    g(paramu);
    int k = paramInt3 - i;
    int m = paramInt4 - j;
    boolean bool;
    if ((k == 0) && (m == 0))
    {
      e(paramu);
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      if (k != 0)
      {
        k = -k;
        f1 = k;
        w.a((View)localObject, f1);
      }
      if (m != 0)
      {
        k = -m;
        f1 = k;
        w.b((View)localObject, f1);
      }
      ArrayList localArrayList = p;
      localObject = new android/support/v7/widget/af$b;
      m = paramInt3;
      ((af.b)localObject).<init>(paramu, i, j, paramInt3, paramInt4);
      localArrayList.add(localObject);
      bool = true;
    }
  }
  
  public final boolean a(at.u paramu1, at.u paramu2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1;
    Object localObject2;
    int i;
    int j;
    boolean bool;
    if (paramu1 == paramu2)
    {
      localObject1 = this;
      localObject2 = paramu1;
      i = paramInt2;
      j = paramInt3;
      bool = a(paramu1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    for (;;)
    {
      return bool;
      float f1 = w.n(a);
      localObject2 = a;
      float f2 = w.o((View)localObject2);
      Object localObject3 = a;
      float f3 = w.e((View)localObject3);
      g(paramu1);
      float f4 = paramInt3 - paramInt1 - f1;
      i = (int)f4;
      float f5 = paramInt4 - paramInt2 - f2;
      j = (int)f5;
      View localView = a;
      w.a(localView, f1);
      w.b(a, f2);
      localObject1 = a;
      w.c((View)localObject1, f3);
      if (paramu2 != null)
      {
        g(paramu2);
        localObject1 = a;
        f2 = -i;
        w.a((View)localObject1, f2);
        localObject1 = a;
        f2 = -j;
        w.b((View)localObject1, f2);
        localObject1 = a;
        f2 = 0.0F;
        localObject2 = null;
        w.c((View)localObject1, 0.0F);
      }
      ArrayList localArrayList = q;
      localObject1 = new android/support/v7/widget/af$a;
      localObject2 = paramu1;
      localObject3 = paramu2;
      i = paramInt1;
      j = paramInt2;
      ((af.a)localObject1).<init>(paramu1, paramu2, paramInt1, paramInt2, paramInt3, paramInt4);
      localArrayList.add(localObject1);
      bool = true;
      f1 = Float.MIN_VALUE;
    }
  }
  
  public final boolean a(at.u paramu, List paramList)
  {
    boolean bool = paramList.isEmpty();
    if (bool)
    {
      bool = super.a(paramu, paramList);
      if (!bool) {
        break label26;
      }
    }
    label26:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean b()
  {
    ArrayList localArrayList = o;
    boolean bool = localArrayList.isEmpty();
    if (bool)
    {
      localArrayList = q;
      bool = localArrayList.isEmpty();
      if (bool)
      {
        localArrayList = p;
        bool = localArrayList.isEmpty();
        if (bool)
        {
          localArrayList = n;
          bool = localArrayList.isEmpty();
          if (bool)
          {
            localArrayList = e;
            bool = localArrayList.isEmpty();
            if (bool)
            {
              localArrayList = f;
              bool = localArrayList.isEmpty();
              if (bool)
              {
                localArrayList = d;
                bool = localArrayList.isEmpty();
                if (bool)
                {
                  localArrayList = g;
                  bool = localArrayList.isEmpty();
                  if (bool)
                  {
                    localArrayList = b;
                    bool = localArrayList.isEmpty();
                    if (bool)
                    {
                      localArrayList = a;
                      bool = localArrayList.isEmpty();
                      if (bool)
                      {
                        localArrayList = c;
                        bool = localArrayList.isEmpty();
                        if (bool) {
                          break label158;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    bool = true;
    for (;;)
    {
      return bool;
      label158:
      bool = false;
      localArrayList = null;
    }
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
    boolean bool = b();
    if (!bool) {
      e();
    }
  }
  
  public final void c(at.u paramu)
  {
    float f1 = 1.0F;
    View localView = a;
    w.s(localView).a();
    Object localObject = p;
    int i = ((ArrayList)localObject).size() + -1;
    for (int i2 = i; i2 >= 0; i2 = i)
    {
      localObject = p.get(i2)).a;
      if (localObject == paramu)
      {
        w.b(localView, 0.0F);
        w.a(localView, 0.0F);
        e(paramu);
        localObject = p;
        ((ArrayList)localObject).remove(i2);
      }
      i = i2 + -1;
    }
    localObject = q;
    a((List)localObject, paramu);
    localObject = n;
    boolean bool1 = ((ArrayList)localObject).remove(paramu);
    if (bool1)
    {
      w.c(localView, f1);
      e(paramu);
    }
    localObject = o;
    bool1 = ((ArrayList)localObject).remove(paramu);
    if (bool1)
    {
      w.c(localView, f1);
      e(paramu);
    }
    localObject = c;
    int j = ((ArrayList)localObject).size() + -1;
    for (i2 = j; i2 >= 0; i2 = k)
    {
      localObject = (ArrayList)c.get(i2);
      a((List)localObject, paramu);
      boolean bool2 = ((ArrayList)localObject).isEmpty();
      if (bool2)
      {
        localObject = c;
        ((ArrayList)localObject).remove(i2);
      }
      k = i2 + -1;
    }
    localObject = b;
    int k = ((ArrayList)localObject).size() + -1;
    int i3 = k;
    if (i3 >= 0)
    {
      localObject = (ArrayList)b.get(i3);
      i2 = ((ArrayList)localObject).size() + -1;
      for (int i4 = i2;; i4 = i2)
      {
        if (i4 >= 0)
        {
          at.u localu = geta;
          if (localu != paramu) {
            break label398;
          }
          w.b(localView, 0.0F);
          w.a(localView, 0.0F);
          e(paramu);
          ((ArrayList)localObject).remove(i4);
          boolean bool3 = ((ArrayList)localObject).isEmpty();
          if (bool3)
          {
            localObject = b;
            ((ArrayList)localObject).remove(i3);
          }
        }
        m = i3 + -1;
        i3 = m;
        break;
        label398:
        i2 = i4 + -1;
      }
    }
    localObject = a;
    int m = ((ArrayList)localObject).size() + -1;
    int i1;
    for (i2 = m; i2 >= 0; i2 = i1)
    {
      localObject = (ArrayList)a.get(i2);
      boolean bool5 = ((ArrayList)localObject).remove(paramu);
      if (bool5)
      {
        w.c(localView, f1);
        e(paramu);
        boolean bool4 = ((ArrayList)localObject).isEmpty();
        if (bool4)
        {
          localObject = a;
          ((ArrayList)localObject).remove(i2);
        }
      }
      i1 = i2 + -1;
    }
    f.remove(paramu);
    d.remove(paramu);
    g.remove(paramu);
    e.remove(paramu);
    c();
  }
  
  public final void d()
  {
    float f1 = 1.0F;
    Object localObject1 = p;
    int i = ((ArrayList)localObject1).size() + -1;
    View localView1;
    for (int k = i; k >= 0; k = i)
    {
      localObject1 = (af.b)p.get(k);
      localView1 = a.a;
      w.b(localView1, 0.0F);
      w.a(localView1, 0.0F);
      localObject1 = a;
      e((at.u)localObject1);
      localObject1 = p;
      ((ArrayList)localObject1).remove(k);
      i = k + -1;
    }
    localObject1 = n;
    i = ((ArrayList)localObject1).size() + -1;
    for (k = i; k >= 0; k = i)
    {
      localObject1 = (at.u)n.get(k);
      e((at.u)localObject1);
      localObject1 = n;
      ((ArrayList)localObject1).remove(k);
      i = k + -1;
    }
    localObject1 = o;
    i = ((ArrayList)localObject1).size() + -1;
    for (k = i; k >= 0; k = i)
    {
      localObject1 = (at.u)o.get(k);
      localView1 = a;
      w.c(localView1, f1);
      e((at.u)localObject1);
      localObject1 = o;
      ((ArrayList)localObject1).remove(k);
      i = k + -1;
    }
    localObject1 = q;
    i = ((ArrayList)localObject1).size() + -1;
    for (k = i; k >= 0; k = i)
    {
      localObject1 = (af.a)q.get(k);
      a((af.a)localObject1);
      i = k + -1;
    }
    localObject1 = q;
    ((ArrayList)localObject1).clear();
    boolean bool1 = b();
    if (!bool1) {}
    for (;;)
    {
      return;
      localObject1 = b;
      int j = ((ArrayList)localObject1).size() + -1;
      int i4;
      Object localObject2;
      View localView2;
      int m;
      for (int i3 = j; i3 >= 0; i3 = j)
      {
        localObject1 = (ArrayList)b.get(i3);
        k = ((ArrayList)localObject1).size() + -1;
        for (i4 = k; i4 >= 0; i4 = m)
        {
          localObject2 = (af.b)((ArrayList)localObject1).get(i4);
          localView2 = a.a;
          w.b(localView2, 0.0F);
          w.a(localView2, 0.0F);
          localObject2 = a;
          e((at.u)localObject2);
          ((ArrayList)localObject1).remove(i4);
          boolean bool2 = ((ArrayList)localObject1).isEmpty();
          if (bool2)
          {
            localObject2 = b;
            ((ArrayList)localObject2).remove(localObject1);
          }
          m = i4 + -1;
        }
        j = i3 + -1;
      }
      localObject1 = a;
      j = ((ArrayList)localObject1).size() + -1;
      int i1;
      for (i3 = j; i3 >= 0; i3 = j)
      {
        localObject1 = (ArrayList)a.get(i3);
        m = ((ArrayList)localObject1).size() + -1;
        for (i4 = m; i4 >= 0; i4 = i1)
        {
          localObject2 = (at.u)((ArrayList)localObject1).get(i4);
          localView2 = a;
          w.c(localView2, f1);
          e((at.u)localObject2);
          ((ArrayList)localObject1).remove(i4);
          boolean bool3 = ((ArrayList)localObject1).isEmpty();
          if (bool3)
          {
            localObject2 = a;
            ((ArrayList)localObject2).remove(localObject1);
          }
          i1 = i4 + -1;
        }
        j = i3 + -1;
      }
      localObject1 = c;
      j = ((ArrayList)localObject1).size() + -1;
      for (i3 = j; i3 >= 0; i3 = j)
      {
        localObject1 = (ArrayList)c.get(i3);
        i1 = ((ArrayList)localObject1).size() + -1;
        int i2;
        for (i4 = i1; i4 >= 0; i4 = i2)
        {
          localObject2 = (af.a)((ArrayList)localObject1).get(i4);
          a((af.a)localObject2);
          boolean bool4 = ((ArrayList)localObject1).isEmpty();
          if (bool4)
          {
            localObject2 = c;
            ((ArrayList)localObject2).remove(localObject1);
          }
          i2 = i4 + -1;
        }
        j = i3 + -1;
      }
      a(f);
      a(e);
      a(d);
      localObject1 = g;
      a((List)localObject1);
      e();
    }
  }
}


/* Location:              android/support/v7/widget/af.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */