package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

@TargetApi(11)
final class c
{
  private static final int[] a = { 16843531 };
  
  public static Drawable a(Activity paramActivity)
  {
    paramActivity = paramActivity.obtainStyledAttributes(a);
    Drawable localDrawable = paramActivity.getDrawable(0);
    paramActivity.recycle();
    return localDrawable;
  }
  
  public static a a(Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    a locala = new a(paramActivity);
    if (a != null) {
      try
      {
        paramActivity = paramActivity.getActionBar();
        a.invoke(paramActivity, new Object[] { paramDrawable });
        b.invoke(paramActivity, new Object[] { Integer.valueOf(paramInt) });
        return locala;
      }
      catch (Exception paramActivity)
      {
        Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", paramActivity);
        return locala;
      }
    }
    if (c != null)
    {
      c.setImageDrawable(paramDrawable);
      return locala;
    }
    Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
    return locala;
  }
  
  public static a a(a parama, Activity paramActivity, int paramInt)
  {
    a locala = parama;
    if (parama == null) {
      locala = new a(paramActivity);
    }
    if (a != null) {}
    try
    {
      parama = paramActivity.getActionBar();
      b.invoke(parama, new Object[] { Integer.valueOf(paramInt) });
      if (Build.VERSION.SDK_INT <= 19) {
        parama.setSubtitle(parama.getSubtitle());
      }
      return locala;
    }
    catch (Exception parama)
    {
      Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", parama);
    }
    return locala;
  }
  
  static final class a
  {
    public Method a;
    public Method b;
    public ImageView c;
    
    a(Activity paramActivity)
    {
      for (;;)
      {
        Object localObject;
        try
        {
          a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[] { Drawable.class });
          b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[] { Integer.TYPE });
          return;
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          paramActivity = paramActivity.findViewById(16908332);
          if (paramActivity == null) {
            continue;
          }
          localObject = (ViewGroup)paramActivity.getParent();
          if (((ViewGroup)localObject).getChildCount() != 2) {
            continue;
          }
          paramActivity = ((ViewGroup)localObject).getChildAt(0);
          localObject = ((ViewGroup)localObject).getChildAt(1);
          if (paramActivity.getId() != 16908332) {
            break label113;
          }
        }
        paramActivity = (Activity)localObject;
        label113:
        while ((paramActivity instanceof ImageView))
        {
          c = ((ImageView)paramActivity);
          return;
        }
      }
    }
  }
}


/* Location:              android/support/v7/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */