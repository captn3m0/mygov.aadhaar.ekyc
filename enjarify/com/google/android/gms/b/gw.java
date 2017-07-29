package com.google.android.gms.b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class gw
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  protected final Object a;
  protected final gu b;
  BroadcastReceiver c;
  private final WeakReference d;
  private WeakReference e;
  private final he f;
  private final Context g;
  private final WindowManager h;
  private final PowerManager i;
  private final KeyguardManager j;
  private gx k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;
  private final HashSet r;
  private ue s;
  private final HashSet t;
  
  public gw(Context paramContext, il paramil, tg paramtg, un paramun, he paramhe)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    m = false;
    n = false;
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    r = ((HashSet)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    t = ((HashSet)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramtg);
    d = ((WeakReference)localObject);
    f = paramhe;
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(null);
    e = ((WeakReference)localObject);
    o = true;
    q = false;
    localObject = new com/google/android/gms/b/ue;
    ((ue)localObject).<init>(200L);
    s = ((ue)localObject);
    localObject = new com/google/android/gms/b/gu;
    String str1 = UUID.randomUUID().toString();
    String str2 = a;
    JSONObject localJSONObject = j;
    boolean bool1 = paramtg.a();
    boolean bool2 = h;
    ((gu)localObject).<init>(str1, paramun, str2, localJSONObject, bool1, bool2);
    b = ((gu)localObject);
    localObject = (WindowManager)paramContext.getSystemService("window");
    h = ((WindowManager)localObject);
    localObject = (PowerManager)paramContext.getApplicationContext().getSystemService("power");
    i = ((PowerManager)localObject);
    localObject = (KeyguardManager)paramContext.getSystemService("keyguard");
    j = ((KeyguardManager)localObject);
    g = paramContext;
  }
  
  private static int a(int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    float f1 = density;
    return (int)(paramInt / f1);
  }
  
  private JSONObject a(View paramView)
  {
    int i1 = 2;
    float f1 = 2.8E-45F;
    int i2 = 0;
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (paramView == null)
    {
      localObject2 = j().put("isAttachedToWindow", false);
      localObject3 = i;
      boolean bool2 = ((PowerManager)localObject3).isScreenOn();
      localObject2 = ((JSONObject)localObject2).put("isScreenOn", bool2);
      localObject4 = "isVisible";
      localObject2 = ((JSONObject)localObject2).put((String)localObject4, false);
    }
    for (;;)
    {
      return (JSONObject)localObject2;
      boolean bool3 = w.g().a(paramView);
      localObject3 = new int[i1];
      localObject2 = new int[i1];
      try
      {
        paramView.getLocationOnScreen((int[])localObject3);
        paramView.getLocationInWindow((int[])localObject2);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject6;
          int i4;
          int i3;
          boolean bool4;
          Rect localRect1;
          boolean bool5;
          Rect localRect2;
          int i6;
          Object localObject7;
          int i7;
          String str;
          Object localObject8;
          int i8;
          int i9;
          int i5;
          double d1;
          boolean bool1;
          Object localObject5 = "Failure getting view location.";
          tp.b((String)localObject5, localException);
        }
      }
      localObject5 = paramView.getContext().getResources().getDisplayMetrics();
      localObject6 = new android/graphics/Rect;
      ((Rect)localObject6).<init>();
      i4 = localObject3[0];
      left = i4;
      i4 = localObject3[1];
      top = i4;
      i4 = left;
      i3 = paramView.getWidth();
      i4 += i3;
      right = i4;
      i4 = top;
      i3 = paramView.getHeight();
      i4 += i3;
      bottom = i4;
      localObject3 = new android/graphics/Rect;
      ((Rect)localObject3).<init>();
      i4 = h.getDefaultDisplay().getWidth();
      right = i4;
      i4 = h.getDefaultDisplay().getHeight();
      bottom = i4;
      localObject1 = new android/graphics/Rect;
      ((Rect)localObject1).<init>();
      i4 = 0;
      bool4 = paramView.getGlobalVisibleRect((Rect)localObject1, null);
      localRect1 = new android/graphics/Rect;
      localRect1.<init>();
      bool5 = paramView.getLocalVisibleRect(localRect1);
      localRect2 = new android/graphics/Rect;
      localRect2.<init>();
      paramView.getHitRect(localRect2);
      localObject2 = j();
      i6 = paramView.getWindowVisibility();
      localObject4 = ((JSONObject)localObject2).put("windowVisibility", i6).put("isAttachedToWindow", bool3);
      localObject7 = new org/json/JSONObject;
      ((JSONObject)localObject7).<init>();
      i7 = a(top, (DisplayMetrics)localObject5);
      localObject7 = ((JSONObject)localObject7).put("top", i7);
      i7 = a(bottom, (DisplayMetrics)localObject5);
      localObject7 = ((JSONObject)localObject7).put("bottom", i7);
      i7 = a(left, (DisplayMetrics)localObject5);
      localObject7 = ((JSONObject)localObject7).put("left", i7);
      str = "right";
      i3 = a(right, (DisplayMetrics)localObject5);
      localObject3 = ((JSONObject)localObject7).put(str, i3);
      localObject4 = ((JSONObject)localObject4).put("viewBox", localObject3);
      localObject8 = new org/json/JSONObject;
      ((JSONObject)localObject8).<init>();
      i8 = a(top, (DisplayMetrics)localObject5);
      localObject8 = ((JSONObject)localObject8).put("top", i8);
      i8 = a(bottom, (DisplayMetrics)localObject5);
      localObject8 = ((JSONObject)localObject8).put("bottom", i8);
      i8 = a(left, (DisplayMetrics)localObject5);
      localObject8 = ((JSONObject)localObject8).put("left", i8);
      localObject7 = "right";
      i9 = a(right, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject8).put((String)localObject7, i9);
      localObject4 = ((JSONObject)localObject4).put("adBox", localObject6);
      localObject6 = new org/json/JSONObject;
      ((JSONObject)localObject6).<init>();
      i6 = a(top, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("top", i6);
      i6 = a(bottom, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("bottom", i6);
      i6 = a(left, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("left", i6);
      localObject8 = "right";
      i2 = a(right, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put((String)localObject8, i2);
      localObject4 = ((JSONObject)localObject4).put("globalVisibleBox", localObject6).put("globalVisibleBoxVisible", bool4);
      localObject6 = new org/json/JSONObject;
      ((JSONObject)localObject6).<init>();
      i5 = a(top, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("top", i5);
      i5 = a(bottom, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("bottom", i5);
      i5 = a(left, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("left", i5);
      i5 = a(right, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("right", i5);
      localObject4 = ((JSONObject)localObject4).put("localVisibleBox", localObject6).put("localVisibleBoxVisible", bool5);
      localObject6 = new org/json/JSONObject;
      ((JSONObject)localObject6).<init>();
      i5 = a(top, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("top", i5);
      i5 = a(bottom, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("bottom", i5);
      i5 = a(left, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put("left", i5);
      localObject1 = "right";
      i5 = a(right, (DisplayMetrics)localObject5);
      localObject6 = ((JSONObject)localObject6).put((String)localObject1, i5);
      localObject4 = ((JSONObject)localObject4).put("hitBox", localObject6);
      f1 = density;
      d1 = f1;
      localObject4 = ((JSONObject)localObject4).put("screenDensity", d1);
      localObject3 = "isVisible";
      w.e();
      localObject5 = i;
      localObject6 = j;
      bool1 = tt.a(paramView, (PowerManager)localObject5, (KeyguardManager)localObject6);
      ((JSONObject)localObject4).put((String)localObject3, bool1);
    }
  }
  
  private static JSONObject a(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    localJSONArray.put(paramJSONObject);
    localJSONObject.put("units", localJSONArray);
    return localJSONObject;
  }
  
  private void a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = a(paramJSONObject);
      Object localObject2 = new java/util/ArrayList;
      Object localObject3 = t;
      ((ArrayList)localObject2).<init>((Collection)localObject3);
      localObject3 = ((ArrayList)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject3).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = ((Iterator)localObject3).next();
        localObject2 = (ha)localObject2;
        ((ha)localObject2).a((JSONObject)localObject1, paramBoolean);
      }
      return;
    }
    finally
    {
      localObject1 = "Skipping active view message.";
      tp.b((String)localObject1, localThrowable);
    }
  }
  
  private void h()
  {
    gx localgx = k;
    if (localgx != null)
    {
      localgx = k;
      localgx.a(this);
    }
  }
  
  private void i()
  {
    ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)e.get();
    if (localViewTreeObserver != null)
    {
      boolean bool = localViewTreeObserver.isAlive();
      if (bool) {
        break label25;
      }
    }
    for (;;)
    {
      return;
      label25:
      localViewTreeObserver.removeOnScrollChangedListener(this);
      localViewTreeObserver.removeGlobalOnLayoutListener(this);
    }
  }
  
  private JSONObject j()
  {
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>();
    String str = b.d;
    JSONObject localJSONObject2 = localJSONObject1.put("afmaVersion", str);
    Object localObject = b.b;
    localJSONObject2 = localJSONObject2.put("activeViewJSON", localObject);
    long l1 = w.k().b();
    localJSONObject2 = localJSONObject2.put("timestamp", l1);
    localObject = b.a;
    localJSONObject2 = localJSONObject2.put("adFormat", localObject);
    localObject = b.c;
    localJSONObject2 = localJSONObject2.put("hashCode", localObject);
    boolean bool = b.e;
    localJSONObject2 = localJSONObject2.put("isMraid", bool);
    bool = n;
    localJSONObject2 = localJSONObject2.put("isStopped", bool);
    bool = m;
    localJSONObject2 = localJSONObject2.put("isPaused", bool);
    bool = i.isScreenOn();
    localJSONObject2 = localJSONObject2.put("isScreenOn", bool);
    bool = b.f;
    localJSONObject2 = localJSONObject2.put("isNative", bool);
    w.e();
    bool = tt.e();
    localJSONObject2 = localJSONObject2.put("appMuted", bool);
    w.e();
    double d1 = tt.d();
    localJSONObject2 = localJSONObject2.put("appVolume", d1);
    w.e();
    d1 = tt.h(g);
    localJSONObject2.put("deviceVolume", d1);
    return localJSONObject1;
  }
  
  public final void a()
  {
    synchronized (a)
    {
      boolean bool1 = o;
      if (bool1)
      {
        bool1 = true;
        p = bool1;
      }
      try
      {
        localObject2 = j();
        str2 = "doneReasonCode";
        String str3 = "u";
        ((JSONObject)localObject2).put(str2, str3);
        boolean bool2 = true;
        a((JSONObject)localObject2, bool2);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          Object localObject2;
          int i1;
          str2 = "JSON failure while processing active view data.";
          tp.b(str2, localJSONException);
        }
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      catch (RuntimeException localRuntimeException)
      {
        for (;;)
        {
          String str2 = "Failure while processing active view data.";
          tp.b(str2, localRuntimeException);
          continue;
          String str1 = new java/lang/String;
          str1.<init>(str2);
        }
      }
      str2 = "Untracking ad unit: ";
      localObject2 = b;
      localObject2 = c;
      localObject2 = String.valueOf(localObject2);
      i1 = ((String)localObject2).length();
      if (i1 != 0)
      {
        localObject2 = str2.concat((String)localObject2);
        tp.b((String)localObject2);
        return;
      }
    }
  }
  
  protected final void a(int paramInt)
  {
    boolean bool1 = false;
    int i1 = 1;
    for (;;)
    {
      View localView;
      synchronized (a)
      {
        Object localObject2 = t;
        localObject5 = ((HashSet)localObject2).iterator();
        boolean bool2 = ((Iterator)localObject5).hasNext();
        boolean bool3;
        if (bool2)
        {
          localObject2 = ((Iterator)localObject5).next();
          localObject2 = (ha)localObject2;
          bool2 = ((ha)localObject2).a();
          if (!bool2) {
            continue;
          }
          int i2 = i1;
          if (i2 != 0)
          {
            bool3 = o;
            if (bool3) {
              continue;
            }
          }
        }
        else
        {
          bool3 = false;
          localObject2 = null;
          continue;
        }
        localObject2 = f;
        localView = ((he)localObject2).a();
        if (localView != null)
        {
          w.e();
          localObject2 = i;
          localObject5 = j;
          bool3 = tt.a(localView, (PowerManager)localObject2, (KeyguardManager)localObject5);
          if (bool3)
          {
            localObject2 = new android/graphics/Rect;
            ((Rect)localObject2).<init>();
            i5 = 0;
            localObject5 = null;
            bool3 = localView.getGlobalVisibleRect((Rect)localObject2, null);
            if (bool3)
            {
              i5 = i1;
              localObject2 = f;
              bool3 = ((he)localObject2).b();
              if (!bool3) {
                break label235;
              }
              a();
            }
          }
        }
      }
      int i5 = 0;
      Object localObject5 = null;
      continue;
      label235:
      int i3;
      if (paramInt == i1) {
        i3 = i1;
      }
      int i4;
      for (;;)
      {
        if (i3 == 0) {
          break label294;
        }
        localObject4 = s;
        i4 = ((ue)localObject4).a();
        if (i4 != 0) {
          break label294;
        }
        i4 = q;
        if (i5 != i4) {
          break label294;
        }
        break;
        i4 = 0;
        localObject4 = null;
      }
      label294:
      if (i5 == 0)
      {
        i4 = q;
        if ((i4 == 0) && (paramInt == i1)) {
          continue;
        }
      }
      try
      {
        localObject4 = a(localView);
        i1 = 0;
        localObject6 = null;
        a((JSONObject)localObject4, false);
        q = i5;
      }
      catch (RuntimeException localRuntimeException)
      {
        for (;;)
        {
          Object localObject6 = "Active view update failed.";
          tp.a((String)localObject6, localRuntimeException);
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
      Object localObject4 = f;
      localObject4 = ((he)localObject4).c();
      localObject6 = ((he)localObject4).a();
      if (localObject6 != null)
      {
        localObject4 = e;
        localObject4 = ((WeakReference)localObject4).get();
        localObject4 = (ViewTreeObserver)localObject4;
        localObject6 = ((View)localObject6).getViewTreeObserver();
        if (localObject6 != localObject4)
        {
          i();
          bool1 = l;
          if (bool1)
          {
            if (localObject4 != null)
            {
              i4 = ((ViewTreeObserver)localObject4).isAlive();
              if (i4 == 0) {}
            }
          }
          else
          {
            i4 = 1;
            l = i4;
            ((ViewTreeObserver)localObject6).addOnScrollChangedListener(this);
            ((ViewTreeObserver)localObject6).addOnGlobalLayoutListener(this);
          }
          localObject4 = new java/lang/ref/WeakReference;
          ((WeakReference)localObject4).<init>(localObject6);
          e = ((WeakReference)localObject4);
        }
      }
      h();
    }
  }
  
  public final void a(gx paramgx)
  {
    synchronized (a)
    {
      k = paramgx;
      return;
    }
  }
  
  final void a(ha paramha)
  {
    String str1 = "Received request to untrack: ";
    String str2 = String.valueOf(b.c);
    int i1 = str2.length();
    if (i1 != 0) {
      str2 = str1.concat(str2);
    }
    for (;;)
    {
      tp.b(str2);
      c(paramha);
      return;
      str2 = new java/lang/String;
      str2.<init>(str1);
    }
  }
  
  final boolean a(Map paramMap)
  {
    boolean bool1;
    String str1;
    if (paramMap == null)
    {
      bool1 = false;
      str1 = null;
    }
    for (;;)
    {
      return bool1;
      str1 = (String)paramMap.get("hashCode");
      boolean bool2 = TextUtils.isEmpty(str1);
      if (!bool2)
      {
        String str2 = b.c;
        bool1 = str1.equals(str2);
        if (bool1)
        {
          bool1 = true;
          continue;
        }
      }
      bool1 = false;
      str1 = null;
    }
  }
  
  public final void b(ha paramha)
  {
    Object localObject1 = t;
    boolean bool = ((HashSet)localObject1).isEmpty();
    if (bool) {}
    synchronized (a)
    {
      localObject1 = c;
      if (localObject1 != null)
      {
        int i1 = 3;
        a(i1);
        localObject1 = t;
        ((HashSet)localObject1).add(paramha);
      }
      try
      {
        localObject1 = f;
        localObject1 = ((he)localObject1).a();
        localObject1 = a((View)localObject1);
        localObject1 = a((JSONObject)localObject1);
        ??? = null;
        paramha.a((JSONObject)localObject1, false);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          Object localObject4;
          BroadcastReceiver localBroadcastReceiver;
          ??? = "Skipping measurement update for new client.";
          tp.b((String)???, localJSONException);
        }
      }
      localObject1 = new android/content/IntentFilter;
      ((IntentFilter)localObject1).<init>();
      localObject4 = "android.intent.action.SCREEN_ON";
      ((IntentFilter)localObject1).addAction((String)localObject4);
      localObject4 = "android.intent.action.SCREEN_OFF";
      ((IntentFilter)localObject1).addAction((String)localObject4);
      localObject4 = new com/google/android/gms/b/gw$1;
      ((gw.1)localObject4).<init>(this);
      c = ((BroadcastReceiver)localObject4);
      localObject4 = g;
      localBroadcastReceiver = c;
      ((Context)localObject4).registerReceiver(localBroadcastReceiver, (IntentFilter)localObject1);
    }
  }
  
  final void b(Map paramMap)
  {
    Object localObject1 = "isVisible";
    boolean bool1 = paramMap.containsKey(localObject1);
    if (!bool1) {
      return;
    }
    localObject1 = "1";
    Object localObject2 = paramMap.get("isVisible");
    bool1 = ((String)localObject1).equals(localObject2);
    if (!bool1)
    {
      localObject1 = "true";
      localObject2 = paramMap.get("isVisible");
      ((String)localObject1).equals(localObject2);
    }
    localObject1 = r.iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      ((Iterator)localObject1).next();
    }
  }
  
  public final boolean b()
  {
    synchronized (a)
    {
      boolean bool = o;
      return bool;
    }
  }
  
  final void c()
  {
    a(3);
  }
  
  public final void c(ha paramha)
  {
    t.remove(paramha);
    paramha.b();
    Object localObject1 = t;
    boolean bool = ((HashSet)localObject1).isEmpty();
    Object localObject6;
    if (bool) {
      synchronized (a)
      {
        i();
      }
    }
    String str;
  }
  
  public final void d()
  {
    Object localObject1 = a;
    int i1 = 1;
    try
    {
      n = i1;
      i1 = 3;
      a(i1);
      return;
    }
    finally {}
  }
  
  public final void e()
  {
    Object localObject1 = a;
    int i1 = 1;
    try
    {
      m = i1;
      i1 = 3;
      a(i1);
      return;
    }
    finally {}
  }
  
  public final void f()
  {
    Object localObject1 = a;
    int i1 = 0;
    Object localObject2 = null;
    try
    {
      m = false;
      i1 = 3;
      a(i1);
      return;
    }
    finally {}
  }
  
  public final gu g()
  {
    return b;
  }
  
  public final void onGlobalLayout()
  {
    a(2);
  }
  
  public final void onScrollChanged()
  {
    a(1);
  }
}


/* Location:              com/google/android/gms/b/gw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */