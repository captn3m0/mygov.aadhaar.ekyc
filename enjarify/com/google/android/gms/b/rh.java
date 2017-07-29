package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.c.a.a;
import com.google.android.gms.ads.internal.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class rh
  extends qx.a
{
  private static final Object a;
  private static rh b;
  private final Context c;
  private final rg d;
  private final jw e;
  private final nj f;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  private rh(Context paramContext, jw paramjw, rg paramrg)
  {
    c = paramContext;
    d = paramrg;
    e = paramjw;
    nj localnj = new com/google/android/gms/b/nj;
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {}
    for (localContext = paramContext.getApplicationContext();; localContext = paramContext)
    {
      un localun = un.a();
      String str = a;
      rh.4 local4 = new com/google/android/gms/b/rh$4;
      local4.<init>();
      nj.b localb = new com/google/android/gms/b/nj$b;
      localb.<init>();
      localnj.<init>(localContext, localun, str, local4, localb);
      f = localnj;
      return;
    }
  }
  
  private static qr a(Context paramContext, nj paramnj, rg paramrg, qo paramqo)
  {
    tp.b("Starting ad request from service using: AFMA_getAd");
    ke.a(paramContext);
    Object localObject1 = new com/google/android/gms/b/km;
    Object localObject2 = ke.T;
    localObject2 = (Boolean)w.q().a((jz)localObject2);
    boolean bool1 = ((Boolean)localObject2).booleanValue();
    Object localObject6 = "load_ad";
    Object localObject8 = d.a;
    ((km)localObject1).<init>(bool1, (String)localObject6, (String)localObject8);
    int i = a;
    int k = 10;
    long l2;
    boolean bool4;
    if (i > k)
    {
      long l1 = A;
      l2 = -1;
      bool2 = l1 < l2;
      if (bool2)
      {
        l1 = A;
        localObject2 = ((km)localObject1).a(l1);
        k = 1;
        localObject6 = new String[k];
        bool4 = false;
        localObject8 = null;
        localObject9 = "cts";
        localObject6[0] = localObject9;
        ((km)localObject1).a((kk)localObject2, (String[])localObject6);
      }
    }
    kk localkk = ((km)localObject1).a();
    Object localObject9 = i.a();
    Object localObject10 = h.a();
    localObject2 = c;
    localObject6 = g.packageName;
    Object localObject11 = ((tb)localObject2).a();
    Object localObject12 = j.a(paramqo);
    Future localFuture = w.n().a(paramContext);
    localObject6 = new com/google/android/gms/b/uq;
    boolean bool2 = false;
    ((uq)localObject6).<init>(null);
    localObject2 = c.c;
    if (localObject2 != null)
    {
      localObject8 = "_ad";
      localObject2 = ((Bundle)localObject2).getString((String)localObject8);
      if (localObject2 != null)
      {
        bool2 = true;
        bool4 = H;
        if ((!bool4) || (bool2)) {
          break label2006;
        }
        localObject2 = f;
        localObject6 = f;
        localObject2 = ((no)localObject2).a();
      }
    }
    label652:
    label752:
    label1326:
    Object localObject7;
    label2006:
    for (Object localObject13 = localObject2;; localObject13 = localObject7)
    {
      localObject6 = new com/google/android/gms/b/uq;
      ((uq)localObject6).<init>(null);
      localObject2 = ke.aM;
      localObject8 = w.q();
      localObject2 = (Boolean)((kd)localObject8).a((jz)localObject2);
      bool2 = ((Boolean)localObject2).booleanValue();
      if (bool2) {
        localObject2 = j.a(paramContext);
      }
      Object localObject15;
      for (Object localObject14 = localObject2;; localObject15 = localObject7)
      {
        bool2 = false;
        localObject2 = null;
        k = a;
        int m = 4;
        if (k >= m)
        {
          localObject6 = o;
          if (localObject6 != null) {
            localObject2 = o;
          }
        }
        for (localObject6 = localObject2;; localObject7 = null)
        {
          m = 0;
          localObject8 = null;
          localObject2 = ke.aj;
          Object localObject16 = w.q();
          localObject2 = (Boolean)((kd)localObject16).a((jz)localObject2);
          bool2 = ((Boolean)localObject2).booleanValue();
          if (bool2)
          {
            localObject2 = a;
            if (localObject2 != null)
            {
              if (localObject6 == null)
              {
                localObject2 = ke.ak;
                localObject16 = w.q();
                localObject2 = (Boolean)((kd)localObject16).a((jz)localObject2);
                bool2 = ((Boolean)localObject2).booleanValue();
                if (bool2)
                {
                  localObject2 = "contentInfo is not present, but we'll still launch the app index task";
                  tp.a((String)localObject2);
                  localObject6 = new android/os/Bundle;
                  ((Bundle)localObject6).<init>();
                }
              }
              if (localObject6 != null)
              {
                localObject2 = new com/google/android/gms/b/rh$1;
                ((rh.1)localObject2).<init>(paramrg, paramContext, paramqo, (Bundle)localObject6);
                localObject2 = ts.a((Callable)localObject2);
                localObject16 = localObject6;
                localObject6 = localObject2;
              }
            }
          }
          for (;;)
          {
            w.e();
            localObject2 = paramContext.getPackageName();
            localObject8 = "android.permission.ACCESS_NETWORK_STATE";
            bool2 = tt.a(paramContext, (String)localObject2, (String)localObject8);
            if (bool2)
            {
              localObject2 = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
              if (localObject2 == null)
              {
                localObject2 = "Device is offline.";
                tp.b((String)localObject2);
              }
            }
            int j = a;
            m = 7;
            Object localObject17;
            Object localObject18;
            if (j >= m)
            {
              localObject2 = v;
              localObject17 = localObject2;
              localObject8 = new com/google/android/gms/b/rj;
              localObject2 = f.packageName;
              ((rj)localObject8).<init>((String)localObject17, (String)localObject2);
              localObject2 = c.c;
              if (localObject2 == null) {
                break label752;
              }
              localObject2 = c.c;
              localObject18 = "_ad";
              localObject2 = ((Bundle)localObject2).getString((String)localObject18);
              if (localObject2 == null) {
                break label752;
              }
              localObject2 = ri.a(paramContext, paramqo, (String)localObject2);
            }
            for (;;)
            {
              return (qr)localObject2;
              j = 0;
              localObject2 = null;
              break;
              localObject2 = UUID.randomUUID().toString();
              localObject17 = localObject2;
              break label652;
              localObject2 = d;
              localObject18 = ((jy)localObject2).a(paramqo);
              if (localObject6 != null) {
                localObject2 = "Waiting for app index fetching task.";
              }
              try
              {
                tp.a((String)localObject2);
                localObject2 = ke.al;
                localObject19 = w.q();
                localObject2 = ((kd)localObject19).a((jz)localObject2);
                localObject2 = (Long)localObject2;
                long l3 = ((Long)localObject2).longValue();
                localObject2 = TimeUnit.MILLISECONDS;
                ((Future)localObject6).get(l3, (TimeUnit)localObject2);
                localObject2 = "App index fetching task completed.";
                tp.a((String)localObject2);
                localObject2 = ke.cR;
                localObject2 = (Long)w.q().a((jz)localObject2);
                localObject2 = (Bundle)a((Future)localObject9, (Long)localObject2);
                localObject6 = ke.bB;
                localObject6 = (Long)w.q().a((jz)localObject6);
                localObject6 = (rr.a)a((Future)localObject10, (Long)localObject6);
                localObject9 = ke.cz;
                localObject9 = (Long)w.q().a((jz)localObject9);
                localObject9 = (Location)a((Future)localObject13, (Long)localObject9);
                localObject13 = ke.aN;
                localObject13 = (Long)w.q().a((jz)localObject13);
                localObject13 = (a.a)a((Future)localObject14, (Long)localObject13);
                localObject10 = null;
                try
                {
                  localObject14 = ((Future)localObject12).get();
                  localObject14 = (String)localObject14;
                  localObject12 = localObject14;
                }
                catch (Exception localException2)
                {
                  for (;;)
                  {
                    String str;
                    localObject12 = w.i();
                    localObject19 = "AdRequestServiceImpl.loadAdAsync.qs";
                    ((tj)localObject12).a(localException2, (String)localObject19);
                    tp.c("Error fetching qs signals. Continuing.", localException2);
                    localObject12 = null;
                  }
                }
                localObject10 = null;
              }
              catch (InterruptedException localInterruptedException)
              {
                for (;;)
                {
                  try
                  {
                    localObject14 = ((Future)localObject11).get();
                    localObject14 = (String)localObject14;
                    localObject10 = localObject14;
                  }
                  catch (Exception localException3)
                  {
                    localObject11 = w.i();
                    Object localObject19 = "AdRequestServiceImpl.loadAdAsync.ds";
                    ((tj)localObject11).a(localException3, (String)localObject19);
                    localObject11 = "Error fetching drt signals. Continuing.";
                    tp.c((String)localObject11, localException3);
                    continue;
                  }
                  try
                  {
                    localObject14 = localFuture.get();
                    localObject14 = (rn)localObject14;
                    localObject11 = new com/google/android/gms/b/rf;
                    ((rf)localObject11).<init>();
                    i = paramqo;
                    j = ((rn)localObject14);
                    e = ((rr.a)localObject6);
                    d = ((Location)localObject9);
                    b = ((Bundle)localObject2);
                    g = ((String)localObject12);
                    h = ((a.a)localObject13);
                    if (localObject18 == null)
                    {
                      localObject2 = c;
                      ((List)localObject2).clear();
                    }
                    c = ((List)localObject18);
                    a = ((Bundle)localObject16);
                    f = ((String)localObject10);
                    localObject2 = b.a();
                    k = ((JSONObject)localObject2);
                    localObject2 = ri.a(paramContext, (rf)localObject11);
                    if (localObject2 != null) {
                      break label1326;
                    }
                    localObject2 = new com/google/android/gms/b/qr;
                    k = 0;
                    localObject6 = null;
                    ((qr)localObject2).<init>(0);
                    break;
                  }
                  finally
                  {
                    localObject6 = w.i();
                    localObject8 = "AdRequestServiceImpl.loadAdAsync.di";
                    ((tj)localObject6).a(localThrowable, (String)localObject8);
                    tp.c("Error fetching device info. This is not recoverable.", localThrowable);
                    localObject3 = new com/google/android/gms/b/qr;
                    k = 0;
                    localObject6 = null;
                    ((qr)localObject3).<init>(0);
                  }
                  localInterruptedException = localInterruptedException;
                  localObject6 = "Failed to fetch app index signal";
                  tp.c((String)localObject6, localInterruptedException);
                }
              }
              catch (TimeoutException localTimeoutException)
              {
                for (;;)
                {
                  str = "Timed out waiting for app index fetching task";
                  tp.b(str);
                }
                Object localObject3;
                continue;
                k = a;
                int n = 7;
                if (k < n) {
                  localObject6 = "request_id";
                }
                try
                {
                  ((JSONObject)localObject3).put((String)localObject6, localObject17);
                  localObject13 = ((JSONObject)localObject3).toString();
                  j = 1;
                  localObject3 = new String[j];
                  k = 0;
                  localObject3[0] = "arc";
                  ((km)localObject1).a(localkk, (String[])localObject3);
                  localObject9 = ((km)localObject1).a();
                  localObject15 = tt.a;
                  localObject3 = new com/google/android/gms/b/rh$2;
                  localObject6 = paramnj;
                  ((rh.2)localObject3).<init>(paramnj, (rj)localObject8, (km)localObject1, (kk)localObject9, (String)localObject13);
                  ((Handler)localObject15).post((Runnable)localObject3);
                  try
                  {
                    localObject3 = d;
                    l2 = 10;
                    localObject6 = TimeUnit.SECONDS;
                    localObject17 = ((Future)localObject3).get(l2, (TimeUnit)localObject6);
                    localObject17 = (rm)localObject17;
                    if (localObject17 == null)
                    {
                      localObject3 = new com/google/android/gms/b/qr;
                      k = 0;
                      localObject6 = null;
                      ((qr)localObject3).<init>(0);
                      localObject6 = tt.a;
                      localObject1 = new com/google/android/gms/b/rh$3;
                      ((rh.3)localObject1).<init>(paramrg, paramContext, (rj)localObject8, paramqo);
                      ((Handler)localObject6).post((Runnable)localObject1);
                    }
                  }
                  catch (Exception localException1)
                  {
                    Object localObject4 = new com/google/android/gms/b/qr;
                    k = 0;
                    localObject6 = null;
                    ((qr)localObject4).<init>(0);
                    localObject6 = tt.a;
                    localObject1 = new com/google/android/gms/b/rh$3;
                    ((rh.3)localObject1).<init>(paramrg, paramContext, (rj)localObject8, paramqo);
                    ((Handler)localObject6).post((Runnable)localObject1);
                    continue;
                    j = i;
                    k = -2;
                    if (j != k)
                    {
                      localObject4 = new com/google/android/gms/b/qr;
                      k = i;
                      ((qr)localObject4).<init>(k);
                      localObject6 = tt.a;
                      localObject1 = new com/google/android/gms/b/rh$3;
                      ((rh.3)localObject1).<init>(paramrg, paramContext, (rj)localObject8, paramqo);
                      ((Handler)localObject6).post((Runnable)localObject1);
                    }
                    else
                    {
                      localObject4 = ((km)localObject1).d();
                      if (localObject4 != null)
                      {
                        localObject4 = ((km)localObject1).d();
                        k = 1;
                        localObject6 = new String[k];
                        n = 0;
                        localObject9 = null;
                        localObject13 = "rur";
                        localObject6[0] = localObject13;
                        ((km)localObject1).a((kk)localObject4, (String[])localObject6);
                      }
                      j = 0;
                      localObject4 = null;
                      localObject6 = g;
                      bool3 = TextUtils.isEmpty((CharSequence)localObject6);
                      if (!bool3)
                      {
                        localObject4 = g;
                        localObject4 = ri.a(paramContext, paramqo, (String)localObject4);
                      }
                      if (localObject4 == null)
                      {
                        localObject6 = h;
                        bool3 = TextUtils.isEmpty((CharSequence)localObject6);
                        if (!bool3)
                        {
                          localObject4 = k;
                          localObject15 = a;
                          localObject16 = h;
                          localObject9 = paramqo;
                          localObject13 = paramContext;
                          localObject12 = localObject1;
                          localObject11 = paramrg;
                          localObject4 = a(paramqo, paramContext, (String)localObject15, (String)localObject16, (String)localObject10, (rm)localObject17, (km)localObject1, paramrg);
                        }
                      }
                      if (localObject4 == null)
                      {
                        localObject4 = new com/google/android/gms/b/qr;
                        bool3 = false;
                        localObject6 = null;
                        ((qr)localObject4).<init>(0);
                      }
                      bool3 = true;
                      localObject6 = new String[bool3];
                      n = 0;
                      localObject9 = null;
                      localObject13 = "tts";
                      localObject6[0] = localObject13;
                      ((km)localObject1).a(localkk, (String[])localObject6);
                      localObject6 = ((km)localObject1).b();
                      y = ((String)localObject6);
                      localObject6 = tt.a;
                      localObject1 = new com/google/android/gms/b/rh$3;
                      ((rh.3)localObject1).<init>(paramrg, paramContext, (rj)localObject8, paramqo);
                      ((Handler)localObject6).post((Runnable)localObject1);
                    }
                  }
                  finally
                  {
                    localObject6 = tt.a;
                    localObject1 = new com/google/android/gms/b/rh$3;
                    ((rh.3)localObject1).<init>(paramrg, paramContext, (rj)localObject8, paramqo);
                    ((Handler)localObject6).post((Runnable)localObject1);
                  }
                }
                catch (JSONException localJSONException)
                {
                  for (;;) {}
                }
              }
              catch (ExecutionException localExecutionException)
              {
                for (;;) {}
              }
            }
            localObject16 = localJSONException;
            bool3 = false;
            localObject7 = null;
            continue;
            localObject16 = localObject7;
            bool3 = false;
            localObject7 = null;
          }
          boolean bool3 = false;
        }
      }
    }
  }
  
  /* Error */
  public static qr a(qo paramqo, Context paramContext, String paramString1, String paramString2, String paramString3, rm paramrm, km paramkm, rg paramrg)
  {
    // Byte code:
    //   0: aload 6
    //   2: ifnull +957 -> 959
    //   5: aload 6
    //   7: invokevirtual 130	com/google/android/gms/b/km:a	()Lcom/google/android/gms/b/kk;
    //   10: astore 8
    //   12: aload 8
    //   14: astore 9
    //   16: new 526	com/google/android/gms/b/rk
    //   19: astore 10
    //   21: aload 5
    //   23: astore 11
    //   25: aload 5
    //   27: getfield 528	com/google/android/gms/b/rm:b	Ljava/lang/String;
    //   30: astore 8
    //   32: aload 10
    //   34: astore 11
    //   36: aload 10
    //   38: aload_0
    //   39: aload 8
    //   41: invokespecial 531	com/google/android/gms/b/rk:<init>	(Lcom/google/android/gms/b/qo;Ljava/lang/String;)V
    //   44: ldc_w 533
    //   47: astore 12
    //   49: aload_3
    //   50: invokestatic 537	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   53: astore 8
    //   55: aload 8
    //   57: invokevirtual 541	java/lang/String:length	()I
    //   60: istore 13
    //   62: iload 13
    //   64: ifeq +910 -> 974
    //   67: aload 12
    //   69: aload 8
    //   71: invokevirtual 544	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   74: astore 8
    //   76: aload 8
    //   78: invokestatic 67	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   81: new 546	java/net/URL
    //   84: astore 12
    //   86: aload_3
    //   87: astore 11
    //   89: aload 12
    //   91: aload_3
    //   92: invokespecial 548	java/net/URL:<init>	(Ljava/lang/String;)V
    //   95: iconst_0
    //   96: istore 14
    //   98: aconst_null
    //   99: astore 8
    //   101: invokestatic 551	com/google/android/gms/ads/internal/w:k	()Lcom/google/android/gms/common/util/c;
    //   104: astore 15
    //   106: aload 15
    //   108: invokeinterface 555 1 0
    //   113: lstore 16
    //   115: iconst_0
    //   116: istore 18
    //   118: aconst_null
    //   119: astore 19
    //   121: aload 12
    //   123: astore 20
    //   125: aload 20
    //   127: invokevirtual 559	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   130: astore 8
    //   132: aload 8
    //   134: astore 11
    //   136: aload 8
    //   138: checkcast 561	java/net/HttpURLConnection
    //   141: astore 11
    //   143: aload 11
    //   145: astore 21
    //   147: invokestatic 254	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   150: astore 8
    //   152: aload_1
    //   153: astore 11
    //   155: aload 8
    //   157: aload_1
    //   158: aload_2
    //   159: aload 21
    //   161: invokevirtual 564	com/google/android/gms/b/tt:a	(Landroid/content/Context;Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   164: aload 4
    //   166: invokestatic 498	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   169: istore 14
    //   171: iload 14
    //   173: ifne +37 -> 210
    //   176: aload 5
    //   178: astore 11
    //   180: aload 5
    //   182: getfield 566	com/google/android/gms/b/rm:e	Z
    //   185: istore 14
    //   187: iload 14
    //   189: ifeq +21 -> 210
    //   192: ldc_w 568
    //   195: astore 8
    //   197: aload 21
    //   199: astore 11
    //   201: aload 21
    //   203: aload 8
    //   205: aload 4
    //   207: invokevirtual 571	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   210: aload_0
    //   211: astore 11
    //   213: aload_0
    //   214: getfield 573	com/google/android/gms/b/qo:I	Ljava/lang/String;
    //   217: astore 8
    //   219: aload 8
    //   221: invokestatic 498	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   224: istore 22
    //   226: iload 22
    //   228: ifne +31 -> 259
    //   231: ldc_w 575
    //   234: astore 12
    //   236: aload 12
    //   238: invokestatic 67	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   241: ldc_w 577
    //   244: astore 12
    //   246: aload 21
    //   248: astore 11
    //   250: aload 21
    //   252: aload 12
    //   254: aload 8
    //   256: invokevirtual 571	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   259: aload 5
    //   261: ifnull +111 -> 372
    //   264: aload 5
    //   266: astore 11
    //   268: aload 5
    //   270: getfield 579	com/google/android/gms/b/rm:c	Ljava/lang/String;
    //   273: astore 8
    //   275: aload 8
    //   277: invokestatic 498	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   280: istore 14
    //   282: iload 14
    //   284: ifne +88 -> 372
    //   287: iconst_1
    //   288: istore 14
    //   290: aload 21
    //   292: astore 11
    //   294: aload 21
    //   296: iload 14
    //   298: invokevirtual 583	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   301: aload 5
    //   303: astore 11
    //   305: aload 5
    //   307: getfield 579	com/google/android/gms/b/rm:c	Ljava/lang/String;
    //   310: astore 8
    //   312: aload 8
    //   314: invokevirtual 587	java/lang/String:getBytes	()[B
    //   317: astore 8
    //   319: aload 8
    //   321: arraylength
    //   322: istore 22
    //   324: aload 21
    //   326: astore 11
    //   328: aload 21
    //   330: iload 22
    //   332: invokevirtual 590	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   335: iconst_0
    //   336: istore 13
    //   338: aconst_null
    //   339: astore 15
    //   341: new 592	java/io/BufferedOutputStream
    //   344: astore 12
    //   346: aload 21
    //   348: invokevirtual 596	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   351: astore 23
    //   353: aload 12
    //   355: aload 23
    //   357: invokespecial 599	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   360: aload 12
    //   362: aload 8
    //   364: invokevirtual 603	java/io/BufferedOutputStream:write	([B)V
    //   367: aload 12
    //   369: invokestatic 608	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   372: aload 21
    //   374: invokevirtual 611	java/net/HttpURLConnection:getResponseCode	()I
    //   377: istore 14
    //   379: aload 21
    //   381: invokevirtual 615	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   384: astore 23
    //   386: sipush 200
    //   389: istore 22
    //   391: iload 14
    //   393: iload 22
    //   395: if_icmplt +697 -> 1092
    //   398: sipush 300
    //   401: istore 22
    //   403: iload 14
    //   405: iload 22
    //   407: if_icmpge +685 -> 1092
    //   410: aload 20
    //   412: invokevirtual 618	java/net/URL:toString	()Ljava/lang/String;
    //   415: astore 19
    //   417: iconst_0
    //   418: istore 13
    //   420: aconst_null
    //   421: astore 15
    //   423: new 620	java/io/InputStreamReader
    //   426: astore 12
    //   428: aload 21
    //   430: invokevirtual 624	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   433: astore 20
    //   435: aload 12
    //   437: aload 20
    //   439: invokespecial 627	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   442: invokestatic 254	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   445: pop
    //   446: aload 12
    //   448: invokestatic 630	com/google/android/gms/b/tt:a	(Ljava/io/InputStreamReader;)Ljava/lang/String;
    //   451: astore 15
    //   453: aload 12
    //   455: invokestatic 608	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   458: aload 19
    //   460: aload 23
    //   462: aload 15
    //   464: iload 14
    //   466: invokestatic 633	com/google/android/gms/b/rh:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   469: aload 10
    //   471: astore 11
    //   473: aload 10
    //   475: aload 15
    //   477: putfield 634	com/google/android/gms/b/rk:c	Ljava/lang/String;
    //   480: aload 10
    //   482: aload 23
    //   484: invokevirtual 637	com/google/android/gms/b/rk:a	(Ljava/util/Map;)V
    //   487: aload 6
    //   489: ifnull +44 -> 533
    //   492: iconst_1
    //   493: istore 14
    //   495: iload 14
    //   497: anewarray 122	java/lang/String
    //   500: astore 8
    //   502: iconst_0
    //   503: istore 22
    //   505: aconst_null
    //   506: astore 12
    //   508: ldc_w 639
    //   511: astore 15
    //   513: aload 8
    //   515: iconst_0
    //   516: aload 15
    //   518: aastore
    //   519: aload 6
    //   521: astore 11
    //   523: aload 6
    //   525: aload 9
    //   527: aload 8
    //   529: invokevirtual 127	com/google/android/gms/b/km:a	(Lcom/google/android/gms/b/kk;[Ljava/lang/String;)Z
    //   532: pop
    //   533: new 415	com/google/android/gms/b/qr
    //   536: astore 8
    //   538: aload 10
    //   540: astore 11
    //   542: aload 10
    //   544: getfield 641	com/google/android/gms/b/rk:H	Lcom/google/android/gms/b/qo;
    //   547: astore 9
    //   549: aload 10
    //   551: getfield 642	com/google/android/gms/b/rk:b	Ljava/lang/String;
    //   554: astore 12
    //   556: aload 10
    //   558: getfield 634	com/google/android/gms/b/rk:c	Ljava/lang/String;
    //   561: astore 15
    //   563: aload 10
    //   565: getfield 644	com/google/android/gms/b/rk:d	Ljava/util/List;
    //   568: astore 19
    //   570: aload 10
    //   572: getfield 646	com/google/android/gms/b/rk:h	Ljava/util/List;
    //   575: astore 20
    //   577: aload 10
    //   579: getfield 648	com/google/android/gms/b/rk:i	J
    //   582: lstore 24
    //   584: aload 10
    //   586: getfield 650	com/google/android/gms/b/rk:j	Z
    //   589: istore 26
    //   591: aload 10
    //   593: getfield 652	com/google/android/gms/b/rk:k	Ljava/util/List;
    //   596: astore 27
    //   598: aload 10
    //   600: getfield 655	com/google/android/gms/b/rk:l	J
    //   603: lstore 28
    //   605: aload 10
    //   607: getfield 658	com/google/android/gms/b/rk:m	I
    //   610: istore 30
    //   612: iload 30
    //   614: istore 31
    //   616: aload 10
    //   618: getfield 659	com/google/android/gms/b/rk:a	Ljava/lang/String;
    //   621: astore 32
    //   623: aload 10
    //   625: astore 11
    //   627: aload 10
    //   629: getfield 660	com/google/android/gms/b/rk:f	Ljava/lang/String;
    //   632: astore 33
    //   634: aload 10
    //   636: astore 11
    //   638: aload 10
    //   640: getfield 661	com/google/android/gms/b/rk:g	Ljava/lang/String;
    //   643: astore 34
    //   645: aload 10
    //   647: astore 11
    //   649: aload 10
    //   651: getfield 663	com/google/android/gms/b/rk:n	Z
    //   654: istore 30
    //   656: iload 30
    //   658: istore 35
    //   660: aload 10
    //   662: getfield 665	com/google/android/gms/b/rk:o	Z
    //   665: istore 30
    //   667: iload 30
    //   669: istore 36
    //   671: aload 10
    //   673: getfield 668	com/google/android/gms/b/rk:p	Z
    //   676: istore 30
    //   678: iload 30
    //   680: istore 37
    //   682: aload 10
    //   684: getfield 670	com/google/android/gms/b/rk:q	Z
    //   687: istore 30
    //   689: iload 30
    //   691: istore 38
    //   693: aload 10
    //   695: getfield 673	com/google/android/gms/b/rk:s	Ljava/lang/String;
    //   698: astore 39
    //   700: aload 10
    //   702: astore 11
    //   704: aload 10
    //   706: getfield 676	com/google/android/gms/b/rk:t	Z
    //   709: istore 30
    //   711: iload 30
    //   713: istore 40
    //   715: aload 10
    //   717: getfield 679	com/google/android/gms/b/rk:u	Z
    //   720: istore 30
    //   722: iload 30
    //   724: istore 41
    //   726: aload 10
    //   728: getfield 682	com/google/android/gms/b/rk:v	Lcom/google/android/gms/b/ss;
    //   731: astore 42
    //   733: aload 10
    //   735: astore 11
    //   737: aload 10
    //   739: getfield 685	com/google/android/gms/b/rk:w	Ljava/util/List;
    //   742: astore 43
    //   744: aload 10
    //   746: astore 11
    //   748: aload 10
    //   750: getfield 688	com/google/android/gms/b/rk:x	Ljava/util/List;
    //   753: astore 44
    //   755: aload 10
    //   757: astore 11
    //   759: aload 10
    //   761: getfield 690	com/google/android/gms/b/rk:y	Z
    //   764: istore 30
    //   766: iload 30
    //   768: istore 45
    //   770: aload 10
    //   772: getfield 694	com/google/android/gms/b/rk:z	Lcom/google/android/gms/b/qt;
    //   775: astore 46
    //   777: aload 10
    //   779: astore 11
    //   781: aload 10
    //   783: getfield 696	com/google/android/gms/b/rk:A	Z
    //   786: istore 30
    //   788: iload 30
    //   790: istore 47
    //   792: aload 10
    //   794: getfield 699	com/google/android/gms/b/rk:B	Ljava/lang/String;
    //   797: astore 48
    //   799: aload 10
    //   801: astore 11
    //   803: aload 10
    //   805: getfield 702	com/google/android/gms/b/rk:C	Ljava/util/List;
    //   808: astore 49
    //   810: aload 10
    //   812: astore 11
    //   814: aload 10
    //   816: getfield 705	com/google/android/gms/b/rk:D	Z
    //   819: istore 30
    //   821: iload 30
    //   823: istore 50
    //   825: aload 10
    //   827: getfield 708	com/google/android/gms/b/rk:E	Ljava/lang/String;
    //   830: astore 51
    //   832: aload 10
    //   834: astore 11
    //   836: aload 10
    //   838: getfield 712	com/google/android/gms/b/rk:F	Lcom/google/android/gms/b/sv;
    //   841: astore 52
    //   843: aload 10
    //   845: astore 11
    //   847: aload 10
    //   849: getfield 714	com/google/android/gms/b/rk:e	Ljava/lang/String;
    //   852: astore 53
    //   854: aload 10
    //   856: astore 11
    //   858: aload 10
    //   860: getfield 717	com/google/android/gms/b/rk:r	Z
    //   863: istore 30
    //   865: iload 30
    //   867: istore 54
    //   869: aload 10
    //   871: getfield 720	com/google/android/gms/b/rk:G	Z
    //   874: istore 30
    //   876: aload 8
    //   878: aload 9
    //   880: aload 12
    //   882: aload 15
    //   884: aload 19
    //   886: aload 20
    //   888: lload 24
    //   890: iload 26
    //   892: aload 27
    //   894: lload 28
    //   896: iload 31
    //   898: aload 32
    //   900: lload 16
    //   902: aload 33
    //   904: aload 34
    //   906: iload 35
    //   908: iload 36
    //   910: iload 37
    //   912: iload 38
    //   914: aload 39
    //   916: iload 40
    //   918: iload 41
    //   920: aload 42
    //   922: aload 43
    //   924: aload 44
    //   926: iload 45
    //   928: aload 46
    //   930: iload 47
    //   932: aload 48
    //   934: aload 49
    //   936: iload 50
    //   938: aload 51
    //   940: aload 52
    //   942: aload 53
    //   944: iload 54
    //   946: iload 30
    //   948: invokespecial 723	com/google/android/gms/b/qr:<init>	(Lcom/google/android/gms/b/qo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZLjava/util/List;JILjava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZLcom/google/android/gms/b/ss;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/b/qt;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/google/android/gms/b/sv;Ljava/lang/String;ZZ)V
    //   951: aload 21
    //   953: invokevirtual 726	java/net/HttpURLConnection:disconnect	()V
    //   956: aload 8
    //   958: areturn
    //   959: iconst_0
    //   960: istore 14
    //   962: aconst_null
    //   963: astore 8
    //   965: iconst_0
    //   966: istore 55
    //   968: aconst_null
    //   969: astore 9
    //   971: goto -955 -> 16
    //   974: new 122	java/lang/String
    //   977: astore 8
    //   979: aload 8
    //   981: aload 12
    //   983: invokespecial 727	java/lang/String:<init>	(Ljava/lang/String;)V
    //   986: goto -910 -> 76
    //   989: astore 8
    //   991: ldc_w 729
    //   994: astore 9
    //   996: aload 8
    //   998: invokevirtual 734	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1001: invokestatic 537	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1004: astore 8
    //   1006: aload 8
    //   1008: invokevirtual 541	java/lang/String:length	()I
    //   1011: istore 22
    //   1013: iload 22
    //   1015: ifeq +371 -> 1386
    //   1018: aload 9
    //   1020: aload 8
    //   1022: invokevirtual 544	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1025: astore 8
    //   1027: aload 8
    //   1029: invokestatic 736	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   1032: new 415	com/google/android/gms/b/qr
    //   1035: astore 8
    //   1037: iconst_2
    //   1038: istore 55
    //   1040: aload 8
    //   1042: iload 55
    //   1044: invokespecial 418	com/google/android/gms/b/qr:<init>	(I)V
    //   1047: goto -91 -> 956
    //   1050: astore 8
    //   1052: iconst_0
    //   1053: istore 55
    //   1055: aconst_null
    //   1056: astore 9
    //   1058: aload 9
    //   1060: invokestatic 608	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   1063: aload 8
    //   1065: athrow
    //   1066: astore 8
    //   1068: aload 21
    //   1070: invokevirtual 726	java/net/HttpURLConnection:disconnect	()V
    //   1073: aload 8
    //   1075: athrow
    //   1076: astore 8
    //   1078: iconst_0
    //   1079: istore 55
    //   1081: aconst_null
    //   1082: astore 9
    //   1084: aload 9
    //   1086: invokestatic 608	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   1089: aload 8
    //   1091: athrow
    //   1092: aload 20
    //   1094: invokevirtual 618	java/net/URL:toString	()Ljava/lang/String;
    //   1097: astore 12
    //   1099: iconst_0
    //   1100: istore 13
    //   1102: aconst_null
    //   1103: astore 15
    //   1105: aload 12
    //   1107: aload 23
    //   1109: aconst_null
    //   1110: iload 14
    //   1112: invokestatic 633	com/google/android/gms/b/rh:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   1115: sipush 300
    //   1118: istore 22
    //   1120: iload 14
    //   1122: iload 22
    //   1124: if_icmplt +143 -> 1267
    //   1127: sipush 400
    //   1130: istore 22
    //   1132: iload 14
    //   1134: iload 22
    //   1136: if_icmpge +131 -> 1267
    //   1139: ldc_w 740
    //   1142: astore 8
    //   1144: aload 21
    //   1146: astore 11
    //   1148: aload 21
    //   1150: aload 8
    //   1152: invokevirtual 743	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   1155: astore 8
    //   1157: aload 8
    //   1159: invokestatic 498	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1162: istore 22
    //   1164: iload 22
    //   1166: ifeq +38 -> 1204
    //   1169: ldc_w 745
    //   1172: astore 8
    //   1174: aload 8
    //   1176: invokestatic 736	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   1179: new 415	com/google/android/gms/b/qr
    //   1182: astore 8
    //   1184: iconst_0
    //   1185: istore 55
    //   1187: aconst_null
    //   1188: astore 9
    //   1190: aload 8
    //   1192: iconst_0
    //   1193: invokespecial 418	com/google/android/gms/b/qr:<init>	(I)V
    //   1196: aload 21
    //   1198: invokevirtual 726	java/net/HttpURLConnection:disconnect	()V
    //   1201: goto -245 -> 956
    //   1204: new 546	java/net/URL
    //   1207: astore 12
    //   1209: aload 12
    //   1211: aload 8
    //   1213: invokespecial 548	java/net/URL:<init>	(Ljava/lang/String;)V
    //   1216: iload 18
    //   1218: iconst_1
    //   1219: iadd
    //   1220: istore 14
    //   1222: iconst_5
    //   1223: istore 13
    //   1225: iload 14
    //   1227: iload 13
    //   1229: if_icmple +114 -> 1343
    //   1232: ldc_w 748
    //   1235: astore 8
    //   1237: aload 8
    //   1239: invokestatic 736	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   1242: new 415	com/google/android/gms/b/qr
    //   1245: astore 8
    //   1247: iconst_0
    //   1248: istore 55
    //   1250: aconst_null
    //   1251: astore 9
    //   1253: aload 8
    //   1255: iconst_0
    //   1256: invokespecial 418	com/google/android/gms/b/qr:<init>	(I)V
    //   1259: aload 21
    //   1261: invokevirtual 726	java/net/HttpURLConnection:disconnect	()V
    //   1264: goto -308 -> 956
    //   1267: bipush 46
    //   1269: istore 55
    //   1271: new 751	java/lang/StringBuilder
    //   1274: astore 12
    //   1276: aload 12
    //   1278: iload 55
    //   1280: invokespecial 752	java/lang/StringBuilder:<init>	(I)V
    //   1283: ldc_w 754
    //   1286: astore 9
    //   1288: aload 12
    //   1290: aload 9
    //   1292: invokevirtual 758	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1295: astore 9
    //   1297: aload 9
    //   1299: iload 14
    //   1301: invokevirtual 761	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1304: astore 8
    //   1306: aload 8
    //   1308: invokevirtual 762	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1311: astore 8
    //   1313: aload 8
    //   1315: invokestatic 736	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   1318: new 415	com/google/android/gms/b/qr
    //   1321: astore 8
    //   1323: iconst_0
    //   1324: istore 55
    //   1326: aconst_null
    //   1327: astore 9
    //   1329: aload 8
    //   1331: iconst_0
    //   1332: invokespecial 418	com/google/android/gms/b/qr:<init>	(I)V
    //   1335: aload 21
    //   1337: invokevirtual 726	java/net/HttpURLConnection:disconnect	()V
    //   1340: goto -384 -> 956
    //   1343: aload 10
    //   1345: astore 11
    //   1347: aload 10
    //   1349: aload 23
    //   1351: invokevirtual 637	com/google/android/gms/b/rk:a	(Ljava/util/Map;)V
    //   1354: aload 21
    //   1356: invokevirtual 726	java/net/HttpURLConnection:disconnect	()V
    //   1359: aload 7
    //   1361: ifnull +14 -> 1375
    //   1364: iload 14
    //   1366: istore 18
    //   1368: aload 12
    //   1370: astore 20
    //   1372: goto -1247 -> 125
    //   1375: iload 14
    //   1377: istore 18
    //   1379: aload 12
    //   1381: astore 20
    //   1383: goto -1258 -> 125
    //   1386: new 122	java/lang/String
    //   1389: astore 8
    //   1391: aload 8
    //   1393: aload 9
    //   1395: invokespecial 727	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1398: goto -371 -> 1027
    //   1401: astore 8
    //   1403: aload 12
    //   1405: astore 9
    //   1407: goto -323 -> 1084
    //   1410: astore 8
    //   1412: aload 12
    //   1414: astore 9
    //   1416: goto -358 -> 1058
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1419	0	paramqo	qo
    //   0	1419	1	paramContext	Context
    //   0	1419	2	paramString1	String
    //   0	1419	3	paramString2	String
    //   0	1419	4	paramString3	String
    //   0	1419	5	paramrm	rm
    //   0	1419	6	paramkm	km
    //   0	1419	7	paramrg	rg
    //   10	970	8	localObject1	Object
    //   989	8	8	localIOException	java.io.IOException
    //   1004	37	8	localObject2	Object
    //   1050	14	8	localObject3	Object
    //   1066	8	8	localObject4	Object
    //   1076	14	8	localObject5	Object
    //   1142	250	8	localObject6	Object
    //   1401	1	8	localObject7	Object
    //   1410	1	8	localObject8	Object
    //   14	1401	9	localObject9	Object
    //   19	1329	10	localrk	rk
    //   23	1323	11	localObject10	Object
    //   47	1366	12	localObject11	Object
    //   60	1170	13	i	int
    //   96	201	14	bool1	boolean
    //   377	999	14	j	int
    //   104	1000	15	localObject12	Object
    //   113	788	16	l1	long
    //   116	1262	18	k	int
    //   119	766	19	localObject13	Object
    //   123	1259	20	localObject14	Object
    //   145	1210	21	localObject15	Object
    //   224	3	22	bool2	boolean
    //   322	815	22	m	int
    //   1162	3	22	bool3	boolean
    //   351	999	23	localObject16	Object
    //   582	307	24	l2	long
    //   589	302	26	bool4	boolean
    //   596	297	27	localList1	List
    //   603	292	28	l3	long
    //   610	3	30	n	int
    //   654	293	30	bool5	boolean
    //   614	283	31	i1	int
    //   621	278	32	str1	String
    //   632	271	33	str2	String
    //   643	262	34	str3	String
    //   658	249	35	bool6	boolean
    //   669	240	36	bool7	boolean
    //   680	231	37	bool8	boolean
    //   691	222	38	bool9	boolean
    //   698	217	39	str4	String
    //   713	204	40	bool10	boolean
    //   724	195	41	bool11	boolean
    //   731	190	42	localss	ss
    //   742	181	43	localList2	List
    //   753	172	44	localList3	List
    //   768	159	45	bool12	boolean
    //   775	154	46	localqt	qt
    //   790	141	47	bool13	boolean
    //   797	136	48	str5	String
    //   808	127	49	localList4	List
    //   823	114	50	bool14	boolean
    //   830	109	51	str6	String
    //   841	100	52	localsv	sv
    //   852	91	53	str7	String
    //   867	78	54	bool15	boolean
    //   966	359	55	i2	int
    // Exception table:
    //   from	to	target	type
    //   16	19	989	java/io/IOException
    //   25	30	989	java/io/IOException
    //   39	44	989	java/io/IOException
    //   49	53	989	java/io/IOException
    //   55	60	989	java/io/IOException
    //   69	74	989	java/io/IOException
    //   76	81	989	java/io/IOException
    //   81	84	989	java/io/IOException
    //   91	95	989	java/io/IOException
    //   101	104	989	java/io/IOException
    //   106	113	989	java/io/IOException
    //   125	130	989	java/io/IOException
    //   136	141	989	java/io/IOException
    //   951	956	989	java/io/IOException
    //   974	977	989	java/io/IOException
    //   981	986	989	java/io/IOException
    //   1068	1073	989	java/io/IOException
    //   1073	1076	989	java/io/IOException
    //   1196	1201	989	java/io/IOException
    //   1259	1264	989	java/io/IOException
    //   1335	1340	989	java/io/IOException
    //   1354	1359	989	java/io/IOException
    //   341	344	1050	finally
    //   346	351	1050	finally
    //   355	360	1050	finally
    //   147	150	1066	finally
    //   159	164	1066	finally
    //   164	169	1066	finally
    //   180	185	1066	finally
    //   205	210	1066	finally
    //   213	217	1066	finally
    //   219	224	1066	finally
    //   236	241	1066	finally
    //   254	259	1066	finally
    //   268	273	1066	finally
    //   275	280	1066	finally
    //   296	301	1066	finally
    //   305	310	1066	finally
    //   312	317	1066	finally
    //   319	322	1066	finally
    //   330	335	1066	finally
    //   367	372	1066	finally
    //   372	377	1066	finally
    //   379	384	1066	finally
    //   410	415	1066	finally
    //   453	458	1066	finally
    //   464	469	1066	finally
    //   475	480	1066	finally
    //   482	487	1066	finally
    //   495	500	1066	finally
    //   516	519	1066	finally
    //   527	533	1066	finally
    //   533	536	1066	finally
    //   542	547	1066	finally
    //   549	554	1066	finally
    //   556	561	1066	finally
    //   563	568	1066	finally
    //   570	575	1066	finally
    //   577	582	1066	finally
    //   584	589	1066	finally
    //   591	596	1066	finally
    //   598	603	1066	finally
    //   605	610	1066	finally
    //   616	621	1066	finally
    //   627	632	1066	finally
    //   638	643	1066	finally
    //   649	654	1066	finally
    //   660	665	1066	finally
    //   671	676	1066	finally
    //   682	687	1066	finally
    //   693	698	1066	finally
    //   704	709	1066	finally
    //   715	720	1066	finally
    //   726	731	1066	finally
    //   737	742	1066	finally
    //   748	753	1066	finally
    //   759	764	1066	finally
    //   770	775	1066	finally
    //   781	786	1066	finally
    //   792	797	1066	finally
    //   803	808	1066	finally
    //   814	819	1066	finally
    //   825	830	1066	finally
    //   836	841	1066	finally
    //   847	852	1066	finally
    //   858	863	1066	finally
    //   869	874	1066	finally
    //   946	951	1066	finally
    //   1058	1063	1066	finally
    //   1063	1066	1066	finally
    //   1084	1089	1066	finally
    //   1089	1092	1066	finally
    //   1092	1097	1066	finally
    //   1110	1115	1066	finally
    //   1150	1155	1066	finally
    //   1157	1162	1066	finally
    //   1174	1179	1066	finally
    //   1179	1182	1066	finally
    //   1192	1196	1066	finally
    //   1204	1207	1066	finally
    //   1211	1216	1066	finally
    //   1237	1242	1066	finally
    //   1242	1245	1066	finally
    //   1255	1259	1066	finally
    //   1271	1274	1066	finally
    //   1278	1283	1066	finally
    //   1290	1295	1066	finally
    //   1299	1304	1066	finally
    //   1306	1311	1066	finally
    //   1313	1318	1066	finally
    //   1318	1321	1066	finally
    //   1331	1335	1066	finally
    //   1349	1354	1066	finally
    //   423	426	1076	finally
    //   428	433	1076	finally
    //   437	442	1076	finally
    //   442	446	1401	finally
    //   446	451	1401	finally
    //   362	367	1410	finally
  }
  
  public static rh a(Context paramContext, jw paramjw, rg paramrg)
  {
    synchronized (a)
    {
      rh localrh = b;
      if (localrh == null)
      {
        localrh = new com/google/android/gms/b/rh;
        Context localContext = paramContext.getApplicationContext();
        if (localContext != null) {
          paramContext = paramContext.getApplicationContext();
        }
        localrh.<init>(paramContext, paramjw, paramrg);
        b = localrh;
      }
      localrh = b;
      return localrh;
    }
  }
  
  private static Object a(Future paramFuture, Long paramLong)
  {
    try
    {
      long l = paramLong.longValue();
      localObject1 = TimeUnit.MILLISECONDS;
      localObject1 = paramFuture.get(l, (TimeUnit)localObject1);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Object localObject1;
        str = "InterruptedException caught while resolving future.";
        tp.c(str, localInterruptedException);
        Thread.currentThread().interrupt();
        Object localObject2 = null;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        String str = "Exception caught while resolving future";
        tp.c(str, localRuntimeException);
        Object localObject3 = null;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;) {}
    }
    return localObject1;
  }
  
  private static void a(String paramString1, Map paramMap, String paramString2, int paramInt)
  {
    boolean bool = tp.a(2);
    if (bool)
    {
      int i = String.valueOf(paramString1).length() + 39;
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(i);
      Object localObject2 = ((StringBuilder)localObject1).append("Http Response: {\n  URL:\n    ").append(paramString1);
      localObject1 = "\n  Headers:";
      localObject2 = (String)localObject1;
      tp.a((String)localObject2);
      int j;
      int m;
      if (paramMap != null)
      {
        localObject2 = paramMap.keySet();
        localObject1 = ((Set)localObject2).iterator();
        Object localObject4;
        do
        {
          j = ((Iterator)localObject1).hasNext();
          if (j == 0) {
            break;
          }
          localObject2 = (String)((Iterator)localObject1).next();
          m = String.valueOf(localObject2).length() + 5;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>(m);
          localObject4 = ((StringBuilder)localObject3).append("    ").append((String)localObject2);
          localObject3 = ":";
          tp.a((String)localObject3);
          localObject2 = (List)paramMap.get(localObject2);
          localObject4 = ((List)localObject2).iterator();
          j = ((Iterator)localObject4).hasNext();
        } while (j == 0);
        localObject2 = (String)((Iterator)localObject4).next();
        Object localObject3 = "      ";
        localObject2 = String.valueOf(localObject2);
        int n = ((String)localObject2).length();
        if (n != 0) {
          localObject2 = ((String)localObject3).concat((String)localObject2);
        }
        for (;;)
        {
          tp.a((String)localObject2);
          break;
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>((String)localObject3);
        }
      }
      localObject2 = "  Body:";
      tp.a((String)localObject2);
      if (paramString2 != null)
      {
        j = 0;
        localObject2 = null;
        for (;;)
        {
          int i1 = paramString2.length();
          m = 100000;
          i1 = Math.min(i1, m);
          if (j >= i1) {
            break;
          }
          int i2 = paramString2.length();
          m = j + 1000;
          i2 = Math.min(i2, m);
          localObject1 = paramString2.substring(j, i2);
          tp.a((String)localObject1);
          j += 1000;
        }
      }
      localObject2 = "    null";
      tp.a((String)localObject2);
      int k = 34;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(k);
      localObject2 = ((StringBuilder)localObject1).append("  Response Code:\n    ").append(paramInt);
      localObject1 = "\n}";
      localObject2 = (String)localObject1;
      tp.a((String)localObject2);
    }
  }
  
  public final qr a(qo paramqo)
  {
    Context localContext = c;
    nj localnj = f;
    rg localrg = d;
    return a(localContext, localnj, localrg, paramqo);
  }
  
  public final void a(qo paramqo, qy paramqy)
  {
    Object localObject = w.i();
    Context localContext = c;
    un localun = k;
    ((tj)localObject).a(localContext, localun);
    localObject = new com/google/android/gms/b/rh$5;
    ((rh.5)localObject).<init>(this, paramqo, paramqy);
    ts.a((Runnable)localObject);
  }
}


/* Location:              com/google/android/gms/b/rh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */