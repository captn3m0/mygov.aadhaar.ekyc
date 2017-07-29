package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.ae.g;
import android.support.v4.h.ai;
import android.support.v4.h.aj;
import android.support.v4.h.ak;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.j;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.menu.h.a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ay;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
  private int A = -1;
  private boolean B;
  private boolean C;
  private ArrayList<Object> D = new ArrayList();
  private boolean E;
  private int F = 0;
  private boolean G;
  private boolean H = true;
  private boolean I;
  Context a;
  ActionBarOverlayLayout b;
  ActionBarContainer c;
  android.support.v7.widget.ae d;
  ActionBarContextView e;
  View f;
  ay g;
  a h;
  b i;
  b.a j;
  boolean k = true;
  boolean l;
  boolean m;
  android.support.v7.view.h n;
  boolean o;
  final ai p = new aj()
  {
    public final void b(View paramAnonymousView)
    {
      if ((k) && (f != null))
      {
        w.b(f, 0.0F);
        w.b(c, 0.0F);
      }
      c.setVisibility(8);
      c.setTransitioning(false);
      n = null;
      paramAnonymousView = t.this;
      if (j != null)
      {
        j.a(i);
        i = null;
        j = null;
      }
      if (b != null) {
        w.w(b);
      }
    }
  };
  final ai q = new aj()
  {
    public final void b(View paramAnonymousView)
    {
      n = null;
      c.requestLayout();
    }
  };
  final ak r = new ak()
  {
    public final void a()
    {
      ((View)c.getParent()).invalidate();
    }
  };
  private Context w;
  private Activity x;
  private Dialog y;
  private ArrayList<Object> z = new ArrayList();
  
  static
  {
    boolean bool2 = true;
    if (!t.class.desiredAssertionStatus())
    {
      bool1 = true;
      s = bool1;
      t = new AccelerateInterpolator();
      u = new DecelerateInterpolator();
      if (Build.VERSION.SDK_INT < 14) {
        break label56;
      }
    }
    label56:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      v = bool1;
      return;
      bool1 = false;
      break;
    }
  }
  
  public t(Activity paramActivity, boolean paramBoolean)
  {
    x = paramActivity;
    paramActivity = paramActivity.getWindow().getDecorView();
    a(paramActivity);
    if (!paramBoolean) {
      f = paramActivity.findViewById(16908290);
    }
  }
  
  public t(Dialog paramDialog)
  {
    y = paramDialog;
    a(paramDialog.getWindow().getDecorView());
  }
  
  private void a(View paramView)
  {
    b = ((ActionBarOverlayLayout)paramView.findViewById(a.f.decor_content_parent));
    if (b != null) {
      b.setActionBarVisibilityCallback(this);
    }
    Object localObject = paramView.findViewById(a.f.action_bar);
    if ((localObject instanceof android.support.v7.widget.ae)) {}
    for (localObject = (android.support.v7.widget.ae)localObject;; localObject = ((Toolbar)localObject).getWrapper())
    {
      d = ((android.support.v7.widget.ae)localObject);
      e = ((ActionBarContextView)paramView.findViewById(a.f.action_context_bar));
      c = ((ActionBarContainer)paramView.findViewById(a.f.action_bar_container));
      if ((d != null) && (e != null) && (c != null)) {
        break label206;
      }
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
      if (!(localObject instanceof Toolbar)) {
        break;
      }
    }
    if ("Can't make a decor toolbar out of " + localObject != null) {}
    for (paramView = localObject.getClass().getSimpleName();; paramView = "null") {
      throw new IllegalStateException(paramView);
    }
    label206:
    a = d.b();
    if ((d.o() & 0x4) != 0) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        B = true;
      }
      paramView = android.support.v7.view.a.a(a);
      i1 = a.getApplicationInfo().targetSdkVersion;
      f(paramView.b());
      paramView = a.obtainStyledAttributes(null, a.j.ActionBar, a.a.actionBarStyle, 0);
      if (!paramView.getBoolean(a.j.ActionBar_hideOnContentScroll, false)) {
        break label337;
      }
      if (b.b) {
        break;
      }
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    o = true;
    b.setHideOnContentScrollEnabled(true);
    label337:
    i1 = paramView.getDimensionPixelSize(a.j.ActionBar_elevation, 0);
    if (i1 != 0)
    {
      float f1 = i1;
      w.d(c, f1);
    }
    paramView.recycle();
  }
  
  static boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {}
    while ((!paramBoolean1) && (!paramBoolean2)) {
      return true;
    }
    return false;
  }
  
  private void f(boolean paramBoolean)
  {
    boolean bool = true;
    E = paramBoolean;
    int i1;
    label50:
    label83:
    Object localObject;
    if (!E)
    {
      d.a(null);
      c.setTabContainer(g);
      if (d.p() != 2) {
        break label160;
      }
      i1 = 1;
      if (g != null)
      {
        if (i1 == 0) {
          break label165;
        }
        g.setVisibility(0);
        if (b != null) {
          w.w(b);
        }
      }
      localObject = d;
      if ((E) || (i1 == 0)) {
        break label177;
      }
      paramBoolean = true;
      label102:
      ((android.support.v7.widget.ae)localObject).a(paramBoolean);
      localObject = b;
      if ((E) || (i1 == 0)) {
        break label182;
      }
    }
    label160:
    label165:
    label177:
    label182:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      ((ActionBarOverlayLayout)localObject).setHasNonEmbeddedTabs(paramBoolean);
      return;
      c.setTabContainer(null);
      d.a(g);
      break;
      i1 = 0;
      break label50;
      g.setVisibility(8);
      break label83;
      paramBoolean = false;
      break label102;
    }
  }
  
  private void g(boolean paramBoolean)
  {
    float f2;
    float f1;
    Object localObject1;
    Object localObject2;
    if (a(l, m, G)) {
      if (!H)
      {
        H = true;
        if (n != null) {
          n.b();
        }
        c.setVisibility(0);
        if ((F != 0) || (!v) || ((!I) && (!paramBoolean))) {
          break label271;
        }
        w.b(c, 0.0F);
        f2 = -c.getHeight();
        f1 = f2;
        if (paramBoolean)
        {
          localObject1 = new int[2];
          Object tmp107_105 = localObject1;
          tmp107_105[0] = 0;
          Object tmp111_107 = tmp107_105;
          tmp111_107[1] = 0;
          tmp111_107;
          c.getLocationInWindow((int[])localObject1);
          f1 = f2 - localObject1[1];
        }
        w.b(c, f1);
        localObject1 = new android.support.v7.view.h();
        localObject2 = w.s(c).c(0.0F);
        ((android.support.v4.h.ae)localObject2).a(r);
        ((android.support.v7.view.h)localObject1).a((android.support.v4.h.ae)localObject2);
        if ((k) && (f != null))
        {
          w.b(f, f1);
          ((android.support.v7.view.h)localObject1).a(w.s(f).c(0.0F));
        }
        ((android.support.v7.view.h)localObject1).a(u);
        ((android.support.v7.view.h)localObject1).c();
        ((android.support.v7.view.h)localObject1).a(q);
        n = ((android.support.v7.view.h)localObject1);
        ((android.support.v7.view.h)localObject1).a();
        if (b != null) {
          w.w(b);
        }
      }
    }
    label271:
    while (!H) {
      for (;;)
      {
        return;
        w.c(c, 1.0F);
        w.b(c, 0.0F);
        if ((k) && (f != null)) {
          w.b(f, 0.0F);
        }
        q.b(null);
      }
    }
    H = false;
    if (n != null) {
      n.b();
    }
    if ((F == 0) && (v) && ((I) || (paramBoolean)))
    {
      w.c(c, 1.0F);
      c.setTransitioning(true);
      localObject1 = new android.support.v7.view.h();
      f2 = -c.getHeight();
      f1 = f2;
      if (paramBoolean)
      {
        localObject2 = new int[2];
        Object tmp420_418 = localObject2;
        tmp420_418[0] = 0;
        Object tmp424_420 = tmp420_418;
        tmp424_420[1] = 0;
        tmp424_420;
        c.getLocationInWindow((int[])localObject2);
        f1 = f2 - localObject2[1];
      }
      localObject2 = w.s(c).c(f1);
      ((android.support.v4.h.ae)localObject2).a(r);
      ((android.support.v7.view.h)localObject1).a((android.support.v4.h.ae)localObject2);
      if ((k) && (f != null)) {
        ((android.support.v7.view.h)localObject1).a(w.s(f).c(f1));
      }
      ((android.support.v7.view.h)localObject1).a(t);
      ((android.support.v7.view.h)localObject1).c();
      ((android.support.v7.view.h)localObject1).a(p);
      n = ((android.support.v7.view.h)localObject1);
      ((android.support.v7.view.h)localObject1).a();
      return;
    }
    p.b(null);
  }
  
  public final int a()
  {
    return d.o();
  }
  
  public final b a(b.a parama)
  {
    if (h != null) {
      h.c();
    }
    b.setHideOnContentScrollEnabled(false);
    e.b();
    parama = new a(e.getContext(), parama);
    if (parama.e())
    {
      h = parama;
      parama.d();
      e.a(parama);
      e(true);
      e.sendAccessibilityEvent(32);
      return parama;
    }
    return null;
  }
  
  public final void a(int paramInt)
  {
    d.d(paramInt);
  }
  
  public final void a(Configuration paramConfiguration)
  {
    f(android.support.v7.view.a.a(a).b());
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
    if (!B) {
      if (!paramBoolean) {
        break label46;
      }
    }
    label46:
    for (int i1 = 4;; i1 = 0)
    {
      int i2 = d.o();
      B = true;
      d.c(i1 & 0x4 | i2 & 0xFFFFFFFB);
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
    if ((!paramBoolean) && (n != null)) {
      n.b();
    }
  }
  
  public final boolean b()
  {
    int i1 = c.getHeight();
    return (H) && ((i1 == 0) || (b.getActionBarHideOffset() < i1));
  }
  
  public final Context c()
  {
    int i1;
    if (w == null)
    {
      TypedValue localTypedValue = new TypedValue();
      a.getTheme().resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
      i1 = resourceId;
      if (i1 == 0) {
        break label61;
      }
    }
    label61:
    for (w = new ContextThemeWrapper(a, i1);; w = a) {
      return w;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    if (paramBoolean == C) {}
    for (;;)
    {
      return;
      C = paramBoolean;
      int i2 = D.size();
      int i1 = 0;
      while (i1 < i2)
      {
        D.get(i1);
        i1 += 1;
      }
    }
  }
  
  public final void d(boolean paramBoolean)
  {
    k = paramBoolean;
  }
  
  public final void e(boolean paramBoolean)
  {
    Object localObject;
    android.support.v4.h.ae localae;
    label78:
    android.support.v7.view.h localh;
    if (paramBoolean)
    {
      if (!G)
      {
        G = true;
        if (b != null) {
          b.setShowingForActionMode(true);
        }
        g(false);
      }
      if (!w.F(c)) {
        break label223;
      }
      if (!paramBoolean) {
        break label186;
      }
      localObject = d.a(4, 100L);
      localae = e.a(0, 200L);
      localh = new android.support.v7.view.h();
      a.add(localObject);
      localObject = (View)a.get();
      if (localObject == null) {
        break label218;
      }
    }
    label186:
    label218:
    for (long l1 = android.support.v4.h.ae.e.a((View)localObject);; l1 = 0L)
    {
      localae.b(l1);
      a.add(localae);
      localh.a();
      return;
      if (!G) {
        break;
      }
      G = false;
      if (b != null) {
        b.setShowingForActionMode(false);
      }
      g(false);
      break;
      localae = d.a(0, 200L);
      localObject = e.a(8, 100L);
      break label78;
    }
    label223:
    if (paramBoolean)
    {
      d.e(4);
      e.setVisibility(0);
      return;
    }
    d.e(0);
    e.setVisibility(8);
  }
  
  public final boolean e()
  {
    if ((d != null) && (d.c()))
    {
      d.d();
      return true;
    }
    return false;
  }
  
  public final boolean f()
  {
    ViewGroup localViewGroup = d.a();
    if ((localViewGroup != null) && (!localViewGroup.hasFocus()))
    {
      localViewGroup.requestFocus();
      return true;
    }
    return false;
  }
  
  public final void h()
  {
    if (m)
    {
      m = false;
      g(true);
    }
  }
  
  public final void i()
  {
    if (!m)
    {
      m = true;
      g(true);
    }
  }
  
  public final void j()
  {
    if (n != null)
    {
      n.b();
      n = null;
    }
  }
  
  public final class a
    extends b
    implements h.a
  {
    private final Context d;
    private final android.support.v7.view.menu.h e;
    private b.a f;
    private WeakReference<View> g;
    
    public a(Context paramContext, b.a parama)
    {
      d = paramContext;
      f = parama;
      this$1 = new android.support.v7.view.menu.h(paramContext);
      e = 1;
      e = t.this;
      e.a(this);
    }
    
    public final MenuInflater a()
    {
      return new g(d);
    }
    
    public final void a(int paramInt)
    {
      b(a.getResources().getString(paramInt));
    }
    
    public final void a(android.support.v7.view.menu.h paramh)
    {
      if (f == null) {
        return;
      }
      d();
      e.a();
    }
    
    public final void a(View paramView)
    {
      e.setCustomView(paramView);
      g = new WeakReference(paramView);
    }
    
    public final void a(CharSequence paramCharSequence)
    {
      e.setSubtitle(paramCharSequence);
    }
    
    public final void a(boolean paramBoolean)
    {
      super.a(paramBoolean);
      e.setTitleOptional(paramBoolean);
    }
    
    public final boolean a(android.support.v7.view.menu.h paramh, MenuItem paramMenuItem)
    {
      if (f != null) {
        return f.a(this, paramMenuItem);
      }
      return false;
    }
    
    public final Menu b()
    {
      return e;
    }
    
    public final void b(int paramInt)
    {
      a(a.getResources().getString(paramInt));
    }
    
    public final void b(CharSequence paramCharSequence)
    {
      e.setTitle(paramCharSequence);
    }
    
    public final void c()
    {
      if (h != this) {
        return;
      }
      if (!t.a(l, m, false))
      {
        i = this;
        j = f;
      }
      for (;;)
      {
        f = null;
        e(false);
        ActionBarContextView localActionBarContextView = e;
        if (g == null) {
          localActionBarContextView.b();
        }
        d.a().sendAccessibilityEvent(32);
        b.setHideOnContentScrollEnabled(o);
        h = null;
        return;
        f.a(this);
      }
    }
    
    public final void d()
    {
      if (h != this) {
        return;
      }
      e.d();
      try
      {
        f.b(this, e);
        return;
      }
      finally
      {
        e.e();
      }
    }
    
    public final boolean e()
    {
      e.d();
      try
      {
        boolean bool = f.a(this, e);
        return bool;
      }
      finally
      {
        e.e();
      }
    }
    
    public final CharSequence f()
    {
      return e.getTitle();
    }
    
    public final CharSequence g()
    {
      return e.getSubtitle();
    }
    
    public final boolean h()
    {
      return e.h;
    }
    
    public final View i()
    {
      if (g != null) {
        return (View)g.get();
      }
      return null;
    }
  }
}


/* Location:              android/support/v7/app/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */