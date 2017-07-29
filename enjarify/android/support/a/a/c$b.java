package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

final class c$b
  extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;
  
  public c$b(Drawable.ConstantState paramConstantState)
  {
    a = paramConstantState;
  }
  
  public final boolean canApplyTheme()
  {
    return a.canApplyTheme();
  }
  
  public final int getChangingConfigurations()
  {
    return a.getChangingConfigurations();
  }
  
  public final Drawable newDrawable()
  {
    c localc = new android/support/a/a/c;
    localc.<init>();
    Drawable localDrawable = a.newDrawable();
    b = localDrawable;
    localDrawable = b;
    Drawable.Callback localCallback = a;
    localDrawable.setCallback(localCallback);
    return localc;
  }
  
  public final Drawable newDrawable(Resources paramResources)
  {
    c localc = new android/support/a/a/c;
    localc.<init>();
    Drawable localDrawable = a.newDrawable(paramResources);
    b = localDrawable;
    localDrawable = b;
    Drawable.Callback localCallback = a;
    localDrawable.setCallback(localCallback);
    return localc;
  }
  
  public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    c localc = new android/support/a/a/c;
    localc.<init>();
    Drawable localDrawable = a.newDrawable(paramResources, paramTheme);
    b = localDrawable;
    localDrawable = b;
    Drawable.Callback localCallback = a;
    localDrawable.setCallback(localCallback);
    return localc;
  }
}


/* Location:              android/support/a/a/c$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */