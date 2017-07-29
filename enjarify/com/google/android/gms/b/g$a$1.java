package com.google.android.gms.b;

import android.app.Dialog;

final class g$a$1
  extends z.a
{
  g$a$1(g.a parama, Dialog paramDialog) {}
  
  public final void a()
  {
    b.a.d();
    Dialog localDialog = a;
    boolean bool = localDialog.isShowing();
    if (bool)
    {
      localDialog = a;
      localDialog.dismiss();
    }
  }
}


/* Location:              com/google/android/gms/b/g$a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */