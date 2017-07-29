package android.support.v4.b;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.g.a;
import android.support.v4.g.h;
import android.support.v4.h.w;
import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;

final class t
{
  private static final int[] a;
  
  static
  {
    int[] arrayOfInt = new int[8];
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 3;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 1;
    arrayOfInt[4] = 5;
    arrayOfInt[5] = 4;
    arrayOfInt[6] = 7;
    arrayOfInt[7] = 6;
    a = arrayOfInt;
  }
  
  private static t.a a(t.a parama, SparseArray paramSparseArray, int paramInt)
  {
    if (parama == null)
    {
      parama = new android/support/v4/b/t$a;
      parama.<init>();
      paramSparseArray.put(paramInt, parama);
    }
    return parama;
  }
  
  private static a a(int paramInt1, ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt2, int paramInt3)
  {
    a locala = new android/support/v4/g/a;
    locala.<init>();
    int i = paramInt3 + -1;
    for (int j = i; j >= paramInt2; j = i)
    {
      Object localObject1 = (c)paramArrayList1.get(j);
      boolean bool = ((c)localObject1).b(paramInt1);
      if (bool)
      {
        Object localObject2 = (Boolean)paramArrayList2.get(j);
        bool = ((Boolean)localObject2).booleanValue();
        Object localObject3 = s;
        if (localObject3 != null)
        {
          localObject3 = s;
          int k = ((ArrayList)localObject3).size();
          Object localObject4;
          Object localObject5;
          int m;
          if (bool)
          {
            localObject2 = s;
            localObject1 = t;
            localObject4 = localObject2;
            localObject5 = localObject1;
            i = 0;
            localObject1 = null;
            m = 0;
            label130:
            if (m >= k) {
              break label239;
            }
            localObject1 = (String)((ArrayList)localObject5).get(m);
            localObject2 = (String)((ArrayList)localObject4).get(m);
            localObject3 = (String)locala.remove(localObject2);
            if (localObject3 == null) {
              break label226;
            }
            locala.put(localObject1, localObject3);
          }
          for (;;)
          {
            i = m + 1;
            m = i;
            break label130;
            localObject2 = s;
            localObject1 = t;
            localObject4 = localObject1;
            localObject5 = localObject2;
            break;
            label226:
            locala.put(localObject1, localObject2);
          }
        }
      }
      label239:
      i = j + -1;
    }
    return locala;
  }
  
  private static Object a(i parami1, i parami2, boolean paramBoolean)
  {
    Object localObject1 = null;
    if ((parami1 == null) || (parami2 == null)) {
      return localObject1;
    }
    Object localObject2;
    if (paramBoolean)
    {
      localObject2 = W;
      if (localObject2 == null) {
        localObject2 = null;
      }
    }
    for (;;)
    {
      localObject2 = u.a(localObject2);
      if (localObject2 == null) {
        break;
      }
      localObject1 = new android/transition/TransitionSet;
      ((TransitionSet)localObject1).<init>();
      localObject2 = (Transition)localObject2;
      ((TransitionSet)localObject1).addTransition((Transition)localObject2);
      break;
      localObject2 = W.k;
      Object localObject3 = i.j;
      if (localObject2 != localObject3)
      {
        localObject2 = W.k;
        continue;
        parami2 = parami1;
      }
      else
      {
        localObject2 = W;
        if (localObject2 == null) {
          localObject2 = null;
        } else {
          localObject2 = W.j;
        }
      }
    }
  }
  
  private static Object a(i parami, boolean paramBoolean)
  {
    Object localObject1 = null;
    if (parami == null) {
      return localObject1;
    }
    Object localObject2;
    if (paramBoolean)
    {
      localObject2 = W;
      if (localObject2 != null) {}
    }
    for (;;)
    {
      localObject1 = u.a(localObject1);
      break;
      localObject1 = W.i;
      localObject2 = i.j;
      if (localObject1 == localObject2)
      {
        localObject1 = parami.q();
      }
      else
      {
        localObject1 = W.i;
        continue;
        localObject1 = parami.p();
      }
    }
  }
  
  private static Object a(Object paramObject1, Object paramObject2, Object paramObject3, i parami, boolean paramBoolean)
  {
    int i = 1;
    Object localObject1;
    int j;
    if ((paramObject1 != null) && (paramObject2 != null) && (parami != null)) {
      if (paramBoolean)
      {
        localObject1 = W;
        if (localObject1 != null)
        {
          localObject1 = W.l;
          if (localObject1 != null) {}
        }
        else
        {
          j = i;
        }
      }
    }
    for (;;)
    {
      boolean bool;
      if (j != 0)
      {
        localObject1 = new android/transition/TransitionSet;
        ((TransitionSet)localObject1).<init>();
        if (paramObject2 != null)
        {
          paramObject2 = (Transition)paramObject2;
          ((TransitionSet)localObject1).addTransition((Transition)paramObject2);
        }
        if (paramObject1 != null)
        {
          paramObject1 = (Transition)paramObject1;
          ((TransitionSet)localObject1).addTransition((Transition)paramObject1);
        }
        if (paramObject3 != null)
        {
          paramObject3 = (Transition)paramObject3;
          ((TransitionSet)localObject1).addTransition((Transition)paramObject3);
        }
        return localObject1;
        localObject1 = W.l;
        bool = ((Boolean)localObject1).booleanValue();
        continue;
        localObject1 = W;
        if (localObject1 != null)
        {
          localObject1 = W.m;
          if (localObject1 != null) {}
        }
        else
        {
          bool = i;
          continue;
        }
        localObject1 = W.m;
        bool = ((Boolean)localObject1).booleanValue();
      }
      else
      {
        bool = false;
        localObject1 = null;
        paramObject2 = (Transition)paramObject2;
        paramObject1 = (Transition)paramObject1;
        paramObject3 = (Transition)paramObject3;
        Object localObject2;
        if ((paramObject2 != null) && (paramObject1 != null))
        {
          localObject1 = new android/transition/TransitionSet;
          ((TransitionSet)localObject1).<init>();
          localObject1 = ((TransitionSet)localObject1).addTransition((Transition)paramObject2).addTransition((Transition)paramObject1);
          localObject2 = ((TransitionSet)localObject1).setOrdering(i);
        }
        for (;;)
        {
          if (paramObject3 != null)
          {
            localObject1 = new android/transition/TransitionSet;
            ((TransitionSet)localObject1).<init>();
            if (localObject2 != null) {
              ((TransitionSet)localObject1).addTransition((Transition)localObject2);
            }
            ((TransitionSet)localObject1).addTransition((Transition)paramObject3);
            break;
            if (paramObject2 != null)
            {
              localObject2 = paramObject2;
              continue;
            }
            if (paramObject1 == null) {
              break label309;
            }
            localObject2 = paramObject1;
            continue;
          }
          localObject1 = localObject2;
          break;
          label309:
          i = 0;
          localObject2 = null;
        }
        bool = i;
      }
    }
  }
  
  private static String a(a parama, String paramString)
  {
    int i = parama.size();
    int j = 0;
    String str = null;
    if (j < i)
    {
      Object localObject = parama.c(j);
      boolean bool = paramString.equals(localObject);
      if (!bool) {}
    }
    for (str = (String)parama.b(j);; str = null)
    {
      return str;
      j += 1;
      break;
      j = 0;
    }
  }
  
  private static void a(c paramc, c.a parama, SparseArray paramSparseArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    i locali1 = b;
    int j = F;
    if (j == 0) {
      return;
    }
    Object localObject1;
    int k;
    int m;
    label48:
    int i1;
    int i2;
    int i3;
    Object localObject2;
    if (paramBoolean1)
    {
      localObject1 = a;
      k = a;
      m = localObject1[k];
      switch (m)
      {
      case 2: 
      default: 
        k = 0;
        i1 = 0;
        i2 = 0;
        i3 = 0;
        localObject1 = (t.a)paramSparseArray.get(j);
        if (i3 != 0)
        {
          localObject2 = a((t.a)localObject1, paramSparseArray, j);
          a = locali1;
          b = paramBoolean1;
          c = paramc;
        }
        break;
      }
    }
    for (;;)
    {
      boolean bool1;
      if ((!paramBoolean2) && (k != 0))
      {
        if (localObject2 != null)
        {
          localObject1 = d;
          if (localObject1 == locali1) {
            d = null;
          }
        }
        localObject1 = b;
        k = k;
        if (k <= 0)
        {
          k = m;
          if (k > 0)
          {
            bool1 = u;
            if (!bool1)
            {
              ((o)localObject1).b(locali1);
              bool1 = false;
              i3 = 0;
              ((o)localObject1).a(locali1, i, 0, 0, false);
            }
          }
        }
      }
      if (i1 != 0) {
        if (localObject2 != null)
        {
          localObject1 = d;
          if (localObject1 != null) {}
        }
        else
        {
          localObject1 = a((t.a)localObject2, paramSparseArray, j);
          d = locali1;
          e = paramBoolean1;
          f = paramc;
        }
      }
      while ((!paramBoolean2) && (i2 != 0) && (localObject1 != null))
      {
        i locali2 = a;
        if (locali2 != locali1) {
          break;
        }
        a = null;
        break;
        m = a;
        break label48;
        boolean bool2;
        float f2;
        if (paramBoolean2)
        {
          bool2 = Y;
          if (bool2)
          {
            bool2 = H;
            if (!bool2)
            {
              bool2 = t;
              if (bool2)
              {
                bool2 = i;
                f2 = f1;
              }
            }
          }
        }
        for (;;)
        {
          bool1 = i;
          i1 = 0;
          i2 = 0;
          i3 = bool2;
          break;
          bool2 = false;
          localObject1 = null;
          f2 = 0.0F;
          continue;
          bool2 = H;
        }
        if (paramBoolean2) {
          bool2 = X;
        }
        for (;;)
        {
          bool1 = i;
          i1 = 0;
          i2 = 0;
          i3 = bool2;
          break;
          bool2 = t;
          if (!bool2)
          {
            bool2 = H;
            if (!bool2)
            {
              bool2 = i;
              f2 = f1;
              continue;
            }
          }
          bool2 = false;
          localObject1 = null;
          f2 = 0.0F;
        }
        if (paramBoolean2)
        {
          bool2 = Y;
          if (bool2)
          {
            bool2 = t;
            if (bool2)
            {
              bool2 = H;
              if (bool2)
              {
                bool2 = i;
                f2 = f1;
              }
            }
          }
        }
        for (;;)
        {
          bool1 = false;
          i1 = bool2;
          i2 = i;
          i3 = 0;
          break;
          bool2 = false;
          localObject1 = null;
          f2 = 0.0F;
          continue;
          bool2 = t;
          if (bool2)
          {
            bool2 = H;
            if (!bool2)
            {
              bool2 = i;
              f2 = f1;
              continue;
            }
          }
          bool2 = false;
          localObject1 = null;
          f2 = 0.0F;
        }
        boolean bool3;
        if (paramBoolean2)
        {
          bool2 = t;
          if (!bool2)
          {
            localObject1 = P;
            if (localObject1 != null)
            {
              localObject1 = P;
              int n = ((View)localObject1).getVisibility();
              if (n == 0)
              {
                f2 = Z;
                bool1 = false;
                bool3 = f2 < 0.0F;
                if (!bool3)
                {
                  bool3 = i;
                  f2 = f1;
                }
              }
            }
          }
        }
        for (;;)
        {
          bool1 = false;
          i1 = bool3;
          i2 = i;
          i3 = 0;
          break;
          bool3 = false;
          localObject1 = null;
          f2 = 0.0F;
          continue;
          bool3 = t;
          if (bool3)
          {
            bool3 = H;
            if (!bool3)
            {
              bool3 = i;
              f2 = f1;
              continue;
            }
          }
          bool3 = false;
          localObject1 = null;
          f2 = 0.0F;
        }
        localObject1 = localObject2;
      }
      localObject2 = localObject1;
    }
  }
  
  private static void a(c paramc, SparseArray paramSparseArray, boolean paramBoolean)
  {
    Object localObject = c;
    int i = ((ArrayList)localObject).size();
    int k;
    for (int j = 0; j < i; j = k)
    {
      localObject = (c.a)c.get(j);
      a(paramc, (c.a)localObject, paramSparseArray, false, paramBoolean);
      k = j + 1;
    }
  }
  
  static void a(o paramo, ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramo.m;
    if (i > 0)
    {
      i = Build.VERSION.SDK_INT;
      int k = 21;
      if (i >= k) {
        break label28;
      }
    }
    label28:
    SparseArray localSparseArray;
    Object localObject2;
    View localView;
    int i3;
    int i4;
    do
    {
      do
      {
        return;
        localSparseArray = new android/util/SparseArray;
        localSparseArray.<init>();
        int i1 = paramInt1;
        i2 = paramInt2;
        if (i1 < paramInt2)
        {
          localObject1 = (c)paramArrayList1.get(i1);
          localObject2 = (Boolean)paramArrayList2.get(i1);
          boolean bool3 = ((Boolean)localObject2).booleanValue();
          if (bool3) {
            b((c)localObject1, localSparseArray, paramBoolean);
          }
          for (;;)
          {
            i = i1 + 1;
            i1 = i;
            break;
            a((c)localObject1, localSparseArray, paramBoolean);
          }
        }
        i = localSparseArray.size();
      } while (i == 0);
      localView = new android/view/View;
      localObject1 = nc;
      localView.<init>((Context)localObject1);
      i3 = localSparseArray.size();
      i = 0;
      localObject1 = null;
      i4 = 0;
      int i2 = i4;
    } while (i4 >= i3);
    int m = localSparseArray.keyAt(i4);
    a locala = a(m, paramArrayList1, paramArrayList2, paramInt1, paramInt2);
    Object localObject1 = localSparseArray.valueAt(i4);
    Object localObject3 = localObject1;
    localObject3 = (t.a)localObject1;
    Object localObject4;
    boolean bool5;
    if (paramBoolean)
    {
      i = 0;
      localObject1 = null;
      localObject4 = o;
      bool5 = ((k)localObject4).a();
      if (!bool5) {
        break label1620;
      }
      localObject1 = (ViewGroup)o.a(m);
    }
    label678:
    label703:
    label798:
    label837:
    label1121:
    label1389:
    label1453:
    label1475:
    label1606:
    label1618:
    label1620:
    for (Object localObject5 = localObject1;; localObject5 = null)
    {
      Object localObject6;
      Object localObject7;
      boolean bool7;
      Object localObject8;
      Object localObject9;
      Object localObject10;
      Object localObject11;
      boolean bool8;
      Object localObject12;
      Object localObject13;
      Object localObject14;
      int j;
      int n;
      Object localObject15;
      Object localObject16;
      if (localObject5 != null)
      {
        localObject6 = a;
        localObject7 = d;
        boolean bool6 = b;
        bool7 = bool6;
        boolean bool1 = e;
        localObject8 = new java/util/ArrayList;
        ((ArrayList)localObject8).<init>();
        localObject9 = new java/util/ArrayList;
        ((ArrayList)localObject9).<init>();
        localObject10 = a((i)localObject6, bool6);
        localObject11 = b((i)localObject7, bool1);
        localObject2 = a;
        localObject4 = d;
        if (localObject2 != null)
        {
          localObject1 = P;
          bool8 = false;
          localObject12 = null;
          ((View)localObject1).setVisibility(0);
        }
        if ((localObject2 != null) && (localObject4 != null)) {
          break label678;
        }
        localObject13 = null;
        if ((localObject10 != null) || (localObject13 != null) || (localObject11 != null))
        {
          localObject14 = b(localObject11, (i)localObject7, (ArrayList)localObject9, localView);
          localObject4 = b(localObject10, (i)localObject6, (ArrayList)localObject8, localView);
          j = 4;
          a((ArrayList)localObject4, j);
          localObject1 = a(localObject10, localObject11, localObject13, (i)localObject6, bool7);
          if (localObject1 != null)
          {
            if ((localObject7 != null) && (localObject11 != null))
            {
              n = t;
              if (n != 0)
              {
                n = H;
                if (n != 0)
                {
                  n = Y;
                  if (n != 0)
                  {
                    n = 1;
                    ((i)localObject7).a(n);
                    localObject12 = P;
                    localObject2 = localObject11;
                    localObject2 = (Transition)localObject11;
                    localObject15 = new android/support/v4/b/u$2;
                    ((u.2)localObject15).<init>((View)localObject12, (ArrayList)localObject14);
                    ((Transition)localObject2).addListener((Transition.TransitionListener)localObject15);
                    localObject2 = O;
                    localObject12 = new android/support/v4/b/t$1;
                    ((t.1)localObject12).<init>((ArrayList)localObject14);
                    aj.a((View)localObject2, (Runnable)localObject12);
                  }
                }
              }
            }
            localObject16 = u.a((ArrayList)localObject8);
            localObject2 = localObject10;
            localObject12 = localObject11;
            localObject15 = localObject8;
            u.a(localObject1, localObject10, (ArrayList)localObject4, localObject11, (ArrayList)localObject14, localObject13, (ArrayList)localObject8);
            u.a((ViewGroup)localObject5, localObject1);
            u.a((View)localObject5, (ArrayList)localObject9, (ArrayList)localObject8, (ArrayList)localObject16, locala);
            j = 0;
            localObject1 = null;
            a((ArrayList)localObject4, 0);
            u.a(localObject13, (ArrayList)localObject9, (ArrayList)localObject8);
          }
        }
      }
      for (;;)
      {
        j = i4 + 1;
        i4 = j;
        break;
        bool8 = b;
        boolean bool2 = locala.isEmpty();
        boolean bool9;
        boolean bool10;
        if (bool2)
        {
          bool2 = false;
          localObject1 = null;
          localObject13 = b(locala, localObject1, (t.a)localObject3);
          localObject14 = c(locala, localObject1, (t.a)localObject3);
          bool9 = locala.isEmpty();
          if (!bool9) {
            break label798;
          }
          bool10 = false;
          localObject16 = null;
          if (localObject13 != null) {
            ((a)localObject13).clear();
          }
          if (localObject14 != null) {
            ((a)localObject14).clear();
          }
        }
        for (;;)
        {
          if ((localObject10 != null) || (localObject11 != null) || (localObject16 != null)) {
            break label837;
          }
          localObject13 = null;
          break;
          localObject1 = a((i)localObject2, (i)localObject4, bool8);
          break label703;
          localObject15 = locala.keySet();
          a((ArrayList)localObject9, (a)localObject13, (Collection)localObject15);
          localObject15 = locala.values();
          a((ArrayList)localObject8, (a)localObject14, (Collection)localObject15);
          localObject16 = localObject1;
        }
        b((i)localObject2, (i)localObject4, bool8, (a)localObject13);
        if (localObject16 != null)
        {
          ((ArrayList)localObject8).add(localView);
          u.a(localObject16, localView, (ArrayList)localObject9);
          bool2 = e;
          localObject15 = f;
          a(localObject16, localObject11, (a)localObject13, bool2, (c)localObject15);
          localObject15 = new android/graphics/Rect;
          ((Rect)localObject15).<init>();
          localObject13 = b((a)localObject14, (t.a)localObject3, localObject10, bool8);
          if (localObject13 != null) {
            u.a(localObject10, (Rect)localObject15);
          }
        }
        for (;;)
        {
          localObject1 = new android/support/v4/b/t$3;
          ((t.3)localObject1).<init>((i)localObject2, (i)localObject4, bool8, (a)localObject14, (View)localObject13, (Rect)localObject15);
          aj.a((View)localObject5, (Runnable)localObject1);
          localObject13 = localObject16;
          break;
          bool9 = false;
          localObject15 = null;
          localObject13 = null;
        }
        bool2 = false;
        localObject1 = null;
        localObject4 = o;
        bool5 = ((k)localObject4).a();
        if (bool5) {
          localObject1 = (ViewGroup)o.a(n);
        }
        for (localObject10 = localObject1;; localObject10 = null)
        {
          if (localObject10 == null) {
            break label1618;
          }
          i locali = a;
          localObject8 = d;
          bool2 = b;
          boolean bool4 = e;
          localObject6 = a(locali, bool2);
          Object localObject17 = b((i)localObject8, bool4);
          localObject5 = new java/util/ArrayList;
          ((ArrayList)localObject5).<init>();
          localObject14 = new java/util/ArrayList;
          ((ArrayList)localObject14).<init>();
          localObject15 = a;
          localObject11 = d;
          if ((localObject15 == null) || (localObject11 == null))
          {
            localObject9 = null;
            if ((localObject6 == null) && (localObject9 == null) && (localObject17 == null)) {
              break label1606;
            }
            localObject8 = b(localObject17, (i)localObject8, (ArrayList)localObject5, localView);
            if (localObject8 != null)
            {
              bool2 = ((ArrayList)localObject8).isEmpty();
              if (!bool2) {}
            }
            else
            {
              bool7 = false;
              localObject17 = null;
            }
            if (localObject6 != null)
            {
              localObject1 = localObject6;
              localObject1 = (Transition)localObject6;
              ((Transition)localObject1).addTarget(localView);
            }
            bool2 = b;
            localObject5 = a(localObject6, localObject17, localObject9, locali, bool2);
            if (localObject5 == null) {
              break;
            }
            localObject7 = new java/util/ArrayList;
            ((ArrayList)localObject7).<init>();
            localObject3 = localObject14;
            u.a(localObject5, localObject6, (ArrayList)localObject7, localObject17, (ArrayList)localObject8, localObject9, (ArrayList)localObject14);
            localObject1 = new android/support/v4/b/t$2;
            localObject2 = localObject6;
            localObject4 = localView;
            localObject12 = locali;
            localObject13 = localObject7;
            localObject15 = localObject8;
            localObject11 = localObject17;
            ((t.2)localObject1).<init>(localObject6, localView, locali, (ArrayList)localObject14, (ArrayList)localObject7, (ArrayList)localObject8, localObject17);
            aj.a((View)localObject10, (Runnable)localObject1);
            localObject1 = new android/support/v4/b/u$4;
            ((u.4)localObject1).<init>((ArrayList)localObject14, locala);
            aj.a((View)localObject10, (Runnable)localObject1);
            u.a((ViewGroup)localObject10, localObject5);
            localObject1 = new android/support/v4/b/u$7;
            ((u.7)localObject1).<init>((ArrayList)localObject14, locala);
            aj.a((View)localObject10, (Runnable)localObject1);
            break;
          }
          bool10 = b;
          bool2 = locala.isEmpty();
          if (bool2)
          {
            bool2 = false;
            localObject1 = null;
            localObject2 = b(locala, localObject1, (t.a)localObject3);
            bool5 = locala.isEmpty();
            if (!bool5) {
              break label1453;
            }
            bool5 = false;
          }
          for (localObject4 = null;; localObject4 = localObject1)
          {
            if ((localObject6 != null) || (localObject17 != null) || (localObject4 != null)) {
              break label1475;
            }
            localObject9 = null;
            break;
            localObject1 = a((i)localObject15, (i)localObject11, bool10);
            break label1389;
            localObject4 = ((a)localObject2).values();
            ((ArrayList)localObject5).addAll((Collection)localObject4);
          }
          b((i)localObject15, (i)localObject11, bool10, (a)localObject2);
          if (localObject4 != null)
          {
            localObject7 = new android/graphics/Rect;
            ((Rect)localObject7).<init>();
            u.a(localObject4, localView, (ArrayList)localObject5);
            bool2 = e;
            localObject12 = f;
            a(localObject4, localObject17, (a)localObject2, bool2, (c)localObject12);
            if (localObject6 != null) {
              u.a(localObject6, (Rect)localObject7);
            }
          }
          for (;;)
          {
            localObject1 = new android/support/v4/b/t$4;
            localObject2 = locala;
            localObject12 = localObject3;
            localObject13 = localView;
            ((t.4)localObject1).<init>(locala, localObject4, (t.a)localObject3, (ArrayList)localObject14, localView, (i)localObject15, (i)localObject11, bool10, (ArrayList)localObject5, localObject6, (Rect)localObject7);
            aj.a((View)localObject10, (Runnable)localObject1);
            localObject9 = localObject4;
            break label1121;
            break;
            localObject7 = null;
          }
        }
      }
    }
  }
  
  private static void a(Object paramObject1, Object paramObject2, a parama, boolean paramBoolean, c paramc)
  {
    Object localObject = s;
    if (localObject != null)
    {
      localObject = s;
      boolean bool = ((ArrayList)localObject).isEmpty();
      if (!bool) {
        if (!paramBoolean) {
          break label77;
        }
      }
    }
    label77:
    for (localObject = (String)t.get(0);; localObject = (String)s.get(0))
    {
      localObject = (View)parama.get(localObject);
      u.a(paramObject1, (View)localObject);
      if (paramObject2 != null) {
        u.a(paramObject2, (View)localObject);
      }
      return;
    }
  }
  
  private static void a(ArrayList paramArrayList, int paramInt)
  {
    if (paramArrayList == null) {}
    for (;;)
    {
      return;
      int i = paramArrayList.size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        View localView = (View)paramArrayList.get(j);
        localView.setVisibility(paramInt);
        i = j + -1;
      }
    }
  }
  
  private static void a(ArrayList paramArrayList, a parama, Collection paramCollection)
  {
    int i = parama.size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      View localView = (View)parama.c(j);
      String str = w.u(localView);
      boolean bool = paramCollection.contains(str);
      if (bool) {
        paramArrayList.add(localView);
      }
      i = j + -1;
    }
  }
  
  private static a b(a parama, Object paramObject, t.a parama1)
  {
    boolean bool1 = parama.isEmpty();
    if ((bool1) || (paramObject == null))
    {
      parama.clear();
      bool1 = false;
    }
    a locala;
    for (Object localObject1 = null;; localObject1 = locala)
    {
      return (a)localObject1;
      localObject1 = d;
      locala = new android/support/v4/g/a;
      locala.<init>();
      Object localObject2 = P;
      u.a(locala, (View)localObject2);
      Object localObject3 = f;
      boolean bool2 = e;
      int i;
      int j;
      if (bool2)
      {
        localObject2 = ((i)localObject1).y();
        localObject3 = t;
        localObject1 = localObject2;
        h.a(locala, (Collection)localObject3);
        if (localObject1 == null) {
          break label246;
        }
        i = ((ArrayList)localObject3).size() + -1;
        j = i;
        label114:
        if (j < 0) {
          continue;
        }
        localObject1 = ((ArrayList)localObject3).get(j);
        localObject2 = localObject1;
        localObject2 = (String)localObject1;
        localObject1 = (View)locala.get(localObject2);
        if (localObject1 != null) {
          break label195;
        }
        parama.remove(localObject2);
      }
      for (;;)
      {
        i = j + -1;
        j = i;
        break label114;
        localObject2 = ((i)localObject1).z();
        localObject3 = s;
        localObject1 = localObject2;
        break;
        label195:
        String str = w.u((View)localObject1);
        boolean bool3 = ((String)localObject2).equals(str);
        if (!bool3)
        {
          localObject2 = (String)parama.remove(localObject2);
          localObject1 = w.u((View)localObject1);
          parama.put(localObject1, localObject2);
        }
      }
      label246:
      localObject1 = locala.keySet();
      h.a(parama, (Collection)localObject1);
    }
  }
  
  private static View b(a parama, t.a parama1, Object paramObject, boolean paramBoolean)
  {
    Object localObject = c;
    if ((paramObject != null) && (parama != null))
    {
      ArrayList localArrayList = s;
      if (localArrayList != null)
      {
        localArrayList = s;
        boolean bool = localArrayList.isEmpty();
        if (!bool) {
          if (paramBoolean) {
            localObject = (String)s.get(0);
          }
        }
      }
    }
    for (localObject = (View)parama.get(localObject);; localObject = null)
    {
      return (View)localObject;
      localObject = (String)t.get(0);
      break;
    }
  }
  
  private static Object b(i parami, boolean paramBoolean)
  {
    Object localObject1 = null;
    if (parami == null) {
      return localObject1;
    }
    Object localObject2;
    if (paramBoolean)
    {
      localObject2 = W;
      if (localObject2 != null) {}
    }
    for (;;)
    {
      localObject1 = u.a(localObject1);
      break;
      localObject1 = W.g;
      localObject2 = i.j;
      if (localObject1 == localObject2)
      {
        localObject1 = parami.p();
      }
      else
      {
        localObject1 = W.g;
        continue;
        localObject1 = parami.q();
      }
    }
  }
  
  private static ArrayList b(Object paramObject, i parami, ArrayList paramArrayList, View paramView)
  {
    ArrayList localArrayList = null;
    if (paramObject != null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      View localView = P;
      if (localView != null) {
        u.a(localArrayList, localView);
      }
      if (paramArrayList != null) {
        localArrayList.removeAll(paramArrayList);
      }
      boolean bool = localArrayList.isEmpty();
      if (!bool)
      {
        localArrayList.add(paramView);
        u.a(paramObject, localArrayList);
      }
    }
    return localArrayList;
  }
  
  private static void b(c paramc, SparseArray paramSparseArray, boolean paramBoolean)
  {
    Object localObject = b.o;
    boolean bool1 = ((k)localObject).a();
    if (!bool1) {}
    for (;;)
    {
      return;
      localObject = c;
      int i = ((ArrayList)localObject).size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject = (c.a)c.get(j);
        boolean bool2 = true;
        a(paramc, (c.a)localObject, paramSparseArray, bool2, paramBoolean);
        i = j + -1;
      }
    }
  }
  
  private static void b(i parami1, i parami2, boolean paramBoolean, a parama)
  {
    int i = 0;
    ao localao;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    int j;
    if (paramBoolean)
    {
      localao = parami2.y();
      if (localao == null) {
        return;
      }
      localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>();
      if (parama != null) {
        break label105;
      }
      j = 0;
      localao = null;
    }
    for (;;)
    {
      if (i >= j) {
        return;
      }
      Object localObject = parama.b(i);
      localArrayList2.add(localObject);
      localObject = parama.c(i);
      localArrayList1.add(localObject);
      i += 1;
      continue;
      localao = parami1.y();
      break;
      label105:
      j = parama.size();
    }
  }
  
  private static a c(a parama, Object paramObject, t.a parama1)
  {
    Object localObject1 = a;
    Object localObject2 = P;
    boolean bool1 = parama.isEmpty();
    int i;
    if ((bool1) || (paramObject == null) || (localObject2 == null))
    {
      parama.clear();
      i = 0;
    }
    a locala;
    for (localObject1 = null;; localObject1 = locala)
    {
      return (a)localObject1;
      locala = new android/support/v4/g/a;
      locala.<init>();
      u.a(locala, (View)localObject2);
      c localc = c;
      int k = b;
      ArrayList localArrayList;
      int m;
      if (k != 0)
      {
        localObject2 = ((i)localObject1).z();
        localArrayList = s;
        localObject1 = localObject2;
        if (localArrayList != null) {
          h.a(locala, localArrayList);
        }
        if (localObject1 == null) {
          break label257;
        }
        i = localArrayList.size() + -1;
        m = i;
        label122:
        if (m < 0) {
          continue;
        }
        localObject1 = localArrayList.get(m);
        localObject2 = localObject1;
        localObject2 = (String)localObject1;
        localObject1 = (View)locala.get(localObject2);
        if (localObject1 != null) {
          break label208;
        }
        localObject1 = a(parama, (String)localObject2);
        if (localObject1 != null) {
          parama.remove(localObject1);
        }
      }
      for (;;)
      {
        i = m + -1;
        m = i;
        break label122;
        localObject2 = ((i)localObject1).y();
        localArrayList = t;
        localObject1 = localObject2;
        break;
        label208:
        String str = w.u((View)localObject1);
        boolean bool3 = ((String)localObject2).equals(str);
        if (!bool3)
        {
          localObject2 = a(parama, (String)localObject2);
          if (localObject2 != null)
          {
            localObject1 = w.u((View)localObject1);
            parama.put(localObject2, localObject1);
          }
        }
      }
      label257:
      i = parama.size() + -1;
      int j;
      for (k = i; k >= 0; k = j)
      {
        localObject1 = (String)parama.c(k);
        boolean bool2 = locala.containsKey(localObject1);
        if (!bool2) {
          parama.d(k);
        }
        j = k + -1;
      }
    }
  }
}


/* Location:              android/support/v4/b/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */