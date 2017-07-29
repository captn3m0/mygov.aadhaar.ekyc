package android.support.v4.h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

class i$a
  implements LayoutInflater.Factory
{
  final k a;
  
  i$a(k paramk)
  {
    a = paramk;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return a.a(null, paramString, paramContext, paramAttributeSet);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getClass().getName();
    localStringBuilder = localStringBuilder.append((String)localObject).append("{");
    localObject = a;
    return localObject + "}";
  }
}


/* Location:              android/support/v4/h/i$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */