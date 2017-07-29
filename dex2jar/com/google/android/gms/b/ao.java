package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.z;
import java.util.Set;

public final class ao
  extends eg
  implements c.b, c.c
{
  private static a.b<? extends ec, ed> i = eb.c;
  final Context a;
  final Handler b;
  final a.b<? extends ec, ed> c;
  final boolean d;
  Set<Scope> e;
  p f;
  ec g;
  a h;
  
  public ao(Context paramContext, Handler paramHandler)
  {
    a = paramContext;
    b = paramHandler;
    c = i;
    d = true;
  }
  
  public ao(Context paramContext, Handler paramHandler, p paramp, a.b<? extends ec, ed> paramb)
  {
    a = paramContext;
    b = paramHandler;
    f = paramp;
    e = b;
    c = paramb;
    d = false;
  }
  
  public final void a(int paramInt)
  {
    g.a();
  }
  
  public final void a(Bundle paramBundle)
  {
    g.a(this);
  }
  
  public final void a(final eq parameq)
  {
    b.post(new Runnable()
    {
      public final void run()
      {
        ao.a(ao.this, parameq);
      }
    });
  }
  
  public final void a(a parama)
  {
    h.b(parama);
  }
  
  public static abstract interface a
  {
    public abstract void a(z paramz, Set<Scope> paramSet);
    
    public abstract void b(a parama);
  }
}


/* Location:              com/google/android/gms/b/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */