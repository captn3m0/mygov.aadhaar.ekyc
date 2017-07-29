package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.c;
import com.google.android.gms.common.k;
import java.util.Set;

public abstract class u
  extends o
  implements a.f, v.a
{
  private final p a;
  private final Set i;
  private final Account j;
  
  protected u(Context paramContext, Looper paramLooper, int paramInt, p paramp, c.b paramb, c.c paramc)
  {
    this(paramContext, paramLooper, localw, localc, paramInt, paramp, localb, localc1);
  }
  
  private u(Context paramContext, Looper paramLooper, w paramw, c paramc, int paramInt, p paramp, c.b paramb, c.c paramc1) {}
  
  public final Account e_()
  {
    return j;
  }
  
  public final k[] j()
  {
    return new k[0];
  }
  
  protected final Set m()
  {
    return i;
  }
}


/* Location:              com/google/android/gms/common/internal/u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */