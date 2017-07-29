package com.google.android.gms.b;

import android.view.View;
import android.view.WindowId;

public class tu$e
  extends tu.d
{
  public boolean a(View paramView)
  {
    boolean bool = super.a(paramView);
    WindowId localWindowId;
    if (!bool)
    {
      localWindowId = paramView.getWindowId();
      if (localWindowId == null) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localWindowId = null;
    }
  }
  
  public final int c()
  {
    return 14;
  }
}


/* Location:              com/google/android/gms/b/tu$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */