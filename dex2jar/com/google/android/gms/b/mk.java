package com.google.android.gms.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.g.a;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.internal.f;
import com.google.android.gms.ads.internal.w;
import java.util.Collections;
import java.util.Map;

@qi
public final class mk
  implements md
{
  static final Map<String, Integer> a;
  private final f b;
  private final ot c;
  
  static
  {
    a locala = new a(6);
    locala.put("resize", Integer.valueOf(1));
    locala.put("playVideo", Integer.valueOf(2));
    locala.put("storePicture", Integer.valueOf(3));
    locala.put("createCalendarEvent", Integer.valueOf(4));
    locala.put("setOrientationProperties", Integer.valueOf(5));
    locala.put("closeResizedAd", Integer.valueOf(6));
    a = Collections.unmodifiableMap(locala);
  }
  
  public mk(f paramf, ot paramot)
  {
    b = paramf;
    c = paramot;
  }
  
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    int j = -1;
    ??? = (String)paramMap.get("a");
    int i = ((Integer)a.get(???)).intValue();
    if ((i != 5) && (b != null) && (!b.a()))
    {
      b.a(null);
      return;
    }
    Object localObject2;
    Object localObject3;
    switch (i)
    {
    case 2: 
    default: 
      tp.d("Unknown MRAID command called.");
      return;
    case 1: 
      localObject2 = c;
      synchronized (j)
      {
        if (l == null)
        {
          ((ot)localObject2).a("Not an activity context. Cannot resize.");
          return;
        }
      }
      if (k.k() == null)
      {
        ((ot)localObject2).a("Webview is not yet available, size is not set.");
        return;
      }
      if (k.k().d)
      {
        ((ot)localObject2).a("Is interstitial. Cannot resize an interstitial.");
        return;
      }
      if (k.p())
      {
        ((ot)localObject2).a("Cannot resize an expanded banner.");
        return;
      }
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("width")))
      {
        w.e();
        i = tt.b((String)paramMap.get("width"));
      }
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("height")))
      {
        w.e();
        f = tt.b((String)paramMap.get("height"));
      }
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetX")))
      {
        w.e();
        g = tt.b((String)paramMap.get("offsetX"));
      }
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetY")))
      {
        w.e();
        h = tt.b((String)paramMap.get("offsetY"));
      }
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("allowOffscreen"))) {
        c = Boolean.parseBoolean((String)paramMap.get("allowOffscreen"));
      }
      paramvc = (String)paramMap.get("customClosePosition");
      if (!TextUtils.isEmpty(paramvc)) {
        b = paramvc;
      }
      if ((i >= 0) && (f >= 0))
      {
        i = 1;
        if (i == 0)
        {
          ((ot)localObject2).a("Invalid width and height options. Cannot resize.");
          return;
        }
        paramMap = l.getWindow();
        if ((paramMap == null) || (paramMap.getDecorView() == null))
        {
          ((ot)localObject2).a("Activity context is not ready, cannot get window or decor view.");
          return;
        }
        paramvc = ((ot)localObject2).a();
        if (paramvc == null)
        {
          ((ot)localObject2).a("Resize location out of screen or close button is not visible.");
          return;
        }
        ip.a();
        i = uk.a(l, i);
        ip.a();
        int k = uk.a(l, f);
        localObject3 = k.b().getParent();
        if ((localObject3 != null) && ((localObject3 instanceof ViewGroup)))
        {
          ((ViewGroup)localObject3).removeView(k.b());
          if (q == null)
          {
            s = ((ViewGroup)localObject3);
            w.e();
            localObject3 = tt.a(k.b());
            n = new ImageView(l);
            n.setImageBitmap((Bitmap)localObject3);
            m = k.k();
            s.addView(n);
            r = new RelativeLayout(l);
            r.setBackgroundColor(0);
            r.setLayoutParams(new ViewGroup.LayoutParams(i, k));
            w.e();
            q = tt.a(r, i, k);
            q.setOutsideTouchable(true);
            q.setTouchable(true);
            localObject3 = q;
            if (c) {
              break label2223;
            }
          }
        }
      }
      break;
    }
    label1486:
    label1606:
    label1627:
    label1687:
    label1694:
    label1701:
    label1959:
    label1980:
    label2044:
    label2051:
    label2058:
    label2182:
    label2223:
    for (boolean bool = true;; bool = false)
    {
      ((PopupWindow)localObject3).setClippingEnabled(bool);
      r.addView(k.b(), -1, -1);
      o = new LinearLayout(l);
      ip.a();
      i = uk.a(l, 50);
      ip.a();
      localObject3 = new RelativeLayout.LayoutParams(i, uk.a(l, 50));
      Object localObject4 = b;
      switch (((String)localObject4).hashCode())
      {
      }
      for (;;)
      {
        ((RelativeLayout.LayoutParams)localObject3).addRule(10);
        ((RelativeLayout.LayoutParams)localObject3).addRule(11);
        for (;;)
        {
          o.setOnClickListener(new ot.1((ot)localObject2));
          o.setContentDescription("Close button");
          r.addView(o, (ViewGroup.LayoutParams)localObject3);
          try
          {
            localObject3 = q;
            paramMap = paramMap.getDecorView();
            ip.a();
            i = uk.a(l, paramvc[0]);
            ip.a();
            ((PopupWindow)localObject3).showAtLocation(paramMap, 0, i, uk.a(l, paramvc[1]));
            if (p != null) {
              p.L();
            }
            k.a(new il(l, new d(i, f)));
            ((ot)localObject2).a(paramvc[0], paramvc[1]);
            ((ot)localObject2).b("resized");
            return;
          }
          catch (RuntimeException paramvc)
          {
            paramvc = String.valueOf(paramvc.getMessage());
            if (paramvc.length() == 0) {
              break label1486;
            }
            for (paramvc = "Cannot show popup window: ".concat(paramvc);; paramvc = new String("Cannot show popup window: "))
            {
              ((ot)localObject2).a(paramvc);
              r.removeView(k.b());
              if (s != null)
              {
                s.removeView(n);
                s.addView(k.b());
                k.a(m);
              }
              return;
            }
          }
          q.dismiss();
          break;
          ((ot)localObject2).a("Webview is detached, probably in the middle of a resize or expand.");
          return;
          i = j;
          if (!((String)localObject4).equals("top-left")) {
            break label2182;
          }
          i = 0;
          break label2182;
          i = j;
          if (!((String)localObject4).equals("top-center")) {
            break label2182;
          }
          i = 1;
          break label2182;
          i = j;
          if (!((String)localObject4).equals("center")) {
            break label2182;
          }
          i = 2;
          break label2182;
          i = j;
          if (!((String)localObject4).equals("bottom-left")) {
            break label2182;
          }
          i = 3;
          break label2182;
          i = j;
          if (!((String)localObject4).equals("bottom-center")) {
            break label2182;
          }
          i = 4;
          break label2182;
          i = j;
          if (!((String)localObject4).equals("bottom-right")) {
            break label2182;
          }
          i = 5;
          break label2182;
          ((RelativeLayout.LayoutParams)localObject3).addRule(10);
          ((RelativeLayout.LayoutParams)localObject3).addRule(9);
          continue;
          ((RelativeLayout.LayoutParams)localObject3).addRule(10);
          ((RelativeLayout.LayoutParams)localObject3).addRule(14);
          continue;
          ((RelativeLayout.LayoutParams)localObject3).addRule(13);
          continue;
          ((RelativeLayout.LayoutParams)localObject3).addRule(12);
          ((RelativeLayout.LayoutParams)localObject3).addRule(9);
          continue;
          ((RelativeLayout.LayoutParams)localObject3).addRule(12);
          ((RelativeLayout.LayoutParams)localObject3).addRule(14);
          continue;
          ((RelativeLayout.LayoutParams)localObject3).addRule(12);
          ((RelativeLayout.LayoutParams)localObject3).addRule(11);
        }
        paramMap = new os(paramvc, paramMap);
        if (a == null)
        {
          paramMap.a("Activity context is not available.");
          return;
        }
        w.e();
        if (!tt.d(a).b())
        {
          paramMap.a("This feature is not available on the device.");
          return;
        }
        w.e();
        ??? = tt.c(a);
        localObject2 = w.i().q();
        if (localObject2 != null)
        {
          paramvc = ((Resources)localObject2).getString(a.b.create_calendar_title);
          ((AlertDialog.Builder)???).setTitle(paramvc);
          if (localObject2 == null) {
            break label1687;
          }
          paramvc = ((Resources)localObject2).getString(a.b.create_calendar_message);
          ((AlertDialog.Builder)???).setMessage(paramvc);
          if (localObject2 == null) {
            break label1694;
          }
          paramvc = ((Resources)localObject2).getString(a.b.accept);
          ((AlertDialog.Builder)???).setPositiveButton(paramvc, new os.1(paramMap));
          if (localObject2 == null) {
            break label1701;
          }
        }
        for (paramvc = ((Resources)localObject2).getString(a.b.decline);; paramvc = "Decline")
        {
          ((AlertDialog.Builder)???).setNegativeButton(paramvc, new os.2(paramMap));
          ((AlertDialog.Builder)???).create().show();
          return;
          paramvc = "Create calendar event";
          break;
          paramvc = "Allow Ad to create a calendar event?";
          break label1606;
          paramvc = "Accept";
          break label1627;
        }
        paramMap = new ov(paramvc, paramMap);
        if (b == null)
        {
          paramMap.a("Activity context is not available");
          return;
        }
        w.e();
        if (!tt.d(b).a())
        {
          paramMap.a("Feature is not supported by the device.");
          return;
        }
        localObject2 = (String)a.get("iurl");
        if (TextUtils.isEmpty((CharSequence)localObject2))
        {
          paramMap.a("Image url cannot be empty.");
          return;
        }
        if (!URLUtil.isValidUrl((String)localObject2))
        {
          paramvc = String.valueOf(localObject2);
          if (paramvc.length() != 0) {}
          for (paramvc = "Invalid image url: ".concat(paramvc);; paramvc = new String("Invalid image url: "))
          {
            paramMap.a(paramvc);
            return;
          }
        }
        localObject3 = Uri.parse((String)localObject2).getLastPathSegment();
        w.e();
        if (!tt.c((String)localObject3))
        {
          paramvc = String.valueOf(localObject3);
          if (paramvc.length() != 0) {}
          for (paramvc = "Image type not recognized: ".concat(paramvc);; paramvc = new String("Image type not recognized: "))
          {
            paramMap.a(paramvc);
            return;
          }
        }
        localObject4 = w.i().q();
        w.e();
        ??? = tt.c(b);
        if (localObject4 != null)
        {
          paramvc = ((Resources)localObject4).getString(a.b.store_picture_title);
          ((AlertDialog.Builder)???).setTitle(paramvc);
          if (localObject4 == null) {
            break label2044;
          }
          paramvc = ((Resources)localObject4).getString(a.b.store_picture_message);
          ((AlertDialog.Builder)???).setMessage(paramvc);
          if (localObject4 == null) {
            break label2051;
          }
          paramvc = ((Resources)localObject4).getString(a.b.accept);
          ((AlertDialog.Builder)???).setPositiveButton(paramvc, new ov.1(paramMap, (String)localObject2, (String)localObject3));
          if (localObject4 == null) {
            break label2058;
          }
        }
        for (paramvc = ((Resources)localObject4).getString(a.b.decline);; paramvc = "Decline")
        {
          ((AlertDialog.Builder)???).setNegativeButton(paramvc, new ov.2(paramMap));
          ((AlertDialog.Builder)???).create().show();
          return;
          paramvc = "Save image";
          break;
          paramvc = "Allow Ad to store image in Picture gallery?";
          break label1959;
          paramvc = "Accept";
          break label1980;
        }
        paramvc = new ou(paramvc, paramMap);
        if (a == null)
        {
          tp.e("AdWebView is null");
          return;
        }
        if ("portrait".equalsIgnoreCase(c)) {
          i = w.g().b();
        }
        for (;;)
        {
          a.b(i);
          return;
          if ("landscape".equalsIgnoreCase(c)) {
            i = w.g().a();
          } else if (b) {
            i = -1;
          } else {
            i = w.g().c();
          }
        }
        c.a(true);
        return;
        i = 0;
        break;
        i = j;
        switch (i)
        {
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */