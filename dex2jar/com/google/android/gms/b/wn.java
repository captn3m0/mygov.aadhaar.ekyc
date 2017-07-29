package com.google.android.gms.b;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.internal.b;
import java.util.Arrays;

public final class wn<O extends a.a>
{
  public final a<O> a;
  private final boolean b;
  private final int c;
  private final O d;
  
  public wn(a<O> parama)
  {
    b = true;
    a = parama;
    d = null;
    c = System.identityHashCode(this);
  }
  
  public wn(a<O> parama, O paramO)
  {
    b = false;
    a = parama;
    d = paramO;
    c = Arrays.hashCode(new Object[] { a, d });
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof wn)) {
        return false;
      }
      paramObject = (wn)paramObject;
    } while ((!b) && (!b) && (b.a(a, a)) && (b.a(d, d)));
    return false;
  }
  
  public final int hashCode()
  {
    return c;
  }
}


/* Location:              com/google/android/gms/b/wn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */