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
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.ik;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.iu;
import com.google.android.gms.b.ix;
import com.google.android.gms.b.jj.a;
import com.google.android.gms.b.jl;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.sb;
import com.google.android.gms.b.se;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.ul;
import com.google.android.gms.b.vq;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@qi
public abstract class a
  implements com.google.android.gms.ads.d.a.b, com.google.android.gms.ads.mediation.c, g, vq
{
  public static final String AD_UNIT_ID_PARAMETER = "pubid";
  protected com.google.android.gms.ads.e zzcD;
  protected com.google.android.gms.ads.h zzcE;
  private com.google.android.gms.ads.b zzcF;
  private Context zzcG;
  private com.google.android.gms.ads.h zzcH;
  private com.google.android.gms.ads.d.a.c zzcI;
  final com.google.android.gms.ads.d.b zzcJ = new com.google.android.gms.ads.d.b()
  {
    public final void a()
    {
      a.zza(a.this).b(a.this);
    }
    
    public final void a(int paramAnonymousInt)
    {
      a.zza(a.this).a(a.this, paramAnonymousInt);
    }
    
    public final void a(com.google.android.gms.ads.d.a paramAnonymousa)
    {
      a.zza(a.this).a(a.this, paramAnonymousa);
    }
    
    public final void b()
    {
      a.zza(a.this).c(a.this);
    }
    
    public final void c()
    {
      a.zza(a.this).d(a.this);
    }
    
    public final void d()
    {
      a.zza(a.this).e(a.this);
      a.zza(a.this, null);
    }
    
    public final void e()
    {
      a.zza(a.this).f(a.this);
    }
  };
  
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
    com.google.android.gms.ads.mediation.b.a locala = new com.google.android.gms.ads.mediation.b.a();
    a = 1;
    Bundle localBundle = new Bundle();
    localBundle.putInt("capabilities", a);
    return localBundle;
  }
  
  public void initialize(Context paramContext, com.google.android.gms.ads.mediation.a parama, String paramString, com.google.android.gms.ads.d.a.c paramc, Bundle paramBundle1, Bundle paramBundle2)
  {
    zzcG = paramContext.getApplicationContext();
    zzcI = paramc;
    zzcI.a(this);
  }
  
  public boolean isInitialized()
  {
    return zzcI != null;
  }
  
  public void loadAd(com.google.android.gms.ads.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    if ((zzcG == null) || (zzcI == null))
    {
      ul.c("AdMobAdapter.loadAd called before initialize.");
      return;
    }
    zzcH = new com.google.android.gms.ads.h(zzcG);
    zzcH.a.n = true;
    zzcH.a(getAdUnitId(paramBundle1));
    Object localObject2 = zzcH;
    Object localObject1 = zzcJ;
    localObject2 = a;
    for (;;)
    {
      try
      {
        m = ((com.google.android.gms.ads.d.b)localObject1);
        if (e != null)
        {
          localObject2 = e;
          if (localObject1 == null) {
            continue;
          }
          localObject1 = new se((com.google.android.gms.ads.d.b)localObject1);
          ((ix)localObject2).a((sb)localObject1);
        }
      }
      catch (RemoteException localRemoteException)
      {
        ul.c("Failed to set the AdListener.", localRemoteException);
        continue;
      }
      zzcH.a(zza(zzcG, parama, paramBundle2, paramBundle1));
      return;
      localObject1 = null;
    }
  }
  
  public void onDestroy()
  {
    if (zzcD != null)
    {
      zzcD.c();
      zzcD = null;
    }
    if (zzcE != null) {
      zzcE = null;
    }
    if (zzcF != null) {
      zzcF = null;
    }
    if (zzcH != null) {
      zzcH = null;
    }
  }
  
  public void onPause()
  {
    if (zzcD != null) {
      zzcD.b();
    }
  }
  
  public void onResume()
  {
    if (zzcD != null) {
      zzcD.a();
    }
  }
  
  public void requestBannerAd(Context paramContext, com.google.android.gms.ads.mediation.d paramd, Bundle paramBundle1, com.google.android.gms.ads.d paramd1, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle2)
  {
    zzcD = new com.google.android.gms.ads.e(paramContext);
    zzcD.setAdSize(new com.google.android.gms.ads.d(k, l));
    zzcD.setAdUnitId(getAdUnitId(paramBundle1));
    zzcD.setAdListener(new c(this, paramd));
    zzcD.a(zza(paramContext, parama, paramBundle2, paramBundle1));
  }
  
  public void requestInterstitialAd(Context paramContext, com.google.android.gms.ads.mediation.f paramf, Bundle paramBundle1, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle2)
  {
    zzcE = new com.google.android.gms.ads.h(paramContext);
    zzcE.a(getAdUnitId(paramBundle1));
    zzcE.a(new d(this, paramf));
    zzcE.a(zza(paramContext, parama, paramBundle2, paramBundle1));
  }
  
  public void requestNativeAd(Context paramContext, com.google.android.gms.ads.mediation.h paramh, Bundle paramBundle1, l paraml, Bundle paramBundle2)
  {
    paramh = new e(this, paramh);
    com.google.android.gms.ads.b.a locala = zza(paramContext, paramBundle1.getString("pubid")).a(paramh);
    com.google.android.gms.ads.b.c localc = paraml.h();
    if (localc != null) {
      locala.a(localc);
    }
    if (paraml.i()) {
      locala.a(paramh);
    }
    if (paraml.j()) {
      locala.a(paramh);
    }
    zzcF = locala.a();
    paramh = zzcF;
    paramContext = zzaa;
    try
    {
      b.a(ik.a(a, paramContext));
      return;
    }
    catch (RemoteException paramContext)
    {
      ul.b("Failed to load ad.", paramContext);
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
    return new com.google.android.gms.ads.b.a(paramContext, paramString);
  }
  
  com.google.android.gms.ads.c zza(Context paramContext, com.google.android.gms.ads.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    int j = 1;
    c.a locala = new c.a();
    Object localObject = parama.a();
    if (localObject != null) {
      a.g = ((Date)localObject);
    }
    int i = parama.b();
    if (i != 0) {
      a.i = i;
    }
    localObject = parama.c();
    if (localObject != null)
    {
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        a.a.add(str);
      }
    }
    localObject = parama.d();
    if (localObject != null) {
      a.j = ((Location)localObject);
    }
    if (parama.f())
    {
      ip.a();
      locala.a(uk.a(paramContext));
    }
    if (parama.e() != -1)
    {
      if (parama.e() != 1) {
        break label296;
      }
      i = 1;
      paramContext = a;
      if (i == 0) {
        break label302;
      }
    }
    label296:
    label302:
    for (i = j;; i = 0)
    {
      n = i;
      boolean bool = parama.g();
      a.o = bool;
      paramContext = zza(paramBundle1, paramBundle2);
      a.b.putBundle(AdMobAdapter.class.getName(), paramContext);
      if ((AdMobAdapter.class.equals(AdMobAdapter.class)) && (paramContext.getBoolean("_emulatorLiveAds"))) {
        a.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
      }
      return locala.a();
      i = 0;
      break;
    }
  }
  
  static final class a
    extends j
  {
    private final com.google.android.gms.ads.b.e n;
    
    public a(com.google.android.gms.ads.b.e parame)
    {
      n = parame;
      e = parame.b().toString();
      f = parame.c();
      g = parame.d().toString();
      h = parame.e();
      i = parame.f().toString();
      if (parame.g() != null) {
        j = parame.g().doubleValue();
      }
      if (parame.h() != null) {
        k = parame.h().toString();
      }
      if (parame.i() != null) {
        l = parame.i().toString();
      }
      a();
      b();
      m = parame.j();
    }
    
    public final void a(View paramView)
    {
      if ((paramView instanceof com.google.android.gms.ads.b.d)) {
        ((com.google.android.gms.ads.b.d)paramView).setNativeAd(n);
      }
    }
  }
  
  static final class b
    extends k
  {
    private final com.google.android.gms.ads.b.f l;
    
    public b(com.google.android.gms.ads.b.f paramf)
    {
      l = paramf;
      e = paramf.b().toString();
      f = paramf.c();
      g = paramf.d().toString();
      if (paramf.e() != null) {
        h = paramf.e();
      }
      i = paramf.f().toString();
      j = paramf.g().toString();
      a();
      b();
      k = paramf.h();
    }
    
    public final void a(View paramView)
    {
      if ((paramView instanceof com.google.android.gms.ads.b.d)) {
        ((com.google.android.gms.ads.b.d)paramView).setNativeAd(l);
      }
    }
  }
  
  static final class c
    extends com.google.android.gms.ads.a
    implements ib
  {
    final a a;
    final com.google.android.gms.ads.mediation.d b;
    
    public c(a parama, com.google.android.gms.ads.mediation.d paramd)
    {
      a = parama;
      b = paramd;
    }
    
    public final void a()
    {
      b.a();
    }
    
    public final void a(int paramInt)
    {
      b.a(paramInt);
    }
    
    public final void b()
    {
      b.b();
    }
    
    public final void c()
    {
      b.c();
    }
    
    public final void d()
    {
      b.d();
    }
    
    public final void e()
    {
      b.e();
    }
  }
  
  static final class d
    extends com.google.android.gms.ads.a
    implements ib
  {
    final a a;
    final com.google.android.gms.ads.mediation.f b;
    
    public d(a parama, com.google.android.gms.ads.mediation.f paramf)
    {
      a = parama;
      b = paramf;
    }
    
    public final void a()
    {
      b.f();
    }
    
    public final void a(int paramInt)
    {
      b.b(paramInt);
    }
    
    public final void b()
    {
      b.g();
    }
    
    public final void c()
    {
      b.h();
    }
    
    public final void d()
    {
      b.i();
    }
    
    public final void e()
    {
      b.j();
    }
  }
  
  static final class e
    extends com.google.android.gms.ads.a
    implements e.a, f.a, ib
  {
    final a a;
    final com.google.android.gms.ads.mediation.h b;
    
    public e(a parama, com.google.android.gms.ads.mediation.h paramh)
    {
      a = parama;
      b = paramh;
    }
    
    public final void a() {}
    
    public final void a(int paramInt)
    {
      b.c(paramInt);
    }
    
    public final void a(com.google.android.gms.ads.b.e parame)
    {
      b.a(new a.a(parame));
    }
    
    public final void a(com.google.android.gms.ads.b.f paramf)
    {
      b.a(new a.b(paramf));
    }
    
    public final void b()
    {
      b.k();
    }
    
    public final void c()
    {
      b.l();
    }
    
    public final void d()
    {
      b.m();
    }
    
    public final void e()
    {
      b.n();
    }
  }
}


/* Location:              com/google/ads/mediation/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */