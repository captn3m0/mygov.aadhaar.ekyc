package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.a.a;
import com.google.android.gms.b.bm.a;
import com.google.android.gms.b.bn;

public class FlagProviderImpl
  extends bm.a
{
  private boolean a = false;
  private SharedPreferences b;
  
  public boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt)
  {
    boolean bool = a;
    if (!bool) {}
    for (;;)
    {
      return paramBoolean;
      Object localObject = b;
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      a.a.1 local1 = new com/google/android/gms/flags/impl/a$a$1;
      local1.<init>((SharedPreferences)localObject, paramString, localBoolean);
      localObject = (Boolean)bn.a(local1);
      paramBoolean = ((Boolean)localObject).booleanValue();
    }
  }
  
  public int getIntFlagValue(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = a;
    if (!bool) {}
    for (;;)
    {
      return paramInt1;
      Object localObject = b;
      Integer localInteger = Integer.valueOf(paramInt1);
      a.b.1 local1 = new com/google/android/gms/flags/impl/a$b$1;
      local1.<init>((SharedPreferences)localObject, paramString, localInteger);
      localObject = (Integer)bn.a(local1);
      paramInt1 = ((Integer)localObject).intValue();
    }
  }
  
  public long getLongFlagValue(String paramString, long paramLong, int paramInt)
  {
    boolean bool = a;
    if (!bool) {}
    for (;;)
    {
      return paramLong;
      Object localObject = b;
      Long localLong = Long.valueOf(paramLong);
      a.c.1 local1 = new com/google/android/gms/flags/impl/a$c$1;
      local1.<init>((SharedPreferences)localObject, paramString, localLong);
      localObject = (Long)bn.a(local1);
      paramLong = ((Long)localObject).longValue();
    }
  }
  
  public String getStringFlagValue(String paramString1, String paramString2, int paramInt)
  {
    boolean bool = a;
    if (!bool) {}
    for (;;)
    {
      return paramString2;
      Object localObject = b;
      a.d.1 local1 = new com/google/android/gms/flags/impl/a$d$1;
      local1.<init>((SharedPreferences)localObject, paramString1, paramString2);
      localObject = (String)bn.a(local1);
      paramString2 = (String)localObject;
    }
  }
  
  public void init(a parama)
  {
    Object localObject = (Context)com.google.android.gms.a.b.a(parama);
    boolean bool1 = a;
    if (bool1) {}
    for (;;)
    {
      return;
      String str = "com.google.android.gms";
      try
      {
        localObject = ((Context)localObject).createPackageContext(str, 0);
        localObject = b.a((Context)localObject);
        b = ((SharedPreferences)localObject);
        boolean bool2 = true;
        a = bool2;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    }
  }
}


/* Location:              com/google/android/gms/flags/impl/FlagProviderImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */