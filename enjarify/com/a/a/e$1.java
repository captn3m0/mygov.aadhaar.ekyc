package com.a.a;

import android.os.Handler;
import java.util.concurrent.Executor;

final class e$1
  implements Executor
{
  e$1(e parame, Handler paramHandler) {}
  
  public final void execute(Runnable paramRunnable)
  {
    a.post(paramRunnable);
  }
}


/* Location:              com/a/a/e$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */