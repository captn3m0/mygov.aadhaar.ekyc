package com.google.android.gms.b;

import java.io.ByteArrayInputStream;

final class ua$b
  extends pc
{
  private final ua.a k;
  private final re.b l;
  
  public ua$b(String paramString, ua.a parama, re.b paramb)
  {
    super(paramString, local1);
    k = parama;
    l = paramb;
  }
  
  protected final re a(na paramna)
  {
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    Object localObject = b;
    localByteArrayInputStream.<init>((byte[])localObject);
    localObject = vx.a(paramna);
    return re.a(localByteArrayInputStream, (dz.a)localObject);
  }
}


/* Location:              com/google/android/gms/b/ua$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */