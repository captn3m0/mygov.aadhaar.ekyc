package com.google.android.gms.b;

import android.os.Handler;
import com.google.android.gms.ads.internal.w;
import java.util.List;

public final class mq
  extends to
{
  final vc a;
  final ms b;
  private final String c;
  
  mq(vc paramvc, ms paramms, String paramString)
  {
    a = paramvc;
    b = paramms;
    c = paramString;
    Ba.add(this);
  }
  
  public final void a()
  {
    try
    {
      Object localObject1 = b;
      localObject3 = c;
      ((ms)localObject1).a((String)localObject3);
      localObject1 = tt.a;
      localObject3 = new com/google/android/gms/b/mq$1;
      ((mq.1)localObject3).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject3);
      return;
    }
    finally
    {
      Object localObject3 = tt.a;
      mq.1 local1 = new com/google/android/gms/b/mq$1;
      local1.<init>(this);
      ((Handler)localObject3).post(local1);
    }
  }
  
  public final void c_()
  {
    b.a();
  }
}


/* Location:              com/google/android/gms/b/mq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */