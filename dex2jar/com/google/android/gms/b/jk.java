package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.g;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.j;
import java.util.concurrent.atomic.AtomicBoolean;

@qi
public final class jk
{
  public final oa a = new oa();
  public final i b = new i();
  public final ir c = new ir()
  {
    public final void a()
    {
      b.a(c());
      super.a();
    }
    
    public final void a(int paramAnonymousInt)
    {
      b.a(c());
      super.a(paramAnonymousInt);
    }
  };
  public ib d;
  public com.google.android.gms.ads.a e;
  public d[] f;
  public com.google.android.gms.ads.a.a g;
  public g h;
  public ix i;
  public com.google.android.gms.ads.purchase.a j;
  public com.google.android.gms.ads.a.b k;
  public com.google.android.gms.ads.purchase.b l;
  public j m;
  public String n;
  public String o;
  public ViewGroup p;
  public int q;
  public boolean r;
  private final ik s;
  private final AtomicBoolean t;
  
  public jk(ViewGroup paramViewGroup)
  {
    this(paramViewGroup, ik.a(), (byte)0);
  }
  
  private jk(ViewGroup paramViewGroup, ik paramik)
  {
    p = paramViewGroup;
    s = paramik;
    i = null;
    t = new AtomicBoolean(false);
    q = 0;
  }
  
  private jk(ViewGroup paramViewGroup, ik paramik, byte paramByte)
  {
    this(paramViewGroup, paramik);
  }
  
  public static il a(Context paramContext, d[] paramArrayOfd, int paramInt)
  {
    boolean bool = true;
    paramContext = new il(paramContext, paramArrayOfd);
    if (paramInt == 1) {}
    for (;;)
    {
      j = bool;
      return paramContext;
      bool = false;
    }
  }
  
  public final d a()
  {
    try
    {
      if (i != null)
      {
        Object localObject = i.j();
        if (localObject != null)
        {
          localObject = ((il)localObject).c();
          return (d)localObject;
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Failed to get the current AdSize.", localRemoteException);
      if (f != null) {
        return f[0];
      }
    }
    return null;
  }
  
  public final void a(com.google.android.gms.ads.a parama)
  {
    e = parama;
    ir localir = c;
    synchronized (a)
    {
      b = parama;
      return;
    }
  }
  
  public final void a(ib paramib)
  {
    try
    {
      d = paramib;
      ix localix;
      if (i != null)
      {
        localix = i;
        if (paramib == null) {
          break label38;
        }
      }
      label38:
      for (paramib = new ic(paramib);; paramib = null)
      {
        localix.a(paramib);
        return;
      }
      return;
    }
    catch (RemoteException paramib)
    {
      ul.c("Failed to set the AdClickListener.", paramib);
    }
  }
  
  public final void a(String paramString)
  {
    if (n != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }
    n = paramString;
  }
  
  public final void a(d... paramVarArgs)
  {
    if (f != null) {
      throw new IllegalStateException("The ad size can only be set once on AdView.");
    }
    b(paramVarArgs);
  }
  
  public final String b()
  {
    try
    {
      if (i != null)
      {
        String str = i.F();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Failed to get the mediation adapter class name.", localRemoteException);
    }
    return null;
  }
  
  public final void b(d... paramVarArgs)
  {
    f = paramVarArgs;
    try
    {
      if (i != null) {
        i.a(a(p.getContext(), f, q));
      }
      p.requestLayout();
      return;
    }
    catch (RemoteException paramVarArgs)
    {
      for (;;)
      {
        ul.c("Failed to set the ad size.", paramVarArgs);
      }
    }
  }
  
  public final jf c()
  {
    if (i == null) {
      return null;
    }
    try
    {
      jf localjf = i.q();
      return localjf;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Failed to retrieve VideoController.", localRemoteException);
    }
    return null;
  }
}


/* Location:              com/google/android/gms/b/jk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */