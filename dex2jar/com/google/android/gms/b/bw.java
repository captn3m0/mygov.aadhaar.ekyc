package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.w;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class bw
  implements bv
{
  protected MotionEvent a;
  protected LinkedList<MotionEvent> b = new LinkedList();
  protected long c = 0L;
  protected long d = 0L;
  protected long e = 0L;
  protected long f = 0L;
  protected long g = 0L;
  protected long h = 0L;
  protected long i = 0L;
  protected boolean j = false;
  protected DisplayMetrics k;
  private boolean l = false;
  
  protected bw(Context paramContext)
  {
    try
    {
      bj.a();
      k = paramContext.getResources().getDisplayMetrics();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private String a(Context paramContext, String paramString, boolean paramBoolean, View paramView, byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0)) {}
    for (;;)
    {
      int m;
      try
      {
        paramArrayOfByte = (bd.a)gb.a(new bd.a(), paramArrayOfByte, paramArrayOfByte.length);
        if (paramBoolean) {}
        try
        {
          paramContext = a(paramContext, paramView);
          l = true;
          if ((paramContext == null) || (paramContext.f() == 0))
          {
            return Integer.toString(5);
            paramContext = a(paramContext, paramArrayOfByte);
            continue;
          }
          paramView = ke.bJ;
          if (!((Boolean)w.q().a(paramView)).booleanValue())
          {
            m = 1;
            break label182;
            return bj.a(paramContext, paramString, paramBoolean);
          }
          else
          {
            paramView = ke.bP;
            boolean bool = ((Boolean)w.q().a(paramView)).booleanValue();
            if ((bool) && (paramBoolean)) {
              m = 1;
            } else {
              m = 0;
            }
          }
        }
        catch (NoSuchAlgorithmException paramContext)
        {
          return Integer.toString(7);
        }
        catch (Throwable paramContext)
        {
          return Integer.toString(3);
        }
        catch (UnsupportedEncodingException paramContext)
        {
          continue;
        }
        paramBoolean = false;
        continue;
        paramArrayOfByte = null;
      }
      catch (ga paramArrayOfByte) {}
      continue;
      label182:
      if (m == 0) {
        paramBoolean = true;
      }
    }
  }
  
  protected abstract long a(StackTraceElement[] paramArrayOfStackTraceElement);
  
  protected abstract bf.a a(Context paramContext, View paramView);
  
  protected abstract bf.a a(Context paramContext, bd.a parama);
  
  public final String a(Context paramContext)
  {
    if (ew.b())
    {
      jz localjz = ke.bO;
      if (((Boolean)w.q().a(localjz)).booleanValue()) {
        throw new IllegalStateException("The caller must not be called from the UI thread.");
      }
    }
    return a(paramContext, null, false, null, null);
  }
  
  public final String a(Context paramContext, String paramString, View paramView)
  {
    return a(paramContext, paramString, true, paramView, null);
  }
  
  public final String a(Context paramContext, byte[] paramArrayOfByte)
  {
    if (ew.b())
    {
      jz localjz = ke.bO;
      if (((Boolean)w.q().a(localjz)).booleanValue()) {
        throw new IllegalStateException("The caller must not be called from the UI thread.");
      }
    }
    return a(paramContext, null, false, null, paramArrayOfByte);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (a != null) {
      a.recycle();
    }
    if (k != null) {}
    for (a = MotionEvent.obtain(0L, paramInt3, 1, paramInt1 * k.density, paramInt2 * k.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);; a = null)
    {
      j = false;
      return;
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    if (l)
    {
      f = 0L;
      e = 0L;
      d = 0L;
      c = 0L;
      g = 0L;
      i = 0L;
      h = 0L;
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext()) {
        ((MotionEvent)localIterator.next()).recycle();
      }
      b.clear();
      a = null;
      l = false;
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 1: 
    case 0: 
    case 3: 
      for (;;)
      {
        j = true;
        return;
        a = MotionEvent.obtain(paramMotionEvent);
        b.add(a);
        if (b.size() > 6) {
          ((MotionEvent)b.remove()).recycle();
        }
        e += 1L;
        try
        {
          g = a(new Throwable().getStackTrace());
        }
        catch (ea paramMotionEvent) {}
        continue;
        c += 1L;
        continue;
        f += 1L;
      }
    }
    d += paramMotionEvent.getHistorySize() + 1;
    for (;;)
    {
      try
      {
        paramMotionEvent = b(paramMotionEvent);
        if ((d == null) || (g == null)) {
          break label370;
        }
        m = 1;
        if (m != 0) {
          h += d.longValue() + g.longValue();
        }
        if ((k == null) || (e == null) || (h == null)) {
          break label375;
        }
        m = 1;
        if (m == 0) {
          break;
        }
        long l1 = i;
        long l2 = e.longValue();
        i = (h.longValue() + l2 + l1);
      }
      catch (ea paramMotionEvent) {}
      break;
      label370:
      int m = 0;
      continue;
      label375:
      m = 0;
    }
  }
  
  protected abstract ev b(MotionEvent paramMotionEvent);
}


/* Location:              com/google/android/gms/b/bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */