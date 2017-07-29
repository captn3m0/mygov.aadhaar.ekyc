package com.google.android.gms.b;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.internal.b;
import java.util.Arrays;

public final class wn
{
  public final a a;
  private final boolean b;
  private final int c;
  private final a.a d;
  
  public wn(a parama)
  {
    b = true;
    a = parama;
    d = null;
    int i = System.identityHashCode(this);
    c = i;
  }
  
  public wn(a parama, a.a parama1)
  {
    b = false;
    a = parama;
    d = parama1;
    Object[] arrayOfObject = new Object[2];
    a locala = a;
    arrayOfObject[0] = locala;
    a.a locala1 = d;
    arrayOfObject[1] = locala1;
    int i = Arrays.hashCode(arrayOfObject);
    c = i;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof wn;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (wn)paramObject;
        bool2 = b;
        if (!bool2)
        {
          bool2 = b;
          if (!bool2)
          {
            Object localObject1 = a;
            Object localObject2 = a;
            bool2 = b.a(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = d;
              localObject2 = d;
              bool2 = b.a(localObject1, localObject2);
              if (bool2) {
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
    return c;
  }
}


/* Location:              com/google/android/gms/b/wn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */