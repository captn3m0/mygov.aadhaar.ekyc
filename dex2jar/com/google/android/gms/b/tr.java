package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.concurrent.Future;

@qi
public final class tr
{
  public static Future a(Context paramContext, final boolean paramBoolean)
  {
    (Future)new a(paramContext)
    {
      public final void a()
      {
        SharedPreferences.Editor localEditor = getSharedPreferences("admob", 0).edit();
        localEditor.putBoolean("content_url_opted_out", paramBoolean);
        localEditor.apply();
      }
    }.c();
  }
  
  private static abstract class a
    extends to
  {
    public final void c_() {}
  }
  
  public static abstract interface b
  {
    public abstract void a(Bundle paramBundle);
  }
}


/* Location:              com/google/android/gms/b/tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */