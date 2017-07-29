package android.support.v4.g;

public final class i
{
  public final Object a;
  public final Object b;
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof i;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (i)paramObject;
      Object localObject1 = a;
      Object localObject2 = a;
      bool2 = a(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = b;
        localObject2 = b;
        bool2 = a(localObject1, localObject2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = a;
    int j;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      Object localObject3 = b;
      if (localObject3 != null) {
        break label48;
      }
    }
    for (;;)
    {
      return j ^ i;
      localObject2 = a;
      j = localObject2.hashCode();
      break;
      label48:
      localObject1 = b;
      i = localObject1.hashCode();
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Pair{");
    String str = String.valueOf(a);
    localStringBuilder = localStringBuilder.append(str).append(" ");
    str = String.valueOf(b);
    return str + "}";
  }
}


/* Location:              android/support/v4/g/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */