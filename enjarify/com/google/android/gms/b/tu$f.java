package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.WebSettings;

public class tu$f
  extends tu.c
{
  public final void a(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    Object localObject1 = paramActivity.getWindow();
    if (localObject1 != null)
    {
      Object localObject2 = ((Window)localObject1).getDecorView();
      if (localObject2 != null)
      {
        localObject2 = ((Window)localObject1).getDecorView().getViewTreeObserver();
        if (localObject2 != null)
        {
          localObject1 = ((Window)localObject1).getDecorView().getViewTreeObserver();
          ((ViewTreeObserver)localObject1).removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
        }
      }
    }
  }
  
  public final void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  public final void a(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }
  
  public boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    super.a(paramContext, paramWebSettings);
    paramWebSettings.setAllowFileAccessFromFileURLs(false);
    paramWebSettings.setAllowUniversalAccessFromFileURLs(false);
    return true;
  }
}


/* Location:              com/google/android/gms/b/tu$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */