package android.support.v7.view;

import android.support.v4.h.ai;
import android.support.v4.h.aj;
import android.view.View;
import java.util.ArrayList;

final class h$1
  extends aj
{
  private boolean b = false;
  private int c = 0;
  
  h$1(h paramh) {}
  
  public final void a(View paramView)
  {
    boolean bool = b;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      b = bool;
      ai localai = a.b;
      if (localai != null)
      {
        localai = a.b;
        localai.a(null);
      }
    }
  }
  
  public final void b(View paramView)
  {
    int i = c + 1;
    c = i;
    ArrayList localArrayList = a.a;
    int j = localArrayList.size();
    if (i == j)
    {
      Object localObject = a.b;
      if (localObject != null)
      {
        localObject = a.b;
        j = 0;
        localArrayList = null;
        ((ai)localObject).b(null);
      }
      c = 0;
      b = false;
      localObject = a;
      c = false;
    }
  }
}


/* Location:              android/support/v7/view/h$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */