package android.support.v4.b;

import android.content.Context;
import android.os.Build.VERSION;

public final class b
{
  private static final b.b a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/b/b$a;
      ((b.a)localObject).<init>();
    }
    for (a = (b.b)localObject;; a = (b.b)localObject)
    {
      return;
      localObject = new android/support/v4/b/b$b;
      ((b.b)localObject).<init>();
    }
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    return a.a(paramContext, paramString1, paramString2);
  }
  
  public static String a(String paramString)
  {
    return a.a(paramString);
  }
}


/* Location:              android/support/v4/b/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */