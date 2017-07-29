package com.google.android.gms.b;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.android.gms.ads.internal.w;
import java.util.concurrent.Callable;

@qi
public final class uh
{
  public static <T> T a(Callable<T> paramCallable)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.getThreadPolicy();
    try
    {
      StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(localThreadPolicy).permitDiskReads().permitDiskWrites().build());
      paramCallable = paramCallable.call();
      return paramCallable;
    }
    catch (Throwable paramCallable)
    {
      tp.b("Unexpected exception.", paramCallable);
      w.i().a(paramCallable, "StrictModeUtil.runWithLaxStrictMode");
      return null;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
}


/* Location:              com/google/android/gms/b/uh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */