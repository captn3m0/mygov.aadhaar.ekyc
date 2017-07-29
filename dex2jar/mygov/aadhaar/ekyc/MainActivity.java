package mygov.aadhaar.ekyc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.a;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.f;
import android.support.v7.app.b.a;
import android.support.v7.app.e;
import android.support.v7.app.g;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.h;

public class MainActivity
  extends e
  implements NavigationView.a
{
  public static ViewFlipper m;
  public static ViewFlipper n;
  public static ImageView o;
  public static ImageView p;
  public static TranslateAnimation r = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 1.0F, 2, 0.0F);
  public static TranslateAnimation s = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, -1.0F);
  public static h t;
  private static e u;
  public ViewAnimator q;
  
  public static e e()
  {
    return u;
  }
  
  private static void g()
  {
    c localc = new c.a().a("356F6E0B69BED421").a();
    t.a(localc);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == 2131624114) {
      q.setDisplayedChild(0);
    }
    for (;;)
    {
      ((DrawerLayout)findViewById(2131624058)).a();
      return true;
      if (i == 2131624115)
      {
        q.setDisplayedChild(1);
      }
      else if (i == 2131624116)
      {
        paramMenuItem = new Intent("android.intent.action.SEND");
        paramMenuItem.setType("text/plain");
        paramMenuItem.putExtra("android.intent.extra.SUBJECT", "Download Aadhaar eKYC app to do instant KYC verification");
        paramMenuItem.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=mygov.aadhaar.ekyc");
        startActivity(Intent.createChooser(paramMenuItem, "Share via"));
      }
    }
  }
  
  public void onBackPressed()
  {
    DrawerLayout localDrawerLayout = (DrawerLayout)findViewById(2131624058);
    if (localDrawerLayout.b())
    {
      localDrawerLayout.a();
      return;
    }
    super.onBackPressed();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968603);
    u = this;
    paramBundle = new h(this);
    t = paramBundle;
    paramBundle.a("ca-app-pub-8271969521639150/1238009429");
    Object localObject = (Toolbar)findViewById(2131624060);
    d().a((Toolbar)localObject);
    paramBundle = (DrawerLayout)findViewById(2131624058);
    localObject = new android.support.v7.app.b(this, paramBundle, (Toolbar)localObject);
    paramBundle.setDrawerListener((DrawerLayout.f)localObject);
    if (b.b()) {
      ((android.support.v7.app.b)localObject).b(1.0F);
    }
    for (;;)
    {
      int i;
      if (d)
      {
        paramBundle = c;
        if (b.b())
        {
          i = f;
          if ((!h) && (!a.c()))
          {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            h = true;
          }
          a.a(paramBundle, i);
        }
      }
      else
      {
        ((NavigationView)findViewById(2131624059)).setNavigationItemSelectedListener(this);
        ((Button)findViewById(2131624071)).setOnClickListener(new mygov.aadhaar.ekyc.a.b());
        ((Button)findViewById(2131624063)).setOnClickListener(new mygov.aadhaar.ekyc.a.a());
        m = (ViewFlipper)findViewById(2131624072);
        o = (ImageView)u.findViewById(2131624074);
        n = (ViewFlipper)findViewById(2131624064);
        p = (ImageView)u.findViewById(2131624066);
        q = ((ViewAnimator)findViewById(2131624076));
        r.setDuration(500L);
        s.setDuration(500L);
        q.setInAnimation(r);
        q.setOutAnimation(s);
        t.a(new com.google.android.gms.ads.a()
        {
          public final void c() {}
        });
        g();
      }
      try
      {
        a.c = getPackageManagergetPackageInfogetApplicationContextgetPackageName0versionName;
        ((Button)findViewById(2131624075)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            q.setDisplayedChild(1);
          }
        });
        ((Button)findViewById(2131624068)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            q.setDisplayedChild(0);
          }
        });
        return;
        ((android.support.v7.app.b)localObject).b(0.0F);
        continue;
        i = e;
      }
      catch (PackageManager.NameNotFoundException paramBundle)
      {
        for (;;)
        {
          paramBundle.printStackTrace();
        }
      }
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131689473, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131624117) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:              mygov/aadhaar/ekyc/MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */