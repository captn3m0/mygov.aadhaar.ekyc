package android.support.design.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class n
{
  private static n e;
  final Object a = new Object();
  final Handler b = new Handler(Looper.getMainLooper(), new Handler.Callback()
  {
    public final boolean handleMessage(Message arg1)
    {
      switch (what)
      {
      default: 
        return false;
      }
      n localn = n.this;
      n.b localb = (n.b)obj;
      synchronized (a)
      {
        if ((c == localb) || (d == localb)) {
          localn.a(localb, 2);
        }
        return true;
      }
    }
  });
  b c;
  b d;
  
  static n a()
  {
    if (e == null) {
      e = new n();
    }
    return e;
  }
  
  public final void a(a parama)
  {
    synchronized (a)
    {
      if ((d(parama)) && (!c.c))
      {
        c.c = true;
        b.removeCallbacksAndMessages(c);
      }
      return;
    }
  }
  
  final void a(b paramb)
  {
    if (b == -2) {
      return;
    }
    int i = 2750;
    if (b > 0) {
      i = b;
    }
    for (;;)
    {
      b.removeCallbacksAndMessages(paramb);
      b.sendMessageDelayed(Message.obtain(b, 0, paramb), i);
      return;
      if (b == -1) {
        i = 1500;
      }
    }
  }
  
  final boolean a(b paramb, int paramInt)
  {
    a locala = (a)a.get();
    if (locala != null)
    {
      b.removeCallbacksAndMessages(paramb);
      locala.a(paramInt);
      return true;
    }
    return false;
  }
  
  final void b()
  {
    if (d != null)
    {
      c = d;
      d = null;
      a locala = (a)c.a.get();
      if (locala != null) {
        locala.a();
      }
    }
    else
    {
      return;
    }
    c = null;
  }
  
  public final void b(a parama)
  {
    synchronized (a)
    {
      if ((d(parama)) && (c.c))
      {
        c.c = false;
        a(c);
      }
      return;
    }
  }
  
  public final boolean c(a parama)
  {
    for (;;)
    {
      synchronized (a)
      {
        if (!d(parama))
        {
          if (!e(parama)) {
            break label40;
          }
          break label35;
          return bool;
        }
      }
      label35:
      boolean bool = true;
      continue;
      label40:
      bool = false;
    }
  }
  
  final boolean d(a parama)
  {
    return (c != null) && (c.a(parama));
  }
  
  final boolean e(a parama)
  {
    return (d != null) && (d.a(parama));
  }
  
  static abstract interface a
  {
    public abstract void a();
    
    public abstract void a(int paramInt);
  }
  
  private static final class b
  {
    final WeakReference<n.a> a;
    int b;
    boolean c;
    
    b(int paramInt, n.a parama)
    {
      a = new WeakReference(parama);
      b = paramInt;
    }
    
    final boolean a(n.a parama)
    {
      return (parama != null) && (a.get() == parama);
    }
  }
}


/* Location:              android/support/design/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */