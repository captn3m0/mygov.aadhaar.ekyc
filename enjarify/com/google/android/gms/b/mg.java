package com.google.android.gms.b;

import java.util.Map;

public final class mg
  implements md
{
  private final mh a;
  
  public mg(mh parammh)
  {
    a = parammh;
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    Object localObject1 = paramMap.get("transparentBackground");
    boolean bool1 = "1".equals(localObject1);
    localObject1 = paramMap.get("blur");
    boolean bool2 = "1".equals(localObject1);
    localObject1 = null;
    Object localObject2 = "blurRadius";
    try
    {
      localObject2 = paramMap.get(localObject2);
      if (localObject2 == null) {
        break label121;
      }
      localObject2 = "blurRadius";
      localObject2 = paramMap.get(localObject2);
      localObject2 = (String)localObject2;
      f = Float.parseFloat((String)localObject2);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str = "Fail to parse float";
        tp.b(str, localNumberFormatException);
        Object localObject3 = null;
        float f = 0.0F;
      }
    }
    a.b(bool1);
    a.a(bool2, f);
  }
}


/* Location:              com/google/android/gms/b/mg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */