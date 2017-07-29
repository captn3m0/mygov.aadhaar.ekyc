package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.a;
import android.support.v7.widget.bf;

final class h$a
  implements b.a
{
  h$a(h paramh) {}
  
  public final Drawable a()
  {
    Object localObject = a.n();
    int[] arrayOfInt = new int[1];
    int i = a.a.homeAsUpIndicator;
    arrayOfInt[0] = i;
    localObject = bf.a((Context)localObject, null, arrayOfInt);
    Drawable localDrawable = ((bf)localObject).a(0);
    a.recycle();
    return localDrawable;
  }
  
  public final void a(int paramInt)
  {
    a locala = a.a();
    if (locala != null) {
      locala.a(paramInt);
    }
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    a locala = a.a();
    if (locala != null)
    {
      locala.a(paramDrawable);
      locala.a(paramInt);
    }
  }
  
  public final Context b()
  {
    return a.n();
  }
  
  public final boolean c()
  {
    a locala = a.a();
    int i;
    if (locala != null)
    {
      i = locala.a() & 0x4;
      if (i != 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      locala = null;
    }
  }
}


/* Location:              android/support/v7/app/h$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */