package com.google.android.gms.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
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

@qi
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
    e = getResourcesgetDisplayMetricsdensity;
  }
  
  public tw(Context paramContext, String paramString)
  {
    this(paramContext);
    b = paramString;
  }
  
  private static int a(List<String> paramList, String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return -1;
    }
    paramList.add(paramString);
    return paramList.size() - 1;
  }
  
  private void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt == 0)
    {
      i = 0;
      f = paramFloat1;
      g = paramFloat2;
      h = paramFloat2;
    }
    label24:
    label224:
    do
    {
      do
      {
        break label24;
        do
        {
          return;
        } while (i == -1);
        if (paramInt != 2) {
          break;
        }
        if (paramFloat2 > g) {
          g = paramFloat2;
        }
        while (g - h > 30.0F * e)
        {
          i = -1;
          return;
          if (paramFloat2 < h) {
            h = paramFloat2;
          }
        }
        if ((i == 0) || (i == 2)) {
          if (paramFloat1 - f >= 50.0F * e) {
            f = paramFloat1;
          }
        }
        for (i += 1;; i += 1)
        {
          do
          {
            if ((i != 1) && (i != 3)) {
              break label224;
            }
            if (paramFloat1 <= f) {
              break;
            }
            f = paramFloat1;
            return;
          } while (((i != 1) && (i != 3)) || (paramFloat1 - f > -50.0F * e));
          f = paramFloat1;
        }
      } while ((i != 2) || (paramFloat1 >= f));
      f = paramFloat1;
      return;
    } while ((paramInt != 1) || (i != 4));
    a();
  }
  
  public final void a()
  {
    Object localObject1 = ke.dg;
    if (!((Boolean)w.q().a((jz)localObject1)).booleanValue())
    {
      localObject1 = ke.df;
      if (!((Boolean)w.q().a((jz)localObject1)).booleanValue()) {}
    }
    else
    {
      if (!(a instanceof Activity))
      {
        tp.d("Can not create dialog without Activity Context");
        return;
      }
      Object localObject3 = w.i().q();
      Object localObject2;
      label98:
      String str;
      if (localObject3 != null)
      {
        localObject1 = ((Resources)localObject3).getString(a.b.debug_menu_title);
        if (localObject3 == null) {
          break label258;
        }
        localObject2 = ((Resources)localObject3).getString(a.b.debug_menu_ad_information);
        if (localObject3 == null) {
          break label265;
        }
        str = ((Resources)localObject3).getString(a.b.debug_menu_creative_preview);
        label113:
        if (localObject3 == null) {
          break label272;
        }
      }
      label258:
      label265:
      label272:
      for (localObject3 = ((Resources)localObject3).getString(a.b.debug_menu_troubleshooting);; localObject3 = "Troubleshooting")
      {
        ArrayList localArrayList = new ArrayList();
        final int j = a(localArrayList, (String)localObject2, true);
        localObject2 = ke.df;
        final int k = a(localArrayList, str, ((Boolean)w.q().a((jz)localObject2)).booleanValue());
        localObject2 = ke.dg;
        final int m = a(localArrayList, (String)localObject3, ((Boolean)w.q().a((jz)localObject2)).booleanValue());
        new AlertDialog.Builder(a).setTitle((CharSequence)localObject1).setItems((CharSequence[])localArrayList.toArray(new String[0]), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            if (paramAnonymousInt == j) {
              b();
            }
            do
            {
              do
              {
                return;
                if (paramAnonymousInt == k)
                {
                  paramAnonymousDialogInterface = ke.df;
                  if (((Boolean)w.q().a(paramAnonymousDialogInterface)).booleanValue())
                  {
                    paramAnonymousDialogInterface = tw.this;
                    tp.b("Debug mode [Creative Preview] selected.");
                    ts.a(new tw.4(paramAnonymousDialogInterface));
                    return;
                  }
                }
              } while (paramAnonymousInt != m);
              paramAnonymousDialogInterface = ke.dg;
            } while (!((Boolean)w.q().a(paramAnonymousDialogInterface)).booleanValue());
            paramAnonymousDialogInterface = tw.this;
            tp.b("Debug mode [Troubleshooting] selected.");
            ts.a(new tw.5(paramAnonymousDialogInterface));
          }
        }).create().show();
        return;
        localObject1 = "Select a Debug Mode";
        break;
        localObject2 = "Ad Information";
        break label98;
        str = "Creative Preview";
        break label113;
      }
    }
    b();
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    int k = paramMotionEvent.getHistorySize();
    int j = 0;
    while (j < k)
    {
      a(paramMotionEvent.getActionMasked(), paramMotionEvent.getHistoricalX(0, j), paramMotionEvent.getHistoricalY(0, j));
      j += 1;
    }
    a(paramMotionEvent.getActionMasked(), paramMotionEvent.getX(), paramMotionEvent.getY());
  }
  
  final void b()
  {
    if (!(a instanceof Activity))
    {
      tp.d("Can not create dialog without Activity Context");
      return;
    }
    final Object localObject1 = b;
    Object localObject2;
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject1 = ((String)localObject1).replaceAll("\\+", "%20");
      localObject2 = new Uri.Builder().encodedQuery((String)localObject1).build();
      localObject1 = new StringBuilder();
      w.e();
      localObject2 = tt.a((Uri)localObject2);
      Iterator localIterator = ((Map)localObject2).keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ((StringBuilder)localObject1).append(str).append(" = ").append((String)((Map)localObject2).get(str)).append("\n\n");
      }
      localObject1 = ((StringBuilder)localObject1).toString().trim();
      if (TextUtils.isEmpty((CharSequence)localObject1)) {}
    }
    for (;;)
    {
      localObject2 = new AlertDialog.Builder(a);
      ((AlertDialog.Builder)localObject2).setMessage((CharSequence)localObject1);
      ((AlertDialog.Builder)localObject2).setTitle("Ad Information");
      ((AlertDialog.Builder)localObject2).setPositiveButton("Share", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          w.e();
          tt.a(a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", localObject1), "Share via"));
        }
      });
      ((AlertDialog.Builder)localObject2).setNegativeButton("Close", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      });
      ((AlertDialog.Builder)localObject2).create().show();
      return;
      localObject1 = "No debug information";
    }
  }
}


/* Location:              com/google/android/gms/b/tw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */