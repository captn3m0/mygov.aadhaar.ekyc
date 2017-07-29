package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.a.b;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.ic;
import com.google.android.gms.b.id;
import com.google.android.gms.b.ik;
import com.google.android.gms.b.il;
import com.google.android.gms.b.in;
import com.google.android.gms.b.io;
import com.google.android.gms.b.io.1;
import com.google.android.gms.b.io.2;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.ix;
import com.google.android.gms.b.jj;
import com.google.android.gms.b.jk;
import com.google.android.gms.b.jt;
import com.google.android.gms.b.kr;
import com.google.android.gms.b.pm;
import com.google.android.gms.b.pq;
import com.google.android.gms.b.ul;

class f
  extends ViewGroup
{
  protected final jk a = new jk(this);
  
  public f(Context paramContext)
  {
    super(paramContext);
  }
  
  public void a()
  {
    jk localjk = a;
    try
    {
      if (i != null) {
        i.n();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Failed to call resume.", localRemoteException);
    }
  }
  
  public void a(c paramc)
  {
    jk localjk = a;
    jj localjj = a;
    try
    {
      if (i != null) {
        break label358;
      }
      if (((f != null) && (n != null)) || (i != null)) {
        break label56;
      }
      throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
    }
    catch (RemoteException paramc)
    {
      ul.c("Failed to load ad.", paramc);
    }
    return;
    label56:
    paramc = p.getContext();
    il localil = jk.a(paramc, f, q);
    if ("search_v2".equals(a))
    {
      paramc = (ix)io.a(paramc, false, new io.2(ip.b(), paramc, localil, n));
      label117:
      i = paramc;
      i.a(new id(c));
      if (d != null) {
        i.a(new ic(d));
      }
      if (g != null) {
        i.a(new in(g));
      }
      if (j != null) {
        i.a(new pm(j));
      }
      if (l != null) {
        i.a(new pq(l), o);
      }
      if (k != null) {
        i.a(new kr(k));
      }
      if (h != null) {
        i.a(h.a);
      }
      if (m != null) {
        i.a(new jt(m));
      }
      i.a(r);
    }
    for (;;)
    {
      try
      {
        paramc = i.i();
        if (paramc != null) {
          continue;
        }
      }
      catch (RemoteException paramc)
      {
        label358:
        ul.c("Failed to get an ad frame.", paramc);
        continue;
      }
      if (!i.a(ik.a(p.getContext(), localjj))) {
        break;
      }
      a.a = h;
      return;
      paramc = (ix)io.a(paramc, false, new io.1(ip.b(), paramc, localil, n, a));
      break label117;
      p.addView((View)b.a(paramc));
    }
  }
  
  public void b()
  {
    jk localjk = a;
    try
    {
      if (i != null) {
        i.m();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Failed to call pause.", localRemoteException);
    }
  }
  
  public void c()
  {
    jk localjk = a;
    try
    {
      if (i != null) {
        i.h();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Failed to destroy AdView.", localRemoteException);
    }
  }
  
  public a getAdListener()
  {
    return a.e;
  }
  
  public d getAdSize()
  {
    return a.a();
  }
  
  public String getAdUnitId()
  {
    return a.n;
  }
  
  public com.google.android.gms.ads.purchase.a getInAppPurchaseListener()
  {
    return a.j;
  }
  
  public String getMediationAdapterClassName()
  {
    return a.b();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
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
  
  protected void onMeasure(int paramInt1, int paramInt2)
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
  
  public void setAdListener(a parama)
  {
    a.a(parama);
    if ((parama != null) && ((parama instanceof ib))) {
      a.a((ib)parama);
    }
    while (parama != null) {
      return;
    }
    a.a(null);
  }
  
  public void setAdSize(d paramd)
  {
    a.a(new d[] { paramd });
  }
  
  public void setAdUnitId(String paramString)
  {
    a.a(paramString);
  }
  
  public void setInAppPurchaseListener(com.google.android.gms.ads.purchase.a parama)
  {
    Object localObject = a;
    if (l != null) {
      throw new IllegalStateException("Play store purchase parameter has already been set.");
    }
    try
    {
      j = parama;
      if (i != null)
      {
        localObject = i;
        if (parama == null) {
          break label61;
        }
      }
      label61:
      for (parama = new pm(parama);; parama = null)
      {
        ((ix)localObject).a(parama);
        return;
      }
      return;
    }
    catch (RemoteException parama)
    {
      ul.c("Failed to set the InAppPurchaseListener.", parama);
    }
  }
}


/* Location:              com/google/android/gms/ads/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */