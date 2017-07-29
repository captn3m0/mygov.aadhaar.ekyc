package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class e
  extends b
  implements h.a
{
  private Context a;
  private ActionBarContextView d;
  private b.a e;
  private WeakReference<View> f;
  private boolean g;
  private boolean h;
  private h i;
  
  public e(Context paramContext, ActionBarContextView paramActionBarContextView, b.a parama, boolean paramBoolean)
  {
    a = paramContext;
    d = paramActionBarContextView;
    e = parama;
    paramContext = new h(paramActionBarContextView.getContext());
    e = 1;
    i = paramContext;
    i.a(this);
    h = paramBoolean;
  }
  
  public final MenuInflater a()
  {
    return new g(d.getContext());
  }
  
  public final void a(int paramInt)
  {
    b(a.getString(paramInt));
  }
  
  public final void a(h paramh)
  {
    d();
    d.a();
  }
  
  public final void a(View paramView)
  {
    d.setCustomView(paramView);
    if (paramView != null) {}
    for (paramView = new WeakReference(paramView);; paramView = null)
    {
      f = paramView;
      return;
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    d.setSubtitle(paramCharSequence);
  }
  
  public final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    d.setTitleOptional(paramBoolean);
  }
  
  public final boolean a(h paramh, MenuItem paramMenuItem)
  {
    return e.a(this, paramMenuItem);
  }
  
  public final Menu b()
  {
    return i;
  }
  
  public final void b(int paramInt)
  {
    a(a.getString(paramInt));
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    d.setTitle(paramCharSequence);
  }
  
  public final void c()
  {
    if (g) {
      return;
    }
    g = true;
    d.sendAccessibilityEvent(32);
    e.a(this);
  }
  
  public final void d()
  {
    e.b(this, i);
  }
  
  public final CharSequence f()
  {
    return d.getTitle();
  }
  
  public final CharSequence g()
  {
    return d.getSubtitle();
  }
  
  public final boolean h()
  {
    return d.h;
  }
  
  public final View i()
  {
    if (f != null) {
      return (View)f.get();
    }
    return null;
  }
}


/* Location:              android/support/v7/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */