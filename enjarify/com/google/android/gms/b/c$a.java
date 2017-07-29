package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.c.c;

final class c$a
  implements c.c
{
  public final int a;
  public final com.google.android.gms.common.api.c b;
  public final c.c c;
  
  public c$a(c paramc, int paramInt, com.google.android.gms.common.api.c paramc1, c.c paramc2)
  {
    a = paramInt;
    b = paramc1;
    c = paramc2;
    paramc1.a(this);
  }
  
  public final void a(a parama)
  {
    String str = String.valueOf(parama);
    int i = String.valueOf(str).length() + 27;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    str = "beginFailureResolution for " + str;
    Log.d("AutoManageHelper", str);
    c localc = d;
    int j = a;
    localc.b(parama, j);
  }
}


/* Location:              com/google/android/gms/b/c$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */