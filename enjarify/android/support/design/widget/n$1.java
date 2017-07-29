package android.support.design.widget;

import android.os.Handler.Callback;
import android.os.Message;

final class n$1
  implements Handler.Callback
{
  n$1(n paramn) {}
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = what;
    n.b localb1;
    switch (i)
    {
    default: 
      i = 0;
      localb1 = null;
    }
    for (;;)
    {
      return i;
      n localn = a;
      localb1 = (n.b)obj;
      synchronized (a)
      {
        n.b localb2 = c;
        if (localb2 != localb1)
        {
          localb2 = d;
          if (localb2 != localb1) {}
        }
        else
        {
          int k = 2;
          localn.a(localb1, k);
        }
        int j = 1;
      }
    }
  }
}


/* Location:              android/support/design/widget/n$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */