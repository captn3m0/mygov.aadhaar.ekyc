package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.common.internal.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@qi
public final class la
  extends ld
{
  private og d;
  private oh e;
  private final s f;
  private lc g;
  private boolean h = false;
  private Object i = new Object();
  
  private la(Context paramContext, s params, dw paramdw, lc.a parama)
  {
    super(paramContext, params, null, paramdw, null, parama, null, null);
    f = params;
  }
  
  public la(Context paramContext, s params, dw paramdw, og paramog, lc.a parama)
  {
    this(paramContext, params, paramdw, parama);
    d = paramog;
  }
  
  public la(Context paramContext, s params, dw paramdw, oh paramoh, lc.a parama)
  {
    this(paramContext, params, paramdw, parama);
    e = paramoh;
  }
  
  public final View a(View.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    synchronized (i)
    {
      if (g != null)
      {
        paramOnClickListener = g.a(paramOnClickListener, paramBoolean);
        return paramOnClickListener;
      }
    }
    try
    {
      if (d != null) {}
      for (paramOnClickListener = d.n(); paramOnClickListener != null; paramOnClickListener = e.k())
      {
        paramOnClickListener = (View)b.a(paramOnClickListener);
        return paramOnClickListener;
        paramOnClickListener = finally;
        throw paramOnClickListener;
        if (e == null) {
          break label102;
        }
      }
    }
    catch (RemoteException paramOnClickListener)
    {
      for (;;)
      {
        tp.c("Failed to call getAdChoicesContent", paramOnClickListener);
        break label102;
        return null;
        label102:
        paramOnClickListener = null;
      }
    }
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    c.b("recordImpression must be called on the main UI thread.");
    for (;;)
    {
      synchronized (i)
      {
        c = true;
        if (g != null)
        {
          g.a(paramView, paramMap);
          f.E();
          return;
        }
        try
        {
          if ((d != null) && (!d.j()))
          {
            d.i();
            f.E();
          }
        }
        catch (RemoteException paramView)
        {
          tp.c("Failed to call recordImpression", paramView);
        }
      }
      if ((e != null) && (!e.h()))
      {
        e.g();
        f.E();
      }
    }
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> arg2, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    synchronized (i)
    {
      h = true;
      try
      {
        if (d != null) {
          d.b(b.a(paramView));
        }
        for (;;)
        {
          h = false;
          return;
          if (e != null) {
            e.b(b.a(paramView));
          }
        }
      }
      catch (RemoteException paramView)
      {
        for (;;)
        {
          tp.c("Failed to call prepareAd", paramView);
        }
      }
    }
  }
  
  public final void a(View paramView1, Map<String, WeakReference<View>> paramMap, JSONObject paramJSONObject, View paramView2)
  {
    c.b("performClick must be called on the main UI thread.");
    synchronized (i)
    {
      if (g != null)
      {
        g.a(paramView1, paramMap, paramJSONObject, paramView2);
        f.e();
      }
      for (;;)
      {
        return;
        try
        {
          if ((d != null) && (!d.k()))
          {
            d.a(b.a(paramView1));
            f.e();
          }
          if ((e == null) || (e.i())) {
            continue;
          }
          e.a(b.a(paramView1));
          f.e();
        }
        catch (RemoteException paramView1)
        {
          tp.c("Failed to call performClick", paramView1);
        }
      }
    }
  }
  
  public final void a(lc paramlc)
  {
    synchronized (i)
    {
      g = paramlc;
      return;
    }
  }
  
  public final boolean a()
  {
    synchronized (i)
    {
      if (g != null)
      {
        bool = g.a();
        return bool;
      }
      boolean bool = f.N();
      return bool;
    }
  }
  
  public final void b(View paramView, Map<String, WeakReference<View>> arg2)
  {
    synchronized (i)
    {
      try
      {
        if (d != null) {
          d.c(b.a(paramView));
        }
        for (;;)
        {
          return;
          if (e != null) {
            e.c(b.a(paramView));
          }
        }
      }
      catch (RemoteException paramView)
      {
        for (;;)
        {
          tp.c("Failed to call untrackView", paramView);
        }
      }
    }
  }
  
  public final boolean b()
  {
    synchronized (i)
    {
      boolean bool = h;
      return bool;
    }
  }
  
  public final lc c()
  {
    synchronized (i)
    {
      lc locallc = g;
      return locallc;
    }
  }
  
  public final vc d()
  {
    return null;
  }
}


/* Location:              com/google/android/gms/b/la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */