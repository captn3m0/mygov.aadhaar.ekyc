package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.ads.internal.w;

@qi
public final class tm
{
  public final Object a = new Object();
  public int b;
  public int c;
  public final tj d;
  public final String e;
  
  private tm(tj paramtj, String paramString)
  {
    d = paramtj;
    e = paramString;
  }
  
  public tm(String paramString)
  {
    this(w.i(), paramString);
  }
  
  public final Bundle a()
  {
    synchronized (a)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("pmnli", b);
      localBundle.putInt("pmnll", c);
      return localBundle;
    }
  }
}


/* Location:              com/google/android/gms/b/tm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */