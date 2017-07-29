package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Iterator;

public final class hf
{
  final Object a;
  int b;
  int c;
  int d;
  int e;
  String f;
  String g;
  String h;
  private final int i;
  private final int j;
  private final int k;
  private final hl l;
  private final hq m;
  private ArrayList n;
  private ArrayList o;
  private ArrayList p;
  
  public hf(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    n = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    o = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    p = ((ArrayList)localObject);
    b = 0;
    c = 0;
    d = 0;
    f = "";
    g = "";
    h = "";
    i = paramInt1;
    j = paramInt2;
    k = paramInt3;
    localObject = new com/google/android/gms/b/hl;
    ((hl)localObject).<init>(paramInt4);
    l = ((hl)localObject);
    localObject = new com/google/android/gms/b/hq;
    ((hq)localObject).<init>(paramInt5, paramInt6, paramInt7);
    m = ((hq)localObject);
  }
  
  private static String a(ArrayList paramArrayList)
  {
    int i1 = 100;
    boolean bool = paramArrayList.isEmpty();
    String str;
    if (bool) {
      str = "";
    }
    for (;;)
    {
      return str;
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>();
      Iterator localIterator = paramArrayList.iterator();
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        str = (String)localIterator.next();
        localStringBuffer.append(str);
        localStringBuffer.append(' ');
        i2 = localStringBuffer.length();
      } while (i2 <= i1);
      int i2 = localStringBuffer.length() + -1;
      localStringBuffer.deleteCharAt(i2);
      str = localStringBuffer.toString();
      int i3 = str.length();
      if (i3 >= i1)
      {
        i3 = 0;
        localStringBuffer = null;
        str = str.substring(0, i1);
      }
    }
  }
  
  public final void a(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    b(paramString, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    synchronized (a)
    {
      int i1 = d;
      if (i1 < 0)
      {
        String str = "ActivityContent: negative number of WebViews.";
        tp.b(str);
      }
      c();
      return;
    }
  }
  
  public final boolean a()
  {
    synchronized (a)
    {
      int i1 = d;
      if (i1 == 0)
      {
        i1 = 1;
        return i1;
      }
      int i2 = 0;
      Object localObject2 = null;
    }
  }
  
  public final void b()
  {
    synchronized (a)
    {
      int i1 = d + 1;
      d = i1;
      return;
    }
  }
  
  final void b(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i1;
    int i2;
    if (paramString != null)
    {
      i1 = paramString.length();
      i2 = k;
      if (i1 >= i2) {
        break label24;
      }
    }
    for (;;)
    {
      return;
      label24:
      synchronized (a)
      {
        Object localObject2 = n;
        ((ArrayList)localObject2).add(paramString);
        i1 = b;
        i2 = paramString.length();
        i1 += i2;
        b = i1;
        if (paramBoolean)
        {
          localObject2 = o;
          ((ArrayList)localObject2).add(paramString);
          ArrayList localArrayList1 = p;
          localObject2 = new com/google/android/gms/b/hj;
          ArrayList localArrayList2 = o;
          i2 = localArrayList2.size();
          int i3 = i2 + -1;
          ((hj)localObject2).<init>(paramFloat1, paramFloat2, paramFloat3, paramFloat4, i3);
          localArrayList1.add(localObject2);
        }
      }
    }
  }
  
  public final void c()
  {
    synchronized (a)
    {
      int i1 = b;
      int i2 = c;
      int i3 = i;
      i1 *= i3;
      i3 = j;
      i2 *= i3;
      i1 += i2;
      i2 = e;
      if (i1 > i2)
      {
        e = i1;
        Object localObject2 = ke.ac;
        Object localObject4 = w.q();
        localObject2 = ((kd)localObject4).a((jz)localObject2);
        localObject2 = (Boolean)localObject2;
        boolean bool = ((Boolean)localObject2).booleanValue();
        if (bool)
        {
          localObject2 = w.i();
          bool = ((tj)localObject2).a();
          if (!bool)
          {
            localObject2 = l;
            localObject4 = n;
            localObject2 = ((hl)localObject2).a((ArrayList)localObject4);
            f = ((String)localObject2);
            localObject2 = l;
            localObject4 = o;
            localObject2 = ((hl)localObject2).a((ArrayList)localObject4);
            g = ((String)localObject2);
          }
        }
        localObject2 = ke.ae;
        localObject4 = w.q();
        localObject2 = ((kd)localObject4).a((jz)localObject2);
        localObject2 = (Boolean)localObject2;
        bool = ((Boolean)localObject2).booleanValue();
        if (bool)
        {
          localObject2 = w.i();
          bool = ((tj)localObject2).b();
          if (!bool)
          {
            localObject2 = m;
            localObject4 = o;
            ArrayList localArrayList = p;
            localObject2 = ((hq)localObject2).a((ArrayList)localObject4, localArrayList);
            h = ((String)localObject2);
          }
        }
      }
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = paramObject instanceof hf;
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      if (paramObject == this)
      {
        bool2 = bool1;
      }
      else
      {
        paramObject = (hf)paramObject;
        String str1 = f;
        if (str1 != null)
        {
          str1 = f;
          String str2 = f;
          bool3 = str1.equals(str2);
          if (bool3) {
            bool2 = bool1;
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return f.hashCode();
  }
  
  public final String toString()
  {
    int i1 = c;
    int i2 = e;
    int i3 = b;
    String str1 = String.valueOf(a(n));
    String str2 = String.valueOf(a(o));
    String str3 = f;
    String str4 = g;
    String str5 = h;
    int i4 = String.valueOf(str1).length() + 165;
    int i5 = String.valueOf(str2).length();
    i4 += i5;
    i5 = String.valueOf(str3).length();
    i4 += i5;
    i5 = String.valueOf(str4).length();
    i4 += i5;
    i5 = String.valueOf(str5).length();
    i4 += i5;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i4);
    return "ActivityContent fetchId: " + i1 + " score:" + i2 + " total_length:" + i3 + "\n text: " + str1 + "\n viewableText" + str2 + "\n signture: " + str3 + "\n viewableSignture: " + str4 + "\n viewableSignatureForVertical: " + str5;
  }
}


/* Location:              com/google/android/gms/b/hf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */