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
    return a(paramActivity, paramActivity.getWindow(), paramf);
  }
  
  public static g a(Dialog paramDialog, f paramf)
  {
    return a(paramDialog.getContext(), paramDialog.getWindow(), paramf);
  }
  
  private static g a(Context paramContext, Window paramWindow, f paramf)
  {
    int i = Build.VERSION.SDK_INT;
    if (android.support.v4.f.a.a()) {
      return new i(paramContext, paramWindow, paramf);
    }
    if (i >= 23) {
      return new l(paramContext, paramWindow, paramf);
    }
    if (i >= 14) {
      return new k(paramContext, paramWindow, paramf);
    }
    if (i >= 11) {
      return new j(paramContext, paramWindow, paramf);
    }
    return new m(paramContext, paramWindow, paramf);
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */