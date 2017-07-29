package android.support.v7.widget;

import android.support.v4.f.e;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class ak
  implements Runnable
{
  static final ThreadLocal a;
  static Comparator e;
  ArrayList b;
  long c;
  long d;
  private ArrayList f;
  
  static
  {
    Object localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    a = (ThreadLocal)localObject;
    localObject = new android/support/v7/widget/ak$1;
    ((ak.1)localObject).<init>();
    e = (Comparator)localObject;
  }
  
  ak()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    b = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    f = localArrayList;
  }
  
  private static at.u a(at paramat, int paramInt, long paramLong)
  {
    View localView = null;
    int i = f.b();
    int j = 0;
    at.u localu1 = null;
    boolean bool;
    if (j < i)
    {
      at.u localu2 = at.c(f.c(j));
      int k = c;
      if (k == paramInt)
      {
        bool = localu2.j();
        if (!bool)
        {
          j = 1;
          label67:
          if (j == 0) {
            break label99;
          }
          j = 0;
          localu1 = null;
        }
      }
    }
    for (;;)
    {
      return localu1;
      j += 1;
      break;
      j = 0;
      localu1 = null;
      break label67;
      label99:
      at.m localm = d;
      localu1 = localm.a(paramInt, paramLong);
      if (localu1 != null)
      {
        bool = localu1.l();
        if (bool)
        {
          localView = a;
          localm.a(localView);
        }
        else
        {
          localm.a(localu1, false);
        }
      }
    }
  }
  
  final void a(at paramat, int paramInt1, int paramInt2)
  {
    boolean bool = paramat.isAttachedToWindow();
    if (bool)
    {
      long l1 = c;
      long l2 = 0L;
      bool = l1 < l2;
      if (!bool)
      {
        l1 = paramat.getNanoTime();
        c = l1;
        paramat.post(this);
      }
    }
    ak.a locala = E;
    a = paramInt1;
    b = paramInt2;
  }
  
  public final void run()
  {
    Object localObject1 = "RV Prefetch";
    for (;;)
    {
      long l2;
      int n;
      try
      {
        e.a((String)localObject1);
        localObject1 = b;
        boolean bool1 = ((ArrayList)localObject1).isEmpty();
        if (bool1)
        {
          l1 = 0L;
          c = l1;
          e.a();
          return;
        }
        localObject1 = b;
        int k = ((ArrayList)localObject1).size();
        l2 = 0L;
        bool1 = false;
        localObject1 = null;
        int m = 0;
        if (m < k)
        {
          localObject1 = b;
          localObject1 = ((ArrayList)localObject1).get(m);
          localObject1 = (at)localObject1;
          n = ((at)localObject1).getWindowVisibility();
          if (n != 0) {
            break label1060;
          }
          l1 = ((at)localObject1).getDrawingTime();
          l1 = Math.max(l1, l2);
          i1 = m + 1;
          m = i1;
          l2 = l1;
          continue;
        }
        l1 = 0L;
        bool1 = l2 < l1;
        if (!bool1)
        {
          l1 = 0L;
          c = l1;
          e.a();
          continue;
        }
        localObject1 = TimeUnit.MILLISECONDS;
        l1 = ((TimeUnit)localObject1).toNanos(l2);
        l2 = d;
        long l3 = l1 + l2;
        localObject1 = b;
        int i4 = ((ArrayList)localObject1).size();
        n = 0;
        Object localObject4 = null;
        bool1 = false;
        localObject1 = null;
        int i1 = 0;
        Object localObject5 = null;
        int i5;
        Object localObject6;
        if (i1 < i4)
        {
          localObject1 = b;
          localObject1 = ((ArrayList)localObject1).get(i1);
          localObject1 = (at)localObject1;
          i5 = ((at)localObject1).getWindowVisibility();
          if (i5 != 0) {
            break label1054;
          }
          localObject6 = E;
          i6 = 0;
          ((ak.a)localObject6).a((at)localObject1, false);
          localObject1 = E;
          i = d + n;
          i1 += 1;
          n = i;
          continue;
        }
        localObject1 = f;
        ((ArrayList)localObject1).ensureCapacity(n);
        n = 0;
        localObject4 = null;
        int i = 0;
        localObject1 = null;
        int i7 = 0;
        Object localObject7 = null;
        if (i7 < i4)
        {
          localObject1 = b;
          localObject1 = ((ArrayList)localObject1).get(i7);
          localObject1 = (at)localObject1;
          i1 = ((at)localObject1).getWindowVisibility();
          if (i1 != 0) {
            break label1048;
          }
          ak.a locala = E;
          i1 = a;
          i1 = Math.abs(i1);
          i5 = b;
          i5 = Math.abs(i5);
          int i8 = i1 + i5;
          localObject5 = null;
          i6 = 0;
          i1 = n;
          n = d * 2;
          if (i6 < n)
          {
            localObject4 = f;
            n = ((ArrayList)localObject4).size();
            if (i1 >= n)
            {
              localObject4 = new android/support/v7/widget/ak$b;
              ((ak.b)localObject4).<init>();
              localObject6 = f;
              ((ArrayList)localObject6).add(localObject4);
              localObject6 = localObject4;
              localObject4 = c;
              int i9 = i6 + 1;
              i9 = localObject4[i9];
              if (i9 <= i8)
              {
                n = 1;
                a = n;
                b = i8;
                c = i9;
                d = ((at)localObject1);
                localObject4 = c;
                n = localObject4[i6];
                e = n;
                i1 += 1;
                n = i6 + 2;
                i6 = n;
              }
            }
            else
            {
              localObject4 = f;
              localObject4 = ((ArrayList)localObject4).get(i1);
              localObject4 = (ak.b)localObject4;
              localObject6 = localObject4;
              continue;
            }
            n = 0;
            localObject4 = null;
            continue;
          }
          i = i1;
          i7 += 1;
          n = i;
          continue;
        }
        localObject1 = f;
        localObject4 = e;
        Collections.sort((List)localObject1, (Comparator)localObject4);
        i = 0;
        localObject1 = null;
        int i6 = 0;
        localObject1 = f;
        i = ((ArrayList)localObject1).size();
        if (i6 < i)
        {
          localObject1 = f;
          localObject1 = ((ArrayList)localObject1).get(i6);
          Object localObject8 = localObject1;
          localObject8 = (ak.b)localObject1;
          localObject4 = localObject8;
          localObject1 = d;
          if (localObject1 != null)
          {
            boolean bool2 = a;
            int i3;
            if (bool2)
            {
              l2 = Long.MAX_VALUE;
              localObject1 = d;
              i7 = e;
              localObject1 = a((at)localObject1, i7, l2);
              if (localObject1 == null) {
                continue;
              }
              localObject5 = b;
              if (localObject5 == null) {
                continue;
              }
              localObject1 = b;
              localObject1 = ((WeakReference)localObject1).get();
              localObject1 = (at)localObject1;
              if (localObject1 == null) {
                continue;
              }
              boolean bool3 = w;
              if (bool3)
              {
                localObject5 = f;
                i2 = ((ac)localObject5).b();
                if (i2 != 0) {
                  ((at)localObject1).a();
                }
              }
              localObject6 = E;
              int i2 = 1;
              ((ak.a)localObject6).a((at)localObject1, i2);
              i3 = d;
              if (i3 == 0) {
                continue;
              }
              localObject5 = "RV Nested Prefetch";
            }
            try
            {
              e.a((String)localObject5);
              localObject5 = F;
              localObject7 = l;
              i4 = 1;
              d = i4;
              i7 = ((at.a)localObject7).a();
              e = i7;
              i7 = 0;
              localObject7 = null;
              f = false;
              i7 = 0;
              localObject7 = null;
              g = false;
              i7 = 0;
              localObject7 = null;
              h = false;
              i7 = 0;
              localObject7 = null;
              i = false;
              i3 = 0;
              localObject5 = null;
              i7 = d * 2;
              if (i3 < i7)
              {
                localObject7 = c;
                i7 = localObject7[i3];
                a((at)localObject1, i7, l3);
                i3 += 2;
                continue;
                l2 = l3;
                continue;
              }
              e.a();
              bool2 = false;
              localObject1 = null;
              a = false;
              bool2 = false;
              localObject1 = null;
              b = 0;
              bool2 = false;
              localObject1 = null;
              c = 0;
              bool2 = false;
              localObject1 = null;
              d = null;
              bool2 = false;
              localObject1 = null;
              e = 0;
              j = i6 + 1;
              i6 = j;
              continue;
            }
            finally
            {
              e.a();
            }
          }
        }
        l1 = 0L;
      }
      finally
      {
        c = 0L;
        e.a();
      }
      c = l1;
      e.a();
      continue;
      label1048:
      int j = n;
      continue;
      label1054:
      j = n;
      continue;
      label1060:
      long l1 = l2;
    }
  }
}


/* Location:              android/support/v7/widget/ak.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */