package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.a.a.c;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

final class m$a
  implements m.c
{
  public final Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    try
    {
      localObject1 = paramContext.getResources();
      localObject1 = c.a(paramContext, (Resources)localObject1, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "AvdcInflateDelegate";
        String str2 = "Exception while inflating <animated-vector>";
        Log.e(str1, str2, localException);
        Object localObject2 = null;
      }
    }
    return (Drawable)localObject1;
  }
}


/* Location:              android/support/v7/widget/m$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */