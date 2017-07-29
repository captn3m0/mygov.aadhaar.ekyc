package com.google.android.gms.c;

import java.util.Queue;

final class g
{
  final Object a;
  Queue b;
  private boolean c;
  
  g()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public final void a(b paramb)
  {
    for (;;)
    {
      synchronized (a)
      {
        Object localObject2 = b;
        if (localObject2 != null)
        {
          bool = c;
          if (!bool) {}
        }
        else
        {
          return;
        }
        boolean bool = true;
        c = bool;
        synchronized (a)
        {
          localObject2 = b;
          localObject2 = ((Queue)localObject2).poll();
          localObject2 = (f)localObject2;
          if (localObject2 == null)
          {
            bool = false;
            localObject2 = null;
            c = false;
          }
        }
      }
      ((f)localObject4).a(paramb);
    }
  }
}


/* Location:              com/google/android/gms/c/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */