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
  private static final m a = new m();
  public static final int b = o.b;
  
  private static String a(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("gcore_");
    localStringBuilder.append(b);
    localStringBuilder.append("-");
    if (!TextUtils.isEmpty(paramString)) {
      localStringBuilder.append(paramString);
    }
    localStringBuilder.append("-");
    if (paramContext != null) {
      localStringBuilder.append(paramContext.getPackageName());
    }
    localStringBuilder.append("-");
    if (paramContext != null) {}
    try
    {
      localStringBuilder.append(abgetPackageName0versionCode);
      return localStringBuilder.toString();
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
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
    int j = o.b(paramContext);
    int i = j;
    if (o.a(paramContext, j)) {
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
    paramString = a(paramContext, paramInt1, paramString);
    if (paramString == null) {
      return null;
    }
    return PendingIntent.getActivity(paramContext, paramInt2, paramString, 268435456);
  }
  
  public Intent a(Context paramContext, int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
    case 2: 
      if ((paramContext != null) && (f.a(paramContext))) {
        return y.a();
      }
      return y.a("com.google.android.gms", a(paramContext, paramString));
    }
    return y.a("com.google.android.gms");
  }
  
  public boolean a(int paramInt)
  {
    return o.c(paramInt);
  }
  
  public int b(Context paramContext)
  {
    return o.g(paramContext);
  }
  
  @Deprecated
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */