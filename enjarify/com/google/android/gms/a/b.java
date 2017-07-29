package com.google.android.gms.a;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class b
  extends a.a
{
  private final Object a;
  
  private b(Object paramObject)
  {
    a = paramObject;
  }
  
  public static a a(Object paramObject)
  {
    b localb = new com/google/android/gms/a/b;
    localb.<init>(paramObject);
    return localb;
  }
  
  public static Object a(a parama)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    boolean bool2 = parama instanceof b;
    if (bool2)
    {
      parama = (b)parama;
      localObject1 = a;
      return localObject1;
    }
    IBinder localIBinder = parama.asBinder();
    Object localObject2 = localIBinder.getClass();
    Field[] arrayOfField = ((Class)localObject2).getDeclaredFields();
    int m = 0;
    Object localObject3 = null;
    int n = arrayOfField.length;
    int i1 = 0;
    StringBuilder localStringBuilder = null;
    label68:
    if (i1 < n)
    {
      localObject2 = arrayOfField[i1];
      boolean bool3 = ((Field)localObject2).isSynthetic();
      if (bool3) {
        break label239;
      }
      j += 1;
    }
    for (;;)
    {
      m = i1 + 1;
      i1 = m;
      localObject3 = localObject2;
      break label68;
      if (j == i)
      {
        boolean bool1 = ((Field)localObject3).isAccessible();
        if (!bool1)
        {
          ((Field)localObject3).setAccessible(i);
          try
          {
            localObject1 = ((Field)localObject3).get(localIBinder);
          }
          catch (NullPointerException localNullPointerException)
          {
            localObject2 = new java/lang/IllegalArgumentException;
            ((IllegalArgumentException)localObject2).<init>("Binder object is null.", localNullPointerException);
            throw ((Throwable)localObject2);
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            localObject2 = new java/lang/IllegalArgumentException;
            ((IllegalArgumentException)localObject2).<init>("Could not access the field in remoteBinder.", localIllegalAccessException);
            throw ((Throwable)localObject2);
          }
        }
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("IObjectWrapper declared field not private!");
        throw localIllegalArgumentException;
      }
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      int k = arrayOfField.length;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(64);
      localObject2 = "Unexpected number of IObjectWrapper declared fields: " + k;
      localIllegalArgumentException.<init>((String)localObject2);
      throw localIllegalArgumentException;
      label239:
      localObject2 = localObject3;
    }
  }
}


/* Location:              com/google/android/gms/a/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */