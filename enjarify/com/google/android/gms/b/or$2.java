package com.google.android.gms.b;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.mediation.f;

final class or$2
  implements j
{
  or$2(or paramor) {}
  
  public final void a()
  {
    ul.b("AdMobCustomTabsAdapter overlay is closed.");
    Object localObject1 = or.a(a);
    ((f)localObject1).h();
    try
    {
      localObject1 = a;
      localObject1 = or.c((or)localObject1);
      localObject2 = a;
      localObject2 = or.b((or)localObject2);
      ((ks)localObject1).a((Activity)localObject2);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = "Exception while unbinding from CustomTabsService.";
        ul.b((String)localObject2, localException);
      }
    }
  }
  
  public final void b()
  {
    ul.b("AdMobCustomTabsAdapter overlay is paused.");
  }
  
  public final void c()
  {
    ul.b("AdMobCustomTabsAdapter overlay is resumed.");
  }
  
  public final void d()
  {
    ul.b("Opening AdMobCustomTabsAdapter overlay.");
    or.a(a).g();
  }
}


/* Location:              com/google/android/gms/b/or$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */