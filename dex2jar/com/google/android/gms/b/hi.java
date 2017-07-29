package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.i;
import java.util.Iterator;
import java.util.List;

@qi
@TargetApi(14)
public final class hi
  extends Thread
{
  boolean a = false;
  final Object b;
  final hg c;
  final qh d;
  final int e;
  final int f;
  final int g;
  final int h;
  final int i;
  final int j;
  final int k;
  private boolean l = false;
  private boolean m = false;
  private final int n;
  private final String o;
  
  public hi(hg paramhg, qh paramqh)
  {
    c = paramhg;
    d = paramqh;
    b = new Object();
    paramhg = ke.X;
    e = ((Integer)w.q().a(paramhg)).intValue();
    paramhg = ke.Y;
    f = ((Integer)w.q().a(paramhg)).intValue();
    paramhg = ke.Z;
    g = ((Integer)w.q().a(paramhg)).intValue();
    paramhg = ke.aa;
    h = ((Integer)w.q().a(paramhg)).intValue();
    paramhg = ke.ad;
    i = ((Integer)w.q().a(paramhg)).intValue();
    paramhg = ke.af;
    j = ((Integer)w.q().a(paramhg)).intValue();
    paramhg = ke.ag;
    k = ((Integer)w.q().a(paramhg)).intValue();
    paramhg = ke.ab;
    n = ((Integer)w.q().a(paramhg)).intValue();
    paramhg = ke.ai;
    o = ((String)w.q().a(paramhg));
    setName("ContentFetchTask");
  }
  
  private static boolean b()
  {
    for (;;)
    {
      int i1;
      boolean bool;
      try
      {
        Object localObject1 = w.h().b();
        if (localObject1 == null) {
          return false;
        }
        Object localObject2 = (ActivityManager)((Context)localObject1).getSystemService("activity");
        KeyguardManager localKeyguardManager = (KeyguardManager)((Context)localObject1).getSystemService("keyguard");
        if ((localObject2 != null) && (localKeyguardManager != null))
        {
          localObject2 = ((ActivityManager)localObject2).getRunningAppProcesses();
          if (localObject2 == null) {
            return false;
          }
          localObject2 = ((List)localObject2).iterator();
          if (((Iterator)localObject2).hasNext())
          {
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject2).next();
            if (Process.myPid() != pid) {
              continue;
            }
            if (importance != 100) {
              break label174;
            }
            i1 = 1;
            if ((i1 != 0) && (!localKeyguardManager.inKeyguardRestrictedInputMode()))
            {
              localObject1 = (PowerManager)((Context)localObject1).getSystemService("power");
              if (localObject1 == null)
              {
                bool = false;
                break label168;
              }
              bool = ((PowerManager)localObject1).isScreenOn();
              break label168;
            }
          }
          return false;
        }
      }
      catch (Throwable localThrowable)
      {
        w.i().a(localThrowable, "ContentFetchTask.isInForeground");
        return false;
      }
      return false;
      label168:
      if (bool)
      {
        return true;
        label174:
        i1 = 0;
      }
    }
  }
  
  private void c()
  {
    synchronized (b)
    {
      a = true;
      boolean bool = a;
      tp.b(42 + "ContentFetchThread: paused, mPause = " + bool);
      return;
    }
  }
  
  final a a(final View paramView, final hf paramhf)
  {
    int i3 = 0;
    if (paramView == null) {
      return new a(0, 0);
    }
    Object localObject = w.h().b();
    if (localObject != null)
    {
      Resources localResources = ((Context)localObject).getResources();
      jz localjz = ke.ah;
      localObject = (String)paramView.getTag(localResources.getIdentifier((String)w.q().a(localjz), "id", ((Context)localObject).getPackageName()));
      if ((!TextUtils.isEmpty(o)) && (localObject != null) && (((String)localObject).equals(o))) {
        return new a(0, 0);
      }
    }
    final boolean bool = paramView.getGlobalVisibleRect(new Rect());
    if (((paramView instanceof TextView)) && (!(paramView instanceof EditText)))
    {
      localObject = ((TextView)paramView).getText();
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        paramhf.b(((CharSequence)localObject).toString(), bool, paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
        return new a(1, 0);
      }
      return new a(0, 0);
    }
    int i1;
    if (((paramView instanceof WebView)) && (!(paramView instanceof vc)))
    {
      paramhf.b();
      paramView = (WebView)paramView;
      if (!i.c()) {}
      for (i1 = 0; i1 != 0; i1 = 1)
      {
        return new a(0, 1);
        paramhf.b();
        paramView.post(new Runnable()
        {
          ValueCallback<String> a = new ValueCallback() {};
          
          public final void run()
          {
            if (paramView.getSettings().getJavaScriptEnabled()) {}
            try
            {
              paramView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", a);
              return;
            }
            catch (Throwable localThrowable)
            {
              a.onReceiveValue("");
            }
          }
        });
      }
      return new a(0, 0);
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int i2 = 0;
      i1 = 0;
      while (i1 < paramView.getChildCount())
      {
        localObject = a(paramView.getChildAt(i1), paramhf);
        i3 += a;
        i2 += b;
        i1 += 1;
      }
      return new a(i3, i2);
    }
    return new a(0, 0);
  }
  
  public final void a()
  {
    synchronized (b)
    {
      if (l)
      {
        tp.b("Content hash thread already started, quiting...");
        return;
      }
      l = true;
      start();
      return;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 345	com/google/android/gms/b/hi:b	()Z
    //   3: ifeq +201 -> 204
    //   6: invokestatic 136	com/google/android/gms/ads/internal/w:h	()Lcom/google/android/gms/b/hh;
    //   9: invokevirtual 348	com/google/android/gms/b/hh:a	()Landroid/app/Activity;
    //   12: astore 4
    //   14: aload 4
    //   16: ifnonnull +61 -> 77
    //   19: ldc_w 350
    //   22: invokestatic 229	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: invokespecial 352	com/google/android/gms/b/hi:c	()V
    //   29: aload_0
    //   30: getfield 116	com/google/android/gms/b/hi:n	I
    //   33: sipush 1000
    //   36: imul
    //   37: i2l
    //   38: invokestatic 356	java/lang/Thread:sleep	(J)V
    //   41: aload_0
    //   42: getfield 57	com/google/android/gms/b/hi:b	Ljava/lang/Object;
    //   45: astore_2
    //   46: aload_2
    //   47: monitorenter
    //   48: aload_0
    //   49: getfield 46	com/google/android/gms/b/hi:a	Z
    //   52: istore_1
    //   53: iload_1
    //   54: ifeq +163 -> 217
    //   57: ldc_w 358
    //   60: invokestatic 229	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   63: aload_0
    //   64: getfield 57	com/google/android/gms/b/hi:b	Ljava/lang/Object;
    //   67: invokevirtual 361	java/lang/Object:wait	()V
    //   70: goto -22 -> 48
    //   73: astore_3
    //   74: goto -26 -> 48
    //   77: aload 4
    //   79: ifnull -50 -> 29
    //   82: aconst_null
    //   83: astore_3
    //   84: aload_3
    //   85: astore_2
    //   86: aload 4
    //   88: invokevirtual 367	android/app/Activity:getWindow	()Landroid/view/Window;
    //   91: ifnull +31 -> 122
    //   94: aload_3
    //   95: astore_2
    //   96: aload 4
    //   98: invokevirtual 367	android/app/Activity:getWindow	()Landroid/view/Window;
    //   101: invokevirtual 373	android/view/Window:getDecorView	()Landroid/view/View;
    //   104: ifnull +18 -> 122
    //   107: aload 4
    //   109: invokevirtual 367	android/app/Activity:getWindow	()Landroid/view/Window;
    //   112: invokevirtual 373	android/view/Window:getDecorView	()Landroid/view/View;
    //   115: ldc_w 374
    //   118: invokevirtual 377	android/view/View:findViewById	(I)Landroid/view/View;
    //   121: astore_2
    //   122: aload_2
    //   123: ifnull -94 -> 29
    //   126: aload_2
    //   127: ifnull -98 -> 29
    //   130: aload_2
    //   131: new 6	com/google/android/gms/b/hi$1
    //   134: dup
    //   135: aload_0
    //   136: aload_2
    //   137: invokespecial 380	com/google/android/gms/b/hi$1:<init>	(Lcom/google/android/gms/b/hi;Landroid/view/View;)V
    //   140: invokevirtual 381	android/view/View:post	(Ljava/lang/Runnable;)Z
    //   143: pop
    //   144: goto -115 -> 29
    //   147: astore_2
    //   148: ldc_w 383
    //   151: aload_2
    //   152: invokestatic 386	com/google/android/gms/b/tp:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   155: goto -114 -> 41
    //   158: astore_2
    //   159: invokestatic 200	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   162: aload_2
    //   163: ldc_w 388
    //   166: invokevirtual 207	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   169: ldc_w 390
    //   172: invokestatic 229	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   175: aload_3
    //   176: astore_2
    //   177: goto -55 -> 122
    //   180: astore_2
    //   181: ldc_w 383
    //   184: aload_2
    //   185: invokestatic 386	com/google/android/gms/b/tp:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   188: aload_0
    //   189: getfield 52	com/google/android/gms/b/hi:d	Lcom/google/android/gms/b/qh;
    //   192: aload_2
    //   193: ldc_w 392
    //   196: invokeinterface 395 3 0
    //   201: goto -160 -> 41
    //   204: ldc_w 397
    //   207: invokestatic 229	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   210: aload_0
    //   211: invokespecial 352	com/google/android/gms/b/hi:c	()V
    //   214: goto -185 -> 29
    //   217: aload_2
    //   218: monitorexit
    //   219: goto -219 -> 0
    //   222: astore_3
    //   223: aload_2
    //   224: monitorexit
    //   225: aload_3
    //   226: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	this	hi
    //   52	2	1	bool	boolean
    //   147	5	2	localInterruptedException1	InterruptedException
    //   158	5	2	localThrowable1	Throwable
    //   176	1	2	localObject2	Object
    //   180	44	2	localThrowable2	Throwable
    //   73	1	3	localInterruptedException2	InterruptedException
    //   83	93	3	localObject3	Object
    //   222	4	3	localObject4	Object
    //   12	96	4	localActivity	android.app.Activity
    // Exception table:
    //   from	to	target	type
    //   57	70	73	java/lang/InterruptedException
    //   0	14	147	java/lang/InterruptedException
    //   19	29	147	java/lang/InterruptedException
    //   29	41	147	java/lang/InterruptedException
    //   86	94	147	java/lang/InterruptedException
    //   96	122	147	java/lang/InterruptedException
    //   130	144	147	java/lang/InterruptedException
    //   159	175	147	java/lang/InterruptedException
    //   204	214	147	java/lang/InterruptedException
    //   86	94	158	java/lang/Throwable
    //   96	122	158	java/lang/Throwable
    //   0	14	180	java/lang/Throwable
    //   19	29	180	java/lang/Throwable
    //   29	41	180	java/lang/Throwable
    //   130	144	180	java/lang/Throwable
    //   159	175	180	java/lang/Throwable
    //   204	214	180	java/lang/Throwable
    //   48	53	222	finally
    //   57	70	222	finally
    //   217	219	222	finally
    //   223	225	222	finally
  }
  
  @qi
  final class a
  {
    final int a;
    final int b;
    
    a(int paramInt)
    {
      a = this$1;
      b = paramInt;
    }
  }
}


/* Location:              com/google/android/gms/b/hi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */