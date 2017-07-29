package android.support.v7.app;

import android.content.res.Resources.NotFoundException;

final class h$1
  implements Thread.UncaughtExceptionHandler
{
  h$1(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool1 = paramThrowable instanceof Resources.NotFoundException;
    Object localObject2;
    String str;
    if (bool1)
    {
      localObject2 = ((Throwable)paramThrowable).getMessage();
      if (localObject2 != null)
      {
        str = "drawable";
        boolean bool2 = ((String)localObject2).contains(str);
        if (!bool2)
        {
          str = "Drawable";
          bool1 = ((String)localObject2).contains(str);
          if (!bool1) {}
        }
        else
        {
          i = 1;
        }
      }
    }
    if (i != 0)
    {
      localObject1 = new android/content/res/Resources$NotFoundException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = ((Throwable)paramThrowable).getMessage();
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
      localObject2 = str;
      ((Resources.NotFoundException)localObject1).<init>((String)localObject2);
      localObject2 = ((Throwable)paramThrowable).getCause();
      ((Throwable)localObject1).initCause((Throwable)localObject2);
      localObject2 = ((Throwable)paramThrowable).getStackTrace();
      ((Throwable)localObject1).setStackTrace((StackTraceElement[])localObject2);
      localObject2 = a;
      ((Thread.UncaughtExceptionHandler)localObject2).uncaughtException(paramThread, (Throwable)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = a;
      ((Thread.UncaughtExceptionHandler)localObject1).uncaughtException(paramThread, (Throwable)paramThrowable);
    }
  }
}


/* Location:              android/support/v7/app/h$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */