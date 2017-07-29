package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.b.ap;
import com.google.android.gms.b.wm;

public final class n$a$a
{
  ap a;
  private Looper b;
  
  public final n.a a()
  {
    Object localObject = a;
    if (localObject == null)
    {
      localObject = new com/google/android/gms/b/wm;
      ((wm)localObject).<init>();
      a = ((ap)localObject);
    }
    localObject = b;
    if (localObject == null)
    {
      localObject = Looper.myLooper();
      if (localObject == null) {
        break label71;
      }
      localObject = Looper.myLooper();
    }
    for (b = ((Looper)localObject);; b = ((Looper)localObject))
    {
      localObject = new com/google/android/gms/common/api/n$a;
      ap localap = a;
      Looper localLooper = b;
      ((n.a)localObject).<init>(localap, localLooper, (byte)0);
      return (n.a)localObject;
      label71:
      localObject = Looper.getMainLooper();
    }
  }
}


/* Location:              com/google/android/gms/common/api/n$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */