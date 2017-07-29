package com.google.android.gms.b;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

public final class ro
{
  WeakHashMap a;
  
  public ro()
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    a = localWeakHashMap;
  }
  
  public final Future a(Context paramContext)
  {
    ro.1 local1 = new com/google/android/gms/b/ro$1;
    local1.<init>(this, paramContext);
    return ts.a(local1);
  }
}


/* Location:              com/google/android/gms/b/ro.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */