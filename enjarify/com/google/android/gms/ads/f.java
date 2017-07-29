package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.ic;
import com.google.android.gms.b.id;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.ik;
import com.google.android.gms.b.il;
import com.google.android.gms.b.in;
import com.google.android.gms.b.io;
import com.google.android.gms.b.io.1;
import com.google.android.gms.b.io.2;
import com.google.android.gms.b.io.a;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.is;
import com.google.android.gms.b.it;
import com.google.android.gms.b.ix;
import com.google.android.gms.b.iz;
import com.google.android.gms.b.jb;
import com.google.android.gms.b.jj;
import com.google.android.gms.b.jk;
import com.google.android.gms.b.jt;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.kr;
import com.google.android.gms.b.oa;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.pm;
import com.google.android.gms.b.pq;
import com.google.android.gms.b.ul;
import java.util.Map;

class f
  extends ViewGroup
{
  protected final jk a;
  
  public f(Context paramContext)
  {
    super(paramContext);
    jk localjk = new com/google/android/gms/b/jk;
    localjk.<init>(this);
    a = localjk;
  }
  
  public void a()
  {
    Object localObject1 = a;
    try
    {
      localObject2 = i;
      if (localObject2 != null)
      {
        localObject1 = i;
        ((ix)localObject1).n();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Failed to call resume.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void a(c paramc)
  {
    jk localjk = a;
    jj localjj = a;
    try
    {
      Object localObject1 = i;
      if (localObject1 != null) {
        break label588;
      }
      localObject1 = f;
      if (localObject1 != null)
      {
        localObject1 = n;
        if (localObject1 != null) {
          break label87;
        }
      }
      localObject1 = i;
      if (localObject1 != null) {
        break label87;
      }
      localObject1 = new java/lang/IllegalStateException;
      localObject3 = "The ad size and ad unit ID must be set before loadAd is called.";
      ((IllegalStateException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    catch (RemoteException localRemoteException1)
    {
      localObject3 = "Failed to load ad.";
      ul.c((String)localObject3, localRemoteException1);
    }
    return;
    label87:
    Object localObject2 = p;
    Object localObject4 = ((ViewGroup)localObject2).getContext();
    localObject2 = f;
    int i = q;
    il localil = jk.a((Context)localObject4, (d[])localObject2, i);
    localObject2 = "search_v2";
    localObject3 = a;
    boolean bool2 = ((String)localObject2).equals(localObject3);
    String str;
    Object localObject5;
    if (bool2)
    {
      localObject2 = ip.b();
      localObject3 = n;
      str = null;
      localObject5 = new com/google/android/gms/b/io$2;
      ((io.2)localObject5).<init>((io)localObject2, (Context)localObject4, localil, (String)localObject3);
      localObject2 = io.a((Context)localObject4, false, (io.a)localObject5);
      localObject2 = (ix)localObject2;
      label197:
      i = ((ix)localObject2);
      localObject2 = i;
      localObject3 = new com/google/android/gms/b/id;
      localObject4 = c;
      ((id)localObject3).<init>((a)localObject4);
      ((ix)localObject2).a((it)localObject3);
      localObject2 = d;
      if (localObject2 != null)
      {
        localObject2 = i;
        localObject3 = new com/google/android/gms/b/ic;
        localObject4 = d;
        ((ic)localObject3).<init>((ib)localObject4);
        ((ix)localObject2).a((is)localObject3);
      }
      localObject2 = g;
      if (localObject2 != null)
      {
        localObject2 = i;
        localObject3 = new com/google/android/gms/b/in;
        localObject4 = g;
        ((in)localObject3).<init>((com.google.android.gms.ads.a.a)localObject4);
        ((ix)localObject2).a((iz)localObject3);
      }
      localObject2 = j;
      if (localObject2 != null)
      {
        localObject2 = i;
        localObject3 = new com/google/android/gms/b/pm;
        localObject4 = j;
        ((pm)localObject3).<init>((com.google.android.gms.ads.purchase.a)localObject4);
        ((ix)localObject2).a((ph)localObject3);
      }
      localObject2 = l;
      if (localObject2 != null)
      {
        localObject2 = i;
        localObject3 = new com/google/android/gms/b/pq;
        localObject4 = l;
        ((pq)localObject3).<init>((com.google.android.gms.ads.purchase.b)localObject4);
        localObject4 = o;
        ((ix)localObject2).a((pl)localObject3, (String)localObject4);
      }
      localObject2 = k;
      if (localObject2 != null)
      {
        localObject2 = i;
        localObject3 = new com/google/android/gms/b/kr;
        localObject4 = k;
        ((kr)localObject3).<init>((com.google.android.gms.ads.a.b)localObject4);
        ((ix)localObject2).a((kq)localObject3);
      }
      localObject2 = h;
      if (localObject2 != null)
      {
        localObject2 = i;
        localObject3 = h;
        localObject3 = a;
        ((ix)localObject2).a((jb)localObject3);
      }
      localObject2 = m;
      if (localObject2 != null)
      {
        localObject2 = i;
        localObject3 = new com/google/android/gms/b/jt;
        localObject4 = m;
        ((jt)localObject3).<init>((j)localObject4);
        ((ix)localObject2).a((jt)localObject3);
      }
      localObject2 = i;
      boolean bool1 = r;
      ((ix)localObject2).a(bool1);
    }
    for (;;)
    {
      try
      {
        localObject2 = i;
        localObject2 = ((ix)localObject2).i();
        if (localObject2 != null) {
          continue;
        }
      }
      catch (RemoteException localRemoteException2)
      {
        label588:
        localObject3 = "Failed to get an ad frame.";
        ul.c((String)localObject3, localRemoteException2);
        continue;
      }
      localObject2 = i;
      localObject3 = p;
      localObject3 = ((ViewGroup)localObject3).getContext();
      localObject3 = ik.a((Context)localObject3, localjj);
      bool2 = ((ix)localObject2).a((ih)localObject3);
      if (!bool2) {
        break;
      }
      localObject2 = a;
      localObject3 = h;
      a = ((Map)localObject3);
      break;
      localObject3 = ip.b();
      str = n;
      localObject5 = a;
      localObject2 = new com/google/android/gms/b/io$1;
      ((io.1)localObject2).<init>((io)localObject3, (Context)localObject4, localil, str, (oc)localObject5);
      localObject2 = io.a((Context)localObject4, false, (io.a)localObject2);
      localObject2 = (ix)localObject2;
      break label197;
      localObject3 = p;
      localObject2 = com.google.android.gms.a.b.a((com.google.android.gms.a.a)localObject2);
      localObject2 = (View)localObject2;
      ((ViewGroup)localObject3).addView((View)localObject2);
    }
  }
  
  public void b()
  {
    Object localObject1 = a;
    try
    {
      localObject2 = i;
      if (localObject2 != null)
      {
        localObject1 = i;
        ((ix)localObject1).m();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Failed to call pause.";
        ul.c((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void c()
  {
    Object localObject1 = a;
    try
    {
      localObject2 = i;
      if (localObject2 != null)
      {
        localObject1 = i;
        ((ix)localObject1).h();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Failed to destroy AdView.";
        ul.c((String)localObject2, localRemoteException);
      }
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
  
  protected void onMeasure(int paramInt1, int paramInt2)
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
  
  public void setAdListener(a parama)
  {
    jk localjk = a;
    localjk.a(parama);
    if (parama != null)
    {
      boolean bool = parama instanceof ib;
      if (bool)
      {
        localjk = a;
        parama = (ib)parama;
        localjk.a(parama);
      }
    }
    for (;;)
    {
      return;
      if (parama == null)
      {
        localjk = a;
        localjk.a(null);
      }
    }
  }
  
  public void setAdSize(d paramd)
  {
    jk localjk = a;
    d[] arrayOfd = new d[1];
    arrayOfd[0] = paramd;
    localjk.a(arrayOfd);
  }
  
  public void setAdUnitId(String paramString)
  {
    a.a(paramString);
  }
  
  public void setInAppPurchaseListener(com.google.android.gms.ads.purchase.a parama)
  {
    Object localObject1 = a;
    localObject2 = l;
    if (localObject2 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Play store purchase parameter has already been set.");
      throw ((Throwable)localObject1);
    }
    for (;;)
    {
      try
      {
        j = parama;
        localObject2 = i;
        if (localObject2 != null)
        {
          localObject2 = i;
          if (parama != null)
          {
            localObject1 = new com/google/android/gms/b/pm;
            ((pm)localObject1).<init>(parama);
            ((ix)localObject2).a((ph)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Failed to set the InAppPurchaseListener.";
        ul.c((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
}


/* Location:              com/google/android/gms/ads/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */