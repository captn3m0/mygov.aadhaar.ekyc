package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.util.Map;

final class mp
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    int i = 3;
    Object localObject1 = ke.by;
    Object localObject3 = w.q();
    localObject1 = (Boolean)((kd)localObject3).a((jz)localObject1);
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (!bool1) {
      return;
    }
    localObject1 = paramvc.z();
    if (localObject1 == null) {
      localObject1 = "duration";
    }
    for (;;)
    {
      try
      {
        localObject1 = paramMap.get(localObject1);
        localObject1 = (String)localObject1;
        f1 = Float.parseFloat((String)localObject1);
        localObject1 = new com/google/android/gms/b/vi;
        ((vi)localObject1).<init>(paramvc, f1);
        paramvc.a((vi)localObject1);
        localObject4 = localObject1;
        localObject1 = "1";
        localObject3 = "muted";
        localObject3 = paramMap.get(localObject3);
        bool2 = ((String)localObject1).equals(localObject3);
        localObject1 = "currentTime";
        localObject1 = paramMap.get(localObject1);
        localObject1 = (String)localObject1;
        f2 = Float.parseFloat((String)localObject1);
        localObject1 = "playbackState";
        localObject1 = paramMap.get(localObject1);
        localObject1 = (String)localObject1;
        j = Integer.parseInt((String)localObject1);
        if ((j < 0) || (i < j))
        {
          j = 0;
          localObject1 = null;
          i = 0;
          str = null;
          localObject1 = "aspectRatio";
          localObject1 = paramMap.get(localObject1);
          localObject1 = (String)localObject1;
          boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool3) {
            continue;
          }
          bool3 = false;
          f1 = 0.0F;
          localObject3 = null;
          int k = 3;
          boolean bool4 = tp.a(k);
          if (bool4)
          {
            ??? = String.valueOf(localObject1);
            int m = ((String)???).length() + 79;
            Object localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>(m);
            ??? = "Video Meta GMSG: isMuted : ";
            ??? = ((StringBuilder)localObject6).append((String)???);
            ??? = ((StringBuilder)???).append(bool2);
            localObject6 = " , playbackState : ";
            ??? = ((StringBuilder)???).append((String)localObject6);
            ??? = ((StringBuilder)???).append(i);
            localObject6 = " , aspectRatio : ";
            ??? = ((StringBuilder)???).append((String)localObject6);
            localObject1 = ((StringBuilder)???).append((String)localObject1);
            localObject1 = ((StringBuilder)localObject1).toString();
            tp.b((String)localObject1);
          }
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        synchronized (a)
        {
          boolean bool2;
          float f2;
          d = f2;
          c = bool2;
          int j = b;
          b = i;
          e = f1;
          w.e();
          localObject3 = new com/google/android/gms/b/vi$2;
          ((vi.2)localObject3).<init>((vi)localObject4, j, i);
          tt.a((Runnable)localObject3);
          break;
          localNullPointerException = localNullPointerException;
          tp.b("Unable to parse videoMeta message.", localNullPointerException);
          localObject3 = w.i();
          String str = "VideoMetaGmsgHandler.onGmsg";
          ((tj)localObject3).a(localNullPointerException, str);
          break;
          i = j;
          continue;
          float f1 = Float.parseFloat(localNullPointerException);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        continue;
      }
      Object localObject4 = localNumberFormatException;
    }
  }
}


/* Location:              com/google/android/gms/b/mp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */