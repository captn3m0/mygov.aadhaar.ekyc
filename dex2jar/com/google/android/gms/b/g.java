package com.google.android.gms.b;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.GoogleApiActivity;
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
  private final Handler g = new Handler(Looper.getMainLooper());
  
  protected g(af paramaf)
  {
    this(paramaf, c.a());
  }
  
  private g(af paramaf, c paramc)
  {
    super(paramaf);
    c = paramc;
  }
  
  public void a()
  {
    super.a();
    a = true;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      paramInt1 = 0;
      if (paramInt1 != 0)
      {
        d();
        return;
      }
      break;
    case 2: 
      label30:
      j = c.a(e());
      if (j != 0) {}
      break;
    }
    for (paramInt2 = i;; paramInt2 = 0)
    {
      paramInt1 = paramInt2;
      if (d.c != 18) {
        break label30;
      }
      paramInt1 = paramInt2;
      if (j != 18) {
        break label30;
      }
      return;
      paramInt1 = j;
      if (paramInt2 == -1) {
        break label30;
      }
      if (paramInt2 != 0) {
        break;
      }
      if (paramIntent != null) {}
      for (paramInt1 = paramIntent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);; paramInt1 = 13)
      {
        d = new a(paramInt1, null);
        break;
        a(d, f);
        return;
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      b = paramBundle.getBoolean("resolving_error", false);
      if (b)
      {
        f = paramBundle.getInt("failed_client_id", -1);
        d = new a(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
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
    paramBundle.putBoolean("resolving_error", b);
    if (b)
    {
      paramBundle.putInt("failed_client_id", f);
      paramBundle.putInt("failed_status", d.c);
      paramBundle.putParcelable("failed_resolution", d.d);
    }
  }
  
  public final void b(a parama, int paramInt)
  {
    if (!b)
    {
      b = true;
      f = paramInt;
      d = parama;
      g.post(new a((byte)0));
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
    a(new a(13, null), f);
    d();
  }
  
  private final class a
    implements Runnable
  {
    private a() {}
    
    public final void run()
    {
      if (!a) {
        return;
      }
      if (g.a(g.this).a())
      {
        e.startActivityForResult(GoogleApiActivity.a(e(), ad, g.b(g.this), false), 1);
        return;
      }
      if (c.a(ac))
      {
        c.a(e(), e, ac, g.this);
        return;
      }
      if (ac == 18)
      {
        final Dialog localDialog = c.a(e(), g.this);
        c.a(e().getApplicationContext(), new z.a()
        {
          public final void a()
          {
            d();
            if (localDialog.isShowing()) {
              localDialog.dismiss();
            }
          }
        });
        return;
      }
      a(g.a(g.this), g.b(g.this));
    }
  }
}


/* Location:              com/google/android/gms/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */