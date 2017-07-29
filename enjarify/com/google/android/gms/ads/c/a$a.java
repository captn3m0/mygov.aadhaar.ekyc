package com.google.android.gms.ads.c;

public final class a$a
{
  public final String a;
  public final boolean b;
  
  public a$a(String paramString, boolean paramBoolean)
  {
    a = paramString;
    b = paramBoolean;
  }
  
  public final String toString()
  {
    String str = a;
    boolean bool = b;
    int i = String.valueOf(str).length() + 7;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    return "{" + str + "}" + bool;
  }
}


/* Location:              com/google/android/gms/ads/c/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */