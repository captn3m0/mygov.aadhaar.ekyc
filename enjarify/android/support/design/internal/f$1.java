package android.support.design.internal;

import android.graphics.Rect;
import android.support.v4.h.al;
import android.support.v4.h.al.d;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.view.View;

final class f$1
  implements s
{
  f$1(f paramf) {}
  
  public final al a(View paramView, al paramal)
  {
    Object localObject1 = a.b;
    if (localObject1 == null)
    {
      localObject1 = a;
      localObject2 = new android/graphics/Rect;
      ((Rect)localObject2).<init>();
      b = ((Rect)localObject2);
    }
    localObject1 = a.b;
    int i = paramal.a();
    int j = paramal.b();
    int k = paramal.c();
    int m = paramal.d();
    ((Rect)localObject1).set(i, j, k, m);
    a.a(paramal);
    Object localObject2 = a;
    localObject1 = al.a;
    Object localObject3 = b;
    boolean bool = ((al.d)localObject1).f(localObject3);
    if (bool)
    {
      localObject1 = a.a;
      if (localObject1 != null) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      ((f)localObject2).setWillNotDraw(bool);
      w.c(a);
      localObject1 = al.a;
      localObject2 = b;
      return ((al.d)localObject1).a(localObject2);
      bool = false;
      localObject1 = null;
    }
  }
}


/* Location:              android/support/design/internal/f$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */