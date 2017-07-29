package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class qa
  implements Callable
{
  static long a = TimeUnit.SECONDS.toMillis(60);
  private final Context b;
  private final ua c;
  private final s d;
  private final dw e;
  private final pz f;
  private final Object g;
  private final tg.a h;
  private final km i;
  private boolean j;
  private int k;
  private List l;
  private JSONObject m;
  private String n;
  
  public qa(Context paramContext, s params, ua paramua, dw paramdw, tg.a parama, km paramkm)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    g = localObject;
    b = paramContext;
    d = params;
    c = paramua;
    h = parama;
    e = paramdw;
    i = paramkm;
    localObject = new com/google/android/gms/b/pz;
    ((pz)localObject).<init>(paramContext, parama, params, paramdw);
    f = ((pz)localObject);
    f.a();
    j = false;
    k = -2;
    l = null;
    n = null;
  }
  
  private tg a(lc.a parama)
  {
    Object localObject1 = this;
    for (;;)
    {
      synchronized (g)
      {
        int i1 = k;
        if (parama == null)
        {
          i2 = k;
          int i3 = -2;
          if (i2 == i3) {
            i1 = 0;
          }
        }
        int i2 = -2;
        if (i1 != i2)
        {
          locala = null;
          tg localtg = new com/google/android/gms/b/tg;
          localObject1 = this;
          ??? = h.a.c;
          List localList1 = h.b.d;
          List localList2 = h.b.f;
          List localList3 = l;
          int i4 = h.b.l;
          long l1 = h.b.k;
          String str = h.a.i;
          localObject1 = h;
          Object localObject4 = localObject1;
          localObject4 = d;
          localObject1 = this;
          long l2 = h.b.g;
          localObject1 = this;
          long l3 = h.f;
          localObject1 = this;
          long l4 = h.g;
          localObject1 = this;
          localObject1 = h;
          Object localObject5 = localObject1;
          localObject1 = b;
          localObject5 = localObject1;
          localObject5 = o;
          localObject1 = this;
          JSONObject localJSONObject = m;
          localObject1 = this;
          boolean bool = h.b.F;
          localObject1 = this;
          localObject1 = h;
          Object localObject6 = localObject1;
          localObject1 = b;
          localObject6 = localObject1;
          localObject6 = G;
          localObject1 = this;
          localObject1 = h;
          Object localObject7 = localObject1;
          localObject1 = b;
          localObject7 = localObject1;
          localObject7 = J;
          localObject1 = this;
          localObject1 = n;
          localtg.<init>((ih)???, null, localList1, i1, localList2, localList3, i4, l1, str, false, null, null, null, null, null, 0L, (il)localObject4, l2, l3, l4, (String)localObject5, localJSONObject, locala, null, null, null, bool, (qt)localObject6, null, (List)localObject7, (String)localObject1);
          return localtg;
        }
      }
      lc.a locala = parama;
    }
  }
  
  static vc a(us paramus)
  {
    try
    {
      localObject1 = ke.cm;
      localObject2 = w.q();
      localObject1 = ((kd)localObject2).a((jz)localObject1);
      localObject1 = (Integer)localObject1;
      i1 = ((Integer)localObject1).intValue();
      long l1 = i1;
      TimeUnit localTimeUnit = TimeUnit.SECONDS;
      localObject1 = paramus.get(l1, localTimeUnit);
      localObject1 = (vc)localObject1;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Object localObject1;
        localObject2 = "InterruptedException occurred while waiting for video to load";
        tp.c((String)localObject2, localInterruptedException);
        Thread localThread = Thread.currentThread();
        localThread.interrupt();
        int i1 = 0;
        localThread = null;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        Object localObject2 = "Exception occurred while waiting for video to load";
        tp.c((String)localObject2, localExecutionException);
      }
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;) {}
    }
    return (vc)localObject1;
  }
  
  private tg b()
  {
    for (;;)
    {
      try
      {
        localObject1 = f;
        ((pz)localObject1).b();
        localObject1 = UUID.randomUUID();
        str = ((UUID)localObject1).toString();
        bool1 = a();
        if (!bool1) {
          continue;
        }
        localObject3 = null;
        bool1 = a();
        if ((!bool1) && (localObject3 != null)) {
          continue;
        }
        bool2 = false;
        localObject4 = null;
        bool1 = a();
        if ((!bool1) && (localObject4 != null) && (localObject3 != null)) {
          continue;
        }
        bool2 = false;
        localObject4 = null;
      }
      catch (CancellationException localCancellationException)
      {
        Object localObject1;
        boolean bool2;
        Object localObject5;
        long l1;
        boolean bool3;
        long l2;
        int i1;
        bool1 = j;
        if (bool1) {
          continue;
        }
        a(0);
        tg localtg = a(null);
        continue;
        bool1 = false;
        localtg = null;
        a(0);
        continue;
      }
      catch (ExecutionException localExecutionException)
      {
        String str;
        Object localObject3;
        continue;
        Object localObject2 = "tracking_urls_and_actions";
        Object localObject6 = ((JSONObject)localObject3).getJSONObject((String)localObject2);
        localObject2 = "impression_tracking_urls";
        localObject2 = c((JSONObject)localObject6, (String)localObject2);
        if (localObject2 != null) {
          continue;
        }
        boolean bool1 = false;
        localObject2 = null;
        l = ((List)localObject2);
        localObject2 = "active_view";
        localObject2 = ((JSONObject)localObject6).optJSONObject((String)localObject2);
        m = ((JSONObject)localObject2);
        localObject2 = "debug_signals";
        localObject2 = ((JSONObject)localObject3).optString((String)localObject2);
        n = ((String)localObject2);
        lc.a locala = ((qa.a)localObject4).a(this, (JSONObject)localObject3);
        localObject2 = new com/google/android/gms/b/ld;
        localObject4 = b;
        localObject6 = d;
        Object localObject7 = f;
        Object localObject8 = e;
        Object localObject9 = h;
        localObject9 = a;
        localObject9 = k;
        ((ld)localObject2).<init>((Context)localObject4, (s)localObject6, (pz)localObject7, (dw)localObject8, (JSONObject)localObject3, locala, (un)localObject9, str);
        locala.a((lc)localObject2);
        localObject4 = locala;
        continue;
        localObject2 = Arrays.asList((Object[])localObject2);
        continue;
      }
      catch (JSONException localJSONException)
      {
        localObject4 = "Malformed native JSON response.";
        tp.c((String)localObject4, localJSONException);
        continue;
      }
      catch (TimeoutException localTimeoutException)
      {
        Object localObject4 = "Timeout when loading native ad.";
        tp.c((String)localObject4, localTimeoutException);
        continue;
      }
      catch (InterruptedException localInterruptedException)
      {
        continue;
      }
      bool1 = localObject4 instanceof ky;
      if (bool1)
      {
        localObject5 = localObject4;
        localObject5 = (ky)localObject4;
        localObject1 = localObject5;
        localObject6 = new com/google/android/gms/b/qa$b;
        ((qa.b)localObject6).<init>();
        localObject7 = new com/google/android/gms/b/qa$3;
        ((qa.3)localObject7).<init>(this, (ky)localObject5);
        a = ((md)localObject7);
        localObject1 = f;
        localObject6 = new com/google/android/gms/b/qa$4;
        ((qa.4)localObject6).<init>((md)localObject7);
        ((pz)localObject1).a((pz.a)localObject6);
      }
      localObject1 = a((lc.a)localObject4);
      return (tg)localObject1;
      localObject1 = new com/google/android/gms/b/up;
      ((up)localObject1).<init>();
      localObject4 = new com/google/android/gms/b/qa$b;
      ((qa.b)localObject4).<init>();
      localObject6 = new com/google/android/gms/b/qa$1;
      ((qa.1)localObject6).<init>(this, str, (qa.b)localObject4, (up)localObject1);
      localObject4 = f;
      ((pz)localObject4).a((pz.a)localObject6);
      l1 = a;
      localObject4 = TimeUnit.MILLISECONDS;
      localObject1 = ((up)localObject1).get(l1, (TimeUnit)localObject4);
      localObject1 = (JSONObject)localObject1;
      localObject3 = localObject1;
      continue;
      localObject1 = "template_id";
      localObject7 = ((JSONObject)localObject3).getString((String)localObject1);
      localObject1 = h;
      localObject1 = a;
      localObject1 = y;
      if (localObject1 != null)
      {
        localObject1 = h;
        localObject1 = a;
        localObject1 = y;
        bool1 = b;
        bool3 = bool1;
        localObject1 = h;
        localObject1 = a;
        localObject1 = y;
        if (localObject1 != null)
        {
          localObject1 = h;
          localObject1 = a;
          localObject1 = y;
          bool1 = d;
          bool2 = bool1;
          localObject1 = "2";
          bool1 = ((String)localObject1).equals(localObject7);
          if (!bool1) {
            continue;
          }
          localObject1 = new com/google/android/gms/b/qc;
          ((qc)localObject1).<init>(bool3, bool2);
          localObject4 = localObject1;
        }
      }
      else
      {
        bool3 = false;
        localObject6 = null;
        continue;
      }
      bool2 = false;
      localObject4 = null;
      continue;
      localObject1 = "1";
      bool1 = ((String)localObject1).equals(localObject7);
      if (bool1)
      {
        localObject1 = new com/google/android/gms/b/qe;
        ((qe)localObject1).<init>(bool3, bool2);
        localObject4 = localObject1;
      }
      else
      {
        localObject1 = "3";
        bool1 = ((String)localObject1).equals(localObject7);
        if (!bool1) {
          continue;
        }
        localObject1 = "custom_template_id";
        localObject1 = ((JSONObject)localObject3).getString((String)localObject1);
        localObject4 = new com/google/android/gms/b/up;
        ((up)localObject4).<init>();
        localObject7 = tt.a;
        localObject8 = new com/google/android/gms/b/qa$2;
        ((qa.2)localObject8).<init>(this, (up)localObject4, (String)localObject1);
        ((Handler)localObject7).post((Runnable)localObject8);
        l2 = a;
        localObject1 = TimeUnit.MILLISECONDS;
        localObject1 = ((up)localObject4).get(l2, (TimeUnit)localObject1);
        if (localObject1 == null) {
          continue;
        }
        localObject1 = new com/google/android/gms/b/qf;
        ((qf)localObject1).<init>(bool3);
        localObject4 = localObject1;
      }
    }
    localObject4 = "No handler for custom template: ";
    localObject1 = "custom_template_id";
    localObject1 = ((JSONObject)localObject3).getString((String)localObject1);
    localObject1 = String.valueOf(localObject1);
    i1 = ((String)localObject1).length();
    if (i1 != 0) {
      localObject1 = ((String)localObject4).concat((String)localObject1);
    }
    for (;;)
    {
      tp.c((String)localObject1);
      bool2 = false;
      localObject4 = null;
      break;
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject4);
    }
  }
  
  private static Integer b(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      localObject1 = paramJSONObject.getJSONObject(paramString);
      String str1 = "r";
      int i1 = ((JSONObject)localObject1).getInt(str1);
      String str2 = "g";
      int i2 = ((JSONObject)localObject1).getInt(str2);
      String str3 = "b";
      i3 = ((JSONObject)localObject1).getInt(str3);
      i3 = Color.rgb(i1, i2, i3);
      localObject1 = Integer.valueOf(i3);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject1;
        int i3 = 0;
        Object localObject2 = null;
      }
    }
    return (Integer)localObject1;
  }
  
  private static String[] c(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    int i1;
    if (localJSONArray == null) {
      i1 = 0;
    }
    String[] arrayOfString;
    for (Object localObject = null;; localObject = arrayOfString)
    {
      return (String[])localObject;
      arrayOfString = new String[localJSONArray.length()];
      i1 = 0;
      localObject = null;
      for (;;)
      {
        int i2 = localJSONArray.length();
        if (i1 >= i2) {
          break;
        }
        String str = localJSONArray.getString(i1);
        arrayOfString[i1] = str;
        i1 += 1;
      }
    }
  }
  
  public final us a(JSONObject paramJSONObject)
  {
    Object localObject1 = "attribution";
    Object localObject2 = paramJSONObject.optJSONObject((String)localObject1);
    if (localObject2 == null)
    {
      localObject1 = new com/google/android/gms/b/uq;
      localObject2 = null;
      ((uq)localObject1).<init>(null);
      return (us)localObject1;
    }
    String str = ((JSONObject)localObject2).optString("text");
    int i1 = ((JSONObject)localObject2).optInt("text_size", -1);
    Integer localInteger1 = b((JSONObject)localObject2, "text_color");
    Integer localInteger2 = b((JSONObject)localObject2, "bg_color");
    int i2 = ((JSONObject)localObject2).optInt("animation_ms", 1000);
    int i3 = 4000;
    int i4 = ((JSONObject)localObject2).optInt("presentation_ms", i3);
    localObject1 = h.a.y;
    int i6;
    label151:
    boolean bool1;
    Object localObject3;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject1 = h.a.y;
      int i5 = a;
      i3 = 2;
      if (i5 >= i3)
      {
        localObject1 = h.a.y;
        i6 = e;
        bool1 = ((JSONObject)localObject2).optBoolean("allow_pub_rendering");
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localObject3 = ((JSONObject)localObject2).optJSONArray("images");
        if (localObject3 == null) {
          break label287;
        }
        localObject3 = "images";
        bool2 = true;
        localObject1 = this;
        localObject1 = a((JSONObject)localObject2, (String)localObject3, false, false, bool2);
      }
    }
    for (;;)
    {
      us localus = ur.a((List)localObject1);
      localObject1 = new com/google/android/gms/b/qa$5;
      localObject2 = str;
      localObject3 = localInteger2;
      bool2 = i4;
      ((qa.5)localObject1).<init>(str, localInteger2, localInteger1, i1, i4, i2, i6, bool1);
      localObject2 = new com/google/android/gms/b/up;
      ((up)localObject2).<init>();
      localObject3 = new com/google/android/gms/b/ur$1;
      ((ur.1)localObject3).<init>((up)localObject2, (ur.a)localObject1, localus);
      localus.a((Runnable)localObject3);
      localObject1 = localObject2;
      break;
      i6 = 1;
      break label151;
      label287:
      localObject3 = "image";
      localObject2 = a((JSONObject)localObject2, (String)localObject3, false, false);
      ((List)localObject1).add(localObject2);
    }
  }
  
  public final us a(JSONObject paramJSONObject, String paramString)
  {
    Object localObject1 = null;
    JSONObject localJSONObject = paramJSONObject.optJSONObject(paramString);
    Object localObject2;
    if (localJSONObject == null)
    {
      localObject2 = new com/google/android/gms/b/uq;
      ((uq)localObject2).<init>(null);
    }
    for (;;)
    {
      return (us)localObject2;
      localObject2 = localJSONObject.optString("vast_xml");
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool)
      {
        tp.e("Required field 'vast_xml' is missing");
        localObject2 = new com/google/android/gms/b/uq;
        ((uq)localObject2).<init>(null);
      }
      else
      {
        localObject1 = b;
        Object localObject3 = e;
        tg.a locala = h;
        km localkm = i;
        s locals = d;
        localObject2 = new com/google/android/gms/b/qb;
        ((qb)localObject2).<init>((Context)localObject1, (dw)localObject3, locala, localkm, locals);
        localObject1 = new com/google/android/gms/b/up;
        ((up)localObject1).<init>();
        w.e();
        localObject3 = new com/google/android/gms/b/qb$1;
        ((qb.1)localObject3).<init>((qb)localObject2, localJSONObject, (up)localObject1);
        tt.a((Runnable)localObject3);
        localObject2 = localObject1;
      }
    }
  }
  
  public final us a(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    for (JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);; localJSONObject = paramJSONObject.optJSONObject(paramString))
    {
      if (localJSONObject == null)
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
      }
      return a(localJSONObject, paramBoolean1, paramBoolean2);
    }
  }
  
  final us a(JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1;
    String str;
    double d2;
    boolean bool2;
    if (paramBoolean1)
    {
      localObject1 = "url";
      str = paramJSONObject.getString((String)localObject1);
      double d1 = 1.0D;
      d2 = paramJSONObject.optDouble("scale", d1);
      localObject1 = "is_transparent";
      boolean bool1 = true;
      bool2 = paramJSONObject.optBoolean((String)localObject1, bool1);
      boolean bool3 = TextUtils.isEmpty(str);
      if (!bool3) {
        break label99;
      }
      a(0, paramBoolean1);
      localObject1 = new com/google/android/gms/b/uq;
      ((uq)localObject1).<init>(null);
    }
    for (;;)
    {
      return (us)localObject1;
      localObject1 = "url";
      str = paramJSONObject.optString((String)localObject1);
      break;
      label99:
      Object localObject2;
      Object localObject3;
      if (paramBoolean2)
      {
        localObject1 = new com/google/android/gms/b/uq;
        localObject2 = new com/google/android/gms/b/kv;
        localObject3 = Uri.parse(str);
        ((kv)localObject2).<init>(null, (Uri)localObject3, d2);
        ((uq)localObject1).<init>(localObject2);
      }
      else
      {
        localObject2 = new com/google/android/gms/b/qa$6;
        localObject3 = this;
        ((qa.6)localObject2).<init>(this, paramBoolean1, d2, bool2, str);
        localObject1 = new com/google/android/gms/b/ua$c;
        ((ua.c)localObject1).<init>((byte)0);
        localObject3 = ua.a;
        ua.b localb = new com/google/android/gms/b/ua$b;
        localb.<init>(str, (ua.a)localObject2, (re.b)localObject1);
        ((qd)localObject3).a(localb);
      }
    }
  }
  
  public final List a(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i1 = 0;
    Object localObject1 = null;
    ArrayList localArrayList;
    int i2;
    if (paramBoolean1)
    {
      localObject2 = paramJSONObject.getJSONArray(paramString);
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (localObject2 != null)
      {
        i2 = ((JSONArray)localObject2).length();
        if (i2 != 0) {
          break label67;
        }
      }
      a(0, paramBoolean1);
    }
    for (Object localObject2 = localArrayList;; localObject2 = localArrayList)
    {
      return (List)localObject2;
      localObject2 = paramJSONObject.optJSONArray(paramString);
      break;
      label67:
      if (paramBoolean3) {}
      for (i2 = ((JSONArray)localObject2).length();; i2 = 1) {
        for (int i3 = 0; i3 < i2; i3 = i1)
        {
          localObject1 = ((JSONArray)localObject2).getJSONObject(i3);
          if (localObject1 == null)
          {
            localObject1 = new org/json/JSONObject;
            ((JSONObject)localObject1).<init>();
          }
          localObject1 = a((JSONObject)localObject1, paramBoolean1, paramBoolean2);
          localArrayList.add(localObject1);
          i1 = i3 + 1;
        }
      }
    }
  }
  
  public final void a(int paramInt)
  {
    Object localObject1 = g;
    boolean bool = true;
    try
    {
      j = bool;
      k = paramInt;
      return;
    }
    finally {}
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
}


/* Location:              com/google/android/gms/b/qa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */