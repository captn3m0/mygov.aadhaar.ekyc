package com.google.android.gms.b;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;

@qi
public abstract class qm
  implements ql.a, tv<Void>
{
  private final uv<qo> a;
  private final ql.a b;
  private final Object c = new Object();
  
  public qm(uv<qo> paramuv, ql.a parama)
  {
    a = paramuv;
    b = parama;
  }
  
  public final void a(qr paramqr)
  {
    synchronized (c)
    {
      b.a(paramqr);
      d();
      return;
    }
  }
  
  final boolean a(qx paramqx, qo paramqo)
  {
    try
    {
      paramqx.a(paramqo, new qq(this));
      return true;
    }
    catch (Throwable paramqx)
    {
      tp.c("Could not fetch ad response from ad request service due to an Exception.", paramqx);
      w.i().a(paramqx, "AdRequestClientTask.getAdResponseFromService");
      b.a(new qr(0));
    }
    return false;
  }
  
  public final void b()
  {
    d();
  }
  
  public abstract void d();
  
  public abstract qx e();
  
  @qi
  public static final class a
    extends qm
  {
    private final Context a;
    
    public a(Context paramContext, uv<qo> paramuv, ql.a parama)
    {
      super(parama);
      a = paramContext;
    }
    
    public final void d() {}
    
    public final qx e()
    {
      Object localObject = ke.b;
      localObject = new jw((String)w.q().a((jz)localObject));
      return rh.a(a, (jw)localObject, new rg(new ia(), new tc(), new jx(), new rs(), new np(), new rt(), new ru(), new pe(), new td()));
    }
  }
  
  @qi
  public static final class b
    extends qm
    implements o.b, o.c
  {
    protected qn a;
    private Context b;
    private un c;
    private uv<qo> d;
    private final ql.a e;
    private final Object f = new Object();
    private boolean g;
    
    public b(Context paramContext, un paramun, uv<qo> paramuv, ql.a parama)
    {
      super(parama);
      b = paramContext;
      c = paramun;
      d = paramuv;
      e = parama;
      paramun = ke.N;
      if (((Boolean)w.q().a(paramun)).booleanValue()) {
        g = true;
      }
      for (paramun = w.u().a();; paramun = paramContext.getMainLooper())
      {
        a = new qn(paramContext, paramun, this, this, c.c);
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
      new qm.a(b, d, e).c();
      parama = new Bundle();
      parama.putString("action", "gms_connection_failed_fallback_to_local");
      w.e();
      tt.b(b, c.a, "gmob-apps", parama, true);
    }
    
    public final void d()
    {
      synchronized (f)
      {
        if ((a.b()) || (a.c())) {
          a.a();
        }
        Binder.flushPendingCommands();
        if (g)
        {
          w.u().b();
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
      //   1: getfield 36	com/google/android/gms/b/qm$b:f	Ljava/lang/Object;
      //   4: astore_1
      //   5: aload_1
      //   6: monitorenter
      //   7: aload_0
      //   8: getfield 90	com/google/android/gms/b/qm$b:a	Lcom/google/android/gms/b/qn;
      //   11: invokevirtual 168	com/google/android/gms/b/qn:n	()Lcom/google/android/gms/b/qx;
      //   14: astore_2
      //   15: aload_1
      //   16: monitorexit
      //   17: aload_2
      //   18: areturn
      //   19: aload_1
      //   20: monitorexit
      //   21: aconst_null
      //   22: areturn
      //   23: astore_2
      //   24: aload_1
      //   25: monitorexit
      //   26: aload_2
      //   27: athrow
      //   28: astore_2
      //   29: goto -10 -> 19
      //   32: astore_2
      //   33: goto -14 -> 19
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	36	0	this	b
      //   14	4	2	localqx	qx
      //   23	4	2	localObject2	Object
      //   28	1	2	localDeadObjectException	android.os.DeadObjectException
      //   32	1	2	localIllegalStateException	IllegalStateException
      // Exception table:
      //   from	to	target	type
      //   7	15	23	finally
      //   15	17	23	finally
      //   19	21	23	finally
      //   24	26	23	finally
      //   7	15	28	android/os/DeadObjectException
      //   7	15	32	java/lang/IllegalStateException
    }
  }
}


/* Location:              com/google/android/gms/b/qm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */