package com.google.android.gms.b;

import android.content.Context;
import java.util.Map;

final class rj$2
  implements md
{
  rj$2(rj paramrj) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = a;
    rm localrm;
    String str;
    for (;;)
    {
      synchronized (a)
      {
        localObject1 = a;
        localObject1 = d;
        boolean bool1 = ((up)localObject1).isDone();
        if (bool1) {
          return;
        }
        localrm = new com/google/android/gms/b/rm;
        int i = -2;
        localrm.<init>(i, paramMap);
        localObject1 = a;
        localObject1 = b;
        str = f;
        bool2 = ((String)localObject1).equals(str);
        if (bool2) {}
      }
      str = h;
      if (str != null) {
        break;
      }
      localObject3 = "URL missing in loadAdUrl GMSG.";
      tp.e((String)localObject3);
    }
    Object localObject3 = "%40mediation_adapters%40";
    boolean bool2 = str.contains((CharSequence)localObject3);
    if (bool2)
    {
      Object localObject5 = paramvc.getContext();
      localObject3 = "check_adapters";
      localObject3 = paramMap.get(localObject3);
      localObject3 = (String)localObject3;
      Object localObject6 = a;
      localObject6 = c;
      localObject3 = tn.a((Context)localObject5, (String)localObject3, (String)localObject6);
      localObject5 = "%40mediation_adapters%40";
      localObject3 = str.replaceAll((String)localObject5, (String)localObject3);
      h = ((String)localObject3);
      str = "Ad request URL modified to ";
      localObject3 = String.valueOf(localObject3);
      int j = ((String)localObject3).length();
      if (j == 0) {
        break label257;
      }
      localObject3 = str.concat((String)localObject3);
    }
    for (;;)
    {
      tp.a((String)localObject3);
      localObject3 = a;
      localObject3 = d;
      ((up)localObject3).b(localrm);
      break;
      label257:
      localObject3 = new java/lang/String;
      ((String)localObject3).<init>(str);
    }
  }
}


/* Location:              com/google/android/gms/b/rj$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */