package com.google.android.gms.b;

import java.util.Map;

@qi
public final class lx
  implements md
{
  private final ly a;
  
  public lx(ly paramly)
  {
    a = paramly;
  }
  
  public final void a(vc paramvc, Map<String, String> paramMap)
  {
    paramvc = (String)paramMap.get("name");
    if (paramvc == null)
    {
      tp.e("App event with no name parameter.");
      return;
    }
    a.a(paramvc, (String)paramMap.get("info"));
  }
}


/* Location:              com/google/android/gms/b/lx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */