package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v4.h.ae;
import android.support.v4.h.ai;
import android.support.v4.h.w;
import android.support.v4.widget.j;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.d;
import android.support.v7.view.e;
import android.support.v7.view.f.a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.Window.Callback;
import android.widget.PopupWindow;

class k$a
  extends h.b
{
  k$a(k paramk, Window.Callback paramCallback)
  {
    super(paramk, paramCallback);
  }
  
  final ActionMode a(ActionMode.Callback paramCallback)
  {
    float f = 1.0F;
    int i = 1;
    f.a locala = new android/support/v7/view/f$a;
    Object localObject1 = c.b;
    locala.<init>((Context)localObject1, paramCallback);
    k localk = c;
    localObject1 = q;
    if (localObject1 != null)
    {
      localObject1 = q;
      ((b)localObject1).c();
    }
    m.b localb = new android/support/v7/app/m$b;
    localb.<init>(localk, locala);
    localObject1 = localk.a();
    if (localObject1 != null)
    {
      localObject1 = ((a)localObject1).a(localb);
      q = ((b)localObject1);
    }
    localObject1 = q;
    Object localObject2;
    int i1;
    label466:
    label528:
    boolean bool2;
    if (localObject1 == null)
    {
      localk.p();
      localObject1 = q;
      if (localObject1 != null)
      {
        localObject1 = q;
        ((b)localObject1).c();
      }
      localObject1 = r;
      Object localObject3;
      int k;
      Object localObject4;
      if (localObject1 == null)
      {
        boolean bool1 = l;
        if (!bool1) {
          break label752;
        }
        localObject2 = new android/util/TypedValue;
        ((TypedValue)localObject2).<init>();
        localObject1 = b.getTheme();
        int m = a.a.actionBarTheme;
        ((Resources.Theme)localObject1).resolveAttribute(m, (TypedValue)localObject2, i);
        m = resourceId;
        if (m != 0)
        {
          localObject3 = b.getResources().newTheme();
          ((Resources.Theme)localObject3).setTo((Resources.Theme)localObject1);
          k = resourceId;
          ((Resources.Theme)localObject3).applyStyle(k, i);
          localObject1 = new android/support/v7/view/d;
          localObject4 = b;
          ((d)localObject1).<init>((Context)localObject4, 0);
          localObject4 = ((Context)localObject1).getTheme();
          ((Resources.Theme)localObject4).setTo((Resources.Theme)localObject3);
          localObject3 = new android/support/v7/widget/ActionBarContextView;
          ((ActionBarContextView)localObject3).<init>((Context)localObject1);
          r = ((ActionBarContextView)localObject3);
          localObject3 = new android/widget/PopupWindow;
          int n = a.a.actionModePopupWindowStyle;
          ((PopupWindow)localObject3).<init>((Context)localObject1, null, n);
          s = ((PopupWindow)localObject3);
          j.a(s, 2);
          localObject3 = s;
          localObject4 = r;
          ((PopupWindow)localObject3).setContentView((View)localObject4);
          s.setWidth(-1);
          localObject3 = ((Context)localObject1).getTheme();
          n = a.a.actionBarSize;
          ((Resources.Theme)localObject3).resolveAttribute(n, (TypedValue)localObject2, i);
          i1 = data;
          localObject1 = ((Context)localObject1).getResources().getDisplayMetrics();
          k = TypedValue.complexToDimensionPixelSize(i1, (DisplayMetrics)localObject1);
          localObject2 = r;
          ((ActionBarContextView)localObject2).setContentHeight(k);
          localObject1 = s;
          i1 = -2;
          ((PopupWindow)localObject1).setHeight(i1);
          localObject1 = new android/support/v7/app/m$5;
          ((m.5)localObject1).<init>(localk);
          t = ((Runnable)localObject1);
        }
      }
      else
      {
        localObject1 = r;
        if (localObject1 != null)
        {
          localk.p();
          r.b();
          localObject2 = new android/support/v7/view/e;
          localObject3 = r.getContext();
          localObject4 = r;
          localObject1 = s;
          if (localObject1 != null) {
            break label818;
          }
          k = i;
          ((e)localObject2).<init>((Context)localObject3, (ActionBarContextView)localObject4, localb, k);
          localObject1 = ((b)localObject2).b();
          bool2 = localb.a((b)localObject2, (Menu)localObject1);
          if (!bool2) {
            break label904;
          }
          ((b)localObject2).d();
          localObject1 = r;
          ((ActionBarContextView)localObject1).a((b)localObject2);
          q = ((b)localObject2);
          bool2 = localk.o();
          if (!bool2) {
            break label827;
          }
          localObject1 = r;
          i = 0;
          w.c((View)localObject1, 0.0F);
          localObject1 = w.s(r).a(f);
          u = ((ae)localObject1);
          localObject1 = u;
          Object localObject5 = new android/support/v7/app/m$6;
          ((m.6)localObject5).<init>(localk);
          ((ae)localObject1).a((ai)localObject5);
          label667:
          localObject1 = s;
          if (localObject1 != null)
          {
            localObject1 = c.getDecorView();
            localObject5 = t;
            ((View)localObject1).post((Runnable)localObject5);
          }
        }
        label704:
        localObject1 = q;
        q = ((b)localObject1);
      }
    }
    else
    {
      localObject1 = q;
      if (localObject1 == null) {
        break label913;
      }
    }
    for (localObject1 = locala.b((b)localObject1);; localObject1 = null)
    {
      return (ActionMode)localObject1;
      localObject1 = b;
      break;
      label752:
      localObject1 = v;
      i1 = a.f.action_mode_bar_stub;
      localObject1 = (ViewStubCompat)((ViewGroup)localObject1).findViewById(i1);
      if (localObject1 == null) {
        break label466;
      }
      localObject2 = LayoutInflater.from(localk.n());
      ((ViewStubCompat)localObject1).setLayoutInflater((LayoutInflater)localObject2);
      localObject1 = (ActionBarContextView)((ViewStubCompat)localObject1).a();
      r = ((ActionBarContextView)localObject1);
      break label466;
      label818:
      bool2 = false;
      localObject1 = null;
      break label528;
      label827:
      w.c(r, f);
      r.setVisibility(0);
      localObject1 = r;
      int j = 32;
      ((ActionBarContextView)localObject1).sendAccessibilityEvent(j);
      localObject1 = r.getParent();
      bool2 = localObject1 instanceof View;
      if (!bool2) {
        break label667;
      }
      localObject1 = (View)r.getParent();
      w.w((View)localObject1);
      break label667;
      label904:
      q = null;
      break label704;
      label913:
      bool2 = false;
    }
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    Object localObject = c;
    boolean bool = p;
    if (bool) {}
    for (localObject = a(paramCallback);; localObject = super.onWindowStartingActionMode(paramCallback)) {
      return (ActionMode)localObject;
    }
  }
}


/* Location:              android/support/v7/app/k$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */