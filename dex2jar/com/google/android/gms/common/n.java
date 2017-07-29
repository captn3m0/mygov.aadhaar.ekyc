package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.ab.a;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.dynamite.DynamiteModule.a;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.Arrays;

final class n
{
  private static ae a;
  private static final Object b = new Object();
  private static Context c;
  
  /* Error */
  static void a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 34	com/google/android/gms/common/n:c	Landroid/content/Context;
    //   6: ifnonnull +18 -> 24
    //   9: aload_0
    //   10: ifnull +10 -> 20
    //   13: aload_0
    //   14: invokevirtual 40	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   17: putstatic 34	com/google/android/gms/common/n:c	Landroid/content/Context;
    //   20: ldc 2
    //   22: monitorexit
    //   23: return
    //   24: ldc 42
    //   26: ldc 44
    //   28: invokestatic 50	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   31: pop
    //   32: goto -12 -> 20
    //   35: astore_0
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_0
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	9	35	finally
    //   13	20	35	finally
    //   24	32	35	finally
  }
  
  private static boolean a()
  {
    if (a != null) {
      return true;
    }
    c.a(c);
    Object localObject2;
    synchronized (b)
    {
      localObject2 = a;
      if (localObject2 != null) {}
    }
    return false;
  }
  
  static boolean a(String paramString, a parama)
  {
    if (!a()) {
      return false;
    }
    try
    {
      boolean bool = a.a(paramString, b.a(parama.c()));
      return bool;
    }
    catch (RemoteException paramString)
    {
      Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
    }
    return false;
  }
  
  static boolean b(String paramString, a parama)
  {
    if (!a()) {
      return false;
    }
    try
    {
      boolean bool = a.b(paramString, b.a(parama.c()));
      return bool;
    }
    catch (RemoteException paramString)
    {
      Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
    }
    return false;
  }
  
  static abstract class a
    extends ab.a
  {
    private int a;
    
    protected a(byte[] paramArrayOfByte)
    {
      Object localObject = paramArrayOfByte;
      int n;
      int m;
      if (paramArrayOfByte.length != 25)
      {
        n = paramArrayOfByte.length;
        m = paramArrayOfByte.length;
        if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0) && (m > 0) && (m + 0 <= paramArrayOfByte.length)) {
          break label172;
        }
      }
      for (localObject = null;; localObject = ((StringBuilder)localObject).toString())
      {
        localObject = String.valueOf(localObject);
        Log.wtf("GoogleCertificates", String.valueOf(localObject).length() + 51 + "Cert hash data has incorrect length (" + n + "):\n" + (String)localObject, new Exception());
        localObject = Arrays.copyOfRange(paramArrayOfByte, 0, 25);
        if (localObject.length == 25) {
          bool = true;
        }
        int i = localObject.length;
        c.b(bool, 55 + "cert hash data has incorrect length. length=" + i);
        a = Arrays.hashCode((byte[])localObject);
        return;
        label172:
        localObject = new StringBuilder((m + 16 - 1) / 16 * 57);
        int j = 0;
        int k = m;
        i = 0;
        if (k > 0)
        {
          if (i == 0) {
            if (m < 65536) {
              ((StringBuilder)localObject).append(String.format("%04X:", new Object[] { Integer.valueOf(j) }));
            }
          }
          for (;;)
          {
            ((StringBuilder)localObject).append(String.format(" %02X", new Object[] { Integer.valueOf(paramArrayOfByte[j] & 0xFF) }));
            k -= 1;
            i += 1;
            if ((i == 16) || (k == 0))
            {
              ((StringBuilder)localObject).append('\n');
              i = 0;
            }
            j += 1;
            break;
            ((StringBuilder)localObject).append(String.format("%08X:", new Object[] { Integer.valueOf(j) }));
            continue;
            if (i == 8) {
              ((StringBuilder)localObject).append(" -");
            }
          }
        }
      }
    }
    
    protected static byte[] a(String paramString)
    {
      try
      {
        paramString = paramString.getBytes("ISO-8859-1");
        return paramString;
      }
      catch (UnsupportedEncodingException paramString)
      {
        throw new AssertionError(paramString);
      }
    }
    
    public final a a()
    {
      return b.a(c());
    }
    
    public final int b()
    {
      return hashCode();
    }
    
    abstract byte[] c();
    
    public boolean equals(Object paramObject)
    {
      if ((paramObject == null) || (!(paramObject instanceof ab))) {
        return false;
      }
      try
      {
        paramObject = (ab)paramObject;
        if (((ab)paramObject).b() != hashCode()) {
          return false;
        }
        paramObject = ((ab)paramObject).a();
        if (paramObject == null) {
          return false;
        }
        paramObject = (byte[])b.a((a)paramObject);
        boolean bool = Arrays.equals(c(), (byte[])paramObject);
        return bool;
      }
      catch (RemoteException paramObject)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)paramObject);
      }
      return false;
    }
    
    public int hashCode()
    {
      return a;
    }
  }
  
  static final class b
    extends n.a
  {
    private final byte[] a;
    
    b(byte[] paramArrayOfByte)
    {
      super();
      a = paramArrayOfByte;
    }
    
    final byte[] c()
    {
      return a;
    }
  }
  
  static abstract class c
    extends n.a
  {
    private static final WeakReference<byte[]> b = new WeakReference(null);
    private WeakReference<byte[]> a = b;
    
    c(byte[] paramArrayOfByte)
    {
      super();
    }
    
    final byte[] c()
    {
      try
      {
        byte[] arrayOfByte2 = (byte[])a.get();
        byte[] arrayOfByte1 = arrayOfByte2;
        if (arrayOfByte2 == null)
        {
          arrayOfByte1 = d();
          a = new WeakReference(arrayOfByte1);
        }
        return arrayOfByte1;
      }
      finally {}
    }
    
    protected abstract byte[] d();
  }
  
  static final class d
  {
    static final n.a[] a = { new n.c(n.a.a("0\004C0\003+ \003\002\001\002\002\t\000ÂàFdJ00"))new n.c
    {
      protected final byte[] d()
      {
        return n.a.a("0\004C0\003+ \003\002\001\002\002\t\000ÂàFdJ00\r\006\t*H÷\r\001\001\004\005\0000t1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android0\036\027\r080821231334Z\027\r360107231334Z0t1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android0\001 0\r\006\t*H÷\r\001\001\001\005\000\003\001\r\0000\001\b\002\001\001\000«V.\000Ø;¢\b®\no\022N)Ú\021ò«VÐXâÌ©\023\003é·TÓrö@§\033\035Ë\023\tgbNFV§wj\031=²å¿·$©\036w\030\016jG¤;3Ù`w\0301EÌß{.XftÉáV[\037LjYU¿òQ¦=«ùÅ\\'\"\"Rèuäø\025Jd_qhÀ±¿Æ\022ê¿xWi»4ªyÜ~.¢vL®\007ØÁqT×î_d¥\032D¦\002ÂI\005AWÜ\002Í_\\\016Uûï\031ûã'ð±Q\026Å o\031ÑõÄÛÂÖ¹?hÌ)yÇ\016\030«k;ÕÛU*\016;LßXûíÁº5à\003Á´±\rÒD¨î$ÿý38r«R!^Ú°ü\r\013\024[j¡y\002\001\003£Ù0Ö0\035\006\003U\035\016\004\026\004\024Ç}Â!\027V%Óßkãä×¥0¦\006\003U\035#\0040\024Ç}Â!\027V%Óßkãä×¥¡x¤v0t1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android\t\000ÂàFdJ00\f\006\003U\035\023\004\0050\003\001\001ÿ0\r\006\t*H÷\r\001\001\004\005\000\003\001\001\000mÒRÎï0,6\nªÎÏòÌ©\004»]z\026aø®F²B\004ÐÿJhÇí\032S\036ÄYZb<æ\007c±g)zzãW\022Ä\007ò\bðË\020)\022M{\020b\031ÀÊ>³ù­_¸qï&âñmDÈÙ l²ð\005»?âËD~s\020v­E³?`\tê\031Áaæ&Aª'\035ýR(ÅÅ]ÛE'XÖaöÌ\fÌ·5.BLÄ6\\R52÷2Q7Y<JãAôÛAíÚ\r\013\020q§Ä@ðþ \034¶'ÊgCiÐ½/Ù\021ÿ\006Í¿,ú\020Ü\017:ãWbHÇïÆLqD\027B÷\005ÉÞW:õ[9\r×ý¹A1]_u0\021&ÿb\024\020Ài0");
      }
    }, new n.c(n.a.a("0\004¨0\003 \003\002\001\002\002\t\000Õ¸l}ÓNõ0"))
    {
      protected final byte[] d()
      {
        return n.a.a("0\004¨0\003 \003\002\001\002\002\t\000Õ¸l}ÓNõ0\r\006\t*H÷\r\001\001\004\005\00001\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0200\016\006\003U\004\n\023\007Android1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android1\"0 \006\t*H÷\r\001\t\001\026\023android@android.com0\036\027\r080415233656Z\027\r350901233656Z01\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0200\016\006\003U\004\n\023\007Android1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android1\"0 \006\t*H÷\r\001\t\001\026\023android@android.com0\001 0\r\006\t*H÷\r\001\001\001\005\000\003\001\r\0000\001\b\002\001\001\000ÖÎ.\b\n¿â1MÑ³ÏÓ\030\\´=3ú\ftá½¶ÑÛ\023ö,\\9ßVøF=e¾ÀóÊBk\007Å¨íZ9ÁgçkÉ¹'K\013\"\000\031©)\025årÅm*0\033£oÅü\021:ÖËt5¡m#«}úîáeäß\037\n½§\nQlN\005\021Ê|\fU\027[ÃuùHÅj®\b¤O¦¤Ý}¿,\n5\"­\006¸Ì\030^±Uyîøm\b\013\035aÀù¯±ÂëÑ\007êE«Ûh£Ç^TÇlSÔ\013\022\035ç»Ó\016b\f\030áªaÛ¼Ý<d_/UóÔÃuì@p©?qQØ6pÁj\032¾^òÑ\030á¸®ó)ðf¿láD¬èm\034\033\017\002\001\003£ü0ù0\035\006\003U\035\016\004\026\004\024\034Å¾LC<a:\025°L¼\003òOà²0É\006\003U\035#\004Á0¾\024\034Å¾LC<a:\025°L¼\003òOà²¡¤01\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0200\016\006\003U\004\n\023\007Android1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android1\"0 \006\t*H÷\r\001\t\001\026\023android@android.com\t\000Õ¸l}ÓNõ0\f\006\003U\035\023\004\0050\003\001\001ÿ0\r\006\t*H÷\r\001\001\004\005\000\003\001\001\000\031Ó\fñ\005ûx?L\r}Ò##=@zÏÎ\000\b\035[×ÆéÖí k\016\021 \006Al¢D\023ÒkJ àõ$ÊÒ»\\nL¡\001j\025n¡ì]ÉZ^:\001\0006ôHÕ\020¿.\036ag:;åm¯\013w±Â)ãÂUãèL]#ïº\tËñ; +NZ\"É2cHJ#Òü)ú\0319u3¯Øª\026\017BÂÐ\026>fCéÁ/ Á33[Àÿk\"ÞÑ­DB)¥9©Nï­«ÐeÎÒK>QåÝ{fx{ï\022þû¤Ä#ûOøÌIL\002ðõ\005\026\022ÿe)9>FêÅ»!òwÁQª_*¦'Ñè§\n¶\0035iÞ;¿ÿ|©Ú>\022Cö\013");
      }
    } };
  }
}


/* Location:              com/google/android/gms/common/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */