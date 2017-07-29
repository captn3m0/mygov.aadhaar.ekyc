package com.google.android.gms.b;

import android.os.Looper;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.n;

public final class y<O extends a.a>
  extends p
{
  private final n<O> a;
  
  public y(n<O> paramn)
  {
    super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    a = paramn;
  }
  
  public final Looper a()
  {
    return a.c;
  }
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    return a.a(paramT);
  }
  
  public final void a(as paramas) {}
  
  public final void b(as paramas) {}
}


/* Location:              com/google/android/gms/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */