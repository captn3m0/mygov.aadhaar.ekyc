package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class n
{
  private static n e;
  final Object a;
  final Handler b;
  n.b c;
  n.b d;
  
  private n()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    n.1 local1 = new android/support/design/widget/n$1;
    local1.<init>(this);
    ((Handler)localObject).<init>(localLooper, local1);
    b = ((Handler)localObject);
  }
  
  static n a()
  {
    n localn = e;
    if (localn == null)
    {
      localn = new android/support/design/widget/n;
      localn.<init>();
      e = localn;
    }
    return e;
  }
  
  public final void a(n.a parama)
  {
    synchronized (a)
    {
      boolean bool1 = d(parama);
      if (bool1)
      {
        Object localObject2 = c;
        bool1 = c;
        if (!bool1)
        {
          localObject2 = c;
          boolean bool2 = true;
          c = bool2;
          localObject2 = b;
          n.b localb = c;
          ((Handler)localObject2).removeCallbacksAndMessages(localb);
        }
      }
      return;
    }
  }
  
  final void a(n.b paramb)
  {
    int i = b;
    int j = -2;
    if (i == j) {
      return;
    }
    i = 2750;
    j = b;
    if (j > 0) {
      i = b;
    }
    for (;;)
    {
      b.removeCallbacksAndMessages(paramb);
      Handler localHandler = b;
      Message localMessage = Message.obtain(b, 0, paramb);
      long l = i;
      localHandler.sendMessageDelayed(localMessage, l);
      break;
      j = b;
      int k = -1;
      if (j == k) {
        i = 1500;
      }
    }
  }
  
  final boolean a(n.b paramb, int paramInt)
  {
    n.a locala = (n.a)a.get();
    boolean bool;
    if (locala != null)
    {
      Handler localHandler = b;
      localHandler.removeCallbacksAndMessages(paramb);
      locala.a(paramInt);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
  
  final void b()
  {
    Object localObject = d;
    if (localObject != null)
    {
      localObject = d;
      c = ((n.b)localObject);
      d = null;
      localObject = (n.a)c.a.get();
      if (localObject == null) {
        break label49;
      }
      ((n.a)localObject).a();
    }
    for (;;)
    {
      return;
      label49:
      c = null;
    }
  }
  
  public final void b(n.a parama)
  {
    synchronized (a)
    {
      boolean bool = d(parama);
      if (bool)
      {
        n.b localb = c;
        bool = c;
        if (bool)
        {
          localb = c;
          c = false;
          localb = c;
          a(localb);
        }
      }
      return;
    }
  }
  
  public final boolean c(n.a parama)
  {
    synchronized (a)
    {
      boolean bool = d(parama);
      if (!bool)
      {
        bool = e(parama);
        if (!bool) {}
      }
      else
      {
        bool = true;
        return bool;
      }
      bool = false;
      Object localObject2 = null;
    }
  }
  
  final boolean d(n.a parama)
  {
    n.b localb = c;
    boolean bool;
    if (localb != null)
    {
      localb = c;
      bool = localb.a(parama);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localb = null;
    }
  }
  
  final boolean e(n.a parama)
  {
    n.b localb = d;
    boolean bool;
    if (localb != null)
    {
      localb = d;
      bool = localb.a(parama);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localb = null;
    }
  }
}


/* Location:              android/support/design/widget/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */