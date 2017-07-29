package android.support.v4.d.a;

import android.graphics.drawable.Drawable;

class a$c
  extends a.a
{
  public final void a(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof h;
    if (!bool)
    {
      e locale = new android/support/v4/d/a/e;
      locale.<init>(paramDrawable);
      paramDrawable = locale;
    }
    return (Drawable)paramDrawable;
  }
}


/* Location:              android/support/v4/d/a/a$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */