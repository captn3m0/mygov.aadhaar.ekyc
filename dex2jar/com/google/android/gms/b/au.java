package com.google.android.gms.b;

import java.io.UnsupportedEncodingException;

public class au
  extends pc<String>
{
  private final re.b<String> k;
  
  public au(String paramString, re.b<String> paramb, re.a parama)
  {
    super(paramString, parama);
    k = paramb;
  }
  
  protected final re<String> a(na paramna)
  {
    try
    {
      String str1 = new String(b, vx.a(c, "ISO-8859-1"));
      return re.a(str1, vx.a(paramna));
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str2 = new String(b);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */