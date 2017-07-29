package android.support.v7.widget;

import android.os.Bundle;
import android.view.View;

final class au$1
  extends android.support.v4.h.b
{
  au$1(au paramau) {}
  
  public final void a(View paramView, android.support.v4.h.a.b paramb)
  {
    super.a(paramView, paramb);
    Object localObject = a.a;
    boolean bool = ((at)localObject).n();
    if (!bool)
    {
      localObject = a.a.getLayoutManager();
      if (localObject != null)
      {
        localObject = a.a.getLayoutManager();
        ((at.g)localObject).a(paramView, paramb);
      }
    }
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool1 = false;
    boolean bool2 = super.a(paramView, paramInt, paramBundle);
    if (bool2) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      Object localObject = a.a;
      bool2 = ((at)localObject).n();
      if (!bool2)
      {
        localObject = a.a.getLayoutManager();
        if (localObject != null)
        {
          localObject = a.a.getLayoutManager();
          localObject = q.F;
        }
      }
    }
  }
}


/* Location:              android/support/v7/widget/au$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */