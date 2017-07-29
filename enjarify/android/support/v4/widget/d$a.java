package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

final class d$a
  extends ContentObserver
{
  d$a(d paramd)
  {
    super(localHandler);
  }
  
  public final boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public final void onChange(boolean paramBoolean)
  {
    a.b();
  }
}


/* Location:              android/support/v4/widget/d$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */