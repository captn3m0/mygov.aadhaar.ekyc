package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

final class g$c
{
  final Matrix a;
  final ArrayList b;
  float c;
  final Matrix d;
  int e;
  private float f;
  private float g;
  private float h;
  private float i;
  private float j;
  private float k;
  private int[] l;
  private String m;
  
  public g$c()
  {
    Object localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    a = ((Matrix)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    b = ((ArrayList)localObject);
    c = 0.0F;
    f = 0.0F;
    g = 0.0F;
    h = f1;
    i = f1;
    j = 0.0F;
    k = 0.0F;
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    d = ((Matrix)localObject);
    m = null;
  }
  
  public g$c(c paramc, android.support.v4.g.a parama)
  {
    Object localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    a = ((Matrix)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    b = ((ArrayList)localObject1);
    c = 0.0F;
    f = 0.0F;
    g = 0.0F;
    h = f1;
    i = f1;
    j = 0.0F;
    k = 0.0F;
    localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    d = ((Matrix)localObject1);
    m = null;
    float f2 = c;
    c = f2;
    f2 = f;
    f = f2;
    f2 = g;
    g = f2;
    f2 = h;
    h = f2;
    f2 = i;
    i = f2;
    f2 = j;
    j = f2;
    f2 = k;
    k = f2;
    localObject1 = l;
    l = ((int[])localObject1);
    localObject1 = m;
    m = ((String)localObject1);
    int i2 = e;
    e = i2;
    localObject1 = m;
    if (localObject1 != null)
    {
      localObject1 = m;
      parama.put(localObject1, this);
    }
    localObject1 = d;
    localMatrix = d;
    ((Matrix)localObject1).set(localMatrix);
    ArrayList localArrayList = b;
    i2 = 0;
    f2 = 0.0F;
    localObject1 = null;
    i1 = 0;
    localMatrix = null;
    Object localObject2;
    for (;;)
    {
      i2 = localArrayList.size();
      if (i1 >= i2) {
        return;
      }
      localObject1 = localArrayList.get(i1);
      bool = localObject1 instanceof c;
      if (!bool) {
        break;
      }
      localObject1 = (c)localObject1;
      localObject2 = b;
      c localc = new android/support/a/a/g$c;
      localc.<init>((c)localObject1, parama);
      ((ArrayList)localObject2).add(localc);
      i2 = i1 + 1;
      i1 = i2;
    }
    boolean bool = localObject1 instanceof g.b;
    if (bool)
    {
      localObject2 = new android/support/a/a/g$b;
      localObject1 = (g.b)localObject1;
      ((g.b)localObject2).<init>((g.b)localObject1);
    }
    for (localObject1 = localObject2;; localObject1 = localObject2)
    {
      b.add(localObject1);
      localObject2 = n;
      if (localObject2 == null) {
        break;
      }
      localObject2 = n;
      parama.put(localObject2, localObject1);
      break;
      bool = localObject1 instanceof g.a;
      if (!bool) {
        break label482;
      }
      localObject2 = new android/support/a/a/g$a;
      localObject1 = (g.a)localObject1;
      ((g.a)localObject2).<init>((g.a)localObject1);
    }
    label482:
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("Unknown object in the tree!");
    throw ((Throwable)localObject1);
  }
  
  private void a()
  {
    d.reset();
    Matrix localMatrix = d;
    float f1 = -f;
    float f2 = -g;
    localMatrix.postTranslate(f1, f2);
    localMatrix = d;
    f1 = h;
    f2 = i;
    localMatrix.postScale(f1, f2);
    localMatrix = d;
    f1 = c;
    localMatrix.postRotate(f1, 0.0F, 0.0F);
    localMatrix = d;
    f1 = j;
    f2 = f;
    f1 += f2;
    f2 = k;
    float f3 = g;
    f2 += f3;
    localMatrix.postTranslate(f1, f2);
  }
  
  public final void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    Object localObject = a.b;
    localObject = f.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject);
    l = null;
    float f1 = c;
    float f2 = e.a((TypedArray)localObject, paramXmlPullParser, "rotation", 5, f1);
    c = f2;
    float f3 = f;
    f2 = ((TypedArray)localObject).getFloat(1, f3);
    f = f2;
    f3 = g;
    f2 = ((TypedArray)localObject).getFloat(2, f3);
    g = f2;
    f1 = h;
    f2 = e.a((TypedArray)localObject, paramXmlPullParser, "scaleX", 3, f1);
    h = f2;
    f1 = i;
    f2 = e.a((TypedArray)localObject, paramXmlPullParser, "scaleY", 4, f1);
    i = f2;
    f1 = j;
    f2 = e.a((TypedArray)localObject, paramXmlPullParser, "translateX", 6, f1);
    j = f2;
    int n = 7;
    f3 = 9.8E-45F;
    f1 = k;
    f2 = e.a((TypedArray)localObject, paramXmlPullParser, "translateY", n, f1);
    k = f2;
    f2 = 0.0F;
    String str = ((TypedArray)localObject).getString(0);
    if (str != null) {
      m = str;
    }
    a();
    ((TypedArray)localObject).recycle();
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
    float f1 = f;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      f = paramFloat;
      a();
    }
  }
  
  public final void setPivotY(float paramFloat)
  {
    float f1 = g;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      g = paramFloat;
      a();
    }
  }
  
  public final void setRotation(float paramFloat)
  {
    float f1 = c;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      c = paramFloat;
      a();
    }
  }
  
  public final void setScaleX(float paramFloat)
  {
    float f1 = h;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      h = paramFloat;
      a();
    }
  }
  
  public final void setScaleY(float paramFloat)
  {
    float f1 = i;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      i = paramFloat;
      a();
    }
  }
  
  public final void setTranslateX(float paramFloat)
  {
    float f1 = j;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      j = paramFloat;
      a();
    }
  }
  
  public final void setTranslateY(float paramFloat)
  {
    float f1 = k;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      k = paramFloat;
      a();
    }
  }
}


/* Location:              android/support/a/a/g$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */