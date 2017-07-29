package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.Map;

public final class mb
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    String str1 = (String)paramMap.get("action");
    Object localObject1 = "tick";
    boolean bool1 = ((String)localObject1).equals(str1);
    Object localObject2;
    boolean bool2;
    if (bool1)
    {
      str1 = (String)paramMap.get("label");
      localObject1 = (String)paramMap.get("start_label");
      localObject2 = (String)paramMap.get("timestamp");
      bool2 = TextUtils.isEmpty(str1);
      if (bool2)
      {
        str1 = "No label given for CSI tick.";
        tp.e(str1);
      }
    }
    for (;;)
    {
      return;
      bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool2)
      {
        str1 = "No timestamp given for CSI tick.";
        tp.e(str1);
      }
      else
      {
        for (;;)
        {
          long l1;
          Object localObject4;
          Object localObject5;
          try
          {
            l1 = Long.parseLong((String)localObject2);
            Object localObject3 = w.k();
            long l2 = ((c)localObject3).a();
            localObject4 = w.k();
            long l3 = ((c)localObject4).b();
            l1 = l1 - l2 + l3;
            boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
            if (bool3) {
              localObject1 = "native:view_load";
            }
            localObject3 = paramvc.y();
            localObject5 = b;
            localObject1 = (kk)a.get(localObject1);
            int i = 1;
            localObject4 = new String[i];
            localObject4[0] = str1;
            if ((localObject5 != null) && (localObject1 != null)) {
              break label279;
            }
            localObject5 = a;
            localObject1 = b;
            if (localObject1 != null) {
              break label294;
            }
            bool1 = false;
            localObject1 = null;
            ((Map)localObject5).put(str1, localObject1);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            localObject1 = "Malformed timestamp for CSI tick.";
            tp.c((String)localObject1, localNumberFormatException);
          }
          break;
          label279:
          ((km)localObject5).a((kk)localObject1, l1, (String[])localObject4);
          continue;
          label294:
          localObject1 = ((km)localObject1).a(l1);
        }
        localObject1 = "experiment";
        bool1 = ((String)localObject1).equals(localNumberFormatException);
        String str2;
        if (bool1)
        {
          str2 = (String)paramMap.get("value");
          bool1 = TextUtils.isEmpty(str2);
          if (bool1)
          {
            str2 = "No value given for CSI experiment.";
            tp.e(str2);
          }
          else
          {
            localObject1 = yb;
            if (localObject1 == null)
            {
              str2 = "No ticker for WebView, dropping experiment ID.";
              tp.e(str2);
            }
            else
            {
              localObject2 = "e";
              ((km)localObject1).a((String)localObject2, str2);
            }
          }
        }
        else
        {
          localObject1 = "extra";
          boolean bool4 = ((String)localObject1).equals(str2);
          if (bool4)
          {
            str2 = (String)paramMap.get("name");
            localObject1 = (String)paramMap.get("value");
            boolean bool5 = TextUtils.isEmpty((CharSequence)localObject1);
            if (bool5)
            {
              str2 = "No value given for CSI extra.";
              tp.e(str2);
            }
            else
            {
              bool5 = TextUtils.isEmpty(str2);
              if (bool5)
              {
                str2 = "No name given for CSI extra.";
                tp.e(str2);
              }
              else
              {
                localObject2 = yb;
                if (localObject2 == null)
                {
                  str2 = "No ticker for WebView, dropping extra parameter.";
                  tp.e(str2);
                }
                else
                {
                  ((km)localObject2).a(str2, (String)localObject1);
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */