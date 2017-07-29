package com.google.android.gms.b;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.common.internal.c;
import java.util.Map;
import org.json.JSONObject;

public final class la
  extends ld
{
  private og d;
  private oh e;
  private final s f;
  private lc g;
  private boolean h = false;
  private Object i;
  
  private la(Context paramContext, s params, dw paramdw, lc.a parama)
  {
    super(paramContext, params, null, paramdw, null, parama, null, null);
    localObject = new java/lang/Object;
    localObject.<init>();
    i = localObject;
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
    label97:
    label145:
    for (;;)
    {
      synchronized (i)
      {
        Object localObject2 = g;
        if (localObject2 != null)
        {
          localObject2 = g;
          localObject2 = ((lc)localObject2).a(paramOnClickListener, paramBoolean);
          return (View)localObject2;
        }
        try
        {
          localObject2 = d;
          if (localObject2 == null) {
            break label97;
          }
          localObject2 = d;
          localObject2 = ((og)localObject2).n();
        }
        catch (RemoteException localRemoteException)
        {
          Object localObject4;
          String str = "Failed to call getAdChoicesContent";
          tp.c(str, localRemoteException);
          Object localObject5 = null;
          continue;
          localObject5 = null;
        }
        if (localObject2 == null) {
          break label145;
        }
        localObject2 = b.a((a)localObject2);
        localObject2 = (View)localObject2;
      }
      localObject4 = e;
      if (localObject4 != null)
      {
        localObject4 = e;
        localObject4 = ((oh)localObject4).k();
      }
    }
  }
  
  public final void a(View paramView, Map paramMap)
  {
    Object localObject1 = "recordImpression must be called on the main UI thread.";
    c.b((String)localObject1);
    Object localObject4 = i;
    boolean bool = true;
    for (;;)
    {
      try
      {
        c = bool;
        localObject1 = g;
        if (localObject1 != null)
        {
          localObject1 = g;
          ((lc)localObject1).a(paramView, paramMap);
          localObject1 = f;
          ((s)localObject1).E();
          return;
        }
        try
        {
          localObject1 = d;
          if (localObject1 == null) {
            break label130;
          }
          localObject1 = d;
          bool = ((og)localObject1).j();
          if (bool) {
            break label130;
          }
          localObject1 = d;
          ((og)localObject1).i();
          localObject1 = f;
          ((s)localObject1).E();
        }
        catch (RemoteException localRemoteException)
        {
          String str = "Failed to call recordImpression";
          tp.c(str, localRemoteException);
        }
        continue;
        localObject3 = e;
      }
      finally {}
      label130:
      Object localObject3;
      if (localObject3 != null)
      {
        localObject3 = e;
        bool = ((oh)localObject3).h();
        if (!bool)
        {
          localObject3 = e;
          ((oh)localObject3).g();
          localObject3 = f;
          ((s)localObject3).E();
        }
      }
    }
  }
  
  public final void a(View paramView, Map paramMap, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    localObject1 = i;
    boolean bool = true;
    for (;;)
    {
      try
      {
        h = bool;
        try
        {
          localObject2 = d;
          if (localObject2 == null) {
            continue;
          }
          localObject2 = d;
          localObject4 = b.a(paramView);
          ((og)localObject2).b((a)localObject4);
        }
        catch (RemoteException localRemoteException)
        {
          Object localObject2;
          Object localObject4 = "Failed to call prepareAd";
          tp.c((String)localObject4, localRemoteException);
          continue;
        }
        bool = false;
        localObject2 = null;
        h = false;
        return;
      }
      finally {}
      localObject2 = e;
      if (localObject2 != null)
      {
        localObject2 = e;
        localObject4 = b.a(paramView);
        ((oh)localObject2).b((a)localObject4);
      }
    }
  }
  
  public final void a(View paramView1, Map paramMap, JSONObject paramJSONObject, View paramView2)
  {
    Object localObject1 = "performClick must be called on the main UI thread.";
    c.b((String)localObject1);
    synchronized (i)
    {
      localObject1 = g;
      if (localObject1 != null)
      {
        localObject1 = g;
        ((lc)localObject1).a(paramView1, paramMap, paramJSONObject, paramView2);
        localObject1 = f;
        ((s)localObject1).e();
      }
      for (;;)
      {
        return;
        try
        {
          localObject1 = d;
          if (localObject1 != null)
          {
            localObject1 = d;
            bool = ((og)localObject1).k();
            if (!bool)
            {
              localObject1 = d;
              localObject4 = b.a(paramView1);
              ((og)localObject1).a((a)localObject4);
              localObject1 = f;
              ((s)localObject1).e();
            }
          }
          localObject1 = e;
          if (localObject1 == null) {
            continue;
          }
          localObject1 = e;
          boolean bool = ((oh)localObject1).i();
          if (bool) {
            continue;
          }
          localObject1 = e;
          localObject4 = b.a(paramView1);
          ((oh)localObject1).a((a)localObject4);
          localObject1 = f;
          ((s)localObject1).e();
        }
        catch (RemoteException localRemoteException)
        {
          Object localObject4 = "Failed to call performClick";
          tp.c((String)localObject4, localRemoteException);
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
      Object localObject2 = g;
      if (localObject2 != null)
      {
        localObject2 = g;
        bool = ((lc)localObject2).a();
        return bool;
      }
      localObject2 = f;
      boolean bool = ((s)localObject2).N();
    }
  }
  
  public final void b(View paramView, Map paramMap)
  {
    synchronized (i)
    {
      label42:
      do
      {
        try
        {
          localObject2 = d;
          if (localObject2 == null) {
            break label42;
          }
          localObject2 = d;
          localObject4 = b.a(paramView);
          ((og)localObject2).c((a)localObject4);
        }
        catch (RemoteException localRemoteException)
        {
          for (;;)
          {
            Object localObject2;
            Object localObject4 = "Failed to call untrackView";
            tp.c((String)localObject4, localRemoteException);
          }
        }
        return;
        localObject2 = e;
      } while (localObject2 == null);
      localObject2 = e;
      localObject4 = b.a(paramView);
      ((oh)localObject2).c((a)localObject4);
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */