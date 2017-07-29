package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.c;

public final class a
{
  public final String a;
  private final a.b b;
  private final a.i c;
  private final a.g d;
  private final a.j e;
  
  public a(String paramString, a.b paramb, a.g paramg)
  {
    c.a(paramb, "Cannot construct an Api with a null ClientBuilder");
    c.a(paramg, "Cannot construct an Api with a null ClientKey");
    a = paramString;
    b = paramb;
    c = null;
    d = paramg;
    e = null;
  }
  
  public final a.b a()
  {
    a.b localb = b;
    boolean bool;
    if (localb != null) {
      bool = true;
    }
    for (;;)
    {
      c.a(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return b;
      bool = false;
      localb = null;
    }
  }
  
  public final a.d b()
  {
    Object localObject = d;
    if (localObject != null) {
      return d;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("This API was constructed with null client keys. This should not be possible.");
    throw ((Throwable)localObject);
  }
}


/* Location:              com/google/android/gms/common/api/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */