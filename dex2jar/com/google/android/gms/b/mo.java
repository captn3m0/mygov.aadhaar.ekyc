package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.c;
import java.util.Map;
import org.json.JSONObject;

@qi
public final class mo
  implements md
{
  private boolean a;
  
  private static int a(Context paramContext, Map<String, String> paramMap, String paramString, int paramInt)
  {
    paramMap = (String)paramMap.get(paramString);
    int i = paramInt;
    if (paramMap != null) {}
    try
    {
      ip.a();
      i = uk.a(paramContext, Integer.parseInt(paramMap));
      return i;
    }
    catch (NumberFormatException paramContext)
    {
      tp.e(String.valueOf(paramString).length() + 34 + String.valueOf(paramMap).length() + "Could not parse " + paramString + " in a video GMSG: " + paramMap);
    }
    return paramInt;
  }
  
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    Object localObject2 = (String)paramMap.get("action");
    if (localObject2 == null) {
      tp.e("Action missing from video GMSG.");
    }
    for (;;)
    {
      return;
      if (tp.a(3))
      {
        localObject1 = new JSONObject(paramMap);
        ((JSONObject)localObject1).remove("google.afma.Notify_dt");
        localObject1 = String.valueOf(((JSONObject)localObject1).toString());
        tp.b(String.valueOf(localObject2).length() + 13 + String.valueOf(localObject1).length() + "Video GMSG: " + (String)localObject2 + " " + (String)localObject1);
      }
      if ("background".equals(localObject2))
      {
        paramMap = (String)paramMap.get("color");
        if (TextUtils.isEmpty(paramMap))
        {
          tp.e("Color parameter missing from color video GMSG.");
          return;
        }
        try
        {
          paramvc.setBackgroundColor(Color.parseColor(paramMap));
          return;
        }
        catch (IllegalArgumentException paramvc)
        {
          tp.e("Invalid color parameter in video GMSG.");
          return;
        }
      }
      Object localObject1 = paramvc.w();
      if (localObject1 == null)
      {
        tp.e("Could not get underlay container for a video GMSG.");
        return;
      }
      boolean bool1 = "new".equals(localObject2);
      boolean bool2 = "position".equals(localObject2);
      int n;
      int i1;
      int j;
      int i;
      if ((bool1) || (bool2))
      {
        localObject2 = paramvc.getContext();
        n = a((Context)localObject2, paramMap, "x", 0);
        i1 = a((Context)localObject2, paramMap, "y", 0);
        int m = a((Context)localObject2, paramMap, "w", -1);
        int k = a((Context)localObject2, paramMap, "h", -1);
        localObject2 = ke.cp;
        j = k;
        i = m;
        if (((Boolean)w.q().a((jz)localObject2)).booleanValue())
        {
          i = Math.min(m, paramvc.getMeasuredWidth() - n);
          j = Math.min(k, paramvc.getMeasuredHeight() - i1);
        }
      }
      try
      {
        Integer.parseInt((String)paramMap.get("player"));
        bool2 = Boolean.parseBoolean((String)paramMap.get("spherical"));
        if ((bool1) && (((vb)localObject1).a() == null))
        {
          if (d != null) {
            continue;
          }
          ki.a(a.y().b, a.x(), new String[] { "vpr2" });
          d = new n(b, a, bool2, a.y().b);
          c.addView(d, 0, new ViewGroup.LayoutParams(-1, -1));
          d.a(n, i1, i, j);
          a.l().f = false;
          return;
        }
        c.b("The underlay may only be modified from the UI thread.");
        if (d == null) {
          continue;
        }
        d.a(n, i1, i, j);
        return;
        localObject1 = ((vb)localObject1).a();
        if (localObject1 == null)
        {
          n.a(paramvc);
          return;
        }
        if ("click".equals(localObject2))
        {
          paramvc = paramvc.getContext();
          i = a(paramvc, paramMap, "x", 0);
          j = a(paramvc, paramMap, "y", 0);
          long l = SystemClock.uptimeMillis();
          paramvc = MotionEvent.obtain(l, l, 0, i, j, 0);
          if (b != null) {
            b.dispatchTouchEvent(paramvc);
          }
          paramvc.recycle();
          return;
        }
        if ("currentTime".equals(localObject2))
        {
          paramvc = (String)paramMap.get("time");
          if (paramvc == null)
          {
            tp.e("Time parameter missing from currentTime video GMSG.");
            return;
          }
          try
          {
            i = (int)(Float.parseFloat(paramvc) * 1000.0F);
            if (b == null) {
              continue;
            }
            b.a(i);
            return;
          }
          catch (NumberFormatException paramMap)
          {
            paramvc = String.valueOf(paramvc);
            if (paramvc.length() == 0) {}
          }
          for (paramvc = "Could not parse time parameter from currentTime video GMSG: ".concat(paramvc);; paramvc = new String("Could not parse time parameter from currentTime video GMSG: "))
          {
            tp.e(paramvc);
            return;
          }
        }
        if ("hide".equals(localObject2))
        {
          ((n)localObject1).setVisibility(4);
          return;
        }
        if ("load".equals(localObject2))
        {
          ((n)localObject1).h();
          return;
        }
        if ("muted".equals(localObject2))
        {
          if (Boolean.parseBoolean((String)paramMap.get("muted")))
          {
            if (b == null) {
              continue;
            }
            b.f();
            return;
          }
          if (b == null) {
            continue;
          }
          b.g();
          return;
        }
        if ("pause".equals(localObject2))
        {
          ((n)localObject1).i();
          return;
        }
        if ("play".equals(localObject2))
        {
          if (b == null) {
            continue;
          }
          b.d();
          return;
        }
        if ("show".equals(localObject2))
        {
          ((n)localObject1).setVisibility(0);
          return;
        }
        if ("src".equals(localObject2))
        {
          d = ((String)paramMap.get("src"));
          return;
        }
        float f1;
        if ("touchMove".equals(localObject2))
        {
          localObject2 = paramvc.getContext();
          i = a((Context)localObject2, paramMap, "dx", 0);
          j = a((Context)localObject2, paramMap, "dy", 0);
          f1 = i;
          float f2 = j;
          if (b != null) {
            b.a(f1, f2);
          }
          if (a) {
            continue;
          }
          il.b = true;
          a = true;
          return;
        }
        if ("volume".equals(localObject2))
        {
          paramvc = (String)paramMap.get("volume");
          if (paramvc == null)
          {
            tp.e("Level parameter missing from volume video GMSG.");
            return;
          }
          try
          {
            f1 = Float.parseFloat(paramvc);
            if (b == null) {
              continue;
            }
            b.a(f1);
            return;
          }
          catch (NumberFormatException paramMap)
          {
            paramvc = String.valueOf(paramvc);
            if (paramvc.length() == 0) {}
          }
          for (paramvc = "Could not parse volume parameter from volume video GMSG: ".concat(paramvc);; paramvc = new String("Could not parse volume parameter from volume video GMSG: "))
          {
            tp.e(paramvc);
            return;
          }
        }
        if ("watermark".equals(localObject2))
        {
          ((n)localObject1).j();
          return;
        }
        paramvc = String.valueOf(localObject2);
        if (paramvc.length() != 0) {}
        for (paramvc = "Unknown video action: ".concat(paramvc);; paramvc = new String("Unknown video action: "))
        {
          tp.e(paramvc);
          return;
        }
      }
      catch (NumberFormatException paramvc)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */