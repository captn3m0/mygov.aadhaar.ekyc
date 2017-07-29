package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.b.bb;
import com.google.android.gms.b.bc;
import com.google.android.gms.common.internal.c;

public class p
{
  private static p c;
  public final Context a;
  public final bb b;
  
  private p(Context paramContext)
  {
    a = paramContext.getApplicationContext();
    b = bc.a(a);
  }
  
  static n.a a(PackageInfo paramPackageInfo, n.a... paramVarArgs)
  {
    int i = 0;
    if (signatures == null) {
      return null;
    }
    if (signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    }
    paramPackageInfo = new n.b(signatures[0].toByteArray());
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals(paramPackageInfo)) {
        return paramVarArgs[i];
      }
      i += 1;
    }
    return null;
  }
  
  public static p a(Context paramContext)
  {
    c.a(paramContext);
    try
    {
      if (c == null)
      {
        n.a(paramContext);
        c = new p(paramContext);
      }
      return c;
    }
    finally {}
  }
  
  public static boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if ((paramPackageInfo != null) && (signatures != null))
    {
      if (paramBoolean) {}
      for (paramPackageInfo = a(paramPackageInfo, n.d.a); paramPackageInfo != null; paramPackageInfo = a(paramPackageInfo, new n.a[] { n.d.a[0] })) {
        return true;
      }
    }
    return false;
  }
  
  private boolean a(String paramString)
  {
    try
    {
      paramString = b.b(paramString, 64);
      if (paramString == null) {
        return false;
      }
      if (o.c(a)) {
        return b(paramString, true);
      }
      boolean bool = b(paramString, false);
      if ((!bool) && (b(paramString, true))) {
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException paramString) {}
    return false;
  }
  
  private static boolean b(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    boolean bool2 = false;
    if (signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return bool2;
    }
    n.b localb = new n.b(signatures[0].toByteArray());
    paramPackageInfo = packageName;
    if (paramBoolean) {}
    for (boolean bool1 = n.b(paramPackageInfo, localb);; bool1 = n.a(paramPackageInfo, localb))
    {
      bool2 = bool1;
      if (bool1) {
        break;
      }
      Log.d("GoogleSignatureVerifier", 27 + "Cert not in list. atk=" + paramBoolean);
      return bool1;
    }
  }
  
  @Deprecated
  public final boolean a(int paramInt)
  {
    String[] arrayOfString = b.a(paramInt);
    if ((arrayOfString == null) || (arrayOfString.length == 0)) {}
    for (;;)
    {
      return false;
      int i = arrayOfString.length;
      paramInt = 0;
      while (paramInt < i)
      {
        if (a(arrayOfString[paramInt])) {
          return true;
        }
        paramInt += 1;
      }
    }
  }
}


/* Location:              com/google/android/gms/common/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */