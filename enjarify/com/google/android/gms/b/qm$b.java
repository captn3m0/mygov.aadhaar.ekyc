package com.google.android.gms.b;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;

public final class qm$b
  extends qm
  implements o.b, o.c
{
  protected qn a;
  private Context b;
  private un c;
  private uv d;
  private final ql.a e;
  private final Object f;
  private boolean g;
  
  public qm$b(Context paramContext, un paramun, uv paramuv, ql.a parama)
  {
    super(paramuv, parama);
    Object localObject1 = new java/lang/Object;
    localObject1.<init>();
    f = localObject1;
    b = paramContext;
    c = paramun;
    d = paramuv;
    e = parama;
    localObject1 = ke.N;
    Object localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool = ((Boolean)localObject1).booleanValue();
    if (bool)
    {
      bool = true;
      g = bool;
      localObject1 = w.u();
    }
    for (Looper localLooper = ((ub)localObject1).a();; localLooper = paramContext.getMainLooper())
    {
      localObject1 = new com/google/android/gms/b/qn;
      int i = c.c;
      localObject2 = paramContext;
      ((qn)localObject1).<init>(paramContext, localLooper, this, this, i);
      a = ((qn)localObject1);
      a.f_();
      return;
    }
  }
  
  public final void a()
  {
    c();
  }
  
  public final void a(int paramInt)
  {
    tp.b("Disconnected from remote ad request service.");
  }
  
  public final void a(a parama)
  {
    tp.b("Cannot connect to remote service, fallback to local instance.");
    Object localObject1 = new com/google/android/gms/b/qm$a;
    Context localContext = b;
    Object localObject2 = d;
    ql.a locala = e;
    ((qm.a)localObject1).<init>(localContext, (uv)localObject2, locala);
    ((tv)localObject1).c();
    localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    ((Bundle)localObject1).putString("action", "gms_connection_failed_fallback_to_local");
    w.e();
    localContext = b;
    localObject2 = c.a;
    tt.b(localContext, (String)localObject2, "gmob-apps", (Bundle)localObject1, true);
  }
  
  public final void d()
  {
    synchronized (f)
    {
      Object localObject2 = a;
      boolean bool = ((qn)localObject2).b();
      if (!bool)
      {
        localObject2 = a;
        bool = ((qn)localObject2).c();
        if (!bool) {}
      }
      else
      {
        localObject2 = a;
        ((qn)localObject2).a();
      }
      Binder.flushPendingCommands();
      bool = g;
      if (bool)
      {
        localObject2 = w.u();
        ((ub)localObject2).b();
        bool = false;
        localObject2 = null;
        g = false;
      }
      return;
    }
  }
  
  /* Error */
  public final qx e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 33	com/google/android/gms/b/qm$b:f	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 88	com/google/android/gms/b/qm$b:a	Lcom/google/android/gms/b/qn;
    //   11: astore_2
    //   12: aload_2
    //   13: invokevirtual 157	com/google/android/gms/b/qn:n	()Lcom/google/android/gms/b/qx;
    //   16: astore_2
    //   17: aload_1
    //   18: monitorexit
    //   19: aload_2
    //   20: areturn
    //   21: astore_2
    //   22: aconst_null
    //   23: astore_2
    //   24: aload_1
    //   25: monitorexit
    //   26: goto -7 -> 19
    //   29: astore_2
    //   30: aload_1
    //   31: monitorexit
    //   32: aload_2
    //   33: athrow
    //   34: astore_2
    //   35: goto -13 -> 22
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	b
    //   11	9	2	localObject2	Object
    //   21	1	2	localIllegalStateException	IllegalStateException
    //   23	1	2	localObject3	Object
    //   29	4	2	localObject4	Object
    //   34	1	2	localDeadObjectException	android.os.DeadObjectException
    // Exception table:
    //   from	to	target	type
    //   7	11	21	java/lang/IllegalStateException
    //   12	16	21	java/lang/IllegalStateException
    //   7	11	29	finally
    //   12	16	29	finally
    //   17	19	29	finally
    //   24	26	29	finally
    //   30	32	29	finally
    //   7	11	34	android/os/DeadObjectException
    //   12	16	34	android/os/DeadObjectException
  }
}


/* Location:              com/google/android/gms/b/qm$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */