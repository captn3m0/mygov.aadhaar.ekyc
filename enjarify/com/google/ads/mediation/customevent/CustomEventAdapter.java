package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.mediation.d;
import com.google.ads.mediation.f;
import com.google.android.gms.b.ul;

public final class CustomEventAdapter
  implements d, f
{
  a a;
  b b;
  private View c;
  
  private static Object a(String paramString)
  {
    try
    {
      localObject1 = Class.forName(paramString);
      localObject1 = ((Class)localObject1).newInstance();
    }
    finally
    {
      for (;;)
      {
        int i = String.valueOf(paramString).length() + 46;
        int j = String.valueOf(localObject1).length();
        i += j;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(i);
        StringBuilder localStringBuilder = ((StringBuilder)localObject2).append("Could not instantiate custom event adapter: ").append(paramString);
        localObject2 = ". ";
        localStringBuilder = localStringBuilder.append((String)localObject2);
        ul.e((String)localObject1);
        Object localObject1 = null;
      }
    }
    return localObject1;
  }
  
  public final Class a()
  {
    return com.google.android.gms.ads.mediation.customevent.c.class;
  }
  
  public final Class b()
  {
    return c.class;
  }
  
  public final View c()
  {
    return c;
  }
}


/* Location:              com/google/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */