package com.google.android.gms.b;

public final class re<T>
{
  public final T a;
  public final dz.a b;
  public final vr c;
  public boolean d = false;
  
  re(vr paramvr)
  {
    a = null;
    b = null;
    c = paramvr;
  }
  
  private re(T paramT, dz.a parama)
  {
    a = paramT;
    b = parama;
    c = null;
  }
  
  public static <T> re<T> a(T paramT, dz.a parama)
  {
    return new re(paramT, parama);
  }
  
  public static abstract interface a
  {
    public abstract void a(vr paramvr);
  }
  
  public static abstract interface b<T>
  {
    public abstract void a(T paramT);
  }
}


/* Location:              com/google/android/gms/b/re.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */