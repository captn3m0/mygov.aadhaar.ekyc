package android.support.v4.c;

import android.support.v4.g.d;

public final class c<D>
{
  public int a;
  public b<D> b;
  public a<D> c;
  public boolean d;
  public boolean e;
  public boolean f;
  public boolean g;
  public boolean h;
  
  public final void a(a<D> parama)
  {
    if (c == null) {
      throw new IllegalStateException("No listener register");
    }
    if (c != parama) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    c = null;
  }
  
  public final void a(b<D> paramb)
  {
    if (b == null) {
      throw new IllegalStateException("No listener register");
    }
    if (b != paramb) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    b = null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    d.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static abstract interface a<D> {}
  
  public static abstract interface b<D> {}
}


/* Location:              android/support/v4/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */