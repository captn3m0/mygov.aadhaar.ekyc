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
  protected ArrayList f;
  protected o g;
  
  protected k(int paramInt)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    f = ((ArrayList)localObject);
    localObject = new org/a/o;
    ((o)localObject).<init>();
    g = ((o)localObject);
    e = paramInt;
  }
  
  final void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)0);
    byte[] arrayOfByte = a();
    paramByteBuffer.put(arrayOfByte);
  }
  
  protected final void a(g paramg)
  {
    g.add(paramg);
  }
  
  protected abstract byte[] a();
  
  abstract JSONObject b();
  
  protected abstract g c();
  
  protected Iterable d()
  {
    return f;
  }
  
  public boolean equals(Object paramObject)
  {
    try
    {
      paramObject = (k)paramObject;
      byte[] arrayOfByte1 = ((k)paramObject).a();
      byte[] arrayOfByte2 = a();
      bool = Arrays.equals(arrayOfByte1, arrayOfByte2);
    }
    catch (ClassCastException localClassCastException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */