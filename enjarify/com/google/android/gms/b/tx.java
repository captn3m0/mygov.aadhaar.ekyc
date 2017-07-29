package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class tx
{
  protected String a;
  private final Object b;
  private String c;
  private String d;
  private boolean e;
  
  public tx()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
    c = "";
    d = "";
    e = false;
    a = "";
  }
  
  private String a(Context paramContext)
  {
    synchronized (b)
    {
      String str1 = c;
      boolean bool = TextUtils.isEmpty(str1);
      if (bool)
      {
        w.e();
        str1 = "debug_signals_id.txt";
        str1 = tt.b(paramContext, str1);
        c = str1;
        str1 = c;
        bool = TextUtils.isEmpty(str1);
        if (bool)
        {
          w.e();
          str1 = tt.a();
          c = str1;
          w.e();
          str1 = "debug_signals_id.txt";
          String str2 = c;
          tt.c(paramContext, str1, str2);
        }
      }
      str1 = c;
      return str1;
    }
  }
  
  static void a(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = paramContext instanceof Activity;
    Object localObject;
    if (!bool)
    {
      localObject = "Can not create dialog without Activity Context";
      tp.d((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = tt.a;
      tx.1 local1 = new com/google/android/gms/b/tx$1;
      local1.<init>((Context)paramContext, paramString, paramBoolean1, paramBoolean2);
      ((Handler)localObject).post(local1);
    }
  }
  
  /* Error */
  private boolean d(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: getstatic 83	com/google/android/gms/b/ke:di	Lcom/google/android/gms/b/jz;
    //   6: astore 5
    //   8: invokestatic 87	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   11: astore 6
    //   13: aload 6
    //   15: aload 5
    //   17: invokevirtual 92	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   20: checkcast 94	java/lang/String
    //   23: astore 5
    //   25: aload_0
    //   26: aload_1
    //   27: aload 5
    //   29: aload_2
    //   30: aload_3
    //   31: invokevirtual 97	com/google/android/gms/b/tx:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    //   34: invokevirtual 102	android/net/Uri:toString	()Ljava/lang/String;
    //   37: astore 5
    //   39: aload_1
    //   40: aload 5
    //   42: aload_3
    //   43: invokestatic 105	com/google/android/gms/b/tx:e	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   46: astore 5
    //   48: aload 5
    //   50: invokestatic 34	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   53: istore 7
    //   55: iload 7
    //   57: ifeq +17 -> 74
    //   60: ldc 107
    //   62: invokestatic 109	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   65: iconst_0
    //   66: istore 8
    //   68: aconst_null
    //   69: astore 5
    //   71: iload 8
    //   73: ireturn
    //   74: aload 5
    //   76: invokevirtual 112	java/lang/String:trim	()Ljava/lang/String;
    //   79: astore 5
    //   81: new 114	org/json/JSONObject
    //   84: astore 6
    //   86: aload 6
    //   88: aload 5
    //   90: invokespecial 116	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   93: ldc 118
    //   95: astore 5
    //   97: aload 6
    //   99: aload 5
    //   101: invokevirtual 122	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   104: astore 5
    //   106: ldc 124
    //   108: astore 9
    //   110: aload 6
    //   112: aload 9
    //   114: invokevirtual 122	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   117: astore 6
    //   119: aload_0
    //   120: aload 6
    //   122: putfield 28	com/google/android/gms/b/tx:a	Ljava/lang/String;
    //   125: aload_0
    //   126: getfield 18	com/google/android/gms/b/tx:b	Ljava/lang/Object;
    //   129: astore 4
    //   131: aload 4
    //   133: monitorenter
    //   134: aload_0
    //   135: aload 5
    //   137: putfield 24	com/google/android/gms/b/tx:d	Ljava/lang/String;
    //   140: aload 4
    //   142: monitorexit
    //   143: iconst_1
    //   144: istore 8
    //   146: goto -75 -> 71
    //   149: astore 5
    //   151: ldc 127
    //   153: astore 6
    //   155: aload 6
    //   157: aload 5
    //   159: invokestatic 130	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   162: iconst_0
    //   163: istore 8
    //   165: aconst_null
    //   166: astore 5
    //   168: goto -97 -> 71
    //   171: astore 5
    //   173: aload 4
    //   175: monitorexit
    //   176: aload 5
    //   178: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	this	tx
    //   0	179	1	paramContext	Context
    //   0	179	2	paramString1	String
    //   0	179	3	paramString2	String
    //   6	130	5	localObject2	Object
    //   149	9	5	localJSONException	JSONException
    //   166	1	5	localObject3	Object
    //   171	6	5	localObject4	Object
    //   11	145	6	localObject5	Object
    //   53	3	7	bool1	boolean
    //   66	98	8	bool2	boolean
    //   108	5	9	str	String
    // Exception table:
    //   from	to	target	type
    //   81	84	149	org/json/JSONException
    //   88	93	149	org/json/JSONException
    //   99	104	149	org/json/JSONException
    //   112	117	149	org/json/JSONException
    //   120	125	149	org/json/JSONException
    //   135	140	171	finally
    //   140	143	171	finally
    //   173	176	171	finally
  }
  
  private static String e(Context paramContext, String paramString1, String paramString2)
  {
    boolean bool = true;
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    Object localObject2 = w.e().a(paramContext, paramString2);
    ((Map)localObject1).put("User-Agent", localObject2);
    Object localObject3 = new com/google/android/gms/b/ua;
    ((ua)localObject3).<init>(paramContext);
    localObject2 = ua.a(paramString1, (Map)localObject1);
    try
    {
      localObject1 = ke.dl;
      localObject3 = w.q();
      localObject1 = ((kd)localObject3).a((jz)localObject1);
      localObject1 = (Integer)localObject1;
      i = ((Integer)localObject1).intValue();
      long l = i;
      localObject4 = TimeUnit.MILLISECONDS;
      localObject1 = ((us)localObject2).get(l, (TimeUnit)localObject4);
      localObject1 = (String)localObject1;
    }
    catch (TimeoutException localTimeoutException)
    {
      int i;
      localObject4 = "Timeout while retriving a response from: ";
      localObject1 = String.valueOf(paramString1);
      j = ((String)localObject1).length();
      if (j == 0) {
        break label177;
      }
      localObject1 = ((String)localObject4).concat((String)localObject1);
      for (;;)
      {
        tp.b((String)localObject1, localTimeoutException);
        ((us)localObject2).cancel(bool);
        i = 0;
        localObject1 = null;
        break;
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)localObject4);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      Object localObject4 = "Interrupted while retriving a response from: ";
      localObject1 = String.valueOf(paramString1);
      int j = ((String)localObject1).length();
      if (j == 0) {
        break label244;
      }
      localObject1 = ((String)localObject4).concat((String)localObject1);
      for (;;)
      {
        tp.b((String)localObject1, localInterruptedException);
        ((us)localObject2).cancel(bool);
        break;
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)localObject4);
      }
    }
    catch (Exception localException)
    {
      label177:
      label244:
      localObject2 = "Error retriving a response from: ";
      localObject1 = String.valueOf(paramString1);
      int k = ((String)localObject1).length();
      if (k == 0) {
        break label302;
      }
    }
    return (String)localObject1;
    localObject1 = ((String)localObject2).concat((String)localObject1);
    for (;;)
    {
      tp.b((String)localObject1, localException);
      break;
      label302:
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject2);
    }
  }
  
  public final Uri a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Uri.Builder localBuilder = Uri.parse(paramString1).buildUpon();
    String str = a(paramContext);
    localBuilder.appendQueryParameter("linkedDeviceId", str);
    localBuilder.appendQueryParameter("adSlotPath", paramString2);
    localBuilder.appendQueryParameter("afmaVersion", paramString3);
    return localBuilder.build();
  }
  
  public final String a()
  {
    synchronized (b)
    {
      String str = d;
      return str;
    }
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2)
  {
    boolean bool1 = true;
    boolean bool2 = d(paramContext, paramString1, paramString2);
    String str1;
    if (!bool2)
    {
      str1 = "In-app preview failed to load because of a system error. Please try again later.";
      a(paramContext, str1, bool1, bool1);
    }
    for (;;)
    {
      return;
      str1 = "2";
      String str2 = a;
      bool2 = str1.equals(str2);
      if (bool2)
      {
        tp.b("Creative is not pushed for this device.");
        str1 = "There was no creative pushed from DFP to the device.";
        a(paramContext, str1, false, false);
      }
      else
      {
        str1 = "1";
        str2 = a;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          str1 = "The app is not linked for creative preview.";
          tp.b(str1);
          c(paramContext, paramString1, paramString2);
        }
        else
        {
          str1 = "0";
          str2 = a;
          bool2 = str1.equals(str2);
          if (bool2)
          {
            tp.b("Device is linked for in app preview.");
            str1 = "The device is successfully linked for creative preview.";
            a(paramContext, str1, false, bool1);
          }
        }
      }
    }
  }
  
  public final boolean b()
  {
    synchronized (b)
    {
      boolean bool = e;
      return bool;
    }
  }
  
  final boolean b(Context paramContext, String paramString1, String paramString2)
  {
    ??? = null;
    Object localObject2 = ke.dj;
    Object localObject5 = w.q();
    localObject2 = (String)((kd)localObject5).a((jz)localObject2);
    localObject2 = a(paramContext, (String)localObject2, paramString1, paramString2).toString();
    localObject2 = e(paramContext, (String)localObject2, paramString2);
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
    boolean bool2;
    if (bool1)
    {
      tp.b("Not linked for debug signals.");
      bool2 = false;
      localObject2 = null;
    }
    for (;;)
    {
      return bool2;
      localObject2 = ((String)localObject2).trim();
      try
      {
        localObject5 = new org/json/JSONObject;
        ((JSONObject)localObject5).<init>((String)localObject2);
        localObject2 = "debug_mode";
        localObject2 = ((JSONObject)localObject5).optString((String)localObject2);
        bool2 = "1".equals(localObject2);
        synchronized (b)
        {
          e = bool2;
        }
      }
      catch (JSONException localJSONException)
      {
        localObject5 = "Fail to get debug mode response json.";
        tp.c((String)localObject5, localJSONException);
        bool2 = false;
        Object localObject4 = null;
      }
    }
  }
  
  final void c(Context paramContext, String paramString1, String paramString2)
  {
    w.e();
    Object localObject = ke.dh;
    localObject = (String)w.q().a((jz)localObject);
    localObject = a(paramContext, (String)localObject, paramString1, paramString2);
    tt.a(paramContext, (Uri)localObject);
  }
}


/* Location:              com/google/android/gms/b/tx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */