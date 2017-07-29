package com.google.android.gms.b;

import java.util.Iterator;
import java.util.List;

final class hh$a$1
  implements Runnable
{
  hh$a$1(hh.a parama) {}
  
  public final void run()
  {
    Object localObject1 = a;
    synchronized (hh.a.a((hh.a)localObject1))
    {
      localObject1 = a;
      boolean bool = hh.a.b((hh.a)localObject1);
      if (bool)
      {
        localObject1 = a;
        bool = hh.a.c((hh.a)localObject1);
        if (bool)
        {
          localObject1 = a;
          hh.a.d((hh.a)localObject1);
          localObject1 = "App went background";
          tp.b((String)localObject1);
          localObject1 = a;
          localObject1 = hh.a.e((hh.a)localObject1);
          Iterator localIterator = ((List)localObject1).iterator();
          for (;;)
          {
            bool = localIterator.hasNext();
            if (!bool) {
              break label139;
            }
            localObject1 = localIterator.next();
            localObject1 = (hh.b)localObject1;
            String str2 = null;
            try
            {
              ((hh.b)localObject1).a(false);
            }
            catch (Exception localException)
            {
              str2 = "OnForegroundStateChangedListener threw exception.";
              tp.b(str2, localException);
            }
          }
        }
      }
    }
    String str1 = "App is still foreground";
    tp.b(str1);
    label139:
  }
}


/* Location:              com/google/android/gms/b/hh$a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */