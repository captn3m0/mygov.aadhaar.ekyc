package com.google.android.gms.dynamite;

import android.content.Context;

final class DynamiteModule$6
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
  {
    int i = 1;
    int j = 0;
    DynamiteModule.b.b localb = new com/google/android/gms/dynamite/DynamiteModule$b$b;
    localb.<init>();
    int k = parama.a(paramContext, paramString);
    a = k;
    k = a;
    if (k != 0)
    {
      k = parama.a(paramContext, paramString, false);
      b = k;
      k = a;
      if (k != 0) {
        break label118;
      }
      k = b;
      if (k != 0) {
        break label118;
      }
      c = 0;
    }
    for (;;)
    {
      return localb;
      k = parama.a(paramContext, paramString, i);
      b = k;
      break;
      label118:
      k = b;
      j = a;
      if (k >= j)
      {
        c = i;
      }
      else
      {
        k = -1;
        c = k;
      }
    }
  }
}


/* Location:              com/google/android/gms/dynamite/DynamiteModule$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */