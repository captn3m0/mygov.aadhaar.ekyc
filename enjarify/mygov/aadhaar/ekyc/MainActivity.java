package mygov.aadhaar.ekyc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
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
import android.view.View.OnClickListener;
import android.view.animation.Animation;
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
  public static TranslateAnimation r;
  public static TranslateAnimation s;
  public static h t;
  private static e u;
  public ViewAnimator q;
  
  static
  {
    int i = 2;
    TranslateAnimation localTranslateAnimation = new android/view/animation/TranslateAnimation;
    localTranslateAnimation.<init>(i, 0.0F, i, 0.0F, i, 1.0F, i, 0.0F);
    r = localTranslateAnimation;
    localTranslateAnimation = new android/view/animation/TranslateAnimation;
    localTranslateAnimation.<init>(i, 0.0F, i, 0.0F, i, 0.0F, i, -1.0F);
    s = localTranslateAnimation;
  }
  
  public static e e()
  {
    return u;
  }
  
  private static void g()
  {
    Object localObject = new com/google/android/gms/ads/c$a;
    ((c.a)localObject).<init>();
    localObject = ((c.a)localObject).a("356F6E0B69BED421").a();
    t.a((c)localObject);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = 1;
    int j = paramMenuItem.getItemId();
    int k = 2131624114;
    Object localObject;
    String str1;
    if (j == k)
    {
      localObject = q;
      k = 0;
      str1 = null;
      ((ViewAnimator)localObject).setDisplayedChild(0);
    }
    for (;;)
    {
      ((DrawerLayout)findViewById(2131624058)).a();
      return i;
      k = 2131624115;
      if (j == k)
      {
        localObject = q;
        ((ViewAnimator)localObject).setDisplayedChild(i);
      }
      else
      {
        k = 2131624116;
        if (j == k)
        {
          localObject = new android/content/Intent;
          ((Intent)localObject).<init>("android.intent.action.SEND");
          ((Intent)localObject).setType("text/plain");
          String str2 = "Download Aadhaar eKYC app to do instant KYC verification";
          ((Intent)localObject).putExtra("android.intent.extra.SUBJECT", str2);
          String str3 = "android.intent.extra.TEXT";
          ((Intent)localObject).putExtra(str3, "https://play.google.com/store/apps/details?id=mygov.aadhaar.ekyc");
          str1 = "Share via";
          localObject = Intent.createChooser((Intent)localObject, str1);
          startActivity((Intent)localObject);
        }
      }
    }
  }
  
  public void onBackPressed()
  {
    int i = 2131624058;
    DrawerLayout localDrawerLayout = (DrawerLayout)findViewById(i);
    boolean bool = localDrawerLayout.b();
    if (bool) {
      localDrawerLayout.a();
    }
    for (;;)
    {
      return;
      super.onBackPressed();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    long l = 500L;
    super.onCreate(paramBundle);
    setContentView(2130968603);
    u = this;
    Object localObject1 = new com/google/android/gms/ads/h;
    ((h)localObject1).<init>(this);
    t = (h)localObject1;
    ((h)localObject1).a("ca-app-pub-8271969521639150/1238009429");
    float f = 1.887529E38F;
    localObject1 = (Toolbar)findViewById(2131624060);
    d().a((Toolbar)localObject1);
    int i = 2131624058;
    Object localObject2 = (DrawerLayout)findViewById(i);
    Object localObject3 = new android/support/v7/app/b;
    ((android.support.v7.app.b)localObject3).<init>(this, (DrawerLayout)localObject2, (Toolbar)localObject1);
    ((DrawerLayout)localObject2).setDrawerListener((DrawerLayout.f)localObject3);
    localObject1 = b;
    boolean bool1 = ((DrawerLayout)localObject1).b();
    if (bool1)
    {
      int j = 1065353216;
      f = 1.0F;
      ((android.support.v7.app.b)localObject3).b(f);
      boolean bool2 = d;
      if (bool2)
      {
        localObject2 = c;
        localObject1 = b;
        bool2 = ((DrawerLayout)localObject1).b();
        if (!bool2) {
          break label616;
        }
      }
    }
    label616:
    for (int k = f;; k = e)
    {
      boolean bool3 = h;
      if (!bool3)
      {
        Object localObject4 = a;
        bool3 = ((b.a)localObject4).c();
        if (!bool3)
        {
          localObject4 = "ActionBarDrawerToggle";
          String str = "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);";
          Log.w((String)localObject4, str);
          bool3 = true;
          h = bool3;
        }
      }
      localObject3 = a;
      ((b.a)localObject3).a((Drawable)localObject2, k);
      ((NavigationView)findViewById(2131624059)).setNavigationItemSelectedListener(this);
      localObject1 = (Button)findViewById(2131624071);
      localObject2 = new mygov/aadhaar/ekyc/a/b;
      ((mygov.aadhaar.ekyc.a.b)localObject2).<init>();
      ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      localObject1 = (Button)findViewById(2131624063);
      localObject2 = new mygov/aadhaar/ekyc/a/a;
      ((mygov.aadhaar.ekyc.a.a)localObject2).<init>();
      ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      m = (ViewFlipper)findViewById(2131624072);
      o = (ImageView)u.findViewById(2131624074);
      n = (ViewFlipper)findViewById(2131624064);
      localObject1 = u;
      i = 2131624066;
      p = (ImageView)((e)localObject1).findViewById(i);
      k = 2131624076;
      f = 1.8875321E38F;
      localObject1 = (ViewAnimator)findViewById(k);
      q = ((ViewAnimator)localObject1);
      r.setDuration(l);
      s.setDuration(l);
      localObject1 = q;
      localObject2 = r;
      ((ViewAnimator)localObject1).setInAnimation((Animation)localObject2);
      localObject1 = q;
      localObject2 = s;
      ((ViewAnimator)localObject1).setOutAnimation((Animation)localObject2);
      localObject1 = t;
      localObject2 = new mygov/aadhaar/ekyc/MainActivity$1;
      ((MainActivity.1)localObject2).<init>(this);
      ((h)localObject1).a((com.google.android.gms.ads.a)localObject2);
      g();
      try
      {
        localObject1 = getPackageManager();
        localObject2 = getApplicationContext();
        localObject2 = ((Context)localObject2).getPackageName();
        localObject3 = null;
        localObject1 = ((PackageManager)localObject1).getPackageInfo((String)localObject2, 0);
        localObject1 = versionName;
        a.c = (String)localObject1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          localNameNotFoundException.printStackTrace();
        }
      }
      localObject1 = (Button)findViewById(2131624075);
      localObject2 = new mygov/aadhaar/ekyc/MainActivity$2;
      ((MainActivity.2)localObject2).<init>(this);
      ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      localObject1 = (Button)findViewById(2131624068);
      localObject2 = new mygov/aadhaar/ekyc/MainActivity$3;
      ((MainActivity.3)localObject2).<init>(this);
      ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      return;
      k = 0;
      f = 0.0F;
      localObject1 = null;
      ((android.support.v7.app.b)localObject3).b(0.0F);
      break;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131689473, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    int j = 2131624117;
    if (i == j) {}
    boolean bool;
    for (i = 1;; bool = super.onOptionsItemSelected(paramMenuItem)) {
      return i;
    }
  }
}


/* Location:              mygov/aadhaar/ekyc/MainActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */