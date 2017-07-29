package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.a.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ag;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;

public final class ab
{
  private static final Object a;
  private static ab b;
  private final String c;
  private final Status d;
  private final boolean e;
  private final boolean f;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  private ab(Context paramContext)
  {
    Object localObject1 = paramContext.getResources();
    int k = a.b.common_google_play_services_unknown_issue;
    String str2 = ((Resources)localObject1).getResourcePackageName(k);
    String str3 = "google_app_measurement_enable";
    String str4 = "integer";
    k = ((Resources)localObject1).getIdentifier(str3, str4, str2);
    int m;
    float f2;
    label86:
    label97:
    Object localObject2;
    if (k != 0)
    {
      m = ((Resources)localObject1).getInteger(k);
      if (m != 0)
      {
        m = i;
        f2 = f1;
        if (m != 0) {
          break label202;
        }
        f = i;
        i = m;
        f1 = f2;
        e = i;
        localObject2 = ag.a(paramContext);
        if (localObject2 == null)
        {
          localObject2 = new com/google/android/gms/common/internal/i;
          ((i)localObject2).<init>(paramContext);
          str1 = "google_app_id";
          localObject2 = ((i)localObject2).a(str1);
        }
        bool = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool) {
          break label220;
        }
        localObject2 = new com/google/android/gms/common/api/Status;
        int j = 10;
        localObject1 = "Missing google app id value from from string resources with name google_app_id.";
        ((Status)localObject2).<init>(j, (String)localObject1);
        d = ((Status)localObject2);
        i = 0;
        f1 = 0.0F;
        localObject2 = null;
        c = null;
      }
    }
    for (;;)
    {
      return;
      m = 0;
      localObject1 = null;
      f2 = 0.0F;
      break;
      label202:
      i = 0;
      localObject2 = null;
      f1 = 0.0F;
      break label86;
      f = false;
      break label97;
      label220:
      c = ((String)localObject2);
      localObject2 = Status.a;
      d = ((Status)localObject2);
    }
  }
  
  private static ab a(String paramString)
  {
    synchronized (a)
    {
      Object localObject2 = b;
      if (localObject2 == null)
      {
        localObject2 = new java/lang/IllegalStateException;
        Object localObject4 = String.valueOf(paramString);
        int i = ((String)localObject4).length() + 34;
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>(i);
        localObject4 = "Initialize must be called before ";
        localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
        localObject4 = ((StringBuilder)localObject4).append(paramString);
        localObject5 = ".";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((IllegalStateException)localObject2).<init>((String)localObject4);
        throw ((Throwable)localObject2);
      }
    }
    ab localab = b;
    return localab;
  }
  
  public static Status a(Context paramContext)
  {
    Object localObject1 = "Context must not be null.";
    c.a(paramContext, localObject1);
    synchronized (a)
    {
      localObject1 = b;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/b/ab;
        ((ab)localObject1).<init>(paramContext);
        b = (ab)localObject1;
      }
      localObject1 = b;
      localObject1 = d;
      return (Status)localObject1;
    }
  }
  
  public static String a()
  {
    return a"getGoogleAppId"c;
  }
  
  public static boolean b()
  {
    return a"isMeasurementExplicitlyDisabled"f;
  }
}


/* Location:              com/google/android/gms/b/ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */