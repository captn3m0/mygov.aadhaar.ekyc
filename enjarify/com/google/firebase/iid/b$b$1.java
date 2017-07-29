package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final class b$b$1
  implements Runnable
{
  b$b$1(b.b paramb, b.a parama) {}
  
  public final void run()
  {
    Object localObject1 = "EnhancedIntentService";
    int i = 3;
    boolean bool = Log.isLoggable((String)localObject1, i);
    if (bool)
    {
      localObject1 = "EnhancedIntentService";
      localObject2 = "bg processing of the intent starting now";
      Log.d((String)localObject1, (String)localObject2);
    }
    localObject1 = b.b.a(b);
    Object localObject2 = a.a;
    ((b)localObject1).b((Intent)localObject2);
    a.a();
  }
}


/* Location:              com/google/firebase/iid/b$b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */