package android.support.v7.view;

import android.content.Context;
import android.support.v4.e.a.b;
import android.support.v4.h.e;
import android.support.v4.h.m;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

final class g$b
{
  Menu a;
  int b;
  int c;
  int d;
  int e;
  boolean f;
  boolean g;
  boolean h;
  int i;
  int j;
  CharSequence k;
  CharSequence l;
  int m;
  char n;
  char o;
  int p;
  boolean q;
  boolean r;
  boolean s;
  int t;
  int u;
  String v;
  String w;
  String x;
  e y;
  
  public g$b(g paramg, Menu paramMenu)
  {
    a = paramMenu;
    a();
  }
  
  static char a(String paramString)
  {
    char c1 = '\000';
    if (paramString == null) {}
    for (;;)
    {
      return c1;
      c1 = paramString.charAt(0);
    }
  }
  
  final Object a(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      localObject1 = z;
      localObject1 = e;
      localObject1 = ((Context)localObject1).getClassLoader();
      localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
      localObject1 = ((Class)localObject1).getConstructor(paramArrayOfClass);
      boolean bool = true;
      ((Constructor)localObject1).setAccessible(bool);
      localObject1 = ((Constructor)localObject1).newInstance(paramArrayOfObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "SupportMenuInflater";
        Object localObject3 = new java/lang/StringBuilder;
        String str2 = "Cannot instantiate class: ";
        ((StringBuilder)localObject3).<init>(str2);
        localObject3 = paramString;
        Log.w(str1, (String)localObject3, localException);
        Object localObject2 = null;
      }
    }
    return localObject1;
  }
  
  public final void a()
  {
    boolean bool = true;
    b = 0;
    c = 0;
    d = 0;
    e = 0;
    f = bool;
    g = bool;
  }
  
  final void a(MenuItem paramMenuItem)
  {
    Object[] arrayOfObject = null;
    int i1 = 1;
    boolean bool1 = q;
    Object localObject1 = paramMenuItem.setChecked(bool1);
    boolean bool5 = r;
    localObject1 = ((MenuItem)localObject1).setVisible(bool5);
    bool5 = s;
    Object localObject2 = ((MenuItem)localObject1).setEnabled(bool5);
    int i2 = p;
    if (i2 > 0) {
      i2 = i1;
    }
    for (;;)
    {
      localObject1 = ((MenuItem)localObject2).setCheckable(i2);
      localObject2 = l;
      localObject1 = ((MenuItem)localObject1).setTitleCondensed((CharSequence)localObject2);
      int i6 = m;
      localObject1 = ((MenuItem)localObject1).setIcon(i6);
      i6 = n;
      localObject1 = ((MenuItem)localObject1).setAlphabeticShortcut(i6);
      i7 = o;
      ((MenuItem)localObject1).setNumericShortcut(i7);
      int i3 = t;
      if (i3 >= 0)
      {
        i3 = t;
        m.a(paramMenuItem, i3);
      }
      localObject1 = x;
      if (localObject1 == null) {
        break label296;
      }
      localObject1 = z.e;
      boolean bool2 = ((Context)localObject1).isRestricted();
      if (!bool2) {
        break;
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("The android:onClick attribute cannot be used within a restricted context");
      throw ((Throwable)localObject1);
      bool2 = false;
      localObject1 = null;
    }
    localObject1 = new android/support/v7/view/g$a;
    localObject2 = z;
    Object localObject3 = f;
    if (localObject3 == null)
    {
      localObject3 = g.a(e);
      f = localObject3;
    }
    localObject2 = f;
    localObject3 = x;
    ((g.a)localObject1).<init>(localObject2, (String)localObject3);
    paramMenuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)localObject1);
    label296:
    int i4 = p;
    int i7 = 2;
    if (i4 >= i7)
    {
      boolean bool3 = paramMenuItem instanceof j;
      if (bool3)
      {
        localObject1 = paramMenuItem;
        localObject1 = (j)paramMenuItem;
        ((j)localObject1).a(i1);
      }
    }
    else
    {
      localObject1 = v;
      if (localObject1 == null) {
        break label657;
      }
      localObject1 = v;
      localObject2 = g.a;
      arrayOfObject = z.c;
      localObject1 = (View)a((String)localObject1, (Class[])localObject2, arrayOfObject);
      m.a((MenuItem)paramMenuItem, (View)localObject1);
    }
    for (;;)
    {
      int i5 = u;
      if (i5 > 0)
      {
        if (i1 != 0) {
          break label637;
        }
        i5 = u;
        m.b((MenuItem)paramMenuItem, i5);
      }
      for (;;)
      {
        localObject1 = y;
        if (localObject1 != null)
        {
          localObject1 = y;
          m.a((MenuItem)paramMenuItem, (e)localObject1);
        }
        return;
        boolean bool4 = paramMenuItem instanceof k;
        if (!bool4) {
          break;
        }
        localObject1 = paramMenuItem;
        localObject1 = (k)paramMenuItem;
        try
        {
          localObject2 = e;
          if (localObject2 == null)
          {
            localObject2 = d;
            localObject2 = (b)localObject2;
            localObject2 = localObject2.getClass();
            localObject3 = "setExclusiveCheckable";
            i8 = 1;
            arrayOfClass = new Class[i8];
            bool6 = false;
            localBoolean = null;
            Class localClass = Boolean.TYPE;
            arrayOfClass[0] = localClass;
            localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject3, arrayOfClass);
            e = ((Method)localObject2);
          }
          localObject2 = e;
          localObject1 = d;
          int i9 = 1;
          localObject3 = new Object[i9];
          int i8 = 0;
          Class[] arrayOfClass = null;
          boolean bool6 = true;
          Boolean localBoolean = Boolean.valueOf(bool6);
          localObject3[0] = localBoolean;
          ((Method)localObject2).invoke(localObject1, (Object[])localObject3);
        }
        catch (Exception localException)
        {
          localObject2 = "MenuItemWrapper";
          localObject3 = "Error while calling setExclusiveCheckable";
          Log.w((String)localObject2, (String)localObject3, localException);
        }
        break;
        label637:
        String str = "SupportMenuInflater";
        localObject2 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified.";
        Log.w(str, (String)localObject2);
      }
      label657:
      i1 = 0;
    }
  }
  
  public final SubMenu b()
  {
    h = true;
    Object localObject = a;
    int i1 = b;
    int i2 = i;
    int i3 = j;
    CharSequence localCharSequence = k;
    localObject = ((Menu)localObject).addSubMenu(i1, i2, i3, localCharSequence);
    MenuItem localMenuItem = ((SubMenu)localObject).getItem();
    a(localMenuItem);
    return (SubMenu)localObject;
  }
}


/* Location:              android/support/v7/view/g$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */