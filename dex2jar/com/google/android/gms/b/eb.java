package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.a.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;

public final class eb
{
  public static final a.g<en> a = new a.g();
  public static final a.g<en> b = new a.g();
  public static final a.b<en, ed> c = new a.b() {};
  static final a.b<en, a> d = new a.b() {};
  public static final Scope e = new Scope("profile");
  public static final Scope f = new Scope("email");
  public static final a<ed> g = new a("SignIn.API", c, a);
  public static final a<a> h = new a("SignIn.INTERNAL_API", d, b);
  
  public static final class a
    implements a.a.a
  {
    final Bundle a;
  }
}


/* Location:              com/google/android/gms/b/eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */