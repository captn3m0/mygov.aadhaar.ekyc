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
  private static final Object a;
  private static TypedValue b;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public static final Drawable a(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject1;
    if (i >= j) {
      localObject1 = paramContext.getDrawable(paramInt);
    }
    for (;;)
    {
      return (Drawable)localObject1;
      j = 16;
      if (i >= j)
      {
        localObject1 = paramContext.getResources().getDrawable(paramInt);
        continue;
      }
      synchronized (a)
      {
        localObject1 = b;
        if (localObject1 == null)
        {
          localObject1 = new android/util/TypedValue;
          ((TypedValue)localObject1).<init>();
          b = (TypedValue)localObject1;
        }
        localObject1 = paramContext.getResources();
        TypedValue localTypedValue = b;
        boolean bool = true;
        ((Resources)localObject1).getValue(paramInt, localTypedValue, bool);
        localObject1 = b;
        i = resourceId;
        ??? = paramContext.getResources();
        localObject1 = ((Resources)???).getDrawable(i);
      }
    }
  }
  
  public static boolean a(Context paramContext)
  {
    boolean bool = android.support.v4.f.a.a();
    if (bool) {}
    for (bool = paramContext.isDeviceProtectedStorage();; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(Context paramContext, Intent[] paramArrayOfIntent)
  {
    boolean bool = true;
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j)
    {
      i = 0;
      paramContext.startActivities(paramArrayOfIntent, null);
    }
    for (;;)
    {
      return bool;
      j = 11;
      if (i >= j) {
        paramContext.startActivities(paramArrayOfIntent);
      } else {
        bool = false;
      }
    }
  }
  
  public static final ColorStateList b(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j) {}
    for (ColorStateList localColorStateList = paramContext.getColorStateList(paramInt);; localColorStateList = paramContext.getResources().getColorStateList(paramInt)) {
      return localColorStateList;
    }
  }
  
  public static final int c(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j) {}
    Resources localResources;
    for (i = paramContext.getColor(paramInt);; i = localResources.getColor(paramInt))
    {
      return i;
      localResources = paramContext.getResources();
    }
  }
}


/* Location:              android/support/v4/c/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */