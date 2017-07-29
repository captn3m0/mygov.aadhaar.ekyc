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
      paramd = a(new BigDecimal(paramDouble), paramd, Math.ulp(paramDouble));
      return paramd;
    }
    catch (NumberFormatException paramd) {}
    return null;
  }
  
  private static Boolean a(long paramLong, ds.d paramd)
  {
    try
    {
      paramd = a(new BigDecimal(paramLong), paramd, 0.0D);
      return paramd;
    }
    catch (NumberFormatException paramd) {}
    return null;
  }
  
  private Boolean a(ds.b paramb, du.b paramb1, long paramLong)
  {
    if (e != null)
    {
      localObject1 = a(paramLong, e);
      if (localObject1 == null) {
        return null;
      }
      if (!((Boolean)localObject1).booleanValue()) {
        return Boolean.valueOf(false);
      }
    }
    Object localObject2 = new HashSet();
    Object localObject1 = c;
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      localObject3 = localObject1[i];
      if (TextUtils.isEmpty(d))
      {
        uc.a("null or empty param name in filter. event", b);
        return null;
      }
      ((Set)localObject2).add(d);
      i += 1;
    }
    localObject1 = new a();
    Object localObject3 = a;
    j = localObject3.length;
    i = 0;
    Object localObject4;
    if (i < j)
    {
      localObject4 = localObject3[i];
      if (((Set)localObject2).contains(a))
      {
        if (c == null) {
          break label212;
        }
        ((Map)localObject1).put(a, c);
      }
      for (;;)
      {
        i += 1;
        break;
        label212:
        if (e != null)
        {
          ((Map)localObject1).put(a, e);
        }
        else
        {
          if (b == null) {
            break label270;
          }
          ((Map)localObject1).put(a, b);
        }
      }
      label270:
      uc.a("Unknown value for param. event, param", b, a);
      return null;
    }
    localObject2 = c;
    int k = localObject2.length;
    i = 0;
    while (i < k)
    {
      paramb = localObject2[i];
      int m = Boolean.TRUE.equals(c);
      localObject3 = d;
      if (TextUtils.isEmpty((CharSequence)localObject3))
      {
        uc.a("Event has empty param name. event", b);
        return null;
      }
      localObject4 = ((Map)localObject1).get(localObject3);
      if ((localObject4 instanceof Long))
      {
        if (b == null)
        {
          uc.a("No number filter for long param. event, param", b, localObject3);
          return null;
        }
        paramb = a(((Long)localObject4).longValue(), b);
        if (paramb == null) {
          return null;
        }
        if (!paramb.booleanValue()) {}
        for (j = 1; (j ^ m) != 0; j = 0) {
          return Boolean.valueOf(false);
        }
      }
      if ((localObject4 instanceof Double))
      {
        if (b == null)
        {
          uc.a("No number filter for double param. event, param", b, localObject3);
          return null;
        }
        paramb = a(((Double)localObject4).doubleValue(), b);
        if (paramb == null) {
          return null;
        }
        if (!paramb.booleanValue()) {}
        for (j = 1; (j ^ m) != 0; j = 0) {
          return Boolean.valueOf(false);
        }
      }
      if ((localObject4 instanceof String))
      {
        if (a != null) {
          paramb = a((String)localObject4, a);
        }
        while (paramb == null)
        {
          return null;
          if (b != null)
          {
            if (dr.k((String)localObject4))
            {
              paramb = a((String)localObject4, b);
            }
            else
            {
              uc.a("Invalid param value for number filter. event, param", b, localObject3);
              return null;
            }
          }
          else
          {
            uc.a("No filter for String param. event, param", b, localObject3);
            return null;
          }
        }
        if (!paramb.booleanValue()) {}
        for (j = 1; (j ^ m) != 0; j = 0) {
          return Boolean.valueOf(false);
        }
      }
      if (localObject4 == null)
      {
        ug.a("Missing param for filter. event, param", b, localObject3);
        return Boolean.valueOf(false);
      }
      uc.a("Unknown param type. event, param", b, localObject3);
      return null;
      i += 1;
    }
    return Boolean.valueOf(true);
  }
  
  private static Boolean a(Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null) {
      return null;
    }
    return Boolean.valueOf(paramBoolean.booleanValue() ^ paramBoolean1);
  }
  
  private static Boolean a(String paramString, ds.d paramd)
  {
    if (!dr.k(paramString)) {
      return null;
    }
    try
    {
      paramString = a(new BigDecimal(paramString), paramd, 0.0D);
      return paramString;
    }
    catch (NumberFormatException paramString) {}
    return null;
  }
  
  private static Boolean a(String paramString, ds.f paramf)
  {
    c.a(paramf);
    if (paramString == null) {
      return null;
    }
    if ((a == null) || (a.intValue() == 0)) {
      return null;
    }
    if (a.intValue() == 6)
    {
      if ((d == null) || (d.length == 0)) {
        return null;
      }
    }
    else if (b == null) {
      return null;
    }
    int k = a.intValue();
    int i;
    String str1;
    if ((c != null) && (c.booleanValue()))
    {
      i = 1;
      if ((i == 0) && (k != 1) && (k != 6)) {
        break label169;
      }
      str1 = b;
      label119:
      if (d != null) {
        break label184;
      }
      paramf = null;
      label128:
      if (k != 1) {
        break label412;
      }
    }
    label169:
    label184:
    label256:
    label314:
    label412:
    for (Object localObject = str1;; localObject = null)
    {
      if (paramString != null)
      {
        if (k == 6)
        {
          if ((paramf != null) && (paramf.size() != 0)) {
            break label256;
          }
          return null;
          i = 0;
          break;
          str1 = b.toUpperCase(Locale.ENGLISH);
          break label119;
          localObject = d;
          if (i != 0)
          {
            paramf = Arrays.asList((Object[])localObject);
            break label128;
          }
          paramf = new ArrayList();
          int m = localObject.length;
          int j = 0;
          while (j < m)
          {
            paramf.add(localObject[j].toUpperCase(Locale.ENGLISH));
            j += 1;
          }
          break label128;
        }
        if (str1 != null)
        {
          str2 = paramString;
          if (i == 0) {
            if (k != 1) {
              break label314;
            }
          }
        }
      }
      for (String str2 = paramString;; str2 = paramString.toUpperCase(Locale.ENGLISH)) {
        switch (k)
        {
        default: 
          return null;
        }
      }
      if (i != 0) {}
      for (i = 0;; i = 66) {
        return Boolean.valueOf(Pattern.compile((String)localObject, i).matcher(str2).matches());
      }
      return Boolean.valueOf(str2.startsWith(str1));
      return Boolean.valueOf(str2.endsWith(str1));
      return Boolean.valueOf(str2.contains(str1));
      return Boolean.valueOf(str2.equals(str1));
      return Boolean.valueOf(paramf.contains(str2));
    }
  }
  
  private static Boolean a(BigDecimal paramBigDecimal, ds.d paramd, double paramDouble)
  {
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool1 = true;
    c.a(paramd);
    if ((a == null) || (a.intValue() == 0)) {
      return null;
    }
    if (a.intValue() == 4)
    {
      if ((d == null) || (e == null)) {
        return null;
      }
    }
    else if (c == null) {
      return null;
    }
    int i = a.intValue();
    if (a.intValue() == 4) {
      if ((!dr.k(d)) || (!dr.k(e))) {
        return null;
      }
    }
    BigDecimal localBigDecimal1;
    BigDecimal localBigDecimal2;
    for (;;)
    {
      try
      {
        localBigDecimal1 = new BigDecimal(d);
        paramd = new BigDecimal(e);
        localBigDecimal2 = null;
        if (i != 4) {
          break;
        }
        if (localBigDecimal1 != null) {
          break label202;
        }
        return null;
      }
      catch (NumberFormatException paramBigDecimal)
      {
        return null;
      }
      if (!dr.k(c)) {
        return null;
      }
      try
      {
        localBigDecimal2 = new BigDecimal(c);
        localBigDecimal1 = null;
        paramd = null;
      }
      catch (NumberFormatException paramBigDecimal)
      {
        return null;
      }
    }
    if (localBigDecimal2 != null) {}
    switch (i)
    {
    default: 
      return null;
    case 1: 
      if (paramBigDecimal.compareTo(localBigDecimal2) == -1) {}
      for (;;)
      {
        return Boolean.valueOf(bool1);
        bool1 = false;
      }
    case 2: 
      if (paramBigDecimal.compareTo(localBigDecimal2) == 1) {}
      for (bool1 = bool2;; bool1 = false) {
        return Boolean.valueOf(bool1);
      }
    case 3: 
      label202:
      if (paramDouble != 0.0D)
      {
        if ((paramBigDecimal.compareTo(localBigDecimal2.subtract(new BigDecimal(paramDouble).multiply(new BigDecimal(2)))) == 1) && (paramBigDecimal.compareTo(localBigDecimal2.add(new BigDecimal(paramDouble).multiply(new BigDecimal(2)))) == -1)) {}
        for (bool1 = bool3;; bool1 = false) {
          return Boolean.valueOf(bool1);
        }
      }
      if (paramBigDecimal.compareTo(localBigDecimal2) == 0) {}
      for (bool1 = bool4;; bool1 = false) {
        return Boolean.valueOf(bool1);
      }
    }
    if ((paramBigDecimal.compareTo(localBigDecimal1) != -1) && (paramBigDecimal.compareTo(paramd) != 1)) {}
    for (bool1 = bool5;; bool1 = false) {
      return Boolean.valueOf(bool1);
    }
  }
  
  protected final void a() {}
  
  final du.a[] a(String paramString, du.b[] paramArrayOfb, du.g[] paramArrayOfg)
  {
    c.a(paramString);
    HashSet localHashSet = new HashSet();
    a locala1 = new a();
    a locala2 = new a();
    a locala3 = new a();
    Object localObject4 = p().e(paramString);
    Object localObject5;
    int j;
    Object localObject6;
    Object localObject3;
    Object localObject2;
    Object localObject1;
    int i;
    if (localObject4 != null)
    {
      localObject5 = ((Map)localObject4).keySet().iterator();
      while (((Iterator)localObject5).hasNext())
      {
        j = ((Integer)((Iterator)localObject5).next()).intValue();
        localObject6 = (du.f)((Map)localObject4).get(Integer.valueOf(j));
        localObject3 = (BitSet)locala2.get(Integer.valueOf(j));
        localObject2 = (BitSet)locala3.get(Integer.valueOf(j));
        localObject1 = localObject3;
        if (localObject3 == null)
        {
          localObject1 = new BitSet();
          locala2.put(Integer.valueOf(j), localObject1);
          localObject2 = new BitSet();
          locala3.put(Integer.valueOf(j), localObject2);
        }
        i = 0;
        while (i < a.length * 64)
        {
          if (dr.a(a, i))
          {
            ug.a("Filter already evaluated. audience ID, filter ID", Integer.valueOf(j), Integer.valueOf(i));
            ((BitSet)localObject2).set(i);
            if (dr.a(b, i)) {
              ((BitSet)localObject1).set(i);
            }
          }
          i += 1;
        }
        localObject3 = new du.a();
        locala1.put(Integer.valueOf(j), localObject3);
        d = Boolean.valueOf(false);
        c = ((du.f)localObject6);
        b = new du.f();
        b.b = dr.a((BitSet)localObject1);
        b.a = dr.a((BitSet)localObject2);
      }
    }
    Object localObject7;
    long l;
    label559:
    Iterator localIterator;
    label573:
    int k;
    if (paramArrayOfb != null)
    {
      localObject6 = new a();
      j = paramArrayOfb.length;
      i = 0;
      if (i < j)
      {
        localObject7 = paramArrayOfb[i];
        localObject1 = p().a(paramString, b);
        if (localObject1 == null) {
          uc.a("Event aggregate wasn't created during raw event logging. appId, event", cu.a(paramString), b);
        }
        for (localObject1 = new ck(paramString, b, 1L, 1L, c.longValue());; localObject1 = ((ck)localObject1).a())
        {
          p().a((ck)localObject1);
          l = c;
          localObject1 = (Map)((Map)localObject6).get(b);
          if (localObject1 != null) {
            break label2307;
          }
          localObject2 = p().f(paramString, b);
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = new a();
          }
          ((Map)localObject6).put(b, localObject1);
          localIterator = ((Map)localObject1).keySet().iterator();
          for (;;)
          {
            if (!localIterator.hasNext()) {
              break label1080;
            }
            k = ((Integer)localIterator.next()).intValue();
            if (!localHashSet.contains(Integer.valueOf(k))) {
              break;
            }
            ug.a("Skipping failed audience ID", Integer.valueOf(k));
          }
        }
        localObject4 = (du.a)locala1.get(Integer.valueOf(k));
        localObject3 = (BitSet)locala2.get(Integer.valueOf(k));
        localObject2 = (BitSet)locala3.get(Integer.valueOf(k));
        if (localObject4 != null) {
          break label2310;
        }
        localObject2 = new du.a();
        locala1.put(Integer.valueOf(k), localObject2);
        d = Boolean.valueOf(true);
        localObject3 = new BitSet();
        locala2.put(Integer.valueOf(k), localObject3);
        localObject2 = new BitSet();
        locala3.put(Integer.valueOf(k), localObject2);
      }
    }
    label1043:
    label1080:
    label1192:
    label1206:
    label1572:
    label1640:
    label1712:
    label2043:
    label2049:
    label2083:
    label2298:
    label2301:
    label2304:
    label2307:
    label2310:
    for (;;)
    {
      Object localObject8 = ((List)((Map)localObject1).get(Integer.valueOf(k))).iterator();
      Object localObject9;
      while (((Iterator)localObject8).hasNext())
      {
        localObject9 = (ds.b)((Iterator)localObject8).next();
        if (u().a(2))
        {
          ug.a("Evaluating filter. audience, filter, event", Integer.valueOf(k), a, b);
          ug.a("Filter definition", dr.a((ds.b)localObject9));
        }
        if ((a == null) || (a.intValue() > 256))
        {
          uc.a("Invalid event filter ID. appId, id", cu.a(paramString), String.valueOf(a));
        }
        else if (((BitSet)localObject3).get(a.intValue()))
        {
          ug.a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(k), a);
        }
        else
        {
          localObject5 = a((ds.b)localObject9, (du.b)localObject7, l);
          cu.a locala = ug;
          if (localObject5 == null) {}
          for (localObject4 = "null";; localObject4 = localObject5)
          {
            locala.a("Event filter result", localObject4);
            if (localObject5 != null) {
              break label1043;
            }
            localHashSet.add(Integer.valueOf(k));
            break;
          }
          ((BitSet)localObject2).set(a.intValue());
          if (((Boolean)localObject5).booleanValue()) {
            ((BitSet)localObject3).set(a.intValue());
          }
        }
      }
      break label573;
      i += 1;
      break;
      if (paramArrayOfg != null)
      {
        localObject5 = new a();
        j = paramArrayOfg.length;
        i = 0;
        if (i < j)
        {
          localObject6 = paramArrayOfg[i];
          localObject1 = (Map)((Map)localObject5).get(b);
          if (localObject1 != null) {
            break label2301;
          }
          localObject1 = p().g(paramString, b);
          paramArrayOfb = (du.b[])localObject1;
          if (localObject1 == null) {
            paramArrayOfb = new a();
          }
          ((Map)localObject5).put(b, paramArrayOfb);
          localObject1 = paramArrayOfb;
          localObject7 = ((Map)localObject1).keySet().iterator();
          while (((Iterator)localObject7).hasNext())
          {
            k = ((Integer)((Iterator)localObject7).next()).intValue();
            if (localHashSet.contains(Integer.valueOf(k)))
            {
              ug.a("Skipping failed audience ID", Integer.valueOf(k));
            }
            else
            {
              paramArrayOfb = (du.a)locala1.get(Integer.valueOf(k));
              localObject3 = (BitSet)locala2.get(Integer.valueOf(k));
              localObject2 = (BitSet)locala3.get(Integer.valueOf(k));
              if (paramArrayOfb != null) {
                break label2304;
              }
              paramArrayOfb = new du.a();
              locala1.put(Integer.valueOf(k), paramArrayOfb);
              d = Boolean.valueOf(true);
              localObject3 = new BitSet();
              locala2.put(Integer.valueOf(k), localObject3);
              localObject2 = new BitSet();
              locala3.put(Integer.valueOf(k), localObject2);
            }
          }
        }
      }
      for (;;)
      {
        localIterator = ((List)((Map)localObject1).get(Integer.valueOf(k))).iterator();
        for (;;)
        {
          if (!localIterator.hasNext()) {
            break label2083;
          }
          localObject8 = (ds.e)localIterator.next();
          if (u().a(2))
          {
            ug.a("Evaluating filter. audience, filter, property", Integer.valueOf(k), a, b);
            localObject4 = ug;
            if (localObject8 != null) {
              break label1572;
            }
          }
          for (paramArrayOfb = "null";; paramArrayOfb = paramArrayOfb.toString())
          {
            ((cu.a)localObject4).a("Filter definition", paramArrayOfb);
            if ((a != null) && (a.intValue() <= 256)) {
              break label1640;
            }
            uc.a("Invalid property filter ID. appId, id", cu.a(paramString), String.valueOf(a));
            localHashSet.add(Integer.valueOf(k));
            break;
            paramArrayOfb = new StringBuilder();
            paramArrayOfb.append("\nproperty_filter {\n");
            dr.a(paramArrayOfb, 0, "filter_id", a);
            dr.a(paramArrayOfb, 0, "property_name", b);
            dr.a(paramArrayOfb, 1, c);
            paramArrayOfb.append("}\n");
          }
          if (((BitSet)localObject3).get(a.intValue()))
          {
            ug.a("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(k), a);
          }
          else
          {
            paramArrayOfb = c;
            if (paramArrayOfb == null)
            {
              uc.a("Missing property filter. property", b);
              paramArrayOfb = null;
              localObject9 = ug;
              if (paramArrayOfb != null) {
                break label2043;
              }
            }
            for (localObject4 = "null";; localObject4 = paramArrayOfb)
            {
              ((cu.a)localObject9).a("Property filter result", localObject4);
              if (paramArrayOfb != null) {
                break label2049;
              }
              localHashSet.add(Integer.valueOf(k));
              break;
              boolean bool = Boolean.TRUE.equals(c);
              if (d != null)
              {
                if (b == null)
                {
                  uc.a("No number filter for long property. property", b);
                  paramArrayOfb = null;
                  break label1712;
                }
                paramArrayOfb = a(a(d.longValue(), b), bool);
                break label1712;
              }
              if (f != null)
              {
                if (b == null)
                {
                  uc.a("No number filter for double property. property", b);
                  paramArrayOfb = null;
                  break label1712;
                }
                paramArrayOfb = a(a(f.doubleValue(), b), bool);
                break label1712;
              }
              if (c != null)
              {
                if (a == null)
                {
                  if (b == null) {
                    uc.a("No string or number filter defined. property", b);
                  }
                  for (;;)
                  {
                    paramArrayOfb = null;
                    break;
                    if (dr.k(c))
                    {
                      paramArrayOfb = a(a(c, b), bool);
                      break;
                    }
                    uc.a("Invalid user property value for Numeric number filter. property, value", b, c);
                  }
                }
                paramArrayOfb = a(a(c, a), bool);
                break label1712;
              }
              uc.a("User property has no value, property", b);
              paramArrayOfb = null;
              break label1712;
            }
            ((BitSet)localObject2).set(a.intValue());
            if (paramArrayOfb.booleanValue()) {
              ((BitSet)localObject3).set(a.intValue());
            }
          }
        }
        break label1206;
        i += 1;
        break;
        paramArrayOfg = new du.a[locala2.size()];
        localObject1 = locala2.keySet().iterator();
        i = 0;
        while (((Iterator)localObject1).hasNext())
        {
          j = ((Integer)((Iterator)localObject1).next()).intValue();
          if (!localHashSet.contains(Integer.valueOf(j)))
          {
            paramArrayOfb = (du.a)locala1.get(Integer.valueOf(j));
            if (paramArrayOfb != null) {
              break label2298;
            }
            paramArrayOfb = new du.a();
          }
        }
        for (;;)
        {
          paramArrayOfg[i] = paramArrayOfb;
          a = Integer.valueOf(j);
          b = new du.f();
          b.b = dr.a((BitSet)locala2.get(Integer.valueOf(j)));
          b.a = dr.a((BitSet)locala3.get(Integer.valueOf(j)));
          p().a(paramString, j, b);
          i += 1;
          break;
          return (du.a[])Arrays.copyOf(paramArrayOfg, i);
        }
        break label1192;
      }
      break label559;
    }
  }
}


/* Location:              com/google/android/gms/b/cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */