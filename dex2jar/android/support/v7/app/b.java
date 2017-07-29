package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.f;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

public final class b
  implements DrawerLayout.f
{
  public final a a;
  public final DrawerLayout b;
  public android.support.v7.c.a.b c;
  public boolean d = true;
  public final int e;
  public final int f;
  View.OnClickListener g;
  public boolean h = false;
  private boolean i = true;
  private Drawable j;
  
  public b(Activity paramActivity, DrawerLayout paramDrawerLayout, Toolbar paramToolbar)
  {
    this(paramActivity, paramToolbar, paramDrawerLayout);
  }
  
  private b(Activity paramActivity, Toolbar paramToolbar, DrawerLayout paramDrawerLayout)
  {
    if (paramToolbar != null)
    {
      a = new g(paramToolbar);
      paramToolbar.setNavigationOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (d)
          {
            paramAnonymousView = b.this;
            i = b.a(8388611);
            localView = b.b(8388611);
            if (localView != null)
            {
              bool = DrawerLayout.g(localView);
              if ((!bool) || (i == 2)) {
                break label69;
              }
              b.a();
            }
          }
          label69:
          while (g == null)
          {
            int i;
            do
            {
              for (;;)
              {
                return;
                boolean bool = false;
              }
            } while (i == 1);
            paramAnonymousView = b;
            View localView = paramAnonymousView.b(8388611);
            if (localView == null) {
              throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.c(8388611));
            }
            paramAnonymousView.e(localView);
            return;
          }
          g.onClick(paramAnonymousView);
        }
      });
    }
    for (;;)
    {
      b = paramDrawerLayout;
      e = 2131230795;
      f = 2131230794;
      c = new android.support.v7.c.a.b(a.b());
      j = a.a();
      return;
      if ((paramActivity instanceof b)) {
        a = ((b)paramActivity).c();
      } else if (Build.VERSION.SDK_INT >= 18) {
        a = new f(paramActivity);
      } else if (Build.VERSION.SDK_INT >= 14) {
        a = new e(paramActivity);
      } else if (Build.VERSION.SDK_INT >= 11) {
        a = new d(paramActivity);
      } else {
        a = new c(paramActivity);
      }
    }
  }
  
  private void a(int paramInt)
  {
    a.a(paramInt);
  }
  
  public final void a()
  {
    b(1.0F);
    if (d) {
      a(f);
    }
  }
  
  public final void a(float paramFloat)
  {
    if (i)
    {
      b(Math.min(1.0F, Math.max(0.0F, paramFloat)));
      return;
    }
    b(0.0F);
  }
  
  public final void b()
  {
    b(0.0F);
    if (d) {
      a(e);
    }
  }
  
  public final void b(float paramFloat)
  {
    if (paramFloat == 1.0F) {
      c.a(true);
    }
    for (;;)
    {
      android.support.v7.c.a.b localb = c;
      if (a != paramFloat)
      {
        a = paramFloat;
        localb.invalidateSelf();
      }
      return;
      if (paramFloat == 0.0F) {
        c.a(false);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract Drawable a();
    
    public abstract void a(int paramInt);
    
    public abstract void a(Drawable paramDrawable, int paramInt);
    
    public abstract Context b();
    
    public abstract boolean c();
  }
  
  public static abstract interface b
  {
    public abstract b.a c();
  }
  
  static final class c
    implements b.a
  {
    final Activity a;
    
    c(Activity paramActivity)
    {
      a = paramActivity;
    }
    
    public final Drawable a()
    {
      return null;
    }
    
    public final void a(int paramInt) {}
    
    public final void a(Drawable paramDrawable, int paramInt) {}
    
    public final Context b()
    {
      return a;
    }
    
    public final boolean c()
    {
      return true;
    }
  }
  
  @TargetApi(11)
  private static class d
    implements b.a
  {
    final Activity a;
    c.a b;
    
    d(Activity paramActivity)
    {
      a = paramActivity;
    }
    
    public final Drawable a()
    {
      return c.a(a);
    }
    
    public final void a(int paramInt)
    {
      b = c.a(b, a, paramInt);
    }
    
    public final void a(Drawable paramDrawable, int paramInt)
    {
      ActionBar localActionBar = a.getActionBar();
      if (localActionBar != null)
      {
        localActionBar.setDisplayShowHomeEnabled(true);
        b = c.a(a, paramDrawable, paramInt);
        localActionBar.setDisplayShowHomeEnabled(false);
      }
    }
    
    public Context b()
    {
      return a;
    }
    
    public final boolean c()
    {
      ActionBar localActionBar = a.getActionBar();
      return (localActionBar != null) && ((localActionBar.getDisplayOptions() & 0x4) != 0);
    }
  }
  
  @TargetApi(14)
  private static final class e
    extends b.d
  {
    e(Activity paramActivity)
    {
      super();
    }
    
    public final Context b()
    {
      ActionBar localActionBar = a.getActionBar();
      if (localActionBar != null) {
        return localActionBar.getThemedContext();
      }
      return a;
    }
  }
  
  @TargetApi(18)
  private static final class f
    implements b.a
  {
    final Activity a;
    
    f(Activity paramActivity)
    {
      a = paramActivity;
    }
    
    public final Drawable a()
    {
      TypedArray localTypedArray = b().obtainStyledAttributes(null, new int[] { 16843531 }, 16843470, 0);
      Drawable localDrawable = localTypedArray.getDrawable(0);
      localTypedArray.recycle();
      return localDrawable;
    }
    
    public final void a(int paramInt)
    {
      ActionBar localActionBar = a.getActionBar();
      if (localActionBar != null) {
        localActionBar.setHomeActionContentDescription(paramInt);
      }
    }
    
    public final void a(Drawable paramDrawable, int paramInt)
    {
      ActionBar localActionBar = a.getActionBar();
      if (localActionBar != null)
      {
        localActionBar.setHomeAsUpIndicator(paramDrawable);
        localActionBar.setHomeActionContentDescription(paramInt);
      }
    }
    
    public final Context b()
    {
      ActionBar localActionBar = a.getActionBar();
      if (localActionBar != null) {
        return localActionBar.getThemedContext();
      }
      return a;
    }
    
    public final boolean c()
    {
      ActionBar localActionBar = a.getActionBar();
      return (localActionBar != null) && ((localActionBar.getDisplayOptions() & 0x4) != 0);
    }
  }
  
  static final class g
    implements b.a
  {
    final Toolbar a;
    final Drawable b;
    final CharSequence c;
    
    g(Toolbar paramToolbar)
    {
      a = paramToolbar;
      b = paramToolbar.getNavigationIcon();
      c = paramToolbar.getNavigationContentDescription();
    }
    
    public final Drawable a()
    {
      return b;
    }
    
    public final void a(int paramInt)
    {
      if (paramInt == 0)
      {
        a.setNavigationContentDescription(c);
        return;
      }
      a.setNavigationContentDescription(paramInt);
    }
    
    public final void a(Drawable paramDrawable, int paramInt)
    {
      a.setNavigationIcon(paramDrawable);
      a(paramInt);
    }
    
    public final Context b()
    {
      return a.getContext();
    }
    
    public final boolean c()
    {
      return true;
    }
  }
}


/* Location:              android/support/v7/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */