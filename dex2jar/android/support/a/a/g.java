package android.support.a.a;

import android.annotation.SuppressLint;
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
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
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
  f c;
  boolean d = true;
  private PorterDuffColorFilter e;
  private ColorFilter f;
  private boolean g;
  private Drawable.ConstantState h;
  private final float[] i = new float[9];
  private final Matrix j = new Matrix();
  private final Rect k = new Rect();
  
  g()
  {
    c = new f();
  }
  
  g(f paramf)
  {
    c = paramf;
    e = a(c, d);
  }
  
  static int a(int paramInt, float paramFloat)
  {
    return (int)(Color.alpha(paramInt) * paramFloat) << 24 | 0xFFFFFF & paramInt;
  }
  
  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  @SuppressLint({"NewApi"})
  public static g a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 24)
    {
      localObject = new g();
      b = c.a(paramResources, paramInt, paramTheme);
      h = new g(b.getConstantState());
      return (g)localObject;
    }
    try
    {
      localObject = paramResources.getXml(paramInt);
      localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject);
      do
      {
        paramInt = ((XmlPullParser)localObject).next();
      } while ((paramInt != 2) && (paramInt != 1));
      if (paramInt != 2) {
        throw new XmlPullParserException("No start tag found");
      }
    }
    catch (XmlPullParserException paramResources)
    {
      AttributeSet localAttributeSet;
      Log.e("VectorDrawableCompat", "parser error", paramResources);
      return null;
      paramResources = a(paramResources, (XmlPullParser)localObject, localAttributeSet, paramTheme);
      return paramResources;
    }
    catch (IOException paramResources)
    {
      for (;;)
      {
        Log.e("VectorDrawableCompat", "parser error", paramResources);
      }
    }
  }
  
  @SuppressLint({"NewApi"})
  public static g a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    g localg = new g();
    localg.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localg;
  }
  
  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    f localf = c;
    e locale = b;
    Stack localStack = new Stack();
    localStack.push(a);
    int n = paramXmlPullParser.getEventType();
    int i1 = paramXmlPullParser.getDepth();
    int m = 1;
    if ((n != 1) && ((paramXmlPullParser.getDepth() >= i1 + 1) || (n != 3)))
    {
      Object localObject;
      c localc;
      if (n == 2)
      {
        localObject = paramXmlPullParser.getName();
        localc = (c)localStack.peek();
        if ("path".equals(localObject))
        {
          localObject = new b();
          ((b)localObject).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          b.add(localObject);
          if (((b)localObject).getPathName() != null) {
            h.put(((b)localObject).getPathName(), localObject);
          }
          m = 0;
          n = a;
          a = (o | n);
        }
      }
      for (;;)
      {
        n = paramXmlPullParser.next();
        break;
        if ("clip-path".equals(localObject))
        {
          localObject = new a();
          ((a)localObject).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          b.add(localObject);
          if (((a)localObject).getPathName() != null) {
            h.put(((a)localObject).getPathName(), localObject);
          }
          a |= o;
        }
        else
        {
          if ("group".equals(localObject))
          {
            localObject = new c();
            ((c)localObject).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            b.add(localObject);
            localStack.push(localObject);
            if (((c)localObject).getGroupName() != null) {
              h.put(((c)localObject).getGroupName(), localObject);
            }
            a |= e;
          }
          continue;
          if ((n == 3) && ("group".equals(paramXmlPullParser.getName()))) {
            localStack.pop();
          }
        }
      }
    }
    if (m != 0)
    {
      paramResources = new StringBuffer();
      if (paramResources.length() > 0) {
        paramResources.append(" or ");
      }
      paramResources.append("path");
      throw new XmlPullParserException("no " + paramResources + " defined");
    }
  }
  
  public final boolean canApplyTheme()
  {
    if (b != null) {
      android.support.v4.d.a.a.d(b);
    }
    return false;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (b != null) {
      b.draw(paramCanvas);
    }
    int m;
    int i1;
    int i2;
    do
    {
      do
      {
        return;
        copyBounds(k);
      } while ((k.width() <= 0) || (k.height() <= 0));
      if (f != null) {
        break;
      }
      localObject = e;
      paramCanvas.getMatrix(j);
      j.getValues(i);
      float f2 = Math.abs(i[0]);
      float f1 = Math.abs(i[4]);
      float f4 = Math.abs(i[1]);
      float f3 = Math.abs(i[3]);
      if ((f4 != 0.0F) || (f3 != 0.0F))
      {
        f1 = 1.0F;
        f2 = 1.0F;
      }
      n = (int)(f2 * k.width());
      m = (int)(f1 * k.height());
      i1 = Math.min(2048, n);
      i2 = Math.min(2048, m);
    } while ((i1 <= 0) || (i2 <= 0));
    int n = paramCanvas.save();
    paramCanvas.translate(k.left, k.top);
    label244:
    f localf;
    label322:
    label366:
    Rect localRect;
    if ((Build.VERSION.SDK_INT >= 17) && (isAutoMirrored()) && (getLayoutDirection() == 1))
    {
      m = 1;
      if (m != 0)
      {
        paramCanvas.translate(k.width(), 0.0F);
        paramCanvas.scale(-1.0F, 1.0F);
      }
      k.offsetTo(0, 0);
      localf = c;
      if (f != null)
      {
        if ((i1 != f.getWidth()) || (i2 != f.getHeight())) {
          break label444;
        }
        m = 1;
        if (m != 0) {}
      }
      else
      {
        f = Bitmap.createBitmap(i1, i2, Bitmap.Config.ARGB_8888);
        k = true;
      }
      if (d) {
        break label450;
      }
      c.a(i1, i2);
      localf = c;
      localRect = k;
      if (b.getRootAlpha() >= 255) {
        break label602;
      }
      m = 1;
      label395:
      if ((m != 0) || (localObject != null)) {
        break label608;
      }
    }
    for (Object localObject = null;; localObject = l)
    {
      paramCanvas.drawBitmap(f, null, localRect, (Paint)localObject);
      paramCanvas.restoreToCount(n);
      return;
      localObject = f;
      break;
      m = 0;
      break label244;
      label444:
      m = 0;
      break label322;
      label450:
      localf = c;
      if ((!k) && (g == c) && (h == d) && (j == e) && (i == b.getRootAlpha())) {}
      for (m = 1;; m = 0)
      {
        if (m != 0) {
          break label600;
        }
        c.a(i1, i2);
        localf = c;
        g = c;
        h = d;
        i = b.getRootAlpha();
        j = e;
        k = false;
        break;
      }
      label600:
      break label366;
      label602:
      m = 0;
      break label395;
      label608:
      if (l == null)
      {
        l = new Paint();
        l.setFilterBitmap(true);
      }
      l.setAlpha(b.getRootAlpha());
      l.setColorFilter((ColorFilter)localObject);
    }
  }
  
  public final int getAlpha()
  {
    if (b != null) {
      return android.support.v4.d.a.a.c(b);
    }
    return c.b.getRootAlpha();
  }
  
  public final int getChangingConfigurations()
  {
    if (b != null) {
      return b.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | c.getChangingConfigurations();
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (b != null) {
      return new g(b.getConstantState());
    }
    c.a = getChangingConfigurations();
    return c;
  }
  
  public final int getIntrinsicHeight()
  {
    if (b != null) {
      return b.getIntrinsicHeight();
    }
    return (int)c.b.c;
  }
  
  public final int getIntrinsicWidth()
  {
    if (b != null) {
      return b.getIntrinsicWidth();
    }
    return (int)c.b.b;
  }
  
  public final int getOpacity()
  {
    if (b != null) {
      return b.getOpacity();
    }
    return -3;
  }
  
  @SuppressLint({"NewApi"})
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    if (b != null)
    {
      b.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    }
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (b != null)
    {
      android.support.v4.d.a.a.a(b, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    f localf1 = c;
    b = new e();
    TypedArray localTypedArray = a(paramResources, paramTheme, paramAttributeSet, a.a);
    f localf2 = c;
    e locale = b;
    int m = e.a(localTypedArray, paramXmlPullParser, "tintMode", 6);
    PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
    Object localObject = localMode;
    boolean bool;
    switch (m)
    {
    default: 
      localObject = localMode;
    case 4: 
    case 6: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
      d = ((PorterDuff.Mode)localObject);
      localObject = localTypedArray.getColorStateList(1);
      if (localObject != null) {
        c = ((ColorStateList)localObject);
      }
      bool = e;
      if (e.a(paramXmlPullParser, "autoMirrored")) {
        break;
      }
    }
    for (;;)
    {
      e = bool;
      d = e.a(localTypedArray, paramXmlPullParser, "viewportWidth", 7, d);
      e = e.a(localTypedArray, paramXmlPullParser, "viewportHeight", 8, e);
      if (d > 0.0F) {
        break label368;
      }
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
      localObject = PorterDuff.Mode.SRC_OVER;
      break;
      localObject = PorterDuff.Mode.SRC_IN;
      break;
      localObject = PorterDuff.Mode.SRC_ATOP;
      break;
      localObject = PorterDuff.Mode.MULTIPLY;
      break;
      localObject = PorterDuff.Mode.SCREEN;
      break;
      localObject = localMode;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      localObject = PorterDuff.Mode.ADD;
      break;
      bool = localTypedArray.getBoolean(5, bool);
    }
    label368:
    if (e <= 0.0F) {
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }
    b = localTypedArray.getDimension(3, b);
    c = localTypedArray.getDimension(2, c);
    if (b <= 0.0F) {
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires width > 0");
    }
    if (c <= 0.0F) {
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires height > 0");
    }
    locale.setAlpha(e.a(localTypedArray, paramXmlPullParser, "alpha", 4, locale.getAlpha()));
    localObject = localTypedArray.getString(0);
    if (localObject != null)
    {
      g = ((String)localObject);
      h.put(localObject, locale);
    }
    localTypedArray.recycle();
    a = getChangingConfigurations();
    k = true;
    b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    e = a(c, d);
  }
  
  public final void invalidateSelf()
  {
    if (b != null)
    {
      b.invalidateSelf();
      return;
    }
    super.invalidateSelf();
  }
  
  public final boolean isAutoMirrored()
  {
    if (b != null) {
      return android.support.v4.d.a.a.b(b);
    }
    return c.e;
  }
  
  public final boolean isStateful()
  {
    if (b != null) {
      return b.isStateful();
    }
    return (super.isStateful()) || ((c != null) && (c.c != null) && (c.c.isStateful()));
  }
  
  public final Drawable mutate()
  {
    if (b != null) {
      b.mutate();
    }
    while ((g) || (super.mutate() != this)) {
      return this;
    }
    c = new f(c);
    g = true;
    return this;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    if (b != null) {
      b.setBounds(paramRect);
    }
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (b != null) {
      return b.setState(paramArrayOfInt);
    }
    paramArrayOfInt = c;
    if ((c != null) && (d != null))
    {
      e = a(c, d);
      invalidateSelf();
      return true;
    }
    return false;
  }
  
  public final void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    if (b != null)
    {
      b.scheduleSelf(paramRunnable, paramLong);
      return;
    }
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void setAlpha(int paramInt)
  {
    if (b != null) {
      b.setAlpha(paramInt);
    }
    while (c.b.getRootAlpha() == paramInt) {
      return;
    }
    c.b.setRootAlpha(paramInt);
    invalidateSelf();
  }
  
  public final void setAutoMirrored(boolean paramBoolean)
  {
    if (b != null)
    {
      android.support.v4.d.a.a.a(b, paramBoolean);
      return;
    }
    c.e = paramBoolean;
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    if (b != null)
    {
      b.setColorFilter(paramColorFilter);
      return;
    }
    f = paramColorFilter;
    invalidateSelf();
  }
  
  @SuppressLint({"NewApi"})
  public final void setTint(int paramInt)
  {
    if (b != null)
    {
      android.support.v4.d.a.a.a(b, paramInt);
      return;
    }
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    if (b != null) {
      android.support.v4.d.a.a.a(b, paramColorStateList);
    }
    f localf;
    do
    {
      return;
      localf = c;
    } while (c == paramColorStateList);
    c = paramColorStateList;
    e = a(paramColorStateList, d);
    invalidateSelf();
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    if (b != null) {
      android.support.v4.d.a.a.a(b, paramMode);
    }
    f localf;
    do
    {
      return;
      localf = c;
    } while (d == paramMode);
    d = paramMode;
    e = a(c, paramMode);
    invalidateSelf();
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (b != null) {
      return b.setVisible(paramBoolean1, paramBoolean2);
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void unscheduleSelf(Runnable paramRunnable)
  {
    if (b != null)
    {
      b.unscheduleSelf(paramRunnable);
      return;
    }
    super.unscheduleSelf(paramRunnable);
  }
  
  private static final class a
    extends g.d
  {
    public a() {}
    
    public a(a parama)
    {
      super();
    }
    
    public final void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      if (!e.a(paramXmlPullParser, "pathData")) {
        return;
      }
      paramResources = f.a(paramResources, paramTheme, paramAttributeSet, a.d);
      paramAttributeSet = paramResources.getString(0);
      if (paramAttributeSet != null) {
        n = paramAttributeSet;
      }
      paramAttributeSet = paramResources.getString(1);
      if (paramAttributeSet != null) {
        m = d.a(paramAttributeSet);
      }
      paramResources.recycle();
    }
    
    public final boolean a()
    {
      return true;
    }
  }
  
  private static final class b
    extends g.d
  {
    int a = 0;
    float b = 0.0F;
    int c = 0;
    float d = 1.0F;
    int e;
    float f = 1.0F;
    float g = 0.0F;
    float h = 1.0F;
    float i = 0.0F;
    Paint.Cap j = Paint.Cap.BUTT;
    Paint.Join k = Paint.Join.MITER;
    float l = 4.0F;
    private int[] p;
    
    public b() {}
    
    public b(b paramb)
    {
      super();
      p = p;
      a = a;
      b = b;
      d = d;
      c = c;
      e = e;
      f = f;
      g = g;
      h = h;
      i = i;
      j = j;
      k = k;
      l = l;
    }
    
    public final void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      paramAttributeSet = f.a(paramResources, paramTheme, paramAttributeSet, a.c);
      p = null;
      if (e.a(paramXmlPullParser, "pathData"))
      {
        paramResources = paramAttributeSet.getString(0);
        if (paramResources != null) {
          n = paramResources;
        }
        paramResources = paramAttributeSet.getString(2);
        if (paramResources != null) {
          this.m = d.a(paramResources);
        }
        c = e.a(paramAttributeSet, paramXmlPullParser, "fillColor", 1, c);
        f = e.a(paramAttributeSet, paramXmlPullParser, "fillAlpha", 12, f);
        int m = e.a(paramAttributeSet, paramXmlPullParser, "strokeLineCap", 8);
        paramResources = j;
        switch (m)
        {
        default: 
          j = paramResources;
          m = e.a(paramAttributeSet, paramXmlPullParser, "strokeLineJoin", 9);
          paramResources = k;
          switch (m)
          {
          }
          break;
        }
      }
      for (;;)
      {
        k = paramResources;
        l = e.a(paramAttributeSet, paramXmlPullParser, "strokeMiterLimit", 10, l);
        a = e.a(paramAttributeSet, paramXmlPullParser, "strokeColor", 3, a);
        d = e.a(paramAttributeSet, paramXmlPullParser, "strokeAlpha", 11, d);
        b = e.a(paramAttributeSet, paramXmlPullParser, "strokeWidth", 4, b);
        h = e.a(paramAttributeSet, paramXmlPullParser, "trimPathEnd", 6, h);
        i = e.a(paramAttributeSet, paramXmlPullParser, "trimPathOffset", 7, i);
        g = e.a(paramAttributeSet, paramXmlPullParser, "trimPathStart", 5, g);
        paramAttributeSet.recycle();
        return;
        paramResources = Paint.Cap.BUTT;
        break;
        paramResources = Paint.Cap.ROUND;
        break;
        paramResources = Paint.Cap.SQUARE;
        break;
        paramResources = Paint.Join.MITER;
        continue;
        paramResources = Paint.Join.ROUND;
        continue;
        paramResources = Paint.Join.BEVEL;
      }
    }
    
    final float getFillAlpha()
    {
      return f;
    }
    
    final int getFillColor()
    {
      return c;
    }
    
    final float getStrokeAlpha()
    {
      return d;
    }
    
    final int getStrokeColor()
    {
      return a;
    }
    
    final float getStrokeWidth()
    {
      return b;
    }
    
    final float getTrimPathEnd()
    {
      return h;
    }
    
    final float getTrimPathOffset()
    {
      return i;
    }
    
    final float getTrimPathStart()
    {
      return g;
    }
    
    final void setFillAlpha(float paramFloat)
    {
      f = paramFloat;
    }
    
    final void setFillColor(int paramInt)
    {
      c = paramInt;
    }
    
    final void setStrokeAlpha(float paramFloat)
    {
      d = paramFloat;
    }
    
    final void setStrokeColor(int paramInt)
    {
      a = paramInt;
    }
    
    final void setStrokeWidth(float paramFloat)
    {
      b = paramFloat;
    }
    
    final void setTrimPathEnd(float paramFloat)
    {
      h = paramFloat;
    }
    
    final void setTrimPathOffset(float paramFloat)
    {
      i = paramFloat;
    }
    
    final void setTrimPathStart(float paramFloat)
    {
      g = paramFloat;
    }
  }
  
  private static final class c
  {
    final Matrix a = new Matrix();
    final ArrayList<Object> b = new ArrayList();
    float c = 0.0F;
    final Matrix d = new Matrix();
    int e;
    private float f = 0.0F;
    private float g = 0.0F;
    private float h = 1.0F;
    private float i = 1.0F;
    private float j = 0.0F;
    private float k = 0.0F;
    private int[] l;
    private String m = null;
    
    public c() {}
    
    public c(c paramc, android.support.v4.g.a<String, Object> parama)
    {
      c = c;
      f = f;
      g = g;
      h = h;
      i = i;
      j = j;
      k = k;
      l = l;
      m = m;
      e = e;
      if (m != null) {
        parama.put(m, this);
      }
      d.set(d);
      ArrayList localArrayList = b;
      int n = 0;
      while (n < localArrayList.size())
      {
        paramc = localArrayList.get(n);
        if ((paramc instanceof c))
        {
          paramc = (c)paramc;
          b.add(new c(paramc, parama));
          n += 1;
        }
        else
        {
          if ((paramc instanceof g.b)) {}
          for (paramc = new g.b((g.b)paramc);; paramc = new g.a((g.a)paramc))
          {
            b.add(paramc);
            if (n == null) {
              break;
            }
            parama.put(n, paramc);
            break;
            if (!(paramc instanceof g.a)) {
              break label315;
            }
          }
          label315:
          throw new IllegalStateException("Unknown object in the tree!");
        }
      }
    }
    
    private void a()
    {
      d.reset();
      d.postTranslate(-f, -g);
      d.postScale(h, i);
      d.postRotate(c, 0.0F, 0.0F);
      d.postTranslate(j + f, k + g);
    }
    
    public final void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      paramResources = f.a(paramResources, paramTheme, paramAttributeSet, a.b);
      l = null;
      c = e.a(paramResources, paramXmlPullParser, "rotation", 5, c);
      f = paramResources.getFloat(1, f);
      g = paramResources.getFloat(2, g);
      h = e.a(paramResources, paramXmlPullParser, "scaleX", 3, h);
      i = e.a(paramResources, paramXmlPullParser, "scaleY", 4, i);
      j = e.a(paramResources, paramXmlPullParser, "translateX", 6, j);
      k = e.a(paramResources, paramXmlPullParser, "translateY", 7, k);
      paramAttributeSet = paramResources.getString(0);
      if (paramAttributeSet != null) {
        m = paramAttributeSet;
      }
      a();
      paramResources.recycle();
    }
    
    public final String getGroupName()
    {
      return m;
    }
    
    public final Matrix getLocalMatrix()
    {
      return d;
    }
    
    public final float getPivotX()
    {
      return f;
    }
    
    public final float getPivotY()
    {
      return g;
    }
    
    public final float getRotation()
    {
      return c;
    }
    
    public final float getScaleX()
    {
      return h;
    }
    
    public final float getScaleY()
    {
      return i;
    }
    
    public final float getTranslateX()
    {
      return j;
    }
    
    public final float getTranslateY()
    {
      return k;
    }
    
    public final void setPivotX(float paramFloat)
    {
      if (paramFloat != f)
      {
        f = paramFloat;
        a();
      }
    }
    
    public final void setPivotY(float paramFloat)
    {
      if (paramFloat != g)
      {
        g = paramFloat;
        a();
      }
    }
    
    public final void setRotation(float paramFloat)
    {
      if (paramFloat != c)
      {
        c = paramFloat;
        a();
      }
    }
    
    public final void setScaleX(float paramFloat)
    {
      if (paramFloat != h)
      {
        h = paramFloat;
        a();
      }
    }
    
    public final void setScaleY(float paramFloat)
    {
      if (paramFloat != i)
      {
        i = paramFloat;
        a();
      }
    }
    
    public final void setTranslateX(float paramFloat)
    {
      if (paramFloat != j)
      {
        j = paramFloat;
        a();
      }
    }
    
    public final void setTranslateY(float paramFloat)
    {
      if (paramFloat != k)
      {
        k = paramFloat;
        a();
      }
    }
  }
  
  private static class d
  {
    protected d.b[] m = null;
    String n;
    int o;
    
    public d() {}
    
    public d(d paramd)
    {
      n = n;
      o = o;
      m = d.a(m);
    }
    
    public final void a(Path paramPath)
    {
      paramPath.reset();
      d.b[] arrayOfb;
      float[] arrayOfFloat1;
      int k;
      int j;
      float[] arrayOfFloat2;
      float f4;
      float f3;
      float f6;
      float f1;
      float f2;
      int i1;
      float f7;
      float f8;
      label290:
      label482:
      float f9;
      if (m != null)
      {
        arrayOfb = m;
        arrayOfFloat1 = new float[6];
        k = 0;
        j = 109;
        if (k < arrayOfb.length)
        {
          int i2 = a;
          arrayOfFloat2 = b;
          f4 = arrayOfFloat1[0];
          f3 = arrayOfFloat1[1];
          f6 = arrayOfFloat1[2];
          f5 = arrayOfFloat1[3];
          f1 = arrayOfFloat1[4];
          f2 = arrayOfFloat1[5];
          int i;
          switch (i2)
          {
          default: 
            i = 2;
            i1 = 0;
            f7 = f3;
            f3 = f4;
            f4 = f7;
            f7 = f6;
            f8 = f5;
            if (i1 < arrayOfFloat2.length) {
              switch (i2)
              {
              default: 
                f5 = f2;
                f2 = f4;
                f4 = f3;
                f3 = f2;
                f2 = f1;
                f6 = f7;
                f1 = f5;
                f5 = f8;
              }
            }
            break;
          case 90: 
          case 122: 
          case 76: 
          case 77: 
          case 84: 
          case 108: 
          case 109: 
          case 116: 
          case 72: 
          case 86: 
          case 104: 
          case 118: 
          case 67: 
          case 99: 
          case 81: 
          case 83: 
          case 113: 
          case 115: 
          case 65: 
          case 97: 
            for (;;)
            {
              i1 += i;
              f9 = f2;
              float f10 = f4;
              j = i2;
              f8 = f5;
              f7 = f6;
              f2 = f1;
              f1 = f9;
              f4 = f3;
              f3 = f10;
              break label290;
              paramPath.close();
              paramPath.moveTo(f1, f2);
              f5 = f2;
              f6 = f1;
              f3 = f2;
              f4 = f1;
              i = 2;
              break;
              i = 2;
              break;
              i = 1;
              break;
              i = 6;
              break;
              i = 4;
              break;
              i = 7;
              break;
              f3 += arrayOfFloat2[(i1 + 0)];
              f4 += arrayOfFloat2[(i1 + 1)];
              if (i1 > 0)
              {
                paramPath.rLineTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)]);
                f9 = f3;
                f3 = f2;
                f2 = f1;
                f5 = f8;
                f1 = f3;
                f6 = f7;
                f3 = f4;
                f4 = f9;
              }
              else
              {
                paramPath.rMoveTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)]);
                f10 = f4;
                f9 = f3;
                f5 = f8;
                f1 = f4;
                f6 = f7;
                f2 = f3;
                f3 = f10;
                f4 = f9;
                continue;
                f3 = arrayOfFloat2[(i1 + 0)];
                f4 = arrayOfFloat2[(i1 + 1)];
                if (i1 > 0)
                {
                  paramPath.lineTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)]);
                  f9 = f3;
                  f3 = f2;
                  f2 = f1;
                  f5 = f8;
                  f1 = f3;
                  f6 = f7;
                  f3 = f4;
                  f4 = f9;
                }
                else
                {
                  paramPath.moveTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)]);
                  f10 = f4;
                  f9 = f3;
                  f5 = f8;
                  f1 = f4;
                  f6 = f7;
                  f2 = f3;
                  f3 = f10;
                  f4 = f9;
                  continue;
                  paramPath.rLineTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)]);
                  f5 = arrayOfFloat2[(i1 + 0)];
                  f4 += arrayOfFloat2[(i1 + 1)];
                  f9 = f3 + f5;
                  f3 = f2;
                  f2 = f1;
                  f5 = f8;
                  f1 = f3;
                  f6 = f7;
                  f3 = f4;
                  f4 = f9;
                  continue;
                  paramPath.lineTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)]);
                  f4 = arrayOfFloat2[(i1 + 0)];
                  f9 = arrayOfFloat2[(i1 + 1)];
                  f3 = f2;
                  f2 = f1;
                  f5 = f8;
                  f1 = f3;
                  f6 = f7;
                  f3 = f9;
                  continue;
                  paramPath.rLineTo(arrayOfFloat2[(i1 + 0)], 0.0F);
                  f5 = arrayOfFloat2[(i1 + 0)];
                  f9 = f3 + f5;
                  f3 = f1;
                  f5 = f8;
                  f1 = f2;
                  f6 = f7;
                  f2 = f3;
                  f3 = f4;
                  f4 = f9;
                  continue;
                  paramPath.lineTo(arrayOfFloat2[(i1 + 0)], f4);
                  f5 = arrayOfFloat2[(i1 + 0)];
                  f3 = f4;
                  f4 = f5;
                  f9 = f1;
                  f5 = f8;
                  f1 = f2;
                  f6 = f7;
                  f2 = f9;
                  continue;
                  paramPath.rLineTo(0.0F, arrayOfFloat2[(i1 + 0)]);
                  f5 = arrayOfFloat2[(i1 + 0)];
                  f9 = f1;
                  f10 = f4 + f5;
                  f4 = f3;
                  f1 = f2;
                  f5 = f8;
                  f6 = f7;
                  f2 = f9;
                  f3 = f10;
                  continue;
                  paramPath.lineTo(f3, arrayOfFloat2[(i1 + 0)]);
                  f9 = arrayOfFloat2[(i1 + 0)];
                  f4 = f1;
                  f10 = f3;
                  f1 = f2;
                  f5 = f8;
                  f6 = f7;
                  f2 = f4;
                  f3 = f9;
                  f4 = f10;
                  continue;
                  paramPath.rCubicTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)], arrayOfFloat2[(i1 + 2)], arrayOfFloat2[(i1 + 3)], arrayOfFloat2[(i1 + 4)], arrayOfFloat2[(i1 + 5)]);
                  f6 = f3 + arrayOfFloat2[(i1 + 2)];
                  f5 = f4 + arrayOfFloat2[(i1 + 3)];
                  f7 = arrayOfFloat2[(i1 + 4)];
                  f4 += arrayOfFloat2[(i1 + 5)];
                  f7 = f3 + f7;
                  f3 = f2;
                  f2 = f1;
                  f1 = f3;
                  f3 = f4;
                  f4 = f7;
                  continue;
                  paramPath.cubicTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)], arrayOfFloat2[(i1 + 2)], arrayOfFloat2[(i1 + 3)], arrayOfFloat2[(i1 + 4)], arrayOfFloat2[(i1 + 5)]);
                  f4 = arrayOfFloat2[(i1 + 4)];
                  f3 = arrayOfFloat2[(i1 + 5)];
                  f7 = arrayOfFloat2[(i1 + 2)];
                  f5 = arrayOfFloat2[(i1 + 3)];
                  f6 = f2;
                  f2 = f1;
                  f1 = f6;
                  f6 = f7;
                }
              }
            }
            f6 = 0.0F;
            if ((j == 99) || (j == 115) || (j == 67) || (j == 83)) {
              f6 = f4 - f8;
            }
            break;
          }
        }
      }
      for (float f5 = f3 - f7;; f5 = 0.0F)
      {
        paramPath.rCubicTo(f5, f6, arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)], arrayOfFloat2[(i1 + 2)], arrayOfFloat2[(i1 + 3)]);
        f6 = f3 + arrayOfFloat2[(i1 + 0)];
        f5 = f4 + arrayOfFloat2[(i1 + 1)];
        f7 = arrayOfFloat2[(i1 + 2)];
        f4 += arrayOfFloat2[(i1 + 3)];
        f7 = f3 + f7;
        f3 = f2;
        f2 = f1;
        f1 = f3;
        f3 = f4;
        f4 = f7;
        break label482;
        if ((j == 99) || (j == 115) || (j == 67) || (j == 83))
        {
          f4 = 2.0F * f4 - f8;
          f3 = 2.0F * f3 - f7;
        }
        for (;;)
        {
          paramPath.cubicTo(f3, f4, arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)], arrayOfFloat2[(i1 + 2)], arrayOfFloat2[(i1 + 3)]);
          f6 = arrayOfFloat2[(i1 + 0)];
          f5 = arrayOfFloat2[(i1 + 1)];
          f4 = arrayOfFloat2[(i1 + 2)];
          f7 = arrayOfFloat2[(i1 + 3)];
          f3 = f2;
          f2 = f1;
          f1 = f3;
          f3 = f7;
          break label482;
          paramPath.rQuadTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)], arrayOfFloat2[(i1 + 2)], arrayOfFloat2[(i1 + 3)]);
          f6 = f3 + arrayOfFloat2[(i1 + 0)];
          f5 = f4 + arrayOfFloat2[(i1 + 1)];
          f7 = arrayOfFloat2[(i1 + 2)];
          f4 += arrayOfFloat2[(i1 + 3)];
          f7 = f3 + f7;
          f3 = f2;
          f2 = f1;
          f1 = f3;
          f3 = f4;
          f4 = f7;
          break label482;
          paramPath.quadTo(arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)], arrayOfFloat2[(i1 + 2)], arrayOfFloat2[(i1 + 3)]);
          f6 = arrayOfFloat2[(i1 + 0)];
          f5 = arrayOfFloat2[(i1 + 1)];
          f4 = arrayOfFloat2[(i1 + 2)];
          f7 = arrayOfFloat2[(i1 + 3)];
          f3 = f2;
          f2 = f1;
          f1 = f3;
          f3 = f7;
          break label482;
          if ((j == 113) || (j == 116) || (j == 81) || (j == 84)) {
            f5 = f4 - f8;
          }
          for (f6 = f3 - f7;; f6 = 0.0F)
          {
            paramPath.rQuadTo(f6, f5, arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)]);
            f6 = f3 + f6;
            f5 = f4 + f5;
            f7 = arrayOfFloat2[(i1 + 0)];
            f4 += arrayOfFloat2[(i1 + 1)];
            f7 = f3 + f7;
            f3 = f2;
            f2 = f1;
            f1 = f3;
            f3 = f4;
            f4 = f7;
            break label482;
            if ((j != 113) && (j != 116) && (j != 81))
            {
              f6 = f4;
              f5 = f3;
              if (j != 84) {}
            }
            else
            {
              f5 = 2.0F * f3 - f7;
              f6 = 2.0F * f4 - f8;
            }
            paramPath.quadTo(f5, f6, arrayOfFloat2[(i1 + 0)], arrayOfFloat2[(i1 + 1)]);
            f4 = arrayOfFloat2[(i1 + 0)];
            f3 = arrayOfFloat2[(i1 + 1)];
            f7 = f6;
            f6 = f5;
            f8 = f2;
            f2 = f1;
            f5 = f7;
            f1 = f8;
            break label482;
            f5 = arrayOfFloat2[(i1 + 5)];
            f6 = arrayOfFloat2[(i1 + 6)];
            f7 = arrayOfFloat2[(i1 + 0)];
            f8 = arrayOfFloat2[(i1 + 1)];
            f9 = arrayOfFloat2[(i1 + 2)];
            boolean bool1;
            if (arrayOfFloat2[(i1 + 3)] != 0.0F)
            {
              bool1 = true;
              label2168:
              if (arrayOfFloat2[(i1 + 4)] == 0.0F) {
                break label2261;
              }
            }
            label2261:
            for (boolean bool2 = true;; bool2 = false)
            {
              d.b.a(paramPath, f3, f4, f5 + f3, f6 + f4, f7, f8, f9, bool1, bool2);
              f6 = f3 + arrayOfFloat2[(i1 + 5)];
              f5 = f4 + arrayOfFloat2[(i1 + 6)];
              f7 = f2;
              f2 = f1;
              f3 = f5;
              f4 = f6;
              f1 = f7;
              break;
              bool1 = false;
              break label2168;
            }
            f5 = arrayOfFloat2[(i1 + 5)];
            f6 = arrayOfFloat2[(i1 + 6)];
            f7 = arrayOfFloat2[(i1 + 0)];
            f8 = arrayOfFloat2[(i1 + 1)];
            f9 = arrayOfFloat2[(i1 + 2)];
            if (arrayOfFloat2[(i1 + 3)] != 0.0F)
            {
              bool1 = true;
              label2328:
              if (arrayOfFloat2[(i1 + 4)] == 0.0F) {
                break label2409;
              }
            }
            label2409:
            for (bool2 = true;; bool2 = false)
            {
              d.b.a(paramPath, f3, f4, f5, f6, f7, f8, f9, bool1, bool2);
              f6 = arrayOfFloat2[(i1 + 5)];
              f5 = arrayOfFloat2[(i1 + 6)];
              f7 = f2;
              f2 = f1;
              f3 = f5;
              f4 = f6;
              f1 = f7;
              break;
              bool1 = false;
              break label2328;
            }
            arrayOfFloat1[0] = f3;
            arrayOfFloat1[1] = f4;
            arrayOfFloat1[2] = f7;
            arrayOfFloat1[3] = f8;
            arrayOfFloat1[4] = f1;
            arrayOfFloat1[5] = f2;
            j = a;
            k += 1;
            break;
            return;
            f5 = 0.0F;
          }
        }
      }
    }
    
    public boolean a()
    {
      return false;
    }
    
    public d.b[] getPathData()
    {
      return m;
    }
    
    public String getPathName()
    {
      return n;
    }
    
    public void setPathData(d.b[] paramArrayOfb)
    {
      d.b[] arrayOfb = m;
      int i;
      if ((arrayOfb == null) || (paramArrayOfb == null))
      {
        i = 0;
        if (i != 0) {
          break label103;
        }
        m = d.a(paramArrayOfb);
      }
      for (;;)
      {
        return;
        if (arrayOfb.length != paramArrayOfb.length)
        {
          i = 0;
          break;
        }
        i = 0;
        for (;;)
        {
          if (i >= arrayOfb.length) {
            break label98;
          }
          if ((a != a) || (b.length != b.length))
          {
            i = 0;
            break;
          }
          i += 1;
        }
        label98:
        i = 1;
        break;
        label103:
        arrayOfb = m;
        i = 0;
        while (i < paramArrayOfb.length)
        {
          a = a;
          int j = 0;
          while (j < b.length)
          {
            b[j] = b[j];
            j += 1;
          }
          i += 1;
        }
      }
    }
  }
  
  private static final class e
  {
    private static final Matrix k = new Matrix();
    final g.c a;
    float b = 0.0F;
    float c = 0.0F;
    float d = 0.0F;
    float e = 0.0F;
    int f = 255;
    String g = null;
    final android.support.v4.g.a<String, Object> h = new android.support.v4.g.a();
    private final Path i;
    private final Path j;
    private final Matrix l = new Matrix();
    private Paint m;
    private Paint n;
    private PathMeasure o;
    private int p;
    
    public e()
    {
      a = new g.c();
      i = new Path();
      j = new Path();
    }
    
    public e(e parame)
    {
      a = new g.c(a, h);
      i = new Path(i);
      j = new Path(j);
      b = b;
      c = c;
      d = d;
      e = e;
      p = p;
      f = f;
      g = g;
      if (g != null) {
        h.put(g, this);
      }
    }
    
    private void a(g.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      a.set(paramMatrix);
      a.preConcat(d);
      paramCanvas.save();
      int i1 = 0;
      if (i1 < b.size())
      {
        paramMatrix = b.get(i1);
        if ((paramMatrix instanceof g.c)) {
          a((g.c)paramMatrix, a, paramCanvas, paramInt1, paramInt2, paramColorFilter);
        }
        float f1;
        float f3;
        float f2;
        Object localObject;
        float f7;
        float f4;
        float f5;
        float f6;
        for (;;)
        {
          i1 += 1;
          break;
          if ((paramMatrix instanceof g.d))
          {
            paramMatrix = (g.d)paramMatrix;
            f1 = paramInt1 / d;
            f3 = paramInt2 / e;
            f2 = Math.min(f1, f3);
            localObject = a;
            l.set((Matrix)localObject);
            l.postScale(f1, f3);
            float[] arrayOfFloat = new float[4];
            float[] tmp160_158 = arrayOfFloat;
            tmp160_158[0] = 0.0F;
            float[] tmp164_160 = tmp160_158;
            tmp164_160[1] = 1.0F;
            float[] tmp168_164 = tmp164_160;
            tmp168_164[2] = 1.0F;
            float[] tmp172_168 = tmp168_164;
            tmp172_168[3] = 0.0F;
            tmp172_168;
            ((Matrix)localObject).mapVectors(arrayOfFloat);
            f1 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
            f7 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
            f3 = arrayOfFloat[0];
            f4 = arrayOfFloat[1];
            f5 = arrayOfFloat[2];
            f6 = arrayOfFloat[3];
            f7 = Math.max(f1, f7);
            f1 = 0.0F;
            if (f7 > 0.0F) {
              f1 = Math.abs(f6 * f3 - f4 * f5) / f7;
            }
            if (f1 != 0.0F)
            {
              paramMatrix.a(i);
              localObject = i;
              j.reset();
              if (!paramMatrix.a()) {
                break label338;
              }
              j.addPath((Path)localObject, l);
              paramCanvas.clipPath(j);
            }
          }
        }
        label338:
        paramMatrix = (g.b)paramMatrix;
        if ((g != 0.0F) || (h != 1.0F))
        {
          f6 = g;
          f7 = i;
          f4 = h;
          f5 = i;
          if (o == null) {
            o = new PathMeasure();
          }
          o.setPath(i, false);
          f3 = o.getLength();
          f6 = (f6 + f7) % 1.0F * f3;
          f4 = (f4 + f5) % 1.0F * f3;
          ((Path)localObject).reset();
          if (f6 <= f4) {
            break label735;
          }
          o.getSegment(f6, f3, (Path)localObject, true);
          o.getSegment(0.0F, f4, (Path)localObject, true);
        }
        for (;;)
        {
          ((Path)localObject).rLineTo(0.0F, 0.0F);
          j.addPath((Path)localObject, l);
          if (c != 0)
          {
            if (n == null)
            {
              n = new Paint();
              n.setStyle(Paint.Style.FILL);
              n.setAntiAlias(true);
            }
            localObject = n;
            ((Paint)localObject).setColor(g.a(c, f));
            ((Paint)localObject).setColorFilter(paramColorFilter);
            paramCanvas.drawPath(j, (Paint)localObject);
          }
          if (a == 0) {
            break;
          }
          if (m == null)
          {
            m = new Paint();
            m.setStyle(Paint.Style.STROKE);
            m.setAntiAlias(true);
          }
          localObject = m;
          if (k != null) {
            ((Paint)localObject).setStrokeJoin(k);
          }
          if (j != null) {
            ((Paint)localObject).setStrokeCap(j);
          }
          ((Paint)localObject).setStrokeMiter(l);
          ((Paint)localObject).setColor(g.a(a, d));
          ((Paint)localObject).setColorFilter(paramColorFilter);
          ((Paint)localObject).setStrokeWidth(f1 * f2 * b);
          paramCanvas.drawPath(j, (Paint)localObject);
          break;
          label735:
          o.getSegment(f6, f4, (Path)localObject, true);
        }
      }
      paramCanvas.restore();
    }
    
    public final void a(Canvas paramCanvas, int paramInt1, int paramInt2)
    {
      a(a, k, paramCanvas, paramInt1, paramInt2, null);
    }
    
    public final float getAlpha()
    {
      return getRootAlpha() / 255.0F;
    }
    
    public final int getRootAlpha()
    {
      return f;
    }
    
    public final void setAlpha(float paramFloat)
    {
      setRootAlpha((int)(255.0F * paramFloat));
    }
    
    public final void setRootAlpha(int paramInt)
    {
      f = paramInt;
    }
  }
  
  private static final class f
    extends Drawable.ConstantState
  {
    int a;
    g.e b;
    ColorStateList c = null;
    PorterDuff.Mode d = g.a;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;
    
    public f()
    {
      b = new g.e();
    }
    
    public f(f paramf)
    {
      if (paramf != null)
      {
        a = a;
        b = new g.e(b);
        if (g.e.a(b) != null) {
          g.e.a(b, new Paint(g.e.a(b)));
        }
        if (g.e.b(b) != null) {
          g.e.b(b, new Paint(g.e.b(b)));
        }
        c = c;
        d = d;
        e = e;
      }
    }
    
    public final void a(int paramInt1, int paramInt2)
    {
      f.eraseColor(0);
      Canvas localCanvas = new Canvas(f);
      b.a(localCanvas, paramInt1, paramInt2);
    }
    
    public final int getChangingConfigurations()
    {
      return a;
    }
    
    public final Drawable newDrawable()
    {
      return new g(this);
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new g(this);
    }
  }
  
  private static final class g
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState a;
    
    public g(Drawable.ConstantState paramConstantState)
    {
      a = paramConstantState;
    }
    
    public final boolean canApplyTheme()
    {
      return a.canApplyTheme();
    }
    
    public final int getChangingConfigurations()
    {
      return a.getChangingConfigurations();
    }
    
    public final Drawable newDrawable()
    {
      g localg = new g();
      b = ((VectorDrawable)a.newDrawable());
      return localg;
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      g localg = new g();
      b = ((VectorDrawable)a.newDrawable(paramResources));
      return localg;
    }
    
    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      g localg = new g();
      b = ((VectorDrawable)a.newDrawable(paramResources, paramTheme));
      return localg;
    }
  }
}


/* Location:              android/support/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */