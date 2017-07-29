package com.google.android.gms.b;

import android.text.TextUtils;

final class dd$5
  implements Runnable
{
  dd$5(dd paramdd, do paramdo, ca paramca) {}
  
  public final void run()
  {
    dd.a(c).v();
    dc localdc = dd.a(c);
    Object localObject1 = a;
    Object localObject3 = b;
    localdc.f().e();
    localdc.a();
    Object localObject4 = b;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject4);
    if (!bool)
    {
      bool = h;
      if (bool) {
        break label74;
      }
      localdc.b((ca)localObject3);
    }
    for (;;)
    {
      return;
      label74:
      localObject4 = ef;
      String str1 = "Removing user property";
      String str2 = b;
      ((cu.a)localObject4).a(str1, str2);
      localObject4 = localdc.j();
      ((cg)localObject4).x();
      try
      {
        localdc.b((ca)localObject3);
        localObject4 = localdc.j();
        localObject3 = a;
        str1 = b;
        ((cg)localObject4).b((String)localObject3, str1);
        localObject3 = localdc.j();
        ((cg)localObject3).y();
        localObject3 = localdc.e();
        localObject3 = f;
        localObject4 = "User property removed";
        localObject1 = b;
        ((cu.a)localObject3).a((String)localObject4, localObject1);
        localObject1 = localdc.j();
        ((cg)localObject1).z();
      }
      finally
      {
        localdc.j().z();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/dd$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */