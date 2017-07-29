package android.support.v4.b;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

abstract class g
  extends f
{
  boolean b;
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    boolean bool = b;
    if (!bool)
    {
      int i = -1;
      if (paramInt != i) {
        a(paramInt);
      }
    }
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    boolean bool = a;
    if (!bool)
    {
      int i = -1;
      if (paramInt1 != i) {
        a(paramInt1);
      }
    }
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
}


/* Location:              android/support/v4/b/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */