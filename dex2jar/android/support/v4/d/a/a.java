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
  static final b a = new a();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new g();
      return;
    }
    if (i >= 21)
    {
      a = new f();
      return;
    }
    if (i >= 19)
    {
      a = new e();
      return;
    }
    if (i >= 17)
    {
      a = new d();
      return;
    }
    if (i >= 11)
    {
      a = new c();
      return;
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
  
  static class a
    implements a.b
  {
    public void a(Drawable paramDrawable) {}
    
    public void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) {}
    
    public void a(Drawable paramDrawable, int paramInt)
    {
      if ((paramDrawable instanceof h)) {
        ((h)paramDrawable).setTint(paramInt);
      }
    }
    
    public void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
    
    public void a(Drawable paramDrawable, ColorStateList paramColorStateList)
    {
      if ((paramDrawable instanceof h)) {
        ((h)paramDrawable).setTintList(paramColorStateList);
      }
    }
    
    public void a(Drawable paramDrawable, Resources.Theme paramTheme) {}
    
    public void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
    }
    
    public void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
    {
      if ((paramDrawable instanceof h)) {
        ((h)paramDrawable).setTintMode(paramMode);
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
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof h)) {
        localObject = new d(paramDrawable);
      }
      return (Drawable)localObject;
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
  
  static abstract interface b
  {
    public abstract void a(Drawable paramDrawable);
    
    public abstract void a(Drawable paramDrawable, float paramFloat1, float paramFloat2);
    
    public abstract void a(Drawable paramDrawable, int paramInt);
    
    public abstract void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract void a(Drawable paramDrawable, ColorStateList paramColorStateList);
    
    public abstract void a(Drawable paramDrawable, Resources.Theme paramTheme);
    
    public abstract void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);
    
    public abstract void a(Drawable paramDrawable, PorterDuff.Mode paramMode);
    
    public abstract void a(Drawable paramDrawable, boolean paramBoolean);
    
    public abstract boolean b(Drawable paramDrawable);
    
    public abstract boolean b(Drawable paramDrawable, int paramInt);
    
    public abstract Drawable c(Drawable paramDrawable);
    
    public abstract int d(Drawable paramDrawable);
    
    public abstract int e(Drawable paramDrawable);
    
    public abstract boolean f(Drawable paramDrawable);
    
    public abstract ColorFilter g(Drawable paramDrawable);
  }
  
  static class c
    extends a.a
  {
    public final void a(Drawable paramDrawable)
    {
      paramDrawable.jumpToCurrentState();
    }
    
    public Drawable c(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof h)) {
        localObject = new e(paramDrawable);
      }
      return (Drawable)localObject;
    }
  }
  
  static class d
    extends a.c
  {
    public boolean b(Drawable paramDrawable, int paramInt)
    {
      return b.a(paramDrawable, paramInt);
    }
    
    public int d(Drawable paramDrawable)
    {
      int i = b.a(paramDrawable);
      if (i >= 0) {
        return i;
      }
      return 0;
    }
  }
  
  static class e
    extends a.d
  {
    public final void a(Drawable paramDrawable, boolean paramBoolean)
    {
      paramDrawable.setAutoMirrored(paramBoolean);
    }
    
    public final boolean b(Drawable paramDrawable)
    {
      return paramDrawable.isAutoMirrored();
    }
    
    public Drawable c(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof h)) {
        localObject = new f(paramDrawable);
      }
      return (Drawable)localObject;
    }
    
    public final int e(Drawable paramDrawable)
    {
      return paramDrawable.getAlpha();
    }
  }
  
  static class f
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
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof h)) {
        localObject = new g(paramDrawable);
      }
      return (Drawable)localObject;
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
  
  static final class g
    extends a.f
  {
    public final boolean b(Drawable paramDrawable, int paramInt)
    {
      return paramDrawable.setLayoutDirection(paramInt);
    }
    
    public final Drawable c(Drawable paramDrawable)
    {
      return paramDrawable;
    }
    
    public final int d(Drawable paramDrawable)
    {
      return paramDrawable.getLayoutDirection();
    }
  }
}


/* Location:              android/support/v4/d/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */