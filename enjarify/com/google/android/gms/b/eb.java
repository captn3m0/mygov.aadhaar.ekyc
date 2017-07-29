package com.google.android.gms.b;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;

public final class eb
{
  public static final a.g a;
  public static final a.g b;
  public static final a.b c;
  static final a.b d;
  public static final Scope e;
  public static final Scope f;
  public static final a g;
  public static final a h;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/a$g;
    ((a.g)localObject).<init>();
    a = (a.g)localObject;
    localObject = new com/google/android/gms/common/api/a$g;
    ((a.g)localObject).<init>();
    b = (a.g)localObject;
    localObject = new com/google/android/gms/b/eb$1;
    ((eb.1)localObject).<init>();
    c = (a.b)localObject;
    localObject = new com/google/android/gms/b/eb$2;
    ((eb.2)localObject).<init>();
    d = (a.b)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("profile");
    e = (Scope)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("email");
    f = (Scope)localObject;
    localObject = new com/google/android/gms/common/api/a;
    a.b localb = c;
    a.g localg = a;
    ((a)localObject).<init>("SignIn.API", localb, localg);
    g = (a)localObject;
    localObject = new com/google/android/gms/common/api/a;
    localb = d;
    localg = b;
    ((a)localObject).<init>("SignIn.INTERNAL_API", localb, localg);
    h = (a)localObject;
  }
}


/* Location:              com/google/android/gms/b/eb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */