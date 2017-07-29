package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.b.b.a;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.b.e;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.mediation.j;
import java.util.List;

final class a$a
  extends j
{
  private final e n;
  
  public a$a(e parame)
  {
    n = parame;
    Object localObject = parame.b().toString();
    e = ((String)localObject);
    localObject = parame.c();
    f = ((List)localObject);
    localObject = parame.d().toString();
    g = ((String)localObject);
    localObject = parame.e();
    h = ((b.a)localObject);
    localObject = parame.f().toString();
    i = ((String)localObject);
    localObject = parame.g();
    if (localObject != null)
    {
      localObject = parame.g();
      double d = ((Double)localObject).doubleValue();
      j = d;
    }
    localObject = parame.h();
    if (localObject != null)
    {
      localObject = parame.h().toString();
      k = ((String)localObject);
    }
    localObject = parame.i();
    if (localObject != null)
    {
      localObject = parame.i().toString();
      l = ((String)localObject);
    }
    a();
    b();
    localObject = parame.j();
    m = ((i)localObject);
  }
  
  public final void a(View paramView)
  {
    boolean bool = paramView instanceof d;
    if (bool)
    {
      paramView = (d)paramView;
      e locale = n;
      paramView.setNativeAd(locale);
    }
  }
}


/* Location:              com/google/ads/mediation/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */