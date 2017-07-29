package android.support.v4.g;

import java.util.Map;

final class a$1
  extends h
{
  a$1(a parama) {}
  
  protected final int a()
  {
    return a.h;
  }
  
  protected final int a(Object paramObject)
  {
    return a.a(paramObject);
  }
  
  protected final Object a(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = a.g;
    int i = (paramInt1 << 1) + paramInt2;
    return arrayOfObject[i];
  }
  
  protected final Object a(int paramInt, Object paramObject)
  {
    a locala = a;
    int i = (paramInt << 1) + 1;
    Object localObject = g[i];
    g[i] = paramObject;
    return localObject;
  }
  
  protected final void a(int paramInt)
  {
    a.d(paramInt);
  }
  
  protected final void a(Object paramObject1, Object paramObject2)
  {
    a.put(paramObject1, paramObject2);
  }
  
  protected final int b(Object paramObject)
  {
    return a.b(paramObject);
  }
  
  protected final Map b()
  {
    return a;
  }
  
  protected final void c()
  {
    a.clear();
  }
}


/* Location:              android/support/v4/g/a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */