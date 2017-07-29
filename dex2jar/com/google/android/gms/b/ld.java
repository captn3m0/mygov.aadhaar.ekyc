package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
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
import org.json.JSONException;
import org.json.JSONObject;

@qi
public class ld
  implements lc
{
  final s a;
  final Context b;
  boolean c;
  private final Object d = new Object();
  private final JSONObject e;
  private final pz f;
  private final lc.a g;
  private final dw h;
  private final un i;
  private String j;
  private sz k;
  private WeakReference<View> l = null;
  
  public ld(Context paramContext, s params, pz parampz, dw paramdw, JSONObject paramJSONObject, lc.a parama, un paramun, String paramString)
  {
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
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("x", a(left));
    localJSONObject.put("y", a(top));
    localJSONObject.put("width", a(right - left));
    localJSONObject.put("height", a(bottom - top));
    localJSONObject.put("relative_to", "self");
    return localJSONObject;
  }
  
  private JSONObject a(Map<String, WeakReference<View>> paramMap, View paramView)
  {
    localJSONObject1 = new JSONObject();
    if ((paramMap == null) || (paramView == null)) {
      return localJSONObject1;
    }
    try
    {
      paramView = b(paramView);
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        View localView = (View)((WeakReference)localEntry.getValue()).get();
        if (localView != null)
        {
          int[] arrayOfInt = b(localView);
          JSONObject localJSONObject2 = new JSONObject();
          localJSONObject2.put("width", a(localView.getMeasuredWidth()));
          localJSONObject2.put("height", a(localView.getMeasuredHeight()));
          localJSONObject2.put("x", a(arrayOfInt[0] - paramView[0]));
          localJSONObject2.put("y", a(arrayOfInt[1] - paramView[1]));
          localJSONObject1.put((String)localEntry.getKey(), localJSONObject2);
        }
      }
      return localJSONObject1;
    }
    catch (JSONException paramMap)
    {
      tp.e("Unable to get all view rectangles");
    }
  }
  
  private JSONObject b(Map<String, WeakReference<View>> paramMap, View paramView)
  {
    JSONObject localJSONObject1 = new JSONObject();
    if ((paramMap == null) || (paramView == null)) {
      return localJSONObject1;
    }
    paramView = b(paramView);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      View localView = (View)((WeakReference)localEntry.getValue()).get();
      if (localView != null)
      {
        int[] arrayOfInt = b(localView);
        JSONObject localJSONObject2 = new JSONObject();
        paramMap = new JSONObject();
        for (;;)
        {
          try
          {
            paramMap.put("width", a(localView.getMeasuredWidth()));
            paramMap.put("height", a(localView.getMeasuredHeight()));
            paramMap.put("x", a(arrayOfInt[0] - paramView[0]));
            paramMap.put("y", a(arrayOfInt[1] - paramView[1]));
            paramMap.put("relative_to", "ad_view");
            localJSONObject2.put("frame", paramMap);
            paramMap = new Rect();
            if (!localView.getLocalVisibleRect(paramMap)) {
              break label305;
            }
            paramMap = a(paramMap);
            localJSONObject2.put("visible_bounds", paramMap);
            if ((localView instanceof TextView))
            {
              paramMap = (TextView)localView;
              localJSONObject2.put("text_color", paramMap.getCurrentTextColor());
              localJSONObject2.put("font_size", paramMap.getTextSize());
              localJSONObject2.put("text", paramMap.getText());
            }
            localJSONObject1.put((String)localEntry.getKey(), localJSONObject2);
          }
          catch (JSONException paramMap)
          {
            tp.e("Unable to get asset views information");
          }
          break;
          label305:
          paramMap = new JSONObject();
          paramMap.put("x", a(arrayOfInt[0] - paramView[0]));
          paramMap.put("y", a(arrayOfInt[1] - paramView[1]));
          paramMap.put("width", 0);
          paramMap.put("height", 0);
          paramMap.put("relative_to", "ad_view");
        }
      }
    }
    return localJSONObject1;
  }
  
  private static int[] b(View paramView)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    return arrayOfInt;
  }
  
  private JSONObject c(View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    try
    {
      localJSONObject.put("width", a(paramView.getMeasuredWidth()));
      localJSONObject.put("height", a(paramView.getMeasuredHeight()));
      return localJSONObject;
    }
    catch (Exception paramView)
    {
      tp.e("Unable to get native ad view bounding box");
    }
    return localJSONObject;
  }
  
  private JSONObject d(View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    for (;;)
    {
      int[] arrayOfInt;
      try
      {
        arrayOfInt = b(paramView);
        Object localObject = new JSONObject();
        ((JSONObject)localObject).put("width", a(paramView.getMeasuredWidth()));
        ((JSONObject)localObject).put("height", a(paramView.getMeasuredHeight()));
        ((JSONObject)localObject).put("x", a(arrayOfInt[0]));
        ((JSONObject)localObject).put("y", a(arrayOfInt[1]));
        ((JSONObject)localObject).put("relative_to", "window");
        localJSONObject.put("frame", localObject);
        localObject = new Rect();
        if (paramView.getGlobalVisibleRect((Rect)localObject))
        {
          paramView = a((Rect)localObject);
          localJSONObject.put("visible_bounds", paramView);
          return localJSONObject;
        }
      }
      catch (Exception paramView)
      {
        tp.e("Unable to get native ad view bounding box");
        return localJSONObject;
      }
      paramView = new JSONObject();
      paramView.put("x", a(arrayOfInt[0]));
      paramView.put("y", a(arrayOfInt[1]));
      paramView.put("width", 0);
      paramView.put("height", 0);
      paramView.put("relative_to", "window");
    }
  }
  
  public View a(View.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    Object localObject = g.m();
    if (localObject == null) {
      return null;
    }
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    if (!paramBoolean) {
      switch (i)
      {
      case 1: 
      default: 
        localLayoutParams.addRule(10);
        localLayoutParams.addRule(11);
      }
    }
    for (;;)
    {
      localObject = new ku(b, (kt)localObject, localLayoutParams);
      ((ku)localObject).setOnClickListener(paramOnClickListener);
      paramOnClickListener = ke.co;
      ((ku)localObject).setContentDescription((CharSequence)w.q().a(paramOnClickListener));
      return (View)localObject;
      localLayoutParams.addRule(10);
      localLayoutParams.addRule(9);
      continue;
      localLayoutParams.addRule(12);
      localLayoutParams.addRule(9);
      continue;
      localLayoutParams.addRule(12);
      localLayoutParams.addRule(11);
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    h.a(paramMotionEvent);
  }
  
  public final void a(View paramView)
  {
    l = new WeakReference(paramView);
  }
  
  public final void a(View paramView, kz paramkz)
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    Object localObject = g.o();
    if (localObject != null)
    {
      ViewParent localViewParent = ((View)localObject).getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView((View)localObject);
      }
      ((FrameLayout)paramView).addView((View)localObject, localLayoutParams);
      paramView = a;
      if (l != null) {
        l.a(paramkz);
      }
    }
    label225:
    for (;;)
    {
      return;
      if ((g instanceof lc.b))
      {
        paramkz = (lc.b)g;
        if ((paramkz.b() == null) || (paramkz.b().size() <= 0)) {
          break;
        }
        paramkz = paramkz.b().get(0);
        if ((paramkz instanceof IBinder)) {}
        for (paramkz = lh.a.a((IBinder)paramkz);; paramkz = null)
        {
          if (paramkz == null) {
            break label225;
          }
          try
          {
            paramkz = paramkz.a();
            if (paramkz == null) {
              break;
            }
            paramkz = (Drawable)b.a(paramkz);
            localObject = new ImageView(b);
            ((ImageView)localObject).setImageDrawable(paramkz);
            ((ImageView)localObject).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((FrameLayout)paramView).addView((View)localObject, localLayoutParams);
            return;
          }
          catch (RemoteException paramView)
          {
            tp.e("Could not get drawable from image");
            return;
          }
        }
      }
    }
  }
  
  public final void a(View paramView1, String paramString, JSONObject paramJSONObject, Map<String, WeakReference<View>> paramMap, View paramView2)
  {
    c.b("performClick must be called on the main UI thread.");
    for (;;)
    {
      try
      {
        localJSONObject1 = new JSONObject();
        localJSONObject1.put("asset", paramString);
        localJSONObject1.put("template", g.k());
        localJSONObject2 = new JSONObject();
        localJSONObject2.put("ad", e);
        localJSONObject2.put("click", localJSONObject1);
        if (a.b(g.l()) == null) {
          break label340;
        }
        bool = true;
        localJSONObject2.put("has_custom_click_handler", bool);
        paramString = ke.cq;
        if (((Boolean)w.q().a(paramString)).booleanValue())
        {
          paramString = ke.cr;
          if (((Boolean)w.q().a(paramString)).booleanValue())
          {
            localJSONObject2.put("asset_view_signal", b(paramMap, paramView2));
            localJSONObject2.put("ad_view_signal", d(paramView2));
          }
        }
        else if (paramJSONObject != null)
        {
          localJSONObject2.put("click_point", paramJSONObject);
        }
      }
      catch (JSONException paramView1)
      {
        JSONObject localJSONObject1;
        JSONObject localJSONObject2;
        tp.b("Unable to create click JSON.", paramView1);
        return;
      }
      try
      {
        paramJSONObject = e.optJSONObject("tracking_urls_and_actions");
        paramString = paramJSONObject;
        if (paramJSONObject == null) {
          paramString = new JSONObject();
        }
        paramString = paramString.optString("click_string");
        localJSONObject1.put("click_signals", h.e.a(b, paramString, paramView1));
      }
      catch (Exception paramView1)
      {
        tp.b("Exception obtaining click signals", paramView1);
        continue;
      }
      localJSONObject2.put("ads_id", j);
      f.a(new pz.a()
      {
        public final void a(nk paramAnonymousnk)
        {
          paramAnonymousnk.a("google.afma.nativeAds.handleClickGmsg", ld.this);
        }
      });
      return;
      localJSONObject2.put("view_rectangles", a(paramMap, paramView2));
      localJSONObject2.put("native_view_rectangle", c(paramView2));
      continue;
      label340:
      boolean bool = false;
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    c.b("recordImpression must be called on the main UI thread.");
    c = true;
    for (;;)
    {
      try
      {
        localJSONObject = new JSONObject();
        localJSONObject.put("ad", e);
        localJSONObject.put("ads_id", j);
        jz localjz = ke.cq;
        if (((Boolean)w.q().a(localjz)).booleanValue())
        {
          localjz = ke.cr;
          if (!((Boolean)w.q().a(localjz)).booleanValue()) {
            continue;
          }
          localJSONObject.put("asset_view_signal", b(paramMap, paramView));
          localJSONObject.put("ad_view_signal", d(paramView));
        }
        f.a(new pz.a()
        {
          public final void a(nk paramAnonymousnk)
          {
            paramAnonymousnk.a("google.afma.nativeAds.handleImpressionPing", ld.this);
          }
        });
      }
      catch (JSONException paramView)
      {
        JSONObject localJSONObject;
        tp.b("Unable to create impression JSON.", paramView);
        continue;
      }
      a.a(this);
      a.w();
      return;
      localJSONObject.put("view_rectangles", a(paramMap, paramView));
      localJSONObject.put("native_view_rectangle", c(paramView));
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> paramMap, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    jz localjz = ke.cl;
    if (!((Boolean)w.q().a(localjz)).booleanValue()) {}
    for (;;)
    {
      return;
      paramView.setOnTouchListener(paramOnTouchListener);
      paramView.setClickable(true);
      paramView.setOnClickListener(paramOnClickListener);
      if (paramMap != null)
      {
        paramView = paramMap.entrySet().iterator();
        while (paramView.hasNext())
        {
          paramMap = (View)((WeakReference)((Map.Entry)paramView.next()).getValue()).get();
          if (paramMap != null)
          {
            paramMap.setOnTouchListener(paramOnTouchListener);
            paramMap.setClickable(true);
            paramMap.setOnClickListener(paramOnClickListener);
          }
        }
      }
    }
  }
  
  public void a(View paramView1, Map<String, WeakReference<View>> paramMap, JSONObject paramJSONObject, View paramView2)
  {
    c.b("performClick must be called on the main UI thread.");
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (paramView1.equals((View)((WeakReference)localEntry.getValue()).get())) {
          a(paramView1, (String)localEntry.getKey(), paramJSONObject, paramMap, paramView2);
        }
      }
    }
    do
    {
      return;
      if ("2".equals(g.k()))
      {
        a(paramView1, "2099", paramJSONObject, paramMap, paramView2);
        return;
      }
    } while (!"1".equals(g.k()));
    a(paramView1, "1099", paramJSONObject, paramMap, paramView2);
  }
  
  public boolean a()
  {
    kt localkt = g.m();
    return (localkt != null) && (j);
  }
  
  public void b(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    jz localjz = ke.ck;
    if (((Boolean)w.q().a(localjz)).booleanValue()) {}
    for (;;)
    {
      return;
      paramView.setOnTouchListener(null);
      paramView.setClickable(false);
      paramView.setOnClickListener(null);
      if (paramMap != null)
      {
        paramView = paramMap.entrySet().iterator();
        while (paramView.hasNext())
        {
          paramMap = (View)((WeakReference)((Map.Entry)paramView.next()).getValue()).get();
          if (paramMap != null)
          {
            paramMap.setOnTouchListener(null);
            paramMap.setClickable(false);
            paramMap.setOnClickListener(null);
          }
        }
      }
    }
  }
  
  public final void c(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    synchronized (d)
    {
      if (c) {
        return;
      }
      if (!paramView.isShown()) {
        return;
      }
    }
    if (!paramView.getGlobalVisibleRect(new Rect(), null)) {
      return;
    }
    a(paramView, paramMap);
  }
  
  public vc d()
  {
    if ((e == null) || (e.optJSONObject("overlay") == null)) {
      return null;
    }
    vc localvc = (vc)uh.a(new ve.1(w.f(), b, il.a(), h, i));
    localvc.b().setVisibility(8);
    f.a(new ld.a.5(new a(localvc)));
    return localvc;
  }
  
  public final View e()
  {
    if (l != null) {
      return (View)l.get();
    }
    return null;
  }
  
  public final Context f()
  {
    return b;
  }
  
  public final sz g()
  {
    if (w.D().b())
    {
      if (k == null) {
        k = new sz(b, a.K());
      }
      return k;
    }
    return null;
  }
  
  private static final class a
  {
    final WeakReference<vc> a;
    String b;
    
    public a(vc paramvc)
    {
      a = new WeakReference(paramvc);
    }
  }
}


/* Location:              com/google/android/gms/b/ld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */