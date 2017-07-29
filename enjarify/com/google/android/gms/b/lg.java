package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
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

public final class lg
  extends lj.a
  implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  static final String[] a;
  FrameLayout b;
  Map c;
  View d;
  lc e;
  boolean f;
  Point g;
  Point h;
  WeakReference i;
  private final Object j;
  private final FrameLayout k;
  
  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "2011";
    arrayOfString[1] = "1009";
    a = arrayOfString;
  }
  
  public lg(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    j = localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    c = ((Map)localObject);
    f = false;
    localObject = new android/graphics/Point;
    ((Point)localObject).<init>();
    g = ((Point)localObject);
    localObject = new android/graphics/Point;
    ((Point)localObject).<init>();
    h = ((Point)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(null);
    i = ((WeakReference)localObject);
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
    lc locallc = e;
    if (locallc != null)
    {
      locallc = e;
      boolean bool = locallc instanceof la;
      if (!bool) {
        break label46;
      }
    }
    label46:
    for (locallc = ((la)e).c();; locallc = e)
    {
      if (locallc != null) {
        locallc.a(paramView);
      }
      return;
    }
  }
  
  public final com.google.android.gms.a.a a(String paramString)
  {
    Object localObject5;
    for (Object localObject1 = null;; localObject1 = localObject5)
    {
      synchronized (j)
      {
        Object localObject3 = c;
        if (localObject3 == null)
        {
          localObject3 = null;
          return (com.google.android.gms.a.a)localObject3;
        }
        localObject3 = c;
        localObject3 = ((Map)localObject3).get(paramString);
        localObject3 = (WeakReference)localObject3;
        if (localObject3 == null) {
          localObject3 = b.a(localObject1);
        }
      }
      localObject5 = ((WeakReference)localObject4).get();
      localObject5 = (View)localObject5;
    }
  }
  
  public final void a()
  {
    synchronized (j)
    {
      FrameLayout localFrameLayout = b;
      if (localFrameLayout != null)
      {
        localFrameLayout = b;
        localFrameLayout.removeAllViews();
      }
      localFrameLayout = null;
      b = null;
      localFrameLayout = null;
      c = null;
      localFrameLayout = null;
      d = null;
      localFrameLayout = null;
      e = null;
      localFrameLayout = null;
      g = null;
      localFrameLayout = null;
      h = null;
      localFrameLayout = null;
      i = null;
      return;
    }
  }
  
  public final void a(com.google.android.gms.a.a parama)
  {
    boolean bool1 = true;
    int m = 0;
    Object localObject1 = null;
    int n = 0;
    Object localObject2 = null;
    Object localObject3 = j;
    boolean bool2 = false;
    Object localObject4 = null;
    for (;;)
    {
      Object localObject5;
      Object localObject6;
      boolean bool5;
      Object localObject8;
      try
      {
        a(null);
        localObject4 = b.a(parama);
        bool3 = localObject4 instanceof ld;
        if (!bool3)
        {
          localObject4 = "Not an instance of native engine. This is most likely a transient error";
          tp.e((String)localObject4);
          return;
        }
        localObject5 = b;
        boolean bool4;
        Object localObject7;
        if (localObject5 != null)
        {
          localObject5 = b;
          localObject6 = new android/widget/FrameLayout$LayoutParams;
          bool4 = false;
          localObject7 = null;
          ((FrameLayout.LayoutParams)localObject6).<init>(0, 0);
          ((FrameLayout)localObject5).setLayoutParams((ViewGroup.LayoutParams)localObject6);
          localObject5 = k;
          ((FrameLayout)localObject5).requestLayout();
        }
        bool3 = true;
        f = bool3;
        localObject4 = (ld)localObject4;
        localObject5 = e;
        if (localObject5 != null)
        {
          localObject5 = ke.cj;
          localObject6 = w.q();
          localObject5 = ((kd)localObject6).a((jz)localObject5);
          localObject5 = (Boolean)localObject5;
          bool3 = ((Boolean)localObject5).booleanValue();
          if (bool3)
          {
            localObject5 = e;
            localObject6 = k;
            localObject7 = c;
            ((lc)localObject5).b((View)localObject6, (Map)localObject7);
          }
        }
        localObject5 = e;
        bool3 = localObject5 instanceof ld;
        if (bool3)
        {
          localObject5 = e;
          localObject5 = (ld)localObject5;
          localObject6 = w.D();
          bool5 = ((ta)localObject6).b();
          if ((bool5) && (localObject5 != null))
          {
            localObject6 = b;
            if (localObject6 != null)
            {
              localObject6 = ((ld)localObject5).g();
              if (localObject6 != null)
              {
                bool3 = false;
                localObject5 = null;
                ((sz)localObject6).a(false);
              }
              localObject5 = i;
              localObject5 = ((WeakReference)localObject5).get();
              localObject5 = (hb)localObject5;
              if ((localObject5 != null) && (localObject6 != null))
              {
                localObject5 = c;
                ((HashSet)localObject5).remove(localObject6);
              }
            }
          }
        }
        localObject5 = e;
        bool3 = localObject5 instanceof la;
        if (bool3)
        {
          localObject5 = e;
          localObject5 = (la)localObject5;
          bool3 = ((la)localObject5).b();
          if (bool3)
          {
            localObject5 = e;
            localObject5 = (la)localObject5;
            ((la)localObject5).a((lc)localObject4);
            localObject5 = ke.cj;
            localObject6 = w.q();
            localObject5 = ((kd)localObject6).a((jz)localObject5);
            localObject5 = (Boolean)localObject5;
            bool3 = ((Boolean)localObject5).booleanValue();
            if (bool3)
            {
              localObject5 = b;
              bool5 = false;
              localObject6 = null;
              ((FrameLayout)localObject5).setClickable(false);
            }
            localObject5 = b;
            ((FrameLayout)localObject5).removeAllViews();
            bool5 = ((ld)localObject4).a();
            if (bool5)
            {
              localObject5 = c;
              if (localObject5 != null)
              {
                localObject5 = c;
                localObject7 = "1098";
                localObject5 = ((Map)localObject5).get(localObject7);
                localObject5 = (WeakReference)localObject5;
                if (localObject5 == null) {
                  break label974;
                }
                localObject5 = ((WeakReference)localObject5).get();
                localObject5 = (View)localObject5;
                bool4 = localObject5 instanceof ViewGroup;
                if (bool4)
                {
                  localObject5 = (ViewGroup)localObject5;
                  localObject1 = localObject5;
                }
              }
            }
            if ((!bool5) || (localObject1 == null)) {
              break label983;
            }
            bool3 = bool1;
            localObject8 = ((ld)localObject4).a(this, bool3);
            d = ((View)localObject8);
            localObject8 = d;
            if (localObject8 != null)
            {
              localObject8 = c;
              if (localObject8 != null)
              {
                localObject8 = c;
                localObject2 = "1007";
                localObject6 = new java/lang/ref/WeakReference;
                localObject7 = d;
                ((WeakReference)localObject6).<init>(localObject7);
                ((Map)localObject8).put(localObject2, localObject6);
              }
              if (!bool3) {
                break label992;
              }
              ((ViewGroup)localObject1).removeAllViews();
              localObject5 = d;
              ((ViewGroup)localObject1).addView((View)localObject5);
            }
            localObject5 = k;
            localObject8 = c;
            ((ld)localObject4).a((View)localObject5, (Map)localObject8, this, this);
            localObject5 = tt.a;
            localObject8 = new com/google/android/gms/b/lg$1;
            ((lg.1)localObject8).<init>(this, (ld)localObject4);
            ((Handler)localObject5).post((Runnable)localObject8);
            localObject4 = k;
            a((View)localObject4);
            localObject4 = e;
            bool2 = localObject4 instanceof ld;
            if (bool2)
            {
              localObject4 = e;
              localObject4 = (ld)localObject4;
              localObject5 = w.D();
              bool3 = ((ta)localObject5).b();
              if ((bool3) && (localObject4 != null))
              {
                localObject5 = b;
                if (localObject5 != null)
                {
                  localObject5 = i;
                  localObject5 = ((WeakReference)localObject5).get();
                  localObject5 = (hb)localObject5;
                  if (localObject5 == null)
                  {
                    localObject5 = new com/google/android/gms/b/hb;
                    localObject8 = k;
                    localObject8 = ((FrameLayout)localObject8).getContext();
                    localObject2 = k;
                    ((hb)localObject5).<init>((Context)localObject8, (View)localObject2);
                    localObject8 = new java/lang/ref/WeakReference;
                    ((WeakReference)localObject8).<init>(localObject5);
                    i = ((WeakReference)localObject8);
                  }
                  localObject4 = ((ld)localObject4).g();
                  ((hb)localObject5).a((hb.b)localObject4);
                }
              }
            }
            continue;
          }
        }
        e = locallc;
      }
      finally {}
      boolean bool3 = locallc instanceof la;
      if (bool3)
      {
        Object localObject9 = locallc;
        localObject9 = (la)locallc;
        localObject5 = localObject9;
        bool5 = false;
        localObject6 = null;
        ((la)localObject9).a(null);
        continue;
        label974:
        bool3 = false;
        localObject5 = null;
        continue;
        label983:
        bool3 = false;
        localObject5 = null;
        continue;
        label992:
        localObject5 = b;
        localObject8 = new com/google/android/gms/ads/b/a;
        ((com.google.android.gms.ads.b.a)localObject8).<init>((Context)localObject5);
        localObject5 = new android/widget/FrameLayout$LayoutParams;
        n = -1;
        m = -1;
        ((FrameLayout.LayoutParams)localObject5).<init>(n, m);
        ((ViewGroup)localObject8).setLayoutParams((ViewGroup.LayoutParams)localObject5);
        localObject5 = d;
        ((ViewGroup)localObject8).addView((View)localObject5);
        localObject5 = b;
        if (localObject5 != null)
        {
          localObject5 = b;
          ((FrameLayout)localObject5).addView((View)localObject8);
        }
      }
    }
  }
  
  public final void a(com.google.android.gms.a.a parama, int paramInt)
  {
    Object localObject = w.D();
    boolean bool = ((ta)localObject).b();
    if (bool)
    {
      localObject = (hb)i.get();
      if (localObject != null)
      {
        int m = 4;
        ((hb)localObject).a(m);
      }
    }
  }
  
  public final void a(String paramString, com.google.android.gms.a.a parama)
  {
    Object localObject1 = (View)b.a(parama);
    for (;;)
    {
      synchronized (j)
      {
        localObject4 = c;
        if (localObject4 == null) {
          return;
        }
        if (localObject1 == null)
        {
          localObject1 = c;
          ((Map)localObject1).remove(paramString);
        }
      }
      Object localObject4 = c;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(localObject2);
      ((Map)localObject4).put(paramString, localWeakReference);
      localObject4 = "1098";
      boolean bool = ((String)localObject4).equals(paramString);
      if (bool) {}
      ((View)localObject2).setOnTouchListener(this);
      bool = true;
      ((View)localObject2).setClickable(bool);
      ((View)localObject2).setOnClickListener(this);
    }
  }
  
  public final void onClick(View paramView)
  {
    synchronized (j)
    {
      Object localObject2 = e;
      if (localObject2 == null) {
        return;
      }
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject2 = "x";
      try
      {
        localObject5 = g;
        int m = x;
        m = a(m);
        localJSONObject.put((String)localObject2, m);
        localObject2 = "y";
        localObject5 = g;
        m = y;
        m = a(m);
        localJSONObject.put((String)localObject2, m);
        localObject2 = "start_x";
        localObject5 = h;
        m = x;
        m = a(m);
        localJSONObject.put((String)localObject2, m);
        localObject2 = "start_y";
        localObject5 = h;
        m = y;
        m = a(m);
        localJSONObject.put((String)localObject2, m);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          boolean bool;
          Object localObject4 = "Unable to get click location";
          tp.e((String)localObject4);
          continue;
          localObject4 = e;
          Object localObject6 = "1007";
          Map localMap = c;
          FrameLayout localFrameLayout = k;
          Object localObject5 = paramView;
          ((lc)localObject4).a(paramView, (String)localObject6, localJSONObject, localMap, localFrameLayout);
          continue;
          localObject4 = e;
          localObject5 = c;
          localObject6 = k;
          ((lc)localObject4).a(paramView, (Map)localObject5, localJSONObject, (View)localObject6);
        }
      }
      localObject2 = d;
      if (localObject2 != null)
      {
        localObject2 = d;
        bool = localObject2.equals(paramView);
        if (bool)
        {
          localObject2 = e;
          bool = localObject2 instanceof la;
          if (bool)
          {
            localObject2 = e;
            localObject2 = (la)localObject2;
            localObject2 = ((la)localObject2).c();
            if (localObject2 != null)
            {
              localObject2 = e;
              localObject2 = (la)localObject2;
              localObject2 = ((la)localObject2).c();
              localObject6 = "1007";
              localMap = c;
              localFrameLayout = k;
              localObject5 = paramView;
              ((lc)localObject2).a(paramView, (String)localObject6, localJSONObject, localMap, localFrameLayout);
            }
          }
        }
      }
    }
  }
  
  public final void onGlobalLayout()
  {
    synchronized (j)
    {
      boolean bool = f;
      FrameLayout localFrameLayout;
      Object localObject4;
      if (bool)
      {
        localObject2 = k;
        int m = ((FrameLayout)localObject2).getMeasuredWidth();
        localFrameLayout = k;
        int n = localFrameLayout.getMeasuredHeight();
        if ((m != 0) && (n != 0))
        {
          localObject4 = b;
          if (localObject4 != null)
          {
            localObject4 = b;
            FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
            localLayoutParams.<init>(m, n);
            ((FrameLayout)localObject4).setLayoutParams(localLayoutParams);
            m = 0;
            localObject2 = null;
            f = false;
          }
        }
      }
      Object localObject2 = e;
      if (localObject2 != null)
      {
        localObject2 = e;
        localFrameLayout = k;
        localObject4 = c;
        ((lc)localObject2).c(localFrameLayout, (Map)localObject4);
      }
      return;
    }
  }
  
  public final void onScrollChanged()
  {
    synchronized (j)
    {
      lc locallc = e;
      if (locallc != null)
      {
        locallc = e;
        FrameLayout localFrameLayout = k;
        Map localMap = c;
        locallc.c(localFrameLayout, localMap);
      }
      return;
    }
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    synchronized (j)
    {
      Object localObject2 = e;
      if (localObject2 == null) {
        return false;
      }
      int m = 2;
      float f1 = 2.8E-45F;
      localObject2 = new int[m];
      Object localObject4 = k;
      ((FrameLayout)localObject4).getLocationOnScreen((int[])localObject2);
      float f2 = paramMotionEvent.getRawX();
      int n = 0;
      float f3 = 0.0F;
      Point localPoint = null;
      n = localObject2[0];
      f3 = n;
      f2 -= f3;
      f3 = paramMotionEvent.getRawY();
      int i1 = 1;
      m = localObject2[i1];
      f1 = m;
      f1 = f3 - f1;
      localPoint = new android/graphics/Point;
      int i2 = (int)f2;
      m = (int)f1;
      localPoint.<init>(i2, m);
      g = localPoint;
      m = paramMotionEvent.getAction();
      if (m == 0) {
        h = localPoint;
      }
      localObject2 = MotionEvent.obtain(paramMotionEvent);
      i2 = x;
      f2 = i2;
      n = y;
      f3 = n;
      ((MotionEvent)localObject2).setLocation(f2, f3);
      localObject4 = e;
      ((lc)localObject4).a((MotionEvent)localObject2);
      ((MotionEvent)localObject2).recycle();
    }
  }
}


/* Location:              com/google/android/gms/b/lg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */