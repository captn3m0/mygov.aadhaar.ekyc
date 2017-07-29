package com.google.android.gms.b;

public final class nj$c
  extends uw
{
  final nj.d a;
  private final Object e;
  private boolean f;
  
  public nj$c(nj.d paramd)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    e = localObject;
    a = paramd;
  }
  
  public final void g_()
  {
    synchronized (e)
    {
      boolean bool = f;
      if (bool) {
        return;
      }
      bool = true;
      f = bool;
      Object localObject2 = new com/google/android/gms/b/nj$c$1;
      ((nj.c.1)localObject2).<init>();
      Object localObject4 = new com/google/android/gms/b/uv$b;
      ((uv.b)localObject4).<init>();
      a((uv.c)localObject2, (uv.a)localObject4);
      localObject2 = new com/google/android/gms/b/nj$c$2;
      ((nj.c.2)localObject2).<init>(this);
      localObject4 = new com/google/android/gms/b/nj$c$3;
      ((nj.c.3)localObject4).<init>(this);
      a((uv.c)localObject2, (uv.a)localObject4);
    }
  }
}


/* Location:              com/google/android/gms/b/nj$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */