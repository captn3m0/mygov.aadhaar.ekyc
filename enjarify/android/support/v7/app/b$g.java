package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;

final class b$g
  implements b.a
{
  final Toolbar a;
  final Drawable b;
  final CharSequence c;
  
  b$g(Toolbar paramToolbar)
  {
    a = paramToolbar;
    Object localObject = paramToolbar.getNavigationIcon();
    b = ((Drawable)localObject);
    localObject = paramToolbar.getNavigationContentDescription();
    c = ((CharSequence)localObject);
  }
  
  public final Drawable a()
  {
    return b;
  }
  
  public final void a(int paramInt)
  {
    Toolbar localToolbar;
    if (paramInt == 0)
    {
      localToolbar = a;
      CharSequence localCharSequence = c;
      localToolbar.setNavigationContentDescription(localCharSequence);
    }
    for (;;)
    {
      return;
      localToolbar = a;
      localToolbar.setNavigationContentDescription(paramInt);
    }
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    a.setNavigationIcon(paramDrawable);
    a(paramInt);
  }
  
  public final Context b()
  {
    return a.getContext();
  }
  
  public final boolean c()
  {
    return true;
  }
}


/* Location:              android/support/v7/app/b$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */