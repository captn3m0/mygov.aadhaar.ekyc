package android.support.v7.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
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
    Object localObject = x.a(this);
    ar localar;
    if (localObject != null) {
      if (x.a(this, (Intent)localObject))
      {
        localar = ar.a(this);
        localObject = null;
        if ((this instanceof ar.a)) {
          localObject = ((ar.a)this).a();
        }
        if (localObject != null) {
          break label224;
        }
        localObject = x.a(this);
      }
    }
    label224:
    for (;;)
    {
      if (localObject != null)
      {
        ComponentName localComponentName2 = ((Intent)localObject).getComponent();
        ComponentName localComponentName1 = localComponentName2;
        if (localComponentName2 == null) {
          localComponentName1 = ((Intent)localObject).resolveActivity(b.getPackageManager());
        }
        localar.a(localComponentName1);
        a.add(localObject);
      }
      if (a.isEmpty()) {
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
      }
      localObject = (Intent[])a.toArray(new Intent[a.size()]);
      localObject[0] = new Intent(localObject[0]).addFlags(268484608);
      if (!android.support.v4.c.a.a(b, (Intent[])localObject))
      {
        localObject = new Intent(localObject[(localObject.length - 1)]);
        ((Intent)localObject).addFlags(268435456);
        b.startActivity((Intent)localObject);
      }
      for (;;)
      {
        try
        {
          android.support.v4.b.a.a(this);
          return true;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
          continue;
        }
        x.b(this, localIllegalStateException);
      }
      return false;
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
    if (m == null) {
      m = g.a(this, this);
    }
    return m;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((android.support.v4.h.g.a(paramKeyEvent)) && (paramKeyEvent.getUnicodeChar(paramKeyEvent.getMetaState() & 0x8FFF) == 60))
    {
      int i = paramKeyEvent.getAction();
      if (i == 0)
      {
        a locala = d().a();
        if ((locala != null) && (locala.b()) && (locala.f()))
        {
          o = true;
          return true;
        }
      }
      else if ((i == 1) && (o))
      {
        o = false;
        return true;
      }
    }
    return super.dispatchKeyEvent(paramKeyEvent);
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
    if ((p == null) && (bh.a())) {
      p = new bh(this, super.getResources());
    }
    if (p == null) {
      return super.getResources();
    }
    return p;
  }
  
  public void invalidateOptionsMenu()
  {
    d().g();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    d().a(paramConfiguration);
    if (p != null)
    {
      DisplayMetrics localDisplayMetrics = super.getResources().getDisplayMetrics();
      p.updateConfiguration(paramConfiguration, localDisplayMetrics);
    }
  }
  
  public void onContentChanged() {}
  
  protected void onCreate(Bundle paramBundle)
  {
    g localg = d();
    localg.j();
    localg.a(paramBundle);
    if ((localg.k()) && (n != 0))
    {
      if (Build.VERSION.SDK_INT < 23) {
        break label55;
      }
      onApplyThemeResource(getTheme(), n, false);
    }
    for (;;)
    {
      super.onCreate(paramBundle);
      return;
      label55:
      setTheme(n);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    d().h();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    a locala = d().a();
    if ((paramMenuItem.getItemId() == 16908332) && (locala != null) && ((locala.a() & 0x4) != 0)) {
      return e();
    }
    return false;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */