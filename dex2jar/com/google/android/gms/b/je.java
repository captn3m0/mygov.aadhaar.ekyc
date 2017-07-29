package com.google.android.gms.b;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class je
  implements sf
{
  private final Executor a;
  
  public je(final Handler paramHandler)
  {
    a = new Executor()
    {
      public final void execute(Runnable paramAnonymousRunnable)
      {
        paramHandler.post(paramAnonymousRunnable);
      }
    };
  }
  
  public final void a(pc<?> parampc, re<?> paramre)
  {
    a(parampc, paramre, null);
  }
  
  public final void a(pc<?> parampc, re<?> paramre, Runnable paramRunnable)
  {
    h = true;
    parampc.a("post-response");
    a.execute(new a(parampc, paramre, paramRunnable));
  }
  
  public final void a(pc<?> parampc, vr paramvr)
  {
    parampc.a("post-error");
    paramvr = new re(paramvr);
    a.execute(new a(parampc, paramvr, null));
  }
  
  private final class a
    implements Runnable
  {
    private final pc b;
    private final re c;
    private final Runnable d;
    
    public a(pc parampc, re paramre, Runnable paramRunnable)
    {
      b = parampc;
      c = paramre;
      d = paramRunnable;
    }
    
    public final void run()
    {
      int i;
      if (c.c == null)
      {
        i = 1;
        if (i == 0) {
          break label71;
        }
        b.a(c.a);
        label30:
        if (!c.d) {
          break label104;
        }
        b.a("intermediate-response");
      }
      for (;;)
      {
        if (d != null) {
          d.run();
        }
        return;
        i = 0;
        break;
        label71:
        pc localpc = b;
        vr localvr = c.c;
        if (d == null) {
          break label30;
        }
        d.a(localvr);
        break label30;
        label104:
        b.b("done");
      }
    }
  }
}


/* Location:              com/google/android/gms/b/je.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */