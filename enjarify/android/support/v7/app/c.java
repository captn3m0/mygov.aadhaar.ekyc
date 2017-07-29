package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class c
{
  private static final int[] a;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843531;
    a = arrayOfInt;
  }
  
  public static Drawable a(Activity paramActivity)
  {
    Object localObject = a;
    localObject = paramActivity.obtainStyledAttributes((int[])localObject);
    Drawable localDrawable = ((TypedArray)localObject).getDrawable(0);
    ((TypedArray)localObject).recycle();
    return localDrawable;
  }
  
  public static c.a a(Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    c.a locala = new android/support/v7/app/c$a;
    locala.<init>(paramActivity);
    Object localObject1 = a;
    if (localObject1 != null) {}
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject1 = paramActivity.getActionBar();
        localObject3 = a;
        int i = 1;
        localObject4 = new Object[i];
        localObject4[0] = paramDrawable;
        ((Method)localObject3).invoke(localObject1, (Object[])localObject4);
        localObject3 = b;
        i = 1;
        localObject4 = new Object[i];
        Integer localInteger = Integer.valueOf(paramInt);
        localObject4[0] = localInteger;
        ((Method)localObject3).invoke(localObject1, (Object[])localObject4);
      }
      catch (Exception localException)
      {
        localObject3 = "ActionBarDrawerToggleHoneycomb";
        Object localObject4 = "Couldn't set home-as-up indicator via JB-MR2 API";
        Log.w((String)localObject3, (String)localObject4, localException);
        continue;
      }
      return locala;
      Object localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = c;
        ((ImageView)localObject2).setImageDrawable(paramDrawable);
      }
      else
      {
        localObject2 = "ActionBarDrawerToggleHoneycomb";
        localObject3 = "Couldn't set home-as-up indicator";
        Log.w((String)localObject2, (String)localObject3);
      }
    }
  }
  
  public static c.a a(c.a parama, Activity paramActivity, int paramInt)
  {
    if (parama == null)
    {
      parama = new android/support/v7/app/c$a;
      parama.<init>(paramActivity);
    }
    Object localObject1 = a;
    if (localObject1 != null) {}
    try
    {
      localObject1 = paramActivity.getActionBar();
      localObject2 = b;
      int i = 1;
      localObject3 = new Object[i];
      Integer localInteger = Integer.valueOf(paramInt);
      localObject3[0] = localInteger;
      ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
      int j = Build.VERSION.SDK_INT;
      i = 19;
      if (j <= i)
      {
        localObject2 = ((ActionBar)localObject1).getSubtitle();
        ((ActionBar)localObject1).setSubtitle((CharSequence)localObject2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = "ActionBarDrawerToggleHoneycomb";
        Object localObject3 = "Couldn't set content description via JB-MR2 API";
        Log.w((String)localObject2, (String)localObject3, localException);
      }
    }
    return parama;
  }
}


/* Location:              android/support/v7/app/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */