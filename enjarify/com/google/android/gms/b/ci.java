package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class ci
  extends df
{
  private long a;
  private String b;
  private Boolean c;
  
  ci(dc paramdc)
  {
    super(paramdc);
  }
  
  public final String A()
  {
    J();
    return b;
  }
  
  protected final void a()
  {
    Object localObject1 = Calendar.getInstance();
    Object localObject2 = TimeUnit.MINUTES;
    int i = ((Calendar)localObject1).get(15);
    long l1 = ((Calendar)localObject1).get(16) + i;
    localObject1 = TimeUnit.MILLISECONDS;
    long l2 = ((TimeUnit)localObject2).convert(l1, (TimeUnit)localObject1);
    a = l2;
    localObject1 = Locale.getDefault();
    localObject2 = ((Locale)localObject1).getLanguage();
    Locale localLocale = Locale.ENGLISH;
    localObject2 = String.valueOf(((String)localObject2).toLowerCase(localLocale));
    localObject1 = ((Locale)localObject1).getCountry();
    localLocale = Locale.ENGLISH;
    localObject1 = String.valueOf(((String)localObject1).toLowerCase(localLocale));
    i = String.valueOf(localObject2).length() + 1;
    int j = String.valueOf(localObject1).length();
    i += j;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    localObject1 = (String)localObject2 + "-" + (String)localObject1;
    b = ((String)localObject1);
  }
  
  public final boolean a(Context paramContext)
  {
    Object localObject = c;
    boolean bool;
    if (localObject == null)
    {
      cf.W();
      bool = false;
      localObject = Boolean.valueOf(false);
      c = ((Boolean)localObject);
    }
    try
    {
      localObject = paramContext.getPackageManager();
      if (localObject != null)
      {
        String str = "com.google.android.gms";
        int i = 128;
        ((PackageManager)localObject).getPackageInfo(str, i);
        bool = true;
        localObject = Boolean.valueOf(bool);
        c = ((Boolean)localObject);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return c.booleanValue();
  }
  
  public final String x()
  {
    J();
    return Build.MODEL;
  }
  
  public final String y()
  {
    J();
    return Build.VERSION.RELEASE;
  }
  
  public final long z()
  {
    J();
    return a;
  }
}


/* Location:              com/google/android/gms/b/ci.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */