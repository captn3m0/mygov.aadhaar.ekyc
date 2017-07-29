package android.support.a.a;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v4.g.a;
import java.util.ArrayList;

final class c$a
  extends Drawable.ConstantState
{
  int a;
  g b;
  AnimatorSet c;
  ArrayList d;
  a e;
  
  public final int getChangingConfigurations()
  {
    return a;
  }
  
  public final Drawable newDrawable()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("No constant state support for SDK < 24.");
    throw localIllegalStateException;
  }
  
  public final Drawable newDrawable(Resources paramResources)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("No constant state support for SDK < 24.");
    throw localIllegalStateException;
  }
}


/* Location:              android/support/a/a/c$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */