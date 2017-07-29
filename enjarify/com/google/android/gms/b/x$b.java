package com.google.android.gms.b;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.o.f;
import com.google.android.gms.common.internal.z;
import java.util.Map;
import java.util.Set;

final class x$b
  implements ao.a, o.f
{
  final a.f a;
  final wn b;
  boolean c = false;
  private z e = null;
  private Set f = null;
  
  public x$b(x paramx, a.f paramf, wn paramwn)
  {
    a = paramf;
    b = paramwn;
  }
  
  final void a()
  {
    boolean bool = c;
    if (bool)
    {
      Object localObject = e;
      if (localObject != null)
      {
        localObject = a;
        z localz = e;
        Set localSet = f;
        ((a.f)localObject).a(localz, localSet);
      }
    }
  }
  
  public final void a(a parama)
  {
    Handler localHandler = x.a(d);
    x.b.1 local1 = new com/google/android/gms/b/x$b$1;
    local1.<init>(this, parama);
    localHandler.post(local1);
  }
  
  public final void a(z paramz, Set paramSet)
  {
    if ((paramz == null) || (paramSet == null))
    {
      String str = "Received null response from onSignInSuccess";
      Exception localException = new java/lang/Exception;
      localException.<init>();
      Log.wtf("GoogleApiManager", str, localException);
      a locala = new com/google/android/gms/common/a;
      int i = 4;
      locala.<init>(i);
      b(locala);
    }
    for (;;)
    {
      return;
      e = paramz;
      f = paramSet;
      a();
    }
  }
  
  public final void b(a parama)
  {
    Object localObject = x.j(d);
    wn localwn = b;
    localObject = (x.a)((Map)localObject).get(localwn);
    c.a(x.a(h));
    a.a();
    ((x.a)localObject).a(parama);
  }
}


/* Location:              com/google/android/gms/b/x$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */