package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.a.a;
import com.google.android.gms.b.bm.a;
import com.google.android.gms.b.bn;
import com.google.android.gms.common.util.DynamiteApi;

@DynamiteApi
public class FlagProviderImpl
  extends bm.a
{
  private boolean a = false;
  private SharedPreferences b;
  
  public boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt)
  {
    if (!a) {
      return paramBoolean;
    }
    return ((Boolean)bn.a(new a.a.1(b, paramString, Boolean.valueOf(paramBoolean)))).booleanValue();
  }
  
  public int getIntFlagValue(String paramString, int paramInt1, int paramInt2)
  {
    if (!a) {
      return paramInt1;
    }
    return ((Integer)bn.a(new a.b.1(b, paramString, Integer.valueOf(paramInt1)))).intValue();
  }
  
  public long getLongFlagValue(String paramString, long paramLong, int paramInt)
  {
    if (!a) {
      return paramLong;
    }
    return ((Long)bn.a(new a.c.1(b, paramString, Long.valueOf(paramLong)))).longValue();
  }
  
  public String getStringFlagValue(String paramString1, String paramString2, int paramInt)
  {
    if (!a) {
      return paramString2;
    }
    return (String)bn.a(new a.d.1(b, paramString1, paramString2));
  }
  
  public void init(a parama)
  {
    parama = (Context)com.google.android.gms.a.b.a(parama);
    if (a) {
      return;
    }
    try
    {
      b = b.a(parama.createPackageContext("com.google.android.gms", 0));
      a = true;
      return;
    }
    catch (PackageManager.NameNotFoundException parama) {}
  }
}


/* Location:              com/google/android/gms/flags/impl/FlagProviderImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */