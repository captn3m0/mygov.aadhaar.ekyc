package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.k;
import com.google.android.gms.common.m;

public final class s
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator<s> CREATOR = new t();
  final int a;
  final int b;
  int c;
  String d;
  IBinder e;
  Scope[] f;
  Bundle g;
  Account h;
  k[] i;
  
  public s(int paramInt)
  {
    a = 3;
    c = m.b;
    b = paramInt;
  }
  
  s(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, k[] paramArrayOfk)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    if ("com.google.android.gms".equals(paramString))
    {
      d = "com.google.android.gms";
      if (paramInt1 >= 2) {
        break label92;
      }
      paramString = null;
      if (paramIBinder != null) {
        paramString = a.a(z.a.a(paramIBinder));
      }
    }
    for (h = paramString;; h = paramAccount)
    {
      f = paramArrayOfScope;
      g = paramBundle;
      i = paramArrayOfk;
      return;
      d = paramString;
      break;
      label92:
      e = paramIBinder;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/common/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */