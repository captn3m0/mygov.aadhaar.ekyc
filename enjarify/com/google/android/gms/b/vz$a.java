package com.google.android.gms.b;

import com.google.android.gms.common.util.c;
import java.util.ArrayList;
import java.util.TimeZone;

public final class vz$a
{
  int a;
  String b;
  String c;
  String d;
  int e;
  final vz.c f;
  boolean g;
  final gf.d h;
  boolean i;
  private ArrayList k;
  private ArrayList l;
  private ArrayList m;
  private ArrayList n;
  
  private vz$a(vz paramvz, byte[] paramArrayOfByte)
  {
    this(paramvz, paramArrayOfByte, (byte)0);
  }
  
  private vz$a(vz paramvz, byte[] paramArrayOfByte, byte paramByte)
  {
    int i1 = vz.a(j);
    a = i1;
    Object localObject = vz.b(j);
    b = ((String)localObject);
    localObject = vz.c(j);
    c = ((String)localObject);
    localObject = vz.d(j);
    d = ((String)localObject);
    i1 = vz.a();
    e = i1;
    k = null;
    l = null;
    m = null;
    n = null;
    g = true;
    localObject = new com/google/android/gms/b/gf$d;
    ((gf.d)localObject).<init>();
    h = ((gf.d)localObject);
    i1 = 0;
    i = false;
    localObject = vz.c(paramvz);
    c = ((String)localObject);
    localObject = vz.d(paramvz);
    d = ((String)localObject);
    localObject = h;
    long l1 = vz.e(paramvz).a();
    a = l1;
    localObject = h;
    l1 = vz.e(paramvz).b();
    b = l1;
    localObject = h;
    vz.f(paramvz);
    l1 = h.a;
    TimeZone localTimeZone = TimeZone.getDefault();
    int i2 = localTimeZone.getOffset(l1) / 1000;
    l1 = i2;
    p = l1;
    if (paramArrayOfByte != null)
    {
      localObject = h;
      k = paramArrayOfByte;
    }
    f = null;
  }
}


/* Location:              com/google/android/gms/b/vz$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */