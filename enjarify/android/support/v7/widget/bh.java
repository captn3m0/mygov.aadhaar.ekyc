package android.support.v7.widget;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.g;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

public final class bh
  extends Resources
{
  private final WeakReference a;
  
  public bh(Context paramContext, Resources paramResources)
  {
    super((AssetManager)localObject, localDisplayMetrics, localConfiguration);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramContext);
    a = ((WeakReference)localObject);
  }
  
  public static boolean a()
  {
    boolean bool = g.l();
    if (bool)
    {
      i = Build.VERSION.SDK_INT;
      int k = 20;
      if (i > k) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public final Drawable getDrawable(int paramInt)
  {
    Object localObject = (Context)a.get();
    if (localObject != null)
    {
      m localm = m.a();
      Drawable localDrawable = localm.a((Context)localObject, paramInt);
      if (localDrawable == null) {
        localDrawable = super.getDrawable(paramInt);
      }
      if (localDrawable != null) {
        localObject = localm.a((Context)localObject, paramInt, false, localDrawable);
      }
    }
    for (;;)
    {
      return (Drawable)localObject;
      localObject = null;
      continue;
      localObject = super.getDrawable(paramInt);
    }
  }
}


/* Location:              android/support/v7/widget/bh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */