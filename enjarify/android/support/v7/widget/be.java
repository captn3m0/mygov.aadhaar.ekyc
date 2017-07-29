package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

final class be
  extends av
{
  private final WeakReference a;
  
  public be(Context paramContext, Resources paramResources)
  {
    super(paramResources);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramContext);
    a = localWeakReference;
  }
  
  public final Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = super.getDrawable(paramInt);
    Context localContext = (Context)a.get();
    if ((localDrawable != null) && (localContext != null))
    {
      m.a();
      m.a(localContext, paramInt, localDrawable);
    }
    return localDrawable;
  }
}


/* Location:              android/support/v7/widget/be.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */