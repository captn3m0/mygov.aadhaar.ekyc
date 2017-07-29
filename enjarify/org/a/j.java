package org.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.a.c.a;
import org.a.d.d;
import org.a.d.d.a;
import org.a.d.e;

abstract class j
{
  public static final byte[] a;
  final h b;
  i c;
  final HashMap d;
  final HashMap e;
  
  static
  {
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = 0;
    a = arrayOfByte;
  }
  
  public j(e parame)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    d = ((HashMap)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    e = ((HashMap)localObject1);
    localObject1 = h.a(parame.a());
    b = ((h)localObject1);
    localObject1 = b.b;
    boolean bool1 = a((org.a.a.b)localObject1);
    Object localObject3;
    Object localObject4;
    if (!bool1)
    {
      localObject1 = new org/a/b/c;
      localObject2 = new Object[1];
      localObject3 = b.b;
      localObject2[0] = localObject3;
      localObject4 = a.a("Keyczar.UnacceptablePurpose", (Object[])localObject2);
      ((org.a.b.c)localObject1).<init>((String)localObject4);
      throw ((Throwable)localObject1);
    }
    localObject1 = b;
    bool1 = e;
    if (bool1)
    {
      bool1 = parame instanceof org.a.d.b;
      if (!bool1)
      {
        localObject1 = new org/a/b/c;
        localObject2 = new Object[0];
        localObject4 = a.a("Keyczar.NeedEncryptedReader", (Object[])localObject2);
        ((org.a.b.c)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = b.d;
    Object localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (i)((Iterator)localObject2).next();
      localObject4 = a;
      localObject3 = org.a.a.c.a;
      if (localObject4 == localObject3)
      {
        localObject4 = c;
        if (localObject4 != null)
        {
          localObject1 = new org/a/b/c;
          localObject2 = new Object[0];
          localObject4 = a.a("Keyczar.SinglePrimary", (Object[])localObject2);
          ((org.a.b.c)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
        c = ((i)localObject1);
      }
      int i = b;
      localObject4 = ((e)parame).a(i);
      localObject3 = b.c.b().a((String)localObject4);
      localObject4 = ((k)localObject3).a();
      a((byte[])localObject4, (k)localObject3);
      localObject4 = ((k)localObject3).d();
      Iterator localIterator = ((Iterable)localObject4).iterator();
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = (byte[])localIterator.next();
        a((byte[])localObject4, (k)localObject3);
      }
      localObject4 = d;
      ((HashMap)localObject4).put(localObject1, localObject3);
    }
  }
  
  private void a(byte[] paramArrayOfByte, k paramk)
  {
    j.a locala = new org/a/j$a;
    locala.<init>(this, paramArrayOfByte, (byte)0);
    Object localObject = e.get(locala);
    if (localObject == null)
    {
      localObject = e;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      ((HashMap)localObject).put(locala, localArrayList);
    }
    ((ArrayList)e.get(locala)).add(paramk);
  }
  
  final k a()
  {
    Object localObject = c;
    if (localObject == null) {}
    i locali;
    for (localObject = null;; localObject = (k)((HashMap)localObject).get(locali))
    {
      return (k)localObject;
      localObject = d;
      locali = c;
    }
  }
  
  abstract boolean a(org.a.a.b paramb);
  
  public String toString()
  {
    return b.toString();
  }
}


/* Location:              org/a/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */