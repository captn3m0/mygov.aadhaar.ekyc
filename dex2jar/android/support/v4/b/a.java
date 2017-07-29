package android.support.v4.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;

public final class a
  extends android.support.v4.c.a
{
  public static void a(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramActivity.finishAffinity();
      return;
    }
    paramActivity.finish();
  }
  
  public static void a(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramActivity.startActivityForResult(paramIntent, paramInt, null);
      return;
    }
    paramActivity.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:              android/support/v4/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */