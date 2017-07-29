package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.v4.e.a.b;
import android.support.v4.h.e;
import android.support.v4.h.m;
import android.support.v7.a.a.j;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class g
  extends MenuInflater
{
  static final Class<?>[] a;
  static final Class<?>[] b;
  final Object[] c;
  final Object[] d;
  Context e;
  Object f;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    a = arrayOfClass;
    b = arrayOfClass;
  }
  
  public g(Context paramContext)
  {
    super(paramContext);
    e = paramContext;
    c = new Object[] { paramContext };
    d = c;
  }
  
  static Object a(Object paramObject)
  {
    for (;;)
    {
      if ((paramObject instanceof Activity)) {}
      while (!(paramObject instanceof ContextWrapper)) {
        return paramObject;
      }
      paramObject = ((ContextWrapper)paramObject).getBaseContext();
    }
  }
  
  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    b localb = new b(paramMenu);
    int i = paramXmlPullParser.getEventType();
    int j = 0;
    paramMenu = null;
    Object localObject;
    int k;
    if (i == 2)
    {
      localObject = paramXmlPullParser.getName();
      if (((String)localObject).equals("menu"))
      {
        k = paramXmlPullParser.next();
        label56:
        i = 0;
        label59:
        if (i != 0) {
          return;
        }
      }
    }
    switch (k)
    {
    default: 
    case 2: 
    case 3: 
      for (;;)
      {
        k = paramXmlPullParser.next();
        break label59;
        throw new RuntimeException("Expecting menu, got " + (String)localObject);
        k = paramXmlPullParser.next();
        i = k;
        if (k != 1) {
          break;
        }
        break label56;
        if (j == 0)
        {
          localObject = paramXmlPullParser.getName();
          if (((String)localObject).equals("group"))
          {
            localObject = z.e.obtainStyledAttributes(paramAttributeSet, a.j.MenuGroup);
            b = ((TypedArray)localObject).getResourceId(a.j.MenuGroup_android_id, 0);
            c = ((TypedArray)localObject).getInt(a.j.MenuGroup_android_menuCategory, 0);
            d = ((TypedArray)localObject).getInt(a.j.MenuGroup_android_orderInCategory, 0);
            e = ((TypedArray)localObject).getInt(a.j.MenuGroup_android_checkableBehavior, 0);
            f = ((TypedArray)localObject).getBoolean(a.j.MenuGroup_android_visible, true);
            g = ((TypedArray)localObject).getBoolean(a.j.MenuGroup_android_enabled, true);
            ((TypedArray)localObject).recycle();
          }
          else
          {
            if (((String)localObject).equals("item"))
            {
              localObject = z.e.obtainStyledAttributes(paramAttributeSet, a.j.MenuItem);
              i = ((TypedArray)localObject).getResourceId(a.j.MenuItem_android_id, 0);
              j = (((TypedArray)localObject).getInt(a.j.MenuItem_android_menuCategory, c) & 0xFFFF0000 | ((TypedArray)localObject).getInt(a.j.MenuItem_android_orderInCategory, d) & 0xFFFF);
              k = ((TypedArray)localObject).getText(a.j.MenuItem_android_title);
              l = ((TypedArray)localObject).getText(a.j.MenuItem_android_titleCondensed);
              m = ((TypedArray)localObject).getResourceId(a.j.MenuItem_android_icon, 0);
              n = b.a(((TypedArray)localObject).getString(a.j.MenuItem_android_alphabeticShortcut));
              o = b.a(((TypedArray)localObject).getString(a.j.MenuItem_android_numericShortcut));
              if (((TypedArray)localObject).hasValue(a.j.MenuItem_android_checkable)) {
                if (((TypedArray)localObject).getBoolean(a.j.MenuItem_android_checkable, false))
                {
                  k = 1;
                  label458:
                  p = k;
                  label465:
                  q = ((TypedArray)localObject).getBoolean(a.j.MenuItem_android_checked, false);
                  r = ((TypedArray)localObject).getBoolean(a.j.MenuItem_android_visible, f);
                  s = ((TypedArray)localObject).getBoolean(a.j.MenuItem_android_enabled, g);
                  t = ((TypedArray)localObject).getInt(a.j.MenuItem_showAsAction, -1);
                  x = ((TypedArray)localObject).getString(a.j.MenuItem_android_onClick);
                  u = ((TypedArray)localObject).getResourceId(a.j.MenuItem_actionLayout, 0);
                  v = ((TypedArray)localObject).getString(a.j.MenuItem_actionViewClass);
                  w = ((TypedArray)localObject).getString(a.j.MenuItem_actionProviderClass);
                  if (w == null) {
                    break label676;
                  }
                  k = 1;
                  label593:
                  if ((k == 0) || (u != 0) || (v != null)) {
                    break label682;
                  }
                }
              }
              for (y = ((e)localb.a(w, b, z.d));; y = null)
              {
                ((TypedArray)localObject).recycle();
                h = false;
                break;
                k = 0;
                break label458;
                p = e;
                break label465;
                label676:
                k = 0;
                break label593;
                label682:
                if (k != 0) {
                  Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
              }
            }
            if (((String)localObject).equals("menu"))
            {
              a(paramXmlPullParser, paramAttributeSet, localb.b());
            }
            else
            {
              j = 1;
              paramMenu = (Menu)localObject;
              continue;
              localObject = paramXmlPullParser.getName();
              if ((j != 0) && (((String)localObject).equals(paramMenu)))
              {
                j = 0;
                paramMenu = null;
              }
              else if (((String)localObject).equals("group"))
              {
                localb.a();
              }
              else if (((String)localObject).equals("item"))
              {
                if (!h) {
                  if ((y != null) && (y.e()))
                  {
                    localb.b();
                  }
                  else
                  {
                    h = true;
                    localb.a(a.add(b, i, j, k));
                  }
                }
              }
              else if (((String)localObject).equals("menu"))
              {
                i = 1;
              }
            }
          }
        }
      }
    }
    throw new RuntimeException("Unexpected end of document");
  }
  
  /* Error */
  public final void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 335
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 337	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 5
    //   19: aconst_null
    //   20: astore 4
    //   22: aload_0
    //   23: getfield 36	android/support/v7/view/g:e	Landroid/content/Context;
    //   26: invokevirtual 341	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   29: iload_1
    //   30: invokevirtual 347	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   33: astore 6
    //   35: aload 6
    //   37: astore 4
    //   39: aload 6
    //   41: astore_3
    //   42: aload 6
    //   44: astore 5
    //   46: aload_0
    //   47: aload 6
    //   49: aload 6
    //   51: invokestatic 353	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   54: aload_2
    //   55: invokespecial 308	android/support/v7/view/g:a	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   58: aload 6
    //   60: ifnull -47 -> 13
    //   63: aload 6
    //   65: invokeinterface 358 1 0
    //   70: return
    //   71: astore_2
    //   72: aload 4
    //   74: astore_3
    //   75: new 360	android/view/InflateException
    //   78: dup
    //   79: ldc_w 362
    //   82: aload_2
    //   83: invokespecial 365	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   86: athrow
    //   87: astore_2
    //   88: aload_3
    //   89: ifnull +9 -> 98
    //   92: aload_3
    //   93: invokeinterface 358 1 0
    //   98: aload_2
    //   99: athrow
    //   100: astore_2
    //   101: aload 5
    //   103: astore_3
    //   104: new 360	android/view/InflateException
    //   107: dup
    //   108: ldc_w 362
    //   111: aload_2
    //   112: invokespecial 365	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	g
    //   0	116	1	paramInt	int
    //   0	116	2	paramMenu	Menu
    //   15	89	3	localObject1	Object
    //   20	53	4	localObject2	Object
    //   17	85	5	localObject3	Object
    //   33	31	6	localXmlResourceParser	android.content.res.XmlResourceParser
    // Exception table:
    //   from	to	target	type
    //   22	35	71	org/xmlpull/v1/XmlPullParserException
    //   46	58	71	org/xmlpull/v1/XmlPullParserException
    //   22	35	87	finally
    //   46	58	87	finally
    //   75	87	87	finally
    //   104	116	87	finally
    //   22	35	100	java/io/IOException
    //   46	58	100	java/io/IOException
  }
  
  private static final class a
    implements MenuItem.OnMenuItemClickListener
  {
    private static final Class<?>[] a = { MenuItem.class };
    private Object b;
    private Method c;
    
    public a(Object paramObject, String paramString)
    {
      b = paramObject;
      Class localClass = paramObject.getClass();
      try
      {
        c = localClass.getMethod(paramString, a);
        return;
      }
      catch (Exception paramObject)
      {
        paramString = new InflateException("Couldn't resolve menu item onClick handler " + paramString + " in class " + localClass.getName());
        paramString.initCause((Throwable)paramObject);
        throw paramString;
      }
    }
    
    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      try
      {
        if (c.getReturnType() == Boolean.TYPE) {
          return ((Boolean)c.invoke(b, new Object[] { paramMenuItem })).booleanValue();
        }
        c.invoke(b, new Object[] { paramMenuItem });
        return true;
      }
      catch (Exception paramMenuItem)
      {
        throw new RuntimeException(paramMenuItem);
      }
    }
  }
  
  private final class b
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
    
    public b(Menu paramMenu)
    {
      a = paramMenu;
      a();
    }
    
    static char a(String paramString)
    {
      if (paramString == null) {
        return '\000';
      }
      return paramString.charAt(0);
    }
    
    final <T> T a(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
    {
      try
      {
        paramArrayOfClass = e.getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass);
        paramArrayOfClass.setAccessible(true);
        paramArrayOfClass = paramArrayOfClass.newInstance(paramArrayOfObject);
        return paramArrayOfClass;
      }
      catch (Exception paramArrayOfClass)
      {
        Log.w("SupportMenuInflater", "Cannot instantiate class: " + paramString, paramArrayOfClass);
      }
      return null;
    }
    
    public final void a()
    {
      b = 0;
      c = 0;
      d = 0;
      e = 0;
      f = true;
      g = true;
    }
    
    final void a(MenuItem paramMenuItem)
    {
      int i1 = 1;
      Object localObject = paramMenuItem.setChecked(q).setVisible(r).setEnabled(s);
      if (p > 0) {}
      for (boolean bool = true;; bool = false)
      {
        ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(l).setIcon(m).setAlphabeticShortcut(n).setNumericShortcut(o);
        if (t >= 0) {
          m.a(paramMenuItem, t);
        }
        if (x == null) {
          break label186;
        }
        if (!e.isRestricted()) {
          break;
        }
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
      }
      localObject = g.this;
      if (f == null) {
        f = g.a(e);
      }
      paramMenuItem.setOnMenuItemClickListener(new g.a(f, x));
      label186:
      if (p >= 2)
      {
        if ((paramMenuItem instanceof j)) {
          ((j)paramMenuItem).a(true);
        }
      }
      else
      {
        if (v == null) {
          break label388;
        }
        m.a(paramMenuItem, (View)a(v, g.a, c));
      }
      for (;;)
      {
        if (u > 0)
        {
          if (i1 != 0) {
            break label376;
          }
          m.b(paramMenuItem, u);
        }
        for (;;)
        {
          if (y != null) {
            m.a(paramMenuItem, y);
          }
          return;
          if (!(paramMenuItem instanceof k)) {
            break;
          }
          localObject = (k)paramMenuItem;
          try
          {
            if (e == null) {
              e = ((b)d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
            }
            e.invoke(d, new Object[] { Boolean.valueOf(true) });
          }
          catch (Exception localException)
          {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", localException);
          }
          break;
          label376:
          Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
        }
        label388:
        i1 = 0;
      }
    }
    
    public final SubMenu b()
    {
      h = true;
      SubMenu localSubMenu = a.addSubMenu(b, i, j, k);
      a(localSubMenu.getItem());
      return localSubMenu;
    }
  }
}


/* Location:              android/support/v7/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */