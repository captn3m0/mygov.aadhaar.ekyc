package com.google.android.gms.auth.api.signin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.c;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public final class d
{
  private static final Lock a;
  private static d b;
  private final Lock c;
  private final SharedPreferences d;
  
  static
  {
    ReentrantLock localReentrantLock = new java/util/concurrent/locks/ReentrantLock;
    localReentrantLock.<init>();
    a = localReentrantLock;
  }
  
  private d(Context paramContext)
  {
    Object localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    c = ((Lock)localObject);
    localObject = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
    d = ((SharedPreferences)localObject);
  }
  
  public static d a(Context paramContext)
  {
    c.a(paramContext);
    Object localObject1 = a;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = b;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/auth/api/signin/a/d;
        Context localContext = paramContext.getApplicationContext();
        ((d)localObject1).<init>(localContext);
        b = (d)localObject1;
      }
      localObject1 = b;
      return (d)localObject1;
    }
    finally
    {
      a.unlock();
    }
  }
  
  private static String a(String paramString1, String paramString2)
  {
    String str = String.valueOf(":");
    int i = String.valueOf(paramString1).length();
    int j = String.valueOf(str).length();
    i += j;
    j = String.valueOf(paramString2).length();
    i += j;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    return paramString1 + str + paramString2;
  }
  
  public final GoogleSignInAccount a(String paramString)
  {
    GoogleSignInAccount localGoogleSignInAccount = null;
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return localGoogleSignInAccount;
      String str = a("googleSignInAccount", paramString);
      str = c(str);
      if (str != null) {
        try
        {
          localGoogleSignInAccount = GoogleSignInAccount.a(str);
        }
        catch (JSONException localJSONException) {}
      }
    }
  }
  
  public final GoogleSignInOptions b(String paramString)
  {
    GoogleSignInOptions localGoogleSignInOptions = null;
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return localGoogleSignInOptions;
      String str = a("googleSignInOptions", paramString);
      str = c(str);
      if (str != null) {
        try
        {
          localGoogleSignInOptions = GoogleSignInOptions.a(str);
        }
        catch (JSONException localJSONException) {}
      }
    }
  }
  
  public final String c(String paramString)
  {
    Object localObject1 = c;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = d;
      localObject1 = ((SharedPreferences)localObject1).getString(paramString, null);
      return (String)localObject1;
    }
    finally
    {
      c.unlock();
    }
  }
}


/* Location:              com/google/android/gms/auth/api/signin/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */