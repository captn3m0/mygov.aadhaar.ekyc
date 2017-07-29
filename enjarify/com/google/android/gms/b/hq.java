package com.google.android.gms.b;

import java.io.IOException;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public final class hq
{
  private final hk a;
  private final int b;
  private String c;
  private String d;
  private final boolean e;
  private final int f;
  private final int g;
  
  public hq(int paramInt1, int paramInt2, int paramInt3)
  {
    b = paramInt1;
    int j = 0;
    hp localhp = null;
    e = false;
    if ((paramInt2 > i) || (paramInt2 < 0))
    {
      f = i;
      if (paramInt3 > 0) {
        break label86;
      }
      j = 1;
    }
    label86:
    for (g = j;; g = paramInt3)
    {
      localhp = new com/google/android/gms/b/hp;
      i = f;
      localhp.<init>(i);
      a = localhp;
      return;
      f = paramInt2;
      break;
    }
  }
  
  private boolean a(String paramString, HashSet paramHashSet)
  {
    int i = 32;
    int j = 1;
    String str1 = "\n";
    String[] arrayOfString = paramString.split(str1);
    int k = arrayOfString.length;
    if (k == 0) {}
    label37:
    do
    {
      return j;
      k = 0;
      str1 = null;
      m = arrayOfString.length;
    } while (k >= m);
    String str2 = arrayOfString[k];
    String str3 = "'";
    int m = str2.indexOf(str3);
    int n = -1;
    Object localObject;
    String str4;
    if (m != n)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>(str2);
      m = j;
      n = 0;
      str4 = null;
      int i3 = m + 2;
      int i7 = ((StringBuilder)localObject).length();
      int i1;
      if (i3 <= i7)
      {
        i3 = ((StringBuilder)localObject).charAt(m);
        int i8 = 39;
        if (i3 == i8)
        {
          n = m + -1;
          n = ((StringBuilder)localObject).charAt(n);
          if (n == i) {
            break label283;
          }
          i1 = m + 1;
          i1 = ((StringBuilder)localObject).charAt(i1);
          i3 = 115;
          if (i1 != i3)
          {
            i1 = m + 1;
            i1 = ((StringBuilder)localObject).charAt(i1);
            int i4 = 83;
            if (i1 != i4) {
              break label283;
            }
          }
          i1 = m + 2;
          int i5 = ((StringBuilder)localObject).length();
          if (i1 != i5)
          {
            i1 = m + 2;
            i1 = ((StringBuilder)localObject).charAt(i1);
            if (i1 != i) {
              break label283;
            }
          }
          ((StringBuilder)localObject).insert(m, i);
          m += 2;
        }
        for (;;)
        {
          i1 = j;
          m += 1;
          break;
          label283:
          ((StringBuilder)localObject).setCharAt(m, i);
        }
      }
      if (i1 != 0)
      {
        str3 = ((StringBuilder)localObject).toString();
        label306:
        if (str3 == null) {
          break label600;
        }
        d = str3;
      }
    }
    for (;;)
    {
      localObject = hm.a(str3, j);
      m = localObject.length;
      int i2 = g;
      label350:
      int i10;
      int i9;
      if (m >= i2)
      {
        m = 0;
        str3 = null;
        i2 = localObject.length;
        if (m < i2)
        {
          str4 = "";
          i10 = 0;
          str2 = null;
          int i6 = g;
          if (i10 >= i6) {
            break label593;
          }
          i6 = m + i10;
          i9 = localObject.length;
          if (i6 >= i9)
          {
            i10 = 0;
            str2 = null;
          }
        }
      }
      for (;;)
      {
        if (i10 != 0)
        {
          paramHashSet.add(str4);
          i2 = paramHashSet.size();
          i10 = b;
          if (i2 >= i10)
          {
            j = 0;
            break;
            m = 0;
            str3 = null;
            break label306;
            if (i10 > 0)
            {
              str4 = String.valueOf(str4);
              str5 = " ";
              str4 = str4.concat(str5);
            }
            String str5 = String.valueOf(str4);
            i2 = m + i10;
            str4 = String.valueOf(localObject[i2]);
            i9 = str4.length();
            if (i9 != 0) {
              str4 = str5.concat(str4);
            }
            for (;;)
            {
              i10 += 1;
              break;
              str4 = new java/lang/String;
              str4.<init>(str5);
            }
          }
          m += 1;
          break label350;
        }
        m = paramHashSet.size();
        i2 = b;
        if (m >= i2)
        {
          j = 0;
          break;
        }
        k += 1;
        break label37;
        label593:
        i10 = j;
      }
      label600:
      str3 = str2;
    }
  }
  
  public final String a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    Object localObject1 = new com/google/android/gms/b/hq$a;
    ((hq.a)localObject1).<init>();
    Collections.sort(paramArrayList2, (Comparator)localObject1);
    Object localObject2 = new java/util/HashSet;
    ((HashSet)localObject2).<init>();
    int i = 0;
    localObject1 = null;
    int k = 0;
    hl.a locala = null;
    Object localObject3;
    for (;;)
    {
      i = paramArrayList2.size();
      if (k >= i) {
        break;
      }
      i = gete;
      localObject1 = (CharSequence)paramArrayList1.get(i);
      localObject3 = Normalizer.Form.NFKC;
      localObject1 = Normalizer.normalize((CharSequence)localObject1, (Normalizer.Form)localObject3);
      localObject3 = Locale.US;
      localObject1 = ((String)localObject1).toLowerCase((Locale)localObject3);
      boolean bool1 = a((String)localObject1, (HashSet)localObject2);
      if (!bool1) {
        break;
      }
      int j = k + 1;
      k = j;
    }
    locala = new com/google/android/gms/b/hl$a;
    locala.<init>();
    localObject1 = "";
    c = ((String)localObject1);
    localObject2 = ((HashSet)localObject2).iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject2).hasNext();
      if (bool2)
      {
        localObject1 = (String)((Iterator)localObject2).next();
        try
        {
          localObject3 = a;
          localObject1 = ((hk)localObject3).a((String)localObject1);
          locala.a((byte[])localObject1);
        }
        catch (IOException localIOException)
        {
          localObject2 = "Error while writing hash to byteStream";
          tp.b((String)localObject2, localIOException);
        }
      }
    }
    return locala.toString();
  }
}


/* Location:              com/google/android/gms/b/hq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */