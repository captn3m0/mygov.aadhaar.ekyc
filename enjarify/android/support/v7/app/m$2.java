package android.support.v7.app;

import android.support.v4.h.al;
import android.support.v4.h.al.d;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.view.View;

final class m$2
  implements s
{
  m$2(m paramm) {}
  
  public final al a(View paramView, al paramal)
  {
    int i = paramal.b();
    Object localObject = a;
    int j = ((m)localObject).i(i);
    if (i != j)
    {
      int k = paramal.a();
      int m = paramal.c();
      int n = paramal.d();
      al.d locald = al.a;
      localObject = b;
      paramal = locald.a(localObject, k, j, m, n);
    }
    return w.a(paramView, paramal);
  }
}


/* Location:              android/support/v7/app/m$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */