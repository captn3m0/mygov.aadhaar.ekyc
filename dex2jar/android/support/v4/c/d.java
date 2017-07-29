package android.support.v4.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.support.v4.b.b;

public final class d
{
  public static int a(Context paramContext, String paramString)
  {
    int i = Process.myPid();
    int j = Process.myUid();
    String str1 = paramContext.getPackageName();
    if (paramContext.checkPermission(paramString, i, j) == -1) {
      return -1;
    }
    String str2 = b.a(paramString);
    if (str2 != null)
    {
      paramString = str1;
      if (str1 == null)
      {
        paramString = paramContext.getPackageManager().getPackagesForUid(j);
        if ((paramString == null) || (paramString.length <= 0)) {
          return -1;
        }
        paramString = paramString[0];
      }
      if (b.a(paramContext, str2, paramString) != 0) {
        return -2;
      }
    }
    return 0;
  }
}


/* Location:              android/support/v4/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */