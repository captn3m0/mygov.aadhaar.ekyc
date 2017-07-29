package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.md;
import com.google.android.gms.b.nj;
import com.google.android.gms.b.nj.c;
import com.google.android.gms.b.nk;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.ti;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import com.google.android.gms.b.uv.b;
import com.google.android.gms.b.uv.c;
import com.google.android.gms.common.util.c;

@qi
public final class h
{
  final Object a = new Object();
  Context b;
  
  public final void a(Context paramContext, un paramun, String paramString, Runnable paramRunnable)
  {
    a(paramContext, paramun, true, null, paramString, null, paramRunnable);
  }
  
  final void a(final Context paramContext, un paramun, final boolean paramBoolean, final ti paramti, final String paramString1, final String paramString2, final Runnable paramRunnable)
  {
    int i;
    if (paramti == null) {
      i = 1;
    }
    while (i == 0)
    {
      return;
      long l1 = a;
      long l2 = w.k().a();
      jz localjz = ke.cF;
      if (l2 - l1 > ((Long)w.q().a(localjz)).longValue()) {}
      for (i = 1;; i = 0)
      {
        if ((i == 0) && (e)) {
          break label87;
        }
        i = 1;
        break;
      }
      label87:
      i = 0;
    }
    if (paramContext == null)
    {
      tp.e("Context not provided to fetch application settings");
      return;
    }
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      tp.e("App settings could not be fetched. Required parameters missing");
      return;
    }
    b = paramContext;
    paramun = w.e().a(paramContext, paramun);
    paramti = new md()
    {
      /* Error */
      public final void a(com.google.android.gms.b.vc paramAnonymousvc, java.util.Map<String, String> paramAnonymousMap)
      {
        // Byte code:
        //   0: aload_1
        //   1: ldc 29
        //   3: aload_0
        //   4: invokeinterface 34 3 0
        //   9: aload_0
        //   10: getfield 18	com/google/android/gms/ads/internal/h$1:b	Lcom/google/android/gms/ads/internal/h;
        //   13: getfield 37	com/google/android/gms/ads/internal/h:a	Ljava/lang/Object;
        //   16: astore_1
        //   17: aload_1
        //   18: monitorenter
        //   19: aload_2
        //   20: ifnull +65 -> 85
        //   23: ldc 39
        //   25: aload_2
        //   26: ldc 41
        //   28: invokeinterface 47 2 0
        //   33: checkcast 49	java/lang/String
        //   36: invokevirtual 53	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
        //   39: ifeq +46 -> 85
        //   42: aload_2
        //   43: ldc 55
        //   45: invokeinterface 47 2 0
        //   50: checkcast 49	java/lang/String
        //   53: astore_2
        //   54: invokestatic 61	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
        //   57: aload_0
        //   58: getfield 18	com/google/android/gms/ads/internal/h$1:b	Lcom/google/android/gms/ads/internal/h;
        //   61: getfield 64	com/google/android/gms/ads/internal/h:b	Landroid/content/Context;
        //   64: aload_2
        //   65: invokevirtual 69	com/google/android/gms/b/tj:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/util/concurrent/Future;
        //   68: pop
        //   69: aload_0
        //   70: getfield 20	com/google/android/gms/ads/internal/h$1:a	Ljava/lang/Runnable;
        //   73: ifnull +12 -> 85
        //   76: aload_0
        //   77: getfield 20	com/google/android/gms/ads/internal/h$1:a	Ljava/lang/Runnable;
        //   80: invokeinterface 74 1 0
        //   85: aload_1
        //   86: monitorexit
        //   87: return
        //   88: astore_2
        //   89: invokestatic 61	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
        //   92: aload_2
        //   93: ldc 76
        //   95: invokevirtual 79	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
        //   98: ldc 81
        //   100: aload_2
        //   101: invokestatic 87	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   104: goto -19 -> 85
        //   107: astore_2
        //   108: aload_1
        //   109: monitorexit
        //   110: aload_2
        //   111: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	112	0	this	1
        //   0	112	1	paramAnonymousvc	com.google.android.gms.b.vc
        //   0	112	2	paramAnonymousMap	java.util.Map<String, String>
        // Exception table:
        //   from	to	target	type
        //   69	85	88	java/lang/Throwable
        //   23	69	107	finally
        //   69	85	107	finally
        //   85	87	107	finally
        //   89	104	107	finally
        //   108	110	107	finally
      }
    };
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        b(null).a(new uv.c()new uv.b {}, new uv.b());
      }
    });
  }
}


/* Location:              com/google/android/gms/ads/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */