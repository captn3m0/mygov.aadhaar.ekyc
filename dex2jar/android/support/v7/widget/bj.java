package android.support.v7.widget;

import android.support.v4.g.a;
import android.support.v4.g.f;
import android.support.v4.g.j.a;
import android.support.v4.g.j.b;

final class bj
{
  final a<at.u, a> a = new a();
  final f<at.u> b = new f();
  
  final at.e.b a(at.u paramu, int paramInt)
  {
    Object localObject2 = null;
    int i = a.a(paramu);
    Object localObject1;
    if (i < 0) {
      localObject1 = localObject2;
    }
    a locala;
    do
    {
      do
      {
        return (at.e.b)localObject1;
        locala = (a)a.c(i);
        localObject1 = localObject2;
      } while (locala == null);
      localObject1 = localObject2;
    } while ((a & paramInt) == 0);
    a &= (paramInt ^ 0xFFFFFFFF);
    if (paramInt == 4) {}
    for (paramu = b;; paramu = c)
    {
      localObject1 = paramu;
      if ((a & 0xC) != 0) {
        break;
      }
      a.d(i);
      a.a(locala);
      return paramu;
      if (paramInt != 8) {
        break label129;
      }
    }
    label129:
    throw new IllegalArgumentException("Must provide flag PRE or POST");
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
    a locala2 = (a)a.get(paramu);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.a();
      a.put(paramu, locala1);
    }
    b = paramb;
    a |= 0x4;
  }
  
  final void a(b paramb)
  {
    int i = a.size() - 1;
    if (i >= 0)
    {
      at.u localu = (at.u)a.b(i);
      a locala = (a)a.d(i);
      if ((a & 0x3) == 3) {
        paramb.a(localu);
      }
      for (;;)
      {
        a.a(locala);
        i -= 1;
        break;
        if ((a & 0x1) != 0)
        {
          if (b == null) {
            paramb.a(localu);
          } else {
            paramb.a(localu, b, c);
          }
        }
        else if ((a & 0xE) == 14) {
          paramb.b(localu, b, c);
        } else if ((a & 0xC) == 12) {
          paramb.c(localu, b, c);
        } else if ((a & 0x4) != 0) {
          paramb.a(localu, b, null);
        } else if ((a & 0x8) != 0) {
          paramb.b(localu, b, c);
        } else {
          int j = a;
        }
      }
    }
  }
  
  final boolean a(at.u paramu)
  {
    paramu = (a)a.get(paramu);
    return (paramu != null) && ((a & 0x1) != 0);
  }
  
  final void b(at.u paramu)
  {
    a locala2 = (a)a.get(paramu);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.a();
      a.put(paramu, locala1);
    }
    a |= 0x1;
  }
  
  final void b(at.u paramu, at.e.b paramb)
  {
    a locala2 = (a)a.get(paramu);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.a();
      a.put(paramu, locala1);
    }
    c = paramb;
    a |= 0x8;
  }
  
  final void c(at.u paramu)
  {
    paramu = (a)a.get(paramu);
    if (paramu == null) {
      return;
    }
    a &= 0xFFFFFFFE;
  }
  
  final void d(at.u paramu)
  {
    int i = b.a() - 1;
    for (;;)
    {
      if (i >= 0)
      {
        if (paramu != b.a(i)) {
          break label78;
        }
        f localf = b;
        if (d[i] != f.a)
        {
          d[i] = f.a;
          b = true;
        }
      }
      paramu = (a)a.remove(paramu);
      if (paramu != null) {
        a.a(paramu);
      }
      return;
      label78:
      i -= 1;
    }
  }
  
  static final class a
  {
    static j.a<a> d = new j.b(20);
    int a;
    at.e.b b;
    at.e.b c;
    
    static a a()
    {
      a locala2 = (a)d.a();
      a locala1 = locala2;
      if (locala2 == null) {
        locala1 = new a();
      }
      return locala1;
    }
    
    static void a(a parama)
    {
      a = 0;
      b = null;
      c = null;
      d.a(parama);
    }
    
    static void b()
    {
      while (d.a() != null) {}
    }
  }
  
  static abstract interface b
  {
    public abstract void a(at.u paramu);
    
    public abstract void a(at.u paramu, at.e.b paramb1, at.e.b paramb2);
    
    public abstract void b(at.u paramu, at.e.b paramb1, at.e.b paramb2);
    
    public abstract void c(at.u paramu, at.e.b paramb1, at.e.b paramb2);
  }
}


/* Location:              android/support/v7/widget/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */