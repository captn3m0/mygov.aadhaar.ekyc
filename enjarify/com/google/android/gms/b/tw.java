package com.google.android.gms.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class tw
{
  final Context a;
  public String b;
  public String c;
  public String d;
  private final float e;
  private float f;
  private float g;
  private float h;
  private int i = 0;
  
  public tw(Context paramContext)
  {
    a = paramContext;
    float f1 = getResourcesgetDisplayMetricsdensity;
    e = f1;
  }
  
  public tw(Context paramContext, String paramString)
  {
    this(paramContext);
    b = paramString;
  }
  
  private static int a(List paramList, String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {}
    for (int j = -1;; j = paramList.size() + -1)
    {
      return j;
      paramList.add(paramString);
    }
  }
  
  private void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    int j = 3;
    int k = -1;
    int m = 2;
    int n = 1;
    int i1;
    float f1;
    if (paramInt == 0)
    {
      i1 = 0;
      f1 = 0.0F;
      i = 0;
      f = paramFloat1;
      g = paramFloat2;
      h = paramFloat2;
    }
    for (;;)
    {
      return;
      i1 = i;
      if (i1 != k)
      {
        float f2;
        int i7;
        if (paramInt == m)
        {
          f1 = g;
          boolean bool1 = paramFloat2 < f1;
          if (bool1) {
            g = paramFloat2;
          }
          float f3;
          for (;;)
          {
            f1 = g;
            f2 = h;
            f1 -= f2;
            i7 = 1106247680;
            f3 = e;
            f2 = 30.0F * f3;
            bool1 = f1 < f2;
            if (!bool1) {
              break label166;
            }
            i = k;
            break;
            f1 = h;
            bool1 = paramFloat2 < f1;
            if (bool1) {
              h = paramFloat2;
            }
          }
          label166:
          int i2 = i;
          int i3;
          if (i2 != 0)
          {
            i2 = i;
            if (i2 != m) {}
          }
          else
          {
            f1 = f;
            f1 = paramFloat1 - f1;
            i7 = 1112014848;
            f3 = e;
            f2 = 50.0F * f3;
            boolean bool2 = f1 < f2;
            if (!bool2)
            {
              f = paramFloat1;
              i3 = i + 1;
              i = i3;
            }
          }
          for (;;)
          {
            i3 = i;
            if (i3 != n)
            {
              i3 = i;
              if (i3 != j) {
                break label390;
              }
            }
            f1 = f;
            boolean bool3 = paramFloat1 < f1;
            if (!bool3) {
              break;
            }
            f = paramFloat1;
            break;
            int i4 = i;
            if (i4 != n)
            {
              i4 = i;
              if (i4 != j) {}
            }
            else
            {
              f1 = f;
              f1 = paramFloat1 - f1;
              i7 = -1035468800;
              f3 = e;
              f2 = -50.0F * f3;
              boolean bool4 = f1 < f2;
              if (!bool4)
              {
                f = paramFloat1;
                i5 = i + 1;
                i = i5;
              }
            }
          }
          label390:
          int i5 = i;
          if (i5 == m)
          {
            f1 = f;
            boolean bool5 = paramFloat1 < f1;
            if (bool5) {
              f = paramFloat1;
            }
          }
        }
        else if (paramInt == n)
        {
          int i6 = i;
          i7 = 4;
          f2 = 5.6E-45F;
          if (i6 == i7) {
            a();
          }
        }
      }
    }
  }
  
  public final void a()
  {
    Object localObject1 = ke.dg;
    Object localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (!bool1)
    {
      localObject1 = ke.df;
      localObject2 = w.q();
      localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
      bool1 = ((Boolean)localObject1).booleanValue();
      if (!bool1) {}
    }
    else
    {
      localObject1 = a;
      bool1 = localObject1 instanceof Activity;
      if (!bool1)
      {
        localObject1 = "Can not create dialog without Activity Context";
        tp.d((String)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject1 = w.i();
      localObject2 = ((tj)localObject1).q();
      Object localObject3;
      label100:
      Object localObject4;
      label117:
      Object localObject5;
      if (localObject2 != null)
      {
        int j = a.b.debug_menu_title;
        localObject1 = ((Resources)localObject2).getString(j);
        localObject3 = localObject1;
        if (localObject2 == null) {
          break label313;
        }
        j = a.b.debug_menu_ad_information;
        localObject1 = ((Resources)localObject2).getString(j);
        localObject4 = localObject1;
        if (localObject2 == null) {
          break label322;
        }
        j = a.b.debug_menu_creative_preview;
        localObject1 = ((Resources)localObject2).getString(j);
        localObject5 = localObject1;
        label134:
        if (localObject2 == null) {
          break label331;
        }
        j = a.b.debug_menu_troubleshooting;
        localObject1 = ((Resources)localObject2).getString(j);
      }
      for (localObject2 = localObject1;; localObject2 = localObject1)
      {
        Object localObject6 = new java/util/ArrayList;
        ((ArrayList)localObject6).<init>();
        int k = a((List)localObject6, (String)localObject4, true);
        localObject1 = ke.df;
        boolean bool2 = ((Boolean)w.q().a((jz)localObject1)).booleanValue();
        int m = a((List)localObject6, (String)localObject5, bool2);
        localObject1 = ke.dg;
        bool2 = ((Boolean)w.q().a((jz)localObject1)).booleanValue();
        int n = a((List)localObject6, (String)localObject2, bool2);
        localObject1 = new android/app/AlertDialog$Builder;
        Context localContext = a;
        ((AlertDialog.Builder)localObject1).<init>(localContext);
        localObject3 = ((AlertDialog.Builder)localObject1).setTitle((CharSequence)localObject3);
        bool2 = false;
        localObject1 = new String[0];
        localObject1 = (CharSequence[])((List)localObject6).toArray((Object[])localObject1);
        localObject6 = new com/google/android/gms/b/tw$1;
        ((tw.1)localObject6).<init>(this, k, m, n);
        localObject1 = ((AlertDialog.Builder)localObject3).setItems((CharSequence[])localObject1, (DialogInterface.OnClickListener)localObject6).create();
        ((AlertDialog)localObject1).show();
        break;
        localObject1 = "Select a Debug Mode";
        localObject3 = localObject1;
        break label100;
        label313:
        localObject1 = "Ad Information";
        localObject4 = localObject1;
        break label117;
        label322:
        localObject1 = "Creative Preview";
        localObject5 = localObject1;
        break label134;
        label331:
        localObject1 = "Troubleshooting";
      }
      b();
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    int j = paramMotionEvent.getHistorySize();
    int k = 0;
    while (k < j)
    {
      int m = paramMotionEvent.getActionMasked();
      float f2 = paramMotionEvent.getHistoricalX(0, k);
      float f3 = paramMotionEvent.getHistoricalY(0, k);
      a(m, f2, f3);
      k += 1;
    }
    k = paramMotionEvent.getActionMasked();
    f1 = paramMotionEvent.getX();
    float f4 = paramMotionEvent.getY();
    a(k, f1, f4);
  }
  
  final void b()
  {
    Object localObject1 = a;
    boolean bool1 = localObject1 instanceof Activity;
    if (!bool1)
    {
      localObject1 = "Can not create dialog without Activity Context";
      tp.d((String)localObject1);
      return;
    }
    localObject1 = b;
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (!bool2)
    {
      localObject1 = ((String)localObject1).replaceAll("\\+", "%20");
      localObject2 = new android/net/Uri$Builder;
      ((Uri.Builder)localObject2).<init>();
      localObject1 = ((Uri.Builder)localObject2).encodedQuery((String)localObject1).build();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      w.e();
      localObject3 = tt.a((Uri)localObject1);
      localObject1 = ((Map)localObject3).keySet();
      localObject4 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)((Iterator)localObject4).next();
        Object localObject5 = ((StringBuilder)localObject2).append((String)localObject1);
        String str = " = ";
        localObject5 = ((StringBuilder)localObject5).append(str);
        localObject1 = (String)((Map)localObject3).get(localObject1);
        localObject1 = ((StringBuilder)localObject5).append((String)localObject1);
        localObject5 = "\n\n";
        ((StringBuilder)localObject1).append((String)localObject5);
      }
      localObject1 = ((StringBuilder)localObject2).toString().trim();
      bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool2) {}
    }
    for (;;)
    {
      localObject2 = new android/app/AlertDialog$Builder;
      localObject3 = a;
      ((AlertDialog.Builder)localObject2).<init>((Context)localObject3);
      ((AlertDialog.Builder)localObject2).setMessage((CharSequence)localObject1);
      ((AlertDialog.Builder)localObject2).setTitle("Ad Information");
      localObject4 = new com/google/android/gms/b/tw$2;
      ((tw.2)localObject4).<init>(this, (String)localObject1);
      ((AlertDialog.Builder)localObject2).setPositiveButton("Share", (DialogInterface.OnClickListener)localObject4);
      localObject3 = new com/google/android/gms/b/tw$3;
      ((tw.3)localObject3).<init>();
      ((AlertDialog.Builder)localObject2).setNegativeButton("Close", (DialogInterface.OnClickListener)localObject3);
      localObject1 = ((AlertDialog.Builder)localObject2).create();
      ((AlertDialog)localObject1).show();
      break;
      localObject1 = "No debug information";
    }
  }
}


/* Location:              com/google/android/gms/b/tw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */