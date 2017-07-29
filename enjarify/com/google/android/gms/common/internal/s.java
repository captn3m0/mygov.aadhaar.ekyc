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
  public static final Parcelable.Creator CREATOR;
  final int a;
  final int b;
  int c;
  String d;
  IBinder e;
  Scope[] f;
  Bundle g;
  Account h;
  k[] i;
  
  static
  {
    t localt = new com/google/android/gms/common/internal/t;
    localt.<init>();
    CREATOR = localt;
  }
  
  public s(int paramInt)
  {
    a = 3;
    int j = m.b;
    c = j;
    b = paramInt;
  }
  
  s(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, k[] paramArrayOfk)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    Object localObject = "com.google.android.gms";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool)
    {
      localObject = "com.google.android.gms";
      d = ((String)localObject);
      int j = 2;
      if (paramInt1 >= j) {
        break label111;
      }
      j = 0;
      localObject = null;
      if (paramIBinder != null) {
        localObject = a.a(z.a.a(paramIBinder));
      }
    }
    for (h = ((Account)localObject);; h = paramAccount)
    {
      f = paramArrayOfScope;
      g = paramBundle;
      i = paramArrayOfk;
      return;
      d = paramString;
      break;
      label111:
      e = paramIBinder;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/common/internal/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */