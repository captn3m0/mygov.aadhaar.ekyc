package com.google.android.gms.b;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class ot
  extends oy
{
  static final Set a;
  String b = "top-right";
  boolean c = true;
  int d = 0;
  int e = 0;
  int f;
  int g;
  int h;
  int i;
  final Object j;
  final vc k;
  final Activity l;
  il m;
  ImageView n;
  LinearLayout o;
  oz p;
  PopupWindow q;
  RelativeLayout r;
  ViewGroup s;
  
  static
  {
    Object localObject = new String[7];
    localObject[0] = "top-left";
    localObject[1] = "top-right";
    localObject[2] = "top-center";
    localObject[3] = "center";
    localObject[4] = "bottom-left";
    localObject[5] = "bottom-right";
    localObject[6] = "bottom-center";
    a locala = new com/google/android/gms/common/util/a;
    localObject = Arrays.asList((Object[])localObject);
    locala.<init>((Collection)localObject);
    a = Collections.unmodifiableSet(locala);
  }
  
  public ot(vc paramvc, oz paramoz)
  {
    super(paramvc, "resize");
    f = i1;
    g = 0;
    h = 0;
    i = i1;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    j = localObject;
    k = paramvc;
    localObject = paramvc.f();
    l = ((Activity)localObject);
    p = paramoz;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    w.e();
    Object localObject1 = tt.c(l);
    Object localObject2 = null;
    int i1 = localObject1[0];
    i1 = paramInt2 - i1;
    int i2 = i;
    int i3 = f;
    try
    {
      Object localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>();
      String str1 = "x";
      localObject3 = ((JSONObject)localObject3).put(str1, paramInt1);
      str1 = "y";
      localObject1 = ((JSONObject)localObject3).put(str1, i1);
      localObject3 = "width";
      localObject1 = ((JSONObject)localObject1).put((String)localObject3, i2);
      localObject2 = "height";
      localObject1 = ((JSONObject)localObject1).put((String)localObject2, i3);
      localObject2 = t;
      String str2 = "onSizeChanged";
      ((vc)localObject2).b(str2, (JSONObject)localObject1);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localObject2 = "Error occured while dispatching size change.";
        tp.b((String)localObject2, localJSONException);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (j)
    {
      Object localObject2 = q;
      if (localObject2 != null)
      {
        localObject2 = q;
        ((PopupWindow)localObject2).dismiss();
        localObject2 = r;
        Object localObject4 = k;
        localObject4 = ((vc)localObject4).b();
        ((RelativeLayout)localObject2).removeView((View)localObject4);
        localObject2 = s;
        if (localObject2 != null)
        {
          localObject2 = s;
          localObject4 = n;
          ((ViewGroup)localObject2).removeView((View)localObject4);
          localObject2 = s;
          localObject4 = k;
          localObject4 = ((vc)localObject4).b();
          ((ViewGroup)localObject2).addView((View)localObject4);
          localObject2 = k;
          localObject4 = m;
          ((vc)localObject2).a((il)localObject4);
        }
        if (paramBoolean)
        {
          localObject2 = "default";
          b((String)localObject2);
          localObject2 = p;
          if (localObject2 != null)
          {
            localObject2 = p;
            ((oz)localObject2).M();
          }
        }
        localObject2 = null;
        q = null;
        localObject2 = null;
        r = null;
        localObject2 = null;
        s = null;
        localObject2 = null;
        o = null;
      }
      return;
    }
  }
  
  final int[] a()
  {
    int i1 = 50;
    int i2 = 2;
    int i3 = 1;
    int i4 = 0;
    w.e();
    Object localObject1 = tt.b(l);
    w.e();
    Object localObject2 = l;
    int[] arrayOfInt1 = tt.c((Activity)localObject2);
    int i5 = localObject1[0];
    int i6 = localObject1[i3];
    int i9 = i;
    if (i9 >= i1)
    {
      i9 = i;
      if (i9 <= i5) {}
    }
    else
    {
      tp.e("Width is too small or too large.");
      i6 = 0;
      localObject1 = null;
      if (i6 != 0) {
        break label936;
      }
      i6 = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (int[])localObject1;
      i9 = f;
      if (i9 >= i1)
      {
        i9 = f;
        if (i9 <= i6) {}
      }
      else
      {
        tp.e("Height is too small or too large.");
        i6 = 0;
        localObject1 = null;
        break;
      }
      i9 = f;
      if (i9 == i6)
      {
        i6 = i;
        if (i6 == i5)
        {
          tp.e("Cannot resize to a full-screen ad.");
          i6 = 0;
          localObject1 = null;
          break;
        }
      }
      boolean bool1 = c;
      if (bool1)
      {
        localObject2 = b;
        i7 = -1;
        i1 = ((String)localObject2).hashCode();
        switch (i1)
        {
        default: 
          switch (i7)
          {
          default: 
            label268:
            i7 = d;
            i9 = g;
            i7 += i9;
            i9 = i;
            i7 = i7 + i9 + -50;
            i9 = e;
            i1 = h;
            i9 += i1;
          }
          break;
        }
        for (;;)
        {
          if (i7 >= 0)
          {
            i7 += 50;
            if (i7 <= i5)
            {
              i7 = arrayOfInt1[0];
              if (i9 >= i7)
              {
                i7 = i9 + 50;
                i9 = arrayOfInt1[i3];
                if (i7 <= i9) {
                  break label930;
                }
              }
            }
          }
          i7 = 0;
          localObject1 = null;
          break;
          String str = "top-left";
          boolean bool3 = ((String)localObject2).equals(str);
          if (!bool3) {
            break label268;
          }
          i7 = 0;
          localObject1 = null;
          break label268;
          str = "top-center";
          bool3 = ((String)localObject2).equals(str);
          if (!bool3) {
            break label268;
          }
          i7 = i3;
          break label268;
          str = "center";
          bool3 = ((String)localObject2).equals(str);
          if (!bool3) {
            break label268;
          }
          i7 = i2;
          break label268;
          str = "bottom-left";
          bool3 = ((String)localObject2).equals(str);
          if (!bool3) {
            break label268;
          }
          i7 = 3;
          break label268;
          str = "bottom-center";
          bool3 = ((String)localObject2).equals(str);
          if (!bool3) {
            break label268;
          }
          i7 = 4;
          break label268;
          str = "bottom-right";
          bool3 = ((String)localObject2).equals(str);
          if (!bool3) {
            break label268;
          }
          i7 = 5;
          break label268;
          i7 = d;
          i10 = g;
          i7 += i10;
          i10 = e;
          i1 = h;
          i10 += i1;
          continue;
          i7 = d;
          i10 = g;
          i7 += i10;
          i10 = i / 2;
          i7 = i7 + i10 + -25;
          i10 = e;
          i1 = h;
          i10 += i1;
          continue;
          i7 = d;
          i10 = g;
          i7 += i10;
          i10 = i / 2;
          i7 = i7 + i10 + -25;
          i10 = e;
          i1 = h;
          i10 += i1;
          i1 = f / 2;
          i10 = i10 + i1 + -25;
          continue;
          i7 = d;
          i10 = g;
          i7 += i10;
          i10 = e;
          i1 = h;
          i10 += i1;
          i1 = f;
          i10 = i10 + i1 + -50;
          continue;
          i7 = d;
          i10 = g;
          i7 += i10;
          i10 = i / 2;
          i7 = i7 + i10 + -25;
          i10 = e;
          i1 = h;
          i10 += i1;
          i1 = f;
          i10 = i10 + i1 + -50;
          continue;
          i7 = d;
          i10 = g;
          i7 += i10;
          i10 = i;
          i7 = i7 + i10 + -50;
          i10 = e;
          i1 = h;
          i10 += i1;
          i1 = f;
          i10 = i10 + i1 + -50;
        }
      }
      label930:
      int i7 = i3;
      break;
      label936:
      boolean bool2 = c;
      if (!bool2) {
        break label1003;
      }
      localObject1 = new int[i2];
      i10 = d;
      i2 = g;
      i10 += i2;
      localObject1[0] = i10;
      i4 = e;
      i10 = h;
      i4 += i10;
      localObject1[i3] = i4;
    }
    label1003:
    w.e();
    localObject1 = tt.b(l);
    w.e();
    localObject2 = l;
    arrayOfInt1 = tt.c((Activity)localObject2);
    i5 = localObject1[0];
    int i8 = d;
    int i10 = g;
    i8 += i10;
    i10 = e;
    i1 = h;
    i10 += i1;
    if (i8 < 0)
    {
      i8 = 0;
      localObject1 = null;
      label1086:
      i5 = arrayOfInt1[0];
      if (i10 >= i5) {
        break label1159;
      }
      i10 = arrayOfInt1[0];
    }
    for (;;)
    {
      int[] arrayOfInt2 = new int[i2];
      arrayOfInt2[0] = i8;
      arrayOfInt2[i3] = i10;
      localObject1 = arrayOfInt2;
      break;
      i1 = i + i8;
      if (i1 <= i5) {
        break label1086;
      }
      i8 = i;
      i8 = i5 - i8;
      break label1086;
      label1159:
      i5 = f + i10;
      i1 = arrayOfInt1[i3];
      if (i5 > i1)
      {
        i10 = arrayOfInt1[i3];
        int i11 = f;
        i10 -= i11;
      }
    }
  }
  
  public final boolean b()
  {
    synchronized (j)
    {
      PopupWindow localPopupWindow = q;
      if (localPopupWindow != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
      localPopupWindow = null;
    }
  }
}


/* Location:              com/google/android/gms/b/ot.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */