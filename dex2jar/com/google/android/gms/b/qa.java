package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.g.k;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.i;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class qa
  implements Callable<tg>
{
  static long a = TimeUnit.SECONDS.toMillis(60L);
  private final Context b;
  private final ua c;
  private final s d;
  private final dw e;
  private final pz f;
  private final Object g = new Object();
  private final tg.a h;
  private final km i;
  private boolean j;
  private int k;
  private List<String> l;
  private JSONObject m;
  private String n;
  
  public qa(Context paramContext, s params, ua paramua, dw paramdw, tg.a parama, km paramkm)
  {
    b = paramContext;
    d = params;
    c = paramua;
    h = parama;
    e = paramdw;
    i = paramkm;
    f = new pz(paramContext, parama, params, paramdw);
    f.a();
    j = false;
    k = -2;
    l = null;
    n = null;
  }
  
  private tg a(lc.a parama)
  {
    for (;;)
    {
      synchronized (g)
      {
        int i2 = k;
        int i1 = i2;
        if (parama == null)
        {
          i1 = i2;
          if (k == -2) {
            i1 = 0;
          }
        }
        if (i1 != -2)
        {
          parama = null;
          return new tg(h.a.c, null, h.b.d, i1, h.b.f, l, h.b.l, h.b.k, h.a.i, false, null, null, null, null, null, 0L, h.d, h.b.g, h.f, h.g, h.b.o, m, parama, null, null, null, h.b.F, h.b.G, null, h.b.J, n);
        }
      }
    }
  }
  
  static vc a(us<vc> paramus)
  {
    try
    {
      jz localjz = ke.cm;
      paramus = (vc)paramus.get(((Integer)w.q().a(localjz)).intValue(), TimeUnit.SECONDS);
      return paramus;
    }
    catch (InterruptedException paramus)
    {
      tp.c("InterruptedException occurred while waiting for video to load", paramus);
      Thread.currentThread().interrupt();
      return null;
    }
    catch (ExecutionException paramus)
    {
      for (;;)
      {
        tp.c("Exception occurred while waiting for video to load", paramus);
      }
    }
    catch (CancellationException paramus)
    {
      for (;;) {}
    }
    catch (TimeoutException paramus)
    {
      for (;;) {}
    }
  }
  
  private tg b()
  {
    for (;;)
    {
      try
      {
        f.b();
        str = UUID.randomUUID().toString();
        if (!a()) {
          continue;
        }
        localObject3 = null;
        if (a()) {
          continue;
        }
        if (localObject3 != null) {
          continue;
        }
      }
      catch (CancellationException localCancellationException)
      {
        final String str;
        Object localObject3;
        final Object localObject1;
        if (j) {
          continue;
        }
        a(0);
        return a(null);
        a(0);
        continue;
        JSONObject localJSONObject = ((JSONObject)localObject3).getJSONObject("tracking_urls_and_actions");
        final Object localObject4 = c(localJSONObject, "impression_tracking_urls");
        if (localObject4 != null) {
          continue;
        }
        localObject4 = null;
        l = ((List)localObject4);
        m = localJSONObject.optJSONObject("active_view");
        n = ((JSONObject)localObject3).optString("debug_signals");
        lc.a locala = localCancellationException.a(this, (JSONObject)localObject3);
        locala.a(new ld(b, d, f, e, (JSONObject)localObject3, locala, h.a.k, str));
        continue;
        localObject4 = Arrays.asList((Object[])localObject4);
        continue;
      }
      catch (JSONException localJSONException)
      {
        tp.c("Malformed native JSON response.", localJSONException);
        continue;
      }
      catch (TimeoutException localTimeoutException)
      {
        tp.c("Timeout when loading native ad.", localTimeoutException);
        continue;
      }
      catch (InterruptedException localInterruptedException)
      {
        continue;
        Object localObject2 = null;
        continue;
        localObject2 = null;
        continue;
        boolean bool1 = false;
        continue;
        boolean bool2 = false;
        continue;
        localObject2 = null;
        continue;
      }
      catch (ExecutionException localExecutionException)
      {
        continue;
      }
      if ((a()) || (localObject1 == null)) {
        continue;
      }
      if (localObject3 != null) {
        continue;
      }
      continue;
      if ((localObject1 instanceof ky))
      {
        localObject4 = (ky)localObject1;
        localObject3 = new b();
        localObject4 = new md()
        {
          public final void a(vc paramAnonymousvc, Map<String, String> paramAnonymousMap)
          {
            paramAnonymousvc = (String)paramAnonymousMap.get("asset");
            qa.a(qa.this, localObject4, paramAnonymousvc);
          }
        };
        a = ((md)localObject4);
        f.a(new pz.a()
        {
          public final void a(nk paramAnonymousnk)
          {
            paramAnonymousnk.a("/nativeAdCustomClick", qa.this);
          }
        });
      }
      return a((lc.a)localObject1);
      localObject1 = new up();
      localObject3 = new pz.a()
      {
        public final void a()
        {
          localObject1.b(null);
        }
        
        public final void a(final nk paramAnonymousnk)
        {
          Object localObject = new md()
          {
            public final void a(vc paramAnonymous2vc, Map<String, String> paramAnonymous2Map)
            {
              try
              {
                paramAnonymous2vc = (String)paramAnonymous2Map.get("success");
                paramAnonymous2Map = (String)paramAnonymous2Map.get("failure");
                if (!TextUtils.isEmpty(paramAnonymous2Map)) {
                  paramAnonymous2vc = new JSONObject(paramAnonymous2Map);
                }
                for (int i = 0; !a.equals(paramAnonymous2vc.optString("ads_id", "")); i = 1)
                {
                  return;
                  paramAnonymous2vc = new JSONObject(paramAnonymous2vc);
                }
                paramAnonymousnk.b("/nativeAdPreProcess", b.a);
                if (i != 0)
                {
                  paramAnonymous2vc = paramAnonymous2vc.optJSONArray("ads");
                  if ((paramAnonymous2vc == null) || (paramAnonymous2vc.length() <= 0)) {
                    break label182;
                  }
                  c.b(paramAnonymous2vc.getJSONObject(0));
                }
              }
              catch (JSONException paramAnonymous2vc)
              {
                tp.b("Malformed native JSON response.", paramAnonymous2vc);
                a(0);
                c.a(a(), "Unable to set the ad state error!");
                c.b(null);
                return;
              }
              label182:
              a(3);
              c.b(null);
            }
          };
          b.a = ((md)localObject);
          paramAnonymousnk.a("/nativeAdPreProcess", (md)localObject);
          try
          {
            localObject = new JSONObject(ab.c);
            ((JSONObject)localObject).put("ads_id", str);
            paramAnonymousnk.a("google.afma.nativeAds.preProcessJsonGmsg", (JSONObject)localObject);
            return;
          }
          catch (JSONException paramAnonymousnk)
          {
            tp.c("Exception occurred while invoking javascript", paramAnonymousnk);
            localObject1.b(null);
          }
        }
      };
      f.a((pz.a)localObject3);
      localObject3 = (JSONObject)((up)localObject1).get(a, TimeUnit.MILLISECONDS);
      continue;
      localObject1 = ((JSONObject)localObject3).getString("template_id");
      if (h.a.y == null) {
        continue;
      }
      bool1 = h.a.y.b;
      if (h.a.y == null) {
        continue;
      }
      bool2 = h.a.y.d;
      if ("2".equals(localObject1))
      {
        localObject1 = new qc(bool1, bool2);
      }
      else if ("1".equals(localObject1))
      {
        localObject1 = new qe(bool1, bool2);
      }
      else
      {
        if (!"3".equals(localObject1)) {
          continue;
        }
        localObject1 = ((JSONObject)localObject3).getString("custom_template_id");
        localObject4 = new up();
        tt.a.post(new Runnable()
        {
          public final void run()
          {
            localObject4.b((lt)qa.b(qa.this).L().get(localObject1));
          }
        });
        if (((up)localObject4).get(a, TimeUnit.MILLISECONDS) == null) {
          continue;
        }
        localObject1 = new qf(bool1);
      }
    }
    localObject1 = String.valueOf(((JSONObject)localObject3).getString("custom_template_id"));
    if (((String)localObject1).length() != 0) {}
    for (localObject1 = "No handler for custom template: ".concat((String)localObject1);; localObject1 = new String("No handler for custom template: "))
    {
      tp.c((String)localObject1);
      break;
    }
  }
  
  private static Integer b(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      paramJSONObject = paramJSONObject.getJSONObject(paramString);
      int i1 = Color.rgb(paramJSONObject.getInt("r"), paramJSONObject.getInt("g"), paramJSONObject.getInt("b"));
      return Integer.valueOf(i1);
    }
    catch (JSONException paramJSONObject) {}
    return null;
  }
  
  private static String[] c(JSONObject paramJSONObject, String paramString)
  {
    paramJSONObject = paramJSONObject.optJSONArray(paramString);
    if (paramJSONObject == null) {
      return null;
    }
    paramString = new String[paramJSONObject.length()];
    int i1 = 0;
    while (i1 < paramJSONObject.length())
    {
      paramString[i1] = paramJSONObject.getString(i1);
      i1 += 1;
    }
    return paramString;
  }
  
  public final us<kt> a(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = paramJSONObject.optJSONObject("attribution");
    if (localJSONObject == null) {
      return new uq(null);
    }
    Object localObject1 = localJSONObject.optString("text");
    final int i2 = localJSONObject.optInt("text_size", -1);
    final Object localObject2 = b(localJSONObject, "text_color");
    final Integer localInteger = b(localJSONObject, "bg_color");
    final int i3 = localJSONObject.optInt("animation_ms", 1000);
    final int i4 = localJSONObject.optInt("presentation_ms", 4000);
    final int i1;
    final boolean bool;
    if ((h.a.y != null) && (h.a.y.a >= 2))
    {
      i1 = h.a.y.e;
      bool = localJSONObject.optBoolean("allow_pub_rendering");
      paramJSONObject = new ArrayList();
      if (localJSONObject.optJSONArray("images") == null) {
        break label238;
      }
      paramJSONObject = a(localJSONObject, "images", false, false, true);
    }
    for (;;)
    {
      paramJSONObject = ur.a(paramJSONObject);
      localObject1 = new ur.a()
      {
        private kt a(List<kv> paramAnonymousList)
        {
          if (paramAnonymousList != null) {
            for (;;)
            {
              try
              {
                if (paramAnonymousList.isEmpty()) {
                  break;
                }
                String str = qa.this;
                List localList = qa.a(paramAnonymousList);
                Integer localInteger1 = localInteger;
                Integer localInteger2 = localObject2;
                if (i2 > 0)
                {
                  paramAnonymousList = Integer.valueOf(i2);
                  paramAnonymousList = new kt(str, localList, localInteger1, localInteger2, paramAnonymousList, i4 + i3, i1, bool);
                  return paramAnonymousList;
                }
              }
              catch (RemoteException paramAnonymousList)
              {
                tp.b("Could not get attribution icon", paramAnonymousList);
                return null;
              }
              paramAnonymousList = null;
            }
          }
          return null;
        }
      };
      localObject2 = new up();
      paramJSONObject.a(new ur.1((up)localObject2, (ur.a)localObject1, paramJSONObject));
      return (us<kt>)localObject2;
      i1 = 1;
      break;
      label238:
      paramJSONObject.add(a(localJSONObject, "image", false, false));
    }
  }
  
  public final us<vc> a(JSONObject paramJSONObject, String paramString)
  {
    paramJSONObject = paramJSONObject.optJSONObject(paramString);
    if (paramJSONObject == null) {
      return new uq(null);
    }
    if (TextUtils.isEmpty(paramJSONObject.optString("vast_xml")))
    {
      tp.e("Required field 'vast_xml' is missing");
      return new uq(null);
    }
    paramString = new qb(b, e, h, i, d);
    up localup = new up();
    w.e();
    tt.a(new qb.1(paramString, paramJSONObject, localup));
    return localup;
  }
  
  public final us<kv> a(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    for (paramJSONObject = paramJSONObject.getJSONObject(paramString);; paramJSONObject = paramJSONObject.optJSONObject(paramString))
    {
      paramString = paramJSONObject;
      if (paramJSONObject == null) {
        paramString = new JSONObject();
      }
      return a(paramString, paramBoolean1, paramBoolean2);
    }
  }
  
  final us<kv> a(JSONObject paramJSONObject, final boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    final double d1;
    boolean bool;
    for (final String str = paramJSONObject.getString("url");; str = paramJSONObject.optString("url"))
    {
      d1 = paramJSONObject.optDouble("scale", 1.0D);
      bool = paramJSONObject.optBoolean("is_transparent", true);
      if (!TextUtils.isEmpty(str)) {
        break;
      }
      a(0, paramBoolean1);
      return new uq(null);
    }
    if (paramBoolean2) {
      return new uq(new kv(null, Uri.parse(str), d1));
    }
    paramJSONObject = new ua.a()
    {
      private kv b()
      {
        a(2, paramBoolean1);
        return null;
      }
      
      @TargetApi(19)
      private kv b(InputStream paramAnonymousInputStream)
      {
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        inDensity = ((int)(160.0D * d1));
        if (!str) {
          inPreferredConfig = Bitmap.Config.RGB_565;
        }
        long l1 = SystemClock.uptimeMillis();
        long l2;
        try
        {
          paramAnonymousInputStream = BitmapFactory.decodeStream(paramAnonymousInputStream, null, localOptions);
          if (paramAnonymousInputStream == null)
          {
            a(2, paramBoolean1);
            return null;
          }
        }
        catch (Exception paramAnonymousInputStream)
        {
          for (;;)
          {
            tp.b("Error grabbing image.", paramAnonymousInputStream);
            paramAnonymousInputStream = null;
          }
          l2 = SystemClock.uptimeMillis();
          if (!i.c()) {
            break label195;
          }
        }
        int i;
        int j;
        int k;
        if (tp.a())
        {
          i = paramAnonymousInputStream.getWidth();
          j = paramAnonymousInputStream.getHeight();
          k = paramAnonymousInputStream.getAllocationByteCount();
          if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            break label225;
          }
        }
        label195:
        label225:
        for (boolean bool = true;; bool = false)
        {
          tp.a(108 + "Decoded image w: " + i + " h:" + j + " bytes: " + k + " time: " + (l2 - l1) + " on ui thread: " + bool);
          return new kv(new BitmapDrawable(Resources.getSystem(), paramAnonymousInputStream), Uri.parse(d), d1);
        }
      }
    };
    ua.c localc = new ua.c((byte)0);
    ua.a.a(new ua.b(str, paramJSONObject, localc));
    return localc;
  }
  
  public final List<us<kv>> a(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean1) {}
    ArrayList localArrayList;
    for (paramJSONObject = paramJSONObject.getJSONArray(paramString);; paramJSONObject = paramJSONObject.optJSONArray(paramString))
    {
      localArrayList = new ArrayList();
      if ((paramJSONObject != null) && (paramJSONObject.length() != 0)) {
        break;
      }
      a(0, paramBoolean1);
      return localArrayList;
    }
    if (paramBoolean3) {}
    for (int i1 = paramJSONObject.length();; i1 = 1)
    {
      int i2 = 0;
      while (i2 < i1)
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i2);
        paramString = localJSONObject;
        if (localJSONObject == null) {
          paramString = new JSONObject();
        }
        localArrayList.add(a(paramString, paramBoolean1, paramBoolean2));
        i2 += 1;
      }
    }
    return localArrayList;
  }
  
  public final void a(int paramInt)
  {
    synchronized (g)
    {
      j = true;
      k = paramInt;
      return;
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      a(paramInt);
    }
  }
  
  public final boolean a()
  {
    synchronized (g)
    {
      boolean bool = j;
      return bool;
    }
  }
  
  public static abstract interface a<T extends lc.a>
  {
    public abstract T a(qa paramqa, JSONObject paramJSONObject);
  }
  
  final class b
  {
    public md a;
  }
}


/* Location:              com/google/android/gms/b/qa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */