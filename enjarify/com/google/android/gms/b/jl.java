package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.a.d;
import com.google.android.gms.ads.g;

public final class jl
{
  public final oa a;
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
    this(paramContext, localik);
  }
  
  private jl(Context paramContext, ik paramik)
  {
    oa localoa = new com/google/android/gms/b/oa;
    localoa.<init>();
    a = localoa;
    b = paramContext;
    o = paramik;
    p = null;
  }
  
  public final void a(String paramString)
  {
    Object localObject = e;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      int i1 = String.valueOf(paramString).length() + 63;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i1);
      String str = "The ad unit ID must be set on InterstitialAd before " + paramString + " is called.";
      ((IllegalStateException)localObject).<init>(str);
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean a()
  {
    for (boolean bool = false;; bool = localix.k())
    {
      try
      {
        localix = e;
        if (localix != null) {
          break label13;
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          ix localix;
          label13:
          String str = "Failed to check if ad is ready.";
          ul.c(str, localRemoteException);
        }
      }
      return bool;
      localix = e;
    }
  }
}


/* Location:              com/google/android/gms/b/jl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */