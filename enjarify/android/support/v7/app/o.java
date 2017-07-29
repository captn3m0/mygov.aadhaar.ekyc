package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.g.a;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.support.v7.view.d;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

final class o
{
  private static final Class[] a;
  private static final int[] b;
  private static final String[] c;
  private static final Map d;
  private final Object[] e;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new Class[i];
    localObject[0] = Context.class;
    localObject[j] = AttributeSet.class;
    a = (Class[])localObject;
    localObject = new int[j];
    localObject[0] = 16843375;
    b = (int[])localObject;
    localObject = new String[3];
    localObject[0] = "android.widget.";
    localObject[j] = "android.view.";
    localObject[i] = "android.webkit.";
    c = (String[])localObject;
    localObject = new android/support/v4/g/a;
    ((a)localObject).<init>();
    d = (Map)localObject;
  }
  
  o()
  {
    Object[] arrayOfObject = new Object[2];
    e = arrayOfObject;
  }
  
  static Context a(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    int i = 0;
    String str1 = null;
    Object localObject = a.j.View;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, 0, 0);
    int j;
    if (paramBoolean)
    {
      j = a.j.View_android_theme;
      j = localTypedArray.getResourceId(j, 0);
    }
    for (;;)
    {
      if (j == 0)
      {
        j = a.j.View_theme;
        j = localTypedArray.getResourceId(j, 0);
        if (j != 0)
        {
          str1 = "AppCompatViewInflater";
          String str2 = "app:theme is now deprecated. Please move to using android:theme instead.";
          Log.i(str1, str2);
        }
      }
      i = j;
      localTypedArray.recycle();
      if (j != 0)
      {
        boolean bool = paramContext instanceof d;
        if (bool)
        {
          localObject = paramContext;
          localObject = (d)paramContext;
          k = a;
          if (k == i) {}
        }
        else
        {
          localObject = new android/support/v7/view/d;
          ((d)localObject).<init>((Context)paramContext, i);
          paramContext = (Context)localObject;
        }
      }
      return (Context)paramContext;
      int k = 0;
      localObject = null;
    }
  }
  
  private View a(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject1 = (Constructor)d.get(paramString1);
    if (localObject1 == null) {}
    for (;;)
    {
      try
      {
        Object localObject3 = paramContext.getClassLoader();
        if (paramString2 == null) {
          continue;
        }
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append(paramString2);
        localObject1 = ((StringBuilder)localObject1).append(paramString1);
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject1 = ((ClassLoader)localObject3).loadClass((String)localObject1);
        localObject3 = View.class;
        localObject1 = ((Class)localObject1).asSubclass((Class)localObject3);
        localObject3 = a;
        localObject1 = ((Class)localObject1).getConstructor((Class[])localObject3);
        localObject3 = d;
        ((Map)localObject3).put(paramString1, localObject1);
        boolean bool = true;
        ((Constructor)localObject1).setAccessible(bool);
        localObject3 = e;
        localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject3);
        localObject1 = (View)localObject1;
      }
      catch (Exception localException)
      {
        Object localObject2 = null;
        continue;
      }
      return (View)localObject1;
      localObject1 = paramString1;
    }
  }
  
  static void a(View paramView, AttributeSet paramAttributeSet)
  {
    Object localObject1 = paramView.getContext();
    boolean bool1 = localObject1 instanceof ContextWrapper;
    boolean bool2;
    if (bool1)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 15;
      if (i < j) {
        break label38;
      }
      bool2 = w.I(paramView);
      if (bool2) {
        break label38;
      }
    }
    for (;;)
    {
      return;
      label38:
      Object localObject2 = b;
      localObject1 = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, (int[])localObject2);
      bool2 = false;
      localObject2 = ((TypedArray)localObject1).getString(0);
      if (localObject2 != null)
      {
        o.a locala = new android/support/v7/app/o$a;
        locala.<init>(paramView, (String)localObject2);
        paramView.setOnClickListener(locala);
      }
      ((TypedArray)localObject1).recycle();
    }
  }
  
  final View a(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    i = 1;
    Object localObject1 = "view";
    boolean bool = paramString.equals(localObject1);
    if (bool)
    {
      localObject1 = "class";
      paramString = paramAttributeSet.getAttributeValue(null, (String)localObject1);
    }
    for (;;)
    {
      try
      {
        localObject1 = e;
        k = 0;
        arrayOfObject = null;
        localObject1[0] = paramContext;
        localObject1 = e;
        k = 1;
        localObject1[k] = paramAttributeSet;
        j = -1;
        k = 46;
        k = paramString.indexOf(k);
        if (j != k) {
          continue;
        }
        k = 0;
        arrayOfObject = null;
        localObject1 = c;
        j = localObject1.length;
        if (k >= j) {
          continue;
        }
        localObject1 = c;
        localObject1 = localObject1[k];
        localObject1 = a(paramContext, paramString, (String)localObject1);
        if (localObject1 == null) {
          continue;
        }
        e[0] = null;
        arrayOfObject = e;
        arrayOfObject[i] = null;
      }
      catch (Exception localException)
      {
        int k;
        Object[] arrayOfObject;
        e[0] = null;
        e[i] = null;
        int j = 0;
        Object localObject2 = null;
        continue;
      }
      finally
      {
        e[0] = null;
        e[i] = null;
      }
      return (View)localObject1;
      j = k + 1;
      k = j;
      continue;
      e[0] = null;
      e[i] = null;
      j = 0;
      localObject1 = null;
      continue;
      j = 0;
      localObject1 = null;
      localObject1 = a(paramContext, paramString, null);
      e[0] = null;
      arrayOfObject = e;
      arrayOfObject[i] = null;
    }
  }
}


/* Location:              android/support/v7/app/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */