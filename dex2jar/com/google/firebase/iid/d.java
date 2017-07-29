package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.g.a;
import java.security.KeyPair;
import java.util.Map;

public final class d
{
  static Map<String, d> a = new a();
  static h c;
  static String f;
  private static f g;
  Context b;
  KeyPair d;
  String e = "";
  
  private d(Context paramContext, String paramString)
  {
    b = paramContext.getApplicationContext();
    e = paramString;
  }
  
  public static d a(Context paramContext, Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramBundle = "";
    }
    for (;;)
    {
      try
      {
        Context localContext = paramContext.getApplicationContext();
        if (c == null)
        {
          c = new h(localContext);
          g = new f(localContext);
        }
        f = Integer.toString(FirebaseInstanceId.a(localContext));
        d locald = (d)a.get(paramBundle);
        paramContext = locald;
        if (locald == null)
        {
          paramContext = new d(localContext, paramBundle);
          a.put(paramBundle, paramContext);
        }
        return paramContext;
      }
      finally {}
      paramBundle = paramBundle.getString("subtype");
      while (paramBundle != null) {
        break;
      }
      paramBundle = "";
    }
  }
  
  public static h c()
  {
    return c;
  }
  
  public static f d()
  {
    return g;
  }
  
  public final String a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramString2 != null) {
      paramBundle.putString("scope", paramString2);
    }
    paramBundle.putString("sender", paramString1);
    if ("".equals(e)) {}
    for (;;)
    {
      paramBundle.putString("subtype", paramString1);
      paramBundle.putString("X-subtype", paramString1);
      f localf = g;
      KeyPair localKeyPair = a();
      paramString2 = localf.a(paramBundle, localKeyPair);
      paramString1 = paramString2;
      if (paramString2 != null)
      {
        paramString1 = paramString2;
        if (paramString2.hasExtra("google.messenger"))
        {
          paramString2 = localf.a(paramBundle, localKeyPair);
          paramString1 = paramString2;
          if (paramString2 != null)
          {
            paramString1 = paramString2;
            if (paramString2.hasExtra("google.messenger")) {
              paramString1 = null;
            }
          }
        }
      }
      return f.a(paramString1);
      paramString1 = e;
    }
  }
  
  public final KeyPair a()
  {
    if (d == null) {
      d = c.d(e);
    }
    if (d == null) {
      d = c.a(e);
    }
    return d;
  }
  
  public final void b()
  {
    c.b(e);
    d = null;
  }
}


/* Location:              com/google/firebase/iid/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */