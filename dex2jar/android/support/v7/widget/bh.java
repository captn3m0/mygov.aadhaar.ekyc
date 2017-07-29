package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.g;
import java.lang.ref.WeakReference;

public final class bh
  extends Resources
{
  private final WeakReference<Context> a;
  
  public bh(Context paramContext, Resources paramResources)
  {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    a = new WeakReference(paramContext);
  }
  
  public static boolean a()
  {
    return (g.l()) && (Build.VERSION.SDK_INT <= 20);
  }
  
  public final Drawable getDrawable(int paramInt)
  {
    Context localContext = (Context)a.get();
    if (localContext != null)
    {
      m localm = m.a();
      Drawable localDrawable2 = localm.a(localContext, paramInt);
      Drawable localDrawable1 = localDrawable2;
      if (localDrawable2 == null) {
        localDrawable1 = super.getDrawable(paramInt);
      }
      if (localDrawable1 != null) {
        return localm.a(localContext, paramInt, false, localDrawable1);
      }
      return null;
    }
    return super.getDrawable(paramInt);
  }
}


/* Location:              android/support/v7/widget/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */