package com.google.firebase.iid;

import android.content.Intent;
import android.os.ConditionVariable;

final class f$a
  implements f.b
{
  final ConditionVariable a;
  Intent b;
  String c;
  
  private f$a()
  {
    ConditionVariable localConditionVariable = new android/os/ConditionVariable;
    localConditionVariable.<init>();
    a = localConditionVariable;
  }
  
  public final void a(Intent paramIntent)
  {
    b = paramIntent;
    a.open();
  }
  
  public final void a(String paramString)
  {
    c = paramString;
    a.open();
  }
}


/* Location:              com/google/firebase/iid/f$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */