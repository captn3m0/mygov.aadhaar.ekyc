package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class n
{
  static final d a = new a();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 12)
    {
      a = new b();
      return;
    }
  }
  
  public static float a(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.a(paramMotionEvent, paramInt);
  }
  
  public static int a(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getAction() & 0xFF;
  }
  
  public static int b(MotionEvent paramMotionEvent)
  {
    return (paramMotionEvent.getAction() & 0xFF00) >> 8;
  }
  
  static class a
    implements n.d
  {
    public float a(MotionEvent paramMotionEvent, int paramInt)
    {
      return 0.0F;
    }
  }
  
  static class b
    extends n.a
  {
    public final float a(MotionEvent paramMotionEvent, int paramInt)
    {
      return paramMotionEvent.getAxisValue(paramInt);
    }
  }
  
  private static final class c
    extends n.b
  {}
  
  static abstract interface d
  {
    public abstract float a(MotionEvent paramMotionEvent, int paramInt);
  }
}


/* Location:              android/support/v4/h/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */