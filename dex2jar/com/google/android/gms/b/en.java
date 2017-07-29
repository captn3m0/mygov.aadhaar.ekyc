package com.google.android.gms.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.o.i;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.z;

public final class en
  extends u<ek>
  implements ec
{
  private final boolean a;
  private final p i;
  private final Bundle j;
  private Integer k;
  
  public en(Context paramContext, Looper paramLooper, p paramp, c.b paramb, c.c paramc)
  {
    this(paramContext, paramLooper, true, paramp, localBundle, paramb, paramc);
  }
  
  public en(Context paramContext, Looper paramLooper, boolean paramBoolean, p paramp, Bundle paramBundle, c.b paramb, c.c paramc)
  {
    super(paramContext, paramLooper, 44, paramp, paramb, paramc);
    a = paramBoolean;
    i = paramp;
    j = paramBundle;
    k = h;
  }
  
  public final void a(ej paramej)
  {
    c.a(paramej, "Expecting a valid ISignInCallbacks");
    try
    {
      Object localObject1 = i;
      if (a != null) {}
      for (localObject1 = a;; localObject1 = new Account("<<default account>>", "com.google"))
      {
        Object localObject2 = null;
        if ("<<default account>>".equals(name))
        {
          localObject2 = com.google.android.gms.auth.api.signin.a.d.a(d);
          localObject2 = ((com.google.android.gms.auth.api.signin.a.d)localObject2).a(((com.google.android.gms.auth.api.signin.a.d)localObject2).c("defaultGoogleSignInAccount"));
        }
        localObject1 = new com.google.android.gms.common.internal.d((Account)localObject1, k.intValue(), (GoogleSignInAccount)localObject2);
        ((ek)l()).a(new eo((com.google.android.gms.common.internal.d)localObject1), paramej);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
      try
      {
        paramej.a(new eq());
        return;
      }
      catch (RemoteException paramej)
      {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", localRemoteException);
      }
    }
  }
  
  public final void a(z paramz, boolean paramBoolean)
  {
    try
    {
      ((ek)l()).a(paramz, k.intValue(), paramBoolean);
      return;
    }
    catch (RemoteException paramz)
    {
      Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
    }
  }
  
  public final boolean d()
  {
    return a;
  }
  
  protected final String f()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  protected final String g()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  public final void h()
  {
    try
    {
      ((ek)l()).a(k.intValue());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
    }
  }
  
  public final void i()
  {
    a(new o.i(this));
  }
  
  protected final Bundle k()
  {
    String str = i.e;
    if (!d.getPackageName().equals(str)) {
      j.putString("com.google.android.gms.signin.internal.realClientPackageName", i.e);
    }
    return j;
  }
}


/* Location:              com/google/android/gms/b/en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */