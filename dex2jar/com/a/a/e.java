package com.a.a;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class e
  implements o
{
  private final Executor a;
  
  public e(final Handler paramHandler)
  {
    a = new Executor()
    {
      public final void execute(Runnable paramAnonymousRunnable)
      {
        paramHandler.post(paramAnonymousRunnable);
      }
    };
  }
  
  public final void a(l<?> paraml, n<?> paramn)
  {
    a(paraml, paramn, null);
  }
  
  public final void a(l<?> paraml, n<?> paramn, Runnable paramRunnable)
  {
    i = true;
    paraml.a("post-response");
    a.execute(new a(paraml, paramn, paramRunnable));
  }
  
  public final void a(l<?> paraml, s params)
  {
    paraml.a("post-error");
    params = n.a(params);
    a.execute(new a(paraml, params, null));
  }
  
  private final class a
    implements Runnable
  {
    private final l b;
    private final n c;
    private final Runnable d;
    
    public a(l paraml, n paramn, Runnable paramRunnable)
    {
      b = paraml;
      c = paramn;
      d = paramRunnable;
    }
    
    public final void run()
    {
      if (b.h) {
        b.b("canceled-at-delivery");
      }
      label50:
      label91:
      label124:
      label134:
      for (;;)
      {
        return;
        int i;
        if (c.c == null)
        {
          i = 1;
          if (i == 0) {
            break label91;
          }
          b.a(c.a);
          if (!c.d) {
            break label124;
          }
          b.a("intermediate-response");
        }
        for (;;)
        {
          if (d == null) {
            break label134;
          }
          d.run();
          return;
          i = 0;
          break;
          l locall = b;
          s locals = c.c;
          if (d == null) {
            break label50;
          }
          d.a(locals);
          break label50;
          b.b("done");
        }
      }
    }
  }
}


/* Location:              com/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */