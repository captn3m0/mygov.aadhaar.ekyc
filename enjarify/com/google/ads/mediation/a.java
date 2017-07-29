package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.b.e.a;
import com.google.android.gms.ads.b.f.a;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.ik;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.iu;
import com.google.android.gms.b.ix;
import com.google.android.gms.b.jj;
import com.google.android.gms.b.jj.a;
import com.google.android.gms.b.jl;
import com.google.android.gms.b.sb;
import com.google.android.gms.b.se;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.ul;
import com.google.android.gms.b.vq;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class a
  implements com.google.android.gms.ads.d.a.b, com.google.android.gms.ads.mediation.c, g, vq
{
  public static final String AD_UNIT_ID_PARAMETER = "pubid";
  protected e zzcD;
  protected com.google.android.gms.ads.h zzcE;
  private com.google.android.gms.ads.b zzcF;
  private Context zzcG;
  private com.google.android.gms.ads.h zzcH;
  private com.google.android.gms.ads.d.a.c zzcI;
  final com.google.android.gms.ads.d.b zzcJ;
  
  public a()
  {
    a.1 local1 = new com/google/ads/mediation/a$1;
    local1.<init>(this);
    zzcJ = local1;
  }
  
  public String getAdUnitId(Bundle paramBundle)
  {
    return paramBundle.getString("pubid");
  }
  
  public View getBannerView()
  {
    return zzcD;
  }
  
  public Bundle getInterstitialAdapterInfo()
  {
    com.google.android.gms.ads.mediation.b.a locala = new com/google/android/gms/ads/mediation/b$a;
    locala.<init>();
    a = 1;
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    int i = a;
    localBundle.putInt("capabilities", i);
    return localBundle;
  }
  
  public void initialize(Context paramContext, com.google.android.gms.ads.mediation.a parama, String paramString, com.google.android.gms.ads.d.a.c paramc, Bundle paramBundle1, Bundle paramBundle2)
  {
    Context localContext = paramContext.getApplicationContext();
    zzcG = localContext;
    zzcI = paramc;
    zzcI.a(this);
  }
  
  public boolean isInitialized()
  {
    com.google.android.gms.ads.d.a.c localc = zzcI;
    boolean bool;
    if (localc != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localc = null;
    }
  }
  
  public void loadAd(com.google.android.gms.ads.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    Object localObject1 = zzcG;
    if (localObject1 != null)
    {
      localObject1 = zzcI;
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = "AdMobAdapter.loadAd called before initialize.";
      ul.c((String)localObject1);
      return;
    }
    localObject1 = new com/google/android/gms/ads/h;
    localObject2 = zzcG;
    ((com.google.android.gms.ads.h)localObject1).<init>((Context)localObject2);
    zzcH = ((com.google.android.gms.ads.h)localObject1);
    localObject1 = zzcH.a;
    boolean bool = true;
    n = bool;
    localObject1 = zzcH;
    localObject2 = getAdUnitId(paramBundle1);
    ((com.google.android.gms.ads.h)localObject1).a((String)localObject2);
    localObject1 = zzcH;
    localObject2 = zzcJ;
    for (localObject1 = a;; localObject1 = null)
    {
      try
      {
        m = ((com.google.android.gms.ads.d.b)localObject2);
        ix localix = e;
        if (localix != null)
        {
          localix = e;
          if (localObject2 == null) {
            continue;
          }
          localObject1 = new com/google/android/gms/b/se;
          ((se)localObject1).<init>((com.google.android.gms.ads.d.b)localObject2);
          localix.a((sb)localObject1);
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          localObject2 = "Failed to set the AdListener.";
          ul.c((String)localObject2, localRemoteException);
        }
      }
      localObject1 = zzcH;
      localObject2 = zzcG;
      localObject2 = zza((Context)localObject2, parama, paramBundle2, paramBundle1);
      ((com.google.android.gms.ads.h)localObject1).a((com.google.android.gms.ads.c)localObject2);
      break;
    }
  }
  
  public void onDestroy()
  {
    Object localObject = zzcD;
    if (localObject != null)
    {
      localObject = zzcD;
      ((e)localObject).c();
      zzcD = null;
    }
    localObject = zzcE;
    if (localObject != null) {
      zzcE = null;
    }
    localObject = zzcF;
    if (localObject != null) {
      zzcF = null;
    }
    localObject = zzcH;
    if (localObject != null) {
      zzcH = null;
    }
  }
  
  public void onPause()
  {
    e locale = zzcD;
    if (locale != null)
    {
      locale = zzcD;
      locale.b();
    }
  }
  
  public void onResume()
  {
    e locale = zzcD;
    if (locale != null)
    {
      locale = zzcD;
      locale.a();
    }
  }
  
  public void requestBannerAd(Context paramContext, com.google.android.gms.ads.mediation.d paramd, Bundle paramBundle1, com.google.android.gms.ads.d paramd1, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle2)
  {
    e locale = new com/google/android/gms/ads/e;
    locale.<init>(paramContext);
    zzcD = locale;
    locale = zzcD;
    Object localObject = new com/google/android/gms/ads/d;
    int i = k;
    int j = l;
    ((com.google.android.gms.ads.d)localObject).<init>(i, j);
    locale.setAdSize((com.google.android.gms.ads.d)localObject);
    locale = zzcD;
    localObject = getAdUnitId(paramBundle1);
    locale.setAdUnitId((String)localObject);
    locale = zzcD;
    localObject = new com/google/ads/mediation/a$c;
    ((a.c)localObject).<init>(this, paramd);
    locale.setAdListener((com.google.android.gms.ads.a)localObject);
    locale = zzcD;
    localObject = zza(paramContext, parama, paramBundle2, paramBundle1);
    locale.a((com.google.android.gms.ads.c)localObject);
  }
  
  public void requestInterstitialAd(Context paramContext, f paramf, Bundle paramBundle1, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle2)
  {
    com.google.android.gms.ads.h localh = new com/google/android/gms/ads/h;
    localh.<init>(paramContext);
    zzcE = localh;
    localh = zzcE;
    Object localObject = getAdUnitId(paramBundle1);
    localh.a((String)localObject);
    localh = zzcE;
    localObject = new com/google/ads/mediation/a$d;
    ((a.d)localObject).<init>(this, paramf);
    localh.a((com.google.android.gms.ads.a)localObject);
    localh = zzcE;
    localObject = zza(paramContext, parama, paramBundle2, paramBundle1);
    localh.a((com.google.android.gms.ads.c)localObject);
  }
  
  public void requestNativeAd(Context paramContext, com.google.android.gms.ads.mediation.h paramh, Bundle paramBundle1, l paraml, Bundle paramBundle2)
  {
    Object localObject1 = new com/google/ads/mediation/a$e;
    ((a.e)localObject1).<init>(this, paramh);
    Object localObject2 = paramBundle1.getString("pubid");
    localObject2 = zza(paramContext, (String)localObject2).a((com.google.android.gms.ads.a)localObject1);
    Object localObject3 = paraml.h();
    if (localObject3 != null) {
      ((com.google.android.gms.ads.b.a)localObject2).a((com.google.android.gms.ads.b.c)localObject3);
    }
    boolean bool = paraml.i();
    if (bool) {
      ((com.google.android.gms.ads.b.a)localObject2).a((e.a)localObject1);
    }
    bool = paraml.j();
    if (bool) {
      ((com.google.android.gms.ads.b.a)localObject2).a((f.a)localObject1);
    }
    localObject1 = ((com.google.android.gms.ads.b.a)localObject2).a();
    zzcF = ((com.google.android.gms.ads.b)localObject1);
    localObject1 = zzcF;
    localObject2 = zzaa;
    try
    {
      localObject3 = b;
      localObject1 = a;
      localObject1 = ik.a((Context)localObject1, (jj)localObject2);
      ((iu)localObject3).a((ih)localObject1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        localObject2 = "Failed to load ad.";
        ul.b((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void showInterstitial()
  {
    zzcE.a();
  }
  
  public void showVideo()
  {
    zzcH.a();
  }
  
  protected abstract Bundle zza(Bundle paramBundle1, Bundle paramBundle2);
  
  com.google.android.gms.ads.b.a zza(Context paramContext, String paramString)
  {
    com.google.android.gms.ads.b.a locala = new com/google/android/gms/ads/b$a;
    locala.<init>(paramContext, paramString);
    return locala;
  }
  
  com.google.android.gms.ads.c zza(Context paramContext, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    Object localObject1 = null;
    int i = 1;
    c.a locala = new com/google/android/gms/ads/c$a;
    locala.<init>();
    Object localObject2 = parama.a();
    Object localObject3;
    if (localObject2 != null)
    {
      localObject3 = a;
      g = ((Date)localObject2);
    }
    int j = parama.b();
    if (j != 0)
    {
      localObject3 = a;
      i = j;
    }
    localObject2 = parama.c();
    if (localObject2 != null)
    {
      localObject3 = ((Set)localObject2).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = (String)((Iterator)localObject3).next();
        HashSet localHashSet = a.a;
        localHashSet.add(localObject2);
      }
    }
    localObject2 = parama.d();
    if (localObject2 != null)
    {
      localObject3 = a;
      j = ((Location)localObject2);
    }
    boolean bool1 = parama.f();
    if (bool1)
    {
      ip.a();
      localObject2 = uk.a(paramContext);
      locala.a((String)localObject2);
    }
    int k = parama.e();
    int m = -1;
    if (k != m)
    {
      k = parama.e();
      if (k != i) {
        break label382;
      }
      k = i;
      localObject3 = a;
      if (k == 0) {
        break label391;
      }
    }
    for (;;)
    {
      n = i;
      boolean bool2 = parama.g();
      a.o = bool2;
      localObject2 = zza(paramBundle1, paramBundle2);
      Object localObject4 = AdMobAdapter.class;
      localObject1 = a.b;
      localObject3 = ((Class)localObject4).getName();
      ((Bundle)localObject1).putBundle((String)localObject3, (Bundle)localObject2);
      localObject1 = AdMobAdapter.class;
      i = localObject4.equals(localObject1);
      if (i != 0)
      {
        localObject4 = "_emulatorLiveAds";
        bool2 = ((Bundle)localObject2).getBoolean((String)localObject4);
        if (bool2)
        {
          localObject2 = a;
          localObject4 = "B3EEABB8EE11C2BE770B684D95219ECB";
          localObject2 = d;
          ((HashSet)localObject2).remove(localObject4);
        }
      }
      return locala.a();
      label382:
      bool2 = false;
      localObject2 = null;
      break;
      label391:
      i = 0;
      localObject4 = null;
    }
  }
}


/* Location:              com/google/ads/mediation/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */