package com.google.android.gms.b;

import android.os.Handler;
import com.google.android.gms.ads.internal.w;
import java.util.List;

@qi
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
      b.a(c);
      return;
    }
    finally
    {
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          mr localmr = w.B();
          mq localmq = mq.this;
          a.remove(localmq);
        }
      });
    }
  }
  
  public final void c_()
  {
    b.a();
  }
}


/* Location:              com/google/android/gms/b/mq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */