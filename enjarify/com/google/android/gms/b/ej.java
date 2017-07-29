package com.google.android.gms.b;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Status;

public abstract interface ej
  extends IInterface
{
  public abstract void a(eq parameq);
  
  public abstract void a(a parama, ee paramee);
  
  public abstract void a(Status paramStatus);
  
  public abstract void a(Status paramStatus, GoogleSignInAccount paramGoogleSignInAccount);
  
  public abstract void b(Status paramStatus);
}


/* Location:              com/google/android/gms/b/ej.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */