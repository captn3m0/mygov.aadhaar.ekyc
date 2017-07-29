package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.g.a;
import java.security.KeyPair;
import java.util.Map;

public final class d
{
  static Map a;
  static h c;
  static String f;
  private static f g;
  Context b;
  KeyPair d;
  String e = "";
  
  static
  {
    a locala = new android/support/v4/g/a;
    locala.<init>();
    a = locala;
  }
  
  private d(Context paramContext, String paramString)
  {
    Context localContext = paramContext.getApplicationContext();
    b = localContext;
    e = paramString;
  }
  
  public static d a(Context paramContext, Bundle paramBundle)
  {
    Class localClass = d.class;
    Object localObject1;
    if (paramBundle == null)
    {
      localObject1 = "";
      if (localObject1 != null) {
        break label152;
      }
      localObject1 = "";
    }
    label152:
    for (Object localObject3 = localObject1;; localObject3 = localObject2)
    {
      try
      {
        Object localObject4 = paramContext.getApplicationContext();
        localObject1 = c;
        if (localObject1 == null)
        {
          localObject1 = new com/google/firebase/iid/h;
          ((h)localObject1).<init>((Context)localObject4);
          c = (h)localObject1;
          localObject1 = new com/google/firebase/iid/f;
          ((f)localObject1).<init>((Context)localObject4);
          g = (f)localObject1;
        }
        int i = FirebaseInstanceId.a((Context)localObject4);
        localObject1 = Integer.toString(i);
        f = (String)localObject1;
        localObject1 = a;
        localObject1 = ((Map)localObject1).get(localObject3);
        localObject1 = (d)localObject1;
        if (localObject1 == null)
        {
          localObject1 = new com/google/firebase/iid/d;
          ((d)localObject1).<init>((Context)localObject4, (String)localObject3);
          localObject4 = a;
          ((Map)localObject4).put(localObject3, localObject1);
        }
        return (d)localObject1;
      }
      finally {}
      localObject1 = "subtype";
      localObject1 = paramBundle.getString((String)localObject1);
      break;
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
    if (paramString2 != null)
    {
      localObject1 = "scope";
      paramBundle.putString((String)localObject1, paramString2);
    }
    paramBundle.putString("sender", paramString1);
    Object localObject1 = "";
    Object localObject2 = e;
    boolean bool1 = ((String)localObject1).equals(localObject2);
    if (bool1) {}
    for (;;)
    {
      paramBundle.putString("subtype", paramString1);
      paramBundle.putString("X-subtype", paramString1);
      localObject2 = g;
      KeyPair localKeyPair = a();
      localObject1 = ((f)localObject2).a(paramBundle, localKeyPair);
      if (localObject1 != null)
      {
        String str = "google.messenger";
        boolean bool2 = ((Intent)localObject1).hasExtra(str);
        if (bool2)
        {
          localObject1 = ((f)localObject2).a(paramBundle, localKeyPair);
          if (localObject1 != null)
          {
            localObject2 = "google.messenger";
            boolean bool3 = ((Intent)localObject1).hasExtra((String)localObject2);
            if (bool3)
            {
              bool1 = false;
              localObject1 = null;
            }
          }
        }
      }
      return f.a((Intent)localObject1);
      paramString1 = e;
    }
  }
  
  public final KeyPair a()
  {
    Object localObject = d;
    String str;
    if (localObject == null)
    {
      localObject = c;
      str = e;
      localObject = ((h)localObject).d(str);
      d = ((KeyPair)localObject);
    }
    localObject = d;
    if (localObject == null)
    {
      localObject = c;
      str = e;
      localObject = ((h)localObject).a(str);
      d = ((KeyPair)localObject);
    }
    return d;
  }
  
  public final void b()
  {
    h localh = c;
    String str = e;
    localh.b(str);
    d = null;
  }
}


/* Location:              com/google/firebase/iid/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */