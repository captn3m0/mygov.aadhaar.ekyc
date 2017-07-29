package com.google.android.gms.b;

import android.os.Handler;
import android.os.Message;

final class x$1
  implements e.a
{
  x$1(x paramx) {}
  
  public final void a(boolean paramBoolean)
  {
    Handler localHandler = x.a(a);
    Object localObject = x.a(a);
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localObject = ((Handler)localObject).obtainMessage(1, localBoolean);
    localHandler.sendMessage((Message)localObject);
  }
}


/* Location:              com/google/android/gms/b/x$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */