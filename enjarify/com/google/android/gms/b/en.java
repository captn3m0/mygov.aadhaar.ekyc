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
  extends u
  implements ec
{
  private final boolean a;
  private final p i;
  private final Bundle j;
  private Integer k;
  
  public en(Context paramContext, Looper paramLooper, p paramp, c.b paramb, c.c paramc)
  {
    this(paramContext, paramLooper, bool1, paramp, localBundle, paramb, paramc);
  }
  
  public en(Context paramContext, Looper paramLooper, boolean paramBoolean, p paramp, Bundle paramBundle, c.b paramb, c.c paramc)
  {
    super(paramContext, paramLooper, 44, paramp, paramb, paramc);
    a = paramBoolean;
    i = paramp;
    j = paramBundle;
    localObject = h;
    k = ((Integer)localObject);
  }
  
  public final void a(ej paramej)
  {
    Object localObject1 = "Expecting a valid ISignInCallbacks";
    c.a(paramej, localObject1);
    for (;;)
    {
      try
      {
        localObject1 = i;
        localObject2 = a;
        if (localObject2 != null)
        {
          localObject1 = a;
          localObject2 = localObject1;
          localObject1 = null;
          localObject3 = "<<default account>>";
          Object localObject4 = name;
          boolean bool = ((String)localObject3).equals(localObject4);
          if (bool)
          {
            localObject1 = d;
            localObject1 = com.google.android.gms.auth.api.signin.a.d.a((Context)localObject1);
            localObject3 = "defaultGoogleSignInAccount";
            localObject3 = ((com.google.android.gms.auth.api.signin.a.d)localObject1).c((String)localObject3);
            localObject1 = ((com.google.android.gms.auth.api.signin.a.d)localObject1).a((String)localObject3);
          }
          localObject3 = new com/google/android/gms/common/internal/d;
          localObject4 = k;
          int m = ((Integer)localObject4).intValue();
          ((com.google.android.gms.common.internal.d)localObject3).<init>((Account)localObject2, m, (GoogleSignInAccount)localObject1);
          localObject1 = l();
          localObject1 = (ek)localObject1;
          localObject2 = new com/google/android/gms/b/eo;
          ((eo)localObject2).<init>((com.google.android.gms.common.internal.d)localObject3);
          ((ek)localObject1).a((eo)localObject2, paramej);
          return;
        }
      }
      catch (RemoteException localRemoteException1)
      {
        Object localObject2 = "SignInClientImpl";
        Object localObject3 = "Remote service probably died when signIn is called";
        Log.w((String)localObject2, (String)localObject3);
        try
        {
          localObject2 = new com/google/android/gms/b/eq;
          ((eq)localObject2).<init>();
          paramej.a((eq)localObject2);
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "SignInClientImpl";
          localObject3 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.";
          Log.wtf(str, (String)localObject3, localRemoteException1);
        }
        continue;
      }
      localObject1 = new android/accounts/Account;
      localObject2 = "<<default account>>";
      localObject3 = "com.google";
      ((Account)localObject1).<init>((String)localObject2, (String)localObject3);
      localObject2 = localObject1;
    }
  }
  
  public final void a(z paramz, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = l();
      localObject1 = (ek)localObject1;
      localObject2 = k;
      int m = ((Integer)localObject2).intValue();
      ((ek)localObject1).a(paramz, m, paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "SignInClientImpl";
        Object localObject2 = "Remote service probably died when saveDefaultAccount is called";
        Log.w(str, (String)localObject2);
      }
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
      Object localObject1 = l();
      localObject1 = (ek)localObject1;
      localObject2 = k;
      int m = ((Integer)localObject2).intValue();
      ((ek)localObject1).a(m);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "SignInClientImpl";
        Object localObject2 = "Remote service probably died when clearAccountFromSessionStore is called";
        Log.w(str, (String)localObject2);
      }
    }
  }
  
  public final void i()
  {
    o.i locali = new com/google/android/gms/common/internal/o$i;
    locali.<init>(this);
    a(locali);
  }
  
  protected final Bundle k()
  {
    Object localObject = i.e;
    String str1 = d.getPackageName();
    boolean bool = str1.equals(localObject);
    if (!bool)
    {
      localObject = j;
      str1 = "com.google.android.gms.signin.internal.realClientPackageName";
      String str2 = i.e;
      ((Bundle)localObject).putString(str1, str2);
    }
    return j;
  }
}


/* Location:              com/google/android/gms/b/en.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */