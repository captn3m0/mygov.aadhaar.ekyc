package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class ld
  implements lc
{
  final s a;
  final Context b;
  boolean c;
  private final Object d;
  private final JSONObject e;
  private final pz f;
  private final lc.a g;
  private final dw h;
  private final un i;
  private String j;
  private sz k;
  private WeakReference l;
  
  public ld(Context paramContext, s params, pz parampz, dw paramdw, JSONObject paramJSONObject, lc.a parama, un paramun, String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
    l = null;
    b = paramContext;
    a = params;
    f = parampz;
    h = paramdw;
    e = paramJSONObject;
    g = parama;
    i = paramun;
    j = paramString;
  }
  
  private int a(int paramInt)
  {
    ip.a();
    return uk.b(b, paramInt);
  }
  
  private JSONObject a(Rect paramRect)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    int m = left;
    m = a(m);
    localJSONObject.put("x", m);
    m = top;
    m = a(m);
    localJSONObject.put("y", m);
    m = right;
    int n = left;
    m -= n;
    m = a(m);
    localJSONObject.put("width", m);
    m = bottom;
    n = top;
    m -= n;
    m = a(m);
    localJSONObject.put("height", m);
    localJSONObject.put("relative_to", "self");
    return localJSONObject;
  }
  
  private JSONObject a(Map paramMap, View paramView)
  {
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>();
    Object localObject1;
    if ((paramMap == null) || (paramView == null)) {
      localObject1 = localJSONObject1;
    }
    for (;;)
    {
      return (JSONObject)localObject1;
      try
      {
        int[] arrayOfInt1 = b(paramView);
        localObject1 = paramMap.entrySet();
        Iterator localIterator = ((Set)localObject1).iterator();
        for (;;)
        {
          boolean bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (Map.Entry)localObject1;
          Object localObject3 = ((Map.Entry)localObject1).getValue();
          localObject3 = (WeakReference)localObject3;
          localObject3 = ((WeakReference)localObject3).get();
          localObject3 = (View)localObject3;
          if (localObject3 != null)
          {
            int[] arrayOfInt2 = b((View)localObject3);
            JSONObject localJSONObject2 = new org/json/JSONObject;
            localJSONObject2.<init>();
            String str = "width";
            int m = ((View)localObject3).getMeasuredWidth();
            m = a(m);
            localJSONObject2.put(str, m);
            str = "height";
            int n = ((View)localObject3).getMeasuredHeight();
            n = a(n);
            localJSONObject2.put(str, n);
            localObject3 = "x";
            int i1 = 0;
            str = null;
            i1 = arrayOfInt2[0];
            m = 0;
            m = arrayOfInt1[0];
            i1 -= m;
            i1 = a(i1);
            localJSONObject2.put((String)localObject3, i1);
            localObject3 = "y";
            i1 = 1;
            int i2 = arrayOfInt2[i1];
            i1 = 1;
            i1 = arrayOfInt1[i1];
            i2 -= i1;
            i2 = a(i2);
            localJSONObject2.put((String)localObject3, i2);
            localObject1 = ((Map.Entry)localObject1).getKey();
            localObject1 = (String)localObject1;
            localJSONObject1.put((String)localObject1, localJSONObject2);
          }
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject2 = "Unable to get all view rectangles";
        tp.e((String)localObject2);
        localObject2 = localJSONObject1;
      }
    }
  }
  
  private JSONObject b(Map paramMap, View paramView)
  {
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>();
    if ((paramMap == null) || (paramView == null)) {}
    Object localObject2;
    for (Object localObject1 = localJSONObject1;; localObject2 = localJSONObject1)
    {
      return (JSONObject)localObject1;
      int[] arrayOfInt = b(paramView);
      localObject1 = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      Object localObject3;
      do
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)localIterator.next();
        localObject3 = (View)((WeakReference)((Map.Entry)localObject1).getValue()).get();
      } while (localObject3 == null);
      Object localObject4 = b((View)localObject3);
      JSONObject localJSONObject2 = new org/json/JSONObject;
      localJSONObject2.<init>();
      Object localObject5 = new org/json/JSONObject;
      ((JSONObject)localObject5).<init>();
      String str1 = "width";
      for (;;)
      {
        try
        {
          m = ((View)localObject3).getMeasuredWidth();
          m = a(m);
          ((JSONObject)localObject5).put(str1, m);
          str1 = "height";
          m = ((View)localObject3).getMeasuredHeight();
          m = a(m);
          ((JSONObject)localObject5).put(str1, m);
          str1 = "x";
          m = 0;
          str2 = null;
          m = localObject4[0];
          n = 0;
          n = arrayOfInt[0];
          m -= n;
          m = a(m);
          ((JSONObject)localObject5).put(str1, m);
          str1 = "y";
          m = 1;
          m = localObject4[m];
          n = 1;
          n = arrayOfInt[n];
          m -= n;
          m = a(m);
          ((JSONObject)localObject5).put(str1, m);
          str1 = "relative_to";
          str2 = "ad_view";
          ((JSONObject)localObject5).put(str1, str2);
          str1 = "frame";
          localJSONObject2.put(str1, localObject5);
          localObject5 = new android/graphics/Rect;
          ((Rect)localObject5).<init>();
          bool2 = ((View)localObject3).getLocalVisibleRect((Rect)localObject5);
          if (!bool2) {
            break label485;
          }
          localObject5 = a((Rect)localObject5);
          localObject4 = "visible_bounds";
          localJSONObject2.put((String)localObject4, localObject5);
          boolean bool3 = localObject3 instanceof TextView;
          if (bool3)
          {
            localObject3 = (TextView)localObject3;
            localObject5 = "text_color";
            i1 = ((TextView)localObject3).getCurrentTextColor();
            localJSONObject2.put((String)localObject5, i1);
            localObject5 = "font_size";
            float f1 = ((TextView)localObject3).getTextSize();
            double d1 = f1;
            localJSONObject2.put((String)localObject5, d1);
            localObject5 = "text";
            localObject3 = ((TextView)localObject3).getText();
            localJSONObject2.put((String)localObject5, localObject3);
          }
          localObject1 = ((Map.Entry)localObject1).getKey();
          localObject1 = (String)localObject1;
          localJSONObject1.put((String)localObject1, localJSONObject2);
        }
        catch (JSONException localJSONException)
        {
          localObject2 = "Unable to get asset views information";
          tp.e((String)localObject2);
        }
        break;
        label485:
        localObject5 = new org/json/JSONObject;
        ((JSONObject)localObject5).<init>();
        str1 = "x";
        int m = 0;
        String str2 = null;
        m = localObject4[0];
        int n = 0;
        n = arrayOfInt[0];
        m -= n;
        m = a(m);
        ((JSONObject)localObject5).put(str1, m);
        str1 = "y";
        m = 1;
        int i1 = localObject4[m];
        m = 1;
        m = arrayOfInt[m];
        i1 -= m;
        i1 = a(i1);
        ((JSONObject)localObject5).put(str1, i1);
        localObject4 = "width";
        boolean bool2 = false;
        str1 = null;
        ((JSONObject)localObject5).put((String)localObject4, 0);
        localObject4 = "height";
        bool2 = false;
        str1 = null;
        ((JSONObject)localObject5).put((String)localObject4, 0);
        localObject4 = "relative_to";
        str1 = "ad_view";
        ((JSONObject)localObject5).put((String)localObject4, str1);
      }
    }
  }
  
  private static int[] b(View paramView)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    return arrayOfInt;
  }
  
  private JSONObject c(View paramView)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    if (paramView == null) {}
    for (;;)
    {
      return localJSONObject;
      String str1 = "width";
      try
      {
        int m = paramView.getMeasuredWidth();
        m = a(m);
        localJSONObject.put(str1, m);
        str1 = "height";
        m = paramView.getMeasuredHeight();
        m = a(m);
        localJSONObject.put(str1, m);
      }
      catch (Exception localException)
      {
        String str2 = "Unable to get native ad view bounding box";
        tp.e(str2);
      }
    }
  }
  
  private JSONObject d(View paramView)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    if (paramView == null) {
      return localJSONObject;
    }
    for (;;)
    {
      try
      {
        localObject1 = b(paramView);
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        str1 = "width";
        m = paramView.getMeasuredWidth();
        m = a(m);
        ((JSONObject)localObject2).put(str1, m);
        str1 = "height";
        m = paramView.getMeasuredHeight();
        m = a(m);
        ((JSONObject)localObject2).put(str1, m);
        str1 = "x";
        m = 0;
        str2 = null;
        m = localObject1[0];
        m = a(m);
        ((JSONObject)localObject2).put(str1, m);
        str1 = "y";
        m = 1;
        m = localObject1[m];
        m = a(m);
        ((JSONObject)localObject2).put(str1, m);
        str1 = "relative_to";
        str2 = "window";
        ((JSONObject)localObject2).put(str1, str2);
        str1 = "frame";
        localJSONObject.put(str1, localObject2);
        localObject2 = new android/graphics/Rect;
        ((Rect)localObject2).<init>();
        bool = paramView.getGlobalVisibleRect((Rect)localObject2);
        if (!bool) {
          break label239;
        }
        localObject2 = a((Rect)localObject2);
        localObject1 = "visible_bounds";
        localJSONObject.put((String)localObject1, localObject2);
      }
      catch (Exception localException)
      {
        localObject3 = "Unable to get native ad view bounding box";
        tp.e((String)localObject3);
      }
      break;
      label239:
      Object localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>();
      String str1 = "x";
      int m = 0;
      String str2 = null;
      m = localObject1[0];
      m = a(m);
      ((JSONObject)localObject3).put(str1, m);
      str1 = "y";
      m = 1;
      int n = localObject1[m];
      n = a(n);
      ((JSONObject)localObject3).put(str1, n);
      Object localObject1 = "width";
      boolean bool = false;
      str1 = null;
      ((JSONObject)localObject3).put((String)localObject1, 0);
      localObject1 = "height";
      bool = false;
      str1 = null;
      ((JSONObject)localObject3).put((String)localObject1, 0);
      localObject1 = "relative_to";
      str1 = "window";
      ((JSONObject)localObject3).put((String)localObject1, str1);
    }
  }
  
  public View a(View.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    int m = 12;
    int n = 11;
    int i1 = 10;
    int i2 = 9;
    int i3 = -2;
    Object localObject1 = g.m();
    if (localObject1 == null)
    {
      localObject1 = null;
      return (View)localObject1;
    }
    Object localObject2 = new android/widget/RelativeLayout$LayoutParams;
    ((RelativeLayout.LayoutParams)localObject2).<init>(i3, i3);
    if (!paramBoolean)
    {
      i3 = i;
      switch (i3)
      {
      case 1: 
      default: 
        ((RelativeLayout.LayoutParams)localObject2).addRule(i1);
        ((RelativeLayout.LayoutParams)localObject2).addRule(n);
      }
    }
    for (;;)
    {
      ku localku = new com/google/android/gms/b/ku;
      Context localContext = b;
      localku.<init>(localContext, (kt)localObject1, (RelativeLayout.LayoutParams)localObject2);
      localku.setOnClickListener(paramOnClickListener);
      localObject1 = ke.co;
      localObject2 = w.q();
      localObject1 = (CharSequence)((kd)localObject2).a((jz)localObject1);
      localku.setContentDescription((CharSequence)localObject1);
      localObject1 = localku;
      break;
      ((RelativeLayout.LayoutParams)localObject2).addRule(i1);
      ((RelativeLayout.LayoutParams)localObject2).addRule(i2);
      continue;
      ((RelativeLayout.LayoutParams)localObject2).addRule(m);
      ((RelativeLayout.LayoutParams)localObject2).addRule(i2);
      continue;
      ((RelativeLayout.LayoutParams)localObject2).addRule(m);
      ((RelativeLayout.LayoutParams)localObject2).addRule(n);
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    h.a(paramMotionEvent);
  }
  
  public final void a(View paramView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    l = localWeakReference;
  }
  
  public final void a(View paramView, kz paramkz)
  {
    int m = -1;
    Object localObject1 = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject1).<init>(m, m);
    Object localObject2 = g;
    Object localObject3 = ((lc.a)localObject2).o();
    if (localObject3 != null)
    {
      localObject2 = ((View)localObject3).getParent();
      boolean bool2 = localObject2 instanceof ViewGroup;
      if (bool2)
      {
        localObject2 = (ViewGroup)localObject2;
        ((ViewGroup)localObject2).removeView((View)localObject3);
      }
      paramView = (FrameLayout)paramView;
      paramView.addView((View)localObject3, (ViewGroup.LayoutParams)localObject1);
      localObject2 = a;
      localObject1 = l;
      if (localObject1 != null)
      {
        localObject2 = l;
        ((vc)localObject2).a(paramkz);
      }
    }
    label327:
    for (;;)
    {
      return;
      localObject2 = g;
      boolean bool1 = localObject2 instanceof lc.b;
      if (bool1)
      {
        localObject2 = (lc.b)g;
        localObject3 = ((lc.b)localObject2).b();
        if (localObject3 != null)
        {
          localObject3 = ((lc.b)localObject2).b();
          int n = ((List)localObject3).size();
          if (n > 0)
          {
            localObject2 = ((lc.b)localObject2).b();
            localObject3 = null;
            localObject2 = ((List)localObject2).get(0);
            boolean bool3 = localObject2 instanceof IBinder;
            if (bool3) {}
            String str;
            for (localObject2 = lh.a.a((IBinder)localObject2);; str = null)
            {
              if (localObject2 == null) {
                break label327;
              }
              try
              {
                localObject2 = ((lh)localObject2).a();
                if (localObject2 == null) {
                  break;
                }
                localObject2 = b.a((a)localObject2);
                localObject2 = (Drawable)localObject2;
                localObject3 = new android/widget/ImageView;
                Context localContext = b;
                ((ImageView)localObject3).<init>(localContext);
                ((ImageView)localObject3).setImageDrawable((Drawable)localObject2);
                localObject2 = ImageView.ScaleType.CENTER_INSIDE;
                ((ImageView)localObject3).setScaleType((ImageView.ScaleType)localObject2);
                paramView = (FrameLayout)paramView;
                paramView.addView((View)localObject3, (ViewGroup.LayoutParams)localObject1);
              }
              catch (RemoteException localRemoteException)
              {
                str = "Could not get drawable from image";
                tp.e(str);
              }
              break;
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public final void a(View paramView1, String paramString, JSONObject paramJSONObject, Map paramMap, View paramView2)
  {
    Object localObject1 = "performClick must be called on the main UI thread.";
    c.b((String)localObject1);
    for (;;)
    {
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        localObject1 = "asset";
        ((JSONObject)localObject2).put((String)localObject1, paramString);
        localObject1 = "template";
        localObject3 = g;
        localObject3 = ((lc.a)localObject3).k();
        ((JSONObject)localObject2).put((String)localObject1, localObject3);
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>();
        localObject1 = "ad";
        localObject4 = e;
        ((JSONObject)localObject3).put((String)localObject1, localObject4);
        localObject1 = "click";
        ((JSONObject)localObject3).put((String)localObject1, localObject2);
        localObject4 = "has_custom_click_handler";
        localObject1 = a;
        localObject5 = g;
        localObject5 = ((lc.a)localObject5).l();
        localObject1 = ((s)localObject1).b((String)localObject5);
        if (localObject1 != null)
        {
          bool = true;
          ((JSONObject)localObject3).put((String)localObject4, bool);
          localObject1 = ke.cq;
          localObject4 = w.q();
          localObject1 = ((kd)localObject4).a((jz)localObject1);
          localObject1 = (Boolean)localObject1;
          bool = ((Boolean)localObject1).booleanValue();
          if (bool)
          {
            localObject1 = ke.cr;
            localObject4 = w.q();
            localObject1 = ((kd)localObject4).a((jz)localObject1);
            localObject1 = (Boolean)localObject1;
            bool = ((Boolean)localObject1).booleanValue();
            if (!bool) {
              continue;
            }
            localObject1 = "asset_view_signal";
            localObject4 = b(paramMap, paramView2);
            ((JSONObject)localObject3).put((String)localObject1, localObject4);
            localObject1 = "ad_view_signal";
            localObject4 = d(paramView2);
            ((JSONObject)localObject3).put((String)localObject1, localObject4);
          }
          if (paramJSONObject != null)
          {
            localObject1 = "click_point";
            ((JSONObject)localObject3).put((String)localObject1, paramJSONObject);
          }
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject3;
        Object localObject4;
        Object localObject5;
        boolean bool;
        Context localContext;
        localObject2 = "Unable to create click JSON.";
        tp.b((String)localObject2, localJSONException);
        continue;
      }
      try
      {
        localObject1 = e;
        localObject4 = "tracking_urls_and_actions";
        localObject1 = ((JSONObject)localObject1).optJSONObject((String)localObject4);
        if (localObject1 == null)
        {
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>();
        }
        localObject4 = "click_string";
        localObject1 = ((JSONObject)localObject1).optString((String)localObject4);
        localObject4 = "click_signals";
        localObject5 = h;
        localObject5 = e;
        localContext = b;
        localObject1 = ((bv)localObject5).a(localContext, (String)localObject1, paramView1);
        ((JSONObject)localObject2).put((String)localObject4, localObject1);
      }
      catch (Exception localException)
      {
        localObject2 = "Exception obtaining click signals";
        tp.b((String)localObject2, localException);
        continue;
      }
      localObject1 = "ads_id";
      localObject2 = j;
      ((JSONObject)localObject3).put((String)localObject1, localObject2);
      localObject1 = f;
      localObject2 = new com/google/android/gms/b/ld$1;
      ((ld.1)localObject2).<init>((JSONObject)localObject3);
      ((pz)localObject1).a((pz.a)localObject2);
      return;
      bool = false;
      localObject1 = null;
      continue;
      localObject1 = "view_rectangles";
      localObject4 = a(paramMap, paramView2);
      ((JSONObject)localObject3).put((String)localObject1, localObject4);
      localObject1 = "native_view_rectangle";
      localObject4 = c(paramView2);
      ((JSONObject)localObject3).put((String)localObject1, localObject4);
    }
  }
  
  public void a(View paramView, Map paramMap)
  {
    Object localObject1 = "recordImpression must be called on the main UI thread.";
    c.b((String)localObject1);
    boolean bool = true;
    c = bool;
    for (;;)
    {
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        localObject1 = "ad";
        localObject3 = e;
        ((JSONObject)localObject2).put((String)localObject1, localObject3);
        localObject1 = "ads_id";
        localObject3 = j;
        ((JSONObject)localObject2).put((String)localObject1, localObject3);
        localObject1 = ke.cq;
        localObject3 = w.q();
        localObject1 = ((kd)localObject3).a((jz)localObject1);
        localObject1 = (Boolean)localObject1;
        bool = ((Boolean)localObject1).booleanValue();
        if (bool)
        {
          localObject1 = ke.cr;
          localObject3 = w.q();
          localObject1 = ((kd)localObject3).a((jz)localObject1);
          localObject1 = (Boolean)localObject1;
          bool = ((Boolean)localObject1).booleanValue();
          if (!bool) {
            continue;
          }
          localObject1 = "asset_view_signal";
          localObject3 = b(paramMap, paramView);
          ((JSONObject)localObject2).put((String)localObject1, localObject3);
          localObject1 = "ad_view_signal";
          localObject3 = d(paramView);
          ((JSONObject)localObject2).put((String)localObject1, localObject3);
        }
        localObject1 = f;
        localObject3 = new com/google/android/gms/b/ld$2;
        ((ld.2)localObject3).<init>((JSONObject)localObject2);
        ((pz)localObject1).a((pz.a)localObject3);
      }
      catch (JSONException localJSONException)
      {
        Object localObject3;
        Object localObject2 = "Unable to create impression JSON.";
        tp.b((String)localObject2, localJSONException);
        continue;
      }
      a.a(this);
      a.w();
      return;
      localObject1 = "view_rectangles";
      localObject3 = a(paramMap, paramView);
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
      localObject1 = "native_view_rectangle";
      localObject3 = c(paramView);
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
    }
  }
  
  public void a(View paramView, Map paramMap, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    boolean bool1 = true;
    Object localObject1 = ke.cl;
    Object localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool2 = ((Boolean)localObject1).booleanValue();
    if (!bool2) {}
    do
    {
      return;
      paramView.setOnTouchListener(paramOnTouchListener);
      paramView.setClickable(bool1);
      paramView.setOnClickListener(paramOnClickListener);
    } while (paramMap == null);
    localObject1 = paramMap.entrySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (View)((WeakReference)((Map.Entry)((Iterator)localObject2).next()).getValue()).get();
      if (localObject1 != null)
      {
        ((View)localObject1).setOnTouchListener(paramOnTouchListener);
        ((View)localObject1).setClickable(bool1);
        ((View)localObject1).setOnClickListener(paramOnClickListener);
      }
    }
  }
  
  public void a(View paramView1, Map paramMap, JSONObject paramJSONObject, View paramView2)
  {
    Object localObject1 = "performClick must be called on the main UI thread.";
    c.b((String)localObject1);
    Object localObject2;
    boolean bool1;
    Object localObject3;
    if (paramMap != null)
    {
      localObject1 = paramMap.entrySet();
      localObject2 = ((Set)localObject1).iterator();
      boolean bool2;
      do
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject2).next();
        localObject3 = (View)((WeakReference)((Map.Entry)localObject1).getValue()).get();
        bool2 = paramView1.equals(localObject3);
      } while (!bool2);
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = this;
      localObject3 = paramView1;
      a(paramView1, (String)localObject2, paramJSONObject, paramMap, paramView2);
    }
    for (;;)
    {
      return;
      localObject1 = "2";
      localObject3 = g.k();
      bool1 = ((String)localObject1).equals(localObject3);
      if (bool1)
      {
        localObject2 = "2099";
        localObject1 = this;
        localObject3 = paramView1;
        a(paramView1, (String)localObject2, paramJSONObject, paramMap, paramView2);
      }
      else
      {
        localObject1 = "1";
        localObject3 = g.k();
        bool1 = ((String)localObject1).equals(localObject3);
        if (bool1)
        {
          localObject2 = "1099";
          localObject1 = this;
          localObject3 = paramView1;
          a(paramView1, (String)localObject2, paramJSONObject, paramMap, paramView2);
        }
      }
    }
  }
  
  public boolean a()
  {
    kt localkt = g.m();
    boolean bool;
    if (localkt != null)
    {
      bool = j;
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localkt = null;
    }
  }
  
  public void b(View paramView, Map paramMap)
  {
    Object localObject1 = ke.ck;
    Object localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool = ((Boolean)localObject1).booleanValue();
    if (bool) {}
    do
    {
      return;
      paramView.setOnTouchListener(null);
      paramView.setClickable(false);
      paramView.setOnClickListener(null);
    } while (paramMap == null);
    localObject1 = paramMap.entrySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (View)((WeakReference)((Map.Entry)((Iterator)localObject2).next()).getValue()).get();
      if (localObject1 != null)
      {
        ((View)localObject1).setOnTouchListener(null);
        ((View)localObject1).setClickable(false);
        ((View)localObject1).setOnClickListener(null);
      }
    }
  }
  
  public final void c(View paramView, Map paramMap)
  {
    for (;;)
    {
      synchronized (d)
      {
        bool = c;
        if (bool) {
          return;
        }
        bool = paramView.isShown();
        if (bool) {}
      }
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      boolean bool = paramView.getGlobalVisibleRect(localRect, null);
      if (!bool) {}
      a(paramView, paramMap);
    }
  }
  
  public vc d()
  {
    Object localObject1 = e;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = e;
      localObject2 = "overlay";
      localObject1 = ((JSONObject)localObject1).optJSONObject((String)localObject2);
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = null;
    }
    for (;;)
    {
      return (vc)localObject1;
      localObject2 = w.f();
      Object localObject3 = b;
      Object localObject4 = il.a();
      dw localdw = h;
      un localun = i;
      localObject1 = new com/google/android/gms/b/ve$1;
      ((ve.1)localObject1).<init>((ve)localObject2, (Context)localObject3, (il)localObject4, localdw, localun);
      localObject1 = (vc)uh.a((Callable)localObject1);
      localObject2 = ((vc)localObject1).b();
      int m = 8;
      ((View)localObject2).setVisibility(m);
      localObject2 = f;
      localObject3 = new com/google/android/gms/b/ld$a;
      ((ld.a)localObject3).<init>((vc)localObject1);
      localObject4 = new com/google/android/gms/b/ld$a$5;
      ((ld.a.5)localObject4).<init>((ld.a)localObject3);
      ((pz)localObject2).a((pz.a)localObject4);
    }
  }
  
  public final View e()
  {
    Object localObject = l;
    if (localObject != null) {}
    for (localObject = (View)l.get();; localObject = null) {
      return (View)localObject;
    }
  }
  
  public final Context f()
  {
    return b;
  }
  
  public final sz g()
  {
    Object localObject = w.D();
    boolean bool = ((ta)localObject).b();
    if (bool)
    {
      localObject = k;
      if (localObject == null)
      {
        localObject = new com/google/android/gms/b/sz;
        Context localContext = b;
        String str = a.K();
        ((sz)localObject).<init>(localContext, str);
        k = ((sz)localObject);
      }
    }
    for (localObject = k;; localObject = null)
    {
      return (sz)localObject;
      bool = false;
    }
  }
}


/* Location:              com/google/android/gms/b/ld.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */