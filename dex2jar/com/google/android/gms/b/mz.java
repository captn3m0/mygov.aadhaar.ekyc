package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.ads.internal.w;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@qi
public final class mz
{
  final Map<nb, nc> a = new HashMap();
  final LinkedList<nb> b = new LinkedList();
  mw c;
  
  static Set<String> a(ih paramih)
  {
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(c.keySet());
    paramih = m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    if (paramih != null) {
      localHashSet.addAll(paramih.keySet());
    }
    return localHashSet;
  }
  
  private static void a(Bundle paramBundle, String paramString)
  {
    for (;;)
    {
      paramString = paramString.split("/", 2);
      if (paramString.length == 0) {}
      do
      {
        return;
        String str = paramString[0];
        if (paramString.length == 1)
        {
          paramBundle.remove(str);
          return;
        }
        paramBundle = paramBundle.getBundle(str);
      } while (paramBundle == null);
      paramString = paramString[1];
    }
  }
  
  static void a(String paramString, nb paramnb)
  {
    if (tp.a(2)) {
      tp.a(String.format(paramString, new Object[] { paramnb }));
    }
  }
  
  static String[] a(String paramString)
  {
    try
    {
      String[] arrayOfString = paramString.split("\000");
      int i = 0;
      for (;;)
      {
        paramString = arrayOfString;
        if (i >= arrayOfString.length) {
          break;
        }
        arrayOfString[i] = new String(Base64.decode(arrayOfString[i], 0), "UTF-8");
        i += 1;
      }
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString = new String[0];
    }
  }
  
  static ih b(ih paramih)
  {
    paramih = c(paramih);
    Object localObject = ke.aZ;
    localObject = ((String)w.q().a((jz)localObject)).split(",");
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      String str = localObject[i];
      a(m, str);
      if (str.startsWith("com.google.ads.mediation.admob.AdMobAdapter/"))
      {
        str = str.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", "");
        a(c, str);
      }
      i += 1;
    }
    return paramih;
  }
  
  private String b()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext())
      {
        localStringBuilder.append(Base64.encodeToString(((nb)localIterator.next()).toString().getBytes("UTF-8"), 0));
        if (localIterator.hasNext()) {
          localStringBuilder.append("\000");
        }
      }
      str = localUnsupportedEncodingException.toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return "";
    }
    String str;
    return str;
  }
  
  static boolean b(String paramString)
  {
    try
    {
      jz localjz = ke.bd;
      boolean bool = Pattern.matches((String)w.q().a(localjz), paramString);
      return bool;
    }
    catch (RuntimeException paramString)
    {
      w.i().a(paramString, "InterstitialAdPool.isExcludedAdUnit");
    }
    return false;
  }
  
  static ih c(ih paramih)
  {
    Object localObject = Parcel.obtain();
    paramih.writeToParcel((Parcel)localObject, 0);
    ((Parcel)localObject).setDataPosition(0);
    paramih = (ih)ih.CREATOR.createFromParcel((Parcel)localObject);
    ((Parcel)localObject).recycle();
    localObject = ke.aR;
    if (((Boolean)w.q().a((jz)localObject)).booleanValue()) {
      ih.a(paramih);
    }
    return paramih;
  }
  
  static String c(String paramString)
  {
    try
    {
      Matcher localMatcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(paramString);
      String str = paramString;
      if (localMatcher.matches()) {
        str = localMatcher.group(1);
      }
      return str;
    }
    catch (RuntimeException localRuntimeException) {}
    return paramString;
  }
  
  final void a()
  {
    if (c == null) {
      return;
    }
    Object localObject1 = a.entrySet().iterator();
    label23:
    Object localObject3;
    Object localObject2;
    int j;
    Object localObject4;
    int i;
    if (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (nb)((Map.Entry)localObject3).getKey();
      localObject3 = (nc)((Map.Entry)localObject3).getValue();
      if (tp.a(2))
      {
        j = a.size();
        localObject4 = a.iterator();
        i = 0;
        label95:
        if (((Iterator)localObject4).hasNext())
        {
          if (!nexte) {
            break label487;
          }
          i += 1;
        }
      }
    }
    label179:
    label484:
    label487:
    for (;;)
    {
      break label95;
      if (i < j) {
        tp.a(String.format("Loading %s/%s pooled interstitials for %s.", new Object[] { Integer.valueOf(j - i), Integer.valueOf(j), localObject2 }));
      }
      localObject4 = a.iterator();
      i = 0;
      if (((Iterator)localObject4).hasNext())
      {
        if (!((nc.a)((Iterator)localObject4).next()).a()) {
          break label484;
        }
        i += 1;
      }
      for (;;)
      {
        break label179;
        i += 0;
        for (;;)
        {
          j = a.size();
          localObject4 = ke.bb;
          if (j >= ((Integer)w.q().a((jz)localObject4)).intValue()) {
            break;
          }
          a("Pooling and loading one new interstitial for %s.", (nb)localObject2);
          localObject4 = new nc.a((nc)localObject3, c);
          a.add(localObject4);
          if (((nc.a)localObject4).a()) {
            i += 1;
          }
        }
        localObject2 = nd.a();
        a += i;
        break label23;
        if (c == null) {
          break;
        }
        localObject1 = c.a.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
        ((SharedPreferences.Editor)localObject1).clear();
        localObject2 = a.entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject4 = (Map.Entry)((Iterator)localObject2).next();
          localObject3 = (nb)((Map.Entry)localObject4).getKey();
          localObject4 = (nc)((Map.Entry)localObject4).getValue();
          if (e)
          {
            localObject4 = new nf((nc)localObject4).a();
            ((SharedPreferences.Editor)localObject1).putString(((nb)localObject3).toString(), (String)localObject4);
            a("Saved interstitial queue for %s.", (nb)localObject3);
          }
        }
        ((SharedPreferences.Editor)localObject1).putString("PoolKeys", b());
        ((SharedPreferences.Editor)localObject1).apply();
        return;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */