package com.google.android.gms.b;

final class cu$1
  implements Runnable
{
  cu$1(cu paramcu, String paramString) {}
  
  public final void run()
  {
    Object localObject = b.q.d();
    boolean bool = ((cy)localObject).I();
    if (!bool)
    {
      localObject = b;
      int i = 6;
      String str1 = "Persisted config not initialized. Not logging error/warn";
      ((cu)localObject).a(i, str1);
    }
    for (;;)
    {
      return;
      localObject = b;
      String str2 = a;
      ((cy.c)localObject).a(str2);
    }
  }
}


/* Location:              com/google/android/gms/b/cu$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */