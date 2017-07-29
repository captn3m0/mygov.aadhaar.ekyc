package com.google.android.gms.ads.a;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.g;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.j;
import com.google.android.gms.b.in;
import com.google.android.gms.b.ix;
import com.google.android.gms.b.iz;
import com.google.android.gms.b.jb;
import com.google.android.gms.b.jk;
import com.google.android.gms.b.jt;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.kr;
import com.google.android.gms.b.ul;

public final class c
  extends ViewGroup
{
  private final jk a;
  
  public final com.google.android.gms.ads.a getAdListener()
  {
    return a.e;
  }
  
  public final d getAdSize()
  {
    return a.a();
  }
  
  public final d[] getAdSizes()
  {
    return a.f;
  }
  
  public final String getAdUnitId()
  {
    return a.n;
  }
  
  public final a getAppEventListener()
  {
    return a.g;
  }
  
  public final String getMediationAdapterClassName()
  {
    return a.b();
  }
  
  public final b getOnCustomRenderedAdLoadedListener()
  {
    return a.k;
  }
  
  public final i getVideoController()
  {
    return a.b;
  }
  
  public final j getVideoOptions()
  {
    return a.m;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if (localView != null)
    {
      int i = localView.getVisibility();
      int j = 8;
      if (i != j)
      {
        i = localView.getMeasuredWidth();
        j = localView.getMeasuredHeight();
        int k = (paramInt3 - paramInt1 - i) / 2;
        int m = (paramInt4 - paramInt2 - j) / 2;
        i += k;
        j += m;
        localView.layout(k, m, i, j);
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Context localContext = null;
    Object localObject1 = getChildAt(0);
    int j;
    if (localObject1 != null)
    {
      j = ((View)localObject1).getVisibility();
      int k = 8;
      if (j != k)
      {
        measureChild((View)localObject1, paramInt1, paramInt2);
        j = ((View)localObject1).getMeasuredWidth();
        i = ((View)localObject1).getMeasuredHeight();
      }
    }
    int m;
    d locald;
    for (;;)
    {
      m = getSuggestedMinimumWidth();
      j = Math.max(j, m);
      m = getSuggestedMinimumHeight();
      i = Math.max(i, m);
      j = View.resolveSize(j, paramInt1);
      i = View.resolveSize(i, paramInt2);
      setMeasuredDimension(j, i);
      return;
      j = 0;
      locald = null;
      try
      {
        locald = getAdSize();
        localObject1 = locald;
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          String str = "Unable to retrieve ad size.";
          ul.b(str, localNullPointerException);
          m = 0;
          Object localObject2 = null;
        }
        j = 0;
        locald = null;
      }
      if (localObject1 != null)
      {
        localContext = getContext();
        j = ((d)localObject1).b(localContext);
        i = ((d)localObject1).a(localContext);
      }
    }
  }
  
  public final void setAdListener(com.google.android.gms.ads.a parama)
  {
    a.a(parama);
  }
  
  public final void setAdSizes(d... paramVarArgs)
  {
    if (paramVarArgs != null)
    {
      int i = paramVarArgs.length;
      if (i > 0) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The supported ad sizes must contain at least one valid ad size.");
      throw localIllegalArgumentException;
    }
    a.b(paramVarArgs);
  }
  
  public final void setAdUnitId(String paramString)
  {
    a.a(paramString);
  }
  
  public final void setAppEventListener(a parama)
  {
    for (Object localObject1 = a;; localObject1 = null) {
      try
      {
        g = parama;
        localObject2 = i;
        if (localObject2 != null)
        {
          localObject2 = i;
          if (parama != null)
          {
            localObject1 = new com/google/android/gms/b/in;
            ((in)localObject1).<init>(parama);
            ((ix)localObject2).a((iz)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Object localObject2 = "Failed to set the AppEventListener.";
          ul.c((String)localObject2, localRemoteException);
        }
      }
    }
  }
  
  public final void setCorrelator(g paramg)
  {
    Object localObject1 = a;
    h = paramg;
    for (;;)
    {
      try
      {
        localObject2 = i;
        if (localObject2 != null)
        {
          localObject2 = i;
          g localg = h;
          if (localg == null)
          {
            localObject1 = null;
            ((ix)localObject2).a((jb)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = "Failed to set correlator.";
        ul.c((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = h;
      localObject1 = a;
    }
  }
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    jk localjk = a;
    r = paramBoolean;
    try
    {
      localObject = i;
      if (localObject != null)
      {
        localObject = i;
        boolean bool = r;
        ((ix)localObject).a(bool);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to set manual impressions.";
        ul.c((String)localObject, localRemoteException);
      }
    }
  }
  
  public final void setOnCustomRenderedAdLoadedListener(b paramb)
  {
    Object localObject1 = a;
    k = paramb;
    for (;;)
    {
      try
      {
        localObject2 = i;
        if (localObject2 != null)
        {
          localObject2 = i;
          if (paramb != null)
          {
            localObject1 = new com/google/android/gms/b/kr;
            ((kr)localObject1).<init>(paramb);
            ((ix)localObject2).a((kq)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = "Failed to set the onCustomRenderedAdLoadedListener.";
        ul.c((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
  
  public final void setVideoOptions(j paramj)
  {
    Object localObject1 = a;
    m = paramj;
    for (;;)
    {
      try
      {
        localObject2 = i;
        if (localObject2 != null)
        {
          localObject2 = i;
          if (paramj == null)
          {
            localObject1 = null;
            ((ix)localObject2).a((jt)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = "Failed to set video options.";
        ul.c((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = new com/google/android/gms/b/jt;
      ((jt)localObject1).<init>(paramj);
    }
  }
}


/* Location:              com/google/android/gms/ads/a/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */