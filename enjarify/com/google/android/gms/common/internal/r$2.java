package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.b.af;

final class r$2
  extends r
{
  r$2(Intent paramIntent, af paramaf) {}
  
  public final void a()
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = b;
      Intent localIntent = a;
      int i = c;
      ((af)localObject).startActivityForResult(localIntent, i);
    }
  }
}


/* Location:              com/google/android/gms/common/internal/r$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */