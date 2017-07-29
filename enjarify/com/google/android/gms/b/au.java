package com.google.android.gms.b;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class au
  extends pc
{
  private final re.b k;
  
  public au(String paramString, re.b paramb, re.a parama)
  {
    super(paramString, parama);
    k = paramb;
  }
  
  protected final re a(na paramna)
  {
    try
    {
      str1 = new java/lang/String;
      localObject1 = b;
      Object localObject2 = c;
      String str3 = "ISO-8859-1";
      localObject2 = vx.a((Map)localObject2, str3);
      str1.<init>((byte[])localObject1, (String)localObject2);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str1;
        String str2 = new java/lang/String;
        Object localObject1 = b;
        str2.<init>((byte[])localObject1);
      }
    }
    localObject1 = vx.a(paramna);
    return re.a(str1, (dz.a)localObject1);
  }
}


/* Location:              com/google/android/gms/b/au.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */