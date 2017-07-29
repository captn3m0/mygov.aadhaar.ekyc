package android.support.v4.b;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

final class o$e
  implements i.c
{
  final boolean a;
  final c b;
  int c;
  
  o$e(c paramc, boolean paramBoolean)
  {
    a = paramBoolean;
    b = paramc;
  }
  
  public final void a()
  {
    int i = c + -1;
    c = i;
    i = c;
    if (i != 0) {}
    for (;;)
    {
      return;
      o localo = b.b;
      o.a(localo);
    }
  }
  
  public final void b()
  {
    int i = c + 1;
    c = i;
  }
  
  public final void c()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int i = c;
    boolean bool3;
    int k;
    label45:
    Object localObject2;
    if (i > 0)
    {
      bool3 = bool1;
      o localo = b.b;
      localObject1 = f;
      int j = ((ArrayList)localObject1).size();
      k = 0;
      localc = null;
      if (k >= j) {
        break label225;
      }
      localObject1 = (i)f.get(k);
      boolean bool4 = false;
      localObject2 = null;
      ((i)localObject1).a(null);
      if (bool3)
      {
        bool4 = ((i)localObject1).C();
        if (bool4)
        {
          localObject2 = z;
          if (localObject2 != null)
          {
            localObject2 = z.n;
            if (localObject2 != null) {
              break label153;
            }
          }
          localObject1 = ((i)localObject1).u();
          p = false;
        }
      }
    }
    for (;;)
    {
      i = k + 1;
      k = i;
      break label45;
      bool3 = false;
      break;
      label153:
      localObject2 = Looper.myLooper();
      Object localObject3 = z.n.d.getLooper();
      if (localObject2 != localObject3)
      {
        localObject2 = z.n.d;
        localObject3 = new android/support/v4/b/i$1;
        ((i.1)localObject3).<init>((i)localObject1);
        ((Handler)localObject2).postAtFrontOfQueue((Runnable)localObject3);
      }
      else
      {
        ((i)localObject1).r();
      }
    }
    label225:
    Object localObject1 = b.b;
    c localc = b;
    boolean bool5 = a;
    if (!bool3) {
      bool2 = bool1;
    }
    o.a((o)localObject1, localc, bool5, bool2, bool1);
  }
  
  public final void d()
  {
    o localo = b.b;
    c localc = b;
    boolean bool = a;
    o.a(localo, localc, bool, false, false);
  }
}


/* Location:              android/support/v4/b/o$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */