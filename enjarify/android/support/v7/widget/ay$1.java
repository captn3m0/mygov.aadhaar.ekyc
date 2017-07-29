package android.support.v7.widget;

import android.view.View;

final class ay$1
  implements Runnable
{
  ay$1(ay paramay, View paramView) {}
  
  public final void run()
  {
    int i = a.getLeft();
    int j = b.getWidth();
    int k = a.getWidth();
    j = (j - k) / 2;
    i -= j;
    b.smoothScrollTo(i, 0);
    b.a = null;
  }
}


/* Location:              android/support/v7/widget/ay$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */