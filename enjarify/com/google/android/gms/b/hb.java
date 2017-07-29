package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

public final class hb
  implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private static final long d;
  BroadcastReceiver a;
  WeakReference b;
  HashSet c;
  private final Context e;
  private Application f;
  private final WindowManager g;
  private final PowerManager h;
  private final KeyguardManager i;
  private WeakReference j;
  private hc k;
  private ue l;
  private boolean m;
  private int n;
  private DisplayMetrics o;
  
  static
  {
    jz localjz = ke.bo;
    d = ((Long)w.q().a(localjz)).longValue();
  }
  
  public hb(Context paramContext, View paramView)
  {
    Object localObject1 = new com/google/android/gms/b/ue;
    long l1 = d;
    ((ue)localObject1).<init>(l1);
    l = ((ue)localObject1);
    m = false;
    n = -1;
    localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    c = ((HashSet)localObject1);
    localObject1 = paramContext.getApplicationContext();
    e = ((Context)localObject1);
    localObject1 = (WindowManager)paramContext.getSystemService("window");
    g = ((WindowManager)localObject1);
    localObject1 = e;
    Object localObject2 = "power";
    localObject1 = (PowerManager)((Context)localObject1).getSystemService((String)localObject2);
    h = ((PowerManager)localObject1);
    localObject1 = (KeyguardManager)paramContext.getSystemService("keyguard");
    i = ((KeyguardManager)localObject1);
    localObject1 = e;
    boolean bool = localObject1 instanceof Application;
    if (bool)
    {
      localObject1 = (Application)e;
      f = ((Application)localObject1);
      localObject2 = new com/google/android/gms/b/hc;
      localObject1 = (Application)e;
      ((hc)localObject2).<init>((Application)localObject1, this);
      k = ((hc)localObject2);
    }
    localObject1 = paramContext.getResources().getDisplayMetrics();
    o = ((DisplayMetrics)localObject1);
    localObject1 = b;
    if (localObject1 != null) {}
    for (localObject1 = (View)b.get();; localObject1 = null)
    {
      if (localObject1 != null)
      {
        ((View)localObject1).removeOnAttachStateChangeListener(this);
        b((View)localObject1);
      }
      localObject1 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject1).<init>(paramView);
      b = ((WeakReference)localObject1);
      if (paramView != null)
      {
        localObject1 = w.g();
        bool = ((tu)localObject1).a(paramView);
        if (bool) {
          a(paramView);
        }
        paramView.addOnAttachStateChangeListener(this);
      }
      return;
      bool = false;
    }
  }
  
  private Rect a(Rect paramRect)
  {
    Rect localRect = new android/graphics/Rect;
    int i1 = left;
    i1 = b(i1);
    int i2 = top;
    i2 = b(i2);
    int i3 = right;
    i3 = b(i3);
    int i4 = bottom;
    i4 = b(i4);
    localRect.<init>(i1, i2, i3, i4);
    return localRect;
  }
  
  private void a()
  {
    w.e();
    Handler localHandler = tt.a;
    hb.1 local1 = new com/google/android/gms/b/hb$1;
    local1.<init>(this);
    localHandler.post(local1);
  }
  
  private void a(Activity paramActivity, int paramInt)
  {
    Object localObject = b;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = paramActivity.getWindow();
      if (localObject != null)
      {
        View localView = ((Window)localObject).peekDecorView();
        localObject = (View)b.get();
        if ((localObject != null) && (localView != null))
        {
          localObject = ((View)localObject).getRootView();
          localView = localView.getRootView();
          if (localObject == localView) {
            n = paramInt;
          }
        }
      }
    }
  }
  
  private void a(View paramView)
  {
    Object localObject1 = paramView.getViewTreeObserver();
    boolean bool = ((ViewTreeObserver)localObject1).isAlive();
    Object localObject2;
    if (bool)
    {
      localObject2 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject2).<init>(localObject1);
      j = ((WeakReference)localObject2);
      ((ViewTreeObserver)localObject1).addOnScrollChangedListener(this);
      ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener(this);
    }
    localObject1 = a;
    if (localObject1 == null)
    {
      localObject1 = new android/content/IntentFilter;
      ((IntentFilter)localObject1).<init>();
      ((IntentFilter)localObject1).addAction("android.intent.action.SCREEN_ON");
      ((IntentFilter)localObject1).addAction("android.intent.action.SCREEN_OFF");
      ((IntentFilter)localObject1).addAction("android.intent.action.USER_PRESENT");
      localObject2 = new com/google/android/gms/b/hb$2;
      ((hb.2)localObject2).<init>(this);
      a = ((BroadcastReceiver)localObject2);
      localObject2 = e;
      BroadcastReceiver localBroadcastReceiver = a;
      ((Context)localObject2).registerReceiver(localBroadcastReceiver, (IntentFilter)localObject1);
    }
    localObject1 = f;
    if (localObject1 != null) {}
    try
    {
      localObject1 = f;
      localObject2 = k;
      ((Application)localObject1).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject2 = "Error registering activity lifecycle callbacks.";
        tp.b((String)localObject2, localException);
      }
    }
  }
  
  private int b(int paramInt)
  {
    float f1 = o.density;
    return (int)(paramInt / f1);
  }
  
  private void b(View paramView)
  {
    for (;;)
    {
      try
      {
        localObject1 = j;
        if (localObject1 != null)
        {
          localObject1 = j;
          localObject1 = ((WeakReference)localObject1).get();
          localObject1 = (ViewTreeObserver)localObject1;
          if (localObject1 != null)
          {
            bool = ((ViewTreeObserver)localObject1).isAlive();
            if (bool)
            {
              ((ViewTreeObserver)localObject1).removeOnScrollChangedListener(this);
              ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener(this);
            }
          }
          localObject1 = null;
          j = null;
        }
      }
      catch (Exception localException1)
      {
        try
        {
          boolean bool;
          Object localObject1 = f;
          localObject2 = k;
          ((Application)localObject1).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
          return;
        }
        catch (Exception localException4)
        {
          String str;
          Object localObject2 = "Error registering activity lifecycle callbacks.";
          tp.b((String)localObject2, localException4);
          continue;
        }
        localException1 = localException1;
        localObject2 = "Error while unregistering listeners from the last ViewTreeObserver.";
        tp.b((String)localObject2, localException1);
        continue;
      }
      try
      {
        localObject1 = paramView.getViewTreeObserver();
        bool = ((ViewTreeObserver)localObject1).isAlive();
        if (bool)
        {
          ((ViewTreeObserver)localObject1).removeOnScrollChangedListener(this);
          ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener(this);
        }
      }
      catch (Exception localException2)
      {
        localObject2 = "Error while unregistering listeners from the ViewTreeObserver.";
        tp.b((String)localObject2, localException2);
      }
    }
    localObject1 = a;
    if (localObject1 != null) {}
    try
    {
      localObject1 = e;
      localObject2 = a;
      ((Context)localObject1).unregisterReceiver((BroadcastReceiver)localObject2);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        localObject2 = "Failed trying to unregister the receiver";
        tp.b((String)localObject2, localIllegalStateException);
      }
    }
    catch (Exception localException3)
    {
      for (;;)
      {
        localObject2 = w.i();
        str = "ActiveViewUnit.stopScreenStatusMonitoring";
        ((tj)localObject2).a(localException3, str);
      }
    }
    a = null;
    localObject1 = f;
    if (localObject1 == null) {}
  }
  
  final void a(int paramInt)
  {
    Object localObject1 = c;
    int i1 = ((HashSet)localObject1).size();
    if (i1 == 0) {}
    label51:
    int i5;
    label643:
    label669:
    label676:
    label685:
    label694:
    for (;;)
    {
      return;
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject1 = (View)b.get();
        int i2 = 1;
        int i4;
        if (paramInt == i2)
        {
          i2 = 1;
          i4 = i2;
          if (localObject1 != null) {
            break label643;
          }
          i2 = 1;
        }
        for (;;)
        {
          Rect localRect1 = new android/graphics/Rect;
          localRect1.<init>();
          Rect localRect2 = new android/graphics/Rect;
          localRect2.<init>();
          boolean bool2 = false;
          Rect localRect3 = new android/graphics/Rect;
          localRect3.<init>();
          boolean bool3 = false;
          Rect localRect4 = new android/graphics/Rect;
          localRect4.<init>();
          Rect localRect5 = new android/graphics/Rect;
          localRect5.<init>();
          i5 = g.getDefaultDisplay().getWidth();
          right = i5;
          i5 = g.getDefaultDisplay().getHeight();
          bottom = i5;
          Object localObject2 = new int[2];
          i5 = 2;
          Object localObject3 = new int[i5];
          if (localObject1 != null)
          {
            bool2 = ((View)localObject1).getGlobalVisibleRect(localRect2);
            bool3 = ((View)localObject1).getLocalVisibleRect(localRect3);
            ((View)localObject1).getHitRect(localRect4);
          }
          try
          {
            ((View)localObject1).getLocationOnScreen((int[])localObject2);
            ((View)localObject1).getLocationInWindow((int[])localObject3);
          }
          catch (Exception localException)
          {
            int i8;
            float f1;
            for (;;)
            {
              int i6;
              int i7;
              Object localObject4;
              int i3;
              long l1;
              boolean bool4;
              Object localObject5 = "Failure getting view location.";
              tp.b((String)localObject5, localException);
              continue;
              i5 = 8;
              continue;
              i8 = 0;
              f1 = 0.0F;
              continue;
              boolean bool5 = false;
              localObject5 = null;
              continue;
              int i9 = 8;
            }
            float f2 = f1;
            m = i8;
          }
          localObject3 = null;
          i5 = localObject2[0];
          left = i5;
          i5 = localObject2[1];
          top = i5;
          i5 = left;
          i6 = ((View)localObject1).getWidth();
          i5 += i6;
          right = i5;
          i5 = top;
          i6 = ((View)localObject1).getHeight();
          i5 += i6;
          bottom = i5;
          if (localObject1 == null) {
            break label669;
          }
          i5 = ((View)localObject1).getWindowVisibility();
          i6 = n;
          i7 = -1;
          if (i6 != i7) {
            i5 = n;
          }
          if (i2 != 0) {
            break label676;
          }
          w.e();
          localObject4 = h;
          localObject2 = i;
          i3 = tt.a((View)localObject1, (PowerManager)localObject4, (KeyguardManager)localObject2);
          if ((i3 == 0) || (!bool2) || (!bool3) || (i5 != 0)) {
            break label676;
          }
          i8 = 1;
          f1 = Float.MIN_VALUE;
          if (i4 != 0)
          {
            localObject4 = l;
            i3 = ((ue)localObject4).a();
            if (i3 == 0)
            {
              i3 = m;
              f2 = f1;
              if (i8 == i3) {
                break;
              }
            }
          }
          if (i8 == 0)
          {
            i3 = m;
            if (i3 == 0)
            {
              i3 = 1;
              if (paramInt == i3) {
                break;
              }
            }
          }
          localObject4 = new com/google/android/gms/b/hb$a;
          localObject3 = w.k();
          l1 = ((c)localObject3).b();
          localObject2 = h;
          bool4 = ((PowerManager)localObject2).isScreenOn();
          if (localObject1 == null) {
            break label685;
          }
          localObject5 = w.g();
          bool5 = ((tu)localObject5).a((View)localObject1);
          if (localObject1 == null) {
            break label694;
          }
          i9 = ((View)localObject1).getWindowVisibility();
          localRect5 = a(localRect5);
          localRect1 = a(localRect1);
          localRect2 = a(localRect2);
          localRect3 = a(localRect3);
          localRect4 = a(localRect4);
          f2 = o.density;
          ((hb.a)localObject4).<init>(l1, bool4, bool5, i9, localRect5, localRect1, localRect2, bool2, localRect3, bool3, localRect4, f2, i8);
          localObject1 = c;
          localObject3 = ((HashSet)localObject1).iterator();
          for (;;)
          {
            boolean bool1 = ((Iterator)localObject3).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (hb.b)((Iterator)localObject3).next();
            ((hb.b)localObject1).a((hb.a)localObject4);
          }
          i3 = 0;
          localObject4 = null;
          i4 = 0;
          break label51;
          i3 = 0;
          localObject4 = null;
        }
      }
    }
  }
  
  public final void a(hb.b paramb)
  {
    c.add(paramb);
    a(3);
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    a(paramActivity, 0);
    a(3);
    a();
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a(3);
    a();
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(paramActivity, 4);
    a(3);
    a();
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(paramActivity, 0);
    a(3);
    a();
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    a(3);
    a();
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(paramActivity, 0);
    a(3);
    a();
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    a(3);
    a();
  }
  
  public final void onGlobalLayout()
  {
    a(2);
    a();
  }
  
  public final void onScrollChanged()
  {
    a(1);
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    n = -1;
    a(paramView);
    a(3);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    n = -1;
    a(3);
    a();
    b(paramView);
  }
}


/* Location:              com/google/android/gms/b/hb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */