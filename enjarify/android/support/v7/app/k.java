package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;
import android.view.Window.Callback;

class k
  extends j
{
  private k.b A;
  boolean p = true;
  private int y = -100;
  private boolean z;
  
  k(Context paramContext, Window paramWindow, f paramf)
  {
    super(paramContext, paramWindow, paramf);
  }
  
  private void s()
  {
    Object localObject1 = A;
    if (localObject1 == null)
    {
      k.b localb = new android/support/v7/app/k$b;
      localObject1 = b;
      Object localObject2 = s.a;
      if (localObject2 == null)
      {
        localObject2 = ((Context)localObject1).getApplicationContext();
        s locals = new android/support/v7/app/s;
        localObject1 = (LocationManager)((Context)localObject2).getSystemService("location");
        locals.<init>((Context)localObject2, (LocationManager)localObject1);
        s.a = locals;
      }
      localObject1 = s.a;
      localb.<init>(this, (s)localObject1);
      A = localb;
    }
  }
  
  private boolean t()
  {
    boolean bool1 = true;
    Object localObject1 = null;
    boolean bool2 = z;
    Object localObject2;
    if (bool2)
    {
      localObject2 = b;
      bool2 = localObject2 instanceof Activity;
      if (bool2) {
        localObject2 = b.getPackageManager();
      }
    }
    for (;;)
    {
      try
      {
        localObject3 = new android/content/ComponentName;
        Context localContext = b;
        Object localObject4 = b;
        localObject4 = localObject4.getClass();
        ((ComponentName)localObject3).<init>(localContext, (Class)localObject4);
        localContext = null;
        localObject2 = ((PackageManager)localObject2).getActivityInfo((ComponentName)localObject3, 0);
        int i = configChanges & 0x200;
        if (i != 0) {
          continue;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject2 = "AppCompatDelegate";
        Object localObject3 = "Exception while getting ActivityInfo";
        Log.d((String)localObject2, (String)localObject3, localNameNotFoundException);
        continue;
      }
      return bool1;
      bool1 = false;
      continue;
      bool1 = false;
    }
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    k.a locala = new android/support/v7/app/k$a;
    locala.<init>(this, paramCallback);
    return locala;
  }
  
  public final void a(Bundle paramBundle)
  {
    int i = -100;
    super.a(paramBundle);
    if (paramBundle != null)
    {
      int j = y;
      if (j == i)
      {
        String str = "appcompat:local_night_mode";
        j = paramBundle.getInt(str, i);
        y = j;
      }
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    int i = y;
    int j = -100;
    if (i != j)
    {
      String str = "appcompat:local_night_mode";
      j = y;
      paramBundle.putInt(str, j);
    }
  }
  
  public final void d()
  {
    super.d();
    k();
  }
  
  public final void e()
  {
    super.e();
    k.b localb = A;
    if (localb != null)
    {
      localb = A;
      localb.a();
    }
  }
  
  int f(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return paramInt;
      s();
      k.b localb = A;
      s locals = a;
      boolean bool1 = locals.a();
      b = bool1;
      boolean bool2 = b;
      if (bool2)
      {
        paramInt = 2;
      }
      else
      {
        paramInt = 1;
        continue;
        paramInt = -1;
      }
    }
  }
  
  public final void h()
  {
    super.h();
    k.b localb = A;
    if (localb != null)
    {
      localb = A;
      localb.a();
    }
  }
  
  public final boolean k()
  {
    int i = 1;
    boolean bool = false;
    Object localObject1 = null;
    int k = y;
    int n = -100;
    Object localObject2;
    Object localObject3;
    label91:
    Activity localActivity;
    if (k != n)
    {
      k = y;
      n = k;
      k = f(n);
      int i1 = -1;
      if (k == i1) {
        break label404;
      }
      localObject2 = b.getResources();
      localObject3 = ((Resources)localObject2).getConfiguration();
      int i2 = uiMode & 0x30;
      int i4 = 2;
      if (k != i4) {
        break label282;
      }
      k = 32;
      if (i2 == k) {
        break label395;
      }
      bool = t();
      if (!bool) {
        break label289;
      }
      localActivity = (Activity)b;
      localActivity.recreate();
      label121:
      k = i;
    }
    for (;;)
    {
      if (n == 0)
      {
        s();
        Object localObject4 = A;
        ((k.b)localObject4).a();
        localObject1 = c;
        if (localObject1 == null)
        {
          localObject1 = new android/support/v7/app/k$b$1;
          ((k.b.1)localObject1).<init>((k.b)localObject4);
          c = ((BroadcastReceiver)localObject1);
        }
        localObject1 = d;
        if (localObject1 == null)
        {
          localObject1 = new android/content/IntentFilter;
          ((IntentFilter)localObject1).<init>();
          d = ((IntentFilter)localObject1);
          d.addAction("android.intent.action.TIME_SET");
          d.addAction("android.intent.action.TIMEZONE_CHANGED");
          localObject1 = d;
          localObject2 = "android.intent.action.TIME_TICK";
          ((IntentFilter)localObject1).addAction((String)localObject2);
        }
        localObject1 = e.b;
        localObject2 = c;
        localObject4 = d;
        ((Context)localObject1).registerReceiver((BroadcastReceiver)localObject2, (IntentFilter)localObject4);
      }
      z = i;
      return k;
      int m = g.a;
      n = m;
      break;
      label282:
      m = 16;
      break label91;
      label289:
      localObject1 = new android/content/res/Configuration;
      ((Configuration)localObject1).<init>((Configuration)localObject3);
      localObject3 = ((Resources)localObject2).getDisplayMetrics();
      int i3 = uiMode & 0xFFFFFFCF;
      m |= i3;
      uiMode = m;
      ((Resources)localObject2).updateConfiguration((Configuration)localObject1, (DisplayMetrics)localObject3);
      m = Build.VERSION.SDK_INT;
      int j = 24;
      if (m >= j)
      {
        p.c((Resources)localObject2);
        break label121;
      }
      j = 23;
      if (m >= j)
      {
        p.b((Resources)localObject2);
        break label121;
      }
      j = 21;
      if (m < j) {
        break label121;
      }
      p.a((Resources)localObject2);
      break label121;
      label395:
      m = 0;
      localActivity = null;
      continue;
      label404:
      m = 0;
      localActivity = null;
    }
  }
}


/* Location:              android/support/v7/app/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */