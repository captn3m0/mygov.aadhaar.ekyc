package com.google.android.gms.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.c;

public final class cy$b
{
  private final String b;
  private final long c;
  private boolean d;
  private long e;
  
  public cy$b(cy paramcy, String paramString, long paramLong)
  {
    c.a(paramString);
    b = paramString;
    c = paramLong;
  }
  
  public final long a()
  {
    boolean bool = d;
    if (!bool)
    {
      bool = true;
      d = bool;
      SharedPreferences localSharedPreferences = cy.a(a);
      String str = b;
      long l1 = c;
      long l2 = localSharedPreferences.getLong(str, l1);
      e = l2;
    }
    return e;
  }
  
  public final void a(long paramLong)
  {
    SharedPreferences.Editor localEditor = cy.a(a).edit();
    String str = b;
    localEditor.putLong(str, paramLong);
    localEditor.apply();
    e = paramLong;
  }
}


/* Location:              com/google/android/gms/b/cy$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */