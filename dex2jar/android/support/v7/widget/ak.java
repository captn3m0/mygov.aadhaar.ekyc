package android.support.v7.widget;

import android.support.v4.f.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class ak
  implements Runnable
{
  static final ThreadLocal<ak> a = new ThreadLocal();
  static Comparator<b> e = new Comparator() {};
  ArrayList<at> b = new ArrayList();
  long c;
  long d;
  private ArrayList<b> f = new ArrayList();
  
  private static at.u a(at paramat, int paramInt, long paramLong)
  {
    int j = f.b();
    int i = 0;
    at.u localu;
    if (i < j)
    {
      localu = at.c(f.c(i));
      if ((c == paramInt) && (!localu.j()))
      {
        i = 1;
        label53:
        if (i == 0) {
          break label77;
        }
        paramat = null;
      }
    }
    label77:
    at.m localm;
    do
    {
      return paramat;
      i += 1;
      break;
      i = 0;
      break label53;
      localm = d;
      localu = localm.a(paramInt, paramLong);
      paramat = localu;
    } while (localu == null);
    if (localu.l())
    {
      localm.a(a);
      return localu;
    }
    localm.a(localu, false);
    return localu;
  }
  
  final void a(at paramat, int paramInt1, int paramInt2)
  {
    if ((paramat.isAttachedToWindow()) && (c == 0L))
    {
      c = paramat.getNanoTime();
      paramat.post(this);
    }
    paramat = E;
    a = paramInt1;
    b = paramInt2;
  }
  
  public final void run()
  {
    for (;;)
    {
      int j;
      try
      {
        e.a("RV Prefetch");
        bool = b.isEmpty();
        if (bool) {
          return;
        }
        j = b.size();
        long l1 = 0L;
        int i = 0;
        Object localObject1;
        if (i < j)
        {
          localObject1 = (at)b.get(i);
          if (((at)localObject1).getWindowVisibility() != 0) {
            break label709;
          }
          l1 = Math.max(((at)localObject1).getDrawingTime(), l1);
          i += 1;
          continue;
        }
        if (l1 == 0L) {
          return;
        }
        long l2 = TimeUnit.MILLISECONDS.toNanos(l1) + d;
        int m = b.size();
        i = 0;
        j = 0;
        if (j < m)
        {
          localObject1 = (at)b.get(j);
          if (((at)localObject1).getWindowVisibility() != 0) {
            break label706;
          }
          E.a((at)localObject1, false);
          i = E.d + i;
          break label712;
        }
        f.ensureCapacity(i);
        i = 0;
        j = 0;
        Object localObject4;
        a locala;
        if (j < m)
        {
          localObject4 = (at)b.get(j);
          if (((at)localObject4).getWindowVisibility() != 0) {
            break label703;
          }
          locala = E;
          int n = Math.abs(a) + Math.abs(b);
          int k = 0;
          if (k >= d * 2) {
            break label725;
          }
          if (i >= f.size())
          {
            localObject1 = new b();
            f.add(localObject1);
            int i1 = c[(k + 1)];
            if (i1 > n) {
              break label719;
            }
            bool = true;
            a = bool;
            b = n;
            c = i1;
            d = ((at)localObject4);
            e = c[k];
            i += 1;
            k += 2;
            continue;
          }
          localObject1 = (b)f.get(i);
          continue;
        }
        Collections.sort(f, e);
        i = 0;
        if (i < f.size())
        {
          localObject1 = (b)f.get(i);
          if (d != null)
          {
            if (a)
            {
              l1 = Long.MAX_VALUE;
              localObject4 = a(d, e, l1);
              if ((localObject4 == null) || (b == null)) {
                continue;
              }
              localObject4 = (at)b.get();
              if (localObject4 == null) {
                continue;
              }
              if ((w) && (f.b() != 0)) {
                ((at)localObject4).a();
              }
              locala = E;
              locala.a((at)localObject4, true);
              j = d;
              if (j == 0) {
                continue;
              }
            }
            try
            {
              e.a("RV Nested Prefetch");
              at.r localr = F;
              at.a locala1 = l;
              d = 1;
              e = locala1.a();
              f = false;
              g = false;
              h = false;
              i = false;
              j = 0;
              if (j < d * 2)
              {
                a((at)localObject4, c[j], l2);
                j += 2;
                continue;
                l1 = l2;
                continue;
              }
              e.a();
              a = false;
              b = 0;
              c = 0;
              d = null;
              e = 0;
              i += 1;
              continue;
            }
            finally
            {
              e.a();
            }
          }
        }
        c = 0L;
      }
      finally
      {
        c = 0L;
        e.a();
      }
      e.a();
      return;
      label703:
      break label725;
      label706:
      break label712;
      label709:
      continue;
      label712:
      j += 1;
      continue;
      label719:
      boolean bool = false;
      continue;
      label725:
      j += 1;
    }
  }
  
  static final class a
    implements at.g.a
  {
    int a;
    int b;
    int[] c;
    int d;
    
    final void a()
    {
      if (c != null) {
        Arrays.fill(c, -1);
      }
      d = 0;
    }
    
    public final void a(int paramInt1, int paramInt2)
    {
      if (paramInt1 < 0) {
        throw new IllegalArgumentException("Layout positions must be non-negative");
      }
      if (paramInt2 < 0) {
        throw new IllegalArgumentException("Pixel distance must be non-negative");
      }
      int i = d * 2;
      if (c == null)
      {
        c = new int[4];
        Arrays.fill(c, -1);
      }
      for (;;)
      {
        c[i] = paramInt1;
        c[(i + 1)] = paramInt2;
        d += 1;
        return;
        if (i >= c.length)
        {
          int[] arrayOfInt = c;
          c = new int[i * 2];
          System.arraycopy(arrayOfInt, 0, c, 0, arrayOfInt.length);
        }
      }
    }
    
    final void a(at paramat, boolean paramBoolean)
    {
      d = 0;
      if (c != null) {
        Arrays.fill(c, -1);
      }
      at.g localg = m;
      if ((l != null) && (localg != null) && (y))
      {
        if (!paramBoolean) {
          break label101;
        }
        if (!e.d()) {
          localg.a(l.a(), this);
        }
      }
      for (;;)
      {
        if (d > z)
        {
          z = d;
          A = paramBoolean;
          d.b();
        }
        return;
        label101:
        if (!paramat.n()) {
          localg.a(a, b, F, this);
        }
      }
    }
    
    final boolean a(int paramInt)
    {
      boolean bool2 = false;
      boolean bool1 = bool2;
      int j;
      int i;
      if (c != null)
      {
        j = d;
        i = 0;
      }
      for (;;)
      {
        bool1 = bool2;
        if (i < j * 2)
        {
          if (c[i] == paramInt) {
            bool1 = true;
          }
        }
        else {
          return bool1;
        }
        i += 2;
      }
    }
  }
  
  static final class b
  {
    public boolean a;
    public int b;
    public int c;
    public at d;
    public int e;
  }
}


/* Location:              android/support/v7/widget/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */