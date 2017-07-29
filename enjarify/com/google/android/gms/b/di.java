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
  protected di.a a;
  volatile AppMeasurement.f b;
  AppMeasurement.f c;
  long d;
  final Map e;
  private final CopyOnWriteArrayList f;
  private boolean g;
  private AppMeasurement.f h;
  private String i;
  
  public di(dc paramdc)
  {
    super(paramdc);
    Object localObject = new android/support/v4/g/a;
    ((a)localObject).<init>();
    e = ((Map)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    f = ((CopyOnWriteArrayList)localObject);
  }
  
  private static String a(String paramString)
  {
    int j = 36;
    Object localObject = paramString.split("\\.");
    int k = localObject.length;
    if (k == 0) {
      localObject = paramString.substring(0, j);
    }
    for (;;)
    {
      return (String)localObject;
      k = localObject.length + -1;
      localObject = localObject[k];
      k = ((String)localObject).length();
      if (k > j) {
        localObject = ((String)localObject).substring(0, j);
      }
    }
  }
  
  public static void a(AppMeasurement.f paramf, Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramf != null))
    {
      String str1 = "_sc";
      boolean bool = paramBundle.containsKey(str1);
      if (!bool)
      {
        str1 = b;
        if (str1 != null)
        {
          str1 = "_sn";
          str2 = b;
          paramBundle.putString(str1, str2);
        }
        String str2 = c;
        paramBundle.putString("_sc", str2);
        str1 = "_si";
        long l = d;
        paramBundle.putLong(str1, l);
      }
    }
  }
  
  final di.a a(Activity paramActivity)
  {
    com.google.android.gms.common.internal.c.a(paramActivity);
    di.a locala = (di.a)e.get(paramActivity);
    if (locala == null)
    {
      Object localObject = a(paramActivity.getClass().getCanonicalName());
      locala = new com/google/android/gms/b/di$a;
      dr localdr = super.q();
      long l = localdr.x();
      locala.<init>(null, (String)localObject, l);
      localObject = e;
      ((Map)localObject).put(paramActivity, locala);
    }
    return locala;
  }
  
  protected final void a() {}
  
  final void a(Activity paramActivity, di.a parama, boolean paramBoolean)
  {
    bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    localObject4 = b;
    if (localObject4 != null)
    {
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject4 = new com/google/android/gms/measurement/AppMeasurement$f;
        ((AppMeasurement.f)localObject4).<init>((AppMeasurement.f)localObject1);
      }
      g = bool1;
    }
    for (;;)
    {
      try
      {
        localObject1 = f;
        localObject4 = ((CopyOnWriteArrayList)localObject1).iterator();
        bool2 = ((Iterator)localObject4).hasNext();
        if (!bool2) {
          continue;
        }
        localObject1 = ((Iterator)localObject4).next();
        localObject1 = (AppMeasurement.d)localObject1;
        try
        {
          bool2 = ((AppMeasurement.d)localObject1).a();
          bool1 &= bool2;
        }
        catch (Exception localException1)
        {
          long l2;
          boolean bool3;
          localObject5 = super.u();
          localObject5 = a;
          String str = "onScreenChangeCallback threw exception";
          ((cu.a)localObject5).a(str, localException1);
        }
        localObject4 = c;
        if (localObject4 == null) {
          break;
        }
        localObject4 = super.m();
        l1 = ((com.google.android.gms.common.util.c)localObject4).b();
        l2 = d;
        l1 = Math.abs(l1 - l2);
        l2 = 1000L;
        bool3 = l1 < l2;
        if (!bool3) {
          break;
        }
        localObject1 = c;
        break;
      }
      catch (Exception localException2)
      {
        localObject4 = super.u();
        localObject4 = a;
        Object localObject5 = "onScreenChangeCallback loop threw exception";
        ((cu.a)localObject4).a((String)localObject5, localException2);
        g = false;
        if (!bool1) {
          continue;
        }
        Object localObject2 = c;
        if (localObject2 != null) {
          continue;
        }
        localObject2 = a(paramActivity.getClass().getCanonicalName());
        c = ((String)localObject2);
        localObject2 = new com/google/android/gms/b/di$a;
        ((di.a)localObject2).<init>(parama);
        Object localObject6 = b;
        c = ((AppMeasurement.f)localObject6);
        long l1 = super.m().b();
        d = l1;
        b = ((AppMeasurement.f)localObject2);
        localObject6 = super.t();
        localObject4 = new com/google/android/gms/b/di$1;
        ((di.1)localObject4).<init>(this, paramBoolean, (di.a)localObject2);
        ((db)localObject6).a((Runnable)localObject4);
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
    boolean bool1 = true;
    int j = Build.VERSION.SDK_INT;
    String str1;
    if (paramActivity == null)
    {
      localObject1 = uc;
      str1 = "setCurrentScreen must be called with a non-null activity";
      ((cu.a)localObject1).a(str1);
    }
    for (;;)
    {
      return;
      super.t();
      boolean bool2 = db.x();
      if (!bool2)
      {
        localObject1 = uc;
        str1 = "setCurrentScreen must be called from the main thread";
        ((cu.a)localObject1).a(str1);
      }
      else
      {
        bool2 = g;
        if (bool2)
        {
          localObject1 = uc;
          str1 = "Cannot call setCurrentScreen from onScreenChangeCallback";
          ((cu.a)localObject1).a(str1);
        }
        else
        {
          localObject1 = b;
          if (localObject1 == null)
          {
            localObject1 = uc;
            str1 = "setCurrentScreen cannot be called while no activity active";
            ((cu.a)localObject1).a(str1);
          }
          else
          {
            localObject1 = e.get(paramActivity);
            if (localObject1 == null)
            {
              localObject1 = uc;
              str1 = "setCurrentScreen must be called with an activity in the activity lifecycle";
              ((cu.a)localObject1).a(str1);
            }
            else
            {
              if (paramString2 == null)
              {
                localObject1 = paramActivity.getClass().getCanonicalName();
                paramString2 = a((String)localObject1);
              }
              boolean bool3 = b.c.equals(paramString2);
              localObject1 = b.b;
              if ((localObject1 != null) || (paramString1 != null))
              {
                localObject1 = b.b;
                if (localObject1 != null)
                {
                  localObject1 = b.b;
                  bool2 = ((String)localObject1).equals(paramString1);
                  if (!bool2) {}
                }
              }
              else
              {
                bool2 = bool1;
              }
              for (;;)
              {
                if ((!bool3) || (!bool2)) {
                  break label312;
                }
                localObject1 = ud;
                str1 = "setCurrentScreen cannot be called with the same class and name";
                ((cu.a)localObject1).a(str1);
                break;
                bool2 = false;
                localObject1 = null;
              }
              label312:
              if (paramString1 != null)
              {
                k = paramString1.length();
                if (k > 0)
                {
                  k = paramString1.length();
                  m = cf.B();
                  if (k <= m) {}
                }
                else
                {
                  localObject1 = uc;
                  str1 = "Invalid screen name length in setCurrentScreen. Length";
                  m = paramString1.length();
                  localObject2 = Integer.valueOf(m);
                  ((cu.a)localObject1).a(str1, localObject2);
                  continue;
                }
              }
              if (paramString2 == null) {
                break;
              }
              int k = paramString2.length();
              if (k > 0)
              {
                k = paramString2.length();
                m = cf.B();
                if (k <= m) {
                  break;
                }
              }
              localObject1 = uc;
              str1 = "Invalid class name length in setCurrentScreen. Length";
              int m = paramString2.length();
              localObject2 = Integer.valueOf(m);
              ((cu.a)localObject1).a(str1, localObject2);
            }
          }
        }
      }
    }
    Object localObject1 = super.u();
    Object localObject2 = g;
    String str2 = "Setting current screen to name, class";
    if (paramString1 == null) {}
    for (localObject1 = "null";; localObject1 = paramString1)
    {
      ((cu.a)localObject2).a(str2, localObject1, paramString2);
      localObject1 = new com/google/android/gms/b/di$a;
      long l = super.q().x();
      ((di.a)localObject1).<init>(paramString1, paramString2, l);
      localObject2 = e;
      ((Map)localObject2).put(paramActivity, localObject1);
      a(paramActivity, (di.a)localObject1, bool1);
      break;
    }
  }
  
  public final void a(AppMeasurement.d paramd)
  {
    super.c();
    Object localObject;
    if (paramd == null)
    {
      localObject = uc;
      String str = "Attempting to register null OnScreenChangeCallback";
      ((cu.a)localObject).a(str);
    }
    for (;;)
    {
      return;
      f.remove(paramd);
      localObject = f;
      ((CopyOnWriteArrayList)localObject).add(paramd);
    }
  }
  
  public final void a(String paramString, AppMeasurement.f paramf)
  {
    super.e();
    try
    {
      String str = i;
      if (str != null)
      {
        str = i;
        boolean bool = str.equals(paramString);
        if ((!bool) && (paramf == null)) {}
      }
      else
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
  
  public final di.a x()
  {
    J();
    super.e();
    return a;
  }
  
  public final AppMeasurement.f y()
  {
    super.c();
    AppMeasurement.f localf1 = b;
    AppMeasurement.f localf2;
    if (localf1 == null) {
      localf2 = null;
    }
    for (;;)
    {
      return localf2;
      localf2 = new com/google/android/gms/measurement/AppMeasurement$f;
      localf2.<init>(localf1);
    }
  }
}


/* Location:              com/google/android/gms/b/di.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */