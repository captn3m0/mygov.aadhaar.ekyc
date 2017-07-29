package android.support.v4.b;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;

public final class b
{
  private static final b a = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      a = new a();
      return;
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
  
  private static final class a
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
  
  private static class b
  {
    public int a(Context paramContext, String paramString1, String paramString2)
    {
      return 1;
    }
    
    public String a(String paramString)
    {
      return null;
    }
  }
}


/* Location:              android/support/v4/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */