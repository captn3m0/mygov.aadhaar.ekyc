package android.support.v4.h;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

@TargetApi(9)
final class i
{
  static class a
    implements LayoutInflater.Factory
  {
    final k a;
    
    a(k paramk)
    {
      a = paramk;
    }
    
    public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      return a.a(null, paramString, paramContext, paramAttributeSet);
    }
    
    public String toString()
    {
      return getClass().getName() + "{" + a + "}";
    }
  }
}


/* Location:              android/support/v4/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */