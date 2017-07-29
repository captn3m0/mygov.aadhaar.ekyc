package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.i;

@qi
public final class pt
{
  public static tv a(Context paramContext, a parama, tg.a parama1, dw paramdw, vc paramvc, oc paramoc, a parama2, km paramkm)
  {
    qr localqr = b;
    if (h)
    {
      paramContext = new px(paramContext, parama1, paramoc, parama2, paramkm, paramvc);
      parama = String.valueOf(paramContext.getClass().getName());
      if (parama.length() == 0) {
        break label220;
      }
    }
    label220:
    for (parama = "AdRenderer: ".concat(parama);; parama = new String("AdRenderer: "))
    {
      tp.b(parama);
      paramContext.c();
      return paramContext;
      if ((t) || ((parama instanceof s)))
      {
        if ((t) && ((parama instanceof s)))
        {
          paramContext = new py(paramContext, (s)parama, parama1, paramdw, parama2, paramkm);
          break;
        }
        paramContext = new pv(parama1, parama2);
        break;
      }
      parama = ke.ao;
      if ((((Boolean)w.q().a(parama)).booleanValue()) && (i.c()) && (!i.e()) && (paramvc != null) && (kd))
      {
        paramContext = new pw(paramContext, parama1, paramvc, parama2);
        break;
      }
      paramContext = new pu(paramContext, parama1, paramvc, parama2);
      break;
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(tg paramtg);
  }
}


/* Location:              com/google/android/gms/b/pt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */