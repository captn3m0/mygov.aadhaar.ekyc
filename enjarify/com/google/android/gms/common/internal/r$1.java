package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class r$1
  extends r
{
  r$1(Intent paramIntent, Activity paramActivity) {}
  
  public final void a()
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = b;
      Intent localIntent = a;
      int i = c;
      ((Activity)localObject).startActivityForResult(localIntent, i);
    }
  }
}


/* Location:              com/google/android/gms/common/internal/r$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */