package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.Map;

@qi
public final class mb
  implements md
{
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    Object localObject = (String)paramMap.get("action");
    String str;
    if ("tick".equals(localObject))
    {
      str = (String)paramMap.get("label");
      localObject = (String)paramMap.get("start_label");
      paramMap = (String)paramMap.get("timestamp");
      if (TextUtils.isEmpty(str)) {
        tp.e("No label given for CSI tick.");
      }
    }
    label226:
    do
    {
      return;
      if (TextUtils.isEmpty(paramMap))
      {
        tp.e("No timestamp given for CSI tick.");
        return;
      }
      for (;;)
      {
        long l1;
        try
        {
          l1 = Long.parseLong(paramMap);
          long l2 = w.k().a();
          long l3 = w.k().b();
          l1 = l1 - l2 + l3;
          paramMap = (Map<String, String>)localObject;
          if (TextUtils.isEmpty((CharSequence)localObject)) {
            paramMap = "native:view_load";
          }
          paramvc = paramvc.y();
          localObject = b;
          paramMap = (kk)a.get(paramMap);
          if ((localObject == null) || (paramMap == null))
          {
            paramMap = a;
            paramvc = b;
            if (paramvc != null) {
              break label226;
            }
            paramvc = null;
            paramMap.put(str, paramvc);
            return;
          }
        }
        catch (NumberFormatException paramvc)
        {
          tp.c("Malformed timestamp for CSI tick.", paramvc);
          return;
        }
        ((km)localObject).a(paramMap, l1, new String[] { str });
        continue;
        paramvc = paramvc.a(l1);
      }
      if ("experiment".equals(localObject))
      {
        paramMap = (String)paramMap.get("value");
        if (TextUtils.isEmpty(paramMap))
        {
          tp.e("No value given for CSI experiment.");
          return;
        }
        paramvc = yb;
        if (paramvc == null)
        {
          tp.e("No ticker for WebView, dropping experiment ID.");
          return;
        }
        paramvc.a("e", paramMap);
        return;
      }
    } while (!"extra".equals(localObject));
    localObject = (String)paramMap.get("name");
    paramMap = (String)paramMap.get("value");
    if (TextUtils.isEmpty(paramMap))
    {
      tp.e("No value given for CSI extra.");
      return;
    }
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      tp.e("No name given for CSI extra.");
      return;
    }
    paramvc = yb;
    if (paramvc == null)
    {
      tp.e("No ticker for WebView, dropping extra parameter.");
      return;
    }
    paramvc.a((String)localObject, paramMap);
  }
}


/* Location:              com/google/android/gms/b/mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */