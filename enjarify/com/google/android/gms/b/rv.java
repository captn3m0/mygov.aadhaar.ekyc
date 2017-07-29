package com.google.android.gms.b;

import com.google.android.gms.common.internal.b;

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
    boolean bool1 = false;
    boolean bool2;
    if (paramObject != null)
    {
      bool2 = paramObject instanceof rv;
      if (bool2) {
        break label17;
      }
    }
    for (;;)
    {
      return bool1;
      label17:
      paramObject = (rv)paramObject;
      Object localObject1 = a();
      Object localObject2 = ((rv)paramObject).a();
      bool2 = b.a(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = Integer.valueOf(b());
        int i = ((rv)paramObject).b();
        localObject2 = Integer.valueOf(i);
        bool2 = b.a(localObject1, localObject2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/rv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */