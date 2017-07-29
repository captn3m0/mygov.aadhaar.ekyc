package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.f;
import android.support.v7.widget.Toolbar;
import android.view.View.OnClickListener;

public final class b
  implements DrawerLayout.f
{
  public final b.a a;
  public final DrawerLayout b;
  public android.support.v7.c.a.b c;
  public boolean d;
  public final int e;
  public final int f;
  View.OnClickListener g;
  public boolean h;
  private boolean i;
  private Drawable j;
  
  public b(Activity paramActivity, DrawerLayout paramDrawerLayout, Toolbar paramToolbar)
  {
    this(paramActivity, paramToolbar, paramDrawerLayout);
  }
  
  private b(Activity paramActivity, Toolbar paramToolbar, DrawerLayout paramDrawerLayout)
  {
    i = bool;
    d = bool;
    bool = false;
    Object localObject = null;
    h = false;
    if (paramToolbar != null)
    {
      localObject = new android/support/v7/app/b$g;
      ((b.g)localObject).<init>(paramToolbar);
      a = ((b.a)localObject);
      localObject = new android/support/v7/app/b$1;
      ((b.1)localObject).<init>(this);
      paramToolbar.setNavigationOnClickListener((View.OnClickListener)localObject);
    }
    for (;;)
    {
      b = paramDrawerLayout;
      e = 2131230795;
      f = 2131230794;
      localObject = new android/support/v7/c/a/b;
      Context localContext = a.b();
      ((android.support.v7.c.a.b)localObject).<init>(localContext);
      c = ((android.support.v7.c.a.b)localObject);
      localObject = a.a();
      j = ((Drawable)localObject);
      return;
      bool = paramActivity instanceof b.b;
      if (bool)
      {
        paramActivity = (b.b)paramActivity;
        localObject = paramActivity.c();
        a = ((b.a)localObject);
      }
      else
      {
        int k = Build.VERSION.SDK_INT;
        int m = 18;
        if (k >= m)
        {
          localObject = new android/support/v7/app/b$f;
          ((b.f)localObject).<init>(paramActivity);
          a = ((b.a)localObject);
        }
        else
        {
          k = Build.VERSION.SDK_INT;
          m = 14;
          if (k >= m)
          {
            localObject = new android/support/v7/app/b$e;
            ((b.e)localObject).<init>(paramActivity);
            a = ((b.a)localObject);
          }
          else
          {
            k = Build.VERSION.SDK_INT;
            m = 11;
            if (k >= m)
            {
              localObject = new android/support/v7/app/b$d;
              ((b.d)localObject).<init>(paramActivity);
              a = ((b.a)localObject);
            }
            else
            {
              localObject = new android/support/v7/app/b$c;
              ((b.c)localObject).<init>(paramActivity);
              a = ((b.a)localObject);
            }
          }
        }
      }
    }
  }
  
  private void a(int paramInt)
  {
    a.a(paramInt);
  }
  
  public final void a()
  {
    float f1 = 1.0F;
    b(f1);
    boolean bool = d;
    if (bool)
    {
      int k = f;
      a(k);
    }
  }
  
  public final void a(float paramFloat)
  {
    float f1 = 0.0F;
    boolean bool = i;
    if (bool)
    {
      int k = 1065353216;
      f1 = Math.max(0.0F, paramFloat);
      float f2 = Math.min(1.0F, f1);
      b(f2);
    }
    for (;;)
    {
      return;
      b(0.0F);
    }
  }
  
  public final void b()
  {
    b(0.0F);
    boolean bool = d;
    if (bool)
    {
      int k = e;
      a(k);
    }
  }
  
  public final void b(float paramFloat)
  {
    float f1 = 1.0F;
    boolean bool1 = paramFloat < f1;
    android.support.v7.c.a.b localb;
    boolean bool2;
    float f2;
    if (!bool1)
    {
      localb = c;
      bool2 = true;
      f2 = Float.MIN_VALUE;
      localb.a(bool2);
    }
    for (;;)
    {
      localb = c;
      f2 = a;
      bool2 = f2 < paramFloat;
      if (bool2)
      {
        a = paramFloat;
        localb.invalidateSelf();
      }
      return;
      f1 = 0.0F;
      localb = null;
      bool1 = paramFloat < 0.0F;
      if (!bool1)
      {
        localb = c;
        bool2 = false;
        f2 = 0.0F;
        localb.a(false);
      }
    }
  }
}


/* Location:              android/support/v7/app/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */