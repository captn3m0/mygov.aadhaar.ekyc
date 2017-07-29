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

@qi
public final class ox
  extends oy
  implements md
{
  DisplayMetrics a;
  int b = -1;
  int c = -1;
  int d = -1;
  int e = -1;
  int f = -1;
  int g = -1;
  private final vc h;
  private final Context i;
  private final WindowManager j;
  private final jv k;
  private float l;
  private int m;
  
  public ox(vc paramvc, Context paramContext, jv paramjv)
  {
    super(paramvc);
    h = paramvc;
    i = paramContext;
    k = paramjv;
    j = ((WindowManager)paramContext.getSystemService("window"));
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if ((i instanceof Activity)) {
      w.e();
    }
    for (int n = tt.c((Activity)i)[0];; n = 0)
    {
      if ((h.k() == null) || (!h.k().d))
      {
        ip.a();
        f = uk.b(i, h.getMeasuredWidth());
        ip.a();
        g = uk.b(i, h.getMeasuredHeight());
      }
      int i1 = f;
      int i2 = g;
      try
      {
        Object localObject = new JSONObject().put("x", paramInt1).put("y", paramInt2 - n).put("width", i1).put("height", i2);
        t.b("onDefaultPositionReceived", (JSONObject)localObject);
        localObject = h.l();
        if (j != null)
        {
          localObject = j;
          d = paramInt1;
          e = paramInt2;
        }
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          tp.b("Error occured while dispatching default position.", localJSONException);
        }
      }
    }
  }
  
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    a = new DisplayMetrics();
    paramvc = j.getDefaultDisplay();
    paramvc.getMetrics(a);
    l = a.density;
    m = paramvc.getRotation();
    ip.a();
    b = uk.b(a, a.widthPixels);
    ip.a();
    c = uk.b(a, a.heightPixels);
    paramvc = h.f();
    if ((paramvc == null) || (paramvc.getWindow() == null))
    {
      d = b;
      e = c;
      if (!h.k().d) {
        break label473;
      }
      f = b;
      g = c;
    }
    for (;;)
    {
      a(b, c, d, e, l, m);
      paramvc = new ow.a();
      paramMap = k;
      Intent localIntent = new Intent("android.intent.action.DIAL");
      localIntent.setData(Uri.parse("tel:"));
      b = paramMap.a(localIntent);
      paramMap = k;
      localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(Uri.parse("sms:"));
      a = paramMap.a(localIntent);
      c = k.b();
      d = k.a();
      e = true;
      paramvc = new ow(paramvc, (byte)0);
      h.b("onDeviceFeaturesReceived", paramvc.a());
      paramvc = new int[2];
      h.getLocationOnScreen(paramvc);
      ip.a();
      int n = uk.b(i, paramvc[0]);
      ip.a();
      a(n, uk.b(i, paramvc[1]));
      if (tp.a(2)) {
        tp.d("Dispatching Ready Event.");
      }
      paramvc = h.o().a;
      try
      {
        paramvc = new JSONObject().put("js", paramvc);
        t.b("onReadyEventReceived", paramvc);
        return;
      }
      catch (JSONException paramvc)
      {
        label473:
        tp.b("Error occured while dispatching ready Event.", paramvc);
      }
      w.e();
      paramvc = tt.a(paramvc);
      ip.a();
      d = uk.b(a, paramvc[0]);
      ip.a();
      e = uk.b(a, paramvc[1]);
      break;
      h.measure(0, 0);
    }
  }
}


/* Location:              com/google/android/gms/b/ox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */