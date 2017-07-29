package android.support.v4.g;

public final class j
{
  public static abstract interface a<T>
  {
    public abstract T a();
    
    public abstract boolean a(T paramT);
  }
  
  public static class b<T>
    implements j.a<T>
  {
    private final Object[] a;
    private int b;
    
    public b(int paramInt)
    {
      if (paramInt <= 0) {
        throw new IllegalArgumentException("The max pool size must be > 0");
      }
      a = new Object[paramInt];
    }
    
    public T a()
    {
      if (b > 0)
      {
        int i = b - 1;
        Object localObject = a[i];
        a[i] = null;
        b -= 1;
        return (T)localObject;
      }
      return null;
    }
    
    public boolean a(T paramT)
    {
      boolean bool = false;
      int i = 0;
      if (i < b) {
        if (a[i] != paramT) {}
      }
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label50;
        }
        throw new IllegalStateException("Already in the pool!");
        i += 1;
        break;
      }
      label50:
      if (b < a.length)
      {
        a[b] = paramT;
        b += 1;
        bool = true;
      }
      return bool;
    }
  }
  
  public static final class c<T>
    extends j.b<T>
  {
    private final Object a = new Object();
    
    public c()
    {
      super();
    }
    
    public final T a()
    {
      synchronized (a)
      {
        Object localObject2 = super.a();
        return (T)localObject2;
      }
    }
    
    public final boolean a(T paramT)
    {
      synchronized (a)
      {
        boolean bool = super.a(paramT);
        return bool;
      }
    }
  }
}


/* Location:              android/support/v4/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */