package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.b.bv;
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
import com.google.android.gms.b.od;
import com.google.android.gms.b.ph;
import com.google.android.gms.b.pl;
import com.google.android.gms.b.sb;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.th;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tm;
import com.google.android.gms.b.to;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tv;
import com.google.android.gms.b.ue;
import com.google.android.gms.b.uk;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

public final class x
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  sb A;
  List B;
  com.google.android.gms.ads.internal.purchase.k C;
  public tm D = null;
  View E = null;
  public int F = 0;
  boolean G = false;
  boolean H = false;
  HashSet I = null;
  boolean J;
  boolean K;
  boolean L;
  private int M;
  private int N;
  private ue O;
  final String a;
  public String b;
  public final Context c;
  final dw d;
  public final un e;
  x.a f;
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
  android.support.v4.g.k u;
  android.support.v4.g.k v;
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
    M = i1;
    N = i1;
    J = bool1;
    K = bool1;
    L = false;
    ke.a(paramContext);
    Object localObject1 = w.i().e();
    Object localObject2;
    String str1;
    String str2;
    if (localObject1 != null)
    {
      localObject1 = ke.b();
      i1 = b;
      if (i1 != 0)
      {
        i1 = b;
        localObject2 = Integer.toString(i1);
        ((List)localObject1).add(localObject2);
      }
      localObject2 = w.i().e();
      if (localObject1 != null)
      {
        bool1 = ((List)localObject1).isEmpty();
        if (!bool1)
        {
          localObject2 = c;
          str1 = "e";
          str2 = ",";
          localObject1 = TextUtils.join(str2, (Iterable)localObject1);
          ((LinkedHashMap)localObject2).put(str1, localObject1);
        }
      }
    }
    localObject1 = UUID.randomUUID().toString();
    a = ((String)localObject1);
    bool2 = d;
    if (!bool2)
    {
      bool2 = h;
      if (!bool2) {}
    }
    else
    {
      f = null;
    }
    for (;;)
    {
      i = paramil;
      b = paramString;
      c = paramContext;
      e = paramun;
      localObject1 = new com/google/android/gms/b/dw;
      localObject2 = new com/google/android/gms/ads/internal/j;
      ((j)localObject2).<init>(this);
      ((dw)localObject1).<init>((bv)localObject2);
      d = ((dw)localObject1);
      localObject1 = new com/google/android/gms/b/ue;
      ((ue)localObject1).<init>(200L);
      O = ((ue)localObject1);
      localObject1 = new android/support/v4/g/k;
      ((android.support.v4.g.k)localObject1).<init>();
      v = ((android.support.v4.g.k)localObject1);
      return;
      localObject1 = new com/google/android/gms/ads/internal/x$a;
      str2 = a;
      localObject2 = paramContext;
      str1 = paramString;
      ((x.a)localObject1).<init>(paramContext, paramString, str2, this, this);
      f = ((x.a)localObject1);
      localObject1 = f;
      i1 = f;
      ((x.a)localObject1).setMinimumWidth(i1);
      localObject1 = f;
      i1 = c;
      ((x.a)localObject1).setMinimumHeight(i1);
      localObject1 = f;
      i1 = 4;
      ((x.a)localObject1).setVisibility(i1);
    }
  }
  
  private void b(boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject1 = f;
    if (localObject1 != null)
    {
      localObject1 = j;
      if (localObject1 != null)
      {
        localObject1 = j.b;
        if (localObject1 != null)
        {
          localObject1 = j.b.l();
          if (localObject1 != null) {
            break label50;
          }
        }
      }
    }
    label50:
    do
    {
      return;
      if (!paramBoolean) {
        break;
      }
      localObject1 = O;
      bool2 = ((ue)localObject1).a();
    } while (!bool2);
    localObject1 = j.b.l();
    boolean bool2 = ((vd)localObject1).a();
    Object localObject2;
    int i3;
    int i4;
    Object localObject3;
    int i2;
    if (bool2)
    {
      localObject1 = new int[2];
      f.getLocationOnScreen((int[])localObject1);
      ip.a();
      localObject2 = c;
      i3 = localObject1[0];
      i4 = uk.b((Context)localObject2, i3);
      ip.a();
      localObject3 = c;
      i2 = localObject1[bool1];
      i2 = uk.b((Context)localObject3, i2);
      i3 = M;
      if (i4 == i3)
      {
        i3 = N;
        if (i2 == i3) {}
      }
      else
      {
        M = i4;
        N = i2;
        localObject1 = j.b.l();
        i4 = M;
        i3 = N;
        if (paramBoolean) {
          break label357;
        }
      }
    }
    for (;;)
    {
      ((vd)localObject1).a(i4, i3, bool1);
      Object localObject4 = f;
      if (localObject4 == null) {
        break;
      }
      localObject4 = f.getRootView();
      i2 = 16908290;
      localObject4 = ((View)localObject4).findViewById(i2);
      if (localObject4 == null) {
        break;
      }
      localObject1 = new android/graphics/Rect;
      ((Rect)localObject1).<init>();
      localObject2 = new android/graphics/Rect;
      ((Rect)localObject2).<init>();
      localObject3 = f;
      ((x.a)localObject3).getGlobalVisibleRect((Rect)localObject1);
      ((View)localObject4).getGlobalVisibleRect((Rect)localObject2);
      int i1 = top;
      i3 = top;
      if (i1 != i3) {
        J = false;
      }
      i1 = bottom;
      i2 = bottom;
      if (i1 == i2) {
        break;
      }
      K = false;
      break;
      label357:
      i1 = 0;
      localObject4 = null;
    }
  }
  
  public final void a()
  {
    Object localObject = j;
    if (localObject != null)
    {
      localObject = j.b;
      if (localObject != null)
      {
        localObject = j.b;
        ((vc)localObject).destroy();
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    int i1 = F;
    if (i1 == 0)
    {
      localObject = j;
      if (localObject != null)
      {
        localObject = j.b;
        if (localObject != null)
        {
          localObject = j.b;
          ((vc)localObject).stopLoading();
        }
      }
    }
    Object localObject = g;
    if (localObject != null)
    {
      localObject = g;
      ((to)localObject).b();
    }
    localObject = h;
    if (localObject != null)
    {
      localObject = h;
      ((tv)localObject).b();
    }
    if (paramBoolean)
    {
      i1 = 0;
      localObject = null;
      j = null;
    }
  }
  
  public final void b()
  {
    Object localObject = j;
    if (localObject != null)
    {
      localObject = j.p;
      if (localObject == null) {}
    }
    try
    {
      localObject = j;
      localObject = p;
      ((od)localObject).c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not destroy mediation adapter.";
        tp.e(str);
      }
    }
  }
  
  public final boolean c()
  {
    int i1 = F;
    if (i1 == 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final boolean d()
  {
    int i1 = 1;
    int i2 = F;
    if (i2 == i1) {}
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  public final void onGlobalLayout()
  {
    b(false);
  }
  
  public final void onScrollChanged()
  {
    boolean bool = true;
    b(bool);
    L = bool;
  }
}


/* Location:              com/google/android/gms/ads/internal/x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */