package com.google.android.gms.b;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.AppMeasurement;

public final class cu
  extends df
{
  public final a a;
  final a b;
  public final a c;
  final a d;
  final a e;
  final a f;
  public final a g;
  private final String h = cf.a();
  private final char i;
  private final long j = cf.V();
  private final a k;
  private final a l;
  
  cu(dc paramdc)
  {
    super(paramdc);
    if (super.w().X()) {
      cf.W();
    }
    for (i = 'C';; i = 'c')
    {
      a = new a(6, false, false);
      b = new a(6, true, false);
      k = new a(6, false, true);
      c = new a(5, false, false);
      l = new a(5, true, false);
      d = new a(5, false, true);
      e = new a(4, false, false);
      f = new a(3, false, false);
      g = new a(2, false, false);
      return;
      cf.W();
    }
  }
  
  protected static Object a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return new b(paramString);
  }
  
  private static String a(boolean paramBoolean, Object paramObject)
  {
    if (paramObject == null) {
      return "";
    }
    if ((paramObject instanceof Integer)) {
      paramObject = Long.valueOf(((Integer)paramObject).intValue());
    }
    for (;;)
    {
      String str1;
      if ((paramObject instanceof Long))
      {
        if (!paramBoolean) {
          return String.valueOf(paramObject);
        }
        if (Math.abs(((Long)paramObject).longValue()) < 100L) {
          return String.valueOf(paramObject);
        }
        if (String.valueOf(paramObject).charAt(0) == '-') {}
        for (str1 = "-";; str1 = "")
        {
          paramObject = String.valueOf(Math.abs(((Long)paramObject).longValue()));
          long l1 = Math.round(Math.pow(10.0D, ((String)paramObject).length() - 1));
          long l2 = Math.round(Math.pow(10.0D, ((String)paramObject).length()) - 1.0D);
          return String.valueOf(str1).length() + 43 + String.valueOf(str1).length() + str1 + l1 + "..." + str1 + l2;
        }
      }
      if ((paramObject instanceof Boolean)) {
        return String.valueOf(paramObject);
      }
      if ((paramObject instanceof Throwable))
      {
        Object localObject1 = (Throwable)paramObject;
        String str2;
        int n;
        int m;
        if (paramBoolean)
        {
          paramObject = localObject1.getClass().getName();
          paramObject = new StringBuilder((String)paramObject);
          str1 = b(AppMeasurement.class.getCanonicalName());
          str2 = b(dc.class.getCanonicalName());
          localObject1 = ((Throwable)localObject1).getStackTrace();
          n = localObject1.length;
          m = 0;
        }
        for (;;)
        {
          if (m < n)
          {
            Object localObject2 = localObject1[m];
            if (!((StackTraceElement)localObject2).isNativeMethod())
            {
              String str3 = ((StackTraceElement)localObject2).getClassName();
              if (str3 != null)
              {
                str3 = b(str3);
                if ((str3.equals(str1)) || (str3.equals(str2)))
                {
                  ((StringBuilder)paramObject).append(": ");
                  ((StringBuilder)paramObject).append(localObject2);
                }
              }
            }
          }
          else
          {
            return ((StringBuilder)paramObject).toString();
            paramObject = ((Throwable)localObject1).toString();
            break;
          }
          m += 1;
        }
      }
      if ((paramObject instanceof b)) {
        return a;
      }
      if (paramBoolean) {
        return "-";
      }
      return String.valueOf(paramObject);
    }
  }
  
  private static String a(boolean paramBoolean, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str1 = paramString;
    if (paramString == null) {
      str1 = "";
    }
    String str2 = a(paramBoolean, paramObject1);
    paramObject2 = a(paramBoolean, paramObject2);
    paramObject3 = a(paramBoolean, paramObject3);
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = "";
    if (!TextUtils.isEmpty(str1))
    {
      localStringBuilder.append(str1);
      paramString = ": ";
    }
    paramObject1 = paramString;
    if (!TextUtils.isEmpty(str2))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append(str2);
      paramObject1 = ", ";
    }
    paramString = (String)paramObject1;
    if (!TextUtils.isEmpty((CharSequence)paramObject2))
    {
      localStringBuilder.append((String)paramObject1);
      localStringBuilder.append((String)paramObject2);
      paramString = ", ";
    }
    if (!TextUtils.isEmpty((CharSequence)paramObject3))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append((String)paramObject3);
    }
    return localStringBuilder.toString();
  }
  
  private static String b(String paramString)
  {
    String str;
    if (TextUtils.isEmpty(paramString)) {
      str = "";
    }
    int m;
    do
    {
      return str;
      m = paramString.lastIndexOf('.');
      str = paramString;
    } while (m == -1);
    return paramString.substring(0, m);
  }
  
  protected final void a() {}
  
  protected final void a(int paramInt, String paramString)
  {
    Log.println(paramInt, h, paramString);
  }
  
  protected final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString, final Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if ((!paramBoolean1) && (a(paramInt))) {
      a(paramInt, a(false, paramString, paramObject1, paramObject2, paramObject3));
    }
    db localdb;
    if ((!paramBoolean2) && (paramInt >= 5))
    {
      com.google.android.gms.common.internal.c.a(paramString);
      localdb = q.d;
      if (localdb == null) {
        a(6, "Scheduler not set. Not logging error/warn");
      }
    }
    else
    {
      return;
    }
    if (!localdb.I())
    {
      a(6, "Scheduler not initialized. Not logging error/warn");
      return;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (;;)
    {
      int m = paramInt;
      if (paramInt >= 9) {
        m = 8;
      }
      String str = String.valueOf("2");
      char c1 = "01VDIWEA?".charAt(m);
      char c2 = i;
      long l1 = j;
      paramObject1 = String.valueOf(a(true, paramString, paramObject1, paramObject2, paramObject3));
      paramObject2 = String.valueOf(str).length() + 23 + String.valueOf(paramObject1).length() + str + c1 + c2 + l1 + ":" + (String)paramObject1;
      paramObject1 = paramObject2;
      if (((String)paramObject2).length() > 1024) {
        paramObject1 = paramString.substring(0, 1024);
      }
      localdb.a(new Runnable()
      {
        public final void run()
        {
          cy localcy = q.d();
          if (!localcy.I())
          {
            a(6, "Persisted config not initialized. Not logging error/warn");
            return;
          }
          b.a(paramObject1);
        }
      });
      return;
    }
  }
  
  protected final boolean a(int paramInt)
  {
    return Log.isLoggable(h, paramInt);
  }
  
  public final String x()
  {
    Object localObject = vb;
    e.e();
    e.e();
    long l1 = ((cy.c)localObject).b();
    if (l1 == 0L)
    {
      ((cy.c)localObject).a();
      l1 = 0L;
      if (l1 >= d) {
        break label84;
      }
      localObject = null;
    }
    for (;;)
    {
      if ((localObject != null) && (localObject != cy.a)) {
        break label182;
      }
      return null;
      l1 = Math.abs(l1 - e.m().a());
      break;
      label84:
      if (l1 > d * 2L)
      {
        ((cy.c)localObject).a();
        localObject = null;
      }
      else
      {
        str = cy.b(e).getString(c, null);
        l1 = cy.b(e).getLong(b, 0L);
        ((cy.c)localObject).a();
        if ((str == null) || (l1 <= 0L)) {
          localObject = cy.a;
        } else {
          localObject = new Pair(str, Long.valueOf(l1));
        }
      }
    }
    label182:
    String str = String.valueOf(String.valueOf(second));
    localObject = (String)first;
    return String.valueOf(str).length() + 1 + String.valueOf(localObject).length() + str + ":" + (String)localObject;
  }
  
  public final class a
  {
    private final int b;
    private final boolean c;
    private final boolean d;
    
    a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    {
      b = paramInt;
      c = paramBoolean1;
      d = paramBoolean2;
    }
    
    public final void a(String paramString)
    {
      a(b, c, d, paramString, null, null, null);
    }
    
    public final void a(String paramString, Object paramObject)
    {
      a(b, c, d, paramString, paramObject, null, null);
    }
    
    public final void a(String paramString, Object paramObject1, Object paramObject2)
    {
      a(b, c, d, paramString, paramObject1, paramObject2, null);
    }
    
    public final void a(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
    {
      a(b, c, d, paramString, paramObject1, paramObject2, paramObject3);
    }
  }
  
  private static final class b
  {
    final String a;
    
    public b(String paramString)
    {
      a = paramString;
    }
  }
}


/* Location:              com/google/android/gms/b/cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */