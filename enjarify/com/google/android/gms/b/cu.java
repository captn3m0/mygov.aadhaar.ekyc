package com.google.android.gms.b;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.AppMeasurement;

public final class cu
  extends df
{
  public final cu.a a;
  final cu.a b;
  public final cu.a c;
  final cu.a d;
  final cu.a e;
  final cu.a f;
  public final cu.a g;
  private final String h;
  private final char i;
  private final long j;
  private final cu.a k;
  private final cu.a l;
  
  cu(dc paramdc)
  {
    super(paramdc);
    Object localObject = cf.a();
    h = ((String)localObject);
    long l1 = cf.V();
    j = l1;
    localObject = super.w();
    boolean bool2 = ((cf)localObject).X();
    char c1;
    if (bool2)
    {
      cf.W();
      c1 = 'C';
    }
    for (i = c1;; i = c1)
    {
      localObject = new com/google/android/gms/b/cu$a;
      ((cu.a)localObject).<init>(this, m, false, false);
      a = ((cu.a)localObject);
      localObject = new com/google/android/gms/b/cu$a;
      ((cu.a)localObject).<init>(this, m, bool1, false);
      b = ((cu.a)localObject);
      localObject = new com/google/android/gms/b/cu$a;
      ((cu.a)localObject).<init>(this, m, false, bool1);
      k = ((cu.a)localObject);
      localObject = new com/google/android/gms/b/cu$a;
      ((cu.a)localObject).<init>(this, n, false, false);
      c = ((cu.a)localObject);
      localObject = new com/google/android/gms/b/cu$a;
      ((cu.a)localObject).<init>(this, n, bool1, false);
      l = ((cu.a)localObject);
      localObject = new com/google/android/gms/b/cu$a;
      ((cu.a)localObject).<init>(this, n, false, bool1);
      d = ((cu.a)localObject);
      localObject = new com/google/android/gms/b/cu$a;
      ((cu.a)localObject).<init>(this, 4, false, false);
      e = ((cu.a)localObject);
      localObject = new com/google/android/gms/b/cu$a;
      ((cu.a)localObject).<init>(this, 3, false, false);
      f = ((cu.a)localObject);
      localObject = new com/google/android/gms/b/cu$a;
      ((cu.a)localObject).<init>(this, 2, false, false);
      g = ((cu.a)localObject);
      return;
      cf.W();
      c1 = 'c';
    }
  }
  
  protected static Object a(String paramString)
  {
    Object localObject;
    if (paramString == null) {
      localObject = null;
    }
    for (;;)
    {
      return localObject;
      localObject = new com/google/android/gms/b/cu$b;
      ((cu.b)localObject).<init>(paramString);
    }
  }
  
  private static String a(boolean paramBoolean, Object paramObject)
  {
    int m = 0;
    String str1 = null;
    double d1 = 10.0D;
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = "";
      return (String)localObject1;
    }
    boolean bool1 = paramObject instanceof Integer;
    long l1;
    if (bool1)
    {
      paramObject = (Integer)paramObject;
      int n = ((Integer)paramObject).intValue();
      l1 = n;
    }
    for (Object localObject2 = Long.valueOf(l1);; localObject2 = paramObject)
    {
      boolean bool2 = localObject2 instanceof Long;
      int i5;
      if (bool2)
      {
        if (!paramBoolean)
        {
          localObject1 = String.valueOf(localObject2);
          break;
        }
        localObject1 = localObject2;
        localObject1 = (Long)localObject2;
        long l2 = Math.abs(((Long)localObject1).longValue());
        long l3 = 100;
        double d2 = 4.94E-322D;
        bool2 = l2 < l3;
        if (bool2)
        {
          localObject1 = String.valueOf(localObject2);
          break;
        }
        localObject1 = String.valueOf(localObject2);
        int i1 = ((String)localObject1).charAt(0);
        m = 45;
        if (i1 == m) {}
        for (localObject1 = "-";; localObject1 = "")
        {
          localObject2 = String.valueOf(Math.abs(((Long)localObject2).longValue()));
          m = ((String)localObject2).length() + -1;
          double d3 = m;
          d3 = Math.pow(d1, d3);
          long l4 = Math.round(d3);
          double d4 = ((String)localObject2).length();
          d4 = Math.pow(d1, d4);
          l3 = 4607182418800017408L;
          d2 = 1.0D;
          d4 -= d2;
          l2 = Math.round(d4);
          int i4 = String.valueOf(localObject1).length() + 43;
          i5 = String.valueOf(localObject1).length();
          i4 += i5;
          StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>(i4);
          localObject2 = localStringBuilder1.append((String)localObject1).append(l4);
          str1 = "...";
          localObject2 = ((StringBuilder)localObject2).append(str1);
          localObject1 = (String)localObject1 + l2;
          break;
        }
      }
      int i2 = localObject2 instanceof Boolean;
      if (i2 != 0)
      {
        localObject1 = String.valueOf(localObject2);
        break;
      }
      i2 = localObject2 instanceof Throwable;
      if (i2 != 0)
      {
        localObject2 = (Throwable)localObject2;
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        label400:
        String str2;
        String str3;
        if (paramBoolean)
        {
          localObject1 = localObject2.getClass().getName();
          localStringBuilder2.<init>((String)localObject1);
          str2 = b(AppMeasurement.class.getCanonicalName());
          str3 = b(dc.class.getCanonicalName());
          localObject2 = ((Throwable)localObject2).getStackTrace();
          i5 = localObject2.length;
          i2 = 0;
          localObject1 = null;
        }
        for (;;)
        {
          if (i2 < i5)
          {
            str1 = localObject2[i2];
            boolean bool4 = str1.isNativeMethod();
            if (!bool4)
            {
              String str4 = str1.getClassName();
              if (str4 != null)
              {
                str4 = b(str4);
                boolean bool5 = str4.equals(str2);
                if (!bool5)
                {
                  bool4 = str4.equals(str3);
                  if (!bool4) {}
                }
                else
                {
                  localObject1 = ": ";
                  localStringBuilder2.append((String)localObject1);
                  localStringBuilder2.append(str1);
                }
              }
            }
          }
          else
          {
            localObject1 = localStringBuilder2.toString();
            break;
            localObject1 = ((Throwable)localObject2).toString();
            break label400;
          }
          int i3;
          i2 += 1;
        }
      }
      boolean bool3 = localObject2 instanceof cu.b;
      if (bool3)
      {
        localObject2 = (cu.b)localObject2;
        localObject1 = a;
        break;
      }
      if (paramBoolean)
      {
        localObject1 = "-";
        break;
      }
      localObject1 = String.valueOf(localObject2);
      break;
    }
  }
  
  private static String a(boolean paramBoolean, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if (paramString == null) {
      paramString = "";
    }
    String str1 = a(paramBoolean, paramObject1);
    String str2 = a(paramBoolean, paramObject2);
    String str3 = a(paramBoolean, paramObject3);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str4 = "";
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (!bool1)
    {
      localStringBuilder.append(paramString);
      str4 = ": ";
    }
    bool1 = TextUtils.isEmpty(str1);
    if (!bool1)
    {
      localStringBuilder.append(str4);
      localStringBuilder.append(str1);
      str4 = ", ";
    }
    boolean bool2 = TextUtils.isEmpty(str2);
    if (!bool2)
    {
      localStringBuilder.append(str4);
      localStringBuilder.append(str2);
      str4 = ", ";
    }
    bool2 = TextUtils.isEmpty(str3);
    if (!bool2)
    {
      localStringBuilder.append(str4);
      localStringBuilder.append(str3);
    }
    return localStringBuilder.toString();
  }
  
  private static String b(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {
      paramString = "";
    }
    for (;;)
    {
      return paramString;
      int m = paramString.lastIndexOf('.');
      int n = -1;
      if (m != n)
      {
        n = 0;
        paramString = paramString.substring(0, m);
      }
    }
  }
  
  protected final void a() {}
  
  protected final void a(int paramInt, String paramString)
  {
    String str = h;
    Log.println(paramInt, str, paramString);
  }
  
  protected final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Object localObject1;
    if (!paramBoolean1)
    {
      boolean bool1 = a(paramInt);
      if (bool1)
      {
        bool1 = false;
        localObject1 = a(false, paramString, paramObject1, paramObject2, paramObject3);
        a(paramInt, (String)localObject1);
      }
    }
    Object localObject2;
    if (!paramBoolean2)
    {
      int m = 5;
      if (paramInt >= m)
      {
        com.google.android.gms.common.internal.c.a(paramString);
        localObject1 = q;
        localObject2 = d;
        if (localObject2 != null) {
          break label95;
        }
        m = 6;
        localObject2 = "Scheduler not set. Not logging error/warn";
        a(m, (String)localObject2);
      }
    }
    label95:
    char c1;
    for (;;)
    {
      return;
      boolean bool2 = ((db)localObject2).I();
      if (bool2) {
        break;
      }
      c1 = '\006';
      localObject2 = "Scheduler not initialized. Not logging error/warn";
      a(c1, (String)localObject2);
    }
    if (paramInt < 0)
    {
      c1 = '\000';
      localObject1 = null;
    }
    for (;;)
    {
      char c2 = '\t';
      if (c1 >= c2) {
        c1 = '\b';
      }
      Object localObject3 = String.valueOf("2");
      String str1 = "01VDIWEA?";
      c1 = str1.charAt(c1);
      int i2 = i;
      long l1 = j;
      boolean bool3 = true;
      String str2 = String.valueOf(a(bool3, paramString, paramObject1, paramObject2, paramObject3));
      String str3 = String.valueOf(localObject3);
      int i3 = str3.length() + 23;
      int i4 = String.valueOf(str2).length();
      i3 += i4;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i3);
      localObject1 = localStringBuilder.append((String)localObject3).append(c1).append(i2).append(l1);
      localObject3 = ":";
      localObject1 = (String)localObject3 + str2;
      int i1 = ((String)localObject1).length();
      i2 = 1024;
      if (i1 > i2)
      {
        c1 = '\000';
        i1 = 1024;
        localObject1 = paramString.substring(0, i1);
      }
      localObject3 = new com/google/android/gms/b/cu$1;
      ((cu.1)localObject3).<init>(this, (String)localObject1);
      ((db)localObject2).a((Runnable)localObject3);
      break;
      int n = paramInt;
    }
  }
  
  protected final boolean a(int paramInt)
  {
    return Log.isLoggable(h, paramInt);
  }
  
  public final String x()
  {
    long l1 = 0L;
    cy.c localc = vb;
    e.e();
    Object localObject1 = e;
    ((cy)localObject1).e();
    long l2 = localc.b();
    boolean bool1 = l2 < l1;
    long l3;
    boolean bool2;
    label76:
    Object localObject2;
    if (!bool1)
    {
      localc.a();
      l2 = l1;
      l3 = d;
      bool1 = l2 < l3;
      if (!bool1) {
        break label133;
      }
      bool2 = false;
      localObject1 = null;
      if (localObject1 != null)
      {
        localObject2 = cy.a;
        if (localObject1 != localObject2) {
          break label281;
        }
      }
      bool2 = false;
    }
    for (localObject1 = null;; localObject1 = (String)localObject1)
    {
      return (String)localObject1;
      Object localObject3 = e.m();
      l3 = ((com.google.android.gms.common.util.c)localObject3).a();
      l2 = Math.abs(l2 - l3);
      break;
      label133:
      l3 = d;
      long l4 = 2;
      l3 *= l4;
      bool2 = l2 < l3;
      if (bool2)
      {
        localc.a();
        bool2 = false;
        localObject1 = null;
        break label76;
      }
      localObject1 = cy.b(e);
      localObject2 = c;
      localObject2 = ((SharedPreferences)localObject1).getString((String)localObject2, null);
      localObject1 = cy.b(e);
      localObject3 = b;
      l3 = ((SharedPreferences)localObject1).getLong((String)localObject3, l1);
      localc.a();
      if (localObject2 != null)
      {
        bool2 = l3 < l1;
        if (bool2) {}
      }
      else
      {
        localObject1 = cy.a;
        break label76;
      }
      localObject1 = new android/util/Pair;
      Object localObject4 = Long.valueOf(l3);
      ((Pair)localObject1).<init>(localObject2, localObject4);
      break label76;
      label281:
      localObject2 = String.valueOf(String.valueOf(second));
      localObject1 = (String)first;
      int m = String.valueOf(localObject2).length() + 1;
      int n = String.valueOf(localObject1).length();
      m += n;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(m);
      localObject2 = localStringBuilder.append((String)localObject2);
      localObject4 = ":";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
    }
  }
}


/* Location:              com/google/android/gms/b/cu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */