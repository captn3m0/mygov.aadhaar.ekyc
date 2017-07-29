package android.support.v7.app;

import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.w;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

final class m$b
  implements b.a
{
  private b.a b;
  
  public m$b(m paramm, b.a parama)
  {
    b = parama;
  }
  
  public final void a(b paramb)
  {
    b.a(paramb);
    Object localObject1 = a.s;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = a.c.getDecorView();
      localObject2 = a.t;
      ((View)localObject1).removeCallbacks((Runnable)localObject2);
    }
    localObject1 = a.r;
    if (localObject1 != null)
    {
      a.p();
      localObject1 = a;
      localObject2 = w.s(a.r).a(0.0F);
      u = ((ae)localObject2);
      localObject1 = a.u;
      localObject2 = new android/support/v7/app/m$b$1;
      ((m.b.1)localObject2).<init>(this);
      ((ae)localObject1).a((ai)localObject2);
    }
    localObject1 = a.f;
    if (localObject1 != null)
    {
      localObject1 = a.f;
      localObject1 = a.q;
    }
    a.q = null;
  }
  
  public final boolean a(b paramb, Menu paramMenu)
  {
    return b.a(paramb, paramMenu);
  }
  
  public final boolean a(b paramb, MenuItem paramMenuItem)
  {
    return b.a(paramb, paramMenuItem);
  }
  
  public final boolean b(b paramb, Menu paramMenu)
  {
    return b.b(paramb, paramMenu);
  }
}


/* Location:              android/support/v7/app/m$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */