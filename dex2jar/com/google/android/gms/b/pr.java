package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.w;
import java.util.concurrent.atomic.AtomicBoolean;

@qi
public abstract class pr
  implements tv<Void>, vd.a
{
  protected final pt.a a;
  protected final Context b;
  protected final vc c;
  protected final tg.a d;
  protected qr e;
  protected final Object f = new Object();
  AtomicBoolean g = new AtomicBoolean(true);
  private Runnable h;
  
  protected pr(Context paramContext, tg.a parama, vc paramvc, pt.a parama1)
  {
    b = paramContext;
    d = parama;
    e = d.b;
    c = paramvc;
    a = parama1;
  }
  
  protected abstract void a();
  
  protected void a(int paramInt)
  {
    if (paramInt != -2) {
      e = new qr(paramInt, e.k);
    }
    c.e();
    pt.a locala = a;
    qo localqo = d.a;
    locala.b(new tg(c, c, e.d, paramInt, e.f, e.j, e.l, e.k, i, e.h, null, null, null, null, null, e.i, d.d, e.g, d.f, e.n, e.o, d.h, null, e.C, e.D, e.E, e.F, e.G, null, e.J, e.N));
  }
  
  public final void a(vc paramvc, boolean paramBoolean)
  {
    int i = 0;
    tp.b("WebView finished loading.");
    if (!g.getAndSet(false)) {
      return;
    }
    if (paramBoolean) {
      i = -2;
    }
    a(i);
    tt.a.removeCallbacks(h);
  }
  
  public void b()
  {
    if (!g.getAndSet(false)) {
      return;
    }
    c.stopLoading();
    w.g();
    tu.a(c);
    a(-1);
    tt.a.removeCallbacks(h);
  }
}


/* Location:              com/google/android/gms/b/pr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */