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
  public static final byte[] a = { 0 };
  final h b;
  i c;
  final HashMap<i, k> d = new HashMap();
  final HashMap<a, ArrayList<k>> e = new HashMap();
  
  public j(e parame)
  {
    b = h.a(parame.a());
    if (!a(b.b)) {
      throw new org.a.b.c(a.a("Keyczar.UnacceptablePurpose", new Object[] { b.b }));
    }
    if ((b.e) && (!(parame instanceof org.a.d.b))) {
      throw new org.a.b.c(a.a("Keyczar.NeedEncryptedReader", new Object[0]));
    }
    Iterator localIterator1 = b.d.iterator();
    while (localIterator1.hasNext())
    {
      i locali = (i)localIterator1.next();
      if (a == org.a.a.c.a)
      {
        if (c != null) {
          throw new org.a.b.c(a.a("Keyczar.SinglePrimary", new Object[0]));
        }
        c = locali;
      }
      Object localObject = parame.a(b);
      localObject = b.c.b().a((String)localObject);
      a(((k)localObject).a(), (k)localObject);
      Iterator localIterator2 = ((k)localObject).d().iterator();
      while (localIterator2.hasNext()) {
        a((byte[])localIterator2.next(), (k)localObject);
      }
      d.put(locali, localObject);
    }
  }
  
  private void a(byte[] paramArrayOfByte, k paramk)
  {
    paramArrayOfByte = new a(paramArrayOfByte, (byte)0);
    if (e.get(paramArrayOfByte) == null) {
      e.put(paramArrayOfByte, new ArrayList());
    }
    ((ArrayList)e.get(paramArrayOfByte)).add(paramk);
  }
  
  final k a()
  {
    if (c == null) {
      return null;
    }
    return (k)d.get(c);
  }
  
  abstract boolean a(org.a.a.b paramb);
  
  public String toString()
  {
    return b.toString();
  }
  
  private final class a
  {
    private byte[] b;
    
    private a(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte.length != 4) {
        throw new IllegalArgumentException();
      }
      b = paramArrayOfByte;
    }
    
    public final boolean equals(Object paramObject)
    {
      return ((paramObject instanceof a)) && (paramObject.hashCode() == hashCode());
    }
    
    public final int hashCode()
    {
      return org.a.e.b.c(b);
    }
  }
}


/* Location:              org/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */