package com.google.android.gms.b;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class je
  implements sf
{
  private final Executor a;
  
  public je(Handler paramHandler)
  {
    je.1 local1 = new com/google/android/gms/b/je$1;
    local1.<init>(this, paramHandler);
    a = local1;
  }
  
  public final void a(pc parampc, re paramre)
  {
    a(parampc, paramre, null);
  }
  
  public final void a(pc parampc, re paramre, Runnable paramRunnable)
  {
    h = true;
    parampc.a("post-response");
    Executor localExecutor = a;
    je.a locala = new com/google/android/gms/b/je$a;
    locala.<init>(this, parampc, paramre, paramRunnable);
    localExecutor.execute(locala);
  }
  
  public final void a(pc parampc, vr paramvr)
  {
    parampc.a("post-error");
    re localre = new com/google/android/gms/b/re;
    localre.<init>(paramvr);
    Executor localExecutor = a;
    je.a locala = new com/google/android/gms/b/je$a;
    locala.<init>(this, parampc, localre, null);
    localExecutor.execute(locala);
  }
}


/* Location:              com/google/android/gms/b/je.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */