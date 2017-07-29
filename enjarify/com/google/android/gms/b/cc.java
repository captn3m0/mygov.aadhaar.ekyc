package com.google.android.gms.b;

import android.support.v4.g.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class cc
  extends df
{
  cc(dc paramdc)
  {
    super(paramdc);
  }
  
  private static Boolean a(double paramDouble, ds.d paramd)
  {
    try
    {
      localObject1 = new java/math/BigDecimal;
      ((BigDecimal)localObject1).<init>(paramDouble);
      double d = Math.ulp(paramDouble);
      localObject1 = a((BigDecimal)localObject1, paramd, d);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (Boolean)localObject1;
  }
  
  private static Boolean a(long paramLong, ds.d paramd)
  {
    try
    {
      localObject1 = new java/math/BigDecimal;
      ((BigDecimal)localObject1).<init>(paramLong);
      double d = 0.0D;
      localObject1 = a((BigDecimal)localObject1, paramd, d);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (Boolean)localObject1;
  }
  
  private Boolean a(ds.b paramb, du.b paramb1, long paramLong)
  {
    Object localObject1 = e;
    int i;
    if (localObject1 != null)
    {
      localObject1 = e;
      localObject1 = a(paramLong, (ds.d)localObject1);
      if (localObject1 == null)
      {
        i = 0;
        localObject1 = null;
      }
    }
    for (;;)
    {
      return (Boolean)localObject1;
      i = ((Boolean)localObject1).booleanValue();
      if (i == 0)
      {
        i = 0;
        localObject1 = Boolean.valueOf(false);
      }
      else
      {
        Object localObject2 = new java/util/HashSet;
        ((HashSet)localObject2).<init>();
        Object localObject3 = c;
        int m = localObject3.length;
        i = 0;
        localObject1 = null;
        Object localObject4;
        Object localObject5;
        for (;;)
        {
          if (i >= m) {
            break label186;
          }
          localObject4 = localObject3[i];
          localObject5 = d;
          boolean bool2 = TextUtils.isEmpty((CharSequence)localObject5);
          if (bool2)
          {
            localObject1 = uc;
            localObject2 = "null or empty param name in filter. event";
            localObject3 = b;
            ((cu.a)localObject1).a((String)localObject2, localObject3);
            i = 0;
            localObject1 = null;
            break;
          }
          localObject4 = d;
          ((Set)localObject2).add(localObject4);
          i += 1;
        }
        label186:
        Object localObject6 = new android/support/v4/g/a;
        ((a)localObject6).<init>();
        localObject3 = a;
        int i1 = localObject3.length;
        int j = 0;
        localObject1 = null;
        Object localObject7;
        if (j < i1)
        {
          localObject5 = localObject3[j];
          localObject7 = a;
          boolean bool3 = ((Set)localObject2).contains(localObject7);
          if (bool3)
          {
            localObject7 = c;
            if (localObject7 == null) {
              break label297;
            }
            localObject7 = a;
            localObject5 = c;
            ((Map)localObject6).put(localObject7, localObject5);
          }
          for (;;)
          {
            j += 1;
            break;
            label297:
            localObject7 = e;
            if (localObject7 != null)
            {
              localObject7 = a;
              localObject5 = e;
              ((Map)localObject6).put(localObject7, localObject5);
            }
            else
            {
              localObject7 = b;
              if (localObject7 == null) {
                break label379;
              }
              localObject7 = a;
              localObject5 = b;
              ((Map)localObject6).put(localObject7, localObject5);
            }
          }
          label379:
          localObject1 = uc;
          localObject2 = "Unknown value for param. event, param";
          localObject3 = b;
          localObject6 = a;
          ((cu.a)localObject1).a((String)localObject2, localObject3, localObject6);
          j = 0;
          localObject1 = null;
        }
        else
        {
          localObject4 = c;
          int n = localObject4.length;
          j = 0;
          localObject1 = null;
          int i2 = 0;
          localObject3 = null;
          for (;;)
          {
            if (i2 >= n) {
              break label1199;
            }
            localObject7 = localObject4[i2];
            localObject1 = Boolean.TRUE;
            localObject2 = c;
            boolean bool4 = ((Boolean)localObject1).equals(localObject2);
            String str = d;
            boolean bool1 = TextUtils.isEmpty(str);
            if (bool1)
            {
              localObject1 = uc;
              localObject2 = "Event has empty param name. event";
              localObject3 = b;
              ((cu.a)localObject1).a((String)localObject2, localObject3);
              bool1 = false;
              localObject1 = null;
              break;
            }
            localObject1 = ((Map)localObject6).get(str);
            boolean bool5 = localObject1 instanceof Long;
            if (bool5)
            {
              localObject2 = b;
              if (localObject2 == null)
              {
                localObject1 = uc;
                localObject2 = "No number filter for long param. event, param";
                localObject3 = b;
                ((cu.a)localObject1).a((String)localObject2, localObject3, str);
                bool1 = false;
                localObject1 = null;
                break;
              }
              long l = ((Long)localObject1).longValue();
              localObject7 = b;
              localObject1 = a(l, (ds.d)localObject7);
              if (localObject1 == null)
              {
                bool1 = false;
                localObject1 = null;
                break;
              }
              bool1 = ((Boolean)localObject1).booleanValue();
              if (!bool1) {
                bool1 = true;
              }
              for (;;)
              {
                bool1 ^= bool4;
                if (!bool1) {
                  break label1186;
                }
                bool1 = false;
                localObject1 = Boolean.valueOf(false);
                break;
                bool1 = false;
                localObject1 = null;
              }
            }
            bool5 = localObject1 instanceof Double;
            if (bool5)
            {
              localObject2 = b;
              if (localObject2 == null)
              {
                localObject1 = uc;
                localObject2 = "No number filter for double param. event, param";
                localObject3 = b;
                ((cu.a)localObject1).a((String)localObject2, localObject3, str);
                bool1 = false;
                localObject1 = null;
                break;
              }
              double d = ((Double)localObject1).doubleValue();
              localObject7 = b;
              localObject1 = a(d, (ds.d)localObject7);
              if (localObject1 == null)
              {
                bool1 = false;
                localObject1 = null;
                break;
              }
              bool1 = ((Boolean)localObject1).booleanValue();
              if (!bool1) {
                bool1 = true;
              }
              for (;;)
              {
                bool1 ^= bool4;
                if (!bool1) {
                  break label1186;
                }
                bool1 = false;
                localObject1 = Boolean.valueOf(false);
                break;
                bool1 = false;
                localObject1 = null;
              }
            }
            bool5 = localObject1 instanceof String;
            if (bool5)
            {
              localObject2 = a;
              if (localObject2 != null)
              {
                localObject1 = (String)localObject1;
                localObject2 = a;
                localObject1 = a((String)localObject1, (ds.f)localObject2);
              }
              for (;;)
              {
                if (localObject1 == null)
                {
                  bool1 = false;
                  localObject1 = null;
                  break;
                  localObject2 = b;
                  if (localObject2 != null)
                  {
                    localObject2 = localObject1;
                    localObject2 = (String)localObject1;
                    bool5 = dr.k((String)localObject2);
                    if (bool5)
                    {
                      localObject1 = (String)localObject1;
                      localObject2 = b;
                      localObject1 = a((String)localObject1, (ds.d)localObject2);
                      continue;
                    }
                    localObject1 = uc;
                    localObject2 = "Invalid param value for number filter. event, param";
                    localObject3 = b;
                    ((cu.a)localObject1).a((String)localObject2, localObject3, str);
                    bool1 = false;
                    localObject1 = null;
                    break;
                  }
                  localObject1 = uc;
                  localObject2 = "No filter for String param. event, param";
                  localObject3 = b;
                  ((cu.a)localObject1).a((String)localObject2, localObject3, str);
                  bool1 = false;
                  localObject1 = null;
                  break;
                }
              }
              bool1 = ((Boolean)localObject1).booleanValue();
              if (!bool1) {
                bool1 = true;
              }
              for (;;)
              {
                bool1 ^= bool4;
                if (!bool1) {
                  break label1186;
                }
                bool1 = false;
                localObject1 = Boolean.valueOf(false);
                break;
                bool1 = false;
                localObject1 = null;
              }
            }
            if (localObject1 == null)
            {
              localObject1 = ug;
              localObject2 = "Missing param for filter. event, param";
              localObject3 = b;
              ((cu.a)localObject1).a((String)localObject2, localObject3, str);
              bool1 = false;
              localObject1 = Boolean.valueOf(false);
              break;
            }
            localObject1 = uc;
            localObject2 = "Unknown param type. event, param";
            localObject3 = b;
            ((cu.a)localObject1).a((String)localObject2, localObject3, str);
            bool1 = false;
            localObject1 = null;
            break;
            label1186:
            k = i2 + 1;
            i2 = k;
          }
          label1199:
          int k = 1;
          localObject1 = Boolean.valueOf(k);
        }
      }
    }
  }
  
  private static Boolean a(Boolean paramBoolean, boolean paramBoolean1)
  {
    boolean bool;
    if (paramBoolean == null) {
      bool = false;
    }
    for (Boolean localBoolean = null;; localBoolean = Boolean.valueOf(bool))
    {
      return localBoolean;
      bool = paramBoolean.booleanValue() ^ paramBoolean1;
    }
  }
  
  private static Boolean a(String paramString, ds.d paramd)
  {
    Boolean localBoolean = null;
    boolean bool = dr.k(paramString);
    if (!bool) {}
    for (;;)
    {
      return localBoolean;
      try
      {
        BigDecimal localBigDecimal = new java/math/BigDecimal;
        localBigDecimal.<init>(paramString);
        double d = 0.0D;
        localBoolean = a(localBigDecimal, paramd, d);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  private static Boolean a(String paramString, ds.f paramf)
  {
    int i = 6;
    int j = 1;
    c.a(paramf);
    int k;
    if (paramString == null)
    {
      k = 0;
      localObject1 = null;
    }
    for (;;)
    {
      label20:
      return (Boolean)localObject1;
      localObject1 = a;
      if (localObject1 != null)
      {
        localObject1 = a;
        k = ((Integer)localObject1).intValue();
        if (k != 0) {}
      }
      else
      {
        k = 0;
        localObject1 = null;
        continue;
      }
      localObject1 = a;
      k = ((Integer)localObject1).intValue();
      if (k == i)
      {
        localObject1 = d;
        if (localObject1 != null)
        {
          localObject1 = d;
          k = localObject1.length;
          if (k != 0) {
            break;
          }
        }
        k = 0;
        localObject1 = null;
      }
      else
      {
        localObject1 = b;
        if (localObject1 != null) {
          break;
        }
        k = 0;
        localObject1 = null;
      }
    }
    int i1 = a.intValue();
    Object localObject1 = c;
    int m;
    int i2;
    label177:
    label200:
    int i3;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = c;
      m = ((Boolean)localObject1).booleanValue();
      if (m != 0)
      {
        i2 = j;
        if ((i2 == 0) && (i1 != j) && (i1 != i)) {
          break label271;
        }
        localObject1 = b;
        localObject2 = d;
        if (localObject2 != null) {
          break label294;
        }
        i3 = 0;
        localObject3 = null;
        label217:
        if (i1 != j) {
          break label612;
        }
      }
    }
    label271:
    label294:
    label399:
    label461:
    label612:
    for (Object localObject2 = localObject1;; localObject2 = null)
    {
      if (paramString != null)
      {
        if (i1 == i)
        {
          if (localObject3 != null)
          {
            int i4 = ((List)localObject3).size();
            if (i4 != 0) {
              break label399;
            }
          }
          m = 0;
          localObject1 = null;
          break;
          i2 = 0;
          break label177;
          localObject1 = b;
          localObject2 = Locale.ENGLISH;
          localObject1 = ((String)localObject1).toUpperCase((Locale)localObject2);
          break label200;
          String[] arrayOfString = d;
          if (i2 != 0)
          {
            localObject2 = Arrays.asList(arrayOfString);
            localObject3 = localObject2;
            break label217;
          }
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          int i5 = arrayOfString.length;
          i3 = 0;
          localObject3 = null;
          while (i3 < i5)
          {
            String str = arrayOfString[i3];
            Locale localLocale1 = Locale.ENGLISH;
            str = str.toUpperCase(localLocale1);
            ((List)localObject2).add(str);
            i3 += 1;
          }
          localObject3 = localObject2;
          break label217;
        }
        if (localObject1 != null) {
          if ((i2 == 0) && (i1 != j)) {
            break label461;
          }
        }
      }
      for (;;)
      {
        switch (i1)
        {
        default: 
          m = 0;
          localObject1 = null;
          break label20;
          Locale localLocale2 = Locale.ENGLISH;
          paramString = paramString.toUpperCase(localLocale2);
        }
      }
      if (i2 != 0)
      {
        m = 0;
        localObject1 = null;
      }
      for (;;)
      {
        boolean bool1 = Pattern.compile((String)localObject2, m).matcher(paramString).matches();
        localObject1 = Boolean.valueOf(bool1);
        break;
        int n = 66;
      }
      boolean bool2 = paramString.startsWith((String)localObject1);
      localObject1 = Boolean.valueOf(bool2);
      break;
      bool2 = paramString.endsWith((String)localObject1);
      localObject1 = Boolean.valueOf(bool2);
      break;
      bool2 = paramString.contains((CharSequence)localObject1);
      localObject1 = Boolean.valueOf(bool2);
      break;
      bool2 = paramString.equals(localObject1);
      localObject1 = Boolean.valueOf(bool2);
      break;
      bool2 = ((List)localObject3).contains(paramString);
      localObject1 = Boolean.valueOf(bool2);
      break;
    }
  }
  
  private static Boolean a(BigDecimal paramBigDecimal, ds.d paramd, double paramDouble)
  {
    int i = 4;
    int j = -1;
    int k = 1;
    int m = 0;
    BigDecimal localBigDecimal = null;
    c.a(paramd);
    Object localObject1 = a;
    int i2;
    Boolean localBoolean1;
    if (localObject1 != null)
    {
      localObject1 = a;
      i2 = ((Integer)localObject1).intValue();
      if (i2 != 0) {}
    }
    else
    {
      k = 0;
      localBoolean1 = null;
    }
    Object localObject3;
    Object localObject4;
    int i4;
    Boolean localBoolean2;
    for (;;)
    {
      return localBoolean1;
      localObject1 = a;
      i2 = ((Integer)localObject1).intValue();
      if (i2 == i)
      {
        localObject1 = d;
        if (localObject1 != null)
        {
          localObject1 = e;
          if (localObject1 != null) {}
        }
        else
        {
          k = 0;
          localBoolean1 = null;
        }
      }
      else
      {
        localObject1 = c;
        if (localObject1 == null)
        {
          k = 0;
          localBoolean1 = null;
          continue;
        }
      }
      int i3 = a.intValue();
      localObject1 = a;
      i2 = ((Integer)localObject1).intValue();
      boolean bool2;
      if (i2 == i)
      {
        localObject1 = d;
        bool2 = dr.k((String)localObject1);
        if (bool2)
        {
          localObject1 = e;
          bool2 = dr.k((String)localObject1);
          if (bool2) {}
        }
        else
        {
          k = 0;
          localBoolean1 = null;
          continue;
        }
      }
      for (;;)
      {
        Object localObject2;
        try
        {
          localObject3 = new java/math/BigDecimal;
          localObject1 = d;
          ((BigDecimal)localObject3).<init>((String)localObject1);
          localObject1 = new java/math/BigDecimal;
          localObject4 = e;
          ((BigDecimal)localObject1).<init>((String)localObject4);
          localObject4 = null;
          if (i3 != i) {
            break label349;
          }
          if (localObject3 != null) {
            break label354;
          }
          k = 0;
          localBoolean1 = null;
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          k = 0;
          localObject2 = null;
        }
        break;
        localObject1 = c;
        bool2 = dr.k((String)localObject1);
        if (!bool2)
        {
          k = 0;
          localObject2 = null;
          break;
        }
        try
        {
          localObject1 = new java/math/BigDecimal;
          localObject3 = c;
          ((BigDecimal)localObject1).<init>((String)localObject3);
          i4 = 0;
          localObject3 = null;
          localObject4 = localObject1;
          bool2 = false;
          localObject1 = null;
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          k = 0;
          localBoolean2 = null;
        }
      }
      continue;
      label349:
      if (localObject4 != null) {}
      switch (i3)
      {
      default: 
        label354:
        k = 0;
        localBoolean2 = null;
      }
    }
    m = paramBigDecimal.compareTo((BigDecimal)localObject4);
    if (m == j) {}
    for (;;)
    {
      localBoolean2 = Boolean.valueOf(k);
      break;
      k = 0;
      localBoolean2 = null;
    }
    m = paramBigDecimal.compareTo((BigDecimal)localObject4);
    if (m == k) {}
    for (;;)
    {
      localBoolean2 = Boolean.valueOf(k);
      break;
      k = 0;
      localBoolean2 = null;
    }
    double d = 0.0D;
    boolean bool1 = paramDouble < d;
    if (bool1)
    {
      localBigDecimal = new java/math/BigDecimal;
      localBigDecimal.<init>(paramDouble);
      localObject1 = new java/math/BigDecimal;
      i4 = 2;
      ((BigDecimal)localObject1).<init>(i4);
      localBigDecimal = localBigDecimal.multiply((BigDecimal)localObject1);
      localBigDecimal = ((BigDecimal)localObject4).subtract(localBigDecimal);
      int n = paramBigDecimal.compareTo(localBigDecimal);
      if (n == k)
      {
        localBigDecimal = new java/math/BigDecimal;
        localBigDecimal.<init>(paramDouble);
        localObject1 = new java/math/BigDecimal;
        i4 = 2;
        ((BigDecimal)localObject1).<init>(i4);
        localBigDecimal = localBigDecimal.multiply((BigDecimal)localObject1);
        localBigDecimal = ((BigDecimal)localObject4).add(localBigDecimal);
        i1 = paramBigDecimal.compareTo(localBigDecimal);
        if (i1 != j) {}
      }
      for (;;)
      {
        localBoolean2 = Boolean.valueOf(k);
        break;
        k = 0;
        localBoolean2 = null;
      }
    }
    int i1 = paramBigDecimal.compareTo((BigDecimal)localObject4);
    if (i1 == 0) {}
    for (;;)
    {
      localBoolean2 = Boolean.valueOf(k);
      break;
      k = 0;
      localBoolean2 = null;
    }
    i1 = paramBigDecimal.compareTo((BigDecimal)localObject3);
    if (i1 != j)
    {
      i1 = paramBigDecimal.compareTo((BigDecimal)localObject1);
      if (i1 == k) {}
    }
    for (;;)
    {
      localBoolean2 = Boolean.valueOf(k);
      break;
      k = 0;
      localBoolean2 = null;
    }
  }
  
  protected final void a() {}
  
  final du.a[] a(String paramString, du.b[] paramArrayOfb, du.g[] paramArrayOfg)
  {
    c.a(paramString);
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    a locala1 = new android/support/v4/g/a;
    locala1.<init>();
    a locala2 = new android/support/v4/g/a;
    locala2.<init>();
    a locala3 = new android/support/v4/g/a;
    locala3.<init>();
    Object localObject1 = p();
    Object localObject2 = paramString;
    Object localObject3 = ((cg)localObject1).e(paramString);
    Object localObject4;
    boolean bool1;
    int k;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    Object localObject9;
    Object localObject10;
    Object localObject11;
    Object localObject12;
    if (localObject3 != null)
    {
      localObject1 = ((Map)localObject3).keySet();
      localObject4 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        k = ((Integer)((Iterator)localObject4).next()).intValue();
        localObject1 = Integer.valueOf(k);
        localObject1 = (du.f)((Map)localObject3).get(localObject1);
        localObject5 = Integer.valueOf(k);
        localObject2 = locala2;
        localObject5 = (BitSet)locala2.get(localObject5);
        localObject6 = Integer.valueOf(k);
        localObject2 = locala3;
        localObject6 = (BitSet)locala3.get(localObject6);
        if (localObject5 == null)
        {
          localObject5 = new java/util/BitSet;
          ((BitSet)localObject5).<init>();
          localObject6 = Integer.valueOf(k);
          localObject2 = locala2;
          locala2.put(localObject6, localObject5);
          localObject6 = new java/util/BitSet;
          ((BitSet)localObject6).<init>();
          localObject7 = Integer.valueOf(k);
          localObject2 = locala3;
          locala3.put(localObject7, localObject6);
        }
        int m = 0;
        localObject7 = null;
        for (;;)
        {
          localObject8 = a;
          int n = localObject8.length * 64;
          if (m >= n) {
            break;
          }
          localObject8 = a;
          boolean bool4 = dr.a((long[])localObject8, m);
          if (bool4)
          {
            localObject8 = ug;
            localObject9 = "Filter already evaluated. audience ID, filter ID";
            localObject10 = Integer.valueOf(k);
            localObject11 = Integer.valueOf(m);
            ((cu.a)localObject8).a((String)localObject9, localObject10, localObject11);
            ((BitSet)localObject6).set(m);
            localObject8 = b;
            bool4 = dr.a((long[])localObject8, m);
            if (bool4) {
              ((BitSet)localObject5).set(m);
            }
          }
          m += 1;
        }
        localObject7 = new com/google/android/gms/b/du$a;
        ((du.a)localObject7).<init>();
        localObject12 = Integer.valueOf(k);
        localObject2 = locala1;
        locala1.put(localObject12, localObject7);
        k = 0;
        localObject12 = Boolean.valueOf(false);
        d = ((Boolean)localObject12);
        c = ((du.f)localObject1);
        localObject1 = new com/google/android/gms/b/du$f;
        ((du.f)localObject1).<init>();
        b = ((du.f)localObject1);
        localObject1 = b;
        localObject5 = dr.a((BitSet)localObject5);
        b = ((long[])localObject5);
        localObject1 = b;
        localObject5 = dr.a((BitSet)localObject6);
        a = ((long[])localObject5);
      }
    }
    int i1;
    int i3;
    Object localObject13;
    long l2;
    label808:
    int i4;
    boolean bool5;
    if (paramArrayOfb != null)
    {
      a locala4 = new android/support/v4/g/a;
      locala4.<init>();
      localObject2 = paramArrayOfb;
      i1 = paramArrayOfb.length;
      int i2 = i1;
      bool1 = false;
      localObject1 = null;
      i3 = 0;
      localObject11 = null;
      i1 = i2;
      if (i3 < i2)
      {
        localObject13 = paramArrayOfb[i3];
        localObject1 = p();
        localObject2 = localObject13;
        localObject5 = b;
        localObject2 = paramString;
        localObject1 = ((cg)localObject1).a(paramString, (String)localObject5);
        if (localObject1 == null)
        {
          localObject1 = uc;
          localObject6 = cu.a(paramString);
          localObject2 = localObject13;
          localObject7 = b;
          ((cu.a)localObject1).a("Event aggregate wasn't created during raw event logging. appId, event", localObject6, localObject7);
          localObject5 = new com/google/android/gms/b/ck;
          localObject7 = b;
          long l1 = 1L;
          l2 = 1L;
          localObject1 = c;
          long l3 = ((Long)localObject1).longValue();
          localObject6 = paramString;
          ((ck)localObject5).<init>(paramString, (String)localObject7, l1, l2, l3);
        }
        for (;;)
        {
          p().a((ck)localObject5);
          l2 = c;
          localObject2 = localObject13;
          localObject1 = b;
          localObject2 = locala4;
          localObject1 = (Map)locala4.get(localObject1);
          if (localObject1 != null) {
            break label3603;
          }
          localObject1 = p();
          localObject2 = localObject13;
          localObject5 = b;
          localObject2 = paramString;
          localObject1 = ((cg)localObject1).f(paramString, (String)localObject5);
          if (localObject1 == null)
          {
            localObject1 = new android/support/v4/g/a;
            ((a)localObject1).<init>();
          }
          localObject2 = localObject13;
          localObject5 = b;
          localObject2 = locala4;
          locala4.put(localObject5, localObject1);
          localObject4 = localObject1;
          localObject1 = ((Map)localObject4).keySet();
          localObject9 = ((Set)localObject1).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject9).hasNext();
            if (!bool1) {
              break label1607;
            }
            i4 = ((Integer)((Iterator)localObject9).next()).intValue();
            localObject1 = Integer.valueOf(i4);
            bool1 = localHashSet.contains(localObject1);
            if (!bool1) {
              break;
            }
            localObject1 = ug;
            localObject5 = "Skipping failed audience ID";
            localObject6 = Integer.valueOf(i4);
            ((cu.a)localObject1).a((String)localObject5, localObject6);
          }
          localObject5 = ((ck)localObject1).a();
        }
        localObject1 = Integer.valueOf(i4);
        localObject2 = locala1;
        localObject1 = (du.a)locala1.get(localObject1);
        localObject5 = Integer.valueOf(i4);
        localObject2 = locala2;
        localObject5 = (BitSet)locala2.get(localObject5);
        localObject6 = Integer.valueOf(i4);
        localObject2 = locala3;
        localObject6 = (BitSet)locala3.get(localObject6);
        if (localObject1 != null) {
          break label3610;
        }
        localObject1 = new com/google/android/gms/b/du$a;
        ((du.a)localObject1).<init>();
        localObject5 = Integer.valueOf(i4);
        localObject2 = locala1;
        locala1.put(localObject5, localObject1);
        bool5 = true;
        localObject5 = Boolean.valueOf(bool5);
        d = ((Boolean)localObject5);
        localObject5 = new java/util/BitSet;
        ((BitSet)localObject5).<init>();
        localObject1 = Integer.valueOf(i4);
        localObject2 = locala2;
        locala2.put(localObject1, localObject5);
        localObject6 = new java/util/BitSet;
        ((BitSet)localObject6).<init>();
        localObject1 = Integer.valueOf(i4);
        localObject2 = locala3;
        locala3.put(localObject1, localObject6);
        localObject7 = localObject6;
      }
    }
    for (localObject3 = localObject5;; localObject3 = localObject5)
    {
      localObject1 = Integer.valueOf(i4);
      localObject1 = (List)((Map)localObject4).get(localObject1);
      Object localObject14 = ((List)localObject1).iterator();
      int i9;
      Object localObject15;
      Object localObject16;
      Object localObject17;
      label1550:
      boolean bool7;
      for (;;)
      {
        bool1 = ((Iterator)localObject14).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (ds.b)((Iterator)localObject14).next();
        localObject5 = u();
        i9 = 2;
        bool5 = ((cu)localObject5).a(i9);
        if (bool5)
        {
          localObject5 = ug;
          localObject15 = Integer.valueOf(i4);
          localObject16 = a;
          String str = b;
          localObject2 = localObject15;
          localObject17 = localObject16;
          ((cu.a)localObject5).a("Evaluating filter. audience, filter, event", localObject15, localObject16, str);
          localObject5 = ug;
          localObject6 = "Filter definition";
          localObject15 = dr.a((ds.b)localObject1);
          localObject2 = localObject15;
          ((cu.a)localObject5).a((String)localObject6, localObject15);
        }
        localObject5 = a;
        if (localObject5 != null)
        {
          localObject5 = a;
          i5 = ((Integer)localObject5).intValue();
          i9 = 256;
          if (i5 <= i9) {}
        }
        else
        {
          localObject5 = uc;
          localObject6 = "Invalid event filter ID. appId, id";
          localObject15 = cu.a(paramString);
          localObject1 = String.valueOf(a);
          localObject2 = localObject15;
          ((cu.a)localObject5).a((String)localObject6, localObject15, localObject1);
          continue;
        }
        localObject5 = a;
        int i5 = ((Integer)localObject5).intValue();
        boolean bool6 = ((BitSet)localObject3).get(i5);
        if (bool6)
        {
          localObject5 = ug;
          localObject6 = "Event filter already evaluated true. audience ID, filter ID";
          localObject15 = Integer.valueOf(i4);
          localObject1 = a;
          localObject2 = localObject15;
          ((cu.a)localObject5).a((String)localObject6, localObject15, localObject1);
        }
        else
        {
          localObject2 = this;
          localObject17 = localObject13;
          localObject6 = a((ds.b)localObject1, (du.b)localObject13, l2);
          localObject5 = u();
          localObject2 = g;
          localObject15 = localObject2;
          localObject16 = "Event filter result";
          if (localObject6 == null) {}
          for (localObject5 = "null";; localObject5 = localObject6)
          {
            localObject2 = localObject15;
            localObject17 = localObject16;
            ((cu.a)localObject15).a((String)localObject16, localObject5);
            if (localObject6 != null) {
              break label1550;
            }
            localObject1 = Integer.valueOf(i4);
            localHashSet.add(localObject1);
            break;
          }
          localObject5 = a;
          int i6 = ((Integer)localObject5).intValue();
          ((BitSet)localObject7).set(i6);
          bool7 = ((Boolean)localObject6).booleanValue();
          if (bool7)
          {
            localObject1 = a;
            i = ((Integer)localObject1).intValue();
            ((BitSet)localObject3).set(i);
          }
        }
      }
      label1607:
      int i = i3 + 1;
      i3 = i;
      break;
      label1756:
      boolean bool2;
      int i11;
      if (paramArrayOfg != null)
      {
        localObject8 = new android/support/v4/g/a;
        ((a)localObject8).<init>();
        localObject2 = paramArrayOfg;
        int i10 = paramArrayOfg.length;
        i = 0;
        localObject1 = null;
        k = 0;
        localObject12 = null;
        if (k < i10)
        {
          localObject10 = paramArrayOfg[k];
          localObject1 = b;
          localObject1 = (Map)((Map)localObject8).get(localObject1);
          if (localObject1 != null) {
            break label3589;
          }
          localObject1 = p();
          localObject5 = b;
          localObject2 = paramString;
          localObject1 = ((cg)localObject1).g(paramString, (String)localObject5);
          if (localObject1 == null)
          {
            localObject1 = new android/support/v4/g/a;
            ((a)localObject1).<init>();
          }
          localObject5 = b;
          ((Map)localObject8).put(localObject5, localObject1);
          localObject4 = localObject1;
          localObject1 = ((Map)localObject4).keySet();
          localObject11 = ((Set)localObject1).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject11).hasNext();
            if (!bool2) {
              break label3263;
            }
            i11 = ((Integer)((Iterator)localObject11).next()).intValue();
            localObject1 = Integer.valueOf(i11);
            bool2 = localHashSet.contains(localObject1);
            if (!bool2) {
              break;
            }
            localObject1 = ug;
            localObject5 = "Skipping failed audience ID";
            localObject6 = Integer.valueOf(i11);
            ((cu.a)localObject1).a((String)localObject5, localObject6);
          }
          localObject1 = Integer.valueOf(i11);
          localObject2 = locala1;
          localObject1 = (du.a)locala1.get(localObject1);
          localObject5 = Integer.valueOf(i11);
          localObject2 = locala2;
          localObject5 = (BitSet)locala2.get(localObject5);
          localObject6 = Integer.valueOf(i11);
          localObject2 = locala3;
          localObject6 = (BitSet)locala3.get(localObject6);
          if (localObject1 != null) {
            break label3596;
          }
          localObject1 = new com/google/android/gms/b/du$a;
          ((du.a)localObject1).<init>();
          localObject5 = Integer.valueOf(i11);
          localObject2 = locala1;
          locala1.put(localObject5, localObject1);
          bool7 = true;
          localObject5 = Boolean.valueOf(bool7);
          d = ((Boolean)localObject5);
          localObject5 = new java/util/BitSet;
          ((BitSet)localObject5).<init>();
          localObject1 = Integer.valueOf(i11);
          localObject2 = locala2;
          locala2.put(localObject1, localObject5);
          localObject6 = new java/util/BitSet;
          ((BitSet)localObject6).<init>();
          localObject1 = Integer.valueOf(i11);
          localObject2 = locala3;
          locala3.put(localObject1, localObject6);
        }
      }
      label2330:
      label2463:
      label2589:
      label3199:
      label3206:
      label3263:
      label3589:
      label3596:
      for (localObject7 = localObject5;; localObject7 = localObject5)
      {
        localObject1 = Integer.valueOf(i11);
        localObject1 = (List)((Map)localObject4).get(localObject1);
        Iterator localIterator = ((List)localObject1).iterator();
        for (;;)
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (ds.e)localIterator.next();
          localObject5 = u();
          int i12 = 2;
          bool7 = ((cu)localObject5).a(i12);
          if (bool7)
          {
            localObject5 = ug;
            localObject13 = Integer.valueOf(i11);
            localObject14 = a;
            localObject15 = b;
            localObject2 = localObject13;
            localObject17 = localObject14;
            ((cu.a)localObject5).a("Evaluating filter. audience, filter, property", localObject13, localObject14, localObject15);
            localObject5 = u();
            localObject3 = g;
            localObject13 = "Filter definition";
            if (localObject1 != null) {
              break label2330;
            }
          }
          for (localObject5 = "null";; localObject5 = ((StringBuilder)localObject5).toString())
          {
            localObject2 = localObject13;
            ((cu.a)localObject3).a((String)localObject13, localObject5);
            localObject5 = a;
            if (localObject5 != null)
            {
              localObject5 = a;
              i7 = ((Integer)localObject5).intValue();
              i12 = 256;
              if (i7 <= i12) {
                break label2463;
              }
            }
            localObject5 = uc;
            localObject6 = "Invalid property filter ID. appId, id";
            localObject7 = cu.a(paramString);
            localObject1 = String.valueOf(a);
            ((cu.a)localObject5).a((String)localObject6, localObject7, localObject1);
            localObject1 = Integer.valueOf(i11);
            localHashSet.add(localObject1);
            break;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject2 = "\nproperty_filter {\n";
            ((StringBuilder)localObject5).append((String)localObject2);
            localObject2 = a;
            localObject16 = localObject2;
            localObject17 = "filter_id";
            dr.a((StringBuilder)localObject5, 0, (String)localObject17, localObject2);
            localObject2 = b;
            localObject16 = localObject2;
            localObject17 = "property_name";
            dr.a((StringBuilder)localObject5, 0, (String)localObject17, localObject2);
            int i14 = 1;
            localObject2 = c;
            localObject15 = localObject2;
            i1 = i14;
            localObject17 = localObject2;
            dr.a((StringBuilder)localObject5, i14, (ds.c)localObject2);
            localObject14 = "}\n";
            localObject2 = localObject14;
            ((StringBuilder)localObject5).append((String)localObject14);
          }
          localObject5 = a;
          int i7 = ((Integer)localObject5).intValue();
          i8 = ((BitSet)localObject7).get(i7);
          if (i8 != 0)
          {
            localObject5 = ug;
            localObject3 = "Property filter already evaluated true. audience ID, filter ID";
            localObject13 = Integer.valueOf(i11);
            localObject1 = a;
            localObject2 = localObject13;
            ((cu.a)localObject5).a((String)localObject3, localObject13, localObject1);
          }
          else
          {
            localObject5 = c;
            if (localObject5 == null)
            {
              localObject5 = uc;
              localObject3 = "Missing property filter. property";
              localObject2 = b;
              localObject13 = localObject2;
              ((cu.a)localObject5).a((String)localObject3, localObject2);
              i8 = 0;
              localObject5 = null;
              localObject3 = u();
              localObject2 = g;
              localObject13 = localObject2;
              localObject14 = "Property filter result";
              if (localObject5 != null) {
                break label3199;
              }
            }
            for (localObject3 = "null";; localObject3 = localObject5)
            {
              localObject2 = localObject13;
              localObject17 = localObject14;
              ((cu.a)localObject13).a((String)localObject14, localObject3);
              if (localObject5 != null) {
                break label3206;
              }
              localObject1 = Integer.valueOf(i11);
              localHashSet.add(localObject1);
              break;
              localObject3 = Boolean.TRUE;
              localObject2 = c;
              localObject13 = localObject2;
              boolean bool8 = ((Boolean)localObject3).equals(localObject2);
              localObject2 = d;
              localObject13 = localObject2;
              if (localObject2 != null)
              {
                localObject2 = b;
                localObject13 = localObject2;
                if (localObject2 == null)
                {
                  localObject5 = uc;
                  localObject3 = "No number filter for long property. property";
                  localObject2 = b;
                  localObject13 = localObject2;
                  ((cu.a)localObject5).a((String)localObject3, localObject2);
                  i8 = 0;
                  localObject5 = null;
                  break label2589;
                }
                localObject2 = d;
                localObject13 = localObject2;
                long l4 = ((Long)localObject2).longValue();
                localObject5 = b;
                localObject5 = a(a(l4, (ds.d)localObject5), bool8);
                break label2589;
              }
              localObject2 = f;
              localObject13 = localObject2;
              if (localObject2 != null)
              {
                localObject2 = b;
                localObject13 = localObject2;
                if (localObject2 == null)
                {
                  localObject5 = uc;
                  localObject3 = "No number filter for double property. property";
                  localObject2 = b;
                  localObject13 = localObject2;
                  ((cu.a)localObject5).a((String)localObject3, localObject2);
                  i8 = 0;
                  localObject5 = null;
                  break label2589;
                }
                localObject2 = f;
                localObject13 = localObject2;
                double d = ((Double)localObject2).doubleValue();
                localObject5 = b;
                localObject5 = a(a(d, (ds.d)localObject5), bool8);
                break label2589;
              }
              localObject2 = c;
              localObject13 = localObject2;
              if (localObject2 != null)
              {
                localObject2 = a;
                localObject13 = localObject2;
                if (localObject2 == null)
                {
                  localObject2 = b;
                  localObject13 = localObject2;
                  if (localObject2 == null)
                  {
                    localObject5 = uc;
                    localObject3 = "No string or number filter defined. property";
                    localObject2 = b;
                    localObject13 = localObject2;
                    ((cu.a)localObject5).a((String)localObject3, localObject2);
                  }
                  for (;;)
                  {
                    i8 = 0;
                    localObject5 = null;
                    break;
                    localObject2 = c;
                    localObject13 = localObject2;
                    boolean bool9 = dr.k((String)localObject2);
                    if (bool9)
                    {
                      localObject2 = c;
                      localObject13 = localObject2;
                      localObject5 = b;
                      localObject5 = a(a((String)localObject2, (ds.d)localObject5), bool8);
                      break;
                    }
                    localObject5 = uc;
                    localObject3 = "Invalid user property value for Numeric number filter. property, value";
                    localObject13 = b;
                    localObject14 = c;
                    localObject2 = localObject13;
                    localObject17 = localObject14;
                    ((cu.a)localObject5).a((String)localObject3, localObject13, localObject14);
                  }
                }
                localObject2 = c;
                localObject13 = localObject2;
                localObject5 = a;
                localObject5 = a(a((String)localObject2, (ds.f)localObject5), bool8);
                break label2589;
              }
              localObject5 = uc;
              localObject3 = "User property has no value, property";
              localObject2 = b;
              localObject13 = localObject2;
              ((cu.a)localObject5).a((String)localObject3, localObject2);
              i8 = 0;
              localObject5 = null;
              break label2589;
            }
            localObject3 = a;
            int i13 = ((Integer)localObject3).intValue();
            ((BitSet)localObject6).set(i13);
            i8 = ((Boolean)localObject5).booleanValue();
            if (i8 != 0)
            {
              localObject1 = a;
              j = ((Integer)localObject1).intValue();
              ((BitSet)localObject7).set(j);
            }
          }
        }
        int j = k + 1;
        k = j;
        break;
        localObject3 = new du.a[locala2.size()];
        j = 0;
        localObject1 = null;
        localObject4 = locala2.keySet().iterator();
        int i8 = 0;
        localObject5 = null;
        boolean bool3;
        do
        {
          bool3 = ((Iterator)localObject4).hasNext();
          if (!bool3) {
            break;
          }
          k = ((Integer)((Iterator)localObject4).next()).intValue();
          localObject1 = Integer.valueOf(k);
          bool3 = localHashSet.contains(localObject1);
        } while (bool3);
        localObject1 = Integer.valueOf(k);
        localObject2 = locala1;
        localObject1 = (du.a)locala1.get(localObject1);
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/b/du$a;
          ((du.a)localObject1).<init>();
        }
        for (localObject7 = localObject1;; localObject7 = localObject1)
        {
          i9 = i8 + 1;
          localObject3[i8] = localObject7;
          localObject1 = Integer.valueOf(k);
          a = ((Integer)localObject1);
          localObject1 = new com/google/android/gms/b/du$f;
          ((du.f)localObject1).<init>();
          b = ((du.f)localObject1);
          localObject5 = b;
          localObject1 = Integer.valueOf(k);
          localObject2 = locala2;
          localObject1 = dr.a((BitSet)locala2.get(localObject1));
          b = ((long[])localObject1);
          localObject5 = b;
          localObject1 = Integer.valueOf(k);
          localObject2 = locala3;
          localObject1 = dr.a((BitSet)locala3.get(localObject1));
          a = ((long[])localObject1);
          localObject1 = p();
          localObject5 = b;
          localObject2 = paramString;
          ((cg)localObject1).a(paramString, k, (du.f)localObject5);
          i8 = i9;
          break;
          return (du.a[])Arrays.copyOf((Object[])localObject3, i8);
        }
        localObject4 = localObject1;
        break label1756;
      }
      label3603:
      localObject4 = localObject1;
      break label808;
      label3610:
      localObject7 = localObject6;
    }
  }
}


/* Location:              com/google/android/gms/b/cc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */