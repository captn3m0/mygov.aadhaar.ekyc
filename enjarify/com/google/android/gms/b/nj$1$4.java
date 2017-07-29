package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;

final class nj$1$4
  implements Runnable
{
  nj$1$4(nj.1 param1, ng paramng) {}
  
  public final void run()
  {
    Object localObject1 = b.c;
    synchronized (a)
    {
      localObject1 = b;
      localObject1 = b;
      int i = ((nj.d)localObject1).b();
      int j = -1;
      if (i != j)
      {
        localObject1 = b;
        localObject1 = b;
        i = ((nj.d)localObject1).b();
        j = 1;
        if (i != j) {}
      }
      else
      {
        return;
      }
      localObject1 = b;
      localObject1 = b;
      ((nj.d)localObject1).a();
      w.e();
      localObject1 = new com/google/android/gms/b/nj$1$4$1;
      ((nj.1.4.1)localObject1).<init>(this);
      tt.a((Runnable)localObject1);
      localObject1 = "Could not receive loaded message in a timely manner. Rejecting.";
      tp.a((String)localObject1);
    }
  }
}


/* Location:              com/google/android/gms/b/nj$1$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */