package com.google.android.gms.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

public final class hl
{
  private final int a;
  private final int b;
  private final int c;
  private final hk d;
  
  public hl(int paramInt)
  {
    hn localhn = new com/google/android/gms/b/hn;
    localhn.<init>();
    d = localhn;
    b = paramInt;
    a = 6;
    c = 0;
  }
  
  private String a(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = "\n";
    Object localObject3 = paramString.split((String)localObject2);
    int i = localObject3.length;
    if (i == 0) {}
    hl.a locala;
    String str;
    for (localObject2 = "";; str = locala.toString())
    {
      return (String)localObject2;
      locala = new com/google/android/gms/b/hl$a;
      locala.<init>();
      PriorityQueue localPriorityQueue = new java/util/PriorityQueue;
      i = b;
      Object localObject4 = new com/google/android/gms/b/hl$1;
      ((hl.1)localObject4).<init>();
      localPriorityQueue.<init>(i, (Comparator)localObject4);
      i = 0;
      localObject2 = null;
      for (;;)
      {
        int j = localObject3.length;
        if (i >= j) {
          break;
        }
        localObject4 = hm.a(localObject3[i], false);
        int k = localObject4.length;
        if (k != 0)
        {
          k = b;
          int m = a;
          ho.a((String[])localObject4, k, m, localPriorityQueue);
        }
        i += 1;
      }
      localObject1 = localPriorityQueue.iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (bool)
        {
          localObject2 = (ho.a)((Iterator)localObject1).next();
          try
          {
            localObject3 = d;
            localObject2 = b;
            localObject2 = ((hk)localObject3).a((String)localObject2);
            locala.a((byte[])localObject2);
          }
          catch (IOException localIOException)
          {
            localObject1 = "Error while writing hash to byteStream";
            tp.b((String)localObject1, localIOException);
          }
        }
      }
    }
  }
  
  public final String a(ArrayList paramArrayList)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      str = (String)localIterator.next();
      Locale localLocale = Locale.US;
      str = str.toLowerCase(localLocale);
      localStringBuffer.append(str);
      char c1 = '\n';
      localStringBuffer.append(c1);
    }
    String str = localStringBuffer.toString();
    return a(str);
  }
}


/* Location:              com/google/android/gms/b/hl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */