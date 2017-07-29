package android.support.v4.d.a;

import android.graphics.drawable.Drawable;

class a$e
  extends a.d
{
  public final void a(Drawable paramDrawable, boolean paramBoolean)
  {
    paramDrawable.setAutoMirrored(paramBoolean);
  }
  
  public final boolean b(Drawable paramDrawable)
  {
    return paramDrawable.isAutoMirrored();
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof h;
    if (!bool)
    {
      f localf = new android/support/v4/d/a/f;
      localf.<init>(paramDrawable);
      paramDrawable = localf;
    }
    return (Drawable)paramDrawable;
  }
  
  public final int e(Drawable paramDrawable)
  {
    return paramDrawable.getAlpha();
  }
}


/* Location:              android/support/v4/d/a/a$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */