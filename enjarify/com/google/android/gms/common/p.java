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
    Object localObject = paramContext.getApplicationContext();
    a = ((Context)localObject);
    localObject = bc.a(a);
    b = ((bb)localObject);
  }
  
  static n.a a(PackageInfo paramPackageInfo, n.a... paramVarArgs)
  {
    int i = 0;
    n.a locala = null;
    Object localObject1 = signatures;
    if (localObject1 == null)
    {
      i = 0;
      locala = null;
    }
    for (;;)
    {
      return locala;
      localObject1 = signatures;
      int j = localObject1.length;
      int k = 1;
      if (j != k)
      {
        localObject1 = "Package has more than one signature.";
        Log.w("GoogleSignatureVerifier", (String)localObject1);
        i = 0;
        locala = null;
      }
      else
      {
        localObject1 = new com/google/android/gms/common/n$b;
        Object localObject2 = signatures[0].toByteArray();
        ((n.b)localObject1).<init>((byte[])localObject2);
        for (;;)
        {
          k = paramVarArgs.length;
          if (i >= k) {
            break label127;
          }
          localObject2 = paramVarArgs[i];
          boolean bool = ((n.a)localObject2).equals(localObject1);
          if (bool)
          {
            locala = paramVarArgs[i];
            break;
          }
          i += 1;
        }
        label127:
        i = 0;
        locala = null;
      }
    }
  }
  
  public static p a(Context paramContext)
  {
    c.a(paramContext);
    synchronized (p.class)
    {
      p localp = c;
      if (localp == null)
      {
        n.a(paramContext);
        localp = new com/google/android/gms/common/p;
        localp.<init>(paramContext);
        c = localp;
      }
      return c;
    }
  }
  
  public static boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    boolean bool = true;
    Object localObject;
    if (paramPackageInfo != null)
    {
      localObject = signatures;
      if (localObject != null) {
        if (paramBoolean)
        {
          localObject = n.d.a;
          localObject = a(paramPackageInfo, (n.a[])localObject);
          if (localObject == null) {
            break label61;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      localObject = new n.a[bool];
      n.a locala = n.d.a[0];
      localObject[0] = locala;
      localObject = a(paramPackageInfo, (n.a[])localObject);
      break;
      label61:
      bool = false;
    }
  }
  
  private boolean a(String paramString)
  {
    boolean bool1 = false;
    for (;;)
    {
      try
      {
        localObject1 = b;
        int i = 64;
        localObject2 = ((bb)localObject1).b(paramString, i);
        if (localObject2 != null) {
          continue;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject1;
        Object localObject2;
        boolean bool3;
        boolean bool4;
        boolean bool2;
        String str;
        continue;
      }
      return bool1;
      localObject1 = a;
      bool3 = o.c((Context)localObject1);
      if (bool3)
      {
        bool3 = true;
        bool1 = b((PackageInfo)localObject2, bool3);
      }
      else
      {
        bool3 = false;
        localObject1 = null;
        bool3 = b((PackageInfo)localObject2, false);
        if (!bool3)
        {
          bool4 = true;
          bool2 = b((PackageInfo)localObject2, bool4);
          if (bool2)
          {
            localObject2 = "GoogleSignatureVerifier";
            str = "Test-keys aren't accepted on this build.";
            Log.w((String)localObject2, str);
          }
        }
        bool1 = bool3;
      }
    }
  }
  
  private static boolean b(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = signatures;
    int i = localObject2.length;
    int j = 1;
    Object localObject3;
    if (i != j)
    {
      localObject2 = "GoogleSignatureVerifier";
      localObject3 = "Package has more than one signature.";
      Log.w((String)localObject2, (String)localObject3);
    }
    label143:
    for (;;)
    {
      return bool;
      localObject2 = new com/google/android/gms/common/n$b;
      localObject3 = signatures;
      localObject1 = localObject3[0].toByteArray();
      ((n.b)localObject2).<init>((byte[])localObject1);
      localObject1 = packageName;
      if (paramBoolean) {}
      for (bool = n.b((String)localObject1, (n.a)localObject2);; bool = n.a((String)localObject1, (n.a)localObject2))
      {
        if (bool) {
          break label143;
        }
        localObject2 = "GoogleSignatureVerifier";
        j = 27;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(j);
        localObject3 = "Cert not in list. atk=" + paramBoolean;
        Log.d((String)localObject2, (String)localObject3);
        break;
      }
    }
  }
  
  public final boolean a(int paramInt)
  {
    boolean bool1 = false;
    bb localbb = b;
    String[] arrayOfString = localbb.a(paramInt);
    int i;
    if (arrayOfString != null)
    {
      i = arrayOfString.length;
      if (i != 0) {
        break label31;
      }
    }
    label31:
    label80:
    for (;;)
    {
      return bool1;
      int j = arrayOfString.length;
      i = 0;
      localbb = null;
      for (;;)
      {
        if (i >= j) {
          break label80;
        }
        String str = arrayOfString[i];
        boolean bool2 = a(str);
        if (bool2)
        {
          bool1 = true;
          break;
        }
        i += 1;
      }
    }
  }
}


/* Location:              com/google/android/gms/common/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */