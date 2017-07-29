package com.google.android.gms.b;

final class dj$a$3
  implements Runnable
{
  dj$a$3(dj.a parama, cq paramcq) {}
  
  public final void run()
  {
    synchronized (b)
    {
      Object localObject1 = b;
      dj.a.a((dj.a)localObject1);
      localObject1 = b;
      localObject1 = c;
      boolean bool = ((dj)localObject1).x();
      if (!bool)
      {
        localObject1 = b;
        localObject1 = c;
        localObject1 = ((dj)localObject1).u();
        localObject1 = f;
        Object localObject3 = "Connected to remote service";
        ((cu.a)localObject1).a((String)localObject3);
        localObject1 = b;
        localObject1 = c;
        localObject3 = a;
        ((dj)localObject1).a((cq)localObject3);
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/dj$a$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */