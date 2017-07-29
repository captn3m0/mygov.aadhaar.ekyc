package com.google.android.gms.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.g.a;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
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

public final class mk
  implements md
{
  static final Map a;
  private final f b;
  private final ot c;
  
  static
  {
    int i = 6;
    Integer localInteger1 = Integer.valueOf(1);
    Integer localInteger2 = Integer.valueOf(2);
    Integer localInteger3 = Integer.valueOf(3);
    Integer localInteger4 = Integer.valueOf(4);
    Integer localInteger5 = Integer.valueOf(5);
    Integer localInteger6 = Integer.valueOf(i);
    a locala = new android/support/v4/g/a;
    locala.<init>(i);
    locala.put("resize", localInteger1);
    locala.put("playVideo", localInteger2);
    locala.put("storePicture", localInteger3);
    locala.put("createCalendarEvent", localInteger4);
    locala.put("setOrientationProperties", localInteger5);
    locala.put("closeResizedAd", localInteger6);
    a = Collections.unmodifiableMap(locala);
  }
  
  public mk(f paramf, ot paramot)
  {
    b = paramf;
    c = paramot;
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    int i = -1;
    int j = 0;
    Object localObject1 = null;
    int k = 1;
    float f = Float.MIN_VALUE;
    Object localObject2 = (String)paramMap.get("a");
    Object localObject6 = a;
    localObject2 = (Integer)((Map)localObject6).get(localObject2);
    int m = ((Integer)localObject2).intValue();
    int i11 = 5;
    boolean bool12;
    if (m != i11)
    {
      localObject6 = b;
      if (localObject6 != null)
      {
        localObject6 = b;
        bool12 = ((f)localObject6).a();
        if (!bool12)
        {
          localObject2 = b;
          bool12 = false;
          localObject6 = null;
          ((f)localObject2).a(null);
        }
      }
    }
    for (;;)
    {
      return;
      Object localObject7;
      label793:
      label1139:
      label1298:
      label1508:
      label1570:
      Object localObject11;
      Object localObject12;
      label1907:
      Object localObject5;
      switch (m)
      {
      case 2: 
      default: 
        localObject2 = "Unknown MRAID command called.";
        tp.d((String)localObject2);
        break;
      case 1: 
        localObject7 = c;
        synchronized (j)
        {
          localObject2 = l;
          if (localObject2 == null)
          {
            localObject2 = "Not an activity context. Cannot resize.";
            ((ot)localObject7).a((String)localObject2);
          }
        }
        Object localObject4 = k;
        localObject4 = ((vc)localObject4).k();
        if (localObject4 == null)
        {
          localObject4 = "Webview is not yet available, size is not set.";
          ((ot)localObject7).a((String)localObject4);
        }
        else
        {
          localObject4 = k;
          localObject4 = ((vc)localObject4).k();
          boolean bool1 = d;
          if (bool1)
          {
            localObject4 = "Is interstitial. Cannot resize an interstitial.";
            ((ot)localObject7).a((String)localObject4);
          }
          else
          {
            localObject4 = k;
            bool1 = ((vc)localObject4).p();
            if (bool1)
            {
              localObject4 = "Cannot resize an expanded banner.";
              ((ot)localObject7).a((String)localObject4);
            }
            else
            {
              localObject4 = "width";
              localObject4 = paramMap.get(localObject4);
              localObject4 = (CharSequence)localObject4;
              bool1 = TextUtils.isEmpty((CharSequence)localObject4);
              if (!bool1)
              {
                w.e();
                localObject4 = "width";
                localObject4 = paramMap.get(localObject4);
                localObject4 = (String)localObject4;
                int n = tt.b((String)localObject4);
                i = n;
              }
              localObject4 = "height";
              localObject4 = paramMap.get(localObject4);
              localObject4 = (CharSequence)localObject4;
              boolean bool2 = TextUtils.isEmpty((CharSequence)localObject4);
              if (!bool2)
              {
                w.e();
                localObject4 = "height";
                localObject4 = paramMap.get(localObject4);
                localObject4 = (String)localObject4;
                int i1 = tt.b((String)localObject4);
                f = i1;
              }
              localObject4 = "offsetX";
              localObject4 = paramMap.get(localObject4);
              localObject4 = (CharSequence)localObject4;
              boolean bool3 = TextUtils.isEmpty((CharSequence)localObject4);
              if (!bool3)
              {
                w.e();
                localObject4 = "offsetX";
                localObject4 = paramMap.get(localObject4);
                localObject4 = (String)localObject4;
                int i2 = tt.b((String)localObject4);
                g = i2;
              }
              localObject4 = "offsetY";
              localObject4 = paramMap.get(localObject4);
              localObject4 = (CharSequence)localObject4;
              boolean bool4 = TextUtils.isEmpty((CharSequence)localObject4);
              if (!bool4)
              {
                w.e();
                localObject4 = "offsetY";
                localObject4 = paramMap.get(localObject4);
                localObject4 = (String)localObject4;
                int i3 = tt.b((String)localObject4);
                h = i3;
              }
              localObject4 = "allowOffscreen";
              localObject4 = paramMap.get(localObject4);
              localObject4 = (CharSequence)localObject4;
              boolean bool5 = TextUtils.isEmpty((CharSequence)localObject4);
              if (!bool5)
              {
                localObject4 = "allowOffscreen";
                localObject4 = paramMap.get(localObject4);
                localObject4 = (String)localObject4;
                bool5 = Boolean.parseBoolean((String)localObject4);
                c = bool5;
              }
              localObject4 = "customClosePosition";
              localObject4 = paramMap.get(localObject4);
              localObject4 = (String)localObject4;
              bool12 = TextUtils.isEmpty((CharSequence)localObject4);
              if (!bool12) {
                b = ((String)localObject4);
              }
              int i4 = i;
              if (i4 >= 0)
              {
                i4 = f;
                if (i4 >= 0) {
                  i4 = k;
                }
              }
              for (;;)
              {
                if (i4 != 0) {
                  break label793;
                }
                localObject4 = "Invalid width and height options. Cannot resize.";
                ((ot)localObject7).a((String)localObject4);
                break;
                i4 = 0;
                localObject4 = null;
              }
              localObject4 = l;
              Window localWindow = ((Activity)localObject4).getWindow();
              if (localWindow != null)
              {
                localObject4 = localWindow.getDecorView();
                if (localObject4 != null) {}
              }
              else
              {
                localObject4 = "Activity context is not ready, cannot get window or decor view.";
                ((ot)localObject7).a((String)localObject4);
                continue;
              }
              int[] arrayOfInt = ((ot)localObject7).a();
              if (arrayOfInt == null)
              {
                localObject4 = "Resize location out of screen or close button is not visible.";
                ((ot)localObject7).a((String)localObject4);
              }
              else
              {
                ip.a();
                localObject4 = l;
                int i12 = i;
                int i16 = uk.a((Context)localObject4, i12);
                ip.a();
                localObject4 = l;
                i12 = f;
                int i17 = uk.a((Context)localObject4, i12);
                localObject4 = k;
                localObject4 = ((vc)localObject4).b();
                localObject6 = ((View)localObject4).getParent();
                boolean bool6;
                int i13;
                if (localObject6 != null)
                {
                  bool6 = localObject6 instanceof ViewGroup;
                  if (bool6)
                  {
                    Object localObject9 = localObject6;
                    localObject9 = (ViewGroup)localObject6;
                    localObject4 = localObject9;
                    Object localObject10 = k;
                    localObject10 = ((vc)localObject10).b();
                    ((ViewGroup)localObject9).removeView((View)localObject10);
                    localObject4 = q;
                    if (localObject4 == null)
                    {
                      localObject6 = (ViewGroup)localObject6;
                      s = ((ViewGroup)localObject6);
                      w.e();
                      localObject4 = k;
                      localObject4 = ((vc)localObject4).b();
                      localObject4 = tt.a((View)localObject4);
                      localObject6 = new android/widget/ImageView;
                      localObject10 = l;
                      ((ImageView)localObject6).<init>((Context)localObject10);
                      n = ((ImageView)localObject6);
                      localObject6 = n;
                      ((ImageView)localObject6).setImageBitmap((Bitmap)localObject4);
                      localObject4 = k;
                      localObject4 = ((vc)localObject4).k();
                      m = ((il)localObject4);
                      localObject4 = s;
                      localObject6 = n;
                      ((ViewGroup)localObject4).addView((View)localObject6);
                      localObject4 = new android/widget/RelativeLayout;
                      localObject6 = l;
                      ((RelativeLayout)localObject4).<init>((Context)localObject6);
                      r = ((RelativeLayout)localObject4);
                      localObject4 = r;
                      i12 = 0;
                      localObject6 = null;
                      ((RelativeLayout)localObject4).setBackgroundColor(0);
                      localObject4 = r;
                      localObject6 = new android/view/ViewGroup$LayoutParams;
                      ((ViewGroup.LayoutParams)localObject6).<init>(i16, i17);
                      ((RelativeLayout)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject6);
                      w.e();
                      localObject4 = r;
                      localObject4 = tt.a((View)localObject4, i16, i17);
                      q = ((PopupWindow)localObject4);
                      localObject4 = q;
                      i12 = 1;
                      ((PopupWindow)localObject4).setOutsideTouchable(i12);
                      localObject4 = q;
                      boolean bool13 = true;
                      ((PopupWindow)localObject4).setTouchable(bool13);
                      localObject6 = q;
                      bool6 = c;
                      if (bool6) {
                        break label1907;
                      }
                      bool6 = k;
                      ((PopupWindow)localObject6).setClippingEnabled(bool6);
                      localObject4 = r;
                      localObject6 = k;
                      localObject6 = ((vc)localObject6).b();
                      i16 = -1;
                      i17 = -1;
                      ((RelativeLayout)localObject4).addView((View)localObject6, i16, i17);
                      localObject4 = new android/widget/LinearLayout;
                      localObject6 = l;
                      ((LinearLayout)localObject4).<init>((Context)localObject6);
                      o = ((LinearLayout)localObject4);
                      localObject4 = new android/widget/RelativeLayout$LayoutParams;
                      ip.a();
                      localObject6 = l;
                      i16 = 50;
                      i13 = uk.a((Context)localObject6, i16);
                      ip.a();
                      Activity localActivity = l;
                      i17 = 50;
                      i16 = uk.a(localActivity, i17);
                      ((RelativeLayout.LayoutParams)localObject4).<init>(i13, i16);
                      localObject6 = b;
                      i16 = ((String)localObject6).hashCode();
                      switch (i16)
                      {
                      default: 
                        switch (i)
                        {
                        default: 
                          i13 = 10;
                          ((RelativeLayout.LayoutParams)localObject4).addRule(i13);
                          i13 = 11;
                          ((RelativeLayout.LayoutParams)localObject4).addRule(i13);
                          localObject6 = o;
                          localObject11 = new com/google/android/gms/b/ot$1;
                          ((ot.1)localObject11).<init>((ot)localObject7);
                          ((LinearLayout)localObject6).setOnClickListener((View.OnClickListener)localObject11);
                          localObject6 = o;
                          localObject11 = "Close button";
                          ((LinearLayout)localObject6).setContentDescription((CharSequence)localObject11);
                          localObject6 = r;
                          localObject11 = o;
                          ((RelativeLayout)localObject6).addView((View)localObject11, (ViewGroup.LayoutParams)localObject4);
                        }
                        break;
                      }
                    }
                  }
                }
                try
                {
                  localObject4 = q;
                  localObject6 = localWindow.getDecorView();
                  i = 0;
                  localObject11 = null;
                  ip.a();
                  localObject1 = l;
                  k = 0;
                  f = 0.0F;
                  localObject12 = null;
                  k = arrayOfInt[0];
                  j = uk.a((Context)localObject1, k);
                  ip.a();
                  localObject12 = l;
                  int i18 = 1;
                  i18 = arrayOfInt[i18];
                  k = uk.a((Context)localObject12, i18);
                  ((PopupWindow)localObject4).showAtLocation((View)localObject6, 0, j, k);
                  localObject4 = p;
                  if (localObject4 != null)
                  {
                    localObject4 = p;
                    ((oz)localObject4).L();
                  }
                  localObject4 = k;
                  localObject6 = new com/google/android/gms/b/il;
                  localObject11 = l;
                  localObject1 = new com/google/android/gms/ads/d;
                  k = i;
                  i18 = f;
                  ((d)localObject1).<init>(k, i18);
                  ((il)localObject6).<init>((Context)localObject11, (d)localObject1);
                  ((vc)localObject4).a((il)localObject6);
                  bool6 = false;
                  localObject4 = null;
                  int i5 = arrayOfInt[0];
                  i13 = 1;
                  i13 = arrayOfInt[i13];
                  ((ot)localObject7).a(i5, i13);
                  localObject4 = "resized";
                  ((ot)localObject7).b((String)localObject4);
                  continue;
                  localObject4 = q;
                  ((PopupWindow)localObject4).dismiss();
                  break label1139;
                  localObject4 = "Webview is detached, probably in the middle of a resize or expand.";
                  ((ot)localObject7).a((String)localObject4);
                  continue;
                  i5 = 0;
                  localObject4 = null;
                  break label1298;
                  localObject12 = "top-left";
                  boolean bool14 = ((String)localObject6).equals(localObject12);
                  if (!bool14) {
                    break label1508;
                  }
                  i = 0;
                  localObject11 = null;
                  break label1508;
                  localObject1 = "top-center";
                  bool14 = ((String)localObject6).equals(localObject1);
                  if (!bool14) {
                    break label1508;
                  }
                  i = k;
                  break label1508;
                  localObject1 = "center";
                  bool14 = ((String)localObject6).equals(localObject1);
                  if (!bool14) {
                    break label1508;
                  }
                  i = 2;
                  break label1508;
                  localObject1 = "bottom-left";
                  bool14 = ((String)localObject6).equals(localObject1);
                  if (!bool14) {
                    break label1508;
                  }
                  i = 3;
                  break label1508;
                  localObject1 = "bottom-center";
                  bool14 = ((String)localObject6).equals(localObject1);
                  if (!bool14) {
                    break label1508;
                  }
                  i = 4;
                  break label1508;
                  localObject1 = "bottom-right";
                  bool14 = ((String)localObject6).equals(localObject1);
                  if (!bool14) {
                    break label1508;
                  }
                  i = 5;
                  break label1508;
                  int i14 = 10;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  i14 = 9;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  break label1570;
                  i14 = 10;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  i14 = 14;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  break label1570;
                  i14 = 13;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  break label1570;
                  i14 = 12;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  i14 = 9;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  break label1570;
                  i14 = 12;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  i14 = 14;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  break label1570;
                  i14 = 12;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                  i14 = 11;
                  ((RelativeLayout.LayoutParams)localObject4).addRule(i14);
                }
                catch (RuntimeException localRuntimeException)
                {
                  localObject6 = "Cannot show popup window: ";
                  localObject5 = localRuntimeException.getMessage();
                  localObject5 = String.valueOf(localObject5);
                  i = ((String)localObject5).length();
                  if (i != 0) {
                    localObject5 = ((String)localObject6).concat((String)localObject5);
                  }
                  for (;;)
                  {
                    ((ot)localObject7).a((String)localObject5);
                    localObject5 = r;
                    localObject6 = k;
                    localObject6 = ((vc)localObject6).b();
                    ((RelativeLayout)localObject5).removeView((View)localObject6);
                    localObject5 = s;
                    if (localObject5 != null)
                    {
                      localObject5 = s;
                      localObject6 = n;
                      ((ViewGroup)localObject5).removeView((View)localObject6);
                      localObject5 = s;
                      localObject6 = k;
                      localObject6 = ((vc)localObject6).b();
                      ((ViewGroup)localObject5).addView((View)localObject6);
                      localObject5 = k;
                      localObject6 = m;
                      ((vc)localObject5).a((il)localObject6);
                    }
                    break;
                    localObject5 = new java/lang/String;
                    ((String)localObject5).<init>((String)localObject6);
                  }
                }
              }
            }
          }
        }
        break;
      case 4: 
        localObject6 = new com/google/android/gms/b/os;
        ((os)localObject6).<init>(paramvc, paramMap);
        localObject5 = a;
        if (localObject5 == null)
        {
          localObject5 = "Activity context is not available.";
          ((os)localObject6).a((String)localObject5);
        }
        else
        {
          w.e();
          localObject5 = tt.d(a);
          boolean bool7 = ((jv)localObject5).b();
          if (!bool7)
          {
            localObject5 = "This feature is not available on the device.";
            ((os)localObject6).a((String)localObject5);
          }
          else
          {
            w.e();
            localObject11 = tt.c(a);
            localObject5 = w.i();
            localObject1 = ((tj)localObject5).q();
            int i6;
            if (localObject1 != null)
            {
              i6 = a.b.create_calendar_title;
              localObject5 = ((Resources)localObject1).getString(i6);
              ((AlertDialog.Builder)localObject11).setTitle((CharSequence)localObject5);
              if (localObject1 == null) {
                break label2652;
              }
              i6 = a.b.create_calendar_message;
              localObject5 = ((Resources)localObject1).getString(i6);
              ((AlertDialog.Builder)localObject11).setMessage((CharSequence)localObject5);
              if (localObject1 == null) {
                break label2660;
              }
              i6 = a.b.accept;
              localObject5 = ((Resources)localObject1).getString(i6);
              localObject12 = new com/google/android/gms/b/os$1;
              ((os.1)localObject12).<init>((os)localObject6);
              ((AlertDialog.Builder)localObject11).setPositiveButton((CharSequence)localObject5, (DialogInterface.OnClickListener)localObject12);
              if (localObject1 == null) {
                break label2668;
              }
              i6 = a.b.decline;
            }
            for (localObject5 = ((Resources)localObject1).getString(i6);; localObject5 = "Decline")
            {
              localObject1 = new com/google/android/gms/b/os$2;
              ((os.2)localObject1).<init>((os)localObject6);
              ((AlertDialog.Builder)localObject11).setNegativeButton((CharSequence)localObject5, (DialogInterface.OnClickListener)localObject1);
              localObject5 = ((AlertDialog.Builder)localObject11).create();
              ((AlertDialog)localObject5).show();
              break;
              localObject5 = "Create calendar event";
              break label2512;
              localObject5 = "Allow Ad to create a calendar event?";
              break label2539;
              localObject5 = "Accept";
              break label2566;
            }
          }
        }
        break;
      case 3: 
        localObject11 = new com/google/android/gms/b/ov;
        ((ov)localObject11).<init>(paramvc, paramMap);
        localObject5 = b;
        if (localObject5 == null)
        {
          localObject5 = "Activity context is not available";
          ((ov)localObject11).a((String)localObject5);
        }
        else
        {
          w.e();
          localObject5 = tt.d(b);
          boolean bool8 = ((jv)localObject5).a();
          if (!bool8)
          {
            localObject5 = "Feature is not supported by the device.";
            ((ov)localObject11).a((String)localObject5);
          }
          else
          {
            localObject5 = a;
            localObject6 = "iurl";
            localObject5 = (String)((Map)localObject5).get(localObject6);
            boolean bool15 = TextUtils.isEmpty((CharSequence)localObject5);
            if (bool15)
            {
              localObject5 = "Image url cannot be empty.";
              ((ov)localObject11).a((String)localObject5);
            }
            else
            {
              bool15 = URLUtil.isValidUrl((String)localObject5);
              if (!bool15)
              {
                localObject6 = "Invalid image url: ";
                localObject5 = String.valueOf(localObject5);
                j = ((String)localObject5).length();
                if (j != 0) {
                  localObject5 = ((String)localObject6).concat((String)localObject5);
                }
                for (;;)
                {
                  ((ov)localObject11).a((String)localObject5);
                  break;
                  localObject5 = new java/lang/String;
                  ((String)localObject5).<init>((String)localObject6);
                }
              }
              localObject6 = Uri.parse((String)localObject5);
              localObject1 = ((Uri)localObject6).getLastPathSegment();
              w.e();
              bool15 = tt.c((String)localObject1);
              if (!bool15)
              {
                localObject6 = "Image type not recognized: ";
                localObject5 = String.valueOf(localObject1);
                j = ((String)localObject5).length();
                if (j != 0) {
                  localObject5 = ((String)localObject6).concat((String)localObject5);
                }
                for (;;)
                {
                  ((ov)localObject11).a((String)localObject5);
                  break;
                  localObject5 = new java/lang/String;
                  ((String)localObject5).<init>((String)localObject6);
                }
              }
              localObject12 = w.i().q();
              w.e();
              localObject6 = b;
              localObject7 = tt.c((Context)localObject6);
              int i7;
              if (localObject12 != null)
              {
                int i15 = a.b.store_picture_title;
                localObject6 = ((Resources)localObject12).getString(i15);
                ((AlertDialog.Builder)localObject7).setTitle((CharSequence)localObject6);
                if (localObject12 == null) {
                  break label3156;
                }
                i15 = a.b.store_picture_message;
                localObject6 = ((Resources)localObject12).getString(i15);
                ((AlertDialog.Builder)localObject7).setMessage((CharSequence)localObject6);
                if (localObject12 == null) {
                  break label3164;
                }
                i15 = a.b.accept;
                localObject6 = ((Resources)localObject12).getString(i15);
                ??? = new com/google/android/gms/b/ov$1;
                ((ov.1)???).<init>((ov)localObject11, (String)localObject5, (String)localObject1);
                ((AlertDialog.Builder)localObject7).setPositiveButton((CharSequence)localObject6, (DialogInterface.OnClickListener)???);
                if (localObject12 == null) {
                  break label3172;
                }
                i7 = a.b.decline;
              }
              for (localObject5 = ((Resources)localObject12).getString(i7);; localObject5 = "Decline")
              {
                localObject6 = new com/google/android/gms/b/ov$2;
                ((ov.2)localObject6).<init>((ov)localObject11);
                ((AlertDialog.Builder)localObject7).setNegativeButton((CharSequence)localObject5, (DialogInterface.OnClickListener)localObject6);
                localObject5 = ((AlertDialog.Builder)localObject7).create();
                ((AlertDialog)localObject5).show();
                break;
                localObject6 = "Save image";
                break label3012;
                localObject6 = "Allow Ad to store image in Picture gallery?";
                break label3039;
                localObject6 = "Accept";
                break label3066;
              }
            }
          }
        }
        break;
      case 5: 
        localObject6 = new com/google/android/gms/b/ou;
        ((ou)localObject6).<init>(paramvc, paramMap);
        localObject5 = a;
        if (localObject5 == null)
        {
          localObject5 = "AdWebView is null";
          tp.e((String)localObject5);
        }
        else
        {
          localObject5 = "portrait";
          localObject1 = c;
          boolean bool9 = ((String)localObject5).equalsIgnoreCase((String)localObject1);
          int i8;
          if (bool9)
          {
            localObject5 = w.g();
            i8 = ((tu)localObject5).b();
          }
          for (;;)
          {
            localObject6 = a;
            ((vc)localObject6).b(i8);
            break;
            localObject5 = "landscape";
            localObject1 = c;
            boolean bool10 = ((String)localObject5).equalsIgnoreCase((String)localObject1);
            if (bool10)
            {
              localObject5 = w.g();
              int i9 = ((tu)localObject5).a();
            }
            else
            {
              boolean bool11 = b;
              if (bool11)
              {
                bool11 = i;
              }
              else
              {
                localObject5 = w.g();
                int i10 = ((tu)localObject5).c();
              }
            }
          }
        }
        break;
      case 6: 
        label2512:
        label2539:
        label2566:
        label2652:
        label2660:
        label2668:
        label3012:
        label3039:
        label3066:
        label3156:
        label3164:
        label3172:
        localObject5 = c;
        ((ot)localObject5).a(k);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */