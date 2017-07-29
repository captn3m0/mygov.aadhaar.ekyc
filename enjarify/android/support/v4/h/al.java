package android.support.v4.h;

import android.os.Build.VERSION;

public final class al
{
  public static final al.d a;
  public final Object b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/al$b;
      ((al.b)localObject).<init>();
      a = (al.d)localObject;
    }
    for (;;)
    {
      return;
      j = 20;
      if (i >= j)
      {
        localObject = new android/support/v4/h/al$a;
        ((al.a)localObject).<init>();
        a = (al.d)localObject;
      }
      else
      {
        localObject = new android/support/v4/h/al$c;
        ((al.c)localObject).<init>();
        a = (al.d)localObject;
      }
    }
  }
  
  al(Object paramObject)
  {
    b = paramObject;
  }
  
  static al a(Object paramObject)
  {
    al localal;
    if (paramObject == null) {
      localal = null;
    }
    for (;;)
    {
      return localal;
      localal = new android/support/v4/h/al;
      localal.<init>(paramObject);
    }
  }
  
  static Object a(al paramal)
  {
    if (paramal == null) {}
    for (Object localObject = null;; localObject = b) {
      return localObject;
    }
  }
  
  public final int a()
  {
    al.d locald = a;
    Object localObject = b;
    return locald.c(localObject);
  }
  
  public final int b()
  {
    al.d locald = a;
    Object localObject = b;
    return locald.e(localObject);
  }
  
  public final int c()
  {
    al.d locald = a;
    Object localObject = b;
    return locald.d(localObject);
  }
  
  public final int d()
  {
    al.d locald = a;
    Object localObject = b;
    return locald.b(localObject);
  }
  
  public final boolean e()
  {
    al.d locald = a;
    Object localObject = b;
    return locald.g(localObject);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    Object localObject1 = null;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      Object localObject3;
      if (paramObject != null)
      {
        localObject2 = getClass();
        Class localClass = paramObject.getClass();
        if (localObject2 == localClass) {}
      }
      else
      {
        bool = false;
        localObject3 = null;
        continue;
      }
      paramObject = (al)paramObject;
      Object localObject2 = b;
      if (localObject2 == null)
      {
        localObject2 = b;
        if (localObject2 != null)
        {
          bool = false;
          localObject3 = null;
        }
      }
      else
      {
        localObject3 = b;
        localObject1 = b;
        bool = localObject3.equals(localObject1);
      }
    }
  }
  
  public final int hashCode()
  {
    Object localObject = b;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = b;
      i = localObject.hashCode();
    }
  }
}


/* Location:              android/support/v4/h/al.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */