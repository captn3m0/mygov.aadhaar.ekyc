package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.support.v4.g.g;

final class m$b
  extends g
{
  static int a(int paramInt, PorterDuff.Mode paramMode)
  {
    int i = (paramInt + 31) * 31;
    int j = paramMode.hashCode();
    return i + j;
  }
}


/* Location:              android/support/v7/widget/m$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */