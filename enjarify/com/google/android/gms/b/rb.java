package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

public final class rb
  extends to
{
  static final long a = TimeUnit.SECONDS.toMillis(10);
  static boolean b = false;
  private static final Object c;
  private static nj d = null;
  private static me e = null;
  private static mi f = null;
  private static md g = null;
  private final qj.a h;
  private final qo.a i;
  private final Object j;
  private final Context l;
  private nj.c m;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
  }
  
  public rb(Context paramContext, qo.a parama, qj.a parama1)
  {
    super((byte)0);
    Object localObject1 = new java/lang/Object;
    localObject1.<init>();
    j = localObject1;
    h = parama1;
    l = paramContext;
    i = parama;
    synchronized (c)
    {
      bool = b;
      if (!bool)
      {
        localObject1 = new com/google/android/gms/b/mi;
        ((mi)localObject1).<init>();
        f = (mi)localObject1;
        localObject1 = new com/google/android/gms/b/me;
        Context localContext = paramContext.getApplicationContext();
        Object localObject4 = j;
        ((me)localObject1).<init>(localContext, (un)localObject4);
        e = (me)localObject1;
        localObject1 = new com/google/android/gms/b/rb$c;
        ((rb.c)localObject1).<init>();
        g = (md)localObject1;
        localObject1 = new com/google/android/gms/b/nj;
        localContext = l;
        localContext = localContext.getApplicationContext();
        localObject4 = i;
        localObject4 = j;
        Object localObject5 = ke.b;
        Object localObject6 = w.q();
        localObject5 = ((kd)localObject6).a((jz)localObject5);
        localObject5 = (String)localObject5;
        localObject6 = new com/google/android/gms/b/rb$b;
        ((rb.b)localObject6).<init>();
        rb.a locala = new com/google/android/gms/b/rb$a;
        locala.<init>();
        ((nj)localObject1).<init>(localContext, (un)localObject4, (String)localObject5, (ty)localObject6, locala);
        d = (nj)localObject1;
        bool = true;
        b = bool;
      }
      return;
    }
  }
  
  private qr a(qo paramqo)
  {
    int k = -1;
    w.e();
    Object localObject1 = tt.a();
    Object localObject3 = a(paramqo, (String)localObject1);
    if (localObject3 == null)
    {
      localObject1 = new com/google/android/gms/b/qr;
      ((qr)localObject1).<init>(0);
    }
    for (;;)
    {
      return (qr)localObject1;
      Object localObject4 = w.k();
      long l1 = ((c)localObject4).b();
      Object localObject5 = f;
      up localup = new com/google/android/gms/b/up;
      localup.<init>();
      a.put(localObject1, localup);
      localObject5 = uk.a;
      rb.2 local2 = new com/google/android/gms/b/rb$2;
      local2.<init>(this, (JSONObject)localObject3, (String)localObject1);
      ((Handler)localObject5).post(local2);
      long l2 = a;
      localObject5 = w.k();
      long l3 = ((c)localObject5).b();
      l1 = l3 - l1;
      l2 -= l1;
      try
      {
        localObject4 = TimeUnit.MILLISECONDS;
        localObject1 = localup.get(l2, (TimeUnit)localObject4);
        localObject1 = (JSONObject)localObject1;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/b/qr;
          ((qr)localObject1).<init>(k);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        qr localqr1 = new com/google/android/gms/b/qr;
        localqr1.<init>(k);
      }
      catch (TimeoutException localTimeoutException)
      {
        qr localqr2 = new com/google/android/gms/b/qr;
        n = 2;
        localqr2.<init>(n);
      }
      catch (ExecutionException localExecutionException)
      {
        Object localObject2 = new com/google/android/gms/b/qr;
        ((qr)localObject2).<init>(0);
        continue;
        localObject3 = l;
        localObject2 = ((JSONObject)localObject2).toString();
        localObject2 = ri.a((Context)localObject3, paramqo, (String)localObject2);
        int n = e;
        int i2 = -3;
        if (n == i2) {
          continue;
        }
        localObject3 = c;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject3);
        if (!bool) {
          continue;
        }
        localObject2 = new com/google/android/gms/b/qr;
        int i1 = 3;
        ((qr)localObject2).<init>(i1);
      }
      catch (CancellationException localCancellationException)
      {
        for (;;) {}
      }
    }
  }
  
  /* Error */
  private JSONObject a(qo paramqo, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: getfield 223	com/google/android/gms/b/qo:c	Lcom/google/android/gms/b/ih;
    //   6: getfield 228	com/google/android/gms/b/ih:c	Landroid/os/Bundle;
    //   9: astore 4
    //   11: aload 4
    //   13: ldc -26
    //   15: invokevirtual 236	android/os/Bundle:getBundle	(Ljava/lang/String;)Landroid/os/Bundle;
    //   18: astore 5
    //   20: aload 5
    //   22: ifnonnull +5 -> 27
    //   25: aload_3
    //   26: areturn
    //   27: invokestatic 240	com/google/android/gms/ads/internal/w:n	()Lcom/google/android/gms/b/ro;
    //   30: astore 4
    //   32: aload_0
    //   33: getfield 68	com/google/android/gms/b/rb:l	Landroid/content/Context;
    //   36: astore 6
    //   38: aload 4
    //   40: aload 6
    //   42: invokevirtual 245	com/google/android/gms/b/ro:a	(Landroid/content/Context;)Ljava/util/concurrent/Future;
    //   45: astore 4
    //   47: aload 4
    //   49: invokeinterface 248 1 0
    //   54: astore 4
    //   56: aload 4
    //   58: checkcast 250	com/google/android/gms/b/rn
    //   61: astore 4
    //   63: aload_0
    //   64: getfield 68	com/google/android/gms/b/rb:l	Landroid/content/Context;
    //   67: astore 6
    //   69: new 252	com/google/android/gms/b/rf
    //   72: astore 7
    //   74: aload 7
    //   76: invokespecial 253	com/google/android/gms/b/rf:<init>	()V
    //   79: aload 7
    //   81: aload_1
    //   82: putfield 256	com/google/android/gms/b/rf:i	Lcom/google/android/gms/b/qo;
    //   85: aload 7
    //   87: aload 4
    //   89: putfield 259	com/google/android/gms/b/rf:j	Lcom/google/android/gms/b/rn;
    //   92: aload 6
    //   94: aload 7
    //   96: invokestatic 262	com/google/android/gms/b/ri:a	(Landroid/content/Context;Lcom/google/android/gms/b/rf;)Lorg/json/JSONObject;
    //   99: astore 6
    //   101: aload 6
    //   103: ifnull -78 -> 25
    //   106: aload_0
    //   107: getfield 68	com/google/android/gms/b/rb:l	Landroid/content/Context;
    //   110: astore 4
    //   112: aload 4
    //   114: invokestatic 267	com/google/android/gms/ads/c/a:a	(Landroid/content/Context;)Lcom/google/android/gms/ads/c/a$a;
    //   117: astore 4
    //   119: new 157	java/util/HashMap
    //   122: astore 7
    //   124: aload 7
    //   126: invokespecial 268	java/util/HashMap:<init>	()V
    //   129: aload 7
    //   131: ldc_w 270
    //   134: aload_2
    //   135: invokevirtual 161	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   138: pop
    //   139: ldc_w 272
    //   142: astore 8
    //   144: aload 7
    //   146: aload 8
    //   148: aload 6
    //   150: invokevirtual 161	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   153: pop
    //   154: ldc_w 274
    //   157: astore 6
    //   159: aload 7
    //   161: aload 6
    //   163: aload 5
    //   165: invokevirtual 161	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   168: pop
    //   169: aload 4
    //   171: ifnull +58 -> 229
    //   174: aload 4
    //   176: getfield 280	com/google/android/gms/ads/c/a$a:a	Ljava/lang/String;
    //   179: astore 6
    //   181: aload 7
    //   183: ldc_w 276
    //   186: aload 6
    //   188: invokevirtual 161	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   191: pop
    //   192: ldc_w 282
    //   195: astore 5
    //   197: aload 4
    //   199: getfield 283	com/google/android/gms/ads/c/a$a:b	Z
    //   202: istore 9
    //   204: iload 9
    //   206: ifeq +85 -> 291
    //   209: iconst_1
    //   210: istore 9
    //   212: iload 9
    //   214: invokestatic 289	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   217: astore 4
    //   219: aload 7
    //   221: aload 5
    //   223: aload 4
    //   225: invokevirtual 161	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   228: pop
    //   229: invokestatic 127	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   232: astore 4
    //   234: aload 4
    //   236: aload 7
    //   238: invokevirtual 292	com/google/android/gms/b/tt:a	(Ljava/util/Map;)Lorg/json/JSONObject;
    //   241: astore_3
    //   242: goto -217 -> 25
    //   245: astore 4
    //   247: ldc_w 294
    //   250: astore 6
    //   252: aload 6
    //   254: aload 4
    //   256: invokestatic 299	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   259: iconst_0
    //   260: istore 9
    //   262: aconst_null
    //   263: astore 4
    //   265: goto -202 -> 63
    //   268: astore 4
    //   270: ldc_w 301
    //   273: astore 7
    //   275: aload 7
    //   277: aload 4
    //   279: invokestatic 299	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   282: iconst_0
    //   283: istore 9
    //   285: aconst_null
    //   286: astore 4
    //   288: goto -169 -> 119
    //   291: iconst_0
    //   292: istore 9
    //   294: aconst_null
    //   295: astore 4
    //   297: goto -85 -> 212
    //   300: astore 4
    //   302: goto -277 -> 25
    //   305: astore 4
    //   307: goto -37 -> 270
    //   310: astore 4
    //   312: goto -42 -> 270
    //   315: astore 4
    //   317: goto -47 -> 270
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	320	0	this	rb
    //   0	320	1	paramqo	qo
    //   0	320	2	paramString	String
    //   1	241	3	localJSONObject	JSONObject
    //   9	226	4	localObject1	Object
    //   245	10	4	localException	Exception
    //   263	1	4	localObject2	Object
    //   268	10	4	locald	com.google.android.gms.common.d
    //   286	10	4	localObject3	Object
    //   300	1	4	localJSONException	org.json.JSONException
    //   305	1	4	localIllegalStateException	IllegalStateException
    //   310	1	4	locale	com.google.android.gms.common.e
    //   315	1	4	localIOException	java.io.IOException
    //   18	204	5	localObject4	Object
    //   36	217	6	localObject5	Object
    //   72	204	7	localObject6	Object
    //   142	5	8	str	String
    //   202	11	9	k	int
    //   260	33	9	n	int
    // Exception table:
    //   from	to	target	type
    //   27	30	245	java/lang/Exception
    //   32	36	245	java/lang/Exception
    //   40	45	245	java/lang/Exception
    //   47	54	245	java/lang/Exception
    //   56	61	245	java/lang/Exception
    //   106	110	268	com/google/android/gms/common/d
    //   112	117	268	com/google/android/gms/common/d
    //   229	232	300	org/json/JSONException
    //   236	241	300	org/json/JSONException
    //   106	110	305	java/lang/IllegalStateException
    //   112	117	305	java/lang/IllegalStateException
    //   106	110	310	com/google/android/gms/common/e
    //   112	117	310	com/google/android/gms/common/e
    //   106	110	315	java/io/IOException
    //   112	117	315	java/io/IOException
  }
  
  protected static void a(ng paramng)
  {
    Object localObject = f;
    paramng.a("/loadAd", (md)localObject);
    localObject = e;
    paramng.a("/fetchHttpRequest", (md)localObject);
    localObject = g;
    paramng.a("/invalidRequest", (md)localObject);
  }
  
  protected static void b(ng paramng)
  {
    Object localObject = f;
    paramng.b("/loadAd", (md)localObject);
    localObject = e;
    paramng.b("/fetchHttpRequest", (md)localObject);
    localObject = g;
    paramng.b("/invalidRequest", (md)localObject);
  }
  
  public final void a()
  {
    tp.b("SdkLessAdLoaderBackgroundTask started.");
    Object localObject1 = w.D();
    Object localObject2 = l;
    String str = ((ta)localObject1).d((Context)localObject2);
    localObject1 = new com/google/android/gms/b/qo;
    localObject2 = i;
    Object localObject3 = w.D();
    Object localObject4 = l;
    localObject3 = ((ta)localObject3).b((Context)localObject4);
    localObject4 = w.D();
    Context localContext = l;
    localObject4 = ((ta)localObject4).c(localContext);
    ((qo)localObject1).<init>((qo.a)localObject2, -1, (String)localObject3, (String)localObject4, str);
    localObject2 = w.D();
    Object localObject5 = l;
    ((ta)localObject2).c((Context)localObject5, str);
    localObject3 = a((qo)localObject1);
    long l1 = w.k().b();
    localObject5 = new com/google/android/gms/b/tg$a;
    int k = e;
    long l2 = n;
    ((tg.a)localObject5).<init>((qo)localObject1, (qr)localObject3, null, null, k, l1, l2, null);
    localObject1 = uk.a;
    localObject2 = new com/google/android/gms/b/rb$1;
    ((rb.1)localObject2).<init>(this, (tg.a)localObject5);
    ((Handler)localObject1).post((Runnable)localObject2);
  }
  
  public final void c_()
  {
    synchronized (j)
    {
      Handler localHandler = uk.a;
      rb.3 local3 = new com/google/android/gms/b/rb$3;
      local3.<init>(this);
      localHandler.post(local3);
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/rb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */