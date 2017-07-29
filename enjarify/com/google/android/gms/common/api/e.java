package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.b.aq;
import com.google.android.gms.common.internal.c;

public final class e
{
  public static d a(Status paramStatus)
  {
    c.a(paramStatus, "Result must not be null");
    aq localaq = new com/google/android/gms/b/aq;
    Looper localLooper = Looper.getMainLooper();
    localaq.<init>(localLooper);
    localaq.a(paramStatus);
    return localaq;
  }
}


/* Location:              com/google/android/gms/common/api/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */