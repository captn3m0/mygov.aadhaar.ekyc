package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@qi
public final class hh
{
  public final Object a = new Object();
  public a b = null;
  public boolean c = false;
  
  public final Activity a()
  {
    synchronized (a)
    {
      int i = Build.VERSION.SDK_INT;
      if (b != null)
      {
        Activity localActivity = b.a;
        return localActivity;
      }
      return null;
    }
  }
  
  public final void a(b paramb)
  {
    synchronized (a)
    {
      int i = Build.VERSION.SDK_INT;
      jz localjz = ke.aJ;
      if (!((Boolean)w.q().a(localjz)).booleanValue()) {
        return;
      }
      if (b == null) {
        b = new a();
      }
      b.c.add(paramb);
      return;
    }
  }
  
  public final Context b()
  {
    synchronized (a)
    {
      int i = Build.VERSION.SDK_INT;
      if (b != null)
      {
        Context localContext = b.b;
        return localContext;
      }
      return null;
    }
  }
  
  @TargetApi(14)
  public static final class a
    implements Application.ActivityLifecycleCallbacks
  {
    Activity a;
    public Context b;
    List<hh.b> c = new ArrayList();
    public boolean d = false;
    public long e;
    private final Object f = new Object();
    private boolean g = true;
    private boolean h = false;
    private Runnable i;
    
    public final void a(Activity paramActivity)
    {
      synchronized (f)
      {
        if (!paramActivity.getClass().getName().startsWith("com.google.android.gms.ads")) {
          a = paramActivity;
        }
        return;
      }
    }
    
    public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
    
    public final void onActivityDestroyed(Activity paramActivity)
    {
      synchronized (f)
      {
        if (a == null) {
          return;
        }
        if (a.equals(paramActivity)) {
          a = null;
        }
        return;
      }
    }
    
    public final void onActivityPaused(Activity paramActivity)
    {
      a(paramActivity);
      h = true;
      if (i != null) {
        tt.a.removeCallbacks(i);
      }
      paramActivity = tt.a;
      Runnable local1 = new Runnable()
      {
        public final void run()
        {
          synchronized (hh.a.a(hh.a.this))
          {
            if ((hh.a.b(hh.a.this)) && (hh.a.c(hh.a.this)))
            {
              hh.a.d(hh.a.this);
              tp.b("App went background");
              Iterator localIterator = hh.a.e(hh.a.this).iterator();
              for (;;)
              {
                if (!localIterator.hasNext()) {
                  break label105;
                }
                hh.b localb = (hh.b)localIterator.next();
                try
                {
                  localb.a(false);
                }
                catch (Exception localException)
                {
                  tp.b("OnForegroundStateChangedListener threw exception.", localException);
                }
              }
            }
          }
          tp.b("App is still foreground");
          label105:
        }
      };
      i = local1;
      paramActivity.postDelayed(local1, e);
    }
    
    public final void onActivityResumed(Activity paramActivity)
    {
      int j = 0;
      a(paramActivity);
      h = false;
      if (!g) {
        j = 1;
      }
      g = true;
      if (i != null) {
        tt.a.removeCallbacks(i);
      }
      paramActivity = f;
      if (j != 0) {
        try
        {
          Iterator localIterator = c.iterator();
          while (localIterator.hasNext())
          {
            hh.b localb = (hh.b)localIterator.next();
            try
            {
              localb.a(true);
            }
            catch (Exception localException)
            {
              tp.b("OnForegroundStateChangedListener threw exception.", localException);
            }
            continue;
            tp.b("App is still foreground.");
          }
        }
        finally {}
      }
    }
    
    public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
    
    public final void onActivityStarted(Activity paramActivity)
    {
      a(paramActivity);
    }
    
    public final void onActivityStopped(Activity paramActivity) {}
  }
  
  public static abstract interface b
  {
    public abstract void a(boolean paramBoolean);
  }
}


/* Location:              com/google/android/gms/b/hh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */