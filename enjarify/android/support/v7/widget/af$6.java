package android.support.v7.widget;

import android.support.v4.h.ae;
import android.support.v4.h.w;
import android.view.View;
import java.util.ArrayList;

final class af$6
  extends af.c
{
  af$6(af paramaf, at.u paramu, int paramInt1, int paramInt2, ae paramae) {}
  
  public final void a(View paramView) {}
  
  public final void b(View paramView)
  {
    d.a(null);
    Object localObject = e;
    at.u localu = a;
    ((az)localObject).e(localu);
    localObject = e.e;
    localu = a;
    ((ArrayList)localObject).remove(localu);
    e.c();
  }
  
  public final void c(View paramView)
  {
    int i = b;
    if (i != 0) {
      w.a(paramView, 0.0F);
    }
    i = c;
    if (i != 0) {
      w.b(paramView, 0.0F);
    }
  }
}


/* Location:              android/support/v7/widget/af$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */