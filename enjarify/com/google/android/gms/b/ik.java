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

public final class ik
{
  public static final ik a;
  
  static
  {
    ik localik = new com/google/android/gms/b/ik;
    localik.<init>();
    a = localik;
  }
  
  public static ih a(Context paramContext, jj paramjj)
  {
    Object localObject1 = paramjj;
    Object localObject2 = a;
    long l;
    String str1;
    int i;
    Object localObject3;
    List localList;
    label67:
    boolean bool2;
    int j;
    Location localLocation;
    Bundle localBundle1;
    boolean bool3;
    String str2;
    jp localjp;
    if (localObject2 != null)
    {
      l = ((Date)localObject2).getTime();
      localObject1 = paramjj;
      str1 = b;
      i = c;
      localObject2 = d;
      boolean bool1 = ((Set)localObject2).isEmpty();
      if (bool1) {
        break label301;
      }
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>((Collection)localObject2);
      localList = Collections.unmodifiableList((List)localObject3);
      localObject1 = paramjj;
      localObject2 = m;
      ip.a();
      localObject3 = uk.a(paramContext);
      bool2 = ((Set)localObject2).contains(localObject3);
      j = l;
      localLocation = e;
      localObject3 = g;
      localObject2 = AdMobAdapter.class.getName();
      localBundle1 = ((Bundle)localObject3).getBundle((String)localObject2);
      bool3 = f;
      str2 = i;
      localObject2 = k;
      if (localObject2 == null) {
        break label307;
      }
      localjp = new com/google/android/gms/b/jp;
      localjp.<init>((a)localObject2);
    }
    for (;;)
    {
      String str3 = null;
      localObject2 = paramContext.getApplicationContext();
      if (localObject2 != null)
      {
        localObject2 = ((Context)localObject2).getPackageName();
        ip.a();
        localObject3 = Thread.currentThread().getStackTrace();
        str3 = uk.a((StackTraceElement[])localObject3, (String)localObject2);
      }
      localObject1 = paramjj;
      boolean bool4 = p;
      localObject2 = new com/google/android/gms/b/ih;
      Bundle localBundle2 = g;
      localObject1 = paramjj;
      Bundle localBundle3 = n;
      Object localObject4 = new java/util/ArrayList;
      localObject1 = paramjj;
      localObject1 = o;
      ((ArrayList)localObject4).<init>((Collection)localObject1);
      localObject4 = Collections.unmodifiableList((List)localObject4);
      localObject1 = paramjj;
      localObject1 = j;
      ((ih)localObject2).<init>(7, l, localBundle1, i, localList, bool2, j, bool3, str2, localjp, localLocation, str1, localBundle2, localBundle3, (List)localObject4, (String)localObject1, str3, bool4);
      return (ih)localObject2;
      l = -1;
      break;
      label301:
      localList = null;
      break label67;
      label307:
      localjp = null;
    }
  }
  
  public static ik a()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/ik.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */