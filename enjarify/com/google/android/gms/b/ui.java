package com.google.android.gms.b;

public final class ui
{
  private static ui b = null;
  String a;
  
  public static ui a()
  {
    ui localui = b;
    if (localui == null)
    {
      localui = new com/google/android/gms/b/ui;
      localui.<init>();
      b = localui;
    }
    return b;
  }
}


/* Location:              com/google/android/gms/b/ui.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */