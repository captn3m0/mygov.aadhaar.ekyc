package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.f;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.w;
import org.json.JSONObject;

public final class ni
  implements ng
{
  final vc a;
  
  public ni(Context paramContext, un paramun, dw paramdw, e parame)
  {
    w.f();
    il localil = new com/google/android/gms/b/il;
    localil.<init>();
    Object localObject = paramContext;
    localObject = ve.a(paramContext, localil, false, false, paramdw, paramun, null, null, parame);
    a = ((vc)localObject);
    a.a().setWillNotDraw(true);
  }
  
  private static void a(Runnable paramRunnable)
  {
    ip.a();
    boolean bool = uk.b();
    if (bool) {
      paramRunnable.run();
    }
    for (;;)
    {
      return;
      Handler localHandler = tt.a;
      localHandler.post(paramRunnable);
    }
  }
  
  public final void a()
  {
    a.destroy();
  }
  
  public final void a(ib paramib, j paramj, ly paramly, s params)
  {
    vd localvd = a.l();
    f localf = new com/google/android/gms/ads/internal/f;
    Object localObject = a.getContext();
    localf.<init>((Context)localObject, (byte)0);
    localObject = paramib;
    localvd.a(paramib, paramj, paramly, params, false, null, null, localf, null, null);
  }
  
  public final void a(ng.a parama)
  {
    vd localvd = a.l();
    ni.6 local6 = new com/google/android/gms/b/ni$6;
    local6.<init>(parama);
    c = local6;
  }
  
  public final void a(String paramString)
  {
    Object localObject = new Object[1];
    localObject[0] = paramString;
    String str = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", (Object[])localObject);
    localObject = new com/google/android/gms/b/ni$3;
    ((ni.3)localObject).<init>(this, str);
    a((Runnable)localObject);
  }
  
  public final void a(String paramString, md parammd)
  {
    a.l().a(paramString, parammd);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    ni.2 local2 = new com/google/android/gms/b/ni$2;
    local2.<init>(this, paramString1, paramString2);
    a(local2);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    ni.1 local1 = new com/google/android/gms/b/ni$1;
    local1.<init>(this, paramString, paramJSONObject);
    a(local1);
  }
  
  public final nl b()
  {
    nm localnm = new com/google/android/gms/b/nm;
    localnm.<init>(this);
    return localnm;
  }
  
  public final void b(String paramString)
  {
    ni.5 local5 = new com/google/android/gms/b/ni$5;
    local5.<init>(this, paramString);
    a(local5);
  }
  
  public final void b(String paramString, md parammd)
  {
    a.l().b(paramString, parammd);
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    a.b(paramString, paramJSONObject);
  }
  
  public final void c(String paramString)
  {
    ni.4 local4 = new com/google/android/gms/b/ni$4;
    local4.<init>(this, paramString);
    a(local4);
  }
}


/* Location:              com/google/android/gms/b/ni.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */