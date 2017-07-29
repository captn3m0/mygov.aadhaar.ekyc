package com.google.android.gms.b;

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
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.i;
import java.util.Iterator;
import java.util.List;

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
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
    localObject = ke.X;
    int i1 = ((Integer)w.q().a((jz)localObject)).intValue();
    e = i1;
    localObject = ke.Y;
    i1 = ((Integer)w.q().a((jz)localObject)).intValue();
    f = i1;
    localObject = ke.Z;
    i1 = ((Integer)w.q().a((jz)localObject)).intValue();
    g = i1;
    localObject = ke.aa;
    i1 = ((Integer)w.q().a((jz)localObject)).intValue();
    h = i1;
    localObject = ke.ad;
    i1 = ((Integer)w.q().a((jz)localObject)).intValue();
    i = i1;
    localObject = ke.af;
    i1 = ((Integer)w.q().a((jz)localObject)).intValue();
    j = i1;
    localObject = ke.ag;
    i1 = ((Integer)w.q().a((jz)localObject)).intValue();
    k = i1;
    localObject = ke.ab;
    i1 = ((Integer)w.q().a((jz)localObject)).intValue();
    n = i1;
    localObject = ke.ai;
    localObject = (String)w.q().a((jz)localObject);
    o = ((String)localObject);
    setName("ContentFetchTask");
  }
  
  private static boolean b()
  {
    int i1 = 1;
    for (;;)
    {
      try
      {
        localObject1 = w.h();
        localContext = ((hh)localObject1).b();
        if (localContext != null) {
          continue;
        }
        bool1 = false;
        localObject1 = null;
      }
      finally
      {
        Object localObject1;
        Context localContext;
        boolean bool1;
        Iterator localIterator;
        int i3;
        int i4;
        int i2;
        int i5;
        Object localObject3 = w.i();
        String str = "ContentFetchTask.isInForeground";
        ((tj)localObject3).a(localThrowable, str);
        boolean bool2 = false;
        Object localObject2 = null;
        continue;
      }
      return bool1;
      localObject1 = "activity";
      localObject1 = localContext.getSystemService((String)localObject1);
      localObject1 = (ActivityManager)localObject1;
      localObject3 = "keyguard";
      localObject3 = localContext.getSystemService((String)localObject3);
      localObject3 = (KeyguardManager)localObject3;
      if ((localObject1 == null) || (localObject3 == null))
      {
        bool1 = false;
        localObject1 = null;
      }
      else
      {
        localObject1 = ((ActivityManager)localObject1).getRunningAppProcesses();
        if (localObject1 == null)
        {
          bool1 = false;
          localObject1 = null;
        }
        else
        {
          localIterator = ((List)localObject1).iterator();
          bool1 = localIterator.hasNext();
          if (bool1)
          {
            localObject1 = localIterator.next();
            localObject1 = (ActivityManager.RunningAppProcessInfo)localObject1;
            i3 = Process.myPid();
            i4 = pid;
            if (i3 != i4) {
              continue;
            }
            i2 = importance;
            i5 = 100;
            if (i2 == i5)
            {
              i2 = i1;
              if (i2 == 0) {
                continue;
              }
              bool2 = ((KeyguardManager)localObject3).inKeyguardRestrictedInputMode();
              if (bool2) {
                continue;
              }
              localObject1 = "power";
              localObject1 = localContext.getSystemService((String)localObject1);
              localObject1 = (PowerManager)localObject1;
              if (localObject1 == null)
              {
                bool2 = false;
                localObject1 = null;
                if (!bool2) {
                  continue;
                }
                bool2 = i1;
              }
            }
            else
            {
              bool2 = false;
              localObject1 = null;
              continue;
            }
            bool2 = ((PowerManager)localObject1).isScreenOn();
            continue;
          }
          bool2 = false;
          localObject1 = null;
        }
      }
    }
  }
  
  private void c()
  {
    Object localObject1 = b;
    boolean bool = true;
    try
    {
      a = bool;
      bool = a;
      int i1 = 42;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i1);
      Object localObject2 = "ContentFetchThread: paused, mPause = ";
      localObject2 = localStringBuilder.append((String)localObject2);
      Object localObject3 = ((StringBuilder)localObject2).append(bool);
      localObject3 = ((StringBuilder)localObject3).toString();
      tp.b((String)localObject3);
      return;
    }
    finally {}
  }
  
  final hi.a a(View paramView, hf paramhf)
  {
    int i1 = 1;
    int i2 = 0;
    Object localObject1;
    if (paramView == null)
    {
      localObject1 = new com/google/android/gms/b/hi$a;
      ((hi.a)localObject1).<init>(0, 0);
    }
    for (;;)
    {
      return (hi.a)localObject1;
      localObject1 = w.h();
      Object localObject2 = ((hh)localObject1).b();
      Object localObject3;
      int i7;
      if (localObject2 != null)
      {
        localObject3 = ((Context)localObject2).getResources();
        localObject1 = ke.ah;
        localObject1 = (String)w.q().a((jz)localObject1);
        String str = "id";
        localObject2 = ((Context)localObject2).getPackageName();
        int i3 = ((Resources)localObject3).getIdentifier((String)localObject1, str, (String)localObject2);
        localObject1 = (String)paramView.getTag(i3);
        localObject2 = o;
        i7 = TextUtils.isEmpty((CharSequence)localObject2);
        if ((i7 == 0) && (localObject1 != null))
        {
          localObject2 = o;
          bool1 = ((String)localObject1).equals(localObject2);
          if (bool1)
          {
            localObject1 = new com/google/android/gms/b/hi$a;
            ((hi.a)localObject1).<init>(0, 0);
            continue;
          }
        }
      }
      localObject1 = new android/graphics/Rect;
      ((Rect)localObject1).<init>();
      boolean bool2 = paramView.getGlobalVisibleRect((Rect)localObject1);
      boolean bool1 = paramView instanceof TextView;
      if (bool1)
      {
        bool1 = paramView instanceof EditText;
        if (!bool1)
        {
          localObject1 = paramView;
          localObject1 = ((TextView)paramView).getText();
          i7 = TextUtils.isEmpty((CharSequence)localObject1);
          if (i7 == 0)
          {
            localObject2 = ((CharSequence)localObject1).toString();
            float f1 = ((View)paramView).getX();
            float f2 = ((View)paramView).getY();
            float f3 = ((View)paramView).getWidth();
            int i4 = ((View)paramView).getHeight();
            float f4 = i4;
            localObject1 = paramhf;
            paramhf.b((String)localObject2, bool2, f1, f2, f3, f4);
            localObject1 = new com/google/android/gms/b/hi$a;
            ((hi.a)localObject1).<init>(i1, 0);
            continue;
          }
          localObject1 = new com/google/android/gms/b/hi$a;
          ((hi.a)localObject1).<init>(0, 0);
          continue;
        }
      }
      int i5 = paramView instanceof WebView;
      if (i5 != 0)
      {
        i5 = paramView instanceof vc;
        if (i5 == 0)
        {
          paramhf.b();
          paramView = (WebView)paramView;
          i5 = i.c();
          if (i5 == 0)
          {
            i5 = 0;
            localObject1 = null;
          }
          for (;;)
          {
            if (i5 == 0) {
              break label422;
            }
            localObject1 = new com/google/android/gms/b/hi$a;
            ((hi.a)localObject1).<init>(0, i1);
            break;
            paramhf.b();
            localObject1 = new com/google/android/gms/b/hi$2;
            ((hi.2)localObject1).<init>(this, paramhf, paramView, bool2);
            paramView.post((Runnable)localObject1);
            i5 = i1;
          }
          label422:
          localObject1 = new com/google/android/gms/b/hi$a;
          ((hi.a)localObject1).<init>(0, 0);
          continue;
        }
      }
      i5 = paramView instanceof ViewGroup;
      if (i5 != 0)
      {
        paramView = (ViewGroup)paramView;
        i5 = 0;
        localObject1 = null;
        i7 = 0;
        localObject2 = null;
        int i6;
        for (;;)
        {
          int i9 = paramView.getChildCount();
          if (i7 >= i9) {
            break;
          }
          localObject3 = paramView.getChildAt(i7);
          localObject3 = a((View)localObject3, paramhf);
          int i11 = a;
          i2 += i11;
          int i10 = b;
          i5 += i10;
          int i8;
          i7 += 1;
        }
        localObject2 = new com/google/android/gms/b/hi$a;
        ((hi.a)localObject2).<init>(i2, i6);
        localObject1 = localObject2;
      }
      else
      {
        localObject1 = new com/google/android/gms/b/hi$a;
        ((hi.a)localObject1).<init>(0, 0);
      }
    }
  }
  
  public final void a()
  {
    synchronized (b)
    {
      boolean bool = l;
      if (bool)
      {
        String str = "Content hash thread already started, quiting...";
        tp.b(str);
        return;
      }
      bool = true;
      l = bool;
      start();
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 333	com/google/android/gms/b/hi:b	()Z
    //   3: istore_1
    //   4: iload_1
    //   5: ifeq +245 -> 250
    //   8: invokestatic 120	com/google/android/gms/ads/internal/w:h	()Lcom/google/android/gms/b/hh;
    //   11: astore_2
    //   12: aload_2
    //   13: invokevirtual 336	com/google/android/gms/b/hh:a	()Landroid/app/Activity;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnonnull +73 -> 91
    //   21: ldc_w 338
    //   24: astore_2
    //   25: aload_2
    //   26: invokestatic 216	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   29: aload_0
    //   30: invokespecial 340	com/google/android/gms/b/hi:c	()V
    //   33: aload_0
    //   34: getfield 103	com/google/android/gms/b/hi:n	I
    //   37: sipush 1000
    //   40: imul
    //   41: istore_1
    //   42: iload_1
    //   43: i2l
    //   44: lstore 4
    //   46: lload 4
    //   48: invokestatic 344	java/lang/Thread:sleep	(J)V
    //   51: aload_0
    //   52: getfield 44	com/google/android/gms/b/hi:b	Ljava/lang/Object;
    //   55: astore_3
    //   56: aload_3
    //   57: monitorenter
    //   58: aload_0
    //   59: getfield 33	com/google/android/gms/b/hi:a	Z
    //   62: istore_1
    //   63: iload_1
    //   64: ifeq +201 -> 265
    //   67: ldc_w 346
    //   70: astore_2
    //   71: aload_2
    //   72: invokestatic 216	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   75: aload_0
    //   76: getfield 44	com/google/android/gms/b/hi:b	Ljava/lang/Object;
    //   79: astore_2
    //   80: aload_2
    //   81: invokevirtual 349	java/lang/Object:wait	()V
    //   84: goto -26 -> 58
    //   87: astore_2
    //   88: goto -30 -> 58
    //   91: aload_3
    //   92: ifnull -59 -> 33
    //   95: iconst_0
    //   96: istore_1
    //   97: aconst_null
    //   98: astore_2
    //   99: aload_3
    //   100: invokevirtual 355	android/app/Activity:getWindow	()Landroid/view/Window;
    //   103: astore 6
    //   105: aload 6
    //   107: ifnull +43 -> 150
    //   110: aload_3
    //   111: invokevirtual 355	android/app/Activity:getWindow	()Landroid/view/Window;
    //   114: astore 6
    //   116: aload 6
    //   118: invokevirtual 361	android/view/Window:getDecorView	()Landroid/view/View;
    //   121: astore 6
    //   123: aload 6
    //   125: ifnull +25 -> 150
    //   128: aload_3
    //   129: invokevirtual 355	android/app/Activity:getWindow	()Landroid/view/Window;
    //   132: astore_3
    //   133: aload_3
    //   134: invokevirtual 361	android/view/Window:getDecorView	()Landroid/view/View;
    //   137: astore_3
    //   138: ldc_w 362
    //   141: istore 7
    //   143: aload_3
    //   144: iload 7
    //   146: invokevirtual 366	android/view/View:findViewById	(I)Landroid/view/View;
    //   149: astore_2
    //   150: aload_2
    //   151: ifnull -118 -> 33
    //   154: aload_2
    //   155: ifnull -122 -> 33
    //   158: new 368	com/google/android/gms/b/hi$1
    //   161: astore_3
    //   162: aload_3
    //   163: aload_0
    //   164: aload_2
    //   165: invokespecial 371	com/google/android/gms/b/hi$1:<init>	(Lcom/google/android/gms/b/hi;Landroid/view/View;)V
    //   168: aload_2
    //   169: aload_3
    //   170: invokevirtual 372	android/view/View:post	(Ljava/lang/Runnable;)Z
    //   173: pop
    //   174: goto -141 -> 33
    //   177: astore_2
    //   178: ldc_w 374
    //   181: astore_3
    //   182: aload_3
    //   183: aload_2
    //   184: invokestatic 377	com/google/android/gms/b/tp:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   187: goto -136 -> 51
    //   190: astore_3
    //   191: invokestatic 186	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   194: astore 6
    //   196: ldc_w 379
    //   199: astore 8
    //   201: aload 6
    //   203: aload_3
    //   204: aload 8
    //   206: invokevirtual 193	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   209: ldc_w 381
    //   212: astore_3
    //   213: aload_3
    //   214: invokestatic 216	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   217: goto -67 -> 150
    //   220: astore_2
    //   221: ldc_w 374
    //   224: aload_2
    //   225: invokestatic 377	com/google/android/gms/b/tp:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   228: aload_0
    //   229: getfield 39	com/google/android/gms/b/hi:d	Lcom/google/android/gms/b/qh;
    //   232: astore_3
    //   233: ldc_w 383
    //   236: astore 6
    //   238: aload_3
    //   239: aload_2
    //   240: aload 6
    //   242: invokeinterface 386 3 0
    //   247: goto -196 -> 51
    //   250: ldc_w 388
    //   253: astore_2
    //   254: aload_2
    //   255: invokestatic 216	com/google/android/gms/b/tp:b	(Ljava/lang/String;)V
    //   258: aload_0
    //   259: invokespecial 340	com/google/android/gms/b/hi:c	()V
    //   262: goto -229 -> 33
    //   265: aload_3
    //   266: monitorexit
    //   267: goto -267 -> 0
    //   270: astore_2
    //   271: aload_3
    //   272: monitorexit
    //   273: aload_2
    //   274: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	this	hi
    //   3	2	1	bool1	boolean
    //   41	2	1	i1	int
    //   62	35	1	bool2	boolean
    //   11	70	2	localObject1	Object
    //   87	1	2	localInterruptedException1	InterruptedException
    //   98	71	2	localView	View
    //   177	7	2	localInterruptedException2	InterruptedException
    //   220	20	2	localThrowable1	Throwable
    //   253	2	2	str1	String
    //   270	4	2	localObject2	Object
    //   190	14	3	localThrowable2	Throwable
    //   212	60	3	localObject4	Object
    //   44	3	4	l1	long
    //   103	138	6	localObject5	Object
    //   141	4	7	i2	int
    //   199	6	8	str2	String
    // Exception table:
    //   from	to	target	type
    //   71	75	87	java/lang/InterruptedException
    //   75	79	87	java/lang/InterruptedException
    //   80	84	87	java/lang/InterruptedException
    //   0	3	177	java/lang/InterruptedException
    //   8	11	177	java/lang/InterruptedException
    //   12	16	177	java/lang/InterruptedException
    //   25	29	177	java/lang/InterruptedException
    //   29	33	177	java/lang/InterruptedException
    //   33	37	177	java/lang/InterruptedException
    //   46	51	177	java/lang/InterruptedException
    //   158	161	177	java/lang/InterruptedException
    //   164	168	177	java/lang/InterruptedException
    //   169	174	177	java/lang/InterruptedException
    //   191	194	177	java/lang/InterruptedException
    //   204	209	177	java/lang/InterruptedException
    //   213	217	177	java/lang/InterruptedException
    //   254	258	177	java/lang/InterruptedException
    //   258	262	177	java/lang/InterruptedException
    //   99	103	190	finally
    //   110	114	190	finally
    //   116	121	190	finally
    //   128	132	190	finally
    //   133	137	190	finally
    //   144	149	190	finally
    //   0	3	220	finally
    //   8	11	220	finally
    //   12	16	220	finally
    //   25	29	220	finally
    //   29	33	220	finally
    //   33	37	220	finally
    //   46	51	220	finally
    //   158	161	220	finally
    //   164	168	220	finally
    //   169	174	220	finally
    //   191	194	220	finally
    //   204	209	220	finally
    //   213	217	220	finally
    //   254	258	220	finally
    //   258	262	220	finally
    //   58	62	270	finally
    //   71	75	270	finally
    //   75	79	270	finally
    //   80	84	270	finally
    //   265	267	270	finally
    //   271	273	270	finally
  }
}


/* Location:              com/google/android/gms/b/hi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */