package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.a.d;
import com.google.android.gms.ads.g;

@qi
public final class jl
{
  public final oa a = new oa();
  public final Context b;
  public com.google.android.gms.ads.a c;
  public ib d;
  public ix e;
  public String f;
  public String g;
  public com.google.android.gms.ads.a.a h;
  public com.google.android.gms.ads.purchase.b i;
  public com.google.android.gms.ads.purchase.a j;
  public com.google.android.gms.ads.a.b k;
  public g l;
  public com.google.android.gms.ads.d.b m;
  public boolean n;
  private final ik o;
  private d p;
  
  public jl(Context paramContext)
  {
    this(paramContext, ik.a());
  }
  
  private jl(Context paramContext, ik paramik)
  {
    b = paramContext;
    o = paramik;
    p = null;
  }
  
  public final void a(String paramString)
  {
    if (e == null) {
      throw new IllegalStateException(String.valueOf(paramString).length() + 63 + "The ad unit ID must be set on InterstitialAd before " + paramString + " is called.");
    }
  }
  
  public final boolean a()
  {
    try
    {
      if (e == null) {
        return false;
      }
      boolean bool = e.k();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Failed to check if ad is ready.", localRemoteException);
    }
    return false;
  }
}


/* Location:              com/google/android/gms/b/jl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */