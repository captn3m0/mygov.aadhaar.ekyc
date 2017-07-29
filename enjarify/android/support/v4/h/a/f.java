package android.support.v4.h.a;

import android.os.Build.VERSION;

public final class f
{
  public static final f.c a;
  public final Object b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/a/f$d;
      ((f.d)localObject).<init>();
      a = (f.c)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 15;
      if (i >= j)
      {
        localObject = new android/support/v4/h/a/f$b;
        ((f.b)localObject).<init>();
        a = (f.c)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 14;
        if (i >= j)
        {
          localObject = new android/support/v4/h/a/f$a;
          ((f.a)localObject).<init>();
          a = (f.c)localObject;
        }
        else
        {
          localObject = new android/support/v4/h/a/f$e;
          ((f.e)localObject).<init>();
          a = (f.c)localObject;
        }
      }
    }
  }
  
  public f(Object paramObject)
  {
    b = paramObject;
  }
  
  public final void a(int paramInt)
  {
    f.c localc = a;
    Object localObject = b;
    localc.a(localObject, paramInt);
  }
  
  public final void a(boolean paramBoolean)
  {
    f.c localc = a;
    Object localObject = b;
    localc.a(localObject, paramBoolean);
  }
  
  public final void b(int paramInt)
  {
    f.c localc = a;
    Object localObject = b;
    localc.e(localObject, paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject == null)
      {
        bool1 = false;
      }
      else
      {
        Object localObject1 = getClass();
        Object localObject2 = paramObject.getClass();
        if (localObject1 != localObject2)
        {
          bool1 = false;
        }
        else
        {
          paramObject = (f)paramObject;
          localObject1 = b;
          if (localObject1 == null)
          {
            localObject1 = b;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = b;
            localObject2 = b;
            boolean bool2 = localObject1.equals(localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
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


/* Location:              android/support/v4/h/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */