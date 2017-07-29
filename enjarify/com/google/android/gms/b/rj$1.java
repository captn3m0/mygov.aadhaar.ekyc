package com.google.android.gms.b;

import java.util.Map;

final class rj$1
  implements md
{
  rj$1(rj paramrj) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = a;
    for (;;)
    {
      synchronized (a)
      {
        localObject1 = a;
        localObject1 = d;
        boolean bool = ((up)localObject1).isDone();
        if (bool) {
          return;
        }
        localObject1 = a;
        localObject1 = b;
        localObject4 = "request_id";
        localObject4 = paramMap.get(localObject4);
        bool = ((String)localObject1).equals(localObject4);
        if (bool) {}
      }
      rm localrm = new com/google/android/gms/b/rm;
      int i = 1;
      localrm.<init>(i, paramMap);
      Object localObject4 = d;
      localObject4 = String.valueOf(localObject4);
      Object localObject5 = a;
      localObject5 = String.valueOf(localObject5);
      Object localObject6 = String.valueOf(localObject4);
      int j = ((String)localObject6).length() + 24;
      Object localObject7 = String.valueOf(localObject5);
      int k = ((String)localObject7).length();
      j += k;
      localObject7 = new java/lang/StringBuilder;
      ((StringBuilder)localObject7).<init>(j);
      localObject6 = "Invalid ";
      localObject6 = ((StringBuilder)localObject7).append((String)localObject6);
      localObject4 = ((StringBuilder)localObject6).append((String)localObject4);
      localObject6 = " request error: ";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject6);
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject4 = ((StringBuilder)localObject4).toString();
      tp.e((String)localObject4);
      localObject4 = a;
      localObject4 = d;
      ((up)localObject4).b(localrm);
    }
  }
}


/* Location:              com/google/android/gms/b/rj$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */