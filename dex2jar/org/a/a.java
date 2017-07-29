package org.a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.a.b.e;
import org.a.d.f;
import org.a.e.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends k
{
  private static final c a = c.a;
  private static final org.a.a.a b = org.a.a.a.a;
  private SecretKey c;
  private final String d;
  private final g h;
  private final org.a.a.a i;
  private final byte[] j = new byte[4];
  
  private a(int paramInt, String paramString, g paramg, org.a.a.a parama)
  {
    super(paramInt);
    d = paramString;
    h = paramg;
    i = parama;
  }
  
  static a a(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      paramString = new a(paramString.getInt("size"), paramString.getString("aesKeyString"), g.a(paramString.getJSONObject("hmacKey")), (org.a.a.a)b.a(org.a.a.a.class, paramString.getString("mode")));
      h.e();
      byte[] arrayOfByte2 = org.a.e.a.a(d);
      c = new SecretKeySpec(arrayOfByte2, "AES");
      byte[] arrayOfByte1 = b.b(new byte[][] { b.a(arrayOfByte2.length), arrayOfByte2, h.f() });
      byte[] arrayOfByte3;
      if (arrayOfByte2.length != 16)
      {
        arrayOfByte3 = b.b(new byte[][] { b.a(16), arrayOfByte2, h.f() });
        byte[] arrayOfByte4 = new byte[4];
        System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 0, 4);
        f.add(arrayOfByte4);
      }
      if (arrayOfByte2[0] == 0)
      {
        arrayOfByte2 = b.a(arrayOfByte2);
        arrayOfByte2 = b.b(new byte[][] { b.a(arrayOfByte2.length), arrayOfByte2, h.f() });
        arrayOfByte3 = new byte[4];
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, 4);
        f.add(arrayOfByte3);
      }
      System.arraycopy(arrayOfByte1, 0, j, 0, j.length);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  protected final byte[] a()
  {
    return j;
  }
  
  /* Error */
  final JSONObject b()
  {
    // Byte code:
    //   0: new 52	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 143	org/json/JSONObject:<init>	()V
    //   7: ldc 57
    //   9: aload_0
    //   10: getfield 146	org/a/a:e	I
    //   13: invokevirtual 150	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   16: ldc 63
    //   18: aload_0
    //   19: getfield 42	org/a/a:d	Ljava/lang/String;
    //   22: invokevirtual 153	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   25: astore_2
    //   26: aload_0
    //   27: getfield 44	org/a/a:h	Lorg/a/g;
    //   30: ifnull +33 -> 63
    //   33: aload_0
    //   34: getfield 44	org/a/a:h	Lorg/a/g;
    //   37: invokevirtual 155	org/a/g:b	()Lorg/json/JSONObject;
    //   40: astore_1
    //   41: aload_2
    //   42: ldc 69
    //   44: aload_1
    //   45: invokevirtual 153	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   48: ldc 80
    //   50: aload_0
    //   51: getfield 46	org/a/a:i	Lorg/a/a/a;
    //   54: invokevirtual 159	org/a/a/a:name	()Ljava/lang/String;
    //   57: invokevirtual 153	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   60: astore_1
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -24 -> 41
    //   68: astore_1
    //   69: new 135	java/lang/RuntimeException
    //   72: dup
    //   73: aload_1
    //   74: invokespecial 138	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	a
    //   40	25	1	localJSONObject1	JSONObject
    //   68	6	1	localJSONException	JSONException
    //   25	17	2	localJSONObject2	JSONObject
    // Exception table:
    //   from	to	target	type
    //   0	41	68	org/json/JSONException
    //   41	61	68	org/json/JSONException
  }
  
  protected final org.a.d.g c()
  {
    org.a.d.g localg = (org.a.d.g)g.poll();
    if (localg != null) {
      return localg;
    }
    return new a();
  }
  
  private final class a
    implements org.a.d.a, org.a.d.c
  {
    boolean a = false;
    private final Cipher c;
    private final Cipher d;
    private final f e;
    
    public a()
    {
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(new byte[16]);
      try
      {
        c = Cipher.getInstance(ae);
        c.init(1, a.b(a.this), localIvParameterSpec);
        d = Cipher.getInstance(ae);
        d.init(2, a.b(a.this), localIvParameterSpec);
        e = ((f)a.c(a.this).c());
        return;
      }
      catch (GeneralSecurityException this$1)
      {
        throw new org.a.b.c(a.this);
      }
    }
    
    public final int a(int paramInt)
    {
      org.a.a.a locala = a.a(a.this);
      if (locala == org.a.a.a.a) {
        return (paramInt / 16 + 2) * 16;
      }
      if (locala == org.a.a.a.c) {
        return 16;
      }
      if (locala == org.a.a.a.b) {
        return paramInt + 8;
      }
      if (locala == org.a.a.a.d) {
        return (paramInt / 16 + 1) * 16;
      }
      return 0;
    }
    
    public final int a(ByteBuffer paramByteBuffer)
    {
      byte[] arrayOfByte = new byte[16];
      b.b(arrayOfByte);
      try
      {
        int i = c.update(ByteBuffer.wrap(arrayOfByte), paramByteBuffer);
        return i;
      }
      catch (ShortBufferException paramByteBuffer)
      {
        throw new e(paramByteBuffer);
      }
    }
    
    public final int a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
    {
      try
      {
        int i = c.update(paramByteBuffer1, paramByteBuffer2);
        return i;
      }
      catch (ShortBufferException paramByteBuffer1)
      {
        throw new e(paramByteBuffer1);
      }
    }
    
    public final int b(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
    {
      try
      {
        int i = c.doFinal(paramByteBuffer1, paramByteBuffer2);
        return i;
      }
      catch (GeneralSecurityException paramByteBuffer1)
      {
        throw new org.a.b.c(paramByteBuffer1);
      }
    }
    
    public final f j_()
    {
      return e;
    }
  }
}


/* Location:              org/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */