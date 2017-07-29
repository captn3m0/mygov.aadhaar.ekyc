package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.b.bb;
import com.google.android.gms.b.bc;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.f;

public class m
{
  private static final m a;
  public static final int b = o.b;
  
  static
  {
    m localm = new com/google/android/gms/common/m;
    localm.<init>();
    a = localm;
  }
  
  private static String a(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("gcore_");
    int i = b;
    localStringBuilder.append(i);
    Object localObject = "-";
    localStringBuilder.append((String)localObject);
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool) {
      localStringBuilder.append(paramString);
    }
    localObject = "-";
    localStringBuilder.append((String)localObject);
    if (paramContext != null)
    {
      localObject = paramContext.getPackageName();
      localStringBuilder.append((String)localObject);
    }
    localObject = "-";
    localStringBuilder.append((String)localObject);
    if (paramContext != null) {}
    try
    {
      localObject = bc.a(paramContext);
      String str = paramContext.getPackageName();
      localObject = ((bb)localObject).b(str, 0);
      int j = versionCode;
      localStringBuilder.append(j);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return localStringBuilder.toString();
  }
  
  public static m b()
  {
    return a;
  }
  
  public static void c(Context paramContext)
  {
    o.d(paramContext);
  }
  
  public int a(Context paramContext)
  {
    int i = o.b(paramContext);
    boolean bool = o.a(paramContext, i);
    if (bool) {
      i = 18;
    }
    return i;
  }
  
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return a(paramContext, paramInt1, paramInt2, null);
  }
  
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    Object localObject = a(paramContext, paramInt1, paramString);
    if (localObject == null) {}
    int i;
    for (localObject = null;; localObject = PendingIntent.getActivity(paramContext, paramInt2, (Intent)localObject, i))
    {
      return (PendingIntent)localObject;
      i = 268435456;
    }
  }
  
  public Intent a(Context paramContext, int paramInt, String paramString)
  {
    boolean bool;
    Intent localIntent;
    switch (paramInt)
    {
    default: 
      bool = false;
      localIntent = null;
    }
    for (;;)
    {
      return localIntent;
      if (paramContext != null)
      {
        bool = f.a(paramContext);
        if (bool)
        {
          localIntent = y.a();
          continue;
        }
      }
      String str = a(paramContext, paramString);
      localIntent = y.a("com.google.android.gms", str);
      continue;
      localIntent = y.a("com.google.android.gms");
    }
  }
  
  public boolean a(int paramInt)
  {
    return o.c(paramInt);
  }
  
  public int b(Context paramContext)
  {
    return o.g(paramContext);
  }
  
  public Intent b(int paramInt)
  {
    return a(null, paramInt, null);
  }
  
  public boolean b(Context paramContext, int paramInt)
  {
    return o.a(paramContext, paramInt);
  }
  
  public String c(int paramInt)
  {
    return o.a(paramInt);
  }
}


/* Location:              com/google/android/gms/common/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */