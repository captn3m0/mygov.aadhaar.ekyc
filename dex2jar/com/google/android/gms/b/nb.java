package com.google.android.gms.b;

import android.location.Location;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@qi
final class nb
{
  private final Object[] a;
  
  nb(ih paramih, String paramString, int paramInt)
  {
    Object localObject = ke.aY;
    localObject = (String)w.q().a((jz)localObject);
    HashSet localHashSet = new HashSet(Arrays.asList(((String)localObject).split(",")));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localObject);
    localArrayList.add(paramString);
    if (localHashSet.contains("formatString")) {
      localArrayList.add(null);
    }
    if (localHashSet.contains("networkType")) {
      localArrayList.add(Integer.valueOf(paramInt));
    }
    if (localHashSet.contains("birthday")) {
      localArrayList.add(Long.valueOf(b));
    }
    if (localHashSet.contains("extras")) {
      localArrayList.add(d.a(c));
    }
    if (localHashSet.contains("gender")) {
      localArrayList.add(Integer.valueOf(d));
    }
    if (localHashSet.contains("keywords"))
    {
      if (e != null) {
        localArrayList.add(e.toString());
      }
    }
    else
    {
      if (localHashSet.contains("isTestDevice")) {
        localArrayList.add(Boolean.valueOf(f));
      }
      if (localHashSet.contains("tagForChildDirectedTreatment")) {
        localArrayList.add(Integer.valueOf(g));
      }
      if (localHashSet.contains("manualImpressionsEnabled")) {
        localArrayList.add(Boolean.valueOf(h));
      }
      if (localHashSet.contains("publisherProvidedId")) {
        localArrayList.add(i);
      }
      if (localHashSet.contains("location"))
      {
        if (k == null) {
          break label535;
        }
        localArrayList.add(k.toString());
      }
      label342:
      if (localHashSet.contains("contentUrl")) {
        localArrayList.add(l);
      }
      if (localHashSet.contains("networkExtras")) {
        localArrayList.add(d.a(m));
      }
      if (localHashSet.contains("customTargeting")) {
        localArrayList.add(d.a(n));
      }
      if (localHashSet.contains("categoryExclusions"))
      {
        if (o == null) {
          break label545;
        }
        localArrayList.add(o.toString());
      }
    }
    for (;;)
    {
      if (localHashSet.contains("requestAgent")) {
        localArrayList.add(p);
      }
      if (localHashSet.contains("requestPackage")) {
        localArrayList.add(q);
      }
      if (localHashSet.contains("isDesignedForFamilies")) {
        localArrayList.add(Boolean.valueOf(r));
      }
      a = localArrayList.toArray();
      return;
      localArrayList.add(null);
      break;
      label535:
      localArrayList.add(null);
      break label342;
      label545:
      localArrayList.add(null);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof nb)) {
      return false;
    }
    paramObject = (nb)paramObject;
    return Arrays.equals(a, a);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(a);
  }
  
  public final String toString()
  {
    String str = String.valueOf(Arrays.toString(a));
    return String.valueOf(str).length() + 24 + "[InterstitialAdPoolKey " + str + "]";
  }
}


/* Location:              com/google/android/gms/b/nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */