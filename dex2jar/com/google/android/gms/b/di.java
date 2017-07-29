package com.google.android.gms.b;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.g.a;
import com.google.android.gms.measurement.AppMeasurement.d;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class di
  extends df
{
  protected a a;
  volatile AppMeasurement.f b;
  AppMeasurement.f c;
  long d;
  final Map<Activity, a> e = new a();
  private final CopyOnWriteArrayList<AppMeasurement.d> f = new CopyOnWriteArrayList();
  private boolean g;
  private AppMeasurement.f h;
  private String i;
  
  public di(dc paramdc)
  {
    super(paramdc);
  }
  
  private static String a(String paramString)
  {
    Object localObject = paramString.split("\\.");
    if (localObject.length == 0) {
      paramString = paramString.substring(0, 36);
    }
    do
    {
      return paramString;
      localObject = localObject[(localObject.length - 1)];
      paramString = (String)localObject;
    } while (((String)localObject).length() <= 36);
    return ((String)localObject).substring(0, 36);
  }
  
  public static void a(AppMeasurement.f paramf, Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramf != null) && (!paramBundle.containsKey("_sc")))
    {
      if (b != null) {
        paramBundle.putString("_sn", b);
      }
      paramBundle.putString("_sc", c);
      paramBundle.putLong("_si", d);
    }
  }
  
  final a a(Activity paramActivity)
  {
    com.google.android.gms.common.internal.c.a(paramActivity);
    a locala2 = (a)e.get(paramActivity);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a(null, a(paramActivity.getClass().getCanonicalName()), super.q().x());
      e.put(paramActivity, locala1);
    }
    return locala1;
  }
  
  protected final void a() {}
  
  final void a(final Activity paramActivity, a parama, final boolean paramBoolean)
  {
    bool2 = true;
    bool1 = true;
    AppMeasurement.d locald = null;
    Object localObject;
    if (b != null)
    {
      localObject = b;
      if (localObject != null) {
        new AppMeasurement.f((AppMeasurement.f)localObject);
      }
      g = true;
    }
    for (;;)
    {
      try
      {
        localObject = f.iterator();
        bool2 = bool1;
        if (!((Iterator)localObject).hasNext()) {
          continue;
        }
        bool2 = bool1;
        locald = (AppMeasurement.d)((Iterator)localObject).next();
        try
        {
          boolean bool3 = locald.a();
          bool1 &= bool3;
        }
        catch (Exception localException2)
        {
          bool2 = bool1;
          ua.a("onScreenChangeCallback threw exception", localException2);
        }
        localObject = locald;
        if (c == null) {
          break;
        }
        localObject = locald;
        if (Math.abs(super.m().b() - d) >= 1000L) {
          break;
        }
        localObject = c;
        break;
      }
      catch (Exception localException1)
      {
        ua.a("onScreenChangeCallback loop threw exception", localException1);
        g = false;
        bool1 = bool2;
        if (!bool1) {
          continue;
        }
        if (c != null) {
          continue;
        }
        c = a(paramActivity.getClass().getCanonicalName());
        paramActivity = new a(parama);
        c = b;
        d = super.m().b();
        b = paramActivity;
        super.t().a(new Runnable()
        {
          public final void run()
          {
            if ((paramBoolean) && (a != null)) {
              di.a(di.this, a);
            }
            a = paramActivity;
            k().a(paramActivity);
          }
        });
        return;
        g = false;
      }
      finally
      {
        g = false;
      }
    }
  }
  
  public final void a(Activity paramActivity, String paramString1, String paramString2)
  {
    int j = Build.VERSION.SDK_INT;
    if (paramActivity == null)
    {
      uc.a("setCurrentScreen must be called with a non-null activity");
      return;
    }
    super.t();
    if (!db.x())
    {
      uc.a("setCurrentScreen must be called from the main thread");
      return;
    }
    if (g)
    {
      uc.a("Cannot call setCurrentScreen from onScreenChangeCallback");
      return;
    }
    if (b == null)
    {
      uc.a("setCurrentScreen cannot be called while no activity active");
      return;
    }
    if (e.get(paramActivity) == null)
    {
      uc.a("setCurrentScreen must be called with an activity in the activity lifecycle");
      return;
    }
    String str = paramString2;
    if (paramString2 == null) {
      str = a(paramActivity.getClass().getCanonicalName());
    }
    boolean bool = b.c.equals(str);
    if (((b.b == null) && (paramString1 == null)) || ((b.b != null) && (b.b.equals(paramString1)))) {}
    for (j = 1; (bool) && (j != 0); j = 0)
    {
      ud.a("setCurrentScreen cannot be called with the same class and name");
      return;
    }
    if ((paramString1 != null) && ((paramString1.length() <= 0) || (paramString1.length() > cf.B())))
    {
      uc.a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(paramString1.length()));
      return;
    }
    if ((str != null) && ((str.length() <= 0) || (str.length() > cf.B())))
    {
      uc.a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
      return;
    }
    cu.a locala = ug;
    if (paramString1 == null) {}
    for (paramString2 = "null";; paramString2 = paramString1)
    {
      locala.a("Setting current screen to name, class", paramString2, str);
      paramString1 = new a(paramString1, str, super.q().x());
      e.put(paramActivity, paramString1);
      a(paramActivity, paramString1, true);
      return;
    }
  }
  
  public final void a(AppMeasurement.d paramd)
  {
    super.c();
    if (paramd == null)
    {
      uc.a("Attempting to register null OnScreenChangeCallback");
      return;
    }
    f.remove(paramd);
    f.add(paramd);
  }
  
  public final void a(String paramString, AppMeasurement.f paramf)
  {
    super.e();
    try
    {
      if ((i == null) || (i.equals(paramString)) || (paramf != null))
      {
        i = paramString;
        h = paramf;
      }
      return;
    }
    finally {}
  }
  
  public final void b(AppMeasurement.d paramd)
  {
    super.c();
    f.remove(paramd);
  }
  
  public final a x()
  {
    J();
    super.e();
    return a;
  }
  
  public final AppMeasurement.f y()
  {
    super.c();
    AppMeasurement.f localf = b;
    if (localf == null) {
      return null;
    }
    return new AppMeasurement.f(localf);
  }
  
  static final class a
    extends AppMeasurement.f
  {
    public boolean a;
    
    public a(a parama)
    {
      b = b;
      c = c;
      d = d;
      a = a;
    }
    
    public a(String paramString1, String paramString2, long paramLong)
    {
      b = paramString1;
      c = paramString2;
      d = paramLong;
      a = false;
    }
  }
}


/* Location:              com/google/android/gms/b/di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */