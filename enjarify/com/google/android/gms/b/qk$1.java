package com.google.android.gms.b;

final class qk$1
  implements Runnable
{
  qk$1(qk paramqk) {}
  
  public final void run()
  {
    Object localObject1 = a;
    synchronized (b)
    {
      localObject1 = a;
      localObject1 = e;
      if (localObject1 == null) {
        return;
      }
      localObject1 = a;
      ((qk)localObject1).c_();
      localObject1 = a;
      String str = "Timed out waiting for ad response.";
      int i = 2;
      ((qk)localObject1).a(i, str);
    }
  }
}


/* Location:              com/google/android/gms/b/qk$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */