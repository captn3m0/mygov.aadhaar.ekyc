package com.google.android.gms.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.util.Map;

@qi
public final class os
  extends oy
{
  final Context a;
  String b;
  long c;
  long d;
  String e;
  String f;
  private final Map<String, String> g;
  
  public os(vc paramvc, Map<String, String> paramMap)
  {
    super(paramvc, "createCalendarEvent");
    g = paramMap;
    a = paramvc.f();
    b = c("description");
    e = c("summary");
    c = d("start_ticks");
    d = d("end_ticks");
    f = c("location");
  }
  
  private String c(String paramString)
  {
    if (TextUtils.isEmpty((CharSequence)g.get(paramString))) {
      return "";
    }
    return (String)g.get(paramString);
  }
  
  private long d(String paramString)
  {
    paramString = (String)g.get(paramString);
    if (paramString == null) {
      return -1L;
    }
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException paramString) {}
    return -1L;
  }
}


/* Location:              com/google/android/gms/b/os.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */