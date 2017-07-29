package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class g
{
  static int a = -1;
  private static boolean b = false;
  
  public static g a(Activity paramActivity, f paramf)
  {
    Window localWindow = paramActivity.getWindow();
    return a(paramActivity, localWindow, paramf);
  }
  
  public static g a(Dialog paramDialog, f paramf)
  {
    Context localContext = paramDialog.getContext();
    Window localWindow = paramDialog.getWindow();
    return a(localContext, localWindow, paramf);
  }
  
  private static g a(Context paramContext, Window paramWindow, f paramf)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool = android.support.v4.f.a.a();
    Object localObject;
    if (bool)
    {
      localObject = new android/support/v7/app/i;
      ((i)localObject).<init>(paramContext, paramWindow, paramf);
    }
    for (;;)
    {
      return (g)localObject;
      int j = 23;
      if (i >= j)
      {
        localObject = new android/support/v7/app/l;
        ((l)localObject).<init>(paramContext, paramWindow, paramf);
      }
      else
      {
        j = 14;
        if (i >= j)
        {
          localObject = new android/support/v7/app/k;
          ((k)localObject).<init>(paramContext, paramWindow, paramf);
        }
        else
        {
          j = 11;
          if (i >= j)
          {
            localObject = new android/support/v7/app/j;
            ((j)localObject).<init>(paramContext, paramWindow, paramf);
          }
          else
          {
            localObject = new android/support/v7/app/m;
            ((m)localObject).<init>(paramContext, paramWindow, paramf);
          }
        }
      }
    }
  }
  
  public static boolean l()
  {
    return b;
  }
  
  public abstract a a();
  
  public abstract View a(int paramInt);
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(Toolbar paramToolbar);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract MenuInflater b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(Bundle paramBundle);
  
  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void c();
  
  public abstract boolean c(int paramInt);
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract void h();
  
  public abstract b.a i();
  
  public abstract void j();
  
  public abstract boolean k();
}


/* Location:              android/support/v7/app/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */