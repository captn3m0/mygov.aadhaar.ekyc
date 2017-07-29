package com.google.android.gms.b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.w;
import java.util.HashMap;
import java.util.Map;

final class mc$15
  implements md
{
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = (WindowManager)paramvc.getContext().getSystemService("window");
    w.e();
    Object localObject2 = paramvc;
    localObject2 = (View)paramvc;
    localObject1 = tt.a((WindowManager)localObject1);
    int i = widthPixels;
    int j = heightPixels;
    Object localObject3 = new int[2];
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    ((View)localObject2).getLocationInWindow((int[])localObject3);
    Integer localInteger1 = Integer.valueOf(localObject3[0]);
    localHashMap.put("xInPixels", localInteger1);
    localObject3 = Integer.valueOf(localObject3[1]);
    localHashMap.put("yInPixels", localObject3);
    Integer localInteger2 = Integer.valueOf(i);
    localHashMap.put("windowWidthInPixels", localInteger2);
    localObject1 = Integer.valueOf(j);
    localHashMap.put("windowHeightInPixels", localObject1);
    paramvc.a("locationReady", localHashMap);
    tp.e("GET LOCATION COMPILED");
  }
}


/* Location:              com/google/android/gms/b/mc$15.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */