package android.support.v7.b.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.m;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class b
{
  private static final ThreadLocal a;
  private static final WeakHashMap b;
  private static final Object c;
  
  static
  {
    Object localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    a = (ThreadLocal)localObject;
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>(0);
    b = (WeakHashMap)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
  }
  
  public static ColorStateList a(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    Object localObject1;
    if (i >= j) {
      localObject1 = paramContext.getColorStateList(paramInt);
    }
    for (;;)
    {
      return (ColorStateList)localObject1;
      localObject1 = d(paramContext, paramInt);
      if (localObject1 == null)
      {
        ColorStateList localColorStateList2 = c(paramContext, paramInt);
        if (localColorStateList2 != null) {
          synchronized (c)
          {
            localObject1 = b;
            localObject1 = ((WeakHashMap)localObject1).get(paramContext);
            localObject1 = (SparseArray)localObject1;
            if (localObject1 == null)
            {
              localObject1 = new android/util/SparseArray;
              ((SparseArray)localObject1).<init>();
              localObject4 = b;
              ((WeakHashMap)localObject4).put(paramContext, localObject1);
            }
            Object localObject4 = new android/support/v7/b/a/b$a;
            Object localObject5 = paramContext.getResources();
            localObject5 = ((Resources)localObject5).getConfiguration();
            ((b.a)localObject4).<init>(localColorStateList2, (Configuration)localObject5);
            ((SparseArray)localObject1).append(paramInt, localObject4);
            localObject1 = localColorStateList2;
          }
        }
        ColorStateList localColorStateList1 = android.support.v4.c.a.b(paramContext, paramInt);
      }
    }
  }
  
  public static Drawable b(Context paramContext, int paramInt)
  {
    return m.a().a(paramContext, paramInt, false);
  }
  
  private static ColorStateList c(Context paramContext, int paramInt)
  {
    int i = 1;
    Object localObject1 = paramContext.getResources();
    Object localObject2 = (TypedValue)a.get();
    if (localObject2 == null)
    {
      localObject2 = new android/util/TypedValue;
      ((TypedValue)localObject2).<init>();
      ThreadLocal localThreadLocal = a;
      localThreadLocal.set(localObject2);
    }
    ((Resources)localObject1).getValue(paramInt, (TypedValue)localObject2, i);
    int j = type;
    int k = 28;
    int m;
    if (j >= k)
    {
      m = type;
      j = 31;
      if (m <= j)
      {
        m = i;
        if (m == 0) {
          break label115;
        }
        m = 0;
        localObject2 = null;
      }
    }
    for (;;)
    {
      return (ColorStateList)localObject2;
      m = 0;
      localObject2 = null;
      break;
      label115:
      localObject2 = paramContext.getResources();
      Object localObject4 = ((Resources)localObject2).getXml(paramInt);
      try
      {
        localObject1 = paramContext.getTheme();
        localObject2 = a.a((Resources)localObject2, (XmlPullParser)localObject4, (Resources.Theme)localObject1);
      }
      catch (Exception localException)
      {
        localObject4 = "AppCompatResources";
        localObject1 = "Failed to inflate ColorStateList, leaving it to the framework";
        Log.e((String)localObject4, (String)localObject1, localException);
        m = 0;
        Object localObject3 = null;
      }
    }
  }
  
  private static ColorStateList d(Context paramContext, int paramInt)
  {
    synchronized (c)
    {
      Object localObject2 = b;
      localObject2 = ((WeakHashMap)localObject2).get(paramContext);
      localObject2 = (SparseArray)localObject2;
      if (localObject2 != null)
      {
        int i = ((SparseArray)localObject2).size();
        if (i > 0)
        {
          Object localObject4 = ((SparseArray)localObject2).get(paramInt);
          localObject4 = (b.a)localObject4;
          if (localObject4 != null)
          {
            Configuration localConfiguration = b;
            Object localObject5 = paramContext.getResources();
            localObject5 = ((Resources)localObject5).getConfiguration();
            boolean bool = localConfiguration.equals((Configuration)localObject5);
            if (bool)
            {
              localObject2 = a;
              return (ColorStateList)localObject2;
            }
            ((SparseArray)localObject2).remove(paramInt);
          }
        }
      }
      localObject2 = null;
    }
  }
}


/* Location:              android/support/v7/b/a/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */