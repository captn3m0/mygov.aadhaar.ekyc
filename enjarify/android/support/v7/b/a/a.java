package android.support.v7.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.a.a.a;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class a
{
  public static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    int i = 2;
    Object localObject1 = Xml.asAttributeSet(paramXmlPullParser);
    int j;
    int k;
    do
    {
      j = paramXmlPullParser.next();
      if (j == i) {
        break;
      }
      k = 1;
    } while (j != k);
    if (j != i)
    {
      localObject1 = new org/xmlpull/v1/XmlPullParserException;
      ((XmlPullParserException)localObject1).<init>("No start tag found");
      throw ((Throwable)localObject1);
    }
    String str1 = paramXmlPullParser.getName();
    Object localObject2 = "selector";
    boolean bool = str1.equals(localObject2);
    if (!bool)
    {
      localObject1 = new org/xmlpull/v1/XmlPullParserException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = paramXmlPullParser.getPositionDescription();
      str1 = str2 + ": invalid color state list tag " + str1;
      ((XmlPullParserException)localObject1).<init>(str1);
      throw ((Throwable)localObject1);
    }
    return a(paramResources, paramXmlPullParser, (AttributeSet)localObject1, paramTheme);
  }
  
  private static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = paramXmlPullParser.getDepth() + 1;
    Object localObject1 = new int[20][];
    int[] arrayOfInt1 = new int[20];
    Object localObject2 = localObject1;
    int[] arrayOfInt2 = arrayOfInt1;
    int j = 0;
    arrayOfInt1 = null;
    Object localObject3 = arrayOfInt2;
    int n;
    float f1;
    int i1;
    float f2;
    Object localObject4;
    boolean bool1;
    do
    {
      int k;
      do
      {
        k = paramXmlPullParser.next();
        n = 1;
        f1 = Float.MIN_VALUE;
        if (k == n) {
          break;
        }
        n = paramXmlPullParser.getDepth();
        if (n < i)
        {
          i1 = 3;
          f2 = 4.2E-45F;
          if (k == i1) {
            break;
          }
        }
        i1 = 2;
        f2 = 2.8E-45F;
      } while ((k != i1) || (n > i));
      localObject1 = paramXmlPullParser.getName();
      localObject4 = "item";
      bool1 = ((String)localObject1).equals(localObject4);
    } while (!bool1);
    localObject1 = a.j.ColorStateListItem;
    label157:
    int i4;
    int i2;
    label229:
    int i5;
    int[] arrayOfInt3;
    float f3;
    int i7;
    if (paramTheme == null)
    {
      localObject1 = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject1);
      n = a.j.ColorStateListItem_android_color;
      f2 = 0.0F / 0.0F;
      i4 = ((TypedArray)localObject1).getColor(n, -65281);
      n = 1065353216;
      f1 = 1.0F;
      i1 = a.j.ColorStateListItem_android_alpha;
      boolean bool2 = ((TypedArray)localObject1).hasValue(i1);
      if (!bool2) {
        break label404;
      }
      n = a.j.ColorStateListItem_android_alpha;
      i2 = 1065353216;
      f2 = 1.0F;
      f1 = ((TypedArray)localObject1).getFloat(n, f2);
      ((TypedArray)localObject1).recycle();
      i5 = 0;
      int i6 = paramAttributeSet.getAttributeCount();
      arrayOfInt3 = new int[i6];
      bool1 = false;
      f3 = 0.0F;
      localObject1 = null;
      i7 = 0;
      label263:
      if (i7 >= i6) {
        break label458;
      }
      m = paramAttributeSet.getAttributeNameResource(i7);
      i2 = 16843173;
      f2 = 2.3694738E-38F;
      if (m == i2) {
        break label588;
      }
      i2 = 16843551;
      f2 = 2.3695797E-38F;
      if (m == i2) {
        break label588;
      }
      i2 = a.a.alpha;
      if (m == i2) {
        break label588;
      }
      i2 = i5 + 1;
      boolean bool4 = paramAttributeSet.getAttributeBooleanValue(i7, false);
      if (!bool4) {
        break label450;
      }
      label344:
      arrayOfInt3[i5] = m;
    }
    label404:
    label450:
    label458:
    label588:
    for (int m = i2;; m = i5)
    {
      i2 = i7 + 1;
      i7 = i2;
      i5 = m;
      break label263;
      n = 0;
      f1 = 0.0F;
      localObject4 = null;
      i2 = 0;
      f2 = 0.0F;
      int[] arrayOfInt4 = null;
      localObject1 = paramTheme.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, 0, 0);
      break label157;
      i2 = a.j.ColorStateListItem_alpha;
      boolean bool3 = ((TypedArray)localObject1).hasValue(i2);
      if (!bool3) {
        break label229;
      }
      n = a.j.ColorStateListItem_alpha;
      int i3 = 1065353216;
      f2 = 1.0F;
      f1 = ((TypedArray)localObject1).getFloat(n, f2);
      break label229;
      m = -m;
      break label344;
      arrayOfInt4 = StateSet.trimStateSet(arrayOfInt3, i5);
      f3 = Color.alpha(i4) * f1;
      m = Math.round(f3);
      m = android.support.v4.d.a.b(i4, m);
      localObject1 = c.a((int[])localObject3, j, m);
      localObject3 = (int[][])c.a((Object[])localObject2, j, arrayOfInt4);
      j += 1;
      localObject2 = localObject3;
      localObject3 = localObject1;
      break;
      localObject1 = new int[j];
      localObject4 = new int[j][];
      System.arraycopy(localObject3, 0, localObject1, 0, j);
      System.arraycopy(localObject2, 0, localObject4, 0, j);
      localObject3 = new android/content/res/ColorStateList;
      ((ColorStateList)localObject3).<init>((int[][])localObject4, (int[])localObject1);
      return (ColorStateList)localObject3;
    }
  }
}


/* Location:              android/support/v7/b/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */