package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class b$f
  implements b.a
{
  final Activity a;
  
  b$f(Activity paramActivity)
  {
    a = paramActivity;
  }
  
  public final Drawable a()
  {
    Object localObject = b();
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843531;
    localObject = ((Context)localObject).obtainStyledAttributes(null, arrayOfInt, 16843470, 0);
    Drawable localDrawable = ((TypedArray)localObject).getDrawable(0);
    ((TypedArray)localObject).recycle();
    return localDrawable;
  }
  
  public final void a(int paramInt)
  {
    ActionBar localActionBar = a.getActionBar();
    if (localActionBar != null) {
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = a.getActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public final Context b()
  {
    Object localObject = a.getActionBar();
    if (localObject != null) {}
    for (localObject = ((ActionBar)localObject).getThemedContext();; localObject = a) {
      return (Context)localObject;
    }
  }
  
  public final boolean c()
  {
    ActionBar localActionBar = a.getActionBar();
    int i;
    if (localActionBar != null)
    {
      i = localActionBar.getDisplayOptions() & 0x4;
      if (i != 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localActionBar = null;
    }
  }
}


/* Location:              android/support/v7/app/b$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */