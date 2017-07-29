package com.google.android.gms.b;

public final class ah$a
{
  private final Object a;
  private final String b;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof a;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (a)paramObject;
        Object localObject1 = a;
        Object localObject2 = a;
        if (localObject1 == localObject2)
        {
          localObject1 = b;
          localObject2 = b;
          bool2 = ((String)localObject1).equals(localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = System.identityHashCode(a) * 31;
    int j = b.hashCode();
    return i + j;
  }
}


/* Location:              com/google/android/gms/b/ah$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */