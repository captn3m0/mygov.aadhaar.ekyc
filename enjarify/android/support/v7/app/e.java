package android.support.v7.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.ar;
import android.support.v4.b.ar.a;
import android.support.v4.b.j;
import android.support.v4.b.x;
import android.support.v7.widget.bh;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public class e
  extends j
  implements ar.a, b.b, f
{
  private g m;
  private int n = 0;
  private boolean o;
  private Resources p;
  
  private boolean e()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = x.a(this);
    ar localar;
    boolean bool3;
    if (localObject2 != null)
    {
      boolean bool2 = x.a(this, (Intent)localObject2);
      if (bool2)
      {
        localar = ar.a(this);
        bool3 = false;
        localObject2 = null;
        bool2 = this instanceof ar.a;
        if (bool2)
        {
          localObject2 = this;
          localObject2 = ((ar.a)this).a();
        }
        if (localObject2 != null) {
          break label320;
        }
        localObject2 = x.a((Activity)this);
      }
    }
    Object localObject3;
    label320:
    for (Object localObject4 = localObject2;; localObject4 = localObject3)
    {
      if (localObject4 != null)
      {
        localObject2 = ((Intent)localObject4).getComponent();
        if (localObject2 == null)
        {
          localObject2 = b.getPackageManager();
          localObject2 = ((Intent)localObject4).resolveActivity((PackageManager)localObject2);
        }
        localar.a((ComponentName)localObject2);
        localObject2 = a;
        ((ArrayList)localObject2).add(localObject4);
      }
      localObject2 = a;
      bool3 = ((ArrayList)localObject2).isEmpty();
      if (bool3)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("No intents added to TaskStackBuilder; cannot startActivities");
        throw ((Throwable)localObject2);
      }
      localObject2 = a;
      int i = a.size();
      localObject4 = new Intent[i];
      localObject2 = (Intent[])((ArrayList)localObject2).toArray((Object[])localObject4);
      localObject4 = new android/content/Intent;
      Intent localIntent = localObject2[0];
      ((Intent)localObject4).<init>(localIntent);
      int i1 = 268484608;
      localObject4 = ((Intent)localObject4).addFlags(i1);
      localObject2[0] = localObject4;
      localObject1 = b;
      bool1 = android.support.v4.c.a.a((Context)localObject1, (Intent[])localObject2);
      int j;
      if (!bool1)
      {
        localObject1 = new android/content/Intent;
        i = localObject2.length + -1;
        localObject2 = localObject2[i];
        ((Intent)localObject1).<init>((Intent)localObject2);
        j = 268435456;
        ((Intent)localObject1).addFlags(j);
        localObject2 = b;
        ((Context)localObject2).startActivity((Intent)localObject1);
      }
      for (;;)
      {
        try
        {
          android.support.v4.b.a.a((Activity)this);
          j = 1;
          return j;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          ((e)this).finish();
          continue;
        }
        x.b(this, localIllegalStateException);
        continue;
        int k = 0;
        localObject3 = null;
      }
    }
  }
  
  public final Intent a()
  {
    return x.a(this);
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    d().b(paramView, paramLayoutParams);
  }
  
  public final void b()
  {
    d().g();
  }
  
  public final b.a c()
  {
    return d().i();
  }
  
  public final g d()
  {
    g localg = m;
    if (localg == null)
    {
      localg = g.a(this, this);
      m = localg;
    }
    return m;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    boolean bool2 = android.support.v4.h.g.a(paramKeyEvent);
    a locala;
    boolean bool3;
    if (bool2)
    {
      int i = paramKeyEvent.getMetaState() & 0x8FFF;
      i = paramKeyEvent.getUnicodeChar(i);
      int j = 60;
      if (i == j)
      {
        i = paramKeyEvent.getAction();
        if (i == 0)
        {
          locala = d().a();
          if (locala == null) {
            break label115;
          }
          boolean bool4 = locala.b();
          if (!bool4) {
            break label115;
          }
          bool3 = locala.f();
          if (!bool3) {
            break label115;
          }
          o = bool1;
        }
      }
    }
    for (;;)
    {
      return bool1;
      if (bool3 == bool1)
      {
        bool3 = o;
        if (bool3)
        {
          bool3 = false;
          locala = null;
          o = false;
          continue;
        }
      }
      label115:
      bool1 = super.dispatchKeyEvent(paramKeyEvent);
    }
  }
  
  public View findViewById(int paramInt)
  {
    return d().a(paramInt);
  }
  
  public MenuInflater getMenuInflater()
  {
    return d().b();
  }
  
  public Resources getResources()
  {
    Object localObject = p;
    if (localObject == null)
    {
      boolean bool = bh.a();
      if (bool)
      {
        localObject = new android/support/v7/widget/bh;
        Resources localResources = super.getResources();
        ((bh)localObject).<init>(this, localResources);
        p = ((Resources)localObject);
      }
    }
    localObject = p;
    if (localObject == null) {}
    for (localObject = super.getResources();; localObject = p) {
      return (Resources)localObject;
    }
  }
  
  public void invalidateOptionsMenu()
  {
    d().g();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    d().a(paramConfiguration);
    Object localObject = p;
    if (localObject != null)
    {
      localObject = super.getResources().getDisplayMetrics();
      Resources localResources = p;
      localResources.updateConfiguration(paramConfiguration, (DisplayMetrics)localObject);
    }
  }
  
  public void onContentChanged() {}
  
  protected void onCreate(Bundle paramBundle)
  {
    Object localObject = d();
    ((g)localObject).j();
    ((g)localObject).a(paramBundle);
    boolean bool = ((g)localObject).k();
    int i;
    if (bool)
    {
      i = n;
      if (i != 0)
      {
        i = Build.VERSION.SDK_INT;
        int j = 23;
        if (i < j) {
          break label71;
        }
        localObject = getTheme();
        j = n;
        onApplyThemeResource((Resources.Theme)localObject, j, false);
      }
    }
    for (;;)
    {
      super.onCreate(paramBundle);
      return;
      label71:
      i = n;
      setTheme(i);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    d().h();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool1 = super.onMenuItemSelected(paramInt, paramMenuItem);
    if (bool1) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      a locala = d().a();
      int j = paramMenuItem.getItemId();
      int k = 16908332;
      if ((j == k) && (locala != null))
      {
        int i = locala.a() & 0x4;
        if (i != 0)
        {
          bool2 = e();
          continue;
        }
      }
      boolean bool2 = false;
      locala = null;
    }
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    d().c();
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    d().f();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    d().b(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    d().d();
  }
  
  protected void onStop()
  {
    super.onStop();
    d().e();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    d().a(paramCharSequence);
  }
  
  public void setContentView(int paramInt)
  {
    d().b(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    d().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    d().a(paramView, paramLayoutParams);
  }
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    n = paramInt;
  }
}


/* Location:              android/support/v7/app/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */