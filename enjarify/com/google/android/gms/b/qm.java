package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;

public abstract class qm
  implements ql.a, tv
{
  private final uv a;
  private final ql.a b;
  private final Object c;
  
  public qm(uv paramuv, ql.a parama)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
    a = paramuv;
    b = parama;
  }
  
  public final void a(qr paramqr)
  {
    synchronized (c)
    {
      ql.a locala = b;
      locala.a(paramqr);
      d();
      return;
    }
  }
  
  final boolean a(qx paramqx, qo paramqo)
  {
    boolean bool = false;
    try
    {
      qq localqq = new com/google/android/gms/b/qq;
      localqq.<init>(this);
      paramqx.a(paramqo, localqq);
      bool = true;
    }
    finally
    {
      for (;;)
      {
        tp.c("Could not fetch ad response from ad request service due to an Exception.", localThrowable);
        Object localObject = w.i();
        String str = "AdRequestClientTask.getAdResponseFromService";
        ((tj)localObject).a(localThrowable, str);
        ql.a locala = b;
        localObject = new com/google/android/gms/b/qr;
        ((qr)localObject).<init>(0);
        locala.a((qr)localObject);
      }
    }
    return bool;
  }
  
  public final void b()
  {
    d();
  }
  
  public abstract void d();
  
  public abstract qx e();
}


/* Location:              com/google/android/gms/b/qm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */