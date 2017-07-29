package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.w;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@qi
public final class pz
{
  private static final long a = TimeUnit.SECONDS.toMillis(60L);
  private static final Object b = new Object();
  private static boolean c = false;
  private static nj d = null;
  private final Context e;
  private final un f;
  private final s g;
  private final dw h;
  private nh i;
  private nj.e j;
  private ng k;
  private boolean l = false;
  
  public pz(Context paramContext, s params, dw paramdw, un paramun)
  {
    e = paramContext;
    g = params;
    h = paramdw;
    f = paramun;
    paramContext = ke.cg;
    l = ((Boolean)w.q().a(paramContext)).booleanValue();
  }
  
  public pz(Context paramContext, tg.a parama, s params, dw paramdw) {}
  
  public final void a()
  {
    if (l) {
      synchronized (b)
      {
        if (!c)
        {
          if (e.getApplicationContext() != null)
          {
            localContext = e.getApplicationContext();
            un localun = f;
            jz localjz = ke.cd;
            d = new nj(localContext, localun, (String)w.q().a(localjz), new ty()new nj.b {}, new nj.b());
            c = true;
          }
        }
        else {
          return;
        }
        Context localContext = e;
      }
    }
    i = new nh();
  }
  
  public final void a(a parama)
  {
    if (l)
    {
      localObject = j;
      if (localObject == null)
      {
        tp.e("SharedJavascriptEngine not initialized");
        return;
      }
      ((nj.e)localObject).a(new uv.c()new uv.a {}, new uv.a()
      {
        public final void a()
        {
          pz.this.a();
        }
      });
      return;
    }
    Object localObject = k;
    if (localObject == null)
    {
      tp.e("JavascriptEngine not initialized");
      return;
    }
    parama.a((nk)localObject);
  }
  
  public final void b()
  {
    if (l)
    {
      j = new nj.e(d.b(h));
      return;
    }
    nh localnh = i;
    Context localContext = e;
    un localun = f;
    Object localObject = ke.cd;
    localObject = (String)w.q().a((jz)localObject);
    dw localdw = h;
    e locale = g.g();
    nh.a locala = new nh.a((byte)0);
    tt.a.post(new nh.1(localnh, localContext, localun, locala, localdw, locale, (String)localObject));
    k = ((ng)locala.get(a, TimeUnit.MILLISECONDS));
    k.a(g, g, g, g);
  }
  
  public static abstract class a
  {
    public void a() {}
    
    public abstract void a(nk paramnk);
  }
}


/* Location:              com/google/android/gms/b/pz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */