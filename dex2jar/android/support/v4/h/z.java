package android.support.v4.h;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

@TargetApi(21)
final class z
{
  private static ThreadLocal<Rect> a;
  
  static Rect a()
  {
    if (a == null) {
      a = new ThreadLocal();
    }
    Rect localRect2 = (Rect)a.get();
    Rect localRect1 = localRect2;
    if (localRect2 == null)
    {
      localRect1 = new Rect();
      a.set(localRect1);
    }
    localRect1.setEmpty();
    return localRect1;
  }
  
  public static void a(View paramView, a parama)
  {
    if (parama == null)
    {
      paramView.setOnApplyWindowInsetsListener(null);
      return;
    }
    paramView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
    {
      public final WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
      {
        return (WindowInsets)a.a(paramAnonymousView, paramAnonymousWindowInsets);
      }
    });
  }
  
  public static abstract interface a
  {
    public abstract Object a(View paramView, Object paramObject);
  }
}


/* Location:              android/support/v4/h/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */