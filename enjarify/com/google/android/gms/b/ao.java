package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.p;
import java.util.Set;

public final class ao
  extends eg
  implements c.b, c.c
{
  private static a.b i = eb.c;
  final Context a;
  final Handler b;
  final a.b c;
  final boolean d;
  Set e;
  p f;
  ec g;
  ao.a h;
  
  public ao(Context paramContext, Handler paramHandler)
  {
    a = paramContext;
    b = paramHandler;
    a.b localb = i;
    c = localb;
    d = true;
  }
  
  public ao(Context paramContext, Handler paramHandler, p paramp, a.b paramb)
  {
    a = paramContext;
    b = paramHandler;
    f = paramp;
    Set localSet = b;
    e = localSet;
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
  
  public final void a(eq parameq)
  {
    Handler localHandler = b;
    ao.1 local1 = new com/google/android/gms/b/ao$1;
    local1.<init>(this, parameq);
    localHandler.post(local1);
  }
  
  public final void a(a parama)
  {
    h.b(parama);
  }
}


/* Location:              com/google/android/gms/b/ao.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */