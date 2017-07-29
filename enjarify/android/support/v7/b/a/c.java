package android.support.v7.b.a;

import java.lang.reflect.Array;

final class c
{
  static
  {
    Class localClass = c.class;
    boolean bool = localClass.desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      a = bool;
      return;
      bool = false;
      localClass = null;
    }
  }
  
  private static int a(int paramInt)
  {
    int i = 4;
    if (paramInt <= i) {}
    for (i = 8;; i = paramInt * 2) {
      return i;
    }
  }
  
  public static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    boolean bool = a;
    Object localObject;
    if (!bool)
    {
      i = paramArrayOfInt.length;
      if (paramInt1 > i)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int i = paramInt1 + 1;
    int j = paramArrayOfInt.length;
    if (i > j)
    {
      i = a(paramInt1);
      localObject = new int[i];
      System.arraycopy(paramArrayOfInt, 0, localObject, 0, paramInt1);
      paramArrayOfInt = (int[])localObject;
    }
    paramArrayOfInt[paramInt1] = paramInt2;
    return paramArrayOfInt;
  }
  
  public static Object[] a(Object[] paramArrayOfObject, int paramInt, Object paramObject)
  {
    boolean bool = a;
    Object localObject;
    if (!bool)
    {
      i = paramArrayOfObject.length;
      if (paramInt > i)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    int i = paramInt + 1;
    int j = paramArrayOfObject.length;
    if (i > j)
    {
      localObject = paramArrayOfObject.getClass().getComponentType();
      j = a(paramInt);
      localObject = (Object[])Array.newInstance((Class)localObject, j);
      System.arraycopy(paramArrayOfObject, 0, localObject, 0, paramInt);
    }
    for (;;)
    {
      localObject[paramInt] = paramObject;
      return (Object[])localObject;
      localObject = paramArrayOfObject;
    }
  }
}


/* Location:              android/support/v7/b/a/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */