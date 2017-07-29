package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

final class db$c
  extends FutureTask
  implements Comparable
{
  private final long b;
  private final boolean c;
  private final String d;
  
  db$c(db paramdb, Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, null);
    c.a(paramString);
    long l1 = db.z().getAndIncrement();
    b = l1;
    d = paramString;
    cu.a locala = null;
    c = false;
    l1 = b;
    long l2 = Long.MAX_VALUE;
    boolean bool = l1 < l2;
    if (!bool)
    {
      locala = ua;
      String str = "Tasks index overflow";
      locala.a(str);
    }
  }
  
  db$c(db paramdb, Callable paramCallable, boolean paramBoolean, String paramString)
  {
    super(paramCallable);
    c.a(paramString);
    Object localObject = db.z();
    long l1 = ((AtomicLong)localObject).getAndIncrement();
    b = l1;
    d = paramString;
    c = paramBoolean;
    l1 = b;
    long l2 = Long.MAX_VALUE;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = ua;
      String str = "Tasks index overflow";
      ((cu.a)localObject).a(str);
    }
  }
  
  protected final void setException(Throwable paramThrowable)
  {
    Object localObject1 = a.u().a;
    Object localObject2 = d;
    ((cu.a)localObject1).a((String)localObject2, paramThrowable);
    boolean bool = paramThrowable instanceof db.a;
    if (bool)
    {
      localObject1 = Thread.getDefaultUncaughtExceptionHandler();
      localObject2 = Thread.currentThread();
      ((Thread.UncaughtExceptionHandler)localObject1).uncaughtException((Thread)localObject2, (Throwable)paramThrowable);
    }
    super.setException((Throwable)paramThrowable);
  }
}


/* Location:              com/google/android/gms/b/db$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */