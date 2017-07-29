package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.b.gn;
import com.google.android.gms.b.gr;
import com.google.android.gms.b.tp;

final class v$2
  implements View.OnTouchListener
{
  v$2(v paramv) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    Object localObject1 = v.b(a);
    if (localObject1 != null) {}
    try
    {
      localObject1 = a;
      localObject1 = v.b((v)localObject1);
      localObject1 = a;
      localObject2 = b.a(paramMotionEvent);
      ((gr)localObject1).d((a)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Unable to process ad data";
        tp.c((String)localObject2, localRemoteException);
      }
    }
    return false;
  }
}


/* Location:              com/google/android/gms/ads/internal/v$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */