package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.Context;
import java.util.concurrent.Callable;

@qi
@TargetApi(17)
public final class ui
{
  private static ui b = null;
  String a;
  
  public static ui a()
  {
    if (b == null) {
      b = new ui();
    }
    return b;
  }
}


/* Location:              com/google/android/gms/b/ui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */