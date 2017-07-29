package com.google.android.gms.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.c;

public final class cy$a
{
  final String a;
  final boolean b;
  boolean c;
  boolean d;
  
  public cy$a(cy paramcy, String paramString)
  {
    c.a(paramString);
    a = paramString;
    b = true;
  }
  
  public final void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = cy.a(e).edit();
    String str = a;
    localEditor.putBoolean(str, paramBoolean);
    localEditor.apply();
    d = paramBoolean;
  }
}


/* Location:              com/google/android/gms/b/cy$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */