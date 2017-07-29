package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public abstract class d$a
  extends Drawable.ConstantState
{
  int a;
  Drawable.ConstantState b;
  ColorStateList c;
  PorterDuff.Mode d;
  
  d$a(a parama)
  {
    int i = 0;
    c = null;
    Object localObject = d.a;
    d = ((PorterDuff.Mode)localObject);
    if (parama != null)
    {
      i = a;
      a = i;
      localObject = b;
      b = ((Drawable.ConstantState)localObject);
      localObject = c;
      c = ((ColorStateList)localObject);
      localObject = d;
      d = ((PorterDuff.Mode)localObject);
    }
  }
  
  public int getChangingConfigurations()
  {
    int i = a;
    Drawable.ConstantState localConstantState = b;
    int j;
    if (localConstantState != null)
    {
      localConstantState = b;
      j = localConstantState.getChangingConfigurations();
    }
    for (;;)
    {
      return j | i;
      j = 0;
      localConstantState = null;
    }
  }
  
  public Drawable newDrawable()
  {
    return newDrawable(null);
  }
  
  public abstract Drawable newDrawable(Resources paramResources);
}


/* Location:              android/support/v4/d/a/d$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */