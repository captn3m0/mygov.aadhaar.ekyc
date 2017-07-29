package com.google.android.gms.b;

import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.i;

@qi
public final class kn
  extends kp.a
{
  private final i a;
  private final String b;
  private final String c;
  
  public kn(i parami, String paramString1, String paramString2)
  {
    a = parami;
    b = paramString1;
    c = paramString2;
  }
  
  public final String a()
  {
    return b;
  }
  
  public final void a(a parama)
  {
    if (parama == null) {
      return;
    }
    a.b((View)b.a(parama));
  }
  
  public final String b()
  {
    return c;
  }
  
  public final void c()
  {
    a.J();
  }
  
  public final void d()
  {
    a.K();
  }
}


/* Location:              com/google/android/gms/b/kn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */