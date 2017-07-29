package android.support.v4.b;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

final class u$2
  implements Transition.TransitionListener
{
  u$2(View paramView, ArrayList paramArrayList) {}
  
  public final void onTransitionCancel(Transition paramTransition) {}
  
  public final void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
    a.setVisibility(8);
    Object localObject = b;
    int i = ((ArrayList)localObject).size();
    int k;
    for (int j = 0; j < i; j = k)
    {
      localObject = (View)b.get(j);
      ((View)localObject).setVisibility(0);
      k = j + 1;
    }
  }
  
  public final void onTransitionPause(Transition paramTransition) {}
  
  public final void onTransitionResume(Transition paramTransition) {}
  
  public final void onTransitionStart(Transition paramTransition) {}
}


/* Location:              android/support/v4/b/u$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */