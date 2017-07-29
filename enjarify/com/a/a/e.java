package com.a.a;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class e
  implements o
{
  private final Executor a;
  
  public e(Handler paramHandler)
  {
    e.1 local1 = new com/a/a/e$1;
    local1.<init>(this, paramHandler);
    a = local1;
  }
  
  public final void a(l paraml, n paramn)
  {
    a(paraml, paramn, null);
  }
  
  public final void a(l paraml, n paramn, Runnable paramRunnable)
  {
    i = true;
    paraml.a("post-response");
    Executor localExecutor = a;
    e.a locala = new com/a/a/e$a;
    locala.<init>(this, paraml, paramn, paramRunnable);
    localExecutor.execute(locala);
  }
  
  public final void a(l paraml, s params)
  {
    paraml.a("post-error");
    n localn = n.a(params);
    Executor localExecutor = a;
    e.a locala = new com/a/a/e$a;
    locala.<init>(this, paraml, localn, null);
    localExecutor.execute(locala);
  }
}


/* Location:              com/a/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */