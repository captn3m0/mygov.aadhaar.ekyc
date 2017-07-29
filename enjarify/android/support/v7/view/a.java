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
    a locala = new android/support/v7/view/a;
    locala.<init>(paramContext);
    return locala;
  }
  
  public final int a()
  {
    int i = 960;
    int j = 720;
    int k = 640;
    int m = 600;
    int n = 480;
    Resources localResources = a.getResources();
    int i1 = android.support.v4.c.a.a.b(localResources);
    int i2 = android.support.v4.c.a.a.a(localResources);
    int i3 = android.support.v4.c.a.a.c(localResources);
    if ((i3 > m) || (i1 > m) || ((i1 > i) && (i2 > j)) || ((i1 > j) && (i2 > i))) {
      i3 = 5;
    }
    for (;;)
    {
      return i3;
      i3 = 500;
      if ((i1 >= i3) || ((i1 > k) && (i2 > n)) || ((i1 > n) && (i2 > k)))
      {
        i3 = 4;
      }
      else
      {
        i3 = 360;
        if (i1 >= i3) {
          i3 = 3;
        } else {
          i3 = 2;
        }
      }
    }
  }
  
  public final boolean b()
  {
    Resources localResources = a.getResources();
    int i = a.b.abc_action_bar_embed_tabs;
    return localResources.getBoolean(i);
  }
}


/* Location:              android/support/v7/view/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */