package com.google.android.gms.b;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.e.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@qi
public final class ik
{
  public static final ik a = new ik();
  
  public static ih a(Context paramContext, jj paramjj)
  {
    Object localObject1 = a;
    long l;
    String str1;
    int i;
    label59:
    boolean bool1;
    int j;
    Location localLocation;
    Bundle localBundle;
    boolean bool2;
    String str2;
    if (localObject1 != null)
    {
      l = ((Date)localObject1).getTime();
      str1 = b;
      i = c;
      localObject1 = d;
      if (((Set)localObject1).isEmpty()) {
        break label252;
      }
      localObject1 = Collections.unmodifiableList(new ArrayList((Collection)localObject1));
      localObject2 = m;
      ip.a();
      bool1 = ((Set)localObject2).contains(uk.a(paramContext));
      j = l;
      localLocation = e;
      localBundle = g.getBundle(AdMobAdapter.class.getName());
      bool2 = f;
      str2 = i;
      localObject2 = k;
      if (localObject2 == null) {
        break label258;
      }
    }
    label252:
    label258:
    for (Object localObject2 = new jp((a)localObject2);; localObject2 = null)
    {
      Object localObject3 = null;
      Context localContext = paramContext.getApplicationContext();
      paramContext = (Context)localObject3;
      if (localContext != null)
      {
        paramContext = localContext.getPackageName();
        ip.a();
        paramContext = uk.a(Thread.currentThread().getStackTrace(), paramContext);
      }
      boolean bool3 = p;
      return new ih(7, l, localBundle, i, (List)localObject1, bool1, j, bool2, str2, (jp)localObject2, localLocation, str1, g, n, Collections.unmodifiableList(new ArrayList(o)), j, paramContext, bool3);
      l = -1L;
      break;
      localObject1 = null;
      break label59;
    }
  }
  
  public static ik a()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/ik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */