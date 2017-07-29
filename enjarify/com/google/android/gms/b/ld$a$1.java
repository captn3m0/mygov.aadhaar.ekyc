package com.google.android.gms.b;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

final class ld$a$1
  implements md
{
  ld$a$1(ld.a parama, nk paramnk) {}
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = (vc)b.a.get();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = a;
      localObject2 = "/loadHtml";
      ((nk)localObject1).b((String)localObject2, this);
    }
    for (;;)
    {
      return;
      localObject2 = ((vc)localObject1).l();
      Object localObject3 = new com/google/android/gms/b/ld$a$1$1;
      ((ld.a.1.1)localObject3).<init>(this, paramMap);
      c = ((vd.a)localObject3);
      localObject3 = (String)paramMap.get("overlayHtml");
      localObject2 = (String)paramMap.get("baseUrl");
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      String str1;
      if (bool)
      {
        localObject2 = "text/html";
        str1 = "UTF-8";
        ((vc)localObject1).loadData((String)localObject3, (String)localObject2, str1);
      }
      else
      {
        str1 = "text/html";
        String str2 = "UTF-8";
        ((vc)localObject1).loadDataWithBaseURL((String)localObject2, (String)localObject3, str1, str2, null);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ld$a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */