package com.google.android.gms.b;

import java.util.Map;

@qi
public final class mg
  implements md
{
  private final mh a;
  
  public mg(mh parammh)
  {
    a = parammh;
  }
  
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    boolean bool1 = "1".equals(paramMap.get("transparentBackground"));
    boolean bool2 = "1".equals(paramMap.get("blur"));
    try
    {
      if (paramMap.get("blurRadius") != null)
      {
        f = Float.parseFloat((String)paramMap.get("blurRadius"));
        a.b(bool1);
        a.a(bool2, f);
        return;
      }
    }
    catch (NumberFormatException paramvc)
    {
      for (;;)
      {
        tp.b("Fail to parse float", paramvc);
        float f = 0.0F;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/mg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */