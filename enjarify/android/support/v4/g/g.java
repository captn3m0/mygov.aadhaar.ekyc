package android.support.v4.g;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class g
{
  private final LinkedHashMap a;
  private int b;
  private int c = 6;
  private int d;
  private int e;
  private int f;
  private int g;
  
  public g()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(0, 0.75F, true);
    a = localLinkedHashMap;
  }
  
  private void a(int paramInt)
  {
    for (;;)
    {
      try
      {
        int i = b;
        Object localObject1;
        if (i >= 0)
        {
          localObject1 = a;
          boolean bool1 = ((LinkedHashMap)localObject1).isEmpty();
          if (bool1)
          {
            j = b;
            if (j == 0) {}
          }
        }
        else
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          Object localObject5 = getClass();
          localObject5 = ((Class)localObject5).getName();
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject5 = ".sizeOf() is reporting inconsistent results!";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).toString();
          ((IllegalStateException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
      }
      finally {}
      int j = b;
      if (j > paramInt)
      {
        localObject3 = a;
        boolean bool2 = ((LinkedHashMap)localObject3).isEmpty();
        if (!bool2) {}
      }
      else
      {
        return;
      }
      Object localObject3 = a;
      localObject3 = ((LinkedHashMap)localObject3).entrySet();
      localObject3 = ((Set)localObject3).iterator();
      localObject3 = ((Iterator)localObject3).next();
      localObject3 = (Map.Entry)localObject3;
      Object localObject4 = ((Map.Entry)localObject3).getKey();
      ((Map.Entry)localObject3).getValue();
      localObject3 = a;
      ((LinkedHashMap)localObject3).remove(localObject4);
      int k = b + -1;
      b = k;
      k = e + 1;
      e = k;
    }
  }
  
  /* Error */
  public final Object a(Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +15 -> 16
    //   4: new 95	java/lang/NullPointerException
    //   7: astore_2
    //   8: aload_2
    //   9: ldc 97
    //   11: invokespecial 98	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   14: aload_2
    //   15: athrow
    //   16: aload_0
    //   17: monitorenter
    //   18: aload_0
    //   19: getfield 30	android/support/v4/g/g:a	Ljava/util/LinkedHashMap;
    //   22: astore_2
    //   23: aload_2
    //   24: aload_1
    //   25: invokevirtual 101	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   28: astore_2
    //   29: aload_2
    //   30: ifnull +19 -> 49
    //   33: aload_0
    //   34: getfield 103	android/support/v4/g/g:f	I
    //   37: iconst_1
    //   38: iadd
    //   39: istore_3
    //   40: aload_0
    //   41: iload_3
    //   42: putfield 103	android/support/v4/g/g:f	I
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_2
    //   48: areturn
    //   49: aload_0
    //   50: getfield 105	android/support/v4/g/g:g	I
    //   53: iconst_1
    //   54: iadd
    //   55: istore 4
    //   57: aload_0
    //   58: iload 4
    //   60: putfield 105	android/support/v4/g/g:g	I
    //   63: aload_0
    //   64: monitorexit
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore_2
    //   70: goto -23 -> 47
    //   73: astore_2
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_2
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	g
    //   0	78	1	paramObject	Object
    //   7	63	2	localObject1	Object
    //   73	4	2	localObject2	Object
    //   39	3	3	i	int
    //   55	12	4	j	int
    // Exception table:
    //   from	to	target	type
    //   18	22	73	finally
    //   24	28	73	finally
    //   33	37	73	finally
    //   41	45	73	finally
    //   45	47	73	finally
    //   49	53	73	finally
    //   58	63	73	finally
    //   63	65	73	finally
    //   74	76	73	finally
  }
  
  public final Object a(Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    if (paramObject1 == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("key == null || value == null");
      throw ((Throwable)localObject1);
    }
    try
    {
      int i = d + 1;
      d = i;
      i = b + 1;
      b = i;
      localObject1 = a;
      localObject1 = ((LinkedHashMap)localObject1).put(paramObject1, paramObject2);
      if (localObject1 != null)
      {
        j = b + -1;
        b = j;
      }
      int j = c;
      a(j);
      return localObject1;
    }
    finally {}
  }
  
  public final String toString()
  {
    int i = 0;
    Object localObject1 = null;
    try
    {
      int j = f;
      int k = g;
      j += k;
      if (j != 0)
      {
        i = f * 100;
        i /= j;
      }
      String str = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]";
      k = 4;
      Object[] arrayOfObject = new Object[k];
      int m = 0;
      int n = c;
      Integer localInteger = Integer.valueOf(n);
      arrayOfObject[0] = localInteger;
      m = 1;
      n = f;
      localInteger = Integer.valueOf(n);
      arrayOfObject[m] = localInteger;
      m = 2;
      n = g;
      localInteger = Integer.valueOf(n);
      arrayOfObject[m] = localInteger;
      m = 3;
      localObject1 = Integer.valueOf(i);
      arrayOfObject[m] = localObject1;
      localObject1 = String.format(str, arrayOfObject);
      return (String)localObject1;
    }
    finally {}
  }
}


/* Location:              android/support/v4/g/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */