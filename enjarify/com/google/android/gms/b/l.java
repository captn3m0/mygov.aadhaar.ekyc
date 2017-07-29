package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.p;

public final class l
  extends n
{
  private final a.f g;
  private final i h;
  private final p i;
  private final a.b j;
  
  public l(Context paramContext, a parama, Looper paramLooper, a.f paramf, i parami, p paramp, a.b paramb)
  {
    super(paramContext, parama, paramLooper);
    g = paramf;
    h = parami;
    i = paramp;
    j = paramb;
    f.a(this);
  }
  
  public final ao a(Context paramContext, Handler paramHandler)
  {
    ao localao = new com/google/android/gms/b/ao;
    p localp = i;
    a.b localb = j;
    localao.<init>(paramContext, paramHandler, localp, localb);
    return localao;
  }
  
  public final a.f a(Looper paramLooper, x.a parama)
  {
    h.b = parama;
    return g;
  }
}


/* Location:              com/google/android/gms/b/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */