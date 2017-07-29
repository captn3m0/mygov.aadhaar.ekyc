package com.google.android.gms.b;

import android.os.IInterface;
import com.google.android.gms.a.a;

public abstract interface bm
  extends IInterface
{
  public abstract boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt);
  
  public abstract int getIntFlagValue(String paramString, int paramInt1, int paramInt2);
  
  public abstract long getLongFlagValue(String paramString, long paramLong, int paramInt);
  
  public abstract String getStringFlagValue(String paramString1, String paramString2, int paramInt);
  
  public abstract void init(a parama);
}


/* Location:              com/google/android/gms/b/bm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */