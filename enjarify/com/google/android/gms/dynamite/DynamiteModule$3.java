package com.google.android.gms.dynamite;

import android.content.Context;

final class DynamiteModule$3
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    int i = 1;
    DynamiteModule.b.b localb = new com/google/android/gms/dynamite/DynamiteModule$b$b;
    localb.<init>();
    int j = parama.a(paramContext, paramString);
    a = j;
    j = a;
    if (j != 0)
    {
      j = -1;
      c = j;
    }
    for (;;)
    {
      return localb;
      j = parama.a(paramContext, paramString, i);
      b = j;
      j = b;
      if (j != 0) {
        c = i;
      }
    }
  }
}


/* Location:              com/google/android/gms/dynamite/DynamiteModule$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */