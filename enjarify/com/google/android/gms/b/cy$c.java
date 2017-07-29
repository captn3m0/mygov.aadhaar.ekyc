package com.google.android.gms.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.security.SecureRandom;

public final class cy$c
{
  final String a;
  final String b;
  final String c;
  final long d;
  
  private cy$c(cy paramcy, String paramString, long paramLong)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.c.b(bool);
      String str = String.valueOf(paramString).concat(":start");
      a = str;
      str = String.valueOf(paramString).concat(":count");
      b = str;
      str = String.valueOf(paramString).concat(":value");
      c = str;
      d = paramLong;
      return;
      bool = false;
      str = null;
    }
  }
  
  final void a()
  {
    e.e();
    long l = e.m().a();
    SharedPreferences.Editor localEditor = cy.a(e).edit();
    String str = b;
    localEditor.remove(str);
    str = c;
    localEditor.remove(str);
    str = a;
    localEditor.putLong(str, l);
    localEditor.apply();
  }
  
  public final void a(String paramString)
  {
    long l1 = Long.MAX_VALUE;
    long l2 = 0L;
    long l3 = 1L;
    Object localObject1 = e;
    ((cy)localObject1).e();
    long l4 = b();
    boolean bool = l4 < l2;
    if (!bool) {
      a();
    }
    if (paramString == null) {
      paramString = "";
    }
    localObject1 = cy.a(e);
    Object localObject2 = b;
    long l5 = ((SharedPreferences)localObject1).getLong((String)localObject2, l2);
    bool = l5 < l2;
    if (!bool)
    {
      localObject1 = cy.a(e).edit();
      localObject2 = c;
      ((SharedPreferences.Editor)localObject1).putString((String)localObject2, paramString);
      localObject2 = b;
      ((SharedPreferences.Editor)localObject1).putLong((String)localObject2, l3);
      ((SharedPreferences.Editor)localObject1).apply();
      return;
    }
    localObject1 = e.x();
    l4 = ((SecureRandom)localObject1).nextLong() & l1;
    l2 = l5 + l3;
    l2 = l1 / l2 * l3;
    bool = l4 < l2;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      localObject2 = cy.a(e).edit();
      if (bool)
      {
        localObject1 = c;
        ((SharedPreferences.Editor)localObject2).putString((String)localObject1, paramString);
      }
      localObject1 = b;
      l5 += l3;
      ((SharedPreferences.Editor)localObject2).putLong((String)localObject1, l5);
      ((SharedPreferences.Editor)localObject2).apply();
      break;
      bool = false;
      localObject1 = null;
    }
  }
  
  final long b()
  {
    SharedPreferences localSharedPreferences = cy.b(e);
    String str = a;
    return localSharedPreferences.getLong(str, 0L);
  }
}


/* Location:              com/google/android/gms/b/cy$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */