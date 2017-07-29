package com.google.android.gms.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class fy
  implements Cloneable
{
  List<gd> a = new ArrayList();
  private fw<?, ?> b;
  private Object c;
  
  private byte[] b()
  {
    byte[] arrayOfByte = new byte[a()];
    a(fu.a(arrayOfByte, arrayOfByte.length));
    return arrayOfByte;
  }
  
  private fy c()
  {
    fy localfy = new fy();
    try
    {
      b = b;
      if (a == null) {
        a = null;
      }
      for (;;)
      {
        if (c == null) {
          return localfy;
        }
        if (!(c instanceof gb)) {
          break;
        }
        c = ((gb)((gb)c).clone());
        return localfy;
        a.addAll(a);
      }
      if (!(c instanceof byte[])) {
        break label117;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    c = ((byte[])c).clone();
    return localCloneNotSupportedException;
    label117:
    Object localObject1;
    Object localObject2;
    int i;
    if ((c instanceof byte[][]))
    {
      localObject1 = (byte[][])c;
      localObject2 = new byte[localObject1.length][];
      c = localObject2;
      i = 0;
      while (i < localObject1.length)
      {
        localObject2[i] = ((byte[])localObject1[i].clone());
        i += 1;
      }
    }
    if ((c instanceof boolean[]))
    {
      c = ((boolean[])c).clone();
      return localCloneNotSupportedException;
    }
    if ((c instanceof int[]))
    {
      c = ((int[])c).clone();
      return localCloneNotSupportedException;
    }
    if ((c instanceof long[]))
    {
      c = ((long[])c).clone();
      return localCloneNotSupportedException;
    }
    if ((c instanceof float[]))
    {
      c = ((float[])c).clone();
      return localCloneNotSupportedException;
    }
    if ((c instanceof double[]))
    {
      c = ((double[])c).clone();
      return localCloneNotSupportedException;
    }
    if ((c instanceof gb[]))
    {
      localObject1 = (gb[])c;
      localObject2 = new gb[localObject1.length];
      c = localObject2;
      i = 0;
      while (i < localObject1.length)
      {
        localObject2[i] = ((gb)localObject1[i].clone());
        i += 1;
      }
    }
    return localCloneNotSupportedException;
  }
  
  final int a()
  {
    int j;
    if (c != null)
    {
      j = b.a(c);
      return j;
    }
    Iterator localIterator = a.iterator();
    gd localgd;
    for (int i = 0;; i = b.length + (j + 0) + i)
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
      localgd = (gd)localIterator.next();
      j = fu.d(a);
    }
  }
  
  final void a(fu paramfu)
  {
    if (c != null) {
      b.a(c, paramfu);
    }
    for (;;)
    {
      return;
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext())
      {
        gd localgd = (gd)localIterator.next();
        paramfu.c(a);
        paramfu.b(b);
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!(paramObject instanceof fy));
      paramObject = (fy)paramObject;
      if ((c == null) || (c == null)) {
        break;
      }
      bool1 = bool2;
    } while (b != b);
    if (!b.b.isArray()) {
      return c.equals(c);
    }
    if ((c instanceof byte[])) {
      return Arrays.equals((byte[])c, (byte[])c);
    }
    if ((c instanceof int[])) {
      return Arrays.equals((int[])c, (int[])c);
    }
    if ((c instanceof long[])) {
      return Arrays.equals((long[])c, (long[])c);
    }
    if ((c instanceof float[])) {
      return Arrays.equals((float[])c, (float[])c);
    }
    if ((c instanceof double[])) {
      return Arrays.equals((double[])c, (double[])c);
    }
    if ((c instanceof boolean[])) {
      return Arrays.equals((boolean[])c, (boolean[])c);
    }
    return Arrays.deepEquals((Object[])c, (Object[])c);
    if ((a != null) && (a != null)) {
      return a.equals(a);
    }
    try
    {
      bool1 = Arrays.equals(b(), ((fy)paramObject).b());
      return bool1;
    }
    catch (IOException paramObject)
    {
      throw new IllegalStateException((Throwable)paramObject);
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(b());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
}


/* Location:              com/google/android/gms/b/fy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */