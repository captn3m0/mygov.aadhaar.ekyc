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
  private final ch c;
  private final ch d;
  
  dl(dc paramdc)
  {
    super(paramdc);
    Object localObject = new com/google/android/gms/b/dl$1;
    dc localdc = q;
    ((dl.1)localObject).<init>(this, localdc);
    c = ((ch)localObject);
    localObject = new com/google/android/gms/b/dl$2;
    localdc = q;
    ((dl.2)localObject).<init>(this, localdc);
    d = ((ch)localObject);
  }
  
  private void y()
  {
    try
    {
      Handler localHandler = b;
      if (localHandler == null)
      {
        localHandler = new android/os/Handler;
        Looper localLooper = Looper.getMainLooper();
        localHandler.<init>(localLooper);
        b = localHandler;
      }
      return;
    }
    finally {}
  }
  
  protected final void a() {}
  
  public final boolean a(boolean paramBoolean)
  {
    long l1 = 3600000L;
    long l2 = 0L;
    super.e();
    J();
    Object localObject1 = super.m();
    long l3 = ((c)localObject1).b();
    long l4 = a;
    boolean bool1 = l4 < l2;
    if (!bool1)
    {
      l4 = l3 - l1;
      a = l4;
    }
    l4 = a;
    l4 = l3 - l4;
    Object localObject2;
    Object localObject3;
    boolean bool3;
    if (!paramBoolean)
    {
      long l5 = 1000L;
      boolean bool2 = l4 < l5;
      if (bool2)
      {
        localObject1 = ug;
        localObject2 = "Screen exposed for less than 1000 ms. Event not sent. time";
        localObject3 = Long.valueOf(l4);
        ((cu.a)localObject1).a((String)localObject2, localObject3);
        bool3 = false;
        localObject1 = null;
      }
    }
    for (;;)
    {
      return bool3;
      vo.a(l4);
      Object localObject4 = ug;
      Long localLong = Long.valueOf(l4);
      ((cu.a)localObject4).a("Recording user engagement, ms", localLong);
      localObject4 = new android/os/Bundle;
      ((Bundle)localObject4).<init>();
      ((Bundle)localObject4).putLong("_et", l4);
      di.a(super.l().x(), (Bundle)localObject4);
      localObject3 = super.h();
      String str1 = "auto";
      String str2 = "_e";
      ((dh)localObject3).b(str1, str2, (Bundle)localObject4);
      a = l3;
      d.c();
      localObject1 = d;
      localObject2 = vo;
      l4 = ((cy.b)localObject2).a();
      l4 = l1 - l4;
      l4 = Math.max(l2, l4);
      ((ch)localObject1).a(l4);
      bool3 = true;
    }
  }
  
  protected final void x()
  {
    super.e();
    long l = super.m().b();
    cu.a locala = ug;
    Object localObject = Long.valueOf(l);
    locala.a("Session started, time", localObject);
    vm.a(false);
    localObject = super.h();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    ((dh)localObject).b("auto", "_s", localBundle);
  }
}


/* Location:              com/google/android/gms/b/dl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */