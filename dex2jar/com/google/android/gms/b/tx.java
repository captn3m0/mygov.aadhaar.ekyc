package com.google.android.gms.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
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

@qi
public final class tx
{
  protected String a = "";
  private final Object b = new Object();
  private String c = "";
  private String d = "";
  private boolean e = false;
  
  private String a(Context paramContext)
  {
    synchronized (b)
    {
      if (TextUtils.isEmpty(c))
      {
        w.e();
        c = tt.b(paramContext, "debug_signals_id.txt");
        if (TextUtils.isEmpty(c))
        {
          w.e();
          c = tt.a();
          w.e();
          tt.c(paramContext, "debug_signals_id.txt", c);
        }
      }
      paramContext = c;
      return paramContext;
    }
  }
  
  static void a(Context paramContext, final String paramString, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    if (!(paramContext instanceof Activity))
    {
      tp.d("Can not create dialog without Activity Context");
      return;
    }
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(tx.this);
        localBuilder.setMessage(paramString);
        if (paramBoolean1)
        {
          localBuilder.setTitle("Error");
          if (!paramBoolean2) {
            break label68;
          }
          localBuilder.setNeutralButton("Dismiss", null);
        }
        for (;;)
        {
          localBuilder.create().show();
          return;
          localBuilder.setTitle("Info");
          break;
          label68:
          localBuilder.setPositiveButton("Learn More", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              w.e();
              tt.a(tx.this, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
            }
          });
          localBuilder.setNegativeButton("Dismiss", null);
        }
      }
    });
  }
  
  /* Error */
  private boolean d(Context paramContext, String arg2, String paramString2)
  {
    // Byte code:
    //   0: getstatic 89	com/google/android/gms/b/ke:di	Lcom/google/android/gms/b/jz;
    //   3: astore 4
    //   5: aload_1
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 93	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   11: aload 4
    //   13: invokevirtual 98	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   16: checkcast 100	java/lang/String
    //   19: aload_2
    //   20: aload_3
    //   21: invokevirtual 103	com/google/android/gms/b/tx:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    //   24: invokevirtual 108	android/net/Uri:toString	()Ljava/lang/String;
    //   27: aload_3
    //   28: invokestatic 111	com/google/android/gms/b/tx:e	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   31: astore_1
    //   32: aload_1
    //   33: invokestatic 41	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   36: ifeq +10 -> 46
    //   39: ldc 113
    //   41: invokestatic 115	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   44: iconst_0
    //   45: ireturn
    //   46: aload_1
    //   47: invokevirtual 118	java/lang/String:trim	()Ljava/lang/String;
    //   50: astore_1
    //   51: new 120	org/json/JSONObject
    //   54: dup
    //   55: aload_1
    //   56: invokespecial 122	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   59: astore_2
    //   60: aload_2
    //   61: ldc 124
    //   63: invokevirtual 128	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   66: astore_1
    //   67: aload_0
    //   68: aload_2
    //   69: ldc -126
    //   71: invokevirtual 128	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   74: putfield 33	com/google/android/gms/b/tx:a	Ljava/lang/String;
    //   77: aload_0
    //   78: getfield 23	com/google/android/gms/b/tx:b	Ljava/lang/Object;
    //   81: astore_2
    //   82: aload_2
    //   83: monitorenter
    //   84: aload_0
    //   85: aload_1
    //   86: putfield 29	com/google/android/gms/b/tx:d	Ljava/lang/String;
    //   89: aload_2
    //   90: monitorexit
    //   91: iconst_1
    //   92: ireturn
    //   93: astore_1
    //   94: ldc -124
    //   96: aload_1
    //   97: invokestatic 135	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   100: iconst_0
    //   101: ireturn
    //   102: astore_1
    //   103: aload_2
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	tx
    //   0	107	1	paramContext	Context
    //   0	107	3	paramString2	String
    //   3	9	4	localjz	jz
    // Exception table:
    //   from	to	target	type
    //   51	77	93	org/json/JSONException
    //   84	91	102	finally
    //   103	105	102	finally
  }
  
  private static String e(Context paramContext, String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("User-Agent", w.e().a(paramContext, paramString2));
    new ua(paramContext);
    paramString2 = ua.a(paramString1, localHashMap);
    try
    {
      paramContext = ke.dl;
      paramContext = (String)paramString2.get(((Integer)w.q().a(paramContext)).intValue(), TimeUnit.MILLISECONDS);
      return paramContext;
    }
    catch (TimeoutException localTimeoutException)
    {
      paramContext = String.valueOf(paramString1);
      if (paramContext.length() != 0) {}
      for (paramContext = "Timeout while retriving a response from: ".concat(paramContext);; paramContext = new String("Timeout while retriving a response from: "))
      {
        tp.b(paramContext, localTimeoutException);
        paramString2.cancel(true);
        return null;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      paramContext = String.valueOf(paramString1);
      if (paramContext.length() != 0) {}
      for (paramContext = "Interrupted while retriving a response from: ".concat(paramContext);; paramContext = new String("Interrupted while retriving a response from: "))
      {
        tp.b(paramContext, localInterruptedException);
        paramString2.cancel(true);
        break;
      }
    }
    catch (Exception paramString2)
    {
      paramContext = String.valueOf(paramString1);
      if (paramContext.length() == 0) {}
    }
    for (paramContext = "Error retriving a response from: ".concat(paramContext);; paramContext = new String("Error retriving a response from: "))
    {
      tp.b(paramContext, paramString2);
      break;
    }
  }
  
  public final Uri a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = Uri.parse(paramString1).buildUpon();
    paramString1.appendQueryParameter("linkedDeviceId", a(paramContext));
    paramString1.appendQueryParameter("adSlotPath", paramString2);
    paramString1.appendQueryParameter("afmaVersion", paramString3);
    return paramString1.build();
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
    if (!d(paramContext, paramString1, paramString2)) {
      a(paramContext, "In-app preview failed to load because of a system error. Please try again later.", true, true);
    }
    do
    {
      return;
      if ("2".equals(a))
      {
        tp.b("Creative is not pushed for this device.");
        a(paramContext, "There was no creative pushed from DFP to the device.", false, false);
        return;
      }
      if ("1".equals(a))
      {
        tp.b("The app is not linked for creative preview.");
        c(paramContext, paramString1, paramString2);
        return;
      }
    } while (!"0".equals(a));
    tp.b("Device is linked for in app preview.");
    a(paramContext, "The device is successfully linked for creative preview.", false, true);
  }
  
  public final boolean b()
  {
    synchronized (b)
    {
      boolean bool = e;
      return bool;
    }
  }
  
  final boolean b(Context arg1, String paramString1, String paramString2)
  {
    jz localjz = ke.dj;
    ??? = e(???, a(???, (String)w.q().a(localjz), paramString1, paramString2).toString(), paramString2);
    if (TextUtils.isEmpty(???))
    {
      tp.b("Not linked for debug signals.");
      return false;
    }
    ??? = ???.trim();
    try
    {
      ??? = new JSONObject(???).optString("debug_mode");
      boolean bool = "1".equals(???);
      synchronized (b)
      {
        e = bool;
        return bool;
      }
      return false;
    }
    catch (JSONException ???)
    {
      tp.c("Fail to get debug mode response json.", ???);
    }
  }
  
  final void c(Context paramContext, String paramString1, String paramString2)
  {
    w.e();
    jz localjz = ke.dh;
    tt.a(paramContext, a(paramContext, (String)w.q().a(localjz), paramString1, paramString2));
  }
}


/* Location:              com/google/android/gms/b/tx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */