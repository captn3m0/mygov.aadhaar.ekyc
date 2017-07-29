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

@qi
public final class ni
  implements ng
{
  final vc a;
  
  public ni(Context paramContext, un paramun, dw paramdw, e parame)
  {
    w.f();
    a = ve.a(paramContext, new il(), false, false, paramdw, paramun, null, null, parame);
    a.a().setWillNotDraw(true);
  }
  
  private static void a(Runnable paramRunnable)
  {
    ip.a();
    if (uk.b())
    {
      paramRunnable.run();
      return;
    }
    tt.a.post(paramRunnable);
  }
  
  public final void a()
  {
    a.destroy();
  }
  
  public final void a(ib paramib, j paramj, ly paramly, s params)
  {
    a.l().a(paramib, paramj, paramly, params, false, null, null, new f(a.getContext(), (byte)0), null, null);
  }
  
  public final void a(ng.a parama)
  {
    a.l().c = new vd.a()
    {
      public final void a(vc paramAnonymousvc, boolean paramAnonymousBoolean)
      {
        a();
      }
    };
  }
  
  public final void a(String paramString)
  {
    a(new Runnable()
    {
      public final void run()
      {
        a.loadData(a, "text/html", "UTF-8");
      }
    });
  }
  
  public final void a(String paramString, md parammd)
  {
    a.l().a(paramString, parammd);
  }
  
  public final void a(final String paramString1, final String paramString2)
  {
    a(new Runnable()
    {
      public final void run()
      {
        a.a(paramString1, paramString2);
      }
    });
  }
  
  public final void a(final String paramString, final JSONObject paramJSONObject)
  {
    a(new Runnable()
    {
      public final void run()
      {
        a.a(paramString, paramJSONObject);
      }
    });
  }
  
  public final nl b()
  {
    return new nm(this);
  }
  
  public final void b(final String paramString)
  {
    a(new Runnable()
    {
      public final void run()
      {
        a.loadUrl(paramString);
      }
    });
  }
  
  public final void b(String paramString, md parammd)
  {
    a.l().b(paramString, parammd);
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    a.b(paramString, paramJSONObject);
  }
  
  public final void c(final String paramString)
  {
    a(new Runnable()
    {
      public final void run()
      {
        a.loadData(paramString, "text/html", "UTF-8");
      }
    });
  }
}


/* Location:              com/google/android/gms/b/ni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */