package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.v4.h.e;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import org.xmlpull.v1.XmlPullParser;

public final class g
  extends MenuInflater
{
  static final Class[] a;
  static final Class[] b;
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
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    c = arrayOfObject;
    arrayOfObject = c;
    d = arrayOfObject;
  }
  
  static Object a(Object paramObject)
  {
    for (Object localObject = paramObject;; localObject = ((ContextWrapper)localObject).getBaseContext())
    {
      boolean bool = localObject instanceof Activity;
      if (bool) {}
      do
      {
        return localObject;
        bool = localObject instanceof ContextWrapper;
      } while (!bool);
    }
  }
  
  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    g.b localb = new android/support/v7/view/g$b;
    localb.<init>(this, paramMenu);
    int i = paramXmlPullParser.getEventType();
    int i3 = 0;
    float f1 = 0.0F;
    int i4 = 0;
    float f2 = 0.0F;
    Object localObject1 = null;
    int i5 = 2;
    float f3 = 2.8E-45F;
    Object localObject3;
    int i6;
    if (i == i5)
    {
      localObject2 = paramXmlPullParser.getName();
      localObject3 = "menu";
      i6 = ((String)localObject2).equals(localObject3);
      if (i6 != 0)
      {
        i = paramXmlPullParser.next();
        label83:
        i6 = 0;
        f3 = 0.0F;
        localObject3 = null;
        label92:
        if (i6 != 0) {
          return;
        }
      }
    }
    label124:
    float f4;
    switch (i)
    {
    default: 
      i = i6;
      f4 = f3;
      localObject3 = localObject1;
      i4 = i3;
      f2 = f1;
    case 2: 
    case 3: 
      for (;;)
      {
        i3 = paramXmlPullParser.next();
        int i8 = i;
        float f5 = f4;
        i = i3;
        i3 = i4;
        f1 = f2;
        localObject1 = localObject3;
        i6 = i8;
        f3 = f4;
        break label92;
        localObject3 = new java/lang/RuntimeException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Expecting menu, got ");
        localObject2 = (String)localObject2;
        ((RuntimeException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
        i = paramXmlPullParser.next();
        i6 = 1;
        f3 = Float.MIN_VALUE;
        if (i != i6) {
          break;
        }
        break label83;
        if (i3 != 0) {
          break label124;
        }
        localObject2 = paramXmlPullParser.getName();
        Object localObject4 = "group";
        boolean bool6 = ((String)localObject2).equals(localObject4);
        Object localObject5;
        boolean bool8;
        if (bool6)
        {
          localObject2 = z.e;
          localObject4 = a.j.MenuGroup;
          localObject2 = ((Context)localObject2).obtainStyledAttributes(paramAttributeSet, (int[])localObject4);
          int i9 = a.j.MenuGroup_android_id;
          i9 = ((TypedArray)localObject2).getResourceId(i9, 0);
          b = i9;
          i9 = a.j.MenuGroup_android_menuCategory;
          i9 = ((TypedArray)localObject2).getInt(i9, 0);
          c = i9;
          i9 = a.j.MenuGroup_android_orderInCategory;
          i9 = ((TypedArray)localObject2).getInt(i9, 0);
          d = i9;
          i9 = a.j.MenuGroup_android_checkableBehavior;
          localObject5 = null;
          i9 = ((TypedArray)localObject2).getInt(i9, 0);
          e = i9;
          i9 = a.j.MenuGroup_android_visible;
          boolean bool7 = ((TypedArray)localObject2).getBoolean(i9, true);
          f = bool7;
          int i10 = a.j.MenuGroup_android_enabled;
          boolean bool9 = true;
          bool8 = ((TypedArray)localObject2).getBoolean(i10, bool9);
          g = bool8;
          ((TypedArray)localObject2).recycle();
          i = i6;
          f4 = f3;
          localObject3 = localObject1;
          i4 = i3;
          f2 = f1;
        }
        else
        {
          localObject4 = "item";
          bool8 = ((String)localObject2).equals(localObject4);
          label791:
          label798:
          int i2;
          label1012:
          int i13;
          if (bool8)
          {
            localObject2 = z.e;
            localObject4 = a.j.MenuItem;
            localObject4 = ((Context)localObject2).obtainStyledAttributes(paramAttributeSet, (int[])localObject4);
            i = a.j.MenuItem_android_id;
            i = ((TypedArray)localObject4).getResourceId(i, 0);
            i = i;
            i = a.j.MenuItem_android_menuCategory;
            int i12 = c;
            i = ((TypedArray)localObject4).getInt(i, i12);
            i12 = a.j.MenuItem_android_orderInCategory;
            int i14 = d;
            i12 = ((TypedArray)localObject4).getInt(i12, i14);
            i &= 0xFFFF0000;
            i14 = (char)-1;
            i12 &= i14;
            i |= i12;
            j = i;
            i = a.j.MenuItem_android_title;
            localObject2 = ((TypedArray)localObject4).getText(i);
            k = ((CharSequence)localObject2);
            i = a.j.MenuItem_android_titleCondensed;
            localObject2 = ((TypedArray)localObject4).getText(i);
            l = ((CharSequence)localObject2);
            i = a.j.MenuItem_android_icon;
            boolean bool10 = false;
            localObject5 = null;
            i = ((TypedArray)localObject4).getResourceId(i, 0);
            m = i;
            i = a.j.MenuItem_android_alphabeticShortcut;
            i = g.b.a(((TypedArray)localObject4).getString(i));
            n = i;
            i = a.j.MenuItem_android_numericShortcut;
            localObject2 = ((TypedArray)localObject4).getString(i);
            i = g.b.a((String)localObject2);
            o = i;
            i = a.j.MenuItem_android_checkable;
            boolean bool1 = ((TypedArray)localObject4).hasValue(i);
            if (bool1)
            {
              int j = a.j.MenuItem_android_checkable;
              bool10 = false;
              localObject5 = null;
              int k = ((TypedArray)localObject4).getBoolean(j, false);
              if (k != 0)
              {
                k = 1;
                f4 = Float.MIN_VALUE;
                p = k;
                int m = a.j.MenuItem_android_checked;
                boolean bool2 = ((TypedArray)localObject4).getBoolean(m, false);
                q = bool2;
                int n = a.j.MenuItem_android_visible;
                bool10 = f;
                boolean bool3 = ((TypedArray)localObject4).getBoolean(n, bool10);
                r = bool3;
                int i1 = a.j.MenuItem_android_enabled;
                bool10 = g;
                boolean bool4 = ((TypedArray)localObject4).getBoolean(i1, bool10);
                s = bool4;
                i2 = a.j.MenuItem_showAsAction;
                i2 = ((TypedArray)localObject4).getInt(i2, -1);
                t = i2;
                i2 = a.j.MenuItem_android_onClick;
                localObject2 = ((TypedArray)localObject4).getString(i2);
                x = ((String)localObject2);
                i2 = a.j.MenuItem_actionLayout;
                bool10 = false;
                localObject5 = null;
                i2 = ((TypedArray)localObject4).getResourceId(i2, 0);
                u = i2;
                i2 = a.j.MenuItem_actionViewClass;
                localObject2 = ((TypedArray)localObject4).getString(i2);
                v = ((String)localObject2);
                i2 = a.j.MenuItem_actionProviderClass;
                localObject2 = ((TypedArray)localObject4).getString(i2);
                w = ((String)localObject2);
                localObject2 = w;
                if (localObject2 == null) {
                  break label1152;
                }
                i2 = 1;
                f4 = Float.MIN_VALUE;
                if (i2 == 0) {
                  break label1164;
                }
                i13 = u;
                if (i13 != 0) {
                  break label1164;
                }
                localObject5 = v;
                if (localObject5 != null) {
                  break label1164;
                }
                localObject2 = w;
                localObject5 = b;
                Object[] arrayOfObject = z.d;
                localObject2 = (e)localb.a((String)localObject2, (Class[])localObject5, arrayOfObject);
              }
            }
            for (y = ((e)localObject2);; y = null)
            {
              ((TypedArray)localObject4).recycle();
              localObject2 = null;
              h = false;
              i2 = i6;
              f4 = f3;
              localObject3 = localObject1;
              i4 = i3;
              f2 = f1;
              break;
              i2 = 0;
              f4 = 0.0F;
              localObject2 = null;
              break label791;
              i2 = e;
              p = i2;
              break label798;
              label1152:
              i2 = 0;
              f4 = 0.0F;
              localObject2 = null;
              break label1012;
              label1164:
              if (i2 != 0)
              {
                localObject2 = "SupportMenuInflater";
                localObject5 = "Ignoring attribute 'actionProviderClass'. Action view already specified.";
                Log.w((String)localObject2, (String)localObject5);
              }
              i2 = 0;
              f4 = 0.0F;
              localObject2 = null;
            }
          }
          localObject4 = "menu";
          bool8 = ((String)localObject2).equals(localObject4);
          if (bool8)
          {
            localObject2 = localb.b();
            a(paramXmlPullParser, paramAttributeSet, (Menu)localObject2);
            i2 = i6;
            f4 = f3;
            localObject3 = localObject1;
            i4 = i3;
            f2 = f1;
          }
          else
          {
            i4 = 1;
            f2 = Float.MIN_VALUE;
            i8 = i6;
            f5 = f3;
            localObject3 = localObject2;
            i2 = i6;
            f4 = f3;
            continue;
            localObject2 = paramXmlPullParser.getName();
            int i7;
            if (i3 != 0)
            {
              bool8 = ((String)localObject2).equals(localObject1);
              if (bool8)
              {
                i4 = 0;
                f2 = 0.0F;
                localObject1 = null;
                localObject2 = null;
                i8 = i6;
                f5 = f3;
                i7 = 0;
                localObject3 = null;
                f3 = 0.0F;
                i2 = i8;
                f4 = f5;
                continue;
              }
            }
            localObject4 = "group";
            bool8 = ((String)localObject2).equals(localObject4);
            if (bool8)
            {
              localb.a();
              i2 = i7;
              f4 = f3;
              localObject3 = localObject1;
              i4 = i3;
              f2 = f1;
            }
            else
            {
              localObject4 = "item";
              bool8 = ((String)localObject2).equals(localObject4);
              if (bool8)
              {
                bool5 = h;
                if (bool5) {
                  break label124;
                }
                localObject2 = y;
                if (localObject2 != null)
                {
                  localObject2 = y;
                  bool5 = ((e)localObject2).e();
                  if (bool5)
                  {
                    localb.b();
                    bool5 = i7;
                    f4 = f3;
                    localObject3 = localObject1;
                    i4 = i3;
                    f2 = f1;
                    continue;
                  }
                }
                h = true;
                localObject2 = a;
                int i11 = b;
                i13 = i;
                int i15 = j;
                CharSequence localCharSequence = k;
                localObject2 = ((Menu)localObject2).add(i11, i13, i15, localCharSequence);
                localb.a((MenuItem)localObject2);
                bool5 = i7;
                f4 = f3;
                localObject3 = localObject1;
                i4 = i3;
                f2 = f1;
                continue;
              }
              localObject4 = "menu";
              boolean bool5 = ((String)localObject2).equals(localObject4);
              if (!bool5) {
                break label124;
              }
              bool5 = true;
              f4 = Float.MIN_VALUE;
              localObject3 = localObject1;
              i4 = i3;
              f2 = f1;
            }
          }
        }
      }
    }
    Object localObject2 = new java/lang/RuntimeException;
    ((RuntimeException)localObject2).<init>("Unexpected end of document");
    throw ((Throwable)localObject2);
  }
  
  /* Error */
  public final void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 325
    //   4: istore_3
    //   5: iload_3
    //   6: ifne +10 -> 16
    //   9: aload_0
    //   10: iload_1
    //   11: aload_2
    //   12: invokespecial 329	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   15: return
    //   16: aconst_null
    //   17: astore 4
    //   19: aload_0
    //   20: getfield 29	android/support/v7/view/g:e	Landroid/content/Context;
    //   23: astore 5
    //   25: aload 5
    //   27: invokevirtual 333	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   30: astore 5
    //   32: aload 5
    //   34: iload_1
    //   35: invokevirtual 339	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   38: astore 4
    //   40: aload 4
    //   42: invokestatic 345	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   45: astore 5
    //   47: aload_0
    //   48: aload 4
    //   50: aload 5
    //   52: aload_2
    //   53: checkcast 314	android/view/Menu
    //   56: invokespecial 304	android/support/v7/view/g:a	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   59: aload 4
    //   61: ifnull -46 -> 15
    //   64: aload 4
    //   66: invokeinterface 350 1 0
    //   71: goto -56 -> 15
    //   74: astore 5
    //   76: new 352	android/view/InflateException
    //   79: astore 6
    //   81: ldc_w 354
    //   84: astore 7
    //   86: aload 6
    //   88: aload 7
    //   90: aload 5
    //   92: invokespecial 357	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   95: aload 6
    //   97: athrow
    //   98: astore 5
    //   100: aload 4
    //   102: ifnull +10 -> 112
    //   105: aload 4
    //   107: invokeinterface 350 1 0
    //   112: aload 5
    //   114: athrow
    //   115: astore 5
    //   117: new 352	android/view/InflateException
    //   120: astore 6
    //   122: ldc_w 354
    //   125: astore 7
    //   127: aload 6
    //   129: aload 7
    //   131: aload 5
    //   133: invokespecial 357	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   136: aload 6
    //   138: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	g
    //   0	139	1	paramInt	int
    //   0	139	2	paramMenu	Menu
    //   4	2	3	bool	boolean
    //   17	89	4	localXmlResourceParser	android.content.res.XmlResourceParser
    //   23	28	5	localObject1	Object
    //   74	17	5	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   98	15	5	localObject2	Object
    //   115	17	5	localIOException	java.io.IOException
    //   79	58	6	localInflateException	android.view.InflateException
    //   84	46	7	str	String
    // Exception table:
    //   from	to	target	type
    //   19	23	74	org/xmlpull/v1/XmlPullParserException
    //   25	30	74	org/xmlpull/v1/XmlPullParserException
    //   34	38	74	org/xmlpull/v1/XmlPullParserException
    //   40	45	74	org/xmlpull/v1/XmlPullParserException
    //   52	59	74	org/xmlpull/v1/XmlPullParserException
    //   19	23	98	finally
    //   25	30	98	finally
    //   34	38	98	finally
    //   40	45	98	finally
    //   52	59	98	finally
    //   76	79	98	finally
    //   90	95	98	finally
    //   95	98	98	finally
    //   117	120	98	finally
    //   131	136	98	finally
    //   136	139	98	finally
    //   19	23	115	java/io/IOException
    //   25	30	115	java/io/IOException
    //   34	38	115	java/io/IOException
    //   40	45	115	java/io/IOException
    //   52	59	115	java/io/IOException
  }
}


/* Location:              android/support/v7/view/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */