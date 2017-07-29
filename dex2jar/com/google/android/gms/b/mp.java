package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.util.Map;

@qi
final class mp
  implements md
{
  public final void a(vc paramvc, Map<String, String> arg2)
  {
    Object localObject = ke.by;
    if (!((Boolean)w.q().a((jz)localObject)).booleanValue()) {
      return;
    }
    localObject = paramvc.z();
    if (localObject == null) {}
    for (;;)
    {
      try
      {
        localObject = new vi(paramvc, Float.parseFloat((String)???.get("duration")));
        paramvc.a((vi)localObject);
        paramvc = (vc)localObject;
        bool = "1".equals(???.get("muted"));
        f2 = Float.parseFloat((String)???.get("currentTime"));
        i = Integer.parseInt((String)???.get("playbackState"));
        if (i < 0) {
          break label313;
        }
        if (3 >= i) {
          continue;
        }
      }
      catch (NullPointerException paramvc)
      {
        synchronized (a)
        {
          boolean bool;
          float f2;
          d = f2;
          c = bool;
          int j = b;
          b = i;
          e = f1;
          w.e();
          tt.a(new vi.2(paramvc, j, i));
          return;
          paramvc = paramvc;
          tp.b("Unable to parse videoMeta message.", paramvc);
          w.i().a(paramvc, "VideoMetaGmsgHandler.onGmsg");
          return;
          continue;
          float f1 = Float.parseFloat(???);
        }
      }
      catch (NumberFormatException paramvc)
      {
        continue;
      }
      ??? = (String)???.get("aspectRatio");
      if (TextUtils.isEmpty(???))
      {
        f1 = 0.0F;
        if (tp.a(3)) {
          tp.b(String.valueOf(???).length() + 79 + "Video Meta GMSG: isMuted : " + bool + " , playbackState : " + i + " , aspectRatio : " + ???);
        }
      }
      paramvc = (vc)localObject;
      continue;
      label313:
      int i = 0;
    }
  }
}


/* Location:              com/google/android/gms/b/mp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */