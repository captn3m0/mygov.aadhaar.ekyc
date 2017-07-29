package com.google.android.gms.b;

import android.os.Looper;
import com.google.android.gms.common.api.n;

public final class y
  extends p
{
  private final n a;
  
  public y(n paramn)
  {
    super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    a = paramn;
  }
  
  public final Looper a()
  {
    return a.c;
  }
  
  public final f.a a(f.a parama)
  {
    return a.a(parama);
  }
  
  public final void a(as paramas) {}
  
  public final void b(as paramas) {}
}


/* Location:              com/google/android/gms/b/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */