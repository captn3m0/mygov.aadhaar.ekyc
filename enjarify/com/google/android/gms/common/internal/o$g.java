package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class o$g
  extends ac.a
{
  private o a;
  private final int b;
  
  public o$g(o paramo, int paramInt)
  {
    a = paramo;
    b = paramInt;
  }
  
  public final void a(int paramInt, Bundle paramBundle)
  {
    Exception localException = new java/lang/Exception;
    localException.<init>();
    Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", localException);
  }
  
  public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    c.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
    o localo = a;
    int i = b;
    localo.a(paramInt, paramIBinder, paramBundle, i);
    a = null;
  }
}


/* Location:              com/google/android/gms/common/internal/o$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */