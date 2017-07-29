package android.support.v7.widget;

import android.view.View;

final class an$1
  implements Runnable
{
  an$1(an paraman) {}
  
  public final void run()
  {
    Object localObject = a.k;
    if (localObject != null)
    {
      localObject = ((View)localObject).getWindowToken();
      if (localObject != null)
      {
        localObject = a;
        ((an)localObject).d();
      }
    }
  }
}


/* Location:              android/support/v7/widget/an$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */