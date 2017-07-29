package android.support.v4.c;

import android.support.v4.g.d;

public final class c
{
  public int a;
  public c.b b;
  public c.a c;
  public boolean d;
  public boolean e;
  public boolean f;
  public boolean g;
  public boolean h;
  
  public final void a(c.a parama)
  {
    Object localObject = c;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No listener register");
      throw ((Throwable)localObject);
    }
    localObject = c;
    if (localObject != parama)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Attempting to unregister the wrong listener");
      throw ((Throwable)localObject);
    }
    c = null;
  }
  
  public final void a(c.b paramb)
  {
    Object localObject = b;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No listener register");
      throw ((Throwable)localObject);
    }
    localObject = b;
    if (localObject != paramb)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Attempting to unregister the wrong listener");
      throw ((Throwable)localObject);
    }
    b = null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    d.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    int i = a;
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              android/support/v4/c/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */