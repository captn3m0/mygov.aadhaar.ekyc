package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.b.tt;

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
    boolean bool1 = a;
    if (!bool1)
    {
      n localn = b;
      Object localObject = b;
      if (localObject != null)
      {
        localObject = b;
        long l1 = ((l)localObject).getCurrentPosition();
        long l2 = c;
        boolean bool2 = l2 < l1;
        if (bool2)
        {
          l2 = 0L;
          bool2 = l1 < l2;
          if (bool2)
          {
            float f1 = (float)l1;
            float f2 = 1000.0F;
            f1 /= f2;
            String str1 = "timeupdate";
            int i = 2;
            String[] arrayOfString = new String[i];
            String str2 = "time";
            arrayOfString[0] = str2;
            int j = 1;
            localObject = String.valueOf(f1);
            arrayOfString[j] = localObject;
            localn.a(str1, arrayOfString);
            c = l1;
          }
        }
      }
      a();
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */