package com.google.android.gms.b;

import com.google.android.gms.common.internal.c;
import java.util.LinkedList;

final class nc
{
  final LinkedList a;
  ih b;
  final String c;
  final int d;
  boolean e;
  
  nc(ih paramih, String paramString, int paramInt)
  {
    c.a(paramih);
    c.a(paramString);
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    a = localLinkedList;
    b = paramih;
    c = paramString;
    d = paramInt;
  }
  
  final nc.a a(ih paramih)
  {
    if (paramih != null) {
      b = paramih;
    }
    return (nc.a)a.remove();
  }
}


/* Location:              com/google/android/gms/b/nc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */