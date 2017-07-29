package com.google.android.gms.b;

import android.os.Bundle;

public final class tm
{
  public final Object a;
  public int b;
  public int c;
  public final tj d;
  public final String e;
  
  private tm(tj paramtj, String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    d = paramtj;
    e = paramString;
  }
  
  public tm(String paramString)
  {
    this(localtj, paramString);
  }
  
  public final Bundle a()
  {
    synchronized (a)
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      String str = "pmnli";
      int i = b;
      localBundle.putInt(str, i);
      str = "pmnll";
      i = c;
      localBundle.putInt(str, i);
      return localBundle;
    }
  }
}


/* Location:              com/google/android/gms/b/tm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */