package android.support.a.a;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

final class e
{
  public static float a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat)
  {
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {}
    for (;;)
    {
      return paramFloat;
      paramFloat = paramTypedArray.getFloat(paramInt, paramFloat);
    }
  }
  
  public static int a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    int i = -1;
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {}
    for (;;)
    {
      return i;
      i = paramTypedArray.getInt(paramInt, i);
    }
  }
  
  public static int a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {}
    for (;;)
    {
      return paramInt2;
      paramInt2 = paramTypedArray.getColor(paramInt1, paramInt2);
    }
  }
  
  public static boolean a(XmlPullParser paramXmlPullParser, String paramString)
  {
    String str = paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString);
    boolean bool;
    if (str != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
}


/* Location:              android/support/a/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */