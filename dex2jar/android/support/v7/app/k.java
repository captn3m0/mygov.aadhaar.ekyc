package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.h.ae;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.d;
import android.support.v7.view.e;
import android.support.v7.view.f.a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.Window.Callback;
import android.widget.PopupWindow;

@TargetApi(14)
class k
  extends j
{
  private b A;
  boolean p = true;
  private int y = -100;
  private boolean z;
  
  k(Context paramContext, Window paramWindow, f paramf)
  {
    super(paramContext, paramWindow, paramf);
  }
  
  private void s()
  {
    if (A == null)
    {
      Context localContext = b;
      if (s.a == null)
      {
        localContext = localContext.getApplicationContext();
        s.a = new s(localContext, (LocationManager)localContext.getSystemService("location"));
      }
      A = new b(s.a);
    }
  }
  
  private boolean t()
  {
    if ((z) && ((b instanceof Activity)))
    {
      PackageManager localPackageManager = b.getPackageManager();
      try
      {
        int i = getActivityInfoComponentNameb, b.getClass()), 0).configChanges;
        return (i & 0x200) == 0;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", localNameNotFoundException);
        return true;
      }
    }
    return false;
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (y == -100)) {
      y = paramBundle.getInt("appcompat:local_night_mode", -100);
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    if (y != -100) {
      paramBundle.putInt("appcompat:local_night_mode", y);
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
    if (A != null) {
      A.a();
    }
  }
  
  int f(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramInt;
    case 0: 
      s();
      b localb = A;
      b = a.a();
      if (b) {
        return 2;
      }
      return 1;
    }
    return -1;
  }
  
  public final void h()
  {
    super.h();
    if (A != null) {
      A.a();
    }
  }
  
  public final boolean k()
  {
    int i;
    int j;
    Object localObject;
    Configuration localConfiguration;
    label55:
    label80:
    boolean bool;
    if (y != -100)
    {
      i = y;
      j = f(i);
      if (j == -1) {
        break label314;
      }
      localObject = b.getResources();
      localConfiguration = ((Resources)localObject).getConfiguration();
      int k = uiMode;
      if (j != 2) {
        break label211;
      }
      j = 32;
      if ((k & 0x30) == j) {
        break label308;
      }
      if (!t()) {
        break label217;
      }
      ((Activity)b).recreate();
      bool = true;
    }
    for (;;)
    {
      if (i == 0)
      {
        s();
        localObject = A;
        ((b)localObject).a();
        if (c == null) {
          c = new k.b.1((b)localObject);
        }
        if (d == null)
        {
          d = new IntentFilter();
          d.addAction("android.intent.action.TIME_SET");
          d.addAction("android.intent.action.TIMEZONE_CHANGED");
          d.addAction("android.intent.action.TIME_TICK");
        }
        e.b.registerReceiver(c, d);
      }
      z = true;
      return bool;
      i = g.a;
      break;
      label211:
      j = 16;
      break label55;
      label217:
      localConfiguration = new Configuration(localConfiguration);
      DisplayMetrics localDisplayMetrics = ((Resources)localObject).getDisplayMetrics();
      uiMode = (j | uiMode & 0xFFFFFFCF);
      ((Resources)localObject).updateConfiguration(localConfiguration, localDisplayMetrics);
      j = Build.VERSION.SDK_INT;
      if (j >= 24)
      {
        p.c((Resources)localObject);
        break label80;
      }
      if (j >= 23)
      {
        p.b((Resources)localObject);
        break label80;
      }
      if (j < 21) {
        break label80;
      }
      p.a((Resources)localObject);
      break label80;
      label308:
      bool = false;
      continue;
      label314:
      bool = false;
    }
  }
  
  class a
    extends h.b
  {
    a(Window.Callback paramCallback)
    {
      super(paramCallback);
    }
    
    final ActionMode a(ActionMode.Callback paramCallback)
    {
      f.a locala = new f.a(b, paramCallback);
      k localk = k.this;
      if (q != null) {
        q.c();
      }
      m.b localb = new m.b(localk, locala);
      paramCallback = localk.a();
      if (paramCallback != null) {
        q = paramCallback.a(localb);
      }
      label332:
      boolean bool;
      if (q == null)
      {
        localk.p();
        if (q != null) {
          q.c();
        }
        Object localObject;
        if (r == null)
        {
          if (!l) {
            break label540;
          }
          localObject = new TypedValue();
          paramCallback = b.getTheme();
          paramCallback.resolveAttribute(a.a.actionBarTheme, (TypedValue)localObject, true);
          if (resourceId == 0) {
            break label531;
          }
          Resources.Theme localTheme = b.getResources().newTheme();
          localTheme.setTo(paramCallback);
          localTheme.applyStyle(resourceId, true);
          paramCallback = new d(b, 0);
          paramCallback.getTheme().setTo(localTheme);
          r = new ActionBarContextView(paramCallback);
          s = new PopupWindow(paramCallback, null, a.a.actionModePopupWindowStyle);
          android.support.v4.widget.j.a(s, 2);
          s.setContentView(r);
          s.setWidth(-1);
          paramCallback.getTheme().resolveAttribute(a.a.actionBarSize, (TypedValue)localObject, true);
          int i = TypedValue.complexToDimensionPixelSize(data, paramCallback.getResources().getDisplayMetrics());
          r.setContentHeight(i);
          s.setHeight(-2);
          t = new m.5(localk);
        }
        if (r != null)
        {
          localk.p();
          r.b();
          paramCallback = r.getContext();
          localObject = r;
          if (s != null) {
            break label586;
          }
          bool = true;
          label379:
          paramCallback = new e(paramCallback, (ActionBarContextView)localObject, localb, bool);
          if (!localb.a(paramCallback, paramCallback.b())) {
            break label650;
          }
          paramCallback.d();
          r.a(paramCallback);
          q = paramCallback;
          if (!localk.o()) {
            break label591;
          }
          w.c(r, 0.0F);
          u = w.s(r).a(1.0F);
          u.a(new m.6(localk));
          label479:
          if (s != null) {
            c.getDecorView().post(t);
          }
        }
      }
      for (;;)
      {
        q = q;
        paramCallback = q;
        if (paramCallback == null) {
          break label659;
        }
        return locala.b(paramCallback);
        label531:
        paramCallback = b;
        break;
        label540:
        paramCallback = (ViewStubCompat)v.findViewById(a.f.action_mode_bar_stub);
        if (paramCallback == null) {
          break label332;
        }
        paramCallback.setLayoutInflater(LayoutInflater.from(localk.n()));
        r = ((ActionBarContextView)paramCallback.a());
        break label332;
        label586:
        bool = false;
        break label379;
        label591:
        w.c(r, 1.0F);
        r.setVisibility(0);
        r.sendAccessibilityEvent(32);
        if (!(r.getParent() instanceof View)) {
          break label479;
        }
        w.w((View)r.getParent());
        break label479;
        label650:
        q = null;
      }
      label659:
      return null;
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      if (p) {
        return a(paramCallback);
      }
      return super.onWindowStartingActionMode(paramCallback);
    }
  }
  
  final class b
  {
    s a;
    boolean b;
    BroadcastReceiver c;
    IntentFilter d;
    
    b(s params)
    {
      a = params;
      b = params.a();
    }
    
    final void a()
    {
      if (c != null)
      {
        b.unregisterReceiver(c);
        c = null;
      }
    }
  }
}


/* Location:              android/support/v7/app/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */