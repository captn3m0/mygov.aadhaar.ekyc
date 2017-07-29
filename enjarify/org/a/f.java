package org.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.a.a.b;
import org.a.b.d;
import org.a.d.e;
import org.a.d.g;
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
    int i = 1024;
    Object localObject1 = "UTF-8";
    try
    {
      localObject3 = paramString.getBytes((String)localObject1);
      j = localObject3.length;
      localk = a();
      if (localk == null)
      {
        localObject1 = new org/a/b/d;
        ((d)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localObject3 = new org/a/b/c;
      ((org.a.b.c)localObject3).<init>(localUnsupportedEncodingException);
      throw ((Throwable)localObject3);
    }
    Object localObject2 = localk.c();
    localObject2 = (org.a.d.c)localObject2;
    org.a.d.f localf = ((org.a.d.c)localObject2).j_();
    int j = ((org.a.d.c)localObject2).a(j) + 5;
    int k = localf.a();
    j += k;
    localk.a((g)localObject2);
    ByteBuffer localByteBuffer1 = ByteBuffer.allocate(j);
    Object localObject3 = ByteBuffer.wrap((byte[])localObject3);
    k localk = a();
    if (localk == null)
    {
      localObject2 = new org/a/b/d;
      ((d)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
    localObject2 = localk.c();
    localObject2 = (org.a.d.c)localObject2;
    localf = ((org.a.d.c)localObject2).j_();
    localf.b();
    localByteBuffer1.mark();
    ByteBuffer localByteBuffer2 = localByteBuffer1.asReadOnlyBuffer();
    localk.a(localByteBuffer1);
    ((org.a.d.c)localObject2).a(localByteBuffer1);
    localObject3 = ((ByteBuffer)localObject3).asReadOnlyBuffer();
    for (;;)
    {
      m = ((ByteBuffer)localObject3).remaining();
      if (m <= i) {
        break;
      }
      ByteBuffer localByteBuffer3 = ((ByteBuffer)localObject3).slice();
      int n = 1024;
      localByteBuffer3.limit(n);
      ((org.a.d.c)localObject2).a(localByteBuffer3, localByteBuffer1);
      m = ((ByteBuffer)localObject3).position() + 1024;
      ((ByteBuffer)localObject3).position(m);
      m = localByteBuffer1.position();
      localByteBuffer2.limit(m);
      localf.b(localByteBuffer2);
      m = localByteBuffer1.position();
      localByteBuffer2.position(m);
    }
    ((org.a.d.c)localObject2).b((ByteBuffer)localObject3, localByteBuffer1);
    int i1 = localByteBuffer1.position();
    int m = localf.a();
    i1 += m;
    localByteBuffer1.limit(i1);
    i1 = localByteBuffer1.position();
    localByteBuffer2.limit(i1);
    localf.b(localByteBuffer2);
    localf.a_(localByteBuffer1);
    localk.a((g)localObject2);
    localByteBuffer1.reset();
    int i2 = localByteBuffer1.remaining();
    localObject2 = new byte[i2];
    localByteBuffer1.get((byte[])localObject2);
    return a.a((byte[])localObject2);
  }
  
  boolean a(b paramb)
  {
    b localb = b.b;
    boolean bool;
    if (paramb != localb)
    {
      localb = b.a;
      if (paramb != localb) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localb = null;
    }
  }
}


/* Location:              org/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */