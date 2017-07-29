package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

public final class os
  extends oy
{
  final Context a;
  String b;
  long c;
  long d;
  String e;
  String f;
  private final Map g;
  
  public os(vc paramvc, Map paramMap)
  {
    super(paramvc, "createCalendarEvent");
    g = paramMap;
    Object localObject = paramvc.f();
    a = ((Context)localObject);
    localObject = c("description");
    b = ((String)localObject);
    localObject = c("summary");
    e = ((String)localObject);
    long l = d("start_ticks");
    c = l;
    l = d("end_ticks");
    d = l;
    localObject = c("location");
    f = ((String)localObject);
  }
  
  private String c(String paramString)
  {
    Object localObject = (CharSequence)g.get(paramString);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool) {}
    for (localObject = "";; localObject = (String)g.get(paramString)) {
      return (String)localObject;
    }
  }
  
  private long d(String paramString)
  {
    long l1 = -1;
    String str = (String)g.get(paramString);
    long l2;
    if (str == null) {
      l2 = l1;
    }
    for (;;)
    {
      return l2;
      try
      {
        l2 = Long.parseLong(str);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        l2 = l1;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/os.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */