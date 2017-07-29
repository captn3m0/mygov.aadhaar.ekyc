package android.support.v4.g;

public final class j$c
  extends j.b
{
  private final Object a;
  
  public j$c()
  {
    super(12);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public final Object a()
  {
    synchronized (a)
    {
      Object localObject2 = super.a();
      return localObject2;
    }
  }
  
  public final boolean a(Object paramObject)
  {
    synchronized (a)
    {
      boolean bool = super.a(paramObject);
      return bool;
    }
  }
}


/* Location:              android/support/v4/g/j$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */