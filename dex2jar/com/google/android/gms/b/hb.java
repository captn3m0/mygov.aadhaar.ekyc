package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
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

@qi
@TargetApi(14)
public final class hb
  implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private static final long d;
  BroadcastReceiver a;
  WeakReference<View> b;
  HashSet<b> c = new HashSet();
  private final Context e;
  private Application f;
  private final WindowManager g;
  private final PowerManager h;
  private final KeyguardManager i;
  private WeakReference<ViewTreeObserver> j;
  private hc k;
  private ue l = new ue(d);
  private boolean m = false;
  private int n = -1;
  private DisplayMetrics o;
  
  static
  {
    jz localjz = ke.bo;
    d = ((Long)w.q().a(localjz)).longValue();
  }
  
  public hb(Context paramContext, View paramView)
  {
    e = paramContext.getApplicationContext();
    g = ((WindowManager)paramContext.getSystemService("window"));
    h = ((PowerManager)e.getSystemService("power"));
    i = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    if ((e instanceof Application))
    {
      f = ((Application)e);
      k = new hc((Application)e, this);
    }
    o = paramContext.getResources().getDisplayMetrics();
    if (b != null) {}
    for (paramContext = (View)b.get();; paramContext = null)
    {
      if (paramContext != null)
      {
        paramContext.removeOnAttachStateChangeListener(this);
        b(paramContext);
      }
      b = new WeakReference(paramView);
      if (paramView != null)
      {
        if (w.g().a(paramView)) {
          a(paramView);
        }
        paramView.addOnAttachStateChangeListener(this);
      }
      return;
    }
  }
  
  private Rect a(Rect paramRect)
  {
    return new Rect(b(left), b(top), b(right), b(bottom));
  }
  
  private void a()
  {
    w.e();
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        hb.a(hb.this);
      }
    });
  }
  
  private void a(Activity paramActivity, int paramInt)
  {
    if (b == null) {}
    View localView;
    do
    {
      do
      {
        return;
        paramActivity = paramActivity.getWindow();
      } while (paramActivity == null);
      paramActivity = paramActivity.peekDecorView();
      localView = (View)b.get();
    } while ((localView == null) || (paramActivity == null) || (localView.getRootView() != paramActivity.getRootView()));
    n = paramInt;
  }
  
  private void a(View paramView)
  {
    paramView = paramView.getViewTreeObserver();
    if (paramView.isAlive())
    {
      j = new WeakReference(paramView);
      paramView.addOnScrollChangedListener(this);
      paramView.addOnGlobalLayoutListener(this);
    }
    if (a == null)
    {
      paramView = new IntentFilter();
      paramView.addAction("android.intent.action.SCREEN_ON");
      paramView.addAction("android.intent.action.SCREEN_OFF");
      paramView.addAction("android.intent.action.USER_PRESENT");
      a = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          hb.a(hb.this);
        }
      };
      e.registerReceiver(a, paramView);
    }
    if (f != null) {}
    try
    {
      f.registerActivityLifecycleCallbacks(k);
      return;
    }
    catch (Exception paramView)
    {
      tp.b("Error registering activity lifecycle callbacks.", paramView);
    }
  }
  
  private int b(int paramInt)
  {
    float f1 = o.density;
    return (int)(paramInt / f1);
  }
  
  private void b(View paramView)
  {
    try
    {
      if (j != null)
      {
        ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)j.get();
        if ((localViewTreeObserver != null) && (localViewTreeObserver.isAlive()))
        {
          localViewTreeObserver.removeOnScrollChangedListener(this);
          localViewTreeObserver.removeGlobalOnLayoutListener(this);
        }
        j = null;
      }
      return;
    }
    catch (Exception paramView)
    {
      try
      {
        paramView = paramView.getViewTreeObserver();
        if (paramView.isAlive())
        {
          paramView.removeOnScrollChangedListener(this);
          paramView.removeGlobalOnLayoutListener(this);
        }
        if (a == null) {}
      }
      catch (Exception paramView)
      {
        try
        {
          for (;;)
          {
            e.unregisterReceiver(a);
            a = null;
            if (f != null) {}
            try
            {
              f.unregisterActivityLifecycleCallbacks(k);
              return;
            }
            catch (Exception paramView)
            {
              tp.b("Error registering activity lifecycle callbacks.", paramView);
            }
            localException = localException;
            tp.b("Error while unregistering listeners from the last ViewTreeObserver.", localException);
          }
          paramView = paramView;
          tp.b("Error while unregistering listeners from the ViewTreeObserver.", paramView);
        }
        catch (IllegalStateException paramView)
        {
          for (;;)
          {
            tp.b("Failed trying to unregister the receiver", paramView);
          }
        }
        catch (Exception paramView)
        {
          for (;;)
          {
            w.i().a(paramView, "ActiveViewUnit.stopScreenStatusMonitoring");
          }
        }
      }
    }
  }
  
  final void a(int paramInt)
  {
    if (c.size() == 0) {}
    for (;;)
    {
      return;
      if (b != null)
      {
        Object localObject1 = (View)b.get();
        int i2;
        int i3;
        Object localObject2;
        Rect localRect1;
        boolean bool1;
        Rect localRect2;
        boolean bool2;
        Rect localRect3;
        Rect localRect4;
        int[] arrayOfInt1;
        int[] arrayOfInt2;
        if (paramInt == 1)
        {
          i2 = 1;
          if (localObject1 != null) {
            break label488;
          }
          i3 = 1;
          localObject2 = new Rect();
          localRect1 = new Rect();
          bool1 = false;
          localRect2 = new Rect();
          bool2 = false;
          localRect3 = new Rect();
          localRect4 = new Rect();
          right = g.getDefaultDisplay().getWidth();
          bottom = g.getDefaultDisplay().getHeight();
          arrayOfInt1 = new int[2];
          arrayOfInt2 = new int[2];
          if (localObject1 != null)
          {
            bool1 = ((View)localObject1).getGlobalVisibleRect(localRect1);
            bool2 = ((View)localObject1).getLocalVisibleRect(localRect2);
            ((View)localObject1).getHitRect(localRect3);
          }
        }
        try
        {
          ((View)localObject1).getLocationOnScreen(arrayOfInt1);
          ((View)localObject1).getLocationInWindow(arrayOfInt2);
          left = arrayOfInt1[0];
          top = arrayOfInt1[1];
          right = (left + ((View)localObject1).getWidth());
          bottom = (top + ((View)localObject1).getHeight());
          if (localObject1 != null)
          {
            i1 = ((View)localObject1).getWindowVisibility();
            if (n != -1) {
              i1 = n;
            }
            if (i3 != 0) {
              break label513;
            }
            w.e();
            if ((!tt.a((View)localObject1, h, i)) || (!bool1) || (!bool2) || (i1 != 0)) {
              break label513;
            }
            bool3 = true;
            if (((i2 != 0) && (!l.a()) && (bool3 == m)) || ((!bool3) && (!m) && (paramInt == 1))) {
              continue;
            }
            long l1 = w.k().b();
            boolean bool5 = h.isScreenOn();
            if (localObject1 == null) {
              break label519;
            }
            bool4 = w.g().a((View)localObject1);
            if (localObject1 == null) {
              break label525;
            }
            paramInt = ((View)localObject1).getWindowVisibility();
            localObject1 = new a(l1, bool5, bool4, paramInt, a(localRect4), a((Rect)localObject2), a(localRect1), bool1, a(localRect2), bool2, a(localRect3), o.density, bool3);
            localObject2 = c.iterator();
            for (;;)
            {
              if (((Iterator)localObject2).hasNext())
              {
                ((b)((Iterator)localObject2).next()).a((a)localObject1);
                continue;
                i2 = 0;
                break;
                label488:
                i3 = 0;
              }
            }
          }
        }
        catch (Exception localException)
        {
          boolean bool3;
          for (;;)
          {
            tp.b("Failure getting view location.", localException);
            continue;
            int i1 = 8;
            continue;
            label513:
            bool3 = false;
            continue;
            label519:
            boolean bool4 = false;
            continue;
            label525:
            paramInt = 8;
          }
          m = bool3;
        }
      }
    }
  }
  
  public final void a(b paramb)
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
  
  public static final class a
  {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Rect e;
    public final Rect f;
    public final Rect g;
    public final boolean h;
    public final Rect i;
    public final boolean j;
    public final Rect k;
    public final float l;
    public final boolean m;
    
    public a(long paramLong, boolean paramBoolean1, boolean paramBoolean2, int paramInt, Rect paramRect1, Rect paramRect2, Rect paramRect3, boolean paramBoolean3, Rect paramRect4, boolean paramBoolean4, Rect paramRect5, float paramFloat, boolean paramBoolean5)
    {
      a = paramLong;
      b = paramBoolean1;
      c = paramBoolean2;
      d = paramInt;
      e = paramRect1;
      f = paramRect2;
      g = paramRect3;
      h = paramBoolean3;
      i = paramRect4;
      j = paramBoolean4;
      k = paramRect5;
      l = paramFloat;
      m = paramBoolean5;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(hb.a parama);
  }
}


/* Location:              com/google/android/gms/b/hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */