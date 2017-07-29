package android.support.v4.g;

public class j$b
  implements j.a
{
  private final Object[] a;
  private int b;
  
  public j$b(int paramInt)
  {
    if (paramInt <= 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The max pool size must be > 0");
      throw ((Throwable)localObject);
    }
    Object localObject = new Object[paramInt];
    a = ((Object[])localObject);
  }
  
  public Object a()
  {
    int i = 0;
    int j = b;
    Object localObject;
    if (j > 0)
    {
      j = b;
      int k = j + -1;
      localObject = a[k];
      Object[] arrayOfObject = a;
      arrayOfObject[k] = null;
      i = b + -1;
      b = i;
    }
    for (;;)
    {
      return localObject;
      j = 0;
      localObject = null;
    }
  }
  
  public boolean a(Object paramObject)
  {
    int i = 1;
    int j = 0;
    int k = 0;
    Object localObject1 = null;
    int m = b;
    if (k < m)
    {
      localObject2 = a[k];
      if (localObject2 == paramObject) {
        k = i;
      }
    }
    for (;;)
    {
      if (k == 0) {
        break label79;
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Already in the pool!");
      throw ((Throwable)localObject1);
      k += 1;
      break;
      k = 0;
      localObject1 = null;
    }
    label79:
    k = b;
    Object localObject2 = a;
    m = localObject2.length;
    if (k < m)
    {
      localObject1 = a;
      j = b;
      localObject1[j] = paramObject;
      k = b + 1;
      b = k;
      j = i;
    }
    return j;
  }
}


/* Location:              android/support/v4/g/j$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */