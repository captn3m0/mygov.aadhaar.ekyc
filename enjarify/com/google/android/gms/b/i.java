package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.c;

public final class i
  implements c.b, c.c
{
  public final com.google.android.gms.common.api.a a;
  j b;
  private final boolean c;
  
  public i(com.google.android.gms.common.api.a parama, boolean paramBoolean)
  {
    a = parama;
    c = paramBoolean;
  }
  
  private void a()
  {
    c.a(b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
  }
  
  public final void a(int paramInt)
  {
    a();
    b.a(paramInt);
  }
  
  public final void a(Bundle paramBundle)
  {
    a();
    b.a(paramBundle);
  }
  
  public final void a(com.google.android.gms.common.a parama)
  {
    a();
    j localj = b;
    com.google.android.gms.common.api.a locala = a;
    boolean bool = c;
    localj.a(parama, locala, bool);
  }
}


/* Location:              com/google/android/gms/b/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */