package android.support.v4.g;

import java.util.Iterator;

final class h$a
  implements Iterator
{
  final int a;
  int b;
  int c;
  boolean d = false;
  
  h$a(h paramh, int paramInt)
  {
    a = paramInt;
    int i = paramh.a();
    b = i;
  }
  
  public final boolean hasNext()
  {
    int i = c;
    int k = b;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final Object next()
  {
    Object localObject = e;
    int i = c;
    int j = a;
    localObject = ((h)localObject).a(i, j);
    i = c + 1;
    c = i;
    d = true;
    return localObject;
  }
  
  public final void remove()
  {
    boolean bool = d;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int i = c + -1;
    c = i;
    i = b + -1;
    b = i;
    d = false;
    Object localObject = e;
    int j = c;
    ((h)localObject).a(j);
  }
}


/* Location:              android/support/v4/g/h$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */