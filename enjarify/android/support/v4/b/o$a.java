package android.support.v4.b;

import android.support.v4.f.a;
import android.support.v4.h.w;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class o$a
  implements Animation.AnimationListener
{
  private Animation.AnimationListener a;
  private boolean b;
  View c;
  
  public o$a(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null)) {}
    for (;;)
    {
      return;
      c = paramView;
    }
  }
  
  public o$a(View paramView, Animation paramAnimation, Animation.AnimationListener paramAnimationListener)
  {
    if ((paramView == null) || (paramAnimation == null)) {}
    for (;;)
    {
      return;
      a = paramAnimationListener;
      c = paramView;
      boolean bool = true;
      b = bool;
    }
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    Object localObject = c;
    o.a.1 local1;
    if (localObject != null)
    {
      boolean bool = b;
      if (bool)
      {
        localObject = c;
        bool = w.H((View)localObject);
        if (!bool)
        {
          bool = a.a();
          if (!bool) {
            break label85;
          }
        }
        localObject = c;
        local1 = new android/support/v4/b/o$a$1;
        local1.<init>(this);
        ((View)localObject).post(local1);
      }
    }
    for (;;)
    {
      localObject = a;
      if (localObject != null)
      {
        localObject = a;
        ((Animation.AnimationListener)localObject).onAnimationEnd(paramAnimation);
      }
      return;
      label85:
      localObject = c;
      local1 = null;
      w.d((View)localObject, 0);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    Animation.AnimationListener localAnimationListener = a;
    if (localAnimationListener != null)
    {
      localAnimationListener = a;
      localAnimationListener.onAnimationRepeat(paramAnimation);
    }
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    Animation.AnimationListener localAnimationListener = a;
    if (localAnimationListener != null)
    {
      localAnimationListener = a;
      localAnimationListener.onAnimationStart(paramAnimation);
    }
  }
}


/* Location:              android/support/v4/b/o$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */