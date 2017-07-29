package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.ae.g;
import android.support.v4.h.ai;
import android.support.v4.h.ak;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.j;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.h;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ay;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class t
  extends a
  implements ActionBarOverlayLayout.a
{
  private static final Interpolator t;
  private static final Interpolator u;
  private static final boolean v;
  private int A;
  private boolean B;
  private boolean C;
  private ArrayList D;
  private boolean E;
  private int F;
  private boolean G;
  private boolean H;
  private boolean I;
  Context a;
  ActionBarOverlayLayout b;
  ActionBarContainer c;
  android.support.v7.widget.ae d;
  ActionBarContextView e;
  View f;
  ay g;
  t.a h;
  b i;
  b.a j;
  boolean k;
  boolean l;
  boolean m;
  h n;
  boolean o;
  final ai p;
  final ai q;
  final ak r;
  private Context w;
  private Activity x;
  private Dialog y;
  private ArrayList z;
  
  static
  {
    boolean bool1 = true;
    Object localObject = t.class;
    boolean bool2 = ((Class)localObject).desiredAssertionStatus();
    int i1;
    if (!bool2)
    {
      bool2 = bool1;
      s = bool2;
      localObject = new android/view/animation/AccelerateInterpolator;
      ((AccelerateInterpolator)localObject).<init>();
      t = (Interpolator)localObject;
      localObject = new android/view/animation/DecelerateInterpolator;
      ((DecelerateInterpolator)localObject).<init>();
      u = (Interpolator)localObject;
      i1 = Build.VERSION.SDK_INT;
      int i2 = 14;
      if (i1 < i2) {
        break label68;
      }
    }
    for (;;)
    {
      v = bool1;
      return;
      i1 = 0;
      localObject = null;
      break;
      label68:
      bool1 = false;
    }
  }
  
  public t(Activity paramActivity, boolean paramBoolean)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    z = ((ArrayList)localObject);
    A = -1;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    D = ((ArrayList)localObject);
    F = 0;
    k = i1;
    H = i1;
    localObject = new android/support/v7/app/t$1;
    ((t.1)localObject).<init>(this);
    p = ((ai)localObject);
    localObject = new android/support/v7/app/t$2;
    ((t.2)localObject).<init>(this);
    q = ((ai)localObject);
    localObject = new android/support/v7/app/t$3;
    ((t.3)localObject).<init>(this);
    r = ((ak)localObject);
    x = paramActivity;
    localObject = paramActivity.getWindow().getDecorView();
    a((View)localObject);
    if (!paramBoolean)
    {
      i1 = 16908290;
      localObject = ((View)localObject).findViewById(i1);
      f = ((View)localObject);
    }
  }
  
  public t(Dialog paramDialog)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    z = ((ArrayList)localObject);
    A = -1;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    D = ((ArrayList)localObject);
    F = 0;
    k = bool;
    H = bool;
    localObject = new android/support/v7/app/t$1;
    ((t.1)localObject).<init>(this);
    p = ((ai)localObject);
    localObject = new android/support/v7/app/t$2;
    ((t.2)localObject).<init>(this);
    q = ((ai)localObject);
    localObject = new android/support/v7/app/t$3;
    ((t.3)localObject).<init>(this);
    r = ((ak)localObject);
    y = paramDialog;
    localObject = paramDialog.getWindow().getDecorView();
    a((View)localObject);
  }
  
  private void a(View paramView)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject1 = null;
    int i3 = a.f.decor_content_parent;
    Object localObject2 = (ActionBarOverlayLayout)paramView.findViewById(i3);
    b = ((ActionBarOverlayLayout)localObject2);
    localObject2 = b;
    if (localObject2 != null)
    {
      localObject2 = b;
      ((ActionBarOverlayLayout)localObject2).setActionBarVisibilityCallback(this);
    }
    i3 = a.f.action_bar;
    localObject2 = paramView.findViewById(i3);
    boolean bool2 = localObject2 instanceof android.support.v7.widget.ae;
    if (bool2) {}
    for (localObject2 = (android.support.v7.widget.ae)localObject2;; localObject2 = ((Toolbar)localObject2).getWrapper())
    {
      d = ((android.support.v7.widget.ae)localObject2);
      i3 = a.f.action_context_bar;
      localObject2 = (ActionBarContextView)paramView.findViewById(i3);
      e = ((ActionBarContextView)localObject2);
      i3 = a.f.action_bar_container;
      localObject2 = (ActionBarContainer)paramView.findViewById(i3);
      c = ((ActionBarContainer)localObject2);
      localObject2 = d;
      if (localObject2 != null)
      {
        localObject2 = e;
        if (localObject2 != null)
        {
          localObject2 = c;
          if (localObject2 != null) {
            break label309;
          }
        }
      }
      localObject2 = new java/lang/IllegalStateException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = getClass().getSimpleName();
      localObject3 = (String)localObject1 + " can only be used with a compatible window decor layout";
      ((IllegalStateException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
      bool2 = localObject2 instanceof Toolbar;
      if (!bool2) {
        break;
      }
    }
    Object localObject3 = new java/lang/IllegalStateException;
    localObject1 = new java/lang/StringBuilder;
    Object localObject4 = "Can't make a decor toolbar out of ";
    ((StringBuilder)localObject1).<init>((String)localObject4);
    localObject1 = localObject2;
    if (localObject1 != null) {}
    for (localObject2 = localObject2.getClass().getSimpleName();; localObject2 = "null")
    {
      ((IllegalStateException)localObject3).<init>((String)localObject2);
      throw ((Throwable)localObject3);
    }
    label309:
    localObject2 = d.b();
    a = ((Context)localObject2);
    localObject2 = d;
    i3 = ((android.support.v7.widget.ae)localObject2).o() & 0x4;
    if (i3 != 0) {
      i3 = i1;
    }
    for (;;)
    {
      if (i3 != 0) {
        B = i1;
      }
      localObject2 = android.support.v7.view.a.a(a);
      int i4 = a.getApplicationInfo().targetSdkVersion;
      boolean bool1 = ((android.support.v7.view.a)localObject2).b();
      f(bool1);
      localObject2 = a;
      localObject4 = null;
      int[] arrayOfInt = a.j.ActionBar;
      int i5 = a.a.actionBarStyle;
      localObject2 = ((Context)localObject2).obtainStyledAttributes(null, arrayOfInt, i5, 0);
      i4 = a.j.ActionBar_hideOnContentScroll;
      boolean bool3 = ((TypedArray)localObject2).getBoolean(i4, false);
      if (!bool3) {
        break label508;
      }
      localObject4 = b;
      bool3 = b;
      if (bool3) {
        break;
      }
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
      throw ((Throwable)localObject2);
      bool1 = false;
      localObject2 = null;
    }
    o = i1;
    localObject4 = b;
    ((ActionBarOverlayLayout)localObject4).setHideOnContentScrollEnabled(i1);
    label508:
    int i2 = a.j.ActionBar_elevation;
    i2 = ((TypedArray)localObject2).getDimensionPixelSize(i2, 0);
    if (i2 != 0)
    {
      f1 = i2;
      localObject1 = c;
      w.d((View)localObject1, f1);
    }
    ((TypedArray)localObject2).recycle();
  }
  
  static boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = true;
    if (paramBoolean3) {}
    for (;;)
    {
      return bool;
      if ((paramBoolean1) || (paramBoolean2)) {
        bool = false;
      }
    }
  }
  
  private void f(boolean paramBoolean)
  {
    int i1 = 0;
    Object localObject1 = null;
    int i2 = 1;
    E = paramBoolean;
    boolean bool2 = E;
    Object localObject2;
    int i3;
    label77:
    label117:
    boolean bool1;
    if (!bool2)
    {
      d.a(null);
      localObject2 = c;
      localObject1 = g;
      ((ActionBarContainer)localObject2).setTabContainer((ay)localObject1);
      localObject2 = d;
      i3 = ((android.support.v7.widget.ae)localObject2).p();
      i1 = 2;
      if (i3 != i1) {
        break label206;
      }
      i3 = i2;
      localObject1 = g;
      if (localObject1 != null)
      {
        if (i3 == 0) {
          break label215;
        }
        g.setVisibility(0);
        localObject1 = b;
        if (localObject1 != null)
        {
          localObject1 = b;
          w.w((View)localObject1);
        }
      }
      android.support.v7.widget.ae localae = d;
      bool1 = E;
      if ((bool1) || (i3 == 0)) {
        break label233;
      }
      bool1 = i2;
      label140:
      localae.a(bool1);
      localObject1 = b;
      boolean bool3 = E;
      if ((bool3) || (i3 == 0)) {
        break label240;
      }
    }
    for (;;)
    {
      ((ActionBarOverlayLayout)localObject1).setHasNonEmbeddedTabs(i2);
      return;
      c.setTabContainer(null);
      localObject2 = d;
      localObject1 = g;
      ((android.support.v7.widget.ae)localObject2).a((ay)localObject1);
      break;
      label206:
      i3 = 0;
      localObject2 = null;
      break label77;
      label215:
      localObject1 = g;
      int i4 = 8;
      ((ay)localObject1).setVisibility(i4);
      break label117;
      label233:
      bool1 = false;
      localObject1 = null;
      break label140;
      label240:
      i2 = 0;
    }
  }
  
  private void g(boolean paramBoolean)
  {
    int i1 = 2;
    float f1 = 1.0F;
    boolean bool1 = true;
    boolean bool2 = l;
    boolean bool6 = m;
    boolean bool7 = G;
    bool2 = a(bool2, bool6, bool7);
    Object localObject1;
    float f2;
    Object localObject2;
    Object localObject3;
    int i6;
    float f3;
    Object localObject4;
    if (bool2)
    {
      bool2 = H;
      if (!bool2)
      {
        H = bool1;
        localObject1 = n;
        if (localObject1 != null)
        {
          localObject1 = n;
          ((h)localObject1).b();
        }
        localObject1 = c;
        ((ActionBarContainer)localObject1).setVisibility(0);
        int i2 = F;
        if (i2 != 0) {
          break label384;
        }
        boolean bool3 = v;
        if (!bool3) {
          break label384;
        }
        bool3 = I;
        if ((!bool3) && (!paramBoolean)) {
          break label384;
        }
        w.b(c, 0.0F);
        localObject1 = c;
        int i3 = -((ActionBarContainer)localObject1).getHeight();
        f2 = i3;
        if (paramBoolean)
        {
          localObject2 = new int[i1];
          Object tmp168_166 = localObject2;
          tmp168_166[0] = 0;
          tmp168_166[1] = 0;
          localObject3 = c;
          ((ActionBarContainer)localObject3).getLocationInWindow((int[])localObject2);
          i6 = localObject2[bool1];
          f3 = i6;
          f2 -= f3;
        }
        w.b(c, f2);
        localObject2 = new android/support/v7/view/h;
        ((h)localObject2).<init>();
        localObject3 = w.s(c).c(0.0F);
        localObject4 = r;
        ((android.support.v4.h.ae)localObject3).a((ak)localObject4);
        ((h)localObject2).a((android.support.v4.h.ae)localObject3);
        bool7 = k;
        if (bool7)
        {
          localObject3 = f;
          if (localObject3 != null)
          {
            localObject3 = f;
            w.b((View)localObject3, f2);
            localObject1 = w.s(f).c(0.0F);
            ((h)localObject2).a((android.support.v4.h.ae)localObject1);
          }
        }
        localObject1 = u;
        ((h)localObject2).a((Interpolator)localObject1);
        ((h)localObject2).c();
        localObject1 = q;
        ((h)localObject2).a((ai)localObject1);
        n = ((h)localObject2);
        ((h)localObject2).a();
        localObject1 = b;
        if (localObject1 != null)
        {
          localObject1 = b;
          w.w((View)localObject1);
        }
      }
    }
    for (;;)
    {
      return;
      label384:
      w.c(c, f1);
      localObject1 = c;
      w.b((View)localObject1, 0.0F);
      boolean bool4 = k;
      if (bool4)
      {
        localObject1 = f;
        if (localObject1 != null)
        {
          localObject1 = f;
          w.b((View)localObject1, 0.0F);
        }
      }
      localObject1 = q;
      i6 = 0;
      f3 = 0.0F;
      localObject2 = null;
      ((ai)localObject1).b(null);
      break;
      bool4 = H;
      if (bool4)
      {
        H = false;
        localObject1 = n;
        if (localObject1 != null)
        {
          localObject1 = n;
          ((h)localObject1).b();
        }
        int i4 = F;
        if (i4 == 0)
        {
          boolean bool5 = v;
          if (bool5)
          {
            bool5 = I;
            if ((bool5) || (paramBoolean))
            {
              w.c(c, f1);
              c.setTransitioning(bool1);
              localObject2 = new android/support/v7/view/h;
              ((h)localObject2).<init>();
              localObject1 = c;
              int i5 = -((ActionBarContainer)localObject1).getHeight();
              f2 = i5;
              if (paramBoolean)
              {
                localObject3 = new int[i1];
                Object tmp595_593 = localObject3;
                tmp595_593[0] = 0;
                tmp595_593[1] = 0;
                localObject4 = c;
                ((ActionBarContainer)localObject4).getLocationInWindow((int[])localObject3);
                int i7 = localObject3[bool1];
                float f4 = i7;
                f2 -= f4;
              }
              localObject3 = w.s(c).c(f2);
              localObject4 = r;
              ((android.support.v4.h.ae)localObject3).a((ak)localObject4);
              ((h)localObject2).a((android.support.v4.h.ae)localObject3);
              boolean bool8 = k;
              if (bool8)
              {
                localObject3 = f;
                if (localObject3 != null)
                {
                  localObject3 = w.s(f);
                  localObject1 = ((android.support.v4.h.ae)localObject3).c(f2);
                  ((h)localObject2).a((android.support.v4.h.ae)localObject1);
                }
              }
              localObject1 = t;
              ((h)localObject2).a((Interpolator)localObject1);
              ((h)localObject2).c();
              localObject1 = p;
              ((h)localObject2).a((ai)localObject1);
              n = ((h)localObject2);
              ((h)localObject2).a();
              continue;
            }
          }
        }
        localObject1 = p;
        i6 = 0;
        f3 = 0.0F;
        localObject2 = null;
        ((ai)localObject1).b(null);
      }
    }
  }
  
  public final int a()
  {
    return d.o();
  }
  
  public final b a(b.a parama)
  {
    t.a locala = h;
    if (locala != null)
    {
      locala = h;
      locala.c();
    }
    b.setHideOnContentScrollEnabled(false);
    e.b();
    locala = new android/support/v7/app/t$a;
    Object localObject = e.getContext();
    locala.<init>(this, (Context)localObject, parama);
    boolean bool = locala.e();
    if (bool)
    {
      h = locala;
      locala.d();
      e.a(locala);
      bool = true;
      e(bool);
      localObject = e;
      int i1 = 32;
      ((ActionBarContextView)localObject).sendAccessibilityEvent(i1);
    }
    for (;;)
    {
      return locala;
      locala = null;
    }
  }
  
  public final void a(int paramInt)
  {
    d.d(paramInt);
  }
  
  public final void a(Configuration paramConfiguration)
  {
    boolean bool = android.support.v7.view.a.a(a).b();
    f(bool);
  }
  
  public final void a(Drawable paramDrawable)
  {
    d.b(paramDrawable);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    d.a(paramCharSequence);
  }
  
  public final void a(boolean paramBoolean)
  {
    boolean bool1 = B;
    if (!bool1) {
      if (!paramBoolean) {
        break label68;
      }
    }
    label68:
    for (int i1 = 4;; i1 = 0)
    {
      android.support.v7.widget.ae localae1 = d;
      int i2 = localae1.o();
      boolean bool2 = true;
      B = bool2;
      android.support.v7.widget.ae localae2 = d;
      i1 &= 0x4;
      i2 &= 0xFFFFFFFB;
      i1 |= i2;
      localae2.c(i1);
      return;
    }
  }
  
  public final void b(int paramInt)
  {
    F = paramInt;
  }
  
  public final void b(boolean paramBoolean)
  {
    I = paramBoolean;
    if (!paramBoolean)
    {
      h localh = n;
      if (localh != null)
      {
        localh = n;
        localh.b();
      }
    }
  }
  
  public final boolean b()
  {
    ActionBarContainer localActionBarContainer = c;
    int i1 = localActionBarContainer.getHeight();
    boolean bool = H;
    if (bool) {
      if (i1 != 0)
      {
        ActionBarOverlayLayout localActionBarOverlayLayout = b;
        int i3 = localActionBarOverlayLayout.getActionBarHideOffset();
        if (i3 >= i1) {}
      }
      else
      {
        i1 = 1;
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localActionBarContainer = null;
    }
  }
  
  public final Context c()
  {
    Object localObject1 = w;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = new android/util/TypedValue;
      ((TypedValue)localObject1).<init>();
      localObject2 = a.getTheme();
      int i1 = a.a.actionBarWidgetTheme;
      boolean bool = true;
      ((Resources.Theme)localObject2).resolveAttribute(i1, (TypedValue)localObject1, bool);
      int i2 = resourceId;
      if (i2 == 0) {
        break label80;
      }
      localObject2 = new android/view/ContextThemeWrapper;
      Context localContext = a;
      ((ContextThemeWrapper)localObject2).<init>(localContext, i2);
    }
    for (w = ((Context)localObject2);; w = ((Context)localObject1))
    {
      return w;
      label80:
      localObject1 = a;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    boolean bool1 = C;
    if (paramBoolean == bool1) {}
    for (;;)
    {
      return;
      C = paramBoolean;
      boolean bool2 = D.size();
      bool1 = false;
      while (bool1 < bool2)
      {
        ArrayList localArrayList = D;
        localArrayList.get(bool1);
        int i1;
        bool1 += true;
      }
    }
  }
  
  public final void d(boolean paramBoolean)
  {
    k = paramBoolean;
  }
  
  public final void e(boolean paramBoolean)
  {
    long l1 = 100;
    int i1 = 8;
    int i2 = 4;
    boolean bool1 = true;
    h localh = null;
    boolean bool2;
    Object localObject1;
    Object localObject2;
    long l2;
    if (paramBoolean)
    {
      bool2 = G;
      if (!bool2)
      {
        G = bool1;
        localObject1 = b;
        if (localObject1 != null)
        {
          localObject1 = b;
          ((ActionBarOverlayLayout)localObject1).setShowingForActionMode(bool1);
        }
        g(false);
      }
      localObject1 = c;
      bool2 = w.F((View)localObject1);
      if (!bool2) {
        break label303;
      }
      if (!paramBoolean) {
        break label259;
      }
      localObject1 = d.a(i2, l1);
      localObject2 = e;
      l2 = 200L;
      localObject2 = ((ActionBarContextView)localObject2).a(0, l2);
      label124:
      localh = new android/support/v7/view/h;
      localh.<init>();
      Object localObject3 = a;
      ((ArrayList)localObject3).add(localObject1);
      localObject1 = (View)a.get();
      if (localObject1 == null) {
        break label297;
      }
      localObject3 = android.support.v4.h.ae.e;
      l2 = ((ae.g)localObject3).a((View)localObject1);
      label183:
      ((android.support.v4.h.ae)localObject2).b(l2);
      localObject1 = a;
      ((ArrayList)localObject1).add(localObject2);
      localh.a();
    }
    for (;;)
    {
      return;
      bool2 = G;
      if (!bool2) {
        break;
      }
      G = false;
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject1 = b;
        ((ActionBarOverlayLayout)localObject1).setShowingForActionMode(false);
      }
      g(false);
      break;
      label259:
      localObject1 = d;
      l2 = 200L;
      localObject2 = ((android.support.v7.widget.ae)localObject1).a(0, l2);
      localObject1 = e.a(i1, l1);
      break label124;
      label297:
      l2 = 0L;
      break label183;
      label303:
      if (paramBoolean)
      {
        d.e(i2);
        localObject1 = e;
        ((ActionBarContextView)localObject1).setVisibility(0);
      }
      else
      {
        d.e(0);
        localObject1 = e;
        ((ActionBarContextView)localObject1).setVisibility(i1);
      }
    }
  }
  
  public final boolean e()
  {
    android.support.v7.widget.ae localae = d;
    boolean bool;
    if (localae != null)
    {
      localae = d;
      bool = localae.c();
      if (bool)
      {
        localae = d;
        localae.d();
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localae = null;
    }
  }
  
  public final boolean f()
  {
    ViewGroup localViewGroup = d.a();
    boolean bool2;
    if (localViewGroup != null)
    {
      boolean bool1 = localViewGroup.hasFocus();
      if (!bool1)
      {
        localViewGroup.requestFocus();
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localViewGroup = null;
    }
  }
  
  public final void h()
  {
    boolean bool = m;
    if (bool)
    {
      m = false;
      bool = true;
      g(bool);
    }
  }
  
  public final void i()
  {
    boolean bool1 = true;
    boolean bool2 = m;
    if (!bool2)
    {
      m = bool1;
      g(bool1);
    }
  }
  
  public final void j()
  {
    h localh = n;
    if (localh != null)
    {
      n.b();
      localh = null;
      n = null;
    }
  }
}


/* Location:              android/support/v7/app/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */