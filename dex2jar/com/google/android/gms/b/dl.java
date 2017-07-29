package com.google.android.gms.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.c;

public final class dl
  extends df
{
  protected long a;
  private Handler b;
  private final ch c = new ch(q)
  {
    public final void a()
    {
      x();
    }
  };
  private final ch d = new ch(q)
  {
    public final void a()
    {
      dl.a(dl.this);
    }
  };
  
  dl(dc paramdc)
  {
    super(paramdc);
  }
  
  private void y()
  {
    try
    {
      if (b == null) {
        b = new Handler(Looper.getMainLooper());
      }
      return;
    }
    finally {}
  }
  
  protected final void a() {}
  
  public final boolean a(boolean paramBoolean)
  {
    super.e();
    J();
    long l1 = super.m().b();
    if (a == 0L) {
      a = (l1 - 3600000L);
    }
    long l2 = l1 - a;
    if ((!paramBoolean) && (l2 < 1000L))
    {
      ug.a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(l2));
      return false;
    }
    vo.a(l2);
    ug.a("Recording user engagement, ms", Long.valueOf(l2));
    Bundle localBundle = new Bundle();
    localBundle.putLong("_et", l2);
    di.a(super.l().x(), localBundle);
    super.h().b("auto", "_e", localBundle);
    a = l1;
    d.c();
    d.a(Math.max(0L, 3600000L - vo.a()));
    return true;
  }
  
  protected final void x()
  {
    super.e();
    long l = super.m().b();
    ug.a("Session started, time", Long.valueOf(l));
    vm.a(false);
    super.h().b("auto", "_s", new Bundle());
  }
}


/* Location:              com/google/android/gms/b/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */