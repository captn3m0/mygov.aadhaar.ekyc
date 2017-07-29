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
  private static final Lock a = new ReentrantLock();
  private static d b;
  private final Lock c = new ReentrantLock();
  private final SharedPreferences d;
  
  private d(Context paramContext)
  {
    d = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  public static d a(Context paramContext)
  {
    c.a(paramContext);
    a.lock();
    try
    {
      if (b == null) {
        b = new d(paramContext.getApplicationContext());
      }
      paramContext = b;
      return paramContext;
    }
    finally
    {
      a.unlock();
    }
  }
  
  private static String a(String paramString1, String paramString2)
  {
    String str = String.valueOf(":");
    return String.valueOf(paramString1).length() + String.valueOf(str).length() + String.valueOf(paramString2).length() + paramString1 + str + paramString2;
  }
  
  public final GoogleSignInAccount a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return null;
      paramString = c(a("googleSignInAccount", paramString));
    } while (paramString == null);
    try
    {
      paramString = GoogleSignInAccount.a(paramString);
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  public final GoogleSignInOptions b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return null;
      paramString = c(a("googleSignInOptions", paramString));
    } while (paramString == null);
    try
    {
      paramString = GoogleSignInOptions.a(paramString);
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  public final String c(String paramString)
  {
    c.lock();
    try
    {
      paramString = d.getString(paramString, null);
      return paramString;
    }
    finally
    {
      c.unlock();
    }
  }
}


/* Location:              com/google/android/gms/auth/api/signin/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */