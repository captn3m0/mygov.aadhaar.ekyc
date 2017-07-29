package android.support.v4.f;

import android.os.Build.VERSION;
import android.os.Trace;

public final class e
{
  public static void a()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.endSection();
    }
  }
  
  public static void a(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.beginSection(paramString);
    }
  }
}


/* Location:              android/support/v4/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */