package android.support.v4.c;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;

public class a
{
  private static final Object a = new Object();
  private static TypedValue b;
  
  public static final Drawable a(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      return paramContext.getDrawable(paramInt);
    }
    if (i >= 16) {
      return paramContext.getResources().getDrawable(paramInt);
    }
    synchronized (a)
    {
      if (b == null) {
        b = new TypedValue();
      }
      paramContext.getResources().getValue(paramInt, b, true);
      paramInt = bresourceId;
      return paramContext.getResources().getDrawable(paramInt);
    }
  }
  
  public static boolean a(Context paramContext)
  {
    if (android.support.v4.f.a.a()) {
      return paramContext.isDeviceProtectedStorage();
    }
    return false;
  }
  
  public static boolean a(Context paramContext, Intent[] paramArrayOfIntent)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 16)
    {
      paramContext.startActivities(paramArrayOfIntent, null);
      return true;
    }
    if (i >= 11)
    {
      paramContext.startActivities(paramArrayOfIntent);
      return true;
    }
    return false;
  }
  
  public static final ColorStateList b(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramContext.getColorStateList(paramInt);
    }
    return paramContext.getResources().getColorStateList(paramInt);
  }
  
  public static final int c(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramContext.getColor(paramInt);
    }
    return paramContext.getResources().getColor(paramInt);
  }
}


/* Location:              android/support/v4/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */