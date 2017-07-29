package android.support.v4.b;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.g.a;
import android.support.v4.g.h;
import android.support.v4.h.w;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;

final class t
{
  private static final int[] a = { 0, 3, 0, 1, 5, 4, 7, 6 };
  
  private static a a(a parama, SparseArray<a> paramSparseArray, int paramInt)
  {
    a locala = parama;
    if (parama == null)
    {
      locala = new a();
      paramSparseArray.put(paramInt, locala);
    }
    return locala;
  }
  
  private static a<String, String> a(int paramInt1, ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt2, int paramInt3)
  {
    a locala = new a();
    paramInt3 -= 1;
    while (paramInt3 >= paramInt2)
    {
      Object localObject = (c)paramArrayList.get(paramInt3);
      if (((c)localObject).b(paramInt1))
      {
        boolean bool = ((Boolean)paramArrayList1.get(paramInt3)).booleanValue();
        if (s != null)
        {
          int j = s.size();
          ArrayList localArrayList1;
          ArrayList localArrayList2;
          int i;
          label95:
          String str1;
          if (bool)
          {
            localArrayList1 = s;
            localArrayList2 = t;
            i = 0;
            if (i >= j) {
              break label192;
            }
            localObject = (String)localArrayList2.get(i);
            str1 = (String)localArrayList1.get(i);
            String str2 = (String)locala.remove(str1);
            if (str2 == null) {
              break label179;
            }
            locala.put(localObject, str2);
          }
          for (;;)
          {
            i += 1;
            break label95;
            localArrayList2 = s;
            localArrayList1 = t;
            break;
            label179:
            locala.put(localObject, str1);
          }
        }
      }
      label192:
      paramInt3 -= 1;
    }
    return locala;
  }
  
  private static Object a(i parami1, i parami2, boolean paramBoolean)
  {
    if ((parami1 == null) || (parami2 == null)) {
      return null;
    }
    if (paramBoolean) {
      if (W == null) {
        parami1 = null;
      }
    }
    for (;;)
    {
      parami1 = u.a(parami1);
      if (parami1 == null) {
        break;
      }
      parami2 = new TransitionSet();
      parami2.addTransition((Transition)parami1);
      return parami2;
      parami1 = parami2;
      if (W.k != i.j) {
        parami1 = W.k;
      } else if (W == null) {
        parami1 = null;
      } else {
        parami1 = W.j;
      }
    }
  }
  
  private static Object a(i parami, boolean paramBoolean)
  {
    Object localObject = null;
    if (parami == null) {
      return null;
    }
    if (paramBoolean) {
      if (W == null) {
        parami = (i)localObject;
      }
    }
    for (;;)
    {
      return u.a(parami);
      if (W.i == i.j)
      {
        parami = parami.q();
      }
      else
      {
        parami = W.i;
        continue;
        parami = parami.p();
      }
    }
  }
  
  private static Object a(Object paramObject1, Object paramObject2, Object paramObject3, i parami, boolean paramBoolean)
  {
    if ((paramObject1 != null) && (paramObject2 != null) && (parami != null)) {
      if (paramBoolean) {
        if ((W == null) || (W.l == null)) {
          paramBoolean = true;
        }
      }
    }
    for (;;)
    {
      if (paramBoolean)
      {
        parami = new TransitionSet();
        if (paramObject2 != null) {
          parami.addTransition((Transition)paramObject2);
        }
        if (paramObject1 != null) {
          parami.addTransition((Transition)paramObject1);
        }
        if (paramObject3 != null) {
          parami.addTransition((Transition)paramObject3);
        }
        return parami;
        paramBoolean = W.l.booleanValue();
        continue;
        if ((W == null) || (W.m == null)) {
          paramBoolean = true;
        } else {
          paramBoolean = W.m.booleanValue();
        }
      }
      else
      {
        paramObject2 = (Transition)paramObject2;
        paramObject1 = (Transition)paramObject1;
        paramObject3 = (Transition)paramObject3;
        if ((paramObject2 != null) && (paramObject1 != null)) {
          paramObject1 = new TransitionSet().addTransition((Transition)paramObject2).addTransition((Transition)paramObject1).setOrdering(1);
        }
        for (;;)
        {
          if (paramObject3 != null)
          {
            paramObject2 = new TransitionSet();
            if (paramObject1 != null) {
              ((TransitionSet)paramObject2).addTransition((Transition)paramObject1);
            }
            ((TransitionSet)paramObject2).addTransition((Transition)paramObject3);
            return paramObject2;
            if (paramObject2 != null)
            {
              paramObject1 = paramObject2;
              continue;
            }
            if (paramObject1 == null) {}
          }
          else
          {
            return paramObject1;
          }
          paramObject1 = null;
        }
        paramBoolean = true;
      }
    }
  }
  
  private static String a(a<String, String> parama, String paramString)
  {
    int j = parama.size();
    int i = 0;
    while (i < j)
    {
      if (paramString.equals(parama.c(i))) {
        return (String)parama.b(i);
      }
      i += 1;
    }
    return null;
  }
  
  private static void a(c paramc, c.a parama, SparseArray<a> paramSparseArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    i locali = b;
    int n = F;
    if (n == 0) {
      return;
    }
    int i;
    label33:
    int j;
    int k;
    boolean bool;
    if (paramBoolean1)
    {
      i = a[a];
      switch (i)
      {
      case 2: 
      default: 
        i = 0;
        j = 0;
        k = 0;
        bool = false;
        parama = (a)paramSparseArray.get(n);
        if (bool)
        {
          parama = a(parama, paramSparseArray, n);
          a = locali;
          b = paramBoolean1;
          c = paramc;
        }
        break;
      }
    }
    for (;;)
    {
      if ((!paramBoolean2) && (i != 0))
      {
        if ((parama != null) && (d == locali)) {
          d = null;
        }
        o localo = b;
        if ((k <= 0) && (m > 0) && (!u))
        {
          localo.b(locali);
          localo.a(locali, 1, 0, 0, false);
        }
      }
      if ((j != 0) && ((parama == null) || (d == null)))
      {
        parama = a(parama, paramSparseArray, n);
        d = locali;
        e = paramBoolean1;
        f = paramc;
      }
      for (paramc = parama; (!paramBoolean2) && (k != 0) && (paramc != null) && (a == locali); paramc = parama)
      {
        a = null;
        return;
        i = a;
        break label33;
        if (paramBoolean2) {
          if ((Y) && (!H) && (t)) {
            bool = true;
          }
        }
        for (;;)
        {
          i = 1;
          j = 0;
          k = 0;
          break;
          bool = false;
          continue;
          bool = H;
        }
        if (paramBoolean2) {
          bool = X;
        }
        for (;;)
        {
          i = 1;
          j = 0;
          k = 0;
          break;
          if ((!t) && (!H)) {
            bool = true;
          } else {
            bool = false;
          }
        }
        if (paramBoolean2) {
          if ((Y) && (t) && (H)) {
            i = 1;
          }
        }
        int m;
        for (;;)
        {
          m = 0;
          j = i;
          k = 1;
          bool = false;
          i = m;
          break;
          i = 0;
          continue;
          if ((t) && (!H)) {
            i = 1;
          } else {
            i = 0;
          }
        }
        if (paramBoolean2) {
          if ((!t) && (P != null) && (P.getVisibility() == 0) && (Z >= 0.0F)) {
            i = 1;
          }
        }
        for (;;)
        {
          m = 0;
          j = i;
          k = 1;
          bool = false;
          i = m;
          break;
          i = 0;
          continue;
          if ((t) && (!H)) {
            i = 1;
          } else {
            i = 0;
          }
        }
      }
    }
  }
  
  private static void a(c paramc, SparseArray<a> paramSparseArray, boolean paramBoolean)
  {
    int j = c.size();
    int i = 0;
    while (i < j)
    {
      a(paramc, (c.a)c.get(i), paramSparseArray, false, paramBoolean);
      i += 1;
    }
  }
  
  static void a(o paramo, ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((m <= 0) || (Build.VERSION.SDK_INT < 21)) {}
    SparseArray localSparseArray;
    final Object localObject1;
    do
    {
      return;
      localSparseArray = new SparseArray();
      i = paramInt1;
      if (i < paramInt2)
      {
        localObject1 = (c)paramArrayList.get(i);
        if (((Boolean)paramArrayList1.get(i)).booleanValue()) {
          b((c)localObject1, localSparseArray, paramBoolean);
        }
        for (;;)
        {
          i += 1;
          break;
          a((c)localObject1, localSparseArray, paramBoolean);
        }
      }
    } while (localSparseArray.size() == 0);
    final View localView = new View(n.c);
    int j = localSparseArray.size();
    int i = 0;
    label125:
    int k;
    a locala1;
    final Object localObject5;
    if (i < j)
    {
      k = localSparseArray.keyAt(i);
      locala1 = a(k, paramArrayList, paramArrayList1, paramInt1, paramInt2);
      localObject5 = (a)localSparseArray.valueAt(i);
      if (!paramBoolean) {
        break label804;
      }
      if (!o.a()) {
        break label1320;
      }
    }
    label524:
    label542:
    label638:
    label665:
    label804:
    label924:
    label1126:
    label1183:
    label1197:
    label1306:
    label1318:
    label1320:
    for (ViewGroup localViewGroup = (ViewGroup)o.a(k);; localViewGroup = null)
    {
      final i locali1;
      final Object localObject10;
      final boolean bool1;
      final boolean bool2;
      final Object localObject6;
      final Object localObject7;
      final Object localObject8;
      Object localObject9;
      final i locali2;
      final i locali3;
      final Object localObject2;
      final Object localObject3;
      final Object localObject4;
      if (localViewGroup != null)
      {
        locali1 = a;
        localObject10 = d;
        bool1 = b;
        bool2 = e;
        localObject6 = new ArrayList();
        localObject7 = new ArrayList();
        localObject8 = a(locali1, bool1);
        localObject9 = b((i)localObject10, bool2);
        locali2 = a;
        locali3 = d;
        if (locali2 != null) {
          P.setVisibility(0);
        }
        if ((locali2 != null) && (locali3 != null)) {
          break label524;
        }
        localObject1 = null;
        if ((localObject8 != null) || (localObject1 != null) || (localObject9 != null))
        {
          localObject2 = b(localObject9, (i)localObject10, (ArrayList)localObject7, localView);
          localObject3 = b(localObject8, locali1, (ArrayList)localObject6, localView);
          a((ArrayList)localObject3, 4);
          localObject4 = a(localObject8, localObject9, localObject1, locali1, bool1);
          if (localObject4 != null)
          {
            if ((localObject10 != null) && (localObject9 != null) && (t) && (H) && (Y))
            {
              ((i)localObject10).a(true);
              localObject5 = P;
              ((Transition)localObject9).addListener(new u.2((View)localObject5, (ArrayList)localObject2));
              aj.a(O, new Runnable()
              {
                public final void run()
                {
                  t.a(a);
                }
              });
            }
            localObject5 = u.a((ArrayList)localObject6);
            u.a(localObject4, localObject8, (ArrayList)localObject3, localObject9, (ArrayList)localObject2, localObject1, (ArrayList)localObject6);
            u.a(localViewGroup, localObject4);
            u.a(localViewGroup, (ArrayList)localObject7, (ArrayList)localObject6, (ArrayList)localObject5, locala1);
            a((ArrayList)localObject3, 0);
            u.a(localObject1, (ArrayList)localObject7, (ArrayList)localObject6);
          }
        }
      }
      for (;;)
      {
        i += 1;
        break label125;
        break;
        bool2 = b;
        final a locala2;
        if (locala1.isEmpty())
        {
          localObject1 = null;
          localObject3 = b(locala1, localObject1, (a)localObject5);
          locala2 = c(locala1, localObject1, (a)localObject5);
          if (!locala1.isEmpty()) {
            break label638;
          }
          localObject2 = null;
          if (localObject3 != null) {
            ((a)localObject3).clear();
          }
          localObject1 = localObject2;
          if (locala2 != null)
          {
            locala2.clear();
            localObject1 = localObject2;
          }
        }
        for (;;)
        {
          if ((localObject8 != null) || (localObject9 != null) || (localObject1 != null)) {
            break label665;
          }
          localObject1 = null;
          break;
          localObject1 = a(locali2, locali3, bool2);
          break label542;
          a((ArrayList)localObject7, (a)localObject3, locala1.keySet());
          a((ArrayList)localObject6, locala2, locala1.values());
        }
        b(locali2, locali3, bool2, (a)localObject3);
        if (localObject1 != null)
        {
          ((ArrayList)localObject6).add(localView);
          u.a(localObject1, localView, (ArrayList)localObject7);
          a(localObject1, localObject9, (a)localObject3, e, f);
          localObject4 = new Rect();
          localObject5 = b(locala2, (a)localObject5, localObject8, bool2);
          localObject2 = localObject5;
          localObject3 = localObject4;
          if (localObject5 != null)
          {
            u.a(localObject8, (Rect)localObject4);
            localObject3 = localObject4;
          }
        }
        for (localObject2 = localObject5;; localObject2 = null)
        {
          aj.a(localViewGroup, new Runnable()
          {
            public final void run()
            {
              t.a(a, locali3, bool2, locala2);
              if (localObject2 != null) {
                u.a(localObject2, localObject3);
              }
            }
          });
          break;
          localObject3 = null;
        }
        if (o.a()) {}
        for (localViewGroup = (ViewGroup)o.a(k);; localViewGroup = null)
        {
          if (localViewGroup == null) {
            break label1318;
          }
          localObject6 = a;
          localObject9 = d;
          bool1 = b;
          bool2 = e;
          localObject7 = a((i)localObject6, bool1);
          localObject3 = b((i)localObject9, bool2);
          localObject10 = new ArrayList();
          localObject8 = new ArrayList();
          locali1 = a;
          locali2 = d;
          if ((locali1 == null) || (locali2 == null))
          {
            localObject1 = null;
            if ((localObject7 == null) && (localObject1 == null) && (localObject3 == null)) {
              break label1306;
            }
            localObject4 = b(localObject3, (i)localObject9, (ArrayList)localObject10, localView);
            if (localObject4 != null)
            {
              localObject2 = localObject3;
              if (!((ArrayList)localObject4).isEmpty()) {}
            }
            else
            {
              localObject2 = null;
            }
            if (localObject7 != null) {
              ((Transition)localObject7).addTarget(localView);
            }
            localObject3 = a(localObject7, localObject2, localObject1, (i)localObject6, b);
            if (localObject3 == null) {
              break;
            }
            localObject5 = new ArrayList();
            u.a(localObject3, localObject7, (ArrayList)localObject5, localObject2, (ArrayList)localObject4, localObject1, (ArrayList)localObject8);
            aj.a(localViewGroup, new Runnable()
            {
              public final void run()
              {
                Object localObject;
                if (a != null)
                {
                  localObject = a;
                  View localView = localView;
                  if (localObject != null) {
                    ((Transition)localObject).removeTarget(localView);
                  }
                  localObject = t.a(a, localObject6, localObject8, localView);
                  localObject5.addAll((Collection)localObject);
                }
                if (localObject4 != null)
                {
                  if (localObject2 != null)
                  {
                    localObject = new ArrayList();
                    ((ArrayList)localObject).add(localView);
                    u.b(localObject2, localObject4, (ArrayList)localObject);
                  }
                  localObject4.clear();
                  localObject4.add(localView);
                }
              }
            });
            aj.a(localViewGroup, new u.4((ArrayList)localObject8, locala1));
            u.a(localViewGroup, localObject3);
            aj.a(localViewGroup, new u.7((ArrayList)localObject8, locala1));
            break;
          }
          bool1 = b;
          if (locala1.isEmpty())
          {
            localObject1 = null;
            localObject2 = b(locala1, localObject1, (a)localObject5);
            if (!locala1.isEmpty()) {
              break label1183;
            }
            localObject1 = null;
          }
          for (;;)
          {
            if ((localObject7 != null) || (localObject3 != null) || (localObject1 != null)) {
              break label1197;
            }
            localObject1 = null;
            break;
            localObject1 = a(locali1, locali2, bool1);
            break label1126;
            ((ArrayList)localObject10).addAll(((a)localObject2).values());
          }
          b(locali1, locali2, bool1, (a)localObject2);
          if (localObject1 != null)
          {
            localObject4 = new Rect();
            u.a(localObject1, localView, (ArrayList)localObject10);
            a(localObject1, localObject3, (a)localObject2, e, f);
            localObject2 = localObject4;
            if (localObject7 != null) {
              u.a(localObject7, (Rect)localObject4);
            }
          }
          for (localObject2 = localObject4;; localObject2 = null)
          {
            aj.a(localViewGroup, new Runnable()
            {
              public final void run()
              {
                Object localObject = t.a(a, localObject1, localObject5);
                if (localObject != null)
                {
                  localObject8.addAll(((a)localObject).values());
                  localObject8.add(localView);
                }
                t.a(locali1, locali2, bool1, (a)localObject);
                if (localObject1 != null)
                {
                  u.a(localObject1, localObject10, localObject8);
                  localObject = t.a((a)localObject, localObject5, localObject7, bool1);
                  if (localObject != null) {
                    u.a((View)localObject, localObject2);
                  }
                }
              }
            });
            break label924;
            break;
          }
        }
      }
    }
  }
  
  private static void a(Object paramObject1, Object paramObject2, a<String, View> parama, boolean paramBoolean, c paramc)
  {
    if ((s != null) && (!s.isEmpty())) {
      if (!paramBoolean) {
        break label62;
      }
    }
    label62:
    for (paramc = (String)t.get(0);; paramc = (String)s.get(0))
    {
      parama = (View)parama.get(paramc);
      u.a(paramObject1, parama);
      if (paramObject2 != null) {
        u.a(paramObject2, parama);
      }
      return;
    }
  }
  
  private static void a(ArrayList<View> paramArrayList, int paramInt)
  {
    if (paramArrayList == null) {}
    for (;;)
    {
      return;
      int i = paramArrayList.size() - 1;
      while (i >= 0)
      {
        ((View)paramArrayList.get(i)).setVisibility(paramInt);
        i -= 1;
      }
    }
  }
  
  private static void a(ArrayList<View> paramArrayList, a<String, View> parama, Collection<String> paramCollection)
  {
    int i = parama.size() - 1;
    while (i >= 0)
    {
      View localView = (View)parama.c(i);
      if (paramCollection.contains(w.u(localView))) {
        paramArrayList.add(localView);
      }
      i -= 1;
    }
  }
  
  private static a<String, View> b(a<String, String> parama, Object paramObject, a parama1)
  {
    if ((parama.isEmpty()) || (paramObject == null))
    {
      parama.clear();
      return null;
    }
    Object localObject = d;
    a locala = new a();
    u.a(locala, P);
    paramObject = f;
    int i;
    if (e)
    {
      parama1 = ((i)localObject).y();
      paramObject = t;
      h.a(locala, (Collection)paramObject);
      if (parama1 == null) {
        break label177;
      }
      i = ((ArrayList)paramObject).size() - 1;
      label83:
      if (i < 0) {
        break label187;
      }
      localObject = (String)((ArrayList)paramObject).get(i);
      parama1 = (View)locala.get(localObject);
      if (parama1 != null) {
        break label140;
      }
      parama.remove(localObject);
    }
    for (;;)
    {
      i -= 1;
      break label83;
      parama1 = ((i)localObject).z();
      paramObject = s;
      break;
      label140:
      if (!((String)localObject).equals(w.u(parama1)))
      {
        localObject = (String)parama.remove(localObject);
        parama.put(w.u(parama1), localObject);
      }
    }
    label177:
    h.a(parama, locala.keySet());
    label187:
    return locala;
  }
  
  private static View b(a<String, View> parama, a parama1, Object paramObject, boolean paramBoolean)
  {
    parama1 = c;
    if ((paramObject != null) && (parama != null) && (s != null) && (!s.isEmpty()))
    {
      if (paramBoolean) {}
      for (parama1 = (String)s.get(0);; parama1 = (String)t.get(0)) {
        return (View)parama.get(parama1);
      }
    }
    return null;
  }
  
  private static Object b(i parami, boolean paramBoolean)
  {
    Object localObject = null;
    if (parami == null) {
      return null;
    }
    if (paramBoolean) {
      if (W == null) {
        parami = (i)localObject;
      }
    }
    for (;;)
    {
      return u.a(parami);
      if (W.g == i.j)
      {
        parami = parami.p();
      }
      else
      {
        parami = W.g;
        continue;
        parami = parami.q();
      }
    }
  }
  
  private static ArrayList<View> b(Object paramObject, i parami, ArrayList<View> paramArrayList, View paramView)
  {
    Object localObject = null;
    if (paramObject != null)
    {
      ArrayList localArrayList = new ArrayList();
      parami = P;
      if (parami != null) {
        u.a(localArrayList, parami);
      }
      if (paramArrayList != null) {
        localArrayList.removeAll(paramArrayList);
      }
      localObject = localArrayList;
      if (!localArrayList.isEmpty())
      {
        localArrayList.add(paramView);
        u.a(paramObject, localArrayList);
        localObject = localArrayList;
      }
    }
    return (ArrayList<View>)localObject;
  }
  
  private static void b(c paramc, SparseArray<a> paramSparseArray, boolean paramBoolean)
  {
    if (!b.o.a()) {}
    for (;;)
    {
      return;
      int i = c.size() - 1;
      while (i >= 0)
      {
        a(paramc, (c.a)c.get(i), paramSparseArray, true, paramBoolean);
        i -= 1;
      }
    }
  }
  
  private static void b(i parami1, i parami2, boolean paramBoolean, a<String, View> parama)
  {
    int j = 0;
    int i;
    if (paramBoolean)
    {
      parami1 = parami2.y();
      if (parami1 == null) {
        return;
      }
      parami1 = new ArrayList();
      parami2 = new ArrayList();
      if (parama != null) {
        break label85;
      }
      i = 0;
    }
    for (;;)
    {
      if (j >= i) {
        return;
      }
      parami2.add(parama.b(j));
      parami1.add(parama.c(j));
      j += 1;
      continue;
      parami1 = parami1.y();
      break;
      label85:
      i = parama.size();
    }
  }
  
  private static a<String, View> c(a<String, String> parama, Object paramObject, a parama1)
  {
    Object localObject = a;
    View localView = P;
    if ((parama.isEmpty()) || (paramObject == null) || (localView == null))
    {
      parama.clear();
      return null;
    }
    a locala = new a();
    u.a(locala, localView);
    paramObject = c;
    if (b)
    {
      parama1 = ((i)localObject).z();
      paramObject = s;
      if (paramObject != null) {
        h.a(locala, (Collection)paramObject);
      }
      if (parama1 == null) {
        break label202;
      }
      i = ((ArrayList)paramObject).size() - 1;
      label96:
      if (i < 0) {
        break label242;
      }
      localObject = (String)((ArrayList)paramObject).get(i);
      parama1 = (View)locala.get(localObject);
      if (parama1 != null) {
        break label163;
      }
      parama1 = a(parama, (String)localObject);
      if (parama1 != null) {
        parama.remove(parama1);
      }
    }
    for (;;)
    {
      i -= 1;
      break label96;
      parama1 = ((i)localObject).y();
      paramObject = t;
      break;
      label163:
      if (!((String)localObject).equals(w.u(parama1)))
      {
        localObject = a(parama, (String)localObject);
        if (localObject != null) {
          parama.put(localObject, w.u(parama1));
        }
      }
    }
    label202:
    int i = parama.size() - 1;
    while (i >= 0)
    {
      if (!locala.containsKey((String)parama.c(i))) {
        parama.d(i);
      }
      i -= 1;
    }
    label242:
    return locala;
  }
  
  static final class a
  {
    public i a;
    public boolean b;
    public c c;
    public i d;
    public boolean e;
    public c f;
  }
}


/* Location:              android/support/v4/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */