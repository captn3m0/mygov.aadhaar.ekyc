package com.google.android.gms.b;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.c;

final class g$a
  implements Runnable
{
  private g$a(g paramg) {}
  
  public final void run()
  {
    Object localObject1 = a;
    boolean bool = a;
    if (!bool) {}
    for (;;)
    {
      return;
      localObject1 = g.a(a);
      bool = ((a)localObject1).a();
      Object localObject2;
      Object localObject3;
      Object localObject4;
      int j;
      g localg;
      int k;
      if (bool)
      {
        localObject1 = a.e;
        localObject2 = a.e();
        localObject3 = aa).d;
        localObject4 = a;
        j = g.b((g)localObject4);
        localg = null;
        localObject2 = GoogleApiActivity.a((Context)localObject2, (PendingIntent)localObject3, j, false);
        k = 1;
        ((af)localObject1).startActivityForResult((Intent)localObject2, k);
      }
      else
      {
        localObject1 = a.c;
        localObject2 = g.a(a);
        int m = c;
        bool = ((c)localObject1).a(m);
        if (bool)
        {
          localObject1 = a.c;
          localObject2 = a.e();
          localObject3 = a.e;
          localObject4 = g.a(a);
          j = c;
          localg = a;
          ((c)localObject1).a((Activity)localObject2, (af)localObject3, j, localg);
        }
        else
        {
          localObject1 = g.a(a);
          int i = c;
          m = 18;
          if (i == m)
          {
            localObject1 = a.e();
            localObject2 = a;
            localObject1 = c.a((Activity)localObject1, (DialogInterface.OnCancelListener)localObject2);
            localObject2 = a.e().getApplicationContext();
            localObject3 = new com/google/android/gms/b/g$a$1;
            ((g.a.1)localObject3).<init>(this, (Dialog)localObject1);
            c.a((Context)localObject2, (z.a)localObject3);
          }
          else
          {
            localObject1 = a;
            localObject2 = g.a(a);
            localObject3 = a;
            k = g.b((g)localObject3);
            ((g)localObject1).a((a)localObject2, k);
          }
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/g$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */