package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.b.dw;
import com.google.android.gms.b.km;
import com.google.android.gms.b.kn;
import com.google.android.gms.b.kp;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.pt;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.sx;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tv;
import com.google.android.gms.b.vc;

final class c$3
  implements Runnable
{
  c$3(c paramc, tg.a parama, km paramkm) {}
  
  public final void run()
  {
    int i = 1;
    oc localoc = null;
    Object localObject1 = a.b;
    boolean bool = s;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (bool)
    {
      localObject1 = d.f.z;
      if (localObject1 != null)
      {
        bool = false;
        localObject1 = null;
        localObject3 = a.b.b;
        if (localObject3 != null)
        {
          w.e();
          localObject1 = tt.a(a.b.b);
        }
        localObject3 = new com/google/android/gms/b/kn;
        localObject4 = d;
        localObject5 = a.b.c;
        ((kn)localObject3).<init>((i)localObject4, (String)localObject1, (String)localObject5);
        localObject1 = d.f;
        F = i;
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = d;
        localObject4 = null;
        d = false;
        localObject1 = d;
        localObject1 = f;
        localObject1 = z;
        ((kq)localObject1).a((kp)localObject3);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = "Could not call the onCustomRenderedAdLoadedListener.";
        tp.c((String)localObject3, localRemoteException);
        localObject2 = d;
        d = i;
      }
      Object localObject2 = new com/google/android/gms/ads/internal/f;
      localObject3 = d.f.c;
      localObject4 = a;
      ((f)localObject2).<init>((Context)localObject3, (tg.a)localObject4);
      localObject3 = d;
      localObject4 = a;
      localObject5 = b;
      vc localvc = ((c)localObject3).a((tg.a)localObject4, (f)localObject2, (sx)localObject5);
      localObject3 = new com/google/android/gms/ads/internal/c$3$1;
      ((c.3.1)localObject3).<init>((f)localObject2);
      localvc.setOnTouchListener((View.OnTouchListener)localObject3);
      localObject3 = new com/google/android/gms/ads/internal/c$3$2;
      ((c.3.2)localObject3).<init>((f)localObject2);
      localvc.setOnClickListener((View.OnClickListener)localObject3);
      d.f.F = 0;
      x localx = d.f;
      w.d();
      localObject2 = d.f.c;
      localObject3 = d;
      localObject4 = a;
      localObject5 = d.f.d;
      localoc = d.j;
      c localc = d;
      km localkm = c;
      localObject2 = pt.a((Context)localObject2, (a)localObject3, (tg.a)localObject4, (dw)localObject5, localvc, localoc, localc, localkm);
      h = ((tv)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/c$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */