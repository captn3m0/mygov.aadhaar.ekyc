package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;

final class b$e
  extends b.d
{
  b$e(Activity paramActivity)
  {
    super(paramActivity);
  }
  
  public final Context b()
  {
    Object localObject = a.getActionBar();
    if (localObject != null) {}
    for (localObject = ((ActionBar)localObject).getThemedContext();; localObject = a) {
      return (Context)localObject;
    }
  }
}


/* Location:              android/support/v7/app/b$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */