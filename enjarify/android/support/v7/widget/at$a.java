package android.support.v7.widget;

import android.view.ViewGroup;

public abstract class at$a
{
  public final at.b d;
  boolean e;
  
  public at$a()
  {
    at.b localb = new android/support/v7/widget/at$b;
    localb.<init>();
    d = localb;
    e = false;
  }
  
  public abstract int a();
  
  public long a(int paramInt)
  {
    return -1;
  }
  
  public abstract at.u a(ViewGroup paramViewGroup, int paramInt);
  
  public void a(at.u paramu) {}
  
  public abstract void a(at.u paramu, int paramInt);
  
  public int b(int paramInt)
  {
    return 0;
  }
}


/* Location:              android/support/v7/widget/at$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */