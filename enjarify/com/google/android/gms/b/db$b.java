package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;

final class db$b
  implements Thread.UncaughtExceptionHandler
{
  private final String b;
  
  public db$b(db paramdb, String paramString)
  {
    c.a(paramString);
    b = paramString;
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    try
    {
      Object localObject1 = a;
      localObject1 = ((db)localObject1).u();
      localObject1 = a;
      String str = b;
      ((cu.a)localObject1).a(str, paramThrowable);
      return;
    }
    finally {}
  }
}


/* Location:              com/google/android/gms/b/db$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */