package com.google.android.gms.b;

import java.util.Map;
import org.json.JSONObject;

@qi
public final class gy
  implements ha
{
  final gw a;
  private final nk b;
  private final md c = new md()
  {
    public final void a(vc paramAnonymousvc, Map<String, String> paramAnonymousMap)
    {
      a.c();
    }
  };
  private final md d = new md()
  {
    public final void a(vc paramAnonymousvc, Map<String, String> paramAnonymousMap)
    {
      a.a(gy.this);
    }
  };
  private final md e = new md()
  {
    public final void a(vc paramAnonymousvc, Map<String, String> paramAnonymousMap)
    {
      a.b(paramAnonymousMap);
    }
  };
  
  public gy(gw paramgw, nk paramnk)
  {
    a = paramgw;
    b = paramnk;
    paramgw = b;
    paramgw.a("/updateActiveView", c);
    paramgw.a("/untrackActiveViewUnit", d);
    paramgw.a("/visibilityChanged", e);
    paramgw = String.valueOf(a.g().c);
    if (paramgw.length() != 0) {}
    for (paramgw = "Custom JS tracking ad unit: ".concat(paramgw);; paramgw = new String("Custom JS tracking ad unit: "))
    {
      tp.b(paramgw);
      return;
    }
  }
  
  public final void a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      b.a("AFMA_updateActiveView", paramJSONObject);
      return;
    }
    a.c(this);
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final void b()
  {
    nk localnk = b;
    localnk.b("/visibilityChanged", e);
    localnk.b("/untrackActiveViewUnit", d);
    localnk.b("/updateActiveView", c);
  }
}


/* Location:              com/google/android/gms/b/gy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */