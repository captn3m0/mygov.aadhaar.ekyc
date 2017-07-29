package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@qi
public final class rb
  extends to
{
  static final long a = TimeUnit.SECONDS.toMillis(10L);
  static boolean b = false;
  private static final Object c = new Object();
  private static nj d = null;
  private static me e = null;
  private static mi f = null;
  private static md g = null;
  private final qj.a h;
  private final qo.a i;
  private final Object j = new Object();
  private final Context l;
  private nj.c m;
  
  public rb(Context paramContext, qo.a parama, qj.a arg3)
  {
    super((byte)0);
    h = ???;
    l = paramContext;
    i = parama;
    synchronized (c)
    {
      if (!b)
      {
        f = new mi();
        e = new me(paramContext.getApplicationContext(), j);
        g = new c();
        paramContext = l.getApplicationContext();
        parama = i.j;
        jz localjz = ke.b;
        d = new nj(paramContext, parama, (String)w.q().a(localjz), new b(), new a());
        b = true;
      }
      return;
    }
  }
  
  private qr a(qo paramqo)
  {
    w.e();
    final Object localObject = tt.a();
    final JSONObject localJSONObject = a(paramqo, (String)localObject);
    if (localJSONObject == null) {
      paramqo = new qr(0);
    }
    for (;;)
    {
      return paramqo;
      long l1 = w.k().b();
      mi localmi = f;
      up localup = new up();
      a.put(localObject, localup);
      uk.a.post(new Runnable()
      {
        public final void run()
        {
          rb.a(rb.this, rb.e().b(null));
          rb.b(rb.this).a(new uv.c()new uv.a {}, new uv.a()
          {
            public final void a()
            {
              rb.d().a(b);
            }
          });
        }
      });
      long l2 = a;
      long l3 = w.k().b();
      try
      {
        localObject = (JSONObject)localup.get(l2 - (l3 - l1), TimeUnit.MILLISECONDS);
        if (localObject == null) {
          return new qr(-1);
        }
      }
      catch (InterruptedException paramqo)
      {
        return new qr(-1);
      }
      catch (TimeoutException paramqo)
      {
        return new qr(2);
      }
      catch (ExecutionException paramqo)
      {
        return new qr(0);
        localObject = ri.a(l, paramqo, ((JSONObject)localObject).toString());
        paramqo = (qo)localObject;
        if (e == -3) {
          continue;
        }
        paramqo = (qo)localObject;
        if (!TextUtils.isEmpty(c)) {
          continue;
        }
        return new qr(3);
      }
      catch (CancellationException paramqo)
      {
        for (;;) {}
      }
    }
  }
  
  /* Error */
  private JSONObject a(qo paramqo, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 247	com/google/android/gms/b/qo:c	Lcom/google/android/gms/b/ih;
    //   4: getfield 252	com/google/android/gms/b/ih:c	Landroid/os/Bundle;
    //   7: ldc -2
    //   9: invokevirtual 260	android/os/Bundle:getBundle	(Ljava/lang/String;)Landroid/os/Bundle;
    //   12: astore 5
    //   14: aload 5
    //   16: ifnonnull +5 -> 21
    //   19: aconst_null
    //   20: areturn
    //   21: invokestatic 264	com/google/android/gms/ads/internal/w:n	()Lcom/google/android/gms/b/ro;
    //   24: aload_0
    //   25: getfield 88	com/google/android/gms/b/rb:l	Landroid/content/Context;
    //   28: invokevirtual 269	com/google/android/gms/b/ro:a	(Landroid/content/Context;)Ljava/util/concurrent/Future;
    //   31: invokeinterface 272 1 0
    //   36: checkcast 274	com/google/android/gms/b/rn
    //   39: astore 4
    //   41: aload_0
    //   42: getfield 88	com/google/android/gms/b/rb:l	Landroid/content/Context;
    //   45: astore 6
    //   47: new 276	com/google/android/gms/b/rf
    //   50: dup
    //   51: invokespecial 277	com/google/android/gms/b/rf:<init>	()V
    //   54: astore 7
    //   56: aload 7
    //   58: aload_1
    //   59: putfield 280	com/google/android/gms/b/rf:i	Lcom/google/android/gms/b/qo;
    //   62: aload 7
    //   64: aload 4
    //   66: putfield 283	com/google/android/gms/b/rf:j	Lcom/google/android/gms/b/rn;
    //   69: aload 6
    //   71: aload 7
    //   73: invokestatic 286	com/google/android/gms/b/ri:a	(Landroid/content/Context;Lcom/google/android/gms/b/rf;)Lorg/json/JSONObject;
    //   76: astore 4
    //   78: aload 4
    //   80: ifnull -61 -> 19
    //   83: aload_0
    //   84: getfield 88	com/google/android/gms/b/rb:l	Landroid/content/Context;
    //   87: invokestatic 291	com/google/android/gms/ads/c/a:a	(Landroid/content/Context;)Lcom/google/android/gms/ads/c/a$a;
    //   90: astore_1
    //   91: new 181	java/util/HashMap
    //   94: dup
    //   95: invokespecial 292	java/util/HashMap:<init>	()V
    //   98: astore 6
    //   100: aload 6
    //   102: ldc_w 294
    //   105: aload_2
    //   106: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   109: pop
    //   110: aload 6
    //   112: ldc_w 296
    //   115: aload 4
    //   117: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: aload 6
    //   123: ldc_w 298
    //   126: aload 5
    //   128: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_1
    //   133: ifnull +38 -> 171
    //   136: aload 6
    //   138: ldc_w 300
    //   141: aload_1
    //   142: getfield 304	com/google/android/gms/ads/c/a$a:a	Ljava/lang/String;
    //   145: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   148: pop
    //   149: aload_1
    //   150: getfield 305	com/google/android/gms/ads/c/a$a:b	Z
    //   153: ifeq +58 -> 211
    //   156: iconst_1
    //   157: istore_3
    //   158: aload 6
    //   160: ldc_w 307
    //   163: iload_3
    //   164: invokestatic 313	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   167: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   170: pop
    //   171: invokestatic 151	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   174: aload 6
    //   176: invokevirtual 316	com/google/android/gms/b/tt:a	(Ljava/util/Map;)Lorg/json/JSONObject;
    //   179: astore_1
    //   180: aload_1
    //   181: areturn
    //   182: astore 4
    //   184: ldc_w 318
    //   187: aload 4
    //   189: invokestatic 323	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   192: aconst_null
    //   193: astore 4
    //   195: goto -154 -> 41
    //   198: astore_1
    //   199: ldc_w 325
    //   202: aload_1
    //   203: invokestatic 323	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   206: aconst_null
    //   207: astore_1
    //   208: goto -117 -> 91
    //   211: iconst_0
    //   212: istore_3
    //   213: goto -55 -> 158
    //   216: astore_1
    //   217: aconst_null
    //   218: areturn
    //   219: astore_1
    //   220: goto -21 -> 199
    //   223: astore_1
    //   224: goto -25 -> 199
    //   227: astore_1
    //   228: goto -29 -> 199
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	231	0	this	rb
    //   0	231	1	paramqo	qo
    //   0	231	2	paramString	String
    //   157	56	3	k	int
    //   39	77	4	localObject1	Object
    //   182	6	4	localException	Exception
    //   193	1	4	localObject2	Object
    //   12	115	5	localBundle	android.os.Bundle
    //   45	130	6	localObject3	Object
    //   54	18	7	localrf	rf
    // Exception table:
    //   from	to	target	type
    //   21	41	182	java/lang/Exception
    //   83	91	198	com/google/android/gms/common/d
    //   171	180	216	org/json/JSONException
    //   83	91	219	java/lang/IllegalStateException
    //   83	91	223	com/google/android/gms/common/e
    //   83	91	227	java/io/IOException
  }
  
  protected static void a(ng paramng)
  {
    paramng.a("/loadAd", f);
    paramng.a("/fetchHttpRequest", e);
    paramng.a("/invalidRequest", g);
  }
  
  protected static void b(ng paramng)
  {
    paramng.b("/loadAd", f);
    paramng.b("/fetchHttpRequest", e);
    paramng.b("/invalidRequest", g);
  }
  
  public final void a()
  {
    tp.b("SdkLessAdLoaderBackgroundTask started.");
    Object localObject2 = w.D().d(l);
    final Object localObject1 = new qo(i, -1L, w.D().b(l), w.D().c(l), (String)localObject2);
    w.D().c(l, (String)localObject2);
    localObject2 = a((qo)localObject1);
    long l1 = w.k().b();
    localObject1 = new tg.a((qo)localObject1, (qr)localObject2, null, null, e, l1, n, null);
    uk.a.post(new Runnable()
    {
      public final void run()
      {
        rb.a(rb.this).a(localObject1);
        if (rb.b(rb.this) != null)
        {
          rb.b(rb.this).g_();
          rb.a(rb.this, null);
        }
      }
    });
  }
  
  public final void c_()
  {
    synchronized (j)
    {
      uk.a.post(new Runnable()
      {
        public final void run()
        {
          if (rb.b(rb.this) != null)
          {
            rb.b(rb.this).g_();
            rb.a(rb.this, null);
          }
        }
      });
      return;
    }
  }
  
  public static final class a
    implements ty<ng>
  {}
  
  public static final class b
    implements ty<ng>
  {}
  
  public static final class c
    implements md
  {
    public final void a(vc paramvc, Map<String, String> paramMap)
    {
      String str = (String)paramMap.get("request_id");
      paramvc = String.valueOf((String)paramMap.get("errors"));
      if (paramvc.length() != 0) {}
      for (paramvc = "Invalid request: ".concat(paramvc);; paramvc = new String("Invalid request: "))
      {
        tp.e(paramvc);
        rb.d().a(str);
        return;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/rb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */