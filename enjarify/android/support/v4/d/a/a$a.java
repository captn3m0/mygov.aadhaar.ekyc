package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class a$a
  implements a.b
{
  public void a(Drawable paramDrawable) {}
  
  public void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) {}
  
  public void a(Drawable paramDrawable, int paramInt)
  {
    boolean bool = paramDrawable instanceof h;
    if (bool)
    {
      paramDrawable = (h)paramDrawable;
      paramDrawable.setTint(paramInt);
    }
  }
  
  public void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    boolean bool = paramDrawable instanceof h;
    if (bool)
    {
      paramDrawable = (h)paramDrawable;
      paramDrawable.setTintList(paramColorStateList);
    }
  }
  
  public void a(Drawable paramDrawable, Resources.Theme paramTheme) {}
  
  public void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
  }
  
  public void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    boolean bool = paramDrawable instanceof h;
    if (bool)
    {
      paramDrawable = (h)paramDrawable;
      paramDrawable.setTintMode(paramMode);
    }
  }
  
  public void a(Drawable paramDrawable, boolean paramBoolean) {}
  
  public boolean b(Drawable paramDrawable)
  {
    return false;
  }
  
  public boolean b(Drawable paramDrawable, int paramInt)
  {
    return false;
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof h;
    if (!bool)
    {
      d locald = new android/support/v4/d/a/d;
      locald.<init>(paramDrawable);
      paramDrawable = locald;
    }
    return (Drawable)paramDrawable;
  }
  
  public int d(Drawable paramDrawable)
  {
    return 0;
  }
  
  public int e(Drawable paramDrawable)
  {
    return 0;
  }
  
  public boolean f(Drawable paramDrawable)
  {
    return false;
  }
  
  public ColorFilter g(Drawable paramDrawable)
  {
    return null;
  }
}


/* Location:              android/support/v4/d/a/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */