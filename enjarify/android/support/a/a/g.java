package android.support.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.c.a.c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class g
  extends f
{
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  g.f c;
  boolean d = true;
  private PorterDuffColorFilter e;
  private ColorFilter f;
  private boolean g;
  private Drawable.ConstantState h;
  private final float[] i;
  private final Matrix j;
  private final Rect k;
  
  g()
  {
    Object localObject = new float[9];
    i = ((float[])localObject);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    j = ((Matrix)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    k = ((Rect)localObject);
    localObject = new android/support/a/a/g$f;
    ((g.f)localObject).<init>();
    c = ((g.f)localObject);
  }
  
  g(g.f paramf)
  {
    Object localObject = new float[9];
    i = ((float[])localObject);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    j = ((Matrix)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    k = ((Rect)localObject);
    c = paramf;
    localObject = c;
    PorterDuff.Mode localMode = d;
    localObject = a((ColorStateList)localObject, localMode);
    e = ((PorterDuffColorFilter)localObject);
  }
  
  static int a(int paramInt, float paramFloat)
  {
    int m = Color.alpha(paramInt);
    int n = 0xFFFFFF & paramInt;
    return (int)(m * paramFloat) << 24 | n;
  }
  
  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    Object localObject;
    if ((paramColorStateList == null) || (paramMode == null)) {
      localObject = null;
    }
    for (;;)
    {
      return (PorterDuffColorFilter)localObject;
      localObject = getState();
      int m = paramColorStateList.getColorForState((int[])localObject, 0);
      localObject = new android/graphics/PorterDuffColorFilter;
      ((PorterDuffColorFilter)localObject).<init>(m, paramMode);
    }
  }
  
  public static g a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    int m = 2;
    int n = Build.VERSION.SDK_INT;
    int i1 = 24;
    Object localObject1;
    Object localObject3;
    Object localObject4;
    if (n >= i1)
    {
      localObject1 = new android/support/a/a/g;
      ((g)localObject1).<init>();
      localObject3 = c.a(paramResources, paramInt, paramTheme);
      b = ((Drawable)localObject3);
      localObject3 = new android/support/a/a/g$g;
      localObject4 = b.getConstantState();
      ((g.g)localObject3).<init>((Drawable.ConstantState)localObject4);
      h = ((Drawable.ConstantState)localObject3);
    }
    for (;;)
    {
      return (g)localObject1;
      try
      {
        localObject1 = paramResources.getXml(paramInt);
        localObject3 = Xml.asAttributeSet((XmlPullParser)localObject1);
        int i2;
        int i3;
        do
        {
          i2 = ((XmlPullParser)localObject1).next();
          if (i2 == m) {
            break;
          }
          i3 = 1;
        } while (i2 != i3);
        if (i2 != m)
        {
          localObject1 = new org/xmlpull/v1/XmlPullParserException;
          localObject3 = "No start tag found";
          ((XmlPullParserException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        localObject3 = "VectorDrawableCompat";
        localObject4 = "parser error";
        Log.e((String)localObject3, (String)localObject4, localXmlPullParserException);
        n = 0;
        Object localObject2 = null;
        continue;
        localObject2 = a(paramResources, (XmlPullParser)localObject2, (AttributeSet)localObject3, paramTheme);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localObject3 = "VectorDrawableCompat";
          localObject4 = "parser error";
          Log.e((String)localObject3, (String)localObject4, localIOException);
        }
      }
    }
  }
  
  public static g a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    g localg = new android/support/a/a/g;
    localg.<init>();
    localg.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localg;
  }
  
  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int m = 3;
    int n = 1;
    float f1 = Float.MIN_VALUE;
    g.f localf = c;
    g.e locale = b;
    Stack localStack = new java/util/Stack;
    localStack.<init>();
    Object localObject1 = a;
    localStack.push(localObject1);
    int i1 = paramXmlPullParser.getEventType();
    int i2 = paramXmlPullParser.getDepth() + 1;
    int i3 = n;
    float f2 = f1;
    Object localObject3;
    if (i1 != n)
    {
      int i4 = paramXmlPullParser.getDepth();
      if ((i4 >= i2) || (i1 != m))
      {
        i4 = 2;
        Object localObject2;
        String str;
        boolean bool3;
        float f3;
        if (i1 == i4)
        {
          localObject2 = paramXmlPullParser.getName();
          localObject1 = (g.c)localStack.peek();
          str = "path";
          bool3 = str.equals(localObject2);
          if (bool3)
          {
            localObject3 = new android/support/a/a/g$b;
            ((g.b)localObject3).<init>();
            ((g.b)localObject3).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            b.add(localObject3);
            localObject1 = ((g.b)localObject3).getPathName();
            if (localObject1 != null)
            {
              localObject1 = h;
              localObject2 = ((g.b)localObject3).getPathName();
              ((android.support.v4.g.a)localObject1).put(localObject2, localObject3);
            }
            i1 = 0;
            f3 = 0.0F;
            localObject1 = null;
            i4 = a;
            i3 = o | i4;
            a = i3;
          }
        }
        for (;;)
        {
          int i6 = paramXmlPullParser.next();
          i3 = i1;
          f2 = f3;
          i1 = i6;
          break;
          str = "clip-path";
          bool3 = str.equals(localObject2);
          if (bool3)
          {
            localObject2 = new android/support/a/a/g$a;
            ((g.a)localObject2).<init>();
            ((g.a)localObject2).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            b.add(localObject2);
            localObject1 = ((g.a)localObject2).getPathName();
            if (localObject1 != null)
            {
              localObject1 = h;
              str = ((g.a)localObject2).getPathName();
              ((android.support.v4.g.a)localObject1).put(str, localObject2);
            }
            i1 = a;
            i4 = o;
            i1 |= i4;
            a = i1;
            i1 = i3;
            f3 = f2;
          }
          else
          {
            str = "group";
            boolean bool2 = str.equals(localObject2);
            if (bool2)
            {
              localObject2 = new android/support/a/a/g$c;
              ((g.c)localObject2).<init>();
              ((g.c)localObject2).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
              b.add(localObject2);
              localStack.push(localObject2);
              localObject1 = ((g.c)localObject2).getGroupName();
              if (localObject1 != null)
              {
                localObject1 = h;
                str = ((g.c)localObject2).getGroupName();
                ((android.support.v4.g.a)localObject1).put(str, localObject2);
              }
              i1 = a;
              int i5 = e;
              i1 |= i5;
              a = i1;
            }
            i1 = i3;
            f3 = f2;
            continue;
            if (i1 == m)
            {
              localObject1 = paramXmlPullParser.getName();
              localObject2 = "group";
              bool1 = ((String)localObject2).equals(localObject1);
              if (bool1) {
                localStack.pop();
              }
            }
            boolean bool1 = i3;
            f3 = f2;
          }
        }
      }
    }
    if (i3 != 0)
    {
      localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>();
      i3 = ((StringBuffer)localObject1).length();
      if (i3 > 0)
      {
        localObject3 = " or ";
        ((StringBuffer)localObject1).append((String)localObject3);
      }
      ((StringBuffer)localObject1).append("path");
      localObject3 = new org/xmlpull/v1/XmlPullParserException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("no ");
      localObject1 = localObject1 + " defined";
      ((XmlPullParserException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
    }
  }
  
  public final boolean canApplyTheme()
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      android.support.v4.d.a.a.d(localDrawable);
    }
    return false;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int m = 2048;
    int n = 1065353216;
    float f1 = 1.0F;
    int i2 = 1;
    float f2 = Float.MIN_VALUE;
    Object localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      ((Drawable)localObject1).draw(paramCanvas);
    }
    int i4;
    label109:
    Object localObject3;
    float f5;
    int i11;
    int i6;
    do
    {
      do
      {
        do
        {
          return;
          localObject1 = k;
          copyBounds((Rect)localObject1);
          localObject1 = k;
          i4 = ((Rect)localObject1).width();
        } while (i4 <= 0);
        localObject1 = k;
        i4 = ((Rect)localObject1).height();
      } while (i4 <= 0);
      localObject1 = f;
      if (localObject1 != null) {
        break;
      }
      localObject1 = e;
      localObject2 = j;
      paramCanvas.getMatrix((Matrix)localObject2);
      localObject2 = j;
      localObject3 = i;
      ((Matrix)localObject2).getValues((float[])localObject3);
      float f3 = Math.abs(i[0]);
      localObject2 = i;
      f4 = Math.abs(localObject2[4]);
      Object localObject4 = i;
      f5 = Math.abs(localObject4[i2]);
      float[] arrayOfFloat = i;
      i5 = 3;
      f6 = 4.2E-45F;
      float f7 = Math.abs(arrayOfFloat[i5]);
      boolean bool4 = f5 < 0.0F;
      if (!bool4)
      {
        bool4 = f7 < 0.0F;
        if (!bool4) {}
      }
      else
      {
        i7 = n;
        f4 = f1;
        i11 = n;
        f3 = f1;
      }
      f5 = k.width();
      f3 *= f5;
      i11 = (int)f3;
      localObject4 = k;
      f5 = ((Rect)localObject4).height();
      f4 *= f5;
      i7 = (int)f4;
      i11 = Math.min(m, i11);
      i6 = Math.min(m, i7);
    } while ((i11 <= 0) || (i6 <= 0));
    int i12 = paramCanvas.save();
    Object localObject2 = k;
    float f4 = left;
    Object localObject5 = k;
    float f6 = top;
    paramCanvas.translate(f4, f6);
    int i7 = Build.VERSION.SDK_INT;
    int i5 = 17;
    f6 = 2.4E-44F;
    label410:
    Object localObject6;
    label531:
    label592:
    int i10;
    if (i7 >= i5)
    {
      boolean bool5 = isAutoMirrored();
      if (bool5)
      {
        int i8 = getLayoutDirection();
        if (i8 == i2)
        {
          i8 = i2;
          f4 = f2;
          int i9;
          if (i8 != 0)
          {
            localObject2 = k;
            f4 = ((Rect)localObject2).width();
            paramCanvas.translate(f4, 0.0F);
            i9 = -1082130432;
            f4 = -1.0F;
            paramCanvas.scale(f4, f1);
          }
          k.offsetTo(0, 0);
          localObject6 = c;
          localObject2 = f;
          if (localObject2 != null)
          {
            localObject2 = f;
            i9 = ((Bitmap)localObject2).getWidth();
            if (i11 != i9) {
              break label715;
            }
            localObject2 = f;
            i9 = ((Bitmap)localObject2).getHeight();
            if (i6 != i9) {
              break label715;
            }
            i9 = i2;
            f4 = f2;
            if (i9 != 0) {}
          }
          else
          {
            localObject2 = Bitmap.Config.ARGB_8888;
            localObject2 = Bitmap.createBitmap(i11, i6, (Bitmap.Config)localObject2);
            f = ((Bitmap)localObject2);
            k = i2;
          }
          boolean bool6 = d;
          if (bool6) {
            break label727;
          }
          localObject2 = c;
          ((g.f)localObject2).a(i11, i6);
          localObject6 = c;
          localObject3 = k;
          localObject2 = b;
          i10 = ((g.e)localObject2).getRootAlpha();
          i6 = 255;
          f5 = 3.57E-43F;
          if (i10 >= i6) {
            break label940;
          }
          i10 = i2;
          f4 = f2;
          label643:
          if ((i10 != 0) || (localObject1 != null)) {
            break label952;
          }
          i4 = 0;
        }
      }
    }
    for (localObject1 = null;; localObject1 = l)
    {
      localObject2 = f;
      n = 0;
      f1 = 0.0F;
      localObject6 = null;
      paramCanvas.drawBitmap((Bitmap)localObject2, null, (Rect)localObject3, (Paint)localObject1);
      paramCanvas.restoreToCount(i12);
      break;
      localObject1 = f;
      break label109;
      i10 = 0;
      localObject2 = null;
      f4 = 0.0F;
      break label410;
      label715:
      i10 = 0;
      localObject2 = null;
      f4 = 0.0F;
      break label531;
      label727:
      localObject2 = c;
      boolean bool1 = k;
      int i1;
      if (!bool1)
      {
        localObject6 = g;
        localObject5 = c;
        if (localObject6 == localObject5)
        {
          localObject6 = h;
          localObject5 = d;
          if (localObject6 == localObject5)
          {
            bool1 = j;
            boolean bool3 = e;
            if (bool1 == bool3)
            {
              i1 = i;
              localObject2 = b;
              i10 = ((g.e)localObject2).getRootAlpha();
              if (i1 == i10) {
                i10 = i2;
              }
            }
          }
        }
      }
      for (f4 = f2;; f4 = 0.0F)
      {
        if (i10 != 0) {
          break label938;
        }
        c.a(i11, i6);
        localObject2 = c;
        localObject6 = c;
        g = ((ColorStateList)localObject6);
        localObject6 = d;
        h = ((PorterDuff.Mode)localObject6);
        localObject6 = b;
        i1 = ((g.e)localObject6).getRootAlpha();
        i = i1;
        boolean bool2 = e;
        j = bool2;
        k = false;
        break;
        i10 = 0;
        localObject2 = null;
      }
      label938:
      break label592;
      label940:
      i10 = 0;
      localObject2 = null;
      f4 = 0.0F;
      break label643;
      label952:
      localObject2 = l;
      if (localObject2 == null)
      {
        localObject2 = new android/graphics/Paint;
        ((Paint)localObject2).<init>();
        l = ((Paint)localObject2);
        localObject2 = l;
        ((Paint)localObject2).setFilterBitmap(i2);
      }
      localObject2 = l;
      g.e locale = b;
      int i3 = locale.getRootAlpha();
      ((Paint)localObject2).setAlpha(i3);
      localObject2 = l;
      ((Paint)localObject2).setColorFilter((ColorFilter)localObject1);
    }
  }
  
  public final int getAlpha()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (int m = android.support.v4.d.a.a.c((Drawable)localObject);; m = ((g.e)localObject).getRootAlpha())
    {
      return m;
      localObject = c.b;
    }
  }
  
  public final int getChangingConfigurations()
  {
    Drawable localDrawable = b;
    int m;
    if (localDrawable != null)
    {
      localDrawable = b;
      m = localDrawable.getChangingConfigurations();
    }
    for (;;)
    {
      return m;
      m = super.getChangingConfigurations();
      g.f localf = c;
      int n = localf.getChangingConfigurations();
      m |= n;
    }
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = new android/support/a/a/g$g;
      Drawable.ConstantState localConstantState = b.getConstantState();
      ((g.g)localObject).<init>(localConstantState);
    }
    for (;;)
    {
      return (Drawable.ConstantState)localObject;
      localObject = c;
      int m = getChangingConfigurations();
      a = m;
      localObject = c;
    }
  }
  
  public final int getIntrinsicHeight()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    float f1;
    for (int m = ((Drawable)localObject).getIntrinsicHeight();; m = (int)f1)
    {
      return m;
      localObject = c.b;
      f1 = c;
    }
  }
  
  public final int getIntrinsicWidth()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    float f1;
    for (int m = ((Drawable)localObject).getIntrinsicWidth();; m = (int)f1)
    {
      return m;
      localObject = c.b;
      f1 = b;
    }
  }
  
  public final int getOpacity()
  {
    Drawable localDrawable = b;
    if (localDrawable != null) {
      localDrawable = b;
    }
    for (int m = localDrawable.getOpacity();; m = -3) {
      return m;
    }
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
    }
    for (;;)
    {
      return;
      localDrawable = null;
      inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
    }
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int m = 1;
    Object localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      android.support.v4.d.a.a.a((Drawable)localObject1, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    for (;;)
    {
      return;
      Object localObject2 = c;
      localObject1 = new android/support/a/a/g$e;
      ((g.e)localObject1).<init>();
      b = ((g.e)localObject1);
      localObject1 = a.a;
      Object localObject3 = a(paramResources, paramTheme, paramAttributeSet, (int[])localObject1);
      Object localObject4 = c;
      g.e locale = b;
      float f1 = 8.4E-45F;
      int n = e.a((TypedArray)localObject3, paramXmlPullParser, "tintMode", 6);
      localObject1 = PorterDuff.Mode.SRC_IN;
      switch (n)
      {
      default: 
        d = ((PorterDuff.Mode)localObject1);
        localObject1 = ((TypedArray)localObject3).getColorStateList(m);
        if (localObject1 != null) {
          c = ((ColorStateList)localObject1);
        }
        String str = "autoMirrored";
        bool2 = e;
        boolean bool1 = e.a(paramXmlPullParser, str);
        if (bool1) {
          break;
        }
      }
      for (;;)
      {
        e = bool2;
        f1 = d;
        f2 = e.a((TypedArray)localObject3, paramXmlPullParser, "viewportWidth", 7, f1);
        d = f2;
        localObject1 = "viewportHeight";
        i3 = 8;
        f3 = 1.1E-44F;
        f1 = e;
        f2 = e.a((TypedArray)localObject3, paramXmlPullParser, (String)localObject1, i3, f1);
        e = f2;
        f2 = d;
        bool2 = f2 < 0.0F;
        if (bool2) {
          break label453;
        }
        localObject1 = new org/xmlpull/v1/XmlPullParserException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = ((TypedArray)localObject3).getPositionDescription();
        localObject2 = (String)localObject3 + "<vector> tag requires viewportWidth > 0";
        ((XmlPullParserException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        localObject1 = PorterDuff.Mode.SRC_OVER;
        break;
        localObject1 = PorterDuff.Mode.SRC_IN;
        break;
        localObject1 = PorterDuff.Mode.SRC_ATOP;
        break;
        localObject1 = PorterDuff.Mode.MULTIPLY;
        break;
        localObject1 = PorterDuff.Mode.SCREEN;
        break;
        int i1 = Build.VERSION.SDK_INT;
        int i4 = 11;
        if (i1 < i4) {
          break;
        }
        localObject1 = PorterDuff.Mode.ADD;
        break;
        i1 = 5;
        f1 = 7.0E-45F;
        bool2 = ((TypedArray)localObject3).getBoolean(i1, bool2);
      }
      label453:
      float f2 = e;
      boolean bool2 = f2 < 0.0F;
      if (!bool2)
      {
        localObject1 = new org/xmlpull/v1/XmlPullParserException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = ((TypedArray)localObject3).getPositionDescription();
        localObject2 = (String)localObject3 + "<vector> tag requires viewportHeight > 0";
        ((XmlPullParserException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      float f3 = b;
      f2 = ((TypedArray)localObject3).getDimension(3, f3);
      b = f2;
      f3 = c;
      f2 = ((TypedArray)localObject3).getDimension(2, f3);
      c = f2;
      f2 = b;
      bool2 = f2 < 0.0F;
      if (!bool2)
      {
        localObject1 = new org/xmlpull/v1/XmlPullParserException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = ((TypedArray)localObject3).getPositionDescription();
        localObject2 = (String)localObject3 + "<vector> tag requires width > 0";
        ((XmlPullParserException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      f2 = c;
      bool2 = f2 < 0.0F;
      if (!bool2)
      {
        localObject1 = new org/xmlpull/v1/XmlPullParserException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = ((TypedArray)localObject3).getPositionDescription();
        localObject2 = (String)localObject3 + "<vector> tag requires height > 0";
        ((XmlPullParserException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      int i3 = 4;
      f3 = 5.6E-45F;
      f1 = locale.getAlpha();
      f2 = e.a((TypedArray)localObject3, paramXmlPullParser, "alpha", i3, f1);
      locale.setAlpha(f2);
      bool2 = false;
      f2 = 0.0F;
      localObject1 = ((TypedArray)localObject3).getString(0);
      if (localObject1 != null)
      {
        g = ((String)localObject1);
        localObject4 = h;
        ((android.support.v4.g.a)localObject4).put(localObject1, locale);
      }
      ((TypedArray)localObject3).recycle();
      int i2 = getChangingConfigurations();
      a = i2;
      k = m;
      b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      localObject1 = c;
      localObject2 = d;
      localObject1 = a((ColorStateList)localObject1, (PorterDuff.Mode)localObject2);
      e = ((PorterDuffColorFilter)localObject1);
    }
  }
  
  public final void invalidateSelf()
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.invalidateSelf();
    }
    for (;;)
    {
      return;
      super.invalidateSelf();
    }
  }
  
  public final boolean isAutoMirrored()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (boolean bool = android.support.v4.d.a.a.b((Drawable)localObject);; bool = e)
    {
      return bool;
      localObject = c;
    }
  }
  
  public final boolean isStateful()
  {
    Object localObject = b;
    boolean bool;
    if (localObject != null)
    {
      localObject = b;
      bool = ((Drawable)localObject).isStateful();
    }
    for (;;)
    {
      return bool;
      bool = super.isStateful();
      if (!bool)
      {
        localObject = c;
        if (localObject != null)
        {
          localObject = c.c;
          if (localObject != null)
          {
            localObject = c.c;
            bool = ((ColorStateList)localObject).isStateful();
            if (!bool) {}
          }
        }
      }
      else
      {
        bool = true;
        continue;
      }
      bool = false;
      localObject = null;
    }
  }
  
  public final Drawable mutate()
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((Drawable)localObject).mutate();
    }
    for (;;)
    {
      return this;
      boolean bool = g;
      if (!bool)
      {
        localObject = super.mutate();
        if (localObject == this)
        {
          localObject = new android/support/a/a/g$f;
          g.f localf = c;
          ((g.f)localObject).<init>(localf);
          c = ((g.f)localObject);
          bool = true;
          g = bool;
        }
      }
    }
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.setBounds(paramRect);
    }
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject1 = b;
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = b;
      bool = ((Drawable)localObject1).setState(paramArrayOfInt);
    }
    for (;;)
    {
      return bool;
      localObject1 = c;
      Object localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = d;
        if (localObject2 != null)
        {
          localObject2 = c;
          localObject1 = d;
          localObject1 = a((ColorStateList)localObject2, (PorterDuff.Mode)localObject1);
          e = ((PorterDuffColorFilter)localObject1);
          invalidateSelf();
          bool = true;
          continue;
        }
      }
      bool = false;
      localObject1 = null;
    }
  }
  
  public final void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.scheduleSelf(paramRunnable, paramLong);
    }
    for (;;)
    {
      return;
      super.scheduleSelf(paramRunnable, paramLong);
    }
  }
  
  public final void setAlpha(int paramInt)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((Drawable)localObject).setAlpha(paramInt);
    }
    for (;;)
    {
      return;
      localObject = c.b;
      int m = ((g.e)localObject).getRootAlpha();
      if (m != paramInt)
      {
        localObject = c.b;
        ((g.e)localObject).setRootAlpha(paramInt);
        invalidateSelf();
      }
    }
  }
  
  public final void setAutoMirrored(boolean paramBoolean)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      android.support.v4.d.a.a.a((Drawable)localObject, paramBoolean);
    }
    for (;;)
    {
      return;
      localObject = c;
      e = paramBoolean;
    }
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.setColorFilter(paramColorFilter);
    }
    for (;;)
    {
      return;
      f = paramColorFilter;
      invalidateSelf();
    }
  }
  
  public final void setTint(int paramInt)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      android.support.v4.d.a.a.a((Drawable)localObject, paramInt);
    }
    for (;;)
    {
      return;
      localObject = ColorStateList.valueOf(paramInt);
      setTintList((ColorStateList)localObject);
    }
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      android.support.v4.d.a.a.a((Drawable)localObject, paramColorStateList);
    }
    for (;;)
    {
      return;
      localObject = c;
      ColorStateList localColorStateList = c;
      if (localColorStateList != paramColorStateList)
      {
        c = paramColorStateList;
        localObject = d;
        localObject = a(paramColorStateList, (PorterDuff.Mode)localObject);
        e = ((PorterDuffColorFilter)localObject);
        invalidateSelf();
      }
    }
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      android.support.v4.d.a.a.a((Drawable)localObject, paramMode);
    }
    for (;;)
    {
      return;
      localObject = c;
      PorterDuff.Mode localMode = d;
      if (localMode != paramMode)
      {
        d = paramMode;
        localObject = c;
        localObject = a((ColorStateList)localObject, paramMode);
        e = ((PorterDuffColorFilter)localObject);
        invalidateSelf();
      }
    }
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Drawable localDrawable = b;
    if (localDrawable != null) {
      localDrawable = b;
    }
    for (boolean bool = localDrawable.setVisible(paramBoolean1, paramBoolean2);; bool = super.setVisible(paramBoolean1, paramBoolean2)) {
      return bool;
    }
  }
  
  public final void unscheduleSelf(Runnable paramRunnable)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.unscheduleSelf(paramRunnable);
    }
    for (;;)
    {
      return;
      super.unscheduleSelf(paramRunnable);
    }
  }
}


/* Location:              android/support/a/a/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */