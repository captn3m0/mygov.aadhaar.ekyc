package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;

@qi
public final class tk
{
  public long a = -1L;
  public long b = -1L;
  public int c = -1;
  public int d = -1;
  public long e = 0L;
  public final Object f = new Object();
  final String g;
  public int h = 0;
  public int i = 0;
  
  public tk(String paramString)
  {
    g = paramString;
  }
  
  private static boolean a(Context paramContext)
  {
    int j = paramContext.getResources().getIdentifier("Theme.Translucent", "style", "android");
    if (j == 0)
    {
      tp.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), "com.google.android.gms.ads.AdActivity");
    try
    {
      if (j == getPackageManagergetActivityInfo0theme) {
        return true;
      }
      tp.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      tp.e("Fail to fetch AdActivity theme");
      tp.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
    }
    return false;
  }
  
  public final Bundle a(Context paramContext, String paramString)
  {
    synchronized (f)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("session_id", g);
      localBundle.putLong("basets", b);
      localBundle.putLong("currts", a);
      localBundle.putString("seq_num", paramString);
      localBundle.putInt("preqs", c);
      localBundle.putInt("preqs_in_session", d);
      localBundle.putLong("time_in_session", e);
      localBundle.putInt("pclick", h);
      localBundle.putInt("pimp", i);
      localBundle.putBoolean("support_transparent_background", a(paramContext));
      return localBundle;
    }
  }
}


/* Location:              com/google/android/gms/b/tk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */