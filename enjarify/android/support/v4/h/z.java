package android.support.v4.h;

import android.graphics.Rect;
import android.view.View;

final class z
{
  private static ThreadLocal a;
  
  static Rect a()
  {
    Object localObject = a;
    if (localObject == null)
    {
      localObject = new java/lang/ThreadLocal;
      ((ThreadLocal)localObject).<init>();
      a = (ThreadLocal)localObject;
    }
    localObject = (Rect)a.get();
    if (localObject == null)
    {
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      ThreadLocal localThreadLocal = a;
      localThreadLocal.set(localObject);
    }
    ((Rect)localObject).setEmpty();
    return (Rect)localObject;
  }
  
  public static void a(View paramView, z.a parama)
  {
    z.1 local1;
    if (parama == null)
    {
      local1 = null;
      paramView.setOnApplyWindowInsetsListener(null);
    }
    for (;;)
    {
      return;
      local1 = new android/support/v4/h/z$1;
      local1.<init>(parama);
      paramView.setOnApplyWindowInsetsListener(local1);
    }
  }
}


/* Location:              android/support/v4/h/z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */