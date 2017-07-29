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
    a = ((TimeUnit)localObject2).convert(((Calendar)localObject1).get(16) + i, TimeUnit.MILLISECONDS);
    localObject2 = Locale.getDefault();
    localObject1 = String.valueOf(((Locale)localObject2).getLanguage().toLowerCase(Locale.ENGLISH));
    localObject2 = String.valueOf(((Locale)localObject2).getCountry().toLowerCase(Locale.ENGLISH));
    b = (String.valueOf(localObject1).length() + 1 + String.valueOf(localObject2).length() + (String)localObject1 + "-" + (String)localObject2);
  }
  
  public final boolean a(Context paramContext)
  {
    if (c == null)
    {
      cf.W();
      c = Boolean.valueOf(false);
    }
    try
    {
      paramContext = paramContext.getPackageManager();
      if (paramContext != null)
      {
        paramContext.getPackageInfo("com.google.android.gms", 128);
        c = Boolean.valueOf(true);
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */