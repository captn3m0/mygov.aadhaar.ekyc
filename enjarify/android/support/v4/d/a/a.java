package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class a
{
  static final a.b a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/d/a/a$g;
      ((a.g)localObject).<init>();
      a = (a.b)localObject;
    }
    for (;;)
    {
      return;
      j = 21;
      if (i >= j)
      {
        localObject = new android/support/v4/d/a/a$f;
        ((a.f)localObject).<init>();
        a = (a.b)localObject;
      }
      else
      {
        j = 19;
        if (i >= j)
        {
          localObject = new android/support/v4/d/a/a$e;
          ((a.e)localObject).<init>();
          a = (a.b)localObject;
        }
        else
        {
          j = 17;
          if (i >= j)
          {
            localObject = new android/support/v4/d/a/a$d;
            ((a.d)localObject).<init>();
            a = (a.b)localObject;
          }
          else
          {
            j = 11;
            if (i >= j)
            {
              localObject = new android/support/v4/d/a/a$c;
              ((a.c)localObject).<init>();
              a = (a.b)localObject;
            }
            else
            {
              localObject = new android/support/v4/d/a/a$a;
              ((a.a)localObject).<init>();
              a = (a.b)localObject;
            }
          }
        }
      }
    }
  }
  
  public static void a(Drawable paramDrawable)
  {
    a.a(paramDrawable);
  }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    a.a(paramDrawable, paramFloat1, paramFloat2);
  }
  
  public static void a(Drawable paramDrawable, int paramInt)
  {
    a.a(paramDrawable, paramInt);
  }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    a.a(paramDrawable, paramColorStateList);
  }
  
  public static void a(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    a.a(paramDrawable, paramTheme);
  }
  
  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    a.a(paramDrawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    a.a(paramDrawable, paramMode);
  }
  
  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    a.a(paramDrawable, paramBoolean);
  }
  
  public static boolean b(Drawable paramDrawable)
  {
    return a.b(paramDrawable);
  }
  
  public static boolean b(Drawable paramDrawable, int paramInt)
  {
    return a.b(paramDrawable, paramInt);
  }
  
  public static int c(Drawable paramDrawable)
  {
    return a.e(paramDrawable);
  }
  
  public static boolean d(Drawable paramDrawable)
  {
    return a.f(paramDrawable);
  }
  
  public static ColorFilter e(Drawable paramDrawable)
  {
    return a.g(paramDrawable);
  }
  
  public static Drawable f(Drawable paramDrawable)
  {
    return a.c(paramDrawable);
  }
  
  public static int g(Drawable paramDrawable)
  {
    return a.d(paramDrawable);
  }
}


/* Location:              android/support/v4/d/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */