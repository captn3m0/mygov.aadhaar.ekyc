package com.google.android.gms.b;

import android.os.Handler;

final class jn$a
  extends iu.a
{
  private jn$a(jn paramjn) {}
  
  public final String a()
  {
    return null;
  }
  
  public final void a(ih paramih)
  {
    ul.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    Handler localHandler = uk.a;
    jn.a.1 local1 = new com/google/android/gms/b/jn$a$1;
    local1.<init>(this);
    localHandler.post(local1);
  }
  
  public final boolean b()
  {
    return false;
  }
}


/* Location:              com/google/android/gms/b/jn$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */