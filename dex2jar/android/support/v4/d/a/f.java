package android.support.v4.d.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

@TargetApi(19)
class f
  extends e
{
  f(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  f(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
  }
  
  d.a b()
  {
    return new a(b);
  }
  
  public boolean isAutoMirrored()
  {
    return c.isAutoMirrored();
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    c.setAutoMirrored(paramBoolean);
  }
  
  private static final class a
    extends d.a
  {
    a(d.a parama)
    {
      super();
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new f(this, paramResources);
    }
  }
}


/* Location:              android/support/v4/d/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */