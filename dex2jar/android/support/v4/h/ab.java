package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class ab
{
  static final c a = new f();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new e();
      return;
    }
    if (i >= 18)
    {
      a = new d();
      return;
    }
    if (i >= 14)
    {
      a = new b();
      return;
    }
    if (i >= 11)
    {
      a = new a();
      return;
    }
  }
  
  public static void a(ViewGroup paramViewGroup)
  {
    a.a(paramViewGroup);
  }
  
  static class a
    extends ab.f
  {
    public final void a(ViewGroup paramViewGroup)
    {
      paramViewGroup.setMotionEventSplittingEnabled(false);
    }
  }
  
  static class b
    extends ab.a
  {}
  
  static abstract interface c
  {
    public abstract void a(ViewGroup paramViewGroup);
  }
  
  static class d
    extends ab.b
  {}
  
  static final class e
    extends ab.d
  {}
  
  static class f
    implements ab.c
  {
    public void a(ViewGroup paramViewGroup) {}
  }
}


/* Location:              android/support/v4/h/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */