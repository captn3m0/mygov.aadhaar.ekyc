package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.w;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class pr
  implements tv, vd.a
{
  protected final pt.a a;
  protected final Context b;
  protected final vc c;
  protected final tg.a d;
  protected qr e;
  protected final Object f;
  AtomicBoolean g;
  private Runnable h;
  
  protected pr(Context paramContext, tg.a parama, vc paramvc, pt.a parama1)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    f = localObject;
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(true);
    g = ((AtomicBoolean)localObject);
    b = paramContext;
    d = parama;
    localObject = d.b;
    e = ((qr)localObject);
    c = paramvc;
    a = parama1;
  }
  
  protected abstract void a();
  
  protected void a(int paramInt)
  {
    int i = -2;
    int j = paramInt;
    if (paramInt != i)
    {
      localObject1 = new com/google/android/gms/b/qr;
      localObject2 = this;
      localObject3 = e;
      long l1 = k;
      ((qr)localObject1).<init>(paramInt, l1);
      e = ((qr)localObject1);
    }
    Object localObject2 = this;
    c.e();
    pt.a locala = a;
    localObject2 = this;
    qo localqo = d.a;
    Object localObject1 = new com/google/android/gms/b/tg;
    Object localObject3 = c;
    vc localvc = c;
    List localList1 = e.d;
    List localList2 = e.f;
    List localList3 = e.j;
    int k = e.l;
    long l2 = e.k;
    String str1 = i;
    boolean bool2 = e.h;
    long l3 = e.i;
    il localil = d.d;
    localObject2 = this;
    long l4 = e.g;
    long l5 = d.f;
    long l6 = e.n;
    String str2 = e.o;
    localObject2 = this;
    JSONObject localJSONObject = d.h;
    localObject2 = this;
    ss localss = e.C;
    localObject2 = this;
    List localList4 = e.D;
    localObject2 = this;
    List localList5 = e.E;
    localObject2 = this;
    boolean bool1 = e.F;
    qt localqt = e.G;
    localObject2 = this;
    List localList6 = e.J;
    localObject2 = this;
    localObject2 = e.N;
    ((tg)localObject1).<init>((ih)localObject3, localvc, localList1, paramInt, localList2, localList3, k, l2, str1, bool2, null, null, null, null, null, l3, localil, l4, l5, l6, str2, localJSONObject, null, localss, localList4, localList5, bool1, localqt, null, localList6, (String)localObject2);
    localObject2 = locala;
    locala.b((tg)localObject1);
  }
  
  public final void a(vc paramvc, boolean paramBoolean)
  {
    int i = 0;
    Handler localHandler = null;
    tp.b("WebView finished loading.");
    Object localObject = g;
    boolean bool = ((AtomicBoolean)localObject).getAndSet(false);
    if (!bool) {}
    for (;;)
    {
      return;
      if (paramBoolean) {
        i = -2;
      }
      a(i);
      localHandler = tt.a;
      localObject = h;
      localHandler.removeCallbacks((Runnable)localObject);
    }
  }
  
  public void b()
  {
    Object localObject = g;
    Runnable localRunnable = null;
    boolean bool = ((AtomicBoolean)localObject).getAndSet(false);
    if (!bool) {}
    for (;;)
    {
      return;
      c.stopLoading();
      w.g();
      tu.a(c);
      int i = -1;
      a(i);
      localObject = tt.a;
      localRunnable = h;
      ((Handler)localObject).removeCallbacks(localRunnable);
    }
  }
}


/* Location:              com/google/android/gms/b/pr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */