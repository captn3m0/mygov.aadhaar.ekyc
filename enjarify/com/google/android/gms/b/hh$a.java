package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hh$a
  implements Application.ActivityLifecycleCallbacks
{
  Activity a;
  public Context b;
  List c;
  public boolean d;
  public long e;
  private final Object f;
  private boolean g;
  private boolean h;
  private Runnable i;
  
  public hh$a()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    f = localObject;
    g = true;
    h = false;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = ((List)localObject);
    d = false;
  }
  
  public final void a(Activity paramActivity)
  {
    synchronized (f)
    {
      Object localObject2 = paramActivity.getClass();
      localObject2 = ((Class)localObject2).getName();
      String str = "com.google.android.gms.ads";
      boolean bool = ((String)localObject2).startsWith(str);
      if (!bool) {
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
      Activity localActivity = a;
      if (localActivity == null) {
        return;
      }
      localActivity = a;
      boolean bool = localActivity.equals(paramActivity);
      if (bool)
      {
        bool = false;
        localActivity = null;
        a = null;
      }
    }
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(paramActivity);
    boolean bool = true;
    h = bool;
    Object localObject1 = i;
    if (localObject1 != null)
    {
      localObject1 = tt.a;
      localObject2 = i;
      ((Handler)localObject1).removeCallbacks((Runnable)localObject2);
    }
    localObject1 = tt.a;
    Object localObject2 = new com/google/android/gms/b/hh$a$1;
    ((hh.a.1)localObject2).<init>(this);
    i = ((Runnable)localObject2);
    long l = e;
    ((Handler)localObject1).postDelayed((Runnable)localObject2, l);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    a(paramActivity);
    h = false;
    boolean bool3 = g;
    if (!bool3) {
      bool1 = bool2;
    }
    g = bool2;
    Object localObject3 = i;
    Object localObject4;
    if (localObject3 != null)
    {
      localObject3 = tt.a;
      localObject4 = i;
      ((Handler)localObject3).removeCallbacks((Runnable)localObject4);
    }
    localObject3 = f;
    if (bool1) {
      try
      {
        localObject1 = c;
        localObject4 = ((List)localObject1).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject4).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject4).next();
          localObject1 = (hh.b)localObject1;
          boolean bool4 = true;
          try
          {
            ((hh.b)localObject1).a(bool4);
          }
          catch (Exception localException)
          {
            String str2 = "OnForegroundStateChangedListener threw exception.";
            tp.b(str2, localException);
          }
        }
        str1 = "App is still foreground.";
      }
      finally {}
    }
    String str1;
    tp.b(str1);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(paramActivity);
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              com/google/android/gms/b/hh$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */