package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.w;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ox
  extends oy
  implements md
{
  DisplayMetrics a;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  private final vc h;
  private final Context i;
  private final WindowManager j;
  private final jv k;
  private float l;
  private int m;
  
  public ox(vc paramvc, Context paramContext, jv paramjv)
  {
    super(paramvc);
    b = n;
    c = n;
    d = n;
    e = n;
    f = n;
    g = n;
    h = paramvc;
    i = paramContext;
    k = paramjv;
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    j = localWindowManager;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = i;
    boolean bool2 = localObject2 instanceof Activity;
    int i1;
    if (bool2)
    {
      w.e();
      localObject2 = tt.c((Activity)i);
      i1 = localObject2[0];
    }
    for (;;)
    {
      localObject1 = h.k();
      Object localObject4;
      if (localObject1 != null)
      {
        localObject1 = h.k();
        bool1 = d;
        if (bool1) {}
      }
      else
      {
        ip.a();
        localObject1 = i;
        i2 = h.getMeasuredWidth();
        n = uk.b((Context)localObject1, i2);
        f = n;
        ip.a();
        localObject1 = i;
        localObject4 = h;
        i2 = ((vc)localObject4).getMeasuredHeight();
        n = uk.b((Context)localObject1, i2);
        g = n;
      }
      i1 = paramInt2 - i1;
      int n = f;
      int i2 = g;
      try
      {
        Object localObject5 = new org/json/JSONObject;
        ((JSONObject)localObject5).<init>();
        String str = "x";
        localObject5 = ((JSONObject)localObject5).put(str, paramInt1);
        str = "y";
        localObject2 = ((JSONObject)localObject5).put(str, i1);
        localObject5 = "width";
        localObject2 = ((JSONObject)localObject2).put((String)localObject5, n);
        localObject1 = "height";
        localObject2 = ((JSONObject)localObject2).put((String)localObject1, i2);
        localObject1 = t;
        localObject4 = "onDefaultPositionReceived";
        ((vc)localObject1).b((String)localObject4, (JSONObject)localObject2);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          localObject1 = "Error occured while dispatching default position.";
          tp.b((String)localObject1, localJSONException);
        }
      }
      localObject2 = h.l();
      localObject1 = j;
      if (localObject1 != null)
      {
        localObject2 = j;
        d = paramInt1;
        e = paramInt2;
      }
      return;
      i1 = 0;
      Object localObject3 = null;
    }
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    int n = 2;
    boolean bool1 = true;
    Object localObject1 = new android/util/DisplayMetrics;
    ((DisplayMetrics)localObject1).<init>();
    a = ((DisplayMetrics)localObject1);
    localObject1 = j.getDefaultDisplay();
    localObject2 = a;
    ((Display)localObject1).getMetrics((DisplayMetrics)localObject2);
    float f1 = a.density;
    l = f1;
    int i1 = ((Display)localObject1).getRotation();
    m = i1;
    ip.a();
    localObject1 = a;
    int i4 = a.widthPixels;
    i1 = uk.b((DisplayMetrics)localObject1, i4);
    b = i1;
    ip.a();
    localObject1 = a;
    localObject2 = a;
    i4 = heightPixels;
    i1 = uk.b((DisplayMetrics)localObject1, i4);
    c = i1;
    localObject1 = h.f();
    int i2;
    if (localObject1 != null)
    {
      localObject2 = ((Activity)localObject1).getWindow();
      if (localObject2 != null) {}
    }
    else
    {
      i1 = b;
      d = i1;
      i1 = c;
      e = i1;
      localObject1 = h.k();
      boolean bool2 = d;
      if (!bool2) {
        break label719;
      }
      i2 = b;
      f = i2;
      i2 = c;
      g = i2;
    }
    for (;;)
    {
      i4 = b;
      int i6 = c;
      int i7 = d;
      int i8 = e;
      float f2 = l;
      int i9 = m;
      localObject1 = this;
      a(i4, i6, i7, i8, f2, i9);
      localObject1 = new com/google/android/gms/b/ow$a;
      ((ow.a)localObject1).<init>();
      localObject2 = k;
      Object localObject3 = new android/content/Intent;
      ((Intent)localObject3).<init>("android.intent.action.DIAL");
      Uri localUri = Uri.parse("tel:");
      ((Intent)localObject3).setData(localUri);
      boolean bool4 = ((jv)localObject2).a((Intent)localObject3);
      b = bool4;
      localObject2 = k;
      localObject3 = new android/content/Intent;
      ((Intent)localObject3).<init>("android.intent.action.VIEW");
      localUri = Uri.parse("sms:");
      ((Intent)localObject3).setData(localUri);
      bool4 = ((jv)localObject2).a((Intent)localObject3);
      a = bool4;
      bool4 = k.b();
      c = bool4;
      bool4 = k.a();
      d = bool4;
      e = bool1;
      localObject2 = new com/google/android/gms/b/ow;
      ((ow)localObject2).<init>((ow.a)localObject1, (byte)0);
      localObject1 = h;
      localObject2 = ((ow)localObject2).a();
      ((vc)localObject1).b("onDeviceFeaturesReceived", (JSONObject)localObject2);
      localObject1 = new int[n];
      h.getLocationOnScreen((int[])localObject1);
      ip.a();
      localObject2 = i;
      i6 = localObject1[0];
      int i5 = uk.b((Context)localObject2, i6);
      ip.a();
      localObject3 = i;
      i2 = localObject1[bool1];
      i2 = uk.b((Context)localObject3, i2);
      a(i5, i2);
      boolean bool3 = tp.a(n);
      if (bool3)
      {
        localObject1 = "Dispatching Ready Event.";
        tp.d((String)localObject1);
      }
      localObject1 = h.o().a;
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        localObject3 = "js";
        localObject1 = ((JSONObject)localObject2).put((String)localObject3, localObject1);
        localObject2 = t;
        localObject3 = "onReadyEventReceived";
        ((vc)localObject2).b((String)localObject3, (JSONObject)localObject1);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          int i3;
          localObject2 = "Error occured while dispatching ready Event.";
          tp.b((String)localObject2, localJSONException);
        }
      }
      w.e();
      localObject1 = tt.a((Activity)localObject1);
      ip.a();
      localObject2 = a;
      i6 = localObject1[0];
      i5 = uk.b((DisplayMetrics)localObject2, i6);
      d = i5;
      ip.a();
      localObject2 = a;
      i3 = localObject1[bool1];
      i3 = uk.b((DisplayMetrics)localObject2, i3);
      e = i3;
      break;
      label719:
      localObject1 = h;
      ((vc)localObject1).measure(0, 0);
    }
  }
}


/* Location:              com/google/android/gms/b/ox.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */