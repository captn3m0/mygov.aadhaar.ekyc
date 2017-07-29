package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@qi
public final class hg
{
  final Object a = new Object();
  int b;
  List<hf> c = new LinkedList();
  
  public final hf a()
  {
    Object localObject1 = null;
    int k = 0;
    for (;;)
    {
      int i;
      synchronized (a)
      {
        if (c.size() == 0)
        {
          tp.b("Queue empty");
          return null;
        }
        if (c.size() >= 2)
        {
          j = Integer.MIN_VALUE;
          Iterator localIterator = c.iterator();
          i = 0;
          if (localIterator.hasNext())
          {
            localhf = (hf)localIterator.next();
            m = e;
            if (m <= j) {
              break label192;
            }
            k = m;
            localObject1 = localhf;
            j = i;
            break label203;
          }
          c.remove(k);
          return (hf)localObject1;
        }
      }
      hf localhf = (hf)c.get(0);
      synchronized (a)
      {
        e -= 100;
        return localhf;
      }
      label192:
      int m = j;
      int j = k;
      k = m;
      label203:
      i += 1;
      m = k;
      k = j;
      j = m;
    }
  }
  
  public final boolean a(hf paramhf)
  {
    synchronized (a)
    {
      return c.contains(paramhf);
    }
  }
  
  public final boolean b(hf paramhf)
  {
    synchronized (a)
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        hf localhf = (hf)localIterator.next();
        jz localjz = ke.ac;
        if ((((Boolean)w.q().a(localjz)).booleanValue()) && (!w.i().a()))
        {
          if ((paramhf != localhf) && (f.equals(f)))
          {
            localIterator.remove();
            return true;
          }
        }
        else
        {
          localjz = ke.ae;
          if ((((Boolean)w.q().a(localjz)).booleanValue()) && (!w.i().b()) && (paramhf != localhf) && (h.equals(h)))
          {
            localIterator.remove();
            return true;
          }
        }
      }
      return false;
    }
  }
}


/* Location:              com/google/android/gms/b/hg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */