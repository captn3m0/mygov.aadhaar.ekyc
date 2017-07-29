package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class a$f
  extends a.e
{
  public final void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    paramDrawable.setHotspot(paramFloat1, paramFloat2);
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    paramDrawable.setTint(paramInt);
  }
  
  public final void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    paramDrawable.setTintList(paramColorStateList);
  }
  
  public final void a(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    paramDrawable.applyTheme(paramTheme);
  }
  
  public final void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  public final void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    paramDrawable.setTintMode(paramMode);
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof h;
    if (!bool)
    {
      g localg = new android/support/v4/d/a/g;
      localg.<init>(paramDrawable);
      paramDrawable = localg;
    }
    return (Drawable)paramDrawable;
  }
  
  public final boolean f(Drawable paramDrawable)
  {
    return paramDrawable.canApplyTheme();
  }
  
  public final ColorFilter g(Drawable paramDrawable)
  {
    return paramDrawable.getColorFilter();
  }
}


/* Location:              android/support/v4/d/a/a$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */