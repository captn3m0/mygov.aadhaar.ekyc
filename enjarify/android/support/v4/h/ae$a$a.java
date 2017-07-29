package android.support.v4.h;

import android.view.View;
import java.lang.ref.WeakReference;

final class ae$a$a
  implements Runnable
{
  WeakReference a;
  ae b;
  
  ae$a$a(ae.a parama, ae paramae, View paramView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    a = localWeakReference;
    b = paramae;
  }
  
  public final void run()
  {
    View localView = (View)a.get();
    if (localView != null)
    {
      ae.a locala = c;
      ae localae = b;
      locala.c(localae, localView);
    }
  }
}


/* Location:              android/support/v4/h/ae$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */