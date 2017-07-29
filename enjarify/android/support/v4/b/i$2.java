package android.support.v4.b;

import android.view.View;

final class i$2
  extends k
{
  i$2(i parami) {}
  
  public final View a(int paramInt)
  {
    Object localObject = a.P;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Fragment does not have a view");
      throw ((Throwable)localObject);
    }
    return a.P.findViewById(paramInt);
  }
  
  public final boolean a()
  {
    View localView = a.P;
    boolean bool;
    if (localView != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
}


/* Location:              android/support/v4/b/i$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */