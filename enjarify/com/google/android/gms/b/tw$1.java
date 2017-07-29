package com.google.android.gms.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.gms.ads.internal.w;

final class tw$1
  implements DialogInterface.OnClickListener
{
  tw$1(tw paramtw, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = a;
    Object localObject1;
    if (paramInt == i)
    {
      localObject1 = d;
      ((tw)localObject1).b();
    }
    for (;;)
    {
      return;
      i = b;
      Object localObject2;
      if (paramInt == i)
      {
        localObject1 = ke.df;
        localObject2 = w.q();
        localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
        boolean bool1 = ((Boolean)localObject1).booleanValue();
        if (bool1)
        {
          localObject1 = d;
          tp.b("Debug mode [Creative Preview] selected.");
          localObject2 = new com/google/android/gms/b/tw$4;
          ((tw.4)localObject2).<init>((tw)localObject1);
          ts.a((Runnable)localObject2);
          continue;
        }
      }
      int j = c;
      if (paramInt == j)
      {
        localObject1 = ke.dg;
        localObject2 = w.q();
        localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
        boolean bool2 = ((Boolean)localObject1).booleanValue();
        if (bool2)
        {
          localObject1 = d;
          tp.b("Debug mode [Troubleshooting] selected.");
          localObject2 = new com/google/android/gms/b/tw$5;
          ((tw.5)localObject2).<init>((tw)localObject1);
          ts.a((Runnable)localObject2);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/tw$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */