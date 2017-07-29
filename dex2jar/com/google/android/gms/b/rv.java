package com.google.android.gms.b;

import com.google.android.gms.common.internal.b;

@qi
public final class rv
  extends ry.a
{
  private final String a;
  private final int b;
  
  public rv(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof rv))) {}
    do
    {
      return false;
      paramObject = (rv)paramObject;
    } while ((!b.a(a(), ((rv)paramObject).a())) || (!b.a(Integer.valueOf(b()), Integer.valueOf(((rv)paramObject).b()))));
    return true;
  }
}


/* Location:              com/google/android/gms/b/rv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */