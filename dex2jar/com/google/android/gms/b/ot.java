package com.google.android.gms.b;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class ot
  extends oy
{
  static final Set<String> a = Collections.unmodifiableSet(new a(Arrays.asList(new String[] { "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center" })));
  String b = "top-right";
  boolean c = true;
  int d = 0;
  int e = 0;
  int f = -1;
  int g = 0;
  int h = 0;
  int i = -1;
  final Object j = new Object();
  final vc k;
  final Activity l;
  il m;
  ImageView n;
  LinearLayout o;
  oz p;
  PopupWindow q;
  RelativeLayout r;
  ViewGroup s;
  
  public ot(vc paramvc, oz paramoz)
  {
    super(paramvc, "resize");
    k = paramvc;
    l = paramvc.f();
    p = paramoz;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    w.e();
    int i1 = tt.c(l)[0];
    int i2 = i;
    int i3 = f;
    try
    {
      JSONObject localJSONObject = new JSONObject().put("x", paramInt1).put("y", paramInt2 - i1).put("width", i2).put("height", i3);
      t.b("onSizeChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      tp.b("Error occured while dispatching size change.", localJSONException);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (j)
    {
      if (q != null)
      {
        q.dismiss();
        r.removeView(k.b());
        if (s != null)
        {
          s.removeView(n);
          s.addView(k.b());
          k.a(m);
        }
        if (paramBoolean)
        {
          b("default");
          if (p != null) {
            p.M();
          }
        }
        q = null;
        r = null;
        s = null;
        o = null;
      }
      return;
    }
  }
  
  final int[] a()
  {
    w.e();
    Object localObject = tt.b(l);
    w.e();
    int[] arrayOfInt = tt.c(l);
    int i3 = localObject[0];
    int i1 = localObject[1];
    if ((i < 50) || (i > i3))
    {
      tp.e("Width is too small or too large.");
      i1 = 0;
    }
    while (i1 == 0)
    {
      return null;
      if ((f < 50) || (f > i1))
      {
        tp.e("Height is too small or too large.");
        i1 = 0;
      }
      else if ((f == i1) && (i == i3))
      {
        tp.e("Cannot resize to a full-screen ad.");
        i1 = 0;
      }
      else
      {
        if (c)
        {
          localObject = b;
          i1 = -1;
          switch (((String)localObject).hashCode())
          {
          default: 
            switch (i1)
            {
            default: 
              label196:
              i1 = d + g + i - 50;
              i2 = e + h;
            }
            break;
          }
          for (;;)
          {
            if ((i1 >= 0) && (i1 + 50 <= i3) && (i2 >= arrayOfInt[0]) && (i2 + 50 <= arrayOfInt[1])) {
              break label600;
            }
            i1 = 0;
            break;
            if (!((String)localObject).equals("top-left")) {
              break label196;
            }
            i1 = 0;
            break label196;
            if (!((String)localObject).equals("top-center")) {
              break label196;
            }
            i1 = 1;
            break label196;
            if (!((String)localObject).equals("center")) {
              break label196;
            }
            i1 = 2;
            break label196;
            if (!((String)localObject).equals("bottom-left")) {
              break label196;
            }
            i1 = 3;
            break label196;
            if (!((String)localObject).equals("bottom-center")) {
              break label196;
            }
            i1 = 4;
            break label196;
            if (!((String)localObject).equals("bottom-right")) {
              break label196;
            }
            i1 = 5;
            break label196;
            i1 = d + g;
            i2 = e + h;
            continue;
            i1 = d + g + i / 2 - 25;
            i2 = e + h;
            continue;
            i1 = d + g + i / 2 - 25;
            i2 = e + h + f / 2 - 25;
            continue;
            i1 = d + g;
            i2 = e + h + f - 50;
            continue;
            i1 = d + g + i / 2 - 25;
            i2 = e + h + f - 50;
            continue;
            i1 = d + g + i - 50;
            i2 = e + h + f - 50;
          }
        }
        label600:
        i1 = 1;
      }
    }
    if (c) {
      return new int[] { d + g, e + h };
    }
    w.e();
    arrayOfInt = tt.b(l);
    w.e();
    localObject = tt.c(l);
    int i4 = arrayOfInt[0];
    int i2 = d + g;
    i3 = e + h;
    if (i2 < 0)
    {
      i1 = 0;
      if (i3 >= localObject[0]) {
        break label747;
      }
      i2 = localObject[0];
    }
    for (;;)
    {
      return new int[] { i1, i2 };
      i1 = i2;
      if (i + i2 <= i4) {
        break;
      }
      i1 = i4 - i;
      break;
      label747:
      i2 = i3;
      if (f + i3 > localObject[1]) {
        i2 = localObject[1] - f;
      }
    }
  }
  
  public final boolean b()
  {
    for (;;)
    {
      synchronized (j)
      {
        if (q != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:              com/google/android/gms/b/ot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */