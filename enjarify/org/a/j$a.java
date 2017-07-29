package org.a;

import org.a.e.b;

final class j$a
{
  private byte[] b;
  
  private j$a(j paramj, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = 4;
    if (i != j)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>();
      throw localIllegalArgumentException;
    }
    b = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof a;
    if (bool)
    {
      i = paramObject.hashCode();
      int k = hashCode();
      if (i != k) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public final int hashCode()
  {
    return b.c(b);
  }
}


/* Location:              org/a/j$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */