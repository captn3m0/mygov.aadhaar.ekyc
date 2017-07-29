package android.support.v4.g;

public final class i<F, S>
{
  public final F a;
  public final S b;
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof i)) {}
    do
    {
      return false;
      paramObject = (i)paramObject;
    } while ((!a(a, a)) || (!a(b, b)));
    return true;
  }
  
  public final int hashCode()
  {
    int j = 0;
    int i;
    if (a == null)
    {
      i = 0;
      if (b != null) {
        break label33;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = a.hashCode();
      break;
      label33:
      j = b.hashCode();
    }
  }
  
  public final String toString()
  {
    return "Pair{" + String.valueOf(a) + " " + String.valueOf(b) + "}";
  }
}


/* Location:              android/support/v4/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */