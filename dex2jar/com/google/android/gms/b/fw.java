package com.google.android.gms.b;

import java.io.IOException;
import java.lang.reflect.Array;

public final class fw<M extends fv<M>, T>
{
  protected final int a;
  protected final Class<T> b;
  public final int c;
  protected final boolean d;
  
  private int b(Object paramObject)
  {
    int i = ge.b(c);
    switch (a)
    {
    default: 
      i = a;
      throw new IllegalArgumentException(24 + "Unknown type " + i);
    case 10: 
      paramObject = (gb)paramObject;
      return fu.b(i) * 2 + ((gb)paramObject).f();
    }
    return fu.b(i, (gb)paramObject);
  }
  
  private void b(Object paramObject, fu paramfu)
  {
    for (;;)
    {
      try
      {
        paramfu.c(c);
        switch (a)
        {
        case 10: 
          i = a;
          throw new IllegalArgumentException(24 + "Unknown type " + i);
        }
      }
      catch (IOException paramObject)
      {
        throw new IllegalStateException((Throwable)paramObject);
      }
      paramObject = (gb)paramObject;
      int i = ge.b(c);
      ((gb)paramObject).a(paramfu);
      paramfu.c(i, 4);
      return;
      paramfu.a((gb)paramObject);
      return;
    }
  }
  
  final int a(Object paramObject)
  {
    int i = 0;
    if (d)
    {
      int m = Array.getLength(paramObject);
      int j = 0;
      for (;;)
      {
        k = i;
        if (j >= m) {
          break;
        }
        k = i;
        if (Array.get(paramObject, j) != null) {
          k = i + b(Array.get(paramObject, j));
        }
        j += 1;
        i = k;
      }
    }
    int k = b(paramObject);
    return k;
  }
  
  final void a(Object paramObject, fu paramfu)
  {
    if (d)
    {
      int j = Array.getLength(paramObject);
      int i = 0;
      while (i < j)
      {
        Object localObject = Array.get(paramObject, i);
        if (localObject != null) {
          b(localObject, paramfu);
        }
        i += 1;
      }
    }
    b(paramObject, paramfu);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof fw)) {
        return false;
      }
      paramObject = (fw)paramObject;
    } while ((a == a) && (b == b) && (c == c) && (d == d));
    return false;
  }
  
  public final int hashCode()
  {
    int j = a;
    int k = b.hashCode();
    int m = c;
    if (d) {}
    for (int i = 1;; i = 0) {
      return i + (((j + 1147) * 31 + k) * 31 + m) * 31;
    }
  }
}


/* Location:              com/google/android/gms/b/fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */