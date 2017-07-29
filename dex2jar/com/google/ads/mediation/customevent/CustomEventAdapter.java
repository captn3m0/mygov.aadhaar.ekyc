package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;
import com.google.android.gms.b.ul;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter
  implements d<com.google.android.gms.ads.mediation.customevent.c, c>, f<com.google.android.gms.ads.mediation.customevent.c, c>
{
  a a;
  b b;
  private View c;
  
  private static <T> T a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return (T)localObject;
    }
    catch (Throwable localThrowable)
    {
      String str = String.valueOf(localThrowable.getMessage());
      ul.e(String.valueOf(paramString).length() + 46 + String.valueOf(str).length() + "Could not instantiate custom event adapter: " + paramString + ". " + str);
    }
    return null;
  }
  
  public final Class<com.google.android.gms.ads.mediation.customevent.c> a()
  {
    return com.google.android.gms.ads.mediation.customevent.c.class;
  }
  
  public final Class<c> b()
  {
    return c.class;
  }
  
  public final View c()
  {
    return c;
  }
  
  static final class a
  {
    private final CustomEventAdapter a;
    private final e b;
    
    public a(CustomEventAdapter paramCustomEventAdapter, e parame)
    {
      a = paramCustomEventAdapter;
      b = parame;
    }
  }
  
  final class b
  {
    private final CustomEventAdapter b;
    private final g c;
    
    public b(CustomEventAdapter paramCustomEventAdapter, g paramg)
    {
      b = paramCustomEventAdapter;
      c = paramg;
    }
  }
}


/* Location:              com/google/ads/mediation/customevent/CustomEventAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */