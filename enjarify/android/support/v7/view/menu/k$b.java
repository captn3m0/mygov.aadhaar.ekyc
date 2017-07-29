package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.c;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class k$b
  extends FrameLayout
  implements c
{
  final CollapsibleActionView a;
  
  k$b(View paramView)
  {
    super((Context)localObject);
    localObject = paramView;
    localObject = (CollapsibleActionView)paramView;
    a = ((CollapsibleActionView)localObject);
    addView(paramView);
  }
  
  public final void a()
  {
    a.onActionViewExpanded();
  }
  
  public final void b()
  {
    a.onActionViewCollapsed();
  }
}


/* Location:              android/support/v7/view/menu/k$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */