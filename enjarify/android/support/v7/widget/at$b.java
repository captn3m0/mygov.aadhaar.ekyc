package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

public final class at$b
  extends Observable
{
  public final void a()
  {
    Object localObject = mObservers;
    int i = ((ArrayList)localObject).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject = (at.c)mObservers.get(j);
      ((at.c)localObject).a();
      i = j + -1;
    }
  }
}


/* Location:              android/support/v7/widget/at$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */