package com.google.firebase;

import com.google.android.gms.common.internal.b.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.k;
import java.util.Arrays;

public final class b
{
  public final String a;
  public final String b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  
  b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    if (!k.a(paramString1)) {}
    for (boolean bool = true;; bool = false)
    {
      c.a(bool, "ApplicationId must be set.");
      a = paramString1;
      c = paramString2;
      d = paramString3;
      e = paramString4;
      b = paramString5;
      f = paramString6;
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {}
    do
    {
      return false;
      paramObject = (b)paramObject;
    } while ((!com.google.android.gms.common.internal.b.a(a, a)) || (!com.google.android.gms.common.internal.b.a(c, c)) || (!com.google.android.gms.common.internal.b.a(d, d)) || (!com.google.android.gms.common.internal.b.a(e, e)) || (!com.google.android.gms.common.internal.b.a(b, b)) || (!com.google.android.gms.common.internal.b.a(f, f)));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, c, d, e, b, f });
  }
  
  public final String toString()
  {
    return com.google.android.gms.common.internal.b.a(this).a("applicationId", a).a("apiKey", c).a("databaseUrl", d).a("gcmSenderId", b).a("storageBucket", f).toString();
  }
}


/* Location:              com/google/firebase/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */