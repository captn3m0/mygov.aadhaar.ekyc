package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
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

public abstract class n
{
  public final a a;
  public final wn b;
  public final Looper c;
  public final int d;
  protected final c e;
  protected final x f;
  private final Context g;
  private final a.a h;
  private final ap i;
  private final Account j;
  
  protected n(Context paramContext, a parama, Looper paramLooper)
  {
    com.google.android.gms.common.internal.c.a(paramContext, "Null context is not permitted.");
    com.google.android.gms.common.internal.c.a(parama, "Api must not be null.");
    com.google.android.gms.common.internal.c.a(paramLooper, "Looper must not be null.");
    Object localObject = paramContext.getApplicationContext();
    g = ((Context)localObject);
    a = parama;
    h = null;
    c = paramLooper;
    localObject = new com/google/android/gms/b/wn;
    ((wn)localObject).<init>(parama);
    b = ((wn)localObject);
    localObject = new com/google/android/gms/b/y;
    ((y)localObject).<init>(this);
    e = ((c)localObject);
    localObject = x.a(g);
    f = ((x)localObject);
    int k = f.d.getAndIncrement();
    d = k;
    localObject = new com/google/android/gms/b/wm;
    ((wm)localObject).<init>();
    i = ((ap)localObject);
    j = null;
  }
  
  /* Error */
  public n(Context paramContext, a parama, ap paramap)
  {
    // Byte code:
    //   0: new 94	com/google/android/gms/common/api/n$a$a
    //   3: astore 4
    //   5: aload 4
    //   7: invokespecial 95	com/google/android/gms/common/api/n$a$a:<init>	()V
    //   10: aload_3
    //   11: ldc 97
    //   13: invokestatic 35	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   16: pop
    //   17: aload 4
    //   19: aload_3
    //   20: putfield 99	com/google/android/gms/common/api/n$a$a:a	Lcom/google/android/gms/b/ap;
    //   23: aload 4
    //   25: invokevirtual 102	com/google/android/gms/common/api/n$a$a:a	()Lcom/google/android/gms/common/api/n$a;
    //   28: astore 4
    //   30: aload_0
    //   31: aload_1
    //   32: aload_2
    //   33: aload 4
    //   35: invokespecial 105	com/google/android/gms/common/api/n:<init>	(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/n$a;)V
    //   38: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	n
    //   0	39	1	paramContext	Context
    //   0	39	2	parama	a
    //   0	39	3	paramap	ap
    //   3	31	4	localObject	Object
  }
  
  private n(Context paramContext, a parama, n.a parama1)
  {
    com.google.android.gms.common.internal.c.a(paramContext, "Null context is not permitted.");
    com.google.android.gms.common.internal.c.a(parama, "Api must not be null.");
    com.google.android.gms.common.internal.c.a(parama1, "Settings must not be null; use Settings.createDefault() instead.");
    Object localObject = paramContext.getApplicationContext();
    g = ((Context)localObject);
    a = parama;
    h = null;
    localObject = d;
    c = ((Looper)localObject);
    localObject = a;
    a.a locala = h;
    wn localwn = new com/google/android/gms/b/wn;
    localwn.<init>((a)localObject, locala);
    b = localwn;
    localObject = new com/google/android/gms/b/y;
    ((y)localObject).<init>(this);
    e = ((c)localObject);
    localObject = x.a(g);
    f = ((x)localObject);
    int k = f.d.getAndIncrement();
    d = k;
    localObject = b;
    i = ((ap)localObject);
    localObject = c;
    j = ((Account)localObject);
    f.a(this);
  }
  
  private f.a a(int paramInt, f.a parama)
  {
    parama.d();
    Object localObject = f;
    wl.b localb = new com/google/android/gms/b/wl$b;
    localb.<init>(paramInt, parama);
    Handler localHandler1 = i;
    Handler localHandler2 = i;
    aj localaj = new com/google/android/gms/b/aj;
    int k = e.get();
    localaj.<init>(localb, k, this);
    localObject = localHandler2.obtainMessage(4, localaj);
    localHandler1.sendMessage((Message)localObject);
    return parama;
  }
  
  public ao a(Context paramContext, Handler paramHandler)
  {
    ao localao = new com/google/android/gms/b/ao;
    localao.<init>(paramContext, paramHandler);
    return localao;
  }
  
  public final f.a a(f.a parama)
  {
    return a(1, parama);
  }
  
  public a.f a(Looper paramLooper, x.a parama)
  {
    Object localObject1 = new com/google/android/gms/common/api/c$a;
    Object localObject2 = g;
    ((c.a)localObject1).<init>((Context)localObject2);
    localObject2 = j;
    a = ((Account)localObject2);
    p localp = ((c.a)localObject1).a();
    localObject1 = a.a();
    localObject2 = g;
    a.a locala = h;
    return ((a.b)localObject1).a((Context)localObject2, paramLooper, localp, locala, parama, parama);
  }
  
  public final f.a b(f.a parama)
  {
    return a(2, parama);
  }
}


/* Location:              com/google/android/gms/common/api/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */