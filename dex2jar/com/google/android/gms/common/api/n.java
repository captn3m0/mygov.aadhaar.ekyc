package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.b.aj;
import com.google.android.gms.b.ao;
import com.google.android.gms.b.ap;
import com.google.android.gms.b.f.a;
import com.google.android.gms.b.wl.b;
import com.google.android.gms.b.wm;
import com.google.android.gms.b.wn;
import com.google.android.gms.b.x;
import com.google.android.gms.b.x.a;
import com.google.android.gms.b.y;
import com.google.android.gms.common.internal.p;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class n<O extends a.a>
{
  public final a<O> a;
  public final wn<O> b;
  public final Looper c;
  public final int d;
  protected final c e;
  protected final x f;
  private final Context g;
  private final O h;
  private final ap i;
  private final Account j;
  
  protected n(Context paramContext, a<O> parama, Looper paramLooper)
  {
    com.google.android.gms.common.internal.c.a(paramContext, "Null context is not permitted.");
    com.google.android.gms.common.internal.c.a(parama, "Api must not be null.");
    com.google.android.gms.common.internal.c.a(paramLooper, "Looper must not be null.");
    g = paramContext.getApplicationContext();
    a = parama;
    h = null;
    c = paramLooper;
    b = new wn(parama);
    e = new y(this);
    f = x.a(g);
    d = f.d.getAndIncrement();
    i = new wm();
    j = null;
  }
  
  /* Error */
  @Deprecated
  public n(Context paramContext, a<O> parama, ap paramap)
  {
    // Byte code:
    //   0: new 10	com/google/android/gms/common/api/n$a$a
    //   3: dup
    //   4: invokespecial 107	com/google/android/gms/common/api/n$a$a:<init>	()V
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 109
    //   12: invokestatic 44	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   15: pop
    //   16: aload 4
    //   18: aload_3
    //   19: putfield 111	com/google/android/gms/common/api/n$a$a:a	Lcom/google/android/gms/b/ap;
    //   22: aload_0
    //   23: aload_1
    //   24: aload_2
    //   25: aload 4
    //   27: invokevirtual 114	com/google/android/gms/common/api/n$a$a:a	()Lcom/google/android/gms/common/api/n$a;
    //   30: invokespecial 117	com/google/android/gms/common/api/n:<init>	(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/n$a;)V
    //   33: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	n
    //   0	34	1	paramContext	Context
    //   0	34	2	parama	a<O>
    //   0	34	3	paramap	ap
    //   7	19	4	locala	n.a.a
  }
  
  private n(Context paramContext, a<O> parama, a parama1)
  {
    com.google.android.gms.common.internal.c.a(paramContext, "Null context is not permitted.");
    com.google.android.gms.common.internal.c.a(parama, "Api must not be null.");
    com.google.android.gms.common.internal.c.a(parama1, "Settings must not be null; use Settings.createDefault() instead.");
    g = paramContext.getApplicationContext();
    a = parama;
    h = null;
    c = d;
    b = new wn(a, h);
    e = new y(this);
    f = x.a(g);
    d = f.d.getAndIncrement();
    i = b;
    j = c;
    f.a(this);
  }
  
  private <A extends a.c, T extends f.a<? extends g, A>> T a(int paramInt, T paramT)
  {
    paramT.d();
    x localx = f;
    wl.b localb = new wl.b(paramInt, paramT);
    i.sendMessage(i.obtainMessage(4, new aj(localb, e.get(), this)));
    return paramT;
  }
  
  public ao a(Context paramContext, Handler paramHandler)
  {
    return new ao(paramContext, paramHandler);
  }
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    return a(1, paramT);
  }
  
  public a.f a(Looper paramLooper, x.a<O> parama)
  {
    Object localObject = new c.a(g);
    a = j;
    localObject = ((c.a)localObject).a();
    return a.a().a(g, paramLooper, (p)localObject, h, parama, parama);
  }
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T b(T paramT)
  {
    return a(2, paramT);
  }
  
  public static final class a
  {
    public static final a a = new a().a();
    public final ap b;
    public final Account c;
    public final Looper d;
    
    private a(ap paramap, Looper paramLooper)
    {
      b = paramap;
      c = null;
      d = paramLooper;
    }
    
    public static final class a
    {
      ap a;
      private Looper b;
      
      public final n.a a()
      {
        if (a == null) {
          a = new wm();
        }
        if (b == null) {
          if (Looper.myLooper() == null) {
            break label55;
          }
        }
        label55:
        for (b = Looper.myLooper();; b = Looper.getMainLooper()) {
          return new n.a(a, b, (byte)0);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/common/api/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */