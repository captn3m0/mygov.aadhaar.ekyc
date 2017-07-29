package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

final class g$g
  extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;
  
  public g$g(Drawable.ConstantState paramConstantState)
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
    g localg = new android/support/a/a/g;
    localg.<init>();
    VectorDrawable localVectorDrawable = (VectorDrawable)a.newDrawable();
    b = localVectorDrawable;
    return localg;
  }
  
  public final Drawable newDrawable(Resources paramResources)
  {
    g localg = new android/support/a/a/g;
    localg.<init>();
    VectorDrawable localVectorDrawable = (VectorDrawable)a.newDrawable(paramResources);
    b = localVectorDrawable;
    return localg;
  }
  
  public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    g localg = new android/support/a/a/g;
    localg.<init>();
    VectorDrawable localVectorDrawable = (VectorDrawable)a.newDrawable(paramResources, paramTheme);
    b = localVectorDrawable;
    return localg;
  }
}


/* Location:              android/support/a/a/g$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */