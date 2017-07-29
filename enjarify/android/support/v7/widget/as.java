package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class as
{
  protected final at.g a;
  int b = -1 << -1;
  final Rect c;
  
  private as(at.g paramg)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    c = localRect;
    a = paramg;
  }
  
  public static as a(at.g paramg, int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default: 
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("invalid orientation");
      throw ((Throwable)localObject);
    case 0: 
      localObject = new android/support/v7/widget/as$1;
      ((as.1)localObject).<init>(paramg);
    }
    for (;;)
    {
      return (as)localObject;
      localObject = new android/support/v7/widget/as$2;
      ((as.2)localObject).<init>(paramg);
    }
  }
  
  public final int a()
  {
    int i = -1 << -1;
    int j = b;
    if (i == j) {
      i = 0;
    }
    for (;;)
    {
      return i;
      i = e();
      j = b;
      i -= j;
    }
  }
  
  public abstract int a(View paramView);
  
  public abstract void a(int paramInt);
  
  public abstract int b();
  
  public abstract int b(View paramView);
  
  public abstract int c();
  
  public abstract int c(View paramView);
  
  public abstract int d();
  
  public abstract int d(View paramView);
  
  public abstract int e();
  
  public abstract int e(View paramView);
  
  public abstract int f();
  
  public abstract int f(View paramView);
  
  public abstract int g();
  
  public abstract int h();
}


/* Location:              android/support/v7/widget/as.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */