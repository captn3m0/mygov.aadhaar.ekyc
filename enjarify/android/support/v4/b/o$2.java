package android.support.v4.b;

import android.view.View;
import android.view.animation.Animation;

final class o$2
  extends o.a
{
  o$2(o paramo, View paramView, Animation paramAnimation, i parami)
  {
    super(paramView, paramAnimation);
  }
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    super.onAnimationEnd(paramAnimation);
    Object localObject = a.A();
    if (localObject != null)
    {
      a.a(null);
      localObject = b;
      i locali1 = a;
      i locali2 = a;
      int i = locali2.B();
      ((o)localObject).a(locali1, i, 0, 0, false);
    }
  }
}


/* Location:              android/support/v4/b/o$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */