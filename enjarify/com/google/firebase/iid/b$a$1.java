package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final class b$a$1
  implements Runnable
{
  b$a$1(b.a parama, Intent paramIntent) {}
  
  public final void run()
  {
    String str = String.valueOf(a.getAction());
    int i = String.valueOf(str).length() + 61;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    str = "Service took too long to process intent: " + str + " App may get closed.";
    Log.w("EnhancedIntentService", str);
    b.a();
  }
}


/* Location:              com/google/firebase/iid/b$a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */