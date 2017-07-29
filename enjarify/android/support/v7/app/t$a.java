package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ae;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public final class t$a
  extends b
  implements h.a
{
  private final Context d;
  private final h e;
  private b.a f;
  private WeakReference g;
  
  public t$a(t paramt, Context paramContext, b.a parama)
  {
    d = paramContext;
    f = parama;
    h localh = new android/support/v7/view/menu/h;
    localh.<init>(paramContext);
    e = 1;
    e = localh;
    e.a(this);
  }
  
  public final MenuInflater a()
  {
    g localg = new android/support/v7/view/g;
    Context localContext = d;
    localg.<init>(localContext);
    return localg;
  }
  
  public final void a(int paramInt)
  {
    String str = a.a.getResources().getString(paramInt);
    b(str);
  }
  
  public final void a(h paramh)
  {
    Object localObject = f;
    if (localObject == null) {}
    for (;;)
    {
      return;
      d();
      localObject = a.e;
      ((ActionBarContextView)localObject).a();
    }
  }
  
  public final void a(View paramView)
  {
    a.e.setCustomView(paramView);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    g = localWeakReference;
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    a.e.setSubtitle(paramCharSequence);
  }
  
  public final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    a.e.setTitleOptional(paramBoolean);
  }
  
  public final boolean a(h paramh, MenuItem paramMenuItem)
  {
    b.a locala = f;
    boolean bool;
    if (locala != null)
    {
      locala = f;
      bool = locala.a(this, paramMenuItem);
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
  
  public final Menu b()
  {
    return e;
  }
  
  public final void b(int paramInt)
  {
    String str = a.a.getResources().getString(paramInt);
    a(str);
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    a.e.setTitle(paramCharSequence);
  }
  
  public final void c()
  {
    Object localObject1 = a.h;
    if (localObject1 != this) {
      return;
    }
    localObject1 = a;
    boolean bool1 = l;
    Object localObject2 = a;
    boolean bool2 = m;
    bool1 = t.a(bool1, bool2, false);
    if (!bool1)
    {
      a.i = this;
      localObject1 = a;
      localObject2 = f;
      j = ((b.a)localObject2);
    }
    for (;;)
    {
      f = null;
      a.e(false);
      localObject1 = a.e;
      localObject2 = g;
      if (localObject2 == null) {
        ((ActionBarContextView)localObject1).b();
      }
      a.d.a().sendAccessibilityEvent(32);
      localObject1 = a.b;
      localObject2 = a;
      bool2 = o;
      ((ActionBarOverlayLayout)localObject1).setHideOnContentScrollEnabled(bool2);
      localObject1 = a;
      h = null;
      break;
      localObject1 = f;
      ((b.a)localObject1).a(this);
    }
  }
  
  public final void d()
  {
    Object localObject1 = a.h;
    if (localObject1 != this) {}
    for (;;)
    {
      return;
      localObject1 = e;
      ((h)localObject1).d();
      try
      {
        localObject1 = f;
        h localh = e;
        ((b.a)localObject1).b(this, localh);
        localObject1 = e;
        ((h)localObject1).e();
      }
      finally
      {
        e.e();
      }
    }
  }
  
  public final boolean e()
  {
    Object localObject1 = e;
    ((h)localObject1).d();
    try
    {
      localObject1 = f;
      h localh = e;
      boolean bool = ((b.a)localObject1).a(this, localh);
      return bool;
    }
    finally
    {
      e.e();
    }
  }
  
  public final CharSequence f()
  {
    return a.e.getTitle();
  }
  
  public final CharSequence g()
  {
    return a.e.getSubtitle();
  }
  
  public final boolean h()
  {
    return a.e.h;
  }
  
  public final View i()
  {
    Object localObject = g;
    if (localObject != null) {}
    for (localObject = (View)g.get();; localObject = null) {
      return (View)localObject;
    }
  }
}


/* Location:              android/support/v7/app/t$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */