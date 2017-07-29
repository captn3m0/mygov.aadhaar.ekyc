package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.overlay.g.b;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.c;
import java.util.Map;
import org.json.JSONObject;

public final class mo
  implements md
{
  private boolean a;
  
  private static int a(Context paramContext, Map paramMap, String paramString, int paramInt)
  {
    str = (String)paramMap.get(paramString);
    if (str != null) {}
    try
    {
      ip.a();
      i = Integer.parseInt(str);
      paramInt = uk.a(paramContext, i);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        int i = String.valueOf(paramString).length() + 34;
        int j = String.valueOf(str).length();
        i += j;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(i);
        StringBuilder localStringBuilder = ((StringBuilder)localObject).append("Could not parse ").append(paramString);
        localObject = " in a video GMSG: ";
        localStringBuilder = localStringBuilder.append((String)localObject);
        str = str;
        tp.e(str);
      }
    }
    return paramInt;
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    boolean bool1 = true;
    int i = -1;
    String str1 = (String)paramMap.get("action");
    if (str1 == null)
    {
      str1 = "Action missing from video GMSG.";
      tp.e(str1);
    }
    for (;;)
    {
      return;
      float f1 = 4.2E-45F;
      boolean bool2 = tp.a(3);
      int i1;
      Object localObject3;
      Object localObject4;
      if (bool2)
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramMap);
        ((JSONObject)localObject2).remove("google.afma.Notify_dt");
        localObject2 = String.valueOf(((JSONObject)localObject2).toString());
        n = String.valueOf(str1).length() + 13;
        i1 = String.valueOf(localObject2).length();
        n += i1;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(n);
        localObject4 = ((StringBuilder)localObject3).append("Video GMSG: ").append(str1);
        localObject3 = " ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject3);
        localObject2 = (String)localObject2;
        tp.b((String)localObject2);
      }
      Object localObject2 = "background";
      bool2 = ((String)localObject2).equals(str1);
      boolean bool10;
      int i6;
      int i7;
      int j;
      Object localObject5;
      if (bool2)
      {
        str1 = (String)paramMap.get("color");
        bool2 = TextUtils.isEmpty(str1);
        if (bool2)
        {
          str1 = "Color parameter missing from color video GMSG.";
          tp.e(str1);
        }
        else
        {
          try
          {
            int i2 = Color.parseColor(str1);
            paramvc.setBackgroundColor(i2);
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            localObject1 = "Invalid color parameter in video GMSG.";
            tp.e((String)localObject1);
          }
        }
      }
      else
      {
        localObject3 = paramvc.w();
        if (localObject3 == null)
        {
          localObject1 = "Could not get underlay container for a video GMSG.";
          tp.e((String)localObject1);
        }
        else
        {
          bool10 = "new".equals(localObject1);
          localObject2 = "position";
          bool2 = ((String)localObject2).equals(localObject1);
          if ((bool10) || (bool2))
          {
            localObject1 = paramvc.getContext();
            i6 = a((Context)localObject1, paramMap, "x", 0);
            i7 = a((Context)localObject1, paramMap, "y", 0);
            n = a((Context)localObject1, paramMap, "w", i);
            localObject2 = "h";
            j = a((Context)localObject1, paramMap, (String)localObject2, i);
            localObject1 = ke.cp;
            localObject5 = w.q();
            localObject1 = (Boolean)((kd)localObject5).a((jz)localObject1);
            boolean bool6 = ((Boolean)localObject1).booleanValue();
            if (bool6)
            {
              int i3 = paramvc.getMeasuredWidth() - i6;
              n = Math.min(n, i3);
              i3 = paramvc.getMeasuredHeight() - i7;
              i3 = Math.min(j, i3);
              j = i3;
            }
            localObject1 = "player";
          }
        }
      }
      try
      {
        localObject1 = paramMap.get(localObject1);
        localObject1 = (String)localObject1;
        Integer.parseInt((String)localObject1);
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        boolean bool7;
        Object localObject6;
        Object localObject7;
        km localkm;
        boolean bool3;
        long l;
        float f2;
        float f3;
        String str2;
        boolean bool4;
        int i4;
        float f5;
        boolean bool8;
        int m;
        int i5;
        boolean bool9;
        boolean bool5;
        String str3;
        for (;;) {}
      }
      localObject1 = (String)paramMap.get("spherical");
      bool7 = Boolean.parseBoolean((String)localObject1);
      if (bool10)
      {
        localObject6 = ((vb)localObject3).a();
        if (localObject6 == null)
        {
          localObject6 = d;
          if (localObject6 != null) {
            continue;
          }
          localObject6 = a.y().b;
          localObject5 = a.x();
          localObject7 = new String[bool1];
          localObject7[0] = "vpr2";
          ki.a((km)localObject6, (kk)localObject5, (String[])localObject7);
          localObject6 = new com/google/android/gms/ads/internal/overlay/n;
          localObject5 = b;
          localObject7 = a;
          localkm = a.y().b;
          ((n)localObject6).<init>((Context)localObject5, (vc)localObject7, bool7, localkm);
          d = ((n)localObject6);
          localObject1 = c;
          localObject6 = d;
          localObject5 = new android/view/ViewGroup$LayoutParams;
          ((ViewGroup.LayoutParams)localObject5).<init>(i, i);
          ((ViewGroup)localObject1).addView((View)localObject6, 0, (ViewGroup.LayoutParams)localObject5);
          d.a(i6, i7, n, j);
          localObject1 = a.l();
          f = false;
          continue;
        }
      }
      c.b("The underlay may only be modified from the UI thread.");
      localObject1 = d;
      if (localObject1 != null)
      {
        localObject1 = d;
        ((n)localObject1).a(i6, i7, n, j);
        continue;
        localObject5 = ((vb)localObject3).a();
        if (localObject5 == null)
        {
          n.a(paramvc);
        }
        else
        {
          localObject2 = "click";
          bool3 = ((String)localObject2).equals(localObject1);
          if (bool3)
          {
            localObject1 = paramvc.getContext();
            n = a((Context)localObject1, paramMap, "x", 0);
            i1 = a((Context)localObject1, paramMap, "y", 0);
            l = SystemClock.uptimeMillis();
            f2 = n;
            f3 = i1;
            i7 = 0;
            localObject1 = MotionEvent.obtain(l, l, 0, f2, f3, 0);
            localObject2 = b;
            if (localObject2 != null)
            {
              localObject2 = b;
              ((l)localObject2).dispatchTouchEvent((MotionEvent)localObject1);
            }
            ((MotionEvent)localObject1).recycle();
          }
          else
          {
            localObject2 = "currentTime";
            bool3 = ((String)localObject2).equals(localObject1);
            if (bool3)
            {
              localObject1 = (String)paramMap.get("time");
              if (localObject1 == null)
              {
                localObject1 = "Time parameter missing from currentTime video GMSG.";
                tp.e((String)localObject1);
              }
              else
              {
                try
                {
                  f1 = Float.parseFloat((String)localObject1);
                  n = 1148846080;
                  float f4 = 1000.0F;
                  f1 *= f4;
                  int k = (int)f1;
                  localObject4 = b;
                  if (localObject4 == null) {
                    continue;
                  }
                  localObject4 = b;
                  ((l)localObject4).a(k);
                }
                catch (NumberFormatException localNumberFormatException2)
                {
                  str2 = "Could not parse time parameter from currentTime video GMSG: ";
                  localObject1 = String.valueOf(localObject1);
                  n = ((String)localObject1).length();
                  if (n == 0) {
                    break label1026;
                  }
                }
                localObject1 = str2.concat((String)localObject1);
                for (;;)
                {
                  tp.e((String)localObject1);
                  break;
                  label1026:
                  localObject1 = new java/lang/String;
                  ((String)localObject1).<init>(str2);
                }
              }
            }
            else
            {
              str2 = "hide";
              bool4 = str2.equals(localObject1);
              if (bool4)
              {
                i4 = 4;
                f5 = 5.6E-45F;
                ((n)localObject5).setVisibility(i4);
              }
              else
              {
                str2 = "load";
                bool4 = str2.equals(localObject1);
                if (bool4)
                {
                  ((n)localObject5).h();
                }
                else
                {
                  str2 = "muted";
                  bool4 = str2.equals(localObject1);
                  if (bool4)
                  {
                    localObject1 = (String)paramMap.get("muted");
                    bool8 = Boolean.parseBoolean((String)localObject1);
                    if (bool8)
                    {
                      localObject1 = b;
                      if (localObject1 != null)
                      {
                        localObject1 = b;
                        ((l)localObject1).f();
                      }
                    }
                    else
                    {
                      localObject1 = b;
                      if (localObject1 != null)
                      {
                        localObject1 = b;
                        ((l)localObject1).g();
                      }
                    }
                  }
                  else
                  {
                    str2 = "pause";
                    bool4 = str2.equals(localObject1);
                    if (bool4)
                    {
                      ((n)localObject5).i();
                    }
                    else
                    {
                      str2 = "play";
                      bool4 = str2.equals(localObject1);
                      if (bool4)
                      {
                        localObject1 = b;
                        if (localObject1 != null)
                        {
                          localObject1 = b;
                          ((l)localObject1).d();
                        }
                      }
                      else
                      {
                        str2 = "show";
                        bool4 = str2.equals(localObject1);
                        if (bool4)
                        {
                          ((n)localObject5).setVisibility(0);
                        }
                        else
                        {
                          str2 = "src";
                          bool4 = str2.equals(localObject1);
                          if (bool4)
                          {
                            localObject1 = (String)paramMap.get("src");
                            d = ((String)localObject1);
                          }
                          else
                          {
                            str2 = "touchMove";
                            bool4 = str2.equals(localObject1);
                            if (bool4)
                            {
                              localObject1 = paramvc.getContext();
                              str2 = "dx";
                              m = a((Context)localObject1, paramMap, str2, 0);
                              i5 = a((Context)localObject1, paramMap, "dy", 0);
                              f1 = m;
                              f5 = i5;
                              localObject4 = b;
                              if (localObject4 != null)
                              {
                                localObject4 = b;
                                ((l)localObject4).a(f1, f5);
                              }
                              bool9 = a;
                              if (!bool9)
                              {
                                localObject1 = il;
                                b = bool1;
                                a = bool1;
                              }
                            }
                            else
                            {
                              str2 = "volume";
                              bool5 = str2.equals(localObject1);
                              if (bool5)
                              {
                                localObject1 = (String)paramMap.get("volume");
                                if (localObject1 == null)
                                {
                                  localObject1 = "Level parameter missing from volume video GMSG.";
                                  tp.e((String)localObject1);
                                }
                                else
                                {
                                  try
                                  {
                                    f1 = Float.parseFloat((String)localObject1);
                                    localObject4 = b;
                                    if (localObject4 == null) {
                                      continue;
                                    }
                                    localObject4 = b;
                                    ((l)localObject4).a(f1);
                                  }
                                  catch (NumberFormatException localNumberFormatException3)
                                  {
                                    str3 = "Could not parse volume parameter from volume video GMSG: ";
                                    localObject1 = String.valueOf(localObject1);
                                    n = ((String)localObject1).length();
                                    if (n == 0) {
                                      break label1607;
                                    }
                                  }
                                  localObject1 = str3.concat((String)localObject1);
                                  for (;;)
                                  {
                                    tp.e((String)localObject1);
                                    break;
                                    label1607:
                                    localObject1 = new java/lang/String;
                                    ((String)localObject1).<init>(str3);
                                  }
                                }
                              }
                              else
                              {
                                str3 = "watermark";
                                bool5 = str3.equals(localObject1);
                                if (!bool5) {
                                  break;
                                }
                                ((n)localObject5).j();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    str3 = "Unknown video action: ";
    Object localObject1 = String.valueOf(localObject1);
    int n = ((String)localObject1).length();
    if (n != 0) {
      localObject1 = str3.concat((String)localObject1);
    }
    for (;;)
    {
      tp.e((String)localObject1);
      break;
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>(str3);
    }
  }
}


/* Location:              com/google/android/gms/b/mo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */