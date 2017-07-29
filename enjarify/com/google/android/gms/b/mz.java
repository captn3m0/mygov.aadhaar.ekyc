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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class mz
{
  final Map a;
  final LinkedList b;
  mw c;
  
  public mz()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = ((Map)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    b = ((LinkedList)localObject);
  }
  
  static Set a(ih paramih)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject = c.keySet();
    localHashSet.addAll((Collection)localObject);
    localObject = m;
    String str = "com.google.ads.mediation.admob.AdMobAdapter";
    localObject = ((Bundle)localObject).getBundle(str);
    if (localObject != null)
    {
      localObject = ((Bundle)localObject).keySet();
      localHashSet.addAll((Collection)localObject);
    }
    return localHashSet;
  }
  
  private static void a(Bundle paramBundle, String paramString)
  {
    int i = 1;
    for (;;)
    {
      String[] arrayOfString = paramString.split("/", 2);
      int j = arrayOfString.length;
      if (j == 0) {}
      do
      {
        String str;
        for (;;)
        {
          return;
          j = 0;
          str = arrayOfString[0];
          int k = arrayOfString.length;
          if (k != i) {
            break;
          }
          paramBundle.remove(str);
        }
        paramBundle = paramBundle.getBundle(str);
      } while (paramBundle == null);
      paramString = arrayOfString[i];
    }
  }
  
  static void a(String paramString, nb paramnb)
  {
    boolean bool = tp.a(2);
    if (bool)
    {
      bool = true;
      Object localObject = new Object[bool];
      localObject[0] = paramnb;
      localObject = String.format(paramString, (Object[])localObject);
      tp.a((String)localObject);
    }
  }
  
  /* Error */
  static String[] a(String paramString)
  {
    // Byte code:
    //   0: ldc 80
    //   2: astore_1
    //   3: aload_0
    //   4: aload_1
    //   5: invokevirtual 83	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   8: astore_1
    //   9: iconst_0
    //   10: istore_2
    //   11: aload_1
    //   12: arraylength
    //   13: istore_3
    //   14: iload_2
    //   15: iload_3
    //   16: if_icmpge +55 -> 71
    //   19: new 59	java/lang/String
    //   22: astore 4
    //   24: aload_1
    //   25: iload_2
    //   26: aaload
    //   27: astore 5
    //   29: aconst_null
    //   30: astore 6
    //   32: aload 5
    //   34: iconst_0
    //   35: invokestatic 89	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   38: astore 5
    //   40: ldc 91
    //   42: astore 6
    //   44: aload 4
    //   46: aload 5
    //   48: aload 6
    //   50: invokespecial 94	java/lang/String:<init>	([BLjava/lang/String;)V
    //   53: aload_1
    //   54: iload_2
    //   55: aload 4
    //   57: aastore
    //   58: iload_2
    //   59: iconst_1
    //   60: iadd
    //   61: istore_2
    //   62: goto -51 -> 11
    //   65: astore_1
    //   66: iconst_0
    //   67: anewarray 59	java/lang/String
    //   70: astore_1
    //   71: aload_1
    //   72: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	paramString	String
    //   2	52	1	localObject1	Object
    //   65	1	1	localUnsupportedEncodingException	UnsupportedEncodingException
    //   70	2	1	arrayOfString	String[]
    //   10	52	2	i	int
    //   13	4	3	j	int
    //   22	34	4	str1	String
    //   27	20	5	localObject2	Object
    //   30	19	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   4	8	65	java/io/UnsupportedEncodingException
    //   11	13	65	java/io/UnsupportedEncodingException
    //   19	22	65	java/io/UnsupportedEncodingException
    //   25	27	65	java/io/UnsupportedEncodingException
    //   34	38	65	java/io/UnsupportedEncodingException
    //   48	53	65	java/io/UnsupportedEncodingException
    //   55	58	65	java/io/UnsupportedEncodingException
  }
  
  static ih b(ih paramih)
  {
    ih localih = c(paramih);
    jz localjz = ke.aZ;
    String[] arrayOfString = ((String)w.q().a(localjz)).split(",");
    int i = arrayOfString.length;
    int j = 0;
    localjz = null;
    while (j < i)
    {
      String str1 = arrayOfString[j];
      a(m, str1);
      Object localObject = "com.google.ads.mediation.admob.AdMobAdapter/";
      boolean bool = str1.startsWith((String)localObject);
      if (bool)
      {
        String str2 = "";
        str1 = str1.replaceFirst((String)localObject, str2);
        localObject = c;
        a((Bundle)localObject, str1);
      }
      j += 1;
    }
    return localih;
  }
  
  private String b()
  {
    StringBuilder localStringBuilder;
    String str1;
    try
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject = b;
      Iterator localIterator = ((LinkedList)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = localIterator.next();
        localObject = (nb)localObject;
        localObject = ((nb)localObject).toString();
        String str2 = "UTF-8";
        localObject = ((String)localObject).getBytes(str2);
        str2 = null;
        localObject = Base64.encodeToString((byte[])localObject, 0);
        localStringBuilder.append((String)localObject);
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject = "\000";
          localStringBuilder.append((String)localObject);
        }
      }
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      str1 = "";
    }
    for (;;)
    {
      str1 = localStringBuilder.toString();
    }
  }
  
  static boolean b(String paramString)
  {
    try
    {
      Object localObject1 = ke.bd;
      localObject3 = w.q();
      localObject1 = ((kd)localObject3).a((jz)localObject1);
      localObject1 = (String)localObject1;
      bool = Pattern.matches((String)localObject1, paramString);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Object localObject3 = w.i();
        String str = "InterstitialAdPool.isExcludedAdUnit";
        ((tj)localObject3).a(localRuntimeException, str);
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
  
  static ih c(ih paramih)
  {
    Object localObject = Parcel.obtain();
    paramih.writeToParcel((Parcel)localObject, 0);
    ((Parcel)localObject).setDataPosition(0);
    ih localih = (ih)ih.CREATOR.createFromParcel((Parcel)localObject);
    ((Parcel)localObject).recycle();
    localObject = ke.aR;
    kd localkd = w.q();
    localObject = (Boolean)localkd.a((jz)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool) {
      ih.a(localih);
    }
    return localih;
  }
  
  static String c(String paramString)
  {
    Object localObject = "([^/]+/[0-9]+).*";
    try
    {
      localObject = Pattern.compile((String)localObject);
      localObject = ((Pattern)localObject).matcher(paramString);
      int i = ((Matcher)localObject).matches();
      if (i != 0)
      {
        i = 1;
        paramString = ((Matcher)localObject).group(i);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;) {}
    }
    return paramString;
  }
  
  final void a()
  {
    int i = 2;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = c;
    if (localObject2 == null) {
      return;
    }
    localObject2 = a.entrySet();
    Iterator localIterator = ((Set)localObject2).iterator();
    label38:
    boolean bool2 = localIterator.hasNext();
    Object localObject3;
    int n;
    Object localObject4;
    Object localObject5;
    int i1;
    Object localObject6;
    if (bool2)
    {
      localObject2 = (Map.Entry)localIterator.next();
      localObject3 = (nb)((Map.Entry)localObject2).getKey();
      localObject2 = (nc)((Map.Entry)localObject2).getValue();
      boolean bool3 = tp.a(i);
      if (bool3)
      {
        n = a.size();
        localObject4 = a;
        localObject5 = ((LinkedList)localObject4).iterator();
        i1 = 0;
        localObject6 = null;
        label129:
        bool3 = ((Iterator)localObject5).hasNext();
        if (bool3)
        {
          localObject4 = (nc.a)((Iterator)localObject5).next();
          bool3 = e;
          if (!bool3) {
            break label690;
          }
        }
      }
    }
    label271:
    int m;
    label683:
    label690:
    for (int j = i1 + 1;; m = i1)
    {
      i1 = j;
      break label129;
      if (i1 < n)
      {
        int i2 = 3;
        localObject5 = new Object[i2];
        localObject6 = Integer.valueOf(n - i1);
        localObject5[0] = localObject6;
        i1 = 1;
        localObject7 = Integer.valueOf(n);
        localObject5[i1] = localObject7;
        localObject5[i] = localObject3;
        localObject4 = String.format("Loading %s/%s pooled interstitials for %s.", (Object[])localObject5);
        tp.a((String)localObject4);
      }
      localObject4 = a;
      Object localObject7 = ((LinkedList)localObject4).iterator();
      i1 = 0;
      localObject6 = null;
      boolean bool4 = ((Iterator)localObject7).hasNext();
      if (bool4)
      {
        localObject4 = (nc.a)((Iterator)localObject7).next();
        bool4 = ((nc.a)localObject4).a();
        if (!bool4) {
          break label683;
        }
      }
      for (int k = i1 + 1;; m = i1)
      {
        i1 = k;
        break label271;
        k = i1 + 0;
        i1 = k;
        for (;;)
        {
          n = a.size();
          localObject4 = ke.bb;
          localObject5 = w.q();
          localObject4 = (Integer)((kd)localObject5).a((jz)localObject4);
          k = ((Integer)localObject4).intValue();
          if (n >= k) {
            break;
          }
          a("Pooling and loading one new interstitial for %s.", (nb)localObject3);
          localObject4 = c;
          localObject7 = new com/google/android/gms/b/nc$a;
          ((nc.a)localObject7).<init>((nc)localObject2, (mw)localObject4);
          localObject4 = a;
          ((LinkedList)localObject4).add(localObject7);
          boolean bool5 = ((nc.a)localObject7).a();
          if (bool5)
          {
            m = i1 + 1;
            i1 = m;
          }
        }
        localObject2 = nd.a();
        int i3 = a + i1;
        a = i3;
        break label38;
        localObject2 = c;
        if (localObject2 == null) {
          break;
        }
        localObject2 = c.a.getApplicationContext();
        localObject3 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool";
        localObject4 = ((Context)localObject2).getSharedPreferences((String)localObject3, 0).edit();
        ((SharedPreferences.Editor)localObject4).clear();
        localObject2 = a.entrySet();
        localObject6 = ((Set)localObject2).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject6).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = (Map.Entry)((Iterator)localObject6).next();
          localObject3 = (nb)((Map.Entry)localObject2).getKey();
          localObject2 = (nc)((Map.Entry)localObject2).getValue();
          bool1 = e;
          if (bool1)
          {
            localObject1 = new com/google/android/gms/b/nf;
            ((nf)localObject1).<init>((nc)localObject2);
            localObject2 = ((nf)localObject1).a();
            localObject1 = ((nb)localObject3).toString();
            ((SharedPreferences.Editor)localObject4).putString((String)localObject1, (String)localObject2);
            localObject2 = "Saved interstitial queue for %s.";
            a((String)localObject2, (nb)localObject3);
          }
        }
        localObject2 = "PoolKeys";
        localObject3 = b();
        ((SharedPreferences.Editor)localObject4).putString((String)localObject2, (String)localObject3);
        ((SharedPreferences.Editor)localObject4).apply();
        break;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */