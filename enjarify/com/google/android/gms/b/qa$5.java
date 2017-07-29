package com.google.android.gms.b;

import android.os.RemoteException;
import java.util.List;

final class qa$5
  implements ur.a
{
  qa$5(String paramString, Integer paramInteger1, Integer paramInteger2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {}
  
  private kt a(List paramList)
  {
    if (paramList != null) {}
    for (;;)
    {
      try
      {
        bool1 = paramList.isEmpty();
        if (!bool1) {
          continue;
        }
        bool1 = false;
        localkt = null;
      }
      catch (RemoteException localRemoteException)
      {
        kt localkt;
        List localList;
        Integer localInteger1;
        Integer localInteger2;
        int j;
        int k;
        boolean bool2;
        String str = "Could not get attribution icon";
        tp.b(str, localRemoteException);
        boolean bool1 = false;
        Object localObject = null;
        continue;
        int i = 0;
        Integer localInteger3 = null;
        continue;
      }
      return localkt;
      localkt = new com/google/android/gms/b/kt;
      str = a;
      localList = qa.a(paramList);
      localInteger1 = b;
      localInteger2 = c;
      i = d;
      if (i <= 0) {
        continue;
      }
      i = d;
      localInteger3 = Integer.valueOf(i);
      j = e;
      k = f;
      j += k;
      k = g;
      bool2 = h;
      localkt.<init>(str, localList, localInteger1, localInteger2, localInteger3, j, k, bool2);
    }
  }
}


/* Location:              com/google/android/gms/b/qa$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */