package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

public abstract class at$e
{
  private ArrayList a;
  at.e.a h = null;
  long i;
  long j;
  long k;
  long l;
  
  public at$e()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    a = localArrayList;
    i = l2;
    j = l2;
    k = l1;
    l = l1;
  }
  
  static int d(at.u paramu)
  {
    int m = -1;
    int n = at.u.f(paramu) & 0xE;
    boolean bool = paramu.j();
    if (bool) {
      n = 4;
    }
    for (;;)
    {
      return n;
      int i1 = n & 0x4;
      if (i1 == 0)
      {
        i1 = d;
        int i2 = paramu.d();
        if ((i1 != m) && (i2 != m) && (i1 != i2)) {
          n |= 0x800;
        }
      }
    }
  }
  
  public abstract void a();
  
  public abstract boolean a(at.u paramu, at.e.b paramb1, at.e.b paramb2);
  
  public abstract boolean a(at.u paramu1, at.u paramu2, at.e.b paramb1, at.e.b paramb2);
  
  public boolean a(at.u paramu, List paramList)
  {
    return f(paramu);
  }
  
  public abstract boolean b();
  
  public abstract boolean b(at.u paramu, at.e.b paramb1, at.e.b paramb2);
  
  public abstract void c(at.u paramu);
  
  public abstract boolean c(at.u paramu, at.e.b paramb1, at.e.b paramb2);
  
  public abstract void d();
  
  public final void e()
  {
    int m = a.size();
    int n = 0;
    while (n < m)
    {
      ArrayList localArrayList = a;
      localArrayList.get(n);
      n += 1;
    }
    a.clear();
  }
  
  public final void e(at.u paramu)
  {
    at.e.a locala = h;
    if (locala != null)
    {
      locala = h;
      locala.a(paramu);
    }
  }
  
  public boolean f(at.u paramu)
  {
    return true;
  }
}


/* Location:              android/support/v7/widget/at$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */