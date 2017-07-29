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
import com.google.android.gms.b.jk;
import com.google.android.gms.b.jt;
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
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - i) / 2;
      paramInt2 = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(paramInt1, paramInt2, i + paramInt1, j + paramInt2);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject1 = getChildAt(0);
    int j;
    if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8))
    {
      measureChild((View)localObject1, paramInt1, paramInt2);
      j = ((View)localObject1).getMeasuredWidth();
      i = ((View)localObject1).getMeasuredHeight();
    }
    for (;;)
    {
      j = Math.max(j, getSuggestedMinimumWidth());
      i = Math.max(i, getSuggestedMinimumHeight());
      setMeasuredDimension(View.resolveSize(j, paramInt1), View.resolveSize(i, paramInt2));
      return;
      try
      {
        localObject1 = getAdSize();
        if (localObject1 != null)
        {
          Context localContext = getContext();
          j = ((d)localObject1).b(localContext);
          i = ((d)localObject1).a(localContext);
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          ul.b("Unable to retrieve ad size.", localNullPointerException);
          Object localObject2 = null;
        }
        j = 0;
      }
    }
  }
  
  public final void setAdListener(com.google.android.gms.ads.a parama)
  {
    a.a(parama);
  }
  
  public final void setAdSizes(d... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {
      throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }
    a.b(paramVarArgs);
  }
  
  public final void setAdUnitId(String paramString)
  {
    a.a(paramString);
  }
  
  public final void setAppEventListener(a parama)
  {
    Object localObject = a;
    try
    {
      g = parama;
      if (i != null)
      {
        localObject = i;
        if (parama == null) {
          break label43;
        }
      }
      label43:
      for (parama = new in(parama);; parama = null)
      {
        ((ix)localObject).a(parama);
        return;
      }
      return;
    }
    catch (RemoteException parama)
    {
      ul.c("Failed to set the AppEventListener.", parama);
    }
  }
  
  public final void setCorrelator(g paramg)
  {
    jk localjk = a;
    h = paramg;
    try
    {
      if (i != null)
      {
        ix localix = i;
        if (h == null) {}
        for (paramg = null;; paramg = h.a)
        {
          localix.a(paramg);
          return;
        }
      }
      return;
    }
    catch (RemoteException paramg)
    {
      ul.c("Failed to set correlator.", paramg);
    }
  }
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    jk localjk = a;
    r = paramBoolean;
    try
    {
      if (i != null) {
        i.a(r);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Failed to set manual impressions.", localRemoteException);
    }
  }
  
  public final void setOnCustomRenderedAdLoadedListener(b paramb)
  {
    Object localObject = a;
    k = paramb;
    try
    {
      if (i != null)
      {
        localObject = i;
        if (paramb == null) {
          break label43;
        }
      }
      label43:
      for (paramb = new kr(paramb);; paramb = null)
      {
        ((ix)localObject).a(paramb);
        return;
      }
      return;
    }
    catch (RemoteException paramb)
    {
      ul.c("Failed to set the onCustomRenderedAdLoadedListener.", paramb);
    }
  }
  
  public final void setVideoOptions(j paramj)
  {
    Object localObject = a;
    m = paramj;
    try
    {
      if (i != null)
      {
        localObject = i;
        if (paramj == null) {}
        for (paramj = null;; paramj = new jt(paramj))
        {
          ((ix)localObject).a(paramj);
          return;
        }
      }
      return;
    }
    catch (RemoteException paramj)
    {
      ul.c("Failed to set video options.", paramj);
    }
  }
}


/* Location:              com/google/android/gms/ads/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */