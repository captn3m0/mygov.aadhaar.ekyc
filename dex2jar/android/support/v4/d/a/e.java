package android.support.v4.d.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

@TargetApi(11)
class e
  extends d
{
  e(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  e(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
  }
  
  d.a b()
  {
    return new a(b);
  }
  
  public void jumpToCurrentState()
  {
    c.jumpToCurrentState();
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
      return new e(this, paramResources);
    }
  }
}


/* Location:              android/support/v4/d/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */