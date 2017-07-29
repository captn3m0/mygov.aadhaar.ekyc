package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.common.internal.c;

public final class dg
{
  final Context a;
  
  public dg(Context paramContext)
  {
    c.a(paramContext);
    paramContext = paramContext.getApplicationContext();
    c.a(paramContext);
    a = paramContext;
  }
  
  static dh a(dc paramdc)
  {
    return new dh(paramdc);
  }
  
  static dj b(dc paramdc)
  {
    return new dj(paramdc);
  }
  
  static dn c(dc paramdc)
  {
    return new dn(paramdc);
  }
}


/* Location:              com/google/android/gms/b/dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */