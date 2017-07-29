package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

final class g$a
  extends g.d
{
  public g$a() {}
  
  public g$a(a parama)
  {
    super(parama);
  }
  
  public final void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = "pathData";
    boolean bool = e.a(paramXmlPullParser, (String)localObject1);
    if (!bool) {}
    for (;;)
    {
      return;
      localObject1 = a.d;
      localObject1 = f.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject1);
      int i = 0;
      Object localObject2 = ((TypedArray)localObject1).getString(0);
      if (localObject2 != null) {
        n = ((String)localObject2);
      }
      i = 1;
      localObject2 = ((TypedArray)localObject1).getString(i);
      if (localObject2 != null)
      {
        localObject2 = d.a((String)localObject2);
        m = ((d.b[])localObject2);
      }
      ((TypedArray)localObject1).recycle();
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              android/support/a/a/g$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */