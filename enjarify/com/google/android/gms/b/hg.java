package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class hg
{
  final Object a;
  int b;
  List c;
  
  public hg()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    c = ((List)localObject);
  }
  
  public final hf a()
  {
    Object localObject1 = null;
    int n;
    for (int i = 0;; i = n)
    {
      for (;;)
      {
        synchronized (a)
        {
          Object localObject3 = c;
          int j = ((List)localObject3).size();
          if (j == 0)
          {
            localObject3 = "Queue empty";
            tp.b((String)localObject3);
            return (hf)localObject1;
          }
          localObject3 = c;
          j = ((List)localObject3).size();
          m = 2;
          if (j >= m)
          {
            n = -1 << -1;
            localObject3 = c;
            Iterator localIterator = ((List)localObject3).iterator();
            m = 0;
            ??? = null;
            k = localIterator.hasNext();
            if (k != 0)
            {
              localObject3 = localIterator.next();
              localObject3 = (hf)localObject3;
              int i1 = e;
              if (i1 <= n) {
                break;
              }
              i = i1;
              localObject8 = localObject3;
              k = m;
              m += 1;
              n = i;
              localObject1 = localObject8;
              i = k;
              continue;
            }
            localObject3 = c;
            ((List)localObject3).remove(i);
          }
        }
        Object localObject5 = c;
        int m = 0;
        ??? = null;
        localObject5 = ((List)localObject5).get(0);
        localObject5 = (hf)localObject5;
        synchronized (a)
        {
          i = e + -100;
          e = i;
          localObject1 = localObject5;
        }
      }
      int k = i;
      Object localObject8 = localObject1;
    }
  }
  
  public final boolean a(hf paramhf)
  {
    synchronized (a)
    {
      List localList = c;
      boolean bool = localList.contains(paramhf);
      if (bool)
      {
        bool = true;
        return bool;
      }
      bool = false;
      localList = null;
    }
  }
  
  public final boolean b(hf paramhf)
  {
    boolean bool1 = true;
    synchronized (a)
    {
      Object localObject2 = c;
      Iterator localIterator = ((List)localObject2).iterator();
      Object localObject4;
      kd localkd;
      boolean bool3;
      do
      {
        do
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break label260;
          }
          localObject2 = localIterator.next();
          localObject2 = (hf)localObject2;
          localObject4 = ke.ac;
          localkd = w.q();
          localObject4 = localkd.a((jz)localObject4);
          localObject4 = (Boolean)localObject4;
          bool3 = ((Boolean)localObject4).booleanValue();
          if (!bool3) {
            break;
          }
          localObject4 = w.i();
          bool3 = ((tj)localObject4).a();
          if (bool3) {
            break;
          }
        } while (paramhf == localObject2);
        localObject2 = f;
        localObject4 = f;
        bool2 = ((String)localObject2).equals(localObject4);
      } while (!bool2);
      localIterator.remove();
      for (boolean bool2 = bool1;; bool2 = bool1)
      {
        return bool2;
        localObject4 = ke.ae;
        localkd = w.q();
        localObject4 = localkd.a((jz)localObject4);
        localObject4 = (Boolean)localObject4;
        bool3 = ((Boolean)localObject4).booleanValue();
        if (!bool3) {
          break;
        }
        localObject4 = w.i();
        bool3 = ((tj)localObject4).b();
        if ((bool3) || (paramhf == localObject2)) {
          break;
        }
        localObject2 = h;
        localObject4 = h;
        bool2 = ((String)localObject2).equals(localObject4);
        if (!bool2) {
          break;
        }
        localIterator.remove();
      }
      label260:
      bool2 = false;
      localObject2 = null;
    }
  }
}


/* Location:              com/google/android/gms/b/hg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */