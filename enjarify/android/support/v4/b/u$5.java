package android.support.v4.b;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

final class u$5
  implements Transition.TransitionListener
{
  u$5(Object paramObject1, ArrayList paramArrayList1, Object paramObject2, ArrayList paramArrayList2, Object paramObject3, ArrayList paramArrayList3) {}
  
  public final void onTransitionCancel(Transition paramTransition) {}
  
  public final void onTransitionEnd(Transition paramTransition) {}
  
  public final void onTransitionPause(Transition paramTransition) {}
  
  public final void onTransitionResume(Transition paramTransition) {}
  
  public final void onTransitionStart(Transition paramTransition)
  {
    Object localObject = a;
    ArrayList localArrayList;
    if (localObject != null)
    {
      localObject = a;
      localArrayList = b;
      u.b(localObject, localArrayList, null);
    }
    localObject = c;
    if (localObject != null)
    {
      localObject = c;
      localArrayList = d;
      u.b(localObject, localArrayList, null);
    }
    localObject = e;
    if (localObject != null)
    {
      localObject = e;
      localArrayList = f;
      u.b(localObject, localArrayList, null);
    }
  }
}


/* Location:              android/support/v4/b/u$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */