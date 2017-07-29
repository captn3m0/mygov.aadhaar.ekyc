package com.google.android.gms.b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class gw
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  protected final Object a = new Object();
  protected final gu b;
  BroadcastReceiver c;
  private final WeakReference<tg> d;
  private WeakReference<ViewTreeObserver> e;
  private final he f;
  private final Context g;
  private final WindowManager h;
  private final PowerManager i;
  private final KeyguardManager j;
  private gx k;
  private boolean l;
  private boolean m = false;
  private boolean n = false;
  private boolean o;
  private boolean p;
  private boolean q;
  private final HashSet<Object> r = new HashSet();
  private ue s;
  private final HashSet<ha> t = new HashSet();
  
  public gw(Context paramContext, il paramil, tg paramtg, un paramun, he paramhe)
  {
    d = new WeakReference(paramtg);
    f = paramhe;
    e = new WeakReference(null);
    o = true;
    q = false;
    s = new ue(200L);
    b = new gu(UUID.randomUUID().toString(), paramun, a, j, paramtg.a(), h);
    h = ((WindowManager)paramContext.getSystemService("window"));
    i = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
    j = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    g = paramContext;
  }
  
  private static int a(int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    float f1 = density;
    return (int)(paramInt / f1);
  }
  
  private JSONObject a(View paramView)
  {
    if (paramView == null) {
      return j().put("isAttachedToWindow", false).put("isScreenOn", i.isScreenOn()).put("isVisible", false);
    }
    boolean bool1 = w.g().a(paramView);
    Object localObject2 = new int[2];
    Object localObject1 = new int[2];
    try
    {
      paramView.getLocationOnScreen((int[])localObject2);
      paramView.getLocationInWindow((int[])localObject1);
      localObject1 = paramView.getContext().getResources().getDisplayMetrics();
      Rect localRect1 = new Rect();
      left = localObject2[0];
      top = localObject2[1];
      right = (left + paramView.getWidth());
      bottom = (top + paramView.getHeight());
      Rect localRect2 = new Rect();
      right = h.getDefaultDisplay().getWidth();
      bottom = h.getDefaultDisplay().getHeight();
      Rect localRect3 = new Rect();
      boolean bool2 = paramView.getGlobalVisibleRect(localRect3, null);
      Rect localRect4 = new Rect();
      boolean bool3 = paramView.getLocalVisibleRect(localRect4);
      Rect localRect5 = new Rect();
      paramView.getHitRect(localRect5);
      localObject2 = j();
      localObject1 = ((JSONObject)localObject2).put("windowVisibility", paramView.getWindowVisibility()).put("isAttachedToWindow", bool1).put("viewBox", new JSONObject().put("top", a(top, (DisplayMetrics)localObject1)).put("bottom", a(bottom, (DisplayMetrics)localObject1)).put("left", a(left, (DisplayMetrics)localObject1)).put("right", a(right, (DisplayMetrics)localObject1))).put("adBox", new JSONObject().put("top", a(top, (DisplayMetrics)localObject1)).put("bottom", a(bottom, (DisplayMetrics)localObject1)).put("left", a(left, (DisplayMetrics)localObject1)).put("right", a(right, (DisplayMetrics)localObject1))).put("globalVisibleBox", new JSONObject().put("top", a(top, (DisplayMetrics)localObject1)).put("bottom", a(bottom, (DisplayMetrics)localObject1)).put("left", a(left, (DisplayMetrics)localObject1)).put("right", a(right, (DisplayMetrics)localObject1))).put("globalVisibleBoxVisible", bool2).put("localVisibleBox", new JSONObject().put("top", a(top, (DisplayMetrics)localObject1)).put("bottom", a(bottom, (DisplayMetrics)localObject1)).put("left", a(left, (DisplayMetrics)localObject1)).put("right", a(right, (DisplayMetrics)localObject1))).put("localVisibleBoxVisible", bool3).put("hitBox", new JSONObject().put("top", a(top, (DisplayMetrics)localObject1)).put("bottom", a(bottom, (DisplayMetrics)localObject1)).put("left", a(left, (DisplayMetrics)localObject1)).put("right", a(right, (DisplayMetrics)localObject1))).put("screenDensity", density);
      w.e();
      ((JSONObject)localObject1).put("isVisible", tt.a(paramView, i, j));
      return (JSONObject)localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        tp.b("Failure getting view location.", localException);
      }
    }
  }
  
  private static JSONObject a(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    localJSONArray.put(paramJSONObject);
    localJSONObject.put("units", localJSONArray);
    return localJSONObject;
  }
  
  private void a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    try
    {
      paramJSONObject = a(paramJSONObject);
      Iterator localIterator = new ArrayList(t).iterator();
      while (localIterator.hasNext()) {
        ((ha)localIterator.next()).a(paramJSONObject, paramBoolean);
      }
      return;
    }
    catch (Throwable paramJSONObject)
    {
      tp.b("Skipping active view message.", paramJSONObject);
    }
  }
  
  private void h()
  {
    if (k != null) {
      k.a(this);
    }
  }
  
  private void i()
  {
    ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)e.get();
    if ((localViewTreeObserver == null) || (!localViewTreeObserver.isAlive())) {
      return;
    }
    localViewTreeObserver.removeOnScrollChangedListener(this);
    localViewTreeObserver.removeGlobalOnLayoutListener(this);
  }
  
  private JSONObject j()
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = localJSONObject1.put("afmaVersion", b.d).put("activeViewJSON", b.b).put("timestamp", w.k().b()).put("adFormat", b.a).put("hashCode", b.c).put("isMraid", b.e).put("isStopped", n).put("isPaused", m).put("isScreenOn", i.isScreenOn()).put("isNative", b.f);
    w.e();
    localJSONObject2 = localJSONObject2.put("appMuted", tt.e());
    w.e();
    localJSONObject2 = localJSONObject2.put("appVolume", tt.d());
    w.e();
    localJSONObject2.put("deviceVolume", tt.h(g));
    return localJSONObject1;
  }
  
  public final void a()
  {
    synchronized (a)
    {
      if (o) {
        p = true;
      }
    }
    try
    {
      Object localObject1 = j();
      ((JSONObject)localObject1).put("doneReasonCode", "u");
      a((JSONObject)localObject1, true);
      localObject1 = String.valueOf(b.c);
      if (((String)localObject1).length() != 0)
      {
        localObject1 = "Untracking ad unit: ".concat((String)localObject1);
        tp.b((String)localObject1);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        tp.b("JSON failure while processing active view data.", localJSONException);
      }
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        tp.b("Failure while processing active view data.", localRuntimeException);
        continue;
        String str = new String("Untracking ad unit: ");
      }
    }
  }
  
  protected final void a(int paramInt)
  {
    for (;;)
    {
      int i1;
      synchronized (a)
      {
        Object localObject1 = t.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label344;
        }
        if (!((ha)((Iterator)localObject1).next()).a()) {
          continue;
        }
        i1 = 1;
        if ((i1 == 0) || (!o)) {
          return;
        }
        localObject1 = f.a();
        if (localObject1 != null)
        {
          w.e();
          if ((tt.a((View)localObject1, i, j)) && (((View)localObject1).getGlobalVisibleRect(new Rect(), null)))
          {
            bool = true;
            if (!f.b()) {
              break label150;
            }
            a();
            return;
          }
        }
      }
      boolean bool = false;
      continue;
      label150:
      if (paramInt == 1)
      {
        i1 = 1;
        if ((i1 != 0) && (!s.a()) && (bool == q)) {
          return;
        }
        if ((!bool) && (!q) && (paramInt == 1)) {
          return;
        }
      }
      try
      {
        a(a(localView), false);
        q = bool;
        for (;;)
        {
          Object localObject3 = f.c().a();
          ViewTreeObserver localViewTreeObserver;
          if (localObject3 != null)
          {
            localViewTreeObserver = (ViewTreeObserver)e.get();
            localObject3 = ((View)localObject3).getViewTreeObserver();
            if (localObject3 != localViewTreeObserver)
            {
              i();
              if ((!l) || ((localViewTreeObserver != null) && (localViewTreeObserver.isAlive())))
              {
                l = true;
                ((ViewTreeObserver)localObject3).addOnScrollChangedListener(this);
                ((ViewTreeObserver)localObject3).addOnGlobalLayoutListener(this);
              }
              e = new WeakReference(localObject3);
            }
          }
          h();
          return;
          tp.a("Active view update failed.", localViewTreeObserver);
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
        i1 = 0;
        continue;
        i1 = 0;
      }
      catch (RuntimeException localRuntimeException)
      {
        label344:
        for (;;) {}
      }
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
    String str = String.valueOf(b.c);
    if (str.length() != 0) {}
    for (str = "Received request to untrack: ".concat(str);; str = new String("Received request to untrack: "))
    {
      tp.b(str);
      c(paramha);
      return;
    }
  }
  
  final boolean a(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return false;
    }
    paramMap = (String)paramMap.get("hashCode");
    return (!TextUtils.isEmpty(paramMap)) && (paramMap.equals(b.c));
  }
  
  public final void b(ha paramha)
  {
    if (t.isEmpty()) {}
    synchronized (a)
    {
      if (c != null)
      {
        a(3);
        t.add(paramha);
      }
      try
      {
        paramha.a(a(a(f.a())), false);
        return;
      }
      catch (JSONException paramha)
      {
        IntentFilter localIntentFilter;
        tp.b("Skipping measurement update for new client.", paramha);
      }
      localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      c = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          a(3);
        }
      };
      g.registerReceiver(c, localIntentFilter);
    }
  }
  
  final void b(Map<String, String> paramMap)
  {
    if (!paramMap.containsKey("isVisible")) {}
    for (;;)
    {
      return;
      if (!"1".equals(paramMap.get("isVisible"))) {
        "true".equals(paramMap.get("isVisible"));
      }
      paramMap = r.iterator();
      while (paramMap.hasNext()) {
        paramMap.next();
      }
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
  
  public final void c(ha arg1)
  {
    t.remove(???);
    ???.b();
    if (t.isEmpty())
    {
      synchronized (a)
      {
        i();
        synchronized (a)
        {
          BroadcastReceiver localBroadcastReceiver = c;
          if (localBroadcastReceiver == null) {}
        }
      }
      try
      {
        g.unregisterReceiver(c);
        c = null;
        o = false;
        h();
        ??? = new ArrayList(t).iterator();
        while (((Iterator)???).hasNext())
        {
          c((ha)((Iterator)???).next());
          continue;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          tp.b("Failed trying to unregister the receiver", localIllegalStateException);
        }
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.i().a(localException, "ActiveViewUnit.stopScreenStatusMonitoring");
        }
      }
    }
  }
  
  public final void d()
  {
    synchronized (a)
    {
      n = true;
      a(3);
      return;
    }
  }
  
  public final void e()
  {
    synchronized (a)
    {
      m = true;
      a(3);
      return;
    }
  }
  
  public final void f()
  {
    synchronized (a)
    {
      m = false;
      a(3);
      return;
    }
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
  
  public static final class a
    implements he
  {
    private WeakReference<lc> a;
    
    public a(lc paramlc)
    {
      a = new WeakReference(paramlc);
    }
    
    public final View a()
    {
      lc locallc = (lc)a.get();
      if (locallc != null) {
        return locallc.e();
      }
      return null;
    }
    
    public final boolean b()
    {
      return a.get() == null;
    }
    
    public final he c()
    {
      return new gw.b((lc)a.get());
    }
  }
  
  public static final class b
    implements he
  {
    private lc a;
    
    public b(lc paramlc)
    {
      a = paramlc;
    }
    
    public final View a()
    {
      if (a != null) {
        return a.e();
      }
      return null;
    }
    
    public final boolean b()
    {
      return a == null;
    }
    
    public final he c()
    {
      return this;
    }
  }
  
  public static final class c
    implements he
  {
    private final View a;
    private final tg b;
    
    public c(View paramView, tg paramtg)
    {
      a = paramView;
      b = paramtg;
    }
    
    public final View a()
    {
      return a;
    }
    
    public final boolean b()
    {
      return (b == null) || (a == null);
    }
    
    public final he c()
    {
      return this;
    }
  }
  
  public static final class d
    implements he
  {
    private final WeakReference<View> a;
    private final WeakReference<tg> b;
    
    public d(View paramView, tg paramtg)
    {
      a = new WeakReference(paramView);
      b = new WeakReference(paramtg);
    }
    
    public final View a()
    {
      return (View)a.get();
    }
    
    public final boolean b()
    {
      return (a.get() == null) || (b.get() == null);
    }
    
    public final he c()
    {
      return new gw.c((View)a.get(), (tg)b.get());
    }
  }
}


/* Location:              com/google/android/gms/b/gw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */