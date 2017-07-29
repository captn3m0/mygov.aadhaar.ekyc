package android.support.v7.view;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.a.a.b;

public final class a
{
  public Context a;
  
  private a(Context paramContext)
  {
    a = paramContext;
  }
  
  public static a a(Context paramContext)
  {
    return new a(paramContext);
  }
  
  public final int a()
  {
    Resources localResources = a.getResources();
    int i = android.support.v4.c.a.a.b(localResources);
    int j = android.support.v4.c.a.a.a(localResources);
    if ((android.support.v4.c.a.a.c(localResources) > 600) || (i > 600) || ((i > 960) && (j > 720)) || ((i > 720) && (j > 960))) {
      return 5;
    }
    if ((i >= 500) || ((i > 640) && (j > 480)) || ((i > 480) && (j > 640))) {
      return 4;
    }
    if (i >= 360) {
      return 3;
    }
    return 2;
  }
  
  public final boolean b()
  {
    return a.getResources().getBoolean(a.b.abc_action_bar_embed_tabs);
  }
}


/* Location:              android/support/v7/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */