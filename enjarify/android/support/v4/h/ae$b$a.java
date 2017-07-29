package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.View;

final class ae$b$a
  implements ai
{
  ae a;
  boolean b;
  
  ae$b$a(ae paramae)
  {
    a = paramae;
  }
  
  public final void a(View paramView)
  {
    b = false;
    Object localObject = a;
    int i = d;
    if (i >= 0)
    {
      i = 2;
      w.d(paramView, i);
    }
    localObject = a.b;
    if (localObject != null)
    {
      localObject = a.b;
      ae localae = a;
      b = null;
      ((Runnable)localObject).run();
    }
    i = 2113929216;
    localObject = paramView.getTag(i);
    boolean bool = localObject instanceof ai;
    if (bool) {}
    for (localObject = (ai)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((ai)localObject).a(paramView);
      }
      return;
      i = 0;
    }
  }
  
  public final void b(View paramView)
  {
    Object localObject = a;
    int i = d;
    if (i >= 0)
    {
      i = a.d;
      w.d(paramView, i);
      localObject = a;
      k = -1;
      d = k;
    }
    i = Build.VERSION.SDK_INT;
    int k = 16;
    int j;
    if (i < k)
    {
      boolean bool1 = b;
      if (bool1) {}
    }
    else
    {
      localObject = a.c;
      if (localObject != null)
      {
        localObject = a.c;
        ae localae = a;
        c = null;
        ((Runnable)localObject).run();
      }
      j = 2113929216;
      localObject = paramView.getTag(j);
      boolean bool2 = localObject instanceof ai;
      if (!bool2) {
        break label146;
      }
    }
    for (localObject = (ai)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((ai)localObject).b(paramView);
      }
      j = 1;
      b = j;
      return;
      label146:
      j = 0;
    }
  }
  
  public final void c(View paramView)
  {
    int i = 2113929216;
    Object localObject = paramView.getTag(i);
    boolean bool = localObject instanceof ai;
    if (bool) {}
    for (localObject = (ai)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((ai)localObject).c(paramView);
      }
      return;
      i = 0;
    }
  }
}


/* Location:              android/support/v4/h/ae$b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */