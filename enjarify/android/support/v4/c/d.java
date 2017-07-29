package android.support.v4.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.support.v4.b.b;

public final class d
{
  public static int a(Context paramContext, String paramString)
  {
    int i = -1;
    int j = Process.myPid();
    int k = Process.myUid();
    Object localObject = paramContext.getPackageName();
    j = paramContext.checkPermission(paramString, j, k);
    int m;
    if (j == i) {
      m = i;
    }
    for (;;)
    {
      return m;
      String str = b.a(paramString);
      if (str != null)
      {
        if (localObject == null)
        {
          localObject = paramContext.getPackageManager().getPackagesForUid(k);
          if (localObject != null)
          {
            k = localObject.length;
            if (k > 0) {}
          }
          else
          {
            m = i;
            continue;
          }
          localObject = localObject[0];
        }
        m = b.a(paramContext, str, (String)localObject);
        if (m != 0)
        {
          m = -2;
          continue;
        }
      }
      m = 0;
      localObject = null;
    }
  }
}


/* Location:              android/support/v4/c/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */