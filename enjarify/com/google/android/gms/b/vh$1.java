package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.Map;

final class vh$1
  implements md
{
  vh$1(vh paramvh) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1;
    if (paramMap != null)
    {
      localObject1 = (String)paramMap.get("height");
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool) {}
    }
    for (;;)
    {
      try
      {
        i = Integer.parseInt((String)localObject1);
        ??? = a;
      }
      catch (Exception localException)
      {
        int i;
        vh localvh;
        int j;
        ??? = "Exception occurred while getting webview content height";
        tp.c((String)???, localException);
        continue;
      }
      synchronized (vh.a((vh)???))
      {
        localvh = a;
        j = vh.b(localvh);
        if (j != i)
        {
          localvh = a;
          vh.a(localvh, i);
          localObject1 = a;
          ((vh)localObject1).requestLayout();
        }
        return;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/vh$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */