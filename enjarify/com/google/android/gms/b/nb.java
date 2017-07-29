package com.google.android.gms.b;

import android.location.Location;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

final class nb
{
  private final Object[] a;
  
  nb(ih paramih, String paramString, int paramInt)
  {
    Object localObject1 = ke.aY;
    localObject1 = (String)w.q().a((jz)localObject1);
    HashSet localHashSet = new java/util/HashSet;
    Object localObject2 = Arrays.asList(((String)localObject1).split(","));
    localHashSet.<init>((Collection)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    ((ArrayList)localObject2).add(localObject1);
    ((ArrayList)localObject2).add(paramString);
    localObject1 = "formatString";
    boolean bool1 = localHashSet.contains(localObject1);
    if (bool1) {
      ((ArrayList)localObject2).add(null);
    }
    localObject1 = "networkType";
    bool1 = localHashSet.contains(localObject1);
    if (bool1)
    {
      localObject1 = Integer.valueOf(paramInt);
      ((ArrayList)localObject2).add(localObject1);
    }
    localObject1 = "birthday";
    bool1 = localHashSet.contains(localObject1);
    if (bool1)
    {
      long l = b;
      localObject1 = Long.valueOf(l);
      ((ArrayList)localObject2).add(localObject1);
    }
    localObject1 = "extras";
    bool1 = localHashSet.contains(localObject1);
    if (bool1)
    {
      localObject1 = d.a(c);
      ((ArrayList)localObject2).add(localObject1);
    }
    localObject1 = "gender";
    bool1 = localHashSet.contains(localObject1);
    if (bool1)
    {
      int i = d;
      localObject1 = Integer.valueOf(i);
      ((ArrayList)localObject2).add(localObject1);
    }
    localObject1 = "keywords";
    boolean bool2 = localHashSet.contains(localObject1);
    boolean bool3;
    if (bool2)
    {
      localObject1 = e;
      if (localObject1 != null)
      {
        localObject1 = e.toString();
        ((ArrayList)localObject2).add(localObject1);
      }
    }
    else
    {
      localObject1 = "isTestDevice";
      bool2 = localHashSet.contains(localObject1);
      if (bool2)
      {
        bool2 = f;
        localObject1 = Boolean.valueOf(bool2);
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = "tagForChildDirectedTreatment";
      bool2 = localHashSet.contains(localObject1);
      if (bool2)
      {
        int j = g;
        localObject1 = Integer.valueOf(j);
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = "manualImpressionsEnabled";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        bool3 = h;
        localObject1 = Boolean.valueOf(bool3);
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = "publisherProvidedId";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        localObject1 = i;
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = "location";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        localObject1 = k;
        if (localObject1 == null) {
          break label793;
        }
        localObject1 = k.toString();
        ((ArrayList)localObject2).add(localObject1);
      }
      label504:
      localObject1 = "contentUrl";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        localObject1 = l;
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = "networkExtras";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        localObject1 = d.a(m);
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = "customTargeting";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        localObject1 = d.a(n);
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = "categoryExclusions";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        localObject1 = o;
        if (localObject1 == null) {
          break label803;
        }
        localObject1 = o.toString();
        ((ArrayList)localObject2).add(localObject1);
      }
    }
    for (;;)
    {
      localObject1 = "requestAgent";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        localObject1 = p;
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = "requestPackage";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        localObject1 = q;
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = "isDesignedForFamilies";
      bool3 = localHashSet.contains(localObject1);
      if (bool3)
      {
        bool3 = r;
        localObject1 = Boolean.valueOf(bool3);
        ((ArrayList)localObject2).add(localObject1);
      }
      localObject1 = ((ArrayList)localObject2).toArray();
      a = ((Object[])localObject1);
      return;
      ((ArrayList)localObject2).add(null);
      break;
      label793:
      ((ArrayList)localObject2).add(null);
      break label504;
      label803:
      ((ArrayList)localObject2).add(null);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof nb;
    Object[] arrayOfObject1;
    if (!bool)
    {
      bool = false;
      arrayOfObject1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (nb)paramObject;
      arrayOfObject1 = a;
      Object[] arrayOfObject2 = a;
      bool = Arrays.equals(arrayOfObject1, arrayOfObject2);
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(a);
  }
  
  public final String toString()
  {
    String str = String.valueOf(Arrays.toString(a));
    int i = String.valueOf(str).length() + 24;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    return "[InterstitialAdPoolKey " + str + "]";
  }
}


/* Location:              com/google/android/gms/b/nb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */