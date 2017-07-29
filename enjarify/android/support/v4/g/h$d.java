package android.support.v4.g;

import java.util.Iterator;
import java.util.Map.Entry;

final class h$d
  implements Iterator, Map.Entry
{
  int a;
  int b;
  boolean c = false;
  
  h$d(h paramh)
  {
    int i = paramh.a() + -1;
    a = i;
    b = -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    int i = 1;
    boolean bool1 = false;
    IllegalStateException localIllegalStateException = null;
    boolean bool2 = c;
    if (!bool2)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("This container does not support retaining Map.Entry objects");
      throw localIllegalStateException;
    }
    bool2 = paramObject instanceof Map.Entry;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (Map.Entry)paramObject;
      Object localObject1 = ((Map.Entry)paramObject).getKey();
      Object localObject2 = d;
      int j = b;
      localObject2 = ((h)localObject2).a(j, 0);
      bool2 = c.a(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = ((Map.Entry)paramObject).getValue();
        localObject2 = d;
        j = b;
        localObject2 = ((h)localObject2).a(j, i);
        bool2 = c.a(localObject1, localObject2);
        if (bool2) {
          bool1 = i;
        }
      }
    }
  }
  
  public final Object getKey()
  {
    boolean bool = c;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("This container does not support retaining Map.Entry objects");
      throw ((Throwable)localObject);
    }
    Object localObject = d;
    int i = b;
    return ((h)localObject).a(i, 0);
  }
  
  public final Object getValue()
  {
    boolean bool = c;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("This container does not support retaining Map.Entry objects");
      throw ((Throwable)localObject);
    }
    Object localObject = d;
    int i = b;
    return ((h)localObject).a(i, 1);
  }
  
  public final boolean hasNext()
  {
    int i = b;
    int k = a;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final int hashCode()
  {
    int i = 0;
    IllegalStateException localIllegalStateException = null;
    int j = c;
    if (j == 0)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("This container does not support retaining Map.Entry objects");
      throw localIllegalStateException;
    }
    Object localObject1 = d;
    int m = b;
    localObject1 = ((h)localObject1).a(m, 0);
    Object localObject2 = d;
    int n = b;
    int i1 = 1;
    localObject2 = ((h)localObject2).a(n, i1);
    if (localObject1 == null)
    {
      j = 0;
      localObject1 = null;
      if (localObject2 != null) {
        break label101;
      }
    }
    for (;;)
    {
      return i ^ j;
      int k = localObject1.hashCode();
      break;
      label101:
      i = localObject2.hashCode();
    }
  }
  
  public final void remove()
  {
    boolean bool = c;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    Object localObject = d;
    int j = b;
    ((h)localObject).a(j);
    int i = b + -1;
    b = i;
    i = a + -1;
    a = i;
    c = false;
  }
  
  public final Object setValue(Object paramObject)
  {
    boolean bool = c;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("This container does not support retaining Map.Entry objects");
      throw ((Throwable)localObject);
    }
    Object localObject = d;
    int i = b;
    return ((h)localObject).a(i, paramObject);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getKey();
    localStringBuilder = localStringBuilder.append(localObject).append("=");
    localObject = getValue();
    return (String)localObject;
  }
}


/* Location:              android/support/v4/g/h$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */