package com.google.android.gms.b;

import java.util.PriorityQueue;

public final class ho
{
  private static long a(long paramLong, int paramInt)
  {
    long l1 = 1073807359L;
    if (paramInt == 0) {
      paramLong = 1L;
    }
    for (;;)
    {
      return paramLong;
      int i = 1;
      if (paramInt != i)
      {
        i = paramInt % 2;
        long l2;
        int j;
        if (i == 0)
        {
          l2 = paramLong * paramLong % l1;
          j = paramInt / 2;
          l2 = a(l2, j);
          paramLong = l2 % l1;
        }
        else
        {
          l2 = paramLong * paramLong % l1;
          j = paramInt / 2;
          l2 = a(l2, j) % l1 * paramLong;
          paramLong = l2 % l1;
        }
      }
    }
  }
  
  private static long a(String[] paramArrayOfString, int paramInt)
  {
    long l1 = 2147483647L;
    long l2 = 1073807359L;
    String str1 = paramArrayOfString[0];
    int i = hm.a(str1);
    long l3 = (i + l1) % l2;
    int j = 1;
    for (;;)
    {
      int k = paramInt + 0;
      if (j >= k) {
        break;
      }
      l3 = l3 * 16785407L % l2;
      String str2 = paramArrayOfString[j];
      k = hm.a(str2);
      long l4 = (k + l1) % l2;
      l3 = (l3 + l4) % l2;
      j += 1;
    }
    return l3;
  }
  
  private static String a(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfString.length;
    int j = paramInt1 + paramInt2;
    if (i < j) {
      tp.c("Unable to construct shingle");
    }
    StringBuffer localStringBuffer;
    for (String str1 = "";; str1 = localStringBuffer.toString())
    {
      return str1;
      localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>();
      i = paramInt1;
      for (;;)
      {
        int k = paramInt1 + paramInt2 + -1;
        if (i >= k) {
          break;
        }
        String str2 = paramArrayOfString[i];
        localStringBuffer.append(str2);
        k = 32;
        localStringBuffer.append(k);
        i += 1;
      }
      i = paramInt1 + paramInt2 + -1;
      str1 = paramArrayOfString[i];
      localStringBuffer.append(str1);
    }
  }
  
  private static void a(int paramInt1, long paramLong, String paramString, int paramInt2, PriorityQueue paramPriorityQueue)
  {
    ho.a locala1 = new com/google/android/gms/b/ho$a;
    locala1.<init>(paramLong, paramString, paramInt2);
    int i = paramPriorityQueue.size();
    boolean bool;
    if (i == paramInt1)
    {
      ho.a locala2 = (ho.a)paramPriorityQueue.peek();
      i = c;
      int k = c;
      if (i <= k)
      {
        locala2 = (ho.a)paramPriorityQueue.peek();
        long l1 = a;
        long l2 = a;
        bool = l1 < l2;
        if (!bool) {
          break label95;
        }
      }
    }
    for (;;)
    {
      return;
      label95:
      bool = paramPriorityQueue.contains(locala1);
      if (!bool)
      {
        paramPriorityQueue.add(locala1);
        int j = paramPriorityQueue.size();
        if (j > paramInt1) {
          paramPriorityQueue.poll();
        }
      }
    }
  }
  
  public static void a(String[] paramArrayOfString, int paramInt1, int paramInt2, PriorityQueue paramPriorityQueue)
  {
    int i = paramArrayOfString.length;
    if (i < paramInt2)
    {
      i = paramArrayOfString.length;
      l1 = a(paramArrayOfString, i);
      i = 0;
      j = paramArrayOfString.length;
      str1 = a(paramArrayOfString, 0, j);
      k = paramArrayOfString.length;
      j = paramInt1;
      a(paramInt1, l1, str1, k, paramPriorityQueue);
      return;
    }
    long l1 = a(paramArrayOfString, paramInt2);
    String str1 = a(paramArrayOfString, 0, paramInt2);
    int j = paramInt1;
    int k = paramInt2;
    a(paramInt1, l1, str1, paramInt2, paramPriorityQueue);
    long l2 = 16785407L;
    int m = paramInt2 + -1;
    long l3 = a(l2, m);
    i = 1;
    for (;;)
    {
      j = paramArrayOfString.length - paramInt2 + 1;
      if (i >= j) {
        break;
      }
      j = i + -1;
      String str2 = paramArrayOfString[j];
      j = hm.a(str2);
      m = i + paramInt2 + -1;
      m = hm.a(paramArrayOfString[m]);
      long l4 = (j + 2147483647L) % 1073807359L * l3 % 1073807359L;
      long l5 = 1073807359L;
      l1 = (l1 + l5 - l4) % 1073807359L * 16785407L % 1073807359L;
      long l6 = m + 2147483647L;
      l4 = 1073807359L;
      l6 %= l4;
      l1 += l6;
      l6 = 1073807359L;
      l1 %= l6;
      str1 = a(paramArrayOfString, i, paramInt2);
      k = paramArrayOfString.length;
      j = paramInt1;
      a(paramInt1, l1, str1, k, paramPriorityQueue);
      i += 1;
    }
  }
}


/* Location:              com/google/android/gms/b/ho.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */