package android.support.v7.widget;

import android.support.v4.g.a;
import android.support.v4.g.f;

final class bj
{
  final a a;
  final f b;
  
  bj()
  {
    Object localObject = new android/support/v4/g/a;
    ((a)localObject).<init>();
    a = ((a)localObject);
    localObject = new android/support/v4/g/f;
    ((f)localObject).<init>();
    b = ((f)localObject);
  }
  
  final at.e.b a(at.u paramu, int paramInt)
  {
    int i = 0;
    at.e.b localb = null;
    Object localObject = a;
    int j = ((a)localObject).a(paramu);
    if (j < 0) {}
    do
    {
      do
      {
        return localb;
        localObject = (bj.a)a.c(j);
      } while (localObject == null);
      k = a & paramInt;
    } while (k == 0);
    i = a;
    int k = paramInt ^ 0xFFFFFFFF;
    i &= k;
    a = i;
    i = 4;
    if (paramInt == i) {}
    for (localb = b;; localb = c)
    {
      k = a & 0xC;
      if (k != 0) {
        break;
      }
      a locala = a;
      locala.d(j);
      bj.a.a((bj.a)localObject);
      break;
      i = 8;
      if (paramInt != i) {
        break label151;
      }
    }
    label151:
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("Must provide flag PRE or POST");
    throw ((Throwable)localObject);
  }
  
  final void a()
  {
    a.clear();
    b.b();
  }
  
  final void a(long paramLong, at.u paramu)
  {
    b.a(paramLong, paramu);
  }
  
  final void a(at.u paramu, at.e.b paramb)
  {
    bj.a locala = (bj.a)a.get(paramu);
    if (locala == null)
    {
      locala = bj.a.a();
      a locala1 = a;
      locala1.put(paramu, locala);
    }
    b = paramb;
    int i = a | 0x4;
    a = i;
  }
  
  final void a(bj.b paramb)
  {
    Object localObject = a;
    int i = ((a)localObject).size() + -1;
    int j = i;
    if (j >= 0)
    {
      localObject = (at.u)a.b(j);
      bj.a locala = (bj.a)a.d(j);
      int k = a & 0x3;
      int m = 3;
      if (k == m) {
        paramb.a((at.u)localObject);
      }
      for (;;)
      {
        bj.a.a(locala);
        i = j + -1;
        j = i;
        break;
        k = a & 0x1;
        at.e.b localb1;
        at.e.b localb2;
        if (k != 0)
        {
          localb1 = b;
          if (localb1 == null)
          {
            paramb.a((at.u)localObject);
          }
          else
          {
            localb1 = b;
            localb2 = c;
            paramb.a((at.u)localObject, localb1, localb2);
          }
        }
        else
        {
          k = a & 0xE;
          m = 14;
          if (k == m)
          {
            localb1 = b;
            localb2 = c;
            paramb.b((at.u)localObject, localb1, localb2);
          }
          else
          {
            k = a & 0xC;
            m = 12;
            if (k == m)
            {
              localb1 = b;
              localb2 = c;
              paramb.c((at.u)localObject, localb1, localb2);
            }
            else
            {
              k = a & 0x4;
              if (k != 0)
              {
                localb1 = b;
                m = 0;
                localb2 = null;
                paramb.a((at.u)localObject, localb1, null);
              }
              else
              {
                k = a & 0x8;
                if (k != 0)
                {
                  localb1 = b;
                  localb2 = c;
                  paramb.b((at.u)localObject, localb1, localb2);
                }
                else
                {
                  i = a;
                }
              }
            }
          }
        }
      }
    }
  }
  
  final boolean a(at.u paramu)
  {
    bj.a locala = (bj.a)a.get(paramu);
    int i;
    if (locala != null)
    {
      i = a & 0x1;
      if (i != 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      locala = null;
    }
  }
  
  final void b(at.u paramu)
  {
    bj.a locala = (bj.a)a.get(paramu);
    if (locala == null)
    {
      locala = bj.a.a();
      a locala1 = a;
      locala1.put(paramu, locala);
    }
    int i = a | 0x1;
    a = i;
  }
  
  final void b(at.u paramu, at.e.b paramb)
  {
    bj.a locala = (bj.a)a.get(paramu);
    if (locala == null)
    {
      locala = bj.a.a();
      a locala1 = a;
      locala1.put(paramu, locala);
    }
    c = paramb;
    int i = a | 0x8;
    a = i;
  }
  
  final void c(at.u paramu)
  {
    bj.a locala = (bj.a)a.get(paramu);
    if (locala == null) {}
    for (;;)
    {
      return;
      int i = a & 0xFFFFFFFE;
      a = i;
    }
  }
  
  final void d(at.u paramu)
  {
    Object localObject1 = b;
    int i = ((f)localObject1).a() + -1;
    for (;;)
    {
      if (i >= 0)
      {
        Object localObject2 = b.a(i);
        if (paramu != localObject2) {
          break label106;
        }
        localObject2 = b;
        Object localObject3 = d[i];
        Object localObject4 = f.a;
        if (localObject3 != localObject4)
        {
          localObject3 = d;
          localObject4 = f.a;
          localObject3[i] = localObject4;
          i = 1;
          b = i;
        }
      }
      localObject1 = (bj.a)a.remove(paramu);
      if (localObject1 != null) {
        bj.a.a((bj.a)localObject1);
      }
      return;
      label106:
      i += -1;
    }
  }
}


/* Location:              android/support/v7/widget/bj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */