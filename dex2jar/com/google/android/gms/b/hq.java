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

@qi
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
    e = false;
    if ((paramInt2 > 64) || (paramInt2 < 0))
    {
      f = 64;
      if (paramInt3 > 0) {
        break label63;
      }
    }
    label63:
    for (g = 1;; g = paramInt3)
    {
      a = new hp(f);
      return;
      f = paramInt2;
      break;
    }
  }
  
  private boolean a(String paramString, HashSet<String> paramHashSet)
  {
    String[] arrayOfString1 = paramString.split("\n");
    if (arrayOfString1.length == 0) {
      return true;
    }
    int j = 0;
    label19:
    String str;
    int i;
    int k;
    if (j < arrayOfString1.length)
    {
      str = arrayOfString1[j];
      if (str.indexOf("'") == -1) {
        break label387;
      }
      paramString = new StringBuilder(str);
      i = 1;
      k = 0;
      if (i + 2 <= paramString.length())
      {
        int m = i;
        if (paramString.charAt(i) == '\'')
        {
          if ((paramString.charAt(i - 1) == ' ') || ((paramString.charAt(i + 1) != 's') && (paramString.charAt(i + 1) != 'S')) || ((i + 2 != paramString.length()) && (paramString.charAt(i + 2) != ' '))) {
            break label167;
          }
          paramString.insert(i, ' ');
          i += 2;
        }
        for (;;)
        {
          k = 1;
          m = i;
          i = m + 1;
          break;
          label167:
          paramString.setCharAt(i, ' ');
        }
      }
      if (k != 0)
      {
        paramString = paramString.toString();
        label187:
        if (paramString == null) {
          break label387;
        }
        d = paramString;
      }
    }
    for (;;)
    {
      String[] arrayOfString2 = hm.a(paramString, true);
      if (arrayOfString2.length >= g)
      {
        i = 0;
        label215:
        if (i < arrayOfString2.length)
        {
          paramString = "";
          k = 0;
          if (k >= g) {
            break label381;
          }
          if (i + k < arrayOfString2.length) {}
        }
      }
      label381:
      for (k = 0;; k = 1)
      {
        if (k != 0)
        {
          paramHashSet.add(paramString);
          if (paramHashSet.size() >= b)
          {
            return false;
            paramString = null;
            break label187;
            str = paramString;
            if (k > 0) {
              str = String.valueOf(paramString).concat(" ");
            }
            paramString = String.valueOf(str);
            str = String.valueOf(arrayOfString2[(i + k)]);
            if (str.length() != 0) {}
            for (paramString = paramString.concat(str);; paramString = new String(paramString))
            {
              k += 1;
              break;
            }
          }
          i += 1;
          break label215;
        }
        if (paramHashSet.size() >= b) {
          return false;
        }
        j += 1;
        break label19;
        break;
      }
      label387:
      paramString = str;
    }
  }
  
  public final String a(ArrayList<String> paramArrayList, ArrayList<hj> paramArrayList1)
  {
    Collections.sort(paramArrayList1, new a());
    Object localObject = new HashSet();
    int i = 0;
    while ((i < paramArrayList1.size()) && (a(Normalizer.normalize((CharSequence)paramArrayList.get(gete), Normalizer.Form.NFKC).toLowerCase(Locale.US), (HashSet)localObject))) {
      i += 1;
    }
    paramArrayList = new hl.a();
    c = "";
    paramArrayList1 = ((HashSet)localObject).iterator();
    for (;;)
    {
      if (paramArrayList1.hasNext())
      {
        localObject = (String)paramArrayList1.next();
        try
        {
          paramArrayList.a(a.a((String)localObject));
        }
        catch (IOException paramArrayList1)
        {
          tp.b("Error while writing hash to byteStream", paramArrayList1);
        }
      }
    }
    return paramArrayList.toString();
  }
  
  public final class a
    implements Comparator<hj>
  {}
}


/* Location:              com/google/android/gms/b/hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */