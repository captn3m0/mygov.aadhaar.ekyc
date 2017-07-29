package com.google.android.gms.b;

import android.content.Context;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

final class qb$1
  implements Runnable
{
  qb$1(qb paramqb, JSONObject paramJSONObject, up paramup) {}
  
  public final void run()
  {
    try
    {
      Object localObject1 = c;
      w.f();
      Object localObject2 = a;
      localObject3 = il.a();
      Object localObject4 = null;
      Object localObject5 = null;
      Object localObject6 = b;
      Object localObject7 = c;
      localObject7 = a;
      localObject7 = k;
      km localkm = d;
      localObject1 = e;
      localObject1 = ((s)localObject1).g();
      localObject3 = ve.a((Context)localObject2, (il)localObject3, false, false, (dw)localObject6, (un)localObject7, localkm, null, (e)localObject1);
      localObject2 = c;
      localObject2 = e;
      l = ((vc)localObject3);
      localObject2 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject2).<init>(localObject3);
      localObject4 = ((vc)localObject3).l();
      localObject5 = c;
      localObject6 = f;
      if (localObject6 == null)
      {
        localObject6 = new com/google/android/gms/b/qb$3;
        ((qb.3)localObject6).<init>((qb)localObject5, (WeakReference)localObject2);
        f = ((ViewTreeObserver.OnGlobalLayoutListener)localObject6);
      }
      localObject5 = f;
      localObject6 = c;
      localObject7 = g;
      if (localObject7 == null)
      {
        localObject7 = new com/google/android/gms/b/qb$4;
        ((qb.4)localObject7).<init>((qb)localObject6, (WeakReference)localObject2);
        g = ((ViewTreeObserver.OnScrollChangedListener)localObject7);
      }
      localObject2 = g;
      ((vd)localObject4).a((ViewTreeObserver.OnGlobalLayoutListener)localObject5, (ViewTreeObserver.OnScrollChangedListener)localObject2);
      localObject2 = c;
      localObject4 = ((vc)localObject3).l();
      localObject5 = "/video";
      localObject6 = mc.n;
      ((vd)localObject4).a((String)localObject5, (md)localObject6);
      localObject5 = "/videoMeta";
      localObject6 = mc.o;
      ((vd)localObject4).a((String)localObject5, (md)localObject6);
      localObject5 = "/precache";
      localObject6 = mc.q;
      ((vd)localObject4).a((String)localObject5, (md)localObject6);
      localObject5 = "/delayPageLoaded";
      localObject6 = mc.t;
      ((vd)localObject4).a((String)localObject5, (md)localObject6);
      localObject5 = "/instrument";
      localObject6 = mc.r;
      ((vd)localObject4).a((String)localObject5, (md)localObject6);
      localObject5 = "/log";
      localObject6 = mc.i;
      ((vd)localObject4).a((String)localObject5, (md)localObject6);
      localObject5 = "/videoClicked";
      localObject6 = mc.j;
      ((vd)localObject4).a((String)localObject5, (md)localObject6);
      localObject5 = "/trackActiveViewUnit";
      localObject6 = new com/google/android/gms/b/qb$2;
      ((qb.2)localObject6).<init>((qb)localObject2);
      ((vd)localObject4).a((String)localObject5, (md)localObject6);
      localObject2 = ((vc)localObject3).l();
      localObject4 = new com/google/android/gms/b/qb$1$1;
      ((qb.1.1)localObject4).<init>(this, (vc)localObject3);
      d = ((vd.b)localObject4);
      localObject2 = ((vc)localObject3).l();
      localObject4 = new com/google/android/gms/b/qb$1$2;
      ((qb.1.2)localObject4).<init>(this);
      c = ((vd.a)localObject4);
      localObject2 = ke.cf;
      localObject4 = w.q();
      localObject2 = ((kd)localObject4).a((jz)localObject2);
      localObject2 = (String)localObject2;
      ((vc)localObject3).loadUrl((String)localObject2);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3 = "Exception occurred while getting video view";
        tp.c((String)localObject3, localException);
        up localup = b;
        localup.b(null);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/qb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */