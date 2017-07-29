package com.google.android.gms.b;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;

public final class el
  extends a
{
  public static final Parcelable.Creator<el> CREATOR = new em();
  final int a;
  final Account b;
  final Scope[] c;
  final String d;
  
  el(int paramInt, Account paramAccount, Scope[] paramArrayOfScope, String paramString)
  {
    a = paramInt;
    b = paramAccount;
    c = paramArrayOfScope;
    d = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    em.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */