package android.support.v7.widget;

final class f$b
{
  int a;
  int b;
  Object c;
  int d;
  
  f$b(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    a = paramInt1;
    b = paramInt2;
    d = paramInt3;
    c = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    int i = 1;
    if (this == paramObject) {}
    for (;;)
    {
      return i;
      Object localObject1;
      Object localObject2;
      if (paramObject != null)
      {
        localObject1 = getClass();
        localObject2 = paramObject.getClass();
        if (localObject1 == localObject2) {}
      }
      else
      {
        i = 0;
        continue;
      }
      paramObject = (b)paramObject;
      int j = a;
      int m = a;
      if (j != m)
      {
        i = 0;
      }
      else
      {
        j = a;
        int n = 8;
        if (j == n)
        {
          j = d;
          int i1 = b;
          j = Math.abs(j - i1);
          if (j == i)
          {
            k = d;
            i2 = b;
            if (k == i2)
            {
              k = b;
              i2 = d;
              if (k == i2) {
                continue;
              }
            }
          }
        }
        int k = d;
        int i2 = d;
        if (k != i2)
        {
          i = 0;
        }
        else
        {
          k = b;
          i2 = b;
          if (k != i2)
          {
            i = 0;
          }
          else
          {
            localObject1 = c;
            if (localObject1 != null)
            {
              localObject1 = c;
              localObject2 = c;
              boolean bool = localObject1.equals(localObject2);
              if (!bool) {
                i = 0;
              }
            }
            else
            {
              localObject1 = c;
              if (localObject1 != null) {
                i = 0;
              }
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = a * 31;
    int j = b;
    i = (i + j) * 31;
    j = d;
    return i + j;
  }
  
  public final String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    int i = System.identityHashCode(this);
    Object localObject2 = Integer.toHexString(i);
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = ((StringBuilder)localObject1).append("[");
    int j = a;
    switch (j)
    {
    default: 
      localObject1 = "??";
    }
    for (;;)
    {
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(",s:");
      i = b;
      localObject1 = ((StringBuilder)localObject1).append(i).append("c:");
      i = d;
      localObject1 = ((StringBuilder)localObject1).append(i).append(",p:");
      localObject2 = c;
      return localObject2 + "]";
      localObject1 = "add";
      continue;
      localObject1 = "rm";
      continue;
      localObject1 = "up";
      continue;
      localObject1 = "mv";
    }
  }
}


/* Location:              android/support/v7/widget/f$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */