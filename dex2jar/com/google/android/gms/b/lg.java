package com.google.android.gms.b;

import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class lg
  extends lj.a
  implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  static final String[] a = { "2011", "1009" };
  FrameLayout b;
  Map<String, WeakReference<View>> c = new HashMap();
  View d;
  lc e;
  boolean f = false;
  Point g = new Point();
  Point h = new Point();
  WeakReference<hb> i = new WeakReference(null);
  private final Object j = new Object();
  private final FrameLayout k;
  
  public lg(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    k = paramFrameLayout1;
    b = paramFrameLayout2;
    w.C();
    ux.a(k, this);
    w.C();
    ux.a(k, this);
    k.setOnTouchListener(this);
    k.setOnClickListener(this);
    ke.a(k.getContext());
  }
  
  private int a(int paramInt)
  {
    ip.a();
    return uk.b(e.f(), paramInt);
  }
  
  private void a(View paramView)
  {
    if (e != null) {
      if (!(e instanceof la)) {
        break label40;
      }
    }
    label40:
    for (lc locallc = ((la)e).c();; locallc = e)
    {
      if (locallc != null) {
        locallc.a(paramView);
      }
      return;
    }
  }
  
  public final com.google.android.gms.a.a a(String paramString)
  {
    Object localObject1 = null;
    for (;;)
    {
      synchronized (j)
      {
        if (c == null) {
          return null;
        }
        paramString = (WeakReference)c.get(paramString);
        if (paramString == null)
        {
          paramString = (String)localObject1;
          paramString = b.a(paramString);
          return paramString;
        }
      }
      paramString = (View)paramString.get();
    }
  }
  
  public final void a()
  {
    synchronized (j)
    {
      if (b != null) {
        b.removeAllViews();
      }
      b = null;
      c = null;
      d = null;
      e = null;
      g = null;
      h = null;
      i = null;
      return;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama)
  {
    ld localld1 = null;
    for (;;)
    {
      final ld localld2;
      Object localObject1;
      boolean bool;
      synchronized (j)
      {
        a(null);
        parama = b.a(parama);
        if (!(parama instanceof ld))
        {
          tp.e("Not an instance of native engine. This is most likely a transient error");
          return;
        }
        if (b != null)
        {
          b.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
          k.requestLayout();
        }
        f = true;
        localld2 = (ld)parama;
        if (e != null)
        {
          parama = ke.cj;
          if (((Boolean)w.q().a(parama)).booleanValue()) {
            e.b(k, c);
          }
        }
        if ((e instanceof ld))
        {
          parama = (ld)e;
          if ((w.D().b()) && (parama != null) && (b != null))
          {
            parama = parama.g();
            if (parama != null) {
              parama.a(false);
            }
            localObject1 = (hb)i.get();
            if ((localObject1 != null) && (parama != null)) {
              c.remove(parama);
            }
          }
        }
        if (((e instanceof la)) && (((la)e).b()))
        {
          ((la)e).a(localld2);
          parama = ke.cj;
          if (((Boolean)w.q().a(parama)).booleanValue()) {
            b.setClickable(false);
          }
          b.removeAllViews();
          bool = localld2.a();
          localObject1 = localld1;
          if (!bool) {
            break label633;
          }
          localObject1 = localld1;
          if (c == null) {
            break label633;
          }
          parama = (WeakReference)c.get("1098");
          if (parama == null) {
            break label646;
          }
          parama = (View)parama.get();
          localObject1 = localld1;
          if (!(parama instanceof ViewGroup)) {
            break label633;
          }
          localObject1 = (ViewGroup)parama;
          break label633;
          d = localld2.a(this, bool);
          if (d != null)
          {
            if (c != null) {
              c.put("1007", new WeakReference(d));
            }
            if (!bool) {
              break label581;
            }
            ((ViewGroup)localObject1).removeAllViews();
            ((ViewGroup)localObject1).addView(d);
          }
          localld2.a(k, c, this, this);
          tt.a.post(new Runnable()
          {
            public final void run()
            {
              vc localvc = localld2.d();
              if ((localvc != null) && (b != null)) {
                b.addView(localvc.b());
              }
              if (!(localld2 instanceof la)) {
                lg.a(lg.this, localld2);
              }
            }
          });
          a(k);
          if ((e instanceof ld))
          {
            localld1 = (ld)e;
            if ((w.D().b()) && (localld1 != null) && (b != null))
            {
              localObject1 = (hb)i.get();
              parama = (com.google.android.gms.a.a)localObject1;
              if (localObject1 == null)
              {
                parama = new hb(k.getContext(), k);
                i = new WeakReference(parama);
              }
              parama.a(localld1.g());
            }
          }
          return;
        }
      }
      e = localld2;
      if ((localld2 instanceof la))
      {
        ((la)localld2).a(null);
        continue;
        label581:
        parama = new com.google.android.gms.ads.b.a(b);
        parama.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        parama.addView(d);
        if (b != null)
        {
          b.addView(parama);
          continue;
          label633:
          if ((bool) && (localObject1 != null))
          {
            bool = true;
            continue;
            label646:
            parama = null;
          }
          else
          {
            bool = false;
          }
        }
      }
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, int paramInt)
  {
    if (w.D().b())
    {
      parama = (hb)i.get();
      if (parama != null) {
        parama.a(4);
      }
    }
  }
  
  public final void a(String paramString, com.google.android.gms.a.a arg2)
  {
    View localView = (View)b.a(???);
    for (;;)
    {
      synchronized (j)
      {
        if (c == null) {
          return;
        }
        if (localView == null)
        {
          c.remove(paramString);
          return;
        }
      }
      c.put(paramString, new WeakReference(localView));
      if ("1098".equals(paramString)) {
        return;
      }
      localView.setOnTouchListener(this);
      localView.setClickable(true);
      localView.setOnClickListener(this);
    }
  }
  
  public final void onClick(View paramView)
  {
    JSONObject localJSONObject;
    synchronized (j)
    {
      if (e == null) {
        return;
      }
      localJSONObject = new JSONObject();
    }
    try
    {
      localJSONObject.put("x", a(g.x));
      localJSONObject.put("y", a(g.y));
      localJSONObject.put("start_x", a(h.x));
      localJSONObject.put("start_y", a(h.y));
      if ((d != null) && (d.equals(paramView))) {
        if ((e instanceof la))
        {
          if (((la)e).c() != null) {
            ((la)e).c().a(paramView, "1007", localJSONObject, c, k);
          }
          return;
          paramView = finally;
          throw paramView;
        }
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        tp.e("Unable to get click location");
        continue;
        e.a(paramView, "1007", localJSONObject, c, k);
        continue;
        e.a(paramView, c, localJSONObject, k);
      }
    }
  }
  
  public final void onGlobalLayout()
  {
    synchronized (j)
    {
      if (f)
      {
        int m = k.getMeasuredWidth();
        int n = k.getMeasuredHeight();
        if ((m != 0) && (n != 0) && (b != null))
        {
          b.setLayoutParams(new FrameLayout.LayoutParams(m, n));
          f = false;
        }
      }
      if (e != null) {
        e.c(k, c);
      }
      return;
    }
  }
  
  public final void onScrollChanged()
  {
    synchronized (j)
    {
      if (e != null) {
        e.c(k, c);
      }
      return;
    }
  }
  
  public final boolean onTouch(View arg1, MotionEvent paramMotionEvent)
  {
    synchronized (j)
    {
      if (e == null) {
        return false;
      }
      Object localObject = new int[2];
      k.getLocationOnScreen((int[])localObject);
      float f1 = paramMotionEvent.getRawX();
      float f2 = localObject[0];
      float f3 = paramMotionEvent.getRawY();
      float f4 = localObject[1];
      localObject = new Point((int)(f1 - f2), (int)(f3 - f4));
      g = ((Point)localObject);
      if (paramMotionEvent.getAction() == 0) {
        h = ((Point)localObject);
      }
      paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
      paramMotionEvent.setLocation(x, y);
      e.a(paramMotionEvent);
      paramMotionEvent.recycle();
      return false;
    }
  }
}


/* Location:              com/google/android/gms/b/lg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */