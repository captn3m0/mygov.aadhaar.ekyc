package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;

final class ua$b$3
  implements Runnable
{
  ua$b$3(ua.b paramb, us paramus) {}
  
  public final void run()
  {
    try
    {
      Object localObject1 = b;
      localObject1 = ua.b.b((ua.b)localObject1);
      localObject2 = a;
      localObject2 = ((us)localObject2).get();
      ((re.b)localObject1).a(localObject2);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        tp.b("Error occured while dispatching http response in getter.", localException);
        Object localObject2 = w.i();
        String str = "HttpGetter.deliverResponse.1";
        ((tj)localObject2).a(localException, str);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ua$b$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */