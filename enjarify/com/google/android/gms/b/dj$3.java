package com.google.android.gms.b;

import com.google.android.gms.common.internal.safeparcel.a;

final class dj$3
  implements Runnable
{
  dj$3(dj paramdj, boolean paramBoolean, do paramdo) {}
  
  public final void run()
  {
    Object localObject1 = c;
    Object localObject2 = b;
    if (localObject2 == null)
    {
      localObject1 = c.u().a;
      localObject2 = "Discarding data. Failed to set user attribute";
      ((cu.a)localObject1).a((String)localObject2);
      return;
    }
    dj localdj = c;
    boolean bool = a;
    if (bool) {
      bool = false;
    }
    for (localObject1 = null;; localObject1 = b)
    {
      localdj.a((cq)localObject2, (a)localObject1);
      localObject1 = c;
      dj.c((dj)localObject1);
      break;
    }
  }
}


/* Location:              com/google/android/gms/b/dj$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */