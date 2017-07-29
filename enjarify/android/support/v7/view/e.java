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
  private WeakReference f;
  private boolean g;
  private boolean h;
  private h i;
  
  public e(Context paramContext, ActionBarContextView paramActionBarContextView, b.a parama, boolean paramBoolean)
  {
    a = paramContext;
    d = paramActionBarContextView;
    e = parama;
    h localh = new android/support/v7/view/menu/h;
    Context localContext = paramActionBarContextView.getContext();
    localh.<init>(localContext);
    e = 1;
    i = localh;
    i.a(this);
    h = paramBoolean;
  }
  
  public final MenuInflater a()
  {
    g localg = new android/support/v7/view/g;
    Context localContext = d.getContext();
    localg.<init>(localContext);
    return localg;
  }
  
  public final void a(int paramInt)
  {
    String str = a.getString(paramInt);
    b(str);
  }
  
  public final void a(h paramh)
  {
    d();
    d.a();
  }
  
  public final void a(View paramView)
  {
    Object localObject = d;
    ((ActionBarContextView)localObject).setCustomView(paramView);
    if (paramView != null)
    {
      localObject = new java/lang/ref/WeakReference;
      ((WeakReference)localObject).<init>(paramView);
    }
    for (;;)
    {
      f = ((WeakReference)localObject);
      return;
      localObject = null;
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
    String str = a.getString(paramInt);
    a(str);
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    d.setTitle(paramCharSequence);
  }
  
  public final void c()
  {
    boolean bool = g;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      g = bool;
      Object localObject = d;
      int j = 32;
      ((ActionBarContextView)localObject).sendAccessibilityEvent(j);
      localObject = e;
      ((b.a)localObject).a(this);
    }
  }
  
  public final void d()
  {
    b.a locala = e;
    h localh = i;
    locala.b(this, localh);
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
    Object localObject = f;
    if (localObject != null) {}
    for (localObject = (View)f.get();; localObject = null) {
      return (View)localObject;
    }
  }
}


/* Location:              android/support/v7/view/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */