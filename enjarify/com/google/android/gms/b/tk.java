package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;

public final class tk
{
  public long a;
  public long b;
  public int c;
  public int d;
  public long e;
  public final Object f;
  final String g;
  public int h;
  public int i;
  
  public tk(String paramString)
  {
    a = l;
    b = l;
    c = j;
    d = j;
    e = 0L;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    f = localObject;
    h = 0;
    i = 0;
    g = paramString;
  }
  
  private static boolean a(Context paramContext)
  {
    boolean bool = false;
    Object localObject1 = paramContext.getResources();
    Object localObject2 = "Theme.Translucent";
    Object localObject3 = "style";
    String str2 = "android";
    int j = ((Resources)localObject1).getIdentifier((String)localObject2, (String)localObject3, str2);
    if (j == 0)
    {
      localObject1 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
      tp.d((String)localObject1);
    }
    for (;;)
    {
      return bool;
      localObject2 = new android/content/ComponentName;
      localObject3 = paramContext.getPackageName();
      str2 = "com.google.android.gms.ads.AdActivity";
      ((ComponentName)localObject2).<init>((String)localObject3, str2);
      try
      {
        localObject3 = paramContext.getPackageManager();
        str2 = null;
        localObject2 = ((PackageManager)localObject3).getActivityInfo((ComponentName)localObject2, 0);
        int k = theme;
        if (j == k)
        {
          bool = true;
        }
        else
        {
          localObject1 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
          tp.d((String)localObject1);
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        tp.e("Fail to fetch AdActivity theme");
        String str1 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
        tp.d(str1);
      }
    }
  }
  
  public final Bundle a(Context paramContext, String paramString)
  {
    synchronized (f)
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      String str1 = "session_id";
      String str2 = g;
      localBundle.putString(str1, str2);
      str1 = "basets";
      long l = b;
      localBundle.putLong(str1, l);
      str1 = "currts";
      l = a;
      localBundle.putLong(str1, l);
      str1 = "seq_num";
      localBundle.putString(str1, paramString);
      str1 = "preqs";
      int j = c;
      localBundle.putInt(str1, j);
      str1 = "preqs_in_session";
      j = d;
      localBundle.putInt(str1, j);
      str1 = "time_in_session";
      l = e;
      localBundle.putLong(str1, l);
      str1 = "pclick";
      j = h;
      localBundle.putInt(str1, j);
      str1 = "pimp";
      j = i;
      localBundle.putInt(str1, j);
      str1 = "support_transparent_background";
      boolean bool = a(paramContext);
      localBundle.putBoolean(str1, bool);
      return localBundle;
    }
  }
}


/* Location:              com/google/android/gms/b/tk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */