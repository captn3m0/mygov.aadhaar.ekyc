package com.google.android.gms.b;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.d.a;
import com.google.android.gms.common.internal.c;
import java.util.ArrayList;
import java.util.Map;

public final class wl$b
  extends wl
{
  protected final f.a b;
  
  public wl$b(int paramInt, f.a parama)
  {
    super(paramInt);
    b = parama;
  }
  
  public final void a(n paramn, boolean paramBoolean)
  {
    Object localObject1 = b;
    Object localObject3 = a;
    ??? = Boolean.valueOf(paramBoolean);
    ((Map)localObject3).put(localObject1, ???);
    localObject3 = new com/google/android/gms/b/n$1;
    ((n.1)localObject3).<init>(paramn, (h)localObject1);
    boolean bool1 = true;
    String str = "Callback cannot be null.";
    c.b(bool1, str);
    synchronized (d)
    {
      boolean bool2 = ((h)localObject1).a();
      if (bool2)
      {
        ((d.a)localObject3).a();
        return;
      }
      localObject1 = g;
      ((ArrayList)localObject1).add(localObject3);
    }
  }
  
  public final void a(x.a parama)
  {
    f.a locala = b;
    a.f localf = a;
    locala.a(localf);
  }
  
  public final void a(Status paramStatus)
  {
    b.a(paramStatus);
  }
}


/* Location:              com/google/android/gms/b/wl$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */