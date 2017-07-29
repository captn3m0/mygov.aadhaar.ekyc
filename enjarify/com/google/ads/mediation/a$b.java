package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.b.b.a;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.b.f;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.mediation.k;
import java.util.List;

final class a$b
  extends k
{
  private final f l;
  
  public a$b(f paramf)
  {
    l = paramf;
    Object localObject = paramf.b().toString();
    e = ((String)localObject);
    localObject = paramf.c();
    f = ((List)localObject);
    localObject = paramf.d().toString();
    g = ((String)localObject);
    localObject = paramf.e();
    if (localObject != null)
    {
      localObject = paramf.e();
      h = ((b.a)localObject);
    }
    localObject = paramf.f().toString();
    i = ((String)localObject);
    localObject = paramf.g().toString();
    j = ((String)localObject);
    a();
    b();
    localObject = paramf.h();
    k = ((i)localObject);
  }
  
  public final void a(View paramView)
  {
    boolean bool = paramView instanceof d;
    if (bool)
    {
      paramView = (d)paramView;
      f localf = l;
      paramView.setNativeAd(localf);
    }
  }
}


/* Location:              com/google/ads/mediation/a$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */