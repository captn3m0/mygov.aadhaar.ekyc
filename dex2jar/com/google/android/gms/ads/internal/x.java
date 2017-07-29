package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.b.dw;
import com.google.android.gms.b.il;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.is;
import com.google.android.gms.b.it;
import com.google.android.gms.b.iz;
import com.google.android.gms.b.jb;
import com.google.android.gms.b.jh;
import com.google.android.gms.b.jt;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.kg;
import com.google.android.gms.b.kq;
import com.google.android.gms.b.le;
import com.google.android.gms.b.lq;
import com.google.android.gms.b.lr;
import com.google.android.gms.b.ls;
import com.google.android.gms.b.lt;
import com.google.android.gms.b.od;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.sb;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.th;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tm;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tv;
import com.google.android.gms.b.tw;
import com.google.android.gms.b.ue;
import com.google.android.gms.b.uj;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

@qi
public final class x
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  sb A;
  List<String> B;
  com.google.android.gms.ads.internal.purchase.k C;
  public tm D = null;
  View E = null;
  public int F = 0;
  boolean G = false;
  boolean H = false;
  HashSet<th> I = null;
  boolean J = true;
  boolean K = true;
  boolean L = false;
  private int M = -1;
  private int N = -1;
  private ue O;
  final String a;
  public String b;
  public final Context c;
  final dw d;
  public final un e;
  a f;
  public to g;
  public tv h;
  public il i;
  public tg j;
  public tg.a k;
  public th l;
  is m;
  it n;
  iz o;
  jb p;
  ph q;
  pl r;
  lq s;
  lr t;
  android.support.v4.g.k<String, ls> u;
  android.support.v4.g.k<String, lt> v;
  le w;
  jt x;
  jh y;
  kq z;
  
  public x(Context paramContext, il paramil, String paramString, un paramun)
  {
    this(paramContext, paramil, paramString, paramun, (byte)0);
  }
  
  private x(Context paramContext, il paramil, String paramString, un paramun, byte paramByte)
  {
    ke.a(paramContext);
    if (w.i().e() != null)
    {
      List localList = ke.b();
      if (b != 0) {
        localList.add(Integer.toString(b));
      }
      kg localkg = w.i().e();
      if ((localList != null) && (!localList.isEmpty())) {
        c.put("e", TextUtils.join(",", localList));
      }
    }
    a = UUID.randomUUID().toString();
    if ((d) || (h)) {
      f = null;
    }
    for (;;)
    {
      i = paramil;
      b = paramString;
      c = paramContext;
      e = paramun;
      d = new dw(new j(this));
      O = new ue(200L);
      v = new android.support.v4.g.k();
      return;
      f = new a(paramContext, paramString, a, this, this);
      f.setMinimumWidth(f);
      f.setMinimumHeight(c);
      f.setVisibility(4);
    }
  }
  
  private void b(boolean paramBoolean)
  {
    boolean bool = true;
    if ((f == null) || (j == null) || (j.b == null) || (j.b.l() == null))
    {
      break label42;
      break label42;
    }
    label42:
    while ((paramBoolean) && (!O.a())) {
      return;
    }
    Object localObject;
    int i1;
    int i2;
    if (j.b.l().a())
    {
      localObject = new int[2];
      f.getLocationOnScreen((int[])localObject);
      ip.a();
      i1 = uk.b(c, localObject[0]);
      ip.a();
      i2 = uk.b(c, localObject[1]);
      if ((i1 != M) || (i2 != N))
      {
        M = i1;
        N = i2;
        localObject = j.b.l();
        i1 = M;
        i2 = N;
        if (paramBoolean) {
          break label286;
        }
      }
    }
    label286:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      ((vd)localObject).a(i1, i2, paramBoolean);
      if (f == null) {
        break;
      }
      localObject = f.getRootView().findViewById(16908290);
      if (localObject == null) {
        break;
      }
      Rect localRect1 = new Rect();
      Rect localRect2 = new Rect();
      f.getGlobalVisibleRect(localRect1);
      ((View)localObject).getGlobalVisibleRect(localRect2);
      if (top != top) {
        J = false;
      }
      if (bottom == bottom) {
        break;
      }
      K = false;
      return;
    }
  }
  
  public final void a()
  {
    if ((j != null) && (j.b != null)) {
      j.b.destroy();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if ((F == 0) && (j != null) && (j.b != null)) {
      j.b.stopLoading();
    }
    if (g != null) {
      g.b();
    }
    if (h != null) {
      h.b();
    }
    if (paramBoolean) {
      j = null;
    }
  }
  
  public final void b()
  {
    if ((j != null) && (j.p != null)) {}
    try
    {
      j.p.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      tp.e("Could not destroy mediation adapter.");
    }
  }
  
  public final boolean c()
  {
    return F == 0;
  }
  
  public final boolean d()
  {
    return F == 1;
  }
  
  public final void onGlobalLayout()
  {
    b(false);
  }
  
  public final void onScrollChanged()
  {
    b(true);
    L = true;
  }
  
  public static final class a
    extends ViewSwitcher
  {
    final tw a;
    final uj b;
    boolean c;
    
    public a(Context paramContext, String paramString1, String paramString2, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
    {
      super();
      a = new tw(paramContext);
      a.c = paramString1;
      a.d = paramString2;
      c = true;
      if ((paramContext instanceof Activity)) {}
      for (b = new uj((Activity)paramContext, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener);; b = new uj(null, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener))
      {
        b.a();
        return;
      }
    }
    
    protected final void onAttachedToWindow()
    {
      super.onAttachedToWindow();
      if (b != null) {
        b.c();
      }
    }
    
    protected final void onDetachedFromWindow()
    {
      super.onDetachedFromWindow();
      if (b != null) {
        b.d();
      }
    }
    
    public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if (c) {
        a.a(paramMotionEvent);
      }
      return false;
    }
    
    public final void removeAllViews()
    {
      Object localObject = new ArrayList();
      int i = 0;
      while (i < getChildCount())
      {
        View localView = getChildAt(i);
        if ((localView != null) && ((localView instanceof vc))) {
          ((List)localObject).add((vc)localView);
        }
        i += 1;
      }
      super.removeAllViews();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((vc)((Iterator)localObject).next()).destroy();
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */