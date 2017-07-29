package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.i;

public final class pt
{
  public static tv a(Context paramContext, a parama, tg.a parama1, dw paramdw, vc paramvc, oc paramoc, pt.a parama2, km paramkm)
  {
    Object localObject1 = b;
    boolean bool1 = h;
    Object localObject2;
    Object localObject3;
    if (bool1)
    {
      localObject1 = new com/google/android/gms/b/px;
      localObject2 = paramContext;
      localObject3 = parama1;
      ((px)localObject1).<init>(paramContext, parama1, paramoc, parama2, paramkm, paramvc);
      localObject3 = "AdRenderer: ";
      localObject2 = String.valueOf(localObject1.getClass().getName());
      int i = ((String)localObject2).length();
      if (i == 0) {
        break label312;
      }
      localObject2 = ((String)localObject3).concat((String)localObject2);
    }
    for (;;)
    {
      tp.b((String)localObject2);
      ((tv)localObject1).c();
      return (tv)localObject1;
      bool1 = t;
      if (!bool1)
      {
        bool1 = parama instanceof s;
        if (!bool1) {}
      }
      else
      {
        bool2 = t;
        if (bool2)
        {
          bool2 = parama instanceof s;
          if (bool2)
          {
            localObject1 = new com/google/android/gms/b/py;
            localObject3 = parama;
            localObject3 = (s)parama;
            localObject2 = paramContext;
            ((py)localObject1).<init>(paramContext, (s)localObject3, parama1, paramdw, parama2, paramkm);
            break;
          }
        }
        localObject1 = new com/google/android/gms/b/pv;
        ((pv)localObject1).<init>(parama1, parama2);
        break;
      }
      localObject1 = ke.ao;
      localObject2 = w.q();
      localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
      boolean bool2 = ((Boolean)localObject1).booleanValue();
      if (bool2)
      {
        bool2 = i.c();
        if (bool2)
        {
          bool2 = i.e();
          if ((!bool2) && (paramvc != null))
          {
            localObject1 = paramvc.k();
            bool2 = d;
            if (bool2)
            {
              localObject1 = new com/google/android/gms/b/pw;
              ((pw)localObject1).<init>(paramContext, parama1, paramvc, parama2);
              break;
            }
          }
        }
      }
      localObject1 = new com/google/android/gms/b/pu;
      ((pu)localObject1).<init>(paramContext, parama1, paramvc, parama2);
      break;
      label312:
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>((String)localObject3);
    }
  }
}


/* Location:              com/google/android/gms/b/pt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */