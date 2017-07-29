package android.support.design.widget;

import android.os.Handler;

final class b$6
  implements b.c
{
  b$6(b paramb) {}
  
  public final void a()
  {
    Object localObject1 = a;
    Object localObject2 = n.a();
    localObject1 = e;
    boolean bool = ((n)localObject2).c((n.a)localObject1);
    if (bool)
    {
      localObject1 = b.a;
      localObject2 = new android/support/design/widget/b$6$1;
      ((b.6.1)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
  }
}


/* Location:              android/support/design/widget/b$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */