package com.google.android.gms.b;

import android.os.RemoteException;

final class vi$2
  implements Runnable
{
  vi$2(vi paramvi, int paramInt1, int paramInt2) {}
  
  public final void run()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = 1;
    vi localvi1 = c;
    synchronized (vi.b(localvi1))
    {
      int j = a;
      int k = b;
      vi localvi2;
      int m;
      int n;
      label77:
      int i1;
      if (j != k)
      {
        j = i;
        localvi2 = c;
        boolean bool2 = vi.c(localvi2);
        if (bool2) {
          break label210;
        }
        m = b;
        if (m != i) {
          break label210;
        }
        n = i;
        if (j == 0) {
          break label216;
        }
        m = b;
        if (m != i) {
          break label216;
        }
        i1 = i;
        label97:
        if (j == 0) {
          break label222;
        }
        m = b;
        int i2 = 2;
        if (m != i2) {
          break label222;
        }
        m = i;
        label121:
        if (j == 0) {
          break label231;
        }
        j = b;
        i2 = 3;
        if (j != i2) {
          break label231;
        }
        j = i;
      }
      for (;;)
      {
        vi localvi3 = c;
        vi localvi4 = c;
        boolean bool3 = vi.c(localvi4);
        if ((bool3) || (n != 0)) {
          bool1 = i;
        }
        vi.a(localvi3, bool1);
        localObject1 = c;
        localObject1 = vi.d((vi)localObject1);
        if (localObject1 != null) {
          break label240;
        }
        return;
        j = 0;
        localvi1 = null;
        break;
        label210:
        n = 0;
        break label77;
        label216:
        i1 = 0;
        break label97;
        label222:
        m = 0;
        localvi2 = null;
        break label121;
        label231:
        j = 0;
        localvi1 = null;
      }
      label240:
      if (n != 0) {}
      try
      {
        localObject1 = c;
        localObject1 = vi.d((vi)localObject1);
        ((jg)localObject1).a();
      }
      catch (RemoteException localRemoteException1)
      {
        for (;;)
        {
          str = "Unable to call onVideoStart()";
          tp.c(str, localRemoteException1);
        }
      }
      if (i1 != 0) {}
      try
      {
        localObject1 = c;
        localObject1 = vi.d((vi)localObject1);
        ((jg)localObject1).b();
      }
      catch (RemoteException localRemoteException2)
      {
        for (;;)
        {
          str = "Unable to call onVideoPlay()";
          tp.c(str, localRemoteException2);
        }
      }
      if (m != 0) {}
      try
      {
        localObject1 = c;
        localObject1 = vi.d((vi)localObject1);
        ((jg)localObject1).c();
      }
      catch (RemoteException localRemoteException3)
      {
        for (;;)
        {
          str = "Unable to call onVideoPause()";
          tp.c(str, localRemoteException3);
        }
      }
      if (j != 0) {}
      try
      {
        localObject1 = c;
        localObject1 = vi.d((vi)localObject1);
        ((jg)localObject1).d();
      }
      catch (RemoteException localRemoteException4)
      {
        for (;;)
        {
          String str = "Unable to call onVideoEnd()";
          tp.c(str, localRemoteException4);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/vi$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */