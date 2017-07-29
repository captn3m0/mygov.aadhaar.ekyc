package org.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.a.a.b;
import org.a.b.d;
import org.a.d.e;
import org.a.e.a;

public class f
  extends j
{
  public f(e parame)
  {
    super(parame);
  }
  
  public final String a(String paramString)
  {
    try
    {
      localObject = paramString.getBytes("UTF-8");
      i = localObject.length;
      paramString = a();
      if (paramString == null) {
        throw new d();
      }
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new org.a.b.c(paramString);
    }
    org.a.d.c localc = (org.a.d.c)paramString.c();
    org.a.d.f localf = localc.j_();
    int i = localc.a(i);
    int j = localf.a();
    paramString.a(localc);
    paramString = ByteBuffer.allocate(i + 5 + j);
    ByteBuffer localByteBuffer2 = ByteBuffer.wrap((byte[])localObject);
    Object localObject = a();
    if (localObject == null) {
      throw new d();
    }
    localc = (org.a.d.c)((k)localObject).c();
    localf = localc.j_();
    localf.b();
    paramString.mark();
    ByteBuffer localByteBuffer1 = paramString.asReadOnlyBuffer();
    ((k)localObject).a(paramString);
    localc.a(paramString);
    localByteBuffer2 = localByteBuffer2.asReadOnlyBuffer();
    while (localByteBuffer2.remaining() > 1024)
    {
      ByteBuffer localByteBuffer3 = localByteBuffer2.slice();
      localByteBuffer3.limit(1024);
      localc.a(localByteBuffer3, paramString);
      localByteBuffer2.position(localByteBuffer2.position() + 1024);
      localByteBuffer1.limit(paramString.position());
      localf.b(localByteBuffer1);
      localByteBuffer1.position(paramString.position());
    }
    localc.b(localByteBuffer2, paramString);
    paramString.limit(paramString.position() + localf.a());
    localByteBuffer1.limit(paramString.position());
    localf.b(localByteBuffer1);
    localf.a_(paramString);
    ((k)localObject).a(localc);
    paramString.reset();
    localObject = new byte[paramString.remaining()];
    paramString.get((byte[])localObject);
    paramString = a.a((byte[])localObject);
    return paramString;
  }
  
  boolean a(b paramb)
  {
    return (paramb == b.b) || (paramb == b.a);
  }
}


/* Location:              org/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */