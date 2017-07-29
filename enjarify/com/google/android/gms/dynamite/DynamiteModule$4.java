package com.google.android.gms.dynamite;

import android.content.Context;

final class DynamiteModule$4
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    int i = 1;
    DynamiteModule.b.b localb = new com/google/android/gms/dynamite/DynamiteModule$b$b;
    localb.<init>();
    int j = parama.a(paramContext, paramString);
    a = j;
    j = parama.a(paramContext, paramString, i);
    b = j;
    j = a;
    if (j == 0)
    {
      j = b;
      if (j == 0)
      {
        j = 0;
        c = 0;
      }
    }
    for (;;)
    {
      return localb;
      j = a;
      int k = b;
      if (j >= k)
      {
        j = -1;
        c = j;
      }
      else
      {
        c = i;
      }
    }
  }
}


/* Location:              com/google/android/gms/dynamite/DynamiteModule$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */