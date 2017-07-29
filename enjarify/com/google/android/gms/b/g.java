package com.google.android.gms.b;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;

public abstract class g
  extends ae
  implements DialogInterface.OnCancelListener
{
  protected boolean a;
  protected boolean b;
  protected final c c;
  private a d;
  private int f = -1;
  private final Handler g;
  
  protected g(af paramaf)
  {
    this(paramaf, localc);
  }
  
  private g(af paramaf, c paramc)
  {
    super(paramaf);
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    g = localHandler;
    c = paramc;
  }
  
  public void a()
  {
    super.a();
    a = true;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 18;
    int j = 13;
    int k = 1;
    int m = 0;
    a locala = null;
    Object localObject1;
    label46:
    label55:
    Object localObject2;
    Activity localActivity;
    switch (paramInt1)
    {
    default: 
      k = 0;
      localObject1 = null;
      if (k != 0)
      {
        d();
        return;
      }
      break;
    case 2: 
      localObject2 = c;
      localActivity = e();
      j = ((c)localObject2).a(localActivity);
      if (j != 0) {}
      break;
    }
    for (;;)
    {
      locala = d;
      m = c;
      if ((m != i) || (j != i)) {
        break label46;
      }
      break label55;
      int n = -1;
      if (paramInt2 == n) {
        break label46;
      }
      if (paramInt2 != 0) {
        break;
      }
      if (paramIntent != null) {
        localObject1 = "<<ResolutionFailureErrorDetail>>";
      }
      for (k = paramIntent.getIntExtra((String)localObject1, j);; k = j)
      {
        localObject2 = new com/google/android/gms/common/a;
        n = 0;
        localActivity = null;
        ((a)localObject2).<init>(k, null);
        d = ((a)localObject2);
        break;
        localObject1 = d;
        m = f;
        a((a)localObject1, m);
        break label55;
      }
      k = 0;
      localObject1 = null;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      Object localObject = "resolving_error";
      int i = 0;
      a locala = null;
      boolean bool = paramBundle.getBoolean((String)localObject, false);
      b = bool;
      bool = b;
      if (bool)
      {
        i = -1;
        int j = paramBundle.getInt("failed_client_id", i);
        f = j;
        locala = new com/google/android/gms/common/a;
        int k = paramBundle.getInt("failed_status");
        localObject = (PendingIntent)paramBundle.getParcelable("failed_resolution");
        locala.<init>(k, (PendingIntent)localObject);
        d = locala;
      }
    }
  }
  
  protected abstract void a(a parama, int paramInt);
  
  public void b()
  {
    super.b();
    a = false;
  }
  
  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    String str = "resolving_error";
    boolean bool1 = b;
    paramBundle.putBoolean(str, bool1);
    boolean bool2 = b;
    if (bool2)
    {
      int i = f;
      paramBundle.putInt("failed_client_id", i);
      i = d.c;
      paramBundle.putInt("failed_status", i);
      str = "failed_resolution";
      PendingIntent localPendingIntent = d.d;
      paramBundle.putParcelable(str, localPendingIntent);
    }
  }
  
  public final void b(a parama, int paramInt)
  {
    boolean bool = b;
    if (!bool)
    {
      bool = true;
      b = bool;
      f = paramInt;
      d = parama;
      Handler localHandler = g;
      g.a locala = new com/google/android/gms/b/g$a;
      locala.<init>(this, (byte)0);
      localHandler.post(locala);
    }
  }
  
  protected abstract void c();
  
  protected final void d()
  {
    f = -1;
    b = false;
    d = null;
    c();
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    a locala = new com/google/android/gms/common/a;
    locala.<init>(13, null);
    int i = f;
    a(locala, i);
    d();
  }
}


/* Location:              com/google/android/gms/b/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */