package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class h
{
  private static final h.c b;
  private Object a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/widget/h$d;
      ((h.d)localObject).<init>();
      b = (h.c)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 14;
      if (i >= j)
      {
        localObject = new android/support/v4/widget/h$b;
        ((h.b)localObject).<init>();
        b = (h.c)localObject;
      }
      else
      {
        localObject = new android/support/v4/widget/h$a;
        ((h.a)localObject).<init>();
        b = (h.c)localObject;
      }
    }
  }
  
  public h(Context paramContext)
  {
    Object localObject = b.a(paramContext);
    a = localObject;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    h.c localc = b;
    Object localObject = a;
    localc.a(localObject, paramInt1, paramInt2);
  }
  
  public final boolean a()
  {
    h.c localc = b;
    Object localObject = a;
    return localc.a(localObject);
  }
  
  public final boolean a(float paramFloat1, float paramFloat2)
  {
    h.c localc = b;
    Object localObject = a;
    return localc.a(localObject, paramFloat1, paramFloat2);
  }
  
  public final boolean a(int paramInt)
  {
    h.c localc = b;
    Object localObject = a;
    return localc.a(localObject, paramInt);
  }
  
  public final boolean a(Canvas paramCanvas)
  {
    h.c localc = b;
    Object localObject = a;
    return localc.a(localObject, paramCanvas);
  }
  
  public final boolean b()
  {
    h.c localc = b;
    Object localObject = a;
    return localc.b(localObject);
  }
}


/* Location:              android/support/v4/widget/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */