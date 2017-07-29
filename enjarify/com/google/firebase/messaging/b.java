package com.google.firebase.messaging;

import java.util.Locale;

public final class b
  extends Exception
{
  private final int a;
  
  b(String paramString)
  {
    super(paramString);
    Locale localLocale;
    String str1;
    int n;
    int i1;
    if (paramString != null)
    {
      localLocale = Locale.US;
      str1 = paramString.toLowerCase(localLocale);
      n = -1;
      i1 = str1.hashCode();
    }
    switch (i1)
    {
    default: 
      switch (n)
      {
      default: 
        m = 0;
      }
      break;
    }
    for (;;)
    {
      a = m;
      return;
      String str2 = "invalid_parameters";
      boolean bool = str1.equals(str2);
      if (!bool) {
        break;
      }
      n = 0;
      localLocale = null;
      break;
      str2 = "missing_to";
      bool = str1.equals(str2);
      if (!bool) {
        break;
      }
      n = m;
      break;
      str2 = "messagetoobig";
      bool = str1.equals(str2);
      if (!bool) {
        break;
      }
      n = k;
      break;
      str2 = "service_not_available";
      bool = str1.equals(str2);
      if (!bool) {
        break;
      }
      n = j;
      break;
      str2 = "toomanymessages";
      bool = str1.equals(str2);
      if (!bool) {
        break;
      }
      n = i;
      break;
      m = k;
      continue;
      m = j;
      continue;
      m = i;
    }
  }
}


/* Location:              com/google/firebase/messaging/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */