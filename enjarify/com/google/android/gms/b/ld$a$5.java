package com.google.android.gms.b;

import java.lang.ref.WeakReference;

final class ld$a$5
  extends pz.a
{
  ld$a$5(ld.a parama) {}
  
  public final void a(nk paramnk)
  {
    Object localObject1 = (vc)a.a.get();
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      ld.a locala = a;
      Object localObject2 = new com/google/android/gms/b/ld$a$1;
      ((ld.a.1)localObject2).<init>(locala, paramnk);
      paramnk.a("/loadHtml", (md)localObject2);
      locala = a;
      localObject2 = new com/google/android/gms/b/ld$a$2;
      ((ld.a.2)localObject2).<init>(locala, paramnk);
      paramnk.a("/showOverlay", (md)localObject2);
      locala = a;
      localObject2 = new com/google/android/gms/b/ld$a$3;
      ((ld.a.3)localObject2).<init>(locala, paramnk);
      paramnk.a("/hideOverlay", (md)localObject2);
      localObject1 = ((vc)localObject1).l();
      String str = "/sendMessageToSdk";
      locala = a;
      localObject2 = new com/google/android/gms/b/ld$a$4;
      ((ld.a.4)localObject2).<init>(locala, paramnk);
      ((vd)localObject1).a(str, (md)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/b/ld$a$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */