package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

final class g$b
  extends g.d
{
  int a = 0;
  float b = 0.0F;
  int c = 0;
  float d;
  int e;
  float f;
  float g;
  float h;
  float i;
  Paint.Cap j;
  Paint.Join k;
  float l;
  private int[] p;
  
  public g$b()
  {
    d = f1;
    f = f1;
    g = 0.0F;
    h = f1;
    i = 0.0F;
    Object localObject = Paint.Cap.BUTT;
    j = ((Paint.Cap)localObject);
    localObject = Paint.Join.MITER;
    k = ((Paint.Join)localObject);
    l = 4.0F;
  }
  
  public g$b(b paramb)
  {
    super(paramb);
    d = f1;
    f = f1;
    g = 0.0F;
    h = f1;
    i = 0.0F;
    Object localObject = Paint.Cap.BUTT;
    j = ((Paint.Cap)localObject);
    localObject = Paint.Join.MITER;
    k = ((Paint.Join)localObject);
    l = 4.0F;
    localObject = p;
    p = ((int[])localObject);
    int m = a;
    a = m;
    float f2 = b;
    b = f2;
    f2 = d;
    d = f2;
    m = c;
    c = m;
    m = e;
    e = m;
    f2 = f;
    f = f2;
    f2 = g;
    g = f2;
    f2 = h;
    h = f2;
    f2 = i;
    i = f2;
    localObject = j;
    j = ((Paint.Cap)localObject);
    localObject = k;
    k = ((Paint.Join)localObject);
    f2 = l;
    l = f2;
  }
  
  public final void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    Object localObject = a.c;
    TypedArray localTypedArray = f.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject);
    float f1 = 0.0F;
    p = null;
    localObject = "pathData";
    boolean bool = e.a(paramXmlPullParser, (String)localObject);
    int m;
    int n;
    float f2;
    int i1;
    if (bool)
    {
      bool = false;
      f1 = 0.0F;
      localObject = localTypedArray.getString(0);
      if (localObject != null) {
        this.n = ((String)localObject);
      }
      m = 2;
      f1 = 2.8E-45F;
      localObject = localTypedArray.getString(m);
      if (localObject != null)
      {
        localObject = d.a((String)localObject);
        this.m = ((d.b[])localObject);
      }
      n = c;
      m = e.a(localTypedArray, paramXmlPullParser, "fillColor", 1, n);
      c = m;
      f2 = f;
      f1 = e.a(localTypedArray, paramXmlPullParser, "fillAlpha", 12, f2);
      f = f1;
      i1 = e.a(localTypedArray, paramXmlPullParser, "strokeLineCap", 8);
      localObject = j;
      switch (i1)
      {
      default: 
        j = ((Paint.Cap)localObject);
        i1 = e.a(localTypedArray, paramXmlPullParser, "strokeLineJoin", 9);
        localObject = k;
        switch (i1)
        {
        }
        break;
      }
    }
    for (;;)
    {
      k = ((Paint.Join)localObject);
      f2 = l;
      f1 = e.a(localTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, f2);
      l = f1;
      n = a;
      m = e.a(localTypedArray, paramXmlPullParser, "strokeColor", 3, n);
      a = m;
      f2 = d;
      f1 = e.a(localTypedArray, paramXmlPullParser, "strokeAlpha", 11, f2);
      d = f1;
      f2 = b;
      f1 = e.a(localTypedArray, paramXmlPullParser, "strokeWidth", 4, f2);
      b = f1;
      f2 = h;
      f1 = e.a(localTypedArray, paramXmlPullParser, "trimPathEnd", 6, f2);
      h = f1;
      f2 = i;
      f1 = e.a(localTypedArray, paramXmlPullParser, "trimPathOffset", 7, f2);
      i = f1;
      localObject = "trimPathStart";
      i1 = 5;
      f2 = g;
      f1 = e.a(localTypedArray, paramXmlPullParser, (String)localObject, i1, f2);
      g = f1;
      localTypedArray.recycle();
      return;
      localObject = Paint.Cap.BUTT;
      break;
      localObject = Paint.Cap.ROUND;
      break;
      localObject = Paint.Cap.SQUARE;
      break;
      localObject = Paint.Join.MITER;
      continue;
      localObject = Paint.Join.ROUND;
      continue;
      localObject = Paint.Join.BEVEL;
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


/* Location:              android/support/a/a/g$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */