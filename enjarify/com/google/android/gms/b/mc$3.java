package com.google.android.gms.b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.w;
import java.util.Map;

final class mc$3
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    localObject1 = (String)paramMap.get("u");
    if (localObject1 == null)
    {
      localObject1 = "URL missing from click GMSG.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = Uri.parse((String)localObject1);
      try
      {
        localObject3 = paramvc.n();
        if (localObject3 == null) {
          break label325;
        }
        boolean bool1 = ((dw)localObject3).b((Uri)localObject2);
        if (!bool1) {
          break label325;
        }
        localObject4 = paramvc.getContext();
        View localView = paramvc.b();
        localObject1 = ((dw)localObject3).a((Uri)localObject2, (Context)localObject4, localView);
      }
      catch (dx localdx)
      {
        for (;;)
        {
          Object localObject3;
          Object localObject4;
          String str = "Unable to append parameter to URL: ";
          localObject1 = String.valueOf(localObject1);
          int i = ((String)localObject1).length();
          if (i != 0) {
            localObject1 = str.concat((String)localObject1);
          }
          for (;;)
          {
            tp.e((String)localObject1);
            break;
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>(str);
          }
          boolean bool2 = false;
          localObject1 = null;
          continue;
          localObject1 = localObject2;
        }
      }
      localObject2 = localObject1;
      localObject3 = w.D();
      localObject1 = ke.aA;
      localObject4 = w.q();
      localObject1 = (Boolean)((kd)localObject4).a((jz)localObject1);
      bool2 = ((Boolean)localObject1).booleanValue();
      if (!bool2) {
        break label317;
      }
      bool2 = ((ta)localObject3).a();
      if (!bool2) {
        break label317;
      }
      bool2 = true;
      if (bool2)
      {
        localObject1 = ((Uri)localObject2).getQueryParameter("fbs_aeid");
        bool2 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool2)
        {
          localObject1 = w.D();
          localObject3 = paramvc.getContext();
          localObject1 = ((ta)localObject1).d((Context)localObject3);
          w.e();
          localObject2 = tt.a(((Uri)localObject2).toString(), "fbs_aeid", (String)localObject1);
          localObject3 = w.D();
          localObject4 = paramvc.getContext();
          ((ta)localObject3).a((Context)localObject4, (String)localObject1);
        }
      }
      localObject1 = ((Uri)localObject2).toString();
      localObject2 = new com/google/android/gms/b/ud;
      localObject3 = paramvc.getContext();
      localObject4 = oa;
      ((ud)localObject2).<init>((Context)localObject3, (String)localObject4, (String)localObject1);
      ((to)localObject2).c();
    }
  }
}


/* Location:              com/google/android/gms/b/mc$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */