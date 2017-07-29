package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.a.b;
import com.google.android.gms.b.kw;
import com.google.android.gms.b.kx;
import com.google.android.gms.b.lh;
import com.google.android.gms.b.md;
import com.google.android.gms.b.nr;
import com.google.android.gms.b.nw;
import com.google.android.gms.b.od;
import com.google.android.gms.b.og;
import com.google.android.gms.b.oh;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.vd.a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class p
{
  public static View a(tg paramtg)
  {
    if (paramtg == null)
    {
      tp.c("AdState is null");
      return null;
    }
    if ((b(paramtg)) && (b != null)) {
      return b.b();
    }
    for (;;)
    {
      try
      {
        if (p != null)
        {
          paramtg = p.a();
          if (paramtg == null)
          {
            tp.e("View in mediation adapter is null.");
            return null;
          }
          paramtg = (View)b.a(paramtg);
          return paramtg;
        }
      }
      catch (RemoteException paramtg)
      {
        tp.c("Could not get View from mediation adapter.", paramtg);
        return null;
      }
      paramtg = null;
    }
  }
  
  static md a(og paramog, final oh paramoh, final g.a parama)
  {
    new md()
    {
      public final void a(vc paramAnonymousvc, Map<String, String> paramAnonymousMap)
      {
        paramAnonymousMap = paramAnonymousvc.b();
        if (paramAnonymousMap == null) {}
        do
        {
          return;
          try
          {
            if (p.this == null) {
              continue;
            }
            if (!k())
            {
              a(b.a(paramAnonymousMap));
              paramaa.e();
              return;
            }
          }
          catch (RemoteException paramAnonymousvc)
          {
            tp.c("Unable to call handleClick on mapper", paramAnonymousvc);
            return;
          }
          p.a(paramAnonymousvc);
          return;
        } while (paramoh == null);
        if (!paramoh.i())
        {
          paramoh.a(b.a(paramAnonymousMap));
          paramaa.e();
          return;
        }
        p.a(paramAnonymousvc);
      }
    };
  }
  
  private static String a(Bitmap paramBitmap)
  {
    Object localObject = new ByteArrayOutputStream();
    if (paramBitmap == null)
    {
      tp.e("Bitmap is null. Returning empty string");
      return "";
    }
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
    localObject = Base64.encodeToString(((ByteArrayOutputStream)localObject).toByteArray(), 0);
    paramBitmap = String.valueOf("data:image/png;base64,");
    localObject = String.valueOf(localObject);
    if (((String)localObject).length() != 0) {
      return paramBitmap.concat((String)localObject);
    }
    return new String(paramBitmap);
  }
  
  static String a(lh paramlh)
  {
    if (paramlh == null)
    {
      tp.e("Image is null. Returning empty string");
      return "";
    }
    try
    {
      Object localObject = paramlh.b();
      if (localObject != null)
      {
        localObject = ((Uri)localObject).toString();
        return (String)localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      tp.e("Unable to get image uri. Trying data uri next");
    }
    return b(paramlh);
  }
  
  public static boolean a(final vc paramvc, nw paramnw, CountDownLatch paramCountDownLatch)
  {
    for (;;)
    {
      boolean bool;
      try
      {
        localObject1 = paramvc.b();
        if (localObject1 != null) {
          continue;
        }
        tp.e("AdWebView is null");
        bool = false;
      }
      catch (RemoteException paramvc)
      {
        Object localObject1;
        final Object localObject2;
        oh localoh;
        tp.c("Unable to invoke load assets", paramvc);
        bool = false;
        continue;
        tp.e("No matching template id and mapper");
        bool = false;
        continue;
        paramvc.loadData((String)localObject1, "text/html", "UTF-8");
      }
      catch (RuntimeException paramvc)
      {
        paramCountDownLatch.countDown();
        throw paramvc;
      }
      if (!bool) {
        paramCountDownLatch.countDown();
      }
      return bool;
      ((View)localObject1).setVisibility(4);
      localObject1 = b.o;
      if ((localObject1 == null) || (((List)localObject1).isEmpty()))
      {
        tp.e("No template ids present in mediation response");
        bool = false;
      }
      else
      {
        paramvc.l().a("/nativeExpressAssetsLoaded", new md()
        {
          public final void a(vc paramAnonymousvc, Map<String, String> paramAnonymousMap)
          {
            countDown();
            paramAnonymousvc.b().setVisibility(0);
          }
        });
        paramvc.l().a("/nativeExpressAssetsLoadingFailed", new md()
        {
          public final void a(vc paramAnonymousvc, Map<String, String> paramAnonymousMap)
          {
            tp.e("Adapter returned an ad, but assets substitution failed");
            countDown();
            paramAnonymousvc.destroy();
          }
        });
        localObject2 = c.h();
        localoh = c.i();
        if ((((List)localObject1).contains("2")) && (localObject2 != null))
        {
          localObject1 = new kw(((og)localObject2).a(), ((og)localObject2).b(), ((og)localObject2).c(), ((og)localObject2).d(), ((og)localObject2).e(), ((og)localObject2).f(), ((og)localObject2).g(), ((og)localObject2).h(), null, ((og)localObject2).l(), null, null);
          localObject2 = b.n;
          lc = new vd.a()
          {
            public final void a(vc paramAnonymousvc, boolean paramAnonymousBoolean)
            {
              try
              {
                paramAnonymousvc = new JSONObject();
                paramAnonymousvc.put("headline", a());
                paramAnonymousvc.put("body", c());
                paramAnonymousvc.put("call_to_action", e());
                paramAnonymousvc.put("price", h());
                paramAnonymousvc.put("star_rating", String.valueOf(f()));
                paramAnonymousvc.put("store", g());
                paramAnonymousvc.put("icon", p.a(d()));
                localObject1 = new JSONArray();
                Object localObject2 = b();
                if (localObject2 != null)
                {
                  localObject2 = ((List)localObject2).iterator();
                  while (((Iterator)localObject2).hasNext()) {
                    ((JSONArray)localObject1).put(p.a(p.a(((Iterator)localObject2).next())));
                  }
                }
                paramAnonymousvc.put("images", localObject1);
              }
              catch (JSONException paramAnonymousvc)
              {
                tp.c("Exception occurred when loading assets", paramAnonymousvc);
                return;
              }
              paramAnonymousvc.put("extras", p.a(n(), localObject2));
              Object localObject1 = new JSONObject();
              ((JSONObject)localObject1).put("assets", paramAnonymousvc);
              ((JSONObject)localObject1).put("template_id", "2");
              paramvc.a("google.afma.nativeExpressAds.loadAssets", (JSONObject)localObject1);
            }
          };
          localObject1 = b.l;
          paramnw = b.m;
          if (paramnw != null)
          {
            paramvc.loadDataWithBaseURL(paramnw, (String)localObject1, "text/html", "UTF-8", null);
            break label454;
          }
        }
        else if ((((List)localObject1).contains("1")) && (localoh != null))
        {
          localObject1 = new kx(localoh.a(), localoh.b(), localoh.c(), localoh.d(), localoh.e(), localoh.f(), null, localoh.j(), null, null);
          localObject2 = b.n;
          lc = new vd.a()
          {
            public final void a(vc paramAnonymousvc, boolean paramAnonymousBoolean)
            {
              try
              {
                paramAnonymousvc = new JSONObject();
                paramAnonymousvc.put("headline", a());
                paramAnonymousvc.put("body", c());
                paramAnonymousvc.put("call_to_action", e());
                paramAnonymousvc.put("advertiser", f());
                paramAnonymousvc.put("logo", p.a(d()));
                localObject1 = new JSONArray();
                Object localObject2 = b();
                if (localObject2 != null)
                {
                  localObject2 = ((List)localObject2).iterator();
                  while (((Iterator)localObject2).hasNext()) {
                    ((JSONArray)localObject1).put(p.a(p.a(((Iterator)localObject2).next())));
                  }
                }
                paramAnonymousvc.put("images", localObject1);
              }
              catch (JSONException paramAnonymousvc)
              {
                tp.c("Exception occurred when loading assets", paramAnonymousvc);
                return;
              }
              paramAnonymousvc.put("extras", p.a(i(), localObject2));
              Object localObject1 = new JSONObject();
              ((JSONObject)localObject1).put("assets", paramAnonymousvc);
              ((JSONObject)localObject1).put("template_id", "1");
              paramvc.a("google.afma.nativeExpressAds.loadAssets", (JSONObject)localObject1);
            }
          };
          continue;
        }
        label454:
        bool = true;
      }
    }
  }
  
  private static String b(lh paramlh)
  {
    try
    {
      paramlh = paramlh.a();
      if (paramlh == null)
      {
        tp.e("Drawable is null. Returning empty string");
        return "";
      }
      paramlh = (Drawable)b.a(paramlh);
      if (!(paramlh instanceof BitmapDrawable))
      {
        tp.e("Drawable is not an instance of BitmapDrawable. Returning empty string");
        return "";
      }
    }
    catch (RemoteException paramlh)
    {
      tp.e("Unable to get drawable. Returning empty string");
      return "";
    }
    return a(((BitmapDrawable)paramlh).getBitmap());
  }
  
  public static boolean b(tg paramtg)
  {
    return (paramtg != null) && (n) && (o != null) && (o.l != null);
  }
}


/* Location:              com/google/android/gms/ads/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */