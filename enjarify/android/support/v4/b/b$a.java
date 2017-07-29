package android.support.v4.b;

import android.app.AppOpsManager;
import android.content.Context;

final class b$a
  extends b.b
{
  public final int a(Context paramContext, String paramString1, String paramString2)
  {
    return ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOp(paramString1, paramString2);
  }
  
  public final String a(String paramString)
  {
    return AppOpsManager.permissionToOp(paramString);
  }
}


/* Location:              android/support/v4/b/b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */