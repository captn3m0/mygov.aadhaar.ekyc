package com.google.android.gms.b;

import android.graphics.Color;
import java.util.List;

public final class kt
{
  static final int a;
  static final int b = k;
  private static final int k;
  private static final int l;
  final String c;
  final List d;
  final int e;
  final int f;
  final int g;
  final int h;
  final int i;
  final boolean j;
  
  static
  {
    int m = 204;
    k = Color.rgb(12, 174, 206);
    int n = Color.rgb(m, m, m);
    l = n;
    a = n;
  }
  
  public kt(String paramString, List paramList, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    c = paramString;
    d = paramList;
    if (paramInteger1 != null)
    {
      m = paramInteger1.intValue();
      e = m;
      if (paramInteger2 == null) {
        break label93;
      }
      m = paramInteger2.intValue();
      label42:
      f = m;
      if (paramInteger3 == null) {
        break label101;
      }
    }
    label93:
    label101:
    for (int m = paramInteger3.intValue();; m = 12)
    {
      g = m;
      h = paramInt1;
      i = paramInt2;
      j = paramBoolean;
      return;
      m = a;
      break;
      m = b;
      break label42;
    }
  }
}


/* Location:              com/google/android/gms/b/kt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */