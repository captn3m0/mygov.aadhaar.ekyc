package com.google.android.gms.b;

import java.io.IOException;
import java.lang.reflect.Array;

public final class fw
{
  protected final int a;
  protected final Class b;
  public final int c;
  protected final boolean d;
  
  private int b(Object paramObject)
  {
    int i = ge.b(c);
    int j = a;
    switch (j)
    {
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      j = a;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(24);
      String str = "Unknown type " + j;
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    case 10: 
      paramObject = (gb)paramObject;
      i = fu.b(i) * 2;
      j = ((gb)paramObject).f();
      i += j;
    }
    for (;;)
    {
      return i;
      paramObject = (gb)paramObject;
      i = fu.b(i, (gb)paramObject);
    }
  }
  
  private void b(Object paramObject, fu paramfu)
  {
    try
    {
      i = c;
      paramfu.c(i);
      i = a;
      switch (i)
      {
      default: 
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        j = a;
        int k = 24;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(k);
        Object localObject1 = "Unknown type ";
        localObject1 = localStringBuilder.append((String)localObject1);
        localObject2 = ((StringBuilder)localObject1).append(j);
        localObject2 = ((StringBuilder)localObject2).toString();
        localIllegalArgumentException.<init>((String)localObject2);
        throw localIllegalArgumentException;
      }
    }
    catch (IOException localIOException)
    {
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localIOException);
      throw ((Throwable)localObject2);
    }
    paramObject = (gb)paramObject;
    int i = c;
    i = ge.b(i);
    ((gb)paramObject).a(paramfu);
    int j = 4;
    paramfu.c(i, j);
    for (;;)
    {
      return;
      paramObject = (gb)paramObject;
      paramfu.a((gb)paramObject);
    }
  }
  
  final int a(Object paramObject)
  {
    int i = 0;
    int j = d;
    if (j != 0)
    {
      int m = Array.getLength(paramObject);
      j = 0;
      while (j < m)
      {
        Object localObject = Array.get(paramObject, j);
        if (localObject != null)
        {
          localObject = Array.get(paramObject, j);
          int n = b(localObject);
          i += n;
        }
        int k;
        j += 1;
      }
    }
    i = b(paramObject);
    return i;
  }
  
  final void a(Object paramObject, fu paramfu)
  {
    int i = d;
    if (i != 0)
    {
      int k = Array.getLength(paramObject);
      i = 0;
      while (i < k)
      {
        Object localObject = Array.get(paramObject, i);
        if (localObject != null) {
          b(localObject, paramfu);
        }
        int j;
        i += 1;
      }
    }
    b(paramObject, paramfu);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof fw;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (fw)paramObject;
        int i = a;
        int j = a;
        if (i == j)
        {
          Class localClass1 = b;
          Class localClass2 = b;
          if (localClass1 == localClass2)
          {
            i = c;
            j = c;
            if (i == j)
            {
              boolean bool3 = d;
              boolean bool4 = d;
              if (bool3 == bool4) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public final int hashCode()
  {
    int i = (a + 1147) * 31;
    Class localClass = b;
    int k = localClass.hashCode();
    i = (i + k) * 31;
    k = c;
    k = (i + k) * 31;
    int j = d;
    if (j != 0) {}
    for (j = 1;; j = 0) {
      return j + k;
    }
  }
}


/* Location:              com/google/android/gms/b/fw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */