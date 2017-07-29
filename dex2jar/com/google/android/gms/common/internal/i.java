package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.a.b;

public final class i
{
  private final Resources a;
  private final String b;
  
  public i(Context paramContext)
  {
    c.a(paramContext);
    a = paramContext.getResources();
    b = a.getResourcePackageName(a.b.common_google_play_services_unknown_issue);
  }
  
  public final String a(String paramString)
  {
    int i = a.getIdentifier(paramString, "string", b);
    if (i == 0) {
      return null;
    }
    return a.getString(i);
  }
}


/* Location:              com/google/android/gms/common/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */