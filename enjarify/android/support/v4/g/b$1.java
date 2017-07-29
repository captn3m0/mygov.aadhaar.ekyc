package android.support.v4.g;

import java.util.Map;

final class b$1
  extends h
{
  b$1(b paramb) {}
  
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
    return a.g[paramInt1];
  }
  
  protected final Object a(int paramInt, Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("not a map");
    throw localUnsupportedOperationException;
  }
  
  protected final void a(int paramInt)
  {
    a.a(paramInt);
  }
  
  protected final void a(Object paramObject1, Object paramObject2)
  {
    a.add(paramObject1);
  }
  
  protected final int b(Object paramObject)
  {
    return a.a(paramObject);
  }
  
  protected final Map b()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("not a map");
    throw localUnsupportedOperationException;
  }
  
  protected final void c()
  {
    a.clear();
  }
}


/* Location:              android/support/v4/g/b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */