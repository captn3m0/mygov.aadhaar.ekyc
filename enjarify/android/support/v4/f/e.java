package android.support.v4.f;

import android.os.Build.VERSION;
import android.os.Trace;

public final class e
{
  public static void a()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    if (i >= j) {
      Trace.endSection();
    }
  }
  
  public static void a(String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    if (i >= j) {
      Trace.beginSection(paramString);
    }
  }
}


/* Location:              android/support/v4/f/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */