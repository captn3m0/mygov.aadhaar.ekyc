package com.google.android.gms.common.internal;

public final class b
{
  public static b.a a(Object paramObject)
  {
    b.a locala = new com/google/android/gms/common/internal/b$a;
    locala.<init>(paramObject, (byte)0);
    return locala;
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */