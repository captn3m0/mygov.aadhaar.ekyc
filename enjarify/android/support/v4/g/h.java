package android.support.v4.g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class h
{
  h.b b;
  h.c c;
  h.e d;
  
  public static boolean a(Map paramMap, Collection paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      bool = paramCollection.contains(localObject);
      if (!bool) {
        localIterator.remove();
      }
    }
    int k = paramMap.size();
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean a(Set paramSet, Object paramObject)
  {
    boolean bool1 = true;
    if (paramSet == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Set;
      if (bool2)
      {
        paramObject = (Set)paramObject;
        try
        {
          int i = paramSet.size();
          int j = ((Set)paramObject).size();
          if (i == j)
          {
            boolean bool3 = paramSet.containsAll((Collection)paramObject);
            if (bool3) {
              continue;
            }
          }
          bool1 = false;
        }
        catch (NullPointerException localNullPointerException)
        {
          bool1 = false;
        }
        catch (ClassCastException localClassCastException)
        {
          bool1 = false;
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  protected abstract int a();
  
  protected abstract int a(Object paramObject);
  
  protected abstract Object a(int paramInt1, int paramInt2);
  
  protected abstract Object a(int paramInt, Object paramObject);
  
  protected abstract void a(int paramInt);
  
  protected abstract void a(Object paramObject1, Object paramObject2);
  
  public final Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    int i = a();
    int j = paramArrayOfObject.length;
    if (j < i) {}
    for (Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);; arrayOfObject = paramArrayOfObject)
    {
      int k = 0;
      while (k < i)
      {
        Object localObject = a(k, paramInt);
        arrayOfObject[k] = localObject;
        k += 1;
      }
      k = arrayOfObject.length;
      if (k > i)
      {
        k = 0;
        arrayOfObject[i] = null;
      }
      return arrayOfObject;
    }
  }
  
  protected abstract int b(Object paramObject);
  
  protected abstract Map b();
  
  public final Object[] b(int paramInt)
  {
    int i = a();
    Object[] arrayOfObject = new Object[i];
    int j = 0;
    while (j < i)
    {
      Object localObject = a(j, paramInt);
      arrayOfObject[j] = localObject;
      j += 1;
    }
    return arrayOfObject;
  }
  
  protected abstract void c();
  
  public final Set d()
  {
    h.c localc = c;
    if (localc == null)
    {
      localc = new android/support/v4/g/h$c;
      localc.<init>(this);
      c = localc;
    }
    return c;
  }
}


/* Location:              android/support/v4/g/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */