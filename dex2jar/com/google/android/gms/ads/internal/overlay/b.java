package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tt;

@qi
public final class b
  implements Runnable
{
  public boolean a = false;
  private n b;
  
  b(n paramn)
  {
    b = paramn;
  }
  
  final void a()
  {
    tt.a.removeCallbacks(this);
    tt.a.postDelayed(this, 250L);
  }
  
  public final void run()
  {
    if (!a)
    {
      n localn = b;
      if (b != null)
      {
        long l = b.getCurrentPosition();
        if ((c != l) && (l > 0L))
        {
          localn.a("timeupdate", new String[] { "time", String.valueOf((float)l / 1000.0F) });
          c = l;
        }
      }
      a();
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */