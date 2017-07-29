package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.g;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.j;
import java.util.concurrent.atomic.AtomicBoolean;

public final class jk
{
  public final oa a;
  public final i b;
  public final ir c;
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
    this(paramViewGroup, localik, (byte)0);
  }
  
  private jk(ViewGroup paramViewGroup, ik paramik)
  {
    Object localObject = new com/google/android/gms/b/oa;
    ((oa)localObject).<init>();
    a = ((oa)localObject);
    localObject = new com/google/android/gms/ads/i;
    ((i)localObject).<init>();
    b = ((i)localObject);
    localObject = new com/google/android/gms/b/jk$1;
    ((jk.1)localObject).<init>(this);
    c = ((ir)localObject);
    p = paramViewGroup;
    s = paramik;
    i = null;
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    t = ((AtomicBoolean)localObject);
    q = 0;
  }
  
  private jk(ViewGroup paramViewGroup, ik paramik, byte paramByte)
  {
    this(paramViewGroup, paramik);
  }
  
  public static il a(Context paramContext, d[] paramArrayOfd, int paramInt)
  {
    int i1 = 1;
    il localil = new com/google/android/gms/b/il;
    localil.<init>(paramContext, paramArrayOfd);
    if (paramInt == i1) {}
    for (;;)
    {
      j = i1;
      return localil;
      i1 = 0;
    }
  }
  
  public final d a()
  {
    try
    {
      localObject1 = i;
      if (localObject1 == null) {
        break label41;
      }
      localObject1 = i;
      localObject1 = ((ix)localObject1).j();
      if (localObject1 == null) {
        break label41;
      }
      localObject1 = ((il)localObject1).c();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get the current AdSize.";
        ul.c(str, localRemoteException);
        label41:
        Object localObject2 = f;
        if (localObject2 != null)
        {
          localObject2 = f;
          str = null;
          localObject2 = localObject2[0];
        }
        else
        {
          localObject2 = null;
        }
      }
    }
    return (d)localObject1;
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
    for (;;)
    {
      try
      {
        d = paramib;
        localObject1 = i;
        if (localObject1 != null)
        {
          localObject2 = i;
          if (paramib != null)
          {
            localObject1 = new com/google/android/gms/b/ic;
            ((ic)localObject1).<init>(paramib);
            ((ix)localObject2).a((is)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2 = "Failed to set the AdClickListener.";
        ul.c((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
  
  public final void a(String paramString)
  {
    Object localObject = n;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("The ad unit ID can only be set once on AdView.");
      throw ((Throwable)localObject);
    }
    n = paramString;
  }
  
  public final void a(d... paramVarArgs)
  {
    Object localObject = f;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("The ad size can only be set once on AdView.");
      throw ((Throwable)localObject);
    }
    b(paramVarArgs);
  }
  
  public final String b()
  {
    try
    {
      localObject1 = i;
      if (localObject1 == null) {
        break label32;
      }
      localObject1 = i;
      localObject1 = ((ix)localObject1).F();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get the mediation adapter class name.";
        ul.c(str, localRemoteException);
        label32:
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  public final void b(d... paramVarArgs)
  {
    f = paramVarArgs;
    try
    {
      ix localix = i;
      if (localix != null)
      {
        localix = i;
        localObject = p;
        localObject = ((ViewGroup)localObject).getContext();
        d[] arrayOfd = f;
        int i1 = q;
        localObject = a((Context)localObject, arrayOfd, i1);
        localix.a((il)localObject);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to set the ad size.";
        ul.c((String)localObject, localRemoteException);
      }
    }
    p.requestLayout();
  }
  
  public final jf c()
  {
    jf localjf = null;
    ix localix = i;
    if (localix == null) {}
    for (;;)
    {
      return localjf;
      try
      {
        localix = i;
        localjf = localix.q();
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Failed to retrieve VideoController.";
        ul.c(str, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/jk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */