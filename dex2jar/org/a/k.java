package org.a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.a.d.g;
import org.a.e.b;
import org.json.JSONObject;

public abstract class k
{
  final int e;
  protected ArrayList<byte[]> f = new ArrayList();
  protected o<g> g = new o();
  
  protected k(int paramInt)
  {
    e = paramInt;
  }
  
  final void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)0);
    paramByteBuffer.put(a());
  }
  
  protected final void a(g paramg)
  {
    g.add(paramg);
  }
  
  protected abstract byte[] a();
  
  abstract JSONObject b();
  
  protected abstract g c();
  
  protected Iterable<byte[]> d()
  {
    return f;
  }
  
  public boolean equals(Object paramObject)
  {
    try
    {
      boolean bool = Arrays.equals(((k)paramObject).a(), a());
      return bool;
    }
    catch (ClassCastException paramObject) {}
    return false;
  }
  
  public int hashCode()
  {
    return b.c(a());
  }
  
  public String toString()
  {
    return b().toString();
  }
}


/* Location:              org/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */