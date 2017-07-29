package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.k;
import java.util.Set;

public abstract class u<T extends IInterface>
  extends o<T>
  implements a.f, v.a
{
  private final p a;
  private final Set<Scope> i;
  private final Account j;
  
  protected u(Context paramContext, Looper paramLooper, int paramInt, p paramp, c.b paramb, c.c paramc)
  {
    this(paramContext, paramLooper, w.a(paramContext), com.google.android.gms.common.c.a(), paramInt, paramp, (c.b)c.a(paramb), (c.c)c.a(paramc));
  }
  
  private u(Context paramContext, Looper paramLooper, w paramw, com.google.android.gms.common.c paramc, int paramInt, p paramp, c.b paramb, c.c paramc1) {}
  
  public final Account e_()
  {
    return j;
  }
  
  public final k[] j()
  {
    return new k[0];
  }
  
  protected final Set<Scope> m()
  {
    return i;
  }
}


/* Location:              com/google/android/gms/common/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */